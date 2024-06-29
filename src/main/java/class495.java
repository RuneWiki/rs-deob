import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class495 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "[C")
    public static char[] field7291;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[Z")
    public static boolean[] field7292;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field7293;

    static {
        new class83("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field7291 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        field7292 = new boolean[8];
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BJ)V", line = 3)
    public static final void method2925(byte arg0, long arg1) {
        field7289++;
        if (arg0 < 96) {
            method2928((byte) -39);
        }
        if (class385.field5410 != null) {
            if (class128.field1742 == 1 || class128.field1742 == 5) {
                class306.method1735(arg1, -6937);
            } else if (class128.field1742 == 4) {
                class448.method2643(arg1, 124);
            }
        }
        class508.method2988((long) class393.field5484, (byte) 37, class418.field6109);
        if (class319.field4419 != -1) {
            class143.method924(class319.field4419, (byte) -92);
        }
        for (int var3 = 0; var3 < class196.field2829; var3++) {
            if (class451.field6504[var3]) {
                class9.field83[var3] = true;
            }
            class501.field7378[var3] = class451.field6504[var3];
            class451.field6504[var3] = false;
        }
        class54.field754 = class393.field5484;
        if (class418.field6109.method450()) {
            class81.field1147 = true;
        }
        if (class319.field4419 != -1) {
            class196.field2829 = 0;
            class314.method1777(true);
        }
        class418.field6109.method526();
        class221.method1301(23, class418.field6109);
        int var4 = class519.method3056((byte) -61);
        if (var4 == -1) {
            var4 = class287.field3858;
        }
        if (var4 == -1) {
            var4 = class367.field5160;
        }
        class528.method3101(-77, var4);
        class97.method656(class424.field6196, class75.field1089.field464, 1, class75.field1089.field466, class75.field1089.field461);
        class424.field6196 = 0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V", line = 67)
    public static final void method2926(int arg0, byte arg1) {
        if (arg1 != 118) {
            return;
        }
        field7290++;
        if (arg0 != -1 && class359.field4910[arg0]) {
            class36.field506.method1390(arg0, false);
            class522.field7701[arg0] = null;
            class25.field396[arg0] = null;
            class359.field4910[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBII)I", line = 90)
    public static final int method2927(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field7293++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else {
            if (arg1 != 104) {
                method2927(-12, (byte) 46, -82, 56);
            }
            return var4 == 2 ? 7 - arg2 : arg0;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 127)
    public static void method2928(byte arg0) {
        if (arg0 < 106) {
            field7292 = null;
        }
        field7291 = null;
        field7292 = null;
    }
}
