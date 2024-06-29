import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class429 {

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Lwb;")
    private static class45 field6182 = new class45(16);

    @OriginalMember(owner = "client!au", name = "k", descriptor = "[B")
    private static byte[] field6189 = new byte[1];

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field6191 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field6190 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "[S")
    private static short[] field6196 = new short[1];

    @OriginalMember(owner = "client!au", name = "s", descriptor = "Lvf;")
    public static class166 field6197 = new class166();

    @OriginalMember(owner = "client!au", name = "n", descriptor = "F")
    public static float field6192;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "F")
    public static float field6195;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!au", name = "M", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Leh;")
    public static class130 field6181;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Lob;")
    public static class227 field6185;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Lbu;")
    public static class237 field6186;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "Lqp;")
    public static class302 field6187;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "Ltg;")
    public static class318 field6193;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Lhi;")
    public static class382 field6180;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Luo;")
    private static class418 field6179;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "Lwb;")
    private static class45 field6202;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "Lg;")
    public static class470 field6184;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Lkh;")
    private static class75 field6183;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "[B")
    private static byte[] field6204;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "[B")
    private static byte[] field6211;

    @OriginalMember(owner = "client!au", name = "J", descriptor = "[B")
    private static byte[] field6213;

    @OriginalMember(owner = "client!au", name = "K", descriptor = "[B")
    private static byte[] field6214;

    @OriginalMember(owner = "client!au", name = "O", descriptor = "[B")
    private static byte[] field6218;

    @OriginalMember(owner = "client!au", name = "L", descriptor = "[I")
    private static int[] field6215;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "[S")
    private static short[] field6198;

    @OriginalMember(owner = "client!au", name = "P", descriptor = "[S")
    private static short[] field6219;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "[[[B")
    public static byte[][][] field6194;

    @OriginalMember(owner = "client!au", name = "N", descriptor = "[[[Lre;")
    private static class388[][][] field6217;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Loj;)V", line = 5)
    public static final void method2553(class280 arg0) {
        int var1 = field6203 - field6207;
        int var2 = field6216 - field6209;
        int var3 = (field6199 - field6201 << 16) / var1;
        int var4 = (field6206 - field6208 << 16) / var2;
        method2558(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Loj;IIIIIII[S[BZ)V", line = 15)
    private static final void method2554(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1483(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field6215[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1483(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class173.method856(field6188, arg0, var11, arg1, arg5, arg2, field6215[arg6], arg4, (byte) 10, arg3, arg7 >> 6 & 0x3, field6194, var12);
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
                class415 var18 = field6180.method2297(50, arg8[var16] & 0xFFFF);
                if (var18.field5932 == -1) {
                    int var19 = -3355444;
                    if (var18.field5990 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1486(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1364(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1486(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1364(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1486(arg1, arg2, arg4, -1, 0);
                            arg0.method1364(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1486(var14, arg2, arg4, -1, 0);
                            arg0.method1364(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1486(var14, arg2, arg4, -1, 0);
                            arg0.method1364(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1486(arg1, arg2, arg4, -1, 0);
                            arg0.method1364(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1364(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1364(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1364(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1364(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1364(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1364(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "()V", line = 179)
    public static final void method2555() {
        field6213 = null;
        field6204 = null;
        field6198 = null;
        field6218 = null;
        field6211 = null;
        field6219 = null;
        field6214 = null;
        field6202 = null;
        field6217 = null;
        field6215 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Loj;IIII[S[B)V", line = 191)
    private static final void method2556(class280 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class415 var8 = field6180.method2297(50, arg5[var7] & 0xFFFF);
            int var9 = var8.field5932;
            if (var9 != -1) {
                class417 var10 = field6186.method1311((byte) 0, var9);
                class395 var11 = var10.method2483(var8.field5973 ? arg6[var7] >> 6 & 0x3 : 0, 177437555, arg0, var8.field5976 ? var8.field5958 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method216() >> 2;
                    int var13 = arg4 * var11.method222() >> 2;
                    if (var10.field6013) {
                        int var14 = var8.field5939;
                        int var15 = var8.field5927;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field6008 == 0) {
                            var11.method2364(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method225(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field6008 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Leg;III)I", line = 250)
    private static final int method2557(class394 arg0, int arg1, int arg2, int arg3) {
        class112 var4 = field6183.method383(arg1, (byte) -125);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1366;
        if (var5 >= 0 && arg0.method577(var5, -121).field2573) {
            var5 = -1;
        }
        int var9;
        if (var4.field1373 >= 0) {
            int var6 = var4.field1373;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class89.field1121[class52.method283(class82.method416(24832, var8, 96), 4) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class89.field1121[class52.method283(class82.method416(24832, arg0.method577(var5, -123).field2587, 96), 4) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1375 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1375;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class89.field1121[class52.method283(class82.method416(24832, var12, 96), 4) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Loj;IIII)V", line = 310)
    private static final void method2558(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field6203 - field6207;
        int var6 = field6216 - field6209;
        if (field6203 < field6212) {
            var5++;
        }
        if (field6216 < field6200) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field6201;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field6201;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field6207 + var7;
                if (var52 >= 0 && var52 < field6212) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field6206 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field6206 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field6209 + var53;
                            int var58 = field6212 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field6200) {
                                var59 = (field6204[var58] & 0xFF) << 16 | field6198[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field6218[var58] & 0xFF;
                                var61 = field6219[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field6185.field3160 != -1) {
                                    var62 = field6185.field3160 | 0xFF000000;
                                } else if ((field6216 + var53 & 0x4) == (field6207 + var7 & 0x4)) {
                                    var62 = field6215[field6183.field910 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1483(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2554(arg0, var49, var54, var51, var56, var59, var60, field6211[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class109 var63 = (class109) field6202.method233(79, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2554(arg0, var49, var54, var51, var56, var59, var60, field6211[var58], var63.field1309, var63.field1308, true);
                                }
                            } else {
                                field6196[0] = (short) (var61 - 1);
                                field6189[0] = field6214[var58];
                                method2554(arg0, var49, var54, var51, var56, var59, var60, field6211[var58], field6196, field6189, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field6206 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field6206 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field6185.field3160 != -1) {
                            var68 = field6185.field3160 | 0xFF000000;
                        } else if ((field6216 + var64 & 0x4) == (field6207 + var7 & 0x4)) {
                            var68 = field6215[field6183.field910 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1483(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field6201;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field6201;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field6207 + var8;
                if (var41 >= 0 && var41 < field6212) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field6206 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field6206 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field6209 + var42;
                            if (var46 >= 0 && var46 < field6200) {
                                int var47 = field6219[field6212 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2556(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class109 var48 = (class109) field6202.method233(-109, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2556(arg0, var38, var43, var40, var45, var48.field1309, var48.field1308);
                                    }
                                } else {
                                    field6196[0] = (short) (var47 - 1);
                                    field6189[0] = field6214[field6212 * var46 + var41];
                                    method2556(arg0, var38, var43, var40, var45, field6196, field6189);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field6207 >> 6;
        int var10 = field6209 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field6203 >> 6;
        int var12 = field6216 >> 6;
        if (var11 >= field6217[0].length) {
            var11 = field6217[0].length - 1;
        }
        if (var12 >= field6217[0][0].length) {
            var12 = field6217[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class388 var28 = field6217[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field6205 >> 6) + var14) * 64;
                        int var30 = ((field6210 >> 6) + var27) * 64;
                        for (class111 var31 = (class111) var28.method2334(-98); var31 != null; var31 = (class111) var28.method2340(67)) {
                            int var32 = var31.field1358 + var29 - field6205 - field6207;
                            int var33 = var31.field1357 + var30 - field6210 - field6209;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field6201;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field6201;
                            int var36 = field6206 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field6206 - (arg2 * var33 + arg4 >> 16);
                            method2554(arg0, var34, var36, var35 - var34, var37 - var36, var31.field1355, var31.field1356 & 0xFF, var31.field1361, var31.field1360, var31.field1359, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class388 var17 = field6217[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field6205 >> 6) + var15) * 64;
                        int var19 = ((field6210 >> 6) + var16) * 64;
                        for (class111 var20 = (class111) var17.method2334(-96); var20 != null; var20 = (class111) var17.method2340(62)) {
                            int var21 = var20.field1358 + var18 - field6205 - field6207;
                            int var22 = var20.field1357 + var19 - field6210 - field6209;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field6201;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field6201;
                            int var25 = field6206 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field6206 - (arg2 * var22 + arg4 >> 16);
                            method2556(arg0, var23, var25, var24 - var23, var26 - var25, var20.field1360, var20.field1359);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "()V", line = 652)
    public static final void method2559() {
        field6213 = new byte[field6212 * field6200];
        field6218 = new byte[field6212 * field6200];
        field6211 = new byte[field6212 * field6200];
        field6219 = new short[field6212 * field6200];
        field6214 = new byte[field6212 * field6200];
        field6202 = new class45(1024);
        field6217 = new class388[3][field6212 >> 6][field6200 >> 6];
        field6215 = new int[field6183.field905 + 1];
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "()V", line = 663)
    public static final void method2560() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field6193.field4630; var1++) {
            boolean var2 = field6185.method1251(27513, field6193.field4633[var1] & 0x3FFF, var0, field6193.field4633[var1] >> 14 & 0x3FFF, field6193.field4633[var1] >> 28 & 0x3);
            if (var2) {
                class21 var3 = new class21(field6193.field4627[var1]);
                var3.field296 = var0[1] - field6205;
                var3.field289 = var0[2] - field6210;
                field6197.method803(var3, 50);
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)Lob;", line = 686)
    public static final class227 method2561(int arg0) {
        return (class227) field6182.method233(57, (long) arg0);
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Loj;)Lvf;", line = 690)
    public static final class166 method2562(class280 arg0) {
        int var1 = field6203 - field6207;
        int var2 = field6216 - field6209;
        int var3 = (field6199 - field6201 << 16) / var1;
        int var4 = (field6206 - field6208 << 16) / var2;
        return method2566(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Loj;II)V", line = 702)
    public static final void method2563(class280 arg0, int arg1, int arg2) {
        class179 var3 = new class179(field6184.method2753(field6185.field3142, (byte) -122, "area"));
        int var4 = var3.method895((byte) -72);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method895((byte) -128);
        }
        int var7 = var3.method895((byte) -111);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method895((byte) -91);
        }
        while (true) {
            while (var3.field2206 < var3.field2159.length) {
                if (var3.method895((byte) -103) == 0) {
                    int var22 = var3.method895((byte) -112);
                    int var23 = var3.method895((byte) -80);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field6205;
                            int var27 = var23 * 64 + var25 - field6210;
                            method2573(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method895((byte) -109);
                    int var29 = var3.method895((byte) -110);
                    int var30 = var3.method895((byte) -109);
                    int var31 = var3.method895((byte) -117);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field6205;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field6210;
                            method2573(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field6204 = new byte[field6212 * field6200];
            field6198 = new short[field6212 * field6200];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field6212 * field6200];
                for (int var13 = 0; var13 < field6217[var11].length; var13++) {
                    for (int var19 = 0; var19 < field6217[var11][0].length; var19++) {
                        class388 var20 = field6217[var11][var13][var19];
                        if (var20 != null) {
                            for (class111 var21 = (class111) var20.method2334(-123); var21 != null; var21 = (class111) var20.method2340(89)) {
                                var12[(var19 * 64 + var21.field1357) * field6212 + var13 * 64 + var21.field1358] = (byte) var21.field1355;
                            }
                        }
                    }
                }
                method2568(var12, field6204, field6198, arg1, arg2);
                for (int var14 = 0; var14 < field6217[var11].length; var14++) {
                    for (int var15 = 0; var15 < field6217[var11][0].length; var15++) {
                        class388 var16 = field6217[var11][var14][var15];
                        if (var16 != null) {
                            for (class111 var17 = (class111) var16.method2334(-95); var17 != null; var17 = (class111) var16.method2340(-81)) {
                                int var18 = (var15 * 64 + var17.field1357) * field6212 + var14 * 64 + var17.field1358;
                                var17.field1355 = (field6204[var18] & 0xFF) << 16 | field6198[var18] & 0xFFFF;
                                if (var17.field1355 != 0) {
                                    var17.field1355 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2568(field6213, field6204, field6198, arg1, arg2);
            field6213 = null;
            method2572();
            return;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIII)V", line = 882)
    public static final void method2564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6207 = arg0 - field6205;
        field6216 = arg1 - field6210;
        field6203 = arg2 - field6205;
        field6209 = arg3 - field6210;
        field6201 = arg4;
        field6208 = arg5;
        field6199 = arg6;
        field6206 = arg7;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 892)
    public static final void method2565(int arg0) {
        field6185 = (class227) field6182.method233(-83, (long) arg0);
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Loj;IIII)Lvf;", line = 897)
    private static final class166 method2566(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class21 var5 = (class21) field6197.method802((byte) 125); var5 != null; var5 = (class21) field6197.method806((byte) 104)) {
            method2571(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field6197;
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "()V", line = 907)
    public static void method2567() {
        field6183 = null;
        field6179 = null;
        field6180 = null;
        field6187 = null;
        field6186 = null;
        field6181 = null;
        field6185 = null;
        field6184 = null;
        field6182 = null;
        field6194 = null;
        field6196 = null;
        field6189 = null;
        field6193 = null;
        field6197 = null;
        field6215 = null;
        field6213 = null;
        field6204 = null;
        field6198 = null;
        field6218 = null;
        field6211 = null;
        field6219 = null;
        field6214 = null;
        field6202 = null;
        field6217 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([B[B[SII)V", line = 934)
    private static final void method2568(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field6200];
        int[] var6 = new int[field6200];
        int[] var7 = new int[field6200];
        int[] var8 = new int[field6200];
        int[] var9 = new int[field6200];
        for (int var10 = -5; var10 < field6212; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field6200; var13++) {
                int var10002;
                if (var11 < field6212) {
                    int var28 = arg0[field6212 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class225 var29 = field6179.method2488(var28 - 1, 128);
                        var5[var13] += var29.field3128;
                        var6[var13] += var29.field3126;
                        var7[var13] += var29.field3122;
                        var8[var13] += var29.field3127;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field6212 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class225 var31 = field6179.method2488(var30 - 1, 128);
                        var5[var13] -= var31.field3128;
                        var6[var13] -= var31.field3126;
                        var7[var13] -= var31.field3122;
                        var8[var13] -= var31.field3127;
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
                for (int var19 = -5; var19 < field6200; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field6200) {
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
                        if ((arg0[field6212 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field6212 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class178.method874(var16 / var18, var14 * 256 / var17, false, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field6212 * var19 + var10;
                            int var27 = class89.field1121[class52.method283(class158.method764(-102789817, var25, 96), 4) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Leg;II)V", line = 1082)
    public static final void method2569(class394 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field6183.field905; var3++) {
            field6215[var3 + 1] = method2557(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lob;", line = 1094)
    public static final class227 method2570(int arg0, int arg1) {
        for (class227 var2 = (class227) field6182.method241(0); var2 != null; var2 = (class227) field6182.method239(0)) {
            if (var2.field3145 && var2.method1252(arg0, (byte) -70, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Loj;Lfg;IIII)V", line = 1106)
    private static final void method2571(class280 arg0, class21 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field298 = ((arg1.field296 - field6207) * arg2 + arg4 >> 16) + field6201;
        arg1.field294 = field6206 - ((arg1.field289 - field6209) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "()V", line = 1112)
    private static final void method2572() {
        for (int var0 = 0; var0 < field6212; var0++) {
            for (int var11 = 0; var11 < field6200; var11++) {
                int var12 = field6219[field6212 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class109 var13 = (class109) field6202.method233(-111, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field1309.length; var14++) {
                                class415 var15 = field6180.method2297(50, var13.field1309[var14] & 0xFFFF);
                                int var16 = var15.field5946;
                                if (var15.field5951 != null) {
                                    class415 var17 = var15.method2473(-18648, field6181);
                                    if (var17 != null) {
                                        var16 = var17.field5946;
                                    }
                                }
                                if (var16 != -1) {
                                    class21 var18 = new class21(var16);
                                    var18.field296 = var0;
                                    var18.field289 = var11;
                                    field6197.method803(var18, 50);
                                }
                            }
                        }
                    } else {
                        class415 var19 = field6180.method2297(50, var12 - 1);
                        int var20 = var19.field5946;
                        if (var19.field5951 != null) {
                            class415 var21 = var19.method2473(-18648, field6181);
                            if (var21 != null) {
                                var20 = var21.field5946;
                            }
                        }
                        if (var20 != -1) {
                            class21 var22 = new class21(var20);
                            var22.field296 = var0;
                            var22.field289 = var11;
                            field6197.method803(var22, 50);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field6217[0].length; var2++) {
                for (int var3 = 0; var3 < field6217[0][0].length; var3++) {
                    class388 var4 = field6217[var1][var2][var3];
                    if (var4 != null) {
                        for (class111 var5 = (class111) var4.method2334(-112); var5 != null; var5 = (class111) var4.method2340(70)) {
                            if (var5.field1360 != null) {
                                for (int var6 = 0; var6 < var5.field1360.length; var6++) {
                                    class415 var7 = field6180.method2297(50, var5.field1360[var6] & 0xFFFF);
                                    int var8 = var7.field5946;
                                    if (var7.field5951 != null) {
                                        class415 var9 = var7.method2473(-18648, field6181);
                                        if (var9 != null) {
                                            var8 = var9.field5946;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class21 var10 = new class21(var8);
                                        var10.field296 = ((field6205 >> 6) + var2) * 64 + var5.field1358 - field6205;
                                        var10.field289 = ((field6210 >> 6) + var3) * 64 + var5.field1357 - field6210;
                                        field6197.method803(var10, 50);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Loj;Lvt;IIII[I[I)V", line = 1269)
    private static final void method2573(class280 arg0, class179 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method895((byte) -78);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method895((byte) -107);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field6213[field6212 * arg5 + arg4] = (byte) var11;
                    field6218[field6212 * arg5 + arg4] = 0;
                } else {
                    field6218[field6212 * arg5 + arg4] = (byte) var11;
                    field6211[field6212 * arg5 + arg4] = 0;
                    field6213[field6212 * arg5 + arg4] = arg1.method922(32429);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method895((byte) -101);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method895((byte) -72);
                var18 = arg1.method895((byte) -77);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method895((byte) -104);
            }
            if (var15 == 0) {
                field6213[field6212 * arg5 + arg4] = (byte) var16;
                field6218[field6212 * arg5 + arg4] = (byte) var17;
                field6211[field6212 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field6219[field6212 * arg5 + arg4] = (short) (arg1.method916(21933) + 1);
                    field6214[field6212 * arg5 + arg4] = arg1.method922(32429);
                } else if (var19 > 1) {
                    field6219[field6212 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method916(21933);
                        var21[var22] = arg1.method922(32429);
                    }
                    field6202.method234(-106, (long) (arg4 << 16 | arg5), new class109(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method916(21933);
                        var24[var25] = arg1.method922(32429);
                    }
                }
                if (field6217[var15 - 1][arg2 - (field6205 >> 6)][arg3 - (field6210 >> 6)] == null) {
                    field6217[var15 - 1][arg2 - (field6205 >> 6)][arg3 - (field6210 >> 6)] = new class388();
                }
                class111 var26 = new class111(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field6217[var15 - 1][arg2 - (field6205 >> 6)][arg3 - (field6210 >> 6)].method2336(var26, (byte) -56);
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(II)Lpf;", line = 1404)
    public static final class485 method2574(int arg0, int arg1) {
        class485 var2 = new class485();
        for (class227 var3 = (class227) field6182.method241(0); var3 != null; var3 = (class227) field6182.method239(0)) {
            if (var3.field3145 && var3.method1252(arg0, (byte) -47, arg1)) {
                var2.method2866(var3, 674847596);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lg;Lkh;Luo;Lhi;Lqp;Lbu;Leh;)V", line = 1424)
    public static final void method2575(class470 arg0, class75 arg1, class418 arg2, class382 arg3, class302 arg4, class237 arg5, class130 arg6) {
        field6184 = arg0;
        field6183 = arg1;
        field6179 = arg2;
        field6180 = arg3;
        field6187 = arg4;
        field6186 = arg5;
        field6181 = arg6;
        field6182.method236(3);
        int var7 = field6184.method2761(0, "details");
        int[] var8 = field6184.method2765(var7, 0);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class227 var10 = class181.method982(var8[var9], (byte) -101, field6184, var7);
            field6182.method234(-85, (long) var10.field3155, var10);
        }
        class192.method1047(true, false, (byte) 125);
    }
}
