import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class221 extends class252 {

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "[I")
    private int[] field3103;

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lpk;[III)V")
    public class221(class108 arg0, int[] arg1, int arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3103 = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lpk;[IIIII)V")
    public class221(class108 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg4, arg5);
        this.field3103 = new int[arg4 * arg5];
        int var7 = arg3 - super.field3599;
        int var8 = 0;
        for (int var9 = 0; var9 < arg5; ++var9) {
            for (int var10 = 0; var10 < arg4; ++var10) {
                this.field3103[var8++] = arg1[arg2++];
            }
            arg2 += var7;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(IIIIIII)V")
    public final void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (super.field3608.method592()) {
            throw new IllegalStateException();
        } else if (arg2 > 0 && arg3 > 0) {
            int var8 = 0;
            int var9 = 0;
            int var10 = super.field3608.field1328;
            int var11 = super.field3606 + super.field3599 + super.field3589;
            int var12 = super.field3583 + super.field3580 + super.field3602;
            int var13 = (var11 << 16) / arg2;
            int var14 = (var12 << 16) / arg3;
            if (super.field3606 > 0) {
                int var15 = ((super.field3606 << 16) + var13 - 1) / var13;
                arg0 += var15;
                var8 += var13 * var15 - (super.field3606 << 16);
            }
            if (super.field3580 > 0) {
                int var16 = ((super.field3580 << 16) + var14 - 1) / var14;
                arg1 += var16;
                var9 += var14 * var16 - (super.field3580 << 16);
            }
            if (super.field3599 < var11) {
                arg2 = ((super.field3599 << 16) - var8 + var13 - 1) / var13;
            }
            if (super.field3583 < var12) {
                arg3 = ((super.field3583 << 16) - var9 + var14 - 1) / var14;
            }
            int var17 = arg1 * var10 + arg0;
            int var18 = var10 - arg2;
            if (arg1 + arg3 > super.field3608.field1314) {
                arg3 -= arg1 + arg3 - super.field3608.field1314;
            }
            if (arg1 < super.field3608.field1323) {
                int var19 = super.field3608.field1323 - arg1;
                arg3 -= var19;
                var17 += var10 * var19;
                var9 += var14 * var19;
            }
            if (arg0 + arg2 > super.field3608.field1294) {
                int var20 = arg0 + arg2 - super.field3608.field1294;
                arg2 -= var20;
                var18 += var20;
            }
            if (arg0 < super.field3608.field1299) {
                int var21 = super.field3608.field1299 - arg0;
                arg2 -= var21;
                var17 += var21;
                var8 += var13 * var21;
                var18 += var21;
            }
            int[] var22 = super.field3608.field1301;
            if (arg6 == 0) {
                if (arg4 == 0) {
                    int var23 = var8;
                    for (int var24 = -arg3; var24 < 0; ++var24) {
                        int var25 = (var9 >> 16) * super.field3599;
                        for (int var26 = -arg2; var26 < 0; ++var26) {
                            var22[var17++] = this.field3103[(var8 >> 16) + var25];
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
                        int var32 = (var9 >> 16) * super.field3599;
                        for (int var33 = -arg2; var33 < 0; ++var33) {
                            int var34 = this.field3103[(var8 >> 16) + var32];
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
                        int var45 = (var9 >> 16) * super.field3599;
                        for (int var46 = -arg2; var46 < 0; ++var46) {
                            int var47 = this.field3103[(var8 >> 16) + var45];
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
                        int var52 = (var9 >> 16) * super.field3599;
                        for (int var53 = -arg2; var53 < 0; ++var53) {
                            int var54 = this.field3103[(var8 >> 16) + var52];
                            int var55 = var54 >>> 24;
                            int var56 = 256 - var55;
                            int var57 = var22[var17];
                            var22[var17++] = ((var54 & 16711935) * var55 + (var57 & 16711935) * var56 & -16711936) + ((var54 & 65280) * var55 + (var57 & 65280) * var56 & 16711680) >> 8;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var50;
                        var17 += var18;
                    }
                } else if (arg4 == 1) {
                    int var58 = var8;
                    if ((arg5 & 16777215) == 16777215) {
                        for (int var59 = -arg3; var59 < 0; ++var59) {
                            int var60 = (var9 >> 16) * super.field3599;
                            for (int var61 = -arg2; var61 < 0; ++var61) {
                                int var62 = this.field3103[(var8 >> 16) + var60];
                                int var63 = (arg5 >>> 24) * (var62 >>> 24) >> 8;
                                int var64 = 256 - var63;
                                int var65 = var22[var17];
                                var22[var17++] = ((var62 & 16711935) * var63 + (var65 & 16711935) * var64 & -16711936) + ((var62 & 65280) * var63 + (var65 & 65280) * var64 & 16711680) >> 8;
                                var8 += var13;
                            }
                            var9 += var14;
                            var8 = var58;
                            var17 += var18;
                        }
                    } else {
                        int var66 = (arg5 & 16711680) >> 16;
                        int var67 = (arg5 & 65280) >> 8;
                        int var68 = arg5 & 255;
                        for (int var69 = -arg3; var69 < 0; ++var69) {
                            int var70 = (var9 >> 16) * super.field3599;
                            for (int var71 = -arg2; var71 < 0; ++var71) {
                                int var72 = this.field3103[(var8 >> 16) + var70];
                                int var73 = (arg5 >>> 24) * (var72 >>> 24) >> 8;
                                int var74 = 256 - var73;
                                if (var73 != 255) {
                                    int var75 = (var72 & 16711680) * var66 & -16777216;
                                    int var76 = (var72 & 65280) * var67 & 16711680;
                                    int var77 = (var72 & 255) * var68 & 65280;
                                    int var78 = (var75 | var76 | var77) >>> 8;
                                    int var79 = var22[var17];
                                    var22[var17++] = ((var78 & 16711935) * var73 + (var79 & 16711935) * var74 & -16711936) + ((var78 & 65280) * var73 + (var79 & 65280) * var74 & 16711680) >> 8;
                                } else {
                                    int var80 = (var72 & 16711680) * var66 & -16777216;
                                    int var81 = (var72 & 65280) * var67 & 16711680;
                                    int var82 = (var72 & 255) * var68 & 65280;
                                    var22[var17++] = (var80 | var81 | var82) >>> 8;
                                }
                                var8 += var13;
                            }
                            var9 += var14;
                            var8 = var58;
                            var17 += var18;
                        }
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var83 = arg5 >>> 24;
                    int var84 = 256 - var83;
                    int var85 = (arg5 & 16711935) * var84 & -16711936;
                    int var86 = (arg5 & 65280) * var84 & 16711680;
                    int var87 = (var85 | var86) >>> 8;
                    int var88 = var8;
                    for (int var89 = -arg3; var89 < 0; ++var89) {
                        int var90 = (var9 >> 16) * super.field3599;
                        for (int var91 = -arg2; var91 < 0; ++var91) {
                            int var92 = this.field3103[(var8 >> 16) + var90];
                            int var93 = var92 >>> 24;
                            int var94 = 256 - var93;
                            int var95 = (var92 & 16711935) * var83 & -16711936;
                            int var96 = (var92 & 65280) * var83 & 16711680;
                            int var97 = ((var95 | var96) >>> 8) + var87;
                            int var98 = var22[var17];
                            var22[var17++] = ((var97 & 16711935) * var93 + (var98 & 16711935) * var94 & -16711936) + ((var97 & 65280) * var93 + (var98 & 65280) * var94 & 16711680) >> 8;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var88;
                        var17 += var18;
                    }
                }
            } else if (arg6 != 2) {
                throw new IllegalArgumentException();
            } else if (arg4 == 0) {
                int var99 = var8;
                for (int var100 = -arg3; var100 < 0; ++var100) {
                    int var101 = (var9 >> 16) * super.field3599;
                    for (int var102 = -arg2; var102 < 0; ++var102) {
                        int var103 = this.field3103[(var8 >> 16) + var101];
                        if (var103 != 0) {
                            int var104 = var22[var17];
                            int var105 = var103 + var104;
                            int var106 = (var103 & 16711935) + (var104 & 16711935);
                            int var107 = (var105 - var106 & 65536) + (var106 & 16777472);
                            var22[var17++] = var105 - var107 | var107 - (var107 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var99;
                    var17 += var18;
                }
            } else if (arg4 == 1) {
                int var108 = var8;
                int var109 = (arg5 & 16711680) >> 16;
                int var110 = (arg5 & 65280) >> 8;
                int var111 = arg5 & 255;
                for (int var112 = -arg3; var112 < 0; ++var112) {
                    int var113 = (var9 >> 16) * super.field3599;
                    for (int var114 = -arg2; var114 < 0; ++var114) {
                        int var115 = this.field3103[(var8 >> 16) + var113];
                        if (var115 != 0) {
                            int var116 = (var115 & 16711680) * var109 & -16777216;
                            int var117 = (var115 & 65280) * var110 & 16711680;
                            int var118 = (var115 & 255) * var111 & 65280;
                            int var119 = (var116 | var117 | var118) >>> 8;
                            int var120 = var22[var17];
                            int var121 = var119 + var120;
                            int var122 = (var119 & 16711935) + (var120 & 16711935);
                            int var123 = (var121 - var122 & 65536) + (var122 & 16777472);
                            var22[var17++] = var121 - var123 | var123 - (var123 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var108;
                    var17 += var18;
                }
            } else if (arg4 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var124 = arg5 >>> 24;
                int var125 = 256 - var124;
                int var126 = (arg5 & 16711935) * var125 & -16711936;
                int var127 = (arg5 & 65280) * var125 & 16711680;
                int var128 = (var126 | var127) >>> 8;
                int var129 = var8;
                for (int var130 = -arg3; var130 < 0; ++var130) {
                    int var131 = (var9 >> 16) * super.field3599;
                    for (int var132 = -arg2; var132 < 0; ++var132) {
                        int var133 = this.field3103[(var8 >> 16) + var131];
                        if (var133 != 0) {
                            int var134 = (var133 & 16711935) * var124 & -16711936;
                            int var135 = (var133 & 65280) * var124 & 16711680;
                            int var136 = ((var134 | var135) >>> 8) + var128;
                            int var137 = var22[var17];
                            int var138 = var136 + var137;
                            int var139 = (var136 & 16711935) + (var137 & 16711935);
                            int var140 = (var138 - var139 & 65536) + (var139 & 16777472);
                            var22[var17++] = var138 - var140 | var140 - (var140 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var129;
                    var17 += var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIII)V")
    public final void method756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (super.field3608.method592()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field3608.field1328;
            int var7 = super.field3606 + arg0;
            int var8 = super.field3580 + arg1;
            int var9 = var6 * var8 + var7;
            int var10 = 0;
            int var11 = super.field3583;
            int var12 = super.field3599;
            int var13 = var6 - var12;
            int var14 = 0;
            if (var8 < super.field3608.field1323) {
                int var15 = super.field3608.field1323 - var8;
                var11 -= var15;
                var8 = super.field3608.field1323;
                var10 += var12 * var15;
                var9 += var6 * var15;
            }
            if (var8 + var11 > super.field3608.field1314) {
                var11 -= var8 + var11 - super.field3608.field1314;
            }
            if (var7 < super.field3608.field1299) {
                int var16 = super.field3608.field1299 - var7;
                var12 -= var16;
                var7 = super.field3608.field1299;
                var10 += var16;
                var9 += var16;
                var14 += var16;
                var13 += var16;
            }
            if (var7 + var12 > super.field3608.field1294) {
                int var17 = var7 + var12 - super.field3608.field1294;
                var12 -= var17;
                var14 += var17;
                var13 += var17;
            }
            if (var12 > 0 && var11 > 0) {
                int[] var18 = super.field3608.field1301;
                if (arg4 == 0) {
                    if (arg2 == 0) {
                        for (int var19 = -var11; var19 < 0; ++var19) {
                            int var20 = var9 + var12 - 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field3103[var10++];
                                var18[var9++] = this.field3103[var10++];
                                var18[var9++] = this.field3103[var10++];
                                var18[var9++] = this.field3103[var10++];
                            }
                            var20 += 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field3103[var10++];
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
                                int var26 = this.field3103[var10++];
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
                                int var37 = this.field3103[var10++];
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
                            for (int var41 = -var12; var41 < 0; ++var41) {
                                int var42 = this.field3103[var10++];
                                int var43 = var42 >>> 24;
                                int var44 = 256 - var43;
                                int var45 = var18[var9];
                                var18[var9++] = ((var42 & 16711935) * var43 + (var45 & 16711935) * var44 & -16711936) + ((var42 & 65280) * var43 + (var45 & 65280) * var44 & 16711680) >> 8;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 == 1) {
                        if ((arg3 & 16777215) == 16777215) {
                            for (int var46 = -var11; var46 < 0; ++var46) {
                                for (int var47 = -var12; var47 < 0; ++var47) {
                                    int var48 = this.field3103[var10++];
                                    int var49 = (arg3 >>> 24) * (var48 >>> 24) >> 8;
                                    int var50 = 256 - var49;
                                    int var51 = var18[var9];
                                    var18[var9++] = ((var48 & 16711935) * var49 + (var51 & 16711935) * var50 & -16711936) + ((var48 & 65280) * var49 + (var51 & 65280) * var50 & 16711680) >> 8;
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        } else {
                            int var52 = (arg3 & 16711680) >> 16;
                            int var53 = (arg3 & 65280) >> 8;
                            int var54 = arg3 & 255;
                            for (int var55 = -var11; var55 < 0; ++var55) {
                                for (int var56 = -var12; var56 < 0; ++var56) {
                                    int var57 = this.field3103[var10++];
                                    int var58 = (arg3 >>> 24) * (var57 >>> 24) >> 8;
                                    int var59 = 256 - var58;
                                    if (var58 != 255) {
                                        int var60 = (var57 & 16711680) * var52 & -16777216;
                                        int var61 = (var57 & 65280) * var53 & 16711680;
                                        int var62 = (var57 & 255) * var54 & 65280;
                                        int var63 = (var60 | var61 | var62) >>> 8;
                                        int var64 = var18[var9];
                                        var18[var9++] = ((var63 & 16711935) * var58 + (var64 & 16711935) * var59 & -16711936) + ((var63 & 65280) * var58 + (var64 & 65280) * var59 & 16711680) >> 8;
                                    } else {
                                        int var65 = (var57 & 16711680) * var52 & -16777216;
                                        int var66 = (var57 & 65280) * var53 & 16711680;
                                        int var67 = (var57 & 255) * var54 & 65280;
                                        var18[var9++] = (var65 | var66 | var67) >>> 8;
                                    }
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        }
                    } else if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var68 = arg3 >>> 24;
                        int var69 = 256 - var68;
                        int var70 = (arg3 & 16711935) * var69 & -16711936;
                        int var71 = (arg3 & 65280) * var69 & 16711680;
                        int var72 = (var70 | var71) >>> 8;
                        for (int var73 = -var11; var73 < 0; ++var73) {
                            for (int var74 = -var12; var74 < 0; ++var74) {
                                int var75 = this.field3103[var10++];
                                int var76 = var75 >>> 24;
                                int var77 = 256 - var76;
                                int var78 = (var75 & 16711935) * var68 & -16711936;
                                int var79 = (var75 & 65280) * var68 & 16711680;
                                int var80 = ((var78 | var79) >>> 8) + var72;
                                int var81 = var18[var9];
                                var18[var9++] = ((var80 & 16711935) * var76 + (var81 & 16711935) * var77 & -16711936) + ((var80 & 65280) * var76 + (var81 & 65280) * var77 & 16711680) >> 8;
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
                            int var84 = this.field3103[var10++];
                            if (var84 != 0) {
                                int var85 = var18[var9];
                                int var86 = var84 + var85;
                                int var87 = (var84 & 16711935) + (var85 & 16711935);
                                int var88 = (var86 - var87 & 65536) + (var87 & 16777472);
                                var18[var9++] = var86 - var88 | var88 - (var88 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 == 1) {
                    int var89 = (arg3 & 16711680) >> 16;
                    int var90 = (arg3 & 65280) >> 8;
                    int var91 = arg3 & 255;
                    for (int var92 = -var11; var92 < 0; ++var92) {
                        for (int var93 = -var12; var93 < 0; ++var93) {
                            int var94 = this.field3103[var10++];
                            if (var94 != 0) {
                                int var95 = (var94 & 16711680) * var89 & -16777216;
                                int var96 = (var94 & 65280) * var90 & 16711680;
                                int var97 = (var94 & 255) * var91 & 65280;
                                int var98 = (var95 | var96 | var97) >>> 8;
                                int var99 = var18[var9];
                                int var100 = var98 + var99;
                                int var101 = (var98 & 16711935) + (var99 & 16711935);
                                int var102 = (var100 - var101 & 65536) + (var101 & 16777472);
                                var18[var9++] = var100 - var102 | var102 - (var102 >>> 8);
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
                    int var103 = arg3 >>> 24;
                    int var104 = 256 - var103;
                    int var105 = (arg3 & 16711935) * var104 & -16711936;
                    int var106 = (arg3 & 65280) * var104 & 16711680;
                    int var107 = (var105 | var106) >>> 8;
                    for (int var108 = -var11; var108 < 0; ++var108) {
                        for (int var109 = -var12; var109 < 0; ++var109) {
                            int var110 = this.field3103[var10++];
                            if (var110 != 0) {
                                int var111 = (var110 & 16711935) * var103 & -16711936;
                                int var112 = (var110 & 65280) * var103 & 16711680;
                                int var113 = ((var111 | var112) >>> 8) + var107;
                                int var114 = var18[var9];
                                int var115 = var113 + var114;
                                int var116 = (var113 & 16711935) + (var114 & 16711935);
                                int var117 = (var115 - var116 & 65536) + (var116 & 16777472);
                                var18[var9++] = var115 - var117 | var117 - (var117 >>> 8);
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

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)V")
    public final void method1485(int arg0, int arg1) {
        int[] var3 = super.field3608.field1301;
        if (class252.field3604 == 0) {
            if (class252.field3597 == 0) {
                int var4 = class252.field3588;
                while (var4 < 0) {
                    int var5 = class252.field3594;
                    int var6 = class252.field3592;
                    int var7 = class252.field3581;
                    int var8 = class252.field3586;
                    if (var6 >= 0 && var7 >= 0 && var6 - (super.field3599 << 12) < 0 && var7 - (super.field3583 << 12) < 0) {
                        while (var8 < 0) {
                            int var9 = (var6 >> 12) + (var7 >> 12) * super.field3599;
                            int var10 = var5++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var10] = this.field3103[var9];
                                } else if (arg0 == 1) {
                                    int var14 = this.field3103[var9++];
                                    int var15 = (var14 & 16711680) * class252.field3595 & -16777216;
                                    int var16 = (var14 & 65280) * class252.field3596 & 16711680;
                                    int var17 = (var14 & 255) * class252.field3607 & 65280;
                                    var3[var10] = (var15 | var16 | var17) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var18 = this.field3103[var9];
                                    int var19 = (var18 & 16711935) * class252.field3609 & -16711936;
                                    int var20 = (var18 & 65280) * class252.field3609 & 16711680;
                                    var3[var10] = ((var19 | var20) >>> 8) + class252.field3598;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    int var21 = this.field3103[var9];
                                    int var22 = var21 >>> 24;
                                    int var23 = 256 - var22;
                                    int var24 = var3[var10];
                                    var3[var10] = ((var21 & 16711935) * var22 + (var24 & 16711935) * var23 & -16711936) + ((var21 & 65280) * var22 + (var24 & 65280) * var23 & 16711680) >> 8;
                                } else if (arg0 == 1) {
                                    int var25 = this.field3103[var9];
                                    int var26 = (var25 >>> 24) * class252.field3609 >> 8;
                                    int var27 = 256 - var26;
                                    if ((class252.field3610 & 16777215) == 16777215) {
                                        int var28 = var3[var10];
                                        var3[var10] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                                    } else if (class252.field3609 != 255) {
                                        int var29 = (var25 & 16711680) * class252.field3595 & -16777216;
                                        int var30 = (var25 & 65280) * class252.field3596 & 16711680;
                                        int var31 = (var25 & 255) * class252.field3607 & 65280;
                                        int var32 = (var29 | var30 | var31) >>> 8;
                                        int var33 = var3[var10];
                                        var3[var10] = ((var32 & 16711935) * var26 + (var33 & 16711935) * var27 & -16711936) + ((var32 & 65280) * var26 + (var33 & 65280) * var27 & 16711680) >> 8;
                                    } else {
                                        int var34 = (var25 & 16711680) * class252.field3595 & -16777216;
                                        int var35 = (var25 & 65280) * class252.field3596 & 16711680;
                                        int var36 = (var25 & 255) * class252.field3607 & 65280;
                                        var3[var10] = (var34 | var35 | var36) >>> 8;
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var37 = this.field3103[var9];
                                    int var38 = var37 >>> 24;
                                    int var39 = 256 - var38;
                                    int var40 = (var37 & 16711935) * class252.field3609 & -16711936;
                                    int var41 = (var37 & 65280) * class252.field3609 & 16711680;
                                    int var42 = ((var40 | var41) >>> 8) + class252.field3598;
                                    int var43 = var3[var10];
                                    var3[var10] = ((var42 & 16711935) * var38 + (var43 & 16711935) * var39 & -16711936) + ((var42 & 65280) * var38 + (var43 & 65280) * var39 & 16711680) >> 8;
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    int var44 = this.field3103[var9];
                                    int var45 = var3[var10];
                                    int var46 = var44 + var45;
                                    int var47 = (var44 & 16711935) + (var45 & 16711935);
                                    int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                                    var3[var10] = var46 - var48 | var48 - (var48 >>> 8);
                                } else if (arg0 == 1) {
                                    int var49 = this.field3103[var9];
                                    int var50 = (var49 & 16711680) * class252.field3595 & -16777216;
                                    int var51 = (var49 & 65280) * class252.field3596 & 16711680;
                                    int var52 = (var49 & 255) * class252.field3607 & 65280;
                                    int var53 = (var50 | var51 | var52) >>> 8;
                                    int var54 = var3[var10];
                                    int var55 = var53 + var54;
                                    int var56 = (var53 & 16711935) + (var54 & 16711935);
                                    int var57 = (var55 - var56 & 65536) + (var56 & 16777472);
                                    var3[var10] = var55 - var57 | var57 - (var57 >>> 8);
                                } else if (arg0 == 2) {
                                    int var58 = this.field3103[var9];
                                    int var59 = (var58 & 16711935) * class252.field3609 & -16711936;
                                    int var60 = (var58 & 65280) * class252.field3609 & 16711680;
                                    int var61 = ((var59 | var60) >>> 8) + class252.field3598;
                                    int var62 = var3[var10];
                                    int var63 = var61 + var62;
                                    int var64 = (var61 & 16711935) + (var62 & 16711935);
                                    int var65 = (var63 - var64 & 65536) + (var64 & 16777472);
                                    var3[var10] = var63 - var65 | var65 - (var65 >>> 8);
                                }
                            }
                            ++var8;
                        }
                    }
                    ++var4;
                    class252.field3594 += class252.field3612;
                }
            } else if (class252.field3597 < 0) {
                int var66 = class252.field3588;
                while (var66 < 0) {
                    int var67 = class252.field3594;
                    int var68 = class252.field3592;
                    int var69 = class252.field3593 + class252.field3581;
                    int var70 = class252.field3586;
                    if (var68 >= 0 && var68 - (super.field3599 << 12) < 0) {
                        int var71;
                        if ((var71 = var69 - (super.field3583 << 12)) >= 0) {
                            int var72 = (class252.field3597 - var71) / class252.field3597;
                            var70 += var72;
                            var69 += class252.field3597 * var72;
                            var67 += var72;
                        }
                        int var73;
                        if ((var73 = (var69 - class252.field3597) / class252.field3597) > var70) {
                            var70 = var73;
                        }
                        while (var70 < 0) {
                            int var74 = (var68 >> 12) + (var69 >> 12) * super.field3599;
                            int var75 = var67++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var75] = this.field3103[var74];
                                } else if (arg0 == 1) {
                                    int var79 = this.field3103[var74++];
                                    int var80 = (var79 & 16711680) * class252.field3595 & -16777216;
                                    int var81 = (var79 & 65280) * class252.field3596 & 16711680;
                                    int var82 = (var79 & 255) * class252.field3607 & 65280;
                                    var3[var75] = (var80 | var81 | var82) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var83 = this.field3103[var74];
                                    int var84 = (var83 & 16711935) * class252.field3609 & -16711936;
                                    int var85 = (var83 & 65280) * class252.field3609 & 16711680;
                                    var3[var75] = ((var84 | var85) >>> 8) + class252.field3598;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    int var86 = this.field3103[var74];
                                    int var87 = var86 >>> 24;
                                    int var88 = 256 - var87;
                                    int var89 = var3[var75];
                                    var3[var75] = ((var86 & 16711935) * var87 + (var89 & 16711935) * var88 & -16711936) + ((var86 & 65280) * var87 + (var89 & 65280) * var88 & 16711680) >> 8;
                                } else if (arg0 == 1) {
                                    int var90 = this.field3103[var74];
                                    int var91 = (var90 >>> 24) * class252.field3609 >> 8;
                                    int var92 = 256 - var91;
                                    if ((class252.field3610 & 16777215) == 16777215) {
                                        int var93 = var3[var75];
                                        var3[var75] = ((var90 & 16711935) * var91 + (var93 & 16711935) * var92 & -16711936) + ((var90 & 65280) * var91 + (var93 & 65280) * var92 & 16711680) >> 8;
                                    } else if (class252.field3609 != 255) {
                                        int var94 = (var90 & 16711680) * class252.field3595 & -16777216;
                                        int var95 = (var90 & 65280) * class252.field3596 & 16711680;
                                        int var96 = (var90 & 255) * class252.field3607 & 65280;
                                        int var97 = (var94 | var95 | var96) >>> 8;
                                        int var98 = var3[var75];
                                        var3[var75] = ((var97 & 16711935) * var91 + (var98 & 16711935) * var92 & -16711936) + ((var97 & 65280) * var91 + (var98 & 65280) * var92 & 16711680) >> 8;
                                    } else {
                                        int var99 = (var90 & 16711680) * class252.field3595 & -16777216;
                                        int var100 = (var90 & 65280) * class252.field3596 & 16711680;
                                        int var101 = (var90 & 255) * class252.field3607 & 65280;
                                        var3[var75] = (var99 | var100 | var101) >>> 8;
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var102 = this.field3103[var74];
                                    int var103 = var102 >>> 24;
                                    int var104 = 256 - var103;
                                    int var105 = (var102 & 16711935) * class252.field3609 & -16711936;
                                    int var106 = (var102 & 65280) * class252.field3609 & 16711680;
                                    int var107 = ((var105 | var106) >>> 8) + class252.field3598;
                                    int var108 = var3[var75];
                                    var3[var75] = ((var107 & 16711935) * var103 + (var108 & 16711935) * var104 & -16711936) + ((var107 & 65280) * var103 + (var108 & 65280) * var104 & 16711680) >> 8;
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    int var109 = this.field3103[var74];
                                    int var110 = var3[var75];
                                    int var111 = var109 + var110;
                                    int var112 = (var109 & 16711935) + (var110 & 16711935);
                                    int var113 = (var111 - var112 & 65536) + (var112 & 16777472);
                                    var3[var75] = var111 - var113 | var113 - (var113 >>> 8);
                                } else if (arg0 == 1) {
                                    int var114 = this.field3103[var74];
                                    int var115 = (var114 & 16711680) * class252.field3595 & -16777216;
                                    int var116 = (var114 & 65280) * class252.field3596 & 16711680;
                                    int var117 = (var114 & 255) * class252.field3607 & 65280;
                                    int var118 = (var115 | var116 | var117) >>> 8;
                                    int var119 = var3[var75];
                                    int var120 = var118 + var119;
                                    int var121 = (var118 & 16711935) + (var119 & 16711935);
                                    int var122 = (var120 - var121 & 65536) + (var121 & 16777472);
                                    var3[var75] = var120 - var122 | var122 - (var122 >>> 8);
                                } else if (arg0 == 2) {
                                    int var123 = this.field3103[var74];
                                    int var124 = (var123 & 16711935) * class252.field3609 & -16711936;
                                    int var125 = (var123 & 65280) * class252.field3609 & 16711680;
                                    int var126 = ((var124 | var125) >>> 8) + class252.field3598;
                                    int var127 = var3[var75];
                                    int var128 = var126 + var127;
                                    int var129 = (var126 & 16711935) + (var127 & 16711935);
                                    int var130 = (var128 - var129 & 65536) + (var129 & 16777472);
                                    var3[var75] = var128 - var130 | var130 - (var130 >>> 8);
                                }
                            }
                            var69 += class252.field3597;
                            ++var70;
                        }
                    }
                    ++var66;
                    class252.field3592 += class252.field3585;
                    class252.field3594 += class252.field3612;
                }
            } else {
                int var131 = class252.field3588;
                while (var131 < 0) {
                    int var132 = class252.field3594;
                    int var133 = class252.field3592;
                    int var134 = class252.field3593 + class252.field3581;
                    int var135 = class252.field3586;
                    if (var133 >= 0 && var133 - (super.field3599 << 12) < 0) {
                        if (var134 < 0) {
                            int var136 = (class252.field3597 - 1 - var134) / class252.field3597;
                            var135 += var136;
                            var134 += class252.field3597 * var136;
                            var132 += var136;
                        }
                        int var137;
                        if ((var137 = (var134 + 1 - (super.field3583 << 12) - class252.field3597) / class252.field3597) > var135) {
                            var135 = var137;
                        }
                        while (var135 < 0) {
                            int var138 = (var133 >> 12) + (var134 >> 12) * super.field3599;
                            int var139 = var132++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var139] = this.field3103[var138];
                                } else if (arg0 == 1) {
                                    int var143 = this.field3103[var138++];
                                    int var144 = (var143 & 16711680) * class252.field3595 & -16777216;
                                    int var145 = (var143 & 65280) * class252.field3596 & 16711680;
                                    int var146 = (var143 & 255) * class252.field3607 & 65280;
                                    var3[var139] = (var144 | var145 | var146) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var147 = this.field3103[var138];
                                    int var148 = (var147 & 16711935) * class252.field3609 & -16711936;
                                    int var149 = (var147 & 65280) * class252.field3609 & 16711680;
                                    var3[var139] = ((var148 | var149) >>> 8) + class252.field3598;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    int var150 = this.field3103[var138];
                                    int var151 = var150 >>> 24;
                                    int var152 = 256 - var151;
                                    int var153 = var3[var139];
                                    var3[var139] = ((var150 & 16711935) * var151 + (var153 & 16711935) * var152 & -16711936) + ((var150 & 65280) * var151 + (var153 & 65280) * var152 & 16711680) >> 8;
                                } else if (arg0 == 1) {
                                    int var154 = this.field3103[var138];
                                    int var155 = (var154 >>> 24) * class252.field3609 >> 8;
                                    int var156 = 256 - var155;
                                    if ((class252.field3610 & 16777215) == 16777215) {
                                        int var157 = var3[var139];
                                        var3[var139] = ((var154 & 16711935) * var155 + (var157 & 16711935) * var156 & -16711936) + ((var154 & 65280) * var155 + (var157 & 65280) * var156 & 16711680) >> 8;
                                    } else if (class252.field3609 != 255) {
                                        int var158 = (var154 & 16711680) * class252.field3595 & -16777216;
                                        int var159 = (var154 & 65280) * class252.field3596 & 16711680;
                                        int var160 = (var154 & 255) * class252.field3607 & 65280;
                                        int var161 = (var158 | var159 | var160) >>> 8;
                                        int var162 = var3[var139];
                                        var3[var139] = ((var161 & 16711935) * var155 + (var162 & 16711935) * var156 & -16711936) + ((var161 & 65280) * var155 + (var162 & 65280) * var156 & 16711680) >> 8;
                                    } else {
                                        int var163 = (var154 & 16711680) * class252.field3595 & -16777216;
                                        int var164 = (var154 & 65280) * class252.field3596 & 16711680;
                                        int var165 = (var154 & 255) * class252.field3607 & 65280;
                                        var3[var139] = (var163 | var164 | var165) >>> 8;
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var166 = this.field3103[var138];
                                    int var167 = var166 >>> 24;
                                    int var168 = 256 - var167;
                                    int var169 = (var166 & 16711935) * class252.field3609 & -16711936;
                                    int var170 = (var166 & 65280) * class252.field3609 & 16711680;
                                    int var171 = ((var169 | var170) >>> 8) + class252.field3598;
                                    int var172 = var3[var139];
                                    var3[var139] = ((var171 & 16711935) * var167 + (var172 & 16711935) * var168 & -16711936) + ((var171 & 65280) * var167 + (var172 & 65280) * var168 & 16711680) >> 8;
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    int var173 = this.field3103[var138];
                                    int var174 = var3[var139];
                                    int var175 = var173 + var174;
                                    int var176 = (var173 & 16711935) + (var174 & 16711935);
                                    int var177 = (var175 - var176 & 65536) + (var176 & 16777472);
                                    var3[var139] = var175 - var177 | var177 - (var177 >>> 8);
                                } else if (arg0 == 1) {
                                    int var178 = this.field3103[var138];
                                    int var179 = (var178 & 16711680) * class252.field3595 & -16777216;
                                    int var180 = (var178 & 65280) * class252.field3596 & 16711680;
                                    int var181 = (var178 & 255) * class252.field3607 & 65280;
                                    int var182 = (var179 | var180 | var181) >>> 8;
                                    int var183 = var3[var139];
                                    int var184 = var182 + var183;
                                    int var185 = (var182 & 16711935) + (var183 & 16711935);
                                    int var186 = (var184 - var185 & 65536) + (var185 & 16777472);
                                    var3[var139] = var184 - var186 | var186 - (var186 >>> 8);
                                } else if (arg0 == 2) {
                                    int var187 = this.field3103[var138];
                                    int var188 = (var187 & 16711935) * class252.field3609 & -16711936;
                                    int var189 = (var187 & 65280) * class252.field3609 & 16711680;
                                    int var190 = ((var188 | var189) >>> 8) + class252.field3598;
                                    int var191 = var3[var139];
                                    int var192 = var190 + var191;
                                    int var193 = (var190 & 16711935) + (var191 & 16711935);
                                    int var194 = (var192 - var193 & 65536) + (var193 & 16777472);
                                    var3[var139] = var192 - var194 | var194 - (var194 >>> 8);
                                }
                            }
                            var134 += class252.field3597;
                            ++var135;
                        }
                    }
                    ++var131;
                    class252.field3592 += class252.field3585;
                    class252.field3594 += class252.field3612;
                }
            }
        } else if (class252.field3604 < 0) {
            if (class252.field3597 == 0) {
                int var195 = class252.field3588;
                while (var195 < 0) {
                    int var196 = class252.field3594;
                    int var197 = class252.field3611 + class252.field3592;
                    int var198 = class252.field3581;
                    int var199 = class252.field3586;
                    if (var198 >= 0 && var198 - (super.field3583 << 12) < 0) {
                        int var200;
                        if ((var200 = var197 - (super.field3599 << 12)) >= 0) {
                            int var201 = (class252.field3604 - var200) / class252.field3604;
                            var199 += var201;
                            var197 += class252.field3604 * var201;
                            var196 += var201;
                        }
                        int var202;
                        if ((var202 = (var197 - class252.field3604) / class252.field3604) > var199) {
                            var199 = var202;
                        }
                        while (var199 < 0) {
                            int var203 = (var197 >> 12) + (var198 >> 12) * super.field3599;
                            int var204 = var196++;
                            if (arg1 == 0) {
                                if (arg0 == 0) {
                                    var3[var204] = this.field3103[var203];
                                } else if (arg0 == 1) {
                                    int var208 = this.field3103[var203++];
                                    int var209 = (var208 & 16711680) * class252.field3595 & -16777216;
                                    int var210 = (var208 & 65280) * class252.field3596 & 16711680;
                                    int var211 = (var208 & 255) * class252.field3607 & 65280;
                                    var3[var204] = (var209 | var210 | var211) >>> 8;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var212 = this.field3103[var203];
                                    int var213 = (var212 & 16711935) * class252.field3609 & -16711936;
                                    int var214 = (var212 & 65280) * class252.field3609 & 16711680;
                                    var3[var204] = ((var213 | var214) >>> 8) + class252.field3598;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 0) {
                                    int var215 = this.field3103[var203];
                                    int var216 = var215 >>> 24;
                                    int var217 = 256 - var216;
                                    int var218 = var3[var204];
                                    var3[var204] = ((var215 & 16711935) * var216 + (var218 & 16711935) * var217 & -16711936) + ((var215 & 65280) * var216 + (var218 & 65280) * var217 & 16711680) >> 8;
                                } else if (arg0 == 1) {
                                    int var219 = this.field3103[var203];
                                    int var220 = (var219 >>> 24) * class252.field3609 >> 8;
                                    int var221 = 256 - var220;
                                    if ((class252.field3610 & 16777215) == 16777215) {
                                        int var222 = var3[var204];
                                        var3[var204] = ((var219 & 16711935) * var220 + (var222 & 16711935) * var221 & -16711936) + ((var219 & 65280) * var220 + (var222 & 65280) * var221 & 16711680) >> 8;
                                    } else if (class252.field3609 != 255) {
                                        int var223 = (var219 & 16711680) * class252.field3595 & -16777216;
                                        int var224 = (var219 & 65280) * class252.field3596 & 16711680;
                                        int var225 = (var219 & 255) * class252.field3607 & 65280;
                                        int var226 = (var223 | var224 | var225) >>> 8;
                                        int var227 = var3[var204];
                                        var3[var204] = ((var226 & 16711935) * var220 + (var227 & 16711935) * var221 & -16711936) + ((var226 & 65280) * var220 + (var227 & 65280) * var221 & 16711680) >> 8;
                                    } else {
                                        int var228 = (var219 & 16711680) * class252.field3595 & -16777216;
                                        int var229 = (var219 & 65280) * class252.field3596 & 16711680;
                                        int var230 = (var219 & 255) * class252.field3607 & 65280;
                                        var3[var204] = (var228 | var229 | var230) >>> 8;
                                    }
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var231 = this.field3103[var203];
                                    int var232 = var231 >>> 24;
                                    int var233 = 256 - var232;
                                    int var234 = (var231 & 16711935) * class252.field3609 & -16711936;
                                    int var235 = (var231 & 65280) * class252.field3609 & 16711680;
                                    int var236 = ((var234 | var235) >>> 8) + class252.field3598;
                                    int var237 = var3[var204];
                                    var3[var204] = ((var236 & 16711935) * var232 + (var237 & 16711935) * var233 & -16711936) + ((var236 & 65280) * var232 + (var237 & 65280) * var233 & 16711680) >> 8;
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 0) {
                                    int var238 = this.field3103[var203];
                                    int var239 = var3[var204];
                                    int var240 = var238 + var239;
                                    int var241 = (var238 & 16711935) + (var239 & 16711935);
                                    int var242 = (var240 - var241 & 65536) + (var241 & 16777472);
                                    var3[var204] = var240 - var242 | var242 - (var242 >>> 8);
                                } else if (arg0 == 1) {
                                    int var243 = this.field3103[var203];
                                    int var244 = (var243 & 16711680) * class252.field3595 & -16777216;
                                    int var245 = (var243 & 65280) * class252.field3596 & 16711680;
                                    int var246 = (var243 & 255) * class252.field3607 & 65280;
                                    int var247 = (var244 | var245 | var246) >>> 8;
                                    int var248 = var3[var204];
                                    int var249 = var247 + var248;
                                    int var250 = (var247 & 16711935) + (var248 & 16711935);
                                    int var251 = (var249 - var250 & 65536) + (var250 & 16777472);
                                    var3[var204] = var249 - var251 | var251 - (var251 >>> 8);
                                } else if (arg0 == 2) {
                                    int var252 = this.field3103[var203];
                                    int var253 = (var252 & 16711935) * class252.field3609 & -16711936;
                                    int var254 = (var252 & 65280) * class252.field3609 & 16711680;
                                    int var255 = ((var253 | var254) >>> 8) + class252.field3598;
                                    int var256 = var3[var204];
                                    int var257 = var255 + var256;
                                    int var258 = (var255 & 16711935) + (var256 & 16711935);
                                    int var259 = (var257 - var258 & 65536) + (var258 & 16777472);
                                    var3[var204] = var257 - var259 | var259 - (var259 >>> 8);
                                }
                            }
                            var197 += class252.field3604;
                            ++var199;
                        }
                    }
                    ++var195;
                    class252.field3581 += class252.field3587;
                    class252.field3594 += class252.field3612;
                }
            } else if (class252.field3597 < 0) {
                int var260 = class252.field3588;
                while (var260 < 0) {
                    int var261 = class252.field3594;
                    int var262 = class252.field3611 + class252.field3592;
                    int var263 = class252.field3593 + class252.field3581;
                    int var264 = class252.field3586;
                    int var265;
                    if ((var265 = var262 - (super.field3599 << 12)) >= 0) {
                        int var266 = (class252.field3604 - var265) / class252.field3604;
                        var264 += var266;
                        var262 += class252.field3604 * var266;
                        var263 += class252.field3597 * var266;
                        var261 += var266;
                    }
                    int var267;
                    if ((var267 = (var262 - class252.field3604) / class252.field3604) > var264) {
                        var264 = var267;
                    }
                    int var268;
                    if ((var268 = var263 - (super.field3583 << 12)) >= 0) {
                        int var269 = (class252.field3597 - var268) / class252.field3597;
                        var264 += var269;
                        var262 += class252.field3604 * var269;
                        var263 += class252.field3597 * var269;
                        var261 += var269;
                    }
                    int var270;
                    if ((var270 = (var263 - class252.field3597) / class252.field3597) > var264) {
                        var264 = var270;
                    }
                    while (var264 < 0) {
                        int var271 = (var262 >> 12) + (var263 >> 12) * super.field3599;
                        int var272 = var261++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var272] = this.field3103[var271];
                            } else if (arg0 == 1) {
                                int var276 = this.field3103[var271++];
                                int var277 = (var276 & 16711680) * class252.field3595 & -16777216;
                                int var278 = (var276 & 65280) * class252.field3596 & 16711680;
                                int var279 = (var276 & 255) * class252.field3607 & 65280;
                                var3[var272] = (var277 | var278 | var279) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var280 = this.field3103[var271];
                                int var281 = (var280 & 16711935) * class252.field3609 & -16711936;
                                int var282 = (var280 & 65280) * class252.field3609 & 16711680;
                                var3[var272] = ((var281 | var282) >>> 8) + class252.field3598;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                int var283 = this.field3103[var271];
                                int var284 = var283 >>> 24;
                                int var285 = 256 - var284;
                                int var286 = var3[var272];
                                var3[var272] = ((var283 & 16711935) * var284 + (var286 & 16711935) * var285 & -16711936) + ((var283 & 65280) * var284 + (var286 & 65280) * var285 & 16711680) >> 8;
                            } else if (arg0 == 1) {
                                int var287 = this.field3103[var271];
                                int var288 = (var287 >>> 24) * class252.field3609 >> 8;
                                int var289 = 256 - var288;
                                if ((class252.field3610 & 16777215) == 16777215) {
                                    int var290 = var3[var272];
                                    var3[var272] = ((var287 & 16711935) * var288 + (var290 & 16711935) * var289 & -16711936) + ((var287 & 65280) * var288 + (var290 & 65280) * var289 & 16711680) >> 8;
                                } else if (class252.field3609 != 255) {
                                    int var291 = (var287 & 16711680) * class252.field3595 & -16777216;
                                    int var292 = (var287 & 65280) * class252.field3596 & 16711680;
                                    int var293 = (var287 & 255) * class252.field3607 & 65280;
                                    int var294 = (var291 | var292 | var293) >>> 8;
                                    int var295 = var3[var272];
                                    var3[var272] = ((var294 & 16711935) * var288 + (var295 & 16711935) * var289 & -16711936) + ((var294 & 65280) * var288 + (var295 & 65280) * var289 & 16711680) >> 8;
                                } else {
                                    int var296 = (var287 & 16711680) * class252.field3595 & -16777216;
                                    int var297 = (var287 & 65280) * class252.field3596 & 16711680;
                                    int var298 = (var287 & 255) * class252.field3607 & 65280;
                                    var3[var272] = (var296 | var297 | var298) >>> 8;
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var299 = this.field3103[var271];
                                int var300 = var299 >>> 24;
                                int var301 = 256 - var300;
                                int var302 = (var299 & 16711935) * class252.field3609 & -16711936;
                                int var303 = (var299 & 65280) * class252.field3609 & 16711680;
                                int var304 = ((var302 | var303) >>> 8) + class252.field3598;
                                int var305 = var3[var272];
                                var3[var272] = ((var304 & 16711935) * var300 + (var305 & 16711935) * var301 & -16711936) + ((var304 & 65280) * var300 + (var305 & 65280) * var301 & 16711680) >> 8;
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                int var306 = this.field3103[var271];
                                int var307 = var3[var272];
                                int var308 = var306 + var307;
                                int var309 = (var306 & 16711935) + (var307 & 16711935);
                                int var310 = (var308 - var309 & 65536) + (var309 & 16777472);
                                var3[var272] = var308 - var310 | var310 - (var310 >>> 8);
                            } else if (arg0 == 1) {
                                int var311 = this.field3103[var271];
                                int var312 = (var311 & 16711680) * class252.field3595 & -16777216;
                                int var313 = (var311 & 65280) * class252.field3596 & 16711680;
                                int var314 = (var311 & 255) * class252.field3607 & 65280;
                                int var315 = (var312 | var313 | var314) >>> 8;
                                int var316 = var3[var272];
                                int var317 = var315 + var316;
                                int var318 = (var315 & 16711935) + (var316 & 16711935);
                                int var319 = (var317 - var318 & 65536) + (var318 & 16777472);
                                var3[var272] = var317 - var319 | var319 - (var319 >>> 8);
                            } else if (arg0 == 2) {
                                int var320 = this.field3103[var271];
                                int var321 = (var320 & 16711935) * class252.field3609 & -16711936;
                                int var322 = (var320 & 65280) * class252.field3609 & 16711680;
                                int var323 = ((var321 | var322) >>> 8) + class252.field3598;
                                int var324 = var3[var272];
                                int var325 = var323 + var324;
                                int var326 = (var323 & 16711935) + (var324 & 16711935);
                                int var327 = (var325 - var326 & 65536) + (var326 & 16777472);
                                var3[var272] = var325 - var327 | var327 - (var327 >>> 8);
                            }
                        }
                        var262 += class252.field3604;
                        var263 += class252.field3597;
                        ++var264;
                    }
                    ++var260;
                    class252.field3592 += class252.field3585;
                    class252.field3581 += class252.field3587;
                    class252.field3594 += class252.field3612;
                }
            } else {
                int var328 = class252.field3588;
                while (var328 < 0) {
                    int var329 = class252.field3594;
                    int var330 = class252.field3611 + class252.field3592;
                    int var331 = class252.field3593 + class252.field3581;
                    int var332 = class252.field3586;
                    int var333;
                    if ((var333 = var330 - (super.field3599 << 12)) >= 0) {
                        int var334 = (class252.field3604 - var333) / class252.field3604;
                        var332 += var334;
                        var330 += class252.field3604 * var334;
                        var331 += class252.field3597 * var334;
                        var329 += var334;
                    }
                    int var335;
                    if ((var335 = (var330 - class252.field3604) / class252.field3604) > var332) {
                        var332 = var335;
                    }
                    if (var331 < 0) {
                        int var336 = (class252.field3597 - 1 - var331) / class252.field3597;
                        var332 += var336;
                        var330 += class252.field3604 * var336;
                        var331 += class252.field3597 * var336;
                        var329 += var336;
                    }
                    int var337;
                    if ((var337 = (var331 + 1 - (super.field3583 << 12) - class252.field3597) / class252.field3597) > var332) {
                        var332 = var337;
                    }
                    while (var332 < 0) {
                        int var338 = (var330 >> 12) + (var331 >> 12) * super.field3599;
                        int var339 = var329++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var339] = this.field3103[var338];
                            } else if (arg0 == 1) {
                                int var343 = this.field3103[var338++];
                                int var344 = (var343 & 16711680) * class252.field3595 & -16777216;
                                int var345 = (var343 & 65280) * class252.field3596 & 16711680;
                                int var346 = (var343 & 255) * class252.field3607 & 65280;
                                var3[var339] = (var344 | var345 | var346) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var347 = this.field3103[var338];
                                int var348 = (var347 & 16711935) * class252.field3609 & -16711936;
                                int var349 = (var347 & 65280) * class252.field3609 & 16711680;
                                var3[var339] = ((var348 | var349) >>> 8) + class252.field3598;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                int var350 = this.field3103[var338];
                                int var351 = var350 >>> 24;
                                int var352 = 256 - var351;
                                int var353 = var3[var339];
                                var3[var339] = ((var350 & 16711935) * var351 + (var353 & 16711935) * var352 & -16711936) + ((var350 & 65280) * var351 + (var353 & 65280) * var352 & 16711680) >> 8;
                            } else if (arg0 == 1) {
                                int var354 = this.field3103[var338];
                                int var355 = (var354 >>> 24) * class252.field3609 >> 8;
                                int var356 = 256 - var355;
                                if ((class252.field3610 & 16777215) == 16777215) {
                                    int var357 = var3[var339];
                                    var3[var339] = ((var354 & 16711935) * var355 + (var357 & 16711935) * var356 & -16711936) + ((var354 & 65280) * var355 + (var357 & 65280) * var356 & 16711680) >> 8;
                                } else if (class252.field3609 != 255) {
                                    int var358 = (var354 & 16711680) * class252.field3595 & -16777216;
                                    int var359 = (var354 & 65280) * class252.field3596 & 16711680;
                                    int var360 = (var354 & 255) * class252.field3607 & 65280;
                                    int var361 = (var358 | var359 | var360) >>> 8;
                                    int var362 = var3[var339];
                                    var3[var339] = ((var361 & 16711935) * var355 + (var362 & 16711935) * var356 & -16711936) + ((var361 & 65280) * var355 + (var362 & 65280) * var356 & 16711680) >> 8;
                                } else {
                                    int var363 = (var354 & 16711680) * class252.field3595 & -16777216;
                                    int var364 = (var354 & 65280) * class252.field3596 & 16711680;
                                    int var365 = (var354 & 255) * class252.field3607 & 65280;
                                    var3[var339] = (var363 | var364 | var365) >>> 8;
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var366 = this.field3103[var338];
                                int var367 = var366 >>> 24;
                                int var368 = 256 - var367;
                                int var369 = (var366 & 16711935) * class252.field3609 & -16711936;
                                int var370 = (var366 & 65280) * class252.field3609 & 16711680;
                                int var371 = ((var369 | var370) >>> 8) + class252.field3598;
                                int var372 = var3[var339];
                                var3[var339] = ((var371 & 16711935) * var367 + (var372 & 16711935) * var368 & -16711936) + ((var371 & 65280) * var367 + (var372 & 65280) * var368 & 16711680) >> 8;
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                int var373 = this.field3103[var338];
                                int var374 = var3[var339];
                                int var375 = var373 + var374;
                                int var376 = (var373 & 16711935) + (var374 & 16711935);
                                int var377 = (var375 - var376 & 65536) + (var376 & 16777472);
                                var3[var339] = var375 - var377 | var377 - (var377 >>> 8);
                            } else if (arg0 == 1) {
                                int var378 = this.field3103[var338];
                                int var379 = (var378 & 16711680) * class252.field3595 & -16777216;
                                int var380 = (var378 & 65280) * class252.field3596 & 16711680;
                                int var381 = (var378 & 255) * class252.field3607 & 65280;
                                int var382 = (var379 | var380 | var381) >>> 8;
                                int var383 = var3[var339];
                                int var384 = var382 + var383;
                                int var385 = (var382 & 16711935) + (var383 & 16711935);
                                int var386 = (var384 - var385 & 65536) + (var385 & 16777472);
                                var3[var339] = var384 - var386 | var386 - (var386 >>> 8);
                            } else if (arg0 == 2) {
                                int var387 = this.field3103[var338];
                                int var388 = (var387 & 16711935) * class252.field3609 & -16711936;
                                int var389 = (var387 & 65280) * class252.field3609 & 16711680;
                                int var390 = ((var388 | var389) >>> 8) + class252.field3598;
                                int var391 = var3[var339];
                                int var392 = var390 + var391;
                                int var393 = (var390 & 16711935) + (var391 & 16711935);
                                int var394 = (var392 - var393 & 65536) + (var393 & 16777472);
                                var3[var339] = var392 - var394 | var394 - (var394 >>> 8);
                            }
                        }
                        var330 += class252.field3604;
                        var331 += class252.field3597;
                        ++var332;
                    }
                    ++var328;
                    class252.field3592 += class252.field3585;
                    class252.field3581 += class252.field3587;
                    class252.field3594 += class252.field3612;
                }
            }
        } else if (class252.field3597 == 0) {
            int var395 = class252.field3588;
            while (var395 < 0) {
                int var396 = class252.field3594;
                int var397 = class252.field3611 + class252.field3592;
                int var398 = class252.field3581;
                int var399 = class252.field3586;
                if (var398 >= 0 && var398 - (super.field3583 << 12) < 0) {
                    if (var397 < 0) {
                        int var400 = (class252.field3604 - 1 - var397) / class252.field3604;
                        var399 += var400;
                        var397 += class252.field3604 * var400;
                        var396 += var400;
                    }
                    int var401;
                    if ((var401 = (var397 + 1 - (super.field3599 << 12) - class252.field3604) / class252.field3604) > var399) {
                        var399 = var401;
                    }
                    while (var399 < 0) {
                        int var402 = (var397 >> 12) + (var398 >> 12) * super.field3599;
                        int var403 = var396++;
                        if (arg1 == 0) {
                            if (arg0 == 0) {
                                var3[var403] = this.field3103[var402];
                            } else if (arg0 == 1) {
                                int var407 = this.field3103[var402++];
                                int var408 = (var407 & 16711680) * class252.field3595 & -16777216;
                                int var409 = (var407 & 65280) * class252.field3596 & 16711680;
                                int var410 = (var407 & 255) * class252.field3607 & 65280;
                                var3[var403] = (var408 | var409 | var410) >>> 8;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var411 = this.field3103[var402];
                                int var412 = (var411 & 16711935) * class252.field3609 & -16711936;
                                int var413 = (var411 & 65280) * class252.field3609 & 16711680;
                                var3[var403] = ((var412 | var413) >>> 8) + class252.field3598;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 0) {
                                int var414 = this.field3103[var402];
                                int var415 = var414 >>> 24;
                                int var416 = 256 - var415;
                                int var417 = var3[var403];
                                var3[var403] = ((var414 & 16711935) * var415 + (var417 & 16711935) * var416 & -16711936) + ((var414 & 65280) * var415 + (var417 & 65280) * var416 & 16711680) >> 8;
                            } else if (arg0 == 1) {
                                int var418 = this.field3103[var402];
                                int var419 = (var418 >>> 24) * class252.field3609 >> 8;
                                int var420 = 256 - var419;
                                if ((class252.field3610 & 16777215) == 16777215) {
                                    int var421 = var3[var403];
                                    var3[var403] = ((var418 & 16711935) * var419 + (var421 & 16711935) * var420 & -16711936) + ((var418 & 65280) * var419 + (var421 & 65280) * var420 & 16711680) >> 8;
                                } else if (class252.field3609 != 255) {
                                    int var422 = (var418 & 16711680) * class252.field3595 & -16777216;
                                    int var423 = (var418 & 65280) * class252.field3596 & 16711680;
                                    int var424 = (var418 & 255) * class252.field3607 & 65280;
                                    int var425 = (var422 | var423 | var424) >>> 8;
                                    int var426 = var3[var403];
                                    var3[var403] = ((var425 & 16711935) * var419 + (var426 & 16711935) * var420 & -16711936) + ((var425 & 65280) * var419 + (var426 & 65280) * var420 & 16711680) >> 8;
                                } else {
                                    int var427 = (var418 & 16711680) * class252.field3595 & -16777216;
                                    int var428 = (var418 & 65280) * class252.field3596 & 16711680;
                                    int var429 = (var418 & 255) * class252.field3607 & 65280;
                                    var3[var403] = (var427 | var428 | var429) >>> 8;
                                }
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var430 = this.field3103[var402];
                                int var431 = var430 >>> 24;
                                int var432 = 256 - var431;
                                int var433 = (var430 & 16711935) * class252.field3609 & -16711936;
                                int var434 = (var430 & 65280) * class252.field3609 & 16711680;
                                int var435 = ((var433 | var434) >>> 8) + class252.field3598;
                                int var436 = var3[var403];
                                var3[var403] = ((var435 & 16711935) * var431 + (var436 & 16711935) * var432 & -16711936) + ((var435 & 65280) * var431 + (var436 & 65280) * var432 & 16711680) >> 8;
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 0) {
                                int var437 = this.field3103[var402];
                                int var438 = var3[var403];
                                int var439 = var437 + var438;
                                int var440 = (var437 & 16711935) + (var438 & 16711935);
                                int var441 = (var439 - var440 & 65536) + (var440 & 16777472);
                                var3[var403] = var439 - var441 | var441 - (var441 >>> 8);
                            } else if (arg0 == 1) {
                                int var442 = this.field3103[var402];
                                int var443 = (var442 & 16711680) * class252.field3595 & -16777216;
                                int var444 = (var442 & 65280) * class252.field3596 & 16711680;
                                int var445 = (var442 & 255) * class252.field3607 & 65280;
                                int var446 = (var443 | var444 | var445) >>> 8;
                                int var447 = var3[var403];
                                int var448 = var446 + var447;
                                int var449 = (var446 & 16711935) + (var447 & 16711935);
                                int var450 = (var448 - var449 & 65536) + (var449 & 16777472);
                                var3[var403] = var448 - var450 | var450 - (var450 >>> 8);
                            } else if (arg0 == 2) {
                                int var451 = this.field3103[var402];
                                int var452 = (var451 & 16711935) * class252.field3609 & -16711936;
                                int var453 = (var451 & 65280) * class252.field3609 & 16711680;
                                int var454 = ((var452 | var453) >>> 8) + class252.field3598;
                                int var455 = var3[var403];
                                int var456 = var454 + var455;
                                int var457 = (var454 & 16711935) + (var455 & 16711935);
                                int var458 = (var456 - var457 & 65536) + (var457 & 16777472);
                                var3[var403] = var456 - var458 | var458 - (var458 >>> 8);
                            }
                        }
                        var397 += class252.field3604;
                        ++var399;
                    }
                }
                ++var395;
                class252.field3592 += class252.field3585;
                class252.field3581 += class252.field3587;
                class252.field3594 += class252.field3612;
            }
        } else if (class252.field3597 < 0) {
            for (int var459 = class252.field3588; var459 < 0; ++var459) {
                int var460 = class252.field3594;
                int var461 = class252.field3611 + class252.field3592;
                int var462 = class252.field3593 + class252.field3581;
                int var463 = class252.field3586;
                if (var461 < 0) {
                    int var464 = (class252.field3604 - 1 - var461) / class252.field3604;
                    var463 += var464;
                    var461 += class252.field3604 * var464;
                    var462 += class252.field3597 * var464;
                    var460 += var464;
                }
                int var465;
                if ((var465 = (var461 + 1 - (super.field3599 << 12) - class252.field3604) / class252.field3604) > var463) {
                    var463 = var465;
                }
                int var466;
                if ((var466 = var462 - (super.field3583 << 12)) >= 0) {
                    int var467 = (class252.field3597 - var466) / class252.field3597;
                    var463 += var467;
                    var461 += class252.field3604 * var467;
                    var462 += class252.field3597 * var467;
                    var460 += var467;
                }
                int var468;
                if ((var468 = (var462 - class252.field3597) / class252.field3597) > var463) {
                    var463 = var468;
                }
                while (var463 < 0) {
                    int var469 = (var461 >> 12) + (var462 >> 12) * super.field3599;
                    int var470 = var460++;
                    if (arg1 == 0) {
                        if (arg0 == 0) {
                            var3[var470] = this.field3103[var469];
                        } else if (arg0 == 1) {
                            int var474 = this.field3103[var469++];
                            int var475 = (var474 & 16711680) * class252.field3595 & -16777216;
                            int var476 = (var474 & 65280) * class252.field3596 & 16711680;
                            int var477 = (var474 & 255) * class252.field3607 & 65280;
                            var3[var470] = (var475 | var476 | var477) >>> 8;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var478 = this.field3103[var469];
                            int var479 = (var478 & 16711935) * class252.field3609 & -16711936;
                            int var480 = (var478 & 65280) * class252.field3609 & 16711680;
                            var3[var470] = ((var479 | var480) >>> 8) + class252.field3598;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 0) {
                            int var481 = this.field3103[var469];
                            int var482 = var481 >>> 24;
                            int var483 = 256 - var482;
                            int var484 = var3[var470];
                            var3[var470] = ((var481 & 16711935) * var482 + (var484 & 16711935) * var483 & -16711936) + ((var481 & 65280) * var482 + (var484 & 65280) * var483 & 16711680) >> 8;
                        } else if (arg0 == 1) {
                            int var485 = this.field3103[var469];
                            int var486 = (var485 >>> 24) * class252.field3609 >> 8;
                            int var487 = 256 - var486;
                            if ((class252.field3610 & 16777215) == 16777215) {
                                int var488 = var3[var470];
                                var3[var470] = ((var485 & 16711935) * var486 + (var488 & 16711935) * var487 & -16711936) + ((var485 & 65280) * var486 + (var488 & 65280) * var487 & 16711680) >> 8;
                            } else if (class252.field3609 != 255) {
                                int var489 = (var485 & 16711680) * class252.field3595 & -16777216;
                                int var490 = (var485 & 65280) * class252.field3596 & 16711680;
                                int var491 = (var485 & 255) * class252.field3607 & 65280;
                                int var492 = (var489 | var490 | var491) >>> 8;
                                int var493 = var3[var470];
                                var3[var470] = ((var492 & 16711935) * var486 + (var493 & 16711935) * var487 & -16711936) + ((var492 & 65280) * var486 + (var493 & 65280) * var487 & 16711680) >> 8;
                            } else {
                                int var494 = (var485 & 16711680) * class252.field3595 & -16777216;
                                int var495 = (var485 & 65280) * class252.field3596 & 16711680;
                                int var496 = (var485 & 255) * class252.field3607 & 65280;
                                var3[var470] = (var494 | var495 | var496) >>> 8;
                            }
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var497 = this.field3103[var469];
                            int var498 = var497 >>> 24;
                            int var499 = 256 - var498;
                            int var500 = (var497 & 16711935) * class252.field3609 & -16711936;
                            int var501 = (var497 & 65280) * class252.field3609 & 16711680;
                            int var502 = ((var500 | var501) >>> 8) + class252.field3598;
                            int var503 = var3[var470];
                            var3[var470] = ((var502 & 16711935) * var498 + (var503 & 16711935) * var499 & -16711936) + ((var502 & 65280) * var498 + (var503 & 65280) * var499 & 16711680) >> 8;
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 0) {
                            int var504 = this.field3103[var469];
                            int var505 = var3[var470];
                            int var506 = var504 + var505;
                            int var507 = (var504 & 16711935) + (var505 & 16711935);
                            int var508 = (var506 - var507 & 65536) + (var507 & 16777472);
                            var3[var470] = var506 - var508 | var508 - (var508 >>> 8);
                        } else if (arg0 == 1) {
                            int var509 = this.field3103[var469];
                            int var510 = (var509 & 16711680) * class252.field3595 & -16777216;
                            int var511 = (var509 & 65280) * class252.field3596 & 16711680;
                            int var512 = (var509 & 255) * class252.field3607 & 65280;
                            int var513 = (var510 | var511 | var512) >>> 8;
                            int var514 = var3[var470];
                            int var515 = var513 + var514;
                            int var516 = (var513 & 16711935) + (var514 & 16711935);
                            int var517 = (var515 - var516 & 65536) + (var516 & 16777472);
                            var3[var470] = var515 - var517 | var517 - (var517 >>> 8);
                        } else if (arg0 == 2) {
                            int var518 = this.field3103[var469];
                            int var519 = (var518 & 16711935) * class252.field3609 & -16711936;
                            int var520 = (var518 & 65280) * class252.field3609 & 16711680;
                            int var521 = ((var519 | var520) >>> 8) + class252.field3598;
                            int var522 = var3[var470];
                            int var523 = var521 + var522;
                            int var524 = (var521 & 16711935) + (var522 & 16711935);
                            int var525 = (var523 - var524 & 65536) + (var524 & 16777472);
                            var3[var470] = var523 - var525 | var525 - (var525 >>> 8);
                        }
                    }
                    var461 += class252.field3604;
                    var462 += class252.field3597;
                    ++var463;
                }
                class252.field3592 += class252.field3585;
                class252.field3581 += class252.field3587;
                class252.field3594 += class252.field3612;
            }
        } else {
            for (int var526 = class252.field3588; var526 < 0; ++var526) {
                int var527 = class252.field3594;
                int var528 = class252.field3611 + class252.field3592;
                int var529 = class252.field3593 + class252.field3581;
                int var530 = class252.field3586;
                if (var528 < 0) {
                    int var531 = (class252.field3604 - 1 - var528) / class252.field3604;
                    var530 += var531;
                    var528 += class252.field3604 * var531;
                    var529 += class252.field3597 * var531;
                    var527 += var531;
                }
                int var532;
                if ((var532 = (var528 + 1 - (super.field3599 << 12) - class252.field3604) / class252.field3604) > var530) {
                    var530 = var532;
                }
                if (var529 < 0) {
                    int var533 = (class252.field3597 - 1 - var529) / class252.field3597;
                    var530 += var533;
                    var528 += class252.field3604 * var533;
                    var529 += class252.field3597 * var533;
                    var527 += var533;
                }
                int var534;
                if ((var534 = (var529 + 1 - (super.field3583 << 12) - class252.field3597) / class252.field3597) > var530) {
                    var530 = var534;
                }
                while (var530 < 0) {
                    int var535 = (var528 >> 12) + (var529 >> 12) * super.field3599;
                    int var536 = var527++;
                    if (arg1 == 0) {
                        if (arg0 == 0) {
                            var3[var536] = this.field3103[var535];
                        } else if (arg0 == 1) {
                            int var540 = this.field3103[var535++];
                            int var541 = (var540 & 16711680) * class252.field3595 & -16777216;
                            int var542 = (var540 & 65280) * class252.field3596 & 16711680;
                            int var543 = (var540 & 255) * class252.field3607 & 65280;
                            var3[var536] = (var541 | var542 | var543) >>> 8;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var544 = this.field3103[var535];
                            int var545 = (var544 & 16711935) * class252.field3609 & -16711936;
                            int var546 = (var544 & 65280) * class252.field3609 & 16711680;
                            var3[var536] = ((var545 | var546) >>> 8) + class252.field3598;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 0) {
                            int var547 = this.field3103[var535];
                            int var548 = var547 >>> 24;
                            int var549 = 256 - var548;
                            int var550 = var3[var536];
                            var3[var536] = ((var547 & 16711935) * var548 + (var550 & 16711935) * var549 & -16711936) + ((var547 & 65280) * var548 + (var550 & 65280) * var549 & 16711680) >> 8;
                        } else if (arg0 == 1) {
                            int var551 = this.field3103[var535];
                            int var552 = (var551 >>> 24) * class252.field3609 >> 8;
                            int var553 = 256 - var552;
                            if ((class252.field3610 & 16777215) == 16777215) {
                                int var554 = var3[var536];
                                var3[var536] = ((var551 & 16711935) * var552 + (var554 & 16711935) * var553 & -16711936) + ((var551 & 65280) * var552 + (var554 & 65280) * var553 & 16711680) >> 8;
                            } else if (class252.field3609 != 255) {
                                int var555 = (var551 & 16711680) * class252.field3595 & -16777216;
                                int var556 = (var551 & 65280) * class252.field3596 & 16711680;
                                int var557 = (var551 & 255) * class252.field3607 & 65280;
                                int var558 = (var555 | var556 | var557) >>> 8;
                                int var559 = var3[var536];
                                var3[var536] = ((var558 & 16711935) * var552 + (var559 & 16711935) * var553 & -16711936) + ((var558 & 65280) * var552 + (var559 & 65280) * var553 & 16711680) >> 8;
                            } else {
                                int var560 = (var551 & 16711680) * class252.field3595 & -16777216;
                                int var561 = (var551 & 65280) * class252.field3596 & 16711680;
                                int var562 = (var551 & 255) * class252.field3607 & 65280;
                                var3[var536] = (var560 | var561 | var562) >>> 8;
                            }
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var563 = this.field3103[var535];
                            int var564 = var563 >>> 24;
                            int var565 = 256 - var564;
                            int var566 = (var563 & 16711935) * class252.field3609 & -16711936;
                            int var567 = (var563 & 65280) * class252.field3609 & 16711680;
                            int var568 = ((var566 | var567) >>> 8) + class252.field3598;
                            int var569 = var3[var536];
                            var3[var536] = ((var568 & 16711935) * var564 + (var569 & 16711935) * var565 & -16711936) + ((var568 & 65280) * var564 + (var569 & 65280) * var565 & 16711680) >> 8;
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 0) {
                            int var570 = this.field3103[var535];
                            int var571 = var3[var536];
                            int var572 = var570 + var571;
                            int var573 = (var570 & 16711935) + (var571 & 16711935);
                            int var574 = (var572 - var573 & 65536) + (var573 & 16777472);
                            var3[var536] = var572 - var574 | var574 - (var574 >>> 8);
                        } else if (arg0 == 1) {
                            int var575 = this.field3103[var535];
                            int var576 = (var575 & 16711680) * class252.field3595 & -16777216;
                            int var577 = (var575 & 65280) * class252.field3596 & 16711680;
                            int var578 = (var575 & 255) * class252.field3607 & 65280;
                            int var579 = (var576 | var577 | var578) >>> 8;
                            int var580 = var3[var536];
                            int var581 = var579 + var580;
                            int var582 = (var579 & 16711935) + (var580 & 16711935);
                            int var583 = (var581 - var582 & 65536) + (var582 & 16777472);
                            var3[var536] = var581 - var583 | var583 - (var583 >>> 8);
                        } else if (arg0 == 2) {
                            int var584 = this.field3103[var535];
                            int var585 = (var584 & 16711935) * class252.field3609 & -16711936;
                            int var586 = (var584 & 65280) * class252.field3609 & 16711680;
                            int var587 = ((var585 | var586) >>> 8) + class252.field3598;
                            int var588 = var3[var536];
                            int var589 = var587 + var588;
                            int var590 = (var587 & 16711935) + (var588 & 16711935);
                            int var591 = (var589 - var590 & 65536) + (var590 & 16777472);
                            var3[var536] = var589 - var591 | var591 - (var591 >>> 8);
                        }
                    }
                    var528 += class252.field3604;
                    var529 += class252.field3597;
                    ++var530;
                }
                class252.field3592 += class252.field3585;
                class252.field3581 += class252.field3587;
                class252.field3594 += class252.field3612;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
    public final void method764(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int[] var4 = super.field3608.field1301;
            for (int var5 = 0; var5 < super.field3583; ++var5) {
                int var6 = super.field3599 * var5;
                int var7 = (arg1 + var5) * super.field3608.field1328 + arg0;
                for (int var8 = 0; var8 < super.field3599; ++var8) {
                    this.field3103[var6 + var8] = this.field3103[var6 + var8] & 16777215 | var4[var7 + var8] << 8 & -16777216;
                }
            }
        } else if (arg2 == 1) {
            int[] var9 = super.field3608.field1301;
            for (int var10 = 0; var10 < super.field3583; ++var10) {
                int var11 = super.field3599 * var10;
                int var12 = (arg1 + var10) * super.field3608.field1328 + arg0;
                for (int var13 = 0; var13 < super.field3599; ++var13) {
                    this.field3103[var11 + var13] = this.field3103[var11 + var13] & 16777215 | var9[var12 + var13] << 16 & -16777216;
                }
            }
        } else if (arg2 == 2) {
            int[] var14 = super.field3608.field1301;
            for (int var15 = 0; var15 < super.field3583; ++var15) {
                int var16 = super.field3599 * var15;
                int var17 = (arg1 + var15) * super.field3608.field1328 + arg0;
                for (int var18 = 0; var18 < super.field3599; ++var18) {
                    this.field3103[var16 + var18] = this.field3103[var16 + var18] & 16777215 | var14[var17 + var18] << 24 & -16777216;
                }
            }
        } else {
            if (arg2 == 3) {
                int[] var19 = super.field3608.field1301;
                for (int var20 = 0; var20 < super.field3583; ++var20) {
                    int var21 = super.field3599 * var20;
                    int var22 = (arg1 + var20) * super.field3608.field1328 + arg0;
                    for (int var23 = 0; var23 < super.field3599; ++var23) {
                        this.field3103[var21 + var23] = this.field3103[var21 + var23] & 16777215 | (var19[var22 + var23] != 0 ? -16777216 : 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([I[III)V")
    public final void method1486(int[] arg0, int[] arg1, int arg2, int arg3) {
        int[] var5 = super.field3608.field1301;
        if (class252.field3604 == 0) {
            if (class252.field3597 == 0) {
                int var6 = class252.field3588;
                while (var6 < 0) {
                    int var7 = arg3 + var6;
                    if (var7 >= 0) {
                        if (var7 >= arg0.length) {
                            return;
                        }
                        int var8 = class252.field3594;
                        int var9 = class252.field3592;
                        int var10 = class252.field3581;
                        int var11 = class252.field3586;
                        if (var9 >= 0 && var10 >= 0 && var9 - (super.field3599 << 12) < 0 && var10 - (super.field3583 << 12) < 0) {
                            int var12 = arg0[var7] - arg2;
                            int var13 = -arg1[var7];
                            int var14 = var12 - (var8 - class252.field3594);
                            if (var14 > 0) {
                                var8 += var14;
                                var11 += var14;
                                var9 += class252.field3604 * var14;
                                var10 += class252.field3597 * var14;
                            } else {
                                var13 -= var14;
                            }
                            if (var11 < var13) {
                                var11 = var13;
                            }
                            while (var11 < 0) {
                                int var15 = this.field3103[(var9 >> 12) + (var10 >> 12) * super.field3599];
                                int var16 = var15 >>> 24;
                                int var17 = 256 - var16;
                                int var18 = var5[var8];
                                var5[var8++] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                ++var11;
                            }
                        }
                    }
                    ++var6;
                    class252.field3594 += class252.field3612;
                }
            } else if (class252.field3597 < 0) {
                int var19 = class252.field3588;
                while (var19 < 0) {
                    int var20 = arg3 + var19;
                    if (var20 >= 0) {
                        if (var20 >= arg0.length) {
                            return;
                        }
                        int var21 = class252.field3594;
                        int var22 = class252.field3592;
                        int var23 = class252.field3593 + class252.field3581;
                        int var24 = class252.field3586;
                        if (var22 >= 0 && var22 - (super.field3599 << 12) < 0) {
                            int var25;
                            if ((var25 = var23 - (super.field3583 << 12)) >= 0) {
                                int var26 = (class252.field3597 - var25) / class252.field3597;
                                var24 += var26;
                                var23 += class252.field3597 * var26;
                                var21 += var26;
                            }
                            int var27;
                            if ((var27 = (var23 - class252.field3597) / class252.field3597) > var24) {
                                var24 = var27;
                            }
                            int var28 = arg0[var20] - arg2;
                            int var29 = -arg1[var20];
                            int var30 = var28 - (var21 - class252.field3594);
                            if (var30 > 0) {
                                var21 += var30;
                                var24 += var30;
                                var22 += class252.field3604 * var30;
                                var23 += class252.field3597 * var30;
                            } else {
                                var29 -= var30;
                            }
                            if (var24 < var29) {
                                var24 = var29;
                            }
                            while (var24 < 0) {
                                int var31 = this.field3103[(var22 >> 12) + (var23 >> 12) * super.field3599];
                                int var32 = var31 >>> 24;
                                int var33 = 256 - var32;
                                int var34 = var5[var21];
                                var5[var21++] = ((var31 & 16711935) * var32 + (var34 & 16711935) * var33 & -16711936) + ((var31 & 65280) * var32 + (var34 & 65280) * var33 & 16711680) >> 8;
                                var23 += class252.field3597;
                                ++var24;
                            }
                        }
                    }
                    ++var19;
                    class252.field3592 += class252.field3585;
                    class252.field3594 += class252.field3612;
                }
            } else {
                int var35 = class252.field3588;
                while (var35 < 0) {
                    int var36 = arg3 + var35;
                    if (var36 >= 0) {
                        if (var36 >= arg0.length) {
                            return;
                        }
                        int var37 = class252.field3594;
                        int var38 = class252.field3592;
                        int var39 = class252.field3593 + class252.field3581;
                        int var40 = class252.field3586;
                        if (var38 >= 0 && var38 - (super.field3599 << 12) < 0) {
                            if (var39 < 0) {
                                int var41 = (class252.field3597 - 1 - var39) / class252.field3597;
                                var40 += var41;
                                var39 += class252.field3597 * var41;
                                var37 += var41;
                            }
                            int var42;
                            if ((var42 = (var39 + 1 - (super.field3583 << 12) - class252.field3597) / class252.field3597) > var40) {
                                var40 = var42;
                            }
                            int var43 = arg0[var36] - arg2;
                            int var44 = -arg1[var36];
                            int var45 = var43 - (var37 - class252.field3594);
                            if (var45 > 0) {
                                var37 += var45;
                                var40 += var45;
                                var38 += class252.field3604 * var45;
                                var39 += class252.field3597 * var45;
                            } else {
                                var44 -= var45;
                            }
                            if (var40 < var44) {
                                var40 = var44;
                            }
                            while (var40 < 0) {
                                int var46 = this.field3103[(var38 >> 12) + (var39 >> 12) * super.field3599];
                                int var47 = var46 >>> 24;
                                int var48 = 256 - var47;
                                int var49 = var5[var37];
                                var5[var37++] = ((var46 & 16711935) * var47 + (var49 & 16711935) * var48 & -16711936) + ((var46 & 65280) * var47 + (var49 & 65280) * var48 & 16711680) >> 8;
                                var39 += class252.field3597;
                                ++var40;
                            }
                        }
                    }
                    ++var35;
                    class252.field3592 += class252.field3585;
                    class252.field3594 += class252.field3612;
                }
            }
        } else if (class252.field3604 < 0) {
            if (class252.field3597 == 0) {
                int var50 = class252.field3588;
                while (var50 < 0) {
                    int var51 = arg3 + var50;
                    if (var51 >= 0) {
                        if (var51 >= arg0.length) {
                            return;
                        }
                        int var52 = class252.field3594;
                        int var53 = class252.field3611 + class252.field3592;
                        int var54 = class252.field3581;
                        int var55 = class252.field3586;
                        if (var54 >= 0 && var54 - (super.field3583 << 12) < 0) {
                            int var56;
                            if ((var56 = var53 - (super.field3599 << 12)) >= 0) {
                                int var57 = (class252.field3604 - var56) / class252.field3604;
                                var55 += var57;
                                var53 += class252.field3604 * var57;
                                var52 += var57;
                            }
                            int var58;
                            if ((var58 = (var53 - class252.field3604) / class252.field3604) > var55) {
                                var55 = var58;
                            }
                            int var59 = arg0[var51] - arg2;
                            int var60 = -arg1[var51];
                            int var61 = var59 - (var52 - class252.field3594);
                            if (var61 > 0) {
                                var52 += var61;
                                var55 += var61;
                                var53 += class252.field3604 * var61;
                                var54 += class252.field3597 * var61;
                            } else {
                                var60 -= var61;
                            }
                            if (var55 < var60) {
                                var55 = var60;
                            }
                            while (var55 < 0) {
                                int var62 = this.field3103[(var53 >> 12) + (var54 >> 12) * super.field3599];
                                int var63 = var62 >>> 24;
                                int var64 = 256 - var63;
                                int var65 = var5[var52];
                                var5[var52++] = ((var62 & 16711935) * var63 + (var65 & 16711935) * var64 & -16711936) + ((var62 & 65280) * var63 + (var65 & 65280) * var64 & 16711680) >> 8;
                                var53 += class252.field3604;
                                ++var55;
                            }
                        }
                    }
                    ++var50;
                    class252.field3581 += class252.field3587;
                    class252.field3594 += class252.field3612;
                }
            } else if (class252.field3597 < 0) {
                int var66 = class252.field3588;
                while (var66 < 0) {
                    int var67 = arg3 + var66;
                    if (var67 >= 0) {
                        if (var67 >= arg0.length) {
                            return;
                        }
                        int var68 = class252.field3594;
                        int var69 = class252.field3611 + class252.field3592;
                        int var70 = class252.field3593 + class252.field3581;
                        int var71 = class252.field3586;
                        int var72;
                        if ((var72 = var69 - (super.field3599 << 12)) >= 0) {
                            int var73 = (class252.field3604 - var72) / class252.field3604;
                            var71 += var73;
                            var69 += class252.field3604 * var73;
                            var70 += class252.field3597 * var73;
                            var68 += var73;
                        }
                        int var74;
                        if ((var74 = (var69 - class252.field3604) / class252.field3604) > var71) {
                            var71 = var74;
                        }
                        int var75;
                        if ((var75 = var70 - (super.field3583 << 12)) >= 0) {
                            int var76 = (class252.field3597 - var75) / class252.field3597;
                            var71 += var76;
                            var69 += class252.field3604 * var76;
                            var70 += class252.field3597 * var76;
                            var68 += var76;
                        }
                        int var77;
                        if ((var77 = (var70 - class252.field3597) / class252.field3597) > var71) {
                            var71 = var77;
                        }
                        int var78 = arg0[var67] - arg2;
                        int var79 = -arg1[var67];
                        int var80 = var78 - (var68 - class252.field3594);
                        if (var80 > 0) {
                            var68 += var80;
                            var71 += var80;
                            var69 += class252.field3604 * var80;
                            var70 += class252.field3597 * var80;
                        } else {
                            var79 -= var80;
                        }
                        if (var71 < var79) {
                            var71 = var79;
                        }
                        while (var71 < 0) {
                            int var81 = this.field3103[(var69 >> 12) + (var70 >> 12) * super.field3599];
                            int var82 = var81 >>> 24;
                            int var83 = 256 - var82;
                            int var84 = var5[var68];
                            var5[var68++] = ((var81 & 16711935) * var82 + (var84 & 16711935) * var83 & -16711936) + ((var81 & 65280) * var82 + (var84 & 65280) * var83 & 16711680) >> 8;
                            var69 += class252.field3604;
                            var70 += class252.field3597;
                            ++var71;
                        }
                    }
                    ++var66;
                    class252.field3592 += class252.field3585;
                    class252.field3581 += class252.field3587;
                    class252.field3594 += class252.field3612;
                }
            } else {
                int var85 = class252.field3588;
                while (var85 < 0) {
                    int var86 = arg3 + var85;
                    if (var86 >= 0) {
                        if (var86 >= arg0.length) {
                            return;
                        }
                        int var87 = class252.field3594;
                        int var88 = class252.field3611 + class252.field3592;
                        int var89 = class252.field3593 + class252.field3581;
                        int var90 = class252.field3586;
                        int var91;
                        if ((var91 = var88 - (super.field3599 << 12)) >= 0) {
                            int var92 = (class252.field3604 - var91) / class252.field3604;
                            var90 += var92;
                            var88 += class252.field3604 * var92;
                            var89 += class252.field3597 * var92;
                            var87 += var92;
                        }
                        int var93;
                        if ((var93 = (var88 - class252.field3604) / class252.field3604) > var90) {
                            var90 = var93;
                        }
                        if (var89 < 0) {
                            int var94 = (class252.field3597 - 1 - var89) / class252.field3597;
                            var90 += var94;
                            var88 += class252.field3604 * var94;
                            var89 += class252.field3597 * var94;
                            var87 += var94;
                        }
                        int var95;
                        if ((var95 = (var89 + 1 - (super.field3583 << 12) - class252.field3597) / class252.field3597) > var90) {
                            var90 = var95;
                        }
                        int var96 = arg0[var86] - arg2;
                        int var97 = -arg1[var86];
                        int var98 = var96 - (var87 - class252.field3594);
                        if (var98 > 0) {
                            var87 += var98;
                            var90 += var98;
                            var88 += class252.field3604 * var98;
                            var89 += class252.field3597 * var98;
                        } else {
                            var97 -= var98;
                        }
                        if (var90 < var97) {
                            var90 = var97;
                        }
                        while (var90 < 0) {
                            int var99 = this.field3103[(var88 >> 12) + (var89 >> 12) * super.field3599];
                            int var100 = var99 >>> 24;
                            int var101 = 256 - var100;
                            int var102 = var5[var87];
                            var5[var87++] = ((var99 & 16711935) * var100 + (var102 & 16711935) * var101 & -16711936) + ((var99 & 65280) * var100 + (var102 & 65280) * var101 & 16711680) >> 8;
                            var88 += class252.field3604;
                            var89 += class252.field3597;
                            ++var90;
                        }
                    }
                    ++var85;
                    class252.field3592 += class252.field3585;
                    class252.field3581 += class252.field3587;
                    class252.field3594 += class252.field3612;
                }
            }
        } else if (class252.field3597 == 0) {
            int var103 = class252.field3588;
            while (var103 < 0) {
                int var104 = arg3 + var103;
                if (var104 >= 0) {
                    if (var104 >= arg0.length) {
                        return;
                    }
                    int var105 = class252.field3594;
                    int var106 = class252.field3611 + class252.field3592;
                    int var107 = class252.field3581;
                    int var108 = class252.field3586;
                    if (var107 >= 0 && var107 - (super.field3583 << 12) < 0) {
                        if (var106 < 0) {
                            int var109 = (class252.field3604 - 1 - var106) / class252.field3604;
                            var108 += var109;
                            var106 += class252.field3604 * var109;
                            var105 += var109;
                        }
                        int var110;
                        if ((var110 = (var106 + 1 - (super.field3599 << 12) - class252.field3604) / class252.field3604) > var108) {
                            var108 = var110;
                        }
                        int var111 = arg0[var104] - arg2;
                        int var112 = -arg1[var104];
                        int var113 = var111 - (var105 - class252.field3594);
                        if (var113 > 0) {
                            var105 += var113;
                            var108 += var113;
                            var106 += class252.field3604 * var113;
                            var107 += class252.field3597 * var113;
                        } else {
                            var112 -= var113;
                        }
                        if (var108 < var112) {
                            var108 = var112;
                        }
                        while (var108 < 0) {
                            int var114 = this.field3103[(var106 >> 12) + (var107 >> 12) * super.field3599];
                            int var115 = var114 >>> 24;
                            int var116 = 256 - var115;
                            int var117 = var5[var105];
                            var5[var105++] = ((var114 & 16711935) * var115 + (var117 & 16711935) * var116 & -16711936) + ((var114 & 65280) * var115 + (var117 & 65280) * var116 & 16711680) >> 8;
                            var106 += class252.field3604;
                            ++var108;
                        }
                    }
                }
                ++var103;
                class252.field3592 += class252.field3585;
                class252.field3581 += class252.field3587;
                class252.field3594 += class252.field3612;
            }
        } else if (class252.field3597 < 0) {
            int var118 = class252.field3588;
            while (var118 < 0) {
                int var119 = arg3 + var118;
                if (var119 >= 0) {
                    if (var119 >= arg0.length) {
                        return;
                    }
                    int var120 = class252.field3594;
                    int var121 = class252.field3611 + class252.field3592;
                    int var122 = class252.field3593 + class252.field3581;
                    int var123 = class252.field3586;
                    if (var121 < 0) {
                        int var124 = (class252.field3604 - 1 - var121) / class252.field3604;
                        var123 += var124;
                        var121 += class252.field3604 * var124;
                        var122 += class252.field3597 * var124;
                        var120 += var124;
                    }
                    int var125;
                    if ((var125 = (var121 + 1 - (super.field3599 << 12) - class252.field3604) / class252.field3604) > var123) {
                        var123 = var125;
                    }
                    int var126;
                    if ((var126 = var122 - (super.field3583 << 12)) >= 0) {
                        int var127 = (class252.field3597 - var126) / class252.field3597;
                        var123 += var127;
                        var121 += class252.field3604 * var127;
                        var122 += class252.field3597 * var127;
                        var120 += var127;
                    }
                    int var128;
                    if ((var128 = (var122 - class252.field3597) / class252.field3597) > var123) {
                        var123 = var128;
                    }
                    int var129 = arg0[var119] - arg2;
                    int var130 = -arg1[var119];
                    int var131 = var129 - (var120 - class252.field3594);
                    if (var131 > 0) {
                        var120 += var131;
                        var123 += var131;
                        var121 += class252.field3604 * var131;
                        var122 += class252.field3597 * var131;
                    } else {
                        var130 -= var131;
                    }
                    if (var123 < var130) {
                        var123 = var130;
                    }
                    while (var123 < 0) {
                        int var132 = this.field3103[(var121 >> 12) + (var122 >> 12) * super.field3599];
                        int var133 = var132 >>> 24;
                        int var134 = 256 - var133;
                        int var135 = var5[var120];
                        var5[var120++] = ((var132 & 16711935) * var133 + (var135 & 16711935) * var134 & -16711936) + ((var132 & 65280) * var133 + (var135 & 65280) * var134 & 16711680) >> 8;
                        var121 += class252.field3604;
                        var122 += class252.field3597;
                        ++var123;
                    }
                }
                ++var118;
                class252.field3592 += class252.field3585;
                class252.field3581 += class252.field3587;
                class252.field3594 += class252.field3612;
            }
        } else {
            int var136 = class252.field3588;
            while (var136 < 0) {
                int var137 = arg3 + var136;
                if (var137 >= 0) {
                    if (var137 >= arg0.length) {
                        return;
                    }
                    int var138 = class252.field3594;
                    int var139 = class252.field3611 + class252.field3592;
                    int var140 = class252.field3593 + class252.field3581;
                    int var141 = class252.field3586;
                    if (var139 < 0) {
                        int var142 = (class252.field3604 - 1 - var139) / class252.field3604;
                        var141 += var142;
                        var139 += class252.field3604 * var142;
                        var140 += class252.field3597 * var142;
                        var138 += var142;
                    }
                    int var143;
                    if ((var143 = (var139 + 1 - (super.field3599 << 12) - class252.field3604) / class252.field3604) > var141) {
                        var141 = var143;
                    }
                    if (var140 < 0) {
                        int var144 = (class252.field3597 - 1 - var140) / class252.field3597;
                        var141 += var144;
                        var139 += class252.field3604 * var144;
                        var140 += class252.field3597 * var144;
                        var138 += var144;
                    }
                    int var145;
                    if ((var145 = (var140 + 1 - (super.field3583 << 12) - class252.field3597) / class252.field3597) > var141) {
                        var141 = var145;
                    }
                    int var146 = arg0[var137] - arg2;
                    int var147 = -arg1[var137];
                    int var148 = var146 - (var138 - class252.field3594);
                    if (var148 > 0) {
                        var138 += var148;
                        var141 += var148;
                        var139 += class252.field3604 * var148;
                        var140 += class252.field3597 * var148;
                    } else {
                        var147 -= var148;
                    }
                    if (var141 < var147) {
                        var141 = var147;
                    }
                    while (var141 < 0) {
                        int var149 = this.field3103[(var139 >> 12) + (var140 >> 12) * super.field3599];
                        int var150 = var149 >>> 24;
                        int var151 = 256 - var150;
                        int var152 = var5[var138];
                        var5[var138++] = ((var149 & 16711935) * var150 + (var152 & 16711935) * var151 & -16711936) + ((var149 & 65280) * var150 + (var152 & 65280) * var151 & 16711680) >> 8;
                        var139 += class252.field3604;
                        var140 += class252.field3597;
                        ++var141;
                    }
                }
                ++var136;
                class252.field3592 += class252.field3585;
                class252.field3581 += class252.field3587;
                class252.field3594 += class252.field3612;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIII)V")
    public final void method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int[] var7 = super.field3608.field1301;
        for (int var8 = 0; var8 < arg3; ++var8) {
            int var9 = (arg1 + var8) * arg2 + arg0;
            int var10 = (arg5 + var8) * arg2 + arg4;
            for (int var11 = 0; var11 < arg2; ++var11) {
                this.field3103[var9 + var11] = var7[var10 + var11] & 16777215;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILhb;II)V")
    public final void method755(int arg0, int arg1, class433 arg2, int arg3, int arg4) {
        if (super.field3608.method592()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field3606 + arg0;
            int var7 = super.field3580 + arg1;
            int var8 = 0;
            int var9 = super.field3608.field1328;
            int var10 = super.field3599;
            int var11 = super.field3583;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var7 * var9 + var6;
            if (var7 < super.field3608.field1323) {
                int var15 = super.field3608.field1323 - var7;
                var11 -= var15;
                var7 = super.field3608.field1323;
                var8 += var10 * var15;
                var14 += var9 * var15;
            }
            if (var7 + var11 > super.field3608.field1314) {
                var11 -= var7 + var11 - super.field3608.field1314;
            }
            if (var6 < super.field3608.field1299) {
                int var16 = super.field3608.field1299 - var6;
                var10 -= var16;
                var6 = super.field3608.field1299;
                var8 += var16;
                var14 += var16;
                var13 += var16;
                var12 += var16;
            }
            if (var6 + var10 > super.field3608.field1294) {
                int var17 = var6 + var10 - super.field3608.field1294;
                var10 -= var17;
                var13 += var17;
                var12 += var17;
            }
            if (var10 > 0 && var11 > 0) {
                class154 var18 = (class154) arg2;
                int[] var19 = var18.field1899;
                int[] var20 = var18.field1902;
                int[] var21 = super.field3608.field1301;
                int var22 = var7;
                if (arg4 > var7) {
                    var22 = arg4;
                    var14 += (arg4 - var7) * var9;
                    var8 += (arg4 - var7) * super.field3599;
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
                        int var32 = this.field3103[var8++];
                        int var33 = var32 >>> 24;
                        int var34 = 256 - var33;
                        int var35 = var21[var14];
                        var21[var14++] = ((var32 & 16711935) * var33 + (var35 & 16711935) * var34 & -16711936) + ((var32 & 65280) * var33 + (var35 & 65280) * var34 & 16711680) >> 8;
                    }
                    var8 += var13 + var30;
                    var14 += var12 + var30;
                }
            }
        }
    }
}
