import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class230 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljr;")
    private static class357 field2947 = new class357(16);

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "[S")
    private static short[] field2957 = new short[1];

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2956 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field2958 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "[B")
    private static byte[] field2961 = new byte[1];

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Ltu;")
    public static class7 field2953 = new class7();

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "F")
    public static float field2952;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "F")
    public static float field2954;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lmi;")
    public static class153 field2944;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Ldt;")
    public static class164 field2950;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Lbo;")
    public static class179 field2948;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Ldn;")
    public static class201 field2946;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lji;")
    public static class249 field2949;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lvn;")
    private static class261 field2943;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lce;")
    public static class325 field2945;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Ljr;")
    private static class357 field2968;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Ler;")
    private static class4 field2951;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Ltq;")
    public static class67 field2959;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "[B")
    private static byte[] field2962;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "[B")
    private static byte[] field2967;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "[B")
    private static byte[] field2969;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "[B")
    private static byte[] field2974;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "[B")
    private static byte[] field2979;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "[I")
    private static int[] field2965;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "[S")
    private static short[] field2963;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "[S")
    private static short[] field2975;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[[[B")
    public static byte[][][] field2955;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "[[[Lcr;")
    private static class362[][][] field2966;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqa;II)V", line = 5)
    public static final void method1449(class129 arg0, int arg1, int arg2) {
        class88 var3 = new class88(field2946.method1300(field2945.field4172, (byte) 115, "area"));
        int var4 = var3.method617(2);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method617(2);
        }
        int var7 = var3.method617(2);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method617(2);
        }
        while (true) {
            while (var3.field1176 < var3.field1223.length) {
                if (var3.method617(2) == 0) {
                    int var22 = var3.method617(2);
                    int var23 = var3.method617(2);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2983;
                            int var27 = var23 * 64 + var25 - field2971;
                            method1450(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method617(2);
                    int var29 = var3.method617(2);
                    int var30 = var3.method617(2);
                    int var31 = var3.method617(2);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2983;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2971;
                            method1450(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2962 = new byte[field2978 * field2970];
            field2963 = new short[field2978 * field2970];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2978 * field2970];
                for (int var13 = 0; var13 < field2966[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2966[var11][0].length; var19++) {
                        class362 var20 = field2966[var11][var13][var19];
                        if (var20 != null) {
                            for (class369 var21 = (class369) var20.method2122(0); var21 != null; var21 = (class369) var20.method2129(-105)) {
                                var12[(var19 * 64 + var21.field4746) * field2970 + var13 * 64 + var21.field4749] = (byte) var21.field4747;
                            }
                        }
                    }
                }
                method1457(var12, field2962, field2963, arg1, arg2);
                for (int var14 = 0; var14 < field2966[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2966[var11][0].length; var15++) {
                        class362 var16 = field2966[var11][var14][var15];
                        if (var16 != null) {
                            for (class369 var17 = (class369) var16.method2122(0); var17 != null; var17 = (class369) var16.method2129(108)) {
                                int var18 = (var15 * 64 + var17.field4746) * field2970 + var14 * 64 + var17.field4749;
                                var17.field4747 = (field2962[var18] & 0xFF) << 16 | field2963[var18] & 0xFFFF;
                                if (var17.field4747 != 0) {
                                    var17.field4747 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1457(field2979, field2962, field2963, arg1, arg2);
            field2979 = null;
            method1461();
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqa;Lbt;IIII[I[I)V", line = 184)
    private static final void method1450(class129 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method617(2);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method617(2);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2979[field2970 * arg5 + arg4] = (byte) var11;
                    field2974[field2970 * arg5 + arg4] = 0;
                } else {
                    field2974[field2970 * arg5 + arg4] = (byte) var11;
                    field2969[field2970 * arg5 + arg4] = 0;
                    field2979[field2970 * arg5 + arg4] = arg1.method575(-32);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method617(2);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method617(2);
                var18 = arg1.method617(2);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method617(2);
            }
            if (var15 == 0) {
                field2979[field2970 * arg5 + arg4] = (byte) var16;
                field2974[field2970 * arg5 + arg4] = (byte) var17;
                field2969[field2970 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2975[field2970 * arg5 + arg4] = (short) (arg1.method568((byte) 110) + 1);
                    field2967[field2970 * arg5 + arg4] = arg1.method575(-69);
                } else if (var19 > 1) {
                    field2975[field2970 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method568((byte) 110);
                        var21[var22] = arg1.method575(-100);
                    }
                    field2968.method2096((long) (arg4 << 16 | arg5), new class49(var20, var21), (byte) 76);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method568((byte) 110);
                        var24[var25] = arg1.method575(-69);
                    }
                }
                if (field2966[var15 - 1][arg2 - (field2983 >> 6)][arg3 - (field2971 >> 6)] == null) {
                    field2966[var15 - 1][arg2 - (field2983 >> 6)][arg3 - (field2971 >> 6)] = new class362();
                }
                class369 var26 = new class369(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2966[var15 - 1][arg2 - (field2983 >> 6)][arg3 - (field2971 >> 6)].method2124(var26, -97);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lvi;", line = 323)
    public static final class476 method1451(int arg0, int arg1) {
        class476 var2 = new class476();
        for (class325 var3 = (class325) field2947.method2087(0); var3 != null; var3 = (class325) field2947.method2091(-123)) {
            if (var3.field4163 && var3.method1935(-105, arg0, arg1)) {
                var2.method2858(15, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqa;IIII)Ltu;", line = 340)
    private static final class7 method1452(class129 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class343 var5 = (class343) field2953.method49(-15); var5 != null; var5 = (class343) field2953.method46((byte) 100)) {
            method1470(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2953;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lce;", line = 350)
    public static final class325 method1453(int arg0) {
        return (class325) field2947.method2085((long) arg0, -5423);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Lce;", line = 355)
    public static final class325 method1454(int arg0, int arg1) {
        for (class325 var2 = (class325) field2947.method2087(0); var2 != null; var2 = (class325) field2947.method2091(-125)) {
            if (var2.field4163 && var2.method1935(-102, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 368)
    public static void method1455() {
        field2951 = null;
        field2943 = null;
        field2948 = null;
        field2950 = null;
        field2949 = null;
        field2944 = null;
        field2945 = null;
        field2946 = null;
        field2947 = null;
        field2955 = null;
        field2957 = null;
        field2961 = null;
        field2959 = null;
        field2953 = null;
        field2965 = null;
        field2979 = null;
        field2962 = null;
        field2963 = null;
        field2974 = null;
        field2969 = null;
        field2975 = null;
        field2967 = null;
        field2968 = null;
        field2966 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ldn;Ler;Lvn;Lbo;Ldt;Lji;Lmi;)V", line = 396)
    public static final void method1456(class201 arg0, class4 arg1, class261 arg2, class179 arg3, class164 arg4, class249 arg5, class153 arg6) {
        field2946 = arg0;
        field2951 = arg1;
        field2943 = arg2;
        field2948 = arg3;
        field2950 = arg4;
        field2949 = arg5;
        field2944 = arg6;
        field2947.method2088((byte) 116);
        int var7 = field2946.method1297("details", -5105);
        int[] var8 = field2946.method1292(-85, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class325 var10 = class72.method411(var8[var9], field2946, false, var7);
            field2947.method2096((long) var10.field4164, var10, (byte) 76);
        }
        class212.method1357(false, -11116, true);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([B[B[SII)V", line = 423)
    private static final void method1457(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2978];
        int[] var6 = new int[field2978];
        int[] var7 = new int[field2978];
        int[] var8 = new int[field2978];
        int[] var9 = new int[field2978];
        for (int var10 = -5; var10 < field2970; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2978; var13++) {
                int var10002;
                if (var11 < field2970) {
                    int var28 = arg0[field2970 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class2 var29 = field2943.method1639(var28 - 1, 2);
                        var5[var13] += var29.field10;
                        var6[var13] += var29.field17;
                        var7[var13] += var29.field18;
                        var8[var13] += var29.field14;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2970 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class2 var31 = field2943.method1639(var30 - 1, 2);
                        var5[var13] -= var31.field10;
                        var6[var13] -= var31.field17;
                        var7[var13] -= var31.field18;
                        var8[var13] -= var31.field14;
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
                for (int var19 = -5; var19 < field2978; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2978) {
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
                        if ((arg0[field2970 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2970 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class133.method934(var14 * 256 / var17, true, var16 / var18, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2970 * var19 + var10;
                            int var27 = class272.field3455[class339.method1998(class339.method1997(1716918951, 96, var25), (byte) 30) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V", line = 566)
    public static final void method1458() {
        field2979 = null;
        field2962 = null;
        field2963 = null;
        field2974 = null;
        field2969 = null;
        field2975 = null;
        field2967 = null;
        field2968 = null;
        field2966 = null;
        field2965 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lqa;IIII)V", line = 582)
    private static final void method1459(class129 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2980 - field2976;
        int var6 = field2972 - field2982;
        if (field2980 < field2970) {
            var5++;
        }
        if (field2972 < field2978) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2973;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2973;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2976 + var7;
                if (var52 >= 0 && var52 < field2970) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2977 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2977 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2982 + var53;
                            int var58 = field2970 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2978) {
                                var59 = (field2962[var58] & 0xFF) << 16 | field2963[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2974[var58] & 0xFF;
                                var61 = field2975[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2945.field4161 != -1) {
                                    var62 = field2945.field4161 | 0xFF000000;
                                } else if ((field2976 + var7 & 0x4) == (field2972 + var53 & 0x4)) {
                                    var62 = field2965[field2951.field33 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method861(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1465(arg0, var49, var54, var51, var56, var59, var60, field2969[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class49 var63 = (class49) field2968.method2085((long) (var52 << 16 | var57), -5423);
                                if (var63 != null) {
                                    method1465(arg0, var49, var54, var51, var56, var59, var60, field2969[var58], var63.field688, var63.field689, true);
                                }
                            } else {
                                field2957[0] = (short) (var61 - 1);
                                field2961[0] = field2967[var58];
                                method1465(arg0, var49, var54, var51, var56, var59, var60, field2969[var58], field2957, field2961, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2977 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2977 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2945.field4161 != -1) {
                            var68 = field2945.field4161 | 0xFF000000;
                        } else if ((field2976 + var7 & 0x4) == (field2972 + var64 & 0x4)) {
                            var68 = field2965[field2951.field33 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method861(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2973;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2973;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2976 + var8;
                if (var41 >= 0 && var41 < field2970) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2977 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2977 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2982 + var42;
                            if (var46 >= 0 && var46 < field2978) {
                                int var47 = field2975[field2970 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1460(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class49 var48 = (class49) field2968.method2085((long) (var41 << 16 | var46), -5423);
                                    if (var48 != null) {
                                        method1460(arg0, var38, var43, var40, var45, var48.field688, var48.field689);
                                    }
                                } else {
                                    field2957[0] = (short) (var47 - 1);
                                    field2961[0] = field2967[field2970 * var46 + var41];
                                    method1460(arg0, var38, var43, var40, var45, field2957, field2961);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2976 >> 6;
        int var10 = field2982 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2980 >> 6;
        int var12 = field2972 >> 6;
        if (var11 >= field2966[0].length) {
            var11 = field2966[0].length - 1;
        }
        if (var12 >= field2966[0][0].length) {
            var12 = field2966[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class362 var28 = field2966[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2983 >> 6) + var14) * 64;
                        int var30 = ((field2971 >> 6) + var27) * 64;
                        for (class369 var31 = (class369) var28.method2122(0); var31 != null; var31 = (class369) var28.method2129(111)) {
                            int var32 = var31.field4749 + var29 - field2983 - field2976;
                            int var33 = var31.field4746 + var30 - field2971 - field2982;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2973;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2973;
                            int var36 = field2977 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2977 - (arg2 * var33 + arg4 >> 16);
                            method1465(arg0, var34, var36, var35 - var34, var37 - var36, var31.field4747, var31.field4748 & 0xFF, var31.field4750, var31.field4751, var31.field4745, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class362 var17 = field2966[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2983 >> 6) + var15) * 64;
                        int var19 = ((field2971 >> 6) + var16) * 64;
                        for (class369 var20 = (class369) var17.method2122(0); var20 != null; var20 = (class369) var17.method2129(54)) {
                            int var21 = var20.field4749 + var18 - field2983 - field2976;
                            int var22 = var20.field4746 + var19 - field2971 - field2982;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2973;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2973;
                            int var25 = field2977 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2977 - (arg2 * var22 + arg4 >> 16);
                            method1460(arg0, var23, var25, var24 - var23, var26 - var25, var20.field4751, var20.field4745);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqa;IIII[S[B)V", line = 927)
    private static final void method1460(class129 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class402 var8 = field2948.method1164(arg5[var7] & 0xFFFF, 0);
            int var9 = var8.field5379;
            if (var9 != -1) {
                class451 var10 = field2949.method1562(var9, -18299);
                class404 var11 = var10.method2672((byte) 58, var8.field5393 ? arg6[var7] >> 6 & 0x3 : 0, var8.field5411 ? var8.field5364 : false, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method370() >> 2;
                    int var13 = arg4 * var11.method369() >> 2;
                    if (var10.field6280) {
                        int var14 = var8.field5340;
                        int var15 = var8.field5396;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field6273 == 0) {
                            var11.method2407(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method356(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field6273 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V", line = 987)
    private static final void method1461() {
        for (int var0 = 0; var0 < field2970; var0++) {
            for (int var11 = 0; var11 < field2978; var11++) {
                int var12 = field2975[field2970 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class49 var13 = (class49) field2968.method2085((long) (var0 << 16 | var11), -5423);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field688.length; var14++) {
                                class402 var15 = field2948.method1164(var13.field688[var14] & 0xFFFF, 0);
                                int var16 = var15.field5335;
                                if (var15.field5419 != null) {
                                    class402 var17 = var15.method2393(field2944, (byte) 32);
                                    if (var17 != null) {
                                        var16 = var17.field5335;
                                    }
                                }
                                if (var16 != -1) {
                                    class343 var18 = new class343(var16);
                                    var18.field4367 = var0;
                                    var18.field4368 = var11;
                                    field2953.method42(var18, 0);
                                }
                            }
                        }
                    } else {
                        class402 var19 = field2948.method1164(var12 - 1, 0);
                        int var20 = var19.field5335;
                        if (var19.field5419 != null) {
                            class402 var21 = var19.method2393(field2944, (byte) 32);
                            if (var21 != null) {
                                var20 = var21.field5335;
                            }
                        }
                        if (var20 != -1) {
                            class343 var22 = new class343(var20);
                            var22.field4367 = var0;
                            var22.field4368 = var11;
                            field2953.method42(var22, 0);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2966[0].length; var2++) {
                for (int var3 = 0; var3 < field2966[0][0].length; var3++) {
                    class362 var4 = field2966[var1][var2][var3];
                    if (var4 != null) {
                        for (class369 var5 = (class369) var4.method2122(0); var5 != null; var5 = (class369) var4.method2129(90)) {
                            if (var5.field4751 != null) {
                                for (int var6 = 0; var6 < var5.field4751.length; var6++) {
                                    class402 var7 = field2948.method1164(var5.field4751[var6] & 0xFFFF, 0);
                                    int var8 = var7.field5335;
                                    if (var7.field5419 != null) {
                                        class402 var9 = var7.method2393(field2944, (byte) 32);
                                        if (var9 != null) {
                                            var8 = var9.field5335;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class343 var10 = new class343(var8);
                                        var10.field4367 = ((field2983 >> 6) + var2) * 64 + var5.field4749 - field2983;
                                        var10.field4368 = ((field2971 >> 6) + var3) * 64 + var5.field4746 - field2971;
                                        field2953.method42(var10, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lm;II)V", line = 1145)
    public static final void method1462(class79 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field2951.field32; var3++) {
            field2965[var3 + 1] = method1471(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIII)V", line = 1154)
    public static final void method1463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2976 = arg0 - field2983;
        field2972 = arg1 - field2971;
        field2980 = arg2 - field2983;
        field2982 = arg3 - field2971;
        field2973 = arg4;
        field2981 = arg5;
        field2964 = arg6;
        field2977 = arg7;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 1164)
    public static final void method1464(int arg0) {
        field2945 = (class325) field2947.method2085((long) arg0, -5423);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqa;IIIIIII[S[BZ)V", line = 1167)
    private static final void method1465(class129 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method861(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2965[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method861(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class288.method1744(var11, arg1, var12, arg7 >> 6 & 0x3, (byte) 29, field2960, arg4, arg2, arg5, field2965[arg6], field2955, arg0, arg3);
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
                class402 var18 = field2948.method1164(arg8[var16] & 0xFFFF, 0);
                if (var18.field5379 == -1) {
                    int var19 = -3355444;
                    if (var18.field5347 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method875(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method904(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method875(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method904(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method875(arg1, arg2, arg4, -1, 0);
                            arg0.method904(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method875(var14, arg2, arg4, -1, 0);
                            arg0.method904(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method875(var14, arg2, arg4, -1, 0);
                            arg0.method904(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method875(arg1, arg2, arg4, -1, 0);
                            arg0.method904(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method904(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method904(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method904(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method904(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method904(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method904(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqa;)Ltu;", line = 1331)
    public static final class7 method1466(class129 arg0) {
        int var1 = field2980 - field2976;
        int var2 = field2972 - field2982;
        int var3 = (field2964 - field2973 << 16) / var1;
        int var4 = (field2977 - field2981 << 16) / var2;
        return method1452(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()V", line = 1342)
    public static final void method1467() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2959.field832; var1++) {
            boolean var2 = field2945.method1934(field2959.field835[var1] >> 14 & 0x3FFF, field2959.field835[var1] >> 28 & 0x3, var0, field2959.field835[var1] & 0x3FFF, (byte) -91);
            if (var2) {
                class343 var3 = new class343(field2959.field833[var1]);
                var3.field4367 = var0[1] - field2983;
                var3.field4368 = var0[2] - field2971;
                field2953.method42(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "()V", line = 1363)
    public static final void method1468() {
        field2979 = new byte[field2978 * field2970];
        field2974 = new byte[field2978 * field2970];
        field2969 = new byte[field2978 * field2970];
        field2975 = new short[field2978 * field2970];
        field2967 = new byte[field2978 * field2970];
        field2968 = new class357(1024);
        field2966 = new class362[3][field2970 >> 6][field2978 >> 6];
        field2965 = new int[field2951.field32 + 1];
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lqa;)V", line = 1377)
    public static final void method1469(class129 arg0) {
        int var1 = field2980 - field2976;
        int var2 = field2972 - field2982;
        int var3 = (field2964 - field2973 << 16) / var1;
        int var4 = (field2977 - field2981 << 16) / var2;
        method1459(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqa;Lcc;IIII)V", line = 1400)
    private static final void method1470(class129 arg0, class343 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field4364 = ((arg1.field4367 - field2976) * arg2 + arg4 >> 16) + field2973;
        arg1.field4369 = field2977 - ((arg1.field4368 - field2982) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lm;III)I", line = 1405)
    private static final int method1471(class79 arg0, int arg1, int arg2, int arg3) {
        class286 var4 = field2951.method20(125, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3638;
        if (var5 >= 0 && arg0.method460(-26282, var5).field7335) {
            var5 = -1;
        }
        int var9;
        if (var4.field3648 >= 0) {
            int var6 = var4.field3648;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class272.field3455[class339.method1998(class267.method1653((byte) 50, 96, var8), (byte) 30) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class272.field3455[class339.method1998(class267.method1653((byte) 50, 96, arg0.method460(-26282, var5).field7344), (byte) 30) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3655 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3655;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class272.field3455[class339.method1998(class267.method1653((byte) 50, 96, var12), (byte) 30) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }
}
