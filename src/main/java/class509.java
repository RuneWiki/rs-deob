import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class509 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lan;")
    private static class20 field7485 = new class20(16);

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "[B")
    private static byte[] field7497 = new byte[1];

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field7500 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[S")
    private static short[] field7496 = new short[1];

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field7499 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Lug;")
    public static class392 field7494 = new class392();

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "F")
    public static float field7492;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "F")
    public static float field7493;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Ltj;")
    public static class131 field7487;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lnj;")
    public static class161 field7484;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lbu;")
    public static class17 field7488;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "Lan;")
    private static class20 field7521;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lsg;")
    private static class272 field7489;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lnv;")
    public static class285 field7486;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lhv;")
    private static class358 field7490;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Let;")
    public static class419 field7483;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Lbs;")
    public static class482 field7482;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lil;")
    public static class7 field7491;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[B")
    private static byte[] field7501;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[B")
    private static byte[] field7502;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[B")
    private static byte[] field7506;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[B")
    private static byte[] field7507;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "[B")
    private static byte[] field7513;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
    private static int[] field7508;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "[S")
    private static short[] field7516;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "[S")
    private static short[] field7520;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "[[[B")
    public static byte[][][] field7498;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "[[[Lku;")
    private static class254[][][] field7510;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqa;IIIIIII[S[BZ)V", line = 3)
    private static final void method3032(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method253(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field7508[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method253(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class424.method2552(arg7 >> 6 & 0x3, field7495, arg1, field7508[arg6], arg0, field7498, var11, var12, (byte) -87, arg5, arg4, arg2, arg3);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class79 var18 = field7482.method2874(arg8[var16] & 0xFFFF, -17045);
                if (var18.field1349 == -1) {
                    int var19 = -3355444;
                    if (var18.field1357 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method216(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method288(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method216(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method288(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method216(arg1, arg2, arg4, -1, 0);
                            arg0.method288(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method216(var14, arg2, arg4, -1, 0);
                            arg0.method288(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method216(var14, arg2, arg4, -1, 0);
                            arg0.method288(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method216(arg1, arg2, arg4, -1, 0);
                            arg0.method288(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method288(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method288(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method288(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method288(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method288(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method288(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqa;Lcu;IIII[I[I)V", line = 165)
    private static final void method3033(class162 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1063((byte) 118);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1063((byte) -111);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field7502[field7522 * arg5 + arg4] = (byte) var11;
                    field7513[field7522 * arg5 + arg4] = 0;
                } else {
                    field7513[field7522 * arg5 + arg4] = (byte) var11;
                    field7507[field7522 * arg5 + arg4] = 0;
                    field7502[field7522 * arg5 + arg4] = arg1.method1093(15);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1063((byte) -27);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1063((byte) 111);
                var18 = arg1.method1063((byte) 126);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1063((byte) 125);
            }
            if (var15 == 0) {
                field7502[field7522 * arg5 + arg4] = (byte) var16;
                field7513[field7522 * arg5 + arg4] = (byte) var17;
                field7507[field7522 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field7516[field7522 * arg5 + arg4] = (short) (arg1.method1069((byte) -39) + 1);
                    field7501[field7522 * arg5 + arg4] = arg1.method1093(15);
                } else if (var19 > 1) {
                    field7516[field7522 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1069((byte) -35);
                        var21[var22] = arg1.method1093(15);
                    }
                    field7521.method166(new class176(var20, var21), (long) (arg4 << 16 | arg5), 60);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1069((byte) -38);
                        var24[var25] = arg1.method1093(15);
                    }
                }
                if (field7510[var15 - 1][arg2 - (field7503 >> 6)][arg3 - (field7519 >> 6)] == null) {
                    field7510[var15 - 1][arg2 - (field7503 >> 6)][arg3 - (field7519 >> 6)] = new class254();
                }
                class434 var26 = new class434(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field7510[var15 - 1][arg2 - (field7503 >> 6)][arg3 - (field7519 >> 6)].method1636(9, var26);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Luj;", line = 300)
    public static final class259 method3034(int arg0, int arg1) {
        class259 var2 = new class259();
        for (class419 var3 = (class419) field7485.method160((byte) -20); var3 != null; var3 = (class419) field7485.method163(122)) {
            if (var3.field6262 && var3.method2532(arg0, arg1, 12800)) {
                var2.method1673(var3, 4304);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([B[B[SII)V", line = 318)
    private static final void method3035(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field7504];
        int[] var6 = new int[field7504];
        int[] var7 = new int[field7504];
        int[] var8 = new int[field7504];
        int[] var9 = new int[field7504];
        for (int var10 = -5; var10 < field7522; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field7504; var13++) {
                int var10002;
                if (var11 < field7522) {
                    int var28 = arg0[field7522 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class361 var29 = field7490.method2260((byte) 90, var28 - 1);
                        var5[var13] += var29.field5478;
                        var6[var13] += var29.field5480;
                        var7[var13] += var29.field5473;
                        var8[var13] += var29.field5470;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field7522 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class361 var31 = field7490.method2260((byte) 90, var30 - 1);
                        var5[var13] -= var31.field5478;
                        var6[var13] -= var31.field5480;
                        var7[var13] -= var31.field5473;
                        var8[var13] -= var31.field5470;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field7504; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field7504) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field7522 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field7522 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class101.method746(var15 / var18, (byte) 45, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field7522 * var19 + var10;
                            int var27 = class168.field2605[class37.method385(class419.method2534(var25, 96, true), false) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lm;II)V", line = 465)
    public static final void method3036(class126 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field7489.field3924; var3++) {
            field7508[var3 + 1] = method3040(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lbu;Lsg;Lhv;Lbs;Lnv;Lnj;Ltj;)V", line = 474)
    public static final void method3037(class17 arg0, class272 arg1, class358 arg2, class482 arg3, class285 arg4, class161 arg5, class131 arg6) {
        field7488 = arg0;
        field7489 = arg1;
        field7490 = arg2;
        field7482 = arg3;
        field7486 = arg4;
        field7484 = arg5;
        field7487 = arg6;
        field7485.method159(0);
        int var7 = field7488.method136("details", 94);
        int[] var8 = field7488.method131(var7, -111);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class419 var10 = class88.method689(var8[var9], true, var7, field7488);
            field7485.method166(var10, (long) var10.field6263, -118);
        }
        class392.method2432(true, false, (byte) 51);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Let;", line = 500)
    public static final class419 method3038(int arg0) {
        return (class419) field7485.method171((byte) 29, (long) arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)V", line = 505)
    public static final void method3039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7512 = arg0 - field7503;
        field7518 = arg1 - field7519;
        field7517 = arg2 - field7503;
        field7514 = arg3 - field7519;
        field7505 = arg4;
        field7511 = arg5;
        field7509 = arg6;
        field7515 = arg7;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lm;III)I", line = 516)
    private static final int method3040(class126 arg0, int arg1, int arg2, int arg3) {
        class180 var4 = field7489.method1754(arg1, 92);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field2723;
        if (var5 >= 0 && arg0.method956(-945, var5).field1427) {
            var5 = -1;
        }
        int var9;
        if (var4.field2715 >= 0) {
            int var6 = var4.field2715;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class168.field2605[class37.method385(class165.method1221(9154, var8, 96), false) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class168.field2605[class37.method385(class165.method1221(9154, arg0.method956(-945, var5).field1432, 96), false) & 0xFFFF] | 0xFF000000;
        } else if (var4.field2716 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field2716;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class168.field2605[class37.method385(class165.method1221(9154, var12, 96), false) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqa;II)V", line = 573)
    public static final void method3041(class162 arg0, int arg1, int arg2) {
        class145 var3 = new class145(field7488.method142((byte) -57, field7483.field6260, "area"));
        int var4 = var3.method1063((byte) 112);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1063((byte) 127);
        }
        int var7 = var3.method1063((byte) 108);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1063((byte) -101);
        }
        while (true) {
            while (var3.field2289 < var3.field2270.length) {
                if (var3.method1063((byte) -14) == 0) {
                    int var22 = var3.method1063((byte) 119);
                    int var23 = var3.method1063((byte) -84);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field7503;
                            int var27 = var23 * 64 + var25 - field7519;
                            method3033(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1063((byte) 107);
                    int var29 = var3.method1063((byte) 102);
                    int var30 = var3.method1063((byte) -119);
                    int var31 = var3.method1063((byte) -85);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field7503;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field7519;
                            method3033(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field7506 = new byte[field7522 * field7504];
            field7520 = new short[field7522 * field7504];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field7522 * field7504];
                for (int var13 = 0; var13 < field7510[var11].length; var13++) {
                    for (int var19 = 0; var19 < field7510[var11][0].length; var19++) {
                        class254 var20 = field7510[var11][var13][var19];
                        if (var20 != null) {
                            for (class434 var21 = (class434) var20.method1640(false); var21 != null; var21 = (class434) var20.method1641(true)) {
                                var12[(var19 * 64 + var21.field6433) * field7522 + var13 * 64 + var21.field6436] = (byte) var21.field6438;
                            }
                        }
                    }
                }
                method3035(var12, field7506, field7520, arg1, arg2);
                for (int var14 = 0; var14 < field7510[var11].length; var14++) {
                    for (int var15 = 0; var15 < field7510[var11][0].length; var15++) {
                        class254 var16 = field7510[var11][var14][var15];
                        if (var16 != null) {
                            for (class434 var17 = (class434) var16.method1640(false); var17 != null; var17 = (class434) var16.method1641(true)) {
                                int var18 = (var15 * 64 + var17.field6433) * field7522 + var14 * 64 + var17.field6436;
                                var17.field6438 = (field7506[var18] & 0xFF) << 16 | field7520[var18] & 0xFFFF;
                                if (var17.field6438 != 0) {
                                    var17.field6438 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3035(field7502, field7506, field7520, arg1, arg2);
            field7502 = null;
            method3052();
            return;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Let;", line = 753)
    public static final class419 method3042(int arg0, int arg1) {
        for (class419 var2 = (class419) field7485.method160((byte) -20); var2 != null; var2 = (class419) field7485.method163(120)) {
            if (var2.field6262 && var2.method2532(arg0, arg1, 12800)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqa;)Lug;", line = 767)
    public static final class392 method3043(class162 arg0) {
        int var1 = field7517 - field7512;
        int var2 = field7518 - field7514;
        int var3 = (field7509 - field7505 << 16) / var1;
        int var4 = (field7515 - field7511 << 16) / var2;
        return method3046(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lqa;)V", line = 778)
    public static final void method3044(class162 arg0) {
        int var1 = field7517 - field7512;
        int var2 = field7518 - field7514;
        int var3 = (field7509 - field7505 << 16) / var1;
        int var4 = (field7515 - field7511 << 16) / var2;
        method3050(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V", line = 791)
    public static final void method3045() {
        field7502 = null;
        field7506 = null;
        field7520 = null;
        field7513 = null;
        field7507 = null;
        field7516 = null;
        field7501 = null;
        field7521 = null;
        field7510 = null;
        field7508 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqa;IIII)Lug;", line = 806)
    private static final class392 method3046(class162 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class353 var5 = (class353) field7494.method2427(127); var5 != null; var5 = (class353) field7494.method2422(-107)) {
            method3049(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field7494;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqa;IIII[S[B)V", line = 819)
    private static final void method3047(class162 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class79 var8 = field7482.method2874(arg5[var7] & 0xFFFF, -17045);
            int var9 = var8.field1349;
            if (var9 != -1) {
                class421 var10 = field7484.method1192(34, var9);
                class529 var11 = var10.method2545(var8.field1340 ? var8.field1322 : false, 1, var8.field1339 ? arg6[var7] >> 6 & 0x3 : 0, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method100() >> 2;
                    int var13 = arg4 * var11.method104() >> 2;
                    if (var10.field6290) {
                        int var14 = var8.field1345;
                        int var15 = var8.field1384;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field6287 == 0) {
                            var11.method3135(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method105(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field6287 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V", line = 878)
    public static final void method3048() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field7491.field133; var1++) {
            boolean var2 = field7483.method2537(field7491.field134[var1] >> 14 & 0x3FFF, field7491.field134[var1] & 0x3FFF, var0, field7491.field134[var1] >> 28 & 0x3, -26767);
            if (var2) {
                class353 var3 = new class353(field7491.field136[var1]);
                var3.field5402 = var0[1] - field7503;
                var3.field5396 = var0[2] - field7519;
                field7494.method2417(-128, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqa;Ljq;IIII)V", line = 899)
    private static final void method3049(class162 arg0, class353 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field5398 = ((arg1.field5402 - field7512) * arg2 + arg4 >> 16) + field7505;
        arg1.field5395 = field7515 - ((arg1.field5396 - field7514) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lqa;IIII)V", line = 904)
    private static final void method3050(class162 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field7517 - field7512;
        int var6 = field7518 - field7514;
        if (field7517 < field7522) {
            var5++;
        }
        if (field7518 < field7504) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field7505;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field7505;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field7512 + var7;
                if (var52 >= 0 && var52 < field7522) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field7515 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field7515 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field7514 + var53;
                            int var58 = field7522 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field7504) {
                                var59 = (field7506[var58] & 0xFF) << 16 | field7520[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field7513[var58] & 0xFF;
                                var61 = field7516[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field7483.field6259 != -1) {
                                    var62 = field7483.field6259 | 0xFF000000;
                                } else if ((field7518 + var53 & 0x4) == (field7512 + var7 & 0x4)) {
                                    var62 = field7508[field7489.field3930 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method253(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3032(arg0, var49, var54, var51, var56, var59, var60, field7507[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class176 var63 = (class176) field7521.method171((byte) 90, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method3032(arg0, var49, var54, var51, var56, var59, var60, field7507[var58], var63.field2684, var63.field2683, true);
                                }
                            } else {
                                field7496[0] = (short) (var61 - 1);
                                field7497[0] = field7501[var58];
                                method3032(arg0, var49, var54, var51, var56, var59, var60, field7507[var58], field7496, field7497, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field7515 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field7515 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field7483.field6259 != -1) {
                            var68 = field7483.field6259 | 0xFF000000;
                        } else if ((field7518 + var64 & 0x4) == (field7512 + var7 & 0x4)) {
                            var68 = field7508[field7489.field3930 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method253(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field7505;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field7505;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field7512 + var8;
                if (var41 >= 0 && var41 < field7522) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field7515 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field7515 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field7514 + var42;
                            if (var46 >= 0 && var46 < field7504) {
                                int var47 = field7516[field7522 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3047(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class176 var48 = (class176) field7521.method171((byte) 41, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method3047(arg0, var38, var43, var40, var45, var48.field2684, var48.field2683);
                                    }
                                } else {
                                    field7496[0] = (short) (var47 - 1);
                                    field7497[0] = field7501[field7522 * var46 + var41];
                                    method3047(arg0, var38, var43, var40, var45, field7496, field7497);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field7512 >> 6;
        int var10 = field7514 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field7517 >> 6;
        int var12 = field7518 >> 6;
        if (var11 >= field7510[0].length) {
            var11 = field7510[0].length - 1;
        }
        if (var12 >= field7510[0][0].length) {
            var12 = field7510[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class254 var28 = field7510[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field7503 >> 6) + var14) * 64;
                        int var30 = ((field7519 >> 6) + var27) * 64;
                        for (class434 var31 = (class434) var28.method1640(false); var31 != null; var31 = (class434) var28.method1641(true)) {
                            int var32 = var31.field6436 + var29 - field7503 - field7512;
                            int var33 = var31.field6433 + var30 - field7519 - field7514;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field7505;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field7505;
                            int var36 = field7515 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field7515 - (arg2 * var33 + arg4 >> 16);
                            method3032(arg0, var34, var36, var35 - var34, var37 - var36, var31.field6438, var31.field6434 & 0xFF, var31.field6439, var31.field6437, var31.field6435, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class254 var17 = field7510[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field7503 >> 6) + var15) * 64;
                        int var19 = ((field7519 >> 6) + var16) * 64;
                        for (class434 var20 = (class434) var17.method1640(false); var20 != null; var20 = (class434) var17.method1641(true)) {
                            int var21 = var20.field6436 + var18 - field7503 - field7512;
                            int var22 = var20.field6433 + var19 - field7519 - field7514;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field7505;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field7505;
                            int var25 = field7515 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field7515 - (arg2 * var22 + arg4 >> 16);
                            method3047(arg0, var23, var25, var24 - var23, var26 - var25, var20.field6437, var20.field6435);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 1246)
    public static final void method3051(int arg0) {
        field7483 = (class419) field7485.method171((byte) -121, (long) arg0);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()V", line = 1252)
    private static final void method3052() {
        for (int var0 = 0; var0 < field7522; var0++) {
            for (int var11 = 0; var11 < field7504; var11++) {
                int var12 = field7516[field7522 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class176 var13 = (class176) field7521.method171((byte) -122, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field2684.length; var14++) {
                                class79 var15 = field7482.method2874(var13.field2684[var14] & 0xFFFF, -17045);
                                int var16 = var15.field1397;
                                if (var15.field1370 != null) {
                                    class79 var17 = var15.method631(6574, field7487);
                                    if (var17 != null) {
                                        var16 = var17.field1397;
                                    }
                                }
                                if (var16 != -1) {
                                    class353 var18 = new class353(var16);
                                    var18.field5402 = var0;
                                    var18.field5396 = var11;
                                    field7494.method2417(-128, var18);
                                }
                            }
                        }
                    } else {
                        class79 var19 = field7482.method2874(var12 - 1, -17045);
                        int var20 = var19.field1397;
                        if (var19.field1370 != null) {
                            class79 var21 = var19.method631(6574, field7487);
                            if (var21 != null) {
                                var20 = var21.field1397;
                            }
                        }
                        if (var20 != -1) {
                            class353 var22 = new class353(var20);
                            var22.field5402 = var0;
                            var22.field5396 = var11;
                            field7494.method2417(-120, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field7510[0].length; var2++) {
                for (int var3 = 0; var3 < field7510[0][0].length; var3++) {
                    class254 var4 = field7510[var1][var2][var3];
                    if (var4 != null) {
                        for (class434 var5 = (class434) var4.method1640(false); var5 != null; var5 = (class434) var4.method1641(true)) {
                            if (var5.field6437 != null) {
                                for (int var6 = 0; var6 < var5.field6437.length; var6++) {
                                    class79 var7 = field7482.method2874(var5.field6437[var6] & 0xFFFF, -17045);
                                    int var8 = var7.field1397;
                                    if (var7.field1370 != null) {
                                        class79 var9 = var7.method631(6574, field7487);
                                        if (var9 != null) {
                                            var8 = var9.field1397;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class353 var10 = new class353(var8);
                                        var10.field5402 = ((field7503 >> 6) + var2) * 64 + var5.field6436 - field7503;
                                        var10.field5396 = ((field7519 >> 6) + var3) * 64 + var5.field6433 - field7519;
                                        field7494.method2417(-2, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "()V", line = 1408)
    public static final void method3053() {
        field7502 = new byte[field7522 * field7504];
        field7513 = new byte[field7522 * field7504];
        field7507 = new byte[field7522 * field7504];
        field7516 = new short[field7522 * field7504];
        field7501 = new byte[field7522 * field7504];
        field7521 = new class20(1024);
        field7510 = new class254[3][field7522 >> 6][field7504 >> 6];
        field7508 = new int[field7489.field3924 + 1];
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "()V", line = 1418)
    public static void method3054() {
        field7489 = null;
        field7490 = null;
        field7482 = null;
        field7486 = null;
        field7484 = null;
        field7487 = null;
        field7483 = null;
        field7488 = null;
        field7485 = null;
        field7498 = null;
        field7496 = null;
        field7497 = null;
        field7491 = null;
        field7494 = null;
        field7508 = null;
        field7502 = null;
        field7506 = null;
        field7520 = null;
        field7513 = null;
        field7507 = null;
        field7516 = null;
        field7501 = null;
        field7521 = null;
        field7510 = null;
    }
}
