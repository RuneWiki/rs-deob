import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class205 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[I")
    public static int[] field3408 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field3413 = 0;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Z")
    public static volatile boolean field3412 = true;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field3414 = 0;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Z")
    public static boolean field3416 = false;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "F")
    public static float field3411;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lek;")
    public static class206 field3417;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 5)
    public static void method1395(byte arg0) {
        int var1 = 67 % ((arg0 - 22) / 44);
        field3417 = null;
        field3408 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIII)V", line = 40)
    public static final void method1396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3415++;
        if (arg5 <= class177.field2930 && class87.field1520 <= arg1) {
            boolean var6;
            if (arg3 < class190.field3224) {
                var6 = false;
                arg3 = class190.field3224;
            } else if (arg3 <= class289.field4704) {
                var6 = true;
            } else {
                arg3 = class289.field4704;
                var6 = false;
            }
            boolean var7;
            if (arg0 < class190.field3224) {
                arg0 = class190.field3224;
                var7 = false;
            } else if (arg0 > class289.field4704) {
                var7 = false;
                arg0 = class289.field4704;
            } else {
                var7 = true;
            }
            if (arg5 >= class87.field1520) {
                class344.method2417(class232.field3799[arg5++], arg3, arg0, arg4, (byte) -121);
            } else {
                arg5 = class87.field1520;
            }
            if (arg1 > class177.field2930) {
                arg1 = class177.field2930;
            } else {
                class344.method2417(class232.field3799[arg1--], arg3, arg0, arg4, (byte) -121);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg1; var8++) {
                    int[] var9 = class232.field3799[var8];
                    var9[arg3] = var9[arg0] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg1; var11++) {
                    class232.field3799[var11][arg3] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg1; var10++) {
                    class232.field3799[var10][arg0] = arg4;
                }
            }
        }
        if (arg2 <= 96) {
            field3414 = -70;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([[I[[FZFII[[FIBI[[IIIIILwl;I[[F)I", line = 152)
    public static final int method1397(int[][] arg0, float[][] arg1, boolean arg2, float arg3, int arg4, int arg5, float[][] arg6, int arg7, byte arg8, int arg9, int[][] arg10, int arg11, int arg12, int arg13, int arg14, class102 arg15, int arg16, float[][] arg17) {
        if (arg12 == 1) {
            int var18 = arg14;
            arg14 = arg5;
            arg5 = 128 - var18;
        } else if (arg12 == 2) {
            arg5 = 128 - arg5;
            arg14 = 128 - arg14;
        } else if (arg12 == 3) {
            int var19 = arg14;
            arg14 = 128 - arg5;
            arg5 = var19;
        }
        field3410++;
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg14 == 0 && arg5 == 0) {
            var20 = arg4;
            var21 = arg6[arg7][arg13];
            var22 = arg1[arg7][arg13];
            var23 = arg17[arg7][arg13];
        } else if (arg14 == 128 && arg5 == 0) {
            var23 = arg17[arg7 + 1][arg13];
            var20 = arg11;
            var21 = arg6[arg7 + 1][arg13];
            var22 = arg1[arg7 + 1][arg13];
        } else if (arg14 == 128 && arg5 == 128) {
            var23 = arg17[arg7 + 1][arg13 + 1];
            var21 = arg6[arg7 + 1][arg13 + 1];
            var22 = arg1[arg7 + 1][arg13 + 1];
            var20 = arg9;
        } else if (arg14 == 0 && arg5 == 128) {
            var23 = arg17[arg7][arg13 + 1];
            var22 = arg1[arg7][arg13 + 1];
            var21 = arg6[arg7][arg13 + 1];
            var20 = arg16;
        } else {
            float var24 = arg6[arg7][arg13];
            float var25 = arg17[arg7][arg13];
            float var26 = arg1[arg7][arg13];
            float var27 = (float) arg14 / 128.0F;
            float var28 = (arg1[arg7 + 1][arg13] - var26) * var27 + var26;
            float var29 = (arg17[arg7 + 1][arg13] - var25) * var27 + var25;
            float var30 = (arg6[arg7 + 1][arg13] - var24) * var27 + var24;
            float var31 = (float) arg5 / 128.0F;
            float var32 = arg6[arg7][arg13 + 1];
            float var33 = arg17[arg7][arg13 + 1];
            float var34 = arg1[arg7][arg13 + 1];
            float var35 = (arg6[arg7 + 1][arg13 + 1] - var32) * var27 + var32;
            var21 = (var35 - var30) * var31 + var30;
            float var36 = (arg1[arg7 + 1][arg13 + 1] - var34) * var27 + var34;
            var22 = (var36 - var28) * var31 + var28;
            float var37 = (arg17[arg7 + 1][arg13 + 1] - var33) * var27 + var33;
            var23 = (var37 - var29) * var31 + var29;
            int var38 = class220.method1531(arg4, arg14, arg11, -21281);
            int var39 = class220.method1531(arg16, arg14, arg9, -21281);
            var20 = class220.method1531(var38, arg5, var39, -21281);
        }
        if (arg8 < 4) {
            field3411 = -0.18891022F;
        }
        int var40 = (arg7 << 7) + arg14;
        int var41 = class171.method1216(arg7, arg14, arg13, (byte) -124, arg10, arg5);
        int var42 = (arg13 << 7) + arg5;
        return arg15.method774(var40, var41, var42, var23, var22, var21, arg2 ? var20 & 0xFFFFFF00 : var20, arg0 == null ? 0.0F : (float) (var41 - class171.method1216(arg7, arg14, arg13, (byte) -103, arg0, arg5)) / arg3);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZZILoe;IIIIII)V", line = 265)
    public static final void method1398(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, class146 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg0 >= 0 && arg0 < 104 && arg1 >= 0 && arg1 < 104) {
            if (!arg3 && !arg2) {
                class282.field4615[arg4][arg0][arg1] = 0;
            }
            while (true) {
                int var12 = arg5.method1005((byte) 122);
                if (var12 == 0) {
                    if (arg3) {
                        class144.field2427[0][arg0 + arg6][arg1 + arg7] = class123.field2166[0][arg0 + arg6][arg1 + arg7];
                    } else if (arg4 == 0) {
                        class144.field2427[0][arg0 + arg6][arg1 + arg7] = -class341.method2411(arg11 + 556238, (byte) 127, arg8 + 932731) * 8;
                    } else {
                        class144.field2427[arg4][arg0 + arg6][arg1 + arg7] = class144.field2427[arg4 - 1][arg0 + arg6][arg1 + arg7] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg5.method1005((byte) 122);
                    if (arg3) {
                        class144.field2427[0][arg0 + arg6][arg1 + arg7] = var13 * 8 + class123.field2166[0][arg0 + arg6][arg1 + arg7];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg4 == 0) {
                            class144.field2427[0][arg0 + arg6][arg1 + arg7] = -var13 * 8;
                        } else {
                            class144.field2427[arg4][arg0 + arg6][arg1 + arg7] = class144.field2427[arg4 - 1][arg0 + arg6][arg1 + arg7] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg2) {
                        arg5.method1005((byte) 122);
                    } else {
                        class54.field1081[arg4][arg0][arg1] = arg5.method1029(-2);
                        class355.field5656[arg4][arg0][arg1] = (byte) ((var12 - 2) / 4);
                        class99.field1811[arg4][arg0][arg1] = (byte) class83.method613(3, var12 + arg10 - 2);
                    }
                } else if (var12 > 81) {
                    if (!arg2) {
                        class1.field23[arg4][arg0][arg1] = (byte) (var12 - 81);
                    }
                } else if (!arg3 && !arg2) {
                    class282.field4615[arg4][arg0][arg1] = (byte) (var12 - 49);
                }
            }
        } else {
            while (true) {
                int var14 = arg5.method1005((byte) 122);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg5.method1005((byte) 122);
                    break;
                }
                if (var14 <= 49) {
                    arg5.method1005((byte) 122);
                }
            }
        }
        field3409++;
        if (arg9 >= -10) {
            method1398(-107, 87, true, false, 126, (class146) null, -87, 52, -64, -3, 36, 45);
        }
    }
}
