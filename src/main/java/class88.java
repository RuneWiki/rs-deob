import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class88 {

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "[I")
    private int[] field1015 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "[I")
    private int[] field1005 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "Z")
    public boolean field1001;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "Lpp;")
    private class333 field996;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "Ldba;")
    private class79 field1011;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "[[[B")
    private byte[][][] field1010;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "[[[B")
    private byte[][][] field1017;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "[[[B")
    public byte[][][] field1007;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "[[[B")
    private byte[][][] field1009;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "[[[I")
    public int[][][] field1006;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "[[[B")
    private byte[][][] field1004;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    public static int field1018 = 0;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "[[[B")
    public byte[][][] field997;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ld;I[[ILoa;Ld;Ld;I)V")
    private final void method558(class132 arg0, int arg1, int[][] arg2, class605 arg3, class132 arg4, class132 arg5, int arg6) {
        field1016++;
        byte[][] var8 = this.field1010[arg1];
        byte[][] var9 = this.field1009[arg1];
        byte[][] var10 = this.field1004[arg1];
        byte[][] var11 = this.field1017[arg1];
        for (int var12 = arg6; var12 < this.field999; var12++) {
            int var13 = (this.field999 - 1) <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field1002; var14++) {
                int var15 = var14 >= this.field1002 - 1 ? var14 : var14 + 1;
                if (class496.field7248 == -1 || class582.method3378(var12, (byte) -74, var14, class496.field7248, arg1)) {
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
                        class346 var26 = var21 == 0 ? null : this.field996.method2164(true, var21 - 1);
                        class40 var27 = var22 == 0 ? null : this.field1011.method516(var22 - 1, -126);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class346 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4961 == -1 && var26.field4962 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4946;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field999 > var12 && var14 < this.field1002) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var34--;
                                var32--;
                            }
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            int var37 = var32 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method259(var12, var14) - arg0.method259(var13, var15);
                                var38 = arg0.method259(var13, var14) - arg0.method259(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class122.field1529[var39] = -1;
                            class78.field857[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4946 ? class489.field7133[var19] : class560.field7984[var19];
                        this.method563(var14, this.field1002, var12, var19, var20, arg3, var8, var11, this.field999, var26, var27, 0, var9, var18);
                        boolean var41 = var26 != null && var26.field4962 != var26.field4961;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class122.field1529[var42] >= 0 && class507.field7362[var42] != class379.field5762[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class341.method2196(var18[1], class643.method3659(class78.field857[2], class78.field857[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class341.method2196(var18[3], class643.method3659(class78.field857[6], class78.field857[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class341.method2196(var18[0], class643.method3659(class78.field857[2], class78.field857[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class341.method2196(var18[2], class643.method3659(class78.field857[4], class78.field857[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
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
                            var45 = class630.field9094[var19];
                            var46 = var27 == null ? 0 : class80.field888[var19];
                            var47 = class374.field5702[var19];
                            var48 = class276.field3850[var19];
                            var49 = var26 == null ? 0 : class199.field2682[var19];
                        } else if (var17) {
                            var48 = class37.field406[var19];
                            var45 = class598.field8746[var19];
                            var44 = class496.field7249[var19];
                            var49 = var26 == null ? 0 : class67.field741[var19];
                            var47 = class618.field8975[var19];
                            var46 = var27 == null ? 0 : class498.field7257[var19];
                        } else {
                            var47 = class149.field1840[var19];
                            var45 = class426.field6337[var19];
                            var48 = class159.field1966[var19];
                            var46 = var27 == null ? 0 : class146.field1798[var19];
                            var49 = var26 == null ? 0 : class409.field6211[var19];
                            var44 = class535.field7715[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class639.method3643(arg1, var12, var14);
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
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field4961;
                                var63 = arg3.method370() ? var26.field4957 : var26.field4955;
                                var64 = var26.field4965;
                                int var65 = class400.method2549(arg3, var26, (byte) 111);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = 1;
                                        class555.field7884[2] = var45[var51];
                                        class555.field7884[3] = 1;
                                        class555.field7884[4] = var48[var51];
                                        class555.field7884[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = 5;
                                        class555.field7884[2] = var45[var51];
                                        class555.field7884[3] = 5;
                                        class555.field7884[4] = var48[var51];
                                        var68 = 6;
                                        class555.field7884[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = 3;
                                        class555.field7884[2] = var45[var51];
                                        class555.field7884[3] = 3;
                                        class555.field7884[4] = var48[var51];
                                        class555.field7884[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = 7;
                                        class555.field7884[2] = var45[var51];
                                        class555.field7884[3] = 7;
                                        class555.field7884[4] = var48[var51];
                                        class555.field7884[5] = var45[var51];
                                        var68 = 6;
                                    } else {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = var48[var51];
                                        class555.field7884[2] = var45[var51];
                                        var68 = 3;
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class555.field7884[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field1005[var70];
                                        int var73 = this.field1015[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var72;
                                            var75 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 512 - var73;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class207.field2780[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg4.method249(var76, var77) - arg0.method249(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class207.field2780[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg0.method249(var78, var79) - arg4.method249(var78, var79);
                                            } else if (arg5 != null && !class491.field7157[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg5.method249(var80, var81) - arg0.method249(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field4958 < class122.field1529[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class507.field7362[var71];
                                            }
                                            var59[var52] = class200.field2685[var71];
                                            var58[var52] = class228.field3199[var71];
                                            var57[var52] = class379.field5762[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg3.method370() ? var26.field4957 : var26.field4955;
                                            var59[var52] = var26.field4965;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field1001 && arg1 == 0) {
                                    class294.method1922(var12, var14, var26.field4947, var26.field4952 * 8, var26.field4954);
                                }
                                if (var19 != 12 && var26.field4961 != -1 && var26.field4949) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class199.field2682[var19];
                            } else if (var17) {
                                var51 += class67.field741[var19];
                            } else {
                                var51 += class409.field6211[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class40 var82 = this.field1011.method516(var22 - 1, -123);
                                class40 var83 = this.field1011.method516(var23 - 1, arg6 + -127);
                                class40 var84 = this.field1011.method516(var24 - 1, -128);
                                class40 var85 = this.field1011.method516(var25 - 1, -125);
                                for (int var86 = 0; var86 < var46; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = 1;
                                        class555.field7884[2] = var45[var51];
                                        class555.field7884[3] = 1;
                                        class555.field7884[4] = var48[var51];
                                        var88 = 6;
                                        class555.field7884[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = 5;
                                        class555.field7884[2] = var45[var51];
                                        class555.field7884[3] = 5;
                                        class555.field7884[4] = var48[var51];
                                        var88 = 6;
                                        class555.field7884[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = 3;
                                        class555.field7884[2] = var45[var51];
                                        class555.field7884[3] = 3;
                                        class555.field7884[4] = var48[var51];
                                        class555.field7884[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = 7;
                                        class555.field7884[2] = var45[var51];
                                        class555.field7884[3] = 7;
                                        class555.field7884[4] = var48[var51];
                                        class555.field7884[5] = var45[var51];
                                        var88 = 6;
                                    } else {
                                        class555.field7884[0] = var47[var51];
                                        class555.field7884[1] = var48[var51];
                                        class555.field7884[2] = var45[var51];
                                        var88 = 3;
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class555.field7884[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field1005[var90];
                                        int var93 = this.field1015[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 512 - var93;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class207.field2780[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg4.method249(var96, var97) - arg0.method249(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class207.field2780[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg0.method249(var98, var99) - arg4.method249(var98, var99);
                                            } else if (arg5 != null && !class491.field7157[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg5.method249(var100, var101) - arg0.method249(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class122.field1529[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class507.field7362[var91];
                                            }
                                            var59[var52] = class200.field2685[var91];
                                            var58[var52] = class228.field3199[var91];
                                            var57[var52] = class379.field5762[var91];
                                        } else {
                                            if (var17 && class207.field2780[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var82.field433;
                                                var59[var52] = var82.field435;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var83.field433;
                                                var59[var52] = var83.field435;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var84.field433;
                                                var59[var52] = var84.field435;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var85.field433;
                                                var59[var52] = var85.field435;
                                            } else {
                                                if (var94 >= 256) {
                                                    if (var95 >= 256) {
                                                        var58[var52] = var84.field433;
                                                        var59[var52] = var84.field435;
                                                    } else {
                                                        var58[var52] = var85.field433;
                                                        var59[var52] = var85.field435;
                                                    }
                                                } else if (var95 < 256) {
                                                    var58[var52] = var82.field433;
                                                    var59[var52] = var82.field435;
                                                } else {
                                                    var58[var52] = var83.field433;
                                                    var59[var52] = var83.field435;
                                                }
                                                int var102 = class234.method1511(-8977, arg2[var12][var14], var94 << 7 >> 9, arg2[var13][var14]);
                                                int var103 = class234.method1511(-8977, arg2[var12][var15], var94 << 7 >> 9, arg2[var13][var15]);
                                                var57[var52] = class234.method1511(-8977, var102, var95 << 7 >> 9, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field431) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg0.method259(var12, var14);
                            int var105 = arg0.method259(var13, var14);
                            int var106 = arg0.method259(var13, var15);
                            int var107 = arg0.method259(var12, var15);
                            if (arg1 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field4948) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field1007[arg1][var12][var14] = (byte) class283.method1834(this.field1007[arg1][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field1001) {
                                var109 = class655.method3738(var12, var14);
                                var110 = class49.method272(var12, var14);
                                var111 = class36.method197(var12, var14);
                            }
                            arg0.method252(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class639.method3643(arg1, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Loa;Ld;ZLd;)V")
    public final void method559(class605 arg0, class132 arg1, boolean arg2, class132 arg3) {
        field1008++;
        if (class635.field9136 == null || class635.field9136.length != this.field1002) {
            class635.field9136 = new int[this.field1002];
            class264.field3747 = new int[this.field1002];
            class560.field7967 = new int[this.field1002];
            class429.field6363 = new int[this.field1002];
            class519.field7553 = new int[this.field1002];
        }
        int[][] var5 = new int[this.field999][this.field1002];
        for (int var6 = 0; var6 < this.field1019; var6++) {
            for (int var8 = 0; var8 < this.field1002; var8++) {
                class635.field9136[var8] = 0;
                class519.field7553[var8] = 0;
                class429.field6363[var8] = 0;
                class560.field7967[var8] = 0;
                class264.field3747[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field999; var9++) {
                for (int var10 = 0; var10 < this.field1002; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field999 > var19) {
                        int var20 = this.field1004[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class40 var21 = this.field1011.method516(var20 - 1, 29);
                            class635.field9136[var10] += var21.field439;
                            class519.field7553[var10] += var21.field432;
                            class429.field6363[var10] += var21.field438;
                            class560.field7967[var10] += var21.field444;
                            var10002 = class264.field3747[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1004[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class40 var24 = this.field1011.method516(var23 - 1, 64);
                            class635.field9136[var10] -= var24.field439;
                            class519.field7553[var10] -= var24.field432;
                            class429.field6363[var10] -= var24.field438;
                            class560.field7967[var10] -= var24.field444;
                            var10002 = class264.field3747[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1002; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field1002) {
                            var12 += class519.field7553[var17];
                            var13 += class429.field6363[var17];
                            var14 += class560.field7967[var17];
                            var15 += class264.field3747[var17];
                            var11 += class635.field9136[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class429.field6363[var18];
                            var11 -= class635.field9136[var18];
                            var15 -= class264.field3747[var18];
                            var12 -= class519.field7553[var18];
                            var14 -= class560.field7967[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = client.method1668((byte) -72, var11 * 256 / var14, var12 / var15, var13 / var15);
                        }
                    }
                }
            }
            if (class560.field7972) {
                this.method558(class435.field6449[var6], var6, var5, arg0, var6 == 0 ? arg1 : null, var6 == 0 ? arg3 : null, 0);
            } else {
                this.method561(var6 == 0 ? arg3 : null, arg0, var6, class435.field6449[var6], var6 == 0 ? arg1 : null, var5, true);
            }
            this.field1004[var6] = null;
            this.field1017[var6] = null;
            this.field1010[var6] = null;
            this.field1009[var6] = null;
        }
        if (!this.field1001) {
            if (class202.field2696 != 0) {
                class573.method3334();
            }
            if (class594.field8686) {
                class623.method3575();
            }
        }
        for (int var7 = 0; var7 < this.field1019; var7++) {
            class435.field6449[var7].method257();
        }
        if (!arg2) {
            this.field1005 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z[[II)V")
    public final void method560(boolean arg0, int[][] arg1, int arg2) {
        field1000++;
        int[][] var4 = this.field1006[arg2];
        for (int var5 = 0; var5 < this.field999 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field1002 + 1); var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
        if (arg0) {
            this.method567(-124, -123, -43, 8, 68, -34);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ld;Loa;ILd;Ld;[[IZ)V")
    private final void method561(class132 arg0, class605 arg1, int arg2, class132 arg3, class132 arg4, int[][] arg5, boolean arg6) {
        if (!arg6) {
            return;
        }
        for (int var8 = 0; var8 < this.field999; var8++) {
            for (int var9 = 0; var9 < this.field1002; var9++) {
                if (class496.field7248 == -1 || class582.method3378(var8, (byte) -74, var9, class496.field7248, arg2)) {
                    byte var10 = this.field1010[arg2][var8][var9];
                    byte var11 = this.field1009[arg2][var8][var9];
                    int var12 = this.field1017[arg2][var8][var9] & 0xFF;
                    int var13 = this.field1004[arg2][var8][var9] & 0xFF;
                    class346 var14 = var12 == 0 ? null : this.field996.method2164(arg6, var12 - 1);
                    class40 var15 = var13 == 0 ? null : this.field1011.method516(var13 - 1, -124);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class199.field2682[var10];
                        var16 = var15 == null ? 0 : class80.field888[var10];
                    } else if (var14 != null) {
                        var17 = class199.field2682[var10];
                    } else if (var15 != null) {
                        var16 = class199.field2682[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field4961 == -1 && var14.field4962 == -1 && var14.field4957 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg1.method370() ? var14.field4957 : var14.field4955;
                            if (class38.field419) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field4965;
                                if (var14.field4961 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field4961;
                                }
                                if (var14.field4962 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field4962;
                                }
                                var19++;
                            }
                            if (!this.field1001 && arg2 == 0) {
                                class294.method1922(var8, var9, var14.field4947, var14.field4952 * 8, var14.field4954);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field433;
                            if (class38.field419) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field435;
                                var20[var19] = arg5[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1005.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg4 == null ? null : new int[var31];
                        int[] var35 = arg4 == null && arg0 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field1005[var36];
                            int var46 = this.field1015[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 512 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var45;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class207.field2780[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg4.method249(var49, var50) - arg3.method249(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg4 != null && !class207.field2780[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg3.method249(var51, var52) - arg4.method249(var51, var52);
                                } else if (arg0 != null && !class491.field7157[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg0.method249(var53, var54) - arg3.method249(var53, var54);
                                }
                            }
                        }
                        int var37 = arg3.method259(var8, var9);
                        int var38 = arg3.method259(var8 + 1, var9);
                        int var39 = arg3.method259(var8 + 1, var9 - -1);
                        int var40 = arg3.method259(var8, var9 + 1);
                        if (arg2 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field4948) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1007[arg2][var8][var9] = (byte) class283.method1834(this.field1007[arg2][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field1001) {
                            var42 = class655.method3738(var8, var9);
                            var43 = class49.method272(var8, var9);
                            var44 = class36.method197(var8, var9);
                        }
                        arg3.method263(var8, var9, var32, var34, var33, var35, class374.field5702[var10], class276.field3850[var10], class630.field9094[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class639.method3643(arg2, var8, var9);
                    }
                }
            }
        }
        field998++;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[Lvi;IILrt;II)V")
    public final void method562(int arg0, class468[] arg1, int arg2, int arg3, class194 arg4, int arg5, int arg6) {
        field1020++;
        if (!this.field1001) {
            for (int var8 = 0; var8 < 4; var8++) {
                class468 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && var12 < this.field999 && var13 >= 0 && this.field1002 > var13) {
                            var9.method2867(var12, -119, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg3 + arg5;
        int var15 = arg0 + arg2;
        int var16 = 0;
        if (arg6 != -20500) {
            this.field1006 = null;
        }
        while (this.field1019 > var16) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method568(0, arg4, false, var16, 0, arg5 + var17, var15 - -var18, 0, var14 + var17, arg2 + var18, 1690);
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIILoa;[[B[[BILqba;Lsca;I[[B[Z)V")
    private final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, class605 arg5, byte[][] arg6, byte[][] arg7, int arg8, class346 arg9, class40 arg10, int arg11, byte[][] arg12, boolean[] arg13) {
        field1012++;
        boolean[] var15 = arg9 != null && arg9.field4946 ? class489.field7133[arg3] : class560.field7984[arg3];
        if (arg0 > 0) {
            if (arg2 > 0) {
                int var16 = arg7[arg2 - 1][arg0 - 1] & 0xFF;
                if (var16 > 0) {
                    class346 var17 = this.field996.method2164(true, var16 - 1);
                    if (var17.field4961 != -1 && var17.field4946) {
                        byte var18 = arg6[arg2 - 1][arg0 - 1];
                        int var19 = arg12[arg2 - 1][arg0 - 1] * 2 + 4 & 0x7;
                        int var20 = class400.method2549(arg5, var17, (byte) 111);
                        if (class207.field2780[var18][var19]) {
                            class379.field5762[0] = var17.field4961;
                            class507.field7362[0] = var20;
                            class228.field3199[0] = arg5.method370() ? var17.field4957 : var17.field4955;
                            class200.field2685[0] = var17.field4965;
                            class122.field1529[0] = var17.field4958;
                            class78.field857[0] = 256;
                        }
                    }
                }
            }
            if (arg2 < arg8 - 1) {
                int var21 = arg7[arg2 + 1][arg0 - 1] & 0xFF;
                if (var21 > 0) {
                    class346 var22 = this.field996.method2164(true, var21 - 1);
                    if (var22.field4961 != -1 && var22.field4946) {
                        byte var23 = arg6[arg2 + 1][arg0 - 1];
                        int var24 = (arg12[arg2 + 1][arg0 - 1] * 2) + 6 & 0x7;
                        int var25 = class400.method2549(arg5, var22, (byte) 111);
                        if (class207.field2780[var23][var24]) {
                            class379.field5762[2] = var22.field4961;
                            class507.field7362[2] = var25;
                            class228.field3199[2] = arg5.method370() ? var22.field4957 : var22.field4955;
                            class200.field2685[2] = var22.field4965;
                            class122.field1529[2] = var22.field4958;
                            class78.field857[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg1 - 1) > arg0) {
            if (arg2 > 0) {
                int var26 = arg7[arg2 - 1][arg0 + 1] & 0xFF;
                if (var26 > 0) {
                    class346 var27 = this.field996.method2164(true, var26 - 1);
                    if (var27.field4961 != -1 && var27.field4946) {
                        byte var28 = arg6[arg2 - 1][arg0 + 1];
                        int var29 = arg12[arg2 - 1][arg0 + 1] * 2 + 2 & 0x7;
                        int var30 = class400.method2549(arg5, var27, (byte) 111);
                        if (class207.field2780[var28][var29]) {
                            class379.field5762[6] = var27.field4961;
                            class507.field7362[6] = var30;
                            class228.field3199[6] = arg5.method370() ? var27.field4957 : var27.field4955;
                            class200.field2685[6] = var27.field4965;
                            class122.field1529[6] = var27.field4958;
                            class78.field857[6] = 64;
                        }
                    }
                }
            }
            if ((arg8 - 1) > arg2) {
                int var31 = arg7[arg2 + 1][arg0 + 1] & 0xFF;
                if (var31 > 0) {
                    class346 var32 = this.field996.method2164(true, var31 - 1);
                    if (var32.field4961 != -1 && var32.field4946) {
                        byte var33 = arg6[arg2 + 1][arg0 + 1];
                        int var34 = -(-(arg12[arg2 + 1][arg0 + 1] * 2)) & 0x7;
                        int var35 = class400.method2549(arg5, var32, (byte) 111);
                        if (class207.field2780[var33][var34]) {
                            class379.field5762[4] = var32.field4961;
                            class507.field7362[4] = var35;
                            class228.field3199[4] = arg5.method370() ? var32.field4957 : var32.field4955;
                            class200.field2685[4] = var32.field4965;
                            class122.field1529[4] = var32.field4958;
                            class78.field857[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var36 = arg7[arg2][arg0 - 1] & 0xFF;
            if (var36 > 0) {
                class346 var37 = this.field996.method2164(true, var36 - 1);
                if (var37.field4961 != -1) {
                    byte var38 = arg6[arg2][arg0 - 1];
                    byte var39 = arg12[arg2][arg0 - 1];
                    if (var37.field4946) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class400.method2549(arg5, var37, (byte) 111);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class207.field2780[var38][var41] && class122.field1529[var40] <= var37.field4958) {
                                class379.field5762[var40] = var37.field4961;
                                class507.field7362[var40] = var42;
                                class228.field3199[var40] = arg5.method370() ? var37.field4957 : var37.field4955;
                                class200.field2685[var40] = var37.field4965;
                                if (class122.field1529[var40] == var37.field4958) {
                                    class78.field857[var40] = class283.method1834(class78.field857[var40], 32);
                                } else {
                                    class78.field857[var40] = 32;
                                }
                                class122.field1529[var40] = var37.field4958;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg4 & 0x3]) {
                            arg13[0] = class489.field7133[var38][class643.method3659(var39 + 2, 3)];
                        }
                    } else if (!var15[-(-arg4) & 0x3]) {
                        arg13[0] = class560.field7984[var38][class643.method3659(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg0 < (arg1 - 1)) {
            int var44 = arg7[arg2][arg0 + 1] & 0xFF;
            if (var44 > 0) {
                class346 var45 = this.field996.method2164(true, var44 - 1);
                if (var45.field4961 != -1) {
                    byte var46 = arg6[arg2][arg0 + 1];
                    byte var47 = arg12[arg2][arg0 + 1];
                    if (var45.field4946) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class400.method2549(arg5, var45, (byte) 111);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class207.field2780[var46][var49] && var45.field4958 >= class122.field1529[var48]) {
                                class379.field5762[var48] = var45.field4961;
                                class507.field7362[var48] = var50;
                                class228.field3199[var48] = arg5.method370() ? var45.field4957 : var45.field4955;
                                class200.field2685[var48] = var45.field4965;
                                if (class122.field1529[var48] == var45.field4958) {
                                    class78.field857[var48] = class283.method1834(class78.field857[var48], 16);
                                } else {
                                    class78.field857[var48] = 16;
                                }
                                class122.field1529[var48] = var45.field4958;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg4 + 2 & 0x3]) {
                            arg13[2] = class489.field7133[var46][class643.method3659(3, var47)];
                        }
                    } else if (!var15[arg4 + 2 & 0x3]) {
                        arg13[2] = class560.field7984[var46][class643.method3659(3, var47)];
                    }
                }
            }
        }
        if (arg2 > arg11) {
            int var52 = arg7[arg2 - 1][arg0] & 0xFF;
            if (var52 > 0) {
                class346 var53 = this.field996.method2164(true, var52 - 1);
                if (var53.field4961 != -1) {
                    byte var54 = arg6[arg2 - 1][arg0];
                    byte var55 = arg12[arg2 - 1][arg0];
                    if (var53.field4946) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class400.method2549(arg5, var53, (byte) 111);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class207.field2780[var54][var57] && var53.field4958 >= class122.field1529[var56]) {
                                class379.field5762[var56] = var53.field4961;
                                class507.field7362[var56] = var58;
                                class228.field3199[var56] = arg5.method370() ? var53.field4957 : var53.field4955;
                                class200.field2685[var56] = var53.field4965;
                                if (class122.field1529[var56] == var53.field4958) {
                                    class78.field857[var56] = class283.method1834(class78.field857[var56], 8);
                                } else {
                                    class78.field857[var56] = 8;
                                }
                                class122.field1529[var56] = var53.field4958;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg4 + 3 & 0x3]) {
                            arg13[3] = class489.field7133[var54][class643.method3659(3, var55 + 1)];
                        }
                    } else if (!var15[arg4 + 3 & 0x3]) {
                        arg13[3] = class560.field7984[var54][class643.method3659(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg2 < arg8 - 1) {
            int var60 = arg7[arg2 + 1][arg0] & 0xFF;
            if (var60 > 0) {
                class346 var61 = this.field996.method2164(true, var60 - 1);
                if (var61.field4961 != -1) {
                    byte var62 = arg6[arg2 + 1][arg0];
                    byte var63 = arg12[arg2 + 1][arg0];
                    if (var61.field4946) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class400.method2549(arg5, var61, (byte) 111);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class207.field2780[var62][var65] && class122.field1529[var64] <= var61.field4958) {
                                class379.field5762[var64] = var61.field4961;
                                class507.field7362[var64] = var66;
                                class228.field3199[var64] = arg5.method370() ? var61.field4957 : var61.field4955;
                                class200.field2685[var64] = var61.field4965;
                                if (class122.field1529[var64] == var61.field4958) {
                                    class78.field857[var64] = class283.method1834(class78.field857[var64], 4);
                                } else {
                                    class78.field857[var64] = 4;
                                }
                                class122.field1529[var64] = var61.field4958;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg4 + 1 & 0x3]) {
                            arg13[1] = class489.field7133[var62][class643.method3659(3, var63 + 3)];
                        }
                    } else if (!var15[arg4 + 1 & 0x3]) {
                        arg13[1] = class560.field7984[var62][class643.method3659(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg9 == null) {
            return;
        }
        int var68 = class400.method2549(arg5, arg9, (byte) 111);
        if (!arg9.field4946) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg4 * 2) & 0x7;
            if (class207.field2780[arg3][var69] && class122.field1529[var70] <= arg9.field4958) {
                class379.field5762[var70] = arg9.field4961;
                class507.field7362[var70] = var68;
                class228.field3199[var70] = arg5.method370() ? arg9.field4957 : arg9.field4955;
                class200.field2685[var70] = arg9.field4965;
                if (class122.field1529[var70] == arg9.field4958) {
                    class78.field857[var70] = class283.method1834(class78.field857[var70], 2);
                } else {
                    class78.field857[var70] = 2;
                }
                class122.field1529[var70] = arg9.field4958;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Loa;B[Lvi;[[[I)V")
    public final void method564(class605 arg0, byte arg1, class468[] arg2, int[][][] arg3) {
        field995++;
        if (!this.field1001) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field999; var6++) {
                    for (int var7 = 0; var7 < this.field1002; var7++) {
                        if ((class443.field6617[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class443.field6617[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method2858(var7, var6, -9207);
                            }
                        }
                    }
                }
            }
        }
        int var9 = 29 / ((arg1 + 11) / 61);
        for (int var10 = 0; var10 < this.field1019; var10++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field1001) {
                if (class594.field8686) {
                    var11 |= 0x2;
                }
                if (class146.field1797) {
                    var12 |= 0x8;
                }
                if (class202.field2696 != 0) {
                    var11 |= 0x1;
                    if (class316.field4607 | var10 == 0) {
                        var12 |= 0x10;
                    }
                }
            }
            if (class594.field8686) {
                var12 |= 0x7;
            }
            if (!class441.field6583) {
                var12 |= 0x20;
            }
            int[][] var13 = arg3 == null || var10 >= arg3.length ? this.field1006[var10] : arg3[var10];
            class131.method812(var10, arg0.method304(this.field999, this.field1002, this.field1006[var10], var13, 512, var11, var12));
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIB)V")
    public final void method565(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1003++;
        if (arg4 == 11) {
            for (int var6 = 0; var6 < this.field1019; var6++) {
                this.method567(arg0, arg3, arg1, -32157, var6, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BIILrt;III[Lvi;II)V")
    public final void method566(byte arg0, int arg1, int arg2, class194 arg3, int arg4, int arg5, int arg6, class468[] arg7, int arg8, int arg9) {
        field1013++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (!this.field1001) {
            class468 var13 = arg7[arg1];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class163.method950(var14 & 0x7, false, var15 & 0x7, arg5) + arg9;
                    int var17 = arg4 + class407.method2576(arg5, var14 & 0x7, arg0 + 2794, var15 & 0x7);
                    if (var16 > 0 && var16 < this.field999 - 1 && var17 > 0 && (this.field1002 - 1) > var17) {
                        var13.method2867(var16, -108, var17);
                    }
                }
            }
        }
        int var18 = (arg2 & 0xFFFFFFF8) << 3;
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        if (arg0 != 49) {
            this.method565(61, 83, 61, -90, (byte) -69);
        }
        byte var20 = 0;
        byte var21 = 0;
        if (arg5 == 1) {
            var21 = 1;
        } else if (arg5 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg5 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1019; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 == var22 && var23 >= var11 && var11 + 8 >= var23 && var12 <= var24 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                            if (arg5 == 0) {
                                var26 = arg4 + var24 - var12;
                                var25 = arg9 + var23 - var11;
                            } else if (arg5 == 1) {
                                var26 = var11 + arg4 + 8 - var23;
                                var25 = arg9 + var24 - var12;
                            } else if (arg5 == 2) {
                                var26 = var12 + arg4 + 8 - var24;
                                var25 = arg9 + var11 + 8 - var23;
                            } else {
                                var26 = var23 - (var11 - arg4);
                                var25 = arg9 + 8 - (-var12 + var24);
                            }
                            this.method568(0, arg3, true, arg1, 0, var25, var19 + var24, 0, var18 + var23, var26, 1690);
                        } else {
                            var25 = arg9 + class163.method950(var23 & 0x7, false, var24 & 0x7, arg5);
                            var26 = arg4 + class407.method2576(arg5, var23 & 0x7, arg0 + 2794, var24 & 0x7);
                            this.method568(arg5, arg3, false, arg1, var20, var25, var19 + var24, var21, var18 + var23, var26, arg0 ^ 0x6AB);
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
                                if (arg5 == 0) {
                                    var32 = var29 + arg9 - var11;
                                    var31 = arg4 + var30 - var12;
                                } else if (arg5 == 1) {
                                    var31 = arg4 + var11 + 8 - var29;
                                    var32 = var30 - (var12 - arg9);
                                } else if (arg5 == 2) {
                                    var32 = var11 + arg9 + 8 - var29;
                                    var31 = arg4 - (-(var12 - var30) - 8);
                                } else {
                                    var32 = arg9 + 8 - (-var12 + var30);
                                    var31 = var29 + arg4 - var11;
                                }
                                if (var32 >= 0 && var32 < this.field999 && var31 >= 0 && var31 < this.field1002) {
                                    this.field1006[arg1][var32][var31] = this.field1006[arg1][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method568(0, arg3, false, 0, 0, -1, 0, 0, 0, -1, 1690);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIII)V")
    private final void method567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1014++;
        for (int var7 = arg1; var7 < (arg0 + arg1); var7++) {
            for (int var10 = arg5; var10 < arg2 + arg5; var10++) {
                if (var10 >= 0 && var10 < this.field999 && var7 >= 0 && this.field1002 > var7) {
                    this.field1006[arg4][var10][var7] = arg4 <= 0 ? 0 : this.field1006[arg4 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg5 > 0 && this.field999 > arg5) {
            for (int var8 = arg1 + 1; var8 < arg0 + arg1; var8++) {
                if (var8 >= 0 && this.field1002 > var8) {
                    this.field1006[arg4][arg5][var8] = this.field1006[arg4][arg5 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && this.field1002 > arg1) {
            for (int var9 = arg5 + 1; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && this.field999 > var9) {
                    this.field1006[arg4][var9][arg1] = this.field1006[arg4][var9][arg1 - 1];
                }
            }
        }
        if (arg5 >= 0 && arg1 >= 0 && arg5 < this.field999 && arg1 < this.field1002) {
            if (arg4 == 0) {
                if (arg5 > 0 && this.field1006[arg4][arg5 - 1][arg1] != 0) {
                    this.field1006[arg4][arg5][arg1] = this.field1006[arg4][arg5 - 1][arg1];
                } else if (arg1 > 0 && this.field1006[arg4][arg5][arg1 - 1] != 0) {
                    this.field1006[arg4][arg5][arg1] = this.field1006[arg4][arg5][arg1 - 1];
                } else if (arg5 > 0 && arg1 > 0 && this.field1006[arg4][arg5 - 1][arg1 - 1] != 0) {
                    this.field1006[arg4][arg5][arg1] = this.field1006[arg4][arg5 - 1][arg1 - 1];
                }
            } else if (arg5 > 0 && this.field1006[arg4 - 1][arg5 - 1][arg1] != this.field1006[arg4][arg5 - 1][arg1]) {
                this.field1006[arg4][arg5][arg1] = this.field1006[arg4][arg5 - 1][arg1];
            } else if (arg1 > 0 && this.field1006[arg4 - 1][arg5][arg1 - 1] != this.field1006[arg4][arg5][arg1 - 1]) {
                this.field1006[arg4][arg5][arg1] = this.field1006[arg4][arg5][arg1 - 1];
            } else if (arg5 > 0 && arg1 > 0 && this.field1006[arg4 - 1][arg5 - 1][arg1 - 1] != this.field1006[arg4][arg5 - 1][arg1 - 1]) {
                this.field1006[arg4][arg5][arg1] = this.field1006[arg4][arg5 - 1][arg1 - 1];
            }
        }
        if (arg3 != -32157) {
            this.method564(null, (byte) 28, null, null);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILrt;ZIIIIIIII)V")
    private final void method568(int arg0, class194 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1021++;
        if (arg10 != 1690) {
            this.method564(null, (byte) -20, null, null);
        }
        if (arg0 == 1) {
            arg7 = 1;
        } else if (arg0 == 2) {
            arg4 = 1;
            arg7 = 1;
        } else if (arg0 == 3) {
            arg4 = 1;
        }
        if (arg5 < 0 || arg5 >= this.field999 || arg9 < 0 || arg9 >= this.field1002) {
            while (true) {
                int var14 = arg1.method1177(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg1.method1177(255);
                    return;
                }
                if (var14 <= 49) {
                    arg1.method1177(255);
                }
            }
        }
        if (!this.field1001 && !arg2) {
            class443.field6617[arg3][arg5][arg9] = 0;
        }
        while (true) {
            int var12 = arg1.method1177(255);
            if (var12 == 0) {
                if (this.field1001) {
                    this.field1006[0][arg4 + arg5][arg9 + arg7] = 0;
                    return;
                } else if (arg3 == 0) {
                    this.field1006[0][arg4 + arg5][arg7 + arg9] = -class329.method2147(arg6 + 556238, (byte) 69, arg8 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field1006[arg3][arg4 + arg5][arg7 + arg9] = this.field1006[arg3 - 1][arg5 + arg4][arg7 + arg9] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg1.method1177(255);
                if (!this.field1001) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg3 == 0) {
                        this.field1006[0][arg5 + arg4][arg9 + arg7] = -var13 * 8 << 2;
                        return;
                    }
                    this.field1006[arg3][arg4 + arg5][arg7 + arg9] = this.field1006[arg3 - 1][arg4 + arg5][arg7 + arg9] - (var13 * 8 << 2);
                    return;
                }
                this.field1006[0][arg4 + arg5][arg7 + arg9] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg2) {
                    arg1.method1177(255);
                } else {
                    this.field1017[arg3][arg5][arg9] = arg1.method1213((byte) 112);
                    this.field1010[arg3][arg5][arg9] = (byte) ((var12 - 2) / 4);
                    this.field1009[arg3][arg5][arg9] = (byte) class643.method3659(var12 + arg0 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field1001 && !arg2) {
                    class443.field6617[arg3][arg5][arg9] = (byte) (var12 - 49);
                }
            } else if (!arg2) {
                this.field1004[arg3][arg5][arg9] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIZLpp;Ldba;)V")
    public class88(int arg0, int arg1, int arg2, boolean arg3, class333 arg4, class79 arg5) {
        this.field1002 = arg2;
        this.field1001 = arg3;
        this.field996 = arg4;
        this.field1011 = arg5;
        this.field999 = arg1;
        this.field1019 = arg0;
        this.field1010 = new byte[this.field1019][this.field999][this.field1002];
        this.field1017 = new byte[this.field1019][this.field999][this.field1002];
        this.field1007 = new byte[this.field1019][this.field999 + 1][this.field1002 + 1];
        this.field1009 = new byte[this.field1019][this.field999][this.field1002];
        this.field1006 = new int[this.field1019][this.field999 + 1][this.field1002 + 1];
        this.field1004 = new byte[this.field1019][this.field999][this.field1002];
    }
}
