import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class311 extends class23 {

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "[B")
    private byte[] field4599;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "[I")
    private int[] field4598;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIIIII)V", line = 3)
    public final void method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (super.field423.method425()) {
            throw new IllegalStateException();
        } else if (arg2 > 0 && arg3 > 0) {
            int var8 = 0;
            int var9 = 0;
            int var10 = super.field423.field889;
            int var11 = super.field425 + super.field419 + super.field407;
            int var12 = super.field412 + super.field400 + super.field396;
            int var13 = (var11 << 16) / arg2;
            int var14 = (var12 << 16) / arg3;
            if (super.field425 > 0) {
                int var15 = ((super.field425 << 16) + var13 - 1) / var13;
                arg0 += var15;
                var8 += var13 * var15 - (super.field425 << 16);
            }
            if (super.field400 > 0) {
                int var16 = ((super.field400 << 16) + var14 - 1) / var14;
                arg1 += var16;
                var9 += var14 * var16 - (super.field400 << 16);
            }
            if (super.field419 < var11) {
                arg2 = ((super.field419 << 16) - var8 + var13 - 1) / var13;
            }
            if (super.field412 < var12) {
                arg3 = ((super.field412 << 16) - var9 + var14 - 1) / var14;
            }
            int var17 = arg1 * var10 + arg0;
            int var18 = var10 - arg2;
            if (arg1 + arg3 > super.field423.field883) {
                arg3 -= arg1 + arg3 - super.field423.field883;
            }
            if (arg1 < super.field423.field884) {
                int var19 = super.field423.field884 - arg1;
                arg3 -= var19;
                var17 += var10 * var19;
                var9 += var14 * var19;
            }
            if (arg0 + arg2 > super.field423.field911) {
                int var20 = arg0 + arg2 - super.field423.field911;
                arg2 -= var20;
                var18 += var20;
            }
            if (arg0 < super.field423.field881) {
                int var21 = super.field423.field881 - arg0;
                arg2 -= var21;
                var17 += var21;
                var8 += var13 * var21;
                var18 += var21;
            }
            int[] var22 = super.field423.field895;
            if (arg6 == 0) {
                if (arg4 == 0) {
                    int var23 = var8;
                    for (int var24 = -arg3; var24 < 0; ++var24) {
                        int var25 = (var9 >> 16) * super.field419;
                        for (int var26 = -arg2; var26 < 0; ++var26) {
                            var22[var17++] = this.field4598[this.field4599[(var8 >> 16) + var25] & 255];
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
                        int var32 = (var9 >> 16) * super.field419;
                        for (int var33 = -arg2; var33 < 0; ++var33) {
                            int var34 = this.field4598[this.field4599[(var8 >> 16) + var32] & 255];
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
                        int var45 = (var9 >> 16) * super.field419;
                        for (int var46 = -arg2; var46 < 0; ++var46) {
                            int var47 = this.field4598[this.field4599[(var8 >> 16) + var45] & 255];
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
                        int var52 = (var9 >> 16) * super.field419;
                        for (int var53 = -arg2; var53 < 0; ++var53) {
                            byte var54 = this.field4599[(var8 >> 16) + var52];
                            if (var54 != 0) {
                                var22[var17++] = this.field4598[var54 & 255];
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
                            int var59 = (var9 >> 16) * super.field419;
                            for (int var60 = -arg2; var60 < 0; ++var60) {
                                byte var61 = this.field4599[(var8 >> 16) + var59];
                                if (var61 != 0) {
                                    int var62 = this.field4598[var61 & 255];
                                    int var63 = var22[var17];
                                    var22[var17++] = ((var62 & 16711935) * var56 + (var63 & 16711935) * var57 & -16711936) + ((var62 & 65280) * var56 + (var63 & 65280) * var57 & 16711680) >> 8;
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
                        int var64 = (arg5 & 16711680) >> 16;
                        int var65 = (arg5 & 65280) >> 8;
                        int var66 = arg5 & 255;
                        int var67 = arg5 >>> 24;
                        int var68 = 256 - var67;
                        for (int var69 = -arg3; var69 < 0; ++var69) {
                            int var70 = (var9 >> 16) * super.field419;
                            for (int var71 = -arg2; var71 < 0; ++var71) {
                                byte var72 = this.field4599[(var8 >> 16) + var70];
                                if (var72 != 0) {
                                    int var73 = this.field4598[var72 & 255];
                                    if (var67 != 255) {
                                        int var74 = (var73 & 16711680) * var64 & -16777216;
                                        int var75 = (var73 & 65280) * var65 & 16711680;
                                        int var76 = (var73 & 255) * var66 & 65280;
                                        int var77 = (var74 | var75 | var76) >>> 8;
                                        int var78 = var22[var17];
                                        var22[var17++] = ((var77 & 16711935) * var67 + (var78 & 16711935) * var68 & -16711936) + ((var77 & 65280) * var67 + (var78 & 65280) * var68 & 16711680) >> 8;
                                    } else {
                                        int var79 = (var73 & 16711680) * var64 & -16777216;
                                        int var80 = (var73 & 65280) * var65 & 16711680;
                                        int var81 = (var73 & 255) * var66 & 65280;
                                        var22[var17++] = (var79 | var80 | var81) >>> 8;
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
                    int var82 = arg5 >>> 24;
                    int var83 = 256 - var82;
                    int var84 = (arg5 & 16711935) * var83 & -16711936;
                    int var85 = (arg5 & 65280) * var83 & 16711680;
                    int var86 = (var84 | var85) >>> 8;
                    int var87 = var8;
                    for (int var88 = -arg3; var88 < 0; ++var88) {
                        int var89 = (var9 >> 16) * super.field419;
                        for (int var90 = -arg2; var90 < 0; ++var90) {
                            byte var91 = this.field4599[(var8 >> 16) + var89];
                            if (var91 != 0) {
                                int var92 = this.field4598[var91 & 255];
                                int var93 = (var92 & 16711935) * var82 & -16711936;
                                int var94 = (var92 & 65280) * var82 & 16711680;
                                var22[var17++] = ((var93 | var94) >>> 8) + var86;
                            } else {
                                ++var17;
                            }
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var87;
                        var17 += var18;
                    }
                }
            } else if (arg6 != 2) {
                throw new IllegalArgumentException();
            } else if (arg4 == 0) {
                int var95 = var8;
                for (int var96 = -arg3; var96 < 0; ++var96) {
                    int var97 = (var9 >> 16) * super.field419;
                    for (int var98 = -arg2; var98 < 0; ++var98) {
                        byte var99 = this.field4599[(var8 >> 16) + var97];
                        if (var99 != 0) {
                            int var100 = this.field4598[var99 & 255];
                            int var101 = var22[var17];
                            int var102 = var100 + var101;
                            int var103 = (var100 & 16711935) + (var101 & 16711935);
                            int var104 = (var102 - var103 & 65536) + (var103 & 16777472);
                            var22[var17++] = var102 - var104 | var104 - (var104 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var95;
                    var17 += var18;
                }
            } else if (arg4 == 1) {
                int var105 = var8;
                int var106 = (arg5 & 16711680) >> 16;
                int var107 = (arg5 & 65280) >> 8;
                int var108 = arg5 & 255;
                for (int var109 = -arg3; var109 < 0; ++var109) {
                    int var110 = (var9 >> 16) * super.field419;
                    for (int var111 = -arg2; var111 < 0; ++var111) {
                        byte var112 = this.field4599[(var8 >> 16) + var110];
                        if (var112 != 0) {
                            int var113 = this.field4598[var112 & 255];
                            int var114 = (var113 & 16711680) * var106 & -16777216;
                            int var115 = (var113 & 65280) * var107 & 16711680;
                            int var116 = (var113 & 255) * var108 & 65280;
                            int var117 = (var114 | var115 | var116) >>> 8;
                            int var118 = var22[var17];
                            int var119 = var117 + var118;
                            int var120 = (var117 & 16711935) + (var118 & 16711935);
                            int var121 = (var119 - var120 & 65536) + (var120 & 16777472);
                            var22[var17++] = var119 - var121 | var121 - (var121 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var105;
                    var17 += var18;
                }
            } else if (arg4 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var122 = arg5 >>> 24;
                int var123 = 256 - var122;
                int var124 = (arg5 & 16711935) * var123 & -16711936;
                int var125 = (arg5 & 65280) * var123 & 16711680;
                int var126 = (var124 | var125) >>> 8;
                int var127 = var8;
                for (int var128 = -arg3; var128 < 0; ++var128) {
                    int var129 = (var9 >> 16) * super.field419;
                    for (int var130 = -arg2; var130 < 0; ++var130) {
                        byte var131 = this.field4599[(var8 >> 16) + var129];
                        if (var131 != 0) {
                            int var132 = this.field4598[var131 & 255];
                            int var133 = (var132 & 16711935) * var122 & -16711936;
                            int var134 = (var132 & 65280) * var122 & 16711680;
                            int var135 = ((var133 | var134) >>> 8) + var126;
                            int var136 = var22[var17];
                            int var137 = var135 + var136;
                            int var138 = (var135 & 16711935) + (var136 & 16711935);
                            int var139 = (var137 - var138 & 65536) + (var138 & 16777472);
                            var22[var17++] = var137 - var139 | var139 - (var139 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var127;
                    var17 += var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V", line = 601)
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (super.field423.method425()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field423.field889;
            int var7 = super.field425 + arg0;
            int var8 = super.field400 + arg1;
            int var9 = var6 * var8 + var7;
            int var10 = 0;
            int var11 = super.field412;
            int var12 = super.field419;
            int var13 = var6 - var12;
            int var14 = 0;
            if (var8 < super.field423.field884) {
                int var15 = super.field423.field884 - var8;
                var11 -= var15;
                var8 = super.field423.field884;
                var10 += var12 * var15;
                var9 += var6 * var15;
            }
            if (var8 + var11 > super.field423.field883) {
                var11 -= var8 + var11 - super.field423.field883;
            }
            if (var7 < super.field423.field881) {
                int var16 = super.field423.field881 - var7;
                var12 -= var16;
                var7 = super.field423.field881;
                var10 += var16;
                var9 += var16;
                var14 += var16;
                var13 += var16;
            }
            if (var7 + var12 > super.field423.field911) {
                int var17 = var7 + var12 - super.field423.field911;
                var12 -= var17;
                var14 += var17;
                var13 += var17;
            }
            if (var12 > 0 && var11 > 0) {
                int[] var18 = super.field423.field895;
                if (arg4 == 0) {
                    if (arg2 == 0) {
                        for (int var19 = -var11; var19 < 0; ++var19) {
                            int var20 = var9 + var12 - 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field4598[this.field4599[var10++] & 255];
                                var18[var9++] = this.field4598[this.field4599[var10++] & 255];
                                var18[var9++] = this.field4598[this.field4599[var10++] & 255];
                                var18[var9++] = this.field4598[this.field4599[var10++] & 255];
                            }
                            var20 += 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field4598[this.field4599[var10++] & 255];
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
                                int var26 = this.field4598[this.field4599[var10++] & 255];
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
                                int var37 = this.field4598[this.field4599[var10++] & 255];
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
                                byte var43 = this.field4599[var10++];
                                if (var43 != 0) {
                                    var18[var9++] = this.field4598[var43 & 255];
                                } else {
                                    ++var9;
                                }
                                byte var44 = this.field4599[var10++];
                                if (var44 != 0) {
                                    var18[var9++] = this.field4598[var44 & 255];
                                } else {
                                    ++var9;
                                }
                                byte var45 = this.field4599[var10++];
                                if (var45 != 0) {
                                    var18[var9++] = this.field4598[var45 & 255];
                                } else {
                                    ++var9;
                                }
                                byte var46 = this.field4599[var10++];
                                if (var46 != 0) {
                                    var18[var9++] = this.field4598[var46 & 255];
                                } else {
                                    ++var9;
                                }
                            }
                            var41 += 3;
                            while (var9 < var41) {
                                byte var42 = this.field4599[var10++];
                                if (var42 != 0) {
                                    var18[var9++] = this.field4598[var42 & 255];
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
                                    byte var51 = this.field4599[var10++];
                                    if (var51 != 0) {
                                        int var52 = this.field4598[var51 & 255];
                                        int var53 = var18[var9];
                                        var18[var9++] = ((var52 & 16711935) * var47 + (var53 & 16711935) * var48 & -16711936) + ((var52 & 65280) * var47 + (var53 & 65280) * var48 & 16711680) >> 8;
                                    } else {
                                        ++var9;
                                    }
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        } else {
                            int var54 = (arg3 & 16711680) >> 16;
                            int var55 = (arg3 & 65280) >> 8;
                            int var56 = arg3 & 255;
                            int var57 = arg3 >>> 24;
                            int var58 = 256 - var57;
                            for (int var59 = -var11; var59 < 0; ++var59) {
                                for (int var60 = -var12; var60 < 0; ++var60) {
                                    byte var61 = this.field4599[var10++];
                                    if (var61 != 0) {
                                        int var62 = this.field4598[var61 & 255];
                                        if (var57 != 255) {
                                            int var63 = (var62 & 16711680) * var54 & -16777216;
                                            int var64 = (var62 & 65280) * var55 & 16711680;
                                            int var65 = (var62 & 255) * var56 & 65280;
                                            int var66 = (var63 | var64 | var65) >>> 8;
                                            int var67 = var18[var9];
                                            var18[var9++] = ((var66 & 16711935) * var57 + (var67 & 16711935) * var58 & -16711936) + ((var66 & 65280) * var57 + (var67 & 65280) * var58 & 16711680) >> 8;
                                        } else {
                                            int var68 = (var62 & 16711680) * var54 & -16777216;
                                            int var69 = (var62 & 65280) * var55 & 16711680;
                                            int var70 = (var62 & 255) * var56 & 65280;
                                            var18[var9++] = (var68 | var69 | var70) >>> 8;
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
                        int var71 = arg3 >>> 24;
                        int var72 = 256 - var71;
                        int var73 = (arg3 & 16711935) * var72 & -16711936;
                        int var74 = (arg3 & 65280) * var72 & 16711680;
                        int var75 = (var73 | var74) >>> 8;
                        for (int var76 = -var11; var76 < 0; ++var76) {
                            for (int var77 = -var12; var77 < 0; ++var77) {
                                byte var78 = this.field4599[var10++];
                                if (var78 != 0) {
                                    int var79 = this.field4598[var78 & 255];
                                    int var80 = (var79 & 16711935) * var71 & -16711936;
                                    int var81 = (var79 & 65280) * var71 & 16711680;
                                    var18[var9++] = ((var80 | var81) >>> 8) + var75;
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
                    for (int var82 = -var11; var82 < 0; ++var82) {
                        for (int var83 = -var12; var83 < 0; ++var83) {
                            byte var84 = this.field4599[var10++];
                            if (var84 != 0) {
                                int var85 = this.field4598[var84 & 255];
                                int var86 = var18[var9];
                                int var87 = var85 + var86;
                                int var88 = (var85 & 16711935) + (var86 & 16711935);
                                int var89 = (var87 - var88 & 65536) + (var88 & 16777472);
                                var18[var9++] = var87 - var89 | var89 - (var89 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 == 1) {
                    int var90 = (arg3 & 16711680) >> 16;
                    int var91 = (arg3 & 65280) >> 8;
                    int var92 = arg3 & 255;
                    for (int var93 = -var11; var93 < 0; ++var93) {
                        for (int var94 = -var12; var94 < 0; ++var94) {
                            byte var95 = this.field4599[var10++];
                            if (var95 != 0) {
                                int var96 = this.field4598[var95 & 255];
                                int var97 = (var96 & 16711680) * var90 & -16777216;
                                int var98 = (var96 & 65280) * var91 & 16711680;
                                int var99 = (var96 & 255) * var92 & 65280;
                                int var100 = (var97 | var98 | var99) >>> 8;
                                int var101 = var18[var9];
                                int var102 = var100 + var101;
                                int var103 = (var100 & 16711935) + (var101 & 16711935);
                                int var104 = (var102 - var103 & 65536) + (var103 & 16777472);
                                var18[var9++] = var102 - var104 | var104 - (var104 >>> 8);
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
                    int var105 = arg3 >>> 24;
                    int var106 = 256 - var105;
                    int var107 = (arg3 & 16711935) * var106 & -16711936;
                    int var108 = (arg3 & 65280) * var106 & 16711680;
                    int var109 = (var107 | var108) >>> 8;
                    for (int var110 = -var11; var110 < 0; ++var110) {
                        for (int var111 = -var12; var111 < 0; ++var111) {
                            byte var112 = this.field4599[var10++];
                            if (var112 != 0) {
                                int var113 = this.field4598[var112 & 255];
                                int var114 = (var113 & 16711935) * var105 & -16711936;
                                int var115 = (var113 & 65280) * var105 & 16711680;
                                int var116 = ((var114 | var115) >>> 8) + var109;
                                int var117 = var18[var9];
                                int var118 = var116 + var117;
                                int var119 = (var116 & 16711935) + (var117 & 16711935);
                                int var120 = (var118 - var119 & 65536) + (var119 & 16777472);
                                var18[var9++] = var118 - var120 | var120 - (var120 >>> 8);
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([I[III)V", line = 1155)
    public final void method203(int[] arg0, int[] arg1, int arg2, int arg3) {
        int[] var5 = super.field423.field895;
        if (class23.field413 == 0) {
            if (class23.field397 == 0) {
                int var6 = class23.field417;
                while (var6 < 0) {
                    int var7 = arg3 + var6;
                    if (var7 >= 0) {
                        if (var7 >= arg0.length) {
                            return;
                        }
                        int var8 = class23.field398;
                        int var9 = class23.field421;
                        int var10 = class23.field399;
                        int var11 = class23.field428;
                        if (var9 >= 0 && var10 >= 0 && var9 - (super.field419 << 12) < 0 && var10 - (super.field412 << 12) < 0) {
                            int var12 = arg0[var7] - arg2;
                            int var13 = -arg1[var7];
                            int var14 = var12 - (var8 - class23.field398);
                            if (var14 > 0) {
                                var8 += var14;
                                var11 += var14;
                                var9 += class23.field413 * var14;
                                var10 += class23.field397 * var14;
                            } else {
                                var13 -= var14;
                            }
                            if (var11 < var13) {
                                var11 = var13;
                            }
                            while (var11 < 0) {
                                byte var15 = this.field4599[(var9 >> 12) + (var10 >> 12) * super.field419];
                                if (var15 != 0) {
                                    var5[var8++] = this.field4598[var15 & 255];
                                } else {
                                    ++var8;
                                }
                                ++var11;
                            }
                        }
                    }
                    ++var6;
                    class23.field398 += class23.field409;
                }
            } else if (class23.field397 < 0) {
                int var16 = class23.field417;
                while (var16 < 0) {
                    int var17 = arg3 + var16;
                    if (var17 >= 0) {
                        if (var17 >= arg0.length) {
                            return;
                        }
                        int var18 = class23.field398;
                        int var19 = class23.field421;
                        int var20 = class23.field424 + class23.field399;
                        int var21 = class23.field428;
                        if (var19 >= 0 && var19 - (super.field419 << 12) < 0) {
                            int var22;
                            if ((var22 = var20 - (super.field412 << 12)) >= 0) {
                                int var23 = (class23.field397 - var22) / class23.field397;
                                var21 += var23;
                                var20 += class23.field397 * var23;
                                var18 += var23;
                            }
                            int var24;
                            if ((var24 = (var20 - class23.field397) / class23.field397) > var21) {
                                var21 = var24;
                            }
                            int var25 = arg0[var17] - arg2;
                            int var26 = -arg1[var17];
                            int var27 = var25 - (var18 - class23.field398);
                            if (var27 > 0) {
                                var18 += var27;
                                var21 += var27;
                                var19 += class23.field413 * var27;
                                var20 += class23.field397 * var27;
                            } else {
                                var26 -= var27;
                            }
                            if (var21 < var26) {
                                var21 = var26;
                            }
                            while (var21 < 0) {
                                byte var28 = this.field4599[(var19 >> 12) + (var20 >> 12) * super.field419];
                                if (var28 != 0) {
                                    var5[var18++] = this.field4598[var28 & 255];
                                } else {
                                    ++var18;
                                }
                                var20 += class23.field397;
                                ++var21;
                            }
                        }
                    }
                    ++var16;
                    class23.field421 += class23.field401;
                    class23.field398 += class23.field409;
                }
            } else {
                int var29 = class23.field417;
                while (var29 < 0) {
                    int var30 = arg3 + var29;
                    if (var30 >= 0) {
                        if (var30 >= arg0.length) {
                            return;
                        }
                        int var31 = class23.field398;
                        int var32 = class23.field421;
                        int var33 = class23.field424 + class23.field399;
                        int var34 = class23.field428;
                        if (var32 >= 0 && var32 - (super.field419 << 12) < 0) {
                            if (var33 < 0) {
                                int var35 = (class23.field397 - 1 - var33) / class23.field397;
                                var34 += var35;
                                var33 += class23.field397 * var35;
                                var31 += var35;
                            }
                            int var36;
                            if ((var36 = (var33 + 1 - (super.field412 << 12) - class23.field397) / class23.field397) > var34) {
                                var34 = var36;
                            }
                            int var37 = arg0[var30] - arg2;
                            int var38 = -arg1[var30];
                            int var39 = var37 - (var31 - class23.field398);
                            if (var39 > 0) {
                                var31 += var39;
                                var34 += var39;
                                var32 += class23.field413 * var39;
                                var33 += class23.field397 * var39;
                            } else {
                                var38 -= var39;
                            }
                            if (var34 < var38) {
                                var34 = var38;
                            }
                            while (var34 < 0) {
                                byte var40 = this.field4599[(var32 >> 12) + (var33 >> 12) * super.field419];
                                if (var40 != 0) {
                                    var5[var31++] = this.field4598[var40 & 255];
                                } else {
                                    ++var31;
                                }
                                var33 += class23.field397;
                                ++var34;
                            }
                        }
                    }
                    ++var29;
                    class23.field421 += class23.field401;
                    class23.field398 += class23.field409;
                }
            }
        } else if (class23.field413 < 0) {
            if (class23.field397 == 0) {
                int var41 = class23.field417;
                while (var41 < 0) {
                    int var42 = arg3 + var41;
                    if (var42 >= 0) {
                        if (var42 >= arg0.length) {
                            return;
                        }
                        int var43 = class23.field398;
                        int var44 = class23.field421 + class23.field406;
                        int var45 = class23.field399;
                        int var46 = class23.field428;
                        if (var45 >= 0 && var45 - (super.field412 << 12) < 0) {
                            int var47;
                            if ((var47 = var44 - (super.field419 << 12)) >= 0) {
                                int var48 = (class23.field413 - var47) / class23.field413;
                                var46 += var48;
                                var44 += class23.field413 * var48;
                                var43 += var48;
                            }
                            int var49;
                            if ((var49 = (var44 - class23.field413) / class23.field413) > var46) {
                                var46 = var49;
                            }
                            int var50 = arg0[var42] - arg2;
                            int var51 = -arg1[var42];
                            int var52 = var50 - (var43 - class23.field398);
                            if (var52 > 0) {
                                var43 += var52;
                                var46 += var52;
                                var44 += class23.field413 * var52;
                                var45 += class23.field397 * var52;
                            } else {
                                var51 -= var52;
                            }
                            if (var46 < var51) {
                                var46 = var51;
                            }
                            while (var46 < 0) {
                                byte var53 = this.field4599[(var44 >> 12) + (var45 >> 12) * super.field419];
                                if (var53 != 0) {
                                    var5[var43++] = this.field4598[var53 & 255];
                                } else {
                                    ++var43;
                                }
                                var44 += class23.field413;
                                ++var46;
                            }
                        }
                    }
                    ++var41;
                    class23.field399 += class23.field410;
                    class23.field398 += class23.field409;
                }
            } else if (class23.field397 < 0) {
                int var54 = class23.field417;
                while (var54 < 0) {
                    int var55 = arg3 + var54;
                    if (var55 >= 0) {
                        if (var55 >= arg0.length) {
                            return;
                        }
                        int var56 = class23.field398;
                        int var57 = class23.field421 + class23.field406;
                        int var58 = class23.field424 + class23.field399;
                        int var59 = class23.field428;
                        int var60;
                        if ((var60 = var57 - (super.field419 << 12)) >= 0) {
                            int var61 = (class23.field413 - var60) / class23.field413;
                            var59 += var61;
                            var57 += class23.field413 * var61;
                            var58 += class23.field397 * var61;
                            var56 += var61;
                        }
                        int var62;
                        if ((var62 = (var57 - class23.field413) / class23.field413) > var59) {
                            var59 = var62;
                        }
                        int var63;
                        if ((var63 = var58 - (super.field412 << 12)) >= 0) {
                            int var64 = (class23.field397 - var63) / class23.field397;
                            var59 += var64;
                            var57 += class23.field413 * var64;
                            var58 += class23.field397 * var64;
                            var56 += var64;
                        }
                        int var65;
                        if ((var65 = (var58 - class23.field397) / class23.field397) > var59) {
                            var59 = var65;
                        }
                        int var66 = arg0[var55] - arg2;
                        int var67 = -arg1[var55];
                        int var68 = var66 - (var56 - class23.field398);
                        if (var68 > 0) {
                            var56 += var68;
                            var59 += var68;
                            var57 += class23.field413 * var68;
                            var58 += class23.field397 * var68;
                        } else {
                            var67 -= var68;
                        }
                        if (var59 < var67) {
                            var59 = var67;
                        }
                        while (var59 < 0) {
                            byte var69 = this.field4599[(var57 >> 12) + (var58 >> 12) * super.field419];
                            if (var69 != 0) {
                                var5[var56++] = this.field4598[var69 & 255];
                            } else {
                                ++var56;
                            }
                            var57 += class23.field413;
                            var58 += class23.field397;
                            ++var59;
                        }
                    }
                    ++var54;
                    class23.field421 += class23.field401;
                    class23.field399 += class23.field410;
                    class23.field398 += class23.field409;
                }
            } else {
                int var70 = class23.field417;
                while (var70 < 0) {
                    int var71 = arg3 + var70;
                    if (var71 >= 0) {
                        if (var71 >= arg0.length) {
                            return;
                        }
                        int var72 = class23.field398;
                        int var73 = class23.field421 + class23.field406;
                        int var74 = class23.field424 + class23.field399;
                        int var75 = class23.field428;
                        int var76;
                        if ((var76 = var73 - (super.field419 << 12)) >= 0) {
                            int var77 = (class23.field413 - var76) / class23.field413;
                            var75 += var77;
                            var73 += class23.field413 * var77;
                            var74 += class23.field397 * var77;
                            var72 += var77;
                        }
                        int var78;
                        if ((var78 = (var73 - class23.field413) / class23.field413) > var75) {
                            var75 = var78;
                        }
                        if (var74 < 0) {
                            int var79 = (class23.field397 - 1 - var74) / class23.field397;
                            var75 += var79;
                            var73 += class23.field413 * var79;
                            var74 += class23.field397 * var79;
                            var72 += var79;
                        }
                        int var80;
                        if ((var80 = (var74 + 1 - (super.field412 << 12) - class23.field397) / class23.field397) > var75) {
                            var75 = var80;
                        }
                        int var81 = arg0[var71] - arg2;
                        int var82 = -arg1[var71];
                        int var83 = var81 - (var72 - class23.field398);
                        if (var83 > 0) {
                            var72 += var83;
                            var75 += var83;
                            var73 += class23.field413 * var83;
                            var74 += class23.field397 * var83;
                        } else {
                            var82 -= var83;
                        }
                        if (var75 < var82) {
                            var75 = var82;
                        }
                        while (var75 < 0) {
                            byte var84 = this.field4599[(var73 >> 12) + (var74 >> 12) * super.field419];
                            if (var84 != 0) {
                                var5[var72++] = this.field4598[var84 & 255];
                            } else {
                                ++var72;
                            }
                            var73 += class23.field413;
                            var74 += class23.field397;
                            ++var75;
                        }
                    }
                    ++var70;
                    class23.field421 += class23.field401;
                    class23.field399 += class23.field410;
                    class23.field398 += class23.field409;
                }
            }
        } else if (class23.field397 == 0) {
            int var85 = class23.field417;
            while (var85 < 0) {
                int var86 = arg3 + var85;
                if (var86 >= 0) {
                    if (var86 >= arg0.length) {
                        return;
                    }
                    int var87 = class23.field398;
                    int var88 = class23.field421 + class23.field406;
                    int var89 = class23.field399;
                    int var90 = class23.field428;
                    if (var89 >= 0 && var89 - (super.field412 << 12) < 0) {
                        if (var88 < 0) {
                            int var91 = (class23.field413 - 1 - var88) / class23.field413;
                            var90 += var91;
                            var88 += class23.field413 * var91;
                            var87 += var91;
                        }
                        int var92;
                        if ((var92 = (var88 + 1 - (super.field419 << 12) - class23.field413) / class23.field413) > var90) {
                            var90 = var92;
                        }
                        int var93 = arg0[var86] - arg2;
                        int var94 = -arg1[var86];
                        int var95 = var93 - (var87 - class23.field398);
                        if (var95 > 0) {
                            var87 += var95;
                            var90 += var95;
                            var88 += class23.field413 * var95;
                            var89 += class23.field397 * var95;
                        } else {
                            var94 -= var95;
                        }
                        if (var90 < var94) {
                            var90 = var94;
                        }
                        while (var90 < 0) {
                            byte var96 = this.field4599[(var88 >> 12) + (var89 >> 12) * super.field419];
                            if (var96 != 0) {
                                var5[var87++] = this.field4598[var96 & 255];
                            } else {
                                ++var87;
                            }
                            var88 += class23.field413;
                            ++var90;
                        }
                    }
                }
                ++var85;
                class23.field421 += class23.field401;
                class23.field399 += class23.field410;
                class23.field398 += class23.field409;
            }
        } else if (class23.field397 < 0) {
            int var97 = class23.field417;
            while (var97 < 0) {
                int var98 = arg3 + var97;
                if (var98 >= 0) {
                    if (var98 >= arg0.length) {
                        return;
                    }
                    int var99 = class23.field398;
                    int var100 = class23.field421 + class23.field406;
                    int var101 = class23.field424 + class23.field399;
                    int var102 = class23.field428;
                    if (var100 < 0) {
                        int var103 = (class23.field413 - 1 - var100) / class23.field413;
                        var102 += var103;
                        var100 += class23.field413 * var103;
                        var101 += class23.field397 * var103;
                        var99 += var103;
                    }
                    int var104;
                    if ((var104 = (var100 + 1 - (super.field419 << 12) - class23.field413) / class23.field413) > var102) {
                        var102 = var104;
                    }
                    int var105;
                    if ((var105 = var101 - (super.field412 << 12)) >= 0) {
                        int var106 = (class23.field397 - var105) / class23.field397;
                        var102 += var106;
                        var100 += class23.field413 * var106;
                        var101 += class23.field397 * var106;
                        var99 += var106;
                    }
                    int var107;
                    if ((var107 = (var101 - class23.field397) / class23.field397) > var102) {
                        var102 = var107;
                    }
                    int var108 = arg0[var98] - arg2;
                    int var109 = -arg1[var98];
                    int var110 = var108 - (var99 - class23.field398);
                    if (var110 > 0) {
                        var99 += var110;
                        var102 += var110;
                        var100 += class23.field413 * var110;
                        var101 += class23.field397 * var110;
                    } else {
                        var109 -= var110;
                    }
                    if (var102 < var109) {
                        var102 = var109;
                    }
                    while (var102 < 0) {
                        byte var111 = this.field4599[(var100 >> 12) + (var101 >> 12) * super.field419];
                        if (var111 != 0) {
                            var5[var99++] = this.field4598[var111 & 255];
                        } else {
                            ++var99;
                        }
                        var100 += class23.field413;
                        var101 += class23.field397;
                        ++var102;
                    }
                }
                ++var97;
                class23.field421 += class23.field401;
                class23.field399 += class23.field410;
                class23.field398 += class23.field409;
            }
        } else {
            int var112 = class23.field417;
            while (var112 < 0) {
                int var113 = arg3 + var112;
                if (var113 >= 0) {
                    if (var113 >= arg0.length) {
                        return;
                    }
                    int var114 = class23.field398;
                    int var115 = class23.field421 + class23.field406;
                    int var116 = class23.field424 + class23.field399;
                    int var117 = class23.field428;
                    if (var115 < 0) {
                        int var118 = (class23.field413 - 1 - var115) / class23.field413;
                        var117 += var118;
                        var115 += class23.field413 * var118;
                        var116 += class23.field397 * var118;
                        var114 += var118;
                    }
                    int var119;
                    if ((var119 = (var115 + 1 - (super.field419 << 12) - class23.field413) / class23.field413) > var117) {
                        var117 = var119;
                    }
                    if (var116 < 0) {
                        int var120 = (class23.field397 - 1 - var116) / class23.field397;
                        var117 += var120;
                        var115 += class23.field413 * var120;
                        var116 += class23.field397 * var120;
                        var114 += var120;
                    }
                    int var121;
                    if ((var121 = (var116 + 1 - (super.field412 << 12) - class23.field397) / class23.field397) > var117) {
                        var117 = var121;
                    }
                    int var122 = arg0[var113] - arg2;
                    int var123 = -arg1[var113];
                    int var124 = var122 - (var114 - class23.field398);
                    if (var124 > 0) {
                        var114 += var124;
                        var117 += var124;
                        var115 += class23.field413 * var124;
                        var116 += class23.field397 * var124;
                    } else {
                        var123 -= var124;
                    }
                    if (var117 < var123) {
                        var117 = var123;
                    }
                    while (var117 < 0) {
                        byte var125 = this.field4599[(var115 >> 12) + (var116 >> 12) * super.field419];
                        if (var125 != 0) {
                            var5[var114++] = this.field4598[var125 & 255];
                        } else {
                            ++var114;
                        }
                        var115 += class23.field413;
                        var116 += class23.field397;
                        ++var117;
                    }
                }
                ++var112;
                class23.field421 += class23.field401;
                class23.field399 += class23.field410;
                class23.field398 += class23.field409;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)V", line = 1899)
    public final void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V", line = 1903)
    public final void method204(int arg0, int arg1) {
        int[] var3 = super.field423.field895;
        if (class23.field413 == 0) {
            if (class23.field397 == 0) {
                int var4 = class23.field417;
                while (var4 < 0) {
                    int var5 = class23.field398;
                    int var6 = class23.field421;
                    int var7 = class23.field399;
                    int var8 = class23.field428;
                    if (var6 >= 0 && var7 >= 0 && var6 - (super.field419 << 12) < 0 && var7 - (super.field412 << 12) < 0) {
                        while (var8 < 0) {
                            int var9 = (var6 >> 12) + (var7 >> 12) * super.field419;
                            int var10 = var5++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var10] = this.field4598[this.field4599[var9] & 255];
                                } else if (arg0 == 1) {
                                    int var14 = this.field4598[this.field4599[var9] & 255];
                                    int var15 = (var14 & 16711680) * class23.field403 & -16777216;
                                    int var16 = (var14 & 65280) * class23.field402 & 16711680;
                                    int var17 = (var14 & 255) * class23.field416 & 65280;
                                    var3[var10] = (var15 | var16 | var17) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var18 = this.field4598[this.field4599[var9] & 255];
                                    int var19 = (var18 & 16711935) * class23.field427 & -16711936;
                                    int var20 = (var18 & 65280) * class23.field427 & 16711680;
                                    var3[var10] = ((var19 | var20) >>> 8) + class23.field422;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    byte var21 = this.field4599[var9];
                                    if (var21 != 0) {
                                        var3[var10] = this.field4598[var21 & 255];
                                    }
                                } else if (arg0 == 1) {
                                    byte var22 = this.field4599[var9];
                                    if (var22 != 0) {
                                        int var23 = this.field4598[var22 & 255];
                                        if ((class23.field411 & 16777215) == 16777215) {
                                            int var24 = class23.field411 >>> 24;
                                            int var25 = 256 - var24;
                                            int var26 = var3[var10];
                                            var3[var10] = ((var23 & 16711935) * var24 + (var26 & 16711935) * var25 & -16711936) + ((var23 & 65280) * var24 + (var26 & 65280) * var25 & 16711680) >> 8;
                                        } else if (class23.field427 != 255) {
                                            int var27 = (var23 & 16711680) * class23.field403 & -16777216;
                                            int var28 = (var23 & 65280) * class23.field402 & 16711680;
                                            int var29 = (var23 & 255) * class23.field416 & 65280;
                                            int var30 = (var27 | var28 | var29) >>> 8;
                                            int var31 = var3[var10];
                                            var3[var10] = ((var30 & 16711935) * class23.field427 + (var31 & 16711935) * class23.field418 & -16711936) + ((var30 & 65280) * class23.field427 + (var31 & 65280) * class23.field418 & 16711680) >> 8;
                                        } else {
                                            int var32 = (var23 & 16711680) * class23.field403 & -16777216;
                                            int var33 = (var23 & 65280) * class23.field402 & 16711680;
                                            int var34 = (var23 & 255) * class23.field416 & 65280;
                                            var3[var10] = (var32 | var33 | var34) >>> 8;
                                        }
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var35 = this.field4599[var9];
                                    if (var35 != 0) {
                                        int var36 = this.field4598[var35 & 255];
                                        int var37 = (var36 & 16711935) * class23.field427 & -16711936;
                                        int var38 = (var36 & 65280) * class23.field427 & 16711680;
                                        var3[var10++] = ((var37 | var38) >>> 8) + class23.field422;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    byte var39 = this.field4599[var9];
                                    if (var39 != 0) {
                                        int var40 = this.field4598[var39 & 255];
                                        int var41 = var3[var10];
                                        int var42 = var40 + var41;
                                        int var43 = (var40 & 16711935) + (var41 & 16711935);
                                        int var44 = (var42 - var43 & 65536) + (var43 & 16777472);
                                        var3[var10] = var42 - var44 | var44 - (var44 >>> 8);
                                    }
                                } else if (arg0 == 1) {
                                    byte var45 = this.field4599[var9];
                                    if (var45 != 0) {
                                        int var46 = this.field4598[var45 & 255];
                                        int var47 = (var46 & 16711680) * class23.field403 & -16777216;
                                        int var48 = (var46 & 65280) * class23.field402 & 16711680;
                                        int var49 = (var46 & 255) * class23.field416 & 65280;
                                        int var50 = (var47 | var48 | var49) >>> 8;
                                        int var51 = var3[var10];
                                        int var52 = var50 + var51;
                                        int var53 = (var50 & 16711935) + (var51 & 16711935);
                                        int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                                        var3[var10] = var52 - var54 | var54 - (var54 >>> 8);
                                    }
                                } else if (arg0 == 2) {
                                    byte var55 = this.field4599[var9];
                                    if (var55 != 0) {
                                        int var56 = this.field4598[var55 & 255];
                                        int var57 = (var56 & 16711935) * class23.field427 & -16711936;
                                        int var58 = (var56 & 65280) * class23.field427 & 16711680;
                                        int var59 = ((var57 | var58) >>> 8) + class23.field422;
                                        int var60 = var3[var10];
                                        int var61 = var59 + var60;
                                        int var62 = (var59 & 16711935) + (var60 & 16711935);
                                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                                        var3[var10] = var61 - var63 | var63 - (var63 >>> 8);
                                    }
                                }
                            }
                            ++var8;
                        }
                    }
                    ++var4;
                    class23.field398 += class23.field409;
                }
            } else if (class23.field397 < 0) {
                int var64 = class23.field417;
                while (var64 < 0) {
                    int var65 = class23.field398;
                    int var66 = class23.field421;
                    int var67 = class23.field424 + class23.field399;
                    int var68 = class23.field428;
                    if (var66 >= 0 && var66 - (super.field419 << 12) < 0) {
                        int var69;
                        if ((var69 = var67 - (super.field412 << 12)) >= 0) {
                            int var70 = (class23.field397 - var69) / class23.field397;
                            var68 += var70;
                            var67 += class23.field397 * var70;
                            var65 += var70;
                        }
                        int var71;
                        if ((var71 = (var67 - class23.field397) / class23.field397) > var68) {
                            var68 = var71;
                        }
                        while (var68 < 0) {
                            int var72 = (var66 >> 12) + (var67 >> 12) * super.field419;
                            int var73 = var65++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var73] = this.field4598[this.field4599[var72] & 255];
                                } else if (arg0 == 1) {
                                    int var77 = this.field4598[this.field4599[var72] & 255];
                                    int var78 = (var77 & 16711680) * class23.field403 & -16777216;
                                    int var79 = (var77 & 65280) * class23.field402 & 16711680;
                                    int var80 = (var77 & 255) * class23.field416 & 65280;
                                    var3[var73] = (var78 | var79 | var80) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var81 = this.field4598[this.field4599[var72] & 255];
                                    int var82 = (var81 & 16711935) * class23.field427 & -16711936;
                                    int var83 = (var81 & 65280) * class23.field427 & 16711680;
                                    var3[var73] = ((var82 | var83) >>> 8) + class23.field422;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    byte var84 = this.field4599[var72];
                                    if (var84 != 0) {
                                        var3[var73] = this.field4598[var84 & 255];
                                    }
                                } else if (arg0 == 1) {
                                    byte var85 = this.field4599[var72];
                                    if (var85 != 0) {
                                        int var86 = this.field4598[var85 & 255];
                                        if ((class23.field411 & 16777215) == 16777215) {
                                            int var87 = class23.field411 >>> 24;
                                            int var88 = 256 - var87;
                                            int var89 = var3[var73];
                                            var3[var73] = ((var86 & 16711935) * var87 + (var89 & 16711935) * var88 & -16711936) + ((var86 & 65280) * var87 + (var89 & 65280) * var88 & 16711680) >> 8;
                                        } else if (class23.field427 != 255) {
                                            int var90 = (var86 & 16711680) * class23.field403 & -16777216;
                                            int var91 = (var86 & 65280) * class23.field402 & 16711680;
                                            int var92 = (var86 & 255) * class23.field416 & 65280;
                                            int var93 = (var90 | var91 | var92) >>> 8;
                                            int var94 = var3[var73];
                                            var3[var73] = ((var93 & 16711935) * class23.field427 + (var94 & 16711935) * class23.field418 & -16711936) + ((var93 & 65280) * class23.field427 + (var94 & 65280) * class23.field418 & 16711680) >> 8;
                                        } else {
                                            int var95 = (var86 & 16711680) * class23.field403 & -16777216;
                                            int var96 = (var86 & 65280) * class23.field402 & 16711680;
                                            int var97 = (var86 & 255) * class23.field416 & 65280;
                                            var3[var73] = (var95 | var96 | var97) >>> 8;
                                        }
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var98 = this.field4599[var72];
                                    if (var98 != 0) {
                                        int var99 = this.field4598[var98 & 255];
                                        int var100 = (var99 & 16711935) * class23.field427 & -16711936;
                                        int var101 = (var99 & 65280) * class23.field427 & 16711680;
                                        var3[var73++] = ((var100 | var101) >>> 8) + class23.field422;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    byte var102 = this.field4599[var72];
                                    if (var102 != 0) {
                                        int var103 = this.field4598[var102 & 255];
                                        int var104 = var3[var73];
                                        int var105 = var103 + var104;
                                        int var106 = (var103 & 16711935) + (var104 & 16711935);
                                        int var107 = (var105 - var106 & 65536) + (var106 & 16777472);
                                        var3[var73] = var105 - var107 | var107 - (var107 >>> 8);
                                    }
                                } else if (arg0 == 1) {
                                    byte var108 = this.field4599[var72];
                                    if (var108 != 0) {
                                        int var109 = this.field4598[var108 & 255];
                                        int var110 = (var109 & 16711680) * class23.field403 & -16777216;
                                        int var111 = (var109 & 65280) * class23.field402 & 16711680;
                                        int var112 = (var109 & 255) * class23.field416 & 65280;
                                        int var113 = (var110 | var111 | var112) >>> 8;
                                        int var114 = var3[var73];
                                        int var115 = var113 + var114;
                                        int var116 = (var113 & 16711935) + (var114 & 16711935);
                                        int var117 = (var115 - var116 & 65536) + (var116 & 16777472);
                                        var3[var73] = var115 - var117 | var117 - (var117 >>> 8);
                                    }
                                } else if (arg0 == 2) {
                                    byte var118 = this.field4599[var72];
                                    if (var118 != 0) {
                                        int var119 = this.field4598[var118 & 255];
                                        int var120 = (var119 & 16711935) * class23.field427 & -16711936;
                                        int var121 = (var119 & 65280) * class23.field427 & 16711680;
                                        int var122 = ((var120 | var121) >>> 8) + class23.field422;
                                        int var123 = var3[var73];
                                        int var124 = var122 + var123;
                                        int var125 = (var122 & 16711935) + (var123 & 16711935);
                                        int var126 = (var124 - var125 & 65536) + (var125 & 16777472);
                                        var3[var73] = var124 - var126 | var126 - (var126 >>> 8);
                                    }
                                }
                            }
                            var67 += class23.field397;
                            ++var68;
                        }
                    }
                    ++var64;
                    class23.field421 += class23.field401;
                    class23.field398 += class23.field409;
                }
            } else {
                int var127 = class23.field417;
                while (var127 < 0) {
                    int var128 = class23.field398;
                    int var129 = class23.field421;
                    int var130 = class23.field424 + class23.field399;
                    int var131 = class23.field428;
                    if (var129 >= 0 && var129 - (super.field419 << 12) < 0) {
                        if (var130 < 0) {
                            int var132 = (class23.field397 - 1 - var130) / class23.field397;
                            var131 += var132;
                            var130 += class23.field397 * var132;
                            var128 += var132;
                        }
                        int var133;
                        if ((var133 = (var130 + 1 - (super.field412 << 12) - class23.field397) / class23.field397) > var131) {
                            var131 = var133;
                        }
                        while (var131 < 0) {
                            int var134 = (var129 >> 12) + (var130 >> 12) * super.field419;
                            int var135 = var128++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var135] = this.field4598[this.field4599[var134] & 255];
                                } else if (arg0 == 1) {
                                    int var139 = this.field4598[this.field4599[var134] & 255];
                                    int var140 = (var139 & 16711680) * class23.field403 & -16777216;
                                    int var141 = (var139 & 65280) * class23.field402 & 16711680;
                                    int var142 = (var139 & 255) * class23.field416 & 65280;
                                    var3[var135] = (var140 | var141 | var142) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var143 = this.field4598[this.field4599[var134] & 255];
                                    int var144 = (var143 & 16711935) * class23.field427 & -16711936;
                                    int var145 = (var143 & 65280) * class23.field427 & 16711680;
                                    var3[var135] = ((var144 | var145) >>> 8) + class23.field422;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    byte var146 = this.field4599[var134];
                                    if (var146 != 0) {
                                        var3[var135] = this.field4598[var146 & 255];
                                    }
                                } else if (arg0 == 1) {
                                    byte var147 = this.field4599[var134];
                                    if (var147 != 0) {
                                        int var148 = this.field4598[var147 & 255];
                                        if ((class23.field411 & 16777215) == 16777215) {
                                            int var149 = class23.field411 >>> 24;
                                            int var150 = 256 - var149;
                                            int var151 = var3[var135];
                                            var3[var135] = ((var148 & 16711935) * var149 + (var151 & 16711935) * var150 & -16711936) + ((var148 & 65280) * var149 + (var151 & 65280) * var150 & 16711680) >> 8;
                                        } else if (class23.field427 != 255) {
                                            int var152 = (var148 & 16711680) * class23.field403 & -16777216;
                                            int var153 = (var148 & 65280) * class23.field402 & 16711680;
                                            int var154 = (var148 & 255) * class23.field416 & 65280;
                                            int var155 = (var152 | var153 | var154) >>> 8;
                                            int var156 = var3[var135];
                                            var3[var135] = ((var155 & 16711935) * class23.field427 + (var156 & 16711935) * class23.field418 & -16711936) + ((var155 & 65280) * class23.field427 + (var156 & 65280) * class23.field418 & 16711680) >> 8;
                                        } else {
                                            int var157 = (var148 & 16711680) * class23.field403 & -16777216;
                                            int var158 = (var148 & 65280) * class23.field402 & 16711680;
                                            int var159 = (var148 & 255) * class23.field416 & 65280;
                                            var3[var135] = (var157 | var158 | var159) >>> 8;
                                        }
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var160 = this.field4599[var134];
                                    if (var160 != 0) {
                                        int var161 = this.field4598[var160 & 255];
                                        int var162 = (var161 & 16711935) * class23.field427 & -16711936;
                                        int var163 = (var161 & 65280) * class23.field427 & 16711680;
                                        var3[var135++] = ((var162 | var163) >>> 8) + class23.field422;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    byte var164 = this.field4599[var134];
                                    if (var164 != 0) {
                                        int var165 = this.field4598[var164 & 255];
                                        int var166 = var3[var135];
                                        int var167 = var165 + var166;
                                        int var168 = (var165 & 16711935) + (var166 & 16711935);
                                        int var169 = (var167 - var168 & 65536) + (var168 & 16777472);
                                        var3[var135] = var167 - var169 | var169 - (var169 >>> 8);
                                    }
                                } else if (arg0 == 1) {
                                    byte var170 = this.field4599[var134];
                                    if (var170 != 0) {
                                        int var171 = this.field4598[var170 & 255];
                                        int var172 = (var171 & 16711680) * class23.field403 & -16777216;
                                        int var173 = (var171 & 65280) * class23.field402 & 16711680;
                                        int var174 = (var171 & 255) * class23.field416 & 65280;
                                        int var175 = (var172 | var173 | var174) >>> 8;
                                        int var176 = var3[var135];
                                        int var177 = var175 + var176;
                                        int var178 = (var175 & 16711935) + (var176 & 16711935);
                                        int var179 = (var177 - var178 & 65536) + (var178 & 16777472);
                                        var3[var135] = var177 - var179 | var179 - (var179 >>> 8);
                                    }
                                } else if (arg0 == 2) {
                                    byte var180 = this.field4599[var134];
                                    if (var180 != 0) {
                                        int var181 = this.field4598[var180 & 255];
                                        int var182 = (var181 & 16711935) * class23.field427 & -16711936;
                                        int var183 = (var181 & 65280) * class23.field427 & 16711680;
                                        int var184 = ((var182 | var183) >>> 8) + class23.field422;
                                        int var185 = var3[var135];
                                        int var186 = var184 + var185;
                                        int var187 = (var184 & 16711935) + (var185 & 16711935);
                                        int var188 = (var186 - var187 & 65536) + (var187 & 16777472);
                                        var3[var135] = var186 - var188 | var188 - (var188 >>> 8);
                                    }
                                }
                            }
                            var130 += class23.field397;
                            ++var131;
                        }
                    }
                    ++var127;
                    class23.field421 += class23.field401;
                    class23.field398 += class23.field409;
                }
            }
        } else if (class23.field413 < 0) {
            if (class23.field397 == 0) {
                int var189 = class23.field417;
                while (var189 < 0) {
                    int var190 = class23.field398;
                    int var191 = class23.field421 + class23.field406;
                    int var192 = class23.field399;
                    int var193 = class23.field428;
                    if (var192 >= 0 && var192 - (super.field412 << 12) < 0) {
                        int var194;
                        if ((var194 = var191 - (super.field419 << 12)) >= 0) {
                            int var195 = (class23.field413 - var194) / class23.field413;
                            var193 += var195;
                            var191 += class23.field413 * var195;
                            var190 += var195;
                        }
                        int var196;
                        if ((var196 = (var191 - class23.field413) / class23.field413) > var193) {
                            var193 = var196;
                        }
                        while (var193 < 0) {
                            int var197 = (var191 >> 12) + (var192 >> 12) * super.field419;
                            int var198 = var190++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var198] = this.field4598[this.field4599[var197] & 255];
                                } else if (arg0 == 1) {
                                    int var202 = this.field4598[this.field4599[var197] & 255];
                                    int var203 = (var202 & 16711680) * class23.field403 & -16777216;
                                    int var204 = (var202 & 65280) * class23.field402 & 16711680;
                                    int var205 = (var202 & 255) * class23.field416 & 65280;
                                    var3[var198] = (var203 | var204 | var205) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var206 = this.field4598[this.field4599[var197] & 255];
                                    int var207 = (var206 & 16711935) * class23.field427 & -16711936;
                                    int var208 = (var206 & 65280) * class23.field427 & 16711680;
                                    var3[var198] = ((var207 | var208) >>> 8) + class23.field422;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    byte var209 = this.field4599[var197];
                                    if (var209 != 0) {
                                        var3[var198] = this.field4598[var209 & 255];
                                    }
                                } else if (arg0 == 1) {
                                    byte var210 = this.field4599[var197];
                                    if (var210 != 0) {
                                        int var211 = this.field4598[var210 & 255];
                                        if ((class23.field411 & 16777215) == 16777215) {
                                            int var212 = class23.field411 >>> 24;
                                            int var213 = 256 - var212;
                                            int var214 = var3[var198];
                                            var3[var198] = ((var211 & 16711935) * var212 + (var214 & 16711935) * var213 & -16711936) + ((var211 & 65280) * var212 + (var214 & 65280) * var213 & 16711680) >> 8;
                                        } else if (class23.field427 != 255) {
                                            int var215 = (var211 & 16711680) * class23.field403 & -16777216;
                                            int var216 = (var211 & 65280) * class23.field402 & 16711680;
                                            int var217 = (var211 & 255) * class23.field416 & 65280;
                                            int var218 = (var215 | var216 | var217) >>> 8;
                                            int var219 = var3[var198];
                                            var3[var198] = ((var218 & 16711935) * class23.field427 + (var219 & 16711935) * class23.field418 & -16711936) + ((var218 & 65280) * class23.field427 + (var219 & 65280) * class23.field418 & 16711680) >> 8;
                                        } else {
                                            int var220 = (var211 & 16711680) * class23.field403 & -16777216;
                                            int var221 = (var211 & 65280) * class23.field402 & 16711680;
                                            int var222 = (var211 & 255) * class23.field416 & 65280;
                                            var3[var198] = (var220 | var221 | var222) >>> 8;
                                        }
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var223 = this.field4599[var197];
                                    if (var223 != 0) {
                                        int var224 = this.field4598[var223 & 255];
                                        int var225 = (var224 & 16711935) * class23.field427 & -16711936;
                                        int var226 = (var224 & 65280) * class23.field427 & 16711680;
                                        var3[var198++] = ((var225 | var226) >>> 8) + class23.field422;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    byte var227 = this.field4599[var197];
                                    if (var227 != 0) {
                                        int var228 = this.field4598[var227 & 255];
                                        int var229 = var3[var198];
                                        int var230 = var228 + var229;
                                        int var231 = (var228 & 16711935) + (var229 & 16711935);
                                        int var232 = (var230 - var231 & 65536) + (var231 & 16777472);
                                        var3[var198] = var230 - var232 | var232 - (var232 >>> 8);
                                    }
                                } else if (arg0 == 1) {
                                    byte var233 = this.field4599[var197];
                                    if (var233 != 0) {
                                        int var234 = this.field4598[var233 & 255];
                                        int var235 = (var234 & 16711680) * class23.field403 & -16777216;
                                        int var236 = (var234 & 65280) * class23.field402 & 16711680;
                                        int var237 = (var234 & 255) * class23.field416 & 65280;
                                        int var238 = (var235 | var236 | var237) >>> 8;
                                        int var239 = var3[var198];
                                        int var240 = var238 + var239;
                                        int var241 = (var238 & 16711935) + (var239 & 16711935);
                                        int var242 = (var240 - var241 & 65536) + (var241 & 16777472);
                                        var3[var198] = var240 - var242 | var242 - (var242 >>> 8);
                                    }
                                } else if (arg0 == 2) {
                                    byte var243 = this.field4599[var197];
                                    if (var243 != 0) {
                                        int var244 = this.field4598[var243 & 255];
                                        int var245 = (var244 & 16711935) * class23.field427 & -16711936;
                                        int var246 = (var244 & 65280) * class23.field427 & 16711680;
                                        int var247 = ((var245 | var246) >>> 8) + class23.field422;
                                        int var248 = var3[var198];
                                        int var249 = var247 + var248;
                                        int var250 = (var247 & 16711935) + (var248 & 16711935);
                                        int var251 = (var249 - var250 & 65536) + (var250 & 16777472);
                                        var3[var198] = var249 - var251 | var251 - (var251 >>> 8);
                                    }
                                }
                            }
                            var191 += class23.field413;
                            ++var193;
                        }
                    }
                    ++var189;
                    class23.field399 += class23.field410;
                    class23.field398 += class23.field409;
                }
            } else if (class23.field397 < 0) {
                int var252 = class23.field417;
                while (var252 < 0) {
                    int var253 = class23.field398;
                    int var254 = class23.field421 + class23.field406;
                    int var255 = class23.field424 + class23.field399;
                    int var256 = class23.field428;
                    int var257;
                    if ((var257 = var254 - (super.field419 << 12)) >= 0) {
                        int var258 = (class23.field413 - var257) / class23.field413;
                        var256 += var258;
                        var254 += class23.field413 * var258;
                        var255 += class23.field397 * var258;
                        var253 += var258;
                    }
                    int var259;
                    if ((var259 = (var254 - class23.field413) / class23.field413) > var256) {
                        var256 = var259;
                    }
                    int var260;
                    if ((var260 = var255 - (super.field412 << 12)) >= 0) {
                        int var261 = (class23.field397 - var260) / class23.field397;
                        var256 += var261;
                        var254 += class23.field413 * var261;
                        var255 += class23.field397 * var261;
                        var253 += var261;
                    }
                    int var262;
                    if ((var262 = (var255 - class23.field397) / class23.field397) > var256) {
                        var256 = var262;
                    }
                    while (var256 < 0) {
                        int var263 = (var254 >> 12) + (var255 >> 12) * super.field419;
                        int var264 = var253++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var264] = this.field4598[this.field4599[var263] & 255];
                            } else if (arg0 == 1) {
                                int var268 = this.field4598[this.field4599[var263] & 255];
                                int var269 = (var268 & 16711680) * class23.field403 & -16777216;
                                int var270 = (var268 & 65280) * class23.field402 & 16711680;
                                int var271 = (var268 & 255) * class23.field416 & 65280;
                                var3[var264] = (var269 | var270 | var271) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var272 = this.field4598[this.field4599[var263] & 255];
                                int var273 = (var272 & 16711935) * class23.field427 & -16711936;
                                int var274 = (var272 & 65280) * class23.field427 & 16711680;
                                var3[var264] = ((var273 | var274) >>> 8) + class23.field422;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                byte var275 = this.field4599[var263];
                                if (var275 != 0) {
                                    var3[var264] = this.field4598[var275 & 255];
                                }
                            } else if (arg0 == 1) {
                                byte var276 = this.field4599[var263];
                                if (var276 != 0) {
                                    int var277 = this.field4598[var276 & 255];
                                    if ((class23.field411 & 16777215) == 16777215) {
                                        int var278 = class23.field411 >>> 24;
                                        int var279 = 256 - var278;
                                        int var280 = var3[var264];
                                        var3[var264] = ((var277 & 16711935) * var278 + (var280 & 16711935) * var279 & -16711936) + ((var277 & 65280) * var278 + (var280 & 65280) * var279 & 16711680) >> 8;
                                    } else if (class23.field427 != 255) {
                                        int var281 = (var277 & 16711680) * class23.field403 & -16777216;
                                        int var282 = (var277 & 65280) * class23.field402 & 16711680;
                                        int var283 = (var277 & 255) * class23.field416 & 65280;
                                        int var284 = (var281 | var282 | var283) >>> 8;
                                        int var285 = var3[var264];
                                        var3[var264] = ((var284 & 16711935) * class23.field427 + (var285 & 16711935) * class23.field418 & -16711936) + ((var284 & 65280) * class23.field427 + (var285 & 65280) * class23.field418 & 16711680) >> 8;
                                    } else {
                                        int var286 = (var277 & 16711680) * class23.field403 & -16777216;
                                        int var287 = (var277 & 65280) * class23.field402 & 16711680;
                                        int var288 = (var277 & 255) * class23.field416 & 65280;
                                        var3[var264] = (var286 | var287 | var288) >>> 8;
                                    }
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var289 = this.field4599[var263];
                                if (var289 != 0) {
                                    int var290 = this.field4598[var289 & 255];
                                    int var291 = (var290 & 16711935) * class23.field427 & -16711936;
                                    int var292 = (var290 & 65280) * class23.field427 & 16711680;
                                    var3[var264++] = ((var291 | var292) >>> 8) + class23.field422;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                byte var293 = this.field4599[var263];
                                if (var293 != 0) {
                                    int var294 = this.field4598[var293 & 255];
                                    int var295 = var3[var264];
                                    int var296 = var294 + var295;
                                    int var297 = (var294 & 16711935) + (var295 & 16711935);
                                    int var298 = (var296 - var297 & 65536) + (var297 & 16777472);
                                    var3[var264] = var296 - var298 | var298 - (var298 >>> 8);
                                }
                            } else if (arg0 == 1) {
                                byte var299 = this.field4599[var263];
                                if (var299 != 0) {
                                    int var300 = this.field4598[var299 & 255];
                                    int var301 = (var300 & 16711680) * class23.field403 & -16777216;
                                    int var302 = (var300 & 65280) * class23.field402 & 16711680;
                                    int var303 = (var300 & 255) * class23.field416 & 65280;
                                    int var304 = (var301 | var302 | var303) >>> 8;
                                    int var305 = var3[var264];
                                    int var306 = var304 + var305;
                                    int var307 = (var304 & 16711935) + (var305 & 16711935);
                                    int var308 = (var306 - var307 & 65536) + (var307 & 16777472);
                                    var3[var264] = var306 - var308 | var308 - (var308 >>> 8);
                                }
                            } else if (arg0 == 2) {
                                byte var309 = this.field4599[var263];
                                if (var309 != 0) {
                                    int var310 = this.field4598[var309 & 255];
                                    int var311 = (var310 & 16711935) * class23.field427 & -16711936;
                                    int var312 = (var310 & 65280) * class23.field427 & 16711680;
                                    int var313 = ((var311 | var312) >>> 8) + class23.field422;
                                    int var314 = var3[var264];
                                    int var315 = var313 + var314;
                                    int var316 = (var313 & 16711935) + (var314 & 16711935);
                                    int var317 = (var315 - var316 & 65536) + (var316 & 16777472);
                                    var3[var264] = var315 - var317 | var317 - (var317 >>> 8);
                                }
                            }
                        }
                        var254 += class23.field413;
                        var255 += class23.field397;
                        ++var256;
                    }
                    ++var252;
                    class23.field421 += class23.field401;
                    class23.field399 += class23.field410;
                    class23.field398 += class23.field409;
                }
            } else {
                int var318 = class23.field417;
                while (var318 < 0) {
                    int var319 = class23.field398;
                    int var320 = class23.field421 + class23.field406;
                    int var321 = class23.field424 + class23.field399;
                    int var322 = class23.field428;
                    int var323;
                    if ((var323 = var320 - (super.field419 << 12)) >= 0) {
                        int var324 = (class23.field413 - var323) / class23.field413;
                        var322 += var324;
                        var320 += class23.field413 * var324;
                        var321 += class23.field397 * var324;
                        var319 += var324;
                    }
                    int var325;
                    if ((var325 = (var320 - class23.field413) / class23.field413) > var322) {
                        var322 = var325;
                    }
                    if (var321 < 0) {
                        int var326 = (class23.field397 - 1 - var321) / class23.field397;
                        var322 += var326;
                        var320 += class23.field413 * var326;
                        var321 += class23.field397 * var326;
                        var319 += var326;
                    }
                    int var327;
                    if ((var327 = (var321 + 1 - (super.field412 << 12) - class23.field397) / class23.field397) > var322) {
                        var322 = var327;
                    }
                    while (var322 < 0) {
                        int var328 = (var320 >> 12) + (var321 >> 12) * super.field419;
                        int var329 = var319++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var329] = this.field4598[this.field4599[var328] & 255];
                            } else if (arg0 == 1) {
                                int var333 = this.field4598[this.field4599[var328] & 255];
                                int var334 = (var333 & 16711680) * class23.field403 & -16777216;
                                int var335 = (var333 & 65280) * class23.field402 & 16711680;
                                int var336 = (var333 & 255) * class23.field416 & 65280;
                                var3[var329] = (var334 | var335 | var336) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var337 = this.field4598[this.field4599[var328] & 255];
                                int var338 = (var337 & 16711935) * class23.field427 & -16711936;
                                int var339 = (var337 & 65280) * class23.field427 & 16711680;
                                var3[var329] = ((var338 | var339) >>> 8) + class23.field422;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                byte var340 = this.field4599[var328];
                                if (var340 != 0) {
                                    var3[var329] = this.field4598[var340 & 255];
                                }
                            } else if (arg0 == 1) {
                                byte var341 = this.field4599[var328];
                                if (var341 != 0) {
                                    int var342 = this.field4598[var341 & 255];
                                    if ((class23.field411 & 16777215) == 16777215) {
                                        int var343 = class23.field411 >>> 24;
                                        int var344 = 256 - var343;
                                        int var345 = var3[var329];
                                        var3[var329] = ((var342 & 16711935) * var343 + (var345 & 16711935) * var344 & -16711936) + ((var342 & 65280) * var343 + (var345 & 65280) * var344 & 16711680) >> 8;
                                    } else if (class23.field427 != 255) {
                                        int var346 = (var342 & 16711680) * class23.field403 & -16777216;
                                        int var347 = (var342 & 65280) * class23.field402 & 16711680;
                                        int var348 = (var342 & 255) * class23.field416 & 65280;
                                        int var349 = (var346 | var347 | var348) >>> 8;
                                        int var350 = var3[var329];
                                        var3[var329] = ((var349 & 16711935) * class23.field427 + (var350 & 16711935) * class23.field418 & -16711936) + ((var349 & 65280) * class23.field427 + (var350 & 65280) * class23.field418 & 16711680) >> 8;
                                    } else {
                                        int var351 = (var342 & 16711680) * class23.field403 & -16777216;
                                        int var352 = (var342 & 65280) * class23.field402 & 16711680;
                                        int var353 = (var342 & 255) * class23.field416 & 65280;
                                        var3[var329] = (var351 | var352 | var353) >>> 8;
                                    }
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var354 = this.field4599[var328];
                                if (var354 != 0) {
                                    int var355 = this.field4598[var354 & 255];
                                    int var356 = (var355 & 16711935) * class23.field427 & -16711936;
                                    int var357 = (var355 & 65280) * class23.field427 & 16711680;
                                    var3[var329++] = ((var356 | var357) >>> 8) + class23.field422;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                byte var358 = this.field4599[var328];
                                if (var358 != 0) {
                                    int var359 = this.field4598[var358 & 255];
                                    int var360 = var3[var329];
                                    int var361 = var359 + var360;
                                    int var362 = (var359 & 16711935) + (var360 & 16711935);
                                    int var363 = (var361 - var362 & 65536) + (var362 & 16777472);
                                    var3[var329] = var361 - var363 | var363 - (var363 >>> 8);
                                }
                            } else if (arg0 == 1) {
                                byte var364 = this.field4599[var328];
                                if (var364 != 0) {
                                    int var365 = this.field4598[var364 & 255];
                                    int var366 = (var365 & 16711680) * class23.field403 & -16777216;
                                    int var367 = (var365 & 65280) * class23.field402 & 16711680;
                                    int var368 = (var365 & 255) * class23.field416 & 65280;
                                    int var369 = (var366 | var367 | var368) >>> 8;
                                    int var370 = var3[var329];
                                    int var371 = var369 + var370;
                                    int var372 = (var369 & 16711935) + (var370 & 16711935);
                                    int var373 = (var371 - var372 & 65536) + (var372 & 16777472);
                                    var3[var329] = var371 - var373 | var373 - (var373 >>> 8);
                                }
                            } else if (arg0 == 2) {
                                byte var374 = this.field4599[var328];
                                if (var374 != 0) {
                                    int var375 = this.field4598[var374 & 255];
                                    int var376 = (var375 & 16711935) * class23.field427 & -16711936;
                                    int var377 = (var375 & 65280) * class23.field427 & 16711680;
                                    int var378 = ((var376 | var377) >>> 8) + class23.field422;
                                    int var379 = var3[var329];
                                    int var380 = var378 + var379;
                                    int var381 = (var378 & 16711935) + (var379 & 16711935);
                                    int var382 = (var380 - var381 & 65536) + (var381 & 16777472);
                                    var3[var329] = var380 - var382 | var382 - (var382 >>> 8);
                                }
                            }
                        }
                        var320 += class23.field413;
                        var321 += class23.field397;
                        ++var322;
                    }
                    ++var318;
                    class23.field421 += class23.field401;
                    class23.field399 += class23.field410;
                    class23.field398 += class23.field409;
                }
            }
        } else if (class23.field397 == 0) {
            int var383 = class23.field417;
            while (var383 < 0) {
                int var384 = class23.field398;
                int var385 = class23.field421 + class23.field406;
                int var386 = class23.field399;
                int var387 = class23.field428;
                if (var386 >= 0 && var386 - (super.field412 << 12) < 0) {
                    if (var385 < 0) {
                        int var388 = (class23.field413 - 1 - var385) / class23.field413;
                        var387 += var388;
                        var385 += class23.field413 * var388;
                        var384 += var388;
                    }
                    int var389;
                    if ((var389 = (var385 + 1 - (super.field419 << 12) - class23.field413) / class23.field413) > var387) {
                        var387 = var389;
                    }
                    while (var387 < 0) {
                        int var390 = (var385 >> 12) + (var386 >> 12) * super.field419;
                        int var391 = var384++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var391] = this.field4598[this.field4599[var390] & 255];
                            } else if (arg0 == 1) {
                                int var395 = this.field4598[this.field4599[var390] & 255];
                                int var396 = (var395 & 16711680) * class23.field403 & -16777216;
                                int var397 = (var395 & 65280) * class23.field402 & 16711680;
                                int var398 = (var395 & 255) * class23.field416 & 65280;
                                var3[var391] = (var396 | var397 | var398) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var399 = this.field4598[this.field4599[var390] & 255];
                                int var400 = (var399 & 16711935) * class23.field427 & -16711936;
                                int var401 = (var399 & 65280) * class23.field427 & 16711680;
                                var3[var391] = ((var400 | var401) >>> 8) + class23.field422;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                byte var402 = this.field4599[var390];
                                if (var402 != 0) {
                                    var3[var391] = this.field4598[var402 & 255];
                                }
                            } else if (arg0 == 1) {
                                byte var403 = this.field4599[var390];
                                if (var403 != 0) {
                                    int var404 = this.field4598[var403 & 255];
                                    if ((class23.field411 & 16777215) == 16777215) {
                                        int var405 = class23.field411 >>> 24;
                                        int var406 = 256 - var405;
                                        int var407 = var3[var391];
                                        var3[var391] = ((var404 & 16711935) * var405 + (var407 & 16711935) * var406 & -16711936) + ((var404 & 65280) * var405 + (var407 & 65280) * var406 & 16711680) >> 8;
                                    } else if (class23.field427 != 255) {
                                        int var408 = (var404 & 16711680) * class23.field403 & -16777216;
                                        int var409 = (var404 & 65280) * class23.field402 & 16711680;
                                        int var410 = (var404 & 255) * class23.field416 & 65280;
                                        int var411 = (var408 | var409 | var410) >>> 8;
                                        int var412 = var3[var391];
                                        var3[var391] = ((var411 & 16711935) * class23.field427 + (var412 & 16711935) * class23.field418 & -16711936) + ((var411 & 65280) * class23.field427 + (var412 & 65280) * class23.field418 & 16711680) >> 8;
                                    } else {
                                        int var413 = (var404 & 16711680) * class23.field403 & -16777216;
                                        int var414 = (var404 & 65280) * class23.field402 & 16711680;
                                        int var415 = (var404 & 255) * class23.field416 & 65280;
                                        var3[var391] = (var413 | var414 | var415) >>> 8;
                                    }
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var416 = this.field4599[var390];
                                if (var416 != 0) {
                                    int var417 = this.field4598[var416 & 255];
                                    int var418 = (var417 & 16711935) * class23.field427 & -16711936;
                                    int var419 = (var417 & 65280) * class23.field427 & 16711680;
                                    var3[var391++] = ((var418 | var419) >>> 8) + class23.field422;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                byte var420 = this.field4599[var390];
                                if (var420 != 0) {
                                    int var421 = this.field4598[var420 & 255];
                                    int var422 = var3[var391];
                                    int var423 = var421 + var422;
                                    int var424 = (var421 & 16711935) + (var422 & 16711935);
                                    int var425 = (var423 - var424 & 65536) + (var424 & 16777472);
                                    var3[var391] = var423 - var425 | var425 - (var425 >>> 8);
                                }
                            } else if (arg0 == 1) {
                                byte var426 = this.field4599[var390];
                                if (var426 != 0) {
                                    int var427 = this.field4598[var426 & 255];
                                    int var428 = (var427 & 16711680) * class23.field403 & -16777216;
                                    int var429 = (var427 & 65280) * class23.field402 & 16711680;
                                    int var430 = (var427 & 255) * class23.field416 & 65280;
                                    int var431 = (var428 | var429 | var430) >>> 8;
                                    int var432 = var3[var391];
                                    int var433 = var431 + var432;
                                    int var434 = (var431 & 16711935) + (var432 & 16711935);
                                    int var435 = (var433 - var434 & 65536) + (var434 & 16777472);
                                    var3[var391] = var433 - var435 | var435 - (var435 >>> 8);
                                }
                            } else if (arg0 == 2) {
                                byte var436 = this.field4599[var390];
                                if (var436 != 0) {
                                    int var437 = this.field4598[var436 & 255];
                                    int var438 = (var437 & 16711935) * class23.field427 & -16711936;
                                    int var439 = (var437 & 65280) * class23.field427 & 16711680;
                                    int var440 = ((var438 | var439) >>> 8) + class23.field422;
                                    int var441 = var3[var391];
                                    int var442 = var440 + var441;
                                    int var443 = (var440 & 16711935) + (var441 & 16711935);
                                    int var444 = (var442 - var443 & 65536) + (var443 & 16777472);
                                    var3[var391] = var442 - var444 | var444 - (var444 >>> 8);
                                }
                            }
                        }
                        var385 += class23.field413;
                        ++var387;
                    }
                }
                ++var383;
                class23.field421 += class23.field401;
                class23.field399 += class23.field410;
                class23.field398 += class23.field409;
            }
        } else if (class23.field397 < 0) {
            for (int var445 = class23.field417; var445 < 0; ++var445) {
                int var446 = class23.field398;
                int var447 = class23.field421 + class23.field406;
                int var448 = class23.field424 + class23.field399;
                int var449 = class23.field428;
                if (var447 < 0) {
                    int var450 = (class23.field413 - 1 - var447) / class23.field413;
                    var449 += var450;
                    var447 += class23.field413 * var450;
                    var448 += class23.field397 * var450;
                    var446 += var450;
                }
                int var451;
                if ((var451 = (var447 + 1 - (super.field419 << 12) - class23.field413) / class23.field413) > var449) {
                    var449 = var451;
                }
                int var452;
                if ((var452 = var448 - (super.field412 << 12)) >= 0) {
                    int var453 = (class23.field397 - var452) / class23.field397;
                    var449 += var453;
                    var447 += class23.field413 * var453;
                    var448 += class23.field397 * var453;
                    var446 += var453;
                }
                int var454;
                if ((var454 = (var448 - class23.field397) / class23.field397) > var449) {
                    var449 = var454;
                }
                while (var449 < 0) {
                    int var455 = (var447 >> 12) + (var448 >> 12) * super.field419;
                    int var456 = var446++;
                    if (arg1 == 0) {
                        if (arg0 == 0) {
                            var3[var456] = this.field4598[this.field4599[var455] & 255];
                        } else if (arg0 == 1) {
                            int var460 = this.field4598[this.field4599[var455] & 255];
                            int var461 = (var460 & 16711680) * class23.field403 & -16777216;
                            int var462 = (var460 & 65280) * class23.field402 & 16711680;
                            int var463 = (var460 & 255) * class23.field416 & 65280;
                            var3[var456] = (var461 | var462 | var463) >>> 8;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var464 = this.field4598[this.field4599[var455] & 255];
                            int var465 = (var464 & 16711935) * class23.field427 & -16711936;
                            int var466 = (var464 & 65280) * class23.field427 & 16711680;
                            var3[var456] = ((var465 | var466) >>> 8) + class23.field422;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 0) {
                            byte var467 = this.field4599[var455];
                            if (var467 != 0) {
                                var3[var456] = this.field4598[var467 & 255];
                            }
                        } else if (arg0 == 1) {
                            byte var468 = this.field4599[var455];
                            if (var468 != 0) {
                                int var469 = this.field4598[var468 & 255];
                                if ((class23.field411 & 16777215) == 16777215) {
                                    int var470 = class23.field411 >>> 24;
                                    int var471 = 256 - var470;
                                    int var472 = var3[var456];
                                    var3[var456] = ((var469 & 16711935) * var470 + (var472 & 16711935) * var471 & -16711936) + ((var469 & 65280) * var470 + (var472 & 65280) * var471 & 16711680) >> 8;
                                } else if (class23.field427 != 255) {
                                    int var473 = (var469 & 16711680) * class23.field403 & -16777216;
                                    int var474 = (var469 & 65280) * class23.field402 & 16711680;
                                    int var475 = (var469 & 255) * class23.field416 & 65280;
                                    int var476 = (var473 | var474 | var475) >>> 8;
                                    int var477 = var3[var456];
                                    var3[var456] = ((var476 & 16711935) * class23.field427 + (var477 & 16711935) * class23.field418 & -16711936) + ((var476 & 65280) * class23.field427 + (var477 & 65280) * class23.field418 & 16711680) >> 8;
                                } else {
                                    int var478 = (var469 & 16711680) * class23.field403 & -16777216;
                                    int var479 = (var469 & 65280) * class23.field402 & 16711680;
                                    int var480 = (var469 & 255) * class23.field416 & 65280;
                                    var3[var456] = (var478 | var479 | var480) >>> 8;
                                }
                            }
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            byte var481 = this.field4599[var455];
                            if (var481 != 0) {
                                int var482 = this.field4598[var481 & 255];
                                int var483 = (var482 & 16711935) * class23.field427 & -16711936;
                                int var484 = (var482 & 65280) * class23.field427 & 16711680;
                                var3[var456++] = ((var483 | var484) >>> 8) + class23.field422;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 0) {
                            byte var485 = this.field4599[var455];
                            if (var485 != 0) {
                                int var486 = this.field4598[var485 & 255];
                                int var487 = var3[var456];
                                int var488 = var486 + var487;
                                int var489 = (var486 & 16711935) + (var487 & 16711935);
                                int var490 = (var488 - var489 & 65536) + (var489 & 16777472);
                                var3[var456] = var488 - var490 | var490 - (var490 >>> 8);
                            }
                        } else if (arg0 == 1) {
                            byte var491 = this.field4599[var455];
                            if (var491 != 0) {
                                int var492 = this.field4598[var491 & 255];
                                int var493 = (var492 & 16711680) * class23.field403 & -16777216;
                                int var494 = (var492 & 65280) * class23.field402 & 16711680;
                                int var495 = (var492 & 255) * class23.field416 & 65280;
                                int var496 = (var493 | var494 | var495) >>> 8;
                                int var497 = var3[var456];
                                int var498 = var496 + var497;
                                int var499 = (var496 & 16711935) + (var497 & 16711935);
                                int var500 = (var498 - var499 & 65536) + (var499 & 16777472);
                                var3[var456] = var498 - var500 | var500 - (var500 >>> 8);
                            }
                        } else if (arg0 == 2) {
                            byte var501 = this.field4599[var455];
                            if (var501 != 0) {
                                int var502 = this.field4598[var501 & 255];
                                int var503 = (var502 & 16711935) * class23.field427 & -16711936;
                                int var504 = (var502 & 65280) * class23.field427 & 16711680;
                                int var505 = ((var503 | var504) >>> 8) + class23.field422;
                                int var506 = var3[var456];
                                int var507 = var505 + var506;
                                int var508 = (var505 & 16711935) + (var506 & 16711935);
                                int var509 = (var507 - var508 & 65536) + (var508 & 16777472);
                                var3[var456] = var507 - var509 | var509 - (var509 >>> 8);
                            }
                        }
                    }
                    var447 += class23.field413;
                    var448 += class23.field397;
                    ++var449;
                }
                class23.field421 += class23.field401;
                class23.field399 += class23.field410;
                class23.field398 += class23.field409;
            }
        } else {
            for (int var510 = class23.field417; var510 < 0; ++var510) {
                int var511 = class23.field398;
                int var512 = class23.field421 + class23.field406;
                int var513 = class23.field424 + class23.field399;
                int var514 = class23.field428;
                if (var512 < 0) {
                    int var515 = (class23.field413 - 1 - var512) / class23.field413;
                    var514 += var515;
                    var512 += class23.field413 * var515;
                    var513 += class23.field397 * var515;
                    var511 += var515;
                }
                int var516;
                if ((var516 = (var512 + 1 - (super.field419 << 12) - class23.field413) / class23.field413) > var514) {
                    var514 = var516;
                }
                if (var513 < 0) {
                    int var517 = (class23.field397 - 1 - var513) / class23.field397;
                    var514 += var517;
                    var512 += class23.field413 * var517;
                    var513 += class23.field397 * var517;
                    var511 += var517;
                }
                int var518;
                if ((var518 = (var513 + 1 - (super.field412 << 12) - class23.field397) / class23.field397) > var514) {
                    var514 = var518;
                }
                while (var514 < 0) {
                    int var519 = (var512 >> 12) + (var513 >> 12) * super.field419;
                    int var520 = var511++;
                    if (arg1 == 0) {
                        if (arg0 == 0) {
                            var3[var520] = this.field4598[this.field4599[var519] & 255];
                        } else if (arg0 == 1) {
                            int var524 = this.field4598[this.field4599[var519] & 255];
                            int var525 = (var524 & 16711680) * class23.field403 & -16777216;
                            int var526 = (var524 & 65280) * class23.field402 & 16711680;
                            int var527 = (var524 & 255) * class23.field416 & 65280;
                            var3[var520] = (var525 | var526 | var527) >>> 8;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var528 = this.field4598[this.field4599[var519] & 255];
                            int var529 = (var528 & 16711935) * class23.field427 & -16711936;
                            int var530 = (var528 & 65280) * class23.field427 & 16711680;
                            var3[var520] = ((var529 | var530) >>> 8) + class23.field422;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 0) {
                            byte var531 = this.field4599[var519];
                            if (var531 != 0) {
                                var3[var520] = this.field4598[var531 & 255];
                            }
                        } else if (arg0 == 1) {
                            byte var532 = this.field4599[var519];
                            if (var532 != 0) {
                                int var533 = this.field4598[var532 & 255];
                                if ((class23.field411 & 16777215) == 16777215) {
                                    int var534 = class23.field411 >>> 24;
                                    int var535 = 256 - var534;
                                    int var536 = var3[var520];
                                    var3[var520] = ((var533 & 16711935) * var534 + (var536 & 16711935) * var535 & -16711936) + ((var533 & 65280) * var534 + (var536 & 65280) * var535 & 16711680) >> 8;
                                } else if (class23.field427 != 255) {
                                    int var537 = (var533 & 16711680) * class23.field403 & -16777216;
                                    int var538 = (var533 & 65280) * class23.field402 & 16711680;
                                    int var539 = (var533 & 255) * class23.field416 & 65280;
                                    int var540 = (var537 | var538 | var539) >>> 8;
                                    int var541 = var3[var520];
                                    var3[var520] = ((var540 & 16711935) * class23.field427 + (var541 & 16711935) * class23.field418 & -16711936) + ((var540 & 65280) * class23.field427 + (var541 & 65280) * class23.field418 & 16711680) >> 8;
                                } else {
                                    int var542 = (var533 & 16711680) * class23.field403 & -16777216;
                                    int var543 = (var533 & 65280) * class23.field402 & 16711680;
                                    int var544 = (var533 & 255) * class23.field416 & 65280;
                                    var3[var520] = (var542 | var543 | var544) >>> 8;
                                }
                            }
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            byte var545 = this.field4599[var519];
                            if (var545 != 0) {
                                int var546 = this.field4598[var545 & 255];
                                int var547 = (var546 & 16711935) * class23.field427 & -16711936;
                                int var548 = (var546 & 65280) * class23.field427 & 16711680;
                                var3[var520++] = ((var547 | var548) >>> 8) + class23.field422;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 0) {
                            byte var549 = this.field4599[var519];
                            if (var549 != 0) {
                                int var550 = this.field4598[var549 & 255];
                                int var551 = var3[var520];
                                int var552 = var550 + var551;
                                int var553 = (var550 & 16711935) + (var551 & 16711935);
                                int var554 = (var552 - var553 & 65536) + (var553 & 16777472);
                                var3[var520] = var552 - var554 | var554 - (var554 >>> 8);
                            }
                        } else if (arg0 == 1) {
                            byte var555 = this.field4599[var519];
                            if (var555 != 0) {
                                int var556 = this.field4598[var555 & 255];
                                int var557 = (var556 & 16711680) * class23.field403 & -16777216;
                                int var558 = (var556 & 65280) * class23.field402 & 16711680;
                                int var559 = (var556 & 255) * class23.field416 & 65280;
                                int var560 = (var557 | var558 | var559) >>> 8;
                                int var561 = var3[var520];
                                int var562 = var560 + var561;
                                int var563 = (var560 & 16711935) + (var561 & 16711935);
                                int var564 = (var562 - var563 & 65536) + (var563 & 16777472);
                                var3[var520] = var562 - var564 | var564 - (var564 >>> 8);
                            }
                        } else if (arg0 == 2) {
                            byte var565 = this.field4599[var519];
                            if (var565 != 0) {
                                int var566 = this.field4598[var565 & 255];
                                int var567 = (var566 & 16711935) * class23.field427 & -16711936;
                                int var568 = (var566 & 65280) * class23.field427 & 16711680;
                                int var569 = ((var567 | var568) >>> 8) + class23.field422;
                                int var570 = var3[var520];
                                int var571 = var569 + var570;
                                int var572 = (var569 & 16711935) + (var570 & 16711935);
                                int var573 = (var571 - var572 & 65536) + (var572 & 16777472);
                                var3[var520] = var571 - var573 | var573 - (var573 >>> 8);
                            }
                        }
                    }
                    var512 += class23.field413;
                    var513 += class23.field397;
                    ++var514;
                }
                class23.field421 += class23.field401;
                class23.field399 += class23.field410;
                class23.field398 += class23.field409;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Llh;[B[III)V", line = 4354)
    public class311(class59 arg0, byte[] arg1, int[] arg2, int arg3, int arg4) {
        super(arg0, arg3, arg4);
        this.field4599 = arg1;
        this.field4598 = arg2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILsf;II)V", line = 4360)
    public final void method209(int arg0, int arg1, class421 arg2, int arg3, int arg4) {
        if (super.field423.method425()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field425 + arg0;
            int var7 = super.field400 + arg1;
            int var8 = 0;
            int var9 = super.field423.field889;
            int var10 = super.field419;
            int var11 = super.field412;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var7 * var9 + var6;
            if (var7 < super.field423.field884) {
                int var15 = super.field423.field884 - var7;
                var11 -= var15;
                var7 = super.field423.field884;
                var8 += var10 * var15;
                var14 += var9 * var15;
            }
            if (var7 + var11 > super.field423.field883) {
                var11 -= var7 + var11 - super.field423.field883;
            }
            if (var6 < super.field423.field881) {
                int var16 = super.field423.field881 - var6;
                var10 -= var16;
                var6 = super.field423.field881;
                var8 += var16;
                var14 += var16;
                var13 += var16;
                var12 += var16;
            }
            if (var6 + var10 > super.field423.field911) {
                int var17 = var6 + var10 - super.field423.field911;
                var10 -= var17;
                var13 += var17;
                var12 += var17;
            }
            if (var10 > 0 && var11 > 0) {
                class158 var18 = (class158) arg2;
                int[] var19 = var18.field1988;
                int[] var20 = var18.field1987;
                int[] var21 = super.field423.field895;
                int var22 = var7;
                if (arg4 > var7) {
                    var22 = arg4;
                    var14 += (arg4 - var7) * var9;
                    var8 += (arg4 - var7) * super.field419;
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
                        byte var32 = this.field4599[var8++];
                        if (var32 != 0) {
                            var21[var14++] = this.field4598[var32 & 255];
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V", line = 4505)
    public final void method261(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }
}
