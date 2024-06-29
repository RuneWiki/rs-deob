import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class219 {

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2537 = 2;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Z")
    public static boolean field2535 = false;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "[I")
    public static int[] field2538 = new int[2];

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "Lrc;")
    public static class536 field2532;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZII)I")
    public final int method1280(boolean arg0, int arg1, int arg2) {
        field2533++;
        int var4 = arg1 < class476.field6777 ? class476.field6777 : arg1;
        if (!arg0) {
            field2532 = null;
        }
        if (class697.field9810 == this) {
            return 0;
        } else if (class221.field2545 == this) {
            return var4 - arg2;
        } else if (class440.field6380 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
    public static final void method1281(boolean arg0) {
        class605.method3435((byte) 124);
        field2534++;
        class716.method3998(22050, class654.field9334.field9879.method3007(-126) == 1, 2, (byte) 14);
        class167.field1857 = class267.method1604(-8798, class289.field3549, class618.field8849, 22050, 0);
        class254.method1513(arg0, -1, class345.method2058((byte) -47, null));
        class637.field9160 = class267.method1604(-8798, class289.field3549, class618.field8849, 2048, 1);
        class637.field9160.method108(class597.field8470, -124);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1282(byte arg0, String arg1) {
        field2536++;
        if (arg0 >= -19) {
            method1281(false);
        }
        return class76.method543(10, arg1, true, (byte) 54);
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)V")
    public static void method1283(boolean arg0) {
        field2532 = null;
        field2538 = null;
        if (!arg0) {
            method1281(false);
        }
    }

    @OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2539++;
        throw new IllegalStateException();
    }
}
