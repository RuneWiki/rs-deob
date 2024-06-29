import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class137 {

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lmt;")
    private static class517 field2021 = new class517(16);

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[S")
    private static short[] field2024 = new short[1];

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[B")
    private static byte[] field2028 = new byte[1];

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field2030 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field2032 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Lfr;")
    public static class497 field2025 = new class497();

    @OriginalMember(owner = "client!el", name = "j", descriptor = "F")
    public static float field2023;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "F")
    public static float field2026;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Lhv;")
    public static class149 field2018;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lac;")
    public static class223 field2016;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Llg;")
    public static class25 field2017;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "Lhp;")
    public static class290 field2031;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Lsv;")
    private static class320 field2022;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lnv;")
    public static class44 field2019;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "Lmt;")
    private static class517 field2044;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Lmg;")
    private static class529 field2020;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lok;")
    public static class74 field2015;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Led;")
    public static class90 field2014;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "[B")
    private static byte[] field2038;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "[B")
    private static byte[] field2041;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "[B")
    private static byte[] field2050;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "[B")
    private static byte[] field2051;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "[B")
    private static byte[] field2054;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[I")
    private static int[] field2034;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "[S")
    private static short[] field2039;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "[S")
    private static short[] field2048;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "[[[B")
    public static byte[][][] field2027;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[[[Lni;")
    private static class521[][][] field2037;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lhv;")
    public static final class149 method992(int arg0, int arg1) {
        for (class149 var2 = (class149) field2021.method3061(-16817); var2 != null; var2 = (class149) field2021.method3066((byte) 124)) {
            if (var2.field2270 && var2.method1078(-5946, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lya;IIII[S[B)V")
    private static final void method993(class11 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class486 var8 = field2017.method248(arg5[var7] & 0xFFFF, 30);
            int var9 = var8.field7169;
            if (var9 != -1) {
                class409 var10 = field2019.method344((byte) -21, var9);
                class127 var11 = var10.method2452(var8.field7196 ? var8.field7184 : false, (byte) -122, arg0, var8.field7175 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method468() >> 2;
                    int var13 = arg4 * var11.method467() >> 2;
                    if (var10.field6162) {
                        int var14 = var8.field7182;
                        int var15 = var8.field7235;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field6159 == 0) {
                            var11.method939(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method293(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field6159 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
    private static final void method994() {
        for (int var0 = 0; var0 < field2053; var0++) {
            for (int var11 = 0; var11 < field2049; var11++) {
                int var12 = field2048[field2053 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class63 var13 = (class63) field2044.method3059(59, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field840.length; var14++) {
                                class486 var15 = field2017.method248(var13.field840[var14] & 0xFFFF, 30);
                                int var16 = var15.field7168;
                                if (var15.field7219 != null) {
                                    class486 var17 = var15.method2909((byte) 79, field2016);
                                    if (var17 != null) {
                                        var16 = var17.field7168;
                                    }
                                }
                                if (var16 != -1) {
                                    class219 var18 = new class219(var16);
                                    var18.field3134 = var0;
                                    var18.field3132 = var11;
                                    field2025.method2958(var18, (byte) 99);
                                }
                            }
                        }
                    } else {
                        class486 var19 = field2017.method248(var12 - 1, 30);
                        int var20 = var19.field7168;
                        if (var19.field7219 != null) {
                            class486 var21 = var19.method2909((byte) 67, field2016);
                            if (var21 != null) {
                                var20 = var21.field7168;
                            }
                        }
                        if (var20 != -1) {
                            class219 var22 = new class219(var20);
                            var22.field3134 = var0;
                            var22.field3132 = var11;
                            field2025.method2958(var22, (byte) 99);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2037[0].length; var2++) {
                for (int var3 = 0; var3 < field2037[0][0].length; var3++) {
                    class521 var4 = field2037[var1][var2][var3];
                    if (var4 != null) {
                        for (class360 var5 = (class360) var4.method3089(-125); var5 != null; var5 = (class360) var4.method3088((byte) -65)) {
                            if (var5.field5519 != null) {
                                for (int var6 = 0; var6 < var5.field5519.length; var6++) {
                                    class486 var7 = field2017.method248(var5.field5519[var6] & 0xFFFF, 30);
                                    int var8 = var7.field7168;
                                    if (var7.field7219 != null) {
                                        class486 var9 = var7.method2909((byte) 115, field2016);
                                        if (var9 != null) {
                                            var8 = var9.field7168;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class219 var10 = new class219(var8);
                                        var10.field3134 = ((field2035 >> 6) + var2) * 64 + var5.field5517 - field2035;
                                        var10.field3132 = ((field2036 >> 6) + var3) * 64 + var5.field5523 - field2036;
                                        field2025.method2958(var10, (byte) 61);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([B[B[SII)V")
    private static final void method995(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2049];
        int[] var6 = new int[field2049];
        int[] var7 = new int[field2049];
        int[] var8 = new int[field2049];
        int[] var9 = new int[field2049];
        for (int var10 = -5; var10 < field2053; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2049; var13++) {
                int var10002;
                if (var11 < field2053) {
                    int var28 = arg0[field2053 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class95 var29 = field2022.method2001(true, var28 - 1);
                        var5[var13] += var29.field1464;
                        var6[var13] += var29.field1470;
                        var7[var13] += var29.field1475;
                        var8[var13] += var29.field1466;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2053 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class95 var31 = field2022.method2001(true, var30 - 1);
                        var5[var13] -= var31.field1464;
                        var6[var13] -= var31.field1470;
                        var7[var13] -= var31.field1475;
                        var8[var13] -= var31.field1466;
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
                for (int var19 = -5; var19 < field2049; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2049) {
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
                        if ((arg0[field2053 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2053 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class350.method2118(var14 * 256 / var17, (byte) -126, var15 / var18, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2053 * var19 + var10;
                            int var27 = class85.field1347[class90.method696(1278910602, class202.method1330((byte) 40, 96, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lya;IIII)V")
    private static final void method996(class11 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2045 - field2033;
        int var6 = field2043 - field2047;
        if (field2045 < field2053) {
            var5++;
        }
        if (field2043 < field2049) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2046;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2046;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2033 + var7;
                if (var52 >= 0 && var52 < field2053) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2042 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2042 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2047 + var53;
                            int var58 = field2053 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2049) {
                                var59 = (field2038[var58] & 0xFF) << 16 | field2039[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2054[var58] & 0xFF;
                                var61 = field2048[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2018.field2264 != -1) {
                                    var62 = field2018.field2264 | 0xFF000000;
                                } else if ((field2043 + var53 & 0x4) == (field2033 + var7 & 0x4)) {
                                    var62 = field2034[field2020.field7796 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method162(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1002(arg0, var49, var54, var51, var56, var59, var60, field2050[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class63 var63 = (class63) field2044.method3059(99, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method1002(arg0, var49, var54, var51, var56, var59, var60, field2050[var58], var63.field840, var63.field839, true);
                                }
                            } else {
                                field2024[0] = (short) (var61 - 1);
                                field2028[0] = field2041[var58];
                                method1002(arg0, var49, var54, var51, var56, var59, var60, field2050[var58], field2024, field2028, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2042 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2042 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2018.field2264 != -1) {
                            var68 = field2018.field2264 | 0xFF000000;
                        } else if ((field2043 + var64 & 0x4) == (field2033 + var7 & 0x4)) {
                            var68 = field2034[field2020.field7796 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method162(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2046;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2046;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2033 + var8;
                if (var41 >= 0 && var41 < field2053) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2042 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2042 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2047 + var42;
                            if (var46 >= 0 && var46 < field2049) {
                                int var47 = field2048[field2053 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method993(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class63 var48 = (class63) field2044.method3059(113, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method993(arg0, var38, var43, var40, var45, var48.field840, var48.field839);
                                    }
                                } else {
                                    field2024[0] = (short) (var47 - 1);
                                    field2028[0] = field2041[field2053 * var46 + var41];
                                    method993(arg0, var38, var43, var40, var45, field2024, field2028);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2033 >> 6;
        int var10 = field2047 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2045 >> 6;
        int var12 = field2043 >> 6;
        if (var11 >= field2037[0].length) {
            var11 = field2037[0].length - 1;
        }
        if (var12 >= field2037[0][0].length) {
            var12 = field2037[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class521 var28 = field2037[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2035 >> 6) + var14) * 64;
                        int var30 = ((field2036 >> 6) + var27) * 64;
                        for (class360 var31 = (class360) var28.method3089(-86); var31 != null; var31 = (class360) var28.method3088((byte) -65)) {
                            int var32 = var31.field5517 + var29 - field2035 - field2033;
                            int var33 = var31.field5523 + var30 - field2036 - field2047;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2046;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2046;
                            int var36 = field2042 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2042 - (arg2 * var33 + arg4 >> 16);
                            method1002(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5518, var31.field5521 & 0xFF, var31.field5522, var31.field5519, var31.field5520, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class521 var17 = field2037[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2035 >> 6) + var15) * 64;
                        int var19 = ((field2036 >> 6) + var16) * 64;
                        for (class360 var20 = (class360) var17.method3089(-101); var20 != null; var20 = (class360) var17.method3088((byte) -65)) {
                            int var21 = var20.field5517 + var18 - field2035 - field2033;
                            int var22 = var20.field5523 + var19 - field2036 - field2047;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2046;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2046;
                            int var25 = field2042 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2042 - (arg2 * var22 + arg4 >> 16);
                            method993(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5519, var20.field5520);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lya;)Lfr;")
    public static final class497 method997(class11 arg0) {
        int var1 = field2045 - field2033;
        int var2 = field2043 - field2047;
        int var3 = (field2052 - field2046 << 16) / var1;
        int var4 = (field2042 - field2040 << 16) / var2;
        return method1004(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Lya;)V")
    public static final void method998(class11 arg0) {
        int var1 = field2045 - field2033;
        int var2 = field2043 - field2047;
        int var3 = (field2052 - field2046 << 16) / var1;
        int var4 = (field2042 - field2040 << 16) / var2;
        method996(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lga;III)I")
    private static final int method999(class243 arg0, int arg1, int arg2, int arg3) {
        class148 var4 = field2020.method3143((byte) -91, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field2240;
        if (var5 >= 0 && arg0.method1480(var5, 14270).field2405) {
            var5 = -1;
        }
        int var9;
        if (var4.field2239 >= 0) {
            int var6 = var4.field2239;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class85.field1347[class90.method696(1278910602, class231.method1431(2, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class85.field1347[class90.method696(1278910602, class231.method1431(2, 96, arg0.method1480(var5, 14270).field2409)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field2232 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field2232;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class85.field1347[class90.method696(1278910602, class231.method1431(2, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()V")
    public static final void method1000() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2031.field4349; var1++) {
            boolean var2 = field2018.method1079(field2031.field4348[var1] >> 28 & 0x3, false, field2031.field4348[var1] >> 14 & 0x3FFF, field2031.field4348[var1] & 0x3FFF, var0);
            if (var2) {
                class219 var3 = new class219(field2031.field4350[var1]);
                var3.field3134 = var0[1] - field2035;
                var3.field3132 = var0[2] - field2036;
                field2025.method2958(var3, (byte) 81);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Lhv;")
    public static final class149 method1001(int arg0) {
        return (class149) field2021.method3059(124, (long) arg0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lya;IIIIIII[S[BZ)V")
    private static final void method1002(class11 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method162(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2034[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method162(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class138.method1015(arg2, field2027, false, arg0, arg1, arg7 >> 6 & 0x3, arg3, field2034[arg6], var12, arg4, var11, arg5, field2029);
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
                class486 var18 = field2017.method248(arg8[var16] & 0xFFFF, 30);
                if (var18.field7169 == -1) {
                    int var19 = -3355444;
                    if (var18.field7230 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method91(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method60(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method91(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method60(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method91(arg1, arg2, arg4, -1, 0);
                            arg0.method60(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method91(var14, arg2, arg4, -1, 0);
                            arg0.method60(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method91(var14, arg2, arg4, -1, 0);
                            arg0.method60(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method91(arg1, arg2, arg4, -1, 0);
                            arg0.method60(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method60(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method60(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method60(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method60(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method60(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method60(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)Lbg;")
    public static final class275 method1003(int arg0, int arg1) {
        class275 var2 = new class275();
        for (class149 var3 = (class149) field2021.method3061(-16817); var3 != null; var3 = (class149) field2021.method3066((byte) 124)) {
            if (var3.field2270 && var3.method1078(-5946, arg1, arg0)) {
                var2.method1708((byte) -8, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Lya;IIII)Lfr;")
    private static final class497 method1004(class11 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class219 var5 = (class219) field2025.method2957(-91); var5 != null; var5 = (class219) field2025.method2947(-109)) {
            method1013(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2025;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2033 = arg0 - field2035;
        field2043 = arg1 - field2036;
        field2045 = arg2 - field2035;
        field2047 = arg3 - field2036;
        field2046 = arg4;
        field2040 = arg5;
        field2052 = arg6;
        field2042 = arg7;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lya;Lgk;IIII[I[I)V")
    private static final void method1006(class11 arg0, class468 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2765(110);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2765(71);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2051[field2053 * arg5 + arg4] = (byte) var11;
                    field2054[field2053 * arg5 + arg4] = 0;
                } else {
                    field2054[field2053 * arg5 + arg4] = (byte) var11;
                    field2050[field2053 * arg5 + arg4] = 0;
                    field2051[field2053 * arg5 + arg4] = arg1.method2714((byte) -41);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2765(122);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2765(80);
                var18 = arg1.method2765(58);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2765(91);
            }
            if (var15 == 0) {
                field2051[field2053 * arg5 + arg4] = (byte) var16;
                field2054[field2053 * arg5 + arg4] = (byte) var17;
                field2050[field2053 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2048[field2053 * arg5 + arg4] = (short) (arg1.method2727((byte) 43) + 1);
                    field2041[field2053 * arg5 + arg4] = arg1.method2714((byte) -59);
                } else if (var19 > 1) {
                    field2048[field2053 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2727((byte) 43);
                        var21[var22] = arg1.method2714((byte) -97);
                    }
                    field2044.method3055(0, (long) (arg4 << 16 | arg5), new class63(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2727((byte) 43);
                        var24[var25] = arg1.method2714((byte) -109);
                    }
                }
                if (field2037[var15 - 1][arg2 - (field2035 >> 6)][arg3 - (field2036 >> 6)] == null) {
                    field2037[var15 - 1][arg2 - (field2035 >> 6)][arg3 - (field2036 >> 6)] = new class521();
                }
                class360 var26 = new class360(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2037[var15 - 1][arg2 - (field2035 >> 6)][arg3 - (field2036 >> 6)].method3094(-2713, var26);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()V")
    public static final void method1007() {
        field2051 = null;
        field2038 = null;
        field2039 = null;
        field2054 = null;
        field2050 = null;
        field2048 = null;
        field2041 = null;
        field2044 = null;
        field2037 = null;
        field2034 = null;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()V")
    public static void method1008() {
        field2020 = null;
        field2022 = null;
        field2017 = null;
        field2014 = null;
        field2019 = null;
        field2016 = null;
        field2018 = null;
        field2015 = null;
        field2021 = null;
        field2027 = null;
        field2024 = null;
        field2028 = null;
        field2031 = null;
        field2025 = null;
        field2034 = null;
        field2051 = null;
        field2038 = null;
        field2039 = null;
        field2054 = null;
        field2050 = null;
        field2048 = null;
        field2041 = null;
        field2044 = null;
        field2037 = null;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "()V")
    public static final void method1009() {
        field2051 = new byte[field2053 * field2049];
        field2054 = new byte[field2053 * field2049];
        field2050 = new byte[field2053 * field2049];
        field2048 = new short[field2053 * field2049];
        field2041 = new byte[field2053 * field2049];
        field2044 = new class517(1024);
        field2037 = new class521[3][field2053 >> 6][field2049 >> 6];
        field2034 = new int[field2020.field7791 + 1];
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static final void method1010(int arg0) {
        field2018 = (class149) field2021.method3059(125, (long) arg0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lok;Lmg;Lsv;Llg;Led;Lnv;Lac;)V")
    public static final void method1011(class74 arg0, class529 arg1, class320 arg2, class25 arg3, class90 arg4, class44 arg5, class223 arg6) {
        field2015 = arg0;
        field2020 = arg1;
        field2022 = arg2;
        field2017 = arg3;
        field2014 = arg4;
        field2019 = arg5;
        field2016 = arg6;
        field2021.method3056(true);
        int var7 = field2015.method539((byte) 27, "details");
        int[] var8 = field2015.method522(0, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class149 var10 = class400.method2420(var7, 5112, var8[var9], field2015);
                field2021.method3055(0, (long) var10.field2254, var10);
            }
        }
        class68.method478(false, 0, true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lya;II)V")
    public static final void method1012(class11 arg0, int arg1, int arg2) {
        class468 var3 = new class468(field2015.method529(0, "area", field2018.field2271));
        int var4 = var3.method2765(71);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2765(114);
        }
        int var7 = var3.method2765(78);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2765(101);
        }
        while (true) {
            while (var3.field6830 < var3.field6868.length) {
                if (var3.method2765(90) == 0) {
                    int var22 = var3.method2765(96);
                    int var23 = var3.method2765(70);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2035;
                            int var27 = var23 * 64 + var25 - field2036;
                            method1006(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2765(73);
                    int var29 = var3.method2765(123);
                    int var30 = var3.method2765(112);
                    int var31 = var3.method2765(67);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2035;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2036;
                            method1006(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2038 = new byte[field2053 * field2049];
            field2039 = new short[field2053 * field2049];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2053 * field2049];
                for (int var13 = 0; var13 < field2037[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2037[var11][0].length; var19++) {
                        class521 var20 = field2037[var11][var13][var19];
                        if (var20 != null) {
                            for (class360 var21 = (class360) var20.method3089(-85); var21 != null; var21 = (class360) var20.method3088((byte) -65)) {
                                var12[(var19 * 64 + var21.field5523) * field2053 + var13 * 64 + var21.field5517] = (byte) var21.field5518;
                            }
                        }
                    }
                }
                method995(var12, field2038, field2039, arg1, arg2);
                for (int var14 = 0; var14 < field2037[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2037[var11][0].length; var15++) {
                        class521 var16 = field2037[var11][var14][var15];
                        if (var16 != null) {
                            for (class360 var17 = (class360) var16.method3089(-90); var17 != null; var17 = (class360) var16.method3088((byte) -65)) {
                                int var18 = (var15 * 64 + var17.field5523) * field2053 + var14 * 64 + var17.field5517;
                                var17.field5518 = (field2038[var18] & 0xFF) << 16 | field2039[var18] & 0xFFFF;
                                if (var17.field5518 != 0) {
                                    var17.field5518 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method995(field2051, field2038, field2039, arg1, arg2);
            field2051 = null;
            method994();
            return;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lya;Lcs;IIII)V")
    private static final void method1013(class11 arg0, class219 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3130 = ((arg1.field3134 - field2033) * arg2 + arg4 >> 16) + field2046;
        arg1.field3139 = field2042 - ((arg1.field3132 - field2047) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lga;II)V")
    public static final void method1014(class243 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field2020.field7791; var3++) {
            field2034[var3 + 1] = method999(arg0, var3, arg1, arg2);
        }
    }
}
