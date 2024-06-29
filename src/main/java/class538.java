import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class538 {

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field7500 = 0;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "[I")
    public static int[] field7502;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "[Lmh;")
    public static class145[] field7499;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZB)Z", line = 4)
    public static final boolean method3026(boolean arg0, byte arg1) {
        field7501++;
        int var2 = 23 / ((14 - arg1) / 53);
        boolean var3 = class159.field2378.method157();
        if (var3 == arg0) {
            return true;
        }
        if (!arg0) {
            class159.field2378.method153();
        } else if (!class159.field2378.method141()) {
            arg0 = false;
        }
        if (arg0 == var3) {
            return false;
        } else {
            class202.field2854.field7905 = arg0;
            class202.field2854.method2642((byte) -120, class270.field3976);
            return true;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 40)
    public static void method3027(int arg0) {
        int var1 = -13 / ((7 - arg0) / 45);
        field7499 = null;
        field7502 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIZI)Lsf;", line = 52)
    public static final class553 method3028(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field7504++;
        class553 var5 = new class553();
        var5.field7831 = arg0;
        var5.field7827 = arg2;
        class639.field9274.method737((long) arg1, (byte) 92, var5);
        class305.method1897(arg2, -117);
        class549 var6 = class495.method2822((byte) -117, arg1);
        if (var6 != null) {
            class412.method2497(var6, arg4 - 3707);
        }
        if (class559.field7930 != null) {
            class412.method2497(class559.field7930, 110);
            class559.field7930 = null;
        }
        class264.method1675((byte) -12);
        if (var6 != null) {
            class633.method3657(var6, !arg3, (byte) 56);
        }
        if (!arg3) {
            class30.method276(arg2);
        }
        if (!arg3 && class609.field8659 != -1) {
            class293.method1845(class609.field8659, 1, 0);
        }
        if (arg4 != 3791) {
            field7502 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)I", line = 92)
    public static final int method3029(int arg0, int arg1, int arg2) {
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 < 85) {
            method3028(-17, -90, 101, false, -116);
        }
        field7498++;
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }
}
