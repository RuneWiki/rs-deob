import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class333 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Ltn;")
    private static class109 field4489 = new class109(16);

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field4492 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[B")
    private static byte[] field4495 = new byte[1];

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[S")
    private static short[] field4497 = new short[1];

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field4499 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Ljm;")
    public static class162 field4500 = new class162();

    @OriginalMember(owner = "client!se", name = "f", descriptor = "F")
    public static float field4493;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "F")
    public static float field4498;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lge;")
    public static class104 field4490;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Ltn;")
    private static class109 field4505;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lep;")
    public static class147 field4494;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lij;")
    public static class316 field4488;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "[B")
    private static byte[] field4502;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "[B")
    private static byte[] field4509;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[B")
    private static byte[] field4511;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
    private static byte[] field4521;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "[B")
    private static byte[] field4522;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "[I")
    private static int[] field4510;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[S")
    private static short[] field4513;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "[S")
    private static short[] field4519;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[[[B")
    public static byte[][][] field4491;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[[[Lcp;")
    private static class399[][][] field4503;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lea;IIII[S[B)V", line = 4)
    private static final void method2013(class58 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class447 var8 = class133.method996((byte) -19, arg5[var7] & 0xFFFF);
            int var9 = var8.field6317;
            if (var9 != -1) {
                class215 var10 = class42.method359(var9, (byte) -61);
                class77 var11 = var10.method1435(var8.field6279 ? arg6[var7] >> 6 & 0x3 : 0, arg0, false, var8.field6285 ? var8.field6288 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method632() >> 2;
                    int var13 = arg4 * var11.method619() >> 2;
                    if (var10.field3012) {
                        int var14 = var8.field6330;
                        int var15 = var8.field6322;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field3007 == 0) {
                            var11.method615(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method618(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field3007 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Lwe;", line = 64)
    public static final class24 method2014(int arg0, int arg1) {
        class24 var2 = new class24();
        for (class104 var3 = (class104) field4489.method842((byte) -25); var3 != null; var3 = (class104) field4489.method836(-90)) {
            if (var3.field1446 && var3.method784(8423, arg1, arg0)) {
                var2.method145(var3, false);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lge;", line = 79)
    public static final class104 method2015(int arg0) {
        return (class104) field4489.method837((byte) -72, (long) arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lgf;II)V", line = 84)
    public static final void method2016(class202 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class232.field3263; var3++) {
            field4510[var3 + 1] = method2035(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lij;)V", line = 95)
    public static final void method2017(class316 arg0) {
        field4488 = arg0;
        field4489.method843(-1);
        int var1 = field4488.method1909(-1, "details");
        int[] var2 = field4488.method1936(-87, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class104 var4 = class274.method1735(9105, var2[var3], var1, field4488);
            field4489.method835(4, var4, (long) var4.field1448);
        }
        class165.method1182(true, false, (byte) 108);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lea;II)V", line = 116)
    public static final void method2018(class58 arg0, int arg1, int arg2) {
        class366 var3 = new class366(field4488.method1922(field4490.field1453, (byte) 21, "area"));
        int var4 = var3.method2306((byte) 27);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2306((byte) 65);
        }
        int var7 = var3.method2306((byte) 66);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2306((byte) 92);
        }
        while (true) {
            while (var3.field5048 < var3.field5076.length) {
                if (var3.method2306((byte) 109) == 0) {
                    int var22 = var3.method2306((byte) 95);
                    int var23 = var3.method2306((byte) 113);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4518;
                            int var27 = var23 * 64 + var25 - field4514;
                            method2022(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2306((byte) 93);
                    int var29 = var3.method2306((byte) 46);
                    int var30 = var3.method2306((byte) 74);
                    int var31 = var3.method2306((byte) 80);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4518;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4514;
                            method2022(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4511 = new byte[field4520 * field4501];
            field4513 = new short[field4520 * field4501];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4520 * field4501];
                for (int var13 = 0; var13 < field4503[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4503[var11][0].length; var19++) {
                        class399 var20 = field4503[var11][var13][var19];
                        if (var20 != null) {
                            for (class121 var21 = (class121) var20.method2480(7904); var21 != null; var21 = (class121) var20.method2482(50)) {
                                var12[(var19 * 64 + var21.field1829) * field4520 + var13 * 64 + var21.field1830] = (byte) var21.field1826;
                            }
                        }
                    }
                }
                method2019(var12, field4511, field4513, arg1, arg2);
                for (int var14 = 0; var14 < field4503[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4503[var11][0].length; var15++) {
                        class399 var16 = field4503[var11][var14][var15];
                        if (var16 != null) {
                            for (class121 var17 = (class121) var16.method2480(7904); var17 != null; var17 = (class121) var16.method2482(50)) {
                                int var18 = (var15 * 64 + var17.field1829) * field4520 + var14 * 64 + var17.field1830;
                                var17.field1826 = (field4511[var18] & 0xFF) << 16 | field4513[var18] & 0xFFFF;
                                if (var17.field1826 != 0) {
                                    var17.field1826 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2019(field4522, field4511, field4513, arg1, arg2);
            field4522 = null;
            method2025();
            return;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([B[B[SII)V", line = 295)
    private static final void method2019(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4501];
        int[] var6 = new int[field4501];
        int[] var7 = new int[field4501];
        int[] var8 = new int[field4501];
        int[] var9 = new int[field4501];
        for (int var10 = -5; var10 < field4520; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4501; var13++) {
                int var10002;
                if (var11 < field4520) {
                    int var28 = arg0[field4520 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class290 var29 = class415.method2565(-1730, var28 - 1);
                        var5[var13] += var29.field3935;
                        var6[var13] += var29.field3940;
                        var7[var13] += var29.field3930;
                        var8[var13] += var29.field3933;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4520 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class290 var31 = class415.method2565(-1730, var30 - 1);
                        var5[var13] -= var31.field3935;
                        var6[var13] -= var31.field3940;
                        var7[var13] -= var31.field3930;
                        var8[var13] -= var31.field3933;
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
                for (int var19 = -5; var19 < field4501; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4501) {
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
                        if ((arg0[field4520 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4520 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class407.method2511(var16 / var18, var14 * 256 / var17, 29743, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4520 * var19 + var10;
                            int var27 = class119.field1810[class408.method2524(class342.method2085(96, (byte) -35, var25), 127) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lea;)V", line = 440)
    public static final void method2020(class58 arg0) {
        int var1 = field4517 - field4512;
        int var2 = field4508 - field4507;
        int var3 = (field4506 - field4504 << 16) / var1;
        int var4 = (field4516 - field4515 << 16) / var2;
        method2021(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lea;IIII)V", line = 451)
    private static final void method2021(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4517 - field4512;
        int var6 = field4508 - field4507;
        if (field4517 < field4520) {
            var5++;
        }
        if (field4508 < field4501) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4504;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4504;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4512 + var7;
                if (var52 >= 0 && var52 < field4520) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4516 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4516 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4507 + var53;
                            int var58 = field4520 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4501) {
                                var59 = (field4511[var58] & 0xFF) << 16 | field4513[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4521[var58] & 0xFF;
                                var61 = field4519[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4490.field1432 != -1) {
                                    var62 = field4490.field1432 | 0xFF000000;
                                } else if ((field4512 + var7 & 0x4) == (field4508 + var53 & 0x4)) {
                                    var62 = field4510[class392.field5446 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method245(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2033(arg0, var49, var54, var51, var56, var59, var60, field4502[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class286 var63 = (class286) field4505.method837((byte) -72, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2033(arg0, var49, var54, var51, var56, var59, var60, field4502[var58], var63.field3877, var63.field3876, true);
                                }
                            } else {
                                field4497[0] = (short) (var61 - 1);
                                field4495[0] = field4509[var58];
                                method2033(arg0, var49, var54, var51, var56, var59, var60, field4502[var58], field4497, field4495, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4516 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4516 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4490.field1432 != -1) {
                            var68 = field4490.field1432 | 0xFF000000;
                        } else if ((field4512 + var7 & 0x4) == (field4508 + var64 & 0x4)) {
                            var68 = field4510[class392.field5446 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method245(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4504;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4504;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4512 + var8;
                if (var41 >= 0 && var41 < field4520) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4516 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4516 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4507 + var42;
                            if (var46 >= 0 && var46 < field4501) {
                                int var47 = field4519[field4520 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2013(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class286 var48 = (class286) field4505.method837((byte) -72, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2013(arg0, var38, var43, var40, var45, var48.field3877, var48.field3876);
                                    }
                                } else {
                                    field4497[0] = (short) (var47 - 1);
                                    field4495[0] = field4509[field4520 * var46 + var41];
                                    method2013(arg0, var38, var43, var40, var45, field4497, field4495);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4512 >> 6;
        int var10 = field4507 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4517 >> 6;
        int var12 = field4508 >> 6;
        if (var11 >= field4503[0].length) {
            var11 = field4503[0].length - 1;
        }
        if (var12 >= field4503[0][0].length) {
            var12 = field4503[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class399 var28 = field4503[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4518 >> 6) + var14) * 64;
                        int var30 = ((field4514 >> 6) + var27) * 64;
                        for (class121 var31 = (class121) var28.method2480(7904); var31 != null; var31 = (class121) var28.method2482(50)) {
                            int var32 = var31.field1830 + var29 - field4518 - field4512;
                            int var33 = var31.field1829 + var30 - field4514 - field4507;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4504;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4504;
                            int var36 = field4516 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4516 - (arg2 * var33 + arg4 >> 16);
                            method2033(arg0, var34, var36, var35 - var34, var37 - var36, var31.field1826, var31.field1825 & 0xFF, var31.field1827, var31.field1828, var31.field1831, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class399 var17 = field4503[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4518 >> 6) + var15) * 64;
                        int var19 = ((field4514 >> 6) + var16) * 64;
                        for (class121 var20 = (class121) var17.method2480(7904); var20 != null; var20 = (class121) var17.method2482(50)) {
                            int var21 = var20.field1830 + var18 - field4518 - field4512;
                            int var22 = var20.field1829 + var19 - field4514 - field4507;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4504;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4504;
                            int var25 = field4516 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4516 - (arg2 * var22 + arg4 >> 16);
                            method2013(arg0, var23, var25, var24 - var23, var26 - var25, var20.field1828, var20.field1831);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lea;Lrg;IIII[I[I)V", line = 794)
    private static final void method2022(class58 arg0, class366 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2306((byte) 96);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2306((byte) 55);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4522[field4520 * arg5 + arg4] = (byte) var11;
                    field4521[field4520 * arg5 + arg4] = 0;
                } else {
                    field4521[field4520 * arg5 + arg4] = (byte) var11;
                    field4502[field4520 * arg5 + arg4] = 0;
                    field4522[field4520 * arg5 + arg4] = arg1.method2289((byte) -77);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2306((byte) 99);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2306((byte) 90);
                var18 = arg1.method2306((byte) 104);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2306((byte) 57);
            }
            if (var15 == 0) {
                field4522[field4520 * arg5 + arg4] = (byte) var16;
                field4521[field4520 * arg5 + arg4] = (byte) var17;
                field4502[field4520 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4519[field4520 * arg5 + arg4] = (short) (arg1.method2297(13352) + 1);
                    field4509[field4520 * arg5 + arg4] = arg1.method2289((byte) -77);
                } else if (var19 > 1) {
                    field4519[field4520 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2297(13352);
                        var21[var22] = arg1.method2289((byte) -77);
                    }
                    field4505.method835(4, new class286(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2297(13352);
                        var24[var25] = arg1.method2289((byte) -77);
                    }
                }
                if (field4503[var15 - 1][arg2 - (field4518 >> 6)][arg3 - (field4514 >> 6)] == null) {
                    field4503[var15 - 1][arg2 - (field4518 >> 6)][arg3 - (field4514 >> 6)] = new class399();
                }
                class121 var26 = new class121(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4503[var15 - 1][arg2 - (field4518 >> 6)][arg3 - (field4514 >> 6)].method2483(var26, 0);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V", line = 928)
    public static void method2023() {
        field4490 = null;
        field4488 = null;
        field4489 = null;
        field4491 = null;
        field4497 = null;
        field4495 = null;
        field4494 = null;
        field4500 = null;
        field4510 = null;
        field4522 = null;
        field4511 = null;
        field4513 = null;
        field4521 = null;
        field4502 = null;
        field4519 = null;
        field4509 = null;
        field4505 = null;
        field4503 = null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lea;)Ljm;", line = 949)
    public static final class162 method2024(class58 arg0) {
        int var1 = field4517 - field4512;
        int var2 = field4508 - field4507;
        int var3 = (field4506 - field4504 << 16) / var1;
        int var4 = (field4516 - field4515 << 16) / var2;
        return method2027(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()V", line = 962)
    private static final void method2025() {
        for (int var0 = 0; var0 < field4520; var0++) {
            for (int var11 = 0; var11 < field4501; var11++) {
                int var12 = field4519[field4520 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class286 var13 = (class286) field4505.method837((byte) -72, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3877.length; var14++) {
                                class447 var15 = class133.method996((byte) -19, var13.field3877[var14] & 0xFFFF);
                                int var16 = var15.field6293;
                                if (var15.field6307 != null) {
                                    class447 var17 = var15.method2772(-103);
                                    if (var17 != null) {
                                        var16 = var17.field6293;
                                    }
                                }
                                if (var16 != -1) {
                                    class157 var18 = new class157(var16);
                                    var18.field2228 = var0;
                                    var18.field2226 = var11;
                                    field4500.method1162(116, var18);
                                }
                            }
                        }
                    } else {
                        class447 var19 = class133.method996((byte) -19, var12 - 1);
                        int var20 = var19.field6293;
                        if (var19.field6307 != null) {
                            class447 var21 = var19.method2772(-113);
                            if (var21 != null) {
                                var20 = var21.field6293;
                            }
                        }
                        if (var20 != -1) {
                            class157 var22 = new class157(var20);
                            var22.field2228 = var0;
                            var22.field2226 = var11;
                            field4500.method1162(122, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4503[0].length; var2++) {
                for (int var3 = 0; var3 < field4503[0][0].length; var3++) {
                    class399 var4 = field4503[var1][var2][var3];
                    if (var4 != null) {
                        for (class121 var5 = (class121) var4.method2480(7904); var5 != null; var5 = (class121) var4.method2482(50)) {
                            if (var5.field1828 != null) {
                                for (int var6 = 0; var6 < var5.field1828.length; var6++) {
                                    class447 var7 = class133.method996((byte) -19, var5.field1828[var6] & 0xFFFF);
                                    int var8 = var7.field6293;
                                    if (var7.field6307 != null) {
                                        class447 var9 = var7.method2772(94);
                                        if (var9 != null) {
                                            var8 = var9.field6293;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class157 var10 = new class157(var8);
                                        var10.field2228 = ((field4518 >> 6) + var2) * 64 + var5.field1830 - field4518;
                                        var10.field2226 = ((field4514 >> 6) + var3) * 64 + var5.field1829 - field4514;
                                        field4500.method1162(119, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Lge;", line = 1120)
    public static final class104 method2026(int arg0, int arg1) {
        for (class104 var2 = (class104) field4489.method842((byte) -25); var2 != null; var2 = (class104) field4489.method836(36)) {
            if (var2.field1446 && var2.method784(8423, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lea;IIII)Ljm;", line = 1134)
    private static final class162 method2027(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class157 var5 = (class157) field4500.method1173(0); var5 != null; var5 = (class157) field4500.method1165(true)) {
            method2028(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4500;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lea;Lqg;IIII)V", line = 1147)
    private static final void method2028(class58 arg0, class157 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2227 = ((arg1.field2228 - field4512) * arg2 + arg4 >> 16) + field4504;
        arg1.field2232 = field4516 - ((arg1.field2226 - field4507) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()V", line = 1151)
    public static final void method2029() {
        field4522 = new byte[field4520 * field4501];
        field4521 = new byte[field4520 * field4501];
        field4502 = new byte[field4520 * field4501];
        field4519 = new short[field4520 * field4501];
        field4509 = new byte[field4520 * field4501];
        field4505 = new class109(1024);
        field4503 = new class399[3][field4520 >> 6][field4501 >> 6];
        field4510 = new int[class232.field3263 + 1];
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V", line = 1164)
    public static final void method2030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4512 = arg0 - field4518;
        field4508 = arg1 - field4514;
        field4517 = arg2 - field4518;
        field4507 = arg3 - field4514;
        field4504 = arg4;
        field4515 = arg5;
        field4506 = arg6;
        field4516 = arg7;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 1174)
    public static final void method2031(int arg0) {
        field4490 = (class104) field4489.method837((byte) -72, (long) arg0);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()V", line = 1187)
    public static final void method2032() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4494.field2132; var1++) {
            boolean var2 = field4490.method787(field4494.field2133[var1] >> 28 & 0x3, field4494.field2133[var1] >> 14 & 0x3FFF, field4494.field2133[var1] & 0x3FFF, var0, (byte) 64);
            if (var2) {
                class157 var3 = new class157(field4494.field2140[var1]);
                var3.field2228 = var0[1] - field4518;
                var3.field2226 = var0[2] - field4514;
                field4500.method1162(121, var3);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lea;IIIIIII[S[BZ)V", line = 1208)
    private static final void method2033(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method245(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4510[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method245(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class245.method1595(arg4, arg7 >> 6 & 0x3, arg2, var11, field4496, arg5, arg1, field4491, 125, var12, arg0, arg3, field4510[arg6]);
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
                class447 var18 = class133.method996((byte) -19, arg8[var16] & 0xFFFF);
                if (var18.field6317 == -1) {
                    int var19 = -3355444;
                    if (var18.field6297 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method224(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method184(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method224(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method184(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method224(arg1, arg2, arg4, -1, 0);
                            arg0.method184(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method224(var14, arg2, arg4, -1, 0);
                            arg0.method184(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method224(var14, arg2, arg4, -1, 0);
                            arg0.method184(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method224(arg1, arg2, arg4, -1, 0);
                            arg0.method184(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method184(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method184(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method184(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method184(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method184(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method184(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "()V", line = 1369)
    public static final void method2034() {
        field4522 = null;
        field4511 = null;
        field4513 = null;
        field4521 = null;
        field4502 = null;
        field4519 = null;
        field4509 = null;
        field4505 = null;
        field4503 = null;
        field4510 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lgf;III)I", line = 1382)
    private static final int method2035(class202 arg0, int arg1, int arg2, int arg3) {
        class71 var4 = class52.method422(arg1, 7513);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field997;
        if (var5 >= 0 && arg0.method1366(var5, -11039).field709) {
            var5 = -1;
        }
        int var9;
        if (var4.field1000 >= 0) {
            int var6 = var4.field1000;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class119.field1810[class408.method2524(class156.method1135(var8, 96, 13), 127) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class119.field1810[class408.method2524(class156.method1135(arg0.method1366(var5, -11039).field723, 96, 108), 127) & 0xFFFF] | 0xFF000000;
        } else if (var4.field995 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field995;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class119.field1810[class408.method2524(class156.method1135(var12, 96, 10), 127) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }
}
