import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class113 extends class24 {

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
    private int field1691 = -1;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "Lfg;")
    private class85 field1688;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "[[I")
    public int[][] field1684;

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "[[B")
    private byte[][] field1696;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "[[B")
    private byte[][] field1687;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "I")
    private int field1686;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
    private int field1695;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
    private int field1697;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "[[Lce;")
    private class207[][] field1678;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "[[Llh;")
    private class373[][] field1679;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "[[Lre;")
    private class435[][] field1683;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "[[Lnh;")
    private class537[][] field1690;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIZLcu;[I[I[I)V")
    private final void method800(int arg0, int arg1, boolean arg2, class150 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class435 var8 = this.field1683[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6222 & 2) == 0) {
                int var9 = super.field346 * arg0;
                int var10 = super.field346 + var9;
                int var11 = super.field346 * arg1;
                int var12 = super.field346 + var11;
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
                if ((var8.field6222 & 1) != 0 && !arg2) {
                    int var17 = this.field1684[arg0][arg1];
                    if (this.field1691 == -1) {
                        int var18 = this.field1686 * var17;
                        var19 = (this.field1693 * var11 + this.field1681 * var9 + var18 >> 15) + this.field1676;
                        if (var19 <= this.field1688.field1371) {
                            return;
                        }
                        var20 = (this.field1693 * var11 + this.field1681 * var10 + var18 >> 15) + this.field1676;
                        if (var20 <= this.field1688.field1371) {
                            return;
                        }
                        var21 = (this.field1693 * var12 + this.field1681 * var10 + var18 >> 15) + this.field1676;
                        if (var21 <= this.field1688.field1371) {
                            return;
                        }
                        var22 = (this.field1693 * var12 + this.field1681 * var9 + var18 >> 15) + this.field1676;
                        if (var22 <= this.field1688.field1371) {
                            return;
                        }
                    } else {
                        var22 = this.field1691;
                        var21 = this.field1691;
                        var20 = this.field1691;
                        var19 = this.field1691;
                    }
                    if (this.field1688.field1355) {
                        int var23 = var19 - this.field1688.field1366;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1688.field1366;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1688.field1366;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1688.field1366;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1685 * var17;
                    int var28 = this.field1677 * var17;
                    var29 = (this.field1695 * var11 + this.field1694 * var9 + var27 >> 15) + this.field1697;
                    var30 = this.field1688.field1375 * var29 / var19 + arg3.field2295;
                    var31 = (this.field1689 * var11 + this.field1682 * var9 + var28 >> 15) + this.field1692;
                    var32 = this.field1688.field1379 * var31 / var19 + arg3.field2293;
                    var33 = (this.field1695 * var11 + this.field1694 * var10 + var27 >> 15) + this.field1697;
                    var34 = this.field1688.field1375 * var33 / var20 + arg3.field2295;
                    var35 = (this.field1689 * var11 + this.field1682 * var10 + var28 >> 15) + this.field1692;
                    var36 = this.field1688.field1379 * var35 / var20 + arg3.field2293;
                    var37 = (this.field1695 * var12 + this.field1694 * var10 + var27 >> 15) + this.field1697;
                    var38 = this.field1688.field1375 * var37 / var21 + arg3.field2295;
                    var39 = (this.field1689 * var12 + this.field1682 * var10 + var28 >> 15) + this.field1692;
                    var40 = this.field1688.field1379 * var39 / var21 + arg3.field2293;
                    var41 = (this.field1695 * var12 + this.field1694 * var9 + var27 >> 15) + this.field1697;
                    var42 = this.field1688.field1375 * var41 / var22 + arg3.field2295;
                    var43 = (this.field1689 * var12 + this.field1682 * var9 + var28 >> 15) + this.field1692;
                    var44 = this.field1688.field1379 * var43 / var22 + arg3.field2293;
                } else {
                    int var45 = this.field1684[arg0][arg1];
                    int var46 = this.field1684[arg0 + 1][arg1];
                    int var47 = this.field1684[arg0 + 1][arg1 + 1];
                    int var48 = this.field1684[arg0][arg1 + 1];
                    if (this.field1691 == -1) {
                        var19 = (this.field1693 * var11 + this.field1686 * var45 + this.field1681 * var9 >> 15) + this.field1676;
                        if (var19 <= this.field1688.field1371) {
                            return;
                        }
                        var20 = (this.field1693 * var11 + this.field1686 * var46 + this.field1681 * var10 >> 15) + this.field1676;
                        if (var20 <= this.field1688.field1371) {
                            return;
                        }
                        var21 = (this.field1693 * var12 + this.field1686 * var47 + this.field1681 * var10 >> 15) + this.field1676;
                        if (var21 <= this.field1688.field1371) {
                            return;
                        }
                        var22 = (this.field1693 * var12 + this.field1686 * var48 + this.field1681 * var9 >> 15) + this.field1676;
                        if (var22 <= this.field1688.field1371) {
                            return;
                        }
                    } else {
                        var22 = this.field1691;
                        var21 = this.field1691;
                        var20 = this.field1691;
                        var19 = this.field1691;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1688.field1366;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field6219 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1688.field1366;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field6224 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1688.field1366;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field6216 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1688.field1366;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field6215 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1688.field1355) {
                        int var57 = var19 - this.field1688.field1366;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1688.field1366;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1688.field1366;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1688.field1366;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1695 * var11 + this.field1694 * var9 + this.field1685 * var45 >> 15) + this.field1697;
                    var30 = this.field1688.field1375 * var29 / var19 + arg3.field2295;
                    var31 = (this.field1689 * var11 + this.field1682 * var9 + this.field1677 * var45 >> 15) + this.field1692;
                    var32 = this.field1688.field1379 * var31 / var19 + arg3.field2293;
                    var33 = (this.field1695 * var11 + this.field1694 * var10 + this.field1685 * var46 >> 15) + this.field1697;
                    var34 = this.field1688.field1375 * var33 / var20 + arg3.field2295;
                    var35 = (this.field1689 * var11 + this.field1682 * var10 + this.field1677 * var46 >> 15) + this.field1692;
                    var36 = this.field1688.field1379 * var35 / var20 + arg3.field2293;
                    var37 = (this.field1695 * var12 + this.field1694 * var10 + this.field1685 * var47 >> 15) + this.field1697;
                    var38 = this.field1688.field1375 * var37 / var21 + arg3.field2295;
                    var39 = (this.field1689 * var12 + this.field1682 * var10 + this.field1677 * var47 >> 15) + this.field1692;
                    var40 = this.field1688.field1379 * var39 / var21 + arg3.field2293;
                    var41 = (this.field1695 * var12 + this.field1694 * var9 + this.field1685 * var48 >> 15) + this.field1697;
                    var42 = this.field1688.field1375 * var41 / var22 + arg3.field2295;
                    var43 = (this.field1689 * var12 + this.field1682 * var9 + this.field1677 * var48 >> 15) + this.field1692;
                    var44 = this.field1688.field1379 * var43 / var22 + arg3.field2293;
                }
                boolean var61 = var8.field6223 != -1 && this.method804(this.field1688.field2505.method93((byte) -73, var8.field6223).field819);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field2296 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field2291 || var42 > arg3.field2291 || var34 > arg3.field2291;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field2300 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6223 >= 0) {
                                arg3.method1058(var40, var44, var36, var38, var42, var34, this.field1688.field1358, var15, var16, var14, var8.field6217, var8.field6221, var8.field6225, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6223);
                            } else {
                                arg3.method1062(var40, var44, var36, var38, var42, var34, class198.method1338(var15 << 24 | this.field1688.field1358, 4095, var8.field6217), class198.method1338(var16 << 24 | this.field1688.field1358, 4095, var8.field6221), class198.method1338(var14 << 24 | this.field1688.field1358, 4095, var8.field6225));
                            }
                        } else if (var8.field6223 >= 0) {
                            arg3.method1053(var40, var44, var36, var38, var42, var34, var8.field6217, var8.field6221, var8.field6225, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6223);
                        } else {
                            arg3.method1062(var40, var44, var36, var38, var42, var34, var8.field6217, var8.field6221, var8.field6225);
                        }
                        arg3.field2300 = 0;
                    } else {
                        arg3.method1061(var40, var44, var36, var38, var42, var34, this.field1688.field1358);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field2296 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field2291 || var34 > arg3.field2291 || var42 > arg3.field2291;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field2300 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6223 >= 0) {
                                arg3.method1058(var32, var36, var44, var30, var34, var42, this.field1688.field1358, var13, var14, var16, var8.field6220, var8.field6225, var8.field6221, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6223);
                            } else {
                                arg3.method1062(var32, var36, var44, var30, var34, var42, class198.method1338(var13 << 24 | this.field1688.field1358, 4095, var8.field6220), class198.method1338(var14 << 24 | this.field1688.field1358, 4095, var8.field6225), class198.method1338(var16 << 24 | this.field1688.field1358, 4095, var8.field6221));
                            }
                        } else if (var8.field6223 >= 0) {
                            arg3.method1053(var32, var36, var44, var30, var34, var42, var8.field6220, var8.field6225, var8.field6221, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6223);
                        } else {
                            arg3.method1062(var32, var36, var44, var30, var34, var42, var8.field6220, var8.field6225, var8.field6221);
                        }
                        arg3.field2300 = 0;
                        return;
                    }
                    arg3.method1061(var32, var36, var44, var30, var34, var42, this.field1688.field1358);
                }
            }
        } else {
            class537 var64 = this.field1690[arg0][arg1];
            if (var64 != null) {
                if (this.field1691 == -1) {
                    for (int var65 = 0; var65 < var64.field7901; ++var65) {
                        int var66 = (arg0 << super.field345) + var64.field7898[var65];
                        int var67 = var64.field7903[var65];
                        int var68 = (arg1 << super.field345) + var64.field7904[var65];
                        int var69 = (this.field1693 * var68 + this.field1686 * var67 + this.field1681 * var66 >> 15) + this.field1676;
                        if (var69 <= this.field1688.field1371) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field1688.field1366;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field7897[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field1688.field1355) {
                            int var72 = var69 - this.field1688.field1366;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field1695 * var68 + this.field1694 * var66 + this.field1685 * var67 >> 15) + this.field1697;
                        int var74 = (this.field1689 * var68 + this.field1682 * var66 + this.field1677 * var67 >> 15) + this.field1692;
                        arg4[var65] = this.field1688.field1375 * var73 / var69 + arg3.field2295;
                        arg5[var65] = this.field1688.field1379 * var74 / var69 + arg3.field2293;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field7901; ++var75) {
                        int var115 = (arg0 << super.field345) + var64.field7898[var75];
                        int var116 = var64.field7903[var75];
                        int var117 = (arg1 << super.field345) + var64.field7904[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field1691 - this.field1688.field1366;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field7897[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field1688.field1355) {
                            int var120 = this.field1691 - this.field1688.field1366;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field1695 * var117 + this.field1694 * var115 + this.field1685 * var116 >> 15) + this.field1697;
                        int var122 = (this.field1689 * var117 + this.field1682 * var115 + this.field1677 * var116 >> 15) + this.field1692;
                        arg4[var75] = this.field1688.field1375 * var121 / this.field1691 + arg3.field2295;
                        arg5[var75] = this.field1688.field1379 * var122 / this.field1691 + arg3.field2293;
                    }
                }
                if (var64.field7896 != null) {
                    int var76 = this.field1684[arg0][arg1];
                    int var77 = this.field1684[arg0 + 1][arg1];
                    int var78 = this.field1684[arg0][arg1 + 1];
                    int var79 = super.field346 * arg0;
                    int var80 = super.field346 + var79;
                    int var81 = super.field346 * arg1;
                    int var82 = super.field346 + var81;
                    int var83 = (this.field1695 * var81 + this.field1694 * var79 + this.field1685 * var76 >> 15) + this.field1697;
                    int var84 = (this.field1689 * var81 + this.field1682 * var79 + this.field1677 * var76 >> 15) + this.field1692;
                    int var85 = (this.field1693 * var81 + this.field1686 * var76 + this.field1681 * var79 >> 15) + this.field1676;
                    int var86 = (this.field1695 * var81 + this.field1694 * var80 + this.field1685 * var77 >> 15) + this.field1697;
                    int var87 = (this.field1689 * var81 + this.field1682 * var80 + this.field1677 * var77 >> 15) + this.field1692;
                    int var88 = (this.field1693 * var81 + this.field1686 * var77 + this.field1681 * var80 >> 15) + this.field1676;
                    int var89 = (this.field1695 * var82 + this.field1694 * var79 + this.field1685 * var78 >> 15) + this.field1697;
                    int var90 = (this.field1689 * var82 + this.field1682 * var79 + this.field1677 * var78 >> 15) + this.field1692;
                    int var91 = (this.field1693 * var82 + this.field1686 * var78 + this.field1681 * var79 >> 15) + this.field1676;
                    for (int var92 = 0; var92 < var64.field7899; ++var92) {
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
                            arg3.field2296 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field2291 || var97 > arg3.field2291 || var98 > arg3.field2291;
                            short var103 = var64.field7896[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method804(this.field1688.field2505.method93((byte) 83, var103).field819)) {
                                    arg3.field2300 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1058(var99, var100, var101, var96, var97, var98, this.field1688.field1358, arg6[var93], arg6[var94], arg6[var95], var64.field7900[var93], var64.field7900[var94], var64.field7900[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field7900[var93] & 16777215) != 0) {
                                        arg3.method1062(var99, var100, var101, var96, var97, var98, class198.method1338(arg6[var93] << 24 | this.field1688.field1358, 4095, var64.field7900[var93]), class198.method1338(arg6[var94] << 24 | this.field1688.field1358, 4095, var64.field7900[var94]), class198.method1338(arg6[var95] << 24 | this.field1688.field1358, 4095, var64.field7900[var95]));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1053(var99, var100, var101, var96, var97, var98, var64.field7900[var93], var64.field7900[var94], var64.field7900[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field7900[var93] & 16777215) != 0) {
                                    arg3.method1062(var99, var100, var101, var96, var97, var98, var64.field7900[var93], var64.field7900[var94], var64.field7900[var95]);
                                }
                                arg3.field2300 = 0;
                            } else {
                                arg3.method1061(var99, var100, var101, var96, var97, var98, this.field1688.field1358);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field7899; ++var104) {
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
                        arg3.field2296 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field2291 || var109 > arg3.field2291 || var110 > arg3.field2291;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field7900[var105] & 16777215) != 0) {
                                    arg3.method1062(var111, var112, var113, var108, var109, var110, class144.method1036(16711935, arg6[var105], var64.field7900[var105], this.field1688.field1358), class144.method1036(16711935, arg6[var106], var64.field7900[var106], this.field1688.field1358), class144.method1036(16711935, arg6[var107], var64.field7900[var107], this.field1688.field1358));
                                }
                            } else if ((var64.field7900[var105] & 16777215) != 0) {
                                arg3.method1062(var111, var112, var113, var108, var109, var110, var64.field7900[var105], var64.field7900[var106], var64.field7900[var107]);
                            }
                        } else {
                            arg3.method1061(var111, var112, var113, var108, var109, var110, this.field1688.field1358);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III[[ZZ)V")
    public final void method152(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class9 var6 = this.field1688.field1350;
        this.field1691 = -1;
        this.field1694 = var6.field82;
        this.field1685 = var6.field73;
        this.field1695 = var6.field78;
        this.field1697 = var6.field83;
        this.field1682 = var6.field80;
        this.field1677 = var6.field81;
        this.field1689 = var6.field75;
        this.field1692 = var6.field77;
        this.field1681 = var6.field79;
        this.field1686 = var6.field72;
        this.field1693 = var6.field76;
        this.field1676 = var6.field74;
    }

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "(III)V")
    public final void method149(int arg0, int arg1, int arg2) {
        if (this.field1687[arg0][arg1] < arg2) {
            this.field1687[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!aq", name = "oa", descriptor = "(II)I")
    public final int method156(int arg0, int arg1) {
        return this.field1684[arg0][arg1];
    }

    @OriginalMember(owner = "client!aq", name = "ia", descriptor = "(Lia;IIIIZ)V")
    public final void method148(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class447 var9 = this.field1688.method632(Thread.currentThread());
        class150 var10 = var9.field6380;
        var10.field2300 = 0;
        var10.field2296 = false;
        if (this.field1683 != null) {
            this.method801(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field6432, var9.field6422);
        } else {
            if (this.field1678 != null) {
                this.method803(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field6432, var9.field6422);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lni;[I)V")
    public final void method157(class369 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!aq", name = "U", descriptor = "()V")
    public final void method155() {
        this.field1696 = null;
        this.field1687 = null;
    }

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "(Lia;IIIIZ)V")
    public final void method150(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "(II)I")
    public final int method143(int arg0, int arg1) {
        int var3 = arg0 >> super.field345;
        int var4 = arg1 >> super.field345;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field347 - 1 && var4 <= super.field350 - 1) {
            int var5 = arg0 & super.field346 - 1;
            int var6 = arg1 & super.field346 - 1;
            int var7 = (super.field346 - var5) * this.field1684[var3][var4] + this.field1684[var3 + 1][var4] * var5 >> super.field345;
            int var8 = (super.field346 - var5) * this.field1684[var3][var4 + 1] + this.field1684[var3 + 1][var4 + 1] * var5 >> super.field345;
            return (super.field346 - var6) * var7 + var6 * var8 >> super.field345;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII[[ZLcu;[I[I)V")
    private final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class150 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2299 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1683[var16][var17] != null) {
                        class435 var18 = this.field1683[var16][var17];
                        if (var18.field6223 != -1 && (var18.field6222 & 2) == 0 && var18.field6218 == 0) {
                            int var19 = this.field1688.method635(var18.field6223);
                            arg8.method1064(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class486.method2863((byte) -91, var18.field6217, var19), class486.method2863((byte) -91, var18.field6221, var19), class486.method2863((byte) -91, var18.field6225, var19));
                            arg8.method1064(var15, var15, var15 - var13, var14, var13 + var14, var14, class486.method2863((byte) -91, var18.field6220, var19), class486.method2863((byte) -91, var18.field6225, var19), class486.method2863((byte) -91, var18.field6221, var19));
                        } else if (var18.field6218 == 0) {
                            arg8.method1062(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6217, var18.field6221, var18.field6225);
                            arg8.method1062(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6220, var18.field6225, var18.field6221);
                        } else {
                            int var20 = var18.field6218;
                            arg8.method1062(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class198.method1338(var18.field6217 & -16777216, 4095, var20), class198.method1338(var18.field6221 & -16777216, 4095, var20), class198.method1338(var18.field6225 & -16777216, 4095, var20));
                            arg8.method1062(var15, var15, var15 - var13, var14, var13 + var14, var14, class198.method1338(var18.field6220 & -16777216, 4095, var20), class198.method1338(var18.field6225 & -16777216, 4095, var20), class198.method1338(var18.field6221 & -16777216, 4095, var20));
                        }
                    } else if (this.field1690[var16][var17] != null) {
                        class537 var21 = this.field1690[var16][var17];
                        for (int var22 = 0; var22 < var21.field7901; ++var22) {
                            arg9[var22] = var21.field7898[var22] * var13 / super.field346 + var14;
                            arg10[var22] = var15 - var21.field7904[var22] * var13 / super.field346;
                        }
                        for (int var23 = 0; var23 < var21.field7899; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field7902 != null && var21.field7902[var23] != 0 && (var21.field7896 == null || var21.field7896 != null && var21.field7896[var23] == -1)) {
                                int var33 = var21.field7902[var23];
                                arg8.method1062(var30, var31, var32, var27, var28, var29, class198.method1338(-16777216 - (var21.field7900[var24] & -16777216), 4095, var33), class198.method1338(-16777216 - (var21.field7900[var25] & -16777216), 4095, var33), class198.method1338(-16777216 - (var21.field7900[var26] & -16777216), 4095, var33));
                            } else if (var21.field7896 != null && var21.field7896[var23] != -1) {
                                int var34 = this.field1688.method635(var21.field7896[var23]);
                                arg8.method1064(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1062(var30, var31, var32, var27, var28, var29, var21.field7900[var24], var21.field7900[var25], var21.field7900[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2299 = true;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILcu;[I[I[I)V")
    private final void method802(int arg0, int arg1, class150 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class207 var7 = this.field1678[arg0][arg1];
        if (var7 != null) {
            if ((var7.field3146 & 2) == 0) {
                int var8 = super.field346 * arg0;
                int var9 = super.field346 + var8;
                int var10 = super.field346 * arg1;
                int var11 = super.field346 + var10;
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
                if ((var7.field3146 & 1) != 0) {
                    int var12 = this.field1684[arg0][arg1];
                    int var16;
                    if (this.field1691 == -1) {
                        int var13 = this.field1686 * var12;
                        var14 = (this.field1693 * var10 + this.field1681 * var8 + var13 >> 15) + this.field1676;
                        if (var14 <= this.field1688.field1371) {
                            return;
                        }
                        var15 = (this.field1693 * var10 + this.field1681 * var9 + var13 >> 15) + this.field1676;
                        if (var15 <= this.field1688.field1371) {
                            return;
                        }
                        var16 = (this.field1693 * var11 + this.field1681 * var9 + var13 >> 15) + this.field1676;
                        if (var16 <= this.field1688.field1371) {
                            return;
                        }
                        var17 = (this.field1693 * var11 + this.field1681 * var8 + var13 >> 15) + this.field1676;
                        if (var17 <= this.field1688.field1371) {
                            return;
                        }
                    } else {
                        var17 = this.field1691;
                        var16 = this.field1691;
                        var15 = this.field1691;
                        var14 = this.field1691;
                    }
                    int var18 = this.field1685 * var12;
                    int var19 = this.field1677 * var12;
                    var20 = (this.field1695 * var10 + this.field1694 * var8 + var18 >> 15) + this.field1697;
                    var21 = this.field1688.field1375 * var20 / var14 + arg2.field2295;
                    var22 = (this.field1689 * var10 + this.field1682 * var8 + var19 >> 15) + this.field1692;
                    var23 = this.field1688.field1379 * var22 / var14 + arg2.field2293;
                    var24 = (this.field1695 * var10 + this.field1694 * var9 + var18 >> 15) + this.field1697;
                    var25 = this.field1688.field1375 * var24 / var15 + arg2.field2295;
                    var26 = (this.field1689 * var10 + this.field1682 * var9 + var19 >> 15) + this.field1692;
                    var27 = this.field1688.field1379 * var26 / var15 + arg2.field2293;
                    int var28 = (this.field1695 * var11 + this.field1694 * var9 + var18 >> 15) + this.field1697;
                    var29 = this.field1688.field1375 * var28 / var16 + arg2.field2295;
                    int var30 = (this.field1689 * var11 + this.field1682 * var9 + var19 >> 15) + this.field1692;
                    var31 = this.field1688.field1379 * var30 / var16 + arg2.field2293;
                    var32 = (this.field1695 * var11 + this.field1694 * var8 + var18 >> 15) + this.field1697;
                    var33 = this.field1688.field1375 * var32 / var17 + arg2.field2295;
                    var34 = (this.field1689 * var11 + this.field1682 * var8 + var19 >> 15) + this.field1692;
                    var35 = this.field1688.field1379 * var34 / var17 + arg2.field2293;
                } else {
                    int var36 = this.field1684[arg0][arg1];
                    int var37 = this.field1684[arg0 + 1][arg1];
                    int var38 = this.field1684[arg0 + 1][arg1 + 1];
                    int var39 = this.field1684[arg0][arg1 + 1];
                    int var40;
                    if (this.field1691 == -1) {
                        var14 = (this.field1693 * var10 + this.field1686 * var36 + this.field1681 * var8 >> 15) + this.field1676;
                        if (var14 <= this.field1688.field1371) {
                            return;
                        }
                        var15 = (this.field1693 * var10 + this.field1686 * var37 + this.field1681 * var9 >> 15) + this.field1676;
                        if (var15 <= this.field1688.field1371) {
                            return;
                        }
                        var40 = (this.field1693 * var11 + this.field1686 * var38 + this.field1681 * var9 >> 15) + this.field1676;
                        if (var40 <= this.field1688.field1371) {
                            return;
                        }
                        var17 = (this.field1693 * var11 + this.field1686 * var39 + this.field1681 * var8 >> 15) + this.field1676;
                        if (var17 <= this.field1688.field1371) {
                            return;
                        }
                    } else {
                        var17 = this.field1691;
                        var40 = this.field1691;
                        var15 = this.field1691;
                        var14 = this.field1691;
                    }
                    var20 = (this.field1695 * var10 + this.field1694 * var8 + this.field1685 * var36 >> 15) + this.field1697;
                    var21 = this.field1688.field1375 * var20 / var14 + arg2.field2295;
                    var22 = (this.field1689 * var10 + this.field1682 * var8 + this.field1677 * var36 >> 15) + this.field1692;
                    var23 = this.field1688.field1379 * var22 / var14 + arg2.field2293;
                    var24 = (this.field1695 * var10 + this.field1694 * var9 + this.field1685 * var37 >> 15) + this.field1697;
                    var25 = this.field1688.field1375 * var24 / var15 + arg2.field2295;
                    var26 = (this.field1689 * var10 + this.field1682 * var9 + this.field1677 * var37 >> 15) + this.field1692;
                    var27 = this.field1688.field1379 * var26 / var15 + arg2.field2293;
                    int var41 = (this.field1695 * var11 + this.field1694 * var9 + this.field1685 * var38 >> 15) + this.field1697;
                    var29 = this.field1688.field1375 * var41 / var40 + arg2.field2295;
                    int var42 = (this.field1689 * var11 + this.field1682 * var9 + this.field1677 * var38 >> 15) + this.field1692;
                    var31 = this.field1688.field1379 * var42 / var40 + arg2.field2293;
                    var32 = (this.field1695 * var11 + this.field1694 * var8 + this.field1685 * var39 >> 15) + this.field1697;
                    var33 = this.field1688.field1375 * var32 / var17 + arg2.field2295;
                    var34 = (this.field1689 * var11 + this.field1682 * var8 + this.field1677 * var39 >> 15) + this.field1692;
                    var35 = this.field1688.field1379 * var34 / var17 + arg2.field2293;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field2296 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field2291 || var33 > arg2.field2291 || var25 > arg2.field2291;
                    if (var7.field3144 >= 0) {
                        if (this.method804(this.field1688.field2505.method93((byte) -86, var7.field3144).field819)) {
                            arg2.field2300 = 100;
                        }
                        arg2.method1053(var31, var35, var27, var29, var33, var25, var7.field3147 & 65535, var7.field3148 & 65535, var7.field3149 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3144);
                        arg2.field2300 = 0;
                    } else {
                        arg2.method1064(var31, var35, var27, var29, var33, var25, var7.field3147 & 65535, var7.field3148 & 65535, var7.field3149 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field2296 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field2291 || var25 > arg2.field2291 || var33 > arg2.field2291;
                    if (var7.field3144 >= 0) {
                        if (this.method804(this.field1688.field2505.method93((byte) -106, var7.field3144).field819)) {
                            arg2.field2300 = 100;
                        }
                        arg2.method1053(var23, var27, var35, var21, var25, var33, var7.field3145 & 65535, var7.field3149 & 65535, var7.field3148 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3144);
                        arg2.field2300 = 0;
                        return;
                    }
                    arg2.method1064(var23, var27, var35, var21, var25, var33, var7.field3145 & 65535, var7.field3149 & 65535, var7.field3148 & 65535);
                }
            }
        } else {
            class373 var43 = this.field1679[arg0][arg1];
            if (var43 != null) {
                if (this.field1691 == -1) {
                    for (int var44 = 0; var44 < var43.field5371; ++var44) {
                        int var45 = (arg0 << super.field345) + var43.field5372[var44];
                        short var46 = var43.field5375[var44];
                        int var47 = (arg1 << super.field345) + var43.field5378[var44];
                        int var48 = (this.field1693 * var47 + this.field1686 * var46 + this.field1681 * var45 >> 15) + this.field1676;
                        if (var48 <= this.field1688.field1371) {
                            return;
                        }
                        int var49 = (this.field1695 * var47 + this.field1694 * var45 + this.field1685 * var46 >> 15) + this.field1697;
                        int var50 = (this.field1689 * var47 + this.field1682 * var45 + this.field1677 * var46 >> 15) + this.field1692;
                        arg3[var44] = this.field1688.field1375 * var49 / var48 + arg2.field2295;
                        arg4[var44] = this.field1688.field1379 * var50 / var48 + arg2.field2293;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field5371; ++var51) {
                        int var91 = (arg0 << super.field345) + var43.field5372[var51];
                        short var92 = var43.field5375[var51];
                        int var93 = (arg1 << super.field345) + var43.field5378[var51];
                        int var94 = (this.field1695 * var93 + this.field1694 * var91 + this.field1685 * var92 >> 15) + this.field1697;
                        int var95 = (this.field1689 * var93 + this.field1682 * var91 + this.field1677 * var92 >> 15) + this.field1692;
                        arg3[var51] = this.field1688.field1375 * var94 / this.field1691 + arg2.field2295;
                        arg4[var51] = this.field1688.field1379 * var95 / this.field1691 + arg2.field2293;
                    }
                }
                if (var43.field5373 != null) {
                    int var52 = this.field1684[arg0][arg1];
                    int var53 = this.field1684[arg0 + 1][arg1];
                    int var54 = this.field1684[arg0][arg1 + 1];
                    int var55 = super.field346 * arg0;
                    int var56 = super.field346 + var55;
                    int var57 = super.field346 * arg1;
                    int var58 = super.field346 + var57;
                    int var59 = (this.field1695 * var57 + this.field1694 * var55 + this.field1685 * var52 >> 15) + this.field1697;
                    int var60 = (this.field1689 * var57 + this.field1682 * var55 + this.field1677 * var52 >> 15) + this.field1692;
                    int var61 = (this.field1693 * var57 + this.field1686 * var52 + this.field1681 * var55 >> 15) + this.field1676;
                    int var62 = (this.field1695 * var57 + this.field1694 * var56 + this.field1685 * var53 >> 15) + this.field1697;
                    int var63 = (this.field1689 * var57 + this.field1682 * var56 + this.field1677 * var53 >> 15) + this.field1692;
                    int var64 = (this.field1693 * var57 + this.field1686 * var53 + this.field1681 * var56 >> 15) + this.field1676;
                    int var65 = (this.field1695 * var58 + this.field1694 * var55 + this.field1685 * var54 >> 15) + this.field1697;
                    int var66 = (this.field1689 * var58 + this.field1682 * var55 + this.field1677 * var54 >> 15) + this.field1692;
                    int var67 = (this.field1693 * var58 + this.field1686 * var54 + this.field1681 * var55 >> 15) + this.field1676;
                    for (int var68 = 0; var68 < var43.field5377; ++var68) {
                        short var69 = var43.field5376[var68];
                        short var70 = var43.field5374[var68];
                        short var71 = var43.field5379[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field2296 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field2291 || var73 > arg2.field2291 || var74 > arg2.field2291;
                            short var78 = var43.field5373[var68];
                            if (var78 != -1) {
                                if (this.method804(this.field1688.field2505.method93((byte) 51, var78).field819)) {
                                    arg2.field2300 = 100;
                                }
                                arg2.method1053(var75, var76, var77, var72, var73, var74, var43.field5370[var69], var43.field5370[var70], var43.field5370[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field2300 = 0;
                            } else {
                                int var79 = var43.field5380[var68];
                                if (var79 != -1) {
                                    arg2.method1064(var75, var76, var77, var72, var73, var74, class486.method2863((byte) -91, var43.field5370[var69], var79), class486.method2863((byte) -91, var43.field5370[var70], var79), class486.method2863((byte) -91, var43.field5370[var71], var79));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field5377; ++var80) {
                    short var81 = var43.field5376[var80];
                    short var82 = var43.field5374[var80];
                    short var83 = var43.field5379[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field5380[var80];
                        if (var90 != -1) {
                            arg2.field2296 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field2291 || var85 > arg2.field2291 || var86 > arg2.field2291;
                            arg2.method1064(var87, var88, var89, var84, var85, var86, class486.method2863((byte) -91, var43.field5370[var81], var90), class486.method2863((byte) -91, var43.field5370[var82], var90), class486.method2863((byte) -91, var43.field5370[var83], var90));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method151(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field1683 == null) {
            this.field1683 = new class435[super.field347][super.field350];
            this.field1690 = new class537[super.field347][super.field350];
        } else if (this.field1678 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class470.field6825[class119.method871(arg6[var15], 0) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class470.field6825[class119.method871(arg7[var16], 0) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field346 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field346 && arg4[var22] == super.field346) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field346) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field346 != arg2[var24] && arg2[0] - super.field346 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field346 != arg4[var24] && arg4[0] - super.field346 != arg4[var24]) {
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
                class435 var25 = new class435();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6218 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6222 = (byte) (var25.field6222 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field1684[arg0 + 1][arg1] == this.field1684[arg0][arg1] && this.field1684[arg0 + 1][arg1 + 1] == this.field1684[arg0][arg1] && this.field1684[arg0][arg1 + 1] == this.field1684[arg0][arg1]) {
                    var25.field6222 = (byte) (var25.field6222 | 1);
                }
                if (var27 != -1 && (var25.field6222 & 2) == 0 && !this.field1688.field2505.method93((byte) -67, var27).field814) {
                    var25.field6220 = this.field1696[arg0][arg1] - this.field1687[arg0][arg1];
                    var25.field6225 = this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1];
                    var25.field6217 = this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1];
                    var25.field6221 = this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1];
                    var25.field6223 = (short) var27;
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
                    var25.field6220 = class144.method1036(16711935, var28, method805(arg6[var18] >> 8, this.field1696[arg0][arg1] - this.field1687[arg0][arg1]), arg10);
                    if (var25.field6218 != 0) {
                        var25.field6220 |= 255 - (this.field1696[arg0][arg1] - this.field1687[arg0][arg1]) << 25;
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
                    var25.field6225 = class144.method1036(16711935, var29, method805(arg6[var19] >> 8, this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1]), arg10);
                    if (var25.field6218 != 0) {
                        var25.field6225 |= 255 - (this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1]) << 25;
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
                    var25.field6217 = class144.method1036(16711935, var30, method805(arg6[var20] >> 8, this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1]), arg10);
                    if (var25.field6218 != 0) {
                        var25.field6217 |= 255 - (this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field6221 = class144.method1036(16711935, var31, method805(arg6[var21] >> 8, this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1]), arg10);
                    if (var25.field6218 != 0) {
                        var25.field6221 |= 255 - (this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6223 = -1;
                }
                if (arg5 != null) {
                    var25.field6216 = (short) arg5[var20];
                    var25.field6215 = (short) arg5[var21];
                    var25.field6224 = (short) arg5[var19];
                    var25.field6219 = (short) arg5[var18];
                }
                this.field1683[arg0][arg1] = var25;
            } else {
                class537 var32 = new class537();
                var32.field7901 = (short) arg2.length;
                var32.field7899 = (short) (arg2.length / 3);
                var32.field7898 = new short[var32.field7901];
                var32.field7903 = new short[var32.field7901];
                var32.field7904 = new short[var32.field7901];
                var32.field7900 = new int[var32.field7901];
                if (arg5 != null) {
                    var32.field7897 = new short[var32.field7901];
                }
                for (int var33 = 0; var33 < var32.field7901; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field1696[arg0][arg1] - this.field1687[arg0][arg1];
                    } else if (var48 == 0 && super.field346 == var49) {
                        var51 = this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1];
                    } else if (super.field346 == var48 && super.field346 == var49) {
                        var51 = this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1];
                    } else if (super.field346 == var48 && var49 == 0) {
                        var51 = this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1]) * var48 + (this.field1696[arg0][arg1] - this.field1687[arg0][arg1]) * (super.field346 - var48);
                        int var53 = (this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1]) * var48 + (this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1]) * (super.field346 - var48);
                        var51 = (super.field346 - var49) * var52 + var49 * var53 >> super.field345 * 2;
                    }
                    int var54 = (arg0 << super.field345) + var48;
                    int var55 = (arg1 << super.field345) + var49;
                    var32.field7898[var33] = (short) var48;
                    var32.field7904[var33] = (short) var49;
                    var32.field7903[var33] = (short) (this.method143(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field1688.field2505.method93((byte) 76, arg8[var33]).field814) {
                        var32.field7900[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field7900[var33] = var51 << 25;
                        } else {
                            var32.field7900[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field7897[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field7900[var33] = class144.method1036(16711935, var56, method805(arg6[var33] >> 8, var51), arg10);
                        if (arg7 != null) {
                            var32.field7900[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field7899; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field1688.field2505.method93((byte) -95, arg8[var35 * 3]).field814) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field7902 = new int[var32.field7899];
                }
                if (var34) {
                    var32.field7896 = new short[var32.field7899];
                    var32.field7895 = new short[var32.field7899];
                }
                for (int var36 = 0; var36 < var32.field7899; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field7902[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field1688.field2505.method93((byte) -117, var42).field814) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field1688.field2505.method93((byte) -72, var43).field814) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field1688.field2505.method93((byte) 76, var44).field814) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field7896[var36] = (short) var44;
                            var32.field7895[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field1688.field2505.method93((byte) 47, var45).field814) {
                                    var32.field7900[var37] = class470.field6825[class119.method871(this.field1688.field2505.method93((byte) -80, var45).field828 & 65535, 0) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field1688.field2505.method93((byte) 78, var46).field814) {
                                    var32.field7900[var38] = class470.field6825[class119.method871(this.field1688.field2505.method93((byte) 104, var46).field828 & 65535, 0) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field1688.field2505.method93((byte) 92, var47).field814) {
                                    var32.field7900[var39] = class470.field6825[class119.method871(this.field1688.field2505.method93((byte) 112, var47).field828 & 65535, 0) & 65535];
                                }
                            }
                            var32.field7896[var36] = -1;
                        }
                    }
                }
                this.field1690[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIIIIII[[ZLcu;[I[I)V")
    private final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class150 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2299 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1678[var16][var17] != null) {
                        class207 var18 = this.field1678[var16][var17];
                        if (var18.field3144 != -1 && (var18.field3146 & 2) == 0 && var18.field3143 == -1) {
                            int var19 = this.field1688.method635(var18.field3144);
                            arg8.method1064(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class486.method2863((byte) -91, var18.field3147 & 65535, var19), class486.method2863((byte) -91, var18.field3148 & 65535, var19), class486.method2863((byte) -91, var18.field3149 & 65535, var19));
                            arg8.method1064(var15, var15, var15 - var13, var14, var13 + var14, var14, class486.method2863((byte) -91, var18.field3145 & 65535, var19), class486.method2863((byte) -91, var18.field3149 & 65535, var19), class486.method2863((byte) -91, var18.field3148 & 65535, var19));
                        } else if (var18.field3143 == -1) {
                            arg8.method1064(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field3147 & 65535, var18.field3148 & 65535, var18.field3149 & 65535);
                            arg8.method1064(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field3145 & 65535, var18.field3149 & 65535, var18.field3148 & 65535);
                        } else {
                            int var20 = var18.field3143;
                            arg8.method1064(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1064(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1679[var16][var17] != null) {
                        class373 var21 = this.field1679[var16][var17];
                        for (int var22 = 0; var22 < var21.field5371; ++var22) {
                            arg9[var22] = var21.field5372[var22] * var13 / super.field346 + var14;
                            arg10[var22] = var15 - var21.field5378[var22] * var13 / super.field346;
                        }
                        for (int var23 = 0; var23 < var21.field5377; ++var23) {
                            short var24 = var21.field5376[var23];
                            short var25 = var21.field5374[var23];
                            short var26 = var21.field5379[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5369 != null && var21.field5369[var23] != -1) {
                                int var33 = var21.field5369[var23];
                                arg8.method1064(var30, var31, var32, var27, var28, var29, class486.method2863((byte) -91, var21.field5370[var24], var33), class486.method2863((byte) -91, var21.field5370[var25], var33), class486.method2863((byte) -91, var21.field5370[var26], var33));
                            } else if (var21.field5373 != null && var21.field5373[var23] != -1) {
                                int var34 = this.field1688.method635(var21.field5373[var23]);
                                arg8.method1064(var30, var31, var32, var27, var28, var29, class486.method2863((byte) -91, var21.field5370[var24], var34), class486.method2863((byte) -91, var21.field5370[var25], var34), class486.method2863((byte) -91, var21.field5370[var26], var34));
                            } else {
                                int var35 = var21.field5380[var23];
                                arg8.method1064(var30, var31, var32, var27, var28, var29, class486.method2863((byte) -91, var21.field5370[var24], var35), class486.method2863((byte) -91, var21.field5370[var25], var35), class486.method2863((byte) -91, var21.field5370[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2299 = true;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)Z")
    private final boolean method804(int arg0) {
        if ((this.field1680 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lia;IIIIZ)Z")
    public final boolean method154(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "(IILia;)Lia;")
    public final class424 method153(int arg0, int arg1, class424 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    public final void method144(int arg0, int arg1) {
        class447 var3 = this.field1688.method632(Thread.currentThread());
        var3.field6380.field2300 = 0;
        if (this.field1683 != null) {
            this.method800(arg0, arg1, this.field1688.field1378, var3.field6380, var3.field6432, var3.field6422, var3.field6395);
        } else {
            if (this.field1678 != null) {
                this.method802(arg0, arg1, var3.field6380, var3.field6432, var3.field6422, var3.field6395);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lfg;IIII[[I[[II)V")
    public class113(class85 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1688 = arg0;
        this.field1680 = arg2;
        this.field1684 = arg5;
        this.field1696 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1688.field1357 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1688.field1385 * var18 + this.field1688.field1380 * var17 + this.field1688.field1368 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1696[var11][var10] = (byte) var20;
            }
        }
        this.field1687 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method147(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1678 == null) {
            this.field1678 = new class207[super.field347][super.field350];
            this.field1679 = new class373[super.field347][super.field350];
        } else if (this.field1683 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field346 != var20 || var21 != 0 && super.field346 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class373 var22 = new class373();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field5371 = var23;
            var22.field5370 = new short[var23];
            var22.field5372 = new short[var23];
            var22.field5375 = new short[var23];
            var22.field5378 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field5370[var25] = (short) (this.field1696[arg0][arg1] - this.field1687[arg0][arg1]);
                } else if (var30 == 0 && super.field346 == var31) {
                    var22.field5370[var25] = (short) (this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1]);
                } else if (super.field346 == var30 && super.field346 == var31) {
                    var22.field5370[var25] = (short) (this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1]);
                } else if (super.field346 == var30 && var31 == 0) {
                    var22.field5370[var25] = (short) (this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1]) * var30 + (this.field1696[arg0][arg1] - this.field1687[arg0][arg1]) * (super.field346 - var30);
                    int var33 = (this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1]) * var30 + (this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1]) * (super.field346 - var30);
                    var22.field5370[var25] = (short) ((super.field346 - var31) * var32 + var31 * var33 >> super.field345 * 2);
                }
                int var34 = (arg0 << super.field345) + var30;
                int var35 = (arg1 << super.field345) + var31;
                var22.field5372[var25] = (short) var30;
                var22.field5378[var25] = (short) var31;
                var22.field5375[var25] = (short) (this.method143(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field5370[var25] < 2) {
                    var22.field5370[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field1688.field2505.method93((byte) -119, arg11[var28]).field814) {
                    var26 = true;
                }
            }
            var22.field5380 = new int[var27];
            if (arg10 != null) {
                var22.field5369 = new int[var27];
            }
            var22.field5376 = new short[var27];
            var22.field5374 = new short[var27];
            var22.field5379 = new short[var27];
            if (var26) {
                var22.field5373 = new short[var27];
                var22.field5381 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field5380[var22.field5377] = class119.method871(arg9[var29], 0);
                    } else {
                        var22.field5380[var22.field5377] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field5369[var22.field5377] = class119.method871(arg10[var29], 0);
                        } else {
                            var22.field5369[var22.field5377] = -1;
                        }
                    }
                    var22.field5376[var22.field5377] = (short) arg6[var29];
                    var22.field5374[var22.field5377] = (short) arg7[var29];
                    var22.field5379[var22.field5377] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1688.field2505.method93((byte) -123, arg11[var29]).field814) {
                            var22.field5373[var22.field5377] = (short) arg11[var29];
                            var22.field5381[var22.field5377] = (short) arg12[var29];
                        } else {
                            var22.field5373[var22.field5377] = -1;
                        }
                    }
                    ++var22.field5377;
                }
            }
            this.field1679[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class207 var36 = new class207();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field3143 = class486.method2863((byte) -91, this.field1696[arg0][arg1] - this.field1687[arg0][arg1], class119.method871(arg10[0], 0));
                    if (var37 == -1) {
                        var36.field3146 = (byte) (var36.field3146 | 2);
                    }
                }
                if (this.field1684[arg0 + 1][arg1] == this.field1684[arg0][arg1] && this.field1684[arg0 + 1][arg1 + 1] == this.field1684[arg0][arg1] && this.field1684[arg0][arg1 + 1] == this.field1684[arg0][arg1]) {
                    var36.field3146 = (byte) (var36.field3146 | 1);
                }
                if (var38 != -1 && (var36.field3146 & 2) == 0 && !this.field1688.field2505.method93((byte) 41, var38).field814) {
                    var36.field3145 = (short) (this.field1696[arg0][arg1] - this.field1687[arg0][arg1]);
                    var36.field3149 = (short) (this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1]);
                    var36.field3147 = (short) (this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1]);
                    var36.field3148 = (short) (this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1]);
                    var36.field3144 = (short) var38;
                } else {
                    short var39 = class119.method871(var37, 0);
                    var36.field3145 = (short) class486.method2863((byte) -91, this.field1696[arg0][arg1] - this.field1687[arg0][arg1], var39);
                    var36.field3149 = (short) class486.method2863((byte) -91, this.field1696[arg0 + 1][arg1] - this.field1687[arg0 + 1][arg1], var39);
                    var36.field3147 = (short) class486.method2863((byte) -91, this.field1696[arg0 + 1][arg1 + 1] - this.field1687[arg0 + 1][arg1 + 1], var39);
                    var36.field3148 = (short) class486.method2863((byte) -91, this.field1696[arg0][arg1 + 1] - this.field1687[arg0][arg1 + 1], var39);
                    var36.field3144 = -1;
                }
                this.field1678[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)I")
    private static final int method805(int arg0, int arg1) {
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
}
