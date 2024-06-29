import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class350 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Lmn;")
    private static class247 field5103 = new class247(16);

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "[S")
    private static short[] field5115 = new short[1];

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field5116 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "[B")
    private static byte[] field5119 = new byte[1];

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field5121 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lar;")
    public static class479 field5114 = new class479();

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "F")
    public static float field5112;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "F")
    public static float field5117;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lmg;")
    public static class101 field5109;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Lcs;")
    private static class226 field5107;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "Lmn;")
    private static class247 field5139;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lvk;")
    public static class248 field5104;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Lom;")
    public static class252 field5111;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lrk;")
    public static class25 field5106;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lks;")
    private static class303 field5105;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lmq;")
    public static class351 field5110;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lim;")
    public static class402 field5108;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Llk;")
    public static class414 field5120;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "[B")
    private static byte[] field5125;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "[B")
    private static byte[] field5128;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "[B")
    private static byte[] field5131;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "[B")
    private static byte[] field5136;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "[B")
    private static byte[] field5138;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "[I")
    private static int[] field5130;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "[S")
    private static short[] field5123;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "[S")
    private static short[] field5141;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[[[B")
    public static byte[][][] field5118;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "[[[Lht;")
    private static class410[][][] field5135;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lya;IIIIIII[S[BZ)V", line = 3)
    private static final void method2079(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method243(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5130[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method243(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class420.method2503(field5130[arg6], arg2, arg4, arg5, arg1, arg3, arg7 >> 6 & 0x3, arg0, -53, field5113, var11, var12, field5118);
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
                class220 var18 = field5110.method2103(arg8[var16] & 0xFFFF, true);
                if (var18.field3093 == -1) {
                    int var19 = -3355444;
                    if (var18.field3119 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method225(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method293(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method225(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method293(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method225(arg1, arg2, arg4, -1, 0);
                            arg0.method293(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method225(var14, arg2, arg4, -1, 0);
                            arg0.method293(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method225(var14, arg2, arg4, -1, 0);
                            arg0.method293(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method225(arg1, arg2, arg4, -1, 0);
                            arg0.method293(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method293(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method293(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method293(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method293(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method293(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method293(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lya;Lhq;IIII)V", line = 167)
    private static final void method2080(class38 arg0, class109 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field1643 = ((arg1.field1645 - field5122) * arg2 + arg4 >> 16) + field5142;
        arg1.field1642 = field5140 - ((arg1.field1644 - field5134) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 172)
    public static final void method2081() {
        field5128 = new byte[field5137 * field5132];
        field5131 = new byte[field5137 * field5132];
        field5125 = new byte[field5137 * field5132];
        field5123 = new short[field5137 * field5132];
        field5138 = new byte[field5137 * field5132];
        field5139 = new class247(1024);
        field5135 = new class410[3][field5132 >> 6][field5137 >> 6];
        field5130 = new int[field5105.field4144 + 1];
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()V", line = 183)
    public static final void method2082() {
        field5128 = null;
        field5136 = null;
        field5141 = null;
        field5131 = null;
        field5125 = null;
        field5123 = null;
        field5138 = null;
        field5139 = null;
        field5135 = null;
        field5130 = null;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()V", line = 195)
    public static void method2083() {
        field5105 = null;
        field5107 = null;
        field5110 = null;
        field5106 = null;
        field5108 = null;
        field5104 = null;
        field5111 = null;
        field5109 = null;
        field5103 = null;
        field5118 = null;
        field5115 = null;
        field5119 = null;
        field5120 = null;
        field5114 = null;
        field5130 = null;
        field5128 = null;
        field5136 = null;
        field5141 = null;
        field5131 = null;
        field5125 = null;
        field5123 = null;
        field5138 = null;
        field5139 = null;
        field5135 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 222)
    public static final void method2084(int arg0) {
        field5111 = (class252) field5103.method1492((long) arg0, 6340);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)V", line = 226)
    public static final void method2085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5122 = arg0 - field5133;
        field5127 = arg1 - field5124;
        field5143 = arg2 - field5133;
        field5134 = arg3 - field5124;
        field5142 = arg4;
        field5129 = arg5;
        field5126 = arg6;
        field5140 = arg7;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lya;IIII)V", line = 239)
    private static final void method2086(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5143 - field5122;
        int var6 = field5127 - field5134;
        if (field5143 < field5132) {
            var5++;
        }
        if (field5127 < field5137) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5142;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5142;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5122 + var7;
                if (var52 >= 0 && var52 < field5132) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5140 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5140 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5134 + var53;
                            int var58 = field5132 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5137) {
                                var59 = (field5136[var58] & 0xFF) << 16 | field5141[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5131[var58] & 0xFF;
                                var61 = field5123[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5111.field3490 != -1) {
                                    var62 = field5111.field3490 | 0xFF000000;
                                } else if ((field5127 + var53 & 0x4) == (field5122 + var7 & 0x4)) {
                                    var62 = field5130[field5105.field4154 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method243(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2079(arg0, var49, var54, var51, var56, var59, var60, field5125[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class488 var63 = (class488) field5139.method1492((long) (var52 << 16 | var57), 6340);
                                if (var63 != null) {
                                    method2079(arg0, var49, var54, var51, var56, var59, var60, field5125[var58], var63.field7133, var63.field7132, true);
                                }
                            } else {
                                field5115[0] = (short) (var61 - 1);
                                field5119[0] = field5138[var58];
                                method2079(arg0, var49, var54, var51, var56, var59, var60, field5125[var58], field5115, field5119, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5140 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5140 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5111.field3490 != -1) {
                            var68 = field5111.field3490 | 0xFF000000;
                        } else if ((field5127 + var64 & 0x4) == (field5122 + var7 & 0x4)) {
                            var68 = field5130[field5105.field4154 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method243(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5142;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5142;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5122 + var8;
                if (var41 >= 0 && var41 < field5132) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5140 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5140 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5134 + var42;
                            if (var46 >= 0 && var46 < field5137) {
                                int var47 = field5123[field5132 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2095(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class488 var48 = (class488) field5139.method1492((long) (var41 << 16 | var46), 6340);
                                    if (var48 != null) {
                                        method2095(arg0, var38, var43, var40, var45, var48.field7133, var48.field7132);
                                    }
                                } else {
                                    field5115[0] = (short) (var47 - 1);
                                    field5119[0] = field5138[field5132 * var46 + var41];
                                    method2095(arg0, var38, var43, var40, var45, field5115, field5119);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5122 >> 6;
        int var10 = field5134 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5143 >> 6;
        int var12 = field5127 >> 6;
        if (var11 >= field5135[0].length) {
            var11 = field5135[0].length - 1;
        }
        if (var12 >= field5135[0][0].length) {
            var12 = field5135[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class410 var28 = field5135[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5133 >> 6) + var14) * 64;
                        int var30 = ((field5124 >> 6) + var27) * 64;
                        for (class205 var31 = (class205) var28.method2461(-78); var31 != null; var31 = (class205) var28.method2458(-56)) {
                            int var32 = var31.field2876 + var29 - field5133 - field5122;
                            int var33 = var31.field2877 + var30 - field5124 - field5134;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5142;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5142;
                            int var36 = field5140 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5140 - (arg2 * var33 + arg4 >> 16);
                            method2079(arg0, var34, var36, var35 - var34, var37 - var36, var31.field2875, var31.field2878 & 0xFF, var31.field2874, var31.field2879, var31.field2880, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class410 var17 = field5135[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5133 >> 6) + var15) * 64;
                        int var19 = ((field5124 >> 6) + var16) * 64;
                        for (class205 var20 = (class205) var17.method2461(-110); var20 != null; var20 = (class205) var17.method2458(27)) {
                            int var21 = var20.field2876 + var18 - field5133 - field5122;
                            int var22 = var20.field2877 + var19 - field5124 - field5134;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5142;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5142;
                            int var25 = field5140 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5140 - (arg2 * var22 + arg4 >> 16);
                            method2095(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2879, var20.field2880);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lya;)V", line = 582)
    public static final void method2087(class38 arg0) {
        int var1 = field5143 - field5122;
        int var2 = field5127 - field5134;
        int var3 = (field5126 - field5142 << 16) / var1;
        int var4 = (field5140 - field5129 << 16) / var2;
        method2086(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lga;II)V", line = 594)
    public static final void method2088(class277 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5105.field4144; var3++) {
            field5130[var3 + 1] = method2092(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "()V", line = 605)
    private static final void method2089() {
        for (int var0 = 0; var0 < field5132; var0++) {
            for (int var11 = 0; var11 < field5137; var11++) {
                int var12 = field5123[field5132 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class488 var13 = (class488) field5139.method1492((long) (var0 << 16 | var11), 6340);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field7133.length; var14++) {
                                class220 var15 = field5110.method2103(var13.field7133[var14] & 0xFFFF, true);
                                int var16 = var15.field3129;
                                if (var15.field3080 != null) {
                                    class220 var17 = var15.method1362(true, field5104);
                                    if (var17 != null) {
                                        var16 = var17.field3129;
                                    }
                                }
                                if (var16 != -1) {
                                    class109 var18 = new class109(var16);
                                    var18.field1645 = var0;
                                    var18.field1644 = var11;
                                    field5114.method2809(var18, 2);
                                }
                            }
                        }
                    } else {
                        class220 var19 = field5110.method2103(var12 - 1, true);
                        int var20 = var19.field3129;
                        if (var19.field3080 != null) {
                            class220 var21 = var19.method1362(true, field5104);
                            if (var21 != null) {
                                var20 = var21.field3129;
                            }
                        }
                        if (var20 != -1) {
                            class109 var22 = new class109(var20);
                            var22.field1645 = var0;
                            var22.field1644 = var11;
                            field5114.method2809(var22, 2);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5135[0].length; var2++) {
                for (int var3 = 0; var3 < field5135[0][0].length; var3++) {
                    class410 var4 = field5135[var1][var2][var3];
                    if (var4 != null) {
                        for (class205 var5 = (class205) var4.method2461(-108); var5 != null; var5 = (class205) var4.method2458(-30)) {
                            if (var5.field2879 != null) {
                                for (int var6 = 0; var6 < var5.field2879.length; var6++) {
                                    class220 var7 = field5110.method2103(var5.field2879[var6] & 0xFFFF, true);
                                    int var8 = var7.field3129;
                                    if (var7.field3080 != null) {
                                        class220 var9 = var7.method1362(true, field5104);
                                        if (var9 != null) {
                                            var8 = var9.field3129;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class109 var10 = new class109(var8);
                                        var10.field1645 = ((field5133 >> 6) + var2) * 64 + var5.field2876 - field5133;
                                        var10.field1644 = ((field5124 >> 6) + var3) * 64 + var5.field2877 - field5124;
                                        field5114.method2809(var10, 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([B[B[SII)V", line = 762)
    private static final void method2090(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5137];
        int[] var6 = new int[field5137];
        int[] var7 = new int[field5137];
        int[] var8 = new int[field5137];
        int[] var9 = new int[field5137];
        for (int var10 = -5; var10 < field5132; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5137; var13++) {
                int var10002;
                if (var11 < field5132) {
                    int var28 = arg0[field5132 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class26 var29 = field5107.method1408(var28 - 1, (byte) 99);
                        var5[var13] += var29.field334;
                        var6[var13] += var29.field335;
                        var7[var13] += var29.field342;
                        var8[var13] += var29.field339;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5132 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class26 var31 = field5107.method1408(var30 - 1, (byte) 81);
                        var5[var13] -= var31.field334;
                        var6[var13] -= var31.field335;
                        var7[var13] -= var31.field342;
                        var8[var13] -= var31.field339;
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
                for (int var19 = -5; var19 < field5137; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5137) {
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
                        if ((arg0[field5132 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5132 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class118.method833(var16 / var18, 4, var15 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5132 * var19 + var10;
                            int var27 = class40.field506[class357.method2141(class435.method2568(var25, 96, 2985), 96) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Lom;", line = 910)
    public static final class252 method2091(int arg0, int arg1) {
        for (class252 var2 = (class252) field5103.method1494(0); var2 != null; var2 = (class252) field5103.method1493((byte) 71)) {
            if (var2.field3491 && var2.method1512(1, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lga;III)I", line = 923)
    private static final int method2092(class277 arg0, int arg1, int arg2, int arg3) {
        class28 var4 = field5105.method1765(106, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field378;
        if (var5 >= 0 && arg0.method1654(117, var5).field2501) {
            var5 = -1;
        }
        int var9;
        if (var4.field372 >= 0) {
            int var6 = var4.field372;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class40.field506[class357.method2141(class467.method2735(var8, 96, 0), -17) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class40.field506[class357.method2141(class467.method2735(arg0.method1654(59, var5).field2484, 96, 0), 96) & 0xFFFF] | 0xFF000000;
        } else if (var4.field370 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field370;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class40.field506[class357.method2141(class467.method2735(var12, 96, 0), -67) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Lya;IIII)Lar;", line = 981)
    private static final class479 method2093(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class109 var5 = (class109) field5114.method2818((byte) -109); var5 != null; var5 = (class109) field5114.method2820((byte) -58)) {
            method2080(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5114;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lya;Lsi;IIII[I[I)V", line = 992)
    private static final void method2094(class38 arg0, class391 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2348(-2);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2348(-2);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5128[field5132 * arg5 + arg4] = (byte) var11;
                    field5131[field5132 * arg5 + arg4] = 0;
                } else {
                    field5131[field5132 * arg5 + arg4] = (byte) var11;
                    field5125[field5132 * arg5 + arg4] = 0;
                    field5128[field5132 * arg5 + arg4] = arg1.method2337(-1);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2348(-2);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2348(-2);
                var18 = arg1.method2348(-2);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2348(-2);
            }
            if (var15 == 0) {
                field5128[field5132 * arg5 + arg4] = (byte) var16;
                field5131[field5132 * arg5 + arg4] = (byte) var17;
                field5125[field5132 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5123[field5132 * arg5 + arg4] = (short) (arg1.method2353((byte) 110) + 1);
                    field5138[field5132 * arg5 + arg4] = arg1.method2337(-1);
                } else if (var19 > 1) {
                    field5123[field5132 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2353((byte) 89);
                        var21[var22] = arg1.method2337(-1);
                    }
                    field5139.method1487(-67, (long) (arg4 << 16 | arg5), new class488(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2353((byte) 113);
                        var24[var25] = arg1.method2337(-1);
                    }
                }
                if (field5135[var15 - 1][arg2 - (field5133 >> 6)][arg3 - (field5124 >> 6)] == null) {
                    field5135[var15 - 1][arg2 - (field5133 >> 6)][arg3 - (field5124 >> 6)] = new class410();
                }
                class205 var26 = new class205(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5135[var15 - 1][arg2 - (field5133 >> 6)][arg3 - (field5124 >> 6)].method2454(-9946, var26);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lya;IIII[S[B)V", line = 1126)
    private static final void method2095(class38 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class220 var8 = field5110.method2103(arg5[var7] & 0xFFFF, true);
            int var9 = var8.field3093;
            if (var9 != -1) {
                class256 var10 = field5108.method2423(var9, 64);
                class16 var11 = var10.method1537(var8.field3124 ? arg6[var7] >> 6 & 0x3 : 0, arg0, 6, var8.field3135 ? var8.field3068 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method84() >> 2;
                    int var13 = arg4 * var11.method93() >> 2;
                    if (var10.field3564) {
                        int var14 = var8.field3143;
                        int var15 = var8.field3118;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field3557 == 0) {
                            var11.method99(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method94(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field3557 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Lya;)Lar;", line = 1185)
    public static final class479 method2096(class38 arg0) {
        int var1 = field5143 - field5122;
        int var2 = field5127 - field5134;
        int var3 = (field5126 - field5142 << 16) / var1;
        int var4 = (field5140 - field5129 << 16) / var2;
        return method2093(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lya;II)V", line = 1196)
    public static final void method2097(class38 arg0, int arg1, int arg2) {
        class391 var3 = new class391(field5109.method752(field5111.field3478, "area", 119));
        int var4 = var3.method2348(-2);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2348(-2);
        }
        int var7 = var3.method2348(-2);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2348(-2);
        }
        while (true) {
            while (var3.field5719 < var3.field5678.length) {
                if (var3.method2348(-2) == 0) {
                    int var22 = var3.method2348(-2);
                    int var23 = var3.method2348(-2);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5133;
                            int var27 = var23 * 64 + var25 - field5124;
                            method2094(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2348(-2);
                    int var29 = var3.method2348(-2);
                    int var30 = var3.method2348(-2);
                    int var31 = var3.method2348(-2);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5133;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5124;
                            method2094(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5136 = new byte[field5137 * field5132];
            field5141 = new short[field5137 * field5132];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5137 * field5132];
                for (int var13 = 0; var13 < field5135[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5135[var11][0].length; var19++) {
                        class410 var20 = field5135[var11][var13][var19];
                        if (var20 != null) {
                            for (class205 var21 = (class205) var20.method2461(-107); var21 != null; var21 = (class205) var20.method2458(24)) {
                                var12[(var19 * 64 + var21.field2877) * field5132 + var13 * 64 + var21.field2876] = (byte) var21.field2875;
                            }
                        }
                    }
                }
                method2090(var12, field5136, field5141, arg1, arg2);
                for (int var14 = 0; var14 < field5135[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5135[var11][0].length; var15++) {
                        class410 var16 = field5135[var11][var14][var15];
                        if (var16 != null) {
                            for (class205 var17 = (class205) var16.method2461(-78); var17 != null; var17 = (class205) var16.method2458(111)) {
                                int var18 = (var15 * 64 + var17.field2877) * field5132 + var14 * 64 + var17.field2876;
                                var17.field2875 = (field5136[var18] & 0xFF) << 16 | field5141[var18] & 0xFFFF;
                                if (var17.field2875 != 0) {
                                    var17.field2875 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2090(field5128, field5136, field5141, arg1, arg2);
            field5128 = null;
            method2089();
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Lcn;", line = 1376)
    public static final class356 method2098(int arg0, int arg1) {
        class356 var2 = new class356();
        for (class252 var3 = (class252) field5103.method1494(0); var3 != null; var3 = (class252) field5103.method1493((byte) 77)) {
            if (var3.field3491 && var3.method1512(1, arg0, arg1)) {
                var2.method2127((byte) -116, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "()V", line = 1392)
    public static final void method2099() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5120.field6045; var1++) {
            boolean var2 = field5111.method1508(field5120.field6043[var1] & 0x3FFF, var0, field5120.field6043[var1] >> 14 & 0x3FFF, field5120.field6043[var1] >> 28 & 0x3, 10593);
            if (var2) {
                class109 var3 = new class109(field5120.field6038[var1]);
                var3.field1645 = var0[1] - field5133;
                var3.field1644 = var0[2] - field5124;
                field5114.method2809(var3, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Lom;", line = 1415)
    public static final class252 method2100(int arg0) {
        return (class252) field5103.method1492((long) arg0, 6340);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lmg;Lks;Lcs;Lmq;Lrk;Lim;Lvk;)V", line = 1418)
    public static final void method2101(class101 arg0, class303 arg1, class226 arg2, class351 arg3, class25 arg4, class402 arg5, class248 arg6) {
        field5109 = arg0;
        field5105 = arg1;
        field5107 = arg2;
        field5110 = arg3;
        field5106 = arg4;
        field5108 = arg5;
        field5104 = arg6;
        field5103.method1490(true);
        int var7 = field5109.method735(83, "details");
        int[] var8 = field5109.method754(var7, (byte) 82);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class252 var10 = class422.method2512(field5109, var8[var9], var7, -126);
            field5103.method1487(-111, (long) var10.field3487, var10);
        }
        class235.method1450(false, true, 5);
    }
}
