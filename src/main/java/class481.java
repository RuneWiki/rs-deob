import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class481 {

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lbj;")
    private static class159 field7033 = new class159(16);

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[B")
    private static byte[] field7036 = new byte[1];

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field7040 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field7035 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[S")
    private static short[] field7043 = new short[1];

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lwo;")
    public static class522 field7037 = new class522();

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "F")
    public static float field7041;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "F")
    public static float field7044;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Ltj;")
    public static class131 field7031;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "Lbj;")
    private static class159 field7048;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ldb;")
    private static class210 field7032;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lvh;")
    public static class240 field7028;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lje;")
    public static class275 field7026;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lvd;")
    public static class30 field7030;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lhl;")
    public static class367 field7029;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lji;")
    public static class433 field7034;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lte;")
    public static class435 field7042;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lhn;")
    private static class506 field7027;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "[B")
    private static byte[] field7052;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "[B")
    private static byte[] field7055;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "[B")
    private static byte[] field7057;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "[B")
    private static byte[] field7059;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "[B")
    private static byte[] field7062;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "[I")
    private static int[] field7061;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "[S")
    private static short[] field7049;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "[S")
    private static short[] field7054;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[[[B")
    public static byte[][][] field7039;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "[[[Lqi;")
    private static class398[][][] field7050;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lvh;Ldb;Lhn;Lhl;Ltj;Lje;Lvd;)V")
    public static final void method2824(class240 arg0, class210 arg1, class506 arg2, class367 arg3, class131 arg4, class275 arg5, class30 arg6) {
        field7028 = arg0;
        field7032 = arg1;
        field7027 = arg2;
        field7029 = arg3;
        field7031 = arg4;
        field7026 = arg5;
        field7030 = arg6;
        field7033.method992(-15728);
        int var7 = field7028.method1396("details", (byte) 71);
        int[] var8 = field7028.method1415(-123, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class433 var10 = class224.method1320(var8[var9], var7, field7028, -87);
            field7033.method990((long) var10.field6290, (byte) 108, var10);
        }
        class51.method315(true, false, 0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Lji;")
    public static final class433 method2825(int arg0) {
        return (class433) field7033.method979((byte) 28, (long) arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public static final void method2826() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field7042.field6339; var1++) {
            boolean var2 = field7034.method2588(field7042.field6344[var1] >> 28 & 0x3, field7042.field6344[var1] & 0x3FFF, field7042.field6344[var1] >> 14 & 0x3FFF, 0, var0);
            if (var2) {
                class92 var3 = new class92(field7042.field6340[var1]);
                var3.field1241 = var0[1] - field7046;
                var3.field1237 = var0[2] - field7066;
                field7037.method3070(var3, (byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2827(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field7056];
        int[] var6 = new int[field7056];
        int[] var7 = new int[field7056];
        int[] var8 = new int[field7056];
        int[] var9 = new int[field7056];
        for (int var10 = -5; var10 < field7051; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field7056; var13++) {
                int var10002;
                if (var11 < field7051) {
                    int var28 = arg0[field7051 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class118 var29 = field7027.method2975((byte) 55, var28 - 1);
                        var5[var13] += var29.field1599;
                        var6[var13] += var29.field1586;
                        var7[var13] += var29.field1597;
                        var8[var13] += var29.field1589;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field7051 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class118 var31 = field7027.method2975((byte) 86, var30 - 1);
                        var5[var13] -= var31.field1599;
                        var6[var13] -= var31.field1586;
                        var7[var13] -= var31.field1597;
                        var8[var13] -= var31.field1589;
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
                for (int var19 = -5; var19 < field7056; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field7056) {
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
                        if ((arg0[field7051 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field7051 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class225.method1336(var14 * 256 / var17, var15 / var18, (byte) 26, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field7051 * var19 + var10;
                            int var27 = class455.field6653[class384.method2206(true, class472.method2780(96, (byte) 127, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;IIII)V")
    private static final void method2828(class162 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field7047 - field7063;
        int var6 = field7060 - field7058;
        if (field7047 < field7051) {
            var5++;
        }
        if (field7060 < field7056) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field7045;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field7045;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field7063 + var7;
                if (var52 >= 0 && var52 < field7051) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field7064 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field7064 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field7058 + var53;
                            int var58 = field7051 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field7056) {
                                var59 = (field7055[var58] & 0xFF) << 16 | field7054[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field7059[var58] & 0xFF;
                                var61 = field7049[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field7034.field6304 != -1) {
                                    var62 = field7034.field6304 | 0xFF000000;
                                } else if ((field7063 + var7 & 0x4) == (field7060 + var53 & 0x4)) {
                                    var62 = field7061[field7032.field2981 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method459(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2833(arg0, var49, var54, var51, var56, var59, var60, field7052[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class256 var63 = (class256) field7048.method979((byte) 28, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2833(arg0, var49, var54, var51, var56, var59, var60, field7052[var58], var63.field3551, var63.field3550, true);
                                }
                            } else {
                                field7043[0] = (short) (var61 - 1);
                                field7036[0] = field7062[var58];
                                method2833(arg0, var49, var54, var51, var56, var59, var60, field7052[var58], field7043, field7036, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field7064 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field7064 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field7034.field6304 != -1) {
                            var68 = field7034.field6304 | 0xFF000000;
                        } else if ((field7063 + var7 & 0x4) == (field7060 + var64 & 0x4)) {
                            var68 = field7061[field7032.field2981 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method459(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field7045;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field7045;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field7063 + var8;
                if (var41 >= 0 && var41 < field7051) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field7064 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field7064 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field7058 + var42;
                            if (var46 >= 0 && var46 < field7056) {
                                int var47 = field7049[field7051 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2839(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class256 var48 = (class256) field7048.method979((byte) 28, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2839(arg0, var38, var43, var40, var45, var48.field3551, var48.field3550);
                                    }
                                } else {
                                    field7043[0] = (short) (var47 - 1);
                                    field7036[0] = field7062[field7051 * var46 + var41];
                                    method2839(arg0, var38, var43, var40, var45, field7043, field7036);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field7063 >> 6;
        int var10 = field7058 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field7047 >> 6;
        int var12 = field7060 >> 6;
        if (var11 >= field7050[0].length) {
            var11 = field7050[0].length - 1;
        }
        if (var12 >= field7050[0][0].length) {
            var12 = field7050[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class398 var28 = field7050[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field7046 >> 6) + var14) * 64;
                        int var30 = ((field7066 >> 6) + var27) * 64;
                        for (class155 var31 = (class155) var28.method2306(122); var31 != null; var31 = (class155) var28.method2302(-105)) {
                            int var32 = var31.field2218 + var29 - field7046 - field7063;
                            int var33 = var31.field2221 + var30 - field7066 - field7058;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field7045;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field7045;
                            int var36 = field7064 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field7064 - (arg2 * var33 + arg4 >> 16);
                            method2833(arg0, var34, var36, var35 - var34, var37 - var36, var31.field2219, var31.field2220 & 0xFF, var31.field2222, var31.field2223, var31.field2224, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class398 var17 = field7050[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field7046 >> 6) + var15) * 64;
                        int var19 = ((field7066 >> 6) + var16) * 64;
                        for (class155 var20 = (class155) var17.method2306(115); var20 != null; var20 = (class155) var17.method2302(-109)) {
                            int var21 = var20.field2218 + var18 - field7046 - field7063;
                            int var22 = var20.field2221 + var19 - field7066 - field7058;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field7045;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field7045;
                            int var25 = field7064 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field7064 - (arg2 * var22 + arg4 >> 16);
                            method2839(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2223, var20.field2224);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lm;III)I")
    private static final int method2829(class126 arg0, int arg1, int arg2, int arg3) {
        class252 var4 = field7032.method1273(arg1, (byte) 104);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3504;
        if (var5 >= 0 && arg0.method830(var5, (byte) 71).field7371) {
            var5 = -1;
        }
        int var9;
        if (var4.field3491 >= 0) {
            int var6 = var4.field3491;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class455.field6653[class384.method2206(true, class428.method2566(var8, 127, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class455.field6653[class384.method2206(true, class428.method2566(arg0.method830(var5, (byte) 71).field7367, 127, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3503 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3503;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class455.field6653[class384.method2206(true, class428.method2566(var12, 127, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lcs;")
    public static final class225 method2830(int arg0, int arg1) {
        class225 var2 = new class225();
        for (class433 var3 = (class433) field7033.method981(0); var3 != null; var3 = (class433) field7033.method989(0)) {
            if (var3.field6311 && var3.method2587(arg0, 2047739788, arg1)) {
                var2.method1335(-571093627, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Lji;")
    public static final class433 method2831(int arg0, int arg1) {
        for (class433 var2 = (class433) field7033.method981(0); var2 != null; var2 = (class433) field7033.method989(0)) {
            if (var2.field6311 && var2.method2587(arg0, 2047739788, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;Lls;IIII)V")
    private static final void method2832(class162 arg0, class92 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field1235 = ((arg1.field1241 - field7063) * arg2 + arg4 >> 16) + field7045;
        arg1.field1238 = field7064 - ((arg1.field1237 - field7058) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;IIIIIII[S[BZ)V")
    private static final void method2833(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method459(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field7061[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method459(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class64.method404(field7061[arg6], arg2, var11, arg3, arg5, var12, arg4, arg7 >> 6 & 0x3, arg0, field7038, arg1, field7039, 0);
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
                class132 var18 = field7029.method2121(arg8[var16] & 0xFFFF, true);
                if (var18.field1887 == -1) {
                    int var19 = -3355444;
                    if (var18.field1850 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method511(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method530(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method511(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method530(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method511(arg1, arg2, arg4, -1, 0);
                            arg0.method530(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method511(var14, arg2, arg4, -1, 0);
                            arg0.method530(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method511(var14, arg2, arg4, -1, 0);
                            arg0.method530(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method511(arg1, arg2, arg4, -1, 0);
                            arg0.method530(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method530(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method530(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method530(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method530(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method530(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method530(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()V")
    public static void method2834() {
        field7032 = null;
        field7027 = null;
        field7029 = null;
        field7031 = null;
        field7026 = null;
        field7030 = null;
        field7034 = null;
        field7028 = null;
        field7033 = null;
        field7039 = null;
        field7043 = null;
        field7036 = null;
        field7042 = null;
        field7037 = null;
        field7061 = null;
        field7057 = null;
        field7055 = null;
        field7054 = null;
        field7059 = null;
        field7052 = null;
        field7049 = null;
        field7062 = null;
        field7048 = null;
        field7050 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;)Lwo;")
    public static final class522 method2835(class162 arg0) {
        int var1 = field7047 - field7063;
        int var2 = field7060 - field7058;
        int var3 = (field7065 - field7045 << 16) / var1;
        int var4 = (field7064 - field7053 << 16) / var2;
        return method2836(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lqa;IIII)Lwo;")
    private static final class522 method2836(class162 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class92 var5 = (class92) field7037.method3072((byte) 112); var5 != null; var5 = (class92) field7037.method3066(2)) {
            method2832(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field7037;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lm;II)V")
    public static final void method2837(class126 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field7032.field2980; var3++) {
            field7061[var3 + 1] = method2829(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;II)V")
    public static final void method2838(class162 arg0, int arg1, int arg2) {
        class365 var3 = new class365(field7028.method1407(field7034.field6296, (byte) -37, "area"));
        int var4 = var3.method2099(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2099(255);
        }
        int var7 = var3.method2099(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2099(255);
        }
        while (true) {
            while (var3.field5069 < var3.field5073.length) {
                if (var3.method2099(255) == 0) {
                    int var22 = var3.method2099(255);
                    int var23 = var3.method2099(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field7046;
                            int var27 = var23 * 64 + var25 - field7066;
                            method2846(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2099(255);
                    int var29 = var3.method2099(255);
                    int var30 = var3.method2099(255);
                    int var31 = var3.method2099(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field7046;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field7066;
                            method2846(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field7055 = new byte[field7056 * field7051];
            field7054 = new short[field7056 * field7051];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field7056 * field7051];
                for (int var13 = 0; var13 < field7050[var11].length; var13++) {
                    for (int var19 = 0; var19 < field7050[var11][0].length; var19++) {
                        class398 var20 = field7050[var11][var13][var19];
                        if (var20 != null) {
                            for (class155 var21 = (class155) var20.method2306(106); var21 != null; var21 = (class155) var20.method2302(-82)) {
                                var12[(var19 * 64 + var21.field2221) * field7051 + var13 * 64 + var21.field2218] = (byte) var21.field2219;
                            }
                        }
                    }
                }
                method2827(var12, field7055, field7054, arg1, arg2);
                for (int var14 = 0; var14 < field7050[var11].length; var14++) {
                    for (int var15 = 0; var15 < field7050[var11][0].length; var15++) {
                        class398 var16 = field7050[var11][var14][var15];
                        if (var16 != null) {
                            for (class155 var17 = (class155) var16.method2306(114); var17 != null; var17 = (class155) var16.method2302(-80)) {
                                int var18 = (var15 * 64 + var17.field2221) * field7051 + var14 * 64 + var17.field2218;
                                var17.field2219 = (field7055[var18] & 0xFF) << 16 | field7054[var18] & 0xFFFF;
                                if (var17.field2219 != 0) {
                                    var17.field2219 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2827(field7057, field7055, field7054, arg1, arg2);
            field7057 = null;
            method2840();
            return;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;IIII[S[B)V")
    private static final void method2839(class162 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class132 var8 = field7029.method2121(arg5[var7] & 0xFFFF, true);
            int var9 = var8.field1887;
            if (var9 != -1) {
                class526 var10 = field7026.method1558(-1265, var9);
                class529 var11 = var10.method3082(arg0, 111, var8.field1827 ? var8.field1859 : false, var8.field1834 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method126() >> 2;
                    int var13 = arg4 * var11.method121() >> 2;
                    if (var10.field7725) {
                        int var14 = var8.field1880;
                        int var15 = var8.field1881;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field7726 == 0) {
                            var11.method3106(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method119(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field7726 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()V")
    private static final void method2840() {
        for (int var0 = 0; var0 < field7051; var0++) {
            for (int var11 = 0; var11 < field7056; var11++) {
                int var12 = field7049[field7051 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class256 var13 = (class256) field7048.method979((byte) 28, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3551.length; var14++) {
                                class132 var15 = field7029.method2121(var13.field3551[var14] & 0xFFFF, true);
                                int var16 = var15.field1829;
                                if (var15.field1814 != null) {
                                    class132 var17 = var15.method870(0, field7030);
                                    if (var17 != null) {
                                        var16 = var17.field1829;
                                    }
                                }
                                if (var16 != -1) {
                                    class92 var18 = new class92(var16);
                                    var18.field1241 = var0;
                                    var18.field1237 = var11;
                                    field7037.method3070(var18, (byte) -124);
                                }
                            }
                        }
                    } else {
                        class132 var19 = field7029.method2121(var12 - 1, true);
                        int var20 = var19.field1829;
                        if (var19.field1814 != null) {
                            class132 var21 = var19.method870(0, field7030);
                            if (var21 != null) {
                                var20 = var21.field1829;
                            }
                        }
                        if (var20 != -1) {
                            class92 var22 = new class92(var20);
                            var22.field1241 = var0;
                            var22.field1237 = var11;
                            field7037.method3070(var22, (byte) -126);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field7050[0].length; var2++) {
                for (int var3 = 0; var3 < field7050[0][0].length; var3++) {
                    class398 var4 = field7050[var1][var2][var3];
                    if (var4 != null) {
                        for (class155 var5 = (class155) var4.method2306(124); var5 != null; var5 = (class155) var4.method2302(-103)) {
                            if (var5.field2223 != null) {
                                for (int var6 = 0; var6 < var5.field2223.length; var6++) {
                                    class132 var7 = field7029.method2121(var5.field2223[var6] & 0xFFFF, true);
                                    int var8 = var7.field1829;
                                    if (var7.field1814 != null) {
                                        class132 var9 = var7.method870(0, field7030);
                                        if (var9 != null) {
                                            var8 = var9.field1829;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class92 var10 = new class92(var8);
                                        var10.field1241 = ((field7046 >> 6) + var2) * 64 + var5.field2218 - field7046;
                                        var10.field1237 = ((field7066 >> 6) + var3) * 64 + var5.field2221 - field7066;
                                        field7037.method3070(var10, (byte) -121);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()V")
    public static final void method2841() {
        field7057 = new byte[field7056 * field7051];
        field7059 = new byte[field7056 * field7051];
        field7052 = new byte[field7056 * field7051];
        field7049 = new short[field7056 * field7051];
        field7062 = new byte[field7056 * field7051];
        field7048 = new class159(1024);
        field7050 = new class398[3][field7051 >> 6][field7056 >> 6];
        field7061 = new int[field7032.field2980 + 1];
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lqa;)V")
    public static final void method2842(class162 arg0) {
        int var1 = field7047 - field7063;
        int var2 = field7060 - field7058;
        int var3 = (field7065 - field7045 << 16) / var1;
        int var4 = (field7064 - field7053 << 16) / var2;
        method2828(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "()V")
    public static final void method2843() {
        field7057 = null;
        field7055 = null;
        field7054 = null;
        field7059 = null;
        field7052 = null;
        field7049 = null;
        field7062 = null;
        field7048 = null;
        field7050 = null;
        field7061 = null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static final void method2844(int arg0) {
        field7034 = (class433) field7033.method979((byte) 28, (long) arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7063 = arg0 - field7046;
        field7060 = arg1 - field7066;
        field7047 = arg2 - field7046;
        field7058 = arg3 - field7066;
        field7045 = arg4;
        field7053 = arg5;
        field7065 = arg6;
        field7064 = arg7;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;Llh;IIII[I[I)V")
    private static final void method2846(class162 arg0, class365 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2099(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2099(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field7057[field7051 * arg5 + arg4] = (byte) var11;
                    field7059[field7051 * arg5 + arg4] = 0;
                } else {
                    field7059[field7051 * arg5 + arg4] = (byte) var11;
                    field7052[field7051 * arg5 + arg4] = 0;
                    field7057[field7051 * arg5 + arg4] = arg1.method2081((byte) 105);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2099(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2099(255);
                var18 = arg1.method2099(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2099(255);
            }
            if (var15 == 0) {
                field7057[field7051 * arg5 + arg4] = (byte) var16;
                field7059[field7051 * arg5 + arg4] = (byte) var17;
                field7052[field7051 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field7049[field7051 * arg5 + arg4] = (short) (arg1.method2062((byte) 14) + 1);
                    field7062[field7051 * arg5 + arg4] = arg1.method2081((byte) 94);
                } else if (var19 > 1) {
                    field7049[field7051 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2062((byte) 14);
                        var21[var22] = arg1.method2081((byte) 100);
                    }
                    field7048.method990((long) (arg4 << 16 | arg5), (byte) 11, new class256(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2062((byte) 14);
                        var24[var25] = arg1.method2081((byte) -59);
                    }
                }
                if (field7050[var15 - 1][arg2 - (field7046 >> 6)][arg3 - (field7066 >> 6)] == null) {
                    field7050[var15 - 1][arg2 - (field7046 >> 6)][arg3 - (field7066 >> 6)] = new class398();
                }
                class155 var26 = new class155(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field7050[var15 - 1][arg2 - (field7046 >> 6)][arg3 - (field7066 >> 6)].method2310(var26, -21801);
            }
        }
    }
}
