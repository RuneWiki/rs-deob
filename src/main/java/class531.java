import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class531 {

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Lgca;")
    private static class209 field7424 = new class209(16);

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "[B")
    private static byte[] field7432 = new byte[1];

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "[S")
    private static short[] field7435 = new short[1];

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field7433 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field7436 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "Lfha;")
    public static class522 field7437 = new class522();

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "F")
    public static float field7430;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "F")
    public static float field7438;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!gr", name = "N", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Llg;")
    public static class139 field7426;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Leq;")
    private static class140 field7423;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "Lgca;")
    private static class209 field7455;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "Laca;")
    public static class219 field7422;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "Lkq;")
    public static class343 field7421;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "Leea;")
    public static class458 field7439;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Lob;")
    private static class4 field7427;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lfl;")
    public static class520 field7428;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "Lhk;")
    public static class534 field7429;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lwu;")
    public static class557 field7425;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "[B")
    private static byte[] field7440;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "[B")
    private static byte[] field7444;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "[B")
    private static byte[] field7451;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "[B")
    private static byte[] field7454;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "[B")
    private static byte[] field7456;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "[I")
    private static int[] field7459;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "[S")
    private static short[] field7457;

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "[S")
    private static short[] field7458;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "[[[B")
    public static byte[][][] field7431;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "[[[Ljia;")
    private static class336[][][] field7450;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;)Lfha;", line = 4)
    public static final class522 method3152(class545 arg0) {
        int var1 = field7441 - field7460;
        int var2 = field7443 - field7445;
        int var3 = (field7453 - field7448 << 16) / var1;
        int var4 = (field7461 - field7446 << 16) / var2;
        return method3171(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 14)
    private static final void method3153(class545 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method2194(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field7459[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method2194(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class488.method2858(arg1, field7431, arg3, arg7 >> 6 & 0x3, arg5, field7459[arg6], var11, field7434, var12, arg2, 64, arg4, arg0);
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
                class30 var18 = field7429.method3188(arg8[var16] & 0xFFFF, (byte) -57);
                if (var18.field404 == -1) {
                    int var19 = -3355444;
                    if (var18.field467 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method2191(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2173(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2191(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method2173(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method2191(arg1, arg2, arg4, -1, 0);
                            arg0.method2173(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2191(var14, arg2, arg4, -1, 0);
                            arg0.method2173(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2191(var14, arg2, arg4, -1, 0);
                            arg0.method2173(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method2191(arg1, arg2, arg4, -1, 0);
                            arg0.method2173(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method2173(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2173(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2173(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method2173(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method2173(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method2173(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIII)V", line = 176)
    public static final void method3154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7460 = arg0 - field7447;
        field7443 = arg1 - field7452;
        field7441 = arg2 - field7447;
        field7445 = arg3 - field7452;
        field7448 = arg4;
        field7446 = arg5;
        field7453 = arg6;
        field7461 = arg7;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ld;II)V", line = 189)
    public static final void method3155(class268 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field7423.field1924; var3++) {
            field7459[var3 + 1] = method3174(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Lfl;", line = 202)
    public static final class520 method3156(int arg0, int arg1) {
        for (class520 var2 = (class520) field7424.method1382(27901); var2 != null; var2 = (class520) field7424.method1383(false)) {
            if (var2.field7263 && var2.method3092(arg1, 95, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "()V", line = 215)
    public static final void method3157() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field7439.field6303; var1++) {
            boolean var2 = field7428.method3093(var0, field7439.field6304[var1] >> 28 & 0x3, field7439.field6304[var1] >> 14 & 0x3FFF, true, field7439.field6304[var1] & 0x3FFF);
            if (var2) {
                class753 var3 = new class753(field7439.field6305[var1]);
                var3.field10465 = var0[1] - field7447;
                var3.field10456 = var0[2] - field7452;
                field7437.method3116(29066, var3);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "()V", line = 236)
    public static final void method3158() {
        field7456 = null;
        field7440 = null;
        field7458 = null;
        field7444 = null;
        field7454 = null;
        field7457 = null;
        field7451 = null;
        field7455 = null;
        field7450 = null;
        field7459 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;Lvj;IIII[I[I)V", line = 250)
    private static final void method3159(class545 arg0, class26 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method194((byte) 119);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method194((byte) 119);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field7456[field7442 * arg5 + arg4] = (byte) var11;
                    field7444[field7442 * arg5 + arg4] = 0;
                } else {
                    field7444[field7442 * arg5 + arg4] = (byte) var11;
                    field7454[field7442 * arg5 + arg4] = 0;
                    field7456[field7442 * arg5 + arg4] = arg1.method195(128);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method194((byte) 119);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method194((byte) 119);
                var18 = arg1.method194((byte) 119);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method194((byte) 119);
            }
            if (var15 == 0) {
                field7456[field7442 * arg5 + arg4] = (byte) var16;
                field7444[field7442 * arg5 + arg4] = (byte) var17;
                field7454[field7442 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field7457[field7442 * arg5 + arg4] = (short) (arg1.method193(2) + 1);
                    field7451[field7442 * arg5 + arg4] = arg1.method195(128);
                } else if (var19 > 1) {
                    field7457[field7442 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method193(2);
                        var21[var22] = arg1.method195(128);
                    }
                    field7455.method1387(new class525(var20, var21), (long) (arg4 << 16 | arg5), (byte) -116);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method193(2);
                        var24[var25] = arg1.method195(128);
                    }
                }
                if (field7450[var15 - 1][arg2 - (field7447 >> 6)][arg3 - (field7452 >> 6)] == null) {
                    field7450[var15 - 1][arg2 - (field7447 >> 6)][arg3 - (field7452 >> 6)] = new class336();
                }
                class598 var26 = new class598(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field7450[var15 - 1][arg2 - (field7447 >> 6)][arg3 - (field7452 >> 6)].method1946(-120, var26);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([B[B[SII)V", line = 385)
    private static final void method3160(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field7449];
        int[] var6 = new int[field7449];
        int[] var7 = new int[field7449];
        int[] var8 = new int[field7449];
        int[] var9 = new int[field7449];
        for (int var10 = -5; var10 < field7442; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field7449; var13++) {
                int var10002;
                if (var11 < field7442) {
                    int var28 = arg0[field7442 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class759 var29 = field7427.method11(var28 - 1, 96);
                        var5[var13] += var29.field10549;
                        var6[var13] += var29.field10553;
                        var7[var13] += var29.field10546;
                        var8[var13] += var29.field10552;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field7442 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class759 var31 = field7427.method11(var30 - 1, 94);
                        var5[var13] -= var31.field10549;
                        var6[var13] -= var31.field10553;
                        var7[var13] -= var31.field10546;
                        var8[var13] -= var31.field10552;
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
                for (int var19 = -5; var19 < field7449; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field7449) {
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
                        if ((arg0[field7442 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field7442 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class95.method653(var16 / var18, -112, var15 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field7442 * var19 + var10;
                            int var27 = class278.field3718[class704.method3958((byte) 111, class300.method1761(21257, 96, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;II)V", line = 529)
    public static final void method3161(class545 arg0, int arg1, int arg2) {
        class26 var3 = new class26(field7425.method3330((byte) 67, "area", field7428.field7269));
        int var4 = var3.method194((byte) 119);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method194((byte) 119);
        }
        int var7 = var3.method194((byte) 119);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method194((byte) 119);
        }
        while (true) {
            while (var3.field330 < var3.field279.length) {
                if (var3.method194((byte) 119) == 0) {
                    int var22 = var3.method194((byte) 119);
                    int var23 = var3.method194((byte) 119);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field7447;
                            int var27 = var23 * 64 + var25 - field7452;
                            method3159(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method194((byte) 119);
                    int var29 = var3.method194((byte) 119);
                    int var30 = var3.method194((byte) 119);
                    int var31 = var3.method194((byte) 119);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field7447;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field7452;
                            method3159(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field7440 = new byte[field7449 * field7442];
            field7458 = new short[field7449 * field7442];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field7449 * field7442];
                for (int var13 = 0; var13 < field7450[var11].length; var13++) {
                    for (int var19 = 0; var19 < field7450[var11][0].length; var19++) {
                        class336 var20 = field7450[var11][var13][var19];
                        if (var20 != null) {
                            for (class598 var21 = (class598) var20.method1945(false); var21 != null; var21 = (class598) var20.method1944(9408)) {
                                var12[(var19 * 64 + var21.field8589) * field7442 + var13 * 64 + var21.field8592] = (byte) var21.field8590;
                            }
                        }
                    }
                }
                method3160(var12, field7440, field7458, arg1, arg2);
                for (int var14 = 0; var14 < field7450[var11].length; var14++) {
                    for (int var15 = 0; var15 < field7450[var11][0].length; var15++) {
                        class336 var16 = field7450[var11][var14][var15];
                        if (var16 != null) {
                            for (class598 var17 = (class598) var16.method1945(false); var17 != null; var17 = (class598) var16.method1944(9408)) {
                                int var18 = (var15 * 64 + var17.field8589) * field7442 + var14 * 64 + var17.field8592;
                                var17.field8590 = (field7440[var18] & 0xFF) << 16 | field7458[var18] & 0xFFFF;
                                if (var17.field8590 != 0) {
                                    var17.field8590 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3160(field7456, field7440, field7458, arg1, arg2);
            field7456 = null;
            method3168();
            return;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)Ldm;", line = 708)
    public static final class98 method3162(int arg0, int arg1) {
        class98 var2 = new class98();
        for (class520 var3 = (class520) field7424.method1382(27901); var3 != null; var3 = (class520) field7424.method1383(false)) {
            if (var3.field7263 && var3.method3092(arg1, -85, arg0)) {
                var2.method666(8192, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;Lgfa;IIII)V", line = 723)
    private static final void method3163(class545 arg0, class753 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field10455 = ((arg1.field10465 - field7460) * arg2 + arg4 >> 16) + field7448;
        arg1.field10458 = field7461 - ((arg1.field10456 - field7445) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;Lgfa;Ljk;)V", line = 728)
    public static final void method3164(class545 arg0, class753 arg1, class185 arg2) {
        if (arg2.field2703 == null) {
            return;
        }
        int[] var3 = new int[arg2.field2703.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field2703[var4 * 2] + arg1.field10465;
            int var22 = arg2.field2703[var4 * 2 + 1] + arg1.field10456;
            var3[var4 * 2] = (var21 - field7460) * (field7453 - field7448) / (field7441 - field7460) + field7448;
            var3[var4 * 2 + 1] = field7461 - (field7461 - field7446) * (var22 - field7445) / (field7443 - field7445);
        }
        class373.method2237(arg0, var3, arg2.field2692);
        if (arg2.field2682 > 0) {
            for (int var5 = 0; var5 < var3.length / 2 - 1; var5++) {
                int var13 = var3[var5 * 2];
                int var14 = var3[var5 * 2 + 1];
                int var15 = var3[(var5 + 1) * 2];
                int var16 = var3[(var5 + 1) * 2 + 1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg0.method2201(var13, var14, var15, var16, arg2.field2673[arg2.field2690[var5] & 0xFF], 1, arg2.field2682, arg2.field2671, arg2.field2687);
            }
            int var6 = var3[var3.length - 2];
            int var7 = var3[var3.length - 1];
            int var8 = var3[0];
            int var9 = var3[1];
            if (var8 < var6) {
                int var10 = var6;
                int var11 = var7;
                var6 = var8;
                var7 = var9;
                var8 = var10;
                var9 = var11;
            } else if (var6 == var8 && var9 < var7) {
                int var12 = var7;
                var7 = var9;
                var9 = var12;
            }
            arg0.method2201(var6, var7, var8, var9, arg2.field2673[arg2.field2690[arg2.field2690.length - 1] & 0xFF], 1, arg2.field2682, arg2.field2671, arg2.field2687);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method3259(var3[var20 * 2 + 1], var3[(var20 + 1) * 2 + 1], var3[var20 * 2], var3[(var20 + 1) * 2], (byte) -91, arg2.field2673[arg2.field2690[var20] & 0xFF]);
        }
        arg0.method3259(var3[var3.length - 1], var3[1], var3[var3.length - 2], var3[0], (byte) -91, arg2.field2673[arg2.field2690[arg2.field2690.length - 1] & 0xFF]);
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "()V", line = 836)
    public static void method3165() {
        field7423 = null;
        field7427 = null;
        field7429 = null;
        field7421 = null;
        field7426 = null;
        field7422 = null;
        field7428 = null;
        field7425 = null;
        field7424 = null;
        field7431 = null;
        field7435 = null;
        field7432 = null;
        field7439 = null;
        field7437 = null;
        field7459 = null;
        field7456 = null;
        field7440 = null;
        field7458 = null;
        field7444 = null;
        field7454 = null;
        field7457 = null;
        field7451 = null;
        field7455 = null;
        field7450 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;IIII)V", line = 864)
    private static final void method3166(class545 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field7441 - field7460;
        int var6 = field7443 - field7445;
        if (field7441 < field7442) {
            var5++;
        }
        if (field7443 < field7449) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field7448;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field7448;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field7460 + var7;
                if (var52 >= 0 && var52 < field7442) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field7461 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field7461 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field7445 + var53;
                            int var58 = field7442 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field7449) {
                                var59 = (field7440[var58] & 0xFF) << 16 | field7458[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field7444[var58] & 0xFF;
                                var61 = field7457[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field7428.field7270 != -1) {
                                    var62 = field7428.field7270 | 0xFF000000;
                                } else if ((field7460 + var7 & 0x4) == (field7443 + var53 & 0x4)) {
                                    var62 = field7459[field7423.field1937 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method2194(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3153(arg0, var49, var54, var51, var56, var59, var60, field7454[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class525 var63 = (class525) field7455.method1381(true, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method3153(arg0, var49, var54, var51, var56, var59, var60, field7454[var58], var63.field7354, var63.field7353, true);
                                }
                            } else {
                                field7435[0] = (short) (var61 - 1);
                                field7432[0] = field7451[var58];
                                method3153(arg0, var49, var54, var51, var56, var59, var60, field7454[var58], field7435, field7432, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field7461 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field7461 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field7428.field7270 != -1) {
                            var68 = field7428.field7270 | 0xFF000000;
                        } else if ((field7460 + var7 & 0x4) == (field7443 + var64 & 0x4)) {
                            var68 = field7459[field7423.field1937 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method2194(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field7448;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field7448;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field7460 + var8;
                if (var41 >= 0 && var41 < field7442) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field7461 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field7461 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field7445 + var42;
                            if (var46 >= 0 && var46 < field7449) {
                                int var47 = field7457[field7442 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3172(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class525 var48 = (class525) field7455.method1381(true, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method3172(arg0, var38, var43, var40, var45, var48.field7354, var48.field7353);
                                    }
                                } else {
                                    field7435[0] = (short) (var47 - 1);
                                    field7432[0] = field7451[field7442 * var46 + var41];
                                    method3172(arg0, var38, var43, var40, var45, field7435, field7432);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field7460 >> 6;
        int var10 = field7445 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field7441 >> 6;
        int var12 = field7443 >> 6;
        if (var11 >= field7450[0].length) {
            var11 = field7450[0].length - 1;
        }
        if (var12 >= field7450[0][0].length) {
            var12 = field7450[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class336 var28 = field7450[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field7447 >> 6) + var14) * 64;
                        int var30 = ((field7452 >> 6) + var27) * 64;
                        for (class598 var31 = (class598) var28.method1945(false); var31 != null; var31 = (class598) var28.method1944(9408)) {
                            int var32 = var31.field8592 + var29 - field7447 - field7460;
                            int var33 = var31.field8589 + var30 - field7452 - field7445;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field7448;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field7448;
                            int var36 = field7461 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field7461 - (arg2 * var33 + arg4 >> 16);
                            method3153(arg0, var34, var36, var35 - var34, var37 - var36, var31.field8590, var31.field8587 & 0xFF, var31.field8591, var31.field8588, var31.field8586, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class336 var17 = field7450[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field7447 >> 6) + var15) * 64;
                        int var19 = ((field7452 >> 6) + var16) * 64;
                        for (class598 var20 = (class598) var17.method1945(false); var20 != null; var20 = (class598) var17.method1944(9408)) {
                            int var21 = var20.field8592 + var18 - field7447 - field7460;
                            int var22 = var20.field8589 + var19 - field7452 - field7445;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field7448;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field7448;
                            int var25 = field7461 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field7461 - (arg2 * var22 + arg4 >> 16);
                            method3172(arg0, var23, var25, var24 - var23, var26 - var25, var20.field8588, var20.field8586);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lfl;", line = 1208)
    public static final class520 method3167(int arg0) {
        return (class520) field7424.method1381(true, (long) arg0);
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "()V", line = 1213)
    private static final void method3168() {
        for (int var0 = 0; var0 < field7442; var0++) {
            for (int var11 = 0; var11 < field7449; var11++) {
                int var12 = field7457[field7442 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class525 var13 = (class525) field7455.method1381(true, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field7354.length; var14++) {
                                class30 var15 = field7429.method3188(var13.field7354[var14] & 0xFFFF, (byte) -57);
                                int var16 = var15.field380;
                                if (var15.field455 != null) {
                                    class30 var17 = var15.method219(-1, field7422);
                                    if (var17 != null) {
                                        var16 = var17.field380;
                                    }
                                }
                                if (var16 != -1) {
                                    class753 var18 = new class753(var16);
                                    var18.field10465 = var0;
                                    var18.field10456 = var11;
                                    field7437.method3116(29066, var18);
                                }
                            }
                        }
                    } else {
                        class30 var19 = field7429.method3188(var12 - 1, (byte) -57);
                        int var20 = var19.field380;
                        if (var19.field455 != null) {
                            class30 var21 = var19.method219(-1, field7422);
                            if (var21 != null) {
                                var20 = var21.field380;
                            }
                        }
                        if (var20 != -1) {
                            class753 var22 = new class753(var20);
                            var22.field10465 = var0;
                            var22.field10456 = var11;
                            field7437.method3116(29066, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field7450[0].length; var2++) {
                for (int var3 = 0; var3 < field7450[0][0].length; var3++) {
                    class336 var4 = field7450[var1][var2][var3];
                    if (var4 != null) {
                        for (class598 var5 = (class598) var4.method1945(false); var5 != null; var5 = (class598) var4.method1944(9408)) {
                            if (var5.field8588 != null) {
                                for (int var6 = 0; var6 < var5.field8588.length; var6++) {
                                    class30 var7 = field7429.method3188(var5.field8588[var6] & 0xFFFF, (byte) -57);
                                    int var8 = var7.field380;
                                    if (var7.field455 != null) {
                                        class30 var9 = var7.method219(-1, field7422);
                                        if (var9 != null) {
                                            var8 = var9.field380;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class753 var10 = new class753(var8);
                                        var10.field10465 = ((field7447 >> 6) + var2) * 64 + var5.field8592 - field7447;
                                        var10.field10456 = ((field7452 >> 6) + var3) * 64 + var5.field8589 - field7452;
                                        field7437.method3116(29066, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lwu;Leq;Lob;Lhk;Lkq;Llg;Laca;)V", line = 1369)
    public static final void method3169(class557 arg0, class140 arg1, class4 arg2, class534 arg3, class343 arg4, class139 arg5, class219 arg6) {
        field7425 = arg0;
        field7423 = arg1;
        field7427 = arg2;
        field7429 = arg3;
        field7421 = arg4;
        field7426 = arg5;
        field7422 = arg6;
        field7424.method1385((byte) -97);
        int var7 = field7425.method3311((byte) -24, "details");
        int[] var8 = field7425.method3319(var7, (byte) 118);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class520 var10 = class33.method236(false, var8[var9], field7425, var7);
                field7424.method1387(var10, (long) var10.field7274, (byte) -117);
            }
        }
        class594.method3523(true, (byte) 109, false);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Lha;)V", line = 1402)
    public static final void method3170(class545 arg0) {
        int var1 = field7441 - field7460;
        int var2 = field7443 - field7445;
        int var3 = (field7453 - field7448 << 16) / var1;
        int var4 = (field7461 - field7446 << 16) / var2;
        method3166(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Lha;IIII)Lfha;", line = 1415)
    private static final class522 method3171(class545 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class753 var5 = (class753) field7437.method3118((byte) 73); var5 != null; var5 = (class753) field7437.method3111(120)) {
            method3163(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field7437;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 1425)
    private static final void method3172(class545 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class30 var8 = field7429.method3188(arg5[var7] & 0xFFFF, (byte) -57);
            int var9 = var8.field404;
            if (var9 != -1) {
                class403 var10 = field7426.method900(-29491, var9);
                class21 var11 = var10.method2445(var8.field427 ? var8.field443 : false, arg0, var8.field452 ? arg6[var7] >> 6 & 0x3 : 0, 511638067);
                if (var11 != null) {
                    int var12 = arg3 * var11.method116() >> 2;
                    int var13 = arg4 * var11.method108() >> 2;
                    if (var10.field5586) {
                        int var14 = var8.field440;
                        int var15 = var8.field446;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field5589 == 0) {
                            var11.method100(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method110(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field5589 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "()V", line = 1483)
    public static final void method3173() {
        field7456 = new byte[field7449 * field7442];
        field7444 = new byte[field7449 * field7442];
        field7454 = new byte[field7449 * field7442];
        field7457 = new short[field7449 * field7442];
        field7451 = new byte[field7449 * field7442];
        field7455 = new class209(1024);
        field7450 = new class336[3][field7442 >> 6][field7449 >> 6];
        field7459 = new int[field7423.field1924 + 1];
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ld;III)I", line = 1496)
    private static final int method3174(class268 arg0, int arg1, int arg2, int arg3) {
        class552 var4 = field7423.method903((byte) -87, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field7814;
        if (var5 >= 0 && arg0.method91(var5, -22805).field6389) {
            var5 = -1;
        }
        int var9;
        if (var4.field7800 >= 0) {
            int var6 = var4.field7800;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class278.field3718[class704.method3958((byte) 126, class563.method3364(96, var8, (byte) -104)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class278.field3718[class704.method3958((byte) 126, class563.method3364(96, arg0.method91(var5, -22805).field6394, (byte) -75)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field7803 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field7803;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class278.field3718[class704.method3958((byte) 107, class563.method3364(96, var12, (byte) -114)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V", line = 1552)
    public static final void method3175(int arg0) {
        field7428 = (class520) field7424.method1381(true, (long) arg0);
    }
}
