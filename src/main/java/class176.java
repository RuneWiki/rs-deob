import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class176 {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field2486 = 0;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lng;")
    public static class190 field2485 = new class190(64);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lqj;")
    public static class296 field2489;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lvm;")
    public static class407 field2488;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    public static int[] field2483;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIILlo;IILhc;IIZBILaa;)Lhc;", line = 5)
    public static final class75 method1175(int arg0, int arg1, int arg2, int arg3, int arg4, class449 arg5, int arg6, int arg7, class75 arg8, int arg9, int arg10, boolean arg11, byte arg12, int arg13, class281 arg14) {
        field2487++;
        if (arg8 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg5 != null) {
            int var16 = var15 | arg5.method2805(-1, (byte) 16, false, arg7);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = (long) ((arg10 << 24) + (arg1 << 16) + arg4) - (-((long) arg3 << 32) - ((long) arg13 << 48));
        class190 var19 = class132.field1834;
        class75 var20;
        synchronized (class132.field1834) {
            var20 = (class75) class132.field1834.method1246((byte) -128, var17);
        }
        if (var20 == null || arg14.method1732(var20.method533(), var15) != 0) {
            if (var20 != null) {
                var15 = arg14.method1777(var15, var20.method533());
            }
            byte var21;
            if (arg4 == 1) {
                var21 = 9;
            } else if (arg4 == 2) {
                var21 = 12;
            } else if (arg4 == 3) {
                var21 = 15;
            } else if (arg4 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class279 var24 = new class279(var21 * var22 + 1, var22 * 2 * var21 + -var21, 0);
            int var25 = var24.method1701(0, 1, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class362.field5083[var31] * var28 >> 15;
                    int var33 = class362.field5082[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1701(var33, 1, 0, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg1 * var36 + arg10 * var35 >> 8);
                short var38 = (short) (((arg3 & 0x7F) * var36 + (arg13 & 0x7F) * var35 & 0x7F00) + ((arg3 & 0x380) * var36 + (arg13 & 0x380) * var35 & 0x38000) + ((arg3 & 0xFC00) * var36 + (arg13 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1709(var25, var26[0][var39], var37, (byte) 1, (short) -1, var26[0][(var39 + 1) % var21], (byte) -1, 0, var38);
                    } else {
                        var24.method1709(var26[var34 - 1][var39], var26[var34][(var39 + 1) % var21], var37, (byte) 1, (short) -1, var26[var34 - 1][(var39 + 1) % var21], (byte) -1, 0, var38);
                        var24.method1709(var26[var34 - 1][var39], var26[var34][var39], var37, (byte) 1, (short) -1, var26[var34][(var39 + 1) % var21], (byte) -1, 0, var38);
                    }
                }
            }
            var20 = arg14.method1736(var24, var15, class234.field3190, 64, 768);
            class190 var40 = class132.field1834;
            synchronized (class132.field1834) {
                class132.field1834.method1247(var17, (byte) 119, var20);
            }
        }
        int var41 = arg4 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg12 > -75) {
            return null;
        }
        if (arg11) {
            if (arg2 > 13312 || arg2 < 3072) {
                var43 -= 128;
            }
            if (arg2 > 1024 && arg2 < 7168) {
                var42 -= 128;
            }
            if (arg2 > 9216 && arg2 < 15360) {
                var44 = var41 + 128;
            }
            if (arg2 > 5120 && arg2 < 11264) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg8.method522();
        int var47 = arg8.method498();
        int var48 = arg8.method513();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        int var49 = arg8.method526();
        if (var45 < var49) {
            var49 = var45;
        }
        class387 var50 = null;
        if (arg5 != null) {
            int var51 = arg5.field6521[arg7];
            var50 = class326.method2051(87, var51 >> 16);
            arg7 = var51 & 0xFFFF;
        }
        class75 var52;
        if (var50 == null) {
            var52 = var20.method529((byte) 3, var15, true);
            var52.method528((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method534((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method529((byte) 3, var15, true);
            var52.method528((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method534((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method499(var50, arg7, 104);
        }
        if (arg6 != 0) {
            var52.method504(arg6);
        }
        if (arg9 != 0) {
            var52.method524(arg9);
        }
        if (arg0 != 0) {
            var52.method534(0, arg0, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;ZZLrj;)V", line = 218)
    public static final void method1176(String arg0, boolean arg1, boolean arg2, class352 arg3) {
        field2479++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class235.field3194.method441((class130[]) null, 250, arg0, (byte) -45);
        int var8 = class235.field3194.method443((class130[]) null, arg2, 250, arg0) * 13;
        class408.field5920.method1785(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class408.field5920.method1748(var5 - var4, -var4 + var6, var7 + var4 + var4, var8 - -var4 + var4, -1, 0);
        arg3.method2264(arg0, 1, 0, 0, (class130[]) null, 1, (byte) -88, var7, 0, -1, var5, -1, var6, (class220) null, var8, (int[]) null);
        class62.method421(var4 + var4 + var8, var7 - (-var4 + -var4), var5 - var4, (byte) 99, var6 - var4);
        if (arg1) {
            class408.field5920.method1749();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V", line = 248)
    public static final void method1177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class379.field5397 <= arg5 && class43.field659 >= arg2 && class300.field4164 <= arg0 && class398.field5827 >= arg1) {
            class58.method387((byte) -124, arg2, arg1, arg0, arg5, arg4);
        } else {
            class407.method2614(arg4, arg0, arg2, -26259, arg1, arg5);
        }
        field2482++;
        int var6 = 85 % ((arg3 + 62) / 32);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lrg;III)V", line = 265)
    public static final void method1178(class383 arg0, int arg1, int arg2, int arg3) {
        field2481++;
        if (class142.field2046 != null || class349.field4882) {
            return;
        }
        if (arg1 != 128) {
            field2483 = null;
        }
        if (arg0 == null || class347.method2223(arg0, (byte) 123) == null) {
            return;
        }
        class142.field2046 = arg0;
        class32.field497 = class347.method2223(arg0, (byte) 123);
        class359.field5046 = 0;
        class441.field6397 = false;
        class341.field4765 = arg3;
        class259.field3552 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 304)
    public static void method1179(int arg0) {
        field2483 = null;
        if (arg0 != 0) {
            field2489 = null;
        }
        field2489 = null;
        field2485 = null;
        field2488 = null;
    }
}
