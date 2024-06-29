import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class354 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lec;")
    private static class129 field4827 = new class129(16);

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field4835 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[S")
    private static short[] field4830 = new short[1];

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field4837 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[B")
    private static byte[] field4831 = new byte[1];

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Laq;")
    public static class90 field4833 = new class90();

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "F")
    public static float field4834;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "F")
    public static float field4838;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Lec;")
    private static class129 field4851;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lnq;")
    public static class268 field4828;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lgi;")
    public static class405 field4829;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Luh;")
    public static class92 field4836;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[B")
    private static byte[] field4842;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "[B")
    private static byte[] field4845;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "[B")
    private static byte[] field4849;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "[B")
    private static byte[] field4850;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "[B")
    private static byte[] field4856;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[I")
    private static int[] field4855;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "[S")
    private static short[] field4853;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "[S")
    private static short[] field4860;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[[[B")
    public static byte[][][] field4832;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[[[Lwd;")
    private static class149[][][] field4852;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Luo;Lkh;IIII[I[I)V")
    private static final void method2258(class345 arg0, class11 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method172((byte) 52);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method172((byte) 52);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4856[field4841 * arg5 + arg4] = (byte) var11;
                    field4849[field4841 * arg5 + arg4] = 0;
                } else {
                    field4849[field4841 * arg5 + arg4] = (byte) var11;
                    field4845[field4841 * arg5 + arg4] = 0;
                    field4856[field4841 * arg5 + arg4] = arg1.method162(-4436);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method172((byte) 52);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method172((byte) 52);
                var18 = arg1.method172((byte) 52);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method172((byte) 52);
            }
            if (var15 == 0) {
                field4856[field4841 * arg5 + arg4] = (byte) var16;
                field4849[field4841 * arg5 + arg4] = (byte) var17;
                field4845[field4841 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4853[field4841 * arg5 + arg4] = (short) (arg1.method174(255) + 1);
                    field4850[field4841 * arg5 + arg4] = arg1.method162(-4436);
                } else if (var19 > 1) {
                    field4853[field4841 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method174(255);
                        var21[var22] = arg1.method162(-4436);
                    }
                    field4851.method883((byte) -54, (long) (arg4 << 16 | arg5), new class168(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method174(255);
                        var24[var25] = arg1.method162(-4436);
                    }
                }
                if (field4852[var15 - 1][arg2 - (field4843 >> 6)][arg3 - (field4858 >> 6)] == null) {
                    field4852[var15 - 1][arg2 - (field4843 >> 6)][arg3 - (field4858 >> 6)] = new class149();
                }
                class257 var26 = new class257(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4852[var15 - 1][arg2 - (field4843 >> 6)][arg3 - (field4858 >> 6)].method1009(var26, false);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lfk;")
    public static final class393 method2259(int arg0, int arg1) {
        class393 var2 = new class393();
        for (class405 var3 = (class405) field4827.method885(-72); var3 != null; var3 = (class405) field4827.method881((byte) -68)) {
            if (var3.field5747 && var3.method2541((byte) 47, arg0, arg1)) {
                var2.method2478(var3, false);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4847 = arg0 - field4843;
        field4840 = arg1 - field4858;
        field4861 = arg2 - field4843;
        field4854 = arg3 - field4858;
        field4848 = arg4;
        field4859 = arg5;
        field4846 = arg6;
        field4844 = arg7;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
    public static final void method2261() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4836.field1285; var1++) {
            boolean var2 = field4829.method2539(var0, Integer.MAX_VALUE, field4836.field1286[var1] >> 14 & 0x3FFF, field4836.field1286[var1] >> 28 & 0x3, field4836.field1286[var1] & 0x3FFF);
            if (var2) {
                class62 var3 = new class62(field4836.field1284[var1]);
                var3.field852 = var0[1] - field4843;
                var3.field858 = var0[2] - field4858;
                field4833.method643(var3, -86);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lja;III)I")
    private static final int method2262(class152 arg0, int arg1, int arg2, int arg3) {
        class361 var4 = class39.method362((byte) 3, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4991;
        if (var5 >= 0 && arg0.method469(var5, (byte) -92).field6481) {
            var5 = -1;
        }
        int var9;
        if (var4.field4994 >= 0) {
            int var6 = var4.field4994;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class15.field288[class194.method1257(23213, class296.method1935(96, (byte) -121, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class15.field288[class194.method1257(23213, class296.method1935(96, (byte) -115, arg0.method469(var5, (byte) -63).field6489)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4989 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4989;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class15.field288[class194.method1257(23213, class296.method1935(96, (byte) -100, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "()V")
    private static final void method2263() {
        for (int var0 = 0; var0 < field4841; var0++) {
            for (int var11 = 0; var11 < field4857; var11++) {
                int var12 = field4853[field4841 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class168 var13 = (class168) field4851.method886((long) (var0 << 16 | var11), 25651);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field2315.length; var14++) {
                                class64 var15 = class375.method2395((byte) 38, var13.field2315[var14] & 0xFFFF);
                                int var16 = var15.field899;
                                if (var15.field908 != null) {
                                    class64 var17 = var15.method491((byte) -127);
                                    if (var17 != null) {
                                        var16 = var17.field899;
                                    }
                                }
                                if (var16 != -1) {
                                    class62 var18 = new class62(var16);
                                    var18.field852 = var0;
                                    var18.field858 = var11;
                                    field4833.method643(var18, -50);
                                }
                            }
                        }
                    } else {
                        class64 var19 = class375.method2395((byte) 102, var12 - 1);
                        int var20 = var19.field899;
                        if (var19.field908 != null) {
                            class64 var21 = var19.method491((byte) -76);
                            if (var21 != null) {
                                var20 = var21.field899;
                            }
                        }
                        if (var20 != -1) {
                            class62 var22 = new class62(var20);
                            var22.field852 = var0;
                            var22.field858 = var11;
                            field4833.method643(var22, -109);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4852[0].length; var2++) {
                for (int var3 = 0; var3 < field4852[0][0].length; var3++) {
                    class149 var4 = field4852[var1][var2][var3];
                    if (var4 != null) {
                        for (class257 var5 = (class257) var4.method1005(-1); var5 != null; var5 = (class257) var4.method1012((byte) 96)) {
                            if (var5.field3595 != null) {
                                for (int var6 = 0; var6 < var5.field3595.length; var6++) {
                                    class64 var7 = class375.method2395((byte) 75, var5.field3595[var6] & 0xFFFF);
                                    int var8 = var7.field899;
                                    if (var7.field908 != null) {
                                        class64 var9 = var7.method491((byte) -84);
                                        if (var9 != null) {
                                            var8 = var9.field899;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class62 var10 = new class62(var8);
                                        var10.field852 = ((field4843 >> 6) + var2) * 64 + var5.field3600 - field4843;
                                        var10.field858 = ((field4858 >> 6) + var3) * 64 + var5.field3597 - field4858;
                                        field4833.method643(var10, -127);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static final void method2264(int arg0) {
        field4829 = (class405) field4827.method886((long) arg0, 25651);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Luo;)Laq;")
    public static final class90 method2265(class345 arg0) {
        int var1 = field4861 - field4847;
        int var2 = field4840 - field4854;
        int var3 = (field4846 - field4848 << 16) / var1;
        int var4 = (field4844 - field4859 << 16) / var2;
        return method2274(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Luo;II)V")
    public static final void method2266(class345 arg0, int arg1, int arg2) {
        class11 var3 = new class11(field4828.method1737("area", -1, field4829.field5748));
        int var4 = var3.method172((byte) 52);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method172((byte) 52);
        }
        int var7 = var3.method172((byte) 52);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method172((byte) 52);
        }
        while (true) {
            while (var3.field191 < var3.field230.length) {
                if (var3.method172((byte) 52) == 0) {
                    int var22 = var3.method172((byte) 52);
                    int var23 = var3.method172((byte) 52);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4843;
                            int var27 = var23 * 64 + var25 - field4858;
                            method2258(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method172((byte) 52);
                    int var29 = var3.method172((byte) 52);
                    int var30 = var3.method172((byte) 52);
                    int var31 = var3.method172((byte) 52);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4843;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4858;
                            method2258(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4842 = new byte[field4857 * field4841];
            field4860 = new short[field4857 * field4841];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4857 * field4841];
                for (int var13 = 0; var13 < field4852[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4852[var11][0].length; var19++) {
                        class149 var20 = field4852[var11][var13][var19];
                        if (var20 != null) {
                            for (class257 var21 = (class257) var20.method1005(-1); var21 != null; var21 = (class257) var20.method1012((byte) -66)) {
                                var12[(var19 * 64 + var21.field3597) * field4841 + var13 * 64 + var21.field3600] = (byte) var21.field3598;
                            }
                        }
                    }
                }
                method2269(var12, field4842, field4860, arg1, arg2);
                for (int var14 = 0; var14 < field4852[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4852[var11][0].length; var15++) {
                        class149 var16 = field4852[var11][var14][var15];
                        if (var16 != null) {
                            for (class257 var17 = (class257) var16.method1005(-1); var17 != null; var17 = (class257) var16.method1012((byte) -108)) {
                                int var18 = (var15 * 64 + var17.field3597) * field4841 + var14 * 64 + var17.field3600;
                                var17.field3598 = (field4842[var18] & 0xFF) << 16 | field4860[var18] & 0xFFFF;
                                if (var17.field3598 != 0) {
                                    var17.field3598 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2269(field4856, field4842, field4860, arg1, arg2);
            field4856 = null;
            method2263();
            return;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "()V")
    public static void method2267() {
        field4829 = null;
        field4828 = null;
        field4827 = null;
        field4832 = null;
        field4830 = null;
        field4831 = null;
        field4836 = null;
        field4833 = null;
        field4855 = null;
        field4856 = null;
        field4842 = null;
        field4860 = null;
        field4849 = null;
        field4845 = null;
        field4853 = null;
        field4850 = null;
        field4851 = null;
        field4852 = null;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)Lgi;")
    public static final class405 method2268(int arg0, int arg1) {
        for (class405 var2 = (class405) field4827.method885(-94); var2 != null; var2 = (class405) field4827.method881((byte) -68)) {
            if (var2.field5747 && var2.method2541((byte) 47, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2269(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4857];
        int[] var6 = new int[field4857];
        int[] var7 = new int[field4857];
        int[] var8 = new int[field4857];
        int[] var9 = new int[field4857];
        for (int var10 = -5; var10 < field4841; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4857; var13++) {
                int var10002;
                if (var11 < field4841) {
                    int var28 = arg0[field4841 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class40 var29 = class194.method1252(var28 - 1, false);
                        var5[var13] += var29.field576;
                        var6[var13] += var29.field577;
                        var7[var13] += var29.field580;
                        var8[var13] += var29.field585;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4841 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class40 var31 = class194.method1252(var30 - 1, false);
                        var5[var13] -= var31.field576;
                        var6[var13] -= var31.field577;
                        var7[var13] -= var31.field580;
                        var8[var13] -= var31.field585;
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
                for (int var19 = -5; var19 < field4857; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4857) {
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
                        if ((arg0[field4841 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4841 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class76.method562(92, var15 / var18, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4841 * var19 + var10;
                            int var27 = class15.field288[class194.method1257(23213, class148.method1001(var25, 96, 7)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Luo;IIII)V")
    private static final void method2270(class345 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4861 - field4847;
        int var6 = field4840 - field4854;
        if (field4861 < field4841) {
            var5++;
        }
        if (field4840 < field4857) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4848;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4848;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4847 + var7;
                if (var52 >= 0 && var52 < field4841) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4844 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4844 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4854 + var53;
                            int var58 = field4841 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4857) {
                                var59 = (field4842[var58] & 0xFF) << 16 | field4860[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4849[var58] & 0xFF;
                                var61 = field4853[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4829.field5758 != -1) {
                                    var62 = field4829.field5758 | 0xFF000000;
                                } else if ((field4847 + var7 & 0x4) == (field4840 + var53 & 0x4)) {
                                    var62 = field4855[class56.field772 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method56(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2280(arg0, var49, var54, var51, var56, var59, var60, field4845[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class168 var63 = (class168) field4851.method886((long) (var52 << 16 | var57), 25651);
                                if (var63 != null) {
                                    method2280(arg0, var49, var54, var51, var56, var59, var60, field4845[var58], var63.field2315, var63.field2314, true);
                                }
                            } else {
                                field4830[0] = (short) (var61 - 1);
                                field4831[0] = field4850[var58];
                                method2280(arg0, var49, var54, var51, var56, var59, var60, field4845[var58], field4830, field4831, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4844 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4844 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4829.field5758 != -1) {
                            var68 = field4829.field5758 | 0xFF000000;
                        } else if ((field4847 + var7 & 0x4) == (field4840 + var64 & 0x4)) {
                            var68 = field4855[class56.field772 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method56(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4848;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4848;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4847 + var8;
                if (var41 >= 0 && var41 < field4841) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4844 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4844 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4854 + var42;
                            if (var46 >= 0 && var46 < field4857) {
                                int var47 = field4853[field4841 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2278(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class168 var48 = (class168) field4851.method886((long) (var41 << 16 | var46), 25651);
                                    if (var48 != null) {
                                        method2278(arg0, var38, var43, var40, var45, var48.field2315, var48.field2314);
                                    }
                                } else {
                                    field4830[0] = (short) (var47 - 1);
                                    field4831[0] = field4850[field4841 * var46 + var41];
                                    method2278(arg0, var38, var43, var40, var45, field4830, field4831);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4847 >> 6;
        int var10 = field4854 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4861 >> 6;
        int var12 = field4840 >> 6;
        if (var11 >= field4852[0].length) {
            var11 = field4852[0].length - 1;
        }
        if (var12 >= field4852[0][0].length) {
            var12 = field4852[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class149 var28 = field4852[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4843 >> 6) + var14) * 64;
                        int var30 = ((field4858 >> 6) + var27) * 64;
                        for (class257 var31 = (class257) var28.method1005(-1); var31 != null; var31 = (class257) var28.method1012((byte) -126)) {
                            int var32 = var31.field3600 + var29 - field4843 - field4847;
                            int var33 = var31.field3597 + var30 - field4858 - field4854;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4848;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4848;
                            int var36 = field4844 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4844 - (arg2 * var33 + arg4 >> 16);
                            method2280(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3598, var31.field3599 & 0xFF, var31.field3596, var31.field3595, var31.field3601, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class149 var17 = field4852[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4843 >> 6) + var15) * 64;
                        int var19 = ((field4858 >> 6) + var16) * 64;
                        for (class257 var20 = (class257) var17.method1005(-1); var20 != null; var20 = (class257) var17.method1012((byte) -108)) {
                            int var21 = var20.field3600 + var18 - field4843 - field4847;
                            int var22 = var20.field3597 + var19 - field4858 - field4854;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4848;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4848;
                            int var25 = field4844 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4844 - (arg2 * var22 + arg4 >> 16);
                            method2278(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3595, var20.field3601);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Luo;Lco;IIII)V")
    private static final void method2271(class345 arg0, class62 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field848 = ((arg1.field852 - field4847) * arg2 + arg4 >> 16) + field4848;
        arg1.field849 = field4844 - ((arg1.field858 - field4854) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)Lgi;")
    public static final class405 method2272(int arg0) {
        return (class405) field4827.method886((long) arg0, 25651);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Luo;)V")
    public static final void method2273(class345 arg0) {
        int var1 = field4861 - field4847;
        int var2 = field4840 - field4854;
        int var3 = (field4846 - field4848 << 16) / var1;
        int var4 = (field4844 - field4859 << 16) / var2;
        method2270(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Luo;IIII)Laq;")
    private static final class90 method2274(class345 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class62 var5 = (class62) field4833.method646(48); var5 != null; var5 = (class62) field4833.method641(false)) {
            method2271(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4833;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lnq;)V")
    public static final void method2275(class268 arg0) {
        field4828 = arg0;
        field4827.method888(126);
        int var1 = field4828.method1751(69, "details");
        int[] var2 = field4828.method1750((byte) -121, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class405 var4 = class452.method2804(var1, field4828, var2[var3], 1);
            field4827.method883((byte) -54, (long) var4.field5750, var4);
        }
        class14.method231(false, true, (byte) -55);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "()V")
    public static final void method2276() {
        field4856 = new byte[field4857 * field4841];
        field4849 = new byte[field4857 * field4841];
        field4845 = new byte[field4857 * field4841];
        field4853 = new short[field4857 * field4841];
        field4850 = new byte[field4857 * field4841];
        field4851 = new class129(1024);
        field4852 = new class149[3][field4841 >> 6][field4857 >> 6];
        field4855 = new int[class1.field19 + 1];
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "()V")
    public static final void method2277() {
        field4856 = null;
        field4842 = null;
        field4860 = null;
        field4849 = null;
        field4845 = null;
        field4853 = null;
        field4850 = null;
        field4851 = null;
        field4852 = null;
        field4855 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Luo;IIII[S[B)V")
    private static final void method2278(class345 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class64 var8 = class375.method2395((byte) 49, arg5[var7] & 0xFFFF);
            int var9 = var8.field871;
            if (var9 != -1) {
                class322 var10 = class171.method1123(var9, 63);
                class226 var11 = var10.method2077(arg0, -21177, var8.field877 ? arg6[var7] >> 6 & 0x3 : 0, var8.field936 ? var8.field900 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method597() >> 2;
                    int var13 = arg4 * var11.method596() >> 2;
                    if (var10.field4422) {
                        int var14 = var8.field872;
                        int var15 = var8.field950;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4418 == 0) {
                            var11.method1498(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method588(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field4418 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lja;II)V")
    public static final void method2279(class152 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class1.field19; var3++) {
            field4855[var3 + 1] = method2262(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Luo;IIIIIII[S[BZ)V")
    private static final void method2280(class345 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method56(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4855[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method56(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class98.method708(field4832, arg3, arg7 >> 6 & 0x3, arg5, arg2, field4855[arg6], arg1, arg0, var12, arg4, (byte) -114, var11, field4839);
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
                class64 var18 = class375.method2395((byte) 46, arg8[var16] & 0xFFFF);
                if (var18.field871 == -1) {
                    int var19 = -3355444;
                    if (var18.field922 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method138(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method42(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method138(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method42(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method138(arg1, arg2, arg4, -1, 0);
                            arg0.method42(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method138(var14, arg2, arg4, -1, 0);
                            arg0.method42(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method138(var14, arg2, arg4, -1, 0);
                            arg0.method42(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method138(arg1, arg2, arg4, -1, 0);
                            arg0.method42(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method42(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method42(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method42(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method42(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method42(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method42(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }
}
