import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class415 extends class35 {

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
    private int field6205 = -1;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Lo;")
    private class24 field6193;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    private int field6192;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "[[I")
    public int[][] field6189;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "[[B")
    private byte[][] field6196;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "[[B")
    private byte[][] field6188;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    private int field6185;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    private int field6186;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    private int field6187;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    private int field6191;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    private int field6195;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
    private int field6197;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    private int field6198;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    private int field6199;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
    private int field6201;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    private int field6202;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "I")
    private int field6203;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    private int field6206;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "[[Lrh;")
    private class172[][] field6204;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "[[Lfs;")
    private class387[][] field6200;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "[[Lph;")
    private class454[][] field6190;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "[[Ljt;")
    private class67[][] field6194;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIZLkp;[I[I[I)V", line = 6)
    private final void method2510(int arg0, int arg1, boolean arg2, class336 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class172 var8 = this.field6204[arg0][arg1];
        if (var8 != null) {
            if ((var8.field2655 & 2) == 0) {
                int var9 = super.field676 * arg0;
                int var10 = super.field676 + var9;
                int var11 = super.field676 * arg1;
                int var12 = super.field676 + var11;
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
                if ((var8.field2655 & 1) != 0 && !arg2) {
                    int var17 = this.field6189[arg0][arg1];
                    if (this.field6205 == -1) {
                        int var18 = this.field6197 * var17;
                        var19 = (this.field6187 * var11 + this.field6191 * var9 + var18 >> 15) + this.field6185;
                        if (var19 <= this.field6193.field512) {
                            return;
                        }
                        var20 = (this.field6187 * var11 + this.field6191 * var10 + var18 >> 15) + this.field6185;
                        if (var20 <= this.field6193.field512) {
                            return;
                        }
                        var21 = (this.field6187 * var12 + this.field6191 * var10 + var18 >> 15) + this.field6185;
                        if (var21 <= this.field6193.field512) {
                            return;
                        }
                        var22 = (this.field6187 * var12 + this.field6191 * var9 + var18 >> 15) + this.field6185;
                        if (var22 <= this.field6193.field512) {
                            return;
                        }
                    } else {
                        var22 = this.field6205;
                        var21 = this.field6205;
                        var20 = this.field6205;
                        var19 = this.field6205;
                    }
                    if (this.field6193.field530) {
                        int var23 = var19 - this.field6193.field515;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field6193.field515;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field6193.field515;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field6193.field515;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field6199 * var17;
                    int var28 = this.field6203 * var17;
                    var29 = (this.field6198 * var11 + this.field6186 * var9 + var27 >> 15) + this.field6206;
                    var30 = this.field6193.field498 * var29 / var19 + arg3.field5069;
                    var31 = (this.field6195 * var11 + this.field6201 * var9 + var28 >> 15) + this.field6202;
                    var32 = this.field6193.field516 * var31 / var19 + arg3.field5075;
                    var33 = (this.field6198 * var11 + this.field6186 * var10 + var27 >> 15) + this.field6206;
                    var34 = this.field6193.field498 * var33 / var20 + arg3.field5069;
                    var35 = (this.field6195 * var11 + this.field6201 * var10 + var28 >> 15) + this.field6202;
                    var36 = this.field6193.field516 * var35 / var20 + arg3.field5075;
                    var37 = (this.field6198 * var12 + this.field6186 * var10 + var27 >> 15) + this.field6206;
                    var38 = this.field6193.field498 * var37 / var21 + arg3.field5069;
                    var39 = (this.field6195 * var12 + this.field6201 * var10 + var28 >> 15) + this.field6202;
                    var40 = this.field6193.field516 * var39 / var21 + arg3.field5075;
                    var41 = (this.field6198 * var12 + this.field6186 * var9 + var27 >> 15) + this.field6206;
                    var42 = this.field6193.field498 * var41 / var22 + arg3.field5069;
                    var43 = (this.field6195 * var12 + this.field6201 * var9 + var28 >> 15) + this.field6202;
                    var44 = this.field6193.field516 * var43 / var22 + arg3.field5075;
                } else {
                    int var45 = this.field6189[arg0][arg1];
                    int var46 = this.field6189[arg0 + 1][arg1];
                    int var47 = this.field6189[arg0 + 1][arg1 + 1];
                    int var48 = this.field6189[arg0][arg1 + 1];
                    if (this.field6205 == -1) {
                        var19 = (this.field6187 * var11 + this.field6197 * var45 + this.field6191 * var9 >> 15) + this.field6185;
                        if (var19 <= this.field6193.field512) {
                            return;
                        }
                        var20 = (this.field6187 * var11 + this.field6197 * var46 + this.field6191 * var10 >> 15) + this.field6185;
                        if (var20 <= this.field6193.field512) {
                            return;
                        }
                        var21 = (this.field6187 * var12 + this.field6197 * var47 + this.field6191 * var10 >> 15) + this.field6185;
                        if (var21 <= this.field6193.field512) {
                            return;
                        }
                        var22 = (this.field6187 * var12 + this.field6197 * var48 + this.field6191 * var9 >> 15) + this.field6185;
                        if (var22 <= this.field6193.field512) {
                            return;
                        }
                    } else {
                        var22 = this.field6205;
                        var21 = this.field6205;
                        var20 = this.field6205;
                        var19 = this.field6205;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field6193.field515;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field2657 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field6193.field515;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field2656 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field6193.field515;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field2653 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field6193.field515;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field2658 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field6193.field530) {
                        int var57 = var19 - this.field6193.field515;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field6193.field515;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field6193.field515;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field6193.field515;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field6198 * var11 + this.field6199 * var45 + this.field6186 * var9 >> 15) + this.field6206;
                    var30 = this.field6193.field498 * var29 / var19 + arg3.field5069;
                    var31 = (this.field6195 * var11 + this.field6203 * var45 + this.field6201 * var9 >> 15) + this.field6202;
                    var32 = this.field6193.field516 * var31 / var19 + arg3.field5075;
                    var33 = (this.field6198 * var11 + this.field6199 * var46 + this.field6186 * var10 >> 15) + this.field6206;
                    var34 = this.field6193.field498 * var33 / var20 + arg3.field5069;
                    var35 = (this.field6195 * var11 + this.field6203 * var46 + this.field6201 * var10 >> 15) + this.field6202;
                    var36 = this.field6193.field516 * var35 / var20 + arg3.field5075;
                    var37 = (this.field6198 * var12 + this.field6199 * var47 + this.field6186 * var10 >> 15) + this.field6206;
                    var38 = this.field6193.field498 * var37 / var21 + arg3.field5069;
                    var39 = (this.field6195 * var12 + this.field6203 * var47 + this.field6201 * var10 >> 15) + this.field6202;
                    var40 = this.field6193.field516 * var39 / var21 + arg3.field5075;
                    var41 = (this.field6198 * var12 + this.field6199 * var48 + this.field6186 * var9 >> 15) + this.field6206;
                    var42 = this.field6193.field498 * var41 / var22 + arg3.field5069;
                    var43 = (this.field6195 * var12 + this.field6203 * var48 + this.field6201 * var9 >> 15) + this.field6202;
                    var44 = this.field6193.field516 * var43 / var22 + arg3.field5075;
                }
                boolean var61 = var8.field2650 != -1 && this.method2514(this.field6193.field2501.method956(-945, var8.field2650).field1451);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field5063 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field5072 || var42 > arg3.field5072 || var34 > arg3.field5072;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field5071 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field2650 >= 0) {
                                arg3.method2150(var40, var44, var36, var38, var42, var34, this.field6193.field492, var15, var16, var14, var8.field2651, var8.field2652, var8.field2654, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field2650);
                            } else {
                                arg3.method2149(var40, var44, var36, var38, var42, var34, class487.method2888(var15 << 24 | this.field6193.field492, var8.field2651, (byte) -104), class487.method2888(var16 << 24 | this.field6193.field492, var8.field2652, (byte) -110), class487.method2888(var14 << 24 | this.field6193.field492, var8.field2654, (byte) -88));
                            }
                        } else if (var8.field2650 >= 0) {
                            arg3.method2153(var40, var44, var36, var38, var42, var34, var8.field2651, var8.field2652, var8.field2654, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field2650);
                        } else {
                            arg3.method2149(var40, var44, var36, var38, var42, var34, var8.field2651, var8.field2652, var8.field2654);
                        }
                        arg3.field5071 = 0;
                    } else {
                        arg3.method2155(var40, var44, var36, var38, var42, var34, this.field6193.field492);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field5063 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field5072 || var34 > arg3.field5072 || var42 > arg3.field5072;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field5071 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field2650 >= 0) {
                                arg3.method2150(var32, var36, var44, var30, var34, var42, this.field6193.field492, var13, var14, var16, var8.field2660, var8.field2654, var8.field2652, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field2650);
                            } else {
                                arg3.method2149(var32, var36, var44, var30, var34, var42, class487.method2888(var13 << 24 | this.field6193.field492, var8.field2660, (byte) -95), class487.method2888(var14 << 24 | this.field6193.field492, var8.field2654, (byte) -107), class487.method2888(var16 << 24 | this.field6193.field492, var8.field2652, (byte) -90));
                            }
                        } else if (var8.field2650 >= 0) {
                            arg3.method2153(var32, var36, var44, var30, var34, var42, var8.field2660, var8.field2654, var8.field2652, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field2650);
                        } else {
                            arg3.method2149(var32, var36, var44, var30, var34, var42, var8.field2660, var8.field2654, var8.field2652);
                        }
                        arg3.field5071 = 0;
                        return;
                    }
                    arg3.method2155(var32, var36, var44, var30, var34, var42, this.field6193.field492);
                }
            }
        } else {
            class454 var64 = this.field6190[arg0][arg1];
            if (var64 != null) {
                if (this.field6205 == -1) {
                    for (int var65 = 0; var65 < var64.field6785; ++var65) {
                        int var66 = (arg0 << super.field679) + var64.field6781[var65];
                        int var67 = var64.field6786[var65];
                        int var68 = (arg1 << super.field679) + var64.field6787[var65];
                        int var69 = (this.field6187 * var68 + this.field6197 * var67 + this.field6191 * var66 >> 15) + this.field6185;
                        if (var69 <= this.field6193.field512) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field6193.field515;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field6779[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field6193.field530) {
                            int var72 = var69 - this.field6193.field515;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field6198 * var68 + this.field6199 * var67 + this.field6186 * var66 >> 15) + this.field6206;
                        int var74 = (this.field6195 * var68 + this.field6203 * var67 + this.field6201 * var66 >> 15) + this.field6202;
                        arg4[var65] = this.field6193.field498 * var73 / var69 + arg3.field5069;
                        arg5[var65] = this.field6193.field516 * var74 / var69 + arg3.field5075;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field6785; ++var75) {
                        int var115 = (arg0 << super.field679) + var64.field6781[var75];
                        int var116 = var64.field6786[var75];
                        int var117 = (arg1 << super.field679) + var64.field6787[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field6205 - this.field6193.field515;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field6779[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field6193.field530) {
                            int var120 = this.field6205 - this.field6193.field515;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field6198 * var117 + this.field6199 * var116 + this.field6186 * var115 >> 15) + this.field6206;
                        int var122 = (this.field6195 * var117 + this.field6203 * var116 + this.field6201 * var115 >> 15) + this.field6202;
                        arg4[var75] = this.field6193.field498 * var121 / this.field6205 + arg3.field5069;
                        arg5[var75] = this.field6193.field516 * var122 / this.field6205 + arg3.field5075;
                    }
                }
                if (var64.field6784 != null) {
                    int var76 = this.field6189[arg0][arg1];
                    int var77 = this.field6189[arg0 + 1][arg1];
                    int var78 = this.field6189[arg0][arg1 + 1];
                    int var79 = super.field676 * arg0;
                    int var80 = super.field676 + var79;
                    int var81 = super.field676 * arg1;
                    int var82 = super.field676 + var81;
                    int var83 = (this.field6198 * var81 + this.field6199 * var76 + this.field6186 * var79 >> 15) + this.field6206;
                    int var84 = (this.field6195 * var81 + this.field6203 * var76 + this.field6201 * var79 >> 15) + this.field6202;
                    int var85 = (this.field6187 * var81 + this.field6197 * var76 + this.field6191 * var79 >> 15) + this.field6185;
                    int var86 = (this.field6198 * var81 + this.field6199 * var77 + this.field6186 * var80 >> 15) + this.field6206;
                    int var87 = (this.field6195 * var81 + this.field6203 * var77 + this.field6201 * var80 >> 15) + this.field6202;
                    int var88 = (this.field6187 * var81 + this.field6197 * var77 + this.field6191 * var80 >> 15) + this.field6185;
                    int var89 = (this.field6198 * var82 + this.field6199 * var78 + this.field6186 * var79 >> 15) + this.field6206;
                    int var90 = (this.field6195 * var82 + this.field6203 * var78 + this.field6201 * var79 >> 15) + this.field6202;
                    int var91 = (this.field6187 * var82 + this.field6197 * var78 + this.field6191 * var79 >> 15) + this.field6185;
                    for (int var92 = 0; var92 < var64.field6780; ++var92) {
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
                            arg3.field5063 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field5072 || var97 > arg3.field5072 || var98 > arg3.field5072;
                            short var103 = var64.field6784[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method2514(this.field6193.field2501.method956(-945, var103).field1451)) {
                                    arg3.field5071 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method2150(var99, var100, var101, var96, var97, var98, this.field6193.field492, arg6[var93], arg6[var94], arg6[var95], var64.field6782[var93], var64.field6782[var94], var64.field6782[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field6782[var93] & 16777215) != 0) {
                                        arg3.method2149(var99, var100, var101, var96, var97, var98, class487.method2888(arg6[var93] << 24 | this.field6193.field492, var64.field6782[var93], (byte) -91), class487.method2888(arg6[var94] << 24 | this.field6193.field492, var64.field6782[var94], (byte) -94), class487.method2888(arg6[var95] << 24 | this.field6193.field492, var64.field6782[var95], (byte) -91));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method2153(var99, var100, var101, var96, var97, var98, var64.field6782[var93], var64.field6782[var94], var64.field6782[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field6782[var93] & 16777215) != 0) {
                                    arg3.method2149(var99, var100, var101, var96, var97, var98, var64.field6782[var93], var64.field6782[var94], var64.field6782[var95]);
                                }
                                arg3.field5071 = 0;
                            } else {
                                arg3.method2155(var99, var100, var101, var96, var97, var98, this.field6193.field492);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field6780; ++var104) {
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
                        arg3.field5063 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field5072 || var109 > arg3.field5072 || var110 > arg3.field5072;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field6782[var105] & 16777215) != 0) {
                                    arg3.method2149(var111, var112, var113, var108, var109, var110, class289.method1830(arg6[var105], false, var64.field6782[var105], this.field6193.field492), class289.method1830(arg6[var106], false, var64.field6782[var106], this.field6193.field492), class289.method1830(arg6[var107], false, var64.field6782[var107], this.field6193.field492));
                                }
                            } else if ((var64.field6782[var105] & 16777215) != 0) {
                                arg3.method2149(var111, var112, var113, var108, var109, var110, var64.field6782[var105], var64.field6782[var106], var64.field6782[var107]);
                            }
                        } else {
                            arg3.method2155(var111, var112, var113, var108, var109, var110, this.field6193.field492);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lfk;[I)V", line = 644)
    public final void method378(class462 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ot", name = "SA", descriptor = "(Lj;IIIIZ)V", line = 646)
    public final void method364(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ot", name = "va", descriptor = "(II)I", line = 652)
    public final int method371(int arg0, int arg1) {
        int var3 = arg0 >> super.field679;
        int var4 = arg1 >> super.field679;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field673 - 1 && var4 <= super.field678 - 1) {
            int var5 = arg0 & super.field676 - 1;
            int var6 = arg1 & super.field676 - 1;
            int var7 = (super.field676 - var5) * this.field6189[var3][var4] + this.field6189[var3 + 1][var4] * var5 >> super.field679;
            int var8 = (super.field676 - var5) * this.field6189[var3][var4 + 1] + this.field6189[var3 + 1][var4 + 1] * var5 >> super.field679;
            return (super.field676 - var6) * var7 + var6 * var8 >> super.field679;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ot", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 670)
    public final void method370(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field6204 == null) {
            this.field6204 = new class172[super.field673][super.field678];
            this.field6190 = new class454[super.field673][super.field678];
        } else if (this.field6200 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class168.field2605[class37.method385(arg6[var15], false) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class168.field2605[class37.method385(arg7[var16], false) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field676 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field676 && arg4[var22] == super.field676) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field676) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field676 != arg2[var24] && arg2[0] - super.field676 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field676 != arg4[var24] && arg4[0] - super.field676 != arg4[var24]) {
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
                class172 var25 = new class172();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field2659 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field2655 = (byte) (var25.field2655 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field6189[arg0 + 1][arg1] == this.field6189[arg0][arg1] && this.field6189[arg0 + 1][arg1 + 1] == this.field6189[arg0][arg1] && this.field6189[arg0][arg1 + 1] == this.field6189[arg0][arg1]) {
                    var25.field2655 = (byte) (var25.field2655 | 1);
                }
                if (var27 != -1 && (var25.field2655 & 2) == 0 && !this.field6193.field2501.method956(-945, var27).field1427) {
                    var25.field2660 = this.field6196[arg0][arg1] - this.field6188[arg0][arg1];
                    var25.field2654 = this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1];
                    var25.field2651 = this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1];
                    var25.field2652 = this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1];
                    var25.field2650 = (short) var27;
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
                    var25.field2660 = class289.method1830(var28, false, method2512(arg6[var18] >> 8, this.field6196[arg0][arg1] - this.field6188[arg0][arg1]), arg10);
                    if (var25.field2659 != 0) {
                        var25.field2660 |= 255 - (this.field6196[arg0][arg1] - this.field6188[arg0][arg1]) << 25;
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
                    var25.field2654 = class289.method1830(var29, false, method2512(arg6[var19] >> 8, this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1]), arg10);
                    if (var25.field2659 != 0) {
                        var25.field2654 |= 255 - (this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1]) << 25;
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
                    var25.field2651 = class289.method1830(var30, false, method2512(arg6[var20] >> 8, this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1]), arg10);
                    if (var25.field2659 != 0) {
                        var25.field2651 |= 255 - (this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field2652 = class289.method1830(var31, false, method2512(arg6[var21] >> 8, this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1]), arg10);
                    if (var25.field2659 != 0) {
                        var25.field2652 |= 255 - (this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1]) << 25;
                    }
                    var25.field2650 = -1;
                }
                if (arg5 != null) {
                    var25.field2653 = (short) arg5[var20];
                    var25.field2658 = (short) arg5[var21];
                    var25.field2656 = (short) arg5[var19];
                    var25.field2657 = (short) arg5[var18];
                }
                this.field6204[arg0][arg1] = var25;
            } else {
                class454 var32 = new class454();
                var32.field6785 = (short) arg2.length;
                var32.field6780 = (short) (arg2.length / 3);
                var32.field6781 = new short[var32.field6785];
                var32.field6786 = new short[var32.field6785];
                var32.field6787 = new short[var32.field6785];
                var32.field6782 = new int[var32.field6785];
                if (arg5 != null) {
                    var32.field6779 = new short[var32.field6785];
                }
                for (int var33 = 0; var33 < var32.field6785; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field6196[arg0][arg1] - this.field6188[arg0][arg1];
                    } else if (var48 == 0 && super.field676 == var49) {
                        var51 = this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1];
                    } else if (super.field676 == var48 && super.field676 == var49) {
                        var51 = this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1];
                    } else if (super.field676 == var48 && var49 == 0) {
                        var51 = this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1]) * var48 + (this.field6196[arg0][arg1] - this.field6188[arg0][arg1]) * (super.field676 - var48);
                        int var53 = (this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1]) * var48 + (this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1]) * (super.field676 - var48);
                        var51 = (super.field676 - var49) * var52 + var49 * var53 >> super.field679 * 2;
                    }
                    int var54 = (arg0 << super.field679) + var48;
                    int var55 = (arg1 << super.field679) + var49;
                    var32.field6781[var33] = (short) var48;
                    var32.field6787[var33] = (short) var49;
                    var32.field6786[var33] = (short) (this.method371(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field6193.field2501.method956(-945, arg8[var33]).field1427) {
                        var32.field6782[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field6782[var33] = var51 << 25;
                        } else {
                            var32.field6782[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field6779[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field6782[var33] = class289.method1830(var56, false, method2512(arg6[var33] >> 8, var51), arg10);
                        if (arg7 != null) {
                            var32.field6782[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field6780; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field6193.field2501.method956(-945, arg8[var35 * 3]).field1427) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field6778 = new int[var32.field6780];
                }
                if (var34) {
                    var32.field6784 = new short[var32.field6780];
                    var32.field6783 = new short[var32.field6780];
                }
                for (int var36 = 0; var36 < var32.field6780; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field6778[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field6193.field2501.method956(-945, var42).field1427) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field6193.field2501.method956(-945, var43).field1427) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field6193.field2501.method956(-945, var44).field1427) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field6784[var36] = (short) var44;
                            var32.field6783[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field6193.field2501.method956(-945, var45).field1427) {
                                    var32.field6782[var37] = class168.field2605[class37.method385(this.field6193.field2501.method956(-945, var45).field1432 & 65535, false) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field6193.field2501.method956(-945, var46).field1427) {
                                    var32.field6782[var38] = class168.field2605[class37.method385(this.field6193.field2501.method956(-945, var46).field1432 & 65535, false) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field6193.field2501.method956(-945, var47).field1427) {
                                    var32.field6782[var39] = class168.field2605[class37.method385(this.field6193.field2501.method956(-945, var47).field1432 & 65535, false) & 65535];
                                }
                            }
                            var32.field6784[var36] = -1;
                        }
                    }
                }
                this.field6190[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII[[ZLkp;[I[I)V", line = 1164)
    private final void method2511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class336 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5064 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field6204[var16][var17] != null) {
                        class172 var18 = this.field6204[var16][var17];
                        if (var18.field2650 != -1 && (var18.field2655 & 2) == 0 && var18.field2659 == 0) {
                            int var19 = this.field6193.method246(var18.field2650);
                            arg8.method2151(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class164.method1214(var19, var18.field2651, (byte) 47), class164.method1214(var19, var18.field2652, (byte) 47), class164.method1214(var19, var18.field2654, (byte) 47));
                            arg8.method2151(var15, var15, var15 - var13, var14, var13 + var14, var14, class164.method1214(var19, var18.field2660, (byte) 47), class164.method1214(var19, var18.field2654, (byte) 47), class164.method1214(var19, var18.field2652, (byte) 47));
                        } else if (var18.field2659 == 0) {
                            arg8.method2149(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2651, var18.field2652, var18.field2654);
                            arg8.method2149(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2660, var18.field2654, var18.field2652);
                        } else {
                            int var20 = var18.field2659;
                            arg8.method2149(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class487.method2888(var18.field2651 & -16777216, var20, (byte) -123), class487.method2888(var18.field2652 & -16777216, var20, (byte) -113), class487.method2888(var18.field2654 & -16777216, var20, (byte) -120));
                            arg8.method2149(var15, var15, var15 - var13, var14, var13 + var14, var14, class487.method2888(var18.field2660 & -16777216, var20, (byte) -98), class487.method2888(var18.field2654 & -16777216, var20, (byte) -128), class487.method2888(var18.field2652 & -16777216, var20, (byte) -124));
                        }
                    } else if (this.field6190[var16][var17] != null) {
                        class454 var21 = this.field6190[var16][var17];
                        for (int var22 = 0; var22 < var21.field6785; ++var22) {
                            arg9[var22] = var21.field6781[var22] * var13 / super.field676 + var14;
                            arg10[var22] = var15 - var21.field6787[var22] * var13 / super.field676;
                        }
                        for (int var23 = 0; var23 < var21.field6780; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field6778 == null || var21.field6778[var23] == 0 || var21.field6784 != null && (var21.field6784 == null || var21.field6784[var23] != -1)) {
                                if (var21.field6784 != null && var21.field6784[var23] != -1) {
                                    int var34 = this.field6193.method246(var21.field6784[var23]);
                                    arg8.method2151(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2149(var30, var31, var32, var27, var28, var29, var21.field6782[var24], var21.field6782[var25], var21.field6782[var26]);
                                }
                            } else {
                                int var33 = var21.field6778[var23];
                                arg8.method2149(var30, var31, var32, var27, var28, var29, class487.method2888(-16777216 - (var21.field6782[var24] & -16777216), var33, (byte) -128), class487.method2888(-16777216 - (var21.field6782[var25] & -16777216), var33, (byte) -90), class487.method2888(-16777216 - (var21.field6782[var26] & -16777216), var33, (byte) -87));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5064 = true;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V", line = 1293)
    public final void method365(int arg0, int arg1) {
        class1 var3 = this.field6193.method254(Thread.currentThread());
        var3.field13.field5071 = 0;
        if (this.field6204 != null) {
            this.method2510(arg0, arg1, this.field6193.field490, var3.field13, var3.field25, var3.field31, var3.field42);
        } else {
            if (this.field6200 != null) {
                this.method2513(arg0, arg1, var3.field13, var3.field25, var3.field31, var3.field42);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1306)
    public final void method367(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6200 == null) {
            this.field6200 = new class387[super.field673][super.field678];
            this.field6194 = new class67[super.field673][super.field678];
        } else if (this.field6204 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field676 != var20 || var21 != 0 && super.field676 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class67 var22 = new class67();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1161 = var23;
            var22.field1157 = new short[var23];
            var22.field1153 = new short[var23];
            var22.field1156 = new short[var23];
            var22.field1163 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1157[var25] = (short) (this.field6196[arg0][arg1] - this.field6188[arg0][arg1]);
                } else if (var30 == 0 && super.field676 == var31) {
                    var22.field1157[var25] = (short) (this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1]);
                } else if (super.field676 == var30 && super.field676 == var31) {
                    var22.field1157[var25] = (short) (this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1]);
                } else if (super.field676 == var30 && var31 == 0) {
                    var22.field1157[var25] = (short) (this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1]) * var30 + (this.field6196[arg0][arg1] - this.field6188[arg0][arg1]) * (super.field676 - var30);
                    int var33 = (this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1]) * var30 + (this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1]) * (super.field676 - var30);
                    var22.field1157[var25] = (short) ((super.field676 - var31) * var32 + var31 * var33 >> super.field679 * 2);
                }
                int var34 = (arg0 << super.field679) + var30;
                int var35 = (arg1 << super.field679) + var31;
                var22.field1153[var25] = (short) var30;
                var22.field1163[var25] = (short) var31;
                var22.field1156[var25] = (short) (this.method371(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1157[var25] < 2) {
                    var22.field1157[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field6193.field2501.method956(-945, arg11[var28]).field1427) {
                    var26 = true;
                }
            }
            var22.field1159 = new int[var27];
            if (arg10 != null) {
                var22.field1151 = new int[var27];
            }
            var22.field1155 = new short[var27];
            var22.field1160 = new short[var27];
            var22.field1152 = new short[var27];
            if (var26) {
                var22.field1162 = new short[var27];
                var22.field1158 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1159[var22.field1154] = class37.method385(arg9[var29], false);
                    } else {
                        var22.field1159[var22.field1154] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1151[var22.field1154] = class37.method385(arg10[var29], false);
                        } else {
                            var22.field1151[var22.field1154] = -1;
                        }
                    }
                    var22.field1155[var22.field1154] = (short) arg6[var29];
                    var22.field1160[var22.field1154] = (short) arg7[var29];
                    var22.field1152[var22.field1154] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6193.field2501.method956(-945, arg11[var29]).field1427) {
                            var22.field1162[var22.field1154] = (short) arg11[var29];
                            var22.field1158[var22.field1154] = (short) arg12[var29];
                        } else {
                            var22.field1162[var22.field1154] = -1;
                        }
                    }
                    ++var22.field1154;
                }
            }
            this.field6194[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class387 var36 = new class387();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field5831 = class164.method1214(class37.method385(arg10[0], false), this.field6196[arg0][arg1] - this.field6188[arg0][arg1], (byte) 47);
                    if (var37 == -1) {
                        var36.field5830 = (byte) (var36.field5830 | 2);
                    }
                }
                if (this.field6189[arg0 + 1][arg1] == this.field6189[arg0][arg1] && this.field6189[arg0 + 1][arg1 + 1] == this.field6189[arg0][arg1] && this.field6189[arg0][arg1 + 1] == this.field6189[arg0][arg1]) {
                    var36.field5830 = (byte) (var36.field5830 | 1);
                }
                if (var38 != -1 && (var36.field5830 & 2) == 0 && !this.field6193.field2501.method956(-945, var38).field1427) {
                    var36.field5833 = (short) (this.field6196[arg0][arg1] - this.field6188[arg0][arg1]);
                    var36.field5832 = (short) (this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1]);
                    var36.field5828 = (short) (this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1]);
                    var36.field5829 = (short) (this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1]);
                    var36.field5827 = (short) var38;
                } else {
                    short var39 = class37.method385(var37, false);
                    var36.field5833 = (short) class164.method1214(var39, this.field6196[arg0][arg1] - this.field6188[arg0][arg1], (byte) 47);
                    var36.field5832 = (short) class164.method1214(var39, this.field6196[arg0 + 1][arg1] - this.field6188[arg0 + 1][arg1], (byte) 47);
                    var36.field5828 = (short) class164.method1214(var39, this.field6196[arg0 + 1][arg1 + 1] - this.field6188[arg0 + 1][arg1 + 1], (byte) 47);
                    var36.field5829 = (short) class164.method1214(var39, this.field6196[arg0][arg1 + 1] - this.field6188[arg0][arg1 + 1], (byte) 47);
                    var36.field5827 = -1;
                }
                this.field6200[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)I", line = 1539)
    private static final int method2512(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "(IILj;)Lj;", line = 1568)
    public final class377 method372(int arg0, int arg1, class377 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1572)
    public final void method374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class1 var9 = this.field6193.method254(Thread.currentThread());
        class336 var10 = var9.field13;
        var10.field5071 = 0;
        var10.field5063 = false;
        if (this.field6204 != null) {
            this.method2511(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field25, var9.field31);
        } else {
            if (this.field6200 != null) {
                this.method2515(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field25, var9.field31);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 1587)
    public final boolean method369(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILkp;[I[I[I)V", line = 1591)
    private final void method2513(int arg0, int arg1, class336 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class387 var7 = this.field6200[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5830 & 2) == 0) {
                int var8 = super.field676 * arg0;
                int var9 = super.field676 + var8;
                int var10 = super.field676 * arg1;
                int var11 = super.field676 + var10;
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
                if ((var7.field5830 & 1) != 0) {
                    int var12 = this.field6189[arg0][arg1];
                    int var16;
                    if (this.field6205 == -1) {
                        int var13 = this.field6197 * var12;
                        var14 = (this.field6187 * var10 + this.field6191 * var8 + var13 >> 15) + this.field6185;
                        if (var14 <= this.field6193.field512) {
                            return;
                        }
                        var15 = (this.field6187 * var10 + this.field6191 * var9 + var13 >> 15) + this.field6185;
                        if (var15 <= this.field6193.field512) {
                            return;
                        }
                        var16 = (this.field6187 * var11 + this.field6191 * var9 + var13 >> 15) + this.field6185;
                        if (var16 <= this.field6193.field512) {
                            return;
                        }
                        var17 = (this.field6187 * var11 + this.field6191 * var8 + var13 >> 15) + this.field6185;
                        if (var17 <= this.field6193.field512) {
                            return;
                        }
                    } else {
                        var17 = this.field6205;
                        var16 = this.field6205;
                        var15 = this.field6205;
                        var14 = this.field6205;
                    }
                    int var18 = this.field6199 * var12;
                    int var19 = this.field6203 * var12;
                    var20 = (this.field6198 * var10 + this.field6186 * var8 + var18 >> 15) + this.field6206;
                    var21 = this.field6193.field498 * var20 / var14 + arg2.field5069;
                    var22 = (this.field6195 * var10 + this.field6201 * var8 + var19 >> 15) + this.field6202;
                    var23 = this.field6193.field516 * var22 / var14 + arg2.field5075;
                    var24 = (this.field6198 * var10 + this.field6186 * var9 + var18 >> 15) + this.field6206;
                    var25 = this.field6193.field498 * var24 / var15 + arg2.field5069;
                    var26 = (this.field6195 * var10 + this.field6201 * var9 + var19 >> 15) + this.field6202;
                    var27 = this.field6193.field516 * var26 / var15 + arg2.field5075;
                    int var28 = (this.field6198 * var11 + this.field6186 * var9 + var18 >> 15) + this.field6206;
                    var29 = this.field6193.field498 * var28 / var16 + arg2.field5069;
                    int var30 = (this.field6195 * var11 + this.field6201 * var9 + var19 >> 15) + this.field6202;
                    var31 = this.field6193.field516 * var30 / var16 + arg2.field5075;
                    var32 = (this.field6198 * var11 + this.field6186 * var8 + var18 >> 15) + this.field6206;
                    var33 = this.field6193.field498 * var32 / var17 + arg2.field5069;
                    var34 = (this.field6195 * var11 + this.field6201 * var8 + var19 >> 15) + this.field6202;
                    var35 = this.field6193.field516 * var34 / var17 + arg2.field5075;
                } else {
                    int var36 = this.field6189[arg0][arg1];
                    int var37 = this.field6189[arg0 + 1][arg1];
                    int var38 = this.field6189[arg0 + 1][arg1 + 1];
                    int var39 = this.field6189[arg0][arg1 + 1];
                    int var40;
                    if (this.field6205 == -1) {
                        var14 = (this.field6187 * var10 + this.field6197 * var36 + this.field6191 * var8 >> 15) + this.field6185;
                        if (var14 <= this.field6193.field512) {
                            return;
                        }
                        var15 = (this.field6187 * var10 + this.field6197 * var37 + this.field6191 * var9 >> 15) + this.field6185;
                        if (var15 <= this.field6193.field512) {
                            return;
                        }
                        var40 = (this.field6187 * var11 + this.field6197 * var38 + this.field6191 * var9 >> 15) + this.field6185;
                        if (var40 <= this.field6193.field512) {
                            return;
                        }
                        var17 = (this.field6187 * var11 + this.field6197 * var39 + this.field6191 * var8 >> 15) + this.field6185;
                        if (var17 <= this.field6193.field512) {
                            return;
                        }
                    } else {
                        var17 = this.field6205;
                        var40 = this.field6205;
                        var15 = this.field6205;
                        var14 = this.field6205;
                    }
                    var20 = (this.field6198 * var10 + this.field6199 * var36 + this.field6186 * var8 >> 15) + this.field6206;
                    var21 = this.field6193.field498 * var20 / var14 + arg2.field5069;
                    var22 = (this.field6195 * var10 + this.field6203 * var36 + this.field6201 * var8 >> 15) + this.field6202;
                    var23 = this.field6193.field516 * var22 / var14 + arg2.field5075;
                    var24 = (this.field6198 * var10 + this.field6199 * var37 + this.field6186 * var9 >> 15) + this.field6206;
                    var25 = this.field6193.field498 * var24 / var15 + arg2.field5069;
                    var26 = (this.field6195 * var10 + this.field6203 * var37 + this.field6201 * var9 >> 15) + this.field6202;
                    var27 = this.field6193.field516 * var26 / var15 + arg2.field5075;
                    int var41 = (this.field6198 * var11 + this.field6199 * var38 + this.field6186 * var9 >> 15) + this.field6206;
                    var29 = this.field6193.field498 * var41 / var40 + arg2.field5069;
                    int var42 = (this.field6195 * var11 + this.field6203 * var38 + this.field6201 * var9 >> 15) + this.field6202;
                    var31 = this.field6193.field516 * var42 / var40 + arg2.field5075;
                    var32 = (this.field6198 * var11 + this.field6199 * var39 + this.field6186 * var8 >> 15) + this.field6206;
                    var33 = this.field6193.field498 * var32 / var17 + arg2.field5069;
                    var34 = (this.field6195 * var11 + this.field6203 * var39 + this.field6201 * var8 >> 15) + this.field6202;
                    var35 = this.field6193.field516 * var34 / var17 + arg2.field5075;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field5063 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field5072 || var33 > arg2.field5072 || var25 > arg2.field5072;
                    if (var7.field5827 >= 0) {
                        if (this.method2514(this.field6193.field2501.method956(-945, var7.field5827).field1451)) {
                            arg2.field5071 = 100;
                        }
                        arg2.method2153(var31, var35, var27, var29, var33, var25, var7.field5828 & 65535, var7.field5829 & 65535, var7.field5832 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5827);
                        arg2.field5071 = 0;
                    } else {
                        arg2.method2151(var31, var35, var27, var29, var33, var25, var7.field5828 & 65535, var7.field5829 & 65535, var7.field5832 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field5063 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field5072 || var25 > arg2.field5072 || var33 > arg2.field5072;
                    if (var7.field5827 >= 0) {
                        if (this.method2514(this.field6193.field2501.method956(-945, var7.field5827).field1451)) {
                            arg2.field5071 = 100;
                        }
                        arg2.method2153(var23, var27, var35, var21, var25, var33, var7.field5833 & 65535, var7.field5832 & 65535, var7.field5829 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5827);
                        arg2.field5071 = 0;
                        return;
                    }
                    arg2.method2151(var23, var27, var35, var21, var25, var33, var7.field5833 & 65535, var7.field5832 & 65535, var7.field5829 & 65535);
                }
            }
        } else {
            class67 var43 = this.field6194[arg0][arg1];
            if (var43 != null) {
                if (this.field6205 == -1) {
                    for (int var44 = 0; var44 < var43.field1161; ++var44) {
                        int var45 = (arg0 << super.field679) + var43.field1153[var44];
                        short var46 = var43.field1156[var44];
                        int var47 = (arg1 << super.field679) + var43.field1163[var44];
                        int var48 = (this.field6187 * var47 + this.field6197 * var46 + this.field6191 * var45 >> 15) + this.field6185;
                        if (var48 <= this.field6193.field512) {
                            return;
                        }
                        int var49 = (this.field6198 * var47 + this.field6199 * var46 + this.field6186 * var45 >> 15) + this.field6206;
                        int var50 = (this.field6195 * var47 + this.field6203 * var46 + this.field6201 * var45 >> 15) + this.field6202;
                        arg3[var44] = this.field6193.field498 * var49 / var48 + arg2.field5069;
                        arg4[var44] = this.field6193.field516 * var50 / var48 + arg2.field5075;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field1161; ++var51) {
                        int var91 = (arg0 << super.field679) + var43.field1153[var51];
                        short var92 = var43.field1156[var51];
                        int var93 = (arg1 << super.field679) + var43.field1163[var51];
                        int var94 = (this.field6198 * var93 + this.field6199 * var92 + this.field6186 * var91 >> 15) + this.field6206;
                        int var95 = (this.field6195 * var93 + this.field6203 * var92 + this.field6201 * var91 >> 15) + this.field6202;
                        arg3[var51] = this.field6193.field498 * var94 / this.field6205 + arg2.field5069;
                        arg4[var51] = this.field6193.field516 * var95 / this.field6205 + arg2.field5075;
                    }
                }
                if (var43.field1162 != null) {
                    int var52 = this.field6189[arg0][arg1];
                    int var53 = this.field6189[arg0 + 1][arg1];
                    int var54 = this.field6189[arg0][arg1 + 1];
                    int var55 = super.field676 * arg0;
                    int var56 = super.field676 + var55;
                    int var57 = super.field676 * arg1;
                    int var58 = super.field676 + var57;
                    int var59 = (this.field6198 * var57 + this.field6199 * var52 + this.field6186 * var55 >> 15) + this.field6206;
                    int var60 = (this.field6195 * var57 + this.field6203 * var52 + this.field6201 * var55 >> 15) + this.field6202;
                    int var61 = (this.field6187 * var57 + this.field6197 * var52 + this.field6191 * var55 >> 15) + this.field6185;
                    int var62 = (this.field6198 * var57 + this.field6199 * var53 + this.field6186 * var56 >> 15) + this.field6206;
                    int var63 = (this.field6195 * var57 + this.field6203 * var53 + this.field6201 * var56 >> 15) + this.field6202;
                    int var64 = (this.field6187 * var57 + this.field6197 * var53 + this.field6191 * var56 >> 15) + this.field6185;
                    int var65 = (this.field6198 * var58 + this.field6199 * var54 + this.field6186 * var55 >> 15) + this.field6206;
                    int var66 = (this.field6195 * var58 + this.field6203 * var54 + this.field6201 * var55 >> 15) + this.field6202;
                    int var67 = (this.field6187 * var58 + this.field6197 * var54 + this.field6191 * var55 >> 15) + this.field6185;
                    for (int var68 = 0; var68 < var43.field1154; ++var68) {
                        short var69 = var43.field1155[var68];
                        short var70 = var43.field1160[var68];
                        short var71 = var43.field1152[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field5063 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field5072 || var73 > arg2.field5072 || var74 > arg2.field5072;
                            short var78 = var43.field1162[var68];
                            if (var78 != -1) {
                                if (this.method2514(this.field6193.field2501.method956(-945, var78).field1451)) {
                                    arg2.field5071 = 100;
                                }
                                arg2.method2153(var75, var76, var77, var72, var73, var74, var43.field1157[var69], var43.field1157[var70], var43.field1157[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field5071 = 0;
                            } else {
                                int var79 = var43.field1159[var68];
                                if (var79 != -1) {
                                    arg2.method2151(var75, var76, var77, var72, var73, var74, class164.method1214(var79, var43.field1157[var69], (byte) 47), class164.method1214(var79, var43.field1157[var70], (byte) 47), class164.method1214(var79, var43.field1157[var71], (byte) 47));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field1154; ++var80) {
                    short var81 = var43.field1155[var80];
                    short var82 = var43.field1160[var80];
                    short var83 = var43.field1152[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field1159[var80];
                        if (var90 != -1) {
                            arg2.field5063 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field5072 || var85 > arg2.field5072 || var86 > arg2.field5072;
                            arg2.method2151(var87, var88, var89, var84, var85, var86, class164.method1214(var90, var43.field1157[var81], (byte) 47), class164.method1214(var90, var43.field1157[var82], (byte) 47), class164.method1214(var90, var43.field1157[var83], (byte) 47));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "QA", descriptor = "(III)V", line = 1946)
    public final void method373(int arg0, int arg1, int arg2) {
        if (this.field6188[arg0][arg1] < arg2) {
            this.field6188[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lo;IIII[[I[[II)V", line = 1951)
    public class415(class24 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field6193 = arg0;
        this.field6192 = arg2;
        this.field6189 = arg5;
        this.field6196 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6193.field531 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6193.field500 * var18 + this.field6193.field522 * var17 + this.field6193.field511 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6196[var11][var10] = (byte) var20;
            }
        }
        this.field6188 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "()V", line = 2001)
    public final void method362() {
        this.field6196 = null;
        this.field6188 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III[[ZZ)V", line = 2008)
    public final void method375(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class117 var6 = this.field6193.field519;
        this.field6205 = -1;
        this.field6186 = var6.field1932;
        this.field6199 = var6.field1940;
        this.field6198 = var6.field1931;
        this.field6206 = var6.field1941;
        this.field6201 = var6.field1939;
        this.field6203 = var6.field1936;
        this.field6195 = var6.field1930;
        this.field6202 = var6.field1933;
        this.field6191 = var6.field1937;
        this.field6197 = var6.field1938;
        this.field6187 = var6.field1934;
        this.field6185 = var6.field1935;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)Z", line = 2024)
    private final boolean method2514(int arg0) {
        if ((this.field6192 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "(Lj;IIIIZ)V", line = 2038)
    public final void method366(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "(II)I", line = 2046)
    public final int method376(int arg0, int arg1) {
        return this.field6189[arg0][arg1];
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(IIIIIII[[ZLkp;[I[I)V", line = 2055)
    private final void method2515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class336 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5064 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field6200[var16][var17] != null) {
                        class387 var18 = this.field6200[var16][var17];
                        if (var18.field5827 != -1 && (var18.field5830 & 2) == 0 && var18.field5831 == -1) {
                            int var19 = this.field6193.method246(var18.field5827);
                            arg8.method2151(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class164.method1214(var19, var18.field5828 & 65535, (byte) 47), class164.method1214(var19, var18.field5829 & 65535, (byte) 47), class164.method1214(var19, var18.field5832 & 65535, (byte) 47));
                            arg8.method2151(var15, var15, var15 - var13, var14, var13 + var14, var14, class164.method1214(var19, var18.field5833 & 65535, (byte) 47), class164.method1214(var19, var18.field5832 & 65535, (byte) 47), class164.method1214(var19, var18.field5829 & 65535, (byte) 47));
                        } else if (var18.field5831 == -1) {
                            arg8.method2151(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5828 & 65535, var18.field5829 & 65535, var18.field5832 & 65535);
                            arg8.method2151(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5833 & 65535, var18.field5832 & 65535, var18.field5829 & 65535);
                        } else {
                            int var20 = var18.field5831;
                            arg8.method2151(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2151(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field6194[var16][var17] != null) {
                        class67 var21 = this.field6194[var16][var17];
                        for (int var22 = 0; var22 < var21.field1161; ++var22) {
                            arg9[var22] = var21.field1153[var22] * var13 / super.field676 + var14;
                            arg10[var22] = var15 - var21.field1163[var22] * var13 / super.field676;
                        }
                        for (int var23 = 0; var23 < var21.field1154; ++var23) {
                            short var24 = var21.field1155[var23];
                            short var25 = var21.field1160[var23];
                            short var26 = var21.field1152[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1151 != null && var21.field1151[var23] != -1) {
                                int var33 = var21.field1151[var23];
                                arg8.method2151(var30, var31, var32, var27, var28, var29, class164.method1214(var33, var21.field1157[var24], (byte) 47), class164.method1214(var33, var21.field1157[var25], (byte) 47), class164.method1214(var33, var21.field1157[var26], (byte) 47));
                            } else if (var21.field1162 != null && var21.field1162[var23] != -1) {
                                int var34 = this.field6193.method246(var21.field1162[var23]);
                                arg8.method2151(var30, var31, var32, var27, var28, var29, class164.method1214(var34, var21.field1157[var24], (byte) 47), class164.method1214(var34, var21.field1157[var25], (byte) 47), class164.method1214(var34, var21.field1157[var26], (byte) 47));
                            } else {
                                int var35 = var21.field1159[var23];
                                arg8.method2151(var30, var31, var32, var27, var28, var29, class164.method1214(var35, var21.field1157[var24], (byte) 47), class164.method1214(var35, var21.field1157[var25], (byte) 47), class164.method1214(var35, var21.field1157[var26], (byte) 47));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5064 = true;
    }
}
