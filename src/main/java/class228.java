import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class228 {

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[I")
    public static int[] field3066 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Ltia;")
    public static class266 field3061 = new class266();

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
    public static int[] field3068 = new int[2];

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lfp;")
    public static class323 field3062;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZZIIII)V")
    public static final void method1421(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field3065++;
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class347.field4907 + ((class600.field8426 - class347.field4907) * var6 / 100);
        if (arg0) {
            return;
        }
        if (class456.field6437 > var7) {
            var7 = class456.field6437;
        } else if (class220.field2881 < var7) {
            var7 = class220.field2881;
        }
        int var8 = arg3 * var7 * 512 / (arg4 * 334);
        if (var8 < class310.field4319) {
            short var12 = class310.field4319;
            var7 = arg4 * 334 * var12 / (arg3 * 512);
            if (var7 > class220.field2881) {
                var7 = class220.field2881;
                int var13 = arg3 * 512 * var7 / (var12 * 334);
                int var14 = (arg4 - var13) / 2;
                if (arg1) {
                    class268.field3831.method424();
                    class268.field3831.method417(-16777216, arg5, arg2, (byte) 105, arg3, var14);
                    class268.field3831.method417(-16777216, arg4 + arg5 - var14, arg2, (byte) 92, arg3, var14);
                }
                arg4 -= var14 * 2;
                arg5 += var14;
            }
        } else if (class187.field2515 < var8) {
            short var9 = class187.field2515;
            var7 = arg4 * var9 * 334 / (arg3 * 512);
            if (var7 < class456.field6437) {
                var7 = class456.field6437;
                int var10 = arg4 * var9 * 334 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg1) {
                    class268.field3831.method424();
                    class268.field3831.method417(-16777216, arg5, arg2, (byte) 115, var11, arg4);
                    class268.field3831.method417(-16777216, arg5, arg2 + arg3 - var11, (byte) 58, var11, arg4);
                }
                arg2 += var11;
                arg3 -= var11 * 2;
            }
        }
        class328.field4550 = arg3 * var7 / 334;
        class466.field6610 = arg5;
        class213.field2807 = (short) arg3;
        class192.field2576 = arg2;
        class493.field7109 = (short) arg4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lfp;II)Lqm;")
    public static final class143 method1422(class323 arg0, int arg1, int arg2) {
        field3064++;
        byte[] var3 = arg0.method2108(arg2, 0);
        if (arg1 != 2) {
            field3061 = null;
        }
        return var3 == null ? null : new class143(var3);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1423(int arg0) {
        field3068 = null;
        field3066 = null;
        field3061 = null;
        field3062 = null;
        if (arg0 != -3778) {
            field3066 = null;
        }
    }
}
