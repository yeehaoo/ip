import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        Checklist tasks = new Checklist();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            if (input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            } else if (input.equals("list")) {
                tasks.list();
            } else if (input.startsWith("mark")) {
                tasks.mark(Integer.parseInt(input.substring(5)), true);
            } else if (input.startsWith("unmark")) {
                tasks.mark(Integer.parseInt(input.substring(7)), false);
            } else {
                tasks.add(input);
                System.out.println("added: " + input);
            }
        }
    }
}
