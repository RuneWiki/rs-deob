import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class375 {

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lee;")
    private static class706 field5417 = new class706(16);

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field5424 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "[B")
    private static byte[] field5428 = new byte[1];

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field5421 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "[S")
    private static short[] field5425 = new short[1];

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Ltm;")
    public static class412 field5423 = new class412();

    @OriginalMember(owner = "client!km", name = "l", descriptor = "F")
    public static float field5422;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "F")
    public static float field5429;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lcka;")
    private static class186 field5413;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Laj;")
    public static class333 field5411;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Lb;")
    public static class354 field5418;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lrq;")
    private static class372 field5415;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lwr;")
    public static class485 field5414;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Lhca;")
    public static class517 field5427;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lwba;")
    public static class54 field5416;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Lii;")
    public static class580 field5419;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Lph;")
    public static class671 field5412;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "Lee;")
    private static class706 field5437;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "[B")
    private static byte[] field5431;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "[B")
    private static byte[] field5439;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "[B")
    private static byte[] field5445;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "[B")
    private static byte[] field5446;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "[B")
    private static byte[] field5449;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "[I")
    private static int[] field5443;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "[S")
    private static short[] field5438;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "[S")
    private static short[] field5451;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "[[[B")
    public static byte[][][] field5420;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "[[[Lvl;")
    private static class15[][][] field5444;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ld;III)I", line = 6)
    private static final int method2325(class161 arg0, int arg1, int arg2, int arg3) {
        class669 var4 = field5413.method1296(arg1, (byte) 83);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field9405;
        if (var5 >= 0 && arg0.method1174(var5, true).field9142) {
            var5 = -1;
        }
        int var9;
        if (var4.field9417 >= 0) {
            int var6 = var4.field9417;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class182.field2413[class630.method3539(class481.method2802(var8, -117, 96), 2011997347) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class182.field2413[class630.method3539(class481.method2802(arg0.method1174(var5, true).field9137, -112, 96), 2011997347) & 0xFFFF] | 0xFF000000;
        } else if (var4.field9415 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field9415;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class182.field2413[class630.method3539(class481.method2802(var12, -116, 96), 2011997347) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lwr;", line = 65)
    public static final class485 method2326(int arg0, int arg1) {
        for (class485 var2 = (class485) field5417.method3960(0); var2 != null; var2 = (class485) field5417.method3955((byte) 107)) {
            if (var2.field6704 && var2.method2821(arg0, -30, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;)V", line = 83)
    public static final void method2327(class65 arg0) {
        int var1 = field5440 - field5432;
        int var2 = field5433 - field5441;
        int var3 = (field5442 - field5435 << 16) / var1;
        int var4 = (field5450 - field5430 << 16) / var2;
        method2328(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;IIII)V", line = 94)
    private static final void method2328(class65 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5440 - field5432;
        int var6 = field5433 - field5441;
        if (field5440 < field5448) {
            var5++;
        }
        if (field5433 < field5436) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5435;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5435;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5432 + var7;
                if (var52 >= 0 && var52 < field5448) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5450 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5450 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5441 + var53;
                            int var58 = field5448 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5436) {
                                var59 = (field5431[var58] & 0xFF) << 16 | field5438[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5445[var58] & 0xFF;
                                var61 = field5451[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5414.field6702 != -1) {
                                    var62 = field5414.field6702 | 0xFF000000;
                                } else if ((field5433 + var53 & 0x4) == (field5432 + var7 & 0x4)) {
                                    var62 = field5443[field5413.field2492 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method563(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2348(arg0, var49, var54, var51, var56, var59, var60, field5449[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class323 var63 = (class323) field5437.method3953((long) (var52 << 16 | var57), 14);
                                if (var63 != null) {
                                    method2348(arg0, var49, var54, var51, var56, var59, var60, field5449[var58], var63.field4713, var63.field4712, true);
                                }
                            } else {
                                field5425[0] = (short) (var61 - 1);
                                field5428[0] = field5439[var58];
                                method2348(arg0, var49, var54, var51, var56, var59, var60, field5449[var58], field5425, field5428, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5450 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5450 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5414.field6702 != -1) {
                            var68 = field5414.field6702 | 0xFF000000;
                        } else if ((field5433 + var64 & 0x4) == (field5432 + var7 & 0x4)) {
                            var68 = field5443[field5413.field2492 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method563(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5435;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5435;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5432 + var8;
                if (var41 >= 0 && var41 < field5448) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5450 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5450 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5441 + var42;
                            if (var46 >= 0 && var46 < field5436) {
                                int var47 = field5451[field5448 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2331(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class323 var48 = (class323) field5437.method3953((long) (var41 << 16 | var46), 14);
                                    if (var48 != null) {
                                        method2331(arg0, var38, var43, var40, var45, var48.field4713, var48.field4712);
                                    }
                                } else {
                                    field5425[0] = (short) (var47 - 1);
                                    field5428[0] = field5439[field5448 * var46 + var41];
                                    method2331(arg0, var38, var43, var40, var45, field5425, field5428);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5432 >> 6;
        int var10 = field5441 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5440 >> 6;
        int var12 = field5433 >> 6;
        if (var11 >= field5444[0].length) {
            var11 = field5444[0].length - 1;
        }
        if (var12 >= field5444[0][0].length) {
            var12 = field5444[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class15 var28 = field5444[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5447 >> 6) + var14) * 64;
                        int var30 = ((field5434 >> 6) + var27) * 64;
                        for (class640 var31 = (class640) var28.method109(0); var31 != null; var31 = (class640) var28.method115((byte) 32)) {
                            int var32 = var31.field8884 + var29 - field5447 - field5432;
                            int var33 = var31.field8887 + var30 - field5434 - field5441;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5435;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5435;
                            int var36 = field5450 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5450 - (arg2 * var33 + arg4 >> 16);
                            method2348(arg0, var34, var36, var35 - var34, var37 - var36, var31.field8888, var31.field8886 & 0xFF, var31.field8885, var31.field8890, var31.field8889, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class15 var17 = field5444[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5447 >> 6) + var15) * 64;
                        int var19 = ((field5434 >> 6) + var16) * 64;
                        for (class640 var20 = (class640) var17.method109(0); var20 != null; var20 = (class640) var17.method115((byte) -101)) {
                            int var21 = var20.field8884 + var18 - field5447 - field5432;
                            int var22 = var20.field8887 + var19 - field5434 - field5441;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5435;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5435;
                            int var25 = field5450 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5450 - (arg2 * var22 + arg4 >> 16);
                            method2331(arg0, var23, var25, var24 - var23, var26 - var25, var20.field8890, var20.field8889);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Laj;Lcka;Lrq;Lph;Lb;Lwba;Lii;)V", line = 437)
    public static final void method2329(class333 arg0, class186 arg1, class372 arg2, class671 arg3, class354 arg4, class54 arg5, class580 arg6) {
        field5411 = arg0;
        field5413 = arg1;
        field5415 = arg2;
        field5412 = arg3;
        field5418 = arg4;
        field5416 = arg5;
        field5419 = arg6;
        field5417.method3959(0);
        int var7 = field5411.method2092("details", false);
        int[] var8 = field5411.method2108(true, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class485 var10 = class181.method1256(0, field5411, var8[var9], var7);
                field5417.method3962((long) var10.field6712, var10, -108);
            }
        }
        class679.method3753(false, true, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 468)
    public static final void method2330() {
        field5446 = new byte[field5448 * field5436];
        field5445 = new byte[field5448 * field5436];
        field5449 = new byte[field5448 * field5436];
        field5451 = new short[field5448 * field5436];
        field5439 = new byte[field5448 * field5436];
        field5437 = new class706(1024);
        field5444 = new class15[3][field5448 >> 6][field5436 >> 6];
        field5443 = new int[field5413.field2478 + 1];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 478)
    private static final void method2331(class65 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class589 var8 = field5412.method3732((byte) 86, arg5[var7] & 0xFFFF);
            int var9 = var8.field7855;
            if (var9 != -1) {
                class532 var10 = field5416.method396(var9, (byte) -104);
                class147 var11 = var10.method3046(var8.field7904 ? arg6[var7] >> 6 & 0x3 : 0, -14563, var8.field7908 ? var8.field7890 : false, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1096() >> 2;
                    int var13 = arg4 * var11.method1106() >> 2;
                    if (var10.field7253) {
                        int var14 = var8.field7940;
                        int var15 = var8.field7943;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field7248 == 0) {
                            var11.method1101(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1104(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field7248 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()V", line = 537)
    public static final void method2332() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5427.field7064; var1++) {
            boolean var2 = field5414.method2814(-33, field5427.field7065[var1] & 0x3FFF, field5427.field7065[var1] >> 14 & 0x3FFF, var0, field5427.field7065[var1] >> 28 & 0x3);
            if (var2) {
                class57 var3 = new class57(field5427.field7066[var1]);
                var3.field803 = var0[1] - field5447;
                var3.field794 = var0[2] - field5434;
                field5423.method2545(-127, var3);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "()V", line = 562)
    private static final void method2333() {
        for (int var0 = 0; var0 < field5448; var0++) {
            for (int var11 = 0; var11 < field5436; var11++) {
                int var12 = field5451[field5448 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class323 var13 = (class323) field5437.method3953((long) (var0 << 16 | var11), 14);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4713.length; var14++) {
                                class589 var15 = field5412.method3732((byte) 83, var13.field4713[var14] & 0xFFFF);
                                int var16 = var15.field7878;
                                if (var15.field7865 != null) {
                                    class589 var17 = var15.method3290(1, field5419);
                                    if (var17 != null) {
                                        var16 = var17.field7878;
                                    }
                                }
                                if (var16 != -1) {
                                    class57 var18 = new class57(var16);
                                    var18.field803 = var0;
                                    var18.field794 = var11;
                                    field5423.method2545(-127, var18);
                                }
                            }
                        }
                    } else {
                        class589 var19 = field5412.method3732((byte) 122, var12 - 1);
                        int var20 = var19.field7878;
                        if (var19.field7865 != null) {
                            class589 var21 = var19.method3290(1, field5419);
                            if (var21 != null) {
                                var20 = var21.field7878;
                            }
                        }
                        if (var20 != -1) {
                            class57 var22 = new class57(var20);
                            var22.field803 = var0;
                            var22.field794 = var11;
                            field5423.method2545(-126, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5444[0].length; var2++) {
                for (int var3 = 0; var3 < field5444[0][0].length; var3++) {
                    class15 var4 = field5444[var1][var2][var3];
                    if (var4 != null) {
                        for (class640 var5 = (class640) var4.method109(0); var5 != null; var5 = (class640) var4.method115((byte) -112)) {
                            if (var5.field8890 != null) {
                                for (int var6 = 0; var6 < var5.field8890.length; var6++) {
                                    class589 var7 = field5412.method3732((byte) 24, var5.field8890[var6] & 0xFFFF);
                                    int var8 = var7.field7878;
                                    if (var7.field7865 != null) {
                                        class589 var9 = var7.method3290(1, field5419);
                                        if (var9 != null) {
                                            var8 = var9.field7878;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class57 var10 = new class57(var8);
                                        var10.field803 = ((field5447 >> 6) + var2) * 64 + var5.field8884 - field5447;
                                        var10.field794 = ((field5434 >> 6) + var3) * 64 + var5.field8887 - field5434;
                                        field5423.method2545(-128, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "()V", line = 718)
    public static void method2334() {
        field5413 = null;
        field5415 = null;
        field5412 = null;
        field5418 = null;
        field5416 = null;
        field5419 = null;
        field5414 = null;
        field5411 = null;
        field5417 = null;
        field5420 = null;
        field5425 = null;
        field5428 = null;
        field5427 = null;
        field5423 = null;
        field5443 = null;
        field5446 = null;
        field5431 = null;
        field5438 = null;
        field5445 = null;
        field5449 = null;
        field5451 = null;
        field5439 = null;
        field5437 = null;
        field5444 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Lwr;", line = 744)
    public static final class485 method2335(int arg0) {
        return (class485) field5417.method3953((long) arg0, 14);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 747)
    public static final void method2336(int arg0) {
        field5414 = (class485) field5417.method3953((long) arg0, 14);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([B[B[SII)V", line = 751)
    private static final void method2337(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5436];
        int[] var6 = new int[field5436];
        int[] var7 = new int[field5436];
        int[] var8 = new int[field5436];
        int[] var9 = new int[field5436];
        for (int var10 = -5; var10 < field5448; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5436; var13++) {
                int var10002;
                if (var11 < field5448) {
                    int var28 = arg0[field5448 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class42 var29 = field5415.method2305(18912, var28 - 1);
                        var5[var13] += var29.field652;
                        var6[var13] += var29.field662;
                        var7[var13] += var29.field649;
                        var8[var13] += var29.field658;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5448 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class42 var31 = field5415.method2305(18912, var30 - 1);
                        var5[var13] -= var31.field652;
                        var6[var13] -= var31.field662;
                        var7[var13] -= var31.field649;
                        var8[var13] -= var31.field658;
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
                for (int var19 = -5; var19 < field5436; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5436) {
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
                        if ((arg0[field5448 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5448 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class259.method1717(var16 / var18, var14 * 256 / var17, (byte) -39, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5448 * var19 + var10;
                            int var27 = class182.field2413[class630.method3539(class186.method1289(27743, 96, var25), 2011997347) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;Ljp;IIII[I[I)V", line = 896)
    private static final void method2338(class65 arg0, class376 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2398(-1372747256);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2398(-1372747256);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5446[field5448 * arg5 + arg4] = (byte) var11;
                    field5445[field5448 * arg5 + arg4] = 0;
                } else {
                    field5445[field5448 * arg5 + arg4] = (byte) var11;
                    field5449[field5448 * arg5 + arg4] = 0;
                    field5446[field5448 * arg5 + arg4] = arg1.method2387((byte) -98);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2398(-1372747256);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2398(-1372747256);
                var18 = arg1.method2398(-1372747256);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2398(-1372747256);
            }
            if (var15 == 0) {
                field5446[field5448 * arg5 + arg4] = (byte) var16;
                field5445[field5448 * arg5 + arg4] = (byte) var17;
                field5449[field5448 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5451[field5448 * arg5 + arg4] = (short) (arg1.method2359(-1) + 1);
                    field5439[field5448 * arg5 + arg4] = arg1.method2387((byte) -125);
                } else if (var19 > 1) {
                    field5451[field5448 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2359(-1);
                        var21[var22] = arg1.method2387((byte) 14);
                    }
                    field5437.method3962((long) (arg4 << 16 | arg5), new class323(var20, var21), -125);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2359(-1);
                        var24[var25] = arg1.method2387((byte) -95);
                    }
                }
                if (field5444[var15 - 1][arg2 - (field5447 >> 6)][arg3 - (field5434 >> 6)] == null) {
                    field5444[var15 - 1][arg2 - (field5447 >> 6)][arg3 - (field5434 >> 6)] = new class15();
                }
                class640 var26 = new class640(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5444[var15 - 1][arg2 - (field5447 >> 6)][arg3 - (field5434 >> 6)].method106(var26, (byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Lha;)Ltm;", line = 1031)
    public static final class412 method2339(class65 arg0) {
        int var1 = field5440 - field5432;
        int var2 = field5433 - field5441;
        int var3 = (field5442 - field5435 << 16) / var1;
        int var4 = (field5450 - field5430 << 16) / var2;
        return method2343(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "()V", line = 1041)
    public static final void method2340() {
        field5446 = null;
        field5431 = null;
        field5438 = null;
        field5445 = null;
        field5449 = null;
        field5451 = null;
        field5439 = null;
        field5437 = null;
        field5444 = null;
        field5443 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;Ldm;Lrs;)V", line = 1053)
    public static final void method2341(class65 arg0, class57 arg1, class680 arg2) {
        if (arg2.field9539 == null) {
            return;
        }
        int[] var3 = new int[arg2.field9539.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field9539[var4 * 2] + arg1.field803;
            int var22 = arg2.field9539[var4 * 2 + 1] + arg1.field794;
            var3[var4 * 2] = (field5442 - field5435) * (var21 - field5432) / (field5440 - field5432) + field5435;
            var3[var4 * 2 + 1] = field5450 - (field5450 - field5430) * (var22 - field5441) / (field5433 - field5441);
        }
        class36.method254(arg0, var3, arg2.field9524);
        if (arg2.field9530 > 0) {
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
                arg0.method507(var13, var14, var15, var16, arg2.field9545[arg2.field9502[var5] & 0xFF], 1, arg2.field9530, arg2.field9510, arg2.field9540);
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
            arg0.method507(var6, var7, var8, var9, arg2.field9545[arg2.field9502[arg2.field9502.length - 1] & 0xFF], 1, arg2.field9530, arg2.field9510, arg2.field9540);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method479(arg2.field9545[arg2.field9502[var20] & 0xFF], (byte) -55, var3[var20 * 2 + 1], var3[(var20 + 1) * 2], var3[(var20 + 1) * 2 + 1], var3[var20 * 2]);
        }
        arg0.method479(arg2.field9545[arg2.field9502[arg2.field9502.length - 1] & 0xFF], (byte) -29, var3[var3.length - 1], var3[0], var3[1], var3[var3.length - 2]);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;Ldm;IIII)V", line = 1161)
    private static final void method2342(class65 arg0, class57 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field800 = ((arg1.field803 - field5432) * arg2 + arg4 >> 16) + field5435;
        arg1.field804 = field5450 - ((arg1.field794 - field5441) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Lha;IIII)Ltm;", line = 1168)
    private static final class412 method2343(class65 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class57 var5 = (class57) field5423.method2551((byte) -108); var5 != null; var5 = (class57) field5423.method2542(-127)) {
            method2342(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5423;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;II)V", line = 1180)
    public static final void method2344(class65 arg0, int arg1, int arg2) {
        class376 var3 = new class376(field5411.method2111(field5414.field6699, "area", 3));
        int var4 = var3.method2398(-1372747256);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2398(-1372747256);
        }
        int var7 = var3.method2398(-1372747256);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2398(-1372747256);
        }
        while (true) {
            while (var3.field5459 < var3.field5518.length) {
                if (var3.method2398(-1372747256) == 0) {
                    int var22 = var3.method2398(-1372747256);
                    int var23 = var3.method2398(-1372747256);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5447;
                            int var27 = var23 * 64 + var25 - field5434;
                            method2338(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2398(-1372747256);
                    int var29 = var3.method2398(-1372747256);
                    int var30 = var3.method2398(-1372747256);
                    int var31 = var3.method2398(-1372747256);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5447;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5434;
                            method2338(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5431 = new byte[field5448 * field5436];
            field5438 = new short[field5448 * field5436];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5448 * field5436];
                for (int var13 = 0; var13 < field5444[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5444[var11][0].length; var19++) {
                        class15 var20 = field5444[var11][var13][var19];
                        if (var20 != null) {
                            for (class640 var21 = (class640) var20.method109(0); var21 != null; var21 = (class640) var20.method115((byte) 114)) {
                                var12[(var19 * 64 + var21.field8887) * field5448 + var13 * 64 + var21.field8884] = (byte) var21.field8888;
                            }
                        }
                    }
                }
                method2337(var12, field5431, field5438, arg1, arg2);
                for (int var14 = 0; var14 < field5444[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5444[var11][0].length; var15++) {
                        class15 var16 = field5444[var11][var14][var15];
                        if (var16 != null) {
                            for (class640 var17 = (class640) var16.method109(0); var17 != null; var17 = (class640) var16.method115((byte) -107)) {
                                int var18 = (var15 * 64 + var17.field8887) * field5448 + var14 * 64 + var17.field8884;
                                var17.field8888 = (field5431[var18] & 0xFF) << 16 | field5438[var18] & 0xFFFF;
                                if (var17.field8888 != 0) {
                                    var17.field8888 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2337(field5446, field5431, field5438, arg1, arg2);
            field5446 = null;
            method2333();
            return;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIII)V", line = 1358)
    public static final void method2345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5432 = arg0 - field5447;
        field5433 = arg1 - field5434;
        field5440 = arg2 - field5447;
        field5441 = arg3 - field5434;
        field5435 = arg4;
        field5430 = arg5;
        field5442 = arg6;
        field5450 = arg7;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ld;II)V", line = 1370)
    public static final void method2346(class161 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5413.field2478; var3++) {
            field5443[var3 + 1] = method2325(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)Ldha;", line = 1381)
    public static final class84 method2347(int arg0, int arg1) {
        class84 var2 = new class84();
        for (class485 var3 = (class485) field5417.method3960(0); var3 != null; var3 = (class485) field5417.method3955((byte) -86)) {
            if (var3.field6704 && var3.method2821(arg0, -11, arg1)) {
                var2.method695(-94, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 1396)
    private static final void method2348(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method563(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5443[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method563(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class290.method1839(field5426, arg2, arg5, field5443[arg6], var11, field5420, arg7 >> 6 & 0x3, arg4, -10, arg0, var12, arg3, arg1);
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
                class589 var18 = field5412.method3732((byte) 25, arg8[var16] & 0xFFFF);
                if (var18.field7855 == -1) {
                    int var19 = -3355444;
                    if (var18.field7933 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method520(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method488(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method520(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method488(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method520(arg1, arg2, arg4, -1, 0);
                            arg0.method488(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method520(var14, arg2, arg4, -1, 0);
                            arg0.method488(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method520(var14, arg2, arg4, -1, 0);
                            arg0.method488(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method520(arg1, arg2, arg4, -1, 0);
                            arg0.method488(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method488(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method488(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method488(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method488(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method488(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method488(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }
}
