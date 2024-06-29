import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class258 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[Z")
    public static boolean[] field3607 = new boolean[100];

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 11)
    public static void method1602(byte arg0) {
        field3607 = null;
        if (arg0 != 2) {
            field3607 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IJ)V", line = 21)
    public static final void method1603(int arg0, long arg1) {
        field3604++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg0 != -649) {
            method1604(5, -24);
        }
        if (arg1 % 10L == 0L) {
            class491.method2879(arg0 + 16777864, arg1 + -1L);
            class491.method2879(16777215, 1L);
        } else {
            class491.method2879(16777215, arg1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lpc;", line = 42)
    public static final class141 method1604(int arg0, int arg1) {
        field3606++;
        if (arg0 > -35) {
            return null;
        }
        if (arg1 == 0) {
            if ((double) class379.field5372 == 3.0D) {
                return class407.field5639;
            }
            if ((double) class379.field5372 == 4.0D) {
                return class138.field1959;
            }
            if ((double) class379.field5372 == 6.0D) {
                return class137.field1948;
            }
            if ((double) class379.field5372 >= 8.0D) {
                return class265.field3697;
            }
        } else if (arg1 == 1) {
            if ((double) class379.field5372 == 3.0D) {
                return class137.field1948;
            }
            if ((double) class379.field5372 == 4.0D) {
                return class265.field3697;
            }
            if ((double) class379.field5372 == 6.0D) {
                return class242.field3428;
            }
            if ((double) class379.field5372 >= 8.0D) {
                return class50.field846;
            }
        } else if (arg1 == 2) {
            if ((double) class379.field5372 == 3.0D) {
                return class242.field3428;
            }
            if ((double) class379.field5372 == 4.0D) {
                return class50.field846;
            }
            if ((double) class379.field5372 == 6.0D) {
                return class9.field186;
            }
            if ((double) class379.field5372 >= 8.0D) {
                return class272.field3778;
            }
        }
        return null;
    }
}
