import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class229 extends class134 {

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3656 = "green:";

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3661 = "purple:";

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field3657 = 0;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field3655 = 0;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Lmd;")
    public static class242 field3663;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field3656 = null;
        field3661 = null;
        field3663 = null;
        if (arg0 != 7413) {
            method1612(-76);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1613(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        field3660++;
        if (arg1 != 32277) {
            method1615(-119, 1);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public static final void method1614(int arg0, int arg1) {
        field3653++;
        if (class115.field1733 == arg0) {
            return;
        }
        if (class115.field1733 == 0) {
            class140.method932(0);
        }
        if (arg0 == 40) {
            class264.method1823(72);
        }
        if (arg0 != 40 && class75.field1186 != null) {
            class75.field1186.method1277(false);
            class75.field1186 = null;
        }
        if (arg1 != 28) {
            method1614(-30, -2);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 25 || arg0 == 28) {
            class14.field211 = 1;
            class72.field1043 = 0;
            class273.field4500 = 0;
            class311.field5022 = 0;
            class50.field683 = 1;
            class90.method584(721512226, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class250.method1740((byte) 118);
        }
        if (arg0 == 5) {
            class265.method1834(true, class3.field22);
        } else {
            class75.method491((byte) 94);
        }
        boolean var3 = class115.field1733 == 5 || class115.field1733 == 10 || class115.field1733 == 28;
        if (var3 != var2) {
            if (var2) {
                class35.field441 = class306.field4976;
                if (class223.field3550 == 0) {
                    class300.method2077(2, -1);
                } else {
                    class298.method2070((byte) -128, class274.field4518, class306.field4976, false, 255, 2, 0);
                }
                field3663.method1705(true, false);
            } else {
                class300.method2077(2, -1);
                field3663.method1705(true, true);
            }
        }
        class115.field1733 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    public static final void method1615(int arg0, int arg1) {
        if (arg0 == 2) {
            class84.field1315.method147(arg1, (byte) -118);
            class100.field1509.method147(arg1, (byte) -116);
            class160.field2525.method147(arg1, (byte) -122);
            field3662++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V")
    public static final void method1616(byte arg0, boolean arg1) {
        field3659++;
        if (class8.field76 == arg1) {
            return;
        }
        class8.field76 = arg1;
        if (arg0 != -55) {
            method1616((byte) 51, true);
        }
        class165.method1109(true);
    }
}
