import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class623 extends class640 {

    @OriginalMember(owner = "client!lga", name = "I", descriptor = "[B")
    private byte[] field8712;

    @OriginalMember(owner = "client!lga", name = "H", descriptor = "[I")
    private int[] field8711;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIIIIII)V", line = 4)
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 > 0 && arg4 > 0) {
            int var10 = arg2 << 8;
            int var11 = 0;
            int var12 = 0;
            int var13 = super.field9025 + super.field9005 + super.field9011;
            int var14 = super.field9009 + super.field9000 + super.field9023;
            int var15 = (var13 << 16) / arg3;
            int var16 = (var14 << 16) / arg4;
            if (super.field9025 > 0) {
                int var17 = ((super.field9025 << 16) + var15 - 1) / var15;
                arg0 += var17;
                var11 += var15 * var17 - (super.field9025 << 16);
            }
            if (super.field9000 > 0) {
                int var18 = ((super.field9000 << 16) + var16 - 1) / var16;
                arg1 += var18;
                var12 += var16 * var18 - (super.field9000 << 16);
            }
            if (super.field9005 < var13) {
                arg3 = ((super.field9005 << 16) - var11 + var15 - 1) / var15;
            }
            if (super.field9009 < var14) {
                arg4 = ((super.field9009 << 16) - var12 + var16 - 1) / var16;
            }
            int var19 = super.field8996.field8081 * arg1 + arg0;
            int var20 = super.field8996.field8081 - arg3;
            if (arg1 + arg4 > super.field8996.field8107) {
                arg4 -= arg1 + arg4 - super.field8996.field8107;
            }
            if (arg1 < super.field8996.field8073) {
                int var21 = super.field8996.field8073 - arg1;
                arg4 -= var21;
                var19 += super.field8996.field8081 * var21;
                var12 += var16 * var21;
            }
            if (arg0 + arg3 > super.field8996.field8080) {
                int var22 = arg0 + arg3 - super.field8996.field8080;
                arg3 -= var22;
                var20 += var22;
            }
            if (arg0 < super.field8996.field8103) {
                int var23 = super.field8996.field8103 - arg0;
                arg3 -= var23;
                var19 += var23;
                var11 += var15 * var23;
                var20 += var23;
            }
            int[] var24 = super.field8996.field8099;
            int[] var25 = super.field8996.field8086;
            if (arg7 == 0) {
                if (arg5 == 1) {
                    int var26 = var11;
                    for (int var27 = -arg4; var27 < 0; ++var27) {
                        int var28 = (var12 >> 16) * super.field9005;
                        for (int var29 = -arg3; var29 < 0; ++var29) {
                            if (var10 < var24[var19]) {
                                var25[var19] = this.field8711[this.field8712[(var11 >> 16) + var28] & 255];
                            }
                            var11 += var15;
                            ++var19;
                        }
                        var12 += var16;
                        var11 = var26;
                        var19 += var20;
                    }
                } else if (arg5 == 0) {
                    int var30 = (arg6 & 16711680) >> 16;
                    int var31 = (arg6 & 65280) >> 8;
                    int var32 = arg6 & 255;
                    int var33 = var11;
                    for (int var34 = -arg4; var34 < 0; ++var34) {
                        int var35 = (var12 >> 16) * super.field9005;
                        for (int var36 = -arg3; var36 < 0; ++var36) {
                            if (var10 < var24[var19]) {
                                int var37 = this.field8711[this.field8712[(var11 >> 16) + var35] & 255];
                                int var38 = (var37 & 16711680) * var30 & -16777216;
                                int var39 = (var37 & 65280) * var31 & 16711680;
                                int var40 = (var37 & 255) * var32 & 65280;
                                var25[var19] = (var38 | var39 | var40) >>> 8;
                            }
                            var11 += var15;
                            ++var19;
                        }
                        var12 += var16;
                        var11 = var33;
                        var19 += var20;
                    }
                } else if (arg5 == 3) {
                    int var41 = var11;
                    for (int var42 = -arg4; var42 < 0; ++var42) {
                        int var43 = (var12 >> 16) * super.field9005;
                        for (int var44 = -arg3; var44 < 0; ++var44) {
                            if (var10 < var24[var19]) {
                                byte var45 = this.field8712[(var11 >> 16) + var43];
                                int var46 = var45 > 0 ? this.field8711[var45] : 0;
                                int var47 = arg6 + var46;
                                int var48 = (arg6 & 16711935) + (var46 & 16711935);
                                int var49 = (var47 - var48 & 65536) + (var48 & 16777472);
                                var25[var19] = var47 - var49 | var49 - (var49 >>> 8);
                            }
                            var11 += var15;
                            ++var19;
                        }
                        var12 += var16;
                        var11 = var41;
                        var19 += var20;
                    }
                } else if (arg5 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var50 = arg6 >>> 24;
                    int var51 = 256 - var50;
                    int var52 = (arg6 & 16711935) * var51 & -16711936;
                    int var53 = (arg6 & 65280) * var51 & 16711680;
                    int var54 = (var52 | var53) >>> 8;
                    int var55 = var11;
                    for (int var56 = -arg4; var56 < 0; ++var56) {
                        int var57 = (var12 >> 16) * super.field9005;
                        for (int var58 = -arg3; var58 < 0; ++var58) {
                            if (var10 < var24[var19]) {
                                int var59 = this.field8711[this.field8712[(var11 >> 16) + var57] & 255];
                                int var60 = (var59 & 16711935) * var50 & -16711936;
                                int var61 = (var59 & 65280) * var50 & 16711680;
                                var25[var19] = ((var60 | var61) >>> 8) + var54;
                            }
                            var11 += var15;
                            ++var19;
                        }
                        var12 += var16;
                        var11 = var55;
                        var19 += var20;
                    }
                }
            } else if (arg7 == 1) {
                if (arg5 == 1) {
                    int var62 = var11;
                    for (int var63 = -arg4; var63 < 0; ++var63) {
                        int var64 = (var12 >> 16) * super.field9005;
                        for (int var65 = -arg3; var65 < 0; ++var65) {
                            if (var10 < var24[var19]) {
                                byte var66 = this.field8712[(var11 >> 16) + var64];
                                if (var66 != 0) {
                                    var25[var19] = this.field8711[var66 & 255];
                                }
                            }
                            var11 += var15;
                            ++var19;
                        }
                        var12 += var16;
                        var11 = var62;
                        var19 += var20;
                    }
                } else if (arg5 == 0) {
                    int var67 = var11;
                    if ((arg6 & 16777215) == 16777215) {
                        int var68 = arg6 >>> 24;
                        int var69 = 256 - var68;
                        for (int var70 = -arg4; var70 < 0; ++var70) {
                            int var71 = (var12 >> 16) * super.field9005;
                            for (int var72 = -arg3; var72 < 0; ++var72) {
                                if (var10 < var24[var19]) {
                                    byte var73 = this.field8712[(var11 >> 16) + var71];
                                    if (var73 != 0) {
                                        int var74 = this.field8711[var73 & 255];
                                        int var75 = var25[var19];
                                        var25[var19] = ((var74 & 16711935) * var68 + (var75 & 16711935) * var69 & -16711936) + ((var74 & 65280) * var68 + (var75 & 65280) * var69 & 16711680) >> 8;
                                    }
                                }
                                var11 += var15;
                                ++var19;
                            }
                            var12 += var16;
                            var11 = var67;
                            var19 += var20;
                        }
                    } else {
                        int var76 = (arg6 & 16711680) >> 16;
                        int var77 = (arg6 & 65280) >> 8;
                        int var78 = arg6 & 255;
                        int var79 = arg6 >>> 24;
                        int var80 = 256 - var79;
                        for (int var81 = -arg4; var81 < 0; ++var81) {
                            int var82 = (var12 >> 16) * super.field9005;
                            for (int var83 = -arg3; var83 < 0; ++var83) {
                                if (var10 < var24[var19]) {
                                    byte var84 = this.field8712[(var11 >> 16) + var82];
                                    if (var84 != 0) {
                                        int var85 = this.field8711[var84 & 255];
                                        if (var79 != 255) {
                                            int var86 = (var85 & 16711680) * var76 & -16777216;
                                            int var87 = (var85 & 65280) * var77 & 16711680;
                                            int var88 = (var85 & 255) * var78 & 65280;
                                            int var89 = (var86 | var87 | var88) >>> 8;
                                            int var90 = var25[var19];
                                            var25[var19] = ((var89 & 16711935) * var79 + (var90 & 16711935) * var80 & -16711936) + ((var89 & 65280) * var79 + (var90 & 65280) * var80 & 16711680) >> 8;
                                        } else {
                                            int var91 = (var85 & 16711680) * var76 & -16777216;
                                            int var92 = (var85 & 65280) * var77 & 16711680;
                                            int var93 = (var85 & 255) * var78 & 65280;
                                            var25[var19] = (var91 | var92 | var93) >>> 8;
                                        }
                                    }
                                }
                                var11 += var15;
                                ++var19;
                            }
                            var12 += var16;
                            var11 = var67;
                            var19 += var20;
                        }
                    }
                } else if (arg5 == 3) {
                    int var94 = var11;
                    int var95 = arg6 >>> 24;
                    int var96 = 256 - var95;
                    for (int var97 = -arg4; var97 < 0; ++var97) {
                        int var98 = (var12 >> 16) * super.field9005;
                        for (int var99 = -arg3; var99 < 0; ++var99) {
                            if (var10 < var24[var19]) {
                                byte var100 = this.field8712[(var11 >> 16) + var98];
                                int var101 = var100 > 0 ? this.field8711[var100] : 0;
                                int var102 = arg6 + var101;
                                int var103 = (arg6 & 16711935) + (var101 & 16711935);
                                int var104 = (var102 - var103 & 65536) + (var103 & 16777472);
                                int var105 = var102 - var104 | var104 - (var104 >>> 8);
                                if (var101 == 0 && var95 != 255) {
                                    int var107 = var25[var19];
                                    var105 = ((var105 & 16711935) * var95 + (var107 & 16711935) * var96 & -16711936) + ((var105 & 65280) * var95 + (var107 & 65280) * var96 & 16711680) >> 8;
                                }
                                var25[var19] = var105;
                            }
                            var11 += var15;
                            ++var19;
                        }
                        var12 += var16;
                        var11 = var94;
                        var19 += var20;
                    }
                } else if (arg5 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var108 = arg6 >>> 24;
                    int var109 = 256 - var108;
                    int var110 = (arg6 & 16711935) * var109 & -16711936;
                    int var111 = (arg6 & 65280) * var109 & 16711680;
                    int var112 = (var110 | var111) >>> 8;
                    int var113 = var11;
                    for (int var114 = -arg4; var114 < 0; ++var114) {
                        int var115 = (var12 >> 16) * super.field9005;
                        for (int var116 = -arg3; var116 < 0; ++var116) {
                            if (var10 < var24[var19]) {
                                byte var117 = this.field8712[(var11 >> 16) + var115];
                                if (var117 != 0) {
                                    int var118 = this.field8711[var117 & 255];
                                    int var119 = (var118 & 16711935) * var108 & -16711936;
                                    int var120 = (var118 & 65280) * var108 & 16711680;
                                    var25[var19] = ((var119 | var120) >>> 8) + var112;
                                }
                            }
                            var11 += var15;
                            ++var19;
                        }
                        var12 += var16;
                        var11 = var113;
                        var19 += var20;
                    }
                }
            } else if (arg7 != 2) {
                throw new IllegalArgumentException();
            } else if (arg5 == 1) {
                int var121 = var11;
                for (int var122 = -arg4; var122 < 0; ++var122) {
                    int var123 = (var12 >> 16) * super.field9005;
                    for (int var124 = -arg3; var124 < 0; ++var124) {
                        if (var10 < var24[var19]) {
                            byte var125 = this.field8712[(var11 >> 16) + var123];
                            if (var125 != 0) {
                                int var126 = this.field8711[var125 & 255];
                                int var127 = var25[var19];
                                int var128 = var126 + var127;
                                int var129 = (var126 & 16711935) + (var127 & 16711935);
                                int var130 = (var128 - var129 & 65536) + (var129 & 16777472);
                                var25[var19] = var128 - var130 | var130 - (var130 >>> 8);
                            }
                        }
                        var11 += var15;
                        ++var19;
                    }
                    var12 += var16;
                    var11 = var121;
                    var19 += var20;
                }
            } else if (arg5 == 0) {
                int var131 = var11;
                int var132 = (arg6 & 16711680) >> 16;
                int var133 = (arg6 & 65280) >> 8;
                int var134 = arg6 & 255;
                for (int var135 = -arg4; var135 < 0; ++var135) {
                    int var136 = (var12 >> 16) * super.field9005;
                    for (int var137 = -arg3; var137 < 0; ++var137) {
                        if (var10 < var24[var19]) {
                            byte var138 = this.field8712[(var11 >> 16) + var136];
                            if (var138 != 0) {
                                int var139 = this.field8711[var138 & 255];
                                int var140 = (var139 & 16711680) * var132 & -16777216;
                                int var141 = (var139 & 65280) * var133 & 16711680;
                                int var142 = (var139 & 255) * var134 & 65280;
                                int var143 = (var140 | var141 | var142) >>> 8;
                                int var144 = var25[var19];
                                int var145 = var143 + var144;
                                int var146 = (var143 & 16711935) + (var144 & 16711935);
                                int var147 = (var145 - var146 & 65536) + (var146 & 16777472);
                                var25[var19] = var145 - var147 | var147 - (var147 >>> 8);
                            }
                        }
                        var11 += var15;
                        ++var19;
                    }
                    var12 += var16;
                    var11 = var131;
                    var19 += var20;
                }
            } else if (arg5 == 3) {
                int var148 = var11;
                for (int var149 = -arg4; var149 < 0; ++var149) {
                    int var150 = (var12 >> 16) * super.field9005;
                    for (int var151 = -arg3; var151 < 0; ++var151) {
                        if (var10 < var24[var19]) {
                            byte var152 = this.field8712[(var11 >> 16) + var150];
                            int var153 = var152 > 0 ? this.field8711[var152] : 0;
                            int var154 = arg6 + var153;
                            int var155 = (arg6 & 16711935) + (var153 & 16711935);
                            int var156 = (var154 - var155 & 65536) + (var155 & 16777472);
                            int var157 = var154 - var156 | var156 - (var156 >>> 8);
                            int var158 = var25[var19];
                            int var159 = var157 + var158;
                            int var160 = (var157 & 16711935) + (var158 & 16711935);
                            int var161 = (var159 - var160 & 65536) + (var160 & 16777472);
                            var25[var19] = var159 - var161 | var161 - (var161 >>> 8);
                        }
                        var11 += var15;
                        ++var19;
                    }
                    var12 += var16;
                    var11 = var148;
                    var19 += var20;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var162 = arg6 >>> 24;
                int var163 = 256 - var162;
                int var164 = (arg6 & 16711935) * var163 & -16711936;
                int var165 = (arg6 & 65280) * var163 & 16711680;
                int var166 = (var164 | var165) >>> 8;
                int var167 = var11;
                for (int var168 = -arg4; var168 < 0; ++var168) {
                    int var169 = (var12 >> 16) * super.field9005;
                    for (int var170 = -arg3; var170 < 0; ++var170) {
                        if (var10 < var24[var19]) {
                            byte var171 = this.field8712[(var11 >> 16) + var169];
                            if (var171 != 0) {
                                int var172 = this.field8711[var171 & 255];
                                int var173 = (var172 & 16711935) * var162 & -16711936;
                                int var174 = (var172 & 65280) * var162 & 16711680;
                                int var175 = ((var173 | var174) >>> 8) + var166;
                                int var176 = var25[var19];
                                int var177 = var175 + var176;
                                int var178 = (var175 & 16711935) + (var176 & 16711935);
                                int var179 = (var177 - var178 & 65536) + (var178 & 16777472);
                                var25[var19] = var177 - var179 | var179 - (var179 >>> 8);
                            }
                        }
                        var11 += var15;
                        ++var19;
                    }
                    var12 += var16;
                    var11 = var167;
                    var19 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "da", descriptor = "(IIIIII)V", line = 784)
    public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lga", name = "V", descriptor = "(IIIII)V", line = 787)
    public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (super.field8996.method3185()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field8996.field8081;
            int var7 = super.field9025 + arg0;
            int var8 = super.field9000 + arg1;
            int var9 = var6 * var8 + var7;
            int var10 = 0;
            int var11 = super.field9009;
            int var12 = super.field9005;
            int var13 = var6 - var12;
            int var14 = 0;
            if (var8 < super.field8996.field8073) {
                int var15 = super.field8996.field8073 - var8;
                var11 -= var15;
                var8 = super.field8996.field8073;
                var10 += var12 * var15;
                var9 += var6 * var15;
            }
            if (var8 + var11 > super.field8996.field8107) {
                var11 -= var8 + var11 - super.field8996.field8107;
            }
            if (var7 < super.field8996.field8103) {
                int var16 = super.field8996.field8103 - var7;
                var12 -= var16;
                var7 = super.field8996.field8103;
                var10 += var16;
                var9 += var16;
                var14 += var16;
                var13 += var16;
            }
            if (var7 + var12 > super.field8996.field8080) {
                int var17 = var7 + var12 - super.field8996.field8080;
                var12 -= var17;
                var14 += var17;
                var13 += var17;
            }
            if (var12 > 0 && var11 > 0) {
                int[] var18 = super.field8996.field8086;
                if (arg4 == 0) {
                    if (arg2 == 1) {
                        for (int var19 = -var11; var19 < 0; ++var19) {
                            int var20 = var9 + var12 - 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field8711[this.field8712[var10++] & 255];
                                var18[var9++] = this.field8711[this.field8712[var10++] & 255];
                                var18[var9++] = this.field8711[this.field8712[var10++] & 255];
                                var18[var9++] = this.field8711[this.field8712[var10++] & 255];
                            }
                            var20 += 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field8711[this.field8712[var10++] & 255];
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
                                int var26 = this.field8711[this.field8712[var10++] & 255];
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
                                int var32 = this.field8711[this.field8712[var10++] & 255];
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
                                int var43 = this.field8711[this.field8712[var10++] & 255];
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
                            for (int var47 = -var12; var47 < 0; ++var47) {
                                byte var48 = this.field8712[var10++];
                                if (var48 != 0) {
                                    int var49 = this.field8711[var48 & 255] | -16777216;
                                    short var50 = 255;
                                    byte var51 = 0;
                                    int var52 = var18[var9];
                                    var18[var9++] = (((var49 & 16711935) * var50 + (var52 & 16711935) * var51 & -16711936) >> 8) + (((var49 & -16711936) >>> 8) * var50 + ((var52 & -16711936) >>> 8) * var51 & -16711936);
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
                                    byte var57 = this.field8712[var10++];
                                    if (var57 != 0) {
                                        int var58 = this.field8711[var57 & 255];
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
                                    byte var67 = this.field8712[var10++];
                                    if (var67 != 0) {
                                        int var68 = this.field8711[var67 & 255];
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
                                byte var81 = this.field8712[var10++];
                                int var82 = var81 > 0 ? this.field8711[var81] : 0;
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
                                byte var96 = this.field8712[var10++];
                                if (var96 != 0) {
                                    int var97 = this.field8711[var96 & 255];
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
                            byte var102 = this.field8712[var10++];
                            if (var102 != 0) {
                                int var103 = this.field8711[var102 & 255];
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
                            byte var113 = this.field8712[var10++];
                            if (var113 != 0) {
                                int var114 = this.field8711[var113 & 255];
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
                            byte var125 = this.field8712[var10++];
                            int var126 = var125 > 0 ? this.field8711[var125] : 0;
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
                            byte var142 = this.field8712[var10++];
                            if (var142 != 0) {
                                int var143 = this.field8711[var142 & 255];
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

    @OriginalMember(owner = "client!lga", name = "xa", descriptor = "(III)V", line = 1439)
    public final void method158(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(II)V", line = 1443)
    public final void method499(int arg0, int arg1) {
        int[] var3 = super.field8996.field8086;
        if (class640.field9002 == 0) {
            if (class640.field9008 == 0) {
                int var4 = class640.field9026;
                while (var4 < 0) {
                    int var5 = class640.field9016;
                    int var6 = class640.field9022;
                    int var7 = class640.field9020;
                    int var8 = class640.field9019;
                    if (var6 >= 0 && var7 >= 0 && var6 - (super.field9005 << 12) < 0 && var7 - (super.field9009 << 12) < 0) {
                        while (var8 < 0) {
                            int var9 = (var6 >> 12) + (var7 >> 12) * super.field9005;
                            int var10 = var5++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var10] = this.field8711[this.field8712[var9] & 255];
                                } else if (arg0 == 0) {
                                    int var14 = this.field8711[this.field8712[var9] & 255];
                                    int var15 = (var14 & 16711680) * class640.field9006 & -16777216;
                                    int var16 = (var14 & 65280) * class640.field9001 & 16711680;
                                    int var17 = (var14 & 255) * class640.field9021 & 65280;
                                    var3[var10] = (var15 | var16 | var17) >>> 8;
                                } else if (arg0 == 3) {
                                    int var18 = this.field8711[this.field8712[var9] & 255];
                                    int var19 = class640.field9017;
                                    int var20 = var18 + var19;
                                    int var21 = (var18 & 16711935) + (var19 & 16711935);
                                    int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                                    var3[var10] = var20 - var22 | var22 - (var22 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var23 = this.field8711[this.field8712[var9] & 255];
                                    int var24 = (var23 & 16711935) * class640.field9024 & -16711936;
                                    int var25 = (var23 & 65280) * class640.field9024 & 16711680;
                                    var3[var10] = ((var24 | var25) >>> 8) + class640.field9004;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var26 = this.field8712[var9];
                                    if (var26 != 0) {
                                        var3[var10] = this.field8711[var26 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var27 = this.field8712[var9];
                                    if (var27 != 0) {
                                        int var28 = this.field8711[var27 & 255];
                                        if ((class640.field9017 & 16777215) == 16777215) {
                                            int var29 = class640.field9017 >>> 24;
                                            int var30 = 256 - var29;
                                            int var31 = var3[var10];
                                            var3[var10] = ((var28 & 16711935) * var29 + (var31 & 16711935) * var30 & -16711936) + ((var28 & 65280) * var29 + (var31 & 65280) * var30 & 16711680) >> 8;
                                        } else if (class640.field9024 != 255) {
                                            int var32 = (var28 & 16711680) * class640.field9006 & -16777216;
                                            int var33 = (var28 & 65280) * class640.field9001 & 16711680;
                                            int var34 = (var28 & 255) * class640.field9021 & 65280;
                                            int var35 = (var32 | var33 | var34) >>> 8;
                                            int var36 = var3[var10];
                                            var3[var10] = ((var35 & 16711935) * class640.field9024 + (var36 & 16711935) * class640.field9013 & -16711936) + ((var35 & 65280) * class640.field9024 + (var36 & 65280) * class640.field9013 & 16711680) >> 8;
                                        } else {
                                            int var37 = (var28 & 16711680) * class640.field9006 & -16777216;
                                            int var38 = (var28 & 65280) * class640.field9001 & 16711680;
                                            int var39 = (var28 & 255) * class640.field9021 & 65280;
                                            var3[var10] = (var37 | var38 | var39) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var40 = this.field8712[var9];
                                    int var41 = var40 > 0 ? this.field8711[var40] : 0;
                                    int var42 = class640.field9017;
                                    int var43 = var41 + var42;
                                    int var44 = (var41 & 16711935) + (var42 & 16711935);
                                    int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                                    int var46 = var43 - var45 | var45 - (var45 >>> 8);
                                    if (var41 == 0 && class640.field9024 != 255) {
                                        int var48 = var3[var10];
                                        var46 = ((var46 & 16711935) * class640.field9024 + (var48 & 16711935) * class640.field9013 & -16711936) + ((var46 & 65280) * class640.field9024 + (var48 & 65280) * class640.field9013 & 16711680) >> 8;
                                    }
                                    var3[var10] = var46;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var49 = this.field8712[var9];
                                    if (var49 != 0) {
                                        int var50 = this.field8711[var49 & 255];
                                        int var51 = (var50 & 16711935) * class640.field9024 & -16711936;
                                        int var52 = (var50 & 65280) * class640.field9024 & 16711680;
                                        var3[var10++] = ((var51 | var52) >>> 8) + class640.field9004;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var53 = this.field8712[var9];
                                    if (var53 != 0) {
                                        int var54 = this.field8711[var53 & 255];
                                        int var55 = var3[var10];
                                        int var56 = var54 + var55;
                                        int var57 = (var54 & 16711935) + (var55 & 16711935);
                                        int var58 = (var56 - var57 & 65536) + (var57 & 16777472);
                                        var3[var10] = var56 - var58 | var58 - (var58 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var59 = this.field8712[var9];
                                    if (var59 != 0) {
                                        int var60 = this.field8711[var59 & 255];
                                        int var61 = (var60 & 16711680) * class640.field9006 & -16777216;
                                        int var62 = (var60 & 65280) * class640.field9001 & 16711680;
                                        int var63 = (var60 & 255) * class640.field9021 & 65280;
                                        int var64 = (var61 | var62 | var63) >>> 8;
                                        int var65 = var3[var10];
                                        int var66 = var64 + var65;
                                        int var67 = (var64 & 16711935) + (var65 & 16711935);
                                        int var68 = (var66 - var67 & 65536) + (var67 & 16777472);
                                        var3[var10] = var66 - var68 | var68 - (var68 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var69 = this.field8712[var9];
                                    int var70 = var69 > 0 ? this.field8711[var69] : 0;
                                    int var71 = class640.field9017;
                                    int var72 = var70 + var71;
                                    int var73 = (var70 & 16711935) + (var71 & 16711935);
                                    int var74 = (var72 - var73 & 65536) + (var73 & 16777472);
                                    int var75 = var72 - var74 | var74 - (var74 >>> 8);
                                    if (var70 == 0 && class640.field9024 != 255) {
                                        int var77 = var3[var10];
                                        var75 = ((var75 & 16711935) * class640.field9024 + (var77 & 16711935) * class640.field9013 & -16711936) + ((var75 & 65280) * class640.field9024 + (var77 & 65280) * class640.field9013 & 16711680) >> 8;
                                    }
                                    var3[var10] = var75;
                                } else if (arg0 == 2) {
                                    byte var78 = this.field8712[var9];
                                    if (var78 != 0) {
                                        int var79 = this.field8711[var78 & 255];
                                        int var80 = (var79 & 16711935) * class640.field9024 & -16711936;
                                        int var81 = (var79 & 65280) * class640.field9024 & 16711680;
                                        int var82 = ((var80 | var81) >>> 8) + class640.field9004;
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
                    class640.field9016 += class640.field9015;
                }
            } else if (class640.field9008 < 0) {
                int var87 = class640.field9026;
                while (var87 < 0) {
                    int var88 = class640.field9016;
                    int var89 = class640.field9022;
                    int var90 = class640.field9020 + class640.field8997;
                    int var91 = class640.field9019;
                    if (var89 >= 0 && var89 - (super.field9005 << 12) < 0) {
                        int var92;
                        if ((var92 = var90 - (super.field9009 << 12)) >= 0) {
                            int var93 = (class640.field9008 - var92) / class640.field9008;
                            var91 += var93;
                            var90 += class640.field9008 * var93;
                            var88 += var93;
                        }
                        int var94;
                        if ((var94 = (var90 - class640.field9008) / class640.field9008) > var91) {
                            var91 = var94;
                        }
                        while (var91 < 0) {
                            int var95 = (var89 >> 12) + (var90 >> 12) * super.field9005;
                            int var96 = var88++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var96] = this.field8711[this.field8712[var95] & 255];
                                } else if (arg0 == 0) {
                                    int var100 = this.field8711[this.field8712[var95] & 255];
                                    int var101 = (var100 & 16711680) * class640.field9006 & -16777216;
                                    int var102 = (var100 & 65280) * class640.field9001 & 16711680;
                                    int var103 = (var100 & 255) * class640.field9021 & 65280;
                                    var3[var96] = (var101 | var102 | var103) >>> 8;
                                } else if (arg0 == 3) {
                                    int var104 = this.field8711[this.field8712[var95] & 255];
                                    int var105 = class640.field9017;
                                    int var106 = var104 + var105;
                                    int var107 = (var104 & 16711935) + (var105 & 16711935);
                                    int var108 = (var106 - var107 & 65536) + (var107 & 16777472);
                                    var3[var96] = var106 - var108 | var108 - (var108 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var109 = this.field8711[this.field8712[var95] & 255];
                                    int var110 = (var109 & 16711935) * class640.field9024 & -16711936;
                                    int var111 = (var109 & 65280) * class640.field9024 & 16711680;
                                    var3[var96] = ((var110 | var111) >>> 8) + class640.field9004;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var112 = this.field8712[var95];
                                    if (var112 != 0) {
                                        var3[var96] = this.field8711[var112 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var113 = this.field8712[var95];
                                    if (var113 != 0) {
                                        int var114 = this.field8711[var113 & 255];
                                        if ((class640.field9017 & 16777215) == 16777215) {
                                            int var115 = class640.field9017 >>> 24;
                                            int var116 = 256 - var115;
                                            int var117 = var3[var96];
                                            var3[var96] = ((var114 & 16711935) * var115 + (var117 & 16711935) * var116 & -16711936) + ((var114 & 65280) * var115 + (var117 & 65280) * var116 & 16711680) >> 8;
                                        } else if (class640.field9024 != 255) {
                                            int var118 = (var114 & 16711680) * class640.field9006 & -16777216;
                                            int var119 = (var114 & 65280) * class640.field9001 & 16711680;
                                            int var120 = (var114 & 255) * class640.field9021 & 65280;
                                            int var121 = (var118 | var119 | var120) >>> 8;
                                            int var122 = var3[var96];
                                            var3[var96] = ((var121 & 16711935) * class640.field9024 + (var122 & 16711935) * class640.field9013 & -16711936) + ((var121 & 65280) * class640.field9024 + (var122 & 65280) * class640.field9013 & 16711680) >> 8;
                                        } else {
                                            int var123 = (var114 & 16711680) * class640.field9006 & -16777216;
                                            int var124 = (var114 & 65280) * class640.field9001 & 16711680;
                                            int var125 = (var114 & 255) * class640.field9021 & 65280;
                                            var3[var96] = (var123 | var124 | var125) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var126 = this.field8712[var95];
                                    int var127 = var126 > 0 ? this.field8711[var126] : 0;
                                    int var128 = class640.field9017;
                                    int var129 = var127 + var128;
                                    int var130 = (var127 & 16711935) + (var128 & 16711935);
                                    int var131 = (var129 - var130 & 65536) + (var130 & 16777472);
                                    int var132 = var129 - var131 | var131 - (var131 >>> 8);
                                    if (var127 == 0 && class640.field9024 != 255) {
                                        int var134 = var3[var96];
                                        var132 = ((var132 & 16711935) * class640.field9024 + (var134 & 16711935) * class640.field9013 & -16711936) + ((var132 & 65280) * class640.field9024 + (var134 & 65280) * class640.field9013 & 16711680) >> 8;
                                    }
                                    var3[var96] = var132;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var135 = this.field8712[var95];
                                    if (var135 != 0) {
                                        int var136 = this.field8711[var135 & 255];
                                        int var137 = (var136 & 16711935) * class640.field9024 & -16711936;
                                        int var138 = (var136 & 65280) * class640.field9024 & 16711680;
                                        var3[var96++] = ((var137 | var138) >>> 8) + class640.field9004;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var139 = this.field8712[var95];
                                    if (var139 != 0) {
                                        int var140 = this.field8711[var139 & 255];
                                        int var141 = var3[var96];
                                        int var142 = var140 + var141;
                                        int var143 = (var140 & 16711935) + (var141 & 16711935);
                                        int var144 = (var142 - var143 & 65536) + (var143 & 16777472);
                                        var3[var96] = var142 - var144 | var144 - (var144 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var145 = this.field8712[var95];
                                    if (var145 != 0) {
                                        int var146 = this.field8711[var145 & 255];
                                        int var147 = (var146 & 16711680) * class640.field9006 & -16777216;
                                        int var148 = (var146 & 65280) * class640.field9001 & 16711680;
                                        int var149 = (var146 & 255) * class640.field9021 & 65280;
                                        int var150 = (var147 | var148 | var149) >>> 8;
                                        int var151 = var3[var96];
                                        int var152 = var150 + var151;
                                        int var153 = (var150 & 16711935) + (var151 & 16711935);
                                        int var154 = (var152 - var153 & 65536) + (var153 & 16777472);
                                        var3[var96] = var152 - var154 | var154 - (var154 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var155 = this.field8712[var95];
                                    int var156 = var155 > 0 ? this.field8711[var155] : 0;
                                    int var157 = class640.field9017;
                                    int var158 = var156 + var157;
                                    int var159 = (var156 & 16711935) + (var157 & 16711935);
                                    int var160 = (var158 - var159 & 65536) + (var159 & 16777472);
                                    int var161 = var158 - var160 | var160 - (var160 >>> 8);
                                    if (var156 == 0 && class640.field9024 != 255) {
                                        int var163 = var3[var96];
                                        var161 = ((var161 & 16711935) * class640.field9024 + (var163 & 16711935) * class640.field9013 & -16711936) + ((var161 & 65280) * class640.field9024 + (var163 & 65280) * class640.field9013 & 16711680) >> 8;
                                    }
                                    var3[var96] = var161;
                                } else if (arg0 == 2) {
                                    byte var164 = this.field8712[var95];
                                    if (var164 != 0) {
                                        int var165 = this.field8711[var164 & 255];
                                        int var166 = (var165 & 16711935) * class640.field9024 & -16711936;
                                        int var167 = (var165 & 65280) * class640.field9024 & 16711680;
                                        int var168 = ((var166 | var167) >>> 8) + class640.field9004;
                                        int var169 = var3[var96];
                                        int var170 = var168 + var169;
                                        int var171 = (var168 & 16711935) + (var169 & 16711935);
                                        int var172 = (var170 - var171 & 65536) + (var171 & 16777472);
                                        var3[var96] = var170 - var172 | var172 - (var172 >>> 8);
                                    }
                                }
                            }
                            var90 += class640.field9008;
                            ++var91;
                        }
                    }
                    ++var87;
                    class640.field9022 += class640.field9007;
                    class640.field9016 += class640.field9015;
                }
            } else {
                int var173 = class640.field9026;
                while (var173 < 0) {
                    int var174 = class640.field9016;
                    int var175 = class640.field9022;
                    int var176 = class640.field9020 + class640.field8997;
                    int var177 = class640.field9019;
                    if (var175 >= 0 && var175 - (super.field9005 << 12) < 0) {
                        if (var176 < 0) {
                            int var178 = (class640.field9008 - 1 - var176) / class640.field9008;
                            var177 += var178;
                            var176 += class640.field9008 * var178;
                            var174 += var178;
                        }
                        int var179;
                        if ((var179 = (var176 + 1 - (super.field9009 << 12) - class640.field9008) / class640.field9008) > var177) {
                            var177 = var179;
                        }
                        while (var177 < 0) {
                            int var180 = (var175 >> 12) + (var176 >> 12) * super.field9005;
                            int var181 = var174++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var181] = this.field8711[this.field8712[var180] & 255];
                                } else if (arg0 == 0) {
                                    int var185 = this.field8711[this.field8712[var180] & 255];
                                    int var186 = (var185 & 16711680) * class640.field9006 & -16777216;
                                    int var187 = (var185 & 65280) * class640.field9001 & 16711680;
                                    int var188 = (var185 & 255) * class640.field9021 & 65280;
                                    var3[var181] = (var186 | var187 | var188) >>> 8;
                                } else if (arg0 == 3) {
                                    int var189 = this.field8711[this.field8712[var180] & 255];
                                    int var190 = class640.field9017;
                                    int var191 = var189 + var190;
                                    int var192 = (var189 & 16711935) + (var190 & 16711935);
                                    int var193 = (var191 - var192 & 65536) + (var192 & 16777472);
                                    var3[var181] = var191 - var193 | var193 - (var193 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var194 = this.field8711[this.field8712[var180] & 255];
                                    int var195 = (var194 & 16711935) * class640.field9024 & -16711936;
                                    int var196 = (var194 & 65280) * class640.field9024 & 16711680;
                                    var3[var181] = ((var195 | var196) >>> 8) + class640.field9004;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var197 = this.field8712[var180];
                                    if (var197 != 0) {
                                        var3[var181] = this.field8711[var197 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var198 = this.field8712[var180];
                                    if (var198 != 0) {
                                        int var199 = this.field8711[var198 & 255];
                                        if ((class640.field9017 & 16777215) == 16777215) {
                                            int var200 = class640.field9017 >>> 24;
                                            int var201 = 256 - var200;
                                            int var202 = var3[var181];
                                            var3[var181] = ((var199 & 16711935) * var200 + (var202 & 16711935) * var201 & -16711936) + ((var199 & 65280) * var200 + (var202 & 65280) * var201 & 16711680) >> 8;
                                        } else if (class640.field9024 != 255) {
                                            int var203 = (var199 & 16711680) * class640.field9006 & -16777216;
                                            int var204 = (var199 & 65280) * class640.field9001 & 16711680;
                                            int var205 = (var199 & 255) * class640.field9021 & 65280;
                                            int var206 = (var203 | var204 | var205) >>> 8;
                                            int var207 = var3[var181];
                                            var3[var181] = ((var206 & 16711935) * class640.field9024 + (var207 & 16711935) * class640.field9013 & -16711936) + ((var206 & 65280) * class640.field9024 + (var207 & 65280) * class640.field9013 & 16711680) >> 8;
                                        } else {
                                            int var208 = (var199 & 16711680) * class640.field9006 & -16777216;
                                            int var209 = (var199 & 65280) * class640.field9001 & 16711680;
                                            int var210 = (var199 & 255) * class640.field9021 & 65280;
                                            var3[var181] = (var208 | var209 | var210) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var211 = this.field8712[var180];
                                    int var212 = var211 > 0 ? this.field8711[var211] : 0;
                                    int var213 = class640.field9017;
                                    int var214 = var212 + var213;
                                    int var215 = (var212 & 16711935) + (var213 & 16711935);
                                    int var216 = (var214 - var215 & 65536) + (var215 & 16777472);
                                    int var217 = var214 - var216 | var216 - (var216 >>> 8);
                                    if (var212 == 0 && class640.field9024 != 255) {
                                        int var219 = var3[var181];
                                        var217 = ((var217 & 16711935) * class640.field9024 + (var219 & 16711935) * class640.field9013 & -16711936) + ((var217 & 65280) * class640.field9024 + (var219 & 65280) * class640.field9013 & 16711680) >> 8;
                                    }
                                    var3[var181] = var217;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var220 = this.field8712[var180];
                                    if (var220 != 0) {
                                        int var221 = this.field8711[var220 & 255];
                                        int var222 = (var221 & 16711935) * class640.field9024 & -16711936;
                                        int var223 = (var221 & 65280) * class640.field9024 & 16711680;
                                        var3[var181++] = ((var222 | var223) >>> 8) + class640.field9004;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var224 = this.field8712[var180];
                                    if (var224 != 0) {
                                        int var225 = this.field8711[var224 & 255];
                                        int var226 = var3[var181];
                                        int var227 = var225 + var226;
                                        int var228 = (var225 & 16711935) + (var226 & 16711935);
                                        int var229 = (var227 - var228 & 65536) + (var228 & 16777472);
                                        var3[var181] = var227 - var229 | var229 - (var229 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var230 = this.field8712[var180];
                                    if (var230 != 0) {
                                        int var231 = this.field8711[var230 & 255];
                                        int var232 = (var231 & 16711680) * class640.field9006 & -16777216;
                                        int var233 = (var231 & 65280) * class640.field9001 & 16711680;
                                        int var234 = (var231 & 255) * class640.field9021 & 65280;
                                        int var235 = (var232 | var233 | var234) >>> 8;
                                        int var236 = var3[var181];
                                        int var237 = var235 + var236;
                                        int var238 = (var235 & 16711935) + (var236 & 16711935);
                                        int var239 = (var237 - var238 & 65536) + (var238 & 16777472);
                                        var3[var181] = var237 - var239 | var239 - (var239 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var240 = this.field8712[var180];
                                    int var241 = var240 > 0 ? this.field8711[var240] : 0;
                                    int var242 = class640.field9017;
                                    int var243 = var241 + var242;
                                    int var244 = (var241 & 16711935) + (var242 & 16711935);
                                    int var245 = (var243 - var244 & 65536) + (var244 & 16777472);
                                    int var246 = var243 - var245 | var245 - (var245 >>> 8);
                                    if (var241 == 0 && class640.field9024 != 255) {
                                        int var248 = var3[var181];
                                        var246 = ((var246 & 16711935) * class640.field9024 + (var248 & 16711935) * class640.field9013 & -16711936) + ((var246 & 65280) * class640.field9024 + (var248 & 65280) * class640.field9013 & 16711680) >> 8;
                                    }
                                    var3[var181] = var246;
                                } else if (arg0 == 2) {
                                    byte var249 = this.field8712[var180];
                                    if (var249 != 0) {
                                        int var250 = this.field8711[var249 & 255];
                                        int var251 = (var250 & 16711935) * class640.field9024 & -16711936;
                                        int var252 = (var250 & 65280) * class640.field9024 & 16711680;
                                        int var253 = ((var251 | var252) >>> 8) + class640.field9004;
                                        int var254 = var3[var181];
                                        int var255 = var253 + var254;
                                        int var256 = (var253 & 16711935) + (var254 & 16711935);
                                        int var257 = (var255 - var256 & 65536) + (var256 & 16777472);
                                        var3[var181] = var255 - var257 | var257 - (var257 >>> 8);
                                    }
                                }
                            }
                            var176 += class640.field9008;
                            ++var177;
                        }
                    }
                    ++var173;
                    class640.field9022 += class640.field9007;
                    class640.field9016 += class640.field9015;
                }
            }
        } else if (class640.field9002 < 0) {
            if (class640.field9008 == 0) {
                int var258 = class640.field9026;
                while (var258 < 0) {
                    int var259 = class640.field9016;
                    int var260 = class640.field9022 + class640.field8995;
                    int var261 = class640.field9020;
                    int var262 = class640.field9019;
                    if (var261 >= 0 && var261 - (super.field9009 << 12) < 0) {
                        int var263;
                        if ((var263 = var260 - (super.field9005 << 12)) >= 0) {
                            int var264 = (class640.field9002 - var263) / class640.field9002;
                            var262 += var264;
                            var260 += class640.field9002 * var264;
                            var259 += var264;
                        }
                        int var265;
                        if ((var265 = (var260 - class640.field9002) / class640.field9002) > var262) {
                            var262 = var265;
                        }
                        while (var262 < 0) {
                            int var266 = (var260 >> 12) + (var261 >> 12) * super.field9005;
                            int var267 = var259++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var267] = this.field8711[this.field8712[var266] & 255];
                                } else if (arg0 == 0) {
                                    int var271 = this.field8711[this.field8712[var266] & 255];
                                    int var272 = (var271 & 16711680) * class640.field9006 & -16777216;
                                    int var273 = (var271 & 65280) * class640.field9001 & 16711680;
                                    int var274 = (var271 & 255) * class640.field9021 & 65280;
                                    var3[var267] = (var272 | var273 | var274) >>> 8;
                                } else if (arg0 == 3) {
                                    int var275 = this.field8711[this.field8712[var266] & 255];
                                    int var276 = class640.field9017;
                                    int var277 = var275 + var276;
                                    int var278 = (var275 & 16711935) + (var276 & 16711935);
                                    int var279 = (var277 - var278 & 65536) + (var278 & 16777472);
                                    var3[var267] = var277 - var279 | var279 - (var279 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var280 = this.field8711[this.field8712[var266] & 255];
                                    int var281 = (var280 & 16711935) * class640.field9024 & -16711936;
                                    int var282 = (var280 & 65280) * class640.field9024 & 16711680;
                                    var3[var267] = ((var281 | var282) >>> 8) + class640.field9004;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var283 = this.field8712[var266];
                                    if (var283 != 0) {
                                        var3[var267] = this.field8711[var283 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var284 = this.field8712[var266];
                                    if (var284 != 0) {
                                        int var285 = this.field8711[var284 & 255];
                                        if ((class640.field9017 & 16777215) == 16777215) {
                                            int var286 = class640.field9017 >>> 24;
                                            int var287 = 256 - var286;
                                            int var288 = var3[var267];
                                            var3[var267] = ((var285 & 16711935) * var286 + (var288 & 16711935) * var287 & -16711936) + ((var285 & 65280) * var286 + (var288 & 65280) * var287 & 16711680) >> 8;
                                        } else if (class640.field9024 != 255) {
                                            int var289 = (var285 & 16711680) * class640.field9006 & -16777216;
                                            int var290 = (var285 & 65280) * class640.field9001 & 16711680;
                                            int var291 = (var285 & 255) * class640.field9021 & 65280;
                                            int var292 = (var289 | var290 | var291) >>> 8;
                                            int var293 = var3[var267];
                                            var3[var267] = ((var292 & 16711935) * class640.field9024 + (var293 & 16711935) * class640.field9013 & -16711936) + ((var292 & 65280) * class640.field9024 + (var293 & 65280) * class640.field9013 & 16711680) >> 8;
                                        } else {
                                            int var294 = (var285 & 16711680) * class640.field9006 & -16777216;
                                            int var295 = (var285 & 65280) * class640.field9001 & 16711680;
                                            int var296 = (var285 & 255) * class640.field9021 & 65280;
                                            var3[var267] = (var294 | var295 | var296) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var297 = this.field8712[var266];
                                    int var298 = var297 > 0 ? this.field8711[var297] : 0;
                                    int var299 = class640.field9017;
                                    int var300 = var298 + var299;
                                    int var301 = (var298 & 16711935) + (var299 & 16711935);
                                    int var302 = (var300 - var301 & 65536) + (var301 & 16777472);
                                    int var303 = var300 - var302 | var302 - (var302 >>> 8);
                                    if (var298 == 0 && class640.field9024 != 255) {
                                        int var305 = var3[var267];
                                        var303 = ((var303 & 16711935) * class640.field9024 + (var305 & 16711935) * class640.field9013 & -16711936) + ((var303 & 65280) * class640.field9024 + (var305 & 65280) * class640.field9013 & 16711680) >> 8;
                                    }
                                    var3[var267] = var303;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var306 = this.field8712[var266];
                                    if (var306 != 0) {
                                        int var307 = this.field8711[var306 & 255];
                                        int var308 = (var307 & 16711935) * class640.field9024 & -16711936;
                                        int var309 = (var307 & 65280) * class640.field9024 & 16711680;
                                        var3[var267++] = ((var308 | var309) >>> 8) + class640.field9004;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var310 = this.field8712[var266];
                                    if (var310 != 0) {
                                        int var311 = this.field8711[var310 & 255];
                                        int var312 = var3[var267];
                                        int var313 = var311 + var312;
                                        int var314 = (var311 & 16711935) + (var312 & 16711935);
                                        int var315 = (var313 - var314 & 65536) + (var314 & 16777472);
                                        var3[var267] = var313 - var315 | var315 - (var315 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var316 = this.field8712[var266];
                                    if (var316 != 0) {
                                        int var317 = this.field8711[var316 & 255];
                                        int var318 = (var317 & 16711680) * class640.field9006 & -16777216;
                                        int var319 = (var317 & 65280) * class640.field9001 & 16711680;
                                        int var320 = (var317 & 255) * class640.field9021 & 65280;
                                        int var321 = (var318 | var319 | var320) >>> 8;
                                        int var322 = var3[var267];
                                        int var323 = var321 + var322;
                                        int var324 = (var321 & 16711935) + (var322 & 16711935);
                                        int var325 = (var323 - var324 & 65536) + (var324 & 16777472);
                                        var3[var267] = var323 - var325 | var325 - (var325 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var326 = this.field8712[var266];
                                    int var327 = var326 > 0 ? this.field8711[var326] : 0;
                                    int var328 = class640.field9017;
                                    int var329 = var327 + var328;
                                    int var330 = (var327 & 16711935) + (var328 & 16711935);
                                    int var331 = (var329 - var330 & 65536) + (var330 & 16777472);
                                    int var332 = var329 - var331 | var331 - (var331 >>> 8);
                                    if (var327 == 0 && class640.field9024 != 255) {
                                        int var334 = var3[var267];
                                        var332 = ((var332 & 16711935) * class640.field9024 + (var334 & 16711935) * class640.field9013 & -16711936) + ((var332 & 65280) * class640.field9024 + (var334 & 65280) * class640.field9013 & 16711680) >> 8;
                                    }
                                    var3[var267] = var332;
                                } else if (arg0 == 2) {
                                    byte var335 = this.field8712[var266];
                                    if (var335 != 0) {
                                        int var336 = this.field8711[var335 & 255];
                                        int var337 = (var336 & 16711935) * class640.field9024 & -16711936;
                                        int var338 = (var336 & 65280) * class640.field9024 & 16711680;
                                        int var339 = ((var337 | var338) >>> 8) + class640.field9004;
                                        int var340 = var3[var267];
                                        int var341 = var339 + var340;
                                        int var342 = (var339 & 16711935) + (var340 & 16711935);
                                        int var343 = (var341 - var342 & 65536) + (var342 & 16777472);
                                        var3[var267] = var341 - var343 | var343 - (var343 >>> 8);
                                    }
                                }
                            }
                            var260 += class640.field9002;
                            ++var262;
                        }
                    }
                    ++var258;
                    class640.field9020 += class640.field9027;
                    class640.field9016 += class640.field9015;
                }
            } else if (class640.field9008 < 0) {
                int var344 = class640.field9026;
                while (var344 < 0) {
                    int var345 = class640.field9016;
                    int var346 = class640.field9022 + class640.field8995;
                    int var347 = class640.field9020 + class640.field8997;
                    int var348 = class640.field9019;
                    int var349;
                    if ((var349 = var346 - (super.field9005 << 12)) >= 0) {
                        int var350 = (class640.field9002 - var349) / class640.field9002;
                        var348 += var350;
                        var346 += class640.field9002 * var350;
                        var347 += class640.field9008 * var350;
                        var345 += var350;
                    }
                    int var351;
                    if ((var351 = (var346 - class640.field9002) / class640.field9002) > var348) {
                        var348 = var351;
                    }
                    int var352;
                    if ((var352 = var347 - (super.field9009 << 12)) >= 0) {
                        int var353 = (class640.field9008 - var352) / class640.field9008;
                        var348 += var353;
                        var346 += class640.field9002 * var353;
                        var347 += class640.field9008 * var353;
                        var345 += var353;
                    }
                    int var354;
                    if ((var354 = (var347 - class640.field9008) / class640.field9008) > var348) {
                        var348 = var354;
                    }
                    while (var348 < 0) {
                        int var355 = (var346 >> 12) + (var347 >> 12) * super.field9005;
                        int var356 = var345++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var356] = this.field8711[this.field8712[var355] & 255];
                            } else if (arg0 == 0) {
                                int var360 = this.field8711[this.field8712[var355] & 255];
                                int var361 = (var360 & 16711680) * class640.field9006 & -16777216;
                                int var362 = (var360 & 65280) * class640.field9001 & 16711680;
                                int var363 = (var360 & 255) * class640.field9021 & 65280;
                                var3[var356] = (var361 | var362 | var363) >>> 8;
                            } else if (arg0 == 3) {
                                int var364 = this.field8711[this.field8712[var355] & 255];
                                int var365 = class640.field9017;
                                int var366 = var364 + var365;
                                int var367 = (var364 & 16711935) + (var365 & 16711935);
                                int var368 = (var366 - var367 & 65536) + (var367 & 16777472);
                                var3[var356] = var366 - var368 | var368 - (var368 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var369 = this.field8711[this.field8712[var355] & 255];
                                int var370 = (var369 & 16711935) * class640.field9024 & -16711936;
                                int var371 = (var369 & 65280) * class640.field9024 & 16711680;
                                var3[var356] = ((var370 | var371) >>> 8) + class640.field9004;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var372 = this.field8712[var355];
                                if (var372 != 0) {
                                    var3[var356] = this.field8711[var372 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var373 = this.field8712[var355];
                                if (var373 != 0) {
                                    int var374 = this.field8711[var373 & 255];
                                    if ((class640.field9017 & 16777215) == 16777215) {
                                        int var375 = class640.field9017 >>> 24;
                                        int var376 = 256 - var375;
                                        int var377 = var3[var356];
                                        var3[var356] = ((var374 & 16711935) * var375 + (var377 & 16711935) * var376 & -16711936) + ((var374 & 65280) * var375 + (var377 & 65280) * var376 & 16711680) >> 8;
                                    } else if (class640.field9024 != 255) {
                                        int var378 = (var374 & 16711680) * class640.field9006 & -16777216;
                                        int var379 = (var374 & 65280) * class640.field9001 & 16711680;
                                        int var380 = (var374 & 255) * class640.field9021 & 65280;
                                        int var381 = (var378 | var379 | var380) >>> 8;
                                        int var382 = var3[var356];
                                        var3[var356] = ((var381 & 16711935) * class640.field9024 + (var382 & 16711935) * class640.field9013 & -16711936) + ((var381 & 65280) * class640.field9024 + (var382 & 65280) * class640.field9013 & 16711680) >> 8;
                                    } else {
                                        int var383 = (var374 & 16711680) * class640.field9006 & -16777216;
                                        int var384 = (var374 & 65280) * class640.field9001 & 16711680;
                                        int var385 = (var374 & 255) * class640.field9021 & 65280;
                                        var3[var356] = (var383 | var384 | var385) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var386 = this.field8712[var355];
                                int var387 = var386 > 0 ? this.field8711[var386] : 0;
                                int var388 = class640.field9017;
                                int var389 = var387 + var388;
                                int var390 = (var387 & 16711935) + (var388 & 16711935);
                                int var391 = (var389 - var390 & 65536) + (var390 & 16777472);
                                int var392 = var389 - var391 | var391 - (var391 >>> 8);
                                if (var387 == 0 && class640.field9024 != 255) {
                                    int var394 = var3[var356];
                                    var392 = ((var392 & 16711935) * class640.field9024 + (var394 & 16711935) * class640.field9013 & -16711936) + ((var392 & 65280) * class640.field9024 + (var394 & 65280) * class640.field9013 & 16711680) >> 8;
                                }
                                var3[var356] = var392;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var395 = this.field8712[var355];
                                if (var395 != 0) {
                                    int var396 = this.field8711[var395 & 255];
                                    int var397 = (var396 & 16711935) * class640.field9024 & -16711936;
                                    int var398 = (var396 & 65280) * class640.field9024 & 16711680;
                                    var3[var356++] = ((var397 | var398) >>> 8) + class640.field9004;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var399 = this.field8712[var355];
                                if (var399 != 0) {
                                    int var400 = this.field8711[var399 & 255];
                                    int var401 = var3[var356];
                                    int var402 = var400 + var401;
                                    int var403 = (var400 & 16711935) + (var401 & 16711935);
                                    int var404 = (var402 - var403 & 65536) + (var403 & 16777472);
                                    var3[var356] = var402 - var404 | var404 - (var404 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var405 = this.field8712[var355];
                                if (var405 != 0) {
                                    int var406 = this.field8711[var405 & 255];
                                    int var407 = (var406 & 16711680) * class640.field9006 & -16777216;
                                    int var408 = (var406 & 65280) * class640.field9001 & 16711680;
                                    int var409 = (var406 & 255) * class640.field9021 & 65280;
                                    int var410 = (var407 | var408 | var409) >>> 8;
                                    int var411 = var3[var356];
                                    int var412 = var410 + var411;
                                    int var413 = (var410 & 16711935) + (var411 & 16711935);
                                    int var414 = (var412 - var413 & 65536) + (var413 & 16777472);
                                    var3[var356] = var412 - var414 | var414 - (var414 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var415 = this.field8712[var355];
                                int var416 = var415 > 0 ? this.field8711[var415] : 0;
                                int var417 = class640.field9017;
                                int var418 = var416 + var417;
                                int var419 = (var416 & 16711935) + (var417 & 16711935);
                                int var420 = (var418 - var419 & 65536) + (var419 & 16777472);
                                int var421 = var418 - var420 | var420 - (var420 >>> 8);
                                if (var416 == 0 && class640.field9024 != 255) {
                                    int var423 = var3[var356];
                                    var421 = ((var421 & 16711935) * class640.field9024 + (var423 & 16711935) * class640.field9013 & -16711936) + ((var421 & 65280) * class640.field9024 + (var423 & 65280) * class640.field9013 & 16711680) >> 8;
                                }
                                var3[var356] = var421;
                            } else if (arg0 == 2) {
                                byte var424 = this.field8712[var355];
                                if (var424 != 0) {
                                    int var425 = this.field8711[var424 & 255];
                                    int var426 = (var425 & 16711935) * class640.field9024 & -16711936;
                                    int var427 = (var425 & 65280) * class640.field9024 & 16711680;
                                    int var428 = ((var426 | var427) >>> 8) + class640.field9004;
                                    int var429 = var3[var356];
                                    int var430 = var428 + var429;
                                    int var431 = (var428 & 16711935) + (var429 & 16711935);
                                    int var432 = (var430 - var431 & 65536) + (var431 & 16777472);
                                    var3[var356] = var430 - var432 | var432 - (var432 >>> 8);
                                }
                            }
                        }
                        var346 += class640.field9002;
                        var347 += class640.field9008;
                        ++var348;
                    }
                    ++var344;
                    class640.field9022 += class640.field9007;
                    class640.field9020 += class640.field9027;
                    class640.field9016 += class640.field9015;
                }
            } else {
                int var433 = class640.field9026;
                while (var433 < 0) {
                    int var434 = class640.field9016;
                    int var435 = class640.field9022 + class640.field8995;
                    int var436 = class640.field9020 + class640.field8997;
                    int var437 = class640.field9019;
                    int var438;
                    if ((var438 = var435 - (super.field9005 << 12)) >= 0) {
                        int var439 = (class640.field9002 - var438) / class640.field9002;
                        var437 += var439;
                        var435 += class640.field9002 * var439;
                        var436 += class640.field9008 * var439;
                        var434 += var439;
                    }
                    int var440;
                    if ((var440 = (var435 - class640.field9002) / class640.field9002) > var437) {
                        var437 = var440;
                    }
                    if (var436 < 0) {
                        int var441 = (class640.field9008 - 1 - var436) / class640.field9008;
                        var437 += var441;
                        var435 += class640.field9002 * var441;
                        var436 += class640.field9008 * var441;
                        var434 += var441;
                    }
                    int var442;
                    if ((var442 = (var436 + 1 - (super.field9009 << 12) - class640.field9008) / class640.field9008) > var437) {
                        var437 = var442;
                    }
                    while (var437 < 0) {
                        int var443 = (var435 >> 12) + (var436 >> 12) * super.field9005;
                        int var444 = var434++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var444] = this.field8711[this.field8712[var443] & 255];
                            } else if (arg0 == 0) {
                                int var448 = this.field8711[this.field8712[var443] & 255];
                                int var449 = (var448 & 16711680) * class640.field9006 & -16777216;
                                int var450 = (var448 & 65280) * class640.field9001 & 16711680;
                                int var451 = (var448 & 255) * class640.field9021 & 65280;
                                var3[var444] = (var449 | var450 | var451) >>> 8;
                            } else if (arg0 == 3) {
                                int var452 = this.field8711[this.field8712[var443] & 255];
                                int var453 = class640.field9017;
                                int var454 = var452 + var453;
                                int var455 = (var452 & 16711935) + (var453 & 16711935);
                                int var456 = (var454 - var455 & 65536) + (var455 & 16777472);
                                var3[var444] = var454 - var456 | var456 - (var456 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var457 = this.field8711[this.field8712[var443] & 255];
                                int var458 = (var457 & 16711935) * class640.field9024 & -16711936;
                                int var459 = (var457 & 65280) * class640.field9024 & 16711680;
                                var3[var444] = ((var458 | var459) >>> 8) + class640.field9004;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var460 = this.field8712[var443];
                                if (var460 != 0) {
                                    var3[var444] = this.field8711[var460 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var461 = this.field8712[var443];
                                if (var461 != 0) {
                                    int var462 = this.field8711[var461 & 255];
                                    if ((class640.field9017 & 16777215) == 16777215) {
                                        int var463 = class640.field9017 >>> 24;
                                        int var464 = 256 - var463;
                                        int var465 = var3[var444];
                                        var3[var444] = ((var462 & 16711935) * var463 + (var465 & 16711935) * var464 & -16711936) + ((var462 & 65280) * var463 + (var465 & 65280) * var464 & 16711680) >> 8;
                                    } else if (class640.field9024 != 255) {
                                        int var466 = (var462 & 16711680) * class640.field9006 & -16777216;
                                        int var467 = (var462 & 65280) * class640.field9001 & 16711680;
                                        int var468 = (var462 & 255) * class640.field9021 & 65280;
                                        int var469 = (var466 | var467 | var468) >>> 8;
                                        int var470 = var3[var444];
                                        var3[var444] = ((var469 & 16711935) * class640.field9024 + (var470 & 16711935) * class640.field9013 & -16711936) + ((var469 & 65280) * class640.field9024 + (var470 & 65280) * class640.field9013 & 16711680) >> 8;
                                    } else {
                                        int var471 = (var462 & 16711680) * class640.field9006 & -16777216;
                                        int var472 = (var462 & 65280) * class640.field9001 & 16711680;
                                        int var473 = (var462 & 255) * class640.field9021 & 65280;
                                        var3[var444] = (var471 | var472 | var473) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var474 = this.field8712[var443];
                                int var475 = var474 > 0 ? this.field8711[var474] : 0;
                                int var476 = class640.field9017;
                                int var477 = var475 + var476;
                                int var478 = (var475 & 16711935) + (var476 & 16711935);
                                int var479 = (var477 - var478 & 65536) + (var478 & 16777472);
                                int var480 = var477 - var479 | var479 - (var479 >>> 8);
                                if (var475 == 0 && class640.field9024 != 255) {
                                    int var482 = var3[var444];
                                    var480 = ((var480 & 16711935) * class640.field9024 + (var482 & 16711935) * class640.field9013 & -16711936) + ((var480 & 65280) * class640.field9024 + (var482 & 65280) * class640.field9013 & 16711680) >> 8;
                                }
                                var3[var444] = var480;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var483 = this.field8712[var443];
                                if (var483 != 0) {
                                    int var484 = this.field8711[var483 & 255];
                                    int var485 = (var484 & 16711935) * class640.field9024 & -16711936;
                                    int var486 = (var484 & 65280) * class640.field9024 & 16711680;
                                    var3[var444++] = ((var485 | var486) >>> 8) + class640.field9004;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var487 = this.field8712[var443];
                                if (var487 != 0) {
                                    int var488 = this.field8711[var487 & 255];
                                    int var489 = var3[var444];
                                    int var490 = var488 + var489;
                                    int var491 = (var488 & 16711935) + (var489 & 16711935);
                                    int var492 = (var490 - var491 & 65536) + (var491 & 16777472);
                                    var3[var444] = var490 - var492 | var492 - (var492 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var493 = this.field8712[var443];
                                if (var493 != 0) {
                                    int var494 = this.field8711[var493 & 255];
                                    int var495 = (var494 & 16711680) * class640.field9006 & -16777216;
                                    int var496 = (var494 & 65280) * class640.field9001 & 16711680;
                                    int var497 = (var494 & 255) * class640.field9021 & 65280;
                                    int var498 = (var495 | var496 | var497) >>> 8;
                                    int var499 = var3[var444];
                                    int var500 = var498 + var499;
                                    int var501 = (var498 & 16711935) + (var499 & 16711935);
                                    int var502 = (var500 - var501 & 65536) + (var501 & 16777472);
                                    var3[var444] = var500 - var502 | var502 - (var502 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var503 = this.field8712[var443];
                                int var504 = var503 > 0 ? this.field8711[var503] : 0;
                                int var505 = class640.field9017;
                                int var506 = var504 + var505;
                                int var507 = (var504 & 16711935) + (var505 & 16711935);
                                int var508 = (var506 - var507 & 65536) + (var507 & 16777472);
                                int var509 = var506 - var508 | var508 - (var508 >>> 8);
                                if (var504 == 0 && class640.field9024 != 255) {
                                    int var511 = var3[var444];
                                    var509 = ((var509 & 16711935) * class640.field9024 + (var511 & 16711935) * class640.field9013 & -16711936) + ((var509 & 65280) * class640.field9024 + (var511 & 65280) * class640.field9013 & 16711680) >> 8;
                                }
                                var3[var444] = var509;
                            } else if (arg0 == 2) {
                                byte var512 = this.field8712[var443];
                                if (var512 != 0) {
                                    int var513 = this.field8711[var512 & 255];
                                    int var514 = (var513 & 16711935) * class640.field9024 & -16711936;
                                    int var515 = (var513 & 65280) * class640.field9024 & 16711680;
                                    int var516 = ((var514 | var515) >>> 8) + class640.field9004;
                                    int var517 = var3[var444];
                                    int var518 = var516 + var517;
                                    int var519 = (var516 & 16711935) + (var517 & 16711935);
                                    int var520 = (var518 - var519 & 65536) + (var519 & 16777472);
                                    var3[var444] = var518 - var520 | var520 - (var520 >>> 8);
                                }
                            }
                        }
                        var435 += class640.field9002;
                        var436 += class640.field9008;
                        ++var437;
                    }
                    ++var433;
                    class640.field9022 += class640.field9007;
                    class640.field9020 += class640.field9027;
                    class640.field9016 += class640.field9015;
                }
            }
        } else if (class640.field9008 == 0) {
            int var521 = class640.field9026;
            while (var521 < 0) {
                int var522 = class640.field9016;
                int var523 = class640.field9022 + class640.field8995;
                int var524 = class640.field9020;
                int var525 = class640.field9019;
                if (var524 >= 0 && var524 - (super.field9009 << 12) < 0) {
                    if (var523 < 0) {
                        int var526 = (class640.field9002 - 1 - var523) / class640.field9002;
                        var525 += var526;
                        var523 += class640.field9002 * var526;
                        var522 += var526;
                    }
                    int var527;
                    if ((var527 = (var523 + 1 - (super.field9005 << 12) - class640.field9002) / class640.field9002) > var525) {
                        var525 = var527;
                    }
                    while (var525 < 0) {
                        int var528 = (var523 >> 12) + (var524 >> 12) * super.field9005;
                        int var529 = var522++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var529] = this.field8711[this.field8712[var528] & 255];
                            } else if (arg0 == 0) {
                                int var533 = this.field8711[this.field8712[var528] & 255];
                                int var534 = (var533 & 16711680) * class640.field9006 & -16777216;
                                int var535 = (var533 & 65280) * class640.field9001 & 16711680;
                                int var536 = (var533 & 255) * class640.field9021 & 65280;
                                var3[var529] = (var534 | var535 | var536) >>> 8;
                            } else if (arg0 == 3) {
                                int var537 = this.field8711[this.field8712[var528] & 255];
                                int var538 = class640.field9017;
                                int var539 = var537 + var538;
                                int var540 = (var537 & 16711935) + (var538 & 16711935);
                                int var541 = (var539 - var540 & 65536) + (var540 & 16777472);
                                var3[var529] = var539 - var541 | var541 - (var541 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var542 = this.field8711[this.field8712[var528] & 255];
                                int var543 = (var542 & 16711935) * class640.field9024 & -16711936;
                                int var544 = (var542 & 65280) * class640.field9024 & 16711680;
                                var3[var529] = ((var543 | var544) >>> 8) + class640.field9004;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var545 = this.field8712[var528];
                                if (var545 != 0) {
                                    var3[var529] = this.field8711[var545 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var546 = this.field8712[var528];
                                if (var546 != 0) {
                                    int var547 = this.field8711[var546 & 255];
                                    if ((class640.field9017 & 16777215) == 16777215) {
                                        int var548 = class640.field9017 >>> 24;
                                        int var549 = 256 - var548;
                                        int var550 = var3[var529];
                                        var3[var529] = ((var547 & 16711935) * var548 + (var550 & 16711935) * var549 & -16711936) + ((var547 & 65280) * var548 + (var550 & 65280) * var549 & 16711680) >> 8;
                                    } else if (class640.field9024 != 255) {
                                        int var551 = (var547 & 16711680) * class640.field9006 & -16777216;
                                        int var552 = (var547 & 65280) * class640.field9001 & 16711680;
                                        int var553 = (var547 & 255) * class640.field9021 & 65280;
                                        int var554 = (var551 | var552 | var553) >>> 8;
                                        int var555 = var3[var529];
                                        var3[var529] = ((var554 & 16711935) * class640.field9024 + (var555 & 16711935) * class640.field9013 & -16711936) + ((var554 & 65280) * class640.field9024 + (var555 & 65280) * class640.field9013 & 16711680) >> 8;
                                    } else {
                                        int var556 = (var547 & 16711680) * class640.field9006 & -16777216;
                                        int var557 = (var547 & 65280) * class640.field9001 & 16711680;
                                        int var558 = (var547 & 255) * class640.field9021 & 65280;
                                        var3[var529] = (var556 | var557 | var558) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var559 = this.field8712[var528];
                                int var560 = var559 > 0 ? this.field8711[var559] : 0;
                                int var561 = class640.field9017;
                                int var562 = var560 + var561;
                                int var563 = (var560 & 16711935) + (var561 & 16711935);
                                int var564 = (var562 - var563 & 65536) + (var563 & 16777472);
                                int var565 = var562 - var564 | var564 - (var564 >>> 8);
                                if (var560 == 0 && class640.field9024 != 255) {
                                    int var567 = var3[var529];
                                    var565 = ((var565 & 16711935) * class640.field9024 + (var567 & 16711935) * class640.field9013 & -16711936) + ((var565 & 65280) * class640.field9024 + (var567 & 65280) * class640.field9013 & 16711680) >> 8;
                                }
                                var3[var529] = var565;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var568 = this.field8712[var528];
                                if (var568 != 0) {
                                    int var569 = this.field8711[var568 & 255];
                                    int var570 = (var569 & 16711935) * class640.field9024 & -16711936;
                                    int var571 = (var569 & 65280) * class640.field9024 & 16711680;
                                    var3[var529++] = ((var570 | var571) >>> 8) + class640.field9004;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var572 = this.field8712[var528];
                                if (var572 != 0) {
                                    int var573 = this.field8711[var572 & 255];
                                    int var574 = var3[var529];
                                    int var575 = var573 + var574;
                                    int var576 = (var573 & 16711935) + (var574 & 16711935);
                                    int var577 = (var575 - var576 & 65536) + (var576 & 16777472);
                                    var3[var529] = var575 - var577 | var577 - (var577 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var578 = this.field8712[var528];
                                if (var578 != 0) {
                                    int var579 = this.field8711[var578 & 255];
                                    int var580 = (var579 & 16711680) * class640.field9006 & -16777216;
                                    int var581 = (var579 & 65280) * class640.field9001 & 16711680;
                                    int var582 = (var579 & 255) * class640.field9021 & 65280;
                                    int var583 = (var580 | var581 | var582) >>> 8;
                                    int var584 = var3[var529];
                                    int var585 = var583 + var584;
                                    int var586 = (var583 & 16711935) + (var584 & 16711935);
                                    int var587 = (var585 - var586 & 65536) + (var586 & 16777472);
                                    var3[var529] = var585 - var587 | var587 - (var587 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var588 = this.field8712[var528];
                                int var589 = var588 > 0 ? this.field8711[var588] : 0;
                                int var590 = class640.field9017;
                                int var591 = var589 + var590;
                                int var592 = (var589 & 16711935) + (var590 & 16711935);
                                int var593 = (var591 - var592 & 65536) + (var592 & 16777472);
                                int var594 = var591 - var593 | var593 - (var593 >>> 8);
                                if (var589 == 0 && class640.field9024 != 255) {
                                    int var596 = var3[var529];
                                    var594 = ((var594 & 16711935) * class640.field9024 + (var596 & 16711935) * class640.field9013 & -16711936) + ((var594 & 65280) * class640.field9024 + (var596 & 65280) * class640.field9013 & 16711680) >> 8;
                                }
                                var3[var529] = var594;
                            } else if (arg0 == 2) {
                                byte var597 = this.field8712[var528];
                                if (var597 != 0) {
                                    int var598 = this.field8711[var597 & 255];
                                    int var599 = (var598 & 16711935) * class640.field9024 & -16711936;
                                    int var600 = (var598 & 65280) * class640.field9024 & 16711680;
                                    int var601 = ((var599 | var600) >>> 8) + class640.field9004;
                                    int var602 = var3[var529];
                                    int var603 = var601 + var602;
                                    int var604 = (var601 & 16711935) + (var602 & 16711935);
                                    int var605 = (var603 - var604 & 65536) + (var604 & 16777472);
                                    var3[var529] = var603 - var605 | var605 - (var605 >>> 8);
                                }
                            }
                        }
                        var523 += class640.field9002;
                        ++var525;
                    }
                }
                ++var521;
                class640.field9022 += class640.field9007;
                class640.field9020 += class640.field9027;
                class640.field9016 += class640.field9015;
            }
        } else if (class640.field9008 < 0) {
            for (int var606 = class640.field9026; var606 < 0; ++var606) {
                int var607 = class640.field9016;
                int var608 = class640.field9022 + class640.field8995;
                int var609 = class640.field9020 + class640.field8997;
                int var610 = class640.field9019;
                if (var608 < 0) {
                    int var611 = (class640.field9002 - 1 - var608) / class640.field9002;
                    var610 += var611;
                    var608 += class640.field9002 * var611;
                    var609 += class640.field9008 * var611;
                    var607 += var611;
                }
                int var612;
                if ((var612 = (var608 + 1 - (super.field9005 << 12) - class640.field9002) / class640.field9002) > var610) {
                    var610 = var612;
                }
                int var613;
                if ((var613 = var609 - (super.field9009 << 12)) >= 0) {
                    int var614 = (class640.field9008 - var613) / class640.field9008;
                    var610 += var614;
                    var608 += class640.field9002 * var614;
                    var609 += class640.field9008 * var614;
                    var607 += var614;
                }
                int var615;
                if ((var615 = (var609 - class640.field9008) / class640.field9008) > var610) {
                    var610 = var615;
                }
                while (var610 < 0) {
                    int var616 = (var608 >> 12) + (var609 >> 12) * super.field9005;
                    int var617 = var607++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var617] = this.field8711[this.field8712[var616] & 255];
                        } else if (arg0 == 0) {
                            int var621 = this.field8711[this.field8712[var616] & 255];
                            int var622 = (var621 & 16711680) * class640.field9006 & -16777216;
                            int var623 = (var621 & 65280) * class640.field9001 & 16711680;
                            int var624 = (var621 & 255) * class640.field9021 & 65280;
                            var3[var617] = (var622 | var623 | var624) >>> 8;
                        } else if (arg0 == 3) {
                            int var625 = this.field8711[this.field8712[var616] & 255];
                            int var626 = class640.field9017;
                            int var627 = var625 + var626;
                            int var628 = (var625 & 16711935) + (var626 & 16711935);
                            int var629 = (var627 - var628 & 65536) + (var628 & 16777472);
                            var3[var617] = var627 - var629 | var629 - (var629 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var630 = this.field8711[this.field8712[var616] & 255];
                            int var631 = (var630 & 16711935) * class640.field9024 & -16711936;
                            int var632 = (var630 & 65280) * class640.field9024 & 16711680;
                            var3[var617] = ((var631 | var632) >>> 8) + class640.field9004;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            byte var633 = this.field8712[var616];
                            if (var633 != 0) {
                                var3[var617] = this.field8711[var633 & 255];
                            }
                        } else if (arg0 == 0) {
                            byte var634 = this.field8712[var616];
                            if (var634 != 0) {
                                int var635 = this.field8711[var634 & 255];
                                if ((class640.field9017 & 16777215) == 16777215) {
                                    int var636 = class640.field9017 >>> 24;
                                    int var637 = 256 - var636;
                                    int var638 = var3[var617];
                                    var3[var617] = ((var635 & 16711935) * var636 + (var638 & 16711935) * var637 & -16711936) + ((var635 & 65280) * var636 + (var638 & 65280) * var637 & 16711680) >> 8;
                                } else if (class640.field9024 != 255) {
                                    int var639 = (var635 & 16711680) * class640.field9006 & -16777216;
                                    int var640 = (var635 & 65280) * class640.field9001 & 16711680;
                                    int var641 = (var635 & 255) * class640.field9021 & 65280;
                                    int var642 = (var639 | var640 | var641) >>> 8;
                                    int var643 = var3[var617];
                                    var3[var617] = ((var642 & 16711935) * class640.field9024 + (var643 & 16711935) * class640.field9013 & -16711936) + ((var642 & 65280) * class640.field9024 + (var643 & 65280) * class640.field9013 & 16711680) >> 8;
                                } else {
                                    int var644 = (var635 & 16711680) * class640.field9006 & -16777216;
                                    int var645 = (var635 & 65280) * class640.field9001 & 16711680;
                                    int var646 = (var635 & 255) * class640.field9021 & 65280;
                                    var3[var617] = (var644 | var645 | var646) >>> 8;
                                }
                            }
                        } else if (arg0 == 3) {
                            byte var647 = this.field8712[var616];
                            int var648 = var647 > 0 ? this.field8711[var647] : 0;
                            int var649 = class640.field9017;
                            int var650 = var648 + var649;
                            int var651 = (var648 & 16711935) + (var649 & 16711935);
                            int var652 = (var650 - var651 & 65536) + (var651 & 16777472);
                            int var653 = var650 - var652 | var652 - (var652 >>> 8);
                            if (var648 == 0 && class640.field9024 != 255) {
                                int var655 = var3[var617];
                                var653 = ((var653 & 16711935) * class640.field9024 + (var655 & 16711935) * class640.field9013 & -16711936) + ((var653 & 65280) * class640.field9024 + (var655 & 65280) * class640.field9013 & 16711680) >> 8;
                            }
                            var3[var617] = var653;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            byte var656 = this.field8712[var616];
                            if (var656 != 0) {
                                int var657 = this.field8711[var656 & 255];
                                int var658 = (var657 & 16711935) * class640.field9024 & -16711936;
                                int var659 = (var657 & 65280) * class640.field9024 & 16711680;
                                var3[var617++] = ((var658 | var659) >>> 8) + class640.field9004;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            byte var660 = this.field8712[var616];
                            if (var660 != 0) {
                                int var661 = this.field8711[var660 & 255];
                                int var662 = var3[var617];
                                int var663 = var661 + var662;
                                int var664 = (var661 & 16711935) + (var662 & 16711935);
                                int var665 = (var663 - var664 & 65536) + (var664 & 16777472);
                                var3[var617] = var663 - var665 | var665 - (var665 >>> 8);
                            }
                        } else if (arg0 == 0) {
                            byte var666 = this.field8712[var616];
                            if (var666 != 0) {
                                int var667 = this.field8711[var666 & 255];
                                int var668 = (var667 & 16711680) * class640.field9006 & -16777216;
                                int var669 = (var667 & 65280) * class640.field9001 & 16711680;
                                int var670 = (var667 & 255) * class640.field9021 & 65280;
                                int var671 = (var668 | var669 | var670) >>> 8;
                                int var672 = var3[var617];
                                int var673 = var671 + var672;
                                int var674 = (var671 & 16711935) + (var672 & 16711935);
                                int var675 = (var673 - var674 & 65536) + (var674 & 16777472);
                                var3[var617] = var673 - var675 | var675 - (var675 >>> 8);
                            }
                        } else if (arg0 == 3) {
                            byte var676 = this.field8712[var616];
                            int var677 = var676 > 0 ? this.field8711[var676] : 0;
                            int var678 = class640.field9017;
                            int var679 = var677 + var678;
                            int var680 = (var677 & 16711935) + (var678 & 16711935);
                            int var681 = (var679 - var680 & 65536) + (var680 & 16777472);
                            int var682 = var679 - var681 | var681 - (var681 >>> 8);
                            if (var677 == 0 && class640.field9024 != 255) {
                                int var684 = var3[var617];
                                var682 = ((var682 & 16711935) * class640.field9024 + (var684 & 16711935) * class640.field9013 & -16711936) + ((var682 & 65280) * class640.field9024 + (var684 & 65280) * class640.field9013 & 16711680) >> 8;
                            }
                            var3[var617] = var682;
                        } else if (arg0 == 2) {
                            byte var685 = this.field8712[var616];
                            if (var685 != 0) {
                                int var686 = this.field8711[var685 & 255];
                                int var687 = (var686 & 16711935) * class640.field9024 & -16711936;
                                int var688 = (var686 & 65280) * class640.field9024 & 16711680;
                                int var689 = ((var687 | var688) >>> 8) + class640.field9004;
                                int var690 = var3[var617];
                                int var691 = var689 + var690;
                                int var692 = (var689 & 16711935) + (var690 & 16711935);
                                int var693 = (var691 - var692 & 65536) + (var692 & 16777472);
                                var3[var617] = var691 - var693 | var693 - (var693 >>> 8);
                            }
                        }
                    }
                    var608 += class640.field9002;
                    var609 += class640.field9008;
                    ++var610;
                }
                class640.field9022 += class640.field9007;
                class640.field9020 += class640.field9027;
                class640.field9016 += class640.field9015;
            }
        } else {
            for (int var694 = class640.field9026; var694 < 0; ++var694) {
                int var695 = class640.field9016;
                int var696 = class640.field9022 + class640.field8995;
                int var697 = class640.field9020 + class640.field8997;
                int var698 = class640.field9019;
                if (var696 < 0) {
                    int var699 = (class640.field9002 - 1 - var696) / class640.field9002;
                    var698 += var699;
                    var696 += class640.field9002 * var699;
                    var697 += class640.field9008 * var699;
                    var695 += var699;
                }
                int var700;
                if ((var700 = (var696 + 1 - (super.field9005 << 12) - class640.field9002) / class640.field9002) > var698) {
                    var698 = var700;
                }
                if (var697 < 0) {
                    int var701 = (class640.field9008 - 1 - var697) / class640.field9008;
                    var698 += var701;
                    var696 += class640.field9002 * var701;
                    var697 += class640.field9008 * var701;
                    var695 += var701;
                }
                int var702;
                if ((var702 = (var697 + 1 - (super.field9009 << 12) - class640.field9008) / class640.field9008) > var698) {
                    var698 = var702;
                }
                while (var698 < 0) {
                    int var703 = (var696 >> 12) + (var697 >> 12) * super.field9005;
                    int var704 = var695++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var704] = this.field8711[this.field8712[var703] & 255];
                        } else if (arg0 == 0) {
                            int var708 = this.field8711[this.field8712[var703] & 255];
                            int var709 = (var708 & 16711680) * class640.field9006 & -16777216;
                            int var710 = (var708 & 65280) * class640.field9001 & 16711680;
                            int var711 = (var708 & 255) * class640.field9021 & 65280;
                            var3[var704] = (var709 | var710 | var711) >>> 8;
                        } else if (arg0 == 3) {
                            int var712 = this.field8711[this.field8712[var703] & 255];
                            int var713 = class640.field9017;
                            int var714 = var712 + var713;
                            int var715 = (var712 & 16711935) + (var713 & 16711935);
                            int var716 = (var714 - var715 & 65536) + (var715 & 16777472);
                            var3[var704] = var714 - var716 | var716 - (var716 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var717 = this.field8711[this.field8712[var703] & 255];
                            int var718 = (var717 & 16711935) * class640.field9024 & -16711936;
                            int var719 = (var717 & 65280) * class640.field9024 & 16711680;
                            var3[var704] = ((var718 | var719) >>> 8) + class640.field9004;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            byte var720 = this.field8712[var703];
                            if (var720 != 0) {
                                var3[var704] = this.field8711[var720 & 255];
                            }
                        } else if (arg0 == 0) {
                            byte var721 = this.field8712[var703];
                            if (var721 != 0) {
                                int var722 = this.field8711[var721 & 255];
                                if ((class640.field9017 & 16777215) == 16777215) {
                                    int var723 = class640.field9017 >>> 24;
                                    int var724 = 256 - var723;
                                    int var725 = var3[var704];
                                    var3[var704] = ((var722 & 16711935) * var723 + (var725 & 16711935) * var724 & -16711936) + ((var722 & 65280) * var723 + (var725 & 65280) * var724 & 16711680) >> 8;
                                } else if (class640.field9024 != 255) {
                                    int var726 = (var722 & 16711680) * class640.field9006 & -16777216;
                                    int var727 = (var722 & 65280) * class640.field9001 & 16711680;
                                    int var728 = (var722 & 255) * class640.field9021 & 65280;
                                    int var729 = (var726 | var727 | var728) >>> 8;
                                    int var730 = var3[var704];
                                    var3[var704] = ((var729 & 16711935) * class640.field9024 + (var730 & 16711935) * class640.field9013 & -16711936) + ((var729 & 65280) * class640.field9024 + (var730 & 65280) * class640.field9013 & 16711680) >> 8;
                                } else {
                                    int var731 = (var722 & 16711680) * class640.field9006 & -16777216;
                                    int var732 = (var722 & 65280) * class640.field9001 & 16711680;
                                    int var733 = (var722 & 255) * class640.field9021 & 65280;
                                    var3[var704] = (var731 | var732 | var733) >>> 8;
                                }
                            }
                        } else if (arg0 == 3) {
                            byte var734 = this.field8712[var703];
                            int var735 = var734 > 0 ? this.field8711[var734] : 0;
                            int var736 = class640.field9017;
                            int var737 = var735 + var736;
                            int var738 = (var735 & 16711935) + (var736 & 16711935);
                            int var739 = (var737 - var738 & 65536) + (var738 & 16777472);
                            int var740 = var737 - var739 | var739 - (var739 >>> 8);
                            if (var735 == 0 && class640.field9024 != 255) {
                                int var742 = var3[var704];
                                var740 = ((var740 & 16711935) * class640.field9024 + (var742 & 16711935) * class640.field9013 & -16711936) + ((var740 & 65280) * class640.field9024 + (var742 & 65280) * class640.field9013 & 16711680) >> 8;
                            }
                            var3[var704] = var740;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            byte var743 = this.field8712[var703];
                            if (var743 != 0) {
                                int var744 = this.field8711[var743 & 255];
                                int var745 = (var744 & 16711935) * class640.field9024 & -16711936;
                                int var746 = (var744 & 65280) * class640.field9024 & 16711680;
                                var3[var704++] = ((var745 | var746) >>> 8) + class640.field9004;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            byte var747 = this.field8712[var703];
                            if (var747 != 0) {
                                int var748 = this.field8711[var747 & 255];
                                int var749 = var3[var704];
                                int var750 = var748 + var749;
                                int var751 = (var748 & 16711935) + (var749 & 16711935);
                                int var752 = (var750 - var751 & 65536) + (var751 & 16777472);
                                var3[var704] = var750 - var752 | var752 - (var752 >>> 8);
                            }
                        } else if (arg0 == 0) {
                            byte var753 = this.field8712[var703];
                            if (var753 != 0) {
                                int var754 = this.field8711[var753 & 255];
                                int var755 = (var754 & 16711680) * class640.field9006 & -16777216;
                                int var756 = (var754 & 65280) * class640.field9001 & 16711680;
                                int var757 = (var754 & 255) * class640.field9021 & 65280;
                                int var758 = (var755 | var756 | var757) >>> 8;
                                int var759 = var3[var704];
                                int var760 = var758 + var759;
                                int var761 = (var758 & 16711935) + (var759 & 16711935);
                                int var762 = (var760 - var761 & 65536) + (var761 & 16777472);
                                var3[var704] = var760 - var762 | var762 - (var762 >>> 8);
                            }
                        } else if (arg0 == 3) {
                            byte var763 = this.field8712[var703];
                            int var764 = var763 > 0 ? this.field8711[var763] : 0;
                            int var765 = class640.field9017;
                            int var766 = var764 + var765;
                            int var767 = (var764 & 16711935) + (var765 & 16711935);
                            int var768 = (var766 - var767 & 65536) + (var767 & 16777472);
                            int var769 = var766 - var768 | var768 - (var768 >>> 8);
                            if (var764 == 0 && class640.field9024 != 255) {
                                int var771 = var3[var704];
                                var769 = ((var769 & 16711935) * class640.field9024 + (var771 & 16711935) * class640.field9013 & -16711936) + ((var769 & 65280) * class640.field9024 + (var771 & 65280) * class640.field9013 & 16711680) >> 8;
                            }
                            var3[var704] = var769;
                        } else if (arg0 == 2) {
                            byte var772 = this.field8712[var703];
                            if (var772 != 0) {
                                int var773 = this.field8711[var772 & 255];
                                int var774 = (var773 & 16711935) * class640.field9024 & -16711936;
                                int var775 = (var773 & 65280) * class640.field9024 & 16711680;
                                int var776 = ((var774 | var775) >>> 8) + class640.field9004;
                                int var777 = var3[var704];
                                int var778 = var776 + var777;
                                int var779 = (var776 & 16711935) + (var777 & 16711935);
                                int var780 = (var778 - var779 & 65536) + (var779 & 16777472);
                                var3[var704] = var778 - var780 | var780 - (var780 >>> 8);
                            }
                        }
                    }
                    var696 += class640.field9002;
                    var697 += class640.field9008;
                    ++var698;
                }
                class640.field9022 += class640.field9007;
                class640.field9020 += class640.field9027;
                class640.field9016 += class640.field9015;
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "([I[III)V", line = 4507)
    public final void method498(int[] arg0, int[] arg1, int arg2, int arg3) {
        int[] var5 = super.field8996.field8086;
        if (class640.field9002 == 0) {
            if (class640.field9008 == 0) {
                int var6 = class640.field9026;
                while (var6 < 0) {
                    int var7 = arg3 + var6;
                    if (var7 >= 0) {
                        if (var7 >= arg0.length) {
                            return;
                        }
                        int var8 = class640.field9016;
                        int var9 = class640.field9022;
                        int var10 = class640.field9020;
                        int var11 = class640.field9019;
                        if (var9 >= 0 && var10 >= 0 && var9 - (super.field9005 << 12) < 0 && var10 - (super.field9009 << 12) < 0) {
                            int var12 = arg0[var7] - arg2;
                            int var13 = -arg1[var7];
                            int var14 = var12 - (var8 - class640.field9016);
                            if (var14 > 0) {
                                var8 += var14;
                                var11 += var14;
                                var9 += class640.field9002 * var14;
                                var10 += class640.field9008 * var14;
                            } else {
                                var13 -= var14;
                            }
                            if (var11 < var13) {
                                var11 = var13;
                            }
                            while (var11 < 0) {
                                byte var15 = this.field8712[(var9 >> 12) + (var10 >> 12) * super.field9005];
                                if (var15 != 0) {
                                    var5[var8++] = this.field8711[var15 & 255];
                                } else {
                                    ++var8;
                                }
                                ++var11;
                            }
                        }
                    }
                    ++var6;
                    class640.field9016 += class640.field9015;
                }
            } else if (class640.field9008 < 0) {
                int var16 = class640.field9026;
                while (var16 < 0) {
                    int var17 = arg3 + var16;
                    if (var17 >= 0) {
                        if (var17 >= arg0.length) {
                            return;
                        }
                        int var18 = class640.field9016;
                        int var19 = class640.field9022;
                        int var20 = class640.field9020 + class640.field8997;
                        int var21 = class640.field9019;
                        if (var19 >= 0 && var19 - (super.field9005 << 12) < 0) {
                            int var22;
                            if ((var22 = var20 - (super.field9009 << 12)) >= 0) {
                                int var23 = (class640.field9008 - var22) / class640.field9008;
                                var21 += var23;
                                var20 += class640.field9008 * var23;
                                var18 += var23;
                            }
                            int var24;
                            if ((var24 = (var20 - class640.field9008) / class640.field9008) > var21) {
                                var21 = var24;
                            }
                            int var25 = arg0[var17] - arg2;
                            int var26 = -arg1[var17];
                            int var27 = var25 - (var18 - class640.field9016);
                            if (var27 > 0) {
                                var18 += var27;
                                var21 += var27;
                                var19 += class640.field9002 * var27;
                                var20 += class640.field9008 * var27;
                            } else {
                                var26 -= var27;
                            }
                            if (var21 < var26) {
                                var21 = var26;
                            }
                            while (var21 < 0) {
                                byte var28 = this.field8712[(var19 >> 12) + (var20 >> 12) * super.field9005];
                                if (var28 != 0) {
                                    var5[var18++] = this.field8711[var28 & 255];
                                } else {
                                    ++var18;
                                }
                                var20 += class640.field9008;
                                ++var21;
                            }
                        }
                    }
                    ++var16;
                    class640.field9022 += class640.field9007;
                    class640.field9016 += class640.field9015;
                }
            } else {
                int var29 = class640.field9026;
                while (var29 < 0) {
                    int var30 = arg3 + var29;
                    if (var30 >= 0) {
                        if (var30 >= arg0.length) {
                            return;
                        }
                        int var31 = class640.field9016;
                        int var32 = class640.field9022;
                        int var33 = class640.field9020 + class640.field8997;
                        int var34 = class640.field9019;
                        if (var32 >= 0 && var32 - (super.field9005 << 12) < 0) {
                            if (var33 < 0) {
                                int var35 = (class640.field9008 - 1 - var33) / class640.field9008;
                                var34 += var35;
                                var33 += class640.field9008 * var35;
                                var31 += var35;
                            }
                            int var36;
                            if ((var36 = (var33 + 1 - (super.field9009 << 12) - class640.field9008) / class640.field9008) > var34) {
                                var34 = var36;
                            }
                            int var37 = arg0[var30] - arg2;
                            int var38 = -arg1[var30];
                            int var39 = var37 - (var31 - class640.field9016);
                            if (var39 > 0) {
                                var31 += var39;
                                var34 += var39;
                                var32 += class640.field9002 * var39;
                                var33 += class640.field9008 * var39;
                            } else {
                                var38 -= var39;
                            }
                            if (var34 < var38) {
                                var34 = var38;
                            }
                            while (var34 < 0) {
                                byte var40 = this.field8712[(var32 >> 12) + (var33 >> 12) * super.field9005];
                                if (var40 != 0) {
                                    var5[var31++] = this.field8711[var40 & 255];
                                } else {
                                    ++var31;
                                }
                                var33 += class640.field9008;
                                ++var34;
                            }
                        }
                    }
                    ++var29;
                    class640.field9022 += class640.field9007;
                    class640.field9016 += class640.field9015;
                }
            }
        } else if (class640.field9002 < 0) {
            if (class640.field9008 == 0) {
                int var41 = class640.field9026;
                while (var41 < 0) {
                    int var42 = arg3 + var41;
                    if (var42 >= 0) {
                        if (var42 >= arg0.length) {
                            return;
                        }
                        int var43 = class640.field9016;
                        int var44 = class640.field9022 + class640.field8995;
                        int var45 = class640.field9020;
                        int var46 = class640.field9019;
                        if (var45 >= 0 && var45 - (super.field9009 << 12) < 0) {
                            int var47;
                            if ((var47 = var44 - (super.field9005 << 12)) >= 0) {
                                int var48 = (class640.field9002 - var47) / class640.field9002;
                                var46 += var48;
                                var44 += class640.field9002 * var48;
                                var43 += var48;
                            }
                            int var49;
                            if ((var49 = (var44 - class640.field9002) / class640.field9002) > var46) {
                                var46 = var49;
                            }
                            int var50 = arg0[var42] - arg2;
                            int var51 = -arg1[var42];
                            int var52 = var50 - (var43 - class640.field9016);
                            if (var52 > 0) {
                                var43 += var52;
                                var46 += var52;
                                var44 += class640.field9002 * var52;
                                var45 += class640.field9008 * var52;
                            } else {
                                var51 -= var52;
                            }
                            if (var46 < var51) {
                                var46 = var51;
                            }
                            while (var46 < 0) {
                                byte var53 = this.field8712[(var44 >> 12) + (var45 >> 12) * super.field9005];
                                if (var53 != 0) {
                                    var5[var43++] = this.field8711[var53 & 255];
                                } else {
                                    ++var43;
                                }
                                var44 += class640.field9002;
                                ++var46;
                            }
                        }
                    }
                    ++var41;
                    class640.field9020 += class640.field9027;
                    class640.field9016 += class640.field9015;
                }
            } else if (class640.field9008 < 0) {
                int var54 = class640.field9026;
                while (var54 < 0) {
                    int var55 = arg3 + var54;
                    if (var55 >= 0) {
                        if (var55 >= arg0.length) {
                            return;
                        }
                        int var56 = class640.field9016;
                        int var57 = class640.field9022 + class640.field8995;
                        int var58 = class640.field9020 + class640.field8997;
                        int var59 = class640.field9019;
                        int var60;
                        if ((var60 = var57 - (super.field9005 << 12)) >= 0) {
                            int var61 = (class640.field9002 - var60) / class640.field9002;
                            var59 += var61;
                            var57 += class640.field9002 * var61;
                            var58 += class640.field9008 * var61;
                            var56 += var61;
                        }
                        int var62;
                        if ((var62 = (var57 - class640.field9002) / class640.field9002) > var59) {
                            var59 = var62;
                        }
                        int var63;
                        if ((var63 = var58 - (super.field9009 << 12)) >= 0) {
                            int var64 = (class640.field9008 - var63) / class640.field9008;
                            var59 += var64;
                            var57 += class640.field9002 * var64;
                            var58 += class640.field9008 * var64;
                            var56 += var64;
                        }
                        int var65;
                        if ((var65 = (var58 - class640.field9008) / class640.field9008) > var59) {
                            var59 = var65;
                        }
                        int var66 = arg0[var55] - arg2;
                        int var67 = -arg1[var55];
                        int var68 = var66 - (var56 - class640.field9016);
                        if (var68 > 0) {
                            var56 += var68;
                            var59 += var68;
                            var57 += class640.field9002 * var68;
                            var58 += class640.field9008 * var68;
                        } else {
                            var67 -= var68;
                        }
                        if (var59 < var67) {
                            var59 = var67;
                        }
                        while (var59 < 0) {
                            byte var69 = this.field8712[(var57 >> 12) + (var58 >> 12) * super.field9005];
                            if (var69 != 0) {
                                var5[var56++] = this.field8711[var69 & 255];
                            } else {
                                ++var56;
                            }
                            var57 += class640.field9002;
                            var58 += class640.field9008;
                            ++var59;
                        }
                    }
                    ++var54;
                    class640.field9022 += class640.field9007;
                    class640.field9020 += class640.field9027;
                    class640.field9016 += class640.field9015;
                }
            } else {
                int var70 = class640.field9026;
                while (var70 < 0) {
                    int var71 = arg3 + var70;
                    if (var71 >= 0) {
                        if (var71 >= arg0.length) {
                            return;
                        }
                        int var72 = class640.field9016;
                        int var73 = class640.field9022 + class640.field8995;
                        int var74 = class640.field9020 + class640.field8997;
                        int var75 = class640.field9019;
                        int var76;
                        if ((var76 = var73 - (super.field9005 << 12)) >= 0) {
                            int var77 = (class640.field9002 - var76) / class640.field9002;
                            var75 += var77;
                            var73 += class640.field9002 * var77;
                            var74 += class640.field9008 * var77;
                            var72 += var77;
                        }
                        int var78;
                        if ((var78 = (var73 - class640.field9002) / class640.field9002) > var75) {
                            var75 = var78;
                        }
                        if (var74 < 0) {
                            int var79 = (class640.field9008 - 1 - var74) / class640.field9008;
                            var75 += var79;
                            var73 += class640.field9002 * var79;
                            var74 += class640.field9008 * var79;
                            var72 += var79;
                        }
                        int var80;
                        if ((var80 = (var74 + 1 - (super.field9009 << 12) - class640.field9008) / class640.field9008) > var75) {
                            var75 = var80;
                        }
                        int var81 = arg0[var71] - arg2;
                        int var82 = -arg1[var71];
                        int var83 = var81 - (var72 - class640.field9016);
                        if (var83 > 0) {
                            var72 += var83;
                            var75 += var83;
                            var73 += class640.field9002 * var83;
                            var74 += class640.field9008 * var83;
                        } else {
                            var82 -= var83;
                        }
                        if (var75 < var82) {
                            var75 = var82;
                        }
                        while (var75 < 0) {
                            byte var84 = this.field8712[(var73 >> 12) + (var74 >> 12) * super.field9005];
                            if (var84 != 0) {
                                var5[var72++] = this.field8711[var84 & 255];
                            } else {
                                ++var72;
                            }
                            var73 += class640.field9002;
                            var74 += class640.field9008;
                            ++var75;
                        }
                    }
                    ++var70;
                    class640.field9022 += class640.field9007;
                    class640.field9020 += class640.field9027;
                    class640.field9016 += class640.field9015;
                }
            }
        } else if (class640.field9008 == 0) {
            int var85 = class640.field9026;
            while (var85 < 0) {
                int var86 = arg3 + var85;
                if (var86 >= 0) {
                    if (var86 >= arg0.length) {
                        return;
                    }
                    int var87 = class640.field9016;
                    int var88 = class640.field9022 + class640.field8995;
                    int var89 = class640.field9020;
                    int var90 = class640.field9019;
                    if (var89 >= 0 && var89 - (super.field9009 << 12) < 0) {
                        if (var88 < 0) {
                            int var91 = (class640.field9002 - 1 - var88) / class640.field9002;
                            var90 += var91;
                            var88 += class640.field9002 * var91;
                            var87 += var91;
                        }
                        int var92;
                        if ((var92 = (var88 + 1 - (super.field9005 << 12) - class640.field9002) / class640.field9002) > var90) {
                            var90 = var92;
                        }
                        int var93 = arg0[var86] - arg2;
                        int var94 = -arg1[var86];
                        int var95 = var93 - (var87 - class640.field9016);
                        if (var95 > 0) {
                            var87 += var95;
                            var90 += var95;
                            var88 += class640.field9002 * var95;
                            var89 += class640.field9008 * var95;
                        } else {
                            var94 -= var95;
                        }
                        if (var90 < var94) {
                            var90 = var94;
                        }
                        while (var90 < 0) {
                            byte var96 = this.field8712[(var88 >> 12) + (var89 >> 12) * super.field9005];
                            if (var96 != 0) {
                                var5[var87++] = this.field8711[var96 & 255];
                            } else {
                                ++var87;
                            }
                            var88 += class640.field9002;
                            ++var90;
                        }
                    }
                }
                ++var85;
                class640.field9022 += class640.field9007;
                class640.field9020 += class640.field9027;
                class640.field9016 += class640.field9015;
            }
        } else if (class640.field9008 < 0) {
            int var97 = class640.field9026;
            while (var97 < 0) {
                int var98 = arg3 + var97;
                if (var98 >= 0) {
                    if (var98 >= arg0.length) {
                        return;
                    }
                    int var99 = class640.field9016;
                    int var100 = class640.field9022 + class640.field8995;
                    int var101 = class640.field9020 + class640.field8997;
                    int var102 = class640.field9019;
                    if (var100 < 0) {
                        int var103 = (class640.field9002 - 1 - var100) / class640.field9002;
                        var102 += var103;
                        var100 += class640.field9002 * var103;
                        var101 += class640.field9008 * var103;
                        var99 += var103;
                    }
                    int var104;
                    if ((var104 = (var100 + 1 - (super.field9005 << 12) - class640.field9002) / class640.field9002) > var102) {
                        var102 = var104;
                    }
                    int var105;
                    if ((var105 = var101 - (super.field9009 << 12)) >= 0) {
                        int var106 = (class640.field9008 - var105) / class640.field9008;
                        var102 += var106;
                        var100 += class640.field9002 * var106;
                        var101 += class640.field9008 * var106;
                        var99 += var106;
                    }
                    int var107;
                    if ((var107 = (var101 - class640.field9008) / class640.field9008) > var102) {
                        var102 = var107;
                    }
                    int var108 = arg0[var98] - arg2;
                    int var109 = -arg1[var98];
                    int var110 = var108 - (var99 - class640.field9016);
                    if (var110 > 0) {
                        var99 += var110;
                        var102 += var110;
                        var100 += class640.field9002 * var110;
                        var101 += class640.field9008 * var110;
                    } else {
                        var109 -= var110;
                    }
                    if (var102 < var109) {
                        var102 = var109;
                    }
                    while (var102 < 0) {
                        byte var111 = this.field8712[(var100 >> 12) + (var101 >> 12) * super.field9005];
                        if (var111 != 0) {
                            var5[var99++] = this.field8711[var111 & 255];
                        } else {
                            ++var99;
                        }
                        var100 += class640.field9002;
                        var101 += class640.field9008;
                        ++var102;
                    }
                }
                ++var97;
                class640.field9022 += class640.field9007;
                class640.field9020 += class640.field9027;
                class640.field9016 += class640.field9015;
            }
        } else {
            int var112 = class640.field9026;
            while (var112 < 0) {
                int var113 = arg3 + var112;
                if (var113 >= 0) {
                    if (var113 >= arg0.length) {
                        return;
                    }
                    int var114 = class640.field9016;
                    int var115 = class640.field9022 + class640.field8995;
                    int var116 = class640.field9020 + class640.field8997;
                    int var117 = class640.field9019;
                    if (var115 < 0) {
                        int var118 = (class640.field9002 - 1 - var115) / class640.field9002;
                        var117 += var118;
                        var115 += class640.field9002 * var118;
                        var116 += class640.field9008 * var118;
                        var114 += var118;
                    }
                    int var119;
                    if ((var119 = (var115 + 1 - (super.field9005 << 12) - class640.field9002) / class640.field9002) > var117) {
                        var117 = var119;
                    }
                    if (var116 < 0) {
                        int var120 = (class640.field9008 - 1 - var116) / class640.field9008;
                        var117 += var120;
                        var115 += class640.field9002 * var120;
                        var116 += class640.field9008 * var120;
                        var114 += var120;
                    }
                    int var121;
                    if ((var121 = (var116 + 1 - (super.field9009 << 12) - class640.field9008) / class640.field9008) > var117) {
                        var117 = var121;
                    }
                    int var122 = arg0[var113] - arg2;
                    int var123 = -arg1[var113];
                    int var124 = var122 - (var114 - class640.field9016);
                    if (var124 > 0) {
                        var114 += var124;
                        var117 += var124;
                        var115 += class640.field9002 * var124;
                        var116 += class640.field9008 * var124;
                    } else {
                        var123 -= var124;
                    }
                    if (var117 < var123) {
                        var117 = var123;
                    }
                    while (var117 < 0) {
                        byte var125 = this.field8712[(var115 >> 12) + (var116 >> 12) * super.field9005];
                        if (var125 != 0) {
                            var5[var114++] = this.field8711[var125 & 255];
                        } else {
                            ++var114;
                        }
                        var115 += class640.field9002;
                        var116 += class640.field9008;
                        ++var117;
                    }
                }
                ++var112;
                class640.field9022 += class640.field9007;
                class640.field9020 += class640.field9027;
                class640.field9016 += class640.field9015;
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IILua;II)V", line = 5253)
    public final void method153(int arg0, int arg1, class600 arg2, int arg3, int arg4) {
        if (super.field8996.method3185()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field9025 + arg0;
            int var7 = super.field9000 + arg1;
            int var8 = 0;
            int var9 = super.field8996.field8081;
            int var10 = super.field9005;
            int var11 = super.field9009;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var7 * var9 + var6;
            if (var7 < super.field8996.field8073) {
                int var15 = super.field8996.field8073 - var7;
                var11 -= var15;
                var7 = super.field8996.field8073;
                var8 += var10 * var15;
                var14 += var9 * var15;
            }
            if (var7 + var11 > super.field8996.field8107) {
                var11 -= var7 + var11 - super.field8996.field8107;
            }
            if (var6 < super.field8996.field8103) {
                int var16 = super.field8996.field8103 - var6;
                var10 -= var16;
                var6 = super.field8996.field8103;
                var8 += var16;
                var14 += var16;
                var13 += var16;
                var12 += var16;
            }
            if (var6 + var10 > super.field8996.field8080) {
                int var17 = var6 + var10 - super.field8996.field8080;
                var10 -= var17;
                var13 += var17;
                var12 += var17;
            }
            if (var10 > 0 && var11 > 0) {
                class355 var18 = (class355) arg2;
                int[] var19 = var18.field4526;
                int[] var20 = var18.field4530;
                int[] var21 = super.field8996.field8086;
                int var22 = var7;
                if (arg4 > var7) {
                    var22 = arg4;
                    var14 += (arg4 - var7) * var9;
                    var8 += (arg4 - var7) * super.field9005;
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
                        byte var32 = this.field8712[var8++];
                        if (var32 != 0) {
                            var21[var14++] = this.field8711[var32 & 255];
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

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lnga;[B[III)V", line = 5399)
    public class623(class578 arg0, byte[] arg1, int[] arg2, int arg3, int arg4) {
        super(arg0, arg3, arg4);
        this.field8712 = arg1;
        this.field8711 = arg2;
    }

    @OriginalMember(owner = "client!lga", name = "YA", descriptor = "(IIIIIIII)V", line = 5404)
    public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (super.field8996.method3185()) {
            throw new IllegalStateException();
        } else if (arg2 > 0 && arg3 > 0) {
            int var9 = 0;
            int var10 = 0;
            int var11 = super.field8996.field8081;
            int var12 = super.field9025 + super.field9005 + super.field9011;
            int var13 = super.field9009 + super.field9000 + super.field9023;
            int var14 = (var12 << 16) / arg2;
            int var15 = (var13 << 16) / arg3;
            if (super.field9025 > 0) {
                int var16 = ((super.field9025 << 16) + var14 - 1) / var14;
                arg0 += var16;
                var9 += var14 * var16 - (super.field9025 << 16);
            }
            if (super.field9000 > 0) {
                int var17 = ((super.field9000 << 16) + var15 - 1) / var15;
                arg1 += var17;
                var10 += var15 * var17 - (super.field9000 << 16);
            }
            if (super.field9005 < var12) {
                arg2 = ((super.field9005 << 16) - var9 + var14 - 1) / var14;
            }
            if (super.field9009 < var13) {
                arg3 = ((super.field9009 << 16) - var10 + var15 - 1) / var15;
            }
            int var18 = arg1 * var11 + arg0;
            int var19 = var11 - arg2;
            if (arg1 + arg3 > super.field8996.field8107) {
                arg3 -= arg1 + arg3 - super.field8996.field8107;
            }
            if (arg1 < super.field8996.field8073) {
                int var20 = super.field8996.field8073 - arg1;
                arg3 -= var20;
                var18 += var11 * var20;
                var10 += var15 * var20;
            }
            if (arg0 + arg2 > super.field8996.field8080) {
                int var21 = arg0 + arg2 - super.field8996.field8080;
                arg2 -= var21;
                var19 += var21;
            }
            if (arg0 < super.field8996.field8103) {
                int var22 = super.field8996.field8103 - arg0;
                arg2 -= var22;
                var18 += var22;
                var9 += var14 * var22;
                var19 += var22;
            }
            int[] var23 = super.field8996.field8086;
            if (arg6 == 0) {
                if (arg4 == 1) {
                    int var24 = var9;
                    for (int var25 = -arg3; var25 < 0; ++var25) {
                        int var26 = (var10 >> 16) * super.field9005;
                        for (int var27 = -arg2; var27 < 0; ++var27) {
                            var23[var18++] = this.field8711[this.field8712[(var9 >> 16) + var26] & 255];
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var24;
                        var18 += var19;
                    }
                } else if (arg4 == 0) {
                    int var28 = (arg5 & 16711680) >> 16;
                    int var29 = (arg5 & 65280) >> 8;
                    int var30 = arg5 & 255;
                    int var31 = var9;
                    for (int var32 = -arg3; var32 < 0; ++var32) {
                        int var33 = (var10 >> 16) * super.field9005;
                        for (int var34 = -arg2; var34 < 0; ++var34) {
                            int var35 = this.field8711[this.field8712[(var9 >> 16) + var33] & 255];
                            int var36 = (var35 & 16711680) * var28 & -16777216;
                            int var37 = (var35 & 65280) * var29 & 16711680;
                            int var38 = (var35 & 255) * var30 & 65280;
                            var23[var18++] = (var36 | var37 | var38) >>> 8;
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var31;
                        var18 += var19;
                    }
                } else if (arg4 == 3) {
                    int var39 = var9;
                    for (int var40 = -arg3; var40 < 0; ++var40) {
                        int var41 = (var10 >> 16) * super.field9005;
                        for (int var42 = -arg2; var42 < 0; ++var42) {
                            byte var43 = this.field8712[(var9 >> 16) + var41];
                            int var44 = var43 > 0 ? this.field8711[var43] : 0;
                            int var45 = arg5 + var44;
                            int var46 = (arg5 & 16711935) + (var44 & 16711935);
                            int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                            var23[var18++] = var45 - var47 | var47 - (var47 >>> 8);
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var39;
                        var18 += var19;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var48 = arg5 >>> 24;
                    int var49 = 256 - var48;
                    int var50 = (arg5 & 16711935) * var49 & -16711936;
                    int var51 = (arg5 & 65280) * var49 & 16711680;
                    int var52 = (var50 | var51) >>> 8;
                    int var53 = var9;
                    for (int var54 = -arg3; var54 < 0; ++var54) {
                        int var55 = (var10 >> 16) * super.field9005;
                        for (int var56 = -arg2; var56 < 0; ++var56) {
                            int var57 = this.field8711[this.field8712[(var9 >> 16) + var55] & 255];
                            int var58 = (var57 & 16711935) * var48 & -16711936;
                            int var59 = (var57 & 65280) * var48 & 16711680;
                            var23[var18++] = ((var58 | var59) >>> 8) + var52;
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var53;
                        var18 += var19;
                    }
                }
            } else if (arg6 == 1) {
                if (arg4 == 1) {
                    int var60 = var9;
                    for (int var61 = -arg3; var61 < 0; ++var61) {
                        int var62 = (var10 >> 16) * super.field9005;
                        for (int var63 = -arg2; var63 < 0; ++var63) {
                            byte var64 = this.field8712[(var9 >> 16) + var62];
                            if (var64 != 0) {
                                var23[var18++] = this.field8711[var64 & 255];
                            } else {
                                ++var18;
                            }
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var60;
                        var18 += var19;
                    }
                } else if (arg4 == 0) {
                    int var65 = var9;
                    if ((arg5 & 16777215) == 16777215) {
                        int var66 = arg5 >>> 24;
                        int var67 = 256 - var66;
                        for (int var68 = -arg3; var68 < 0; ++var68) {
                            int var69 = (var10 >> 16) * super.field9005;
                            for (int var70 = -arg2; var70 < 0; ++var70) {
                                byte var71 = this.field8712[(var9 >> 16) + var69];
                                if (var71 != 0) {
                                    int var72 = this.field8711[var71 & 255];
                                    int var73 = var23[var18];
                                    var23[var18++] = ((var72 & 16711935) * var66 + (var73 & 16711935) * var67 & -16711936) + ((var72 & 65280) * var66 + (var73 & 65280) * var67 & 16711680) >> 8;
                                } else {
                                    ++var18;
                                }
                                var9 += var14;
                            }
                            var10 += var15;
                            var9 = var65;
                            var18 += var19;
                        }
                    } else {
                        int var74 = (arg5 & 16711680) >> 16;
                        int var75 = (arg5 & 65280) >> 8;
                        int var76 = arg5 & 255;
                        int var77 = arg5 >>> 24;
                        int var78 = 256 - var77;
                        for (int var79 = -arg3; var79 < 0; ++var79) {
                            int var80 = (var10 >> 16) * super.field9005;
                            for (int var81 = -arg2; var81 < 0; ++var81) {
                                byte var82 = this.field8712[(var9 >> 16) + var80];
                                if (var82 != 0) {
                                    int var83 = this.field8711[var82 & 255];
                                    if (var77 != 255) {
                                        int var84 = (var83 & 16711680) * var74 & -16777216;
                                        int var85 = (var83 & 65280) * var75 & 16711680;
                                        int var86 = (var83 & 255) * var76 & 65280;
                                        int var87 = (var84 | var85 | var86) >>> 8;
                                        int var88 = var23[var18];
                                        var23[var18++] = ((var87 & 16711935) * var77 + (var88 & 16711935) * var78 & -16711936) + ((var87 & 65280) * var77 + (var88 & 65280) * var78 & 16711680) >> 8;
                                    } else {
                                        int var89 = (var83 & 16711680) * var74 & -16777216;
                                        int var90 = (var83 & 65280) * var75 & 16711680;
                                        int var91 = (var83 & 255) * var76 & 65280;
                                        var23[var18++] = (var89 | var90 | var91) >>> 8;
                                    }
                                } else {
                                    ++var18;
                                }
                                var9 += var14;
                            }
                            var10 += var15;
                            var9 = var65;
                            var18 += var19;
                        }
                    }
                } else if (arg4 == 3) {
                    int var92 = var9;
                    int var93 = arg5 >>> 24;
                    int var94 = 256 - var93;
                    for (int var95 = -arg3; var95 < 0; ++var95) {
                        int var96 = (var10 >> 16) * super.field9005;
                        for (int var97 = -arg2; var97 < 0; ++var97) {
                            byte var98 = this.field8712[(var9 >> 16) + var96];
                            int var99 = var98 > 0 ? this.field8711[var98] : 0;
                            int var100 = arg5 + var99;
                            int var101 = (arg5 & 16711935) + (var99 & 16711935);
                            int var102 = (var100 - var101 & 65536) + (var101 & 16777472);
                            int var103 = var100 - var102 | var102 - (var102 >>> 8);
                            if (var99 == 0 && var93 != 255) {
                                int var105 = var23[var18];
                                var103 = ((var103 & 16711935) * var93 + (var105 & 16711935) * var94 & -16711936) + ((var103 & 65280) * var93 + (var105 & 65280) * var94 & 16711680) >> 8;
                            }
                            var23[var18++] = var103;
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var92;
                        var18 += var19;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var106 = arg5 >>> 24;
                    int var107 = 256 - var106;
                    int var108 = (arg5 & 16711935) * var107 & -16711936;
                    int var109 = (arg5 & 65280) * var107 & 16711680;
                    int var110 = (var108 | var109) >>> 8;
                    int var111 = var9;
                    for (int var112 = -arg3; var112 < 0; ++var112) {
                        int var113 = (var10 >> 16) * super.field9005;
                        for (int var114 = -arg2; var114 < 0; ++var114) {
                            byte var115 = this.field8712[(var9 >> 16) + var113];
                            if (var115 != 0) {
                                int var116 = this.field8711[var115 & 255];
                                int var117 = (var116 & 16711935) * var106 & -16711936;
                                int var118 = (var116 & 65280) * var106 & 16711680;
                                var23[var18++] = ((var117 | var118) >>> 8) + var110;
                            } else {
                                ++var18;
                            }
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var111;
                        var18 += var19;
                    }
                }
            } else if (arg6 != 2) {
                throw new IllegalArgumentException();
            } else if (arg4 == 1) {
                int var119 = var9;
                for (int var120 = -arg3; var120 < 0; ++var120) {
                    int var121 = (var10 >> 16) * super.field9005;
                    for (int var122 = -arg2; var122 < 0; ++var122) {
                        byte var123 = this.field8712[(var9 >> 16) + var121];
                        if (var123 != 0) {
                            int var124 = this.field8711[var123 & 255];
                            int var125 = var23[var18];
                            int var126 = var124 + var125;
                            int var127 = (var124 & 16711935) + (var125 & 16711935);
                            int var128 = (var126 - var127 & 65536) + (var127 & 16777472);
                            var23[var18++] = var126 - var128 | var128 - (var128 >>> 8);
                        } else {
                            ++var18;
                        }
                        var9 += var14;
                    }
                    var10 += var15;
                    var9 = var119;
                    var18 += var19;
                }
            } else if (arg4 == 0) {
                int var129 = var9;
                int var130 = (arg5 & 16711680) >> 16;
                int var131 = (arg5 & 65280) >> 8;
                int var132 = arg5 & 255;
                for (int var133 = -arg3; var133 < 0; ++var133) {
                    int var134 = (var10 >> 16) * super.field9005;
                    for (int var135 = -arg2; var135 < 0; ++var135) {
                        byte var136 = this.field8712[(var9 >> 16) + var134];
                        if (var136 != 0) {
                            int var137 = this.field8711[var136 & 255];
                            int var138 = (var137 & 16711680) * var130 & -16777216;
                            int var139 = (var137 & 65280) * var131 & 16711680;
                            int var140 = (var137 & 255) * var132 & 65280;
                            int var141 = (var138 | var139 | var140) >>> 8;
                            int var142 = var23[var18];
                            int var143 = var141 + var142;
                            int var144 = (var141 & 16711935) + (var142 & 16711935);
                            int var145 = (var143 - var144 & 65536) + (var144 & 16777472);
                            var23[var18++] = var143 - var145 | var145 - (var145 >>> 8);
                        } else {
                            ++var18;
                        }
                        var9 += var14;
                    }
                    var10 += var15;
                    var9 = var129;
                    var18 += var19;
                }
            } else if (arg4 == 3) {
                int var146 = var9;
                for (int var147 = -arg3; var147 < 0; ++var147) {
                    int var148 = (var10 >> 16) * super.field9005;
                    for (int var149 = -arg2; var149 < 0; ++var149) {
                        byte var150 = this.field8712[(var9 >> 16) + var148];
                        int var151 = var150 > 0 ? this.field8711[var150] : 0;
                        int var152 = arg5 + var151;
                        int var153 = (arg5 & 16711935) + (var151 & 16711935);
                        int var154 = (var152 - var153 & 65536) + (var153 & 16777472);
                        int var155 = var152 - var154 | var154 - (var154 >>> 8);
                        int var156 = var23[var18];
                        int var157 = var155 + var156;
                        int var158 = (var155 & 16711935) + (var156 & 16711935);
                        int var159 = (var157 - var158 & 65536) + (var158 & 16777472);
                        var23[var18++] = var157 - var159 | var159 - (var159 >>> 8);
                        var9 += var14;
                    }
                    var10 += var15;
                    var9 = var146;
                    var18 += var19;
                }
            } else if (arg4 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var160 = arg5 >>> 24;
                int var161 = 256 - var160;
                int var162 = (arg5 & 16711935) * var161 & -16711936;
                int var163 = (arg5 & 65280) * var161 & 16711680;
                int var164 = (var162 | var163) >>> 8;
                int var165 = var9;
                for (int var166 = -arg3; var166 < 0; ++var166) {
                    int var167 = (var10 >> 16) * super.field9005;
                    for (int var168 = -arg2; var168 < 0; ++var168) {
                        byte var169 = this.field8712[(var9 >> 16) + var167];
                        if (var169 != 0) {
                            int var170 = this.field8711[var169 & 255];
                            int var171 = (var170 & 16711935) * var160 & -16711936;
                            int var172 = (var170 & 65280) * var160 & 16711680;
                            int var173 = ((var171 | var172) >>> 8) + var164;
                            int var174 = var23[var18];
                            int var175 = var173 + var174;
                            int var176 = (var173 & 16711935) + (var174 & 16711935);
                            int var177 = (var175 - var176 & 65536) + (var176 & 16777472);
                            var23[var18++] = var175 - var177 | var177 - (var177 >>> 8);
                        } else {
                            ++var18;
                        }
                        var9 += var14;
                    }
                    var10 += var15;
                    var9 = var165;
                    var18 += var19;
                }
            }
        }
    }
}
