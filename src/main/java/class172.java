import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class172 {

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field2553 = 128;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public int field2561 = 128;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lnj;")
    public static class162 field2552 = new class162(8);

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[I")
    public static int[] field2563 = new int[2];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lga;")
    public static class277 field2556;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z")
    public static final boolean method1116(int arg0, byte arg1) {
        if (arg1 > -35) {
            return true;
        } else {
            field2545++;
            return arg0 >= 4 && arg0 <= 8;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lmb;")
    public final class172 method1117(int arg0) {
        if (arg0 == -1271) {
            field2562++;
            return new class172(this.field2558, this.field2561, this.field2553, this.field2546, this.field2550, this.field2551);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILvf;ILt;ILya;IIZIIIIII)Lt;")
    public static final class471 method1118(int arg0, class104 arg1, int arg2, class471 arg3, int arg4, class38 arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field2549++;
        if (arg3 == null) {
            return null;
        }
        if (arg10 < 15) {
            method1121(-65);
        }
        int var15 = 2055;
        if (arg1 != null) {
            int var16 = var15 | arg1.method769(false, 1024, -1, arg4);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg0 << 32) + ((long) arg6 << 48) + (long) ((arg7 << 24) + (arg13 - -(arg2 << 16)));
        class162 var19 = class442.field6544;
        class471 var20;
        synchronized (class442.field6544) {
            var20 = (class471) class442.field6544.method1073(var17, false);
        }
        if (var20 == null || arg5.method257(var20.method372(), var15) != 0) {
            if (var20 != null) {
                var15 = arg5.method288(var15, var20.method372());
            }
            byte var21;
            if (arg13 == 1) {
                var21 = 9;
            } else if (arg13 == 2) {
                var21 = 12;
            } else if (arg13 == 3) {
                var21 = 15;
            } else if (arg13 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class419 var24 = new class419((var21 * var22) + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method2487(-32324, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class183.field2684[var31] * var28 >> 15;
                    int var33 = class183.field2678[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2487(-32324, var32, var33, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg2 * var36 + arg7 * var35 >> 8);
                short var38 = (short) (((arg0 & 0x380) * var36 + (arg6 & 0x380) * var35 & 0x38000) + ((arg0 & 0x7F) * var36 + (arg6 & 0x7F) * var35 & 0x7F00) + ((arg0 & 0xFC00) * var36 + (arg6 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2486(var26[0][var39], var38, 1, var37, var26[0][(var39 + 1) % var21], (short) -1, (byte) 1, var25, (byte) -1);
                    } else {
                        var24.method2486(var26[var34][(var39 + 1) % var21], var38, 1, var37, var26[var34 - 1][(var39 + 1) % var21], (short) -1, (byte) 1, var26[var34 - 1][var39], (byte) -1);
                        var24.method2486(var26[var34][var39], var38, 1, var37, var26[var34][(var39 + 1) % var21], (short) -1, (byte) 1, var26[var34 - 1][var39], (byte) -1);
                    }
                }
            }
            var20 = arg5.method231(var24, var15, class512.field7585, 64, 768);
            class162 var40 = class442.field6544;
            synchronized (class442.field6544) {
                class442.field6544.method1072(var17, var20, false);
            }
        }
        int var41 = (arg13 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg8) {
            if (arg12 > 1024 && arg12 < 7168) {
                var42 -= 128;
            }
            if (arg12 > 9216 && arg12 < 15360) {
                var44 = var41 + 128;
            }
            if (arg12 > 5120 && arg12 < 11264) {
                var45 = var41 + 128;
            }
            if (arg12 > 13312 || arg12 < 3072) {
                var43 -= 128;
            }
        }
        int var46 = arg3.method368();
        int var47 = arg3.method394();
        int var48 = arg3.method382();
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg3.method404();
        if (var43 > var48) {
            var48 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class327 var50 = null;
        if (arg1 != null) {
            int var51 = arg1.field1551[arg4];
            var50 = class222.field3168.method128(var51 >> 16, -10423);
            arg4 = var51 & 0xFFFF;
        }
        class471 var52;
        if (var50 == null) {
            var52 = var20.method381((byte) 3, var15, true);
            var52.method403(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method392(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method381((byte) 3, var15, true);
            var52.method403(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method392(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2770(arg4, false, var50);
        }
        if (arg11 != 0) {
            var52.method396(arg11);
        }
        if (arg9 != 0) {
            var52.method409(arg9);
        }
        if (arg14 != 0) {
            var52.method392(0, arg14, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
    public static final int method1119(int arg0, int arg1, int arg2) {
        field2555++;
        int var3 = class110.method802(arg2 + 108, arg2, arg1 + 91923, arg0 - -45365) - (128 - ((class110.method802(83, 2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (class110.method802(108, 1, arg1, arg0) - 128 >> 2)));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        field2557++;
        class70.field982 = new class82(class467.field6846.method2731(62, class372.field5455), "", class226.field3209, 1002, -1, (long) arg0, 0, 0, true, false);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static void method1121(int arg0) {
        if (arg0 != -23608) {
            method1119(-21, 72, -59);
        }
        field2552 = null;
        field2563 = null;
        field2556 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lmb;I)V")
    public final void method1122(class172 arg0, int arg1) {
        this.field2561 = arg0.field2561;
        if (arg1 > -114) {
            method1120(11);
        }
        this.field2551 = arg0.field2551;
        this.field2553 = arg0.field2553;
        this.field2546 = arg0.field2546;
        this.field2550 = arg0.field2550;
        this.field2558 = arg0.field2558;
        field2559++;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
    public class172(int arg0) {
        this.field2558 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIII)V")
    private class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2561 = arg1;
        this.field2558 = arg0;
        this.field2546 = arg3;
        this.field2551 = arg5;
        this.field2553 = arg2;
        this.field2550 = arg4;
    }
}
