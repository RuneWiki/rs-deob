import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class335 {

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
    private int[] field5192 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
    private int[] field5193 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field5186;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lbl;")
    private class262 field5179;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lhs;")
    private class94 field5165;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
    public boolean field5190;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "[[[B")
    private byte[][][] field5169;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "[[[B")
    private byte[][][] field5177;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "[[[I")
    public int[][][] field5184;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[[[B")
    private byte[][][] field5175;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "[[[B")
    public byte[][][] field5191;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[[[B")
    private byte[][][] field5176;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Z")
    public static boolean field5163 = false;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field5178 = 12;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lvn;")
    public static class140 field5162 = new class140();

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "[[[B")
    public byte[][][] field5182;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 11)
    public static void method2149(byte arg0) {
        if (arg0 <= 9) {
            method2152((byte) -11, 36);
        }
        field5162 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([Lwq;IIIILtl;I)V", line = 21)
    public final void method2150(class370[] arg0, int arg1, int arg2, int arg3, int arg4, class91 arg5, int arg6) {
        field5167++;
        if (!this.field5190) {
            for (int var8 = 0; var8 < 4; var8++) {
                class370 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && var12 < this.field5186 && var13 >= 0 && this.field5170 > var13) {
                            var9.method2320(var12, 0, var13);
                        }
                    }
                }
            }
        }
        if (arg6 != -8060) {
            return;
        }
        int var14 = arg3 + arg4;
        int var15 = arg1 + arg2;
        for (int var16 = 0; var16 < this.field5171; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2156(false, var16, arg3 + var17, 0, 0, var14 + var17, arg2 + var18, 12, arg5, var15 + var18, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lqa;Lna;ILna;BLna;[[I)V", line = 102)
    private final void method2151(class496 arg0, class206 arg1, int arg2, class206 arg3, byte arg4, class206 arg5, int[][] arg6) {
        field5183++;
        byte[][] var8 = this.field5175[arg2];
        byte[][] var9 = this.field5177[arg2];
        byte[][] var10 = this.field5176[arg2];
        byte[][] var11 = this.field5169[arg2];
        for (int var12 = 0; var12 < this.field5186; var12++) {
            int var13 = var12 >= (this.field5186 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field5170; var14++) {
                int var15 = var14 >= (this.field5170 - 1) ? var14 : var14 + 1;
                if (class42.field641 == -1 || class411.method2500(arg2, class42.field641, var12, var14, (byte) 9)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class95 var26 = var21 == 0 ? null : this.field5165.method657(1, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class362 var27 = var22 == 0 ? null : this.field5179.method1689(var22 - 1, arg4 ^ 0x64);
                        class95 var28 = var26;
                        if (var26 != null) {
                            if (var26.field1375 == -1 && var26.field1374 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field1383;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field5186 > var12 && this.field5170 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var34--;
                                var32--;
                            }
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var35--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            int var37 = var34 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method849(var12, var14) - arg5.method849(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method849(var13, var14) - arg5.method849(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class390.field5918[var39] = -1;
                            class285.field4245[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field1383 ? class78.field1067[var19] : class100.field1438[var19];
                        this.method2157(arg0, var8, var12, var19, var18, var20, 256, var11, var9, var14, this.field5170, var27, this.field5186, var26);
                        boolean var41 = var26 != null && var26.field1375 != var26.field1374;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class390.field5918[var42] >= 0 && class425.field6344[var42] != class181.field2583[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class494.method2940(var18[1], class494.method2942(class285.field4245[2], class285.field4245[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class494.method2940(var18[3], class494.method2942(class285.field4245[0], class285.field4245[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class494.method2940(var18[0], class494.method2942(class285.field4245[0], class285.field4245[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class494.method2940(var18[2], class494.method2942(class285.field4245[4], class285.field4245[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var49 = var27 == null ? 0 : class384.field5867[var19];
                            var48 = class407.field6148[var19];
                            var46 = class482.field7023[var19];
                            var47 = var26 == null ? 0 : class208.field2939[var19];
                            var45 = class481.field7017[var19];
                        } else if (var17) {
                            var45 = class423.field6310[var19];
                            var44 = class137.field1999[var19];
                            var46 = class216.field3007[var19];
                            var47 = var26 == null ? 0 : class485.field7098[var19];
                            var48 = class164.field2396[var19];
                            var49 = var27 == null ? 0 : class158.field2293[var19];
                        } else {
                            var49 = var27 == null ? 0 : class78.field1065[var19];
                            var44 = class411.field6187[var19];
                            var48 = class6.field102[var19];
                            var47 = var26 == null ? 0 : class211.field2972[var19];
                            var46 = class30.field465[var19];
                            var45 = class379.field5778[var19];
                        }
                        int var50 = var47 + var49;
                        if (var50 <= 0) {
                            class471.method2823(arg2, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field1375;
                                var63 = arg0.method1132() ? var26.field1385 : var26.field1386;
                                var64 = var26.field1376;
                                int var65 = class158.method1032(var26, 6, arg0);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = 1;
                                        class435.field6464[2] = var48[var51];
                                        class435.field6464[3] = 1;
                                        class435.field6464[4] = var46[var51];
                                        var68 = 6;
                                        class435.field6464[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = 5;
                                        class435.field6464[2] = var48[var51];
                                        class435.field6464[3] = 5;
                                        class435.field6464[4] = var46[var51];
                                        var68 = 6;
                                        class435.field6464[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = 3;
                                        class435.field6464[2] = var48[var51];
                                        class435.field6464[3] = 3;
                                        class435.field6464[4] = var46[var51];
                                        var68 = 6;
                                        class435.field6464[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = 7;
                                        class435.field6464[2] = var48[var51];
                                        class435.field6464[3] = 7;
                                        class435.field6464[4] = var46[var51];
                                        var68 = 6;
                                        class435.field6464[5] = var48[var51];
                                    } else {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = var46[var51];
                                        class435.field6464[2] = var48[var51];
                                        var68 = 3;
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class435.field6464[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field5192[var70];
                                        int var73 = this.field5193[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = 128 - var72;
                                            var75 = var73;
                                        } else if (var20 == 2) {
                                            var75 = 128 - var72;
                                            var74 = 128 - var73;
                                        } else if (var20 == 3) {
                                            var74 = var72;
                                            var75 = 128 - var73;
                                        } else {
                                            var74 = var73;
                                            var75 = var72;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class507.field7545[var19][var70]) {
                                            int var76 = (var12 << 7) + var75;
                                            int var77 = (var14 << 7) + var74;
                                            var60[var52] = arg1.method853(var76, var77) - arg5.method853(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class507.field7545[var19][var70]) {
                                                int var78 = (var12 << 7) + var75;
                                                int var79 = (var14 << 7) + var74;
                                                var61[var52] = arg5.method853(var78, var79) - arg1.method853(var78, var79);
                                            } else if (arg3 != null && !class380.field5803[var19][var70]) {
                                                int var80 = (var12 << 7) + var75;
                                                int var81 = (var14 << 7) + var74;
                                                var61[var52] = arg3.method853(var80, var81) - arg5.method853(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field1378 < class390.field5918[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class425.field6344[var71];
                                            }
                                            var59[var52] = class16.field255[var71];
                                            var58[var52] = class512.field7597[var71];
                                            var57[var52] = class181.field2583[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg0.method1132() ? var26.field1385 : var26.field1386;
                                            var59[var52] = var26.field1376;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field5190 && arg2 == 0) {
                                    class228.method1566(var12, var14, var26.field1373, var26.field1388 * 8, var26.field1384);
                                }
                                if (var19 != 12 && var26.field1375 != -1 && var26.field1389) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class208.field2939[var19];
                            } else if (var17) {
                                var51 += class485.field7098[var19];
                            } else {
                                var51 += class211.field2972[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class362 var82 = this.field5179.method1689(var22 - 1, arg4 ^ 0x33);
                                class362 var83 = this.field5179.method1689(var23 - 1, -32);
                                class362 var84 = this.field5179.method1689(var24 - 1, 97);
                                class362 var85 = this.field5179.method1689(var25 - 1, 123);
                                for (int var86 = 0; var86 < var49; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = 1;
                                        class435.field6464[2] = var48[var51];
                                        class435.field6464[3] = 1;
                                        class435.field6464[4] = var46[var51];
                                        class435.field6464[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = 5;
                                        class435.field6464[2] = var48[var51];
                                        class435.field6464[3] = 5;
                                        class435.field6464[4] = var46[var51];
                                        var88 = 6;
                                        class435.field6464[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = 3;
                                        class435.field6464[2] = var48[var51];
                                        class435.field6464[3] = 3;
                                        class435.field6464[4] = var46[var51];
                                        var88 = 6;
                                        class435.field6464[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = 7;
                                        class435.field6464[2] = var48[var51];
                                        class435.field6464[3] = 7;
                                        class435.field6464[4] = var46[var51];
                                        class435.field6464[5] = var48[var51];
                                        var88 = 6;
                                    } else {
                                        class435.field6464[0] = var45[var51];
                                        class435.field6464[1] = var46[var51];
                                        class435.field6464[2] = var48[var51];
                                        var88 = 3;
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class435.field6464[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field5192[var90];
                                        int var93 = this.field5193[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 128 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var94 = 128 - var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 128 - var93;
                                        } else {
                                            var94 = var93;
                                            var95 = var92;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class507.field7545[var19][var90]) {
                                            int var96 = (var12 << 7) + var95;
                                            int var97 = (var14 << 7) + var94;
                                            var60[var52] = arg1.method853(var96, var97) - arg5.method853(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class507.field7545[var19][var90]) {
                                                int var98 = (var12 << 7) + var95;
                                                int var99 = (var14 << 7) + var94;
                                                var61[var52] = arg5.method853(var98, var99) - arg1.method853(var98, var99);
                                            } else if (arg3 != null && !class380.field5803[var19][var90]) {
                                                int var100 = (var12 << 7) + var95;
                                                int var101 = (var14 << 7) + var94;
                                                var61[var52] = arg3.method853(var100, var101) - arg5.method853(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class390.field5918[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class425.field6344[var91];
                                            }
                                            var59[var52] = class16.field255[var91];
                                            var58[var52] = class512.field7597[var91];
                                            var57[var52] = class181.field2583[var91];
                                        } else {
                                            if (var17 && class507.field7545[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var82.field5607;
                                                var59[var52] = var82.field5616;
                                            } else if (var95 == 0 && var94 == 128) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var83.field5607;
                                                var59[var52] = var83.field5616;
                                            } else if (var95 == 128 && var94 == 128) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var84.field5607;
                                                var59[var52] = var84.field5616;
                                            } else if (var95 == 128 && var94 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var85.field5607;
                                                var59[var52] = var85.field5616;
                                            } else {
                                                if (var95 >= 64) {
                                                    if (var94 < 64) {
                                                        var58[var52] = var85.field5607;
                                                        var59[var52] = var85.field5616;
                                                    } else {
                                                        var58[var52] = var84.field5607;
                                                        var59[var52] = var84.field5616;
                                                    }
                                                } else if (var94 >= 64) {
                                                    var58[var52] = var83.field5607;
                                                    var59[var52] = var83.field5616;
                                                } else {
                                                    var58[var52] = var82.field5607;
                                                    var59[var52] = var82.field5616;
                                                }
                                                int var102 = class40.method319(arg6[var12][var14], arg6[var13][var14], 28365, var95 << 7 >> 7);
                                                int var103 = class40.method319(arg6[var12][var15], arg6[var13][var15], arg4 + 28400, var95 << 7 >> 7);
                                                var57[var52] = class40.method319(var102, var103, 28365, var94 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field5606) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg5.method849(var12, var14);
                            int var105 = arg5.method849(var13, var14);
                            int var106 = arg5.method849(var13, var15);
                            int var107 = arg5.method849(var12, var15);
                            if (arg2 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field1382) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field5191[arg2][var12][var14] = (byte) class286.method1860(this.field5191[arg2][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field5190) {
                                var109 = class10.method87(var12, var14);
                                var110 = class432.method2586(var12, var14);
                                var111 = class437.method2611(var12, var14);
                            }
                            arg5.method850(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class471.method2823(arg2, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg4 != -35) {
            this.field5190 = true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V", line = 973)
    public static final void method2152(byte arg0, int arg1) {
        if (class30.field464 == 0) {
            class295.field4368.method1515(arg1, -193);
        } else {
            class388.field5899 = arg1;
        }
        field5188++;
        int var2 = -19 / ((56 - arg0) / 34);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lna;Lqa;BLna;)V", line = 990)
    public final void method2153(class206 arg0, class496 arg1, byte arg2, class206 arg3) {
        field5174++;
        if (class514.field7618 == null || class514.field7618.length != this.field5170) {
            class38.field608 = new int[this.field5170];
            class514.field7618 = new int[this.field5170];
            class72.field979 = new int[this.field5170];
            class202.field2842 = new int[this.field5170];
            class299.field4426 = new int[this.field5170];
        }
        int[][] var5 = new int[this.field5186][this.field5170];
        int var6 = -2 / ((arg2 + 58) / 49);
        for (int var7 = 0; var7 < this.field5171; var7++) {
            for (int var9 = 0; var9 < this.field5170; var9++) {
                class514.field7618[var9] = 0;
                class202.field2842[var9] = 0;
                class38.field608[var9] = 0;
                class299.field4426[var9] = 0;
                class72.field979[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field5186; var10++) {
                for (int var11 = 0; var11 < this.field5170; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (this.field5186 > var20) {
                        int var21 = this.field5176[var7][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class362 var22 = this.field5179.method1689(var21 - 1, -43);
                            class514.field7618[var11] += var22.field5614;
                            class202.field2842[var11] += var22.field5603;
                            class38.field608[var11] += var22.field5612;
                            class299.field4426[var11] += var22.field5602;
                            var10002 = class72.field979[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field5176[var7][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class362 var25 = this.field5179.method1689(var24 - 1, 120);
                            class514.field7618[var11] -= var25.field5614;
                            class202.field2842[var11] -= var25.field5603;
                            class38.field608[var11] -= var25.field5612;
                            class299.field4426[var11] -= var25.field5602;
                            var10002 = class72.field979[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field5170; var17++) {
                        int var18 = var17 + 5;
                        if (var18 < this.field5170) {
                            var14 += class38.field608[var18];
                            var15 += class299.field4426[var18];
                            var16 += class72.field979[var18];
                            var12 += class514.field7618[var18];
                            var13 += class202.field2842[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var13 -= class202.field2842[var19];
                            var12 -= class514.field7618[var19];
                            var14 -= class38.field608[var19];
                            var16 -= class72.field979[var19];
                            var15 -= class299.field4426[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var5[var10][var17] = class91.method624(true, var13 / var16, var12 * 256 / var15, var14 / var16);
                        }
                    }
                }
            }
            if (class341.field5379) {
                this.method2151(arg1, var7 == 0 ? arg0 : null, var7, var7 == 0 ? arg3 : null, (byte) -35, class455.field6683[var7], var5);
            } else {
                this.method2159(arg1, var7 == 0 ? arg0 : null, var7, var7 == 0 ? arg3 : null, var5, class455.field6683[var7], true);
            }
            this.field5176[var7] = null;
            this.field5169[var7] = null;
            this.field5175[var7] = null;
            this.field5177[var7] = null;
        }
        if (!this.field5190) {
            if (class181.field2575 != 0) {
                class434.method2602();
            }
            if (class286.field4263) {
                class437.method2616();
            }
        }
        for (int var8 = 0; var8 < this.field5171; var8++) {
            class455.field6683[var8].method851();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ltl;IIIII[Lwq;III)V", line = 1170)
    public final void method2154(class91 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class370[] arg6, int arg7, int arg8, int arg9) {
        field5164++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg5 & 0x7) * 8;
        if (!this.field5190) {
            class370 var13 = arg6[arg4];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class237.method1603(true, var15 & 0x7, var14 & 0x7, arg7) + arg3;
                    int var17 = class491.method2915(arg7, 14954, var15 & 0x7, var14 & 0x7) + arg1;
                    if (var16 > 0 && this.field5186 - 1 > var16 && var17 > 0 && this.field5170 - 1 > var17) {
                        var13.method2320(var16, 0, var17);
                    }
                }
            }
        }
        int var18 = 68 / ((arg9 - 11) / 63);
        int var19 = (arg2 & 0xFFFFFFF8) << 3;
        int var20 = arg5 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg7 == 1) {
            var22 = 1;
        } else if (arg7 == 2) {
            var22 = 1;
            var21 = 1;
        } else if (arg7 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < this.field5171; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg8 != var23 || var24 < var11 || var24 > var11 + 8 || var12 > var25 || var25 > var12 + 8) {
                        this.method2156(false, 0, -1, 0, 0, 0, -1, 12, arg0, 0, 0);
                    } else if ((var11 + 8) == var24 || var12 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg7 == 0) {
                            var32 = arg1 + var25 - var12;
                            var33 = var24 + arg3 - var11;
                        } else if (arg7 == 1) {
                            var33 = arg3 + var25 - var12;
                            var32 = arg1 + var11 + 8 - var24;
                        } else if (arg7 == 2) {
                            var32 = var12 + arg1 + 8 - var25;
                            var33 = arg3 + 8 - (-var11 + var24);
                        } else {
                            var33 = arg3 - (var25 - var12 - 8);
                            var32 = arg1 - (var11 - var24);
                        }
                        this.method2156(true, arg4, var33, 0, 0, var19 + var24, var32, 12, arg0, var20 + var25, 0);
                    } else {
                        int var26 = arg3 + class237.method1603(true, var25 & 0x7, var24 & 0x7, arg7);
                        int var27 = class491.method2915(arg7, 14954, var25 & 0x7, var24 & 0x7) + arg1;
                        this.method2156(false, arg4, var26, arg7, var22, var19 + var24, var27, 12, arg0, var20 + var25, var21);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg7 == 0) {
                                var30 = var29 + arg1 - var12;
                                var31 = var28 + arg3 - var11;
                            } else if (arg7 == 1) {
                                var30 = arg1 + 8 - (-var11 + var28);
                                var31 = arg3 + var29 - var12;
                            } else if (arg7 == 2) {
                                var30 = -var29 - (-var12 - (arg1 + 8));
                                var31 = var11 + arg3 + 8 - var28;
                            } else {
                                var30 = var28 + arg1 - var11;
                                var31 = arg3 + (var12 - var29) + 8;
                            }
                            if (var31 >= 0 && this.field5186 > var31 && var30 >= 0 && this.field5170 > var30) {
                                this.field5184[arg4][var31][var30] = this.field5184[arg4][var21 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V", line = 1351)
    public final void method2155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field5171; var6++) {
            this.method2163(arg3, arg1, arg0, var6, arg4, (byte) 112);
        }
        if (arg2 != 3532) {
            this.method2158(null, true, null, null);
        }
        field5166++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIIIIIILtl;II)V", line = 1369)
    private final void method2156(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class91 arg8, int arg9, int arg10) {
        if (arg3 == 1) {
            arg4 = 1;
        } else if (arg3 == 2) {
            arg10 = 1;
            arg4 = 1;
        } else if (arg3 == 3) {
            arg10 = 1;
        }
        if (arg7 != 12) {
            this.method2150(null, 29, -73, -3, -73, null, 60);
        }
        field5180++;
        if (arg2 < 0 || arg2 >= this.field5186 || arg6 < 0 || this.field5170 <= arg6) {
            while (true) {
                int var14 = arg8.method618((byte) 100);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method618((byte) 100);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method618((byte) 100);
                }
            }
        }
        if (!this.field5190 && !arg0) {
            class129.field1816[arg1][arg2][arg6] = 0;
        }
        while (true) {
            int var12 = arg8.method618((byte) 100);
            if (var12 == 0) {
                if (this.field5190) {
                    this.field5184[0][arg2 + arg10][arg4 + arg6] = 0;
                    return;
                } else if (arg1 == 0) {
                    this.field5184[0][arg2 + arg10][arg4 + arg6] = -class348.method2212(arg9 + 556238, (byte) 8, arg5 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field5184[arg1][arg2 + arg10][arg4 + arg6] = this.field5184[arg1 - 1][arg2 + arg10][arg4 + arg6] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method618((byte) 100);
                if (this.field5190) {
                    this.field5184[0][arg2 + arg10][arg4 + arg6] = var13 * 8 << 0;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg1 == 0) {
                    this.field5184[0][arg2 + arg10][arg4 + arg6] = -var13 * 8 << 0;
                    return;
                }
                this.field5184[arg1][arg2 + arg10][arg4 + arg6] = this.field5184[arg1 - 1][arg2 + arg10][arg4 + arg6] - (var13 * 8 << 0);
                return;
            }
            if (var12 <= 49) {
                if (arg0) {
                    arg8.method618((byte) 100);
                } else {
                    this.field5169[arg1][arg2][arg6] = arg8.method619((byte) -23);
                    this.field5175[arg1][arg2][arg6] = (byte) ((var12 - 2) / 4);
                    this.field5177[arg1][arg2][arg6] = (byte) class494.method2942(var12 + arg3 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field5190 && !arg0) {
                    class129.field1816[arg1][arg2][arg6] = (byte) (var12 - 49);
                }
            } else if (!arg0) {
                this.field5176[arg1][arg2][arg6] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lqa;[[BII[ZII[[B[[BIILao;ILcw;)V", line = 1501)
    private final void method2157(class496 arg0, byte[][] arg1, int arg2, int arg3, boolean[] arg4, int arg5, int arg6, byte[][] arg7, byte[][] arg8, int arg9, int arg10, class362 arg11, int arg12, class95 arg13) {
        field5168++;
        if (arg6 != 256) {
            this.method2161(null, -87, 89);
        }
        if (arg13 != null && arg11 != null || arg11 != null && arg3 == 12 || arg13 != null && arg3 == 0) {
            boolean[] var15 = arg13 != null && arg13.field1383 ? class78.field1067[arg3] : class100.field1438[arg3];
            if (arg9 > 0) {
                if (arg2 > 0) {
                    int var16 = arg7[arg2 - 1][arg9 - 1] & 0xFF;
                    if (var16 > 0) {
                        class95 var17 = this.field5165.method657(1, var16 - 1);
                        if (var17.field1375 != -1 && var17.field1383) {
                            byte var18 = arg1[arg2 - 1][arg9 - 1];
                            int var19 = (arg8[arg2 - 1][arg9 - 1] * 2) + 4 & 0x7;
                            int var20 = class158.method1032(var17, arg6 - 250, arg0);
                            if (class507.field7545[var18][var19]) {
                                class181.field2583[0] = var17.field1375;
                                class425.field6344[0] = var20;
                                class512.field7597[0] = arg0.method1132() ? var17.field1385 : var17.field1386;
                                class16.field255[0] = var17.field1376;
                                class390.field5918[0] = var17.field1378;
                                class285.field4245[0] = 256;
                            }
                        }
                    }
                }
                if (arg12 - 1 > arg2) {
                    int var21 = arg7[arg2 + 1][arg9 - 1] & 0xFF;
                    if (var21 > 0) {
                        class95 var22 = this.field5165.method657(arg6 ^ 0x101, var21 - 1);
                        if (var22.field1375 != -1 && var22.field1383) {
                            byte var23 = arg1[arg2 + 1][arg9 - 1];
                            int var24 = arg8[arg2 + 1][arg9 - 1] * 2 + 6 & 0x7;
                            int var25 = class158.method1032(var22, 6, arg0);
                            if (class507.field7545[var23][var24]) {
                                class181.field2583[2] = var22.field1375;
                                class425.field6344[2] = var25;
                                class512.field7597[2] = arg0.method1132() ? var22.field1385 : var22.field1386;
                                class16.field255[2] = var22.field1376;
                                class390.field5918[2] = var22.field1378;
                                class285.field4245[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg9 < (arg10 - 1)) {
                if (arg2 > 0) {
                    int var26 = arg7[arg2 - 1][arg9 + 1] & 0xFF;
                    if (var26 > 0) {
                        class95 var27 = this.field5165.method657(1, var26 - 1);
                        if (var27.field1375 != -1 && var27.field1383) {
                            byte var28 = arg1[arg2 - 1][arg9 + 1];
                            int var29 = arg8[arg2 - 1][arg9 + 1] * 2 + 2 & 0x7;
                            int var30 = class158.method1032(var27, arg6 ^ 0x106, arg0);
                            if (class507.field7545[var28][var29]) {
                                class181.field2583[6] = var27.field1375;
                                class425.field6344[6] = var30;
                                class512.field7597[6] = arg0.method1132() ? var27.field1385 : var27.field1386;
                                class16.field255[6] = var27.field1376;
                                class390.field5918[6] = var27.field1378;
                                class285.field4245[6] = 64;
                            }
                        }
                    }
                }
                if (arg2 < (arg12 - 1)) {
                    int var31 = arg7[arg2 + 1][arg9 + 1] & 0xFF;
                    if (var31 > 0) {
                        class95 var32 = this.field5165.method657(arg6 - 255, var31 + -1);
                        if (var32.field1375 != -1 && var32.field1383) {
                            byte var33 = arg1[arg2 + 1][arg9 + 1];
                            int var34 = arg8[arg2 + 1][arg9 + 1] * 2 & 0x7;
                            int var35 = class158.method1032(var32, 6, arg0);
                            if (class507.field7545[var33][var34]) {
                                class181.field2583[4] = var32.field1375;
                                class425.field6344[4] = var35;
                                class512.field7597[4] = arg0.method1132() ? var32.field1385 : var32.field1386;
                                class16.field255[4] = var32.field1376;
                                class390.field5918[4] = var32.field1378;
                                class285.field4245[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg9 > 0) {
                int var36 = arg7[arg2][arg9 - 1] & 0xFF;
                if (var36 > 0) {
                    class95 var37 = this.field5165.method657(1, var36 - 1);
                    if (var37.field1375 != -1) {
                        byte var38 = arg1[arg2][arg9 - 1];
                        byte var39 = arg8[arg2][arg9 - 1];
                        if (var37.field1383) {
                            int var40 = 2;
                            int var41 = (var39 * 2) + 4;
                            int var42 = class158.method1032(var37, 6, arg0);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var41 &= 0x7;
                                var40 &= 0x7;
                                if (class507.field7545[var38][var41] && class390.field5918[var40] <= var37.field1378) {
                                    class181.field2583[var40] = var37.field1375;
                                    class425.field6344[var40] = var42;
                                    class512.field7597[var40] = arg0.method1132() ? var37.field1385 : var37.field1386;
                                    class16.field255[var40] = var37.field1376;
                                    if (class390.field5918[var40] == var37.field1378) {
                                        class285.field4245[var40] = class286.method1860(class285.field4245[var40], 32);
                                    } else {
                                        class285.field4245[var40] = 32;
                                    }
                                    class390.field5918[var40] = var37.field1378;
                                }
                                var40--;
                                var41++;
                            }
                            if (!var15[arg5 & 0x3]) {
                                arg4[0] = class78.field1067[var38][class494.method2942(3, var39 + 2)];
                            }
                        } else if (!var15[arg5 & 0x3]) {
                            arg4[0] = class100.field1438[var38][class494.method2942(var39 + 2, 3)];
                        }
                    }
                }
            }
            if ((arg10 - 1) > arg9) {
                int var44 = arg7[arg2][arg9 + 1] & 0xFF;
                if (var44 > 0) {
                    class95 var45 = this.field5165.method657(1, var44 - 1);
                    if (var45.field1375 != -1) {
                        byte var46 = arg1[arg2][arg9 + 1];
                        byte var47 = arg8[arg2][arg9 + 1];
                        if (var45.field1383) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class158.method1032(var45, arg6 - 250, arg0);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var49 &= 0x7;
                                var48 &= 0x7;
                                if (class507.field7545[var46][var49] && var45.field1378 >= class390.field5918[var48]) {
                                    class181.field2583[var48] = var45.field1375;
                                    class425.field6344[var48] = var50;
                                    class512.field7597[var48] = arg0.method1132() ? var45.field1385 : var45.field1386;
                                    class16.field255[var48] = var45.field1376;
                                    if (class390.field5918[var48] == var45.field1378) {
                                        class285.field4245[var48] = class286.method1860(class285.field4245[var48], 16);
                                    } else {
                                        class285.field4245[var48] = 16;
                                    }
                                    class390.field5918[var48] = var45.field1378;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg5 + 2 & 0x3]) {
                                arg4[2] = class78.field1067[var46][class494.method2942(3, var47)];
                            }
                        } else if (!var15[arg5 + 2 & 0x3]) {
                            arg4[2] = class100.field1438[var46][class494.method2942(var47, 3)];
                        }
                    }
                }
            }
            if (arg2 > 0) {
                int var52 = arg7[arg2 - 1][arg9] & 0xFF;
                if (var52 > 0) {
                    class95 var53 = this.field5165.method657(1, var52 - 1);
                    if (var53.field1375 != -1) {
                        byte var54 = arg1[arg2 - 1][arg9];
                        byte var55 = arg8[arg2 - 1][arg9];
                        if (var53.field1383) {
                            int var56 = 6;
                            int var57 = (var55 * 2) + 4;
                            int var58 = class158.method1032(var53, arg6 ^ 0x106, arg0);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class507.field7545[var54][var57] && class390.field5918[var56] <= var53.field1378) {
                                    class181.field2583[var56] = var53.field1375;
                                    class425.field6344[var56] = var58;
                                    class512.field7597[var56] = arg0.method1132() ? var53.field1385 : var53.field1386;
                                    class16.field255[var56] = var53.field1376;
                                    if (class390.field5918[var56] == var53.field1378) {
                                        class285.field4245[var56] = class286.method1860(class285.field4245[var56], 8);
                                    } else {
                                        class285.field4245[var56] = 8;
                                    }
                                    class390.field5918[var56] = var53.field1378;
                                }
                                var56++;
                                var57--;
                            }
                            if (!var15[arg5 + 3 & 0x3]) {
                                arg4[3] = class78.field1067[var54][class494.method2942(var55 + 1, 3)];
                            }
                        } else if (!var15[arg5 + 3 & 0x3]) {
                            arg4[3] = class100.field1438[var54][class494.method2942(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg2 < arg12 - 1) {
                int var60 = arg7[arg2 + 1][arg9] & 0xFF;
                if (var60 > 0) {
                    class95 var61 = this.field5165.method657(1, var60 - 1);
                    if (var61.field1375 != -1) {
                        byte var62 = arg1[arg2 + 1][arg9];
                        byte var63 = arg8[arg2 + 1][arg9];
                        if (var61.field1383) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class158.method1032(var61, 6, arg0);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class507.field7545[var62][var65] && class390.field5918[var64] <= var61.field1378) {
                                    class181.field2583[var64] = var61.field1375;
                                    class425.field6344[var64] = var66;
                                    class512.field7597[var64] = arg0.method1132() ? var61.field1385 : var61.field1386;
                                    class16.field255[var64] = var61.field1376;
                                    if (class390.field5918[var64] == var61.field1378) {
                                        class285.field4245[var64] = class286.method1860(class285.field4245[var64], 4);
                                    } else {
                                        class285.field4245[var64] = 4;
                                    }
                                    class390.field5918[var64] = var61.field1378;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg5 + 1 & 0x3]) {
                                arg4[1] = class78.field1067[var62][class494.method2942(3, var63 + 3)];
                            }
                        } else if (!var15[arg5 + 1 & 0x3]) {
                            arg4[1] = class100.field1438[var62][class494.method2942(3, var63 + 3)];
                        }
                    }
                }
            }
        }
        if (arg13 == null) {
            return;
        }
        int var68 = class158.method1032(arg13, 6, arg0);
        if (!arg13.field1383) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg5 * 2) & 0x7;
            if (class507.field7545[arg3][var69] && class390.field5918[var70] <= arg13.field1378) {
                class181.field2583[var70] = arg13.field1375;
                class425.field6344[var70] = var68;
                class512.field7597[var70] = arg0.method1132() ? arg13.field1385 : arg13.field1386;
                class16.field255[var70] = arg13.field1376;
                if (class390.field5918[var70] == arg13.field1378) {
                    class285.field4245[var70] = class286.method1860(class285.field4245[var70], 2);
                } else {
                    class285.field4245[var70] = 2;
                }
                class390.field5918[var70] = arg13.field1378;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lqa;Z[Lwq;[[[I)V", line = 1971)
    public final void method2158(class496 arg0, boolean arg1, class370[] arg2, int[][][] arg3) {
        field5189++;
        if (!this.field5190) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field5186; var6++) {
                    for (int var7 = 0; var7 < this.field5170; var7++) {
                        if ((class129.field1816[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class129.field1816[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method2304(var7, var6, (byte) 65);
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            return;
        }
        for (int var9 = 0; var9 < this.field5171; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field5190) {
                if (class286.field4263) {
                    var10 |= 0x2;
                }
                if (class169.field2461) {
                    var11 |= 0x8;
                }
                if (class181.field2575 != 0) {
                    if (class518.field7691 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class286.field4263) {
                var11 |= 0x7;
            }
            if (!class168.field2445) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field5184[var9] : arg3[var9];
            class299.method1925(var9, arg0.method1059(this.field5186, this.field5170, this.field5184[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lqa;Lna;ILna;[[ILna;Z)V", line = 2071)
    private final void method2159(class496 arg0, class206 arg1, int arg2, class206 arg3, int[][] arg4, class206 arg5, boolean arg6) {
        if (!arg6) {
            this.field5171 = 10;
        }
        for (int var8 = 0; var8 < this.field5186; var8++) {
            for (int var9 = 0; var9 < this.field5170; var9++) {
                if (class42.field641 == -1 || class411.method2500(arg2, class42.field641, var8, var9, (byte) 75)) {
                    byte var10 = this.field5175[arg2][var8][var9];
                    byte var11 = this.field5177[arg2][var8][var9];
                    int var12 = this.field5169[arg2][var8][var9] & 0xFF;
                    int var13 = this.field5176[arg2][var8][var9] & 0xFF;
                    class95 var14 = var12 == 0 ? null : this.field5165.method657(1, var12 - 1);
                    class362 var15 = var13 == 0 ? null : this.field5179.method1689(var13 - 1, -44);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class208.field2939[var10];
                        var16 = var15 == null ? 0 : class384.field5867[var10];
                    } else if (var14 != null) {
                        var17 = class208.field2939[var10];
                    } else if (var15 != null) {
                        var16 = class208.field2939[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field1375 == -1 && var14.field1374 == -1 && var14.field1385 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg0.method1132() ? var14.field1385 : var14.field1386;
                            if (class232.field3294) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field1376;
                                if (var14.field1375 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field1375;
                                }
                                if (var14.field1374 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field1374;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field5190 && arg2 == 0) {
                                class228.method1566(var8, var9, var14.field1373, var14.field1388 * 8, var14.field1384);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field5607;
                            if (class232.field3294) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field5616;
                                var20[var19] = arg4[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field5192.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg3 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field5192[var36];
                            int var46 = this.field5193[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class507.field7545[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg1.method853(var49, var50) - arg5.method853(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class507.field7545[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method853(var51, var52) - arg1.method853(var51, var52);
                                } else if (arg3 != null && !class380.field5803[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg3.method853(var53, var54) - arg5.method853(var53, var54);
                                }
                            }
                        }
                        int var37 = arg5.method849(var8, var9);
                        int var38 = arg5.method849(var8 + 1, var9);
                        int var39 = arg5.method849(var8 + 1, var9 + 1);
                        int var40 = arg5.method849(var8, var9 + 1);
                        if (arg2 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field1382) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field5191[arg2][var8][var9] = (byte) class286.method1860(this.field5191[arg2][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field5190) {
                            var42 = class10.method87(var8, var9);
                            var43 = class432.method2586(var8, var9);
                            var44 = class437.method2611(var8, var9);
                        }
                        arg5.method845(var8, var9, var32, var34, var33, var35, class481.field7017[var10], class482.field7023[var10], class407.field6148[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class471.method2823(arg2, var8, var9);
                    }
                }
            }
        }
        field5185++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lns;BLns;)I", line = 2387)
    public static final int method2160(class438 arg0, byte arg1, class438 arg2) {
        field5187++;
        int var3 = 0;
        int var4 = 22 % ((-arg1 - 43) / 56);
        if (arg0.method2624(-115, class394.field5989)) {
            var3++;
        }
        if (arg0.method2624(-111, class66.field917)) {
            var3++;
        }
        if (arg0.method2624(-95, class14.field238)) {
            var3++;
        }
        if (arg2.method2624(-110, class394.field5989)) {
            var3++;
        }
        if (arg2.method2624(-101, class66.field917)) {
            var3++;
        }
        if (arg2.method2624(-107, class14.field238)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IIIZLhs;Lbl;)V", line = 2424)
    public class335(int arg0, int arg1, int arg2, boolean arg3, class94 arg4, class262 arg5) {
        this.field5170 = arg2;
        this.field5171 = arg0;
        this.field5186 = arg1;
        this.field5179 = arg5;
        this.field5165 = arg4;
        this.field5190 = arg3;
        this.field5169 = new byte[this.field5171][this.field5186][this.field5170];
        this.field5177 = new byte[this.field5171][this.field5186][this.field5170];
        this.field5184 = new int[this.field5171][this.field5186 + 1][this.field5170 + 1];
        this.field5175 = new byte[this.field5171][this.field5186][this.field5170];
        this.field5191 = new byte[this.field5171][this.field5186 + 1][this.field5170 + 1];
        this.field5176 = new byte[this.field5171][this.field5186][this.field5170];
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([[III)V", line = 2443)
    public final void method2161(int[][] arg0, int arg1, int arg2) {
        field5172++;
        int[][] var4 = this.field5184[arg2];
        for (int var5 = 0; var5 < (this.field5186 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field5170 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
        if (arg1 != 128) {
            this.field5170 = -118;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V", line = 2470)
    public static final void method2162(int arg0, int arg1, int arg2) {
        field5181++;
        if (arg0 == 20725) {
            class377 var3 = class99.method672(arg2, false, 5);
            var3.method2340((byte) 126);
            var3.field5763 = arg1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIB)V", line = 2484)
    public final void method2163(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field5173++;
        int var7 = arg4;
        int var8 = 65 / ((65 - arg5) / 43);
        while ((arg2 + arg4) > var7) {
            for (int var11 = arg0; var11 < (arg0 + arg1); var11++) {
                if (var11 >= 0 && var11 < this.field5186 && var7 >= 0 && this.field5170 > var7) {
                    this.field5184[arg3][var11][var7] = arg3 > 0 ? this.field5184[arg3 - 1][var11][var7] - 240 : 0;
                }
            }
            var7++;
        }
        if (arg0 > 0 && arg0 < this.field5186) {
            for (int var9 = arg4 + 1; var9 < arg2 + arg4; var9++) {
                if (var9 >= 0 && var9 < this.field5170) {
                    this.field5184[arg3][arg0][var9] = this.field5184[arg3][arg0 - 1][var9];
                }
            }
        }
        if (arg4 > 0 && this.field5170 > arg4) {
            for (int var10 = arg0 + 1; var10 < arg0 + arg1; var10++) {
                if (var10 >= 0 && var10 < this.field5186) {
                    this.field5184[arg3][var10][arg4] = this.field5184[arg3][var10][arg4 - 1];
                }
            }
        }
        if (arg0 < 0 || arg4 < 0 || arg0 >= this.field5186 || arg4 >= this.field5170) {
            return;
        }
        if (arg3 != 0) {
            if (arg0 > 0 && this.field5184[arg3 - 1][arg0 - 1][arg4] != this.field5184[arg3][arg0 - 1][arg4]) {
                this.field5184[arg3][arg0][arg4] = this.field5184[arg3][arg0 - 1][arg4];
                return;
            }
            if (arg4 > 0 && this.field5184[arg3 - 1][arg0][arg4 - 1] != this.field5184[arg3][arg0][arg4 - 1]) {
                this.field5184[arg3][arg0][arg4] = this.field5184[arg3][arg0][arg4 - 1];
                return;
            }
            if (arg0 > 0 && arg4 > 0 && this.field5184[arg3 - 1][arg0 - 1][arg4 - 1] != this.field5184[arg3][arg0 - 1][arg4 - 1]) {
                this.field5184[arg3][arg0][arg4] = this.field5184[arg3][arg0 - 1][arg4 - 1];
                return;
            }
            return;
        }
        if (arg0 > 0 && this.field5184[arg3][arg0 - 1][arg4] != 0) {
            this.field5184[arg3][arg0][arg4] = this.field5184[arg3][arg0 - 1][arg4];
            return;
        }
        if (arg4 > 0 && this.field5184[arg3][arg0][arg4 - 1] != 0) {
            this.field5184[arg3][arg0][arg4] = this.field5184[arg3][arg0][arg4 - 1];
            return;
        }
        if (arg0 > 0 && arg4 > 0 && this.field5184[arg3][arg0 - 1][arg4 - 1] != 0) {
            this.field5184[arg3][arg0][arg4] = this.field5184[arg3][arg0 - 1][arg4 - 1];
            return;
        }
    }
}
