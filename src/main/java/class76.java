import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class76 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lsf;")
    private static class143 field1020 = new class143(16);

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1023 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[S")
    private static short[] field1024 = new short[1];

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[B")
    private static byte[] field1028 = new byte[1];

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field1025 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lmi;")
    public static class408 field1031 = new class408();

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "F")
    public static float field1026;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "F")
    public static float field1027;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Lsf;")
    private static class143 field1043;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Las;")
    public static class177 field1019;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lqj;")
    public static class238 field1021;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lsc;")
    public static class396 field1022;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[B")
    private static byte[] field1033;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[B")
    private static byte[] field1036;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[B")
    private static byte[] field1045;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "[B")
    private static byte[] field1049;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[B")
    private static byte[] field1051;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "[I")
    private static int[] field1050;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "[S")
    private static short[] field1037;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "[S")
    private static short[] field1047;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[[[B")
    public static byte[][][] field1029;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "[[[Lep;")
    private static class146[][][] field1048;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lnr;IIII[S[B)V")
    private static final void method466(class437 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class404 var8 = class165.method1020(arg5[var7] & 0xFFFF, 120);
            int var9 = var8.field6054;
            if (var9 != -1) {
                class57 var10 = class69.method441((byte) -110, var9);
                class243 var11 = var10.method387(var8.field6068 ? var8.field6033 : false, var8.field6065 ? arg6[var7] >> 6 & 0x3 : 0, -31318, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1088() >> 2;
                    int var13 = arg4 * var11.method1091() >> 2;
                    if (var10.field830) {
                        int var14 = var8.field6048;
                        int var15 = var8.field6014;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field820 == 0) {
                            var11.method1495(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method32(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field820 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
    public static void method467() {
        field1019 = null;
        field1021 = null;
        field1020 = null;
        field1029 = null;
        field1024 = null;
        field1028 = null;
        field1022 = null;
        field1031 = null;
        field1050 = null;
        field1036 = null;
        field1051 = null;
        field1047 = null;
        field1049 = null;
        field1033 = null;
        field1037 = null;
        field1045 = null;
        field1043 = null;
        field1048 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lnr;Lil;IIII[I[I)V")
    private static final void method468(class437 arg0, class265 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1697(124);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1697(-126);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field1036[field1032 * arg5 + arg4] = (byte) var11;
                    field1049[field1032 * arg5 + arg4] = 0;
                } else {
                    field1049[field1032 * arg5 + arg4] = (byte) var11;
                    field1033[field1032 * arg5 + arg4] = 0;
                    field1036[field1032 * arg5 + arg4] = arg1.method1708((byte) 127);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1697(-75);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1697(120);
                var18 = arg1.method1697(79);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1697(-113);
            }
            if (var15 == 0) {
                field1036[field1032 * arg5 + arg4] = (byte) var16;
                field1049[field1032 * arg5 + arg4] = (byte) var17;
                field1033[field1032 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field1037[field1032 * arg5 + arg4] = (short) (arg1.method1685(8104) + 1);
                    field1045[field1032 * arg5 + arg4] = arg1.method1708((byte) 127);
                } else if (var19 > 1) {
                    field1037[field1032 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1685(8104);
                        var21[var22] = arg1.method1708((byte) 127);
                    }
                    field1043.method956(false, (long) (arg4 << 16 | arg5), new class251(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1685(8104);
                        var24[var25] = arg1.method1708((byte) 127);
                    }
                }
                if (field1048[var15 - 1][arg2 - (field1041 >> 6)][arg3 - (field1044 >> 6)] == null) {
                    field1048[var15 - 1][arg2 - (field1041 >> 6)][arg3 - (field1044 >> 6)] = new class146();
                }
                class380 var26 = new class380(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field1048[var15 - 1][arg2 - (field1041 >> 6)][arg3 - (field1044 >> 6)].method974(var26, (byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lrr;")
    public static final class199 method469(int arg0, int arg1) {
        class199 var2 = new class199();
        for (class177 var3 = (class177) field1020.method953(0); var3 != null; var3 = (class177) field1020.method951(0)) {
            if (var3.field2317 && var3.method1082(arg1, arg0, (byte) 109)) {
                var2.method1244(var3, -26);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
    public static final void method470() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field1022.field5943; var1++) {
            boolean var2 = field1019.method1079(94, field1022.field5945[var1] >> 14 & 0x3FFF, field1022.field5945[var1] >> 28 & 0x3, field1022.field5945[var1] & 0x3FFF, var0);
            if (var2) {
                class419 var3 = new class419(field1022.field5946[var1]);
                var3.field6223 = var0[1] - field1041;
                var3.field6230 = var0[2] - field1044;
                field1031.method2660((byte) -128, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lnr;)Lmi;")
    public static final class408 method471(class437 arg0) {
        int var1 = field1052 - field1042;
        int var2 = field1039 - field1040;
        int var3 = (field1034 - field1053 << 16) / var1;
        int var4 = (field1035 - field1038 << 16) / var2;
        return method478(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lqj;)V")
    public static final void method472(class238 arg0) {
        field1021 = arg0;
        field1020.method952(116);
        int var1 = field1021.method1467(119, "details");
        int[] var2 = field1021.method1457((byte) -114, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class177 var4 = class26.method244(0, var2[var3], var1, field1021);
            field1020.method956(false, (long) var4.field2319, var4);
        }
        class203.method1285(-70, true, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lnr;IIIIIII[S[BZ)V")
    private static final void method473(class437 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method2188(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field1050[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method2188(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class339.method2244(var11, field1030, 16711680, arg7 >> 6 & 0x3, arg4, field1050[arg6], var12, arg1, arg2, arg3, arg5, arg0, field1029);
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
                class404 var18 = class165.method1020(arg8[var16] & 0xFFFF, -16);
                if (var18.field6054 == -1) {
                    int var19 = -3355444;
                    if (var18.field6009 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method2190(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2093(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2190(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method2093(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method2190(arg1, arg2, arg4, -1, 0);
                            arg0.method2093(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2190(var14, arg2, arg4, -1, 0);
                            arg0.method2093(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2190(var14, arg2, arg4, -1, 0);
                            arg0.method2093(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method2190(arg1, arg2, arg4, -1, 0);
                            arg0.method2093(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method2093(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2093(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2093(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method2093(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method2093(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method2093(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lnr;)V")
    public static final void method474(class437 arg0) {
        int var1 = field1052 - field1042;
        int var2 = field1039 - field1040;
        int var3 = (field1034 - field1053 << 16) / var1;
        int var4 = (field1035 - field1038 << 16) / var2;
        method475(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lnr;IIII)V")
    private static final void method475(class437 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field1052 - field1042;
        int var6 = field1039 - field1040;
        if (field1052 < field1032) {
            var5++;
        }
        if (field1039 < field1046) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field1053;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field1053;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field1042 + var7;
                if (var52 >= 0 && var52 < field1032) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field1035 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field1035 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field1040 + var53;
                            int var58 = field1032 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field1046) {
                                var59 = (field1051[var58] & 0xFF) << 16 | field1047[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field1049[var58] & 0xFF;
                                var61 = field1037[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field1019.field2324 != -1) {
                                    var62 = field1019.field2324 | 0xFF000000;
                                } else if ((field1042 + var7 & 0x4) == (field1039 + var53 & 0x4)) {
                                    var62 = field1050[class125.field1662 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method2188(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method473(arg0, var49, var54, var51, var56, var59, var60, field1033[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class251 var63 = (class251) field1043.method954(119, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method473(arg0, var49, var54, var51, var56, var59, var60, field1033[var58], var63.field3652, var63.field3653, true);
                                }
                            } else {
                                field1024[0] = (short) (var61 - 1);
                                field1028[0] = field1045[var58];
                                method473(arg0, var49, var54, var51, var56, var59, var60, field1033[var58], field1024, field1028, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field1035 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field1035 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field1019.field2324 != -1) {
                            var68 = field1019.field2324 | 0xFF000000;
                        } else if ((field1042 + var7 & 0x4) == (field1039 + var64 & 0x4)) {
                            var68 = field1050[class125.field1662 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method2188(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field1053;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field1053;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field1042 + var8;
                if (var41 >= 0 && var41 < field1032) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field1035 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field1035 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field1040 + var42;
                            if (var46 >= 0 && var46 < field1046) {
                                int var47 = field1037[field1032 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method466(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class251 var48 = (class251) field1043.method954(107, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method466(arg0, var38, var43, var40, var45, var48.field3652, var48.field3653);
                                    }
                                } else {
                                    field1024[0] = (short) (var47 - 1);
                                    field1028[0] = field1045[field1032 * var46 + var41];
                                    method466(arg0, var38, var43, var40, var45, field1024, field1028);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field1042 >> 6;
        int var10 = field1040 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field1052 >> 6;
        int var12 = field1039 >> 6;
        if (var11 >= field1048[0].length) {
            var11 = field1048[0].length - 1;
        }
        if (var12 >= field1048[0][0].length) {
            var12 = field1048[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class146 var28 = field1048[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field1041 >> 6) + var14) * 64;
                        int var30 = ((field1044 >> 6) + var27) * 64;
                        for (class380 var31 = (class380) var28.method976((byte) 42); var31 != null; var31 = (class380) var28.method979(80)) {
                            int var32 = var31.field5706 + var29 - field1041 - field1042;
                            int var33 = var31.field5708 + var30 - field1044 - field1040;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field1053;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field1053;
                            int var36 = field1035 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field1035 - (arg2 * var33 + arg4 >> 16);
                            method473(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5707, var31.field5703 & 0xFF, var31.field5705, var31.field5704, var31.field5709, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class146 var17 = field1048[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field1041 >> 6) + var15) * 64;
                        int var19 = ((field1044 >> 6) + var16) * 64;
                        for (class380 var20 = (class380) var17.method976((byte) 42); var20 != null; var20 = (class380) var17.method979(53)) {
                            int var21 = var20.field5706 + var18 - field1041 - field1042;
                            int var22 = var20.field5708 + var19 - field1044 - field1040;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field1053;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field1053;
                            int var25 = field1035 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field1035 - (arg2 * var22 + arg4 >> 16);
                            method466(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5704, var20.field5709);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lfl;II)V")
    public static final void method476(class386 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class244.field3408; var3++) {
            field1050[var3 + 1] = method477(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lfl;III)I")
    private static final int method477(class386 arg0, int arg1, int arg2, int arg3) {
        class291 var4 = class404.method2623(false, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4203;
        if (var5 >= 0 && arg0.method1760(-19907, var5).field2273) {
            var5 = -1;
        }
        int var9;
        if (var4.field4219 >= 0) {
            int var6 = var4.field4219;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class300.field4317[class196.method1227((byte) -127, class226.method1403((byte) -18, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class300.field4317[class196.method1227((byte) -128, class226.method1403((byte) -119, 96, arg0.method1760(-19907, var5).field2295)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4209 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4209;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class300.field4317[class196.method1227((byte) -23, class226.method1403((byte) -90, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lnr;IIII)Lmi;")
    private static final class408 method478(class437 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class419 var5 = (class419) field1031.method2649(0); var5 != null; var5 = (class419) field1031.method2656(0)) {
            method486(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field1031;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1042 = arg0 - field1041;
        field1039 = arg1 - field1044;
        field1052 = arg2 - field1041;
        field1040 = arg3 - field1044;
        field1053 = arg4;
        field1038 = arg5;
        field1034 = arg6;
        field1035 = arg7;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()V")
    public static final void method480() {
        field1036 = null;
        field1051 = null;
        field1047 = null;
        field1049 = null;
        field1033 = null;
        field1037 = null;
        field1045 = null;
        field1043 = null;
        field1048 = null;
        field1050 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lnr;II)V")
    public static final void method481(class437 arg0, int arg1, int arg2) {
        class265 var3 = new class265(field1021.method1478(field1019.field2325, "area", (byte) 104));
        int var4 = var3.method1697(60);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1697(117);
        }
        int var7 = var3.method1697(109);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1697(-51);
        }
        while (true) {
            while (var3.field3915 < var3.field3879.length) {
                if (var3.method1697(-82) == 0) {
                    int var22 = var3.method1697(57);
                    int var23 = var3.method1697(-18);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field1041;
                            int var27 = var23 * 64 + var25 - field1044;
                            method468(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1697(74);
                    int var29 = var3.method1697(-128);
                    int var30 = var3.method1697(60);
                    int var31 = var3.method1697(-99);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field1041;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field1044;
                            method468(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field1051 = new byte[field1046 * field1032];
            field1047 = new short[field1046 * field1032];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field1046 * field1032];
                for (int var13 = 0; var13 < field1048[var11].length; var13++) {
                    for (int var19 = 0; var19 < field1048[var11][0].length; var19++) {
                        class146 var20 = field1048[var11][var13][var19];
                        if (var20 != null) {
                            for (class380 var21 = (class380) var20.method976((byte) 42); var21 != null; var21 = (class380) var20.method979(44)) {
                                var12[(var19 * 64 + var21.field5708) * field1032 + var13 * 64 + var21.field5706] = (byte) var21.field5707;
                            }
                        }
                    }
                }
                method484(var12, field1051, field1047, arg1, arg2);
                for (int var14 = 0; var14 < field1048[var11].length; var14++) {
                    for (int var15 = 0; var15 < field1048[var11][0].length; var15++) {
                        class146 var16 = field1048[var11][var14][var15];
                        if (var16 != null) {
                            for (class380 var17 = (class380) var16.method976((byte) 42); var17 != null; var17 = (class380) var16.method979(93)) {
                                int var18 = (var15 * 64 + var17.field5708) * field1032 + var14 * 64 + var17.field5706;
                                var17.field5707 = (field1051[var18] & 0xFF) << 16 | field1047[var18] & 0xFFFF;
                                if (var17.field5707 != 0) {
                                    var17.field5707 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method484(field1036, field1051, field1047, arg1, arg2);
            field1036 = null;
            method482();
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V")
    private static final void method482() {
        for (int var0 = 0; var0 < field1032; var0++) {
            for (int var11 = 0; var11 < field1046; var11++) {
                int var12 = field1037[field1032 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class251 var13 = (class251) field1043.method954(-88, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3652.length; var14++) {
                                class404 var15 = class165.method1020(var13.field3652[var14] & 0xFFFF, 120);
                                int var16 = var15.field6034;
                                if (var15.field5999 != null) {
                                    class404 var17 = var15.method2626(18);
                                    if (var17 != null) {
                                        var16 = var17.field6034;
                                    }
                                }
                                if (var16 != -1) {
                                    class419 var18 = new class419(var16);
                                    var18.field6223 = var0;
                                    var18.field6230 = var11;
                                    field1031.method2660((byte) -123, var18);
                                }
                            }
                        }
                    } else {
                        class404 var19 = class165.method1020(var12 - 1, -88);
                        int var20 = var19.field6034;
                        if (var19.field5999 != null) {
                            class404 var21 = var19.method2626(18);
                            if (var21 != null) {
                                var20 = var21.field6034;
                            }
                        }
                        if (var20 != -1) {
                            class419 var22 = new class419(var20);
                            var22.field6223 = var0;
                            var22.field6230 = var11;
                            field1031.method2660((byte) -128, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field1048[0].length; var2++) {
                for (int var3 = 0; var3 < field1048[0][0].length; var3++) {
                    class146 var4 = field1048[var1][var2][var3];
                    if (var4 != null) {
                        for (class380 var5 = (class380) var4.method976((byte) 42); var5 != null; var5 = (class380) var4.method979(-121)) {
                            if (var5.field5704 != null) {
                                for (int var6 = 0; var6 < var5.field5704.length; var6++) {
                                    class404 var7 = class165.method1020(var5.field5704[var6] & 0xFFFF, -125);
                                    int var8 = var7.field6034;
                                    if (var7.field5999 != null) {
                                        class404 var9 = var7.method2626(18);
                                        if (var9 != null) {
                                            var8 = var9.field6034;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class419 var10 = new class419(var8);
                                        var10.field6223 = ((field1041 >> 6) + var2) * 64 + var5.field5706 - field1041;
                                        var10.field6230 = ((field1044 >> 6) + var3) * 64 + var5.field5708 - field1044;
                                        field1031.method2660((byte) -127, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Las;")
    public static final class177 method483(int arg0, int arg1) {
        for (class177 var2 = (class177) field1020.method953(0); var2 != null; var2 = (class177) field1020.method951(0)) {
            if (var2.field2317 && var2.method1082(arg1, arg0, (byte) 109)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B[B[SII)V")
    private static final void method484(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field1046];
        int[] var6 = new int[field1046];
        int[] var7 = new int[field1046];
        int[] var8 = new int[field1046];
        int[] var9 = new int[field1046];
        for (int var10 = -5; var10 < field1032; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field1046; var13++) {
                int var10002;
                if (var11 < field1032) {
                    int var28 = arg0[field1032 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class340 var29 = class135.method907(-122, var28 - 1);
                        var5[var13] += var29.field4996;
                        var6[var13] += var29.field4998;
                        var7[var13] += var29.field4999;
                        var8[var13] += var29.field5001;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field1032 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class340 var31 = class135.method907(-121, var30 - 1);
                        var5[var13] -= var31.field4996;
                        var6[var13] -= var31.field4998;
                        var7[var13] -= var31.field4999;
                        var8[var13] -= var31.field5001;
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
                for (int var19 = -5; var19 < field1046; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field1046) {
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
                        if ((arg0[field1032 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field1032 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class143.method959(var15 / var18, var16 / var18, var14 * 256 / var17, 13552);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field1032 * var19 + var10;
                            int var27 = class300.field4317[class196.method1227((byte) -16, class220.method1373(var25, (byte) -80, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
    public static final void method485() {
        field1036 = new byte[field1046 * field1032];
        field1049 = new byte[field1046 * field1032];
        field1033 = new byte[field1046 * field1032];
        field1037 = new short[field1046 * field1032];
        field1045 = new byte[field1046 * field1032];
        field1043 = new class143(1024);
        field1048 = new class146[3][field1032 >> 6][field1046 >> 6];
        field1050 = new int[class244.field3408 + 1];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lnr;Llo;IIII)V")
    private static final void method486(class437 arg0, class419 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6232 = ((arg1.field6223 - field1042) * arg2 + arg4 >> 16) + field1053;
        arg1.field6233 = field1035 - ((arg1.field6230 - field1040) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static final void method487(int arg0) {
        field1019 = (class177) field1020.method954(79, (long) arg0);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Las;")
    public static final class177 method488(int arg0) {
        return (class177) field1020.method954(94, (long) arg0);
    }
}
