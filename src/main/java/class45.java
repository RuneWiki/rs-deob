import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class45 extends class47 {

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "[I")
    private int[] field525;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lco;[IIIII)V", line = 3)
    public class45(class188 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg4, arg5);
        this.field525 = new int[arg4 * arg5];
        int var7 = arg3 - super.field532;
        int var8 = 0;
        for (int var9 = 0; var9 < arg5; ++var9) {
            for (int var10 = 0; var10 < arg4; ++var10) {
                int var11 = arg1[arg2++];
                if (var11 >>> 24 == 255) {
                    int var12 = var11 & 16777215;
                    if (var12 != 0) {
                        this.field525[var8++] = var12;
                    } else {
                        this.field525[var8++] = 1;
                    }
                } else {
                    this.field525[var8++] = 0;
                }
            }
            arg2 += var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lco;[III)V", line = 42)
    public class45(class188 arg0, int[] arg1, int arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field525 = arg1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)V", line = 46)
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (super.field563.method1158()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field563.field2194;
            int var7 = super.field542 + arg0;
            int var8 = super.field556 + arg1;
            int var9 = var6 * var8 + var7;
            int var10 = 0;
            int var11 = super.field538;
            int var12 = super.field532;
            int var13 = var6 - var12;
            int var14 = 0;
            if (var8 < super.field563.field2187) {
                int var15 = super.field563.field2187 - var8;
                var11 -= var15;
                var8 = super.field563.field2187;
                var10 += var12 * var15;
                var9 += var6 * var15;
            }
            if (var8 + var11 > super.field563.field2207) {
                var11 -= var8 + var11 - super.field563.field2207;
            }
            if (var7 < super.field563.field2183) {
                int var16 = super.field563.field2183 - var7;
                var12 -= var16;
                var7 = super.field563.field2183;
                var10 += var16;
                var9 += var16;
                var14 += var16;
                var13 += var16;
            }
            if (var7 + var12 > super.field563.field2186) {
                int var17 = var7 + var12 - super.field563.field2186;
                var12 -= var17;
                var14 += var17;
                var13 += var17;
            }
            if (var12 > 0 && var11 > 0) {
                int[] var18 = super.field563.field2188;
                if (arg4 == 0) {
                    if (arg2 == 0) {
                        for (int var19 = -var11; var19 < 0; ++var19) {
                            int var20 = var9 + var12 - 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field525[var10++];
                                var18[var9++] = this.field525[var10++];
                                var18[var9++] = this.field525[var10++];
                                var18[var9++] = this.field525[var10++];
                            }
                            var20 += 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field525[var10++];
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 == 1) {
                        int var21 = (arg3 & 16711680) >> 16;
                        int var22 = (arg3 & 65280) >> 8;
                        int var23 = arg3 & 255;
                        for (int var24 = -var11; var24 < 0; ++var24) {
                            for (int var25 = -var12; var25 < 0; ++var25) {
                                int var26 = this.field525[var10++];
                                int var27 = (var26 & 16711680) * var21 & -16777216;
                                int var28 = (var26 & 65280) * var22 & 16711680;
                                int var29 = (var26 & 255) * var23 & 65280;
                                var18[var9++] = (var27 | var28 | var29) >>> 8;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var30 = arg3 >>> 24;
                        int var31 = 256 - var30;
                        int var32 = (arg3 & 16711935) * var31 & -16711936;
                        int var33 = (arg3 & 65280) * var31 & 16711680;
                        int var34 = (var32 | var33) >>> 8;
                        for (int var35 = -var11; var35 < 0; ++var35) {
                            for (int var36 = -var12; var36 < 0; ++var36) {
                                int var37 = this.field525[var10++];
                                int var38 = (var37 & 16711935) * var30 & -16711936;
                                int var39 = (var37 & 65280) * var30 & 16711680;
                                var18[var9++] = ((var38 | var39) >>> 8) + var34;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    }
                } else if (arg4 == 1) {
                    if (arg2 == 0) {
                        for (int var40 = -var11; var40 < 0; ++var40) {
                            int var41 = var9 + var12 - 3;
                            while (var9 < var41) {
                                int var43 = this.field525[var10++];
                                if (var43 != 0) {
                                    var18[var9++] = var43;
                                } else {
                                    ++var9;
                                }
                                int var44 = this.field525[var10++];
                                if (var44 != 0) {
                                    var18[var9++] = var44;
                                } else {
                                    ++var9;
                                }
                                int var45 = this.field525[var10++];
                                if (var45 != 0) {
                                    var18[var9++] = var45;
                                } else {
                                    ++var9;
                                }
                                int var46 = this.field525[var10++];
                                if (var46 != 0) {
                                    var18[var9++] = var46;
                                } else {
                                    ++var9;
                                }
                            }
                            var41 += 3;
                            while (var9 < var41) {
                                int var42 = this.field525[var10++];
                                if (var42 != 0) {
                                    var18[var9++] = var42;
                                } else {
                                    ++var9;
                                }
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 == 1) {
                        if ((arg3 & 16777215) == 16777215) {
                            int var47 = arg3 >>> 24;
                            int var48 = 256 - var47;
                            for (int var49 = -var11; var49 < 0; ++var49) {
                                for (int var50 = -var12; var50 < 0; ++var50) {
                                    int var51 = this.field525[var10++];
                                    if (var51 != 0) {
                                        int var52 = var18[var9];
                                        var18[var9++] = ((var51 & 16711935) * var47 + (var52 & 16711935) * var48 & -16711936) + ((var51 & 65280) * var47 + (var52 & 65280) * var48 & 16711680) >> 8;
                                    } else {
                                        ++var9;
                                    }
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        } else {
                            int var53 = (arg3 & 16711680) >> 16;
                            int var54 = (arg3 & 65280) >> 8;
                            int var55 = arg3 & 255;
                            int var56 = arg3 >>> 24;
                            int var57 = 256 - var56;
                            for (int var58 = -var11; var58 < 0; ++var58) {
                                for (int var59 = -var12; var59 < 0; ++var59) {
                                    int var60 = this.field525[var10++];
                                    if (var60 != 0) {
                                        if (var56 != 255) {
                                            int var61 = (var60 & 16711680) * var53 & -16777216;
                                            int var62 = (var60 & 65280) * var54 & 16711680;
                                            int var63 = (var60 & 255) * var55 & 65280;
                                            int var64 = (var61 | var62 | var63) >>> 8;
                                            int var65 = var18[var9];
                                            var18[var9++] = ((var64 & 16711935) * var56 + (var65 & 16711935) * var57 & -16711936) + ((var64 & 65280) * var56 + (var65 & 65280) * var57 & 16711680) >> 8;
                                        } else {
                                            int var66 = (var60 & 16711680) * var53 & -16777216;
                                            int var67 = (var60 & 65280) * var54 & 16711680;
                                            int var68 = (var60 & 255) * var55 & 65280;
                                            var18[var9++] = (var66 | var67 | var68) >>> 8;
                                        }
                                    } else {
                                        ++var9;
                                    }
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        }
                    } else if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var69 = arg3 >>> 24;
                        int var70 = 256 - var69;
                        int var71 = (arg3 & 16711935) * var70 & -16711936;
                        int var72 = (arg3 & 65280) * var70 & 16711680;
                        int var73 = (var71 | var72) >>> 8;
                        for (int var74 = -var11; var74 < 0; ++var74) {
                            for (int var75 = -var12; var75 < 0; ++var75) {
                                int var76 = this.field525[var10++];
                                if (var76 != 0) {
                                    int var77 = (var76 & 16711935) * var69 & -16711936;
                                    int var78 = (var76 & 65280) * var69 & 16711680;
                                    var18[var9++] = ((var77 | var78) >>> 8) + var73;
                                } else {
                                    ++var9;
                                }
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else if (arg2 == 0) {
                    for (int var79 = -var11; var79 < 0; ++var79) {
                        for (int var80 = -var12; var80 < 0; ++var80) {
                            int var81 = this.field525[var10++];
                            if (var81 != 0) {
                                int var82 = var18[var9];
                                int var83 = var81 + var82;
                                int var84 = (var81 & 16711935) + (var82 & 16711935);
                                int var85 = (var83 - var84 & 65536) + (var84 & 16777472);
                                var18[var9++] = var83 - var85 | var85 - (var85 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 == 1) {
                    int var86 = (arg3 & 16711680) >> 16;
                    int var87 = (arg3 & 65280) >> 8;
                    int var88 = arg3 & 255;
                    for (int var89 = -var11; var89 < 0; ++var89) {
                        for (int var90 = -var12; var90 < 0; ++var90) {
                            int var91 = this.field525[var10++];
                            if (var91 != 0) {
                                int var92 = (var91 & 16711680) * var86 & -16777216;
                                int var93 = (var91 & 65280) * var87 & 16711680;
                                int var94 = (var91 & 255) * var88 & 65280;
                                int var95 = (var92 | var93 | var94) >>> 8;
                                int var96 = var18[var9];
                                int var97 = var95 + var96;
                                int var98 = (var95 & 16711935) + (var96 & 16711935);
                                int var99 = (var97 - var98 & 65536) + (var98 & 16777472);
                                var18[var9++] = var97 - var99 | var99 - (var99 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var100 = arg3 >>> 24;
                    int var101 = 256 - var100;
                    int var102 = (arg3 & 16711935) * var101 & -16711936;
                    int var103 = (arg3 & 65280) * var101 & 16711680;
                    int var104 = (var102 | var103) >>> 8;
                    for (int var105 = -var11; var105 < 0; ++var105) {
                        for (int var106 = -var12; var106 < 0; ++var106) {
                            int var107 = this.field525[var10++];
                            if (var107 != 0) {
                                int var108 = (var107 & 16711935) * var100 & -16711936;
                                int var109 = (var107 & 65280) * var100 & 16711680;
                                int var110 = ((var108 | var109) >>> 8) + var104;
                                int var111 = var18[var9];
                                int var112 = var110 + var111;
                                int var113 = (var110 & 16711935) + (var111 & 16711935);
                                int var114 = (var112 - var113 & 65536) + (var113 & 16777472);
                                var18[var9++] = var112 - var114 | var114 - (var114 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIIIIII)V", line = 588)
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (super.field563.method1158()) {
            throw new IllegalStateException();
        } else if (arg2 > 0 && arg3 > 0) {
            int var8 = 0;
            int var9 = 0;
            int var10 = super.field563.field2194;
            int var11 = super.field542 + super.field532 + super.field536;
            int var12 = super.field556 + super.field538 + super.field545;
            int var13 = (var11 << 16) / arg2;
            int var14 = (var12 << 16) / arg3;
            if (super.field542 > 0) {
                int var15 = ((super.field542 << 16) + var13 - 1) / var13;
                arg0 += var15;
                var8 += var13 * var15 - (super.field542 << 16);
            }
            if (super.field556 > 0) {
                int var16 = ((super.field556 << 16) + var14 - 1) / var14;
                arg1 += var16;
                var9 += var14 * var16 - (super.field556 << 16);
            }
            if (super.field532 < var11) {
                arg2 = ((super.field532 << 16) - var8 + var13 - 1) / var13;
            }
            if (super.field538 < var12) {
                arg3 = ((super.field538 << 16) - var9 + var14 - 1) / var14;
            }
            int var17 = arg1 * var10 + arg0;
            int var18 = var10 - arg2;
            if (arg1 + arg3 > super.field563.field2207) {
                arg3 -= arg1 + arg3 - super.field563.field2207;
            }
            if (arg1 < super.field563.field2187) {
                int var19 = super.field563.field2187 - arg1;
                arg3 -= var19;
                var17 += var10 * var19;
                var9 += var14 * var19;
            }
            if (arg0 + arg2 > super.field563.field2186) {
                int var20 = arg0 + arg2 - super.field563.field2186;
                arg2 -= var20;
                var18 += var20;
            }
            if (arg0 < super.field563.field2183) {
                int var21 = super.field563.field2183 - arg0;
                arg2 -= var21;
                var17 += var21;
                var8 += var13 * var21;
                var18 += var21;
            }
            int[] var22 = super.field563.field2188;
            if (arg6 == 0) {
                if (arg4 == 0) {
                    int var23 = var8;
                    for (int var24 = -arg3; var24 < 0; ++var24) {
                        int var25 = (var9 >> 16) * super.field532;
                        for (int var26 = -arg2; var26 < 0; ++var26) {
                            var22[var17++] = this.field525[(var8 >> 16) + var25];
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var23;
                        var17 += var18;
                    }
                } else if (arg4 == 1) {
                    int var27 = (arg5 & 16711680) >> 16;
                    int var28 = (arg5 & 65280) >> 8;
                    int var29 = arg5 & 255;
                    int var30 = var8;
                    for (int var31 = -arg3; var31 < 0; ++var31) {
                        int var32 = (var9 >> 16) * super.field532;
                        for (int var33 = -arg2; var33 < 0; ++var33) {
                            int var34 = this.field525[(var8 >> 16) + var32];
                            int var35 = (var34 & 16711680) * var27 & -16777216;
                            int var36 = (var34 & 65280) * var28 & 16711680;
                            int var37 = (var34 & 255) * var29 & 65280;
                            var22[var17++] = (var35 | var36 | var37) >>> 8;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var30;
                        var17 += var18;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var38 = arg5 >>> 24;
                    int var39 = 256 - var38;
                    int var40 = (arg5 & 16711935) * var39 & -16711936;
                    int var41 = (arg5 & 65280) * var39 & 16711680;
                    int var42 = (var40 | var41) >>> 8;
                    int var43 = var8;
                    for (int var44 = -arg3; var44 < 0; ++var44) {
                        int var45 = (var9 >> 16) * super.field532;
                        for (int var46 = -arg2; var46 < 0; ++var46) {
                            int var47 = this.field525[(var8 >> 16) + var45];
                            int var48 = (var47 & 16711935) * var38 & -16711936;
                            int var49 = (var47 & 65280) * var38 & 16711680;
                            var22[var17++] = ((var48 | var49) >>> 8) + var42;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var43;
                        var17 += var18;
                    }
                }
            } else if (arg6 == 1) {
                if (arg4 == 0) {
                    int var50 = var8;
                    for (int var51 = -arg3; var51 < 0; ++var51) {
                        int var52 = (var9 >> 16) * super.field532;
                        for (int var53 = -arg2; var53 < 0; ++var53) {
                            int var54 = this.field525[(var8 >> 16) + var52];
                            if (var54 != 0) {
                                var22[var17++] = var54;
                            } else {
                                ++var17;
                            }
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var50;
                        var17 += var18;
                    }
                } else if (arg4 == 1) {
                    int var55 = var8;
                    if ((arg5 & 16777215) == 16777215) {
                        int var56 = arg5 >>> 24;
                        int var57 = 256 - var56;
                        for (int var58 = -arg3; var58 < 0; ++var58) {
                            int var59 = (var9 >> 16) * super.field532;
                            for (int var60 = -arg2; var60 < 0; ++var60) {
                                int var61 = this.field525[(var8 >> 16) + var59];
                                if (var61 != 0) {
                                    int var62 = var22[var17];
                                    var22[var17++] = ((var61 & 16711935) * var56 + (var62 & 16711935) * var57 & -16711936) + ((var61 & 65280) * var56 + (var62 & 65280) * var57 & 16711680) >> 8;
                                } else {
                                    ++var17;
                                }
                                var8 += var13;
                            }
                            var9 += var14;
                            var8 = var55;
                            var17 += var18;
                        }
                    } else {
                        int var63 = (arg5 & 16711680) >> 16;
                        int var64 = (arg5 & 65280) >> 8;
                        int var65 = arg5 & 255;
                        int var66 = arg5 >>> 24;
                        int var67 = 256 - var66;
                        for (int var68 = -arg3; var68 < 0; ++var68) {
                            int var69 = (var9 >> 16) * super.field532;
                            for (int var70 = -arg2; var70 < 0; ++var70) {
                                int var71 = this.field525[(var8 >> 16) + var69];
                                if (var71 != 0) {
                                    if (var66 != 255) {
                                        int var72 = (var71 & 16711680) * var63 & -16777216;
                                        int var73 = (var71 & 65280) * var64 & 16711680;
                                        int var74 = (var71 & 255) * var65 & 65280;
                                        int var75 = (var72 | var73 | var74) >>> 8;
                                        int var76 = var22[var17];
                                        var22[var17++] = ((var75 & 16711935) * var66 + (var76 & 16711935) * var67 & -16711936) + ((var75 & 65280) * var66 + (var76 & 65280) * var67 & 16711680) >> 8;
                                    } else {
                                        int var77 = (var71 & 16711680) * var63 & -16777216;
                                        int var78 = (var71 & 65280) * var64 & 16711680;
                                        int var79 = (var71 & 255) * var65 & 65280;
                                        var22[var17++] = (var77 | var78 | var79) >>> 8;
                                    }
                                } else {
                                    ++var17;
                                }
                                var8 += var13;
                            }
                            var9 += var14;
                            var8 = var55;
                            var17 += var18;
                        }
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var80 = arg5 >>> 24;
                    int var81 = 256 - var80;
                    int var82 = (arg5 & 16711935) * var81 & -16711936;
                    int var83 = (arg5 & 65280) * var81 & 16711680;
                    int var84 = (var82 | var83) >>> 8;
                    int var85 = var8;
                    for (int var86 = -arg3; var86 < 0; ++var86) {
                        int var87 = (var9 >> 16) * super.field532;
                        for (int var88 = -arg2; var88 < 0; ++var88) {
                            int var89 = this.field525[(var8 >> 16) + var87];
                            if (var89 != 0) {
                                int var90 = (var89 & 16711935) * var80 & -16711936;
                                int var91 = (var89 & 65280) * var80 & 16711680;
                                var22[var17++] = ((var90 | var91) >>> 8) + var84;
                            } else {
                                ++var17;
                            }
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var85;
                        var17 += var18;
                    }
                }
            } else if (arg6 != 2) {
                throw new IllegalArgumentException();
            } else if (arg4 == 0) {
                int var92 = var8;
                for (int var93 = -arg3; var93 < 0; ++var93) {
                    int var94 = (var9 >> 16) * super.field532;
                    for (int var95 = -arg2; var95 < 0; ++var95) {
                        int var96 = this.field525[(var8 >> 16) + var94];
                        if (var96 != 0) {
                            int var97 = var22[var17];
                            int var98 = var96 + var97;
                            int var99 = (var96 & 16711935) + (var97 & 16711935);
                            int var100 = (var98 - var99 & 65536) + (var99 & 16777472);
                            var22[var17++] = var98 - var100 | var100 - (var100 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var92;
                    var17 += var18;
                }
            } else if (arg4 == 1) {
                int var101 = var8;
                int var102 = (arg5 & 16711680) >> 16;
                int var103 = (arg5 & 65280) >> 8;
                int var104 = arg5 & 255;
                for (int var105 = -arg3; var105 < 0; ++var105) {
                    int var106 = (var9 >> 16) * super.field532;
                    for (int var107 = -arg2; var107 < 0; ++var107) {
                        int var108 = this.field525[(var8 >> 16) + var106];
                        if (var108 != 0) {
                            int var109 = (var108 & 16711680) * var102 & -16777216;
                            int var110 = (var108 & 65280) * var103 & 16711680;
                            int var111 = (var108 & 255) * var104 & 65280;
                            int var112 = (var109 | var110 | var111) >>> 8;
                            int var113 = var22[var17];
                            int var114 = var112 + var113;
                            int var115 = (var112 & 16711935) + (var113 & 16711935);
                            int var116 = (var114 - var115 & 65536) + (var115 & 16777472);
                            var22[var17++] = var114 - var116 | var116 - (var116 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var101;
                    var17 += var18;
                }
            } else if (arg4 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var117 = arg5 >>> 24;
                int var118 = 256 - var117;
                int var119 = (arg5 & 16711935) * var118 & -16711936;
                int var120 = (arg5 & 65280) * var118 & 16711680;
                int var121 = (var119 | var120) >>> 8;
                int var122 = var8;
                for (int var123 = -arg3; var123 < 0; ++var123) {
                    int var124 = (var9 >> 16) * super.field532;
                    for (int var125 = -arg2; var125 < 0; ++var125) {
                        int var126 = this.field525[(var8 >> 16) + var124];
                        if (var126 != 0) {
                            int var127 = (var126 & 16711935) * var117 & -16711936;
                            int var128 = (var126 & 65280) * var117 & 16711680;
                            int var129 = ((var127 | var128) >>> 8) + var121;
                            int var130 = var22[var17];
                            int var131 = var129 + var130;
                            int var132 = (var129 & 16711935) + (var130 & 16711935);
                            int var133 = (var131 - var132 & 65536) + (var132 & 16777472);
                            var22[var17++] = var131 - var133 | var133 - (var133 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var122;
                    var17 += var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([I[III)V", line = 1173)
    public final void method169(int[] arg0, int[] arg1, int arg2, int arg3) {
        int[] var5 = super.field563.field2188;
        if (class47.field552 == 0) {
            if (class47.field543 == 0) {
                int var6 = class47.field551;
                while (var6 < 0) {
                    int var7 = arg3 + var6;
                    if (var7 >= 0) {
                        if (var7 >= arg0.length) {
                            return;
                        }
                        int var8 = class47.field560;
                        int var9 = class47.field559;
                        int var10 = class47.field554;
                        int var11 = class47.field546;
                        if (var9 >= 0 && var10 >= 0 && var9 - (super.field532 << 12) < 0 && var10 - (super.field538 << 12) < 0) {
                            int var12 = arg0[var7] - arg2;
                            int var13 = -arg1[var7];
                            int var14 = var12 - (var8 - class47.field560);
                            if (var14 > 0) {
                                var8 += var14;
                                var11 += var14;
                                var9 += class47.field552 * var14;
                                var10 += class47.field543 * var14;
                            } else {
                                var13 -= var14;
                            }
                            if (var11 < var13) {
                                var11 = var13;
                            }
                            while (var11 < 0) {
                                int var15 = this.field525[(var9 >> 12) + (var10 >> 12) * super.field532];
                                if (var15 != 0) {
                                    var5[var8++] = var15;
                                } else {
                                    ++var8;
                                }
                                ++var11;
                            }
                        }
                    }
                    ++var6;
                    class47.field560 += class47.field558;
                }
            } else if (class47.field543 < 0) {
                int var16 = class47.field551;
                while (var16 < 0) {
                    int var17 = arg3 + var16;
                    if (var17 >= 0) {
                        if (var17 >= arg0.length) {
                            return;
                        }
                        int var18 = class47.field560;
                        int var19 = class47.field559;
                        int var20 = class47.field554 + class47.field541;
                        int var21 = class47.field546;
                        if (var19 >= 0 && var19 - (super.field532 << 12) < 0) {
                            int var22;
                            if ((var22 = var20 - (super.field538 << 12)) >= 0) {
                                int var23 = (class47.field543 - var22) / class47.field543;
                                var21 += var23;
                                var20 += class47.field543 * var23;
                                var18 += var23;
                            }
                            int var24;
                            if ((var24 = (var20 - class47.field543) / class47.field543) > var21) {
                                var21 = var24;
                            }
                            int var25 = arg0[var17] - arg2;
                            int var26 = -arg1[var17];
                            int var27 = var25 - (var18 - class47.field560);
                            if (var27 > 0) {
                                var18 += var27;
                                var21 += var27;
                                var19 += class47.field552 * var27;
                                var20 += class47.field543 * var27;
                            } else {
                                var26 -= var27;
                            }
                            if (var21 < var26) {
                                var21 = var26;
                            }
                            while (var21 < 0) {
                                int var28 = this.field525[(var19 >> 12) + (var20 >> 12) * super.field532];
                                if (var28 != 0) {
                                    var5[var18++] = var28;
                                } else {
                                    ++var18;
                                }
                                var20 += class47.field543;
                                ++var21;
                            }
                        }
                    }
                    ++var16;
                    class47.field559 += class47.field533;
                    class47.field560 += class47.field558;
                }
            } else {
                int var29 = class47.field551;
                while (var29 < 0) {
                    int var30 = arg3 + var29;
                    if (var30 >= 0) {
                        if (var30 >= arg0.length) {
                            return;
                        }
                        int var31 = class47.field560;
                        int var32 = class47.field559;
                        int var33 = class47.field554 + class47.field541;
                        int var34 = class47.field546;
                        if (var32 >= 0 && var32 - (super.field532 << 12) < 0) {
                            if (var33 < 0) {
                                int var35 = (class47.field543 - 1 - var33) / class47.field543;
                                var34 += var35;
                                var33 += class47.field543 * var35;
                                var31 += var35;
                            }
                            int var36;
                            if ((var36 = (var33 + 1 - (super.field538 << 12) - class47.field543) / class47.field543) > var34) {
                                var34 = var36;
                            }
                            int var37 = arg0[var30] - arg2;
                            int var38 = -arg1[var30];
                            int var39 = var37 - (var31 - class47.field560);
                            if (var39 > 0) {
                                var31 += var39;
                                var34 += var39;
                                var32 += class47.field552 * var39;
                                var33 += class47.field543 * var39;
                            } else {
                                var38 -= var39;
                            }
                            if (var34 < var38) {
                                var34 = var38;
                            }
                            while (var34 < 0) {
                                int var40 = this.field525[(var32 >> 12) + (var33 >> 12) * super.field532];
                                if (var40 != 0) {
                                    var5[var31++] = var40;
                                } else {
                                    ++var31;
                                }
                                var33 += class47.field543;
                                ++var34;
                            }
                        }
                    }
                    ++var29;
                    class47.field559 += class47.field533;
                    class47.field560 += class47.field558;
                }
            }
        } else if (class47.field552 < 0) {
            if (class47.field543 == 0) {
                int var41 = class47.field551;
                while (var41 < 0) {
                    int var42 = arg3 + var41;
                    if (var42 >= 0) {
                        if (var42 >= arg0.length) {
                            return;
                        }
                        int var43 = class47.field560;
                        int var44 = class47.field559 + class47.field553;
                        int var45 = class47.field554;
                        int var46 = class47.field546;
                        if (var45 >= 0 && var45 - (super.field538 << 12) < 0) {
                            int var47;
                            if ((var47 = var44 - (super.field532 << 12)) >= 0) {
                                int var48 = (class47.field552 - var47) / class47.field552;
                                var46 += var48;
                                var44 += class47.field552 * var48;
                                var43 += var48;
                            }
                            int var49;
                            if ((var49 = (var44 - class47.field552) / class47.field552) > var46) {
                                var46 = var49;
                            }
                            int var50 = arg0[var42] - arg2;
                            int var51 = -arg1[var42];
                            int var52 = var50 - (var43 - class47.field560);
                            if (var52 > 0) {
                                var43 += var52;
                                var46 += var52;
                                var44 += class47.field552 * var52;
                                var45 += class47.field543 * var52;
                            } else {
                                var51 -= var52;
                            }
                            if (var46 < var51) {
                                var46 = var51;
                            }
                            while (var46 < 0) {
                                int var53 = this.field525[(var44 >> 12) + (var45 >> 12) * super.field532];
                                if (var53 != 0) {
                                    var5[var43++] = var53;
                                } else {
                                    ++var43;
                                }
                                var44 += class47.field552;
                                ++var46;
                            }
                        }
                    }
                    ++var41;
                    class47.field554 += class47.field549;
                    class47.field560 += class47.field558;
                }
            } else if (class47.field543 < 0) {
                int var54 = class47.field551;
                while (var54 < 0) {
                    int var55 = arg3 + var54;
                    if (var55 >= 0) {
                        if (var55 >= arg0.length) {
                            return;
                        }
                        int var56 = class47.field560;
                        int var57 = class47.field559 + class47.field553;
                        int var58 = class47.field554 + class47.field541;
                        int var59 = class47.field546;
                        int var60;
                        if ((var60 = var57 - (super.field532 << 12)) >= 0) {
                            int var61 = (class47.field552 - var60) / class47.field552;
                            var59 += var61;
                            var57 += class47.field552 * var61;
                            var58 += class47.field543 * var61;
                            var56 += var61;
                        }
                        int var62;
                        if ((var62 = (var57 - class47.field552) / class47.field552) > var59) {
                            var59 = var62;
                        }
                        int var63;
                        if ((var63 = var58 - (super.field538 << 12)) >= 0) {
                            int var64 = (class47.field543 - var63) / class47.field543;
                            var59 += var64;
                            var57 += class47.field552 * var64;
                            var58 += class47.field543 * var64;
                            var56 += var64;
                        }
                        int var65;
                        if ((var65 = (var58 - class47.field543) / class47.field543) > var59) {
                            var59 = var65;
                        }
                        int var66 = arg0[var55] - arg2;
                        int var67 = -arg1[var55];
                        int var68 = var66 - (var56 - class47.field560);
                        if (var68 > 0) {
                            var56 += var68;
                            var59 += var68;
                            var57 += class47.field552 * var68;
                            var58 += class47.field543 * var68;
                        } else {
                            var67 -= var68;
                        }
                        if (var59 < var67) {
                            var59 = var67;
                        }
                        while (var59 < 0) {
                            int var69 = this.field525[(var57 >> 12) + (var58 >> 12) * super.field532];
                            if (var69 != 0) {
                                var5[var56++] = var69;
                            } else {
                                ++var56;
                            }
                            var57 += class47.field552;
                            var58 += class47.field543;
                            ++var59;
                        }
                    }
                    ++var54;
                    class47.field559 += class47.field533;
                    class47.field554 += class47.field549;
                    class47.field560 += class47.field558;
                }
            } else {
                int var70 = class47.field551;
                while (var70 < 0) {
                    int var71 = arg3 + var70;
                    if (var71 >= 0) {
                        if (var71 >= arg0.length) {
                            return;
                        }
                        int var72 = class47.field560;
                        int var73 = class47.field559 + class47.field553;
                        int var74 = class47.field554 + class47.field541;
                        int var75 = class47.field546;
                        int var76;
                        if ((var76 = var73 - (super.field532 << 12)) >= 0) {
                            int var77 = (class47.field552 - var76) / class47.field552;
                            var75 += var77;
                            var73 += class47.field552 * var77;
                            var74 += class47.field543 * var77;
                            var72 += var77;
                        }
                        int var78;
                        if ((var78 = (var73 - class47.field552) / class47.field552) > var75) {
                            var75 = var78;
                        }
                        if (var74 < 0) {
                            int var79 = (class47.field543 - 1 - var74) / class47.field543;
                            var75 += var79;
                            var73 += class47.field552 * var79;
                            var74 += class47.field543 * var79;
                            var72 += var79;
                        }
                        int var80;
                        if ((var80 = (var74 + 1 - (super.field538 << 12) - class47.field543) / class47.field543) > var75) {
                            var75 = var80;
                        }
                        int var81 = arg0[var71] - arg2;
                        int var82 = -arg1[var71];
                        int var83 = var81 - (var72 - class47.field560);
                        if (var83 > 0) {
                            var72 += var83;
                            var75 += var83;
                            var73 += class47.field552 * var83;
                            var74 += class47.field543 * var83;
                        } else {
                            var82 -= var83;
                        }
                        if (var75 < var82) {
                            var75 = var82;
                        }
                        while (var75 < 0) {
                            int var84 = this.field525[(var73 >> 12) + (var74 >> 12) * super.field532];
                            if (var84 != 0) {
                                var5[var72++] = var84;
                            } else {
                                ++var72;
                            }
                            var73 += class47.field552;
                            var74 += class47.field543;
                            ++var75;
                        }
                    }
                    ++var70;
                    class47.field559 += class47.field533;
                    class47.field554 += class47.field549;
                    class47.field560 += class47.field558;
                }
            }
        } else if (class47.field543 == 0) {
            int var85 = class47.field551;
            while (var85 < 0) {
                int var86 = arg3 + var85;
                if (var86 >= 0) {
                    if (var86 >= arg0.length) {
                        return;
                    }
                    int var87 = class47.field560;
                    int var88 = class47.field559 + class47.field553;
                    int var89 = class47.field554;
                    int var90 = class47.field546;
                    if (var89 >= 0 && var89 - (super.field538 << 12) < 0) {
                        if (var88 < 0) {
                            int var91 = (class47.field552 - 1 - var88) / class47.field552;
                            var90 += var91;
                            var88 += class47.field552 * var91;
                            var87 += var91;
                        }
                        int var92;
                        if ((var92 = (var88 + 1 - (super.field532 << 12) - class47.field552) / class47.field552) > var90) {
                            var90 = var92;
                        }
                        int var93 = arg0[var86] - arg2;
                        int var94 = -arg1[var86];
                        int var95 = var93 - (var87 - class47.field560);
                        if (var95 > 0) {
                            var87 += var95;
                            var90 += var95;
                            var88 += class47.field552 * var95;
                            var89 += class47.field543 * var95;
                        } else {
                            var94 -= var95;
                        }
                        if (var90 < var94) {
                            var90 = var94;
                        }
                        while (var90 < 0) {
                            int var96 = this.field525[(var88 >> 12) + (var89 >> 12) * super.field532];
                            if (var96 != 0) {
                                var5[var87++] = var96;
                            } else {
                                ++var87;
                            }
                            var88 += class47.field552;
                            ++var90;
                        }
                    }
                }
                ++var85;
                class47.field559 += class47.field533;
                class47.field554 += class47.field549;
                class47.field560 += class47.field558;
            }
        } else if (class47.field543 < 0) {
            int var97 = class47.field551;
            while (var97 < 0) {
                int var98 = arg3 + var97;
                if (var98 >= 0) {
                    if (var98 >= arg0.length) {
                        return;
                    }
                    int var99 = class47.field560;
                    int var100 = class47.field559 + class47.field553;
                    int var101 = class47.field554 + class47.field541;
                    int var102 = class47.field546;
                    if (var100 < 0) {
                        int var103 = (class47.field552 - 1 - var100) / class47.field552;
                        var102 += var103;
                        var100 += class47.field552 * var103;
                        var101 += class47.field543 * var103;
                        var99 += var103;
                    }
                    int var104;
                    if ((var104 = (var100 + 1 - (super.field532 << 12) - class47.field552) / class47.field552) > var102) {
                        var102 = var104;
                    }
                    int var105;
                    if ((var105 = var101 - (super.field538 << 12)) >= 0) {
                        int var106 = (class47.field543 - var105) / class47.field543;
                        var102 += var106;
                        var100 += class47.field552 * var106;
                        var101 += class47.field543 * var106;
                        var99 += var106;
                    }
                    int var107;
                    if ((var107 = (var101 - class47.field543) / class47.field543) > var102) {
                        var102 = var107;
                    }
                    int var108 = arg0[var98] - arg2;
                    int var109 = -arg1[var98];
                    int var110 = var108 - (var99 - class47.field560);
                    if (var110 > 0) {
                        var99 += var110;
                        var102 += var110;
                        var100 += class47.field552 * var110;
                        var101 += class47.field543 * var110;
                    } else {
                        var109 -= var110;
                    }
                    if (var102 < var109) {
                        var102 = var109;
                    }
                    while (var102 < 0) {
                        int var111 = this.field525[(var100 >> 12) + (var101 >> 12) * super.field532];
                        if (var111 != 0) {
                            var5[var99++] = var111;
                        } else {
                            ++var99;
                        }
                        var100 += class47.field552;
                        var101 += class47.field543;
                        ++var102;
                    }
                }
                ++var97;
                class47.field559 += class47.field533;
                class47.field554 += class47.field549;
                class47.field560 += class47.field558;
            }
        } else {
            int var112 = class47.field551;
            while (var112 < 0) {
                int var113 = arg3 + var112;
                if (var113 >= 0) {
                    if (var113 >= arg0.length) {
                        return;
                    }
                    int var114 = class47.field560;
                    int var115 = class47.field559 + class47.field553;
                    int var116 = class47.field554 + class47.field541;
                    int var117 = class47.field546;
                    if (var115 < 0) {
                        int var118 = (class47.field552 - 1 - var115) / class47.field552;
                        var117 += var118;
                        var115 += class47.field552 * var118;
                        var116 += class47.field543 * var118;
                        var114 += var118;
                    }
                    int var119;
                    if ((var119 = (var115 + 1 - (super.field532 << 12) - class47.field552) / class47.field552) > var117) {
                        var117 = var119;
                    }
                    if (var116 < 0) {
                        int var120 = (class47.field543 - 1 - var116) / class47.field543;
                        var117 += var120;
                        var115 += class47.field552 * var120;
                        var116 += class47.field543 * var120;
                        var114 += var120;
                    }
                    int var121;
                    if ((var121 = (var116 + 1 - (super.field538 << 12) - class47.field543) / class47.field543) > var117) {
                        var117 = var121;
                    }
                    int var122 = arg0[var113] - arg2;
                    int var123 = -arg1[var113];
                    int var124 = var122 - (var114 - class47.field560);
                    if (var124 > 0) {
                        var114 += var124;
                        var117 += var124;
                        var115 += class47.field552 * var124;
                        var116 += class47.field543 * var124;
                    } else {
                        var123 -= var124;
                    }
                    if (var117 < var123) {
                        var117 = var123;
                    }
                    while (var117 < 0) {
                        int var125 = this.field525[(var115 >> 12) + (var116 >> 12) * super.field532];
                        if (var125 != 0) {
                            var5[var114++] = var125;
                        } else {
                            ++var114;
                        }
                        var115 += class47.field552;
                        var116 += class47.field543;
                        ++var117;
                    }
                }
                ++var112;
                class47.field559 += class47.field533;
                class47.field554 += class47.field549;
                class47.field560 += class47.field558;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIII)V", line = 1920)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int[] var7 = super.field563.field2188;
        for (int var8 = 0; var8 < arg3; ++var8) {
            int var9 = (arg1 + var8) * super.field532 + arg0;
            int var10 = (arg5 + var8) * super.field563.field2194 + arg4;
            for (int var11 = 0; var11 < arg2; ++var11) {
                this.field525[var9 + var11] = var7[var10 + var11];
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILem;II)V", line = 1944)
    public final void method165(int arg0, int arg1, class423 arg2, int arg3, int arg4) {
        if (super.field563.method1158()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field542 + arg0;
            int var7 = super.field556 + arg1;
            int var8 = 0;
            int var9 = super.field563.field2194;
            int var10 = super.field532;
            int var11 = super.field538;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var7 * var9 + var6;
            if (var7 < super.field563.field2187) {
                int var15 = super.field563.field2187 - var7;
                var11 -= var15;
                var7 = super.field563.field2187;
                var8 += var10 * var15;
                var14 += var9 * var15;
            }
            if (var7 + var11 > super.field563.field2207) {
                var11 -= var7 + var11 - super.field563.field2207;
            }
            if (var6 < super.field563.field2183) {
                int var16 = super.field563.field2183 - var6;
                var10 -= var16;
                var6 = super.field563.field2183;
                var8 += var16;
                var14 += var16;
                var13 += var16;
                var12 += var16;
            }
            if (var6 + var10 > super.field563.field2186) {
                int var17 = var6 + var10 - super.field563.field2186;
                var10 -= var17;
                var13 += var17;
                var12 += var17;
            }
            if (var10 > 0 && var11 > 0) {
                class80 var18 = (class80) arg2;
                int[] var19 = var18.field978;
                int[] var20 = var18.field971;
                int[] var21 = super.field563.field2188;
                int var22 = var7;
                if (arg4 > var7) {
                    var22 = arg4;
                    var14 += (arg4 - var7) * var9;
                    var8 += (arg4 - var7) * super.field532;
                }
                int var23 = var19.length + arg4 < var7 + var11 ? var19.length + arg4 : var7 + var11;
                for (int var24 = var22; var24 < var23; ++var24) {
                    int var25 = var19[var24 - arg4] + arg3;
                    int var26 = var20[var24 - arg4];
                    int var27 = var10;
                    if (var6 > var25) {
                        int var28 = var6 - var25;
                        if (var28 >= var26) {
                            var8 += var10 + var13;
                            var14 += var10 + var12;
                            continue;
                        }
                        var26 -= var28;
                    } else {
                        int var29 = var25 - var6;
                        if (var29 >= var10) {
                            var8 += var10 + var13;
                            var14 += var10 + var12;
                            continue;
                        }
                        var8 += var29;
                        var27 = var10 - var29;
                        var14 += var29;
                    }
                    int var30 = 0;
                    if (var27 < var26) {
                        var26 = var27;
                    } else {
                        var30 = var27 - var26;
                    }
                    for (int var31 = -var26; var31 < 0; ++var31) {
                        int var32 = this.field525[var8++];
                        if (var32 != 0) {
                            var21[var14++] = var32;
                        } else {
                            ++var14;
                        }
                    }
                    var8 += var13 + var30;
                    var14 += var12 + var30;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V", line = 2088)
    public final void method164(int arg0, int arg1, int arg2) {
        throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V", line = 2092)
    public final void method166(int arg0, int arg1) {
        int[] var3 = super.field563.field2188;
        if (class47.field552 == 0) {
            if (class47.field543 == 0) {
                int var4 = class47.field551;
                while (var4 < 0) {
                    int var5 = class47.field560;
                    int var6 = class47.field559;
                    int var7 = class47.field554;
                    int var8 = class47.field546;
                    if (var6 >= 0 && var7 >= 0 && var6 - (super.field532 << 12) < 0 && var7 - (super.field538 << 12) < 0) {
                        while (var8 < 0) {
                            int var9 = (var6 >> 12) + (var7 >> 12) * super.field532;
                            int var10 = var5++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var10] = this.field525[var9];
                                } else if (arg0 == 1) {
                                    int var14 = this.field525[var9++];
                                    int var15 = (var14 & 16711680) * class47.field548 & -16777216;
                                    int var16 = (var14 & 65280) * class47.field531 & 16711680;
                                    int var17 = (var14 & 255) * class47.field562 & 65280;
                                    var3[var10] = (var15 | var16 | var17) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var18 = this.field525[var9];
                                    int var19 = (var18 & 16711935) * class47.field557 & -16711936;
                                    int var20 = (var18 & 65280) * class47.field557 & 16711680;
                                    var3[var10] = ((var19 | var20) >>> 8) + class47.field534;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    int var21 = this.field525[var9];
                                    if (var21 != 0) {
                                        var3[var10] = var21;
                                    }
                                } else if (arg0 == 1) {
                                    int var22 = this.field525[var9];
                                    if (var22 != 0) {
                                        if ((class47.field540 & 16777215) == 16777215) {
                                            int var23 = class47.field540 >>> 24;
                                            int var24 = 256 - var23;
                                            int var25 = var3[var10];
                                            var3[var10] = ((var22 & 16711935) * var23 + (var25 & 16711935) * var24 & -16711936) + ((var22 & 65280) * var23 + (var25 & 65280) * var24 & 16711680) >> 8;
                                        } else if (class47.field557 != 255) {
                                            int var26 = (var22 & 16711680) * class47.field548 & -16777216;
                                            int var27 = (var22 & 65280) * class47.field531 & 16711680;
                                            int var28 = (var22 & 255) * class47.field562 & 65280;
                                            int var29 = (var26 | var27 | var28) >>> 8;
                                            int var30 = var3[var10];
                                            var3[var10] = ((var29 & 16711935) * class47.field557 + (var30 & 16711935) * class47.field547 & -16711936) + ((var29 & 65280) * class47.field557 + (var30 & 65280) * class47.field547 & 16711680) >> 8;
                                        } else {
                                            int var31 = (var22 & 16711680) * class47.field548 & -16777216;
                                            int var32 = (var22 & 65280) * class47.field531 & 16711680;
                                            int var33 = (var22 & 255) * class47.field562 & 65280;
                                            var3[var10] = (var31 | var32 | var33) >>> 8;
                                        }
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var34 = this.field525[var9];
                                    if (var34 != 0) {
                                        int var35 = (var34 & 16711935) * class47.field557 & -16711936;
                                        int var36 = (var34 & 65280) * class47.field557 & 16711680;
                                        var3[var10++] = ((var35 | var36) >>> 8) + class47.field534;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    int var37 = this.field525[var9];
                                    if (var37 != 0) {
                                        int var38 = var3[var10];
                                        int var39 = var37 + var38;
                                        int var40 = (var37 & 16711935) + (var38 & 16711935);
                                        int var41 = (var39 - var40 & 65536) + (var40 & 16777472);
                                        var3[var10] = var39 - var41 | var41 - (var41 >>> 8);
                                    }
                                } else if (arg0 == 1) {
                                    int var42 = this.field525[var9];
                                    if (var42 != 0) {
                                        int var43 = (var42 & 16711680) * class47.field548 & -16777216;
                                        int var44 = (var42 & 65280) * class47.field531 & 16711680;
                                        int var45 = (var42 & 255) * class47.field562 & 65280;
                                        int var46 = (var43 | var44 | var45) >>> 8;
                                        int var47 = var3[var10];
                                        int var48 = var46 + var47;
                                        int var49 = (var46 & 16711935) + (var47 & 16711935);
                                        int var50 = (var48 - var49 & 65536) + (var49 & 16777472);
                                        var3[var10] = var48 - var50 | var50 - (var50 >>> 8);
                                    }
                                } else if (arg0 == 2) {
                                    int var51 = this.field525[var9];
                                    if (var51 != 0) {
                                        int var52 = (var51 & 16711935) * class47.field557 & -16711936;
                                        int var53 = (var51 & 65280) * class47.field557 & 16711680;
                                        int var54 = ((var52 | var53) >>> 8) + class47.field534;
                                        int var55 = var3[var10];
                                        int var56 = var54 + var55;
                                        int var57 = (var54 & 16711935) + (var55 & 16711935);
                                        int var58 = (var56 - var57 & 65536) + (var57 & 16777472);
                                        var3[var10] = var56 - var58 | var58 - (var58 >>> 8);
                                    }
                                }
                            }
                            ++var8;
                        }
                    }
                    ++var4;
                    class47.field560 += class47.field558;
                }
            } else if (class47.field543 < 0) {
                int var59 = class47.field551;
                while (var59 < 0) {
                    int var60 = class47.field560;
                    int var61 = class47.field559;
                    int var62 = class47.field554 + class47.field541;
                    int var63 = class47.field546;
                    if (var61 >= 0 && var61 - (super.field532 << 12) < 0) {
                        int var64;
                        if ((var64 = var62 - (super.field538 << 12)) >= 0) {
                            int var65 = (class47.field543 - var64) / class47.field543;
                            var63 += var65;
                            var62 += class47.field543 * var65;
                            var60 += var65;
                        }
                        int var66;
                        if ((var66 = (var62 - class47.field543) / class47.field543) > var63) {
                            var63 = var66;
                        }
                        while (var63 < 0) {
                            int var67 = (var61 >> 12) + (var62 >> 12) * super.field532;
                            int var68 = var60++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var68] = this.field525[var67];
                                } else if (arg0 == 1) {
                                    int var72 = this.field525[var67++];
                                    int var73 = (var72 & 16711680) * class47.field548 & -16777216;
                                    int var74 = (var72 & 65280) * class47.field531 & 16711680;
                                    int var75 = (var72 & 255) * class47.field562 & 65280;
                                    var3[var68] = (var73 | var74 | var75) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var76 = this.field525[var67];
                                    int var77 = (var76 & 16711935) * class47.field557 & -16711936;
                                    int var78 = (var76 & 65280) * class47.field557 & 16711680;
                                    var3[var68] = ((var77 | var78) >>> 8) + class47.field534;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    int var79 = this.field525[var67];
                                    if (var79 != 0) {
                                        var3[var68] = var79;
                                    }
                                } else if (arg0 == 1) {
                                    int var80 = this.field525[var67];
                                    if (var80 != 0) {
                                        if ((class47.field540 & 16777215) == 16777215) {
                                            int var81 = class47.field540 >>> 24;
                                            int var82 = 256 - var81;
                                            int var83 = var3[var68];
                                            var3[var68] = ((var80 & 16711935) * var81 + (var83 & 16711935) * var82 & -16711936) + ((var80 & 65280) * var81 + (var83 & 65280) * var82 & 16711680) >> 8;
                                        } else if (class47.field557 != 255) {
                                            int var84 = (var80 & 16711680) * class47.field548 & -16777216;
                                            int var85 = (var80 & 65280) * class47.field531 & 16711680;
                                            int var86 = (var80 & 255) * class47.field562 & 65280;
                                            int var87 = (var84 | var85 | var86) >>> 8;
                                            int var88 = var3[var68];
                                            var3[var68] = ((var87 & 16711935) * class47.field557 + (var88 & 16711935) * class47.field547 & -16711936) + ((var87 & 65280) * class47.field557 + (var88 & 65280) * class47.field547 & 16711680) >> 8;
                                        } else {
                                            int var89 = (var80 & 16711680) * class47.field548 & -16777216;
                                            int var90 = (var80 & 65280) * class47.field531 & 16711680;
                                            int var91 = (var80 & 255) * class47.field562 & 65280;
                                            var3[var68] = (var89 | var90 | var91) >>> 8;
                                        }
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var92 = this.field525[var67];
                                    if (var92 != 0) {
                                        int var93 = (var92 & 16711935) * class47.field557 & -16711936;
                                        int var94 = (var92 & 65280) * class47.field557 & 16711680;
                                        var3[var68++] = ((var93 | var94) >>> 8) + class47.field534;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    int var95 = this.field525[var67];
                                    if (var95 != 0) {
                                        int var96 = var3[var68];
                                        int var97 = var95 + var96;
                                        int var98 = (var95 & 16711935) + (var96 & 16711935);
                                        int var99 = (var97 - var98 & 65536) + (var98 & 16777472);
                                        var3[var68] = var97 - var99 | var99 - (var99 >>> 8);
                                    }
                                } else if (arg0 == 1) {
                                    int var100 = this.field525[var67];
                                    if (var100 != 0) {
                                        int var101 = (var100 & 16711680) * class47.field548 & -16777216;
                                        int var102 = (var100 & 65280) * class47.field531 & 16711680;
                                        int var103 = (var100 & 255) * class47.field562 & 65280;
                                        int var104 = (var101 | var102 | var103) >>> 8;
                                        int var105 = var3[var68];
                                        int var106 = var104 + var105;
                                        int var107 = (var104 & 16711935) + (var105 & 16711935);
                                        int var108 = (var106 - var107 & 65536) + (var107 & 16777472);
                                        var3[var68] = var106 - var108 | var108 - (var108 >>> 8);
                                    }
                                } else if (arg0 == 2) {
                                    int var109 = this.field525[var67];
                                    if (var109 != 0) {
                                        int var110 = (var109 & 16711935) * class47.field557 & -16711936;
                                        int var111 = (var109 & 65280) * class47.field557 & 16711680;
                                        int var112 = ((var110 | var111) >>> 8) + class47.field534;
                                        int var113 = var3[var68];
                                        int var114 = var112 + var113;
                                        int var115 = (var112 & 16711935) + (var113 & 16711935);
                                        int var116 = (var114 - var115 & 65536) + (var115 & 16777472);
                                        var3[var68] = var114 - var116 | var116 - (var116 >>> 8);
                                    }
                                }
                            }
                            var62 += class47.field543;
                            ++var63;
                        }
                    }
                    ++var59;
                    class47.field559 += class47.field533;
                    class47.field560 += class47.field558;
                }
            } else {
                int var117 = class47.field551;
                while (var117 < 0) {
                    int var118 = class47.field560;
                    int var119 = class47.field559;
                    int var120 = class47.field554 + class47.field541;
                    int var121 = class47.field546;
                    if (var119 >= 0 && var119 - (super.field532 << 12) < 0) {
                        if (var120 < 0) {
                            int var122 = (class47.field543 - 1 - var120) / class47.field543;
                            var121 += var122;
                            var120 += class47.field543 * var122;
                            var118 += var122;
                        }
                        int var123;
                        if ((var123 = (var120 + 1 - (super.field538 << 12) - class47.field543) / class47.field543) > var121) {
                            var121 = var123;
                        }
                        while (var121 < 0) {
                            int var124 = (var119 >> 12) + (var120 >> 12) * super.field532;
                            int var125 = var118++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var125] = this.field525[var124];
                                } else if (arg0 == 1) {
                                    int var129 = this.field525[var124++];
                                    int var130 = (var129 & 16711680) * class47.field548 & -16777216;
                                    int var131 = (var129 & 65280) * class47.field531 & 16711680;
                                    int var132 = (var129 & 255) * class47.field562 & 65280;
                                    var3[var125] = (var130 | var131 | var132) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var133 = this.field525[var124];
                                    int var134 = (var133 & 16711935) * class47.field557 & -16711936;
                                    int var135 = (var133 & 65280) * class47.field557 & 16711680;
                                    var3[var125] = ((var134 | var135) >>> 8) + class47.field534;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    int var136 = this.field525[var124];
                                    if (var136 != 0) {
                                        var3[var125] = var136;
                                    }
                                } else if (arg0 == 1) {
                                    int var137 = this.field525[var124];
                                    if (var137 != 0) {
                                        if ((class47.field540 & 16777215) == 16777215) {
                                            int var138 = class47.field540 >>> 24;
                                            int var139 = 256 - var138;
                                            int var140 = var3[var125];
                                            var3[var125] = ((var137 & 16711935) * var138 + (var140 & 16711935) * var139 & -16711936) + ((var137 & 65280) * var138 + (var140 & 65280) * var139 & 16711680) >> 8;
                                        } else if (class47.field557 != 255) {
                                            int var141 = (var137 & 16711680) * class47.field548 & -16777216;
                                            int var142 = (var137 & 65280) * class47.field531 & 16711680;
                                            int var143 = (var137 & 255) * class47.field562 & 65280;
                                            int var144 = (var141 | var142 | var143) >>> 8;
                                            int var145 = var3[var125];
                                            var3[var125] = ((var144 & 16711935) * class47.field557 + (var145 & 16711935) * class47.field547 & -16711936) + ((var144 & 65280) * class47.field557 + (var145 & 65280) * class47.field547 & 16711680) >> 8;
                                        } else {
                                            int var146 = (var137 & 16711680) * class47.field548 & -16777216;
                                            int var147 = (var137 & 65280) * class47.field531 & 16711680;
                                            int var148 = (var137 & 255) * class47.field562 & 65280;
                                            var3[var125] = (var146 | var147 | var148) >>> 8;
                                        }
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var149 = this.field525[var124];
                                    if (var149 != 0) {
                                        int var150 = (var149 & 16711935) * class47.field557 & -16711936;
                                        int var151 = (var149 & 65280) * class47.field557 & 16711680;
                                        var3[var125++] = ((var150 | var151) >>> 8) + class47.field534;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    int var152 = this.field525[var124];
                                    if (var152 != 0) {
                                        int var153 = var3[var125];
                                        int var154 = var152 + var153;
                                        int var155 = (var152 & 16711935) + (var153 & 16711935);
                                        int var156 = (var154 - var155 & 65536) + (var155 & 16777472);
                                        var3[var125] = var154 - var156 | var156 - (var156 >>> 8);
                                    }
                                } else if (arg0 == 1) {
                                    int var157 = this.field525[var124];
                                    if (var157 != 0) {
                                        int var158 = (var157 & 16711680) * class47.field548 & -16777216;
                                        int var159 = (var157 & 65280) * class47.field531 & 16711680;
                                        int var160 = (var157 & 255) * class47.field562 & 65280;
                                        int var161 = (var158 | var159 | var160) >>> 8;
                                        int var162 = var3[var125];
                                        int var163 = var161 + var162;
                                        int var164 = (var161 & 16711935) + (var162 & 16711935);
                                        int var165 = (var163 - var164 & 65536) + (var164 & 16777472);
                                        var3[var125] = var163 - var165 | var165 - (var165 >>> 8);
                                    }
                                } else if (arg0 == 2) {
                                    int var166 = this.field525[var124];
                                    if (var166 != 0) {
                                        int var167 = (var166 & 16711935) * class47.field557 & -16711936;
                                        int var168 = (var166 & 65280) * class47.field557 & 16711680;
                                        int var169 = ((var167 | var168) >>> 8) + class47.field534;
                                        int var170 = var3[var125];
                                        int var171 = var169 + var170;
                                        int var172 = (var169 & 16711935) + (var170 & 16711935);
                                        int var173 = (var171 - var172 & 65536) + (var172 & 16777472);
                                        var3[var125] = var171 - var173 | var173 - (var173 >>> 8);
                                    }
                                }
                            }
                            var120 += class47.field543;
                            ++var121;
                        }
                    }
                    ++var117;
                    class47.field559 += class47.field533;
                    class47.field560 += class47.field558;
                }
            }
        } else if (class47.field552 < 0) {
            if (class47.field543 == 0) {
                int var174 = class47.field551;
                while (var174 < 0) {
                    int var175 = class47.field560;
                    int var176 = class47.field559 + class47.field553;
                    int var177 = class47.field554;
                    int var178 = class47.field546;
                    if (var177 >= 0 && var177 - (super.field538 << 12) < 0) {
                        int var179;
                        if ((var179 = var176 - (super.field532 << 12)) >= 0) {
                            int var180 = (class47.field552 - var179) / class47.field552;
                            var178 += var180;
                            var176 += class47.field552 * var180;
                            var175 += var180;
                        }
                        int var181;
                        if ((var181 = (var176 - class47.field552) / class47.field552) > var178) {
                            var178 = var181;
                        }
                        while (var178 < 0) {
                            int var182 = (var176 >> 12) + (var177 >> 12) * super.field532;
                            int var183 = var175++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var183] = this.field525[var182];
                                } else if (arg0 == 1) {
                                    int var187 = this.field525[var182++];
                                    int var188 = (var187 & 16711680) * class47.field548 & -16777216;
                                    int var189 = (var187 & 65280) * class47.field531 & 16711680;
                                    int var190 = (var187 & 255) * class47.field562 & 65280;
                                    var3[var183] = (var188 | var189 | var190) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var191 = this.field525[var182];
                                    int var192 = (var191 & 16711935) * class47.field557 & -16711936;
                                    int var193 = (var191 & 65280) * class47.field557 & 16711680;
                                    var3[var183] = ((var192 | var193) >>> 8) + class47.field534;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    int var194 = this.field525[var182];
                                    if (var194 != 0) {
                                        var3[var183] = var194;
                                    }
                                } else if (arg0 == 1) {
                                    int var195 = this.field525[var182];
                                    if (var195 != 0) {
                                        if ((class47.field540 & 16777215) == 16777215) {
                                            int var196 = class47.field540 >>> 24;
                                            int var197 = 256 - var196;
                                            int var198 = var3[var183];
                                            var3[var183] = ((var195 & 16711935) * var196 + (var198 & 16711935) * var197 & -16711936) + ((var195 & 65280) * var196 + (var198 & 65280) * var197 & 16711680) >> 8;
                                        } else if (class47.field557 != 255) {
                                            int var199 = (var195 & 16711680) * class47.field548 & -16777216;
                                            int var200 = (var195 & 65280) * class47.field531 & 16711680;
                                            int var201 = (var195 & 255) * class47.field562 & 65280;
                                            int var202 = (var199 | var200 | var201) >>> 8;
                                            int var203 = var3[var183];
                                            var3[var183] = ((var202 & 16711935) * class47.field557 + (var203 & 16711935) * class47.field547 & -16711936) + ((var202 & 65280) * class47.field557 + (var203 & 65280) * class47.field547 & 16711680) >> 8;
                                        } else {
                                            int var204 = (var195 & 16711680) * class47.field548 & -16777216;
                                            int var205 = (var195 & 65280) * class47.field531 & 16711680;
                                            int var206 = (var195 & 255) * class47.field562 & 65280;
                                            var3[var183] = (var204 | var205 | var206) >>> 8;
                                        }
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var207 = this.field525[var182];
                                    if (var207 != 0) {
                                        int var208 = (var207 & 16711935) * class47.field557 & -16711936;
                                        int var209 = (var207 & 65280) * class47.field557 & 16711680;
                                        var3[var183++] = ((var208 | var209) >>> 8) + class47.field534;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    int var210 = this.field525[var182];
                                    if (var210 != 0) {
                                        int var211 = var3[var183];
                                        int var212 = var210 + var211;
                                        int var213 = (var210 & 16711935) + (var211 & 16711935);
                                        int var214 = (var212 - var213 & 65536) + (var213 & 16777472);
                                        var3[var183] = var212 - var214 | var214 - (var214 >>> 8);
                                    }
                                } else if (arg0 == 1) {
                                    int var215 = this.field525[var182];
                                    if (var215 != 0) {
                                        int var216 = (var215 & 16711680) * class47.field548 & -16777216;
                                        int var217 = (var215 & 65280) * class47.field531 & 16711680;
                                        int var218 = (var215 & 255) * class47.field562 & 65280;
                                        int var219 = (var216 | var217 | var218) >>> 8;
                                        int var220 = var3[var183];
                                        int var221 = var219 + var220;
                                        int var222 = (var219 & 16711935) + (var220 & 16711935);
                                        int var223 = (var221 - var222 & 65536) + (var222 & 16777472);
                                        var3[var183] = var221 - var223 | var223 - (var223 >>> 8);
                                    }
                                } else if (arg0 == 2) {
                                    int var224 = this.field525[var182];
                                    if (var224 != 0) {
                                        int var225 = (var224 & 16711935) * class47.field557 & -16711936;
                                        int var226 = (var224 & 65280) * class47.field557 & 16711680;
                                        int var227 = ((var225 | var226) >>> 8) + class47.field534;
                                        int var228 = var3[var183];
                                        int var229 = var227 + var228;
                                        int var230 = (var227 & 16711935) + (var228 & 16711935);
                                        int var231 = (var229 - var230 & 65536) + (var230 & 16777472);
                                        var3[var183] = var229 - var231 | var231 - (var231 >>> 8);
                                    }
                                }
                            }
                            var176 += class47.field552;
                            ++var178;
                        }
                    }
                    ++var174;
                    class47.field554 += class47.field549;
                    class47.field560 += class47.field558;
                }
            } else if (class47.field543 < 0) {
                int var232 = class47.field551;
                while (var232 < 0) {
                    int var233 = class47.field560;
                    int var234 = class47.field559 + class47.field553;
                    int var235 = class47.field554 + class47.field541;
                    int var236 = class47.field546;
                    int var237;
                    if ((var237 = var234 - (super.field532 << 12)) >= 0) {
                        int var238 = (class47.field552 - var237) / class47.field552;
                        var236 += var238;
                        var234 += class47.field552 * var238;
                        var235 += class47.field543 * var238;
                        var233 += var238;
                    }
                    int var239;
                    if ((var239 = (var234 - class47.field552) / class47.field552) > var236) {
                        var236 = var239;
                    }
                    int var240;
                    if ((var240 = var235 - (super.field538 << 12)) >= 0) {
                        int var241 = (class47.field543 - var240) / class47.field543;
                        var236 += var241;
                        var234 += class47.field552 * var241;
                        var235 += class47.field543 * var241;
                        var233 += var241;
                    }
                    int var242;
                    if ((var242 = (var235 - class47.field543) / class47.field543) > var236) {
                        var236 = var242;
                    }
                    while (var236 < 0) {
                        int var243 = (var234 >> 12) + (var235 >> 12) * super.field532;
                        int var244 = var233++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var244] = this.field525[var243];
                            } else if (arg0 == 1) {
                                int var248 = this.field525[var243++];
                                int var249 = (var248 & 16711680) * class47.field548 & -16777216;
                                int var250 = (var248 & 65280) * class47.field531 & 16711680;
                                int var251 = (var248 & 255) * class47.field562 & 65280;
                                var3[var244] = (var249 | var250 | var251) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var252 = this.field525[var243];
                                int var253 = (var252 & 16711935) * class47.field557 & -16711936;
                                int var254 = (var252 & 65280) * class47.field557 & 16711680;
                                var3[var244] = ((var253 | var254) >>> 8) + class47.field534;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                int var255 = this.field525[var243];
                                if (var255 != 0) {
                                    var3[var244] = var255;
                                }
                            } else if (arg0 == 1) {
                                int var256 = this.field525[var243];
                                if (var256 != 0) {
                                    if ((class47.field540 & 16777215) == 16777215) {
                                        int var257 = class47.field540 >>> 24;
                                        int var258 = 256 - var257;
                                        int var259 = var3[var244];
                                        var3[var244] = ((var256 & 16711935) * var257 + (var259 & 16711935) * var258 & -16711936) + ((var256 & 65280) * var257 + (var259 & 65280) * var258 & 16711680) >> 8;
                                    } else if (class47.field557 != 255) {
                                        int var260 = (var256 & 16711680) * class47.field548 & -16777216;
                                        int var261 = (var256 & 65280) * class47.field531 & 16711680;
                                        int var262 = (var256 & 255) * class47.field562 & 65280;
                                        int var263 = (var260 | var261 | var262) >>> 8;
                                        int var264 = var3[var244];
                                        var3[var244] = ((var263 & 16711935) * class47.field557 + (var264 & 16711935) * class47.field547 & -16711936) + ((var263 & 65280) * class47.field557 + (var264 & 65280) * class47.field547 & 16711680) >> 8;
                                    } else {
                                        int var265 = (var256 & 16711680) * class47.field548 & -16777216;
                                        int var266 = (var256 & 65280) * class47.field531 & 16711680;
                                        int var267 = (var256 & 255) * class47.field562 & 65280;
                                        var3[var244] = (var265 | var266 | var267) >>> 8;
                                    }
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var268 = this.field525[var243];
                                if (var268 != 0) {
                                    int var269 = (var268 & 16711935) * class47.field557 & -16711936;
                                    int var270 = (var268 & 65280) * class47.field557 & 16711680;
                                    var3[var244++] = ((var269 | var270) >>> 8) + class47.field534;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                int var271 = this.field525[var243];
                                if (var271 != 0) {
                                    int var272 = var3[var244];
                                    int var273 = var271 + var272;
                                    int var274 = (var271 & 16711935) + (var272 & 16711935);
                                    int var275 = (var273 - var274 & 65536) + (var274 & 16777472);
                                    var3[var244] = var273 - var275 | var275 - (var275 >>> 8);
                                }
                            } else if (arg0 == 1) {
                                int var276 = this.field525[var243];
                                if (var276 != 0) {
                                    int var277 = (var276 & 16711680) * class47.field548 & -16777216;
                                    int var278 = (var276 & 65280) * class47.field531 & 16711680;
                                    int var279 = (var276 & 255) * class47.field562 & 65280;
                                    int var280 = (var277 | var278 | var279) >>> 8;
                                    int var281 = var3[var244];
                                    int var282 = var280 + var281;
                                    int var283 = (var280 & 16711935) + (var281 & 16711935);
                                    int var284 = (var282 - var283 & 65536) + (var283 & 16777472);
                                    var3[var244] = var282 - var284 | var284 - (var284 >>> 8);
                                }
                            } else if (arg0 == 2) {
                                int var285 = this.field525[var243];
                                if (var285 != 0) {
                                    int var286 = (var285 & 16711935) * class47.field557 & -16711936;
                                    int var287 = (var285 & 65280) * class47.field557 & 16711680;
                                    int var288 = ((var286 | var287) >>> 8) + class47.field534;
                                    int var289 = var3[var244];
                                    int var290 = var288 + var289;
                                    int var291 = (var288 & 16711935) + (var289 & 16711935);
                                    int var292 = (var290 - var291 & 65536) + (var291 & 16777472);
                                    var3[var244] = var290 - var292 | var292 - (var292 >>> 8);
                                }
                            }
                        }
                        var234 += class47.field552;
                        var235 += class47.field543;
                        ++var236;
                    }
                    ++var232;
                    class47.field559 += class47.field533;
                    class47.field554 += class47.field549;
                    class47.field560 += class47.field558;
                }
            } else {
                int var293 = class47.field551;
                while (var293 < 0) {
                    int var294 = class47.field560;
                    int var295 = class47.field559 + class47.field553;
                    int var296 = class47.field554 + class47.field541;
                    int var297 = class47.field546;
                    int var298;
                    if ((var298 = var295 - (super.field532 << 12)) >= 0) {
                        int var299 = (class47.field552 - var298) / class47.field552;
                        var297 += var299;
                        var295 += class47.field552 * var299;
                        var296 += class47.field543 * var299;
                        var294 += var299;
                    }
                    int var300;
                    if ((var300 = (var295 - class47.field552) / class47.field552) > var297) {
                        var297 = var300;
                    }
                    if (var296 < 0) {
                        int var301 = (class47.field543 - 1 - var296) / class47.field543;
                        var297 += var301;
                        var295 += class47.field552 * var301;
                        var296 += class47.field543 * var301;
                        var294 += var301;
                    }
                    int var302;
                    if ((var302 = (var296 + 1 - (super.field538 << 12) - class47.field543) / class47.field543) > var297) {
                        var297 = var302;
                    }
                    while (var297 < 0) {
                        int var303 = (var295 >> 12) + (var296 >> 12) * super.field532;
                        int var304 = var294++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var304] = this.field525[var303];
                            } else if (arg0 == 1) {
                                int var308 = this.field525[var303++];
                                int var309 = (var308 & 16711680) * class47.field548 & -16777216;
                                int var310 = (var308 & 65280) * class47.field531 & 16711680;
                                int var311 = (var308 & 255) * class47.field562 & 65280;
                                var3[var304] = (var309 | var310 | var311) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var312 = this.field525[var303];
                                int var313 = (var312 & 16711935) * class47.field557 & -16711936;
                                int var314 = (var312 & 65280) * class47.field557 & 16711680;
                                var3[var304] = ((var313 | var314) >>> 8) + class47.field534;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                int var315 = this.field525[var303];
                                if (var315 != 0) {
                                    var3[var304] = var315;
                                }
                            } else if (arg0 == 1) {
                                int var316 = this.field525[var303];
                                if (var316 != 0) {
                                    if ((class47.field540 & 16777215) == 16777215) {
                                        int var317 = class47.field540 >>> 24;
                                        int var318 = 256 - var317;
                                        int var319 = var3[var304];
                                        var3[var304] = ((var316 & 16711935) * var317 + (var319 & 16711935) * var318 & -16711936) + ((var316 & 65280) * var317 + (var319 & 65280) * var318 & 16711680) >> 8;
                                    } else if (class47.field557 != 255) {
                                        int var320 = (var316 & 16711680) * class47.field548 & -16777216;
                                        int var321 = (var316 & 65280) * class47.field531 & 16711680;
                                        int var322 = (var316 & 255) * class47.field562 & 65280;
                                        int var323 = (var320 | var321 | var322) >>> 8;
                                        int var324 = var3[var304];
                                        var3[var304] = ((var323 & 16711935) * class47.field557 + (var324 & 16711935) * class47.field547 & -16711936) + ((var323 & 65280) * class47.field557 + (var324 & 65280) * class47.field547 & 16711680) >> 8;
                                    } else {
                                        int var325 = (var316 & 16711680) * class47.field548 & -16777216;
                                        int var326 = (var316 & 65280) * class47.field531 & 16711680;
                                        int var327 = (var316 & 255) * class47.field562 & 65280;
                                        var3[var304] = (var325 | var326 | var327) >>> 8;
                                    }
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var328 = this.field525[var303];
                                if (var328 != 0) {
                                    int var329 = (var328 & 16711935) * class47.field557 & -16711936;
                                    int var330 = (var328 & 65280) * class47.field557 & 16711680;
                                    var3[var304++] = ((var329 | var330) >>> 8) + class47.field534;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                int var331 = this.field525[var303];
                                if (var331 != 0) {
                                    int var332 = var3[var304];
                                    int var333 = var331 + var332;
                                    int var334 = (var331 & 16711935) + (var332 & 16711935);
                                    int var335 = (var333 - var334 & 65536) + (var334 & 16777472);
                                    var3[var304] = var333 - var335 | var335 - (var335 >>> 8);
                                }
                            } else if (arg0 == 1) {
                                int var336 = this.field525[var303];
                                if (var336 != 0) {
                                    int var337 = (var336 & 16711680) * class47.field548 & -16777216;
                                    int var338 = (var336 & 65280) * class47.field531 & 16711680;
                                    int var339 = (var336 & 255) * class47.field562 & 65280;
                                    int var340 = (var337 | var338 | var339) >>> 8;
                                    int var341 = var3[var304];
                                    int var342 = var340 + var341;
                                    int var343 = (var340 & 16711935) + (var341 & 16711935);
                                    int var344 = (var342 - var343 & 65536) + (var343 & 16777472);
                                    var3[var304] = var342 - var344 | var344 - (var344 >>> 8);
                                }
                            } else if (arg0 == 2) {
                                int var345 = this.field525[var303];
                                if (var345 != 0) {
                                    int var346 = (var345 & 16711935) * class47.field557 & -16711936;
                                    int var347 = (var345 & 65280) * class47.field557 & 16711680;
                                    int var348 = ((var346 | var347) >>> 8) + class47.field534;
                                    int var349 = var3[var304];
                                    int var350 = var348 + var349;
                                    int var351 = (var348 & 16711935) + (var349 & 16711935);
                                    int var352 = (var350 - var351 & 65536) + (var351 & 16777472);
                                    var3[var304] = var350 - var352 | var352 - (var352 >>> 8);
                                }
                            }
                        }
                        var295 += class47.field552;
                        var296 += class47.field543;
                        ++var297;
                    }
                    ++var293;
                    class47.field559 += class47.field533;
                    class47.field554 += class47.field549;
                    class47.field560 += class47.field558;
                }
            }
        } else if (class47.field543 == 0) {
            int var353 = class47.field551;
            while (var353 < 0) {
                int var354 = class47.field560;
                int var355 = class47.field559 + class47.field553;
                int var356 = class47.field554;
                int var357 = class47.field546;
                if (var356 >= 0 && var356 - (super.field538 << 12) < 0) {
                    if (var355 < 0) {
                        int var358 = (class47.field552 - 1 - var355) / class47.field552;
                        var357 += var358;
                        var355 += class47.field552 * var358;
                        var354 += var358;
                    }
                    int var359;
                    if ((var359 = (var355 + 1 - (super.field532 << 12) - class47.field552) / class47.field552) > var357) {
                        var357 = var359;
                    }
                    while (var357 < 0) {
                        int var360 = (var355 >> 12) + (var356 >> 12) * super.field532;
                        int var361 = var354++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var361] = this.field525[var360];
                            } else if (arg0 == 1) {
                                int var365 = this.field525[var360++];
                                int var366 = (var365 & 16711680) * class47.field548 & -16777216;
                                int var367 = (var365 & 65280) * class47.field531 & 16711680;
                                int var368 = (var365 & 255) * class47.field562 & 65280;
                                var3[var361] = (var366 | var367 | var368) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var369 = this.field525[var360];
                                int var370 = (var369 & 16711935) * class47.field557 & -16711936;
                                int var371 = (var369 & 65280) * class47.field557 & 16711680;
                                var3[var361] = ((var370 | var371) >>> 8) + class47.field534;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                int var372 = this.field525[var360];
                                if (var372 != 0) {
                                    var3[var361] = var372;
                                }
                            } else if (arg0 == 1) {
                                int var373 = this.field525[var360];
                                if (var373 != 0) {
                                    if ((class47.field540 & 16777215) == 16777215) {
                                        int var374 = class47.field540 >>> 24;
                                        int var375 = 256 - var374;
                                        int var376 = var3[var361];
                                        var3[var361] = ((var373 & 16711935) * var374 + (var376 & 16711935) * var375 & -16711936) + ((var373 & 65280) * var374 + (var376 & 65280) * var375 & 16711680) >> 8;
                                    } else if (class47.field557 != 255) {
                                        int var377 = (var373 & 16711680) * class47.field548 & -16777216;
                                        int var378 = (var373 & 65280) * class47.field531 & 16711680;
                                        int var379 = (var373 & 255) * class47.field562 & 65280;
                                        int var380 = (var377 | var378 | var379) >>> 8;
                                        int var381 = var3[var361];
                                        var3[var361] = ((var380 & 16711935) * class47.field557 + (var381 & 16711935) * class47.field547 & -16711936) + ((var380 & 65280) * class47.field557 + (var381 & 65280) * class47.field547 & 16711680) >> 8;
                                    } else {
                                        int var382 = (var373 & 16711680) * class47.field548 & -16777216;
                                        int var383 = (var373 & 65280) * class47.field531 & 16711680;
                                        int var384 = (var373 & 255) * class47.field562 & 65280;
                                        var3[var361] = (var382 | var383 | var384) >>> 8;
                                    }
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var385 = this.field525[var360];
                                if (var385 != 0) {
                                    int var386 = (var385 & 16711935) * class47.field557 & -16711936;
                                    int var387 = (var385 & 65280) * class47.field557 & 16711680;
                                    var3[var361++] = ((var386 | var387) >>> 8) + class47.field534;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                int var388 = this.field525[var360];
                                if (var388 != 0) {
                                    int var389 = var3[var361];
                                    int var390 = var388 + var389;
                                    int var391 = (var388 & 16711935) + (var389 & 16711935);
                                    int var392 = (var390 - var391 & 65536) + (var391 & 16777472);
                                    var3[var361] = var390 - var392 | var392 - (var392 >>> 8);
                                }
                            } else if (arg0 == 1) {
                                int var393 = this.field525[var360];
                                if (var393 != 0) {
                                    int var394 = (var393 & 16711680) * class47.field548 & -16777216;
                                    int var395 = (var393 & 65280) * class47.field531 & 16711680;
                                    int var396 = (var393 & 255) * class47.field562 & 65280;
                                    int var397 = (var394 | var395 | var396) >>> 8;
                                    int var398 = var3[var361];
                                    int var399 = var397 + var398;
                                    int var400 = (var397 & 16711935) + (var398 & 16711935);
                                    int var401 = (var399 - var400 & 65536) + (var400 & 16777472);
                                    var3[var361] = var399 - var401 | var401 - (var401 >>> 8);
                                }
                            } else if (arg0 == 2) {
                                int var402 = this.field525[var360];
                                if (var402 != 0) {
                                    int var403 = (var402 & 16711935) * class47.field557 & -16711936;
                                    int var404 = (var402 & 65280) * class47.field557 & 16711680;
                                    int var405 = ((var403 | var404) >>> 8) + class47.field534;
                                    int var406 = var3[var361];
                                    int var407 = var405 + var406;
                                    int var408 = (var405 & 16711935) + (var406 & 16711935);
                                    int var409 = (var407 - var408 & 65536) + (var408 & 16777472);
                                    var3[var361] = var407 - var409 | var409 - (var409 >>> 8);
                                }
                            }
                        }
                        var355 += class47.field552;
                        ++var357;
                    }
                }
                ++var353;
                class47.field559 += class47.field533;
                class47.field554 += class47.field549;
                class47.field560 += class47.field558;
            }
        } else if (class47.field543 < 0) {
            for (int var410 = class47.field551; var410 < 0; ++var410) {
                int var411 = class47.field560;
                int var412 = class47.field559 + class47.field553;
                int var413 = class47.field554 + class47.field541;
                int var414 = class47.field546;
                if (var412 < 0) {
                    int var415 = (class47.field552 - 1 - var412) / class47.field552;
                    var414 += var415;
                    var412 += class47.field552 * var415;
                    var413 += class47.field543 * var415;
                    var411 += var415;
                }
                int var416;
                if ((var416 = (var412 + 1 - (super.field532 << 12) - class47.field552) / class47.field552) > var414) {
                    var414 = var416;
                }
                int var417;
                if ((var417 = var413 - (super.field538 << 12)) >= 0) {
                    int var418 = (class47.field543 - var417) / class47.field543;
                    var414 += var418;
                    var412 += class47.field552 * var418;
                    var413 += class47.field543 * var418;
                    var411 += var418;
                }
                int var419;
                if ((var419 = (var413 - class47.field543) / class47.field543) > var414) {
                    var414 = var419;
                }
                while (var414 < 0) {
                    int var420 = (var412 >> 12) + (var413 >> 12) * super.field532;
                    int var421 = var411++;
                    if (arg1 == 0) {
                        if (arg0 == 0) {
                            var3[var421] = this.field525[var420];
                        } else if (arg0 == 1) {
                            int var425 = this.field525[var420++];
                            int var426 = (var425 & 16711680) * class47.field548 & -16777216;
                            int var427 = (var425 & 65280) * class47.field531 & 16711680;
                            int var428 = (var425 & 255) * class47.field562 & 65280;
                            var3[var421] = (var426 | var427 | var428) >>> 8;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var429 = this.field525[var420];
                            int var430 = (var429 & 16711935) * class47.field557 & -16711936;
                            int var431 = (var429 & 65280) * class47.field557 & 16711680;
                            var3[var421] = ((var430 | var431) >>> 8) + class47.field534;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 0) {
                            int var432 = this.field525[var420];
                            if (var432 != 0) {
                                var3[var421] = var432;
                            }
                        } else if (arg0 == 1) {
                            int var433 = this.field525[var420];
                            if (var433 != 0) {
                                if ((class47.field540 & 16777215) == 16777215) {
                                    int var434 = class47.field540 >>> 24;
                                    int var435 = 256 - var434;
                                    int var436 = var3[var421];
                                    var3[var421] = ((var433 & 16711935) * var434 + (var436 & 16711935) * var435 & -16711936) + ((var433 & 65280) * var434 + (var436 & 65280) * var435 & 16711680) >> 8;
                                } else if (class47.field557 != 255) {
                                    int var437 = (var433 & 16711680) * class47.field548 & -16777216;
                                    int var438 = (var433 & 65280) * class47.field531 & 16711680;
                                    int var439 = (var433 & 255) * class47.field562 & 65280;
                                    int var440 = (var437 | var438 | var439) >>> 8;
                                    int var441 = var3[var421];
                                    var3[var421] = ((var440 & 16711935) * class47.field557 + (var441 & 16711935) * class47.field547 & -16711936) + ((var440 & 65280) * class47.field557 + (var441 & 65280) * class47.field547 & 16711680) >> 8;
                                } else {
                                    int var442 = (var433 & 16711680) * class47.field548 & -16777216;
                                    int var443 = (var433 & 65280) * class47.field531 & 16711680;
                                    int var444 = (var433 & 255) * class47.field562 & 65280;
                                    var3[var421] = (var442 | var443 | var444) >>> 8;
                                }
                            }
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var445 = this.field525[var420];
                            if (var445 != 0) {
                                int var446 = (var445 & 16711935) * class47.field557 & -16711936;
                                int var447 = (var445 & 65280) * class47.field557 & 16711680;
                                var3[var421++] = ((var446 | var447) >>> 8) + class47.field534;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 0) {
                            int var448 = this.field525[var420];
                            if (var448 != 0) {
                                int var449 = var3[var421];
                                int var450 = var448 + var449;
                                int var451 = (var448 & 16711935) + (var449 & 16711935);
                                int var452 = (var450 - var451 & 65536) + (var451 & 16777472);
                                var3[var421] = var450 - var452 | var452 - (var452 >>> 8);
                            }
                        } else if (arg0 == 1) {
                            int var453 = this.field525[var420];
                            if (var453 != 0) {
                                int var454 = (var453 & 16711680) * class47.field548 & -16777216;
                                int var455 = (var453 & 65280) * class47.field531 & 16711680;
                                int var456 = (var453 & 255) * class47.field562 & 65280;
                                int var457 = (var454 | var455 | var456) >>> 8;
                                int var458 = var3[var421];
                                int var459 = var457 + var458;
                                int var460 = (var457 & 16711935) + (var458 & 16711935);
                                int var461 = (var459 - var460 & 65536) + (var460 & 16777472);
                                var3[var421] = var459 - var461 | var461 - (var461 >>> 8);
                            }
                        } else if (arg0 == 2) {
                            int var462 = this.field525[var420];
                            if (var462 != 0) {
                                int var463 = (var462 & 16711935) * class47.field557 & -16711936;
                                int var464 = (var462 & 65280) * class47.field557 & 16711680;
                                int var465 = ((var463 | var464) >>> 8) + class47.field534;
                                int var466 = var3[var421];
                                int var467 = var465 + var466;
                                int var468 = (var465 & 16711935) + (var466 & 16711935);
                                int var469 = (var467 - var468 & 65536) + (var468 & 16777472);
                                var3[var421] = var467 - var469 | var469 - (var469 >>> 8);
                            }
                        }
                    }
                    var412 += class47.field552;
                    var413 += class47.field543;
                    ++var414;
                }
                class47.field559 += class47.field533;
                class47.field554 += class47.field549;
                class47.field560 += class47.field558;
            }
        } else {
            for (int var470 = class47.field551; var470 < 0; ++var470) {
                int var471 = class47.field560;
                int var472 = class47.field559 + class47.field553;
                int var473 = class47.field554 + class47.field541;
                int var474 = class47.field546;
                if (var472 < 0) {
                    int var475 = (class47.field552 - 1 - var472) / class47.field552;
                    var474 += var475;
                    var472 += class47.field552 * var475;
                    var473 += class47.field543 * var475;
                    var471 += var475;
                }
                int var476;
                if ((var476 = (var472 + 1 - (super.field532 << 12) - class47.field552) / class47.field552) > var474) {
                    var474 = var476;
                }
                if (var473 < 0) {
                    int var477 = (class47.field543 - 1 - var473) / class47.field543;
                    var474 += var477;
                    var472 += class47.field552 * var477;
                    var473 += class47.field543 * var477;
                    var471 += var477;
                }
                int var478;
                if ((var478 = (var473 + 1 - (super.field538 << 12) - class47.field543) / class47.field543) > var474) {
                    var474 = var478;
                }
                while (var474 < 0) {
                    int var479 = (var472 >> 12) + (var473 >> 12) * super.field532;
                    int var480 = var471++;
                    if (arg1 == 0) {
                        if (arg0 == 0) {
                            var3[var480] = this.field525[var479];
                        } else if (arg0 == 1) {
                            int var484 = this.field525[var479++];
                            int var485 = (var484 & 16711680) * class47.field548 & -16777216;
                            int var486 = (var484 & 65280) * class47.field531 & 16711680;
                            int var487 = (var484 & 255) * class47.field562 & 65280;
                            var3[var480] = (var485 | var486 | var487) >>> 8;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var488 = this.field525[var479];
                            int var489 = (var488 & 16711935) * class47.field557 & -16711936;
                            int var490 = (var488 & 65280) * class47.field557 & 16711680;
                            var3[var480] = ((var489 | var490) >>> 8) + class47.field534;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 0) {
                            int var491 = this.field525[var479];
                            if (var491 != 0) {
                                var3[var480] = var491;
                            }
                        } else if (arg0 == 1) {
                            int var492 = this.field525[var479];
                            if (var492 != 0) {
                                if ((class47.field540 & 16777215) == 16777215) {
                                    int var493 = class47.field540 >>> 24;
                                    int var494 = 256 - var493;
                                    int var495 = var3[var480];
                                    var3[var480] = ((var492 & 16711935) * var493 + (var495 & 16711935) * var494 & -16711936) + ((var492 & 65280) * var493 + (var495 & 65280) * var494 & 16711680) >> 8;
                                } else if (class47.field557 != 255) {
                                    int var496 = (var492 & 16711680) * class47.field548 & -16777216;
                                    int var497 = (var492 & 65280) * class47.field531 & 16711680;
                                    int var498 = (var492 & 255) * class47.field562 & 65280;
                                    int var499 = (var496 | var497 | var498) >>> 8;
                                    int var500 = var3[var480];
                                    var3[var480] = ((var499 & 16711935) * class47.field557 + (var500 & 16711935) * class47.field547 & -16711936) + ((var499 & 65280) * class47.field557 + (var500 & 65280) * class47.field547 & 16711680) >> 8;
                                } else {
                                    int var501 = (var492 & 16711680) * class47.field548 & -16777216;
                                    int var502 = (var492 & 65280) * class47.field531 & 16711680;
                                    int var503 = (var492 & 255) * class47.field562 & 65280;
                                    var3[var480] = (var501 | var502 | var503) >>> 8;
                                }
                            }
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var504 = this.field525[var479];
                            if (var504 != 0) {
                                int var505 = (var504 & 16711935) * class47.field557 & -16711936;
                                int var506 = (var504 & 65280) * class47.field557 & 16711680;
                                var3[var480++] = ((var505 | var506) >>> 8) + class47.field534;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 0) {
                            int var507 = this.field525[var479];
                            if (var507 != 0) {
                                int var508 = var3[var480];
                                int var509 = var507 + var508;
                                int var510 = (var507 & 16711935) + (var508 & 16711935);
                                int var511 = (var509 - var510 & 65536) + (var510 & 16777472);
                                var3[var480] = var509 - var511 | var511 - (var511 >>> 8);
                            }
                        } else if (arg0 == 1) {
                            int var512 = this.field525[var479];
                            if (var512 != 0) {
                                int var513 = (var512 & 16711680) * class47.field548 & -16777216;
                                int var514 = (var512 & 65280) * class47.field531 & 16711680;
                                int var515 = (var512 & 255) * class47.field562 & 65280;
                                int var516 = (var513 | var514 | var515) >>> 8;
                                int var517 = var3[var480];
                                int var518 = var516 + var517;
                                int var519 = (var516 & 16711935) + (var517 & 16711935);
                                int var520 = (var518 - var519 & 65536) + (var519 & 16777472);
                                var3[var480] = var518 - var520 | var520 - (var520 >>> 8);
                            }
                        } else if (arg0 == 2) {
                            int var521 = this.field525[var479];
                            if (var521 != 0) {
                                int var522 = (var521 & 16711935) * class47.field557 & -16711936;
                                int var523 = (var521 & 65280) * class47.field557 & 16711680;
                                int var524 = ((var522 | var523) >>> 8) + class47.field534;
                                int var525 = var3[var480];
                                int var526 = var524 + var525;
                                int var527 = (var524 & 16711935) + (var525 & 16711935);
                                int var528 = (var526 - var527 & 65536) + (var527 & 16777472);
                                var3[var480] = var526 - var528 | var528 - (var528 >>> 8);
                            }
                        }
                    }
                    var472 += class47.field552;
                    var473 += class47.field543;
                    ++var474;
                }
                class47.field559 += class47.field533;
                class47.field554 += class47.field549;
                class47.field560 += class47.field558;
            }
        }
    }
}
