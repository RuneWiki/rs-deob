import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class374 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    public static int[] field5443 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lpf;")
    public static class425 field5446 = new class425(16, 3);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
    public static int[] field5448 = new int[14];

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
    public static int[] field5447 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method2242(byte arg0) {
        field5447 = null;
        field5443 = null;
        field5448 = null;
        field5446 = null;
        if (arg0 < 105) {
            field5448 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)Ldm;")
    public static final class265 method2243(boolean arg0, int arg1) {
        field5441++;
        if (arg0) {
            return null;
        }
        class241 var2 = class391.field5767;
        class265 var3;
        synchronized (class391.field5767) {
            var3 = (class265) class391.field5767.method1491((long) arg1, 0);
            if (var3 == null) {
                var3 = new class265(arg1);
                class391.field5767.method1488(128, (long) arg1, var3);
            }
        }
        synchronized (var3) {
            return var3.method1644(0) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static final void method2244(byte arg0) {
        field5442++;
        if (class236.field3536 != null) {
            class236.field3536.method246(arg0 + 78);
        }
        if (arg0 != -78) {
            method2242((byte) -75);
        }
        if (class245.field3670 != null) {
            class245.field3670.method246(0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public static final void method2245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5445++;
        int var6 = arg4 - arg3;
        int var7 = arg2 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class247.method1510(arg5, arg3, arg1, arg2, (byte) 119);
            }
        } else if (var7 == 0) {
            class288.method1778(arg3, arg5, arg4, -21493, arg1);
        } else {
            if (arg0 != -223616820) {
                method2242((byte) 119);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class192.field2917) {
                var11 = (class192.field2917 * var8 >> 12) + var9;
                var10 = class192.field2917;
            } else if (class39.field497 >= arg3) {
                var10 = arg3;
                var11 = arg1;
            } else {
                var11 = (class39.field497 * var8 >> 12) + var9;
                var10 = class39.field497;
            }
            int var12;
            int var13;
            if (class192.field2917 > arg4) {
                var12 = class192.field2917;
                var13 = (class192.field2917 * var8 >> 12) + var9;
            } else if (arg4 > class39.field497) {
                var12 = class39.field497;
                var13 = (class39.field497 * var8 >> 12) + var9;
            } else {
                var13 = arg2;
                var12 = arg4;
            }
            if (var13 < class189.field2831) {
                var12 = (class189.field2831 - var9 << 12) / var8;
                var13 = class189.field2831;
            } else if (class204.field3060 < var13) {
                var13 = class204.field3060;
                var12 = (class204.field3060 - var9 << 12) / var8;
            }
            if (class189.field2831 > var11) {
                var10 = (class189.field2831 - var9 << 12) / var8;
                var11 = class189.field2831;
            } else if (var11 > class204.field3060) {
                var10 = (class204.field3060 - var9 << 12) / var8;
                var11 = class204.field3060;
            }
            class402.method2524(var12, var11, var13, arg5, 0, var10);
        }
    }
}
