import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class425 {

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "[I")
    private int[] field6011 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "[I")
    private int[] field6024 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "Ljj;")
    private class77 field6017;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "Lef;")
    private class344 field6030;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public int field6023;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public int field6001;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "Z")
    public boolean field6006;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "[[[B")
    private byte[][][] field6018;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "[[[B")
    private byte[][][] field6016;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "[[[B")
    public byte[][][] field6009;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "[[[B")
    private byte[][][] field6015;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "[[[B")
    private byte[][][] field6010;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "[[[I")
    public int[][][] field6029;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "[Lfq;")
    public static class138[] field6008 = new class138[30];

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lvr;")
    public static class92 field5999 = new class92(1, 2, 2, 0);

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "Lge;")
    public static class511 field6026 = new class511(50);

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "Lgw;")
    public static class118 field6027 = new class118();

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "Lgg;")
    public static class119 field6028;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Lci;")
    public static class320 field6000;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "[[[B")
    public byte[][][] field6012;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIBI)V", line = 10)
    public final void method2512(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var6 = 0; var6 < this.field6023; var6++) {
            this.method2514(arg2, 9176, var6, arg1, arg4, arg0);
        }
        int var7 = -16 % ((65 - arg3) / 47);
        field6025++;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILo;Lqa;I[[ILo;Lo;)V", line = 33)
    private final void method2513(int arg0, class24 arg1, class167 arg2, int arg3, int[][] arg4, class24 arg5, class24 arg6) {
        field6014++;
        byte[][] var8 = this.field6010[arg3];
        byte[][] var9 = this.field6015[arg3];
        byte[][] var10 = this.field6018[arg3];
        byte[][] var11 = this.field6016[arg3];
        for (int var12 = 0; var12 < this.field6002; var12++) {
            int var13 = var12 >= (this.field6002 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field6001; var14++) {
                int var15 = var14 >= (this.field6001 - 1) ? var14 : var14 + 1;
                if (class122.field1912 == -1 || class380.method2312(var12, arg3, var14, (byte) -85, class122.field1912)) {
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
                        class332 var26 = var21 == 0 ? null : this.field6030.method2179(var21 - 1, 6912);
                        class521 var27 = var22 == 0 ? null : this.field6017.method591(var22 - 1, (byte) 0);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class332 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4906 == -1 && var26.field4902 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4909;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field6002 && var14 < this.field6001) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var32--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var34++;
                            } else {
                                var32--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var36--;
                                var34--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method156(var12, var14) - arg5.method156(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method156(var13, var14) - arg5.method156(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class262.field3961[var39] = -1;
                            class228.field3437[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4909 ? class120.field1887[var19] : class154.field2352[var19];
                        this.method2523(arg2, var20, this.field6001, var8, var11, var9, var14, this.field6002, var19, var12, var27, var18, 0, var26);
                        boolean var41 = var26 != null && var26.field4906 != var26.field4902;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class262.field3961[var42] >= 0 && class359.field5225[var42] != class339.field5022[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class305.method1944(var18[1], class168.method1203(class228.field3437[4], class228.field3437[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class305.method1944(var18[3], class168.method1203(class228.field3437[6], class228.field3437[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class305.method1944(var18[0], class168.method1203(class228.field3437[0], class228.field3437[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class305.method1944(var18[2], class168.method1203(class228.field3437[4], class228.field3437[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var45 = class184.field2728[var19];
                            var46 = var27 == null ? 0 : class430.field6180[var19];
                            var47 = class202.field3125[var19];
                            var48 = class280.field4181[var19];
                            var49 = var26 == null ? 0 : class437.field6233[var19];
                        } else if (var17) {
                            var45 = class251.field3737[var19];
                            var44 = class107.field1611[var19];
                            var49 = var26 == null ? 0 : class500.field7231[var19];
                            var47 = class77.field1266[var19];
                            var46 = var27 == null ? 0 : class439.field6255[var19];
                            var48 = class434.field6210[var19];
                        } else {
                            var45 = class71.field1157[var19];
                            var46 = var27 == null ? 0 : class457.field6631[var19];
                            var48 = class406.field5773[var19];
                            var47 = class96.field1521[var19];
                            var44 = class412.field5828[var19];
                            var49 = var26 == null ? 0 : class56.field1006[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class133.method976(arg3, var12, var14);
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
                            int[] var61 = arg1 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field4906;
                                var63 = arg2.method189() ? var26.field4922 : var26.field4903;
                                var64 = var26.field4919;
                                int var65 = class298.method1916(arg0 ^ 0xFFFFA0B3, arg2, var26);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = 1;
                                        class119.field1856[2] = var45[var51];
                                        class119.field1856[3] = 1;
                                        class119.field1856[4] = var48[var51];
                                        var68 = 6;
                                        class119.field1856[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = 5;
                                        class119.field1856[2] = var45[var51];
                                        class119.field1856[3] = 5;
                                        class119.field1856[4] = var48[var51];
                                        var68 = 6;
                                        class119.field1856[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = 3;
                                        class119.field1856[2] = var45[var51];
                                        class119.field1856[3] = 3;
                                        class119.field1856[4] = var48[var51];
                                        var68 = 6;
                                        class119.field1856[5] = var45[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = 7;
                                        class119.field1856[2] = var45[var51];
                                        class119.field1856[3] = 7;
                                        class119.field1856[4] = var48[var51];
                                        class119.field1856[5] = var45[var51];
                                        var68 = 6;
                                    } else {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = var48[var51];
                                        var68 = 3;
                                        class119.field1856[2] = var45[var51];
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class119.field1856[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field6024[var70];
                                        int var73 = this.field6011[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 128 - var72;
                                        } else if (var20 == 2) {
                                            var74 = 128 - var72;
                                            var75 = 128 - var73;
                                        } else if (var20 == 3) {
                                            var74 = 128 - var73;
                                            var75 = var72;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class263.field3978[var19][var70]) {
                                            int var76 = (var12 << 7) + var74;
                                            int var77 = (var14 << 7) + var75;
                                            var60[var52] = arg1.method143(var76, var77) - arg5.method143(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class263.field3978[var19][var70]) {
                                                int var78 = (var12 << 7) + var74;
                                                int var79 = (var14 << 7) + var75;
                                                var61[var52] = arg5.method143(var78, var79) - arg1.method143(var78, var79);
                                            } else if (arg6 != null && !class157.field2403[var19][var70]) {
                                                int var80 = (var12 << 7) + var74;
                                                int var81 = (var14 << 7) + var75;
                                                var61[var52] = arg6.method143(var80, var81) - arg5.method143(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class262.field3961[var71] > var26.field4908) {
                                            if (var54 != null) {
                                                var54[var52] = class359.field5225[var71];
                                            }
                                            var59[var52] = class213.field3222[var71];
                                            var58[var52] = class193.field2808[var71];
                                            var57[var52] = class339.field5022[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg2.method189() ? var26.field4922 : var26.field4903;
                                            var59[var52] = var26.field4919;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field6006 && arg3 == 0) {
                                    class341.method2158(var12, var14, var26.field4901, var26.field4900 * 8, var26.field4917);
                                }
                                if (var19 != 12 && var26.field4906 != -1 && var26.field4905) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class437.field6233[var19];
                            } else if (var17) {
                                var51 += class500.field7231[var19];
                            } else {
                                var51 += class56.field1006[var19];
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
                                class521 var82 = this.field6017.method591(var22 - 1, (byte) 0);
                                class521 var83 = this.field6017.method591(var23 - 1, (byte) 0);
                                class521 var84 = this.field6017.method591(var24 - 1, (byte) 0);
                                class521 var85 = this.field6017.method591(var25 - 1, (byte) 0);
                                for (int var86 = 0; var86 < var46; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = 1;
                                        class119.field1856[2] = var45[var51];
                                        class119.field1856[3] = 1;
                                        class119.field1856[4] = var48[var51];
                                        var88 = 6;
                                        class119.field1856[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = 5;
                                        class119.field1856[2] = var45[var51];
                                        class119.field1856[3] = 5;
                                        class119.field1856[4] = var48[var51];
                                        class119.field1856[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = 3;
                                        class119.field1856[2] = var45[var51];
                                        class119.field1856[3] = 3;
                                        class119.field1856[4] = var48[var51];
                                        class119.field1856[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = 7;
                                        class119.field1856[2] = var45[var51];
                                        class119.field1856[3] = 7;
                                        class119.field1856[4] = var48[var51];
                                        class119.field1856[5] = var45[var51];
                                        var88 = 6;
                                    } else {
                                        class119.field1856[0] = var47[var51];
                                        class119.field1856[1] = var48[var51];
                                        var88 = 3;
                                        class119.field1856[2] = var45[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class119.field1856[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field6024[var90];
                                        int var93 = this.field6011[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 128 - var92;
                                            var95 = 128 - var93;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 128 - var93;
                                        } else {
                                            var94 = var92;
                                            var95 = var93;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class263.field3978[var19][var90]) {
                                            int var96 = (var12 << 7) + var94;
                                            int var97 = (var14 << 7) + var95;
                                            var60[var52] = arg1.method143(var96, var97) - arg5.method143(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class263.field3978[var19][var90]) {
                                                int var98 = (var12 << 7) + var94;
                                                int var99 = (var14 << 7) + var95;
                                                var61[var52] = arg5.method143(var98, var99) - arg1.method143(var98, var99);
                                            } else if (arg6 != null && !class157.field2403[var19][var90]) {
                                                int var100 = (var12 << 7) + var94;
                                                int var101 = (var14 << 7) + var95;
                                                var61[var52] = arg6.method143(var100, var101) - arg5.method143(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class262.field3961[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class359.field5225[var91];
                                            }
                                            var59[var52] = class213.field3222[var91];
                                            var58[var52] = class193.field2808[var91];
                                            var57[var52] = class339.field5022[var91];
                                        } else {
                                            if (var17 && class263.field3978[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var82.field7596;
                                                var59[var52] = var82.field7604;
                                            } else if (var94 == 0 && var95 == 128) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var83.field7596;
                                                var59[var52] = var83.field7604;
                                            } else if (var94 == 128 && var95 == 128) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var84.field7596;
                                                var59[var52] = var84.field7604;
                                            } else if (var94 == 128 && var95 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var85.field7596;
                                                var59[var52] = var85.field7604;
                                            } else {
                                                if (var94 < 64) {
                                                    if (var95 >= 64) {
                                                        var58[var52] = var83.field7596;
                                                        var59[var52] = var83.field7604;
                                                    } else {
                                                        var58[var52] = var82.field7596;
                                                        var59[var52] = var82.field7604;
                                                    }
                                                } else if (var95 < 64) {
                                                    var58[var52] = var85.field7596;
                                                    var59[var52] = var85.field7604;
                                                } else {
                                                    var58[var52] = var84.field7596;
                                                    var59[var52] = var84.field7604;
                                                }
                                                int var102 = class246.method1613(arg4[var12][var14], false, arg4[var13][var14], var94 << 7 >> 7);
                                                int var103 = class246.method1613(arg4[var12][var15], false, arg4[var13][var15], var94 << 7 >> 7);
                                                var57[var52] = class246.method1613(var102, false, var103, var95 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field7599) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg5.method156(var12, var14);
                            int var105 = arg5.method156(var13, var14);
                            int var106 = arg5.method156(var13, var15);
                            int var107 = arg5.method156(var12, var15);
                            if (arg3 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field4914) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field6009[arg3][var12][var14] = (byte) class442.method2600(this.field6009[arg3][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field6006) {
                                var109 = class397.method2390(var12, var14);
                                var110 = class451.method2683(var12, var14);
                                var111 = class49.method444(var12, var14);
                            }
                            arg5.method151(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class133.method976(arg3, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg0 != -24384) {
            this.field6002 = -106;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII)V", line = 897)
    private final void method2514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6020++;
        for (int var7 = arg3; var7 < arg3 + arg5; var7++) {
            for (int var10 = arg4; var10 < (arg0 + arg4); var10++) {
                if (var10 >= 0 && this.field6002 > var10 && var7 >= 0 && this.field6001 > var7) {
                    this.field6029[arg2][var10][var7] = arg2 > 0 ? this.field6029[arg2 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        if (arg4 > 0 && arg4 < this.field6002) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg5); var8++) {
                if (var8 >= 0 && this.field6001 > var8) {
                    this.field6029[arg2][arg4][var8] = this.field6029[arg2][arg4 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && this.field6001 > arg3) {
            for (int var9 = arg4 + 1; var9 < (arg4 + arg0); var9++) {
                if (var9 >= 0 && var9 < this.field6002) {
                    this.field6029[arg2][var9][arg3] = this.field6029[arg2][var9][arg3 - 1];
                }
            }
        }
        if (arg4 >= 0 && arg3 >= 0 && this.field6002 > arg4 && this.field6001 > arg3) {
            if (arg2 == 0) {
                if (arg4 > 0 && this.field6029[arg2][arg4 - 1][arg3] != 0) {
                    this.field6029[arg2][arg4][arg3] = this.field6029[arg2][arg4 - 1][arg3];
                } else if (arg3 > 0 && this.field6029[arg2][arg4][arg3 - 1] != 0) {
                    this.field6029[arg2][arg4][arg3] = this.field6029[arg2][arg4][arg3 - 1];
                } else if (arg4 > 0 && arg3 > 0 && this.field6029[arg2][arg4 - 1][arg3 - 1] != 0) {
                    this.field6029[arg2][arg4][arg3] = this.field6029[arg2][arg4 - 1][arg3 - 1];
                }
            } else if (arg4 > 0 && this.field6029[arg2 - 1][arg4 - 1][arg3] != this.field6029[arg2][arg4 - 1][arg3]) {
                this.field6029[arg2][arg4][arg3] = this.field6029[arg2][arg4 - 1][arg3];
            } else if (arg3 > 0 && this.field6029[arg2 - 1][arg4][arg3 - 1] != this.field6029[arg2][arg4][arg3 - 1]) {
                this.field6029[arg2][arg4][arg3] = this.field6029[arg2][arg4][arg3 - 1];
            } else if (arg4 > 0 && arg3 > 0 && this.field6029[arg2 - 1][arg4 - 1][arg3 - 1] != this.field6029[arg2][arg4 - 1][arg3 - 1]) {
                this.field6029[arg2][arg4][arg3] = this.field6029[arg2][arg4 - 1][arg3 - 1];
            }
        }
        if (arg1 != 9176) {
            this.method2516((byte) -51, 11, null);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "([Lue;IIIIILwn;)V", line = 995)
    public final void method2515(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class519 arg6) {
        field6005++;
        if (!this.field6006) {
            for (int var8 = 0; var8 < 4; var8++) {
                class159 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg2 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field6002 && var13 >= 0 && var13 < this.field6001) {
                            var9.method1109(var12, var13, 104);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg2;
        int var15 = arg3 + arg5;
        for (int var16 = arg4; var16 < this.field6023; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2525(0, var16, var15 + var18, 0, arg6, 0, arg2 + var17, arg3 + var18, var14 + var17, false, arg4 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI[[I)V", line = 1077)
    public final void method2516(byte arg0, int arg1, int[][] arg2) {
        field6019++;
        int[][] var4 = this.field6029[arg1];
        int var5 = 0;
        if (arg0 <= 30) {
            return;
        }
        while (var5 < this.field6002 + 1) {
            for (int var6 = 0; var6 < (this.field6001 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 1104)
    public static void method2517(int arg0) {
        field6026 = null;
        field6008 = null;
        if (arg0 == -25269) {
            field6000 = null;
            field5999 = null;
            field6027 = null;
            field6028 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILqa;[Lue;[[[I)V", line = 1119)
    public final void method2518(int arg0, class167 arg1, class159[] arg2, int[][][] arg3) {
        if (arg0 != 23350) {
            this.field6015 = null;
        }
        if (!this.field6006) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field6002; var6++) {
                    for (int var7 = 0; var7 < this.field6001; var7++) {
                        if ((class234.field3497[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class234.field3497[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method1112(var6, var7, 105);
                            }
                        }
                    }
                }
            }
        }
        field6007++;
        for (int var9 = 0; var9 < this.field6023; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field6006) {
                if (class28.field395) {
                    var10 |= 0x2;
                }
                if (class226.field3412) {
                    var11 |= 0x8;
                }
                if (class413.field5844 != 0) {
                    if (class176.field2631 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class28.field395) {
                var11 |= 0x7;
            }
            if (!class66.field1114) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field6029[var9] : arg3[var9];
            class406.method2421(var9, arg1.method223(this.field6002, this.field6001, this.field6029[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIZLwn;[Lue;I)V", line = 1219)
    public final void method2519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class519 arg7, class159[] arg8, int arg9) {
        field6013++;
        int var11 = (arg1 & 0x7) * 8;
        if (!this.field6006) {
            class159 var12 = arg8[arg5];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg4 + class538.method3168(arg0, var13 & 0x7, var14 & 0x7, (byte) -93);
                    int var16 = class127.method942(var14 & 0x7, 97, arg0, var13 & 0x7) + arg3;
                    if (var15 > 0 && var15 < this.field6002 - 1 && var16 > 0 && var16 < (this.field6001 - 1)) {
                        var12.method1109(var15, var16, 111);
                    }
                }
            }
        }
        int var17 = (arg2 & 0x7) * 8;
        if (arg6) {
            return;
        }
        int var18 = (arg1 & 0xFFFFFFF8) << 3;
        int var19 = (arg2 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg0 == 1) {
            var21 = 1;
        } else if (arg0 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg0 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field6023; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg9 == var22 && var11 <= var23 && var23 <= var11 + 8 && var17 <= var24 && var24 <= var17 + 8) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || var17 + 8 == var24) {
                            if (arg0 == 0) {
                                var25 = arg4 + var23 - var11;
                                var26 = var24 - (var17 - arg3);
                            } else if (arg0 == 1) {
                                var25 = var24 + arg4 - var17;
                                var26 = var11 + arg3 + 8 - var23;
                            } else if (arg0 == 2) {
                                var25 = -var23 - (-var11 - arg4 - 8);
                                var26 = arg3 + 8 - (-var17 + var24);
                            } else {
                                var25 = arg4 + 8 - (-var17 + var24);
                                var26 = var23 - (var11 - arg3);
                            }
                            this.method2525(0, arg5, var19 + var24, 0, arg7, 0, var25, var26, var18 + var23, true, 1);
                        } else {
                            var25 = arg4 + class538.method3168(arg0, var23 & 0x7, var24 & 0x7, (byte) -93);
                            var26 = arg3 + class127.method942(var24 & 0x7, 65, arg0, var23 & 0x7);
                            this.method2525(var20, arg5, var19 + var24, arg0, arg7, var21, var25, var26, var18 + var23, false, 1);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg0 == 0) {
                                    var32 = var29 + arg4 - var11;
                                    var31 = var30 + arg3 - var17;
                                } else if (arg0 == 1) {
                                    var31 = arg3 + 8 - (var29 - var11);
                                    var32 = -var17 - (-var30 - arg4);
                                } else if (arg0 == 2) {
                                    var31 = 8 - var30 - (-var17 - arg3);
                                    var32 = arg4 + 8 - (-var11 + var29);
                                } else {
                                    var32 = var17 - (var30 - arg4 - 8);
                                    var31 = arg3 - (var11 - var29);
                                }
                                if (var32 >= 0 && this.field6002 > var32 && var31 >= 0 && var31 < this.field6001) {
                                    this.field6029[arg5][var32][var31] = this.field6029[arg5][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2525(0, 0, 0, 0, arg7, 0, -1, -1, 0, false, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(IIIZLef;Ljj;)V", line = 2656)
    public class425(int arg0, int arg1, int arg2, boolean arg3, class344 arg4, class77 arg5) {
        this.field6017 = arg5;
        this.field6030 = arg4;
        this.field6002 = arg1;
        this.field6023 = arg0;
        this.field6001 = arg2;
        this.field6006 = arg3;
        this.field6018 = new byte[this.field6023][this.field6002][this.field6001];
        this.field6016 = new byte[this.field6023][this.field6002][this.field6001];
        this.field6009 = new byte[this.field6023][this.field6002 + 1][this.field6001 + 1];
        this.field6015 = new byte[this.field6023][this.field6002][this.field6001];
        this.field6010 = new byte[this.field6023][this.field6002][this.field6001];
        this.field6029 = new int[this.field6023][this.field6002 + 1][this.field6001 + 1];
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIII)V", line = 1433)
    public static final void method2520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class211 var5 = (class211) class153.field2328.method863(arg1 + 1612111865);
        if (arg1 != -1612111866) {
            return;
        }
        while (var5 != null) {
            class36.method384(arg3, arg2, -4096, var5, arg0, arg4);
            var5 = (class211) class153.field2328.method865(-1);
        }
        field5997++;
        for (class211 var6 = (class211) class293.field4353.method863(-1); var6 != null; var6 = (class211) class293.field4353.method865(-1)) {
            byte var11 = 1;
            class236 var12 = var6.field3168.method139((byte) -86);
            if (var6.field3168.field240) {
                var11 = 0;
            } else if (var6.field3168.field248 == var12.field3515 || var6.field3168.field248 == var12.field3554 || var6.field3168.field248 == var12.field3524 || var6.field3168.field248 == var12.field3533) {
                var11 = 2;
            } else if (var6.field3168.field248 == var12.field3553 || var6.field3168.field248 == var12.field3544 || var6.field3168.field248 == var12.field3522 || var6.field3168.field248 == var12.field3542) {
                var11 = 3;
            }
            if (var6.field3173 != var11) {
                int var13 = class173.method1218(var6.field3168, true);
                if (var6.field3178 != var13) {
                    if (var6.field3183 != null) {
                        class504.field7295.method1587(var6.field3183);
                        var6.field3183 = null;
                    }
                    var6.field3178 = var13;
                }
                var6.field3173 = var11;
            }
            var6.field3167 = var6.field3168.field6961;
            var6.field3177 = var6.field3168.field6961 + (var6.field3168.method135((byte) 72) << 6);
            var6.field3169 = var6.field3168.field6965;
            var6.field3180 = var6.field3168.field6965 + (var6.field3168.method135((byte) 72) << 6);
            class36.method384(arg3, arg2, -4096, var6, arg0, arg4);
        }
        for (class211 var7 = (class211) class462.field6679.method2285(52); var7 != null; var7 = (class211) class462.field6679.method2283((byte) 11)) {
            byte var8 = 1;
            class236 var9 = var7.field3179.method139((byte) -67);
            if (var7.field3179.field240) {
                var8 = 0;
            } else if (var7.field3179.field248 == var9.field3515 || var7.field3179.field248 == var9.field3554 || var7.field3179.field248 == var9.field3524 || var7.field3179.field248 == var9.field3533) {
                var8 = 2;
            } else if (var7.field3179.field248 == var9.field3553 || var7.field3179.field248 == var9.field3544 || var7.field3179.field248 == var9.field3522 || var7.field3179.field248 == var9.field3542) {
                var8 = 3;
            }
            if (var7.field3173 != var8) {
                int var10 = class182.method1263(2048, var7.field3179);
                if (var7.field3178 != var10) {
                    if (var7.field3183 != null) {
                        class504.field7295.method1587(var7.field3183);
                        var7.field3183 = null;
                    }
                    var7.field3178 = var10;
                }
                var7.field3173 = var8;
            }
            var7.field3167 = var7.field3179.field6961;
            var7.field3177 = var7.field3179.field6961 + (var7.field3179.method135((byte) 72) << 6);
            var7.field3169 = var7.field3179.field6965;
            var7.field3180 = var7.field3179.field6965 + (var7.field3179.method135((byte) 72) << 6);
            class36.method384(arg3, arg2, -4096, var7, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lo;BI[[ILo;Lo;Lqa;)V", line = 1549)
    private final void method2521(class24 arg0, byte arg1, int arg2, int[][] arg3, class24 arg4, class24 arg5, class167 arg6) {
        field6004++;
        if (arg1 != 0) {
            method2524(58, (byte) -71);
        }
        for (int var8 = 0; var8 < this.field6002; var8++) {
            for (int var9 = 0; var9 < this.field6001; var9++) {
                if (class122.field1912 == -1 || class380.method2312(var8, arg2, var9, (byte) -85, class122.field1912)) {
                    byte var10 = this.field6010[arg2][var8][var9];
                    byte var11 = this.field6015[arg2][var8][var9];
                    int var12 = this.field6016[arg2][var8][var9] & 0xFF;
                    int var13 = this.field6018[arg2][var8][var9] & 0xFF;
                    class332 var14 = var12 == 0 ? null : this.field6030.method2179(var12 - 1, arg1 + 6912);
                    class521 var15 = var13 == 0 ? null : this.field6017.method591(var13 - 1, (byte) 0);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class437.field6233[var10];
                        var16 = var15 == null ? 0 : class430.field6180[var10];
                    } else if (var14 != null) {
                        var17 = class437.field6233[var10];
                    } else if (var15 != null) {
                        var16 = class437.field6233[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field4906 == -1 && var14.field4902 == -1 && var14.field4922 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg6.method189() ? var14.field4922 : var14.field4903;
                            if (class539.field7936) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field4919;
                                if (var14.field4906 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field4906;
                                }
                                if (var14.field4902 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field4902;
                                }
                                var19++;
                            }
                            if (!this.field6006 && arg2 == 0) {
                                class341.method2158(var8, var9, var14.field4901, var14.field4900 * 8, var14.field4917);
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
                            int var29 = var15.field7596;
                            if (class539.field7936) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field7604;
                                var20[var19] = arg3[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field6024.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg5 == null ? null : new int[var31];
                        int[] var35 = arg5 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field6024[var36];
                            int var46 = this.field6011[var36];
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
                            if (var34 != null && class263.field3978[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg5.method143(var49, var50) - arg0.method143(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg5 != null && !class263.field3978[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg0.method143(var51, var52) - arg5.method143(var51, var52);
                                } else if (arg4 != null && !class157.field2403[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method143(var53, var54) - arg0.method143(var53, var54);
                                }
                            }
                        }
                        int var37 = arg0.method156(var8, var9);
                        int var38 = arg0.method156(var8 + 1, var9);
                        int var39 = arg0.method156(var8 + 1, var9 + 1);
                        int var40 = arg0.method156(var8, var9 + 1);
                        if (arg2 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field4914) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field6009[arg2][var8][var9] = (byte) class442.method2600(this.field6009[arg2][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field6006) {
                            var42 = class397.method2390(var8, var9);
                            var43 = class451.method2683(var8, var9);
                            var44 = class49.method444(var8, var9);
                        }
                        arg0.method147(var8, var9, var32, var34, var33, var35, class202.field3125[var10], class280.field4181[var10], class184.field2728[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class133.method976(arg2, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lo;Lo;Lqa;I)V", line = 1863)
    public final void method2522(class24 arg0, class24 arg1, class167 arg2, int arg3) {
        field6022++;
        if (class156.field2375 == null || class156.field2375.length != this.field6001) {
            class513.field7463 = new int[this.field6001];
            class94.field1500 = new int[this.field6001];
            class62.field1085 = new int[this.field6001];
            class156.field2375 = new int[this.field6001];
            class147.field2268 = new int[this.field6001];
        }
        int[][] var5 = new int[this.field6002][this.field6001];
        for (int var6 = arg3; var6 < this.field6023; var6++) {
            for (int var8 = 0; var8 < this.field6001; var8++) {
                class156.field2375[var8] = 0;
                class147.field2268[var8] = 0;
                class513.field7463[var8] = 0;
                class94.field1500[var8] = 0;
                class62.field1085[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field6002; var9++) {
                for (int var10 = 0; var10 < this.field6001; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field6002) {
                        int var20 = this.field6018[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class521 var21 = this.field6017.method591(var20 - 1, (byte) 0);
                            class156.field2375[var10] += var21.field7603;
                            class147.field2268[var10] += var21.field7607;
                            class513.field7463[var10] += var21.field7595;
                            class94.field1500[var10] += var21.field7608;
                            var10002 = class62.field1085[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field6018[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class521 var24 = this.field6017.method591(var23 - 1, (byte) 0);
                            class156.field2375[var10] -= var24.field7603;
                            class147.field2268[var10] -= var24.field7607;
                            class513.field7463[var10] -= var24.field7595;
                            class94.field1500[var10] -= var24.field7608;
                            var10002 = class62.field1085[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field6001; var16++) {
                        int var17 = var16 + 5;
                        if (this.field6001 > var17) {
                            var14 += class94.field1500[var17];
                            var13 += class513.field7463[var17];
                            var15 += class62.field1085[var17];
                            var12 += class147.field2268[var17];
                            var11 += class156.field2375[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class513.field7463[var18];
                            var11 -= class156.field2375[var18];
                            var14 -= class94.field1500[var18];
                            var15 -= class62.field1085[var18];
                            var12 -= class147.field2268[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class177.method1237(var11 * 256 / var14, var12 / var15, var13 / var15, -109);
                        }
                    }
                }
            }
            if (class392.field5574) {
                this.method2513(arg3 - 24384, var6 == 0 ? arg1 : null, arg2, var6, var5, class146.field2262[var6], var6 == 0 ? arg0 : null);
            } else {
                this.method2521(class146.field2262[var6], (byte) 0, var6, var5, var6 == 0 ? arg0 : null, var6 == 0 ? arg1 : null, arg2);
            }
            this.field6018[var6] = null;
            this.field6016[var6] = null;
            this.field6010[var6] = null;
            this.field6015[var6] = null;
        }
        if (!this.field6006) {
            if (class413.field5844 != 0) {
                class507.method2955();
            }
            if (class28.field395) {
                class448.method2639();
            }
        }
        for (int var7 = 0; var7 < this.field6023; var7++) {
            class146.field2262[var7].method155();
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lqa;II[[B[[B[[BIIIILhb;[ZILwi;)V", line = 2049)
    private final void method2523(class167 arg0, int arg1, int arg2, byte[][] arg3, byte[][] arg4, byte[][] arg5, int arg6, int arg7, int arg8, int arg9, class521 arg10, boolean[] arg11, int arg12, class332 arg13) {
        field6021++;
        boolean[] var15 = arg13 != null && arg13.field4909 ? class120.field1887[arg8] : class154.field2352[arg8];
        if (arg6 > 0) {
            if (arg9 > 0) {
                int var16 = arg4[arg9 - 1][arg6 - 1] & 0xFF;
                if (var16 > 0) {
                    class332 var17 = this.field6030.method2179(var16 - 1, 6912);
                    if (var17.field4906 != -1 && var17.field4909) {
                        byte var18 = arg3[arg9 - 1][arg6 - 1];
                        int var19 = arg5[arg9 - 1][arg6 - 1] * 2 + 4 & 0x7;
                        int var20 = class298.method1916(87, arg0, var17);
                        if (class263.field3978[var18][var19]) {
                            class339.field5022[0] = var17.field4906;
                            class359.field5225[0] = var20;
                            class193.field2808[0] = arg0.method189() ? var17.field4922 : var17.field4903;
                            class213.field3222[0] = var17.field4919;
                            class262.field3961[0] = var17.field4908;
                            class228.field3437[0] = 256;
                        }
                    }
                }
            }
            if (arg7 - 1 > arg9) {
                int var21 = arg4[arg9 + 1][arg6 - 1] & 0xFF;
                if (var21 > 0) {
                    class332 var22 = this.field6030.method2179(var21 - 1, 6912);
                    if (var22.field4906 != -1 && var22.field4909) {
                        byte var23 = arg3[arg9 + 1][arg6 - 1];
                        int var24 = (arg5[arg9 + 1][arg6 - 1] * 2) + 6 & 0x7;
                        int var25 = class298.method1916(118, arg0, var22);
                        if (class263.field3978[var23][var24]) {
                            class339.field5022[2] = var22.field4906;
                            class359.field5225[2] = var25;
                            class193.field2808[2] = arg0.method189() ? var22.field4922 : var22.field4903;
                            class213.field3222[2] = var22.field4919;
                            class262.field3961[2] = var22.field4908;
                            class228.field3437[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg6 < arg2 - 1) {
            if (arg9 > 0) {
                int var26 = arg4[arg9 - 1][arg6 + 1] & 0xFF;
                if (var26 > 0) {
                    class332 var27 = this.field6030.method2179(var26 - 1, 6912);
                    if (var27.field4906 != -1 && var27.field4909) {
                        byte var28 = arg3[arg9 - 1][arg6 + 1];
                        int var29 = (arg5[arg9 - 1][arg6 + 1] * 2) + 2 & 0x7;
                        int var30 = class298.method1916(arg12 ^ 0x42, arg0, var27);
                        if (class263.field3978[var28][var29]) {
                            class339.field5022[6] = var27.field4906;
                            class359.field5225[6] = var30;
                            class193.field2808[6] = arg0.method189() ? var27.field4922 : var27.field4903;
                            class213.field3222[6] = var27.field4919;
                            class262.field3961[6] = var27.field4908;
                            class228.field3437[6] = 64;
                        }
                    }
                }
            }
            if (arg9 < arg7 - 1) {
                int var31 = arg4[arg9 + 1][arg6 + 1] & 0xFF;
                if (var31 > 0) {
                    class332 var32 = this.field6030.method2179(var31 - 1, 6912);
                    if (var32.field4906 != -1 && var32.field4909) {
                        byte var33 = arg3[arg9 + 1][arg6 + 1];
                        int var34 = -(-(arg5[arg9 + 1][arg6 + 1] * 2)) & 0x7;
                        int var35 = class298.method1916(arg12 ^ 0x6D, arg0, var32);
                        if (class263.field3978[var33][var34]) {
                            class339.field5022[4] = var32.field4906;
                            class359.field5225[4] = var35;
                            class193.field2808[4] = arg0.method189() ? var32.field4922 : var32.field4903;
                            class213.field3222[4] = var32.field4919;
                            class262.field3961[4] = var32.field4908;
                            class228.field3437[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg6 > arg12) {
            int var36 = arg4[arg9][arg6 - 1] & 0xFF;
            if (var36 > 0) {
                class332 var37 = this.field6030.method2179(var36 - 1, 6912);
                if (var37.field4906 != -1) {
                    byte var38 = arg3[arg9][arg6 - 1];
                    byte var39 = arg5[arg9][arg6 - 1];
                    if (var37.field4909) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class298.method1916(arg12 + 63, arg0, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class263.field3978[var38][var41] && var37.field4908 >= class262.field3961[var40]) {
                                class339.field5022[var40] = var37.field4906;
                                class359.field5225[var40] = var42;
                                class193.field2808[var40] = arg0.method189() ? var37.field4922 : var37.field4903;
                                class213.field3222[var40] = var37.field4919;
                                if (class262.field3961[var40] == var37.field4908) {
                                    class228.field3437[var40] = class442.method2600(class228.field3437[var40], 32);
                                } else {
                                    class228.field3437[var40] = 32;
                                }
                                class262.field3961[var40] = var37.field4908;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg1 & 0x3]) {
                            arg11[0] = class120.field1887[var38][class168.method1203(3, var39 + 2)];
                        }
                    } else if (!var15[arg1 & 0x3]) {
                        arg11[0] = class154.field2352[var38][class168.method1203(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg2 - 1 > arg6) {
            int var44 = arg4[arg9][arg6 + 1] & 0xFF;
            if (var44 > 0) {
                class332 var45 = this.field6030.method2179(var44 - 1, arg12 ^ 0x1B00);
                if (var45.field4906 != -1) {
                    byte var46 = arg3[arg9][arg6 + 1];
                    byte var47 = arg5[arg9][arg6 + 1];
                    if (var45.field4909) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class298.method1916(arg12 ^ 0x6B, arg0, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class263.field3978[var46][var49] && class262.field3961[var48] <= var45.field4908) {
                                class339.field5022[var48] = var45.field4906;
                                class359.field5225[var48] = var50;
                                class193.field2808[var48] = arg0.method189() ? var45.field4922 : var45.field4903;
                                class213.field3222[var48] = var45.field4919;
                                if (class262.field3961[var48] == var45.field4908) {
                                    class228.field3437[var48] = class442.method2600(class228.field3437[var48], 16);
                                } else {
                                    class228.field3437[var48] = 16;
                                }
                                class262.field3961[var48] = var45.field4908;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg1 + 2 & 0x3]) {
                            arg11[2] = class120.field1887[var46][class168.method1203(var47, 3)];
                        }
                    } else if (!var15[arg1 + 2 & 0x3]) {
                        arg11[2] = class154.field2352[var46][class168.method1203(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg9 > 0) {
            int var52 = arg4[arg9 - 1][arg6] & 0xFF;
            if (var52 > 0) {
                class332 var53 = this.field6030.method2179(var52 - 1, 6912);
                if (var53.field4906 != -1) {
                    byte var54 = arg3[arg9 - 1][arg6];
                    byte var55 = arg5[arg9 - 1][arg6];
                    if (var53.field4909) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class298.method1916(arg12 + 122, arg0, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class263.field3978[var54][var57] && class262.field3961[var56] <= var53.field4908) {
                                class339.field5022[var56] = var53.field4906;
                                class359.field5225[var56] = var58;
                                class193.field2808[var56] = arg0.method189() ? var53.field4922 : var53.field4903;
                                class213.field3222[var56] = var53.field4919;
                                if (class262.field3961[var56] == var53.field4908) {
                                    class228.field3437[var56] = class442.method2600(class228.field3437[var56], 8);
                                } else {
                                    class228.field3437[var56] = 8;
                                }
                                class262.field3961[var56] = var53.field4908;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg1 + 3 & 0x3]) {
                            arg11[3] = class120.field1887[var54][class168.method1203(3, var55 + 1)];
                        }
                    } else if (!var15[arg1 + 3 & 0x3]) {
                        arg11[3] = class154.field2352[var54][class168.method1203(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg9 < (arg7 - 1)) {
            int var60 = arg4[arg9 + 1][arg6] & 0xFF;
            if (var60 > 0) {
                class332 var61 = this.field6030.method2179(var60 - 1, 6912);
                if (var61.field4906 != -1) {
                    byte var62 = arg3[arg9 + 1][arg6];
                    byte var63 = arg5[arg9 + 1][arg6];
                    if (var61.field4909) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class298.method1916(43, arg0, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class263.field3978[var62][var65] && class262.field3961[var64] <= var61.field4908) {
                                class339.field5022[var64] = var61.field4906;
                                class359.field5225[var64] = var66;
                                class193.field2808[var64] = arg0.method189() ? var61.field4922 : var61.field4903;
                                class213.field3222[var64] = var61.field4919;
                                if (class262.field3961[var64] == var61.field4908) {
                                    class228.field3437[var64] = class442.method2600(class228.field3437[var64], 4);
                                } else {
                                    class228.field3437[var64] = 4;
                                }
                                class262.field3961[var64] = var61.field4908;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg1 + 1 & 0x3]) {
                            arg11[1] = class120.field1887[var62][class168.method1203(var63 + 3, 3)];
                        }
                    } else if (!var15[arg1 + 1 & 0x3]) {
                        arg11[1] = class154.field2352[var62][class168.method1203(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg13 == null) {
            return;
        }
        int var68 = class298.method1916(77, arg0, arg13);
        if (!arg13.field4909) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg1 * 2) & 0x7;
            if (class263.field3978[arg8][var69] && arg13.field4908 >= class262.field3961[var70]) {
                class339.field5022[var70] = arg13.field4906;
                class359.field5225[var70] = var68;
                class193.field2808[var70] = arg0.method189() ? arg13.field4922 : arg13.field4903;
                class213.field3222[var70] = arg13.field4919;
                if (class262.field3961[var70] == arg13.field4908) {
                    class228.field3437[var70] = class442.method2600(class228.field3437[var70], 2);
                } else {
                    class228.field3437[var70] = 2;
                }
                class262.field3961[var70] = arg13.field4908;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)V", line = 2519)
    public static final void method2524(int arg0, byte arg1) {
        class319.field4733 = new int[arg0];
        class477.field6944 = new int[arg0];
        field5998++;
        class408.field5785 = new int[arg0];
        class7.field51 = new int[arg0];
        if (arg1 <= 19) {
            field6026 = null;
        }
        class485.field7032 = new int[arg0];
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIILwn;IIIIZI)V", line = 2534)
    private final void method2525(int arg0, int arg1, int arg2, int arg3, class519 arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field6003++;
        if (arg3 == 1) {
            arg5 = 1;
        } else if (arg3 == 2) {
            arg0 = 1;
            arg5 = 1;
        } else if (arg3 == 3) {
            arg0 = 1;
        }
        if (arg10 != 1) {
            return;
        }
        if (arg6 < 0 || this.field6002 <= arg6 || arg7 < 0 || arg7 >= this.field6001) {
            while (true) {
                int var14 = arg4.method3072((byte) -125);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg4.method3072((byte) -127);
                    return;
                }
                if (var14 <= 49) {
                    arg4.method3072((byte) -120);
                }
            }
        }
        if (!this.field6006 && !arg9) {
            class234.field3497[arg1][arg6][arg7] = 0;
        }
        while (true) {
            int var12 = arg4.method3072((byte) -123);
            if (var12 == 0) {
                if (this.field6006) {
                    this.field6029[0][arg0 + arg6][arg5 + arg7] = 0;
                    return;
                } else if (arg1 == 0) {
                    this.field6029[0][arg0 + arg6][arg7 + arg5] = -class157.method1102(-78, arg2 + 556238, arg8 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field6029[arg1][arg6 + arg0][arg5 + arg7] = this.field6029[arg1 - 1][arg6 + arg0][arg7 + arg5] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg4.method3072((byte) -123);
                if (this.field6006) {
                    this.field6029[0][arg0 + arg6][arg5 + arg7] = var13 * 8 << 0;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg1 != 0) {
                    this.field6029[arg1][arg0 + arg6][arg5 + arg7] = this.field6029[arg1 - 1][arg6 + arg0][arg7 + arg5] - (var13 * 8 << 0);
                    return;
                }
                this.field6029[0][arg6 + arg0][arg5 + arg7] = -var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg9) {
                    arg4.method3072((byte) -119);
                } else {
                    this.field6016[arg1][arg6][arg7] = arg4.method3034((byte) -53);
                    this.field6010[arg1][arg6][arg7] = (byte) ((var12 - 2) / 4);
                    this.field6015[arg1][arg6][arg7] = (byte) class168.method1203(var12 + arg3 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field6006 && !arg9) {
                    class234.field3497[arg1][arg6][arg7] = (byte) (var12 - 49);
                }
            } else if (!arg9) {
                this.field6018[arg1][arg6][arg7] = (byte) (var12 - 81);
            }
        }
    }
}
