import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class678 {

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "Lkk;")
    private static class188 field9267 = new class188(16);

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "[S")
    private static short[] field9276 = new short[1];

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    public static int field9279 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "I")
    public static int field9283 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "[B")
    private static byte[] field9280 = new byte[1];

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "Lbg;")
    public static class464 field9278 = new class464();

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "F")
    public static float field9281;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "F")
    public static float field9282;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!nfa", name = "w", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!nfa", name = "x", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!nfa", name = "A", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!nfa", name = "B", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!nfa", name = "I", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!nfa", name = "J", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!nfa", name = "M", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!nfa", name = "O", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "Lri;")
    private static class111 field9270;

    @OriginalMember(owner = "client!nfa", name = "K", descriptor = "Lkk;")
    private static class188 field9302;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "Laia;")
    public static class226 field9272;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "Lfp;")
    public static class323 field9269;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lvu;")
    private static class337 field9266;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "Lvd;")
    public static class38 field9284;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lvg;")
    public static class52 field9271;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lpt;")
    public static class530 field9273;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "Lte;")
    public static class613 field9274;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "Lqh;")
    public static class67 field9268;

    @OriginalMember(owner = "client!nfa", name = "y", descriptor = "[B")
    private static byte[] field9290;

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "[B")
    private static byte[] field9295;

    @OriginalMember(owner = "client!nfa", name = "E", descriptor = "[B")
    private static byte[] field9296;

    @OriginalMember(owner = "client!nfa", name = "L", descriptor = "[B")
    private static byte[] field9303;

    @OriginalMember(owner = "client!nfa", name = "N", descriptor = "[B")
    private static byte[] field9305;

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "[I")
    private static int[] field9291;

    @OriginalMember(owner = "client!nfa", name = "F", descriptor = "[S")
    private static short[] field9297;

    @OriginalMember(owner = "client!nfa", name = "H", descriptor = "[S")
    private static short[] field9299;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "[[[B")
    public static byte[][][] field9277;

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "[[[Leh;")
    private static class360[][][] field9287;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;)V", line = 6)
    public static final void method3778(class58 arg0) {
        int var1 = field9286 - field9292;
        int var2 = field9288 - field9293;
        int var3 = (field9298 - field9306 << 16) / var1;
        int var4 = (field9301 - field9289 << 16) / var2;
        method3782(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ld;III)I", line = 17)
    private static final int method3779(class149 arg0, int arg1, int arg2, int arg3) {
        class192 var4 = field9270.method792(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field2563;
        if (var5 >= 0 && arg0.method532((byte) 127, var5).field7194) {
            var5 = -1;
        }
        int var9;
        if (var4.field2558 >= 0) {
            int var6 = var4.field2558;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class2.field23[class199.method1219(0, class378.method2372(2241, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class2.field23[class199.method1219(0, class378.method2372(2241, 96, arg0.method532((byte) 127, var5).field7191)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field2562 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field2562;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class2.field23[class199.method1219(0, class378.method2372(2241, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ld;II)V", line = 78)
    public static final void method3780(class149 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field9270.field1367; var3++) {
            field9291[var3 + 1] = method3779(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)Lvg;", line = 90)
    public static final class52 method3781(int arg0, int arg1) {
        for (class52 var2 = (class52) field9267.method1176(24490); var2 != null; var2 = (class52) field9267.method1178((byte) 71)) {
            if (var2.field584 && var2.method322(arg0, 12800, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;IIII)V", line = 103)
    private static final void method3782(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field9286 - field9292;
        int var6 = field9288 - field9293;
        if (field9286 < field9285) {
            var5++;
        }
        if (field9288 < field9300) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field9306;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field9306;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field9292 + var7;
                if (var52 >= 0 && var52 < field9285) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field9301 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field9301 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field9293 + var53;
                            int var58 = field9285 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field9300) {
                                var59 = (field9296[var58] & 0xFF) << 16 | field9297[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field9295[var58] & 0xFF;
                                var61 = field9299[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field9271.field583 != -1) {
                                    var62 = field9271.field583 | 0xFF000000;
                                } else if ((field9292 + var7 & 0x4) == (field9288 + var53 & 0x4)) {
                                    var62 = field9291[field9270.field1369 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method431(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3801(arg0, var49, var54, var51, var56, var59, var60, field9305[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class616 var63 = (class616) field9302.method1180((byte) 26, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method3801(arg0, var49, var54, var51, var56, var59, var60, field9305[var58], var63.field8619, var63.field8620, true);
                                }
                            } else {
                                field9276[0] = (short) (var61 - 1);
                                field9280[0] = field9290[var58];
                                method3801(arg0, var49, var54, var51, var56, var59, var60, field9305[var58], field9276, field9280, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field9301 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field9301 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field9271.field583 != -1) {
                            var68 = field9271.field583 | 0xFF000000;
                        } else if ((field9292 + var7 & 0x4) == (field9288 + var64 & 0x4)) {
                            var68 = field9291[field9270.field1369 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method431(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field9306;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field9306;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field9292 + var8;
                if (var41 >= 0 && var41 < field9285) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field9301 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field9301 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field9293 + var42;
                            if (var46 >= 0 && var46 < field9300) {
                                int var47 = field9299[field9285 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3800(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class616 var48 = (class616) field9302.method1180((byte) 26, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method3800(arg0, var38, var43, var40, var45, var48.field8619, var48.field8620);
                                    }
                                } else {
                                    field9276[0] = (short) (var47 - 1);
                                    field9280[0] = field9290[field9285 * var46 + var41];
                                    method3800(arg0, var38, var43, var40, var45, field9276, field9280);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field9292 >> 6;
        int var10 = field9293 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field9286 >> 6;
        int var12 = field9288 >> 6;
        if (var11 >= field9287[0].length) {
            var11 = field9287[0].length - 1;
        }
        if (var12 >= field9287[0][0].length) {
            var12 = field9287[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class360 var28 = field9287[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field9294 >> 6) + var14) * 64;
                        int var30 = ((field9304 >> 6) + var27) * 64;
                        for (class447 var31 = (class447) var28.method2301(-31182); var31 != null; var31 = (class447) var28.method2310(29)) {
                            int var32 = var31.field6332 + var29 - field9294 - field9292;
                            int var33 = var31.field6328 + var30 - field9304 - field9293;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field9306;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field9306;
                            int var36 = field9301 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field9301 - (arg2 * var33 + arg4 >> 16);
                            method3801(arg0, var34, var36, var35 - var34, var37 - var36, var31.field6331, var31.field6329 & 0xFF, var31.field6326, var31.field6330, var31.field6327, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class360 var17 = field9287[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field9294 >> 6) + var15) * 64;
                        int var19 = ((field9304 >> 6) + var16) * 64;
                        for (class447 var20 = (class447) var17.method2301(-31182); var20 != null; var20 = (class447) var17.method2310(110)) {
                            int var21 = var20.field6332 + var18 - field9294 - field9292;
                            int var22 = var20.field6328 + var19 - field9304 - field9293;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field9306;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field9306;
                            int var25 = field9301 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field9301 - (arg2 * var22 + arg4 >> 16);
                            method3800(arg0, var23, var25, var24 - var23, var26 - var25, var20.field6330, var20.field6327);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "()V", line = 446)
    public static final void method3783() {
        field9303 = null;
        field9296 = null;
        field9297 = null;
        field9295 = null;
        field9305 = null;
        field9299 = null;
        field9290 = null;
        field9302 = null;
        field9287 = null;
        field9291 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lfp;Lri;Lvu;Lqh;Lpt;Laia;Lte;)V", line = 463)
    public static final void method3784(class323 arg0, class111 arg1, class337 arg2, class67 arg3, class530 arg4, class226 arg5, class613 arg6) {
        field9269 = arg0;
        field9270 = arg1;
        field9266 = arg2;
        field9268 = arg3;
        field9273 = arg4;
        field9272 = arg5;
        field9274 = arg6;
        field9267.method1175((byte) 122);
        int var7 = field9269.method2090(124, "details");
        int[] var8 = field9269.method2077(var7, 0);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class52 var10 = class98.method715(false, var8[var9], field9269, var7);
                field9267.method1179((long) var10.field599, var10, (byte) -26);
            }
        }
        class621.method3486(-102, true, false);
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Lha;)Lbg;", line = 495)
    public static final class464 method3785(class58 arg0) {
        int var1 = field9286 - field9292;
        int var2 = field9288 - field9293;
        int var3 = (field9298 - field9306 << 16) / var1;
        int var4 = (field9301 - field9289 << 16) / var2;
        return method3788(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIII)V", line = 505)
    public static final void method3786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9292 = arg0 - field9294;
        field9288 = arg1 - field9304;
        field9286 = arg2 - field9294;
        field9293 = arg3 - field9304;
        field9306 = arg4;
        field9289 = arg5;
        field9298 = arg6;
        field9301 = arg7;
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "()V", line = 516)
    public static final void method3787() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field9284.field483; var1++) {
            boolean var2 = field9271.method321(field9284.field477[var1] >> 28 & 0x3, field9284.field477[var1] & 0x3FFF, (byte) 21, field9284.field477[var1] >> 14 & 0x3FFF, var0);
            if (var2) {
                class507 var3 = new class507(field9284.field478[var1]);
                var3.field7263 = var0[1] - field9294;
                var3.field7262 = var0[2] - field9304;
                field9278.method2770((byte) -13, var3);
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Lha;IIII)Lbg;", line = 539)
    private static final class464 method3788(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class507 var5 = (class507) field9278.method2765(-12261); var5 != null; var5 = (class507) field9278.method2759(-15361)) {
            method3791(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field9278;
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "()V", line = 549)
    public static final void method3789() {
        field9303 = new byte[field9300 * field9285];
        field9295 = new byte[field9300 * field9285];
        field9305 = new byte[field9300 * field9285];
        field9299 = new short[field9300 * field9285];
        field9290 = new byte[field9300 * field9285];
        field9302 = new class188(1024);
        field9287 = new class360[3][field9285 >> 6][field9300 >> 6];
        field9291 = new int[field9270.field1367 + 1];
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(II)Llga;", line = 560)
    public static final class711 method3790(int arg0, int arg1) {
        class711 var2 = new class711();
        for (class52 var3 = (class52) field9267.method1176(24490); var3 != null; var3 = (class52) field9267.method1178((byte) 71)) {
            if (var3.field584 && var3.method322(arg0, 12800, arg1)) {
                var2.method3999(var3, 21934);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;Lek;IIII)V", line = 575)
    private static final void method3791(class58 arg0, class507 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field7258 = ((arg1.field7263 - field9292) * arg2 + arg4 >> 16) + field9306;
        arg1.field7260 = field9301 - ((arg1.field7262 - field9293) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "([B[B[SII)V", line = 580)
    private static final void method3792(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field9300];
        int[] var6 = new int[field9300];
        int[] var7 = new int[field9300];
        int[] var8 = new int[field9300];
        int[] var9 = new int[field9300];
        for (int var10 = -5; var10 < field9285; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field9300; var13++) {
                int var10002;
                if (var11 < field9285) {
                    int var28 = arg0[field9285 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class293 var29 = field9266.method2186(var28 - 1, true);
                        var5[var13] += var29.field4119;
                        var6[var13] += var29.field4120;
                        var7[var13] += var29.field4125;
                        var8[var13] += var29.field4124;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field9285 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class293 var31 = field9266.method2186(var30 - 1, true);
                        var5[var13] -= var31.field4119;
                        var6[var13] -= var31.field4120;
                        var7[var13] -= var31.field4125;
                        var8[var13] -= var31.field4124;
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
                for (int var19 = -5; var19 < field9300; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field9300) {
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
                        if ((arg0[field9285 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field9285 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class478.method2858(var15 / var18, -1260895222, var16 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field9285 * var19 + var10;
                            int var27 = class2.field23[class199.method1219(0, class394.method2479(var25, 96, 3)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "()V", line = 725)
    private static final void method3793() {
        for (int var0 = 0; var0 < field9285; var0++) {
            for (int var11 = 0; var11 < field9300; var11++) {
                int var12 = field9299[field9285 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class616 var13 = (class616) field9302.method1180((byte) 26, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field8619.length; var14++) {
                                class10 var15 = field9268.method558((byte) -9, var13.field8619[var14] & 0xFFFF);
                                int var16 = var15.field180;
                                if (var15.field226 != null) {
                                    class10 var17 = var15.method67(field9274, 0);
                                    if (var17 != null) {
                                        var16 = var17.field180;
                                    }
                                }
                                if (var16 != -1) {
                                    class507 var18 = new class507(var16);
                                    var18.field7263 = var0;
                                    var18.field7262 = var11;
                                    field9278.method2770((byte) -13, var18);
                                }
                            }
                        }
                    } else {
                        class10 var19 = field9268.method558((byte) 127, var12 - 1);
                        int var20 = var19.field180;
                        if (var19.field226 != null) {
                            class10 var21 = var19.method67(field9274, 0);
                            if (var21 != null) {
                                var20 = var21.field180;
                            }
                        }
                        if (var20 != -1) {
                            class507 var22 = new class507(var20);
                            var22.field7263 = var0;
                            var22.field7262 = var11;
                            field9278.method2770((byte) -13, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field9287[0].length; var2++) {
                for (int var3 = 0; var3 < field9287[0][0].length; var3++) {
                    class360 var4 = field9287[var1][var2][var3];
                    if (var4 != null) {
                        for (class447 var5 = (class447) var4.method2301(-31182); var5 != null; var5 = (class447) var4.method2310(23)) {
                            if (var5.field6330 != null) {
                                for (int var6 = 0; var6 < var5.field6330.length; var6++) {
                                    class10 var7 = field9268.method558((byte) 125, var5.field6330[var6] & 0xFFFF);
                                    int var8 = var7.field180;
                                    if (var7.field226 != null) {
                                        class10 var9 = var7.method67(field9274, 0);
                                        if (var9 != null) {
                                            var8 = var9.field180;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class507 var10 = new class507(var8);
                                        var10.field7263 = ((field9294 >> 6) + var2) * 64 + var5.field6332 - field9294;
                                        var10.field7262 = ((field9304 >> 6) + var3) * 64 + var5.field6328 - field9304;
                                        field9278.method2770((byte) -13, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)Lvg;", line = 881)
    public static final class52 method3794(int arg0) {
        return (class52) field9267.method1180((byte) 26, (long) arg0);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;Lek;Lafa;)V", line = 884)
    public static final void method3795(class58 arg0, class507 arg1, class344 arg2) {
        if (arg2.field4842 == null) {
            return;
        }
        int[] var3 = new int[arg2.field4842.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field4842[var4 * 2] + arg1.field7263;
            int var22 = arg2.field4842[var4 * 2 + 1] + arg1.field7262;
            var3[var4 * 2] = (field9298 - field9306) * (var21 - field9292) / (field9286 - field9292) + field9306;
            var3[var4 * 2 + 1] = field9301 - (field9301 - field9289) * (var22 - field9293) / (field9288 - field9293);
        }
        class22.method140(arg0, var3, arg2.field4831);
        if (arg2.field4815 > 0) {
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
                arg0.method464(var13, var14, var15, var16, arg2.field4820[arg2.field4798[var5] & 0xFF], 1, arg2.field4815, arg2.field4822, arg2.field4837);
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
            arg0.method464(var6, var7, var8, var9, arg2.field4820[arg2.field4798[arg2.field4798.length - 1] & 0xFF], 1, arg2.field4815, arg2.field4822, arg2.field4837);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method410(72, var3[var20 * 2 + 1], var3[(var20 + 1) * 2 + 1], var3[(var20 + 1) * 2], arg2.field4820[arg2.field4798[var20] & 0xFF], var3[var20 * 2]);
        }
        arg0.method410(76, var3[var3.length - 1], var3[1], var3[0], arg2.field4820[arg2.field4798[arg2.field4798.length - 1] & 0xFF], var3[var3.length - 2]);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;Lee;IIII[I[I)V", line = 993)
    private static final void method3796(class58 arg0, class675 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3750((byte) 35);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3750((byte) 35);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field9303[field9285 * arg5 + arg4] = (byte) var11;
                    field9295[field9285 * arg5 + arg4] = 0;
                } else {
                    field9295[field9285 * arg5 + arg4] = (byte) var11;
                    field9305[field9285 * arg5 + arg4] = 0;
                    field9303[field9285 * arg5 + arg4] = arg1.method3719(1854307120);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3750((byte) 35);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3750((byte) 35);
                var18 = arg1.method3750((byte) 35);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3750((byte) 35);
            }
            if (var15 == 0) {
                field9303[field9285 * arg5 + arg4] = (byte) var16;
                field9295[field9285 * arg5 + arg4] = (byte) var17;
                field9305[field9285 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field9299[field9285 * arg5 + arg4] = (short) (arg1.method3757((byte) -65) + 1);
                    field9290[field9285 * arg5 + arg4] = arg1.method3719(1854307120);
                } else if (var19 > 1) {
                    field9299[field9285 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3757((byte) -65);
                        var21[var22] = arg1.method3719(1854307120);
                    }
                    field9302.method1179((long) (arg4 << 16 | arg5), new class616(var20, var21), (byte) -26);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3757((byte) -65);
                        var24[var25] = arg1.method3719(1854307120);
                    }
                }
                if (field9287[var15 - 1][arg2 - (field9294 >> 6)][arg3 - (field9304 >> 6)] == null) {
                    field9287[var15 - 1][arg2 - (field9294 >> 6)][arg3 - (field9304 >> 6)] = new class360();
                }
                class447 var26 = new class447(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field9287[var15 - 1][arg2 - (field9294 >> 6)][arg3 - (field9304 >> 6)].method2307(0, var26);
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;II)V", line = 1128)
    public static final void method3797(class58 arg0, int arg1, int arg2) {
        class675 var3 = new class675(field9269.method2102(field9271.field581, "area", 0));
        int var4 = var3.method3750((byte) 35);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3750((byte) 35);
        }
        int var7 = var3.method3750((byte) 35);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3750((byte) 35);
        }
        while (true) {
            while (var3.field9146 < var3.field9154.length) {
                if (var3.method3750((byte) 35) == 0) {
                    int var22 = var3.method3750((byte) 35);
                    int var23 = var3.method3750((byte) 35);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field9294;
                            int var27 = var23 * 64 + var25 - field9304;
                            method3796(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3750((byte) 35);
                    int var29 = var3.method3750((byte) 35);
                    int var30 = var3.method3750((byte) 35);
                    int var31 = var3.method3750((byte) 35);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field9294;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field9304;
                            method3796(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field9296 = new byte[field9300 * field9285];
            field9297 = new short[field9300 * field9285];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field9300 * field9285];
                for (int var13 = 0; var13 < field9287[var11].length; var13++) {
                    for (int var19 = 0; var19 < field9287[var11][0].length; var19++) {
                        class360 var20 = field9287[var11][var13][var19];
                        if (var20 != null) {
                            for (class447 var21 = (class447) var20.method2301(-31182); var21 != null; var21 = (class447) var20.method2310(69)) {
                                var12[(var19 * 64 + var21.field6328) * field9285 + var13 * 64 + var21.field6332] = (byte) var21.field6331;
                            }
                        }
                    }
                }
                method3792(var12, field9296, field9297, arg1, arg2);
                for (int var14 = 0; var14 < field9287[var11].length; var14++) {
                    for (int var15 = 0; var15 < field9287[var11][0].length; var15++) {
                        class360 var16 = field9287[var11][var14][var15];
                        if (var16 != null) {
                            for (class447 var17 = (class447) var16.method2301(-31182); var17 != null; var17 = (class447) var16.method2310(24)) {
                                int var18 = (var15 * 64 + var17.field6328) * field9285 + var14 * 64 + var17.field6332;
                                var17.field6331 = (field9296[var18] & 0xFF) << 16 | field9297[var18] & 0xFFFF;
                                if (var17.field6331 != 0) {
                                    var17.field6331 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3792(field9303, field9296, field9297, arg1, arg2);
            field9303 = null;
            method3793();
            return;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)V", line = 1306)
    public static final void method3798(int arg0) {
        field9271 = (class52) field9267.method1180((byte) 26, (long) arg0);
    }

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "()V", line = 1309)
    public static void method3799() {
        field9270 = null;
        field9266 = null;
        field9268 = null;
        field9273 = null;
        field9272 = null;
        field9274 = null;
        field9271 = null;
        field9269 = null;
        field9267 = null;
        field9277 = null;
        field9276 = null;
        field9280 = null;
        field9284 = null;
        field9278 = null;
        field9291 = null;
        field9303 = null;
        field9296 = null;
        field9297 = null;
        field9295 = null;
        field9305 = null;
        field9299 = null;
        field9290 = null;
        field9302 = null;
        field9287 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 1335)
    private static final void method3800(class58 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class10 var8 = field9268.method558((byte) -108, arg5[var7] & 0xFFFF);
            int var9 = var8.field143;
            if (var9 != -1) {
                class212 var10 = field9272.method1412(9, var9);
                class88 var11 = var10.method1306(var8.field171 ? var8.field187 : false, var8.field170 ? arg6[var7] >> 6 & 0x3 : 0, arg0, false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method656() >> 2;
                    int var13 = arg4 * var11.method670() >> 2;
                    if (var10.field2792) {
                        int var14 = var8.field225;
                        int var15 = var8.field230;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field2797 == 0) {
                            var11.method668(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method654(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field2797 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 1408)
    private static final void method3801(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method431(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field9291[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method431(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class562.method3235(arg1, arg4, field9277, var11, field9275, arg0, field9291[arg6], var12, arg3, arg5, true, arg2, arg7 >> 6 & 0x3);
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
                class10 var18 = field9268.method558((byte) -51, arg8[var16] & 0xFFFF);
                if (var18.field143 == -1) {
                    int var19 = -3355444;
                    if (var18.field207 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method430(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method433(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method430(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method433(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method430(arg1, arg2, arg4, -1, 0);
                            arg0.method433(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method430(var14, arg2, arg4, -1, 0);
                            arg0.method433(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method430(var14, arg2, arg4, -1, 0);
                            arg0.method433(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method430(arg1, arg2, arg4, -1, 0);
                            arg0.method433(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method433(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method433(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method433(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method433(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method433(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method433(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }
}
