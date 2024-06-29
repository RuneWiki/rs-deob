import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class206 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field3469 = 7759444;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lbd;")
    private static class162 field3472 = class17.method142(0, "Jan");

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lbd;")
    private static class162 field3478 = class17.method142(0, "Jul");

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lbd;")
    private static class162 field3479 = class17.method142(0, "Feb");

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lbd;")
    private static class162 field3471 = class17.method142(0, "Aug");

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lbd;")
    private static class162 field3466 = class17.method142(0, "May");

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Lbd;")
    public static class162 field3483 = class17.method142(0, "www)2wtrc");

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lbd;")
    private static class162 field3480 = class17.method142(0, "Dec");

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lbd;")
    private static class162 field3482 = class17.method142(0, "Apr");

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Lbd;")
    private static class162 field3481 = class17.method142(0, "Jun");

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lbd;")
    private static class162 field3470 = class17.method142(0, "Mar");

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "[[I")
    public static int[][] field3484 = new int[104][104];

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lbd;")
    private static class162 field3486 = class17.method142(0, "Sep");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lbd;")
    private static class162 field3475 = class17.method142(0, "Nov");

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lbd;")
    private static class162 field3487 = class17.method142(0, "Oct");

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "[Lbd;")
    public static class162[] field3465 = new class162[] { field3472, field3479, field3470, field3482, field3466, field3481, field3478, field3471, field3486, field3487, field3475, field3480 };

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lda;")
    public static class143 field3468;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[[[I")
    public static int[][][] field3473;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "[[[I")
    public static int[][][] field3474;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 32)
    public static void method1522(byte arg0) {
        field3473 = (int[][][]) null;
        field3483 = null;
        field3479 = null;
        field3466 = null;
        field3472 = null;
        field3468 = null;
        if (arg0 < 105) {
            field3468 = (class143) null;
        }
        field3470 = null;
        field3481 = null;
        field3475 = null;
        field3484 = (int[][]) null;
        field3487 = null;
        field3474 = (int[][][]) null;
        field3471 = null;
        field3480 = null;
        field3478 = null;
        field3465 = null;
        field3486 = null;
        field3482 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILhi;IIZZIIIILeg;III)Lhi;", line = 61)
    public static final class176 method1523(int arg0, class176 arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class142 arg10, int arg11, int arg12, int arg13) {
        long var14 = ((long) arg2 << 32) + ((long) arg6 << 48) + (long) ((arg0 << 24) + arg11 - -(arg9 << 16));
        if (arg5) {
            field3465 = (class162[]) null;
        }
        class176 var16 = (class176) class12.field190.method1536(var14, -106);
        field3467++;
        if (var16 == null) {
            byte var17;
            if (arg11 == 1) {
                var17 = 9;
            } else if (arg11 == 2) {
                var17 = 12;
            } else if (arg11 == 3) {
                var17 = 15;
            } else if (arg11 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class195 var20 = new class195(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int[][] var21 = new int[var19][var17];
            int var22 = var20.method1457(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class312.field5262[var27] * var24 + arg3 >> 16;
                    int var29 = class312.field5269[var27] * var25 + arg13 >> 16;
                    var21[var23][var26] = var20.method1457(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg0 * var31 + arg9 * var32 >> 8);
                short var34 = (short) (((arg2 & 0x7F) * var32 + (arg6 & 0x7F) * var31 & 0x7F00) + ((arg2 & 0xFC00) * var32 + (arg6 & 0xFC00) * var31 & 0xFC0000) + ((arg2 & 0x380) * var32 + (arg6 & 0x380) * var31 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1443(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1443(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method1443(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method1465(64, 768, -50, -10, -50);
            class12.field190.method1532(var14, -125, var16);
        }
        int var36 = arg11 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg4) {
            if (arg12 > 1152 && arg12 < 1920) {
                var39 = var36 + 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var37 -= 128;
            }
            if (arg12 > 1664 || arg12 < 384) {
                var38 -= 128;
            }
            if (arg12 > 640 && arg12 < 1408) {
                var40 = var36 + 128;
            }
        }
        int var41 = arg1.method69();
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg1.method77();
        if (var39 < var42) {
            var42 = var39;
        }
        int var43 = arg1.method96();
        int var44 = arg1.method75();
        if (var44 > var40) {
            var44 = var40;
        }
        class54 var45 = null;
        if (var43 < var38) {
            var43 = var38;
        }
        if (arg10 != null) {
            int var46 = arg10.field2522[arg7];
            var45 = class57.method399(-107, var46 >> 16);
            arg7 = var46 & 0xFFFF;
        }
        class176 var47;
        if (var45 == null) {
            var47 = var16.method88(true, true);
            var47.method67((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method71((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method88(!var45.method385(arg7, arg5), true);
            var47.method67((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method71((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method65(var45, arg7);
        }
        if (arg12 != 0) {
            var47.method78(arg12);
        }
        if (class117.field2159) {
            class100 var50 = (class100) var47;
            if (class3.method15(arg3 + var41, class157.field2765, arg13 + var43, false) != arg8 || class3.method15(arg3 + var42, class157.field2765, arg13 + var44, arg5) != arg8) {
                for (int var51 = 0; var51 < var50.field1820; var51++) {
                    var50.field1817[var51] += class3.method15(var50.field1794[var51] + arg3, class157.field2765, var50.field1801[var51] + arg13, false) - arg8;
                }
                var50.field1815.field3597 = false;
                var50.field1821.field3784 = false;
            }
        } else {
            class11 var48 = (class11) var47;
            if (arg8 != class3.method15(arg3 + var41, class157.field2765, arg13 + var43, arg5) || arg8 != class3.method15(arg3 + var42, class157.field2765, arg13 + var44, false)) {
                for (int var49 = 0; var49 < var48.field150; var49++) {
                    var48.field148[var49] += class3.method15(var48.field137[var49] + arg3, class157.field2765, var48.field135[var49] + arg13, false) - arg8;
                }
                var48.field132 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method199(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method200(Component arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I")
    public abstract int method201(boolean arg0);
}
