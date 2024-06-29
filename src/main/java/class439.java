import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class439 extends class94 {

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "[B")
    private byte[] field6145;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "[I")
    private int[] field6144;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IILta;II)V")
    public final void method148(int arg0, int arg1, class145 arg2, int arg3, int arg4) {
        if (super.field1210.method296()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field1216 + arg0;
            int var7 = super.field1209 + arg1;
            int var8 = 0;
            int var9 = super.field1210.field597;
            int var10 = super.field1211;
            int var11 = super.field1198;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var7 * var9 + var6;
            if (var7 < super.field1210.field605) {
                int var15 = super.field1210.field605 - var7;
                var11 -= var15;
                var7 = super.field1210.field605;
                var8 += var10 * var15;
                var14 += var9 * var15;
            }
            if (var7 + var11 > super.field1210.field596) {
                var11 -= var7 + var11 - super.field1210.field596;
            }
            if (var6 < super.field1210.field587) {
                int var16 = super.field1210.field587 - var6;
                var10 -= var16;
                var6 = super.field1210.field587;
                var8 += var16;
                var14 += var16;
                var13 += var16;
                var12 += var16;
            }
            if (var6 + var10 > super.field1210.field573) {
                int var17 = var6 + var10 - super.field1210.field573;
                var10 -= var17;
                var13 += var17;
                var12 += var17;
            }
            if (var10 > 0 && var11 > 0) {
                class138 var18 = (class138) arg2;
                int[] var19 = var18.field1811;
                int[] var20 = var18.field1812;
                int[] var21 = super.field1210.field594;
                int var22 = var7;
                if (arg4 > var7) {
                    var22 = arg4;
                    var14 += (arg4 - var7) * var9;
                    var8 += (arg4 - var7) * super.field1211;
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
                        byte var32 = this.field6145[var8++];
                        if (var32 != 0) {
                            var21[var14++] = this.field6144[var32 & 255];
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

    @OriginalMember(owner = "client!iq", name = "W", descriptor = "(IIIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (super.field1210.method296()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field1210.field597;
            int var7 = super.field1216 + arg0;
            int var8 = super.field1209 + arg1;
            int var9 = var6 * var8 + var7;
            int var10 = 0;
            int var11 = super.field1198;
            int var12 = super.field1211;
            int var13 = var6 - var12;
            int var14 = 0;
            if (var8 < super.field1210.field605) {
                int var15 = super.field1210.field605 - var8;
                var11 -= var15;
                var8 = super.field1210.field605;
                var10 += var12 * var15;
                var9 += var6 * var15;
            }
            if (var8 + var11 > super.field1210.field596) {
                var11 -= var8 + var11 - super.field1210.field596;
            }
            if (var7 < super.field1210.field587) {
                int var16 = super.field1210.field587 - var7;
                var12 -= var16;
                var7 = super.field1210.field587;
                var10 += var16;
                var9 += var16;
                var14 += var16;
                var13 += var16;
            }
            if (var7 + var12 > super.field1210.field573) {
                int var17 = var7 + var12 - super.field1210.field573;
                var12 -= var17;
                var14 += var17;
                var13 += var17;
            }
            if (var12 > 0 && var11 > 0) {
                int[] var18 = super.field1210.field594;
                if (arg4 == 0) {
                    if (arg2 == 1) {
                        for (int var19 = -var11; var19 < 0; ++var19) {
                            int var20 = var9 + var12 - 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field6144[this.field6145[var10++] & 255];
                                var18[var9++] = this.field6144[this.field6145[var10++] & 255];
                                var18[var9++] = this.field6144[this.field6145[var10++] & 255];
                                var18[var9++] = this.field6144[this.field6145[var10++] & 255];
                            }
                            var20 += 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field6144[this.field6145[var10++] & 255];
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 == 0) {
                        int var21 = (arg3 & 16711680) >> 16;
                        int var22 = (arg3 & 65280) >> 8;
                        int var23 = arg3 & 255;
                        for (int var24 = -var11; var24 < 0; ++var24) {
                            for (int var25 = -var12; var25 < 0; ++var25) {
                                int var26 = this.field6144[this.field6145[var10++] & 255];
                                int var27 = (var26 & 16711680) * var21 & -16777216;
                                int var28 = (var26 & 65280) * var22 & 16711680;
                                int var29 = (var26 & 255) * var23 & 65280;
                                var18[var9++] = (var27 | var28 | var29) >>> 8;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 == 3) {
                        for (int var30 = -var11; var30 < 0; ++var30) {
                            for (int var31 = -var12; var31 < 0; ++var31) {
                                int var32 = this.field6144[this.field6145[var10++] & 255];
                                int var33 = arg3 + var32;
                                int var34 = (arg3 & 16711935) + (var32 & 16711935);
                                int var35 = (var33 - var34 & 65536) + (var34 & 16777472);
                                var18[var9++] = var33 - var35 | var35 - (var35 >>> 8);
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var36 = arg3 >>> 24;
                        int var37 = 256 - var36;
                        int var38 = (arg3 & 16711935) * var37 & -16711936;
                        int var39 = (arg3 & 65280) * var37 & 16711680;
                        int var40 = (var38 | var39) >>> 8;
                        for (int var41 = -var11; var41 < 0; ++var41) {
                            for (int var42 = -var12; var42 < 0; ++var42) {
                                int var43 = this.field6144[this.field6145[var10++] & 255];
                                int var44 = (var43 & 16711935) * var36 & -16711936;
                                int var45 = (var43 & 65280) * var36 & 16711680;
                                var18[var9++] = ((var44 | var45) >>> 8) + var40;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    }
                } else if (arg4 == 1) {
                    if (arg2 == 1) {
                        for (int var46 = -var11; var46 < 0; ++var46) {
                            int var47 = var9 + var12 - 3;
                            while (var9 < var47) {
                                byte var49 = this.field6145[var10++];
                                if (var49 != 0) {
                                    var18[var9++] = this.field6144[var49 & 255];
                                } else {
                                    ++var9;
                                }
                                byte var50 = this.field6145[var10++];
                                if (var50 != 0) {
                                    var18[var9++] = this.field6144[var50 & 255];
                                } else {
                                    ++var9;
                                }
                                byte var51 = this.field6145[var10++];
                                if (var51 != 0) {
                                    var18[var9++] = this.field6144[var51 & 255];
                                } else {
                                    ++var9;
                                }
                                byte var52 = this.field6145[var10++];
                                if (var52 != 0) {
                                    var18[var9++] = this.field6144[var52 & 255];
                                } else {
                                    ++var9;
                                }
                            }
                            var47 += 3;
                            while (var9 < var47) {
                                byte var48 = this.field6145[var10++];
                                if (var48 != 0) {
                                    var18[var9++] = this.field6144[var48 & 255];
                                } else {
                                    ++var9;
                                }
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 == 0) {
                        if ((arg3 & 16777215) == 16777215) {
                            int var53 = arg3 >>> 24;
                            int var54 = 256 - var53;
                            for (int var55 = -var11; var55 < 0; ++var55) {
                                for (int var56 = -var12; var56 < 0; ++var56) {
                                    byte var57 = this.field6145[var10++];
                                    if (var57 != 0) {
                                        int var58 = this.field6144[var57 & 255];
                                        int var59 = var18[var9];
                                        var18[var9++] = ((var58 & 16711935) * var53 + (var59 & 16711935) * var54 & -16711936) + ((var58 & 65280) * var53 + (var59 & 65280) * var54 & 16711680) >> 8;
                                    } else {
                                        ++var9;
                                    }
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        } else {
                            int var60 = (arg3 & 16711680) >> 16;
                            int var61 = (arg3 & 65280) >> 8;
                            int var62 = arg3 & 255;
                            int var63 = arg3 >>> 24;
                            int var64 = 256 - var63;
                            for (int var65 = -var11; var65 < 0; ++var65) {
                                for (int var66 = -var12; var66 < 0; ++var66) {
                                    byte var67 = this.field6145[var10++];
                                    if (var67 != 0) {
                                        int var68 = this.field6144[var67 & 255];
                                        if (var63 != 255) {
                                            int var69 = (var68 & 16711680) * var60 & -16777216;
                                            int var70 = (var68 & 65280) * var61 & 16711680;
                                            int var71 = (var68 & 255) * var62 & 65280;
                                            int var72 = (var69 | var70 | var71) >>> 8;
                                            int var73 = var18[var9];
                                            var18[var9++] = ((var72 & 16711935) * var63 + (var73 & 16711935) * var64 & -16711936) + ((var72 & 65280) * var63 + (var73 & 65280) * var64 & 16711680) >> 8;
                                        } else {
                                            int var74 = (var68 & 16711680) * var60 & -16777216;
                                            int var75 = (var68 & 65280) * var61 & 16711680;
                                            int var76 = (var68 & 255) * var62 & 65280;
                                            var18[var9++] = (var74 | var75 | var76) >>> 8;
                                        }
                                    } else {
                                        ++var9;
                                    }
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        }
                    } else if (arg2 == 3) {
                        int var77 = arg3 >>> 24;
                        int var78 = 256 - var77;
                        for (int var79 = -var11; var79 < 0; ++var79) {
                            for (int var80 = -var12; var80 < 0; ++var80) {
                                byte var81 = this.field6145[var10++];
                                int var82 = var81 > 0 ? this.field6144[var81] : 0;
                                int var83 = arg3 + var82;
                                int var84 = (arg3 & 16711935) + (var82 & 16711935);
                                int var85 = (var83 - var84 & 65536) + (var84 & 16777472);
                                int var86 = var83 - var85 | var85 - (var85 >>> 8);
                                if (var82 == 0 && var77 != 255) {
                                    int var88 = var18[var9];
                                    var86 = ((var86 & 16711935) * var77 + (var88 & 16711935) * var78 & -16711936) + ((var86 & 65280) * var77 + (var88 & 65280) * var78 & 16711680) >> 8;
                                }
                                var18[var9++] = var86;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var89 = arg3 >>> 24;
                        int var90 = 256 - var89;
                        int var91 = (arg3 & 16711935) * var90 & -16711936;
                        int var92 = (arg3 & 65280) * var90 & 16711680;
                        int var93 = (var91 | var92) >>> 8;
                        for (int var94 = -var11; var94 < 0; ++var94) {
                            for (int var95 = -var12; var95 < 0; ++var95) {
                                byte var96 = this.field6145[var10++];
                                if (var96 != 0) {
                                    int var97 = this.field6144[var96 & 255];
                                    int var98 = (var97 & 16711935) * var89 & -16711936;
                                    int var99 = (var97 & 65280) * var89 & 16711680;
                                    var18[var9++] = ((var98 | var99) >>> 8) + var93;
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
                } else if (arg2 == 1) {
                    for (int var100 = -var11; var100 < 0; ++var100) {
                        for (int var101 = -var12; var101 < 0; ++var101) {
                            byte var102 = this.field6145[var10++];
                            if (var102 != 0) {
                                int var103 = this.field6144[var102 & 255];
                                int var104 = var18[var9];
                                int var105 = var103 + var104;
                                int var106 = (var103 & 16711935) + (var104 & 16711935);
                                int var107 = (var105 - var106 & 65536) + (var106 & 16777472);
                                var18[var9++] = var105 - var107 | var107 - (var107 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 == 0) {
                    int var108 = (arg3 & 16711680) >> 16;
                    int var109 = (arg3 & 65280) >> 8;
                    int var110 = arg3 & 255;
                    for (int var111 = -var11; var111 < 0; ++var111) {
                        for (int var112 = -var12; var112 < 0; ++var112) {
                            byte var113 = this.field6145[var10++];
                            if (var113 != 0) {
                                int var114 = this.field6144[var113 & 255];
                                int var115 = (var114 & 16711680) * var108 & -16777216;
                                int var116 = (var114 & 65280) * var109 & 16711680;
                                int var117 = (var114 & 255) * var110 & 65280;
                                int var118 = (var115 | var116 | var117) >>> 8;
                                int var119 = var18[var9];
                                int var120 = var118 + var119;
                                int var121 = (var118 & 16711935) + (var119 & 16711935);
                                int var122 = (var120 - var121 & 65536) + (var121 & 16777472);
                                var18[var9++] = var120 - var122 | var122 - (var122 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 == 3) {
                    for (int var123 = -var11; var123 < 0; ++var123) {
                        for (int var124 = -var12; var124 < 0; ++var124) {
                            byte var125 = this.field6145[var10++];
                            int var126 = var125 > 0 ? this.field6144[var125] : 0;
                            int var127 = arg3 + var126;
                            int var128 = (arg3 & 16711935) + (var126 & 16711935);
                            int var129 = (var127 - var128 & 65536) + (var128 & 16777472);
                            int var130 = var127 - var129 | var129 - (var129 >>> 8);
                            int var131 = var18[var9];
                            int var132 = var130 + var131;
                            int var133 = (var130 & 16711935) + (var131 & 16711935);
                            int var134 = (var132 - var133 & 65536) + (var133 & 16777472);
                            var18[var9++] = var132 - var134 | var134 - (var134 >>> 8);
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var135 = arg3 >>> 24;
                    int var136 = 256 - var135;
                    int var137 = (arg3 & 16711935) * var136 & -16711936;
                    int var138 = (arg3 & 65280) * var136 & 16711680;
                    int var139 = (var137 | var138) >>> 8;
                    for (int var140 = -var11; var140 < 0; ++var140) {
                        for (int var141 = -var12; var141 < 0; ++var141) {
                            byte var142 = this.field6145[var10++];
                            if (var142 != 0) {
                                int var143 = this.field6144[var142 & 255];
                                int var144 = (var143 & 16711935) * var135 & -16711936;
                                int var145 = (var143 & 65280) * var135 & 16711680;
                                int var146 = ((var144 | var145) >>> 8) + var139;
                                int var147 = var18[var9];
                                int var148 = var146 + var147;
                                int var149 = (var146 & 16711935) + (var147 & 16711935);
                                int var150 = (var148 - var149 & 65536) + (var149 & 16777472);
                                var18[var9++] = var148 - var150 | var150 - (var150 >>> 8);
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

    @OriginalMember(owner = "client!iq", name = "XA", descriptor = "(IIIIII)V")
    public final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lwc;[B[III)V")
    public class439(class49 arg0, byte[] arg1, int[] arg2, int arg3, int arg4) {
        super(arg0, arg3, arg4);
        this.field6145 = arg1;
        this.field6144 = arg2;
    }

    @OriginalMember(owner = "client!iq", name = "ya", descriptor = "(IIIIIII)V")
    public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (super.field1210.method296()) {
            throw new IllegalStateException();
        } else if (arg2 > 0 && arg3 > 0) {
            int var8 = 0;
            int var9 = 0;
            int var10 = super.field1210.field597;
            int var11 = super.field1216 + super.field1211 + super.field1205;
            int var12 = super.field1209 + super.field1198 + super.field1214;
            int var13 = (var11 << 16) / arg2;
            int var14 = (var12 << 16) / arg3;
            if (super.field1216 > 0) {
                int var15 = ((super.field1216 << 16) + var13 - 1) / var13;
                arg0 += var15;
                var8 += var13 * var15 - (super.field1216 << 16);
            }
            if (super.field1209 > 0) {
                int var16 = ((super.field1209 << 16) + var14 - 1) / var14;
                arg1 += var16;
                var9 += var14 * var16 - (super.field1209 << 16);
            }
            if (super.field1211 < var11) {
                arg2 = ((super.field1211 << 16) - var8 + var13 - 1) / var13;
            }
            if (super.field1198 < var12) {
                arg3 = ((super.field1198 << 16) - var9 + var14 - 1) / var14;
            }
            int var17 = arg1 * var10 + arg0;
            int var18 = var10 - arg2;
            if (arg1 + arg3 > super.field1210.field596) {
                arg3 -= arg1 + arg3 - super.field1210.field596;
            }
            if (arg1 < super.field1210.field605) {
                int var19 = super.field1210.field605 - arg1;
                arg3 -= var19;
                var17 += var10 * var19;
                var9 += var14 * var19;
            }
            if (arg0 + arg2 > super.field1210.field573) {
                int var20 = arg0 + arg2 - super.field1210.field573;
                arg2 -= var20;
                var18 += var20;
            }
            if (arg0 < super.field1210.field587) {
                int var21 = super.field1210.field587 - arg0;
                arg2 -= var21;
                var17 += var21;
                var8 += var13 * var21;
                var18 += var21;
            }
            int[] var22 = super.field1210.field594;
            if (arg6 == 0) {
                if (arg4 == 1) {
                    int var23 = var8;
                    for (int var24 = -arg3; var24 < 0; ++var24) {
                        int var25 = (var9 >> 16) * super.field1211;
                        for (int var26 = -arg2; var26 < 0; ++var26) {
                            var22[var17++] = this.field6144[this.field6145[(var8 >> 16) + var25] & 255];
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var23;
                        var17 += var18;
                    }
                } else if (arg4 == 0) {
                    int var27 = (arg5 & 16711680) >> 16;
                    int var28 = (arg5 & 65280) >> 8;
                    int var29 = arg5 & 255;
                    int var30 = var8;
                    for (int var31 = -arg3; var31 < 0; ++var31) {
                        int var32 = (var9 >> 16) * super.field1211;
                        for (int var33 = -arg2; var33 < 0; ++var33) {
                            int var34 = this.field6144[this.field6145[(var8 >> 16) + var32] & 255];
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
                } else if (arg4 == 3) {
                    int var38 = var8;
                    for (int var39 = -arg3; var39 < 0; ++var39) {
                        int var40 = (var9 >> 16) * super.field1211;
                        for (int var41 = -arg2; var41 < 0; ++var41) {
                            byte var42 = this.field6145[(var8 >> 16) + var40];
                            int var43 = var42 > 0 ? this.field6144[var42] : 0;
                            int var44 = arg5 + var43;
                            int var45 = (arg5 & 16711935) + (var43 & 16711935);
                            int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                            var22[var17++] = var44 - var46 | var46 - (var46 >>> 8);
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var38;
                        var17 += var18;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var47 = arg5 >>> 24;
                    int var48 = 256 - var47;
                    int var49 = (arg5 & 16711935) * var48 & -16711936;
                    int var50 = (arg5 & 65280) * var48 & 16711680;
                    int var51 = (var49 | var50) >>> 8;
                    int var52 = var8;
                    for (int var53 = -arg3; var53 < 0; ++var53) {
                        int var54 = (var9 >> 16) * super.field1211;
                        for (int var55 = -arg2; var55 < 0; ++var55) {
                            int var56 = this.field6144[this.field6145[(var8 >> 16) + var54] & 255];
                            int var57 = (var56 & 16711935) * var47 & -16711936;
                            int var58 = (var56 & 65280) * var47 & 16711680;
                            var22[var17++] = ((var57 | var58) >>> 8) + var51;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var52;
                        var17 += var18;
                    }
                }
            } else if (arg6 == 1) {
                if (arg4 == 1) {
                    int var59 = var8;
                    for (int var60 = -arg3; var60 < 0; ++var60) {
                        int var61 = (var9 >> 16) * super.field1211;
                        for (int var62 = -arg2; var62 < 0; ++var62) {
                            byte var63 = this.field6145[(var8 >> 16) + var61];
                            if (var63 != 0) {
                                var22[var17++] = this.field6144[var63 & 255];
                            } else {
                                ++var17;
                            }
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var59;
                        var17 += var18;
                    }
                } else if (arg4 == 0) {
                    int var64 = var8;
                    if ((arg5 & 16777215) == 16777215) {
                        int var65 = arg5 >>> 24;
                        int var66 = 256 - var65;
                        for (int var67 = -arg3; var67 < 0; ++var67) {
                            int var68 = (var9 >> 16) * super.field1211;
                            for (int var69 = -arg2; var69 < 0; ++var69) {
                                byte var70 = this.field6145[(var8 >> 16) + var68];
                                if (var70 != 0) {
                                    int var71 = this.field6144[var70 & 255];
                                    int var72 = var22[var17];
                                    var22[var17++] = ((var71 & 16711935) * var65 + (var72 & 16711935) * var66 & -16711936) + ((var71 & 65280) * var65 + (var72 & 65280) * var66 & 16711680) >> 8;
                                } else {
                                    ++var17;
                                }
                                var8 += var13;
                            }
                            var9 += var14;
                            var8 = var64;
                            var17 += var18;
                        }
                    } else {
                        int var73 = (arg5 & 16711680) >> 16;
                        int var74 = (arg5 & 65280) >> 8;
                        int var75 = arg5 & 255;
                        int var76 = arg5 >>> 24;
                        int var77 = 256 - var76;
                        for (int var78 = -arg3; var78 < 0; ++var78) {
                            int var79 = (var9 >> 16) * super.field1211;
                            for (int var80 = -arg2; var80 < 0; ++var80) {
                                byte var81 = this.field6145[(var8 >> 16) + var79];
                                if (var81 != 0) {
                                    int var82 = this.field6144[var81 & 255];
                                    if (var76 != 255) {
                                        int var83 = (var82 & 16711680) * var73 & -16777216;
                                        int var84 = (var82 & 65280) * var74 & 16711680;
                                        int var85 = (var82 & 255) * var75 & 65280;
                                        int var86 = (var83 | var84 | var85) >>> 8;
                                        int var87 = var22[var17];
                                        var22[var17++] = ((var86 & 16711935) * var76 + (var87 & 16711935) * var77 & -16711936) + ((var86 & 65280) * var76 + (var87 & 65280) * var77 & 16711680) >> 8;
                                    } else {
                                        int var88 = (var82 & 16711680) * var73 & -16777216;
                                        int var89 = (var82 & 65280) * var74 & 16711680;
                                        int var90 = (var82 & 255) * var75 & 65280;
                                        var22[var17++] = (var88 | var89 | var90) >>> 8;
                                    }
                                } else {
                                    ++var17;
                                }
                                var8 += var13;
                            }
                            var9 += var14;
                            var8 = var64;
                            var17 += var18;
                        }
                    }
                } else if (arg4 == 3) {
                    int var91 = var8;
                    int var92 = arg5 >>> 24;
                    int var93 = 256 - var92;
                    for (int var94 = -arg3; var94 < 0; ++var94) {
                        int var95 = (var9 >> 16) * super.field1211;
                        for (int var96 = -arg2; var96 < 0; ++var96) {
                            byte var97 = this.field6145[(var8 >> 16) + var95];
                            int var98 = var97 > 0 ? this.field6144[var97] : 0;
                            int var99 = arg5 + var98;
                            int var100 = (arg5 & 16711935) + (var98 & 16711935);
                            int var101 = (var99 - var100 & 65536) + (var100 & 16777472);
                            int var102 = var99 - var101 | var101 - (var101 >>> 8);
                            if (var98 == 0 && var92 != 255) {
                                int var104 = var22[var17];
                                var102 = ((var102 & 16711935) * var92 + (var104 & 16711935) * var93 & -16711936) + ((var102 & 65280) * var92 + (var104 & 65280) * var93 & 16711680) >> 8;
                            }
                            var22[var17++] = var102;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var91;
                        var17 += var18;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var105 = arg5 >>> 24;
                    int var106 = 256 - var105;
                    int var107 = (arg5 & 16711935) * var106 & -16711936;
                    int var108 = (arg5 & 65280) * var106 & 16711680;
                    int var109 = (var107 | var108) >>> 8;
                    int var110 = var8;
                    for (int var111 = -arg3; var111 < 0; ++var111) {
                        int var112 = (var9 >> 16) * super.field1211;
                        for (int var113 = -arg2; var113 < 0; ++var113) {
                            byte var114 = this.field6145[(var8 >> 16) + var112];
                            if (var114 != 0) {
                                int var115 = this.field6144[var114 & 255];
                                int var116 = (var115 & 16711935) * var105 & -16711936;
                                int var117 = (var115 & 65280) * var105 & 16711680;
                                var22[var17++] = ((var116 | var117) >>> 8) + var109;
                            } else {
                                ++var17;
                            }
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var110;
                        var17 += var18;
                    }
                }
            } else if (arg6 != 2) {
                throw new IllegalArgumentException();
            } else if (arg4 == 1) {
                int var118 = var8;
                for (int var119 = -arg3; var119 < 0; ++var119) {
                    int var120 = (var9 >> 16) * super.field1211;
                    for (int var121 = -arg2; var121 < 0; ++var121) {
                        byte var122 = this.field6145[(var8 >> 16) + var120];
                        if (var122 != 0) {
                            int var123 = this.field6144[var122 & 255];
                            int var124 = var22[var17];
                            int var125 = var123 + var124;
                            int var126 = (var123 & 16711935) + (var124 & 16711935);
                            int var127 = (var125 - var126 & 65536) + (var126 & 16777472);
                            var22[var17++] = var125 - var127 | var127 - (var127 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var118;
                    var17 += var18;
                }
            } else if (arg4 == 0) {
                int var128 = var8;
                int var129 = (arg5 & 16711680) >> 16;
                int var130 = (arg5 & 65280) >> 8;
                int var131 = arg5 & 255;
                for (int var132 = -arg3; var132 < 0; ++var132) {
                    int var133 = (var9 >> 16) * super.field1211;
                    for (int var134 = -arg2; var134 < 0; ++var134) {
                        byte var135 = this.field6145[(var8 >> 16) + var133];
                        if (var135 != 0) {
                            int var136 = this.field6144[var135 & 255];
                            int var137 = (var136 & 16711680) * var129 & -16777216;
                            int var138 = (var136 & 65280) * var130 & 16711680;
                            int var139 = (var136 & 255) * var131 & 65280;
                            int var140 = (var137 | var138 | var139) >>> 8;
                            int var141 = var22[var17];
                            int var142 = var140 + var141;
                            int var143 = (var140 & 16711935) + (var141 & 16711935);
                            int var144 = (var142 - var143 & 65536) + (var143 & 16777472);
                            var22[var17++] = var142 - var144 | var144 - (var144 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var128;
                    var17 += var18;
                }
            } else if (arg4 == 3) {
                int var145 = var8;
                for (int var146 = -arg3; var146 < 0; ++var146) {
                    int var147 = (var9 >> 16) * super.field1211;
                    for (int var148 = -arg2; var148 < 0; ++var148) {
                        byte var149 = this.field6145[(var8 >> 16) + var147];
                        int var150 = var149 > 0 ? this.field6144[var149] : 0;
                        int var151 = arg5 + var150;
                        int var152 = (arg5 & 16711935) + (var150 & 16711935);
                        int var153 = (var151 - var152 & 65536) + (var152 & 16777472);
                        int var154 = var151 - var153 | var153 - (var153 >>> 8);
                        int var155 = var22[var17];
                        int var156 = var154 + var155;
                        int var157 = (var154 & 16711935) + (var155 & 16711935);
                        int var158 = (var156 - var157 & 65536) + (var157 & 16777472);
                        var22[var17++] = var156 - var158 | var158 - (var158 >>> 8);
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var145;
                    var17 += var18;
                }
            } else if (arg4 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var159 = arg5 >>> 24;
                int var160 = 256 - var159;
                int var161 = (arg5 & 16711935) * var160 & -16711936;
                int var162 = (arg5 & 65280) * var160 & 16711680;
                int var163 = (var161 | var162) >>> 8;
                int var164 = var8;
                for (int var165 = -arg3; var165 < 0; ++var165) {
                    int var166 = (var9 >> 16) * super.field1211;
                    for (int var167 = -arg2; var167 < 0; ++var167) {
                        byte var168 = this.field6145[(var8 >> 16) + var166];
                        if (var168 != 0) {
                            int var169 = this.field6144[var168 & 255];
                            int var170 = (var169 & 16711935) * var159 & -16711936;
                            int var171 = (var169 & 65280) * var159 & 16711680;
                            int var172 = ((var170 | var171) >>> 8) + var163;
                            int var173 = var22[var17];
                            int var174 = var172 + var173;
                            int var175 = (var172 & 16711935) + (var173 & 16711935);
                            int var176 = (var174 - var175 & 65536) + (var175 & 16777472);
                            var22[var17++] = var174 - var176 | var176 - (var176 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var164;
                    var17 += var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)V")
    public final void method197(int arg0, int arg1) {
        int[] var3 = super.field1210.field594;
        if (class94.field1223 == 0) {
            if (class94.field1221 == 0) {
                int var4 = class94.field1215;
                while (var4 < 0) {
                    int var5 = class94.field1199;
                    int var6 = class94.field1196;
                    int var7 = class94.field1202;
                    int var8 = class94.field1218;
                    if (var6 >= 0 && var7 >= 0 && var6 - (super.field1211 << 12) < 0 && var7 - (super.field1198 << 12) < 0) {
                        while (var8 < 0) {
                            int var9 = (var6 >> 12) + (var7 >> 12) * super.field1211;
                            int var10 = var5++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var10] = this.field6144[this.field6145[var9] & 255];
                                } else if (arg0 == 0) {
                                    int var14 = this.field6144[this.field6145[var9] & 255];
                                    int var15 = (var14 & 16711680) * class94.field1225 & -16777216;
                                    int var16 = (var14 & 65280) * class94.field1208 & 16711680;
                                    int var17 = (var14 & 255) * class94.field1194 & 65280;
                                    var3[var10] = (var15 | var16 | var17) >>> 8;
                                } else if (arg0 == 3) {
                                    int var18 = this.field6144[this.field6145[var9] & 255];
                                    int var19 = class94.field1224;
                                    int var20 = var18 + var19;
                                    int var21 = (var18 & 16711935) + (var19 & 16711935);
                                    int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                                    var3[var10] = var20 - var22 | var22 - (var22 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var23 = this.field6144[this.field6145[var9] & 255];
                                    int var24 = (var23 & 16711935) * class94.field1197 & -16711936;
                                    int var25 = (var23 & 65280) * class94.field1197 & 16711680;
                                    var3[var10] = ((var24 | var25) >>> 8) + class94.field1201;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var26 = this.field6145[var9];
                                    if (var26 != 0) {
                                        var3[var10] = this.field6144[var26 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var27 = this.field6145[var9];
                                    if (var27 != 0) {
                                        int var28 = this.field6144[var27 & 255];
                                        if ((class94.field1224 & 16777215) == 16777215) {
                                            int var29 = class94.field1224 >>> 24;
                                            int var30 = 256 - var29;
                                            int var31 = var3[var10];
                                            var3[var10] = ((var28 & 16711935) * var29 + (var31 & 16711935) * var30 & -16711936) + ((var28 & 65280) * var29 + (var31 & 65280) * var30 & 16711680) >> 8;
                                        } else if (class94.field1197 != 255) {
                                            int var32 = (var28 & 16711680) * class94.field1225 & -16777216;
                                            int var33 = (var28 & 65280) * class94.field1208 & 16711680;
                                            int var34 = (var28 & 255) * class94.field1194 & 65280;
                                            int var35 = (var32 | var33 | var34) >>> 8;
                                            int var36 = var3[var10];
                                            var3[var10] = ((var35 & 16711935) * class94.field1197 + (var36 & 16711935) * class94.field1220 & -16711936) + ((var35 & 65280) * class94.field1197 + (var36 & 65280) * class94.field1220 & 16711680) >> 8;
                                        } else {
                                            int var37 = (var28 & 16711680) * class94.field1225 & -16777216;
                                            int var38 = (var28 & 65280) * class94.field1208 & 16711680;
                                            int var39 = (var28 & 255) * class94.field1194 & 65280;
                                            var3[var10] = (var37 | var38 | var39) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var40 = this.field6145[var9];
                                    int var41 = var40 > 0 ? this.field6144[var40] : 0;
                                    int var42 = class94.field1224;
                                    int var43 = var41 + var42;
                                    int var44 = (var41 & 16711935) + (var42 & 16711935);
                                    int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                                    int var46 = var43 - var45 | var45 - (var45 >>> 8);
                                    if (var41 == 0 && class94.field1197 != 255) {
                                        int var48 = var3[var10];
                                        var46 = ((var46 & 16711935) * class94.field1197 + (var48 & 16711935) * class94.field1220 & -16711936) + ((var46 & 65280) * class94.field1197 + (var48 & 65280) * class94.field1220 & 16711680) >> 8;
                                    }
                                    var3[var10] = var46;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var49 = this.field6145[var9];
                                    if (var49 != 0) {
                                        int var50 = this.field6144[var49 & 255];
                                        int var51 = (var50 & 16711935) * class94.field1197 & -16711936;
                                        int var52 = (var50 & 65280) * class94.field1197 & 16711680;
                                        var3[var10++] = ((var51 | var52) >>> 8) + class94.field1201;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var53 = this.field6145[var9];
                                    if (var53 != 0) {
                                        int var54 = this.field6144[var53 & 255];
                                        int var55 = var3[var10];
                                        int var56 = var54 + var55;
                                        int var57 = (var54 & 16711935) + (var55 & 16711935);
                                        int var58 = (var56 - var57 & 65536) + (var57 & 16777472);
                                        var3[var10] = var56 - var58 | var58 - (var58 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var59 = this.field6145[var9];
                                    if (var59 != 0) {
                                        int var60 = this.field6144[var59 & 255];
                                        int var61 = (var60 & 16711680) * class94.field1225 & -16777216;
                                        int var62 = (var60 & 65280) * class94.field1208 & 16711680;
                                        int var63 = (var60 & 255) * class94.field1194 & 65280;
                                        int var64 = (var61 | var62 | var63) >>> 8;
                                        int var65 = var3[var10];
                                        int var66 = var64 + var65;
                                        int var67 = (var64 & 16711935) + (var65 & 16711935);
                                        int var68 = (var66 - var67 & 65536) + (var67 & 16777472);
                                        var3[var10] = var66 - var68 | var68 - (var68 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var69 = this.field6145[var9];
                                    int var70 = var69 > 0 ? this.field6144[var69] : 0;
                                    int var71 = class94.field1224;
                                    int var72 = var70 + var71;
                                    int var73 = (var70 & 16711935) + (var71 & 16711935);
                                    int var74 = (var72 - var73 & 65536) + (var73 & 16777472);
                                    int var75 = var72 - var74 | var74 - (var74 >>> 8);
                                    if (var70 == 0 && class94.field1197 != 255) {
                                        int var77 = var3[var10];
                                        var75 = ((var75 & 16711935) * class94.field1197 + (var77 & 16711935) * class94.field1220 & -16711936) + ((var75 & 65280) * class94.field1197 + (var77 & 65280) * class94.field1220 & 16711680) >> 8;
                                    }
                                    var3[var10] = var75;
                                } else if (arg0 == 2) {
                                    byte var78 = this.field6145[var9];
                                    if (var78 != 0) {
                                        int var79 = this.field6144[var78 & 255];
                                        int var80 = (var79 & 16711935) * class94.field1197 & -16711936;
                                        int var81 = (var79 & 65280) * class94.field1197 & 16711680;
                                        int var82 = ((var80 | var81) >>> 8) + class94.field1201;
                                        int var83 = var3[var10];
                                        int var84 = var82 + var83;
                                        int var85 = (var82 & 16711935) + (var83 & 16711935);
                                        int var86 = (var84 - var85 & 65536) + (var85 & 16777472);
                                        var3[var10] = var84 - var86 | var86 - (var86 >>> 8);
                                    }
                                }
                            }
                            ++var8;
                        }
                    }
                    ++var4;
                    class94.field1199 += class94.field1219;
                }
            } else if (class94.field1221 < 0) {
                int var87 = class94.field1215;
                while (var87 < 0) {
                    int var88 = class94.field1199;
                    int var89 = class94.field1196;
                    int var90 = class94.field1203 + class94.field1202;
                    int var91 = class94.field1218;
                    if (var89 >= 0 && var89 - (super.field1211 << 12) < 0) {
                        int var92;
                        if ((var92 = var90 - (super.field1198 << 12)) >= 0) {
                            int var93 = (class94.field1221 - var92) / class94.field1221;
                            var91 += var93;
                            var90 += class94.field1221 * var93;
                            var88 += var93;
                        }
                        int var94;
                        if ((var94 = (var90 - class94.field1221) / class94.field1221) > var91) {
                            var91 = var94;
                        }
                        while (var91 < 0) {
                            int var95 = (var89 >> 12) + (var90 >> 12) * super.field1211;
                            int var96 = var88++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var96] = this.field6144[this.field6145[var95] & 255];
                                } else if (arg0 == 0) {
                                    int var100 = this.field6144[this.field6145[var95] & 255];
                                    int var101 = (var100 & 16711680) * class94.field1225 & -16777216;
                                    int var102 = (var100 & 65280) * class94.field1208 & 16711680;
                                    int var103 = (var100 & 255) * class94.field1194 & 65280;
                                    var3[var96] = (var101 | var102 | var103) >>> 8;
                                } else if (arg0 == 3) {
                                    int var104 = this.field6144[this.field6145[var95] & 255];
                                    int var105 = class94.field1224;
                                    int var106 = var104 + var105;
                                    int var107 = (var104 & 16711935) + (var105 & 16711935);
                                    int var108 = (var106 - var107 & 65536) + (var107 & 16777472);
                                    var3[var96] = var106 - var108 | var108 - (var108 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var109 = this.field6144[this.field6145[var95] & 255];
                                    int var110 = (var109 & 16711935) * class94.field1197 & -16711936;
                                    int var111 = (var109 & 65280) * class94.field1197 & 16711680;
                                    var3[var96] = ((var110 | var111) >>> 8) + class94.field1201;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var112 = this.field6145[var95];
                                    if (var112 != 0) {
                                        var3[var96] = this.field6144[var112 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var113 = this.field6145[var95];
                                    if (var113 != 0) {
                                        int var114 = this.field6144[var113 & 255];
                                        if ((class94.field1224 & 16777215) == 16777215) {
                                            int var115 = class94.field1224 >>> 24;
                                            int var116 = 256 - var115;
                                            int var117 = var3[var96];
                                            var3[var96] = ((var114 & 16711935) * var115 + (var117 & 16711935) * var116 & -16711936) + ((var114 & 65280) * var115 + (var117 & 65280) * var116 & 16711680) >> 8;
                                        } else if (class94.field1197 != 255) {
                                            int var118 = (var114 & 16711680) * class94.field1225 & -16777216;
                                            int var119 = (var114 & 65280) * class94.field1208 & 16711680;
                                            int var120 = (var114 & 255) * class94.field1194 & 65280;
                                            int var121 = (var118 | var119 | var120) >>> 8;
                                            int var122 = var3[var96];
                                            var3[var96] = ((var121 & 16711935) * class94.field1197 + (var122 & 16711935) * class94.field1220 & -16711936) + ((var121 & 65280) * class94.field1197 + (var122 & 65280) * class94.field1220 & 16711680) >> 8;
                                        } else {
                                            int var123 = (var114 & 16711680) * class94.field1225 & -16777216;
                                            int var124 = (var114 & 65280) * class94.field1208 & 16711680;
                                            int var125 = (var114 & 255) * class94.field1194 & 65280;
                                            var3[var96] = (var123 | var124 | var125) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var126 = this.field6145[var95];
                                    int var127 = var126 > 0 ? this.field6144[var126] : 0;
                                    int var128 = class94.field1224;
                                    int var129 = var127 + var128;
                                    int var130 = (var127 & 16711935) + (var128 & 16711935);
                                    int var131 = (var129 - var130 & 65536) + (var130 & 16777472);
                                    int var132 = var129 - var131 | var131 - (var131 >>> 8);
                                    if (var127 == 0 && class94.field1197 != 255) {
                                        int var134 = var3[var96];
                                        var132 = ((var132 & 16711935) * class94.field1197 + (var134 & 16711935) * class94.field1220 & -16711936) + ((var132 & 65280) * class94.field1197 + (var134 & 65280) * class94.field1220 & 16711680) >> 8;
                                    }
                                    var3[var96] = var132;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var135 = this.field6145[var95];
                                    if (var135 != 0) {
                                        int var136 = this.field6144[var135 & 255];
                                        int var137 = (var136 & 16711935) * class94.field1197 & -16711936;
                                        int var138 = (var136 & 65280) * class94.field1197 & 16711680;
                                        var3[var96++] = ((var137 | var138) >>> 8) + class94.field1201;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var139 = this.field6145[var95];
                                    if (var139 != 0) {
                                        int var140 = this.field6144[var139 & 255];
                                        int var141 = var3[var96];
                                        int var142 = var140 + var141;
                                        int var143 = (var140 & 16711935) + (var141 & 16711935);
                                        int var144 = (var142 - var143 & 65536) + (var143 & 16777472);
                                        var3[var96] = var142 - var144 | var144 - (var144 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var145 = this.field6145[var95];
                                    if (var145 != 0) {
                                        int var146 = this.field6144[var145 & 255];
                                        int var147 = (var146 & 16711680) * class94.field1225 & -16777216;
                                        int var148 = (var146 & 65280) * class94.field1208 & 16711680;
                                        int var149 = (var146 & 255) * class94.field1194 & 65280;
                                        int var150 = (var147 | var148 | var149) >>> 8;
                                        int var151 = var3[var96];
                                        int var152 = var150 + var151;
                                        int var153 = (var150 & 16711935) + (var151 & 16711935);
                                        int var154 = (var152 - var153 & 65536) + (var153 & 16777472);
                                        var3[var96] = var152 - var154 | var154 - (var154 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var155 = this.field6145[var95];
                                    int var156 = var155 > 0 ? this.field6144[var155] : 0;
                                    int var157 = class94.field1224;
                                    int var158 = var156 + var157;
                                    int var159 = (var156 & 16711935) + (var157 & 16711935);
                                    int var160 = (var158 - var159 & 65536) + (var159 & 16777472);
                                    int var161 = var158 - var160 | var160 - (var160 >>> 8);
                                    if (var156 == 0 && class94.field1197 != 255) {
                                        int var163 = var3[var96];
                                        var161 = ((var161 & 16711935) * class94.field1197 + (var163 & 16711935) * class94.field1220 & -16711936) + ((var161 & 65280) * class94.field1197 + (var163 & 65280) * class94.field1220 & 16711680) >> 8;
                                    }
                                    var3[var96] = var161;
                                } else if (arg0 == 2) {
                                    byte var164 = this.field6145[var95];
                                    if (var164 != 0) {
                                        int var165 = this.field6144[var164 & 255];
                                        int var166 = (var165 & 16711935) * class94.field1197 & -16711936;
                                        int var167 = (var165 & 65280) * class94.field1197 & 16711680;
                                        int var168 = ((var166 | var167) >>> 8) + class94.field1201;
                                        int var169 = var3[var96];
                                        int var170 = var168 + var169;
                                        int var171 = (var168 & 16711935) + (var169 & 16711935);
                                        int var172 = (var170 - var171 & 65536) + (var171 & 16777472);
                                        var3[var96] = var170 - var172 | var172 - (var172 >>> 8);
                                    }
                                }
                            }
                            var90 += class94.field1221;
                            ++var91;
                        }
                    }
                    ++var87;
                    class94.field1196 += class94.field1204;
                    class94.field1199 += class94.field1219;
                }
            } else {
                int var173 = class94.field1215;
                while (var173 < 0) {
                    int var174 = class94.field1199;
                    int var175 = class94.field1196;
                    int var176 = class94.field1203 + class94.field1202;
                    int var177 = class94.field1218;
                    if (var175 >= 0 && var175 - (super.field1211 << 12) < 0) {
                        if (var176 < 0) {
                            int var178 = (class94.field1221 - 1 - var176) / class94.field1221;
                            var177 += var178;
                            var176 += class94.field1221 * var178;
                            var174 += var178;
                        }
                        int var179;
                        if ((var179 = (var176 + 1 - (super.field1198 << 12) - class94.field1221) / class94.field1221) > var177) {
                            var177 = var179;
                        }
                        while (var177 < 0) {
                            int var180 = (var175 >> 12) + (var176 >> 12) * super.field1211;
                            int var181 = var174++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var181] = this.field6144[this.field6145[var180] & 255];
                                } else if (arg0 == 0) {
                                    int var185 = this.field6144[this.field6145[var180] & 255];
                                    int var186 = (var185 & 16711680) * class94.field1225 & -16777216;
                                    int var187 = (var185 & 65280) * class94.field1208 & 16711680;
                                    int var188 = (var185 & 255) * class94.field1194 & 65280;
                                    var3[var181] = (var186 | var187 | var188) >>> 8;
                                } else if (arg0 == 3) {
                                    int var189 = this.field6144[this.field6145[var180] & 255];
                                    int var190 = class94.field1224;
                                    int var191 = var189 + var190;
                                    int var192 = (var189 & 16711935) + (var190 & 16711935);
                                    int var193 = (var191 - var192 & 65536) + (var192 & 16777472);
                                    var3[var181] = var191 - var193 | var193 - (var193 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var194 = this.field6144[this.field6145[var180] & 255];
                                    int var195 = (var194 & 16711935) * class94.field1197 & -16711936;
                                    int var196 = (var194 & 65280) * class94.field1197 & 16711680;
                                    var3[var181] = ((var195 | var196) >>> 8) + class94.field1201;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var197 = this.field6145[var180];
                                    if (var197 != 0) {
                                        var3[var181] = this.field6144[var197 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var198 = this.field6145[var180];
                                    if (var198 != 0) {
                                        int var199 = this.field6144[var198 & 255];
                                        if ((class94.field1224 & 16777215) == 16777215) {
                                            int var200 = class94.field1224 >>> 24;
                                            int var201 = 256 - var200;
                                            int var202 = var3[var181];
                                            var3[var181] = ((var199 & 16711935) * var200 + (var202 & 16711935) * var201 & -16711936) + ((var199 & 65280) * var200 + (var202 & 65280) * var201 & 16711680) >> 8;
                                        } else if (class94.field1197 != 255) {
                                            int var203 = (var199 & 16711680) * class94.field1225 & -16777216;
                                            int var204 = (var199 & 65280) * class94.field1208 & 16711680;
                                            int var205 = (var199 & 255) * class94.field1194 & 65280;
                                            int var206 = (var203 | var204 | var205) >>> 8;
                                            int var207 = var3[var181];
                                            var3[var181] = ((var206 & 16711935) * class94.field1197 + (var207 & 16711935) * class94.field1220 & -16711936) + ((var206 & 65280) * class94.field1197 + (var207 & 65280) * class94.field1220 & 16711680) >> 8;
                                        } else {
                                            int var208 = (var199 & 16711680) * class94.field1225 & -16777216;
                                            int var209 = (var199 & 65280) * class94.field1208 & 16711680;
                                            int var210 = (var199 & 255) * class94.field1194 & 65280;
                                            var3[var181] = (var208 | var209 | var210) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var211 = this.field6145[var180];
                                    int var212 = var211 > 0 ? this.field6144[var211] : 0;
                                    int var213 = class94.field1224;
                                    int var214 = var212 + var213;
                                    int var215 = (var212 & 16711935) + (var213 & 16711935);
                                    int var216 = (var214 - var215 & 65536) + (var215 & 16777472);
                                    int var217 = var214 - var216 | var216 - (var216 >>> 8);
                                    if (var212 == 0 && class94.field1197 != 255) {
                                        int var219 = var3[var181];
                                        var217 = ((var217 & 16711935) * class94.field1197 + (var219 & 16711935) * class94.field1220 & -16711936) + ((var217 & 65280) * class94.field1197 + (var219 & 65280) * class94.field1220 & 16711680) >> 8;
                                    }
                                    var3[var181] = var217;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var220 = this.field6145[var180];
                                    if (var220 != 0) {
                                        int var221 = this.field6144[var220 & 255];
                                        int var222 = (var221 & 16711935) * class94.field1197 & -16711936;
                                        int var223 = (var221 & 65280) * class94.field1197 & 16711680;
                                        var3[var181++] = ((var222 | var223) >>> 8) + class94.field1201;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var224 = this.field6145[var180];
                                    if (var224 != 0) {
                                        int var225 = this.field6144[var224 & 255];
                                        int var226 = var3[var181];
                                        int var227 = var225 + var226;
                                        int var228 = (var225 & 16711935) + (var226 & 16711935);
                                        int var229 = (var227 - var228 & 65536) + (var228 & 16777472);
                                        var3[var181] = var227 - var229 | var229 - (var229 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var230 = this.field6145[var180];
                                    if (var230 != 0) {
                                        int var231 = this.field6144[var230 & 255];
                                        int var232 = (var231 & 16711680) * class94.field1225 & -16777216;
                                        int var233 = (var231 & 65280) * class94.field1208 & 16711680;
                                        int var234 = (var231 & 255) * class94.field1194 & 65280;
                                        int var235 = (var232 | var233 | var234) >>> 8;
                                        int var236 = var3[var181];
                                        int var237 = var235 + var236;
                                        int var238 = (var235 & 16711935) + (var236 & 16711935);
                                        int var239 = (var237 - var238 & 65536) + (var238 & 16777472);
                                        var3[var181] = var237 - var239 | var239 - (var239 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var240 = this.field6145[var180];
                                    int var241 = var240 > 0 ? this.field6144[var240] : 0;
                                    int var242 = class94.field1224;
                                    int var243 = var241 + var242;
                                    int var244 = (var241 & 16711935) + (var242 & 16711935);
                                    int var245 = (var243 - var244 & 65536) + (var244 & 16777472);
                                    int var246 = var243 - var245 | var245 - (var245 >>> 8);
                                    if (var241 == 0 && class94.field1197 != 255) {
                                        int var248 = var3[var181];
                                        var246 = ((var246 & 16711935) * class94.field1197 + (var248 & 16711935) * class94.field1220 & -16711936) + ((var246 & 65280) * class94.field1197 + (var248 & 65280) * class94.field1220 & 16711680) >> 8;
                                    }
                                    var3[var181] = var246;
                                } else if (arg0 == 2) {
                                    byte var249 = this.field6145[var180];
                                    if (var249 != 0) {
                                        int var250 = this.field6144[var249 & 255];
                                        int var251 = (var250 & 16711935) * class94.field1197 & -16711936;
                                        int var252 = (var250 & 65280) * class94.field1197 & 16711680;
                                        int var253 = ((var251 | var252) >>> 8) + class94.field1201;
                                        int var254 = var3[var181];
                                        int var255 = var253 + var254;
                                        int var256 = (var253 & 16711935) + (var254 & 16711935);
                                        int var257 = (var255 - var256 & 65536) + (var256 & 16777472);
                                        var3[var181] = var255 - var257 | var257 - (var257 >>> 8);
                                    }
                                }
                            }
                            var176 += class94.field1221;
                            ++var177;
                        }
                    }
                    ++var173;
                    class94.field1196 += class94.field1204;
                    class94.field1199 += class94.field1219;
                }
            }
        } else if (class94.field1223 < 0) {
            if (class94.field1221 == 0) {
                int var258 = class94.field1215;
                while (var258 < 0) {
                    int var259 = class94.field1199;
                    int var260 = class94.field1196 + class94.field1195;
                    int var261 = class94.field1202;
                    int var262 = class94.field1218;
                    if (var261 >= 0 && var261 - (super.field1198 << 12) < 0) {
                        int var263;
                        if ((var263 = var260 - (super.field1211 << 12)) >= 0) {
                            int var264 = (class94.field1223 - var263) / class94.field1223;
                            var262 += var264;
                            var260 += class94.field1223 * var264;
                            var259 += var264;
                        }
                        int var265;
                        if ((var265 = (var260 - class94.field1223) / class94.field1223) > var262) {
                            var262 = var265;
                        }
                        while (var262 < 0) {
                            int var266 = (var260 >> 12) + (var261 >> 12) * super.field1211;
                            int var267 = var259++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var267] = this.field6144[this.field6145[var266] & 255];
                                } else if (arg0 == 0) {
                                    int var271 = this.field6144[this.field6145[var266] & 255];
                                    int var272 = (var271 & 16711680) * class94.field1225 & -16777216;
                                    int var273 = (var271 & 65280) * class94.field1208 & 16711680;
                                    int var274 = (var271 & 255) * class94.field1194 & 65280;
                                    var3[var267] = (var272 | var273 | var274) >>> 8;
                                } else if (arg0 == 3) {
                                    int var275 = this.field6144[this.field6145[var266] & 255];
                                    int var276 = class94.field1224;
                                    int var277 = var275 + var276;
                                    int var278 = (var275 & 16711935) + (var276 & 16711935);
                                    int var279 = (var277 - var278 & 65536) + (var278 & 16777472);
                                    var3[var267] = var277 - var279 | var279 - (var279 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var280 = this.field6144[this.field6145[var266] & 255];
                                    int var281 = (var280 & 16711935) * class94.field1197 & -16711936;
                                    int var282 = (var280 & 65280) * class94.field1197 & 16711680;
                                    var3[var267] = ((var281 | var282) >>> 8) + class94.field1201;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var283 = this.field6145[var266];
                                    if (var283 != 0) {
                                        var3[var267] = this.field6144[var283 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var284 = this.field6145[var266];
                                    if (var284 != 0) {
                                        int var285 = this.field6144[var284 & 255];
                                        if ((class94.field1224 & 16777215) == 16777215) {
                                            int var286 = class94.field1224 >>> 24;
                                            int var287 = 256 - var286;
                                            int var288 = var3[var267];
                                            var3[var267] = ((var285 & 16711935) * var286 + (var288 & 16711935) * var287 & -16711936) + ((var285 & 65280) * var286 + (var288 & 65280) * var287 & 16711680) >> 8;
                                        } else if (class94.field1197 != 255) {
                                            int var289 = (var285 & 16711680) * class94.field1225 & -16777216;
                                            int var290 = (var285 & 65280) * class94.field1208 & 16711680;
                                            int var291 = (var285 & 255) * class94.field1194 & 65280;
                                            int var292 = (var289 | var290 | var291) >>> 8;
                                            int var293 = var3[var267];
                                            var3[var267] = ((var292 & 16711935) * class94.field1197 + (var293 & 16711935) * class94.field1220 & -16711936) + ((var292 & 65280) * class94.field1197 + (var293 & 65280) * class94.field1220 & 16711680) >> 8;
                                        } else {
                                            int var294 = (var285 & 16711680) * class94.field1225 & -16777216;
                                            int var295 = (var285 & 65280) * class94.field1208 & 16711680;
                                            int var296 = (var285 & 255) * class94.field1194 & 65280;
                                            var3[var267] = (var294 | var295 | var296) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var297 = this.field6145[var266];
                                    int var298 = var297 > 0 ? this.field6144[var297] : 0;
                                    int var299 = class94.field1224;
                                    int var300 = var298 + var299;
                                    int var301 = (var298 & 16711935) + (var299 & 16711935);
                                    int var302 = (var300 - var301 & 65536) + (var301 & 16777472);
                                    int var303 = var300 - var302 | var302 - (var302 >>> 8);
                                    if (var298 == 0 && class94.field1197 != 255) {
                                        int var305 = var3[var267];
                                        var303 = ((var303 & 16711935) * class94.field1197 + (var305 & 16711935) * class94.field1220 & -16711936) + ((var303 & 65280) * class94.field1197 + (var305 & 65280) * class94.field1220 & 16711680) >> 8;
                                    }
                                    var3[var267] = var303;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var306 = this.field6145[var266];
                                    if (var306 != 0) {
                                        int var307 = this.field6144[var306 & 255];
                                        int var308 = (var307 & 16711935) * class94.field1197 & -16711936;
                                        int var309 = (var307 & 65280) * class94.field1197 & 16711680;
                                        var3[var267++] = ((var308 | var309) >>> 8) + class94.field1201;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var310 = this.field6145[var266];
                                    if (var310 != 0) {
                                        int var311 = this.field6144[var310 & 255];
                                        int var312 = var3[var267];
                                        int var313 = var311 + var312;
                                        int var314 = (var311 & 16711935) + (var312 & 16711935);
                                        int var315 = (var313 - var314 & 65536) + (var314 & 16777472);
                                        var3[var267] = var313 - var315 | var315 - (var315 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var316 = this.field6145[var266];
                                    if (var316 != 0) {
                                        int var317 = this.field6144[var316 & 255];
                                        int var318 = (var317 & 16711680) * class94.field1225 & -16777216;
                                        int var319 = (var317 & 65280) * class94.field1208 & 16711680;
                                        int var320 = (var317 & 255) * class94.field1194 & 65280;
                                        int var321 = (var318 | var319 | var320) >>> 8;
                                        int var322 = var3[var267];
                                        int var323 = var321 + var322;
                                        int var324 = (var321 & 16711935) + (var322 & 16711935);
                                        int var325 = (var323 - var324 & 65536) + (var324 & 16777472);
                                        var3[var267] = var323 - var325 | var325 - (var325 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var326 = this.field6145[var266];
                                    int var327 = var326 > 0 ? this.field6144[var326] : 0;
                                    int var328 = class94.field1224;
                                    int var329 = var327 + var328;
                                    int var330 = (var327 & 16711935) + (var328 & 16711935);
                                    int var331 = (var329 - var330 & 65536) + (var330 & 16777472);
                                    int var332 = var329 - var331 | var331 - (var331 >>> 8);
                                    if (var327 == 0 && class94.field1197 != 255) {
                                        int var334 = var3[var267];
                                        var332 = ((var332 & 16711935) * class94.field1197 + (var334 & 16711935) * class94.field1220 & -16711936) + ((var332 & 65280) * class94.field1197 + (var334 & 65280) * class94.field1220 & 16711680) >> 8;
                                    }
                                    var3[var267] = var332;
                                } else if (arg0 == 2) {
                                    byte var335 = this.field6145[var266];
                                    if (var335 != 0) {
                                        int var336 = this.field6144[var335 & 255];
                                        int var337 = (var336 & 16711935) * class94.field1197 & -16711936;
                                        int var338 = (var336 & 65280) * class94.field1197 & 16711680;
                                        int var339 = ((var337 | var338) >>> 8) + class94.field1201;
                                        int var340 = var3[var267];
                                        int var341 = var339 + var340;
                                        int var342 = (var339 & 16711935) + (var340 & 16711935);
                                        int var343 = (var341 - var342 & 65536) + (var342 & 16777472);
                                        var3[var267] = var341 - var343 | var343 - (var343 >>> 8);
                                    }
                                }
                            }
                            var260 += class94.field1223;
                            ++var262;
                        }
                    }
                    ++var258;
                    class94.field1202 += class94.field1213;
                    class94.field1199 += class94.field1219;
                }
            } else if (class94.field1221 < 0) {
                int var344 = class94.field1215;
                while (var344 < 0) {
                    int var345 = class94.field1199;
                    int var346 = class94.field1196 + class94.field1195;
                    int var347 = class94.field1203 + class94.field1202;
                    int var348 = class94.field1218;
                    int var349;
                    if ((var349 = var346 - (super.field1211 << 12)) >= 0) {
                        int var350 = (class94.field1223 - var349) / class94.field1223;
                        var348 += var350;
                        var346 += class94.field1223 * var350;
                        var347 += class94.field1221 * var350;
                        var345 += var350;
                    }
                    int var351;
                    if ((var351 = (var346 - class94.field1223) / class94.field1223) > var348) {
                        var348 = var351;
                    }
                    int var352;
                    if ((var352 = var347 - (super.field1198 << 12)) >= 0) {
                        int var353 = (class94.field1221 - var352) / class94.field1221;
                        var348 += var353;
                        var346 += class94.field1223 * var353;
                        var347 += class94.field1221 * var353;
                        var345 += var353;
                    }
                    int var354;
                    if ((var354 = (var347 - class94.field1221) / class94.field1221) > var348) {
                        var348 = var354;
                    }
                    while (var348 < 0) {
                        int var355 = (var346 >> 12) + (var347 >> 12) * super.field1211;
                        int var356 = var345++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var356] = this.field6144[this.field6145[var355] & 255];
                            } else if (arg0 == 0) {
                                int var360 = this.field6144[this.field6145[var355] & 255];
                                int var361 = (var360 & 16711680) * class94.field1225 & -16777216;
                                int var362 = (var360 & 65280) * class94.field1208 & 16711680;
                                int var363 = (var360 & 255) * class94.field1194 & 65280;
                                var3[var356] = (var361 | var362 | var363) >>> 8;
                            } else if (arg0 == 3) {
                                int var364 = this.field6144[this.field6145[var355] & 255];
                                int var365 = class94.field1224;
                                int var366 = var364 + var365;
                                int var367 = (var364 & 16711935) + (var365 & 16711935);
                                int var368 = (var366 - var367 & 65536) + (var367 & 16777472);
                                var3[var356] = var366 - var368 | var368 - (var368 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var369 = this.field6144[this.field6145[var355] & 255];
                                int var370 = (var369 & 16711935) * class94.field1197 & -16711936;
                                int var371 = (var369 & 65280) * class94.field1197 & 16711680;
                                var3[var356] = ((var370 | var371) >>> 8) + class94.field1201;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var372 = this.field6145[var355];
                                if (var372 != 0) {
                                    var3[var356] = this.field6144[var372 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var373 = this.field6145[var355];
                                if (var373 != 0) {
                                    int var374 = this.field6144[var373 & 255];
                                    if ((class94.field1224 & 16777215) == 16777215) {
                                        int var375 = class94.field1224 >>> 24;
                                        int var376 = 256 - var375;
                                        int var377 = var3[var356];
                                        var3[var356] = ((var374 & 16711935) * var375 + (var377 & 16711935) * var376 & -16711936) + ((var374 & 65280) * var375 + (var377 & 65280) * var376 & 16711680) >> 8;
                                    } else if (class94.field1197 != 255) {
                                        int var378 = (var374 & 16711680) * class94.field1225 & -16777216;
                                        int var379 = (var374 & 65280) * class94.field1208 & 16711680;
                                        int var380 = (var374 & 255) * class94.field1194 & 65280;
                                        int var381 = (var378 | var379 | var380) >>> 8;
                                        int var382 = var3[var356];
                                        var3[var356] = ((var381 & 16711935) * class94.field1197 + (var382 & 16711935) * class94.field1220 & -16711936) + ((var381 & 65280) * class94.field1197 + (var382 & 65280) * class94.field1220 & 16711680) >> 8;
                                    } else {
                                        int var383 = (var374 & 16711680) * class94.field1225 & -16777216;
                                        int var384 = (var374 & 65280) * class94.field1208 & 16711680;
                                        int var385 = (var374 & 255) * class94.field1194 & 65280;
                                        var3[var356] = (var383 | var384 | var385) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var386 = this.field6145[var355];
                                int var387 = var386 > 0 ? this.field6144[var386] : 0;
                                int var388 = class94.field1224;
                                int var389 = var387 + var388;
                                int var390 = (var387 & 16711935) + (var388 & 16711935);
                                int var391 = (var389 - var390 & 65536) + (var390 & 16777472);
                                int var392 = var389 - var391 | var391 - (var391 >>> 8);
                                if (var387 == 0 && class94.field1197 != 255) {
                                    int var394 = var3[var356];
                                    var392 = ((var392 & 16711935) * class94.field1197 + (var394 & 16711935) * class94.field1220 & -16711936) + ((var392 & 65280) * class94.field1197 + (var394 & 65280) * class94.field1220 & 16711680) >> 8;
                                }
                                var3[var356] = var392;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var395 = this.field6145[var355];
                                if (var395 != 0) {
                                    int var396 = this.field6144[var395 & 255];
                                    int var397 = (var396 & 16711935) * class94.field1197 & -16711936;
                                    int var398 = (var396 & 65280) * class94.field1197 & 16711680;
                                    var3[var356++] = ((var397 | var398) >>> 8) + class94.field1201;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var399 = this.field6145[var355];
                                if (var399 != 0) {
                                    int var400 = this.field6144[var399 & 255];
                                    int var401 = var3[var356];
                                    int var402 = var400 + var401;
                                    int var403 = (var400 & 16711935) + (var401 & 16711935);
                                    int var404 = (var402 - var403 & 65536) + (var403 & 16777472);
                                    var3[var356] = var402 - var404 | var404 - (var404 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var405 = this.field6145[var355];
                                if (var405 != 0) {
                                    int var406 = this.field6144[var405 & 255];
                                    int var407 = (var406 & 16711680) * class94.field1225 & -16777216;
                                    int var408 = (var406 & 65280) * class94.field1208 & 16711680;
                                    int var409 = (var406 & 255) * class94.field1194 & 65280;
                                    int var410 = (var407 | var408 | var409) >>> 8;
                                    int var411 = var3[var356];
                                    int var412 = var410 + var411;
                                    int var413 = (var410 & 16711935) + (var411 & 16711935);
                                    int var414 = (var412 - var413 & 65536) + (var413 & 16777472);
                                    var3[var356] = var412 - var414 | var414 - (var414 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var415 = this.field6145[var355];
                                int var416 = var415 > 0 ? this.field6144[var415] : 0;
                                int var417 = class94.field1224;
                                int var418 = var416 + var417;
                                int var419 = (var416 & 16711935) + (var417 & 16711935);
                                int var420 = (var418 - var419 & 65536) + (var419 & 16777472);
                                int var421 = var418 - var420 | var420 - (var420 >>> 8);
                                if (var416 == 0 && class94.field1197 != 255) {
                                    int var423 = var3[var356];
                                    var421 = ((var421 & 16711935) * class94.field1197 + (var423 & 16711935) * class94.field1220 & -16711936) + ((var421 & 65280) * class94.field1197 + (var423 & 65280) * class94.field1220 & 16711680) >> 8;
                                }
                                var3[var356] = var421;
                            } else if (arg0 == 2) {
                                byte var424 = this.field6145[var355];
                                if (var424 != 0) {
                                    int var425 = this.field6144[var424 & 255];
                                    int var426 = (var425 & 16711935) * class94.field1197 & -16711936;
                                    int var427 = (var425 & 65280) * class94.field1197 & 16711680;
                                    int var428 = ((var426 | var427) >>> 8) + class94.field1201;
                                    int var429 = var3[var356];
                                    int var430 = var428 + var429;
                                    int var431 = (var428 & 16711935) + (var429 & 16711935);
                                    int var432 = (var430 - var431 & 65536) + (var431 & 16777472);
                                    var3[var356] = var430 - var432 | var432 - (var432 >>> 8);
                                }
                            }
                        }
                        var346 += class94.field1223;
                        var347 += class94.field1221;
                        ++var348;
                    }
                    ++var344;
                    class94.field1196 += class94.field1204;
                    class94.field1202 += class94.field1213;
                    class94.field1199 += class94.field1219;
                }
            } else {
                int var433 = class94.field1215;
                while (var433 < 0) {
                    int var434 = class94.field1199;
                    int var435 = class94.field1196 + class94.field1195;
                    int var436 = class94.field1203 + class94.field1202;
                    int var437 = class94.field1218;
                    int var438;
                    if ((var438 = var435 - (super.field1211 << 12)) >= 0) {
                        int var439 = (class94.field1223 - var438) / class94.field1223;
                        var437 += var439;
                        var435 += class94.field1223 * var439;
                        var436 += class94.field1221 * var439;
                        var434 += var439;
                    }
                    int var440;
                    if ((var440 = (var435 - class94.field1223) / class94.field1223) > var437) {
                        var437 = var440;
                    }
                    if (var436 < 0) {
                        int var441 = (class94.field1221 - 1 - var436) / class94.field1221;
                        var437 += var441;
                        var435 += class94.field1223 * var441;
                        var436 += class94.field1221 * var441;
                        var434 += var441;
                    }
                    int var442;
                    if ((var442 = (var436 + 1 - (super.field1198 << 12) - class94.field1221) / class94.field1221) > var437) {
                        var437 = var442;
                    }
                    while (var437 < 0) {
                        int var443 = (var435 >> 12) + (var436 >> 12) * super.field1211;
                        int var444 = var434++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var444] = this.field6144[this.field6145[var443] & 255];
                            } else if (arg0 == 0) {
                                int var448 = this.field6144[this.field6145[var443] & 255];
                                int var449 = (var448 & 16711680) * class94.field1225 & -16777216;
                                int var450 = (var448 & 65280) * class94.field1208 & 16711680;
                                int var451 = (var448 & 255) * class94.field1194 & 65280;
                                var3[var444] = (var449 | var450 | var451) >>> 8;
                            } else if (arg0 == 3) {
                                int var452 = this.field6144[this.field6145[var443] & 255];
                                int var453 = class94.field1224;
                                int var454 = var452 + var453;
                                int var455 = (var452 & 16711935) + (var453 & 16711935);
                                int var456 = (var454 - var455 & 65536) + (var455 & 16777472);
                                var3[var444] = var454 - var456 | var456 - (var456 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var457 = this.field6144[this.field6145[var443] & 255];
                                int var458 = (var457 & 16711935) * class94.field1197 & -16711936;
                                int var459 = (var457 & 65280) * class94.field1197 & 16711680;
                                var3[var444] = ((var458 | var459) >>> 8) + class94.field1201;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var460 = this.field6145[var443];
                                if (var460 != 0) {
                                    var3[var444] = this.field6144[var460 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var461 = this.field6145[var443];
                                if (var461 != 0) {
                                    int var462 = this.field6144[var461 & 255];
                                    if ((class94.field1224 & 16777215) == 16777215) {
                                        int var463 = class94.field1224 >>> 24;
                                        int var464 = 256 - var463;
                                        int var465 = var3[var444];
                                        var3[var444] = ((var462 & 16711935) * var463 + (var465 & 16711935) * var464 & -16711936) + ((var462 & 65280) * var463 + (var465 & 65280) * var464 & 16711680) >> 8;
                                    } else if (class94.field1197 != 255) {
                                        int var466 = (var462 & 16711680) * class94.field1225 & -16777216;
                                        int var467 = (var462 & 65280) * class94.field1208 & 16711680;
                                        int var468 = (var462 & 255) * class94.field1194 & 65280;
                                        int var469 = (var466 | var467 | var468) >>> 8;
                                        int var470 = var3[var444];
                                        var3[var444] = ((var469 & 16711935) * class94.field1197 + (var470 & 16711935) * class94.field1220 & -16711936) + ((var469 & 65280) * class94.field1197 + (var470 & 65280) * class94.field1220 & 16711680) >> 8;
                                    } else {
                                        int var471 = (var462 & 16711680) * class94.field1225 & -16777216;
                                        int var472 = (var462 & 65280) * class94.field1208 & 16711680;
                                        int var473 = (var462 & 255) * class94.field1194 & 65280;
                                        var3[var444] = (var471 | var472 | var473) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var474 = this.field6145[var443];
                                int var475 = var474 > 0 ? this.field6144[var474] : 0;
                                int var476 = class94.field1224;
                                int var477 = var475 + var476;
                                int var478 = (var475 & 16711935) + (var476 & 16711935);
                                int var479 = (var477 - var478 & 65536) + (var478 & 16777472);
                                int var480 = var477 - var479 | var479 - (var479 >>> 8);
                                if (var475 == 0 && class94.field1197 != 255) {
                                    int var482 = var3[var444];
                                    var480 = ((var480 & 16711935) * class94.field1197 + (var482 & 16711935) * class94.field1220 & -16711936) + ((var480 & 65280) * class94.field1197 + (var482 & 65280) * class94.field1220 & 16711680) >> 8;
                                }
                                var3[var444] = var480;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var483 = this.field6145[var443];
                                if (var483 != 0) {
                                    int var484 = this.field6144[var483 & 255];
                                    int var485 = (var484 & 16711935) * class94.field1197 & -16711936;
                                    int var486 = (var484 & 65280) * class94.field1197 & 16711680;
                                    var3[var444++] = ((var485 | var486) >>> 8) + class94.field1201;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var487 = this.field6145[var443];
                                if (var487 != 0) {
                                    int var488 = this.field6144[var487 & 255];
                                    int var489 = var3[var444];
                                    int var490 = var488 + var489;
                                    int var491 = (var488 & 16711935) + (var489 & 16711935);
                                    int var492 = (var490 - var491 & 65536) + (var491 & 16777472);
                                    var3[var444] = var490 - var492 | var492 - (var492 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var493 = this.field6145[var443];
                                if (var493 != 0) {
                                    int var494 = this.field6144[var493 & 255];
                                    int var495 = (var494 & 16711680) * class94.field1225 & -16777216;
                                    int var496 = (var494 & 65280) * class94.field1208 & 16711680;
                                    int var497 = (var494 & 255) * class94.field1194 & 65280;
                                    int var498 = (var495 | var496 | var497) >>> 8;
                                    int var499 = var3[var444];
                                    int var500 = var498 + var499;
                                    int var501 = (var498 & 16711935) + (var499 & 16711935);
                                    int var502 = (var500 - var501 & 65536) + (var501 & 16777472);
                                    var3[var444] = var500 - var502 | var502 - (var502 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var503 = this.field6145[var443];
                                int var504 = var503 > 0 ? this.field6144[var503] : 0;
                                int var505 = class94.field1224;
                                int var506 = var504 + var505;
                                int var507 = (var504 & 16711935) + (var505 & 16711935);
                                int var508 = (var506 - var507 & 65536) + (var507 & 16777472);
                                int var509 = var506 - var508 | var508 - (var508 >>> 8);
                                if (var504 == 0 && class94.field1197 != 255) {
                                    int var511 = var3[var444];
                                    var509 = ((var509 & 16711935) * class94.field1197 + (var511 & 16711935) * class94.field1220 & -16711936) + ((var509 & 65280) * class94.field1197 + (var511 & 65280) * class94.field1220 & 16711680) >> 8;
                                }
                                var3[var444] = var509;
                            } else if (arg0 == 2) {
                                byte var512 = this.field6145[var443];
                                if (var512 != 0) {
                                    int var513 = this.field6144[var512 & 255];
                                    int var514 = (var513 & 16711935) * class94.field1197 & -16711936;
                                    int var515 = (var513 & 65280) * class94.field1197 & 16711680;
                                    int var516 = ((var514 | var515) >>> 8) + class94.field1201;
                                    int var517 = var3[var444];
                                    int var518 = var516 + var517;
                                    int var519 = (var516 & 16711935) + (var517 & 16711935);
                                    int var520 = (var518 - var519 & 65536) + (var519 & 16777472);
                                    var3[var444] = var518 - var520 | var520 - (var520 >>> 8);
                                }
                            }
                        }
                        var435 += class94.field1223;
                        var436 += class94.field1221;
                        ++var437;
                    }
                    ++var433;
                    class94.field1196 += class94.field1204;
                    class94.field1202 += class94.field1213;
                    class94.field1199 += class94.field1219;
                }
            }
        } else if (class94.field1221 == 0) {
            int var521 = class94.field1215;
            while (var521 < 0) {
                int var522 = class94.field1199;
                int var523 = class94.field1196 + class94.field1195;
                int var524 = class94.field1202;
                int var525 = class94.field1218;
                if (var524 >= 0 && var524 - (super.field1198 << 12) < 0) {
                    if (var523 < 0) {
                        int var526 = (class94.field1223 - 1 - var523) / class94.field1223;
                        var525 += var526;
                        var523 += class94.field1223 * var526;
                        var522 += var526;
                    }
                    int var527;
                    if ((var527 = (var523 + 1 - (super.field1211 << 12) - class94.field1223) / class94.field1223) > var525) {
                        var525 = var527;
                    }
                    while (var525 < 0) {
                        int var528 = (var523 >> 12) + (var524 >> 12) * super.field1211;
                        int var529 = var522++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var529] = this.field6144[this.field6145[var528] & 255];
                            } else if (arg0 == 0) {
                                int var533 = this.field6144[this.field6145[var528] & 255];
                                int var534 = (var533 & 16711680) * class94.field1225 & -16777216;
                                int var535 = (var533 & 65280) * class94.field1208 & 16711680;
                                int var536 = (var533 & 255) * class94.field1194 & 65280;
                                var3[var529] = (var534 | var535 | var536) >>> 8;
                            } else if (arg0 == 3) {
                                int var537 = this.field6144[this.field6145[var528] & 255];
                                int var538 = class94.field1224;
                                int var539 = var537 + var538;
                                int var540 = (var537 & 16711935) + (var538 & 16711935);
                                int var541 = (var539 - var540 & 65536) + (var540 & 16777472);
                                var3[var529] = var539 - var541 | var541 - (var541 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var542 = this.field6144[this.field6145[var528] & 255];
                                int var543 = (var542 & 16711935) * class94.field1197 & -16711936;
                                int var544 = (var542 & 65280) * class94.field1197 & 16711680;
                                var3[var529] = ((var543 | var544) >>> 8) + class94.field1201;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var545 = this.field6145[var528];
                                if (var545 != 0) {
                                    var3[var529] = this.field6144[var545 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var546 = this.field6145[var528];
                                if (var546 != 0) {
                                    int var547 = this.field6144[var546 & 255];
                                    if ((class94.field1224 & 16777215) == 16777215) {
                                        int var548 = class94.field1224 >>> 24;
                                        int var549 = 256 - var548;
                                        int var550 = var3[var529];
                                        var3[var529] = ((var547 & 16711935) * var548 + (var550 & 16711935) * var549 & -16711936) + ((var547 & 65280) * var548 + (var550 & 65280) * var549 & 16711680) >> 8;
                                    } else if (class94.field1197 != 255) {
                                        int var551 = (var547 & 16711680) * class94.field1225 & -16777216;
                                        int var552 = (var547 & 65280) * class94.field1208 & 16711680;
                                        int var553 = (var547 & 255) * class94.field1194 & 65280;
                                        int var554 = (var551 | var552 | var553) >>> 8;
                                        int var555 = var3[var529];
                                        var3[var529] = ((var554 & 16711935) * class94.field1197 + (var555 & 16711935) * class94.field1220 & -16711936) + ((var554 & 65280) * class94.field1197 + (var555 & 65280) * class94.field1220 & 16711680) >> 8;
                                    } else {
                                        int var556 = (var547 & 16711680) * class94.field1225 & -16777216;
                                        int var557 = (var547 & 65280) * class94.field1208 & 16711680;
                                        int var558 = (var547 & 255) * class94.field1194 & 65280;
                                        var3[var529] = (var556 | var557 | var558) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var559 = this.field6145[var528];
                                int var560 = var559 > 0 ? this.field6144[var559] : 0;
                                int var561 = class94.field1224;
                                int var562 = var560 + var561;
                                int var563 = (var560 & 16711935) + (var561 & 16711935);
                                int var564 = (var562 - var563 & 65536) + (var563 & 16777472);
                                int var565 = var562 - var564 | var564 - (var564 >>> 8);
                                if (var560 == 0 && class94.field1197 != 255) {
                                    int var567 = var3[var529];
                                    var565 = ((var565 & 16711935) * class94.field1197 + (var567 & 16711935) * class94.field1220 & -16711936) + ((var565 & 65280) * class94.field1197 + (var567 & 65280) * class94.field1220 & 16711680) >> 8;
                                }
                                var3[var529] = var565;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var568 = this.field6145[var528];
                                if (var568 != 0) {
                                    int var569 = this.field6144[var568 & 255];
                                    int var570 = (var569 & 16711935) * class94.field1197 & -16711936;
                                    int var571 = (var569 & 65280) * class94.field1197 & 16711680;
                                    var3[var529++] = ((var570 | var571) >>> 8) + class94.field1201;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var572 = this.field6145[var528];
                                if (var572 != 0) {
                                    int var573 = this.field6144[var572 & 255];
                                    int var574 = var3[var529];
                                    int var575 = var573 + var574;
                                    int var576 = (var573 & 16711935) + (var574 & 16711935);
                                    int var577 = (var575 - var576 & 65536) + (var576 & 16777472);
                                    var3[var529] = var575 - var577 | var577 - (var577 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var578 = this.field6145[var528];
                                if (var578 != 0) {
                                    int var579 = this.field6144[var578 & 255];
                                    int var580 = (var579 & 16711680) * class94.field1225 & -16777216;
                                    int var581 = (var579 & 65280) * class94.field1208 & 16711680;
                                    int var582 = (var579 & 255) * class94.field1194 & 65280;
                                    int var583 = (var580 | var581 | var582) >>> 8;
                                    int var584 = var3[var529];
                                    int var585 = var583 + var584;
                                    int var586 = (var583 & 16711935) + (var584 & 16711935);
                                    int var587 = (var585 - var586 & 65536) + (var586 & 16777472);
                                    var3[var529] = var585 - var587 | var587 - (var587 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var588 = this.field6145[var528];
                                int var589 = var588 > 0 ? this.field6144[var588] : 0;
                                int var590 = class94.field1224;
                                int var591 = var589 + var590;
                                int var592 = (var589 & 16711935) + (var590 & 16711935);
                                int var593 = (var591 - var592 & 65536) + (var592 & 16777472);
                                int var594 = var591 - var593 | var593 - (var593 >>> 8);
                                if (var589 == 0 && class94.field1197 != 255) {
                                    int var596 = var3[var529];
                                    var594 = ((var594 & 16711935) * class94.field1197 + (var596 & 16711935) * class94.field1220 & -16711936) + ((var594 & 65280) * class94.field1197 + (var596 & 65280) * class94.field1220 & 16711680) >> 8;
                                }
                                var3[var529] = var594;
                            } else if (arg0 == 2) {
                                byte var597 = this.field6145[var528];
                                if (var597 != 0) {
                                    int var598 = this.field6144[var597 & 255];
                                    int var599 = (var598 & 16711935) * class94.field1197 & -16711936;
                                    int var600 = (var598 & 65280) * class94.field1197 & 16711680;
                                    int var601 = ((var599 | var600) >>> 8) + class94.field1201;
                                    int var602 = var3[var529];
                                    int var603 = var601 + var602;
                                    int var604 = (var601 & 16711935) + (var602 & 16711935);
                                    int var605 = (var603 - var604 & 65536) + (var604 & 16777472);
                                    var3[var529] = var603 - var605 | var605 - (var605 >>> 8);
                                }
                            }
                        }
                        var523 += class94.field1223;
                        ++var525;
                    }
                }
                ++var521;
                class94.field1196 += class94.field1204;
                class94.field1202 += class94.field1213;
                class94.field1199 += class94.field1219;
            }
        } else if (class94.field1221 < 0) {
            for (int var606 = class94.field1215; var606 < 0; ++var606) {
                int var607 = class94.field1199;
                int var608 = class94.field1196 + class94.field1195;
                int var609 = class94.field1203 + class94.field1202;
                int var610 = class94.field1218;
                if (var608 < 0) {
                    int var611 = (class94.field1223 - 1 - var608) / class94.field1223;
                    var610 += var611;
                    var608 += class94.field1223 * var611;
                    var609 += class94.field1221 * var611;
                    var607 += var611;
                }
                int var612;
                if ((var612 = (var608 + 1 - (super.field1211 << 12) - class94.field1223) / class94.field1223) > var610) {
                    var610 = var612;
                }
                int var613;
                if ((var613 = var609 - (super.field1198 << 12)) >= 0) {
                    int var614 = (class94.field1221 - var613) / class94.field1221;
                    var610 += var614;
                    var608 += class94.field1223 * var614;
                    var609 += class94.field1221 * var614;
                    var607 += var614;
                }
                int var615;
                if ((var615 = (var609 - class94.field1221) / class94.field1221) > var610) {
                    var610 = var615;
                }
                while (var610 < 0) {
                    int var616 = (var608 >> 12) + (var609 >> 12) * super.field1211;
                    int var617 = var607++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var617] = this.field6144[this.field6145[var616] & 255];
                        } else if (arg0 == 0) {
                            int var621 = this.field6144[this.field6145[var616] & 255];
                            int var622 = (var621 & 16711680) * class94.field1225 & -16777216;
                            int var623 = (var621 & 65280) * class94.field1208 & 16711680;
                            int var624 = (var621 & 255) * class94.field1194 & 65280;
                            var3[var617] = (var622 | var623 | var624) >>> 8;
                        } else if (arg0 == 3) {
                            int var625 = this.field6144[this.field6145[var616] & 255];
                            int var626 = class94.field1224;
                            int var627 = var625 + var626;
                            int var628 = (var625 & 16711935) + (var626 & 16711935);
                            int var629 = (var627 - var628 & 65536) + (var628 & 16777472);
                            var3[var617] = var627 - var629 | var629 - (var629 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var630 = this.field6144[this.field6145[var616] & 255];
                            int var631 = (var630 & 16711935) * class94.field1197 & -16711936;
                            int var632 = (var630 & 65280) * class94.field1197 & 16711680;
                            var3[var617] = ((var631 | var632) >>> 8) + class94.field1201;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            byte var633 = this.field6145[var616];
                            if (var633 != 0) {
                                var3[var617] = this.field6144[var633 & 255];
                            }
                        } else if (arg0 == 0) {
                            byte var634 = this.field6145[var616];
                            if (var634 != 0) {
                                int var635 = this.field6144[var634 & 255];
                                if ((class94.field1224 & 16777215) == 16777215) {
                                    int var636 = class94.field1224 >>> 24;
                                    int var637 = 256 - var636;
                                    int var638 = var3[var617];
                                    var3[var617] = ((var635 & 16711935) * var636 + (var638 & 16711935) * var637 & -16711936) + ((var635 & 65280) * var636 + (var638 & 65280) * var637 & 16711680) >> 8;
                                } else if (class94.field1197 != 255) {
                                    int var639 = (var635 & 16711680) * class94.field1225 & -16777216;
                                    int var640 = (var635 & 65280) * class94.field1208 & 16711680;
                                    int var641 = (var635 & 255) * class94.field1194 & 65280;
                                    int var642 = (var639 | var640 | var641) >>> 8;
                                    int var643 = var3[var617];
                                    var3[var617] = ((var642 & 16711935) * class94.field1197 + (var643 & 16711935) * class94.field1220 & -16711936) + ((var642 & 65280) * class94.field1197 + (var643 & 65280) * class94.field1220 & 16711680) >> 8;
                                } else {
                                    int var644 = (var635 & 16711680) * class94.field1225 & -16777216;
                                    int var645 = (var635 & 65280) * class94.field1208 & 16711680;
                                    int var646 = (var635 & 255) * class94.field1194 & 65280;
                                    var3[var617] = (var644 | var645 | var646) >>> 8;
                                }
                            }
                        } else if (arg0 == 3) {
                            byte var647 = this.field6145[var616];
                            int var648 = var647 > 0 ? this.field6144[var647] : 0;
                            int var649 = class94.field1224;
                            int var650 = var648 + var649;
                            int var651 = (var648 & 16711935) + (var649 & 16711935);
                            int var652 = (var650 - var651 & 65536) + (var651 & 16777472);
                            int var653 = var650 - var652 | var652 - (var652 >>> 8);
                            if (var648 == 0 && class94.field1197 != 255) {
                                int var655 = var3[var617];
                                var653 = ((var653 & 16711935) * class94.field1197 + (var655 & 16711935) * class94.field1220 & -16711936) + ((var653 & 65280) * class94.field1197 + (var655 & 65280) * class94.field1220 & 16711680) >> 8;
                            }
                            var3[var617] = var653;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            byte var656 = this.field6145[var616];
                            if (var656 != 0) {
                                int var657 = this.field6144[var656 & 255];
                                int var658 = (var657 & 16711935) * class94.field1197 & -16711936;
                                int var659 = (var657 & 65280) * class94.field1197 & 16711680;
                                var3[var617++] = ((var658 | var659) >>> 8) + class94.field1201;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            byte var660 = this.field6145[var616];
                            if (var660 != 0) {
                                int var661 = this.field6144[var660 & 255];
                                int var662 = var3[var617];
                                int var663 = var661 + var662;
                                int var664 = (var661 & 16711935) + (var662 & 16711935);
                                int var665 = (var663 - var664 & 65536) + (var664 & 16777472);
                                var3[var617] = var663 - var665 | var665 - (var665 >>> 8);
                            }
                        } else if (arg0 == 0) {
                            byte var666 = this.field6145[var616];
                            if (var666 != 0) {
                                int var667 = this.field6144[var666 & 255];
                                int var668 = (var667 & 16711680) * class94.field1225 & -16777216;
                                int var669 = (var667 & 65280) * class94.field1208 & 16711680;
                                int var670 = (var667 & 255) * class94.field1194 & 65280;
                                int var671 = (var668 | var669 | var670) >>> 8;
                                int var672 = var3[var617];
                                int var673 = var671 + var672;
                                int var674 = (var671 & 16711935) + (var672 & 16711935);
                                int var675 = (var673 - var674 & 65536) + (var674 & 16777472);
                                var3[var617] = var673 - var675 | var675 - (var675 >>> 8);
                            }
                        } else if (arg0 == 3) {
                            byte var676 = this.field6145[var616];
                            int var677 = var676 > 0 ? this.field6144[var676] : 0;
                            int var678 = class94.field1224;
                            int var679 = var677 + var678;
                            int var680 = (var677 & 16711935) + (var678 & 16711935);
                            int var681 = (var679 - var680 & 65536) + (var680 & 16777472);
                            int var682 = var679 - var681 | var681 - (var681 >>> 8);
                            if (var677 == 0 && class94.field1197 != 255) {
                                int var684 = var3[var617];
                                var682 = ((var682 & 16711935) * class94.field1197 + (var684 & 16711935) * class94.field1220 & -16711936) + ((var682 & 65280) * class94.field1197 + (var684 & 65280) * class94.field1220 & 16711680) >> 8;
                            }
                            var3[var617] = var682;
                        } else if (arg0 == 2) {
                            byte var685 = this.field6145[var616];
                            if (var685 != 0) {
                                int var686 = this.field6144[var685 & 255];
                                int var687 = (var686 & 16711935) * class94.field1197 & -16711936;
                                int var688 = (var686 & 65280) * class94.field1197 & 16711680;
                                int var689 = ((var687 | var688) >>> 8) + class94.field1201;
                                int var690 = var3[var617];
                                int var691 = var689 + var690;
                                int var692 = (var689 & 16711935) + (var690 & 16711935);
                                int var693 = (var691 - var692 & 65536) + (var692 & 16777472);
                                var3[var617] = var691 - var693 | var693 - (var693 >>> 8);
                            }
                        }
                    }
                    var608 += class94.field1223;
                    var609 += class94.field1221;
                    ++var610;
                }
                class94.field1196 += class94.field1204;
                class94.field1202 += class94.field1213;
                class94.field1199 += class94.field1219;
            }
        } else {
            for (int var694 = class94.field1215; var694 < 0; ++var694) {
                int var695 = class94.field1199;
                int var696 = class94.field1196 + class94.field1195;
                int var697 = class94.field1203 + class94.field1202;
                int var698 = class94.field1218;
                if (var696 < 0) {
                    int var699 = (class94.field1223 - 1 - var696) / class94.field1223;
                    var698 += var699;
                    var696 += class94.field1223 * var699;
                    var697 += class94.field1221 * var699;
                    var695 += var699;
                }
                int var700;
                if ((var700 = (var696 + 1 - (super.field1211 << 12) - class94.field1223) / class94.field1223) > var698) {
                    var698 = var700;
                }
                if (var697 < 0) {
                    int var701 = (class94.field1221 - 1 - var697) / class94.field1221;
                    var698 += var701;
                    var696 += class94.field1223 * var701;
                    var697 += class94.field1221 * var701;
                    var695 += var701;
                }
                int var702;
                if ((var702 = (var697 + 1 - (super.field1198 << 12) - class94.field1221) / class94.field1221) > var698) {
                    var698 = var702;
                }
                while (var698 < 0) {
                    int var703 = (var696 >> 12) + (var697 >> 12) * super.field1211;
                    int var704 = var695++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var704] = this.field6144[this.field6145[var703] & 255];
                        } else if (arg0 == 0) {
                            int var708 = this.field6144[this.field6145[var703] & 255];
                            int var709 = (var708 & 16711680) * class94.field1225 & -16777216;
                            int var710 = (var708 & 65280) * class94.field1208 & 16711680;
                            int var711 = (var708 & 255) * class94.field1194 & 65280;
                            var3[var704] = (var709 | var710 | var711) >>> 8;
                        } else if (arg0 == 3) {
                            int var712 = this.field6144[this.field6145[var703] & 255];
                            int var713 = class94.field1224;
                            int var714 = var712 + var713;
                            int var715 = (var712 & 16711935) + (var713 & 16711935);
                            int var716 = (var714 - var715 & 65536) + (var715 & 16777472);
                            var3[var704] = var714 - var716 | var716 - (var716 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var717 = this.field6144[this.field6145[var703] & 255];
                            int var718 = (var717 & 16711935) * class94.field1197 & -16711936;
                            int var719 = (var717 & 65280) * class94.field1197 & 16711680;
                            var3[var704] = ((var718 | var719) >>> 8) + class94.field1201;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            byte var720 = this.field6145[var703];
                            if (var720 != 0) {
                                var3[var704] = this.field6144[var720 & 255];
                            }
                        } else if (arg0 == 0) {
                            byte var721 = this.field6145[var703];
                            if (var721 != 0) {
                                int var722 = this.field6144[var721 & 255];
                                if ((class94.field1224 & 16777215) == 16777215) {
                                    int var723 = class94.field1224 >>> 24;
                                    int var724 = 256 - var723;
                                    int var725 = var3[var704];
                                    var3[var704] = ((var722 & 16711935) * var723 + (var725 & 16711935) * var724 & -16711936) + ((var722 & 65280) * var723 + (var725 & 65280) * var724 & 16711680) >> 8;
                                } else if (class94.field1197 != 255) {
                                    int var726 = (var722 & 16711680) * class94.field1225 & -16777216;
                                    int var727 = (var722 & 65280) * class94.field1208 & 16711680;
                                    int var728 = (var722 & 255) * class94.field1194 & 65280;
                                    int var729 = (var726 | var727 | var728) >>> 8;
                                    int var730 = var3[var704];
                                    var3[var704] = ((var729 & 16711935) * class94.field1197 + (var730 & 16711935) * class94.field1220 & -16711936) + ((var729 & 65280) * class94.field1197 + (var730 & 65280) * class94.field1220 & 16711680) >> 8;
                                } else {
                                    int var731 = (var722 & 16711680) * class94.field1225 & -16777216;
                                    int var732 = (var722 & 65280) * class94.field1208 & 16711680;
                                    int var733 = (var722 & 255) * class94.field1194 & 65280;
                                    var3[var704] = (var731 | var732 | var733) >>> 8;
                                }
                            }
                        } else if (arg0 == 3) {
                            byte var734 = this.field6145[var703];
                            int var735 = var734 > 0 ? this.field6144[var734] : 0;
                            int var736 = class94.field1224;
                            int var737 = var735 + var736;
                            int var738 = (var735 & 16711935) + (var736 & 16711935);
                            int var739 = (var737 - var738 & 65536) + (var738 & 16777472);
                            int var740 = var737 - var739 | var739 - (var739 >>> 8);
                            if (var735 == 0 && class94.field1197 != 255) {
                                int var742 = var3[var704];
                                var740 = ((var740 & 16711935) * class94.field1197 + (var742 & 16711935) * class94.field1220 & -16711936) + ((var740 & 65280) * class94.field1197 + (var742 & 65280) * class94.field1220 & 16711680) >> 8;
                            }
                            var3[var704] = var740;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            byte var743 = this.field6145[var703];
                            if (var743 != 0) {
                                int var744 = this.field6144[var743 & 255];
                                int var745 = (var744 & 16711935) * class94.field1197 & -16711936;
                                int var746 = (var744 & 65280) * class94.field1197 & 16711680;
                                var3[var704++] = ((var745 | var746) >>> 8) + class94.field1201;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            byte var747 = this.field6145[var703];
                            if (var747 != 0) {
                                int var748 = this.field6144[var747 & 255];
                                int var749 = var3[var704];
                                int var750 = var748 + var749;
                                int var751 = (var748 & 16711935) + (var749 & 16711935);
                                int var752 = (var750 - var751 & 65536) + (var751 & 16777472);
                                var3[var704] = var750 - var752 | var752 - (var752 >>> 8);
                            }
                        } else if (arg0 == 0) {
                            byte var753 = this.field6145[var703];
                            if (var753 != 0) {
                                int var754 = this.field6144[var753 & 255];
                                int var755 = (var754 & 16711680) * class94.field1225 & -16777216;
                                int var756 = (var754 & 65280) * class94.field1208 & 16711680;
                                int var757 = (var754 & 255) * class94.field1194 & 65280;
                                int var758 = (var755 | var756 | var757) >>> 8;
                                int var759 = var3[var704];
                                int var760 = var758 + var759;
                                int var761 = (var758 & 16711935) + (var759 & 16711935);
                                int var762 = (var760 - var761 & 65536) + (var761 & 16777472);
                                var3[var704] = var760 - var762 | var762 - (var762 >>> 8);
                            }
                        } else if (arg0 == 3) {
                            byte var763 = this.field6145[var703];
                            int var764 = var763 > 0 ? this.field6144[var763] : 0;
                            int var765 = class94.field1224;
                            int var766 = var764 + var765;
                            int var767 = (var764 & 16711935) + (var765 & 16711935);
                            int var768 = (var766 - var767 & 65536) + (var767 & 16777472);
                            int var769 = var766 - var768 | var768 - (var768 >>> 8);
                            if (var764 == 0 && class94.field1197 != 255) {
                                int var771 = var3[var704];
                                var769 = ((var769 & 16711935) * class94.field1197 + (var771 & 16711935) * class94.field1220 & -16711936) + ((var769 & 65280) * class94.field1197 + (var771 & 65280) * class94.field1220 & 16711680) >> 8;
                            }
                            var3[var704] = var769;
                        } else if (arg0 == 2) {
                            byte var772 = this.field6145[var703];
                            if (var772 != 0) {
                                int var773 = this.field6144[var772 & 255];
                                int var774 = (var773 & 16711935) * class94.field1197 & -16711936;
                                int var775 = (var773 & 65280) * class94.field1197 & 16711680;
                                int var776 = ((var774 | var775) >>> 8) + class94.field1201;
                                int var777 = var3[var704];
                                int var778 = var776 + var777;
                                int var779 = (var776 & 16711935) + (var777 & 16711935);
                                int var780 = (var778 - var779 & 65536) + (var779 & 16777472);
                                var3[var704] = var778 - var780 | var780 - (var780 >>> 8);
                            }
                        }
                    }
                    var696 += class94.field1223;
                    var697 += class94.field1221;
                    ++var698;
                }
                class94.field1196 += class94.field1204;
                class94.field1202 += class94.field1213;
                class94.field1199 += class94.field1219;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([I[III)V")
    public final void method198(int[] arg0, int[] arg1, int arg2, int arg3) {
        int[] var5 = super.field1210.field594;
        if (class94.field1223 == 0) {
            if (class94.field1221 == 0) {
                int var6 = class94.field1215;
                while (var6 < 0) {
                    int var7 = arg3 + var6;
                    if (var7 >= 0) {
                        if (var7 >= arg0.length) {
                            return;
                        }
                        int var8 = class94.field1199;
                        int var9 = class94.field1196;
                        int var10 = class94.field1202;
                        int var11 = class94.field1218;
                        if (var9 >= 0 && var10 >= 0 && var9 - (super.field1211 << 12) < 0 && var10 - (super.field1198 << 12) < 0) {
                            int var12 = arg0[var7] - arg2;
                            int var13 = -arg1[var7];
                            int var14 = var12 - (var8 - class94.field1199);
                            if (var14 > 0) {
                                var8 += var14;
                                var11 += var14;
                                var9 += class94.field1223 * var14;
                                var10 += class94.field1221 * var14;
                            } else {
                                var13 -= var14;
                            }
                            if (var11 < var13) {
                                var11 = var13;
                            }
                            while (var11 < 0) {
                                byte var15 = this.field6145[(var9 >> 12) + (var10 >> 12) * super.field1211];
                                if (var15 != 0) {
                                    var5[var8++] = this.field6144[var15 & 255];
                                } else {
                                    ++var8;
                                }
                                ++var11;
                            }
                        }
                    }
                    ++var6;
                    class94.field1199 += class94.field1219;
                }
            } else if (class94.field1221 < 0) {
                int var16 = class94.field1215;
                while (var16 < 0) {
                    int var17 = arg3 + var16;
                    if (var17 >= 0) {
                        if (var17 >= arg0.length) {
                            return;
                        }
                        int var18 = class94.field1199;
                        int var19 = class94.field1196;
                        int var20 = class94.field1203 + class94.field1202;
                        int var21 = class94.field1218;
                        if (var19 >= 0 && var19 - (super.field1211 << 12) < 0) {
                            int var22;
                            if ((var22 = var20 - (super.field1198 << 12)) >= 0) {
                                int var23 = (class94.field1221 - var22) / class94.field1221;
                                var21 += var23;
                                var20 += class94.field1221 * var23;
                                var18 += var23;
                            }
                            int var24;
                            if ((var24 = (var20 - class94.field1221) / class94.field1221) > var21) {
                                var21 = var24;
                            }
                            int var25 = arg0[var17] - arg2;
                            int var26 = -arg1[var17];
                            int var27 = var25 - (var18 - class94.field1199);
                            if (var27 > 0) {
                                var18 += var27;
                                var21 += var27;
                                var19 += class94.field1223 * var27;
                                var20 += class94.field1221 * var27;
                            } else {
                                var26 -= var27;
                            }
                            if (var21 < var26) {
                                var21 = var26;
                            }
                            while (var21 < 0) {
                                byte var28 = this.field6145[(var19 >> 12) + (var20 >> 12) * super.field1211];
                                if (var28 != 0) {
                                    var5[var18++] = this.field6144[var28 & 255];
                                } else {
                                    ++var18;
                                }
                                var20 += class94.field1221;
                                ++var21;
                            }
                        }
                    }
                    ++var16;
                    class94.field1196 += class94.field1204;
                    class94.field1199 += class94.field1219;
                }
            } else {
                int var29 = class94.field1215;
                while (var29 < 0) {
                    int var30 = arg3 + var29;
                    if (var30 >= 0) {
                        if (var30 >= arg0.length) {
                            return;
                        }
                        int var31 = class94.field1199;
                        int var32 = class94.field1196;
                        int var33 = class94.field1203 + class94.field1202;
                        int var34 = class94.field1218;
                        if (var32 >= 0 && var32 - (super.field1211 << 12) < 0) {
                            if (var33 < 0) {
                                int var35 = (class94.field1221 - 1 - var33) / class94.field1221;
                                var34 += var35;
                                var33 += class94.field1221 * var35;
                                var31 += var35;
                            }
                            int var36;
                            if ((var36 = (var33 + 1 - (super.field1198 << 12) - class94.field1221) / class94.field1221) > var34) {
                                var34 = var36;
                            }
                            int var37 = arg0[var30] - arg2;
                            int var38 = -arg1[var30];
                            int var39 = var37 - (var31 - class94.field1199);
                            if (var39 > 0) {
                                var31 += var39;
                                var34 += var39;
                                var32 += class94.field1223 * var39;
                                var33 += class94.field1221 * var39;
                            } else {
                                var38 -= var39;
                            }
                            if (var34 < var38) {
                                var34 = var38;
                            }
                            while (var34 < 0) {
                                byte var40 = this.field6145[(var32 >> 12) + (var33 >> 12) * super.field1211];
                                if (var40 != 0) {
                                    var5[var31++] = this.field6144[var40 & 255];
                                } else {
                                    ++var31;
                                }
                                var33 += class94.field1221;
                                ++var34;
                            }
                        }
                    }
                    ++var29;
                    class94.field1196 += class94.field1204;
                    class94.field1199 += class94.field1219;
                }
            }
        } else if (class94.field1223 < 0) {
            if (class94.field1221 == 0) {
                int var41 = class94.field1215;
                while (var41 < 0) {
                    int var42 = arg3 + var41;
                    if (var42 >= 0) {
                        if (var42 >= arg0.length) {
                            return;
                        }
                        int var43 = class94.field1199;
                        int var44 = class94.field1196 + class94.field1195;
                        int var45 = class94.field1202;
                        int var46 = class94.field1218;
                        if (var45 >= 0 && var45 - (super.field1198 << 12) < 0) {
                            int var47;
                            if ((var47 = var44 - (super.field1211 << 12)) >= 0) {
                                int var48 = (class94.field1223 - var47) / class94.field1223;
                                var46 += var48;
                                var44 += class94.field1223 * var48;
                                var43 += var48;
                            }
                            int var49;
                            if ((var49 = (var44 - class94.field1223) / class94.field1223) > var46) {
                                var46 = var49;
                            }
                            int var50 = arg0[var42] - arg2;
                            int var51 = -arg1[var42];
                            int var52 = var50 - (var43 - class94.field1199);
                            if (var52 > 0) {
                                var43 += var52;
                                var46 += var52;
                                var44 += class94.field1223 * var52;
                                var45 += class94.field1221 * var52;
                            } else {
                                var51 -= var52;
                            }
                            if (var46 < var51) {
                                var46 = var51;
                            }
                            while (var46 < 0) {
                                byte var53 = this.field6145[(var44 >> 12) + (var45 >> 12) * super.field1211];
                                if (var53 != 0) {
                                    var5[var43++] = this.field6144[var53 & 255];
                                } else {
                                    ++var43;
                                }
                                var44 += class94.field1223;
                                ++var46;
                            }
                        }
                    }
                    ++var41;
                    class94.field1202 += class94.field1213;
                    class94.field1199 += class94.field1219;
                }
            } else if (class94.field1221 < 0) {
                int var54 = class94.field1215;
                while (var54 < 0) {
                    int var55 = arg3 + var54;
                    if (var55 >= 0) {
                        if (var55 >= arg0.length) {
                            return;
                        }
                        int var56 = class94.field1199;
                        int var57 = class94.field1196 + class94.field1195;
                        int var58 = class94.field1203 + class94.field1202;
                        int var59 = class94.field1218;
                        int var60;
                        if ((var60 = var57 - (super.field1211 << 12)) >= 0) {
                            int var61 = (class94.field1223 - var60) / class94.field1223;
                            var59 += var61;
                            var57 += class94.field1223 * var61;
                            var58 += class94.field1221 * var61;
                            var56 += var61;
                        }
                        int var62;
                        if ((var62 = (var57 - class94.field1223) / class94.field1223) > var59) {
                            var59 = var62;
                        }
                        int var63;
                        if ((var63 = var58 - (super.field1198 << 12)) >= 0) {
                            int var64 = (class94.field1221 - var63) / class94.field1221;
                            var59 += var64;
                            var57 += class94.field1223 * var64;
                            var58 += class94.field1221 * var64;
                            var56 += var64;
                        }
                        int var65;
                        if ((var65 = (var58 - class94.field1221) / class94.field1221) > var59) {
                            var59 = var65;
                        }
                        int var66 = arg0[var55] - arg2;
                        int var67 = -arg1[var55];
                        int var68 = var66 - (var56 - class94.field1199);
                        if (var68 > 0) {
                            var56 += var68;
                            var59 += var68;
                            var57 += class94.field1223 * var68;
                            var58 += class94.field1221 * var68;
                        } else {
                            var67 -= var68;
                        }
                        if (var59 < var67) {
                            var59 = var67;
                        }
                        while (var59 < 0) {
                            byte var69 = this.field6145[(var57 >> 12) + (var58 >> 12) * super.field1211];
                            if (var69 != 0) {
                                var5[var56++] = this.field6144[var69 & 255];
                            } else {
                                ++var56;
                            }
                            var57 += class94.field1223;
                            var58 += class94.field1221;
                            ++var59;
                        }
                    }
                    ++var54;
                    class94.field1196 += class94.field1204;
                    class94.field1202 += class94.field1213;
                    class94.field1199 += class94.field1219;
                }
            } else {
                int var70 = class94.field1215;
                while (var70 < 0) {
                    int var71 = arg3 + var70;
                    if (var71 >= 0) {
                        if (var71 >= arg0.length) {
                            return;
                        }
                        int var72 = class94.field1199;
                        int var73 = class94.field1196 + class94.field1195;
                        int var74 = class94.field1203 + class94.field1202;
                        int var75 = class94.field1218;
                        int var76;
                        if ((var76 = var73 - (super.field1211 << 12)) >= 0) {
                            int var77 = (class94.field1223 - var76) / class94.field1223;
                            var75 += var77;
                            var73 += class94.field1223 * var77;
                            var74 += class94.field1221 * var77;
                            var72 += var77;
                        }
                        int var78;
                        if ((var78 = (var73 - class94.field1223) / class94.field1223) > var75) {
                            var75 = var78;
                        }
                        if (var74 < 0) {
                            int var79 = (class94.field1221 - 1 - var74) / class94.field1221;
                            var75 += var79;
                            var73 += class94.field1223 * var79;
                            var74 += class94.field1221 * var79;
                            var72 += var79;
                        }
                        int var80;
                        if ((var80 = (var74 + 1 - (super.field1198 << 12) - class94.field1221) / class94.field1221) > var75) {
                            var75 = var80;
                        }
                        int var81 = arg0[var71] - arg2;
                        int var82 = -arg1[var71];
                        int var83 = var81 - (var72 - class94.field1199);
                        if (var83 > 0) {
                            var72 += var83;
                            var75 += var83;
                            var73 += class94.field1223 * var83;
                            var74 += class94.field1221 * var83;
                        } else {
                            var82 -= var83;
                        }
                        if (var75 < var82) {
                            var75 = var82;
                        }
                        while (var75 < 0) {
                            byte var84 = this.field6145[(var73 >> 12) + (var74 >> 12) * super.field1211];
                            if (var84 != 0) {
                                var5[var72++] = this.field6144[var84 & 255];
                            } else {
                                ++var72;
                            }
                            var73 += class94.field1223;
                            var74 += class94.field1221;
                            ++var75;
                        }
                    }
                    ++var70;
                    class94.field1196 += class94.field1204;
                    class94.field1202 += class94.field1213;
                    class94.field1199 += class94.field1219;
                }
            }
        } else if (class94.field1221 == 0) {
            int var85 = class94.field1215;
            while (var85 < 0) {
                int var86 = arg3 + var85;
                if (var86 >= 0) {
                    if (var86 >= arg0.length) {
                        return;
                    }
                    int var87 = class94.field1199;
                    int var88 = class94.field1196 + class94.field1195;
                    int var89 = class94.field1202;
                    int var90 = class94.field1218;
                    if (var89 >= 0 && var89 - (super.field1198 << 12) < 0) {
                        if (var88 < 0) {
                            int var91 = (class94.field1223 - 1 - var88) / class94.field1223;
                            var90 += var91;
                            var88 += class94.field1223 * var91;
                            var87 += var91;
                        }
                        int var92;
                        if ((var92 = (var88 + 1 - (super.field1211 << 12) - class94.field1223) / class94.field1223) > var90) {
                            var90 = var92;
                        }
                        int var93 = arg0[var86] - arg2;
                        int var94 = -arg1[var86];
                        int var95 = var93 - (var87 - class94.field1199);
                        if (var95 > 0) {
                            var87 += var95;
                            var90 += var95;
                            var88 += class94.field1223 * var95;
                            var89 += class94.field1221 * var95;
                        } else {
                            var94 -= var95;
                        }
                        if (var90 < var94) {
                            var90 = var94;
                        }
                        while (var90 < 0) {
                            byte var96 = this.field6145[(var88 >> 12) + (var89 >> 12) * super.field1211];
                            if (var96 != 0) {
                                var5[var87++] = this.field6144[var96 & 255];
                            } else {
                                ++var87;
                            }
                            var88 += class94.field1223;
                            ++var90;
                        }
                    }
                }
                ++var85;
                class94.field1196 += class94.field1204;
                class94.field1202 += class94.field1213;
                class94.field1199 += class94.field1219;
            }
        } else if (class94.field1221 < 0) {
            int var97 = class94.field1215;
            while (var97 < 0) {
                int var98 = arg3 + var97;
                if (var98 >= 0) {
                    if (var98 >= arg0.length) {
                        return;
                    }
                    int var99 = class94.field1199;
                    int var100 = class94.field1196 + class94.field1195;
                    int var101 = class94.field1203 + class94.field1202;
                    int var102 = class94.field1218;
                    if (var100 < 0) {
                        int var103 = (class94.field1223 - 1 - var100) / class94.field1223;
                        var102 += var103;
                        var100 += class94.field1223 * var103;
                        var101 += class94.field1221 * var103;
                        var99 += var103;
                    }
                    int var104;
                    if ((var104 = (var100 + 1 - (super.field1211 << 12) - class94.field1223) / class94.field1223) > var102) {
                        var102 = var104;
                    }
                    int var105;
                    if ((var105 = var101 - (super.field1198 << 12)) >= 0) {
                        int var106 = (class94.field1221 - var105) / class94.field1221;
                        var102 += var106;
                        var100 += class94.field1223 * var106;
                        var101 += class94.field1221 * var106;
                        var99 += var106;
                    }
                    int var107;
                    if ((var107 = (var101 - class94.field1221) / class94.field1221) > var102) {
                        var102 = var107;
                    }
                    int var108 = arg0[var98] - arg2;
                    int var109 = -arg1[var98];
                    int var110 = var108 - (var99 - class94.field1199);
                    if (var110 > 0) {
                        var99 += var110;
                        var102 += var110;
                        var100 += class94.field1223 * var110;
                        var101 += class94.field1221 * var110;
                    } else {
                        var109 -= var110;
                    }
                    if (var102 < var109) {
                        var102 = var109;
                    }
                    while (var102 < 0) {
                        byte var111 = this.field6145[(var100 >> 12) + (var101 >> 12) * super.field1211];
                        if (var111 != 0) {
                            var5[var99++] = this.field6144[var111 & 255];
                        } else {
                            ++var99;
                        }
                        var100 += class94.field1223;
                        var101 += class94.field1221;
                        ++var102;
                    }
                }
                ++var97;
                class94.field1196 += class94.field1204;
                class94.field1202 += class94.field1213;
                class94.field1199 += class94.field1219;
            }
        } else {
            int var112 = class94.field1215;
            while (var112 < 0) {
                int var113 = arg3 + var112;
                if (var113 >= 0) {
                    if (var113 >= arg0.length) {
                        return;
                    }
                    int var114 = class94.field1199;
                    int var115 = class94.field1196 + class94.field1195;
                    int var116 = class94.field1203 + class94.field1202;
                    int var117 = class94.field1218;
                    if (var115 < 0) {
                        int var118 = (class94.field1223 - 1 - var115) / class94.field1223;
                        var117 += var118;
                        var115 += class94.field1223 * var118;
                        var116 += class94.field1221 * var118;
                        var114 += var118;
                    }
                    int var119;
                    if ((var119 = (var115 + 1 - (super.field1211 << 12) - class94.field1223) / class94.field1223) > var117) {
                        var117 = var119;
                    }
                    if (var116 < 0) {
                        int var120 = (class94.field1221 - 1 - var116) / class94.field1221;
                        var117 += var120;
                        var115 += class94.field1223 * var120;
                        var116 += class94.field1221 * var120;
                        var114 += var120;
                    }
                    int var121;
                    if ((var121 = (var116 + 1 - (super.field1198 << 12) - class94.field1221) / class94.field1221) > var117) {
                        var117 = var121;
                    }
                    int var122 = arg0[var113] - arg2;
                    int var123 = -arg1[var113];
                    int var124 = var122 - (var114 - class94.field1199);
                    if (var124 > 0) {
                        var114 += var124;
                        var117 += var124;
                        var115 += class94.field1223 * var124;
                        var116 += class94.field1221 * var124;
                    } else {
                        var123 -= var124;
                    }
                    if (var117 < var123) {
                        var117 = var123;
                    }
                    while (var117 < 0) {
                        byte var125 = this.field6145[(var115 >> 12) + (var116 >> 12) * super.field1211];
                        if (var125 != 0) {
                            var5[var114++] = this.field6144[var125 & 255];
                        } else {
                            ++var114;
                        }
                        var115 += class94.field1223;
                        var116 += class94.field1221;
                        ++var117;
                    }
                }
                ++var112;
                class94.field1196 += class94.field1204;
                class94.field1202 += class94.field1213;
                class94.field1199 += class94.field1219;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "oa", descriptor = "(III)V")
    public final void method160(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }
}
