import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class73 {

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Ltba;")
    private static class165 field1013 = new class165(16);

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "[B")
    private static byte[] field1022 = new byte[1];

    @OriginalMember(owner = "client!naa", name = "r", descriptor = "[S")
    private static short[] field1029 = new short[1];

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
    public static int field1023 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
    public static int field1030 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!naa", name = "o", descriptor = "Lfh;")
    public static class653 field1026 = new class653();

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "F")
    public static float field1021;

    @OriginalMember(owner = "client!naa", name = "q", descriptor = "F")
    public static float field1028;

    @OriginalMember(owner = "client!naa", name = "p", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!naa", name = "u", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!naa", name = "v", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!naa", name = "w", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!naa", name = "D", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!naa", name = "E", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!naa", name = "K", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!naa", name = "L", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!naa", name = "N", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!naa", name = "O", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "Lls;")
    private static class142 field1017;

    @OriginalMember(owner = "client!naa", name = "C", descriptor = "Ltba;")
    private static class165 field1040;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Leia;")
    public static class245 field1016;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "Lef;")
    public static class490 field1020;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Ltp;")
    public static class536 field1015;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "Lnd;")
    public static class547 field1018;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Lrj;")
    public static class597 field1014;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Ldl;")
    public static class64 field1019;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "Lpg;")
    private static class735 field1012;

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "Lgea;")
    public static class76 field1025;

    @OriginalMember(owner = "client!naa", name = "t", descriptor = "[B")
    private static byte[] field1031;

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "[B")
    private static byte[] field1035;

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "[B")
    private static byte[] field1043;

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "[B")
    private static byte[] field1046;

    @OriginalMember(owner = "client!naa", name = "M", descriptor = "[B")
    private static byte[] field1050;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "[I")
    private static int[] field1037;

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "[S")
    private static short[] field1036;

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "[S")
    private static short[] field1039;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "[[[B")
    public static byte[][][] field1024;

    @OriginalMember(owner = "client!naa", name = "J", descriptor = "[[[Lan;")
    private static class23[][][] field1047;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "()V", line = 5)
    public static final void method646() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field1025.field1068; var1++) {
            boolean var2 = field1020.method2895(var0, (byte) -46, field1025.field1067[var1] >> 28 & 0x3, field1025.field1067[var1] >> 14 & 0x3FFF, field1025.field1067[var1] & 0x3FFF);
            if (var2) {
                class344 var3 = new class344(field1025.field1069[var1]);
                var3.field4353 = var0[1] - field1041;
                var3.field4347 = var0[2] - field1042;
                field1026.method3671(var3, false);
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;)V", line = 27)
    public static final void method647(class60 arg0) {
        int var1 = field1049 - field1032;
        int var2 = field1038 - field1033;
        int var3 = (field1048 - field1052 << 16) / var1;
        int var4 = (field1044 - field1045 << 16) / var2;
        method648(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;IIII)V", line = 38)
    private static final void method648(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field1049 - field1032;
        int var6 = field1038 - field1033;
        if (field1049 < field1051) {
            var5++;
        }
        if (field1038 < field1034) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field1052;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field1052;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field1032 + var7;
                if (var52 >= 0 && var52 < field1051) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field1044 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field1044 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field1033 + var53;
                            int var58 = field1051 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field1034) {
                                var59 = (field1050[var58] & 0xFF) << 16 | field1036[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field1043[var58] & 0xFF;
                                var61 = field1039[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field1020.field6961 != -1) {
                                    var62 = field1020.field6961 | 0xFF000000;
                                } else if ((field1038 + var53 & 0x4) == (field1032 + var7 & 0x4)) {
                                    var62 = field1037[field1017.field2022 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method528(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method665(arg0, var49, var54, var51, var56, var59, var60, field1031[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class576 var63 = (class576) field1040.method1160((long) (var52 << 16 | var57), 124);
                                if (var63 != null) {
                                    method665(arg0, var49, var54, var51, var56, var59, var60, field1031[var58], var63.field8091, var63.field8092, true);
                                }
                            } else {
                                field1029[0] = (short) (var61 - 1);
                                field1022[0] = field1035[var58];
                                method665(arg0, var49, var54, var51, var56, var59, var60, field1031[var58], field1029, field1022, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field1044 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field1044 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field1020.field6961 != -1) {
                            var68 = field1020.field6961 | 0xFF000000;
                        } else if ((field1038 + var64 & 0x4) == (field1032 + var7 & 0x4)) {
                            var68 = field1037[field1017.field2022 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method528(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field1052;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field1052;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field1032 + var8;
                if (var41 >= 0 && var41 < field1051) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field1044 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field1044 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field1033 + var42;
                            if (var46 >= 0 && var46 < field1034) {
                                int var47 = field1039[field1051 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method663(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class576 var48 = (class576) field1040.method1160((long) (var41 << 16 | var46), 119);
                                    if (var48 != null) {
                                        method663(arg0, var38, var43, var40, var45, var48.field8091, var48.field8092);
                                    }
                                } else {
                                    field1029[0] = (short) (var47 - 1);
                                    field1022[0] = field1035[field1051 * var46 + var41];
                                    method663(arg0, var38, var43, var40, var45, field1029, field1022);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field1032 >> 6;
        int var10 = field1033 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field1049 >> 6;
        int var12 = field1038 >> 6;
        if (var11 >= field1047[0].length) {
            var11 = field1047[0].length - 1;
        }
        if (var12 >= field1047[0][0].length) {
            var12 = field1047[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class23 var28 = field1047[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field1041 >> 6) + var14) * 64;
                        int var30 = ((field1042 >> 6) + var27) * 64;
                        for (class434 var31 = (class434) var28.method162(-22305); var31 != null; var31 = (class434) var28.method158(false)) {
                            int var32 = var31.field5781 + var29 - field1041 - field1032;
                            int var33 = var31.field5783 + var30 - field1042 - field1033;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field1052;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field1052;
                            int var36 = field1044 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field1044 - (arg2 * var33 + arg4 >> 16);
                            method665(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5787, var31.field5782 & 0xFF, var31.field5785, var31.field5786, var31.field5784, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class23 var17 = field1047[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field1041 >> 6) + var15) * 64;
                        int var19 = ((field1042 >> 6) + var16) * 64;
                        for (class434 var20 = (class434) var17.method162(-22305); var20 != null; var20 = (class434) var17.method158(false)) {
                            int var21 = var20.field5781 + var18 - field1041 - field1032;
                            int var22 = var20.field5783 + var19 - field1042 - field1033;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field1052;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field1052;
                            int var25 = field1044 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field1044 - (arg2 * var22 + arg4 >> 16);
                            method663(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5786, var20.field5784);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;Lcs;IIII)V", line = 383)
    private static final void method649(class60 arg0, class344 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field4351 = ((arg1.field4353 - field1032) * arg2 + arg4 >> 16) + field1052;
        arg1.field4350 = field1044 - ((arg1.field4347 - field1033) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "()V", line = 389)
    private static final void method650() {
        for (int var0 = 0; var0 < field1051; var0++) {
            for (int var11 = 0; var11 < field1034; var11++) {
                int var12 = field1039[field1051 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class576 var13 = (class576) field1040.method1160((long) (var0 << 16 | var11), 123);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field8091.length; var14++) {
                                class543 var15 = field1014.method3384(var13.field8091[var14] & 0xFFFF, false);
                                int var16 = var15.field7546;
                                if (var15.field7541 != null) {
                                    class543 var17 = var15.method3111(field1016, -99);
                                    if (var17 != null) {
                                        var16 = var17.field7546;
                                    }
                                }
                                if (var16 != -1) {
                                    class344 var18 = new class344(var16);
                                    var18.field4353 = var0;
                                    var18.field4347 = var11;
                                    field1026.method3671(var18, false);
                                }
                            }
                        }
                    } else {
                        class543 var19 = field1014.method3384(var12 - 1, false);
                        int var20 = var19.field7546;
                        if (var19.field7541 != null) {
                            class543 var21 = var19.method3111(field1016, -117);
                            if (var21 != null) {
                                var20 = var21.field7546;
                            }
                        }
                        if (var20 != -1) {
                            class344 var22 = new class344(var20);
                            var22.field4353 = var0;
                            var22.field4347 = var11;
                            field1026.method3671(var22, false);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field1047[0].length; var2++) {
                for (int var3 = 0; var3 < field1047[0][0].length; var3++) {
                    class23 var4 = field1047[var1][var2][var3];
                    if (var4 != null) {
                        for (class434 var5 = (class434) var4.method162(-22305); var5 != null; var5 = (class434) var4.method158(false)) {
                            if (var5.field5786 != null) {
                                for (int var6 = 0; var6 < var5.field5786.length; var6++) {
                                    class543 var7 = field1014.method3384(var5.field5786[var6] & 0xFFFF, false);
                                    int var8 = var7.field7546;
                                    if (var7.field7541 != null) {
                                        class543 var9 = var7.method3111(field1016, -107);
                                        if (var9 != null) {
                                            var8 = var9.field7546;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class344 var10 = new class344(var8);
                                        var10.field4353 = ((field1041 >> 6) + var2) * 64 + var5.field5781 - field1041;
                                        var10.field4347 = ((field1042 >> 6) + var3) * 64 + var5.field5783 - field1042;
                                        field1026.method3671(var10, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V", line = 545)
    public static final void method651(int arg0) {
        field1020 = (class490) field1013.method1160((long) arg0, 127);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIIIIII)V", line = 548)
    public static final void method652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1032 = arg0 - field1041;
        field1038 = arg1 - field1042;
        field1049 = arg2 - field1041;
        field1033 = arg3 - field1042;
        field1052 = arg4;
        field1045 = arg5;
        field1048 = arg6;
        field1044 = arg7;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)Lef;", line = 561)
    public static final class490 method653(int arg0, int arg1) {
        for (class490 var2 = (class490) field1013.method1156(0); var2 != null; var2 = (class490) field1013.method1158(22706)) {
            if (var2.field6967 && var2.method2893(-5942, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;Lcs;Lup;)V", line = 573)
    public static final void method654(class60 arg0, class344 arg1, class278 arg2) {
        if (arg2.field3487 == null) {
            return;
        }
        int[] var3 = new int[arg2.field3487.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field3487[var4 * 2] + arg1.field4353;
            int var22 = arg2.field3487[var4 * 2 + 1] + arg1.field4347;
            var3[var4 * 2] = (field1048 - field1052) * (var21 - field1032) / (field1049 - field1032) + field1052;
            var3[var4 * 2 + 1] = field1044 - (field1044 - field1045) * (var22 - field1033) / (field1038 - field1033);
        }
        class671.method3767(arg0, var3, arg2.field3506);
        if (arg2.field3505 > 0) {
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
                arg0.method434(var13, var14, var15, var16, arg2.field3498[arg2.field3509[var5] & 0xFF], 1, arg2.field3505, arg2.field3515, arg2.field3520);
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
            arg0.method434(var6, var7, var8, var9, arg2.field3498[arg2.field3509[arg2.field3509.length - 1] & 0xFF], 1, arg2.field3505, arg2.field3515, arg2.field3520);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method494(var3[var20 * 2 + 1], (byte) 105, var3[(var20 + 1) * 2], var3[(var20 + 1) * 2 + 1], arg2.field3498[arg2.field3509[var20] & 0xFF], var3[var20 * 2]);
        }
        arg0.method494(var3[var3.length - 1], (byte) -41, var3[0], var3[1], arg2.field3498[arg2.field3509[arg2.field3509.length - 1] & 0xFF], var3[var3.length - 2]);
    }

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "()V", line = 681)
    public static final void method655() {
        field1046 = null;
        field1050 = null;
        field1036 = null;
        field1043 = null;
        field1031 = null;
        field1039 = null;
        field1035 = null;
        field1040 = null;
        field1047 = null;
        field1037 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lnd;Lls;Lpg;Lrj;Ltp;Ldl;Leia;)V", line = 693)
    public static final void method656(class547 arg0, class142 arg1, class735 arg2, class597 arg3, class536 arg4, class64 arg5, class245 arg6) {
        field1018 = arg0;
        field1017 = arg1;
        field1012 = arg2;
        field1014 = arg3;
        field1015 = arg4;
        field1019 = arg5;
        field1016 = arg6;
        field1013.method1161(false);
        int var7 = field1018.method3161((byte) -117, "details");
        int[] var8 = field1018.method3181((byte) 123, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class490 var10 = class238.method1492(20122, field1018, var7, var8[var9]);
                field1013.method1153(var10, (long) var10.field6965, -1);
            }
        }
        class273.method1613(false, true, 10);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;Lsl;IIII[I[I)V", line = 725)
    private static final void method657(class60 arg0, class461 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2600((byte) -124);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2600((byte) -124);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field1046[field1051 * arg5 + arg4] = (byte) var11;
                    field1043[field1051 * arg5 + arg4] = 0;
                } else {
                    field1043[field1051 * arg5 + arg4] = (byte) var11;
                    field1031[field1051 * arg5 + arg4] = 0;
                    field1046[field1051 * arg5 + arg4] = arg1.method2601(0);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2600((byte) -124);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2600((byte) -126);
                var18 = arg1.method2600((byte) -126);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2600((byte) -124);
            }
            if (var15 == 0) {
                field1046[field1051 * arg5 + arg4] = (byte) var16;
                field1043[field1051 * arg5 + arg4] = (byte) var17;
                field1031[field1051 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field1039[field1051 * arg5 + arg4] = (short) (arg1.method2566(-2) + 1);
                    field1035[field1051 * arg5 + arg4] = arg1.method2601(0);
                } else if (var19 > 1) {
                    field1039[field1051 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2566(-2);
                        var21[var22] = arg1.method2601(0);
                    }
                    field1040.method1153(new class576(var20, var21), (long) (arg4 << 16 | arg5), -1);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2566(-2);
                        var24[var25] = arg1.method2601(0);
                    }
                }
                if (field1047[var15 - 1][arg2 - (field1041 >> 6)][arg3 - (field1042 >> 6)] == null) {
                    field1047[var15 - 1][arg2 - (field1041 >> 6)][arg3 - (field1042 >> 6)] = new class23();
                }
                class434 var26 = new class434(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field1047[var15 - 1][arg2 - (field1041 >> 6)][arg3 - (field1042 >> 6)].method166(-8839, var26);
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;II)V", line = 860)
    public static final void method658(class60 arg0, int arg1, int arg2) {
        class461 var3 = new class461(field1018.method3158(field1020.field6968, (byte) 102, "area"));
        int var4 = var3.method2600((byte) -124);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2600((byte) -127);
        }
        int var7 = var3.method2600((byte) -124);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2600((byte) -123);
        }
        while (true) {
            while (var3.field6193 < var3.field6180.length) {
                if (var3.method2600((byte) -123) == 0) {
                    int var22 = var3.method2600((byte) -127);
                    int var23 = var3.method2600((byte) -125);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field1041;
                            int var27 = var23 * 64 + var25 - field1042;
                            method657(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2600((byte) -123);
                    int var29 = var3.method2600((byte) -125);
                    int var30 = var3.method2600((byte) -127);
                    int var31 = var3.method2600((byte) -124);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field1041;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field1042;
                            method657(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field1050 = new byte[field1051 * field1034];
            field1036 = new short[field1051 * field1034];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field1051 * field1034];
                for (int var13 = 0; var13 < field1047[var11].length; var13++) {
                    for (int var19 = 0; var19 < field1047[var11][0].length; var19++) {
                        class23 var20 = field1047[var11][var13][var19];
                        if (var20 != null) {
                            for (class434 var21 = (class434) var20.method162(-22305); var21 != null; var21 = (class434) var20.method158(false)) {
                                var12[(var19 * 64 + var21.field5783) * field1051 + var13 * 64 + var21.field5781] = (byte) var21.field5787;
                            }
                        }
                    }
                }
                method664(var12, field1050, field1036, arg1, arg2);
                for (int var14 = 0; var14 < field1047[var11].length; var14++) {
                    for (int var15 = 0; var15 < field1047[var11][0].length; var15++) {
                        class23 var16 = field1047[var11][var14][var15];
                        if (var16 != null) {
                            for (class434 var17 = (class434) var16.method162(-22305); var17 != null; var17 = (class434) var16.method158(false)) {
                                int var18 = (var15 * 64 + var17.field5783) * field1051 + var14 * 64 + var17.field5781;
                                var17.field5787 = (field1050[var18] & 0xFF) << 16 | field1036[var18] & 0xFFFF;
                                if (var17.field5787 != 0) {
                                    var17.field5787 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method664(field1046, field1050, field1036, arg1, arg2);
            field1046 = null;
            method650();
            return;
        }
    }

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "()V", line = 1043)
    public static final void method659() {
        field1046 = new byte[field1051 * field1034];
        field1043 = new byte[field1051 * field1034];
        field1031 = new byte[field1051 * field1034];
        field1039 = new short[field1051 * field1034];
        field1035 = new byte[field1051 * field1034];
        field1040 = new class165(1024);
        field1047 = new class23[3][field1051 >> 6][field1034 >> 6];
        field1037 = new int[field1017.field2018 + 1];
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Ld;II)V", line = 1056)
    public static final void method660(class153 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field1017.field2018; var3++) {
            field1037[var3 + 1] = method668(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(Lha;)Lfh;", line = 1067)
    public static final class653 method661(class60 arg0) {
        int var1 = field1049 - field1032;
        int var2 = field1038 - field1033;
        int var3 = (field1048 - field1052 << 16) / var1;
        int var4 = (field1044 - field1045 << 16) / var2;
        return method662(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(Lha;IIII)Lfh;", line = 1079)
    private static final class653 method662(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class344 var5 = (class344) field1026.method3672(-1); var5 != null; var5 = (class344) field1026.method3662(-1)) {
            method649(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field1026;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 1089)
    private static final void method663(class60 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class543 var8 = field1014.method3384(arg5[var7] & 0xFFFF, false);
            int var9 = var8.field7512;
            if (var9 != -1) {
                class12 var10 = field1019.method589(-32672, var9);
                class481 var11 = var10.method73((byte) -18, var8.field7536 ? var8.field7539 : false, var8.field7566 ? arg6[var7] >> 6 & 0x3 : 0, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method142() >> 2;
                    int var13 = arg4 * var11.method149() >> 2;
                    if (var10.field147) {
                        int var14 = var8.field7520;
                        int var15 = var8.field7534;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field145 == 0) {
                            var11.method2760(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method2761(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field145 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "([B[B[SII)V", line = 1150)
    private static final void method664(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field1034];
        int[] var6 = new int[field1034];
        int[] var7 = new int[field1034];
        int[] var8 = new int[field1034];
        int[] var9 = new int[field1034];
        for (int var10 = -5; var10 < field1051; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field1034; var13++) {
                int var10002;
                if (var11 < field1051) {
                    int var28 = arg0[field1051 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class290 var29 = field1012.method4099(var28 - 1, 1);
                        var5[var13] += var29.field3807;
                        var6[var13] += var29.field3805;
                        var7[var13] += var29.field3803;
                        var8[var13] += var29.field3797;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field1051 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class290 var31 = field1012.method4099(var30 - 1, 1);
                        var5[var13] -= var31.field3807;
                        var6[var13] -= var31.field3805;
                        var7[var13] -= var31.field3803;
                        var8[var13] -= var31.field3797;
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
                for (int var19 = -5; var19 < field1034; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field1034) {
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
                        if ((arg0[field1051 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field1051 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class227.method1453(var15 / var18, 0, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field1051 * var19 + var10;
                            int var27 = class22.field415[class693.method3882(class598.method3395(12345678, 96, var25), 63) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 1294)
    private static final void method665(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method528(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field1037[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method528(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class480.method2757(var11, arg1, var12, arg3, field1027, (byte) 103, arg2, field1024, arg0, arg5, arg4, arg7 >> 6 & 0x3, field1037[arg6]);
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
                class543 var18 = field1014.method3384(arg8[var16] & 0xFFFF, false);
                if (var18.field7512 == -1) {
                    int var19 = -3355444;
                    if (var18.field7550 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method477(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method491(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method477(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method491(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method477(arg1, arg2, arg4, -1, 0);
                            arg0.method491(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method477(var14, arg2, arg4, -1, 0);
                            arg0.method491(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method477(var14, arg2, arg4, -1, 0);
                            arg0.method491(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method477(arg1, arg2, arg4, -1, 0);
                            arg0.method491(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method491(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method491(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method491(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method491(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method491(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method491(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)Lef;", line = 1455)
    public static final class490 method666(int arg0) {
        return (class490) field1013.method1160((long) arg0, 125);
    }

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "()V", line = 1458)
    public static void method667() {
        field1017 = null;
        field1012 = null;
        field1014 = null;
        field1015 = null;
        field1019 = null;
        field1016 = null;
        field1020 = null;
        field1018 = null;
        field1013 = null;
        field1024 = null;
        field1029 = null;
        field1022 = null;
        field1025 = null;
        field1026 = null;
        field1037 = null;
        field1046 = null;
        field1050 = null;
        field1036 = null;
        field1043 = null;
        field1031 = null;
        field1039 = null;
        field1035 = null;
        field1040 = null;
        field1047 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Ld;III)I", line = 1485)
    private static final int method668(class153 arg0, int arg1, int arg2, int arg3) {
        class97 var4 = field1017.method1028(-5249, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1360;
        if (var5 >= 0 && arg0.method1072(var5, true).field7456) {
            var5 = -1;
        }
        int var9;
        if (var4.field1346 >= 0) {
            int var6 = var4.field1346;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class22.field415[class693.method3882(class32.method217(96, var8, (byte) 125), 63) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class22.field415[class693.method3882(class32.method217(96, arg0.method1072(var5, true).field7451, (byte) 115), 63) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1342 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1342;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class22.field415[class693.method3882(class32.method217(96, var12, (byte) 127), 63) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)Lqk;", line = 1542)
    public static final class16 method669(int arg0, int arg1) {
        class16 var2 = new class16();
        for (class490 var3 = (class490) field1013.method1156(0); var3 != null; var3 = (class490) field1013.method1158(22706)) {
            if (var3.field6967 && var3.method2893(-5942, arg1, arg0)) {
                var2.method116(var3, 1);
            }
        }
        return var2;
    }
}
