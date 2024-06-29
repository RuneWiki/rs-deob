import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class416 extends class105 {

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "Lpca;")
    public static class653 field5522 = new class653(5);

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "Lpr;")
    public static class407 field5523 = null;

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "Lkfa;")
    public static class549 field5525 = new class549(9, -1);

    @OriginalMember(owner = "client!gt", name = "W", descriptor = "I")
    public static int field5526 = 0;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V", line = 3)
    public static final void method2246(int arg0) {
        ++field5519;
        if (arg0 < -70) {
            class14.field135.method368(((float) class601.field8530.field2868 * 0.1F + 0.7F) * 1.1523438F);
            class14.field135.method320(class126.field1422, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
            class14.field135.method363(class629.field8943, -1, 0);
            class14.field135.method384(class205.field2503);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)V", line = 18)
    public final void method252(int arg0, int arg1) {
        ++field5512;
        class217 var3 = (class217) super.field1146.method814(Thread.currentThread());
        var3.field2620.field798 = 0;
        if (super.field1149 == null) {
            if (super.field1140 != null) {
                this.method2248(arg0, var3.field3633, arg1, var3.field3631, -82, var3.field2620, var3.field3638, var3.field3618);
                return;
            }
        } else {
            this.method2252(var3.field3633, var3.field3638, var3.field3631, arg0, var3.field2620, arg1, super.field1146.field1656, var3.field3618, 22887);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III[[ZZ)V", line = 35)
    public final void method245(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field5514;
        super.field1150 = -1;
        class47 var6 = super.field1146.field1679;
        super.field1154 = var6.field519;
        super.field1144 = var6.field515;
        super.field1138 = var6.field514;
        super.field1145 = var6.field517;
        super.field1148 = var6.field516;
        super.field1153 = var6.field513;
        super.field1136 = var6.field509;
        super.field1139 = var6.field518;
        super.field1147 = var6.field510;
        super.field1137 = var6.field512;
        super.field1134 = var6.field511;
        super.field1152 = var6.field520;
        for (int var7 = 0; arg2 - -arg2 > var7; ++var7) {
            for (int var8 = 0; ~(arg2 + arg2) < ~var8; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = -arg2 + arg0 + var7;
                    int var10 = arg1 + var8 + -arg2;
                    if (~var9 <= -1 && ~super.field1558 < ~var9 && var10 >= 0 && var10 < super.field1562) {
                        this.method252(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)V", line = 87)
    public static void method2247(byte arg0) {
        field5523 = null;
        field5522 = null;
        field5525 = null;
        if (arg0 >= -20) {
            field5525 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[II[IILtn;[I[I)V", line = 104)
    private final void method2248(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, class78 arg5, int[] arg6, int[] arg7) {
        ++field5516;
        if (arg4 <= -57) {
            class188 var9 = super.field1140[arg0][arg2];
            if (var9 != null) {
                if ((2 & var9.field2289) == 0) {
                    int var10 = super.field1561 * arg0;
                    int var11 = super.field1561 + var10;
                    int var12 = super.field1561 * arg2;
                    int var13 = super.field1561 + var12;
                    int var15;
                    int var16;
                    int var17;
                    int var18;
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    int var30;
                    int var31;
                    int var33;
                    int var34;
                    int var35;
                    int var36;
                    int var37;
                    if (~(1 & var9.field2289) != -1) {
                        int var14 = super.field1135[arg0][arg2];
                        if (~super.field1150 != 0) {
                            var15 = super.field1150;
                            var16 = super.field1150;
                            var17 = super.field1150;
                            var18 = super.field1150;
                        } else {
                            int var19 = super.field1152 * var14;
                            var18 = (super.field1144 * var12 + super.field1148 * var10 + var19 >> 14) + super.field1134;
                            if (super.field1146.field1665 >= var18) {
                                return;
                            }
                            var17 = super.field1134 - -(super.field1148 * var11 + (var19 - -(super.field1144 * var12)) >> 14);
                            if (~super.field1146.field1665 <= ~var17) {
                                return;
                            }
                            var16 = (super.field1148 * var11 - -(super.field1144 * var13) + var19 >> 14) + super.field1134;
                            if (~super.field1146.field1665 <= ~var16) {
                                return;
                            }
                            var15 = (super.field1148 * var10 + super.field1144 * var13 - -var19 >> 14) + super.field1134;
                            if (var15 <= super.field1146.field1665) {
                                return;
                            }
                        }
                        int var20 = super.field1137 * var14;
                        int var21 = super.field1153 * var14;
                        var22 = (super.field1139 * var10 - -(super.field1145 * var12) + var20 >> 14) + super.field1147;
                        var23 = super.field1146.field1671 * var22 / var18 + arg5.field797;
                        var24 = super.field1154 - -(super.field1136 * var10 - (-(super.field1138 * var12) + -var21) >> 14);
                        var25 = super.field1146.field1688 * var24 / var18 + arg5.field799;
                        var26 = (super.field1139 * var11 + (var20 - -(super.field1145 * var12)) >> 14) + super.field1147;
                        var27 = (super.field1136 * var11 - -(super.field1138 * var12) + var21 >> 14) + super.field1154;
                        var28 = super.field1146.field1671 * var26 / var17 + arg5.field797;
                        int var29 = (super.field1139 * var11 + super.field1145 * var13 + var20 >> 14) + super.field1147;
                        var30 = super.field1146.field1688 * var27 / var17 + arg5.field799;
                        var31 = super.field1146.field1671 * var29 / var16 + arg5.field797;
                        int var32 = super.field1154 - -(super.field1138 * var13 + super.field1136 * var11 + var21 >> 14);
                        var33 = arg5.field799 - -(super.field1146.field1688 * var32 / var16);
                        var34 = (super.field1145 * var13 + super.field1139 * var10 + var20 >> 14) + super.field1147;
                        var35 = (super.field1138 * var13 + super.field1136 * var10 + var21 >> 14) + super.field1154;
                        var36 = super.field1146.field1671 * var34 / var15 + arg5.field797;
                        var37 = super.field1146.field1688 * var35 / var15 + arg5.field799;
                    } else {
                        int var38 = super.field1135[arg0][arg2];
                        int var39 = super.field1135[arg0 + 1][arg2];
                        int var40 = super.field1135[arg0 + 1][arg2 + 1];
                        int var41 = super.field1135[arg0][arg2 + 1];
                        if (~super.field1150 != 0) {
                            var15 = super.field1150;
                            var16 = super.field1150;
                            var17 = super.field1150;
                            var18 = super.field1150;
                        } else {
                            var18 = super.field1134 - -(super.field1148 * var10 - (-(super.field1152 * var38) + -(super.field1144 * var12)) >> 14);
                            if (~var18 >= ~super.field1146.field1665) {
                                return;
                            }
                            var17 = (super.field1152 * var39 + super.field1148 * var11 - -(super.field1144 * var12) >> 14) + super.field1134;
                            if (var17 <= super.field1146.field1665) {
                                return;
                            }
                            var16 = super.field1134 - -(super.field1144 * var13 + super.field1152 * var40 + super.field1148 * var11 >> 14);
                            if (super.field1146.field1665 >= var16) {
                                return;
                            }
                            var15 = (super.field1148 * var10 + super.field1152 * var41 + super.field1144 * var13 >> 14) + super.field1134;
                            if (super.field1146.field1665 >= var15) {
                                return;
                            }
                        }
                        var22 = (super.field1139 * var10 - (-(super.field1137 * var38) - super.field1145 * var12) >> 14) + super.field1147;
                        var24 = (super.field1153 * var38 + super.field1138 * var12 + super.field1136 * var10 >> 14) + super.field1154;
                        var23 = super.field1146.field1671 * var22 / var18 + arg5.field797;
                        var25 = super.field1146.field1688 * var24 / var18 + arg5.field799;
                        var26 = (super.field1139 * var11 + (super.field1137 * var39 - -(super.field1145 * var12)) >> 14) + super.field1147;
                        var28 = arg5.field797 - -(super.field1146.field1671 * var26 / var17);
                        var27 = super.field1154 - -(super.field1138 * var12 + super.field1153 * var39 + super.field1136 * var11 >> 14);
                        int var42 = (super.field1137 * var40 + (super.field1139 * var11 - -(super.field1145 * var13)) >> 14) + super.field1147;
                        var30 = super.field1146.field1688 * var27 / var17 + arg5.field799;
                        var31 = super.field1146.field1671 * var42 / var16 + arg5.field797;
                        int var43 = super.field1154 - -(super.field1153 * var40 + super.field1136 * var11 - -(super.field1138 * var13) >> 14);
                        var34 = (super.field1139 * var10 - (-(super.field1145 * var13) + -(super.field1137 * var41)) >> 14) + super.field1147;
                        var33 = super.field1146.field1688 * var43 / var16 + arg5.field799;
                        var36 = super.field1146.field1671 * var34 / var15 + arg5.field797;
                        var35 = (super.field1138 * var13 + super.field1153 * var41 + super.field1136 * var10 >> 14) + super.field1154;
                        var37 = super.field1146.field1688 * var35 / var15 + arg5.field799;
                    }
                    if (~((-var36 + var31) * (-var37 + var30) + -((-var36 + var28) * (-var37 + var33))) < -1) {
                        arg5.field801 = var31 < 0 || ~var36 > -1 || ~var28 > -1 || ~arg5.field810 > ~var31 || ~var36 < ~arg5.field810 || arg5.field810 < var28;
                        if (var9.field2291 >= 0) {
                            if (this.method629(super.field1146.field8990.method846((byte) -117, var9.field2291).field5486)) {
                                arg5.field798 = 100;
                            }
                            arg5.method504(var33, var37, var30, var31, var36, var28, var16, var15, var17, 65535 & var9.field2290, var9.field2292 & 65535, var9.field2288 & 65535, var22, var26, var34, var24, var27, var35, var18, var17, var15, var9.field2291);
                            arg5.field798 = 0;
                        } else {
                            arg5.method501(var33, var37, var30, var31, var36, var28, var16, var15, var17, 65535 & var9.field2290, var9.field2292 & 65535, var9.field2288 & 65535);
                        }
                    }
                    if ((-var28 + var23) * (-var30 + var37) - (-var28 + var36) * (-var30 + var25) > 0) {
                        arg5.field801 = var23 < 0 || ~var28 > -1 || ~var36 > -1 || ~var23 < ~arg5.field810 || arg5.field810 < var28 || arg5.field810 < var36;
                        if (~var9.field2291 <= -1) {
                            if (this.method629(super.field1146.field8990.method846((byte) -104, var9.field2291).field5486)) {
                                arg5.field798 = 100;
                            }
                            arg5.method504(var25, var30, var37, var23, var28, var36, var18, var17, var15, var9.field2293 & 65535, 65535 & var9.field2288, 65535 & var9.field2292, var22, var26, var34, var24, var27, var35, var18, var17, var15, var9.field2291);
                            arg5.field798 = 0;
                            return;
                        }
                        arg5.method501(var25, var30, var37, var23, var28, var36, var18, var17, var15, var9.field2293 & 65535, var9.field2288 & 65535, 65535 & var9.field2292);
                    }
                }
            } else {
                class42 var44 = super.field1142[arg0][arg2];
                if (var44 != null) {
                    if (super.field1150 == -1) {
                        for (int var45 = 0; ~var45 > ~var44.field438; ++var45) {
                            int var46 = (arg0 << super.field1560) + var44.field446[var45];
                            short var47 = var44.field440[var45];
                            int var48 = var44.field450[var45] - -(arg2 << super.field1560);
                            int var49 = (super.field1152 * var47 + super.field1148 * var46 - -(super.field1144 * var48) >> 14) + super.field1134;
                            if (var49 <= super.field1146.field1665) {
                                return;
                            }
                            int var50 = (super.field1136 * var46 - -(super.field1153 * var47) - -(super.field1138 * var48) >> 14) + super.field1154;
                            int var51 = (super.field1137 * var47 + (super.field1139 * var46 - -(super.field1145 * var48)) >> 14) + super.field1147;
                            arg7[var45] = arg5.field797 - -(super.field1146.field1671 * var51 / var49);
                            arg3[var45] = super.field1146.field1688 * var50 / var49 + arg5.field799;
                            arg6[var45] = var49;
                        }
                    } else {
                        for (int var52 = 0; ~var52 > ~var44.field438; ++var52) {
                            int var92 = var44.field446[var52] - -(arg0 << super.field1560);
                            short var93 = var44.field440[var52];
                            int var94 = (arg2 << super.field1560) + var44.field450[var52];
                            int var95 = (super.field1136 * var92 - (-(super.field1153 * var93) - super.field1138 * var94) >> 14) + super.field1154;
                            int var96 = (super.field1145 * var94 + super.field1139 * var92 + super.field1137 * var93 >> 14) + super.field1147;
                            arg7[var52] = super.field1146.field1671 * var96 / super.field1150 + arg5.field797;
                            arg3[var52] = arg5.field799 - -(super.field1146.field1688 * var95 / super.field1150);
                            arg6[var52] = super.field1150;
                        }
                    }
                    if (var44.field448 != null) {
                        int var53 = super.field1135[arg0][arg2];
                        int var54 = super.field1135[arg0 + 1][arg2];
                        int var55 = super.field1135[arg0][arg2 + 1];
                        int var56 = super.field1561 * arg0;
                        int var57 = super.field1561 + var56;
                        int var58 = super.field1561 * arg2;
                        int var59 = super.field1561 + var58;
                        int var60 = (super.field1139 * var56 + super.field1145 * var58 + super.field1137 * var53 >> 14) + super.field1147;
                        int var61 = (super.field1138 * var58 + super.field1153 * var53 + super.field1136 * var56 >> 14) + super.field1154;
                        int var62 = (super.field1152 * var53 + super.field1148 * var56 - -(super.field1144 * var58) >> 14) + super.field1134;
                        int var63 = (super.field1139 * var57 + (super.field1137 * var54 - -(super.field1145 * var58)) >> 14) + super.field1147;
                        int var64 = super.field1154 - -(super.field1138 * var58 + super.field1153 * var54 + super.field1136 * var57 >> 14);
                        int var65 = (super.field1152 * var54 + super.field1148 * var57 + super.field1144 * var58 >> 14) + super.field1134;
                        int var66 = (super.field1139 * var56 + (super.field1137 * var55 - -(super.field1145 * var59)) >> 14) + super.field1147;
                        int var67 = super.field1154 - -(super.field1138 * var59 + super.field1153 * var55 + super.field1136 * var56 >> 14);
                        int var68 = (super.field1148 * var56 + super.field1152 * var55 + super.field1144 * var59 >> 14) + super.field1134;
                        for (int var69 = 0; ~var69 > ~var44.field441; ++var69) {
                            short var70 = var44.field439[var69];
                            short var71 = var44.field443[var69];
                            short var72 = var44.field444[var69];
                            int var73 = arg7[var70];
                            int var74 = arg7[var71];
                            int var75 = arg7[var72];
                            int var76 = arg3[var70];
                            int var77 = arg3[var71];
                            int var78 = arg3[var72];
                            if ((-var74 + var73) * (-var77 + var78) - (-var74 + var75) * (-var77 + var76) > 0) {
                                arg5.field801 = ~var73 > -1 || var74 < 0 || var75 < 0 || var73 > arg5.field810 || ~arg5.field810 > ~var74 || ~arg5.field810 > ~var75;
                                short var79 = var44.field448[var69];
                                if (var79 != -1) {
                                    if (this.method629(super.field1146.field8990.method846((byte) -125, var79).field5486)) {
                                        arg5.field798 = 100;
                                    }
                                    arg5.method504(var76, var77, var78, var73, var74, var75, arg6[var70], arg6[var71], arg6[var72], var44.field442[var70], var44.field442[var71], var44.field442[var72], var60, var63, var66, var61, var64, var67, var62, var65, var68, var79);
                                    arg5.field798 = 0;
                                } else {
                                    int var80 = var44.field449[var69];
                                    if (var80 != -1) {
                                        arg5.method501(var76, var77, var78, var73, var74, var75, arg6[var70], arg6[var71], arg6[var72], class80.method514(var80, var44.field442[var70], (byte) -121), class80.method514(var80, var44.field442[var71], (byte) -104), class80.method514(var80, var44.field442[var72], (byte) -114));
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var81 = 0; var81 < var44.field441; ++var81) {
                            short var82 = var44.field439[var81];
                            short var83 = var44.field443[var81];
                            short var84 = var44.field444[var81];
                            int var85 = arg7[var82];
                            int var86 = arg7[var83];
                            int var87 = arg7[var84];
                            int var88 = arg3[var82];
                            int var89 = arg3[var83];
                            int var90 = arg3[var84];
                            if ((-var86 + var85) * (-var89 + var90) + -((-var86 + var87) * (-var89 + var88)) > 0) {
                                int var91 = var44.field449[var81];
                                if (var91 != -1) {
                                    arg5.field801 = var85 < 0 || var86 < 0 || ~var87 > -1 || ~arg5.field810 > ~var85 || ~arg5.field810 > ~var86 || ~arg5.field810 > ~var87;
                                    arg5.method501(var88, var89, var90, var85, var86, var87, arg6[var82], arg6[var83], arg6[var84], class80.method514(var91, var44.field442[var82], (byte) -124), class80.method514(var91, var44.field442[var83], (byte) -109), class80.method514(var91, var44.field442[var84], (byte) -123));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ltn;I[IIIZII[[ZI[II)V", line = 481)
    private final void method2249(class78 arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean[][] arg8, int arg9, int[] arg10, int arg11) {
        ++field5517;
        int var13 = (arg11 - arg3) * arg7 / 256;
        int var14 = arg7 >> 8;
        boolean var15 = ((class397) super.field1146).field5292;
        super.field1146.method329(false);
        arg0.field807 = false;
        arg0.field811 = false;
        int var16 = arg9;
        int var17 = arg1 + var13;
        for (int var18 = arg6; ~var18 > ~arg4; ++var18) {
            for (int var19 = arg3; ~var19 > ~arg11; ++var19) {
                if (arg8[-arg6 + var18][-arg3 + var19]) {
                    if (super.field1140[var18][var19] != null) {
                        class188 var20 = super.field1140[var18][var19];
                        if (~var20.field2291 != 0 && (2 & var20.field2289) == 0 && ~var20.field2287 == 0) {
                            int var21 = super.field1146.method805(var20.field2291);
                            arg0.method501(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var16 - -var14, 100, 100, 100, class80.method514(var21, 65535 & var20.field2290, (byte) -116), class80.method514(var21, 65535 & var20.field2292, (byte) -121), class80.method514(var21, var20.field2288 & 65535, (byte) -110));
                            arg0.method501(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class80.method514(var21, 65535 & var20.field2293, (byte) -128), class80.method514(var21, 65535 & var20.field2288, (byte) -113), class80.method514(var21, 65535 & var20.field2292, (byte) -116));
                        } else if (var20.field2287 == -1) {
                            arg0.method501(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var16 - -var14, 100, 100, 100, 65535 & var20.field2290, 65535 & var20.field2292, 65535 & var20.field2288);
                            arg0.method501(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field2293 & 65535, 65535 & var20.field2288, 65535 & var20.field2292);
                        } else {
                            int var22 = var20.field2287;
                            arg0.method501(var17 - var14, -var14 + var17, var17, var16 - -var14, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg0.method501(var17, var17, -var14 + var17, var16, var16 - -var14, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (super.field1142[var18][var19] != null) {
                        class42 var23 = super.field1142[var18][var19];
                        for (int var24 = 0; var23.field438 > var24; ++var24) {
                            arg2[var24] = var16 - -(var23.field446[var24] * var14 / super.field1561);
                            arg10[var24] = -(var23.field450[var24] * var14 / super.field1561) + var17;
                        }
                        for (int var25 = 0; ~var25 > ~var23.field441; ++var25) {
                            short var26 = var23.field439[var25];
                            short var27 = var23.field443[var25];
                            short var28 = var23.field444[var25];
                            int var29 = arg2[var26];
                            int var30 = arg2[var27];
                            int var31 = arg2[var28];
                            int var32 = arg10[var26];
                            int var33 = arg10[var27];
                            int var34 = arg10[var28];
                            if (var23.field445 != null && var23.field445[var25] != -1) {
                                int var35 = var23.field445[var25];
                                arg0.method501(var32, var33, var34, var29, var30, var31, 100, 100, 100, class80.method514(var35, var23.field442[var26], (byte) -119), class80.method514(var35, var23.field442[var27], (byte) -112), class80.method514(var35, var23.field442[var28], (byte) -128));
                            } else if (var23.field448 != null && var23.field448[var25] != -1) {
                                int var36 = super.field1146.method805(var23.field448[var25]);
                                arg0.method501(var32, var33, var34, var29, var30, var31, 100, 100, 100, class80.method514(var36, var23.field442[var26], (byte) -123), class80.method514(var36, var23.field442[var27], (byte) -118), class80.method514(var36, var23.field442[var28], (byte) -125));
                            } else {
                                int var37 = var23.field449[var25];
                                arg0.method501(var32, var33, var34, var29, var30, var31, 100, 100, 100, class80.method514(var37, var23.field442[var26], (byte) -112), class80.method514(var37, var23.field442[var27], (byte) -124), class80.method514(var37, var23.field442[var28], (byte) -118));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg0.field811 = arg5;
        super.field1146.method329(var15);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILwm;)V", line = 623)
    public static final void method2250(int arg0, int arg1, class515 arg2) {
        ++field5513;
        if (arg0 == 0) {
            if (class470.field6563) {
                arg1 = 0;
                class470.field6563 = false;
            }
            if (class648.field9181 == null || !class648.field9181.method2946(arg2, arg0 ^ 12)) {
                class648.field9181 = arg2;
                class40.field427 = class641.method3604(false);
                class252.field3233 = arg1;
                class639.field9072 = arg1;
                if (class639.field9072 == 0) {
                    class300.method1701(true);
                    return;
                }
                class95.field1056 = class365.field4777;
                class293.field3849 = class32.field363;
                class448.field6153 = class593.field8429;
                class38.field420 = class631.field8956;
                class665.field9459 = class658.field9387;
                class496.field7163 = class610.field8619;
                class512.field7330 = class365.field4778;
                class270.field3402 = class113.field1323;
                class135.field1541 = class559.field7960;
                class404.field5401 = class172.field2052;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([IIZLtn;IIIII[II[[Z)V", line = 663)
    private final void method2251(int[] arg0, int arg1, boolean arg2, class78 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, boolean[][] arg11) {
        ++field5518;
        int var13 = (-arg10 + arg1) * arg4 / 256;
        int var14 = arg4 >> 8;
        boolean var15 = ((class397) super.field1146).field5292;
        super.field1146.method329(arg2);
        arg3.field811 = false;
        arg3.field807 = false;
        int var16 = arg5;
        int var17 = arg6 + var13;
        for (int var18 = arg8; ~arg7 < ~var18; ++var18) {
            for (int var19 = arg10; ~arg1 < ~var19; ++var19) {
                if (arg11[-arg8 + var18][-arg10 + var19]) {
                    if (super.field1149[var18][var19] != null) {
                        class124 var20 = super.field1149[var18][var19];
                        if (~var20.field1413 != 0 && (2 & var20.field1417) == 0 && var20.field1416 == 0) {
                            int var21 = super.field1146.method805(var20.field1413);
                            arg3.method501(-var14 + var17, -var14 + var17, var17, var16 - -var14, var16, var14 + var16, 100, 100, 100, class80.method514(var21, var20.field1412, (byte) -127), class80.method514(var21, var20.field1410, (byte) -124), class80.method514(var21, var20.field1409, (byte) -108));
                            arg3.method501(var17, var17, -var14 + var17, var16, var16 - -var14, var16, 100, 100, 100, class80.method514(var21, var20.field1414, (byte) -125), class80.method514(var21, var20.field1409, (byte) -125), class80.method514(var21, var20.field1410, (byte) -118));
                        } else if (~var20.field1416 == -1) {
                            arg3.method486(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field1412, var20.field1410, var20.field1409);
                            arg3.method486(var17, var17, -var14 + var17, var16, var16 - -var14, var16, 100, 100, 100, var20.field1414, var20.field1409, var20.field1410);
                        } else {
                            int var22 = var20.field1416;
                            arg3.method486(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class425.method2296(-10227, var22, var20.field1412 & -16777216), class425.method2296(-10227, var22, -16777216 & var20.field1410), class425.method2296(-10227, var22, -16777216 & var20.field1409));
                            arg3.method486(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class425.method2296(-10227, var22, -16777216 & var20.field1414), class425.method2296(-10227, var22, -16777216 & var20.field1409), class425.method2296(-10227, var22, -16777216 & var20.field1410));
                        }
                    } else if (super.field1141[var18][var19] != null) {
                        class339 var23 = super.field1141[var18][var19];
                        for (int var24 = 0; ~var24 > ~var23.field4422; ++var24) {
                            arg0[var24] = var23.field4425[var24] * var14 / super.field1561 + var16;
                            arg9[var24] = -(var23.field4424[var24] * var14 / super.field1561) + var17;
                        }
                        for (int var25 = 0; var23.field4417 > var25; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg0[var26];
                            int var30 = arg0[var27];
                            int var31 = arg0[var28];
                            int var32 = arg9[var26];
                            int var33 = arg9[var27];
                            int var34 = arg9[var28];
                            if (var23.field4418 == null || ~var23.field4418[var25] == -1 || var23.field4421 != null && (var23.field4421 == null || ~var23.field4421[var25] != 0)) {
                                if (var23.field4421 != null && ~var23.field4421[var25] != 0) {
                                    int var36 = super.field1146.method805(var23.field4421[var25]);
                                    arg3.method501(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                                } else {
                                    arg3.method486(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field4426[var26], var23.field4426[var27], var23.field4426[var28]);
                                }
                            } else {
                                int var35 = var23.field4418[var25];
                                arg3.method486(var32, var33, var34, var29, var30, var31, 100, 100, 100, class425.method2296(-10227, var35, -(-16777216 & var23.field4426[var26]) + -16777216), class425.method2296(-10227, var35, -(var23.field4426[var27] & -16777216) + -16777216), class425.method2296(-10227, var35, -(-16777216 & var23.field4426[var28]) + -16777216));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg6 + var13;
            var16 += var14;
        }
        arg3.field811 = true;
        super.field1146.method329(var15);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([I[I[IILtn;IZ[II)V", line = 807)
    private final void method2252(int[] arg0, int[] arg1, int[] arg2, int arg3, class78 arg4, int arg5, boolean arg6, int[] arg7, int arg8) {
        ++field5520;
        class124 var10 = super.field1149[arg3][arg5];
        if (var10 != null) {
            if (~(var10.field1417 & 2) == -1) {
                int var11 = super.field1561 * arg3;
                int var12 = super.field1561 + var11;
                int var13 = super.field1561 * arg5;
                int var14 = var13 - -super.field1561;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var21;
                int var22;
                int var23;
                int var24;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                int var45;
                int var46;
                if ((var10.field1417 & 1) != 0 && !arg6) {
                    int var19 = super.field1135[arg3][arg5];
                    if (super.field1150 == -1) {
                        int var20 = super.field1152 * var19;
                        var21 = (super.field1144 * var13 + (super.field1148 * var11 - -var20) >> 14) + super.field1134;
                        if (~var21 >= ~super.field1146.field1665) {
                            return;
                        }
                        var22 = super.field1134 - -(super.field1148 * var12 - (-(super.field1144 * var13) + -var20) >> 14);
                        if (super.field1146.field1665 >= var22) {
                            return;
                        }
                        var23 = (super.field1148 * var12 + super.field1144 * var14 + var20 >> 14) + super.field1134;
                        if (~super.field1146.field1665 <= ~var23) {
                            return;
                        }
                        var24 = super.field1134 - -(super.field1148 * var11 + super.field1144 * var14 + var20 >> 14);
                        if (super.field1146.field1665 >= var24) {
                            return;
                        }
                    } else {
                        var24 = super.field1150;
                        var23 = super.field1150;
                        var22 = super.field1150;
                        var21 = super.field1150;
                    }
                    if (super.field1146.field1685) {
                        int var25 = var21 - super.field1146.field1660;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field1146.field1660 + var22;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field1146.field1660 + var23;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = -super.field1146.field1660 + var24;
                        if (~var28 < -1) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    int var29 = super.field1137 * var19;
                    int var30 = super.field1153 * var19;
                    var31 = (super.field1139 * var11 - (-(super.field1145 * var13) + -var29) >> 14) + super.field1147;
                    var32 = (super.field1136 * var11 + (var30 - -(super.field1138 * var13)) >> 14) + super.field1154;
                    var33 = arg4.field797 - -(super.field1146.field1671 * var31 / var21);
                    var34 = (super.field1139 * var12 - (-var29 - super.field1145 * var13) >> 14) + super.field1147;
                    var35 = super.field1146.field1688 * var32 / var21 + arg4.field799;
                    var36 = super.field1146.field1671 * var34 / var22 + arg4.field797;
                    var37 = (super.field1138 * var13 + (super.field1136 * var12 - -var30) >> 14) + super.field1154;
                    var38 = super.field1147 - -(super.field1139 * var12 - (-var29 - super.field1145 * var14) >> 14);
                    var39 = arg4.field799 - -(super.field1146.field1688 * var37 / var22);
                    var40 = (super.field1136 * var12 - (-(super.field1138 * var14) + -var30) >> 14) + super.field1154;
                    var41 = arg4.field797 - -(super.field1146.field1671 * var38 / var23);
                    var42 = (super.field1145 * var14 + super.field1139 * var11 - -var29 >> 14) + super.field1147;
                    var43 = arg4.field799 - -(super.field1146.field1688 * var40 / var23);
                    var44 = super.field1146.field1671 * var42 / var24 + arg4.field797;
                    var45 = (super.field1136 * var11 - -var30 - -(super.field1138 * var14) >> 14) + super.field1154;
                    var46 = super.field1146.field1688 * var45 / var24 + arg4.field799;
                } else {
                    int var47 = super.field1135[arg3][arg5];
                    int var48 = super.field1135[arg3 + 1][arg5];
                    int var49 = super.field1135[arg3 - -1][arg5 + 1];
                    int var50 = super.field1135[arg3][arg5 + 1];
                    if (~super.field1150 != 0) {
                        var24 = super.field1150;
                        var23 = super.field1150;
                        var22 = super.field1150;
                        var21 = super.field1150;
                    } else {
                        var21 = (super.field1152 * var47 + super.field1148 * var11 + super.field1144 * var13 >> 14) + super.field1134;
                        if (var21 <= super.field1146.field1665) {
                            return;
                        }
                        var22 = (super.field1152 * var48 + (super.field1148 * var12 - -(super.field1144 * var13)) >> 14) + super.field1134;
                        if (super.field1146.field1665 >= var22) {
                            return;
                        }
                        var23 = (super.field1148 * var12 + super.field1152 * var49 + super.field1144 * var14 >> 14) + super.field1134;
                        if (~super.field1146.field1665 <= ~var23) {
                            return;
                        }
                        var24 = (super.field1152 * var50 + (super.field1148 * var11 - -(super.field1144 * var14)) >> 14) + super.field1134;
                        if (~var24 >= ~super.field1146.field1665) {
                            return;
                        }
                    }
                    if (arg6) {
                        int var51 = -super.field1146.field1660 + var21;
                        if (~var51 < -256) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field1411 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = -super.field1146.field1660 + var22;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (~var53 < -1) {
                            var16 = var53;
                            int var54 = var10.field1408 * var53 / 255;
                            if (~var54 < -1) {
                                var48 -= var54;
                            }
                        }
                        int var55 = -super.field1146.field1660 + var23;
                        if (~var55 < -256) {
                            var55 = 255;
                        }
                        if (~var55 < -1) {
                            var17 = var55;
                            int var56 = var10.field1418 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = -super.field1146.field1660 + var24;
                        if (~var57 < -256) {
                            var57 = 255;
                        }
                        if (~var57 < -1) {
                            var18 = var57;
                            int var58 = var10.field1415 * var57 / 255;
                            if (~var58 < -1) {
                                var50 -= var58;
                            }
                        }
                    } else if (super.field1146.field1685) {
                        int var59 = -super.field1146.field1660 + var21;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = -super.field1146.field1660 + var22;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field1146.field1660 + var23;
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = -super.field1146.field1660 + var24;
                        if (~var62 < -1) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    var31 = (super.field1145 * var13 + super.field1139 * var11 + super.field1137 * var47 >> 14) + super.field1147;
                    var33 = super.field1146.field1671 * var31 / var21 + arg4.field797;
                    var32 = (super.field1136 * var11 - (-(super.field1153 * var47) - super.field1138 * var13) >> 14) + super.field1154;
                    var35 = arg4.field799 - -(super.field1146.field1688 * var32 / var21);
                    var34 = super.field1147 - -(super.field1139 * var12 + super.field1145 * var13 + super.field1137 * var48 >> 14);
                    var37 = (super.field1138 * var13 + super.field1153 * var48 + super.field1136 * var12 >> 14) + super.field1154;
                    var36 = super.field1146.field1671 * var34 / var22 + arg4.field797;
                    var38 = (super.field1137 * var49 + super.field1145 * var14 + super.field1139 * var12 >> 14) + super.field1147;
                    var39 = arg4.field799 - -(super.field1146.field1688 * var37 / var22);
                    var40 = (super.field1138 * var14 + super.field1153 * var49 + super.field1136 * var12 >> 14) + super.field1154;
                    var41 = super.field1146.field1671 * var38 / var23 + arg4.field797;
                    var42 = (super.field1139 * var11 + super.field1137 * var50 - -(super.field1145 * var14) >> 14) + super.field1147;
                    var43 = super.field1146.field1688 * var40 / var23 + arg4.field799;
                    var44 = super.field1146.field1671 * var42 / var24 + arg4.field797;
                    var45 = (super.field1138 * var14 + super.field1153 * var50 + super.field1136 * var11 >> 14) + super.field1154;
                    var46 = super.field1146.field1688 * var45 / var24 + arg4.field799;
                }
                boolean var63 = ~var10.field1413 != 0 && this.method629(super.field1146.field8990.method846((byte) -111, var10.field1413).field5486);
                int var64 = var16 - -var18 + var17;
                if ((-var44 + var41) * (-var46 + var39) - (-var44 + var36) * (-var46 + var43) > 0) {
                    arg4.field801 = var41 < 0 || var44 < 0 || ~var36 > -1 || var41 > arg4.field810 || var44 > arg4.field810 || var36 > arg4.field810;
                    if (var64 < 765) {
                        if (var63) {
                            arg4.field798 = 100;
                        }
                        if (var64 <= 0) {
                            if (var10.field1413 < 0) {
                                arg4.method486(var43, var46, var39, var41, var44, var36, var23, var24, var22, var10.field1412, var10.field1410, var10.field1409);
                            } else {
                                arg4.method504(var43, var46, var39, var41, var44, var36, var23, var24, var22, var10.field1412, var10.field1410, var10.field1409, var38, var42, var34, var40, var45, var37, var23, var24, var22, var10.field1413);
                            }
                        } else if (var10.field1413 >= 0) {
                            arg4.method498(var43, var46, var39, var41, var44, var36, var23, var24, var22, super.field1146.field1677, var17, var18, var16, var10.field1412, var10.field1410, var10.field1409, var38, var42, var34, var40, var45, var37, var23, var24, var22, var10.field1413);
                        } else {
                            arg4.method486(var43, var46, var39, var41, var44, var36, var23, var24, var22, class425.method2296(-10227, var10.field1412, var17 << 24 | super.field1146.field1677), class425.method2296(-10227, var10.field1410, var18 << 24 | super.field1146.field1677), class425.method2296(-10227, var10.field1409, var16 << 24 | super.field1146.field1677));
                        }
                        arg4.field798 = 0;
                    } else {
                        arg4.method505(var43, var46, var39, var41, var44, var36, var23, var24, var22, super.field1146.field1677);
                    }
                }
                int var65 = var15 + var16 + var18;
                if (~((var33 - var36) * (-var39 + var46) + -((-var36 + var44) * (-var39 + var35))) < -1) {
                    arg4.field801 = var33 < 0 || ~var36 > -1 || var44 < 0 || ~var33 < ~arg4.field810 || var36 > arg4.field810 || ~var44 < ~arg4.field810;
                    if (var65 < 765) {
                        if (var63) {
                            arg4.field798 = 100;
                        }
                        if (var65 <= 0) {
                            if (var10.field1413 >= 0) {
                                arg4.method504(var35, var39, var46, var33, var36, var44, var21, var22, var24, var10.field1414, var10.field1409, var10.field1410, var31, var34, var42, var32, var37, var45, var21, var22, var24, var10.field1413);
                            } else {
                                arg4.method486(var35, var39, var46, var33, var36, var44, var21, var22, var24, var10.field1414, var10.field1409, var10.field1410);
                            }
                        } else if (~var10.field1413 > -1) {
                            arg4.method486(var35, var39, var46, var33, var36, var44, var21, var22, var24, class425.method2296(-10227, var10.field1414, var15 << 24 | super.field1146.field1677), class425.method2296(-10227, var10.field1409, super.field1146.field1677 | var16 << 24), class425.method2296(-10227, var10.field1410, var18 << 24 | super.field1146.field1677));
                        } else {
                            arg4.method498(var35, var39, var46, var33, var36, var44, var21, var22, var24, super.field1146.field1677, var15, var16, var18, var10.field1414, var10.field1409, var10.field1410, var31, var34, var42, var32, var37, var45, var21, var22, var24, var10.field1413);
                        }
                        arg4.field798 = 0;
                        return;
                    }
                    arg4.method505(var35, var39, var46, var33, var36, var44, var21, var22, var24, super.field1146.field1677);
                }
            }
        } else {
            class339 var66 = super.field1141[arg3][arg5];
            if (arg8 != 22887) {
                this.method2251((int[]) null, -30, true, (class78) null, -57, -60, -72, 21, 43, (int[]) null, 91, (boolean[][]) null);
            }
            if (var66 != null) {
                if (~super.field1150 != 0) {
                    for (int var67 = 0; ~var66.field4422 < ~var67; ++var67) {
                        int var68 = (arg3 << super.field1560) + var66.field4425[var67];
                        int var69 = var66.field4419[var67];
                        int var70 = (arg5 << super.field1560) + var66.field4424[var67];
                        arg0[var67] = 0;
                        if (arg6) {
                            int var71 = -super.field1146.field1660 + super.field1150;
                            if (~var71 < -256) {
                                var71 = 255;
                            }
                            if (var71 > 0) {
                                arg0[var67] = var71;
                                int var72 = var66.field4423[var67] * var71 / 255;
                                if (var72 > 0) {
                                    var69 -= var72;
                                }
                            }
                        } else if (super.field1146.field1685) {
                            int var73 = super.field1150 - super.field1146.field1660;
                            if (~var73 < -1) {
                                arg0[var67] = var73;
                                if (~arg0[var67] < -256) {
                                    arg0[var67] = 255;
                                }
                            }
                        }
                        int var74 = (super.field1138 * var70 + super.field1153 * var69 + super.field1136 * var68 >> 14) + super.field1154;
                        int var75 = super.field1147 - -(super.field1145 * var70 + super.field1139 * var68 + super.field1137 * var69 >> 14);
                        arg7[var67] = super.field1146.field1671 * var75 / super.field1150 + arg4.field797;
                        arg2[var67] = super.field1146.field1688 * var74 / super.field1150 + arg4.field799;
                        arg1[var67] = super.field1150;
                    }
                } else {
                    for (int var76 = 0; var66.field4422 > var76; ++var76) {
                        int var116 = (arg3 << super.field1560) + var66.field4425[var76];
                        int var117 = var66.field4419[var76];
                        int var118 = var66.field4424[var76] - -(arg5 << super.field1560);
                        int var119 = (super.field1144 * var118 + super.field1152 * var117 + super.field1148 * var116 >> 14) + super.field1134;
                        if (~var119 >= ~super.field1146.field1665) {
                            return;
                        }
                        arg0[var76] = 0;
                        if (!arg6) {
                            if (super.field1146.field1685) {
                                int var120 = -super.field1146.field1660 + var119;
                                if (~var120 < -1) {
                                    arg0[var76] = var120;
                                    if (arg0[var76] > 255) {
                                        arg0[var76] = 255;
                                    }
                                }
                            }
                        } else {
                            int var121 = -super.field1146.field1660 + var119;
                            if (~var121 < -256) {
                                var121 = 255;
                            }
                            if (~var121 < -1) {
                                arg0[var76] = var121;
                                int var122 = var66.field4423[var76] * var121 / 255;
                                if (~var122 < -1) {
                                    var117 -= var122;
                                }
                            }
                        }
                        int var123 = (super.field1145 * var118 + super.field1139 * var116 - -(super.field1137 * var117) >> 14) + super.field1147;
                        int var124 = (super.field1138 * var118 + super.field1153 * var117 + super.field1136 * var116 >> 14) + super.field1154;
                        arg7[var76] = arg4.field797 - -(super.field1146.field1671 * var123 / var119);
                        arg2[var76] = super.field1146.field1688 * var124 / var119 + arg4.field799;
                        arg1[var76] = var119;
                    }
                }
                if (var66.field4421 != null) {
                    int var77 = super.field1135[arg3][arg5];
                    int var78 = super.field1135[arg3 + 1][arg5];
                    int var79 = super.field1135[arg3][arg5 + 1];
                    int var80 = super.field1561 * arg3;
                    int var81 = super.field1561 + var80;
                    int var82 = super.field1561 * arg5;
                    int var83 = super.field1561 + var82;
                    int var84 = (super.field1139 * var80 + super.field1145 * var82 + super.field1137 * var77 >> 14) + super.field1147;
                    int var85 = (super.field1153 * var77 + super.field1138 * var82 + super.field1136 * var80 >> 14) + super.field1154;
                    int var86 = (super.field1144 * var82 + super.field1152 * var77 + super.field1148 * var80 >> 14) + super.field1134;
                    int var87 = (super.field1137 * var78 + super.field1145 * var82 + super.field1139 * var81 >> 14) + super.field1147;
                    int var88 = (super.field1153 * var78 + (super.field1136 * var81 - -(super.field1138 * var82)) >> 14) + super.field1154;
                    int var89 = (super.field1144 * var82 + super.field1152 * var78 + super.field1148 * var81 >> 14) + super.field1134;
                    int var90 = (super.field1145 * var83 + super.field1139 * var80 + super.field1137 * var79 >> 14) + super.field1147;
                    int var91 = (super.field1138 * var83 + super.field1153 * var79 + super.field1136 * var80 >> 14) + super.field1154;
                    int var92 = super.field1134 - -(super.field1144 * var83 + super.field1152 * var79 + super.field1148 * var80 >> 14);
                    for (int var93 = 0; var93 < var66.field4417; ++var93) {
                        int var94 = var93 * 3;
                        int var95 = var94 + 1;
                        int var96 = var95 + 1;
                        int var97 = arg7[var94];
                        int var98 = arg7[var95];
                        int var99 = arg7[var96];
                        int var100 = arg2[var94];
                        int var101 = arg2[var95];
                        int var102 = arg2[var96];
                        int var103 = arg0[var94] - -arg0[var95] + arg0[var96];
                        if ((var97 - var98) * (-var101 + var102) - (-var98 + var99) * (-var101 + var100) > 0) {
                            arg4.field801 = var97 < 0 || ~var98 > -1 || var99 < 0 || var97 > arg4.field810 || ~var98 < ~arg4.field810 || ~arg4.field810 > ~var99;
                            short var104 = var66.field4421[var93];
                            if (~var103 > -766) {
                                if (var104 != -1 && this.method629(super.field1146.field8990.method846((byte) -106, var104).field5486)) {
                                    arg4.field798 = 100;
                                }
                                if (~var103 < -1) {
                                    if (~var104 == 0) {
                                        if ((16777215 & var66.field4426[var94]) != 0) {
                                            arg4.method486(var100, var101, var102, var97, var98, var99, arg1[var94], arg1[var95], arg1[var96], class425.method2296(-10227, var66.field4426[var94], arg0[var94] << 24 | super.field1146.field1677), class425.method2296(-10227, var66.field4426[var95], super.field1146.field1677 | arg0[var95] << 24), class425.method2296(-10227, var66.field4426[var96], super.field1146.field1677 | arg0[var96] << 24));
                                        }
                                    } else {
                                        arg4.method498(var100, var101, var102, var97, var98, var99, arg1[var94], arg1[var95], arg1[var96], super.field1146.field1677, arg0[var94], arg0[var95], arg0[var96], var66.field4426[var94], var66.field4426[var95], var66.field4426[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                    }
                                } else if (~var104 != 0) {
                                    arg4.method504(var100, var101, var102, var97, var98, var99, arg1[var94], arg1[var95], arg1[var96], var66.field4426[var94], var66.field4426[var95], var66.field4426[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                } else if (~(16777215 & var66.field4426[var94]) != -1) {
                                    arg4.method486(var100, var101, var102, var97, var98, var99, arg1[var94], arg1[var95], arg1[var96], var66.field4426[var94], var66.field4426[var95], var66.field4426[var96]);
                                }
                                arg4.field798 = 0;
                            } else {
                                arg4.method505(var100, var101, var102, var97, var98, var99, arg1[var94], arg1[var95], arg1[var96], super.field1146.field1677);
                            }
                        }
                    }
                } else {
                    for (int var105 = 0; var66.field4417 > var105; ++var105) {
                        int var106 = var105 * 3;
                        int var107 = var106 + 1;
                        int var108 = var107 + 1;
                        int var109 = arg7[var106];
                        int var110 = arg7[var107];
                        int var111 = arg7[var108];
                        int var112 = arg2[var106];
                        int var113 = arg2[var107];
                        int var114 = arg2[var108];
                        int var115 = arg0[var106] - -arg0[var108] + arg0[var107];
                        if (~((-var110 + var109) * (-var113 + var114) + -((var111 - var110) * (-var113 + var112))) < -1) {
                            arg4.field801 = ~var109 > -1 || ~var110 > -1 || ~var111 > -1 || var109 > arg4.field810 || arg4.field810 < var110 || arg4.field810 < var111;
                            if (~var115 > -766) {
                                if (~var115 < -1) {
                                    if (~(var66.field4426[var106] & 16777215) != -1) {
                                        arg4.method486(var112, var113, var114, var109, var110, var111, arg1[var106], arg1[var107], arg1[var108], class250.method1434(arg0[var106], var66.field4426[var106], 12686, super.field1146.field1677), class250.method1434(arg0[var107], var66.field4426[var107], 12686, super.field1146.field1677), class250.method1434(arg0[var108], var66.field4426[var108], arg8 ^ 26857, super.field1146.field1677));
                                    }
                                } else if ((var66.field4426[var106] & 16777215) != 0) {
                                    arg4.method486(var112, var113, var114, var109, var110, var111, arg1[var106], arg1[var107], arg1[var108], var66.field4426[var106], var66.field4426[var107], var66.field4426[var108]);
                                }
                            } else {
                                arg4.method505(var112, var113, var114, var109, var110, var111, arg1[var106], arg1[var107], arg1[var108], super.field1146.field1677);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1494)
    public final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5515;
        class217 var9 = (class217) super.field1146.method814(Thread.currentThread());
        class78 var10 = var9.field2620;
        var10.field801 = false;
        var10.field798 = 0;
        super.field1146.method358();
        if (super.field1149 == null) {
            if (super.field1140 != null) {
                this.method2249(var10, arg1, var9.field3618, arg4, arg5, true, arg3, arg2, arg7, arg0, var9.field3631, arg6);
                return;
            }
        } else {
            this.method2251(var9.field3618, arg6, false, var10, arg2, arg0, arg1, arg5, arg3, var9.field3631, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Luq;IIII[[I[[II)V", line = 1515)
    public class416(class148 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 1518)
    public static final void method2253(String arg0, int arg1) {
        ++field5521;
        if (arg1 == 65535) {
            class321.method1809("", 0, (byte) 111, "", "", 0, arg0);
        }
    }
}
