import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class358 extends class143 {

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    private int field4613 = -1;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "Lji;")
    private class435 field4614;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    private int field4601;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "[[I")
    public int[][] field4605;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "[[B")
    private byte[][] field4616;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "[[B")
    private byte[][] field4600;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    private int field4604;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    private int field4607;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    private int field4609;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    private int field4611;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    private int field4612;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    private int field4615;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    private int field4617;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    private int field4619;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    private int field4620;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "[[Lvf;")
    private class104[][] field4603;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "[[Lrq;")
    private class234[][] field4610;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "[[Les;")
    private class260[][] field4608;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "[[Lut;")
    private class81[][] field4599;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILnf;[I[I[I)V")
    private final void method2049(int arg0, int arg1, class408 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class260 var7 = this.field4608[arg0][arg1];
        if (var7 != null) {
            if ((var7.field3280 & 2) == 0) {
                int var8 = super.field1836 * arg0;
                int var9 = super.field1836 + var8;
                int var10 = super.field1836 * arg1;
                int var11 = super.field1836 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field3280 & 1) != 0) {
                    int var12 = this.field4605[arg0][arg1];
                    int var16;
                    if (this.field4613 == -1) {
                        int var13 = this.field4617 * var12;
                        var14 = (this.field4607 * var10 + this.field4619 * var8 + var13 >> 15) + this.field4615;
                        if (var14 <= this.field4614.field6221) {
                            return;
                        }
                        var15 = (this.field4607 * var10 + this.field4619 * var9 + var13 >> 15) + this.field4615;
                        if (var15 <= this.field4614.field6221) {
                            return;
                        }
                        var16 = (this.field4607 * var11 + this.field4619 * var9 + var13 >> 15) + this.field4615;
                        if (var16 <= this.field4614.field6221) {
                            return;
                        }
                        var17 = (this.field4607 * var11 + this.field4619 * var8 + var13 >> 15) + this.field4615;
                        if (var17 <= this.field4614.field6221) {
                            return;
                        }
                    } else {
                        var17 = this.field4613;
                        var16 = this.field4613;
                        var15 = this.field4613;
                        var14 = this.field4613;
                    }
                    int var18 = this.field4609 * var12;
                    int var19 = this.field4612 * var12;
                    var20 = (this.field4604 * var10 + this.field4611 * var8 + var18 >> 15) + this.field4602;
                    var21 = this.field4614.field6192 * var20 / var14 + arg2.field5834;
                    var22 = (this.field4618 * var10 + this.field4606 * var8 + var19 >> 15) + this.field4620;
                    var23 = this.field4614.field6196 * var22 / var14 + arg2.field5832;
                    var24 = (this.field4604 * var10 + this.field4611 * var9 + var18 >> 15) + this.field4602;
                    var25 = this.field4614.field6192 * var24 / var15 + arg2.field5834;
                    var26 = (this.field4618 * var10 + this.field4606 * var9 + var19 >> 15) + this.field4620;
                    var27 = this.field4614.field6196 * var26 / var15 + arg2.field5832;
                    int var28 = (this.field4604 * var11 + this.field4611 * var9 + var18 >> 15) + this.field4602;
                    var29 = this.field4614.field6192 * var28 / var16 + arg2.field5834;
                    int var30 = (this.field4618 * var11 + this.field4606 * var9 + var19 >> 15) + this.field4620;
                    var31 = this.field4614.field6196 * var30 / var16 + arg2.field5832;
                    var32 = (this.field4604 * var11 + this.field4611 * var8 + var18 >> 15) + this.field4602;
                    var33 = this.field4614.field6192 * var32 / var17 + arg2.field5834;
                    var34 = (this.field4618 * var11 + this.field4606 * var8 + var19 >> 15) + this.field4620;
                    var35 = this.field4614.field6196 * var34 / var17 + arg2.field5832;
                } else {
                    int var36 = this.field4605[arg0][arg1];
                    int var37 = this.field4605[arg0 + 1][arg1];
                    int var38 = this.field4605[arg0 + 1][arg1 + 1];
                    int var39 = this.field4605[arg0][arg1 + 1];
                    int var40;
                    if (this.field4613 == -1) {
                        var14 = (this.field4607 * var10 + this.field4619 * var8 + this.field4617 * var36 >> 15) + this.field4615;
                        if (var14 <= this.field4614.field6221) {
                            return;
                        }
                        var15 = (this.field4607 * var10 + this.field4619 * var9 + this.field4617 * var37 >> 15) + this.field4615;
                        if (var15 <= this.field4614.field6221) {
                            return;
                        }
                        var40 = (this.field4607 * var11 + this.field4619 * var9 + this.field4617 * var38 >> 15) + this.field4615;
                        if (var40 <= this.field4614.field6221) {
                            return;
                        }
                        var17 = (this.field4607 * var11 + this.field4619 * var8 + this.field4617 * var39 >> 15) + this.field4615;
                        if (var17 <= this.field4614.field6221) {
                            return;
                        }
                    } else {
                        var17 = this.field4613;
                        var40 = this.field4613;
                        var15 = this.field4613;
                        var14 = this.field4613;
                    }
                    var20 = (this.field4604 * var10 + this.field4611 * var8 + this.field4609 * var36 >> 15) + this.field4602;
                    var21 = this.field4614.field6192 * var20 / var14 + arg2.field5834;
                    var22 = (this.field4618 * var10 + this.field4612 * var36 + this.field4606 * var8 >> 15) + this.field4620;
                    var23 = this.field4614.field6196 * var22 / var14 + arg2.field5832;
                    var24 = (this.field4604 * var10 + this.field4611 * var9 + this.field4609 * var37 >> 15) + this.field4602;
                    var25 = this.field4614.field6192 * var24 / var15 + arg2.field5834;
                    var26 = (this.field4618 * var10 + this.field4612 * var37 + this.field4606 * var9 >> 15) + this.field4620;
                    var27 = this.field4614.field6196 * var26 / var15 + arg2.field5832;
                    int var41 = (this.field4604 * var11 + this.field4611 * var9 + this.field4609 * var38 >> 15) + this.field4602;
                    var29 = this.field4614.field6192 * var41 / var40 + arg2.field5834;
                    int var42 = (this.field4618 * var11 + this.field4612 * var38 + this.field4606 * var9 >> 15) + this.field4620;
                    var31 = this.field4614.field6196 * var42 / var40 + arg2.field5832;
                    var32 = (this.field4604 * var11 + this.field4611 * var8 + this.field4609 * var39 >> 15) + this.field4602;
                    var33 = this.field4614.field6192 * var32 / var17 + arg2.field5834;
                    var34 = (this.field4618 * var11 + this.field4612 * var39 + this.field4606 * var8 >> 15) + this.field4620;
                    var35 = this.field4614.field6196 * var34 / var17 + arg2.field5832;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field5830 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field5826 || var33 > arg2.field5826 || var25 > arg2.field5826;
                    if (var7.field3281 >= 0) {
                        if (this.method2054(this.field4614.field502.method1642(var7.field3281, -15).field1794)) {
                            arg2.field5836 = 100;
                        }
                        arg2.method2420(var31, var35, var27, var29, var33, var25, var7.field3282 & 65535, var7.field3277 & 65535, var7.field3279 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3281);
                        arg2.field5836 = 0;
                    } else {
                        arg2.method2419(var31, var35, var27, var29, var33, var25, var7.field3282 & 65535, var7.field3277 & 65535, var7.field3279 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field5830 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field5826 || var25 > arg2.field5826 || var33 > arg2.field5826;
                    if (var7.field3281 >= 0) {
                        if (this.method2054(this.field4614.field502.method1642(var7.field3281, -30).field1794)) {
                            arg2.field5836 = 100;
                        }
                        arg2.method2420(var23, var27, var35, var21, var25, var33, var7.field3278 & 65535, var7.field3279 & 65535, var7.field3277 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3281);
                        arg2.field5836 = 0;
                        return;
                    }
                    arg2.method2419(var23, var27, var35, var21, var25, var33, var7.field3278 & 65535, var7.field3279 & 65535, var7.field3277 & 65535);
                }
            }
        } else {
            class104 var43 = this.field4603[arg0][arg1];
            if (var43 != null) {
                if (this.field4613 == -1) {
                    for (int var44 = 0; var44 < var43.field1330; ++var44) {
                        int var45 = (arg0 << super.field1840) + var43.field1325[var44];
                        short var46 = var43.field1329[var44];
                        int var47 = (arg1 << super.field1840) + var43.field1326[var44];
                        int var48 = (this.field4607 * var47 + this.field4619 * var45 + this.field4617 * var46 >> 15) + this.field4615;
                        if (var48 <= this.field4614.field6221) {
                            return;
                        }
                        int var49 = (this.field4604 * var47 + this.field4611 * var45 + this.field4609 * var46 >> 15) + this.field4602;
                        int var50 = (this.field4618 * var47 + this.field4612 * var46 + this.field4606 * var45 >> 15) + this.field4620;
                        arg3[var44] = this.field4614.field6192 * var49 / var48 + arg2.field5834;
                        arg4[var44] = this.field4614.field6196 * var50 / var48 + arg2.field5832;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field1330; ++var51) {
                        int var91 = (arg0 << super.field1840) + var43.field1325[var51];
                        short var92 = var43.field1329[var51];
                        int var93 = (arg1 << super.field1840) + var43.field1326[var51];
                        int var94 = (this.field4604 * var93 + this.field4611 * var91 + this.field4609 * var92 >> 15) + this.field4602;
                        int var95 = (this.field4618 * var93 + this.field4612 * var92 + this.field4606 * var91 >> 15) + this.field4620;
                        arg3[var51] = this.field4614.field6192 * var94 / this.field4613 + arg2.field5834;
                        arg4[var51] = this.field4614.field6196 * var95 / this.field4613 + arg2.field5832;
                    }
                }
                if (var43.field1320 != null) {
                    int var52 = this.field4605[arg0][arg1];
                    int var53 = this.field4605[arg0 + 1][arg1];
                    int var54 = this.field4605[arg0][arg1 + 1];
                    int var55 = super.field1836 * arg0;
                    int var56 = super.field1836 + var55;
                    int var57 = super.field1836 * arg1;
                    int var58 = super.field1836 + var57;
                    int var59 = (this.field4604 * var57 + this.field4611 * var55 + this.field4609 * var52 >> 15) + this.field4602;
                    int var60 = (this.field4618 * var57 + this.field4612 * var52 + this.field4606 * var55 >> 15) + this.field4620;
                    int var61 = (this.field4607 * var57 + this.field4619 * var55 + this.field4617 * var52 >> 15) + this.field4615;
                    int var62 = (this.field4604 * var57 + this.field4611 * var56 + this.field4609 * var53 >> 15) + this.field4602;
                    int var63 = (this.field4618 * var57 + this.field4612 * var53 + this.field4606 * var56 >> 15) + this.field4620;
                    int var64 = (this.field4607 * var57 + this.field4619 * var56 + this.field4617 * var53 >> 15) + this.field4615;
                    int var65 = (this.field4604 * var58 + this.field4611 * var55 + this.field4609 * var54 >> 15) + this.field4602;
                    int var66 = (this.field4618 * var58 + this.field4612 * var54 + this.field4606 * var55 >> 15) + this.field4620;
                    int var67 = (this.field4607 * var58 + this.field4619 * var55 + this.field4617 * var54 >> 15) + this.field4615;
                    for (int var68 = 0; var68 < var43.field1324; ++var68) {
                        short var69 = var43.field1327[var68];
                        short var70 = var43.field1321[var68];
                        short var71 = var43.field1328[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field5830 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field5826 || var73 > arg2.field5826 || var74 > arg2.field5826;
                            short var78 = var43.field1320[var68];
                            if (var78 != -1) {
                                if (this.method2054(this.field4614.field502.method1642(var78, -89).field1794)) {
                                    arg2.field5836 = 100;
                                }
                                arg2.method2420(var75, var76, var77, var72, var73, var74, var43.field1323[var69], var43.field1323[var70], var43.field1323[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field5836 = 0;
                            } else {
                                int var79 = var43.field1319[var68];
                                if (var79 != -1) {
                                    arg2.method2419(var75, var76, var77, var72, var73, var74, class27.method214((byte) -110, var79, var43.field1323[var69]), class27.method214((byte) -110, var79, var43.field1323[var70]), class27.method214((byte) -110, var79, var43.field1323[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field1324; ++var80) {
                    short var81 = var43.field1327[var80];
                    short var82 = var43.field1321[var80];
                    short var83 = var43.field1328[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field1319[var80];
                        if (var90 != -1) {
                            arg2.field5830 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field5826 || var85 > arg2.field5826 || var86 > arg2.field5826;
                            arg2.method2419(var87, var88, var89, var84, var85, var86, class27.method214((byte) -110, var90, var43.field1323[var81]), class27.method214((byte) -110, var90, var43.field1323[var82]), class27.method214((byte) -110, var90, var43.field1323[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZLnf;[I[I[I)V")
    private final void method2050(int arg0, int arg1, boolean arg2, class408 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class81 var8 = this.field4599[arg0][arg1];
        if (var8 != null) {
            if ((var8.field1038 & 2) == 0) {
                int var9 = super.field1836 * arg0;
                int var10 = super.field1836 + var9;
                int var11 = super.field1836 * arg1;
                int var12 = super.field1836 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
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
                if ((var8.field1038 & 1) != 0 && !arg2) {
                    int var17 = this.field4605[arg0][arg1];
                    if (this.field4613 == -1) {
                        int var18 = this.field4617 * var17;
                        var19 = (this.field4607 * var11 + this.field4619 * var9 + var18 >> 15) + this.field4615;
                        if (var19 <= this.field4614.field6221) {
                            return;
                        }
                        var20 = (this.field4607 * var11 + this.field4619 * var10 + var18 >> 15) + this.field4615;
                        if (var20 <= this.field4614.field6221) {
                            return;
                        }
                        var21 = (this.field4607 * var12 + this.field4619 * var10 + var18 >> 15) + this.field4615;
                        if (var21 <= this.field4614.field6221) {
                            return;
                        }
                        var22 = (this.field4607 * var12 + this.field4619 * var9 + var18 >> 15) + this.field4615;
                        if (var22 <= this.field4614.field6221) {
                            return;
                        }
                    } else {
                        var22 = this.field4613;
                        var21 = this.field4613;
                        var20 = this.field4613;
                        var19 = this.field4613;
                    }
                    if (this.field4614.field6183) {
                        int var23 = var19 - this.field4614.field6186;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field4614.field6186;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field4614.field6186;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field4614.field6186;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field4609 * var17;
                    int var28 = this.field4612 * var17;
                    var29 = (this.field4604 * var11 + this.field4611 * var9 + var27 >> 15) + this.field4602;
                    var30 = this.field4614.field6192 * var29 / var19 + arg3.field5834;
                    var31 = (this.field4618 * var11 + this.field4606 * var9 + var28 >> 15) + this.field4620;
                    var32 = this.field4614.field6196 * var31 / var19 + arg3.field5832;
                    var33 = (this.field4604 * var11 + this.field4611 * var10 + var27 >> 15) + this.field4602;
                    var34 = this.field4614.field6192 * var33 / var20 + arg3.field5834;
                    var35 = (this.field4618 * var11 + this.field4606 * var10 + var28 >> 15) + this.field4620;
                    var36 = this.field4614.field6196 * var35 / var20 + arg3.field5832;
                    var37 = (this.field4604 * var12 + this.field4611 * var10 + var27 >> 15) + this.field4602;
                    var38 = this.field4614.field6192 * var37 / var21 + arg3.field5834;
                    var39 = (this.field4618 * var12 + this.field4606 * var10 + var28 >> 15) + this.field4620;
                    var40 = this.field4614.field6196 * var39 / var21 + arg3.field5832;
                    var41 = (this.field4604 * var12 + this.field4611 * var9 + var27 >> 15) + this.field4602;
                    var42 = this.field4614.field6192 * var41 / var22 + arg3.field5834;
                    var43 = (this.field4618 * var12 + this.field4606 * var9 + var28 >> 15) + this.field4620;
                    var44 = this.field4614.field6196 * var43 / var22 + arg3.field5832;
                } else {
                    int var45 = this.field4605[arg0][arg1];
                    int var46 = this.field4605[arg0 + 1][arg1];
                    int var47 = this.field4605[arg0 + 1][arg1 + 1];
                    int var48 = this.field4605[arg0][arg1 + 1];
                    if (this.field4613 == -1) {
                        var19 = (this.field4607 * var11 + this.field4619 * var9 + this.field4617 * var45 >> 15) + this.field4615;
                        if (var19 <= this.field4614.field6221) {
                            return;
                        }
                        var20 = (this.field4607 * var11 + this.field4619 * var10 + this.field4617 * var46 >> 15) + this.field4615;
                        if (var20 <= this.field4614.field6221) {
                            return;
                        }
                        var21 = (this.field4607 * var12 + this.field4619 * var10 + this.field4617 * var47 >> 15) + this.field4615;
                        if (var21 <= this.field4614.field6221) {
                            return;
                        }
                        var22 = (this.field4607 * var12 + this.field4619 * var9 + this.field4617 * var48 >> 15) + this.field4615;
                        if (var22 <= this.field4614.field6221) {
                            return;
                        }
                    } else {
                        var22 = this.field4613;
                        var21 = this.field4613;
                        var20 = this.field4613;
                        var19 = this.field4613;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field4614.field6186;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field1034 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field4614.field6186;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field1031 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field4614.field6186;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field1040 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field4614.field6186;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field1033 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field4614.field6183) {
                        int var57 = var19 - this.field4614.field6186;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field4614.field6186;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field4614.field6186;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field4614.field6186;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field4604 * var11 + this.field4611 * var9 + this.field4609 * var45 >> 15) + this.field4602;
                    var30 = this.field4614.field6192 * var29 / var19 + arg3.field5834;
                    var31 = (this.field4618 * var11 + this.field4612 * var45 + this.field4606 * var9 >> 15) + this.field4620;
                    var32 = this.field4614.field6196 * var31 / var19 + arg3.field5832;
                    var33 = (this.field4604 * var11 + this.field4611 * var10 + this.field4609 * var46 >> 15) + this.field4602;
                    var34 = this.field4614.field6192 * var33 / var20 + arg3.field5834;
                    var35 = (this.field4618 * var11 + this.field4612 * var46 + this.field4606 * var10 >> 15) + this.field4620;
                    var36 = this.field4614.field6196 * var35 / var20 + arg3.field5832;
                    var37 = (this.field4604 * var12 + this.field4611 * var10 + this.field4609 * var47 >> 15) + this.field4602;
                    var38 = this.field4614.field6192 * var37 / var21 + arg3.field5834;
                    var39 = (this.field4618 * var12 + this.field4612 * var47 + this.field4606 * var10 >> 15) + this.field4620;
                    var40 = this.field4614.field6196 * var39 / var21 + arg3.field5832;
                    var41 = (this.field4604 * var12 + this.field4611 * var9 + this.field4609 * var48 >> 15) + this.field4602;
                    var42 = this.field4614.field6192 * var41 / var22 + arg3.field5834;
                    var43 = (this.field4618 * var12 + this.field4612 * var48 + this.field4606 * var9 >> 15) + this.field4620;
                    var44 = this.field4614.field6196 * var43 / var22 + arg3.field5832;
                }
                boolean var61 = var8.field1032 != -1 && this.method2054(this.field4614.field502.method1642(var8.field1032, -2).field1794);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field5830 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field5826 || var42 > arg3.field5826 || var34 > arg3.field5826;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field5836 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field1032 >= 0) {
                                arg3.method2414(var40, var44, var36, var38, var42, var34, this.field4614.field6203, var15, var16, var14, var8.field1036, var8.field1041, var8.field1037, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1032);
                            } else {
                                arg3.method2417(var40, var44, var36, var38, var42, var34, class227.method1382(var8.field1036, var15 << 24 | this.field4614.field6203, -2), class227.method1382(var8.field1041, var16 << 24 | this.field4614.field6203, -2), class227.method1382(var8.field1037, var14 << 24 | this.field4614.field6203, -2));
                            }
                        } else if (var8.field1032 >= 0) {
                            arg3.method2420(var40, var44, var36, var38, var42, var34, var8.field1036, var8.field1041, var8.field1037, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1032);
                        } else {
                            arg3.method2417(var40, var44, var36, var38, var42, var34, var8.field1036, var8.field1041, var8.field1037);
                        }
                        arg3.field5836 = 0;
                    } else {
                        arg3.method2410(var40, var44, var36, var38, var42, var34, this.field4614.field6203);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field5830 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field5826 || var34 > arg3.field5826 || var42 > arg3.field5826;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field5836 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field1032 >= 0) {
                                arg3.method2414(var32, var36, var44, var30, var34, var42, this.field4614.field6203, var13, var14, var16, var8.field1039, var8.field1037, var8.field1041, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1032);
                            } else {
                                arg3.method2417(var32, var36, var44, var30, var34, var42, class227.method1382(var8.field1039, var13 << 24 | this.field4614.field6203, -2), class227.method1382(var8.field1037, var14 << 24 | this.field4614.field6203, -2), class227.method1382(var8.field1041, var16 << 24 | this.field4614.field6203, -2));
                            }
                        } else if (var8.field1032 >= 0) {
                            arg3.method2420(var32, var36, var44, var30, var34, var42, var8.field1039, var8.field1037, var8.field1041, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1032);
                        } else {
                            arg3.method2417(var32, var36, var44, var30, var34, var42, var8.field1039, var8.field1037, var8.field1041);
                        }
                        arg3.field5836 = 0;
                        return;
                    }
                    arg3.method2410(var32, var36, var44, var30, var34, var42, this.field4614.field6203);
                }
            }
        } else {
            class234 var64 = this.field4610[arg0][arg1];
            if (var64 != null) {
                if (this.field4613 == -1) {
                    for (int var65 = 0; var65 < var64.field2994; ++var65) {
                        int var66 = (arg0 << super.field1840) + var64.field2993[var65];
                        int var67 = var64.field2988[var65];
                        int var68 = (arg1 << super.field1840) + var64.field2989[var65];
                        int var69 = (this.field4607 * var68 + this.field4619 * var66 + this.field4617 * var67 >> 15) + this.field4615;
                        if (var69 <= this.field4614.field6221) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field4614.field6186;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field2990[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field4614.field6183) {
                            int var72 = var69 - this.field4614.field6186;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field4604 * var68 + this.field4611 * var66 + this.field4609 * var67 >> 15) + this.field4602;
                        int var74 = (this.field4618 * var68 + this.field4612 * var67 + this.field4606 * var66 >> 15) + this.field4620;
                        arg4[var65] = this.field4614.field6192 * var73 / var69 + arg3.field5834;
                        arg5[var65] = this.field4614.field6196 * var74 / var69 + arg3.field5832;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field2994; ++var75) {
                        int var115 = (arg0 << super.field1840) + var64.field2993[var75];
                        int var116 = var64.field2988[var75];
                        int var117 = (arg1 << super.field1840) + var64.field2989[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field4613 - this.field4614.field6186;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field2990[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field4614.field6183) {
                            int var120 = this.field4613 - this.field4614.field6186;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field4604 * var117 + this.field4611 * var115 + this.field4609 * var116 >> 15) + this.field4602;
                        int var122 = (this.field4618 * var117 + this.field4612 * var116 + this.field4606 * var115 >> 15) + this.field4620;
                        arg4[var75] = this.field4614.field6192 * var121 / this.field4613 + arg3.field5834;
                        arg5[var75] = this.field4614.field6196 * var122 / this.field4613 + arg3.field5832;
                    }
                }
                if (var64.field2987 != null) {
                    int var76 = this.field4605[arg0][arg1];
                    int var77 = this.field4605[arg0 + 1][arg1];
                    int var78 = this.field4605[arg0][arg1 + 1];
                    int var79 = super.field1836 * arg0;
                    int var80 = super.field1836 + var79;
                    int var81 = super.field1836 * arg1;
                    int var82 = super.field1836 + var81;
                    int var83 = (this.field4604 * var81 + this.field4611 * var79 + this.field4609 * var76 >> 15) + this.field4602;
                    int var84 = (this.field4618 * var81 + this.field4612 * var76 + this.field4606 * var79 >> 15) + this.field4620;
                    int var85 = (this.field4607 * var81 + this.field4619 * var79 + this.field4617 * var76 >> 15) + this.field4615;
                    int var86 = (this.field4604 * var81 + this.field4611 * var80 + this.field4609 * var77 >> 15) + this.field4602;
                    int var87 = (this.field4618 * var81 + this.field4612 * var77 + this.field4606 * var80 >> 15) + this.field4620;
                    int var88 = (this.field4607 * var81 + this.field4619 * var80 + this.field4617 * var77 >> 15) + this.field4615;
                    int var89 = (this.field4604 * var82 + this.field4611 * var79 + this.field4609 * var78 >> 15) + this.field4602;
                    int var90 = (this.field4618 * var82 + this.field4612 * var78 + this.field4606 * var79 >> 15) + this.field4620;
                    int var91 = (this.field4607 * var82 + this.field4619 * var79 + this.field4617 * var78 >> 15) + this.field4615;
                    for (int var92 = 0; var92 < var64.field2986; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field5830 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field5826 || var97 > arg3.field5826 || var98 > arg3.field5826;
                            short var103 = var64.field2987[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method2054(this.field4614.field502.method1642(var103, -13).field1794)) {
                                    arg3.field5836 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method2414(var99, var100, var101, var96, var97, var98, this.field4614.field6203, arg6[var93], arg6[var94], arg6[var95], var64.field2992[var93], var64.field2992[var94], var64.field2992[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field2992[var93] & 16777215) != 0) {
                                        arg3.method2417(var99, var100, var101, var96, var97, var98, class227.method1382(var64.field2992[var93], arg6[var93] << 24 | this.field4614.field6203, -2), class227.method1382(var64.field2992[var94], arg6[var94] << 24 | this.field4614.field6203, -2), class227.method1382(var64.field2992[var95], arg6[var95] << 24 | this.field4614.field6203, -2));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method2420(var99, var100, var101, var96, var97, var98, var64.field2992[var93], var64.field2992[var94], var64.field2992[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field2992[var93] & 16777215) != 0) {
                                    arg3.method2417(var99, var100, var101, var96, var97, var98, var64.field2992[var93], var64.field2992[var94], var64.field2992[var95]);
                                }
                                arg3.field5836 = 0;
                            } else {
                                arg3.method2410(var99, var100, var101, var96, var97, var98, this.field4614.field6203);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field2986; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field5830 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field5826 || var109 > arg3.field5826 || var110 > arg3.field5826;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field2992[var105] & 16777215) != 0) {
                                    arg3.method2417(var111, var112, var113, var108, var109, var110, class10.method72(this.field4614.field6203, arg6[var105], var64.field2992[var105], -128), class10.method72(this.field4614.field6203, arg6[var106], var64.field2992[var106], -70), class10.method72(this.field4614.field6203, arg6[var107], var64.field2992[var107], -106));
                                }
                            } else if ((var64.field2992[var105] & 16777215) != 0) {
                                arg3.method2417(var111, var112, var113, var108, var109, var110, var64.field2992[var105], var64.field2992[var106], var64.field2992[var107]);
                            }
                        } else {
                            arg3.method2410(var111, var112, var113, var108, var109, var110, this.field4614.field6203);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lji;IIII[[I[[II)V")
    public class358(class435 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field4614 = arg0;
        this.field4601 = arg2;
        this.field4605 = arg5;
        this.field4616 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4614.field6214 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4614.field6201 * var18 + this.field4614.field6184 * var17 + this.field4614.field6182 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4616[var11][var10] = (byte) var20;
            }
        }
        this.field4600 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class362 var9 = this.field4614.method2549(Thread.currentThread());
        class408 var10 = var9.field4665;
        var10.field5836 = 0;
        var10.field5830 = false;
        if (this.field4599 != null) {
            this.method2052(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4693, var9.field4692);
        } else {
            if (this.field4608 != null) {
                this.method2053(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4693, var9.field4692);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V")
    public final void method393(int arg0, int arg1) {
        class362 var3 = this.field4614.method2549(Thread.currentThread());
        var3.field4665.field5836 = 0;
        if (this.field4599 != null) {
            this.method2050(arg0, arg1, this.field4614.field6185, var3.field4665, var3.field4693, var3.field4692, var3.field4713);
        } else {
            if (this.field4608 != null) {
                this.method2049(arg0, arg1, var3.field4665, var3.field4693, var3.field4692, var3.field4713);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)I")
    private static final int method2051(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Lba;IIIIZ)V")
    public final void method390(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lba;IIIIZ)Z")
    public final boolean method391(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "(II)I")
    public final int method399(int arg0, int arg1) {
        return this.field4605[arg0][arg1];
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII[[ZLnf;[I[I)V")
    private final void method2052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class408 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5831 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4599[var16][var17] != null) {
                        class81 var18 = this.field4599[var16][var17];
                        if (var18.field1032 != -1 && (var18.field1038 & 2) == 0 && var18.field1035 == 0) {
                            int var19 = this.field4614.method2548(var18.field1032);
                            arg8.method2419(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class27.method214((byte) -110, var19, var18.field1036), class27.method214((byte) -110, var19, var18.field1041), class27.method214((byte) -110, var19, var18.field1037));
                            arg8.method2419(var15, var15, var15 - var13, var14, var13 + var14, var14, class27.method214((byte) -110, var19, var18.field1039), class27.method214((byte) -110, var19, var18.field1037), class27.method214((byte) -110, var19, var18.field1041));
                        } else if (var18.field1035 == 0) {
                            arg8.method2417(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1036, var18.field1041, var18.field1037);
                            arg8.method2417(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1039, var18.field1037, var18.field1041);
                        } else {
                            int var20 = var18.field1035;
                            arg8.method2417(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class227.method1382(var20, var18.field1036 & -16777216, -2), class227.method1382(var20, var18.field1041 & -16777216, -2), class227.method1382(var20, var18.field1037 & -16777216, -2));
                            arg8.method2417(var15, var15, var15 - var13, var14, var13 + var14, var14, class227.method1382(var20, var18.field1039 & -16777216, -2), class227.method1382(var20, var18.field1037 & -16777216, -2), class227.method1382(var20, var18.field1041 & -16777216, -2));
                        }
                    } else if (this.field4610[var16][var17] != null) {
                        class234 var21 = this.field4610[var16][var17];
                        for (int var22 = 0; var22 < var21.field2994; ++var22) {
                            arg9[var22] = var21.field2993[var22] * var13 / super.field1836 + var14;
                            arg10[var22] = var15 - var21.field2989[var22] * var13 / super.field1836;
                        }
                        for (int var23 = 0; var23 < var21.field2986; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2991 == null || var21.field2991[var23] == 0 || var21.field2987 != null && (var21.field2987 == null || var21.field2987[var23] != -1)) {
                                if (var21.field2987 != null && var21.field2987[var23] != -1) {
                                    int var34 = this.field4614.method2548(var21.field2987[var23]);
                                    arg8.method2419(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2417(var30, var31, var32, var27, var28, var29, var21.field2992[var24], var21.field2992[var25], var21.field2992[var26]);
                                }
                            } else {
                                int var33 = var21.field2991[var23];
                                arg8.method2417(var30, var31, var32, var27, var28, var29, class227.method1382(var33, -16777216 - (var21.field2992[var24] & -16777216), -2), class227.method1382(var33, -16777216 - (var21.field2992[var25] & -16777216), -2), class227.method1382(var33, -16777216 - (var21.field2992[var26] & -16777216), -2));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5831 = true;
    }

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "(IILba;)Lba;")
    public final class264 method398(int arg0, int arg1, class264 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(IIIIIII[[ZLnf;[I[I)V")
    private final void method2053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class408 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5831 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4608[var16][var17] != null) {
                        class260 var18 = this.field4608[var16][var17];
                        if (var18.field3281 != -1 && (var18.field3280 & 2) == 0 && var18.field3283 == -1) {
                            int var19 = this.field4614.method2548(var18.field3281);
                            arg8.method2419(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class27.method214((byte) -110, var19, var18.field3282 & 65535), class27.method214((byte) -110, var19, var18.field3277 & 65535), class27.method214((byte) -110, var19, var18.field3279 & 65535));
                            arg8.method2419(var15, var15, var15 - var13, var14, var13 + var14, var14, class27.method214((byte) -110, var19, var18.field3278 & 65535), class27.method214((byte) -110, var19, var18.field3279 & 65535), class27.method214((byte) -110, var19, var18.field3277 & 65535));
                        } else if (var18.field3283 == -1) {
                            arg8.method2419(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field3282 & 65535, var18.field3277 & 65535, var18.field3279 & 65535);
                            arg8.method2419(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field3278 & 65535, var18.field3279 & 65535, var18.field3277 & 65535);
                        } else {
                            int var20 = var18.field3283;
                            arg8.method2419(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2419(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field4603[var16][var17] != null) {
                        class104 var21 = this.field4603[var16][var17];
                        for (int var22 = 0; var22 < var21.field1330; ++var22) {
                            arg9[var22] = var21.field1325[var22] * var13 / super.field1836 + var14;
                            arg10[var22] = var15 - var21.field1326[var22] * var13 / super.field1836;
                        }
                        for (int var23 = 0; var23 < var21.field1324; ++var23) {
                            short var24 = var21.field1327[var23];
                            short var25 = var21.field1321[var23];
                            short var26 = var21.field1328[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1318 != null && var21.field1318[var23] != -1) {
                                int var33 = var21.field1318[var23];
                                arg8.method2419(var30, var31, var32, var27, var28, var29, class27.method214((byte) -110, var33, var21.field1323[var24]), class27.method214((byte) -110, var33, var21.field1323[var25]), class27.method214((byte) -110, var33, var21.field1323[var26]));
                            } else if (var21.field1320 != null && var21.field1320[var23] != -1) {
                                int var34 = this.field4614.method2548(var21.field1320[var23]);
                                arg8.method2419(var30, var31, var32, var27, var28, var29, class27.method214((byte) -110, var34, var21.field1323[var24]), class27.method214((byte) -110, var34, var21.field1323[var25]), class27.method214((byte) -110, var34, var21.field1323[var26]));
                            } else {
                                int var35 = var21.field1319[var23];
                                arg8.method2419(var30, var31, var32, var27, var28, var29, class27.method214((byte) -110, var35, var21.field1323[var24]), class27.method214((byte) -110, var35, var21.field1323[var25]), class27.method214((byte) -110, var35, var21.field1323[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5831 = true;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III[[ZZ)V")
    public final void method386(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class77 var6 = this.field4614.field6191;
        this.field4613 = -1;
        this.field4611 = var6.field1001;
        this.field4609 = var6.field1002;
        this.field4604 = var6.field994;
        this.field4602 = var6.field1003;
        this.field4606 = var6.field996;
        this.field4612 = var6.field998;
        this.field4618 = var6.field1004;
        this.field4620 = var6.field1000;
        this.field4619 = var6.field997;
        this.field4617 = var6.field1005;
        this.field4607 = var6.field999;
        this.field4615 = var6.field995;
    }

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "(Lba;IIIIZ)V")
    public final void method387(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Z")
    private final boolean method2054(int arg0) {
        if ((this.field4601 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method395(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field4599 == null) {
            this.field4599 = new class81[super.field1842][super.field1844];
            this.field4610 = new class234[super.field1842][super.field1844];
        } else if (this.field4608 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class527.field7777[class261.method1564(arg6[var15], 120) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class527.field7777[class261.method1564(arg7[var16], 53) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field1836 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field1836 && arg4[var22] == super.field1836) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field1836) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field1836 != arg2[var24] && arg2[0] - super.field1836 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field1836 != arg4[var24] && arg4[0] - super.field1836 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class81 var25 = new class81();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field1035 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field1038 = (byte) (var25.field1038 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field4605[arg0 + 1][arg1] == this.field4605[arg0][arg1] && this.field4605[arg0 + 1][arg1 + 1] == this.field4605[arg0][arg1] && this.field4605[arg0][arg1 + 1] == this.field4605[arg0][arg1]) {
                    var25.field1038 = (byte) (var25.field1038 | 1);
                }
                if (var27 != -1 && (var25.field1038 & 2) == 0 && !this.field4614.field502.method1642(var27, -38).field1775) {
                    var25.field1039 = this.field4616[arg0][arg1] - this.field4600[arg0][arg1];
                    var25.field1037 = this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1];
                    var25.field1036 = this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1];
                    var25.field1041 = this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1];
                    var25.field1032 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field1039 = class10.method72(arg10, var28, method2051(arg6[var18] >> 8, this.field4616[arg0][arg1] - this.field4600[arg0][arg1]), -59);
                    if (var25.field1035 != 0) {
                        var25.field1039 |= 255 - (this.field4616[arg0][arg1] - this.field4600[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field1037 = class10.method72(arg10, var29, method2051(arg6[var19] >> 8, this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1]), -110);
                    if (var25.field1035 != 0) {
                        var25.field1037 |= 255 - (this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field1036 = class10.method72(arg10, var30, method2051(arg6[var20] >> 8, this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1]), -128);
                    if (var25.field1035 != 0) {
                        var25.field1036 |= 255 - (this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field1041 = class10.method72(arg10, var31, method2051(arg6[var21] >> 8, this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1]), -84);
                    if (var25.field1035 != 0) {
                        var25.field1041 |= 255 - (this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1]) << 25;
                    }
                    var25.field1032 = -1;
                }
                if (arg5 != null) {
                    var25.field1040 = (short) arg5[var20];
                    var25.field1033 = (short) arg5[var21];
                    var25.field1031 = (short) arg5[var19];
                    var25.field1034 = (short) arg5[var18];
                }
                this.field4599[arg0][arg1] = var25;
            } else {
                class234 var32 = new class234();
                var32.field2994 = (short) arg2.length;
                var32.field2986 = (short) (arg2.length / 3);
                var32.field2993 = new short[var32.field2994];
                var32.field2988 = new short[var32.field2994];
                var32.field2989 = new short[var32.field2994];
                var32.field2992 = new int[var32.field2994];
                if (arg5 != null) {
                    var32.field2990 = new short[var32.field2994];
                }
                for (int var33 = 0; var33 < var32.field2994; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field4616[arg0][arg1] - this.field4600[arg0][arg1];
                    } else if (var48 == 0 && super.field1836 == var49) {
                        var51 = this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1];
                    } else if (super.field1836 == var48 && super.field1836 == var49) {
                        var51 = this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1];
                    } else if (super.field1836 == var48 && var49 == 0) {
                        var51 = this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1]) * var48 + (this.field4616[arg0][arg1] - this.field4600[arg0][arg1]) * (super.field1836 - var48);
                        int var53 = (this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1]) * var48 + (this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1]) * (super.field1836 - var48);
                        var51 = (super.field1836 - var49) * var52 + var49 * var53 >> super.field1840 * 2;
                    }
                    int var54 = (arg0 << super.field1840) + var48;
                    int var55 = (arg1 << super.field1840) + var49;
                    var32.field2993[var33] = (short) var48;
                    var32.field2989[var33] = (short) var49;
                    var32.field2988[var33] = (short) (this.method396(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field4614.field502.method1642(arg8[var33], -94).field1775) {
                        var32.field2992[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field2992[var33] = var51 << 25;
                        } else {
                            var32.field2992[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field2990[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field2992[var33] = class10.method72(arg10, var56, method2051(arg6[var33] >> 8, var51), -108);
                        if (arg7 != null) {
                            var32.field2992[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field2986; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field4614.field502.method1642(arg8[var35 * 3], 127).field1775) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field2991 = new int[var32.field2986];
                }
                if (var34) {
                    var32.field2987 = new short[var32.field2986];
                    var32.field2995 = new short[var32.field2986];
                }
                for (int var36 = 0; var36 < var32.field2986; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field2991[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field4614.field502.method1642(var42, 121).field1775) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field4614.field502.method1642(var43, 123).field1775) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field4614.field502.method1642(var44, 21).field1775) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field2987[var36] = (short) var44;
                            var32.field2995[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field4614.field502.method1642(var45, -114).field1775) {
                                    var32.field2992[var37] = class527.field7777[class261.method1564(this.field4614.field502.method1642(var45, -9).field1795 & 65535, 74) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field4614.field502.method1642(var46, -59).field1775) {
                                    var32.field2992[var38] = class527.field7777[class261.method1564(this.field4614.field502.method1642(var46, 123).field1795 & 65535, 47) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field4614.field502.method1642(var47, 120).field1775) {
                                    var32.field2992[var39] = class527.field7777[class261.method1564(this.field4614.field502.method1642(var47, 7).field1795 & 65535, 111) & 65535];
                                }
                            }
                            var32.field2987[var36] = -1;
                        }
                    }
                }
                this.field4610[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "ca", descriptor = "()V")
    public final void method401() {
        this.field4616 = null;
        this.field4600 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method392(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field4608 == null) {
            this.field4608 = new class260[super.field1842][super.field1844];
            this.field4603 = new class104[super.field1842][super.field1844];
        } else if (this.field4599 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field1836 != var20 || var21 != 0 && super.field1836 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class104 var22 = new class104();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1330 = var23;
            var22.field1323 = new short[var23];
            var22.field1325 = new short[var23];
            var22.field1329 = new short[var23];
            var22.field1326 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1323[var25] = (short) (this.field4616[arg0][arg1] - this.field4600[arg0][arg1]);
                } else if (var30 == 0 && super.field1836 == var31) {
                    var22.field1323[var25] = (short) (this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1]);
                } else if (super.field1836 == var30 && super.field1836 == var31) {
                    var22.field1323[var25] = (short) (this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1]);
                } else if (super.field1836 == var30 && var31 == 0) {
                    var22.field1323[var25] = (short) (this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1]) * var30 + (this.field4616[arg0][arg1] - this.field4600[arg0][arg1]) * (super.field1836 - var30);
                    int var33 = (this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1]) * var30 + (this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1]) * (super.field1836 - var30);
                    var22.field1323[var25] = (short) ((super.field1836 - var31) * var32 + var31 * var33 >> super.field1840 * 2);
                }
                int var34 = (arg0 << super.field1840) + var30;
                int var35 = (arg1 << super.field1840) + var31;
                var22.field1325[var25] = (short) var30;
                var22.field1326[var25] = (short) var31;
                var22.field1329[var25] = (short) (this.method396(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1323[var25] < 2) {
                    var22.field1323[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field4614.field502.method1642(arg11[var28], 120).field1775) {
                    var26 = true;
                }
            }
            var22.field1319 = new int[var27];
            if (arg10 != null) {
                var22.field1318 = new int[var27];
            }
            var22.field1327 = new short[var27];
            var22.field1321 = new short[var27];
            var22.field1328 = new short[var27];
            if (var26) {
                var22.field1320 = new short[var27];
                var22.field1322 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1319[var22.field1324] = class261.method1564(arg9[var29], 79);
                    } else {
                        var22.field1319[var22.field1324] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1318[var22.field1324] = class261.method1564(arg10[var29], 109);
                        } else {
                            var22.field1318[var22.field1324] = -1;
                        }
                    }
                    var22.field1327[var22.field1324] = (short) arg6[var29];
                    var22.field1321[var22.field1324] = (short) arg7[var29];
                    var22.field1328[var22.field1324] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field4614.field502.method1642(arg11[var29], 124).field1775) {
                            var22.field1320[var22.field1324] = (short) arg11[var29];
                            var22.field1322[var22.field1324] = (short) arg12[var29];
                        } else {
                            var22.field1320[var22.field1324] = -1;
                        }
                    }
                    ++var22.field1324;
                }
            }
            this.field4603[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class260 var36 = new class260();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field3283 = class27.method214((byte) -110, class261.method1564(arg10[0], 126), this.field4616[arg0][arg1] - this.field4600[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field3280 = (byte) (var36.field3280 | 2);
                    }
                }
                if (this.field4605[arg0 + 1][arg1] == this.field4605[arg0][arg1] && this.field4605[arg0 + 1][arg1 + 1] == this.field4605[arg0][arg1] && this.field4605[arg0][arg1 + 1] == this.field4605[arg0][arg1]) {
                    var36.field3280 = (byte) (var36.field3280 | 1);
                }
                if (var38 != -1 && (var36.field3280 & 2) == 0 && !this.field4614.field502.method1642(var38, 20).field1775) {
                    var36.field3278 = (short) (this.field4616[arg0][arg1] - this.field4600[arg0][arg1]);
                    var36.field3279 = (short) (this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1]);
                    var36.field3282 = (short) (this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1]);
                    var36.field3277 = (short) (this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1]);
                    var36.field3281 = (short) var38;
                } else {
                    short var39 = class261.method1564(var37, 95);
                    var36.field3278 = (short) class27.method214((byte) -110, var39, this.field4616[arg0][arg1] - this.field4600[arg0][arg1]);
                    var36.field3279 = (short) class27.method214((byte) -110, var39, this.field4616[arg0 + 1][arg1] - this.field4600[arg0 + 1][arg1]);
                    var36.field3282 = (short) class27.method214((byte) -110, var39, this.field4616[arg0 + 1][arg1 + 1] - this.field4600[arg0 + 1][arg1 + 1]);
                    var36.field3277 = (short) class27.method214((byte) -110, var39, this.field4616[arg0][arg1 + 1] - this.field4600[arg0][arg1 + 1]);
                    var36.field3281 = -1;
                }
                this.field4608[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lku;[I)V")
    public final void method385(class256 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "(III)V")
    public final void method394(int arg0, int arg1, int arg2) {
        if (this.field4600[arg0][arg1] < arg2) {
            this.field4600[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I")
    public final int method396(int arg0, int arg1) {
        int var3 = arg0 >> super.field1840;
        int var4 = arg1 >> super.field1840;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1842 - 1 && var4 <= super.field1844 - 1) {
            int var5 = arg0 & super.field1836 - 1;
            int var6 = arg1 & super.field1836 - 1;
            int var7 = (super.field1836 - var5) * this.field4605[var3][var4] + this.field4605[var3 + 1][var4] * var5 >> super.field1840;
            int var8 = (super.field1836 - var5) * this.field4605[var3][var4 + 1] + this.field4605[var3 + 1][var4 + 1] * var5 >> super.field1840;
            return (super.field1836 - var6) * var7 + var6 * var8 >> super.field1840;
        } else {
            return 0;
        }
    }
}
