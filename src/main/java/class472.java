import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class472 {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lew;")
    private static class270 field6806 = new class270(16);

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[S")
    private static short[] field6813 = new short[1];

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[B")
    private static byte[] field6816 = new byte[1];

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field6817 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field6818 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lmg;")
    public static class530 field6811 = new class530();

    @OriginalMember(owner = "client!od", name = "k", descriptor = "F")
    public static float field6810;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "F")
    public static float field6812;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lwn;")
    public static class175 field6801;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lhb;")
    public static class251 field6805;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lew;")
    private static class270 field6819;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Liv;")
    public static class288 field6803;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lrq;")
    private static class39 field6800;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ldk;")
    public static class421 field6802;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lek;")
    public static class431 field6814;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lrg;")
    public static class465 field6807;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lpk;")
    public static class77 field6808;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lm;")
    private static class80 field6804;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "[B")
    private static byte[] field6820;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[B")
    private static byte[] field6822;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "[B")
    private static byte[] field6824;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "[B")
    private static byte[] field6831;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "[B")
    private static byte[] field6840;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "[I")
    private static int[] field6837;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "[S")
    private static short[] field6827;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "[S")
    private static short[] field6839;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "[[[B")
    public static byte[][][] field6815;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "[[[Lgs;")
    private static class439[][][] field6825;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method2741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6828 = arg0 - field6838;
        field6829 = arg1 - field6835;
        field6836 = arg2 - field6838;
        field6830 = arg3 - field6835;
        field6834 = arg4;
        field6832 = arg5;
        field6826 = arg6;
        field6823 = arg7;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Lrg;", line = 13)
    public static final class465 method2742(int arg0) {
        return (class465) field6806.method1592((byte) -25, (long) arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lza;II)V", line = 18)
    public static final void method2743(class295 arg0, int arg1, int arg2) {
        class319 var3 = new class319(field6802.method2490(1, "area", field6807.field6708));
        int var4 = var3.method1869(-127);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1869(-122);
        }
        int var7 = var3.method1869(-100);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1869(-106);
        }
        while (true) {
            while (var3.field4360 < var3.field4336.length) {
                if (var3.method1869(-107) == 0) {
                    int var22 = var3.method1869(-76);
                    int var23 = var3.method1869(-121);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field6838;
                            int var27 = var23 * 64 + var25 - field6835;
                            method2750(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1869(-74);
                    int var29 = var3.method1869(-117);
                    int var30 = var3.method1869(-73);
                    int var31 = var3.method1869(-75);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field6838;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field6835;
                            method2750(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field6820 = new byte[field6833 * field6821];
            field6839 = new short[field6833 * field6821];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field6833 * field6821];
                for (int var13 = 0; var13 < field6825[var11].length; var13++) {
                    for (int var19 = 0; var19 < field6825[var11][0].length; var19++) {
                        class439 var20 = field6825[var11][var13][var19];
                        if (var20 != null) {
                            for (class158 var21 = (class158) var20.method2600((byte) -76); var21 != null; var21 = (class158) var20.method2601(114)) {
                                var12[(var19 * 64 + var21.field2410) * field6821 + var13 * 64 + var21.field2414] = (byte) var21.field2413;
                            }
                        }
                    }
                }
                method2747(var12, field6820, field6839, arg1, arg2);
                for (int var14 = 0; var14 < field6825[var11].length; var14++) {
                    for (int var15 = 0; var15 < field6825[var11][0].length; var15++) {
                        class439 var16 = field6825[var11][var14][var15];
                        if (var16 != null) {
                            for (class158 var17 = (class158) var16.method2600((byte) 9); var17 != null; var17 = (class158) var16.method2601(109)) {
                                int var18 = (var15 * 64 + var17.field2410) * field6821 + var14 * 64 + var17.field2414;
                                var17.field2413 = (field6820[var18] & 0xFF) << 16 | field6839[var18] & 0xFFFF;
                                if (var17.field2413 != 0) {
                                    var17.field2413 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2747(field6822, field6820, field6839, arg1, arg2);
            field6822 = null;
            method2745();
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 197)
    public static final void method2744() {
        field6822 = null;
        field6820 = null;
        field6839 = null;
        field6840 = null;
        field6824 = null;
        field6827 = null;
        field6831 = null;
        field6819 = null;
        field6825 = null;
        field6837 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()V", line = 211)
    private static final void method2745() {
        for (int var0 = 0; var0 < field6821; var0++) {
            for (int var11 = 0; var11 < field6833; var11++) {
                int var12 = field6827[field6821 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class448 var13 = (class448) field6819.method1592((byte) -25, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field6569.length; var14++) {
                                class103 var15 = field6808.method603((byte) 94, var13.field6569[var14] & 0xFFFF);
                                int var16 = var15.field1636;
                                if (var15.field1613 != null) {
                                    class103 var17 = var15.method795(-31036, field6801);
                                    if (var17 != null) {
                                        var16 = var17.field1636;
                                    }
                                }
                                if (var16 != -1) {
                                    class237 var18 = new class237(var16);
                                    var18.field3277 = var0;
                                    var18.field3274 = var11;
                                    field6811.method3139(0, var18);
                                }
                            }
                        }
                    } else {
                        class103 var19 = field6808.method603((byte) 115, var12 - 1);
                        int var20 = var19.field1636;
                        if (var19.field1613 != null) {
                            class103 var21 = var19.method795(-31036, field6801);
                            if (var21 != null) {
                                var20 = var21.field1636;
                            }
                        }
                        if (var20 != -1) {
                            class237 var22 = new class237(var20);
                            var22.field3277 = var0;
                            var22.field3274 = var11;
                            field6811.method3139(0, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field6825[0].length; var2++) {
                for (int var3 = 0; var3 < field6825[0][0].length; var3++) {
                    class439 var4 = field6825[var1][var2][var3];
                    if (var4 != null) {
                        for (class158 var5 = (class158) var4.method2600((byte) -75); var5 != null; var5 = (class158) var4.method2601(123)) {
                            if (var5.field2411 != null) {
                                for (int var6 = 0; var6 < var5.field2411.length; var6++) {
                                    class103 var7 = field6808.method603((byte) 103, var5.field2411[var6] & 0xFFFF);
                                    int var8 = var7.field1636;
                                    if (var7.field1613 != null) {
                                        class103 var9 = var7.method795(-31036, field6801);
                                        if (var9 != null) {
                                            var8 = var9.field1636;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class237 var10 = new class237(var8);
                                        var10.field3277 = ((field6838 >> 6) + var2) * 64 + var5.field2414 - field6838;
                                        var10.field3274 = ((field6835 >> 6) + var3) * 64 + var5.field2410 - field6835;
                                        field6811.method3139(0, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lza;IIII)V", line = 368)
    private static final void method2746(class295 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field6836 - field6828;
        int var6 = field6829 - field6830;
        if (field6836 < field6821) {
            var5++;
        }
        if (field6829 < field6833) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field6834;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field6834;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field6828 + var7;
                if (var52 >= 0 && var52 < field6821) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field6823 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field6823 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field6830 + var53;
                            int var58 = field6821 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field6833) {
                                var59 = (field6820[var58] & 0xFF) << 16 | field6839[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field6840[var58] & 0xFF;
                                var61 = field6827[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field6807.field6713 != -1) {
                                    var62 = field6807.field6713 | 0xFF000000;
                                } else if ((field6829 + var53 & 0x4) == (field6828 + var7 & 0x4)) {
                                    var62 = field6837[field6800.field588 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method508(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2759(arg0, var49, var54, var51, var56, var59, var60, field6824[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class448 var63 = (class448) field6819.method1592((byte) -25, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2759(arg0, var49, var54, var51, var56, var59, var60, field6824[var58], var63.field6569, var63.field6570, true);
                                }
                            } else {
                                field6813[0] = (short) (var61 - 1);
                                field6816[0] = field6831[var58];
                                method2759(arg0, var49, var54, var51, var56, var59, var60, field6824[var58], field6813, field6816, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field6823 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field6823 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field6807.field6713 != -1) {
                            var68 = field6807.field6713 | 0xFF000000;
                        } else if ((field6829 + var64 & 0x4) == (field6828 + var7 & 0x4)) {
                            var68 = field6837[field6800.field588 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method508(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field6834;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field6834;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field6828 + var8;
                if (var41 >= 0 && var41 < field6821) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field6823 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field6823 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field6830 + var42;
                            if (var46 >= 0 && var46 < field6833) {
                                int var47 = field6827[field6821 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2761(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class448 var48 = (class448) field6819.method1592((byte) -25, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2761(arg0, var38, var43, var40, var45, var48.field6569, var48.field6570);
                                    }
                                } else {
                                    field6813[0] = (short) (var47 - 1);
                                    field6816[0] = field6831[field6821 * var46 + var41];
                                    method2761(arg0, var38, var43, var40, var45, field6813, field6816);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field6828 >> 6;
        int var10 = field6830 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field6836 >> 6;
        int var12 = field6829 >> 6;
        if (var11 >= field6825[0].length) {
            var11 = field6825[0].length - 1;
        }
        if (var12 >= field6825[0][0].length) {
            var12 = field6825[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class439 var28 = field6825[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field6838 >> 6) + var14) * 64;
                        int var30 = ((field6835 >> 6) + var27) * 64;
                        for (class158 var31 = (class158) var28.method2600((byte) 122); var31 != null; var31 = (class158) var28.method2601(112)) {
                            int var32 = var31.field2414 + var29 - field6838 - field6828;
                            int var33 = var31.field2410 + var30 - field6835 - field6830;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field6834;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field6834;
                            int var36 = field6823 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field6823 - (arg2 * var33 + arg4 >> 16);
                            method2759(arg0, var34, var36, var35 - var34, var37 - var36, var31.field2413, var31.field2412 & 0xFF, var31.field2408, var31.field2411, var31.field2409, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class439 var17 = field6825[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field6838 >> 6) + var15) * 64;
                        int var19 = ((field6835 >> 6) + var16) * 64;
                        for (class158 var20 = (class158) var17.method2600((byte) 117); var20 != null; var20 = (class158) var17.method2601(126)) {
                            int var21 = var20.field2414 + var18 - field6838 - field6828;
                            int var22 = var20.field2410 + var19 - field6835 - field6830;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field6834;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field6834;
                            int var25 = field6823 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field6823 - (arg2 * var22 + arg4 >> 16);
                            method2761(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2411, var20.field2409);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([B[B[SII)V", line = 715)
    private static final void method2747(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field6833];
        int[] var6 = new int[field6833];
        int[] var7 = new int[field6833];
        int[] var8 = new int[field6833];
        int[] var9 = new int[field6833];
        for (int var10 = -5; var10 < field6821; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field6833; var13++) {
                int var10002;
                if (var11 < field6821) {
                    int var28 = arg0[field6821 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class479 var29 = field6804.method619(var28 - 1, (byte) -90);
                        var5[var13] += var29.field6930;
                        var6[var13] += var29.field6921;
                        var7[var13] += var29.field6919;
                        var8[var13] += var29.field6920;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field6821 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class479 var31 = field6804.method619(var30 - 1, (byte) -114);
                        var5[var13] -= var31.field6930;
                        var6[var13] -= var31.field6921;
                        var7[var13] -= var31.field6919;
                        var8[var13] -= var31.field6920;
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
                for (int var19 = -5; var19 < field6833; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field6833) {
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
                        if ((arg0[field6821 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field6821 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class458.method2673(var16 / var18, false, var15 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field6821 * var19 + var10;
                            int var27 = class188.field2769[class156.method1123(class321.method1906(96, (byte) 103, var25), -106) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lza;Lti;IIII)V", line = 858)
    private static final void method2748(class295 arg0, class237 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3279 = ((arg1.field3277 - field6828) * arg2 + arg4 >> 16) + field6834;
        arg1.field3286 = field6823 - ((arg1.field3274 - field6830) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lza;)Lmg;", line = 864)
    public static final class530 method2749(class295 arg0) {
        int var1 = field6836 - field6828;
        int var2 = field6829 - field6830;
        int var3 = (field6826 - field6834 << 16) / var1;
        int var4 = (field6823 - field6832 << 16) / var2;
        return method2751(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lza;Lsv;IIII[I[I)V", line = 877)
    private static final void method2750(class295 arg0, class319 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1869(-116);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1869(-116);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field6822[field6821 * arg5 + arg4] = (byte) var11;
                    field6840[field6821 * arg5 + arg4] = 0;
                } else {
                    field6840[field6821 * arg5 + arg4] = (byte) var11;
                    field6824[field6821 * arg5 + arg4] = 0;
                    field6822[field6821 * arg5 + arg4] = arg1.method1894(-2018);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1869(-99);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1869(-109);
                var18 = arg1.method1869(-105);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1869(-121);
            }
            if (var15 == 0) {
                field6822[field6821 * arg5 + arg4] = (byte) var16;
                field6840[field6821 * arg5 + arg4] = (byte) var17;
                field6824[field6821 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field6827[field6821 * arg5 + arg4] = (short) (arg1.method1844(-120) + 1);
                    field6831[field6821 * arg5 + arg4] = arg1.method1894(-2018);
                } else if (var19 > 1) {
                    field6827[field6821 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1844(-112);
                        var21[var22] = arg1.method1894(-2018);
                    }
                    field6819.method1586(new class448(var20, var21), (long) (arg4 << 16 | arg5), 1);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1844(-123);
                        var24[var25] = arg1.method1894(-2018);
                    }
                }
                if (field6825[var15 - 1][arg2 - (field6838 >> 6)][arg3 - (field6835 >> 6)] == null) {
                    field6825[var15 - 1][arg2 - (field6838 >> 6)][arg3 - (field6835 >> 6)] = new class439();
                }
                class158 var26 = new class158(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field6825[var15 - 1][arg2 - (field6838 >> 6)][arg3 - (field6835 >> 6)].method2599(1256, var26);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Lza;IIII)Lmg;", line = 1013)
    private static final class530 method2751(class295 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class237 var5 = (class237) field6811.method3137(0); var5 != null; var5 = (class237) field6811.method3132(0)) {
            method2748(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field6811;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lvv;", line = 1025)
    public static final class531 method2752(int arg0, int arg1) {
        class531 var2 = new class531();
        for (class465 var3 = (class465) field6806.method1588(10); var3 != null; var3 = (class465) field6806.method1582(-126)) {
            if (var3.field6709 && var3.method2694(arg0, arg1, -1)) {
                var2.method3150(16711680, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()V", line = 1041)
    public static final void method2753() {
        field6822 = new byte[field6833 * field6821];
        field6840 = new byte[field6833 * field6821];
        field6824 = new byte[field6833 * field6821];
        field6827 = new short[field6833 * field6821];
        field6831 = new byte[field6833 * field6821];
        field6819 = new class270(1024);
        field6825 = new class439[3][field6821 >> 6][field6833 >> 6];
        field6837 = new int[field6800.field587 + 1];
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ldk;Lrq;Lm;Lpk;Liv;Lhb;Lwn;)V", line = 1051)
    public static final void method2754(class421 arg0, class39 arg1, class80 arg2, class77 arg3, class288 arg4, class251 arg5, class175 arg6) {
        field6802 = arg0;
        field6800 = arg1;
        field6804 = arg2;
        field6808 = arg3;
        field6803 = arg4;
        field6805 = arg5;
        field6801 = arg6;
        field6806.method1583(50);
        int var7 = field6802.method2488("details", false);
        int[] var8 = field6802.method2499(0, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class465 var10 = class459.method2677(field6802, var7, -2, var8[var9]);
                field6806.method1586(var10, (long) var10.field6714, 1);
            }
        }
        class482.method2863(0, false, true);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()V", line = 1081)
    public static void method2755() {
        field6800 = null;
        field6804 = null;
        field6808 = null;
        field6803 = null;
        field6805 = null;
        field6801 = null;
        field6807 = null;
        field6802 = null;
        field6806 = null;
        field6815 = null;
        field6813 = null;
        field6816 = null;
        field6814 = null;
        field6811 = null;
        field6837 = null;
        field6822 = null;
        field6820 = null;
        field6839 = null;
        field6840 = null;
        field6824 = null;
        field6827 = null;
        field6831 = null;
        field6819 = null;
        field6825 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Lza;)V", line = 1109)
    public static final void method2756(class295 arg0) {
        int var1 = field6836 - field6828;
        int var2 = field6829 - field6830;
        int var3 = (field6826 - field6834 << 16) / var1;
        int var4 = (field6823 - field6832 << 16) / var2;
        method2746(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 1119)
    public static final void method2757(int arg0) {
        field6807 = (class465) field6806.method1592((byte) -25, (long) arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ll;III)I", line = 1123)
    private static final int method2758(class127 arg0, int arg1, int arg2, int arg3) {
        class534 var4 = field6800.method272(arg1, (byte) -7);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field7853;
        if (var5 >= 0 && arg0.method914(false, var5).field3391) {
            var5 = -1;
        }
        int var9;
        if (var4.field7856 >= 0) {
            int var6 = var4.field7856;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class188.field2769[class156.method1123(class452.method2655(96, var8, (byte) 90), -111) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class188.field2769[class156.method1123(class452.method2655(96, arg0.method914(false, var5).field3377, (byte) 78), -99) & 0xFFFF] | 0xFF000000;
        } else if (var4.field7857 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field7857;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class188.field2769[class156.method1123(class452.method2655(96, var12, (byte) 102), -96) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lza;IIIIIII[S[BZ)V", line = 1179)
    private static final void method2759(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method508(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field6837[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method508(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class416.method2461(arg3, arg1, arg5, arg0, field6815, var12, arg2, arg4, var11, field6809, field6837[arg6], (byte) 70, arg7 >> 6 & 0x3);
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
                class103 var18 = field6808.method603((byte) 90, arg8[var16] & 0xFFFF);
                if (var18.field1649 == -1) {
                    int var19 = -3355444;
                    if (var18.field1697 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method556(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method543(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method556(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method543(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method556(arg1, arg2, arg4, -1, 0);
                            arg0.method543(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method556(var14, arg2, arg4, -1, 0);
                            arg0.method543(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method556(var14, arg2, arg4, -1, 0);
                            arg0.method543(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method556(arg1, arg2, arg4, -1, 0);
                            arg0.method543(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method543(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method543(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method543(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method543(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method543(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method543(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ll;II)V", line = 1342)
    public static final void method2760(class127 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field6800.field587; var3++) {
            field6837[var3 + 1] = method2758(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lza;IIII[S[B)V", line = 1351)
    private static final void method2761(class295 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class103 var8 = field6808.method603((byte) 98, arg5[var7] & 0xFFFF);
            int var9 = var8.field1649;
            if (var9 != -1) {
                class523 var10 = field6805.method1496((byte) 123, var9);
                class359 var11 = var10.method3112(var8.field1616 ? arg6[var7] >> 6 & 0x3 : 0, var8.field1655 ? var8.field1627 : false, (byte) 83, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method204() >> 2;
                    int var13 = arg4 * var11.method207() >> 2;
                    if (var10.field7651) {
                        int var14 = var8.field1639;
                        int var15 = var8.field1695;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field7660 == 0) {
                            var11.method2140(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method206(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field7660 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)Lrg;", line = 1412)
    public static final class465 method2762(int arg0, int arg1) {
        for (class465 var2 = (class465) field6806.method1588(125); var2 != null; var2 = (class465) field6806.method1582(-107)) {
            if (var2.field6709 && var2.method2694(arg0, arg1, -1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "()V", line = 1426)
    public static final void method2763() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field6814.field6245; var1++) {
            boolean var2 = field6807.method2697(field6814.field6243[var1] >> 28 & 0x3, field6814.field6243[var1] >> 14 & 0x3FFF, -97, field6814.field6243[var1] & 0x3FFF, var0);
            if (var2) {
                class237 var3 = new class237(field6814.field6240[var1]);
                var3.field3277 = var0[1] - field6838;
                var3.field3274 = var0[2] - field6835;
                field6811.method3139(0, var3);
            }
        }
    }
}
