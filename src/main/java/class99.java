import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class99 extends class11 {

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "Lok;")
    public class236 field1495;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "Lcu;")
    public static class206 field1493 = new class206(38, -1);

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[FIIIFII)V", line = 3)
    public static final void method759(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, float arg7, int arg8, int arg9) {
        field1492++;
        int var10 = arg9 - arg8;
        int var11 = arg4 - arg5;
        int var12 = arg2 - arg6;
        float var13 = arg3[2] * (float) var10 + arg3[1] * (float) var12 + arg3[0] * (float) var11;
        float var14 = arg3[5] * (float) var10 + arg3[3] * (float) var11 + arg3[4] * (float) var12;
        float var15 = arg3[8] * (float) var10 + arg3[7] * (float) var12 + arg3[6] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg7 + 0.5F;
        if (arg1 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class620.field8223 = var18;
        if (arg0 <= -44) {
            class687.field9652 = var17;
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(B)V", line = 55)
    public static final void method760(byte arg0) {
        class97.field1470.method3739(0);
        field1490++;
        int var1 = 125 % ((arg0 + 59) / 40);
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(B)V", line = 68)
    public static void method761(byte arg0) {
        if (arg0 < 10) {
            field1493 = null;
        }
        field1493 = null;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)[Lqw;", line = 78)
    public static final class71[] method762(boolean arg0) {
        if (arg0) {
            field1493 = null;
        }
        field1491++;
        return new class71[] { class326.field4503, class252.field3466, class308.field4241, class690.field9709, class72.field1128, class307.field4237, class522.field6978, class425.field5846, class305.field4228, class502.field6716, class140.field2257, class314.field4310, class266.field3698, class326.field4504, class418.field5722, class516.field6891 };
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ldv;BIILba;IILoa;IIIIIII)Lba;", line = 91)
    public static final class358 method763(class616 arg0, byte arg1, int arg2, int arg3, class358 arg4, int arg5, int arg6, class651 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field1494++;
        if (arg4 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg0 != null) {
            int var16 = var15 | arg0.method3374(114, false, -1, arg8);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg11 << 32) + ((long) ((arg5 << 24) + (arg9 << 16) + arg3) + ((long) arg10 << 48));
        class666 var19 = class322.field4481;
        class358 var20;
        synchronized (class322.field4481) {
            var20 = (class358) class322.field4481.method3750(var17, false);
        }
        if (var20 == null || arg7.method376(var20.method1945(), var15) != 0) {
            if (var20 != null) {
                var15 = arg7.method460(var15, var20.method1945());
            }
            byte var21;
            if (arg3 == 1) {
                var21 = 9;
            } else if (arg3 == 2) {
                var21 = 12;
            } else if (arg3 == 3) {
                var21 = 15;
            } else if (arg3 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class545 var24 = new class545(var21 * var22 + 1, var22 * 2 * var21 + -var21, 0);
            int var25 = var24.method3019(0, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class126.field2116[var31] * var28 >> 14;
                    int var33 = class126.field2105[var31] * var29 >> 14;
                    var26[var27][var30] = var24.method3019(0, var33, var32, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg5 * var35 + arg9 * var36 >> 8);
                short var38 = (short) (((arg10 & 0xFC00) * var35 + (arg11 & 0xFC00) * var36 & 0xFC0000) + ((arg10 & 0x380) * var35 + (arg11 & 0x380) * var36 & 0x38000) + ((arg10 & 0x7F) * var35 + (arg11 & 0x7F) * var36 & 0x7F00) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method3023((short) -1, var26[0][(var39 + 1) % var21], 0, var26[0][var39], var37, (byte) 1, (byte) -1, var25, var38);
                    } else {
                        var24.method3023((short) -1, var26[var34 - 1][(var39 + 1) % var21], arg1 - 34, var26[var34][(var39 + 1) % var21], var37, (byte) 1, (byte) -1, var26[var34 - 1][var39], var38);
                        var24.method3023((short) -1, var26[var34][(var39 + 1) % var21], arg1 - 34, var26[var34][var39], var37, (byte) 1, (byte) -1, var26[var34 - 1][var39], var38);
                    }
                }
            }
            var20 = arg7.method443(var24, var15, class269.field3750, 64, 768);
            class666 var40 = class322.field4481;
            synchronized (class322.field4481) {
                class322.field4481.method3745(1, var17, var20);
            }
        }
        int var41 = (arg3 << 8) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg2 != 0) {
            if ((arg2 & 0x2) != 0) {
                var43 -= 512;
            }
            if ((arg2 & 0x1) != 0) {
                var45 = var41 + 512;
            }
            if ((arg2 & 0x8) != 0) {
                var42 -= 512;
            }
            if ((arg2 & 0x4) != 0) {
                var44 = var41 + 512;
            }
        }
        int var46 = arg4.method1951();
        int var47 = arg4.method1936();
        if (arg1 != 34) {
            method763(null, (byte) 106, -81, 55, null, 77, 115, null, -45, -84, 41, -27, -98, 6, -44);
        }
        int var48 = arg4.method1935();
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg4.method1934();
        if (var46 < var42) {
            var46 = var42;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class696 var50 = null;
        if (arg0 != null) {
            int var51 = arg0.field8160[arg8];
            var50 = class636.field8570.method229(arg1 ^ 0xFFFFFFE8, var51 >> 16);
            arg8 = var51 & 0xFFFF;
        }
        class358 var52;
        if (var50 == null) {
            var52 = var20.method1519((byte) 3, var15, true);
            var52.method1918(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1932(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method1519((byte) 3, var15, true);
            var52.method1918(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1932(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2116(arg8, var50, -1);
        }
        if (arg12 != 0) {
            var52.method1933(arg12);
        }
        if (arg13 != 0) {
            var52.method1904(arg13);
        }
        if (arg6 != 0) {
            var52.method1932(0, arg6, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lok;)V", line = 312)
    public class99(class236 arg0) {
        this.field1495 = arg0;
    }
}
