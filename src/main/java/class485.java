import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class485 extends class1 {

    @OriginalMember(owner = "client!di", name = "H", descriptor = "[I")
    public int[] field6691;

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lrp;[IIIIIZ)V", line = 3)
    public class485(class680 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg4, arg5);
        if (arg6) {
            this.field6691 = new int[arg4 * arg5];
        } else {
            this.field6691 = arg1;
        }
        int var8 = arg3 - super.field32;
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; ++var10) {
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg1[arg2++];
                if (var12 >>> 24 == 255) {
                    this.field6691[var9++] = (var12 & 16777215) == 0 ? -16777215 : var12;
                } else {
                    this.field6691[var9++] = 0;
                }
            }
            arg2 += var8;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 41)
    public final void method277(int arg0, int arg1, int arg2) {
        throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIII)V", line = 46)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int[] var7 = super.field31.field9629;
        for (int var8 = 0; var8 < arg3; ++var8) {
            int var9 = (arg1 + var8) * super.field32 + arg0;
            int var10 = (arg5 + var8) * super.field31.field9635 + arg4;
            for (int var11 = 0; var11 < arg2; ++var11) {
                this.field6691[var9 + var11] = var7[var10 + var11];
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILaa;II)V", line = 70)
    public final void method9(int arg0, int arg1, class88 arg2, int arg3, int arg4) {
        if (super.field31.method3831()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field22 + arg0;
            int var7 = super.field11 + arg1;
            int var8 = 0;
            int var9 = super.field31.field9635;
            int var10 = super.field32;
            int var11 = super.field10;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var7 * var9 + var6;
            if (var7 < super.field31.field9628) {
                int var15 = super.field31.field9628 - var7;
                var11 -= var15;
                var7 = super.field31.field9628;
                var8 += var10 * var15;
                var14 += var9 * var15;
            }
            if (var7 + var11 > super.field31.field9622) {
                var11 -= var7 + var11 - super.field31.field9622;
            }
            if (var6 < super.field31.field9637) {
                int var16 = super.field31.field9637 - var6;
                var10 -= var16;
                var6 = super.field31.field9637;
                var8 += var16;
                var14 += var16;
                var13 += var16;
                var12 += var16;
            }
            if (var6 + var10 > super.field31.field9647) {
                int var17 = var6 + var10 - super.field31.field9647;
                var10 -= var17;
                var13 += var17;
                var12 += var17;
            }
            if (var10 > 0 && var11 > 0) {
                class301 var18 = (class301) arg2;
                int[] var19 = var18.field4328;
                int[] var20 = var18.field4331;
                int[] var21 = super.field31.field9629;
                int var22 = var7;
                if (arg4 > var7) {
                    var22 = arg4;
                    var14 += (arg4 - var7) * var9;
                    var8 += (arg4 - var7) * super.field32;
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
                        int var32 = this.field6691[var8++];
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

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIII)V", line = 214)
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 > 0 && arg4 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = super.field32 + super.field22 + super.field20;
            int var13 = super.field11 + super.field10 + super.field26;
            int var14 = (var12 << 16) / arg3;
            int var15 = (var13 << 16) / arg4;
            if (super.field22 > 0) {
                int var16 = ((super.field22 << 16) + var14 - 1) / var14;
                arg0 += var16;
                var10 += var14 * var16 - (super.field22 << 16);
            }
            if (super.field11 > 0) {
                int var17 = ((super.field11 << 16) + var15 - 1) / var15;
                arg1 += var17;
                var11 += var15 * var17 - (super.field11 << 16);
            }
            if (super.field32 < var12) {
                arg3 = ((super.field32 << 16) - var10 + var14 - 1) / var14;
            }
            if (super.field10 < var13) {
                arg4 = ((super.field10 << 16) - var11 + var15 - 1) / var15;
            }
            int var18 = super.field31.field9635 * arg1 + arg0;
            int var19 = super.field31.field9635 - arg3;
            if (arg1 + arg4 > super.field31.field9622) {
                arg4 -= arg1 + arg4 - super.field31.field9622;
            }
            if (arg1 < super.field31.field9628) {
                int var20 = super.field31.field9628 - arg1;
                arg4 -= var20;
                var18 += super.field31.field9635 * var20;
                var11 += var15 * var20;
            }
            if (arg0 + arg3 > super.field31.field9647) {
                int var21 = arg0 + arg3 - super.field31.field9647;
                arg3 -= var21;
                var19 += var21;
            }
            if (arg0 < super.field31.field9637) {
                int var22 = super.field31.field9637 - arg0;
                arg3 -= var22;
                var18 += var22;
                var10 += var14 * var22;
                var19 += var22;
            }
            float[] var23 = super.field31.field9614;
            int[] var24 = super.field31.field9629;
            if (arg7 == 0) {
                if (arg5 == 1) {
                    int var25 = var10;
                    for (int var26 = -arg4; var26 < 0; ++var26) {
                        int var27 = (var11 >> 16) * super.field32;
                        for (int var28 = -arg3; var28 < 0; ++var28) {
                            if ((float) arg2 < var23[var18]) {
                                var24[var18] = this.field6691[(var10 >> 16) + var27];
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var25;
                        var18 += var19;
                    }
                } else if (arg5 == 0) {
                    int var29 = (arg6 & 16711680) >> 16;
                    int var30 = (arg6 & 65280) >> 8;
                    int var31 = arg6 & 255;
                    int var32 = var10;
                    for (int var33 = -arg4; var33 < 0; ++var33) {
                        int var34 = (var11 >> 16) * super.field32;
                        for (int var35 = -arg3; var35 < 0; ++var35) {
                            if ((float) arg2 < var23[var18]) {
                                int var36 = this.field6691[(var10 >> 16) + var34];
                                int var37 = (var36 & 16711680) * var29 & -16777216;
                                int var38 = (var36 & 65280) * var30 & 16711680;
                                int var39 = (var36 & 255) * var31 & 65280;
                                var24[var18] = (var37 | var38 | var39) >>> 8;
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var32;
                        var18 += var19;
                    }
                } else if (arg5 == 3) {
                    int var40 = var10;
                    for (int var41 = -arg4; var41 < 0; ++var41) {
                        int var42 = (var11 >> 16) * super.field32;
                        for (int var43 = -arg3; var43 < 0; ++var43) {
                            if ((float) arg2 < var23[var18]) {
                                int var44 = this.field6691[(var10 >> 16) + var42];
                                int var45 = arg6 + var44;
                                int var46 = (arg6 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                var24[var18] = var45 - var47 | var47 - (var47 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var40;
                        var18 += var19;
                    }
                } else if (arg5 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var48 = arg6 >>> 24;
                    int var49 = 256 - var48;
                    int var50 = (arg6 & 16711935) * var49 & -16711936;
                    int var51 = (arg6 & 65280) * var49 & 16711680;
                    int var52 = (var50 | var51) >>> 8;
                    int var53 = var10;
                    for (int var54 = -arg4; var54 < 0; ++var54) {
                        int var55 = (var11 >> 16) * super.field32;
                        for (int var56 = -arg3; var56 < 0; ++var56) {
                            if ((float) arg2 < var23[var18]) {
                                int var57 = this.field6691[(var10 >> 16) + var55];
                                int var58 = (var57 & 16711935) * var48 & -16711936;
                                int var59 = (var57 & 65280) * var48 & 16711680;
                                var24[var18] = ((var58 | var59) >>> 8) + var52;
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var53;
                        var18 += var19;
                    }
                }
            } else if (arg7 == 1) {
                if (arg5 == 1) {
                    int var60 = var10;
                    for (int var61 = -arg4; var61 < 0; ++var61) {
                        int var62 = (var11 >> 16) * super.field32;
                        for (int var63 = -arg3; var63 < 0; ++var63) {
                            if ((float) arg2 < var23[var18]) {
                                int var64 = this.field6691[(var10 >> 16) + var62];
                                if (var64 != 0) {
                                    var24[var18] = var64;
                                    var23[var18] = (float) arg2;
                                }
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var60;
                        var18 += var19;
                    }
                } else if (arg5 == 0) {
                    int var65 = var10;
                    if ((arg6 & 16777215) == 16777215) {
                        int var66 = arg6 >>> 24;
                        int var67 = 256 - var66;
                        for (int var68 = -arg4; var68 < 0; ++var68) {
                            int var69 = (var11 >> 16) * super.field32;
                            for (int var70 = -arg3; var70 < 0; ++var70) {
                                if ((float) arg2 < var23[var18]) {
                                    int var71 = this.field6691[(var10 >> 16) + var69];
                                    if (var71 != 0) {
                                        int var72 = var24[var18];
                                        var24[var18] = ((var71 & 16711935) * var66 + (var72 & 16711935) * var67 & -16711936) + ((var71 & 65280) * var66 + (var72 & 65280) * var67 & 16711680) >> 8;
                                        var23[var18] = (float) arg2;
                                    }
                                }
                                var10 += var14;
                                ++var18;
                            }
                            var11 += var15;
                            var10 = var65;
                            var18 += var19;
                        }
                    } else {
                        int var73 = (arg6 & 16711680) >> 16;
                        int var74 = (arg6 & 65280) >> 8;
                        int var75 = arg6 & 255;
                        int var76 = arg6 >>> 24;
                        int var77 = 256 - var76;
                        for (int var78 = -arg4; var78 < 0; ++var78) {
                            int var79 = (var11 >> 16) * super.field32;
                            for (int var80 = -arg3; var80 < 0; ++var80) {
                                if ((float) arg2 < var23[var18]) {
                                    int var81 = this.field6691[(var10 >> 16) + var79];
                                    if (var81 != 0) {
                                        if (var76 != 255) {
                                            int var82 = (var81 & 16711680) * var73 & -16777216;
                                            int var83 = (var81 & 65280) * var74 & 16711680;
                                            int var84 = (var81 & 255) * var75 & 65280;
                                            int var85 = (var82 | var83 | var84) >>> 8;
                                            int var86 = var24[var18];
                                            var24[var18] = ((var85 & 16711935) * var76 + (var86 & 16711935) * var77 & -16711936) + ((var85 & 65280) * var76 + (var86 & 65280) * var77 & 16711680) >> 8;
                                            var23[var18] = (float) arg2;
                                        } else {
                                            int var87 = (var81 & 16711680) * var73 & -16777216;
                                            int var88 = (var81 & 65280) * var74 & 16711680;
                                            int var89 = (var81 & 255) * var75 & 65280;
                                            var24[var18] = (var87 | var88 | var89) >>> 8;
                                            var23[var18] = (float) arg2;
                                        }
                                    }
                                }
                                var10 += var14;
                                ++var18;
                            }
                            var11 += var15;
                            var10 = var65;
                            var18 += var19;
                        }
                    }
                } else if (arg5 == 3) {
                    int var90 = var10;
                    int var91 = arg6 >>> 24;
                    int var92 = 256 - var91;
                    for (int var93 = -arg4; var93 < 0; ++var93) {
                        int var94 = (var11 >> 16) * super.field32;
                        for (int var95 = -arg3; var95 < 0; ++var95) {
                            if ((float) arg2 < var23[var18]) {
                                int var96 = this.field6691[(var10 >> 16) + var94];
                                int var97 = arg6 + var96;
                                int var98 = (arg6 & 16711935) + (var96 & 16711935);
                                int var99 = (var97 - var98 & 65536) + (var98 & 16777472);
                                int var100 = var97 - var99 | var99 - (var99 >>> 8);
                                if (var96 == 0 && var91 != 255) {
                                    int var102 = var24[var18];
                                    var100 = ((var100 & 16711935) * var91 + (var102 & 16711935) * var92 & -16711936) + ((var100 & 65280) * var91 + (var102 & 65280) * var92 & 16711680) >> 8;
                                }
                                var24[var18] = var100;
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var90;
                        var18 += var19;
                    }
                } else if (arg5 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var103 = arg6 >>> 24;
                    int var104 = 256 - var103;
                    int var105 = (arg6 & 16711935) * var104 & -16711936;
                    int var106 = (arg6 & 65280) * var104 & 16711680;
                    int var107 = (var105 | var106) >>> 8;
                    int var108 = var10;
                    for (int var109 = -arg4; var109 < 0; ++var109) {
                        int var110 = (var11 >> 16) * super.field32;
                        for (int var111 = -arg3; var111 < 0; ++var111) {
                            if ((float) arg2 < var23[var18]) {
                                int var112 = this.field6691[(var10 >> 16) + var110];
                                if (var112 != 0) {
                                    int var113 = (var112 & 16711935) * var103 & -16711936;
                                    int var114 = (var112 & 65280) * var103 & 16711680;
                                    var24[var18] = ((var113 | var114) >>> 8) + var107;
                                    var23[var18] = (float) arg2;
                                }
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var108;
                        var18 += var19;
                    }
                }
            } else if (arg7 != 2) {
                throw new IllegalArgumentException();
            } else if (arg5 == 1) {
                int var115 = var10;
                for (int var116 = -arg4; var116 < 0; ++var116) {
                    int var117 = (var11 >> 16) * super.field32;
                    for (int var118 = -arg3; var118 < 0; ++var118) {
                        if ((float) arg2 < var23[var18]) {
                            int var119 = this.field6691[(var10 >> 16) + var117];
                            if (var119 != 0) {
                                int var120 = var24[var18];
                                int var121 = var119 + var120;
                                int var122 = (var119 & 16711935) + (var120 & 16711935);
                                int var123 = (var121 - var122 & 65536) + (var122 & 16777472);
                                var24[var18] = var121 - var123 | var123 - (var123 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var115;
                    var18 += var19;
                }
            } else if (arg5 == 0) {
                int var124 = var10;
                int var125 = (arg6 & 16711680) >> 16;
                int var126 = (arg6 & 65280) >> 8;
                int var127 = arg6 & 255;
                for (int var128 = -arg4; var128 < 0; ++var128) {
                    int var129 = (var11 >> 16) * super.field32;
                    for (int var130 = -arg3; var130 < 0; ++var130) {
                        if ((float) arg2 < var23[var18]) {
                            int var131 = this.field6691[(var10 >> 16) + var129];
                            if (var131 != 0) {
                                int var132 = (var131 & 16711680) * var125 & -16777216;
                                int var133 = (var131 & 65280) * var126 & 16711680;
                                int var134 = (var131 & 255) * var127 & 65280;
                                int var135 = (var132 | var133 | var134) >>> 8;
                                int var136 = var24[var18];
                                int var137 = var135 + var136;
                                int var138 = (var135 & 16711935) + (var136 & 16711935);
                                int var139 = (var137 - var138 & 65536) + (var138 & 16777472);
                                var24[var18] = var137 - var139 | var139 - (var139 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var124;
                    var18 += var19;
                }
            } else if (arg5 == 3) {
                int var140 = var10;
                for (int var141 = -arg4; var141 < 0; ++var141) {
                    int var142 = (var11 >> 16) * super.field32;
                    for (int var143 = -arg3; var143 < 0; ++var143) {
                        if ((float) arg2 < var23[var18]) {
                            int var144 = this.field6691[(var10 >> 16) + var142];
                            int var145 = arg6 + var144;
                            int var146 = (arg6 & 16711935) + (var144 & 16711935);
                            int var147 = (var145 - var146 & 65536) + (var146 & 16777472);
                            int var148 = var145 - var147 | var147 - (var147 >>> 8);
                            int var149 = var24[var18];
                            int var150 = var148 + var149;
                            int var151 = (var148 & 16711935) + (var149 & 16711935);
                            int var152 = (var150 - var151 & 65536) + (var151 & 16777472);
                            var24[var18] = var150 - var152 | var152 - (var152 >>> 8);
                            var23[var18] = (float) arg2;
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var140;
                    var18 += var19;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var153 = arg6 >>> 24;
                int var154 = 256 - var153;
                int var155 = (arg6 & 16711935) * var154 & -16711936;
                int var156 = (arg6 & 65280) * var154 & 16711680;
                int var157 = (var155 | var156) >>> 8;
                int var158 = var10;
                for (int var159 = -arg4; var159 < 0; ++var159) {
                    int var160 = (var11 >> 16) * super.field32;
                    for (int var161 = -arg3; var161 < 0; ++var161) {
                        if ((float) arg2 < var23[var18]) {
                            int var162 = this.field6691[(var10 >> 16) + var160];
                            if (var162 != 0) {
                                int var163 = (var162 & 16711935) * var153 & -16711936;
                                int var164 = (var162 & 65280) * var153 & 16711680;
                                int var165 = ((var163 | var164) >>> 8) + var157;
                                int var166 = var24[var18];
                                int var167 = var165 + var166;
                                int var168 = (var165 & 16711935) + (var166 & 16711935);
                                int var169 = (var167 - var168 & 65536) + (var168 & 16777472);
                                var24[var18] = var167 - var169 | var169 - (var169 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var158;
                    var18 += var19;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V", line = 993)
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (super.field31.method3831()) {
            throw new IllegalStateException();
        } else if (arg2 > 0 && arg3 > 0) {
            int var9 = 0;
            int var10 = 0;
            int var11 = super.field31.field9635;
            int var12 = super.field32 + super.field22 + super.field20;
            int var13 = super.field11 + super.field10 + super.field26;
            int var14 = (var12 << 16) / arg2;
            int var15 = (var13 << 16) / arg3;
            if (super.field22 > 0) {
                int var16 = ((super.field22 << 16) + var14 - 1) / var14;
                arg0 += var16;
                var9 += var14 * var16 - (super.field22 << 16);
            }
            if (super.field11 > 0) {
                int var17 = ((super.field11 << 16) + var15 - 1) / var15;
                arg1 += var17;
                var10 += var15 * var17 - (super.field11 << 16);
            }
            if (super.field32 < var12) {
                arg2 = ((super.field32 << 16) - var9 + var14 - 1) / var14;
            }
            if (super.field10 < var13) {
                arg3 = ((super.field10 << 16) - var10 + var15 - 1) / var15;
            }
            int var18 = arg1 * var11 + arg0;
            int var19 = var11 - arg2;
            if (arg1 + arg3 > super.field31.field9622) {
                arg3 -= arg1 + arg3 - super.field31.field9622;
            }
            if (arg1 < super.field31.field9628) {
                int var20 = super.field31.field9628 - arg1;
                arg3 -= var20;
                var18 += var11 * var20;
                var10 += var15 * var20;
            }
            if (arg0 + arg2 > super.field31.field9647) {
                int var21 = arg0 + arg2 - super.field31.field9647;
                arg2 -= var21;
                var19 += var21;
            }
            if (arg0 < super.field31.field9637) {
                int var22 = super.field31.field9637 - arg0;
                arg2 -= var22;
                var18 += var22;
                var9 += var14 * var22;
                var19 += var22;
            }
            int[] var23 = super.field31.field9629;
            if (arg6 == 0) {
                if (arg4 == 1) {
                    int var24 = var9;
                    for (int var25 = -arg3; var25 < 0; ++var25) {
                        int var26 = (var10 >> 16) * super.field32;
                        for (int var27 = -arg2; var27 < 0; ++var27) {
                            var23[var18++] = this.field6691[(var9 >> 16) + var26];
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
                        int var33 = (var10 >> 16) * super.field32;
                        for (int var34 = -arg2; var34 < 0; ++var34) {
                            int var35 = this.field6691[(var9 >> 16) + var33];
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
                        int var41 = (var10 >> 16) * super.field32;
                        for (int var42 = -arg2; var42 < 0; ++var42) {
                            int var43 = this.field6691[(var9 >> 16) + var41];
                            int var44 = arg5 + var43;
                            int var45 = (arg5 & 16711935) + (var43 & 16711935);
                            int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                            var23[var18++] = var44 - var46 | var46 - (var46 >>> 8);
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var39;
                        var18 += var19;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var47 = arg5 >>> 24;
                    int var48 = 256 - var47;
                    int var49 = (arg5 & 16711935) * var48 & -16711936;
                    int var50 = (arg5 & 65280) * var48 & 16711680;
                    int var51 = (var49 | var50) >>> 8;
                    int var52 = var9;
                    for (int var53 = -arg3; var53 < 0; ++var53) {
                        int var54 = (var10 >> 16) * super.field32;
                        for (int var55 = -arg2; var55 < 0; ++var55) {
                            int var56 = this.field6691[(var9 >> 16) + var54];
                            int var57 = (var56 & 16711935) * var47 & -16711936;
                            int var58 = (var56 & 65280) * var47 & 16711680;
                            var23[var18++] = ((var57 | var58) >>> 8) + var51;
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var52;
                        var18 += var19;
                    }
                }
            } else if (arg6 == 1) {
                if (arg4 == 1) {
                    int var59 = var9;
                    for (int var60 = -arg3; var60 < 0; ++var60) {
                        int var61 = (var10 >> 16) * super.field32;
                        for (int var62 = -arg2; var62 < 0; ++var62) {
                            int var63 = this.field6691[(var9 >> 16) + var61];
                            if (var63 != 0) {
                                var23[var18++] = var63;
                            } else {
                                ++var18;
                            }
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var59;
                        var18 += var19;
                    }
                } else if (arg4 == 0) {
                    int var64 = var9;
                    if ((arg5 & 16777215) == 16777215) {
                        int var65 = arg5 >>> 24;
                        int var66 = 256 - var65;
                        for (int var67 = -arg3; var67 < 0; ++var67) {
                            int var68 = (var10 >> 16) * super.field32;
                            for (int var69 = -arg2; var69 < 0; ++var69) {
                                int var70 = this.field6691[(var9 >> 16) + var68];
                                if (var70 != 0) {
                                    int var71 = var23[var18];
                                    var23[var18++] = ((var70 & 16711935) * var65 + (var71 & 16711935) * var66 & -16711936) + ((var70 & 65280) * var65 + (var71 & 65280) * var66 & 16711680) >> 8;
                                } else {
                                    ++var18;
                                }
                                var9 += var14;
                            }
                            var10 += var15;
                            var9 = var64;
                            var18 += var19;
                        }
                    } else {
                        int var72 = (arg5 & 16711680) >> 16;
                        int var73 = (arg5 & 65280) >> 8;
                        int var74 = arg5 & 255;
                        int var75 = arg5 >>> 24;
                        int var76 = 256 - var75;
                        for (int var77 = -arg3; var77 < 0; ++var77) {
                            int var78 = (var10 >> 16) * super.field32;
                            for (int var79 = -arg2; var79 < 0; ++var79) {
                                int var80 = this.field6691[(var9 >> 16) + var78];
                                if (var80 != 0) {
                                    if (var75 != 255) {
                                        int var81 = (var80 & 16711680) * var72 & -16777216;
                                        int var82 = (var80 & 65280) * var73 & 16711680;
                                        int var83 = (var80 & 255) * var74 & 65280;
                                        int var84 = (var81 | var82 | var83) >>> 8;
                                        int var85 = var23[var18];
                                        var23[var18++] = ((var84 & 16711935) * var75 + (var85 & 16711935) * var76 & -16711936) + ((var84 & 65280) * var75 + (var85 & 65280) * var76 & 16711680) >> 8;
                                    } else {
                                        int var86 = (var80 & 16711680) * var72 & -16777216;
                                        int var87 = (var80 & 65280) * var73 & 16711680;
                                        int var88 = (var80 & 255) * var74 & 65280;
                                        var23[var18++] = (var86 | var87 | var88) >>> 8;
                                    }
                                } else {
                                    ++var18;
                                }
                                var9 += var14;
                            }
                            var10 += var15;
                            var9 = var64;
                            var18 += var19;
                        }
                    }
                } else if (arg4 == 3) {
                    int var89 = var9;
                    int var90 = arg5 >>> 24;
                    int var91 = 256 - var90;
                    for (int var92 = -arg3; var92 < 0; ++var92) {
                        int var93 = (var10 >> 16) * super.field32;
                        for (int var94 = -arg2; var94 < 0; ++var94) {
                            int var95 = this.field6691[(var9 >> 16) + var93];
                            int var96 = arg5 + var95;
                            int var97 = (arg5 & 16711935) + (var95 & 16711935);
                            int var98 = (var96 - var97 & 65536) + (var97 & 16777472);
                            int var99 = var96 - var98 | var98 - (var98 >>> 8);
                            if (var95 == 0 && var90 != 255) {
                                int var101 = var23[var18];
                                var99 = ((var99 & 16711935) * var90 + (var101 & 16711935) * var91 & -16711936) + ((var99 & 65280) * var90 + (var101 & 65280) * var91 & 16711680) >> 8;
                            }
                            var23[var18++] = var99;
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var89;
                        var18 += var19;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var102 = arg5 >>> 24;
                    int var103 = 256 - var102;
                    int var104 = (arg5 & 16711935) * var103 & -16711936;
                    int var105 = (arg5 & 65280) * var103 & 16711680;
                    int var106 = (var104 | var105) >>> 8;
                    int var107 = var9;
                    for (int var108 = -arg3; var108 < 0; ++var108) {
                        int var109 = (var10 >> 16) * super.field32;
                        for (int var110 = -arg2; var110 < 0; ++var110) {
                            int var111 = this.field6691[(var9 >> 16) + var109];
                            if (var111 != 0) {
                                int var112 = (var111 & 16711935) * var102 & -16711936;
                                int var113 = (var111 & 65280) * var102 & 16711680;
                                var23[var18++] = ((var112 | var113) >>> 8) + var106;
                            } else {
                                ++var18;
                            }
                            var9 += var14;
                        }
                        var10 += var15;
                        var9 = var107;
                        var18 += var19;
                    }
                }
            } else if (arg6 != 2) {
                throw new IllegalArgumentException();
            } else if (arg4 == 1) {
                int var114 = var9;
                for (int var115 = -arg3; var115 < 0; ++var115) {
                    int var116 = (var10 >> 16) * super.field32;
                    for (int var117 = -arg2; var117 < 0; ++var117) {
                        int var118 = this.field6691[(var9 >> 16) + var116];
                        if (var118 != 0) {
                            int var119 = var23[var18];
                            int var120 = var118 + var119;
                            int var121 = (var118 & 16711935) + (var119 & 16711935);
                            int var122 = (var120 - var121 & 65536) + (var121 & 16777472);
                            var23[var18++] = var120 - var122 | var122 - (var122 >>> 8);
                        } else {
                            ++var18;
                        }
                        var9 += var14;
                    }
                    var10 += var15;
                    var9 = var114;
                    var18 += var19;
                }
            } else if (arg4 == 0) {
                int var123 = var9;
                int var124 = (arg5 & 16711680) >> 16;
                int var125 = (arg5 & 65280) >> 8;
                int var126 = arg5 & 255;
                for (int var127 = -arg3; var127 < 0; ++var127) {
                    int var128 = (var10 >> 16) * super.field32;
                    for (int var129 = -arg2; var129 < 0; ++var129) {
                        int var130 = this.field6691[(var9 >> 16) + var128];
                        if (var130 != 0) {
                            int var131 = (var130 & 16711680) * var124 & -16777216;
                            int var132 = (var130 & 65280) * var125 & 16711680;
                            int var133 = (var130 & 255) * var126 & 65280;
                            int var134 = (var131 | var132 | var133) >>> 8;
                            int var135 = var23[var18];
                            int var136 = var134 + var135;
                            int var137 = (var134 & 16711935) + (var135 & 16711935);
                            int var138 = (var136 - var137 & 65536) + (var137 & 16777472);
                            var23[var18++] = var136 - var138 | var138 - (var138 >>> 8);
                        } else {
                            ++var18;
                        }
                        var9 += var14;
                    }
                    var10 += var15;
                    var9 = var123;
                    var18 += var19;
                }
            } else if (arg4 == 3) {
                int var139 = var9;
                for (int var140 = -arg3; var140 < 0; ++var140) {
                    int var141 = (var10 >> 16) * super.field32;
                    for (int var142 = -arg2; var142 < 0; ++var142) {
                        int var143 = this.field6691[(var9 >> 16) + var141];
                        int var144 = arg5 + var143;
                        int var145 = (arg5 & 16711935) + (var143 & 16711935);
                        int var146 = (var144 - var145 & 65536) + (var145 & 16777472);
                        int var147 = var144 - var146 | var146 - (var146 >>> 8);
                        int var148 = var23[var18];
                        int var149 = var147 + var148;
                        int var150 = (var147 & 16711935) + (var148 & 16711935);
                        int var151 = (var149 - var150 & 65536) + (var150 & 16777472);
                        var23[var18++] = var149 - var151 | var151 - (var151 >>> 8);
                        var9 += var14;
                    }
                    var10 += var15;
                    var9 = var139;
                    var18 += var19;
                }
            } else if (arg4 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var152 = arg5 >>> 24;
                int var153 = 256 - var152;
                int var154 = (arg5 & 16711935) * var153 & -16711936;
                int var155 = (arg5 & 65280) * var153 & 16711680;
                int var156 = (var154 | var155) >>> 8;
                int var157 = var9;
                for (int var158 = -arg3; var158 < 0; ++var158) {
                    int var159 = (var10 >> 16) * super.field32;
                    for (int var160 = -arg2; var160 < 0; ++var160) {
                        int var161 = this.field6691[(var9 >> 16) + var159];
                        if (var161 != 0) {
                            int var162 = (var161 & 16711935) * var152 & -16711936;
                            int var163 = (var161 & 65280) * var152 & 16711680;
                            int var164 = ((var162 | var163) >>> 8) + var156;
                            int var165 = var23[var18];
                            int var166 = var164 + var165;
                            int var167 = (var164 & 16711935) + (var165 & 16711935);
                            int var168 = (var166 - var167 & 65536) + (var167 & 16777472);
                            var23[var18++] = var166 - var168 | var168 - (var168 >>> 8);
                        } else {
                            ++var18;
                        }
                        var9 += var14;
                    }
                    var10 += var15;
                    var9 = var157;
                    var18 += var19;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lrp;II)V", line = 1709)
    public class485(class680 arg0, int arg1, int arg2) {
        super(arg0, arg1, arg2);
        this.field6691 = new int[arg1 * arg2];
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lrp;[III)V", line = 1713)
    public class485(class680 arg0, int[] arg1, int arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6691 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V", line = 1718)
    public final void method1(int arg0, int arg1) {
        int[] var3 = super.field31.field9629;
        if (class1.field16 == 0) {
            if (class1.field24 == 0) {
                int var4 = class1.field5;
                while (var4 < 0) {
                    int var5 = class1.field29;
                    int var6 = class1.field8;
                    int var7 = class1.field27;
                    int var8 = class1.field21;
                    if (var6 >= 0 && var7 >= 0 && var6 - (super.field32 << 12) < 0 && var7 - (super.field10 << 12) < 0) {
                        while (var8 < 0) {
                            int var9 = (var6 >> 12) + (var7 >> 12) * super.field32;
                            int var10 = var5++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var10] = this.field6691[var9];
                                } else if (arg0 == 0) {
                                    int var14 = this.field6691[var9++];
                                    int var15 = (var14 & 16711680) * class1.field1 & -16777216;
                                    int var16 = (var14 & 65280) * class1.field13 & 16711680;
                                    int var17 = (var14 & 255) * class1.field7 & 65280;
                                    var3[var10] = (var15 | var16 | var17) >>> 8;
                                } else if (arg0 == 3) {
                                    int var18 = this.field6691[var9++];
                                    int var19 = class1.field6;
                                    int var20 = var18 + var19;
                                    int var21 = (var18 & 16711935) + (var19 & 16711935);
                                    int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                                    var3[var10] = var20 - var22 | var22 - (var22 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var23 = this.field6691[var9];
                                    int var24 = (var23 & 16711935) * class1.field33 & -16711936;
                                    int var25 = (var23 & 65280) * class1.field33 & 16711680;
                                    var3[var10] = ((var24 | var25) >>> 8) + class1.field3;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    int var26 = this.field6691[var9];
                                    if (var26 != 0) {
                                        var3[var10] = var26;
                                    }
                                } else if (arg0 == 0) {
                                    int var27 = this.field6691[var9];
                                    if (var27 != 0) {
                                        if ((class1.field6 & 16777215) == 16777215) {
                                            int var28 = class1.field6 >>> 24;
                                            int var29 = 256 - var28;
                                            int var30 = var3[var10];
                                            var3[var10] = ((var27 & 16711935) * var28 + (var30 & 16711935) * var29 & -16711936) + ((var27 & 65280) * var28 + (var30 & 65280) * var29 & 16711680) >> 8;
                                        } else if (class1.field33 != 255) {
                                            int var31 = (var27 & 16711680) * class1.field1 & -16777216;
                                            int var32 = (var27 & 65280) * class1.field13 & 16711680;
                                            int var33 = (var27 & 255) * class1.field7 & 65280;
                                            int var34 = (var31 | var32 | var33) >>> 8;
                                            int var35 = var3[var10];
                                            var3[var10] = ((var34 & 16711935) * class1.field33 + (var35 & 16711935) * class1.field2 & -16711936) + ((var34 & 65280) * class1.field33 + (var35 & 65280) * class1.field2 & 16711680) >> 8;
                                        } else {
                                            int var36 = (var27 & 16711680) * class1.field1 & -16777216;
                                            int var37 = (var27 & 65280) * class1.field13 & 16711680;
                                            int var38 = (var27 & 255) * class1.field7 & 65280;
                                            var3[var10] = (var36 | var37 | var38) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    int var39 = this.field6691[var9];
                                    int var40 = class1.field6;
                                    int var41 = var39 + var40;
                                    int var42 = (var39 & 16711935) + (var40 & 16711935);
                                    int var43 = (var41 - var42 & 65536) + (var42 & 16777472);
                                    int var44 = var41 - var43 | var43 - (var43 >>> 8);
                                    if (var39 == 0 && class1.field33 != 255) {
                                        int var46 = var3[var10];
                                        var44 = ((var44 & 16711935) * class1.field33 + (var46 & 16711935) * class1.field2 & -16711936) + ((var44 & 65280) * class1.field33 + (var46 & 65280) * class1.field2 & 16711680) >> 8;
                                    }
                                    var3[var10] = var44;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var47 = this.field6691[var9];
                                    if (var47 != 0) {
                                        int var48 = (var47 & 16711935) * class1.field33 & -16711936;
                                        int var49 = (var47 & 65280) * class1.field33 & 16711680;
                                        var3[var10++] = ((var48 | var49) >>> 8) + class1.field3;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    int var50 = this.field6691[var9];
                                    if (var50 != 0) {
                                        int var51 = var3[var10];
                                        int var52 = var50 + var51;
                                        int var53 = (var50 & 16711935) + (var51 & 16711935);
                                        int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                                        var3[var10] = var52 - var54 | var54 - (var54 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    int var55 = this.field6691[var9];
                                    if (var55 != 0) {
                                        int var56 = (var55 & 16711680) * class1.field1 & -16777216;
                                        int var57 = (var55 & 65280) * class1.field13 & 16711680;
                                        int var58 = (var55 & 255) * class1.field7 & 65280;
                                        int var59 = (var56 | var57 | var58) >>> 8;
                                        int var60 = var3[var10];
                                        int var61 = var59 + var60;
                                        int var62 = (var59 & 16711935) + (var60 & 16711935);
                                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                                        var3[var10] = var61 - var63 | var63 - (var63 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    int var64 = this.field6691[var9];
                                    int var65 = class1.field6;
                                    int var66 = var64 + var65;
                                    int var67 = (var64 & 16711935) + (var65 & 16711935);
                                    int var68 = (var66 - var67 & 65536) + (var67 & 16777472);
                                    int var69 = var66 - var68 | var68 - (var68 >>> 8);
                                    int var70 = var3[var10];
                                    int var71 = var69 + var70;
                                    int var72 = (var69 & 16711935) + (var70 & 16711935);
                                    int var73 = (var71 - var72 & 65536) + (var72 & 16777472);
                                    var3[var10] = var71 - var73 | var73 - (var73 >>> 8);
                                } else if (arg0 == 2) {
                                    int var74 = this.field6691[var9];
                                    if (var74 != 0) {
                                        int var75 = (var74 & 16711935) * class1.field33 & -16711936;
                                        int var76 = (var74 & 65280) * class1.field33 & 16711680;
                                        int var77 = ((var75 | var76) >>> 8) + class1.field3;
                                        int var78 = var3[var10];
                                        int var79 = var77 + var78;
                                        int var80 = (var77 & 16711935) + (var78 & 16711935);
                                        int var81 = (var79 - var80 & 65536) + (var80 & 16777472);
                                        var3[var10] = var79 - var81 | var81 - (var81 >>> 8);
                                    }
                                }
                            }
                            ++var8;
                        }
                    }
                    ++var4;
                    class1.field29 += class1.field19;
                }
            } else if (class1.field24 < 0) {
                int var82 = class1.field5;
                while (var82 < 0) {
                    int var83 = class1.field29;
                    int var84 = class1.field8;
                    int var85 = class1.field28 + class1.field27;
                    int var86 = class1.field21;
                    if (var84 >= 0 && var84 - (super.field32 << 12) < 0) {
                        int var87;
                        if ((var87 = var85 - (super.field10 << 12)) >= 0) {
                            int var88 = (class1.field24 - var87) / class1.field24;
                            var86 += var88;
                            var85 += class1.field24 * var88;
                            var83 += var88;
                        }
                        int var89;
                        if ((var89 = (var85 - class1.field24) / class1.field24) > var86) {
                            var86 = var89;
                        }
                        while (var86 < 0) {
                            int var90 = (var84 >> 12) + (var85 >> 12) * super.field32;
                            int var91 = var83++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var91] = this.field6691[var90];
                                } else if (arg0 == 0) {
                                    int var95 = this.field6691[var90++];
                                    int var96 = (var95 & 16711680) * class1.field1 & -16777216;
                                    int var97 = (var95 & 65280) * class1.field13 & 16711680;
                                    int var98 = (var95 & 255) * class1.field7 & 65280;
                                    var3[var91] = (var96 | var97 | var98) >>> 8;
                                } else if (arg0 == 3) {
                                    int var99 = this.field6691[var90++];
                                    int var100 = class1.field6;
                                    int var101 = var99 + var100;
                                    int var102 = (var99 & 16711935) + (var100 & 16711935);
                                    int var103 = (var101 - var102 & 65536) + (var102 & 16777472);
                                    var3[var91] = var101 - var103 | var103 - (var103 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var104 = this.field6691[var90];
                                    int var105 = (var104 & 16711935) * class1.field33 & -16711936;
                                    int var106 = (var104 & 65280) * class1.field33 & 16711680;
                                    var3[var91] = ((var105 | var106) >>> 8) + class1.field3;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    int var107 = this.field6691[var90];
                                    if (var107 != 0) {
                                        var3[var91] = var107;
                                    }
                                } else if (arg0 == 0) {
                                    int var108 = this.field6691[var90];
                                    if (var108 != 0) {
                                        if ((class1.field6 & 16777215) == 16777215) {
                                            int var109 = class1.field6 >>> 24;
                                            int var110 = 256 - var109;
                                            int var111 = var3[var91];
                                            var3[var91] = ((var108 & 16711935) * var109 + (var111 & 16711935) * var110 & -16711936) + ((var108 & 65280) * var109 + (var111 & 65280) * var110 & 16711680) >> 8;
                                        } else if (class1.field33 != 255) {
                                            int var112 = (var108 & 16711680) * class1.field1 & -16777216;
                                            int var113 = (var108 & 65280) * class1.field13 & 16711680;
                                            int var114 = (var108 & 255) * class1.field7 & 65280;
                                            int var115 = (var112 | var113 | var114) >>> 8;
                                            int var116 = var3[var91];
                                            var3[var91] = ((var115 & 16711935) * class1.field33 + (var116 & 16711935) * class1.field2 & -16711936) + ((var115 & 65280) * class1.field33 + (var116 & 65280) * class1.field2 & 16711680) >> 8;
                                        } else {
                                            int var117 = (var108 & 16711680) * class1.field1 & -16777216;
                                            int var118 = (var108 & 65280) * class1.field13 & 16711680;
                                            int var119 = (var108 & 255) * class1.field7 & 65280;
                                            var3[var91] = (var117 | var118 | var119) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    int var120 = this.field6691[var90];
                                    int var121 = class1.field6;
                                    int var122 = var120 + var121;
                                    int var123 = (var120 & 16711935) + (var121 & 16711935);
                                    int var124 = (var122 - var123 & 65536) + (var123 & 16777472);
                                    int var125 = var122 - var124 | var124 - (var124 >>> 8);
                                    if (var120 == 0 && class1.field33 != 255) {
                                        int var127 = var3[var91];
                                        var125 = ((var125 & 16711935) * class1.field33 + (var127 & 16711935) * class1.field2 & -16711936) + ((var125 & 65280) * class1.field33 + (var127 & 65280) * class1.field2 & 16711680) >> 8;
                                    }
                                    var3[var91] = var125;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var128 = this.field6691[var90];
                                    if (var128 != 0) {
                                        int var129 = (var128 & 16711935) * class1.field33 & -16711936;
                                        int var130 = (var128 & 65280) * class1.field33 & 16711680;
                                        var3[var91++] = ((var129 | var130) >>> 8) + class1.field3;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    int var131 = this.field6691[var90];
                                    if (var131 != 0) {
                                        int var132 = var3[var91];
                                        int var133 = var131 + var132;
                                        int var134 = (var131 & 16711935) + (var132 & 16711935);
                                        int var135 = (var133 - var134 & 65536) + (var134 & 16777472);
                                        var3[var91] = var133 - var135 | var135 - (var135 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    int var136 = this.field6691[var90];
                                    if (var136 != 0) {
                                        int var137 = (var136 & 16711680) * class1.field1 & -16777216;
                                        int var138 = (var136 & 65280) * class1.field13 & 16711680;
                                        int var139 = (var136 & 255) * class1.field7 & 65280;
                                        int var140 = (var137 | var138 | var139) >>> 8;
                                        int var141 = var3[var91];
                                        int var142 = var140 + var141;
                                        int var143 = (var140 & 16711935) + (var141 & 16711935);
                                        int var144 = (var142 - var143 & 65536) + (var143 & 16777472);
                                        var3[var91] = var142 - var144 | var144 - (var144 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    int var145 = this.field6691[var90];
                                    int var146 = class1.field6;
                                    int var147 = var145 + var146;
                                    int var148 = (var145 & 16711935) + (var146 & 16711935);
                                    int var149 = (var147 - var148 & 65536) + (var148 & 16777472);
                                    int var150 = var147 - var149 | var149 - (var149 >>> 8);
                                    int var151 = var3[var91];
                                    int var152 = var150 + var151;
                                    int var153 = (var150 & 16711935) + (var151 & 16711935);
                                    int var154 = (var152 - var153 & 65536) + (var153 & 16777472);
                                    var3[var91] = var152 - var154 | var154 - (var154 >>> 8);
                                } else if (arg0 == 2) {
                                    int var155 = this.field6691[var90];
                                    if (var155 != 0) {
                                        int var156 = (var155 & 16711935) * class1.field33 & -16711936;
                                        int var157 = (var155 & 65280) * class1.field33 & 16711680;
                                        int var158 = ((var156 | var157) >>> 8) + class1.field3;
                                        int var159 = var3[var91];
                                        int var160 = var158 + var159;
                                        int var161 = (var158 & 16711935) + (var159 & 16711935);
                                        int var162 = (var160 - var161 & 65536) + (var161 & 16777472);
                                        var3[var91] = var160 - var162 | var162 - (var162 >>> 8);
                                    }
                                }
                            }
                            var85 += class1.field24;
                            ++var86;
                        }
                    }
                    ++var82;
                    class1.field8 += class1.field12;
                    class1.field29 += class1.field19;
                }
            } else {
                int var163 = class1.field5;
                while (var163 < 0) {
                    int var164 = class1.field29;
                    int var165 = class1.field8;
                    int var166 = class1.field28 + class1.field27;
                    int var167 = class1.field21;
                    if (var165 >= 0 && var165 - (super.field32 << 12) < 0) {
                        if (var166 < 0) {
                            int var168 = (class1.field24 - 1 - var166) / class1.field24;
                            var167 += var168;
                            var166 += class1.field24 * var168;
                            var164 += var168;
                        }
                        int var169;
                        if ((var169 = (var166 + 1 - (super.field10 << 12) - class1.field24) / class1.field24) > var167) {
                            var167 = var169;
                        }
                        while (var167 < 0) {
                            int var170 = (var165 >> 12) + (var166 >> 12) * super.field32;
                            int var171 = var164++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var171] = this.field6691[var170];
                                } else if (arg0 == 0) {
                                    int var175 = this.field6691[var170++];
                                    int var176 = (var175 & 16711680) * class1.field1 & -16777216;
                                    int var177 = (var175 & 65280) * class1.field13 & 16711680;
                                    int var178 = (var175 & 255) * class1.field7 & 65280;
                                    var3[var171] = (var176 | var177 | var178) >>> 8;
                                } else if (arg0 == 3) {
                                    int var179 = this.field6691[var170++];
                                    int var180 = class1.field6;
                                    int var181 = var179 + var180;
                                    int var182 = (var179 & 16711935) + (var180 & 16711935);
                                    int var183 = (var181 - var182 & 65536) + (var182 & 16777472);
                                    var3[var171] = var181 - var183 | var183 - (var183 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var184 = this.field6691[var170];
                                    int var185 = (var184 & 16711935) * class1.field33 & -16711936;
                                    int var186 = (var184 & 65280) * class1.field33 & 16711680;
                                    var3[var171] = ((var185 | var186) >>> 8) + class1.field3;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    int var187 = this.field6691[var170];
                                    if (var187 != 0) {
                                        var3[var171] = var187;
                                    }
                                } else if (arg0 == 0) {
                                    int var188 = this.field6691[var170];
                                    if (var188 != 0) {
                                        if ((class1.field6 & 16777215) == 16777215) {
                                            int var189 = class1.field6 >>> 24;
                                            int var190 = 256 - var189;
                                            int var191 = var3[var171];
                                            var3[var171] = ((var188 & 16711935) * var189 + (var191 & 16711935) * var190 & -16711936) + ((var188 & 65280) * var189 + (var191 & 65280) * var190 & 16711680) >> 8;
                                        } else if (class1.field33 != 255) {
                                            int var192 = (var188 & 16711680) * class1.field1 & -16777216;
                                            int var193 = (var188 & 65280) * class1.field13 & 16711680;
                                            int var194 = (var188 & 255) * class1.field7 & 65280;
                                            int var195 = (var192 | var193 | var194) >>> 8;
                                            int var196 = var3[var171];
                                            var3[var171] = ((var195 & 16711935) * class1.field33 + (var196 & 16711935) * class1.field2 & -16711936) + ((var195 & 65280) * class1.field33 + (var196 & 65280) * class1.field2 & 16711680) >> 8;
                                        } else {
                                            int var197 = (var188 & 16711680) * class1.field1 & -16777216;
                                            int var198 = (var188 & 65280) * class1.field13 & 16711680;
                                            int var199 = (var188 & 255) * class1.field7 & 65280;
                                            var3[var171] = (var197 | var198 | var199) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    int var200 = this.field6691[var170];
                                    int var201 = class1.field6;
                                    int var202 = var200 + var201;
                                    int var203 = (var200 & 16711935) + (var201 & 16711935);
                                    int var204 = (var202 - var203 & 65536) + (var203 & 16777472);
                                    int var205 = var202 - var204 | var204 - (var204 >>> 8);
                                    if (var200 == 0 && class1.field33 != 255) {
                                        int var207 = var3[var171];
                                        var205 = ((var205 & 16711935) * class1.field33 + (var207 & 16711935) * class1.field2 & -16711936) + ((var205 & 65280) * class1.field33 + (var207 & 65280) * class1.field2 & 16711680) >> 8;
                                    }
                                    var3[var171] = var205;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var208 = this.field6691[var170];
                                    if (var208 != 0) {
                                        int var209 = (var208 & 16711935) * class1.field33 & -16711936;
                                        int var210 = (var208 & 65280) * class1.field33 & 16711680;
                                        var3[var171++] = ((var209 | var210) >>> 8) + class1.field3;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    int var211 = this.field6691[var170];
                                    if (var211 != 0) {
                                        int var212 = var3[var171];
                                        int var213 = var211 + var212;
                                        int var214 = (var211 & 16711935) + (var212 & 16711935);
                                        int var215 = (var213 - var214 & 65536) + (var214 & 16777472);
                                        var3[var171] = var213 - var215 | var215 - (var215 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    int var216 = this.field6691[var170];
                                    if (var216 != 0) {
                                        int var217 = (var216 & 16711680) * class1.field1 & -16777216;
                                        int var218 = (var216 & 65280) * class1.field13 & 16711680;
                                        int var219 = (var216 & 255) * class1.field7 & 65280;
                                        int var220 = (var217 | var218 | var219) >>> 8;
                                        int var221 = var3[var171];
                                        int var222 = var220 + var221;
                                        int var223 = (var220 & 16711935) + (var221 & 16711935);
                                        int var224 = (var222 - var223 & 65536) + (var223 & 16777472);
                                        var3[var171] = var222 - var224 | var224 - (var224 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    int var225 = this.field6691[var170];
                                    int var226 = class1.field6;
                                    int var227 = var225 + var226;
                                    int var228 = (var225 & 16711935) + (var226 & 16711935);
                                    int var229 = (var227 - var228 & 65536) + (var228 & 16777472);
                                    int var230 = var227 - var229 | var229 - (var229 >>> 8);
                                    int var231 = var3[var171];
                                    int var232 = var230 + var231;
                                    int var233 = (var230 & 16711935) + (var231 & 16711935);
                                    int var234 = (var232 - var233 & 65536) + (var233 & 16777472);
                                    var3[var171] = var232 - var234 | var234 - (var234 >>> 8);
                                } else if (arg0 == 2) {
                                    int var235 = this.field6691[var170];
                                    if (var235 != 0) {
                                        int var236 = (var235 & 16711935) * class1.field33 & -16711936;
                                        int var237 = (var235 & 65280) * class1.field33 & 16711680;
                                        int var238 = ((var236 | var237) >>> 8) + class1.field3;
                                        int var239 = var3[var171];
                                        int var240 = var238 + var239;
                                        int var241 = (var238 & 16711935) + (var239 & 16711935);
                                        int var242 = (var240 - var241 & 65536) + (var241 & 16777472);
                                        var3[var171] = var240 - var242 | var242 - (var242 >>> 8);
                                    }
                                }
                            }
                            var166 += class1.field24;
                            ++var167;
                        }
                    }
                    ++var163;
                    class1.field8 += class1.field12;
                    class1.field29 += class1.field19;
                }
            }
        } else if (class1.field16 < 0) {
            if (class1.field24 == 0) {
                int var243 = class1.field5;
                while (var243 < 0) {
                    int var244 = class1.field29;
                    int var245 = class1.field8 + class1.field23;
                    int var246 = class1.field27;
                    int var247 = class1.field21;
                    if (var246 >= 0 && var246 - (super.field10 << 12) < 0) {
                        int var248;
                        if ((var248 = var245 - (super.field32 << 12)) >= 0) {
                            int var249 = (class1.field16 - var248) / class1.field16;
                            var247 += var249;
                            var245 += class1.field16 * var249;
                            var244 += var249;
                        }
                        int var250;
                        if ((var250 = (var245 - class1.field16) / class1.field16) > var247) {
                            var247 = var250;
                        }
                        while (var247 < 0) {
                            int var251 = (var245 >> 12) + (var246 >> 12) * super.field32;
                            int var252 = var244++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var252] = this.field6691[var251];
                                } else if (arg0 == 0) {
                                    int var256 = this.field6691[var251++];
                                    int var257 = (var256 & 16711680) * class1.field1 & -16777216;
                                    int var258 = (var256 & 65280) * class1.field13 & 16711680;
                                    int var259 = (var256 & 255) * class1.field7 & 65280;
                                    var3[var252] = (var257 | var258 | var259) >>> 8;
                                } else if (arg0 == 3) {
                                    int var260 = this.field6691[var251++];
                                    int var261 = class1.field6;
                                    int var262 = var260 + var261;
                                    int var263 = (var260 & 16711935) + (var261 & 16711935);
                                    int var264 = (var262 - var263 & 65536) + (var263 & 16777472);
                                    var3[var252] = var262 - var264 | var264 - (var264 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var265 = this.field6691[var251];
                                    int var266 = (var265 & 16711935) * class1.field33 & -16711936;
                                    int var267 = (var265 & 65280) * class1.field33 & 16711680;
                                    var3[var252] = ((var266 | var267) >>> 8) + class1.field3;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    int var268 = this.field6691[var251];
                                    if (var268 != 0) {
                                        var3[var252] = var268;
                                    }
                                } else if (arg0 == 0) {
                                    int var269 = this.field6691[var251];
                                    if (var269 != 0) {
                                        if ((class1.field6 & 16777215) == 16777215) {
                                            int var270 = class1.field6 >>> 24;
                                            int var271 = 256 - var270;
                                            int var272 = var3[var252];
                                            var3[var252] = ((var269 & 16711935) * var270 + (var272 & 16711935) * var271 & -16711936) + ((var269 & 65280) * var270 + (var272 & 65280) * var271 & 16711680) >> 8;
                                        } else if (class1.field33 != 255) {
                                            int var273 = (var269 & 16711680) * class1.field1 & -16777216;
                                            int var274 = (var269 & 65280) * class1.field13 & 16711680;
                                            int var275 = (var269 & 255) * class1.field7 & 65280;
                                            int var276 = (var273 | var274 | var275) >>> 8;
                                            int var277 = var3[var252];
                                            var3[var252] = ((var276 & 16711935) * class1.field33 + (var277 & 16711935) * class1.field2 & -16711936) + ((var276 & 65280) * class1.field33 + (var277 & 65280) * class1.field2 & 16711680) >> 8;
                                        } else {
                                            int var278 = (var269 & 16711680) * class1.field1 & -16777216;
                                            int var279 = (var269 & 65280) * class1.field13 & 16711680;
                                            int var280 = (var269 & 255) * class1.field7 & 65280;
                                            var3[var252] = (var278 | var279 | var280) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    int var281 = this.field6691[var251];
                                    int var282 = class1.field6;
                                    int var283 = var281 + var282;
                                    int var284 = (var281 & 16711935) + (var282 & 16711935);
                                    int var285 = (var283 - var284 & 65536) + (var284 & 16777472);
                                    int var286 = var283 - var285 | var285 - (var285 >>> 8);
                                    if (var281 == 0 && class1.field33 != 255) {
                                        int var288 = var3[var252];
                                        var286 = ((var286 & 16711935) * class1.field33 + (var288 & 16711935) * class1.field2 & -16711936) + ((var286 & 65280) * class1.field33 + (var288 & 65280) * class1.field2 & 16711680) >> 8;
                                    }
                                    var3[var252] = var286;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var289 = this.field6691[var251];
                                    if (var289 != 0) {
                                        int var290 = (var289 & 16711935) * class1.field33 & -16711936;
                                        int var291 = (var289 & 65280) * class1.field33 & 16711680;
                                        var3[var252++] = ((var290 | var291) >>> 8) + class1.field3;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    int var292 = this.field6691[var251];
                                    if (var292 != 0) {
                                        int var293 = var3[var252];
                                        int var294 = var292 + var293;
                                        int var295 = (var292 & 16711935) + (var293 & 16711935);
                                        int var296 = (var294 - var295 & 65536) + (var295 & 16777472);
                                        var3[var252] = var294 - var296 | var296 - (var296 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    int var297 = this.field6691[var251];
                                    if (var297 != 0) {
                                        int var298 = (var297 & 16711680) * class1.field1 & -16777216;
                                        int var299 = (var297 & 65280) * class1.field13 & 16711680;
                                        int var300 = (var297 & 255) * class1.field7 & 65280;
                                        int var301 = (var298 | var299 | var300) >>> 8;
                                        int var302 = var3[var252];
                                        int var303 = var301 + var302;
                                        int var304 = (var301 & 16711935) + (var302 & 16711935);
                                        int var305 = (var303 - var304 & 65536) + (var304 & 16777472);
                                        var3[var252] = var303 - var305 | var305 - (var305 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    int var306 = this.field6691[var251];
                                    int var307 = class1.field6;
                                    int var308 = var306 + var307;
                                    int var309 = (var306 & 16711935) + (var307 & 16711935);
                                    int var310 = (var308 - var309 & 65536) + (var309 & 16777472);
                                    int var311 = var308 - var310 | var310 - (var310 >>> 8);
                                    int var312 = var3[var252];
                                    int var313 = var311 + var312;
                                    int var314 = (var311 & 16711935) + (var312 & 16711935);
                                    int var315 = (var313 - var314 & 65536) + (var314 & 16777472);
                                    var3[var252] = var313 - var315 | var315 - (var315 >>> 8);
                                } else if (arg0 == 2) {
                                    int var316 = this.field6691[var251];
                                    if (var316 != 0) {
                                        int var317 = (var316 & 16711935) * class1.field33 & -16711936;
                                        int var318 = (var316 & 65280) * class1.field33 & 16711680;
                                        int var319 = ((var317 | var318) >>> 8) + class1.field3;
                                        int var320 = var3[var252];
                                        int var321 = var319 + var320;
                                        int var322 = (var319 & 16711935) + (var320 & 16711935);
                                        int var323 = (var321 - var322 & 65536) + (var322 & 16777472);
                                        var3[var252] = var321 - var323 | var323 - (var323 >>> 8);
                                    }
                                }
                            }
                            var245 += class1.field16;
                            ++var247;
                        }
                    }
                    ++var243;
                    class1.field27 += class1.field4;
                    class1.field29 += class1.field19;
                }
            } else if (class1.field24 < 0) {
                int var324 = class1.field5;
                while (var324 < 0) {
                    int var325 = class1.field29;
                    int var326 = class1.field8 + class1.field23;
                    int var327 = class1.field28 + class1.field27;
                    int var328 = class1.field21;
                    int var329;
                    if ((var329 = var326 - (super.field32 << 12)) >= 0) {
                        int var330 = (class1.field16 - var329) / class1.field16;
                        var328 += var330;
                        var326 += class1.field16 * var330;
                        var327 += class1.field24 * var330;
                        var325 += var330;
                    }
                    int var331;
                    if ((var331 = (var326 - class1.field16) / class1.field16) > var328) {
                        var328 = var331;
                    }
                    int var332;
                    if ((var332 = var327 - (super.field10 << 12)) >= 0) {
                        int var333 = (class1.field24 - var332) / class1.field24;
                        var328 += var333;
                        var326 += class1.field16 * var333;
                        var327 += class1.field24 * var333;
                        var325 += var333;
                    }
                    int var334;
                    if ((var334 = (var327 - class1.field24) / class1.field24) > var328) {
                        var328 = var334;
                    }
                    while (var328 < 0) {
                        int var335 = (var326 >> 12) + (var327 >> 12) * super.field32;
                        int var336 = var325++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var336] = this.field6691[var335];
                            } else if (arg0 == 0) {
                                int var340 = this.field6691[var335++];
                                int var341 = (var340 & 16711680) * class1.field1 & -16777216;
                                int var342 = (var340 & 65280) * class1.field13 & 16711680;
                                int var343 = (var340 & 255) * class1.field7 & 65280;
                                var3[var336] = (var341 | var342 | var343) >>> 8;
                            } else if (arg0 == 3) {
                                int var344 = this.field6691[var335++];
                                int var345 = class1.field6;
                                int var346 = var344 + var345;
                                int var347 = (var344 & 16711935) + (var345 & 16711935);
                                int var348 = (var346 - var347 & 65536) + (var347 & 16777472);
                                var3[var336] = var346 - var348 | var348 - (var348 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var349 = this.field6691[var335];
                                int var350 = (var349 & 16711935) * class1.field33 & -16711936;
                                int var351 = (var349 & 65280) * class1.field33 & 16711680;
                                var3[var336] = ((var350 | var351) >>> 8) + class1.field3;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                int var352 = this.field6691[var335];
                                if (var352 != 0) {
                                    var3[var336] = var352;
                                }
                            } else if (arg0 == 0) {
                                int var353 = this.field6691[var335];
                                if (var353 != 0) {
                                    if ((class1.field6 & 16777215) == 16777215) {
                                        int var354 = class1.field6 >>> 24;
                                        int var355 = 256 - var354;
                                        int var356 = var3[var336];
                                        var3[var336] = ((var353 & 16711935) * var354 + (var356 & 16711935) * var355 & -16711936) + ((var353 & 65280) * var354 + (var356 & 65280) * var355 & 16711680) >> 8;
                                    } else if (class1.field33 != 255) {
                                        int var357 = (var353 & 16711680) * class1.field1 & -16777216;
                                        int var358 = (var353 & 65280) * class1.field13 & 16711680;
                                        int var359 = (var353 & 255) * class1.field7 & 65280;
                                        int var360 = (var357 | var358 | var359) >>> 8;
                                        int var361 = var3[var336];
                                        var3[var336] = ((var360 & 16711935) * class1.field33 + (var361 & 16711935) * class1.field2 & -16711936) + ((var360 & 65280) * class1.field33 + (var361 & 65280) * class1.field2 & 16711680) >> 8;
                                    } else {
                                        int var362 = (var353 & 16711680) * class1.field1 & -16777216;
                                        int var363 = (var353 & 65280) * class1.field13 & 16711680;
                                        int var364 = (var353 & 255) * class1.field7 & 65280;
                                        var3[var336] = (var362 | var363 | var364) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                int var365 = this.field6691[var335];
                                int var366 = class1.field6;
                                int var367 = var365 + var366;
                                int var368 = (var365 & 16711935) + (var366 & 16711935);
                                int var369 = (var367 - var368 & 65536) + (var368 & 16777472);
                                int var370 = var367 - var369 | var369 - (var369 >>> 8);
                                if (var365 == 0 && class1.field33 != 255) {
                                    int var372 = var3[var336];
                                    var370 = ((var370 & 16711935) * class1.field33 + (var372 & 16711935) * class1.field2 & -16711936) + ((var370 & 65280) * class1.field33 + (var372 & 65280) * class1.field2 & 16711680) >> 8;
                                }
                                var3[var336] = var370;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var373 = this.field6691[var335];
                                if (var373 != 0) {
                                    int var374 = (var373 & 16711935) * class1.field33 & -16711936;
                                    int var375 = (var373 & 65280) * class1.field33 & 16711680;
                                    var3[var336++] = ((var374 | var375) >>> 8) + class1.field3;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                int var376 = this.field6691[var335];
                                if (var376 != 0) {
                                    int var377 = var3[var336];
                                    int var378 = var376 + var377;
                                    int var379 = (var376 & 16711935) + (var377 & 16711935);
                                    int var380 = (var378 - var379 & 65536) + (var379 & 16777472);
                                    var3[var336] = var378 - var380 | var380 - (var380 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                int var381 = this.field6691[var335];
                                if (var381 != 0) {
                                    int var382 = (var381 & 16711680) * class1.field1 & -16777216;
                                    int var383 = (var381 & 65280) * class1.field13 & 16711680;
                                    int var384 = (var381 & 255) * class1.field7 & 65280;
                                    int var385 = (var382 | var383 | var384) >>> 8;
                                    int var386 = var3[var336];
                                    int var387 = var385 + var386;
                                    int var388 = (var385 & 16711935) + (var386 & 16711935);
                                    int var389 = (var387 - var388 & 65536) + (var388 & 16777472);
                                    var3[var336] = var387 - var389 | var389 - (var389 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                int var390 = this.field6691[var335];
                                int var391 = class1.field6;
                                int var392 = var390 + var391;
                                int var393 = (var390 & 16711935) + (var391 & 16711935);
                                int var394 = (var392 - var393 & 65536) + (var393 & 16777472);
                                int var395 = var392 - var394 | var394 - (var394 >>> 8);
                                int var396 = var3[var336];
                                int var397 = var395 + var396;
                                int var398 = (var395 & 16711935) + (var396 & 16711935);
                                int var399 = (var397 - var398 & 65536) + (var398 & 16777472);
                                var3[var336] = var397 - var399 | var399 - (var399 >>> 8);
                            } else if (arg0 == 2) {
                                int var400 = this.field6691[var335];
                                if (var400 != 0) {
                                    int var401 = (var400 & 16711935) * class1.field33 & -16711936;
                                    int var402 = (var400 & 65280) * class1.field33 & 16711680;
                                    int var403 = ((var401 | var402) >>> 8) + class1.field3;
                                    int var404 = var3[var336];
                                    int var405 = var403 + var404;
                                    int var406 = (var403 & 16711935) + (var404 & 16711935);
                                    int var407 = (var405 - var406 & 65536) + (var406 & 16777472);
                                    var3[var336] = var405 - var407 | var407 - (var407 >>> 8);
                                }
                            }
                        }
                        var326 += class1.field16;
                        var327 += class1.field24;
                        ++var328;
                    }
                    ++var324;
                    class1.field8 += class1.field12;
                    class1.field27 += class1.field4;
                    class1.field29 += class1.field19;
                }
            } else {
                int var408 = class1.field5;
                while (var408 < 0) {
                    int var409 = class1.field29;
                    int var410 = class1.field8 + class1.field23;
                    int var411 = class1.field28 + class1.field27;
                    int var412 = class1.field21;
                    int var413;
                    if ((var413 = var410 - (super.field32 << 12)) >= 0) {
                        int var414 = (class1.field16 - var413) / class1.field16;
                        var412 += var414;
                        var410 += class1.field16 * var414;
                        var411 += class1.field24 * var414;
                        var409 += var414;
                    }
                    int var415;
                    if ((var415 = (var410 - class1.field16) / class1.field16) > var412) {
                        var412 = var415;
                    }
                    if (var411 < 0) {
                        int var416 = (class1.field24 - 1 - var411) / class1.field24;
                        var412 += var416;
                        var410 += class1.field16 * var416;
                        var411 += class1.field24 * var416;
                        var409 += var416;
                    }
                    int var417;
                    if ((var417 = (var411 + 1 - (super.field10 << 12) - class1.field24) / class1.field24) > var412) {
                        var412 = var417;
                    }
                    while (var412 < 0) {
                        int var418 = (var410 >> 12) + (var411 >> 12) * super.field32;
                        int var419 = var409++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var419] = this.field6691[var418];
                            } else if (arg0 == 0) {
                                int var423 = this.field6691[var418++];
                                int var424 = (var423 & 16711680) * class1.field1 & -16777216;
                                int var425 = (var423 & 65280) * class1.field13 & 16711680;
                                int var426 = (var423 & 255) * class1.field7 & 65280;
                                var3[var419] = (var424 | var425 | var426) >>> 8;
                            } else if (arg0 == 3) {
                                int var427 = this.field6691[var418++];
                                int var428 = class1.field6;
                                int var429 = var427 + var428;
                                int var430 = (var427 & 16711935) + (var428 & 16711935);
                                int var431 = (var429 - var430 & 65536) + (var430 & 16777472);
                                var3[var419] = var429 - var431 | var431 - (var431 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var432 = this.field6691[var418];
                                int var433 = (var432 & 16711935) * class1.field33 & -16711936;
                                int var434 = (var432 & 65280) * class1.field33 & 16711680;
                                var3[var419] = ((var433 | var434) >>> 8) + class1.field3;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                int var435 = this.field6691[var418];
                                if (var435 != 0) {
                                    var3[var419] = var435;
                                }
                            } else if (arg0 == 0) {
                                int var436 = this.field6691[var418];
                                if (var436 != 0) {
                                    if ((class1.field6 & 16777215) == 16777215) {
                                        int var437 = class1.field6 >>> 24;
                                        int var438 = 256 - var437;
                                        int var439 = var3[var419];
                                        var3[var419] = ((var436 & 16711935) * var437 + (var439 & 16711935) * var438 & -16711936) + ((var436 & 65280) * var437 + (var439 & 65280) * var438 & 16711680) >> 8;
                                    } else if (class1.field33 != 255) {
                                        int var440 = (var436 & 16711680) * class1.field1 & -16777216;
                                        int var441 = (var436 & 65280) * class1.field13 & 16711680;
                                        int var442 = (var436 & 255) * class1.field7 & 65280;
                                        int var443 = (var440 | var441 | var442) >>> 8;
                                        int var444 = var3[var419];
                                        var3[var419] = ((var443 & 16711935) * class1.field33 + (var444 & 16711935) * class1.field2 & -16711936) + ((var443 & 65280) * class1.field33 + (var444 & 65280) * class1.field2 & 16711680) >> 8;
                                    } else {
                                        int var445 = (var436 & 16711680) * class1.field1 & -16777216;
                                        int var446 = (var436 & 65280) * class1.field13 & 16711680;
                                        int var447 = (var436 & 255) * class1.field7 & 65280;
                                        var3[var419] = (var445 | var446 | var447) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                int var448 = this.field6691[var418];
                                int var449 = class1.field6;
                                int var450 = var448 + var449;
                                int var451 = (var448 & 16711935) + (var449 & 16711935);
                                int var452 = (var450 - var451 & 65536) + (var451 & 16777472);
                                int var453 = var450 - var452 | var452 - (var452 >>> 8);
                                if (var448 == 0 && class1.field33 != 255) {
                                    int var455 = var3[var419];
                                    var453 = ((var453 & 16711935) * class1.field33 + (var455 & 16711935) * class1.field2 & -16711936) + ((var453 & 65280) * class1.field33 + (var455 & 65280) * class1.field2 & 16711680) >> 8;
                                }
                                var3[var419] = var453;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var456 = this.field6691[var418];
                                if (var456 != 0) {
                                    int var457 = (var456 & 16711935) * class1.field33 & -16711936;
                                    int var458 = (var456 & 65280) * class1.field33 & 16711680;
                                    var3[var419++] = ((var457 | var458) >>> 8) + class1.field3;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                int var459 = this.field6691[var418];
                                if (var459 != 0) {
                                    int var460 = var3[var419];
                                    int var461 = var459 + var460;
                                    int var462 = (var459 & 16711935) + (var460 & 16711935);
                                    int var463 = (var461 - var462 & 65536) + (var462 & 16777472);
                                    var3[var419] = var461 - var463 | var463 - (var463 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                int var464 = this.field6691[var418];
                                if (var464 != 0) {
                                    int var465 = (var464 & 16711680) * class1.field1 & -16777216;
                                    int var466 = (var464 & 65280) * class1.field13 & 16711680;
                                    int var467 = (var464 & 255) * class1.field7 & 65280;
                                    int var468 = (var465 | var466 | var467) >>> 8;
                                    int var469 = var3[var419];
                                    int var470 = var468 + var469;
                                    int var471 = (var468 & 16711935) + (var469 & 16711935);
                                    int var472 = (var470 - var471 & 65536) + (var471 & 16777472);
                                    var3[var419] = var470 - var472 | var472 - (var472 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                int var473 = this.field6691[var418];
                                int var474 = class1.field6;
                                int var475 = var473 + var474;
                                int var476 = (var473 & 16711935) + (var474 & 16711935);
                                int var477 = (var475 - var476 & 65536) + (var476 & 16777472);
                                int var478 = var475 - var477 | var477 - (var477 >>> 8);
                                int var479 = var3[var419];
                                int var480 = var478 + var479;
                                int var481 = (var478 & 16711935) + (var479 & 16711935);
                                int var482 = (var480 - var481 & 65536) + (var481 & 16777472);
                                var3[var419] = var480 - var482 | var482 - (var482 >>> 8);
                            } else if (arg0 == 2) {
                                int var483 = this.field6691[var418];
                                if (var483 != 0) {
                                    int var484 = (var483 & 16711935) * class1.field33 & -16711936;
                                    int var485 = (var483 & 65280) * class1.field33 & 16711680;
                                    int var486 = ((var484 | var485) >>> 8) + class1.field3;
                                    int var487 = var3[var419];
                                    int var488 = var486 + var487;
                                    int var489 = (var486 & 16711935) + (var487 & 16711935);
                                    int var490 = (var488 - var489 & 65536) + (var489 & 16777472);
                                    var3[var419] = var488 - var490 | var490 - (var490 >>> 8);
                                }
                            }
                        }
                        var410 += class1.field16;
                        var411 += class1.field24;
                        ++var412;
                    }
                    ++var408;
                    class1.field8 += class1.field12;
                    class1.field27 += class1.field4;
                    class1.field29 += class1.field19;
                }
            }
        } else if (class1.field24 == 0) {
            int var491 = class1.field5;
            while (var491 < 0) {
                int var492 = class1.field29;
                int var493 = class1.field8 + class1.field23;
                int var494 = class1.field27;
                int var495 = class1.field21;
                if (var494 >= 0 && var494 - (super.field10 << 12) < 0) {
                    if (var493 < 0) {
                        int var496 = (class1.field16 - 1 - var493) / class1.field16;
                        var495 += var496;
                        var493 += class1.field16 * var496;
                        var492 += var496;
                    }
                    int var497;
                    if ((var497 = (var493 + 1 - (super.field32 << 12) - class1.field16) / class1.field16) > var495) {
                        var495 = var497;
                    }
                    while (var495 < 0) {
                        int var498 = (var493 >> 12) + (var494 >> 12) * super.field32;
                        int var499 = var492++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var499] = this.field6691[var498];
                            } else if (arg0 == 0) {
                                int var503 = this.field6691[var498++];
                                int var504 = (var503 & 16711680) * class1.field1 & -16777216;
                                int var505 = (var503 & 65280) * class1.field13 & 16711680;
                                int var506 = (var503 & 255) * class1.field7 & 65280;
                                var3[var499] = (var504 | var505 | var506) >>> 8;
                            } else if (arg0 == 3) {
                                int var507 = this.field6691[var498++];
                                int var508 = class1.field6;
                                int var509 = var507 + var508;
                                int var510 = (var507 & 16711935) + (var508 & 16711935);
                                int var511 = (var509 - var510 & 65536) + (var510 & 16777472);
                                var3[var499] = var509 - var511 | var511 - (var511 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var512 = this.field6691[var498];
                                int var513 = (var512 & 16711935) * class1.field33 & -16711936;
                                int var514 = (var512 & 65280) * class1.field33 & 16711680;
                                var3[var499] = ((var513 | var514) >>> 8) + class1.field3;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                int var515 = this.field6691[var498];
                                if (var515 != 0) {
                                    var3[var499] = var515;
                                }
                            } else if (arg0 == 0) {
                                int var516 = this.field6691[var498];
                                if (var516 != 0) {
                                    if ((class1.field6 & 16777215) == 16777215) {
                                        int var517 = class1.field6 >>> 24;
                                        int var518 = 256 - var517;
                                        int var519 = var3[var499];
                                        var3[var499] = ((var516 & 16711935) * var517 + (var519 & 16711935) * var518 & -16711936) + ((var516 & 65280) * var517 + (var519 & 65280) * var518 & 16711680) >> 8;
                                    } else if (class1.field33 != 255) {
                                        int var520 = (var516 & 16711680) * class1.field1 & -16777216;
                                        int var521 = (var516 & 65280) * class1.field13 & 16711680;
                                        int var522 = (var516 & 255) * class1.field7 & 65280;
                                        int var523 = (var520 | var521 | var522) >>> 8;
                                        int var524 = var3[var499];
                                        var3[var499] = ((var523 & 16711935) * class1.field33 + (var524 & 16711935) * class1.field2 & -16711936) + ((var523 & 65280) * class1.field33 + (var524 & 65280) * class1.field2 & 16711680) >> 8;
                                    } else {
                                        int var525 = (var516 & 16711680) * class1.field1 & -16777216;
                                        int var526 = (var516 & 65280) * class1.field13 & 16711680;
                                        int var527 = (var516 & 255) * class1.field7 & 65280;
                                        var3[var499] = (var525 | var526 | var527) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                int var528 = this.field6691[var498];
                                int var529 = class1.field6;
                                int var530 = var528 + var529;
                                int var531 = (var528 & 16711935) + (var529 & 16711935);
                                int var532 = (var530 - var531 & 65536) + (var531 & 16777472);
                                int var533 = var530 - var532 | var532 - (var532 >>> 8);
                                if (var528 == 0 && class1.field33 != 255) {
                                    int var535 = var3[var499];
                                    var533 = ((var533 & 16711935) * class1.field33 + (var535 & 16711935) * class1.field2 & -16711936) + ((var533 & 65280) * class1.field33 + (var535 & 65280) * class1.field2 & 16711680) >> 8;
                                }
                                var3[var499] = var533;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var536 = this.field6691[var498];
                                if (var536 != 0) {
                                    int var537 = (var536 & 16711935) * class1.field33 & -16711936;
                                    int var538 = (var536 & 65280) * class1.field33 & 16711680;
                                    var3[var499++] = ((var537 | var538) >>> 8) + class1.field3;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                int var539 = this.field6691[var498];
                                if (var539 != 0) {
                                    int var540 = var3[var499];
                                    int var541 = var539 + var540;
                                    int var542 = (var539 & 16711935) + (var540 & 16711935);
                                    int var543 = (var541 - var542 & 65536) + (var542 & 16777472);
                                    var3[var499] = var541 - var543 | var543 - (var543 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                int var544 = this.field6691[var498];
                                if (var544 != 0) {
                                    int var545 = (var544 & 16711680) * class1.field1 & -16777216;
                                    int var546 = (var544 & 65280) * class1.field13 & 16711680;
                                    int var547 = (var544 & 255) * class1.field7 & 65280;
                                    int var548 = (var545 | var546 | var547) >>> 8;
                                    int var549 = var3[var499];
                                    int var550 = var548 + var549;
                                    int var551 = (var548 & 16711935) + (var549 & 16711935);
                                    int var552 = (var550 - var551 & 65536) + (var551 & 16777472);
                                    var3[var499] = var550 - var552 | var552 - (var552 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                int var553 = this.field6691[var498];
                                int var554 = class1.field6;
                                int var555 = var553 + var554;
                                int var556 = (var553 & 16711935) + (var554 & 16711935);
                                int var557 = (var555 - var556 & 65536) + (var556 & 16777472);
                                int var558 = var555 - var557 | var557 - (var557 >>> 8);
                                int var559 = var3[var499];
                                int var560 = var558 + var559;
                                int var561 = (var558 & 16711935) + (var559 & 16711935);
                                int var562 = (var560 - var561 & 65536) + (var561 & 16777472);
                                var3[var499] = var560 - var562 | var562 - (var562 >>> 8);
                            } else if (arg0 == 2) {
                                int var563 = this.field6691[var498];
                                if (var563 != 0) {
                                    int var564 = (var563 & 16711935) * class1.field33 & -16711936;
                                    int var565 = (var563 & 65280) * class1.field33 & 16711680;
                                    int var566 = ((var564 | var565) >>> 8) + class1.field3;
                                    int var567 = var3[var499];
                                    int var568 = var566 + var567;
                                    int var569 = (var566 & 16711935) + (var567 & 16711935);
                                    int var570 = (var568 - var569 & 65536) + (var569 & 16777472);
                                    var3[var499] = var568 - var570 | var570 - (var570 >>> 8);
                                }
                            }
                        }
                        var493 += class1.field16;
                        ++var495;
                    }
                }
                ++var491;
                class1.field8 += class1.field12;
                class1.field27 += class1.field4;
                class1.field29 += class1.field19;
            }
        } else if (class1.field24 < 0) {
            for (int var571 = class1.field5; var571 < 0; ++var571) {
                int var572 = class1.field29;
                int var573 = class1.field8 + class1.field23;
                int var574 = class1.field28 + class1.field27;
                int var575 = class1.field21;
                if (var573 < 0) {
                    int var576 = (class1.field16 - 1 - var573) / class1.field16;
                    var575 += var576;
                    var573 += class1.field16 * var576;
                    var574 += class1.field24 * var576;
                    var572 += var576;
                }
                int var577;
                if ((var577 = (var573 + 1 - (super.field32 << 12) - class1.field16) / class1.field16) > var575) {
                    var575 = var577;
                }
                int var578;
                if ((var578 = var574 - (super.field10 << 12)) >= 0) {
                    int var579 = (class1.field24 - var578) / class1.field24;
                    var575 += var579;
                    var573 += class1.field16 * var579;
                    var574 += class1.field24 * var579;
                    var572 += var579;
                }
                int var580;
                if ((var580 = (var574 - class1.field24) / class1.field24) > var575) {
                    var575 = var580;
                }
                while (var575 < 0) {
                    int var581 = (var573 >> 12) + (var574 >> 12) * super.field32;
                    int var582 = var572++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var582] = this.field6691[var581];
                        } else if (arg0 == 0) {
                            int var586 = this.field6691[var581++];
                            int var587 = (var586 & 16711680) * class1.field1 & -16777216;
                            int var588 = (var586 & 65280) * class1.field13 & 16711680;
                            int var589 = (var586 & 255) * class1.field7 & 65280;
                            var3[var582] = (var587 | var588 | var589) >>> 8;
                        } else if (arg0 == 3) {
                            int var590 = this.field6691[var581++];
                            int var591 = class1.field6;
                            int var592 = var590 + var591;
                            int var593 = (var590 & 16711935) + (var591 & 16711935);
                            int var594 = (var592 - var593 & 65536) + (var593 & 16777472);
                            var3[var582] = var592 - var594 | var594 - (var594 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var595 = this.field6691[var581];
                            int var596 = (var595 & 16711935) * class1.field33 & -16711936;
                            int var597 = (var595 & 65280) * class1.field33 & 16711680;
                            var3[var582] = ((var596 | var597) >>> 8) + class1.field3;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            int var598 = this.field6691[var581];
                            if (var598 != 0) {
                                var3[var582] = var598;
                            }
                        } else if (arg0 == 0) {
                            int var599 = this.field6691[var581];
                            if (var599 != 0) {
                                if ((class1.field6 & 16777215) == 16777215) {
                                    int var600 = class1.field6 >>> 24;
                                    int var601 = 256 - var600;
                                    int var602 = var3[var582];
                                    var3[var582] = ((var599 & 16711935) * var600 + (var602 & 16711935) * var601 & -16711936) + ((var599 & 65280) * var600 + (var602 & 65280) * var601 & 16711680) >> 8;
                                } else if (class1.field33 != 255) {
                                    int var603 = (var599 & 16711680) * class1.field1 & -16777216;
                                    int var604 = (var599 & 65280) * class1.field13 & 16711680;
                                    int var605 = (var599 & 255) * class1.field7 & 65280;
                                    int var606 = (var603 | var604 | var605) >>> 8;
                                    int var607 = var3[var582];
                                    var3[var582] = ((var606 & 16711935) * class1.field33 + (var607 & 16711935) * class1.field2 & -16711936) + ((var606 & 65280) * class1.field33 + (var607 & 65280) * class1.field2 & 16711680) >> 8;
                                } else {
                                    int var608 = (var599 & 16711680) * class1.field1 & -16777216;
                                    int var609 = (var599 & 65280) * class1.field13 & 16711680;
                                    int var610 = (var599 & 255) * class1.field7 & 65280;
                                    var3[var582] = (var608 | var609 | var610) >>> 8;
                                }
                            }
                        } else if (arg0 == 3) {
                            int var611 = this.field6691[var581];
                            int var612 = class1.field6;
                            int var613 = var611 + var612;
                            int var614 = (var611 & 16711935) + (var612 & 16711935);
                            int var615 = (var613 - var614 & 65536) + (var614 & 16777472);
                            int var616 = var613 - var615 | var615 - (var615 >>> 8);
                            if (var611 == 0 && class1.field33 != 255) {
                                int var618 = var3[var582];
                                var616 = ((var616 & 16711935) * class1.field33 + (var618 & 16711935) * class1.field2 & -16711936) + ((var616 & 65280) * class1.field33 + (var618 & 65280) * class1.field2 & 16711680) >> 8;
                            }
                            var3[var582] = var616;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var619 = this.field6691[var581];
                            if (var619 != 0) {
                                int var620 = (var619 & 16711935) * class1.field33 & -16711936;
                                int var621 = (var619 & 65280) * class1.field33 & 16711680;
                                var3[var582++] = ((var620 | var621) >>> 8) + class1.field3;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            int var622 = this.field6691[var581];
                            if (var622 != 0) {
                                int var623 = var3[var582];
                                int var624 = var622 + var623;
                                int var625 = (var622 & 16711935) + (var623 & 16711935);
                                int var626 = (var624 - var625 & 65536) + (var625 & 16777472);
                                var3[var582] = var624 - var626 | var626 - (var626 >>> 8);
                            }
                        } else if (arg0 == 0) {
                            int var627 = this.field6691[var581];
                            if (var627 != 0) {
                                int var628 = (var627 & 16711680) * class1.field1 & -16777216;
                                int var629 = (var627 & 65280) * class1.field13 & 16711680;
                                int var630 = (var627 & 255) * class1.field7 & 65280;
                                int var631 = (var628 | var629 | var630) >>> 8;
                                int var632 = var3[var582];
                                int var633 = var631 + var632;
                                int var634 = (var631 & 16711935) + (var632 & 16711935);
                                int var635 = (var633 - var634 & 65536) + (var634 & 16777472);
                                var3[var582] = var633 - var635 | var635 - (var635 >>> 8);
                            }
                        } else if (arg0 == 3) {
                            int var636 = this.field6691[var581];
                            int var637 = class1.field6;
                            int var638 = var636 + var637;
                            int var639 = (var636 & 16711935) + (var637 & 16711935);
                            int var640 = (var638 - var639 & 65536) + (var639 & 16777472);
                            int var641 = var638 - var640 | var640 - (var640 >>> 8);
                            int var642 = var3[var582];
                            int var643 = var641 + var642;
                            int var644 = (var641 & 16711935) + (var642 & 16711935);
                            int var645 = (var643 - var644 & 65536) + (var644 & 16777472);
                            var3[var582] = var643 - var645 | var645 - (var645 >>> 8);
                        } else if (arg0 == 2) {
                            int var646 = this.field6691[var581];
                            if (var646 != 0) {
                                int var647 = (var646 & 16711935) * class1.field33 & -16711936;
                                int var648 = (var646 & 65280) * class1.field33 & 16711680;
                                int var649 = ((var647 | var648) >>> 8) + class1.field3;
                                int var650 = var3[var582];
                                int var651 = var649 + var650;
                                int var652 = (var649 & 16711935) + (var650 & 16711935);
                                int var653 = (var651 - var652 & 65536) + (var652 & 16777472);
                                var3[var582] = var651 - var653 | var653 - (var653 >>> 8);
                            }
                        }
                    }
                    var573 += class1.field16;
                    var574 += class1.field24;
                    ++var575;
                }
                class1.field8 += class1.field12;
                class1.field27 += class1.field4;
                class1.field29 += class1.field19;
            }
        } else {
            for (int var654 = class1.field5; var654 < 0; ++var654) {
                int var655 = class1.field29;
                int var656 = class1.field8 + class1.field23;
                int var657 = class1.field28 + class1.field27;
                int var658 = class1.field21;
                if (var656 < 0) {
                    int var659 = (class1.field16 - 1 - var656) / class1.field16;
                    var658 += var659;
                    var656 += class1.field16 * var659;
                    var657 += class1.field24 * var659;
                    var655 += var659;
                }
                int var660;
                if ((var660 = (var656 + 1 - (super.field32 << 12) - class1.field16) / class1.field16) > var658) {
                    var658 = var660;
                }
                if (var657 < 0) {
                    int var661 = (class1.field24 - 1 - var657) / class1.field24;
                    var658 += var661;
                    var656 += class1.field16 * var661;
                    var657 += class1.field24 * var661;
                    var655 += var661;
                }
                int var662;
                if ((var662 = (var657 + 1 - (super.field10 << 12) - class1.field24) / class1.field24) > var658) {
                    var658 = var662;
                }
                while (var658 < 0) {
                    int var663 = (var656 >> 12) + (var657 >> 12) * super.field32;
                    int var664 = var655++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var664] = this.field6691[var663];
                        } else if (arg0 == 0) {
                            int var668 = this.field6691[var663++];
                            int var669 = (var668 & 16711680) * class1.field1 & -16777216;
                            int var670 = (var668 & 65280) * class1.field13 & 16711680;
                            int var671 = (var668 & 255) * class1.field7 & 65280;
                            var3[var664] = (var669 | var670 | var671) >>> 8;
                        } else if (arg0 == 3) {
                            int var672 = this.field6691[var663++];
                            int var673 = class1.field6;
                            int var674 = var672 + var673;
                            int var675 = (var672 & 16711935) + (var673 & 16711935);
                            int var676 = (var674 - var675 & 65536) + (var675 & 16777472);
                            var3[var664] = var674 - var676 | var676 - (var676 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var677 = this.field6691[var663];
                            int var678 = (var677 & 16711935) * class1.field33 & -16711936;
                            int var679 = (var677 & 65280) * class1.field33 & 16711680;
                            var3[var664] = ((var678 | var679) >>> 8) + class1.field3;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            int var680 = this.field6691[var663];
                            if (var680 != 0) {
                                var3[var664] = var680;
                            }
                        } else if (arg0 == 0) {
                            int var681 = this.field6691[var663];
                            if (var681 != 0) {
                                if ((class1.field6 & 16777215) == 16777215) {
                                    int var682 = class1.field6 >>> 24;
                                    int var683 = 256 - var682;
                                    int var684 = var3[var664];
                                    var3[var664] = ((var681 & 16711935) * var682 + (var684 & 16711935) * var683 & -16711936) + ((var681 & 65280) * var682 + (var684 & 65280) * var683 & 16711680) >> 8;
                                } else if (class1.field33 != 255) {
                                    int var685 = (var681 & 16711680) * class1.field1 & -16777216;
                                    int var686 = (var681 & 65280) * class1.field13 & 16711680;
                                    int var687 = (var681 & 255) * class1.field7 & 65280;
                                    int var688 = (var685 | var686 | var687) >>> 8;
                                    int var689 = var3[var664];
                                    var3[var664] = ((var688 & 16711935) * class1.field33 + (var689 & 16711935) * class1.field2 & -16711936) + ((var688 & 65280) * class1.field33 + (var689 & 65280) * class1.field2 & 16711680) >> 8;
                                } else {
                                    int var690 = (var681 & 16711680) * class1.field1 & -16777216;
                                    int var691 = (var681 & 65280) * class1.field13 & 16711680;
                                    int var692 = (var681 & 255) * class1.field7 & 65280;
                                    var3[var664] = (var690 | var691 | var692) >>> 8;
                                }
                            }
                        } else if (arg0 == 3) {
                            int var693 = this.field6691[var663];
                            int var694 = class1.field6;
                            int var695 = var693 + var694;
                            int var696 = (var693 & 16711935) + (var694 & 16711935);
                            int var697 = (var695 - var696 & 65536) + (var696 & 16777472);
                            int var698 = var695 - var697 | var697 - (var697 >>> 8);
                            if (var693 == 0 && class1.field33 != 255) {
                                int var700 = var3[var664];
                                var698 = ((var698 & 16711935) * class1.field33 + (var700 & 16711935) * class1.field2 & -16711936) + ((var698 & 65280) * class1.field33 + (var700 & 65280) * class1.field2 & 16711680) >> 8;
                            }
                            var3[var664] = var698;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var701 = this.field6691[var663];
                            if (var701 != 0) {
                                int var702 = (var701 & 16711935) * class1.field33 & -16711936;
                                int var703 = (var701 & 65280) * class1.field33 & 16711680;
                                var3[var664++] = ((var702 | var703) >>> 8) + class1.field3;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            int var704 = this.field6691[var663];
                            if (var704 != 0) {
                                int var705 = var3[var664];
                                int var706 = var704 + var705;
                                int var707 = (var704 & 16711935) + (var705 & 16711935);
                                int var708 = (var706 - var707 & 65536) + (var707 & 16777472);
                                var3[var664] = var706 - var708 | var708 - (var708 >>> 8);
                            }
                        } else if (arg0 == 0) {
                            int var709 = this.field6691[var663];
                            if (var709 != 0) {
                                int var710 = (var709 & 16711680) * class1.field1 & -16777216;
                                int var711 = (var709 & 65280) * class1.field13 & 16711680;
                                int var712 = (var709 & 255) * class1.field7 & 65280;
                                int var713 = (var710 | var711 | var712) >>> 8;
                                int var714 = var3[var664];
                                int var715 = var713 + var714;
                                int var716 = (var713 & 16711935) + (var714 & 16711935);
                                int var717 = (var715 - var716 & 65536) + (var716 & 16777472);
                                var3[var664] = var715 - var717 | var717 - (var717 >>> 8);
                            }
                        } else if (arg0 == 3) {
                            int var718 = this.field6691[var663];
                            int var719 = class1.field6;
                            int var720 = var718 + var719;
                            int var721 = (var718 & 16711935) + (var719 & 16711935);
                            int var722 = (var720 - var721 & 65536) + (var721 & 16777472);
                            int var723 = var720 - var722 | var722 - (var722 >>> 8);
                            int var724 = var3[var664];
                            int var725 = var723 + var724;
                            int var726 = (var723 & 16711935) + (var724 & 16711935);
                            int var727 = (var725 - var726 & 65536) + (var726 & 16777472);
                            var3[var664] = var725 - var727 | var727 - (var727 >>> 8);
                        } else if (arg0 == 2) {
                            int var728 = this.field6691[var663];
                            if (var728 != 0) {
                                int var729 = (var728 & 16711935) * class1.field33 & -16711936;
                                int var730 = (var728 & 65280) * class1.field33 & 16711680;
                                int var731 = ((var729 | var730) >>> 8) + class1.field3;
                                int var732 = var3[var664];
                                int var733 = var731 + var732;
                                int var734 = (var731 & 16711935) + (var732 & 16711935);
                                int var735 = (var733 - var734 & 65536) + (var734 & 16777472);
                                var3[var664] = var733 - var735 | var735 - (var735 >>> 8);
                            }
                        }
                    }
                    var656 += class1.field16;
                    var657 += class1.field24;
                    ++var658;
                }
                class1.field8 += class1.field12;
                class1.field27 += class1.field4;
                class1.field29 += class1.field19;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V", line = 4628)
    public final void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (super.field31.method3831()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field31.field9635;
            int var7 = super.field22 + arg0;
            int var8 = super.field11 + arg1;
            int var9 = var6 * var8 + var7;
            int var10 = 0;
            int var11 = super.field10;
            int var12 = super.field32;
            int var13 = var6 - var12;
            int var14 = 0;
            if (var8 < super.field31.field9628) {
                int var15 = super.field31.field9628 - var8;
                var11 -= var15;
                var8 = super.field31.field9628;
                var10 += var12 * var15;
                var9 += var6 * var15;
            }
            if (var8 + var11 > super.field31.field9622) {
                var11 -= var8 + var11 - super.field31.field9622;
            }
            if (var7 < super.field31.field9637) {
                int var16 = super.field31.field9637 - var7;
                var12 -= var16;
                var7 = super.field31.field9637;
                var10 += var16;
                var9 += var16;
                var14 += var16;
                var13 += var16;
            }
            if (var7 + var12 > super.field31.field9647) {
                int var17 = var7 + var12 - super.field31.field9647;
                var12 -= var17;
                var14 += var17;
                var13 += var17;
            }
            if (var12 > 0 && var11 > 0) {
                int[] var18 = super.field31.field9629;
                if (arg4 == 0) {
                    if (arg2 == 1) {
                        for (int var19 = -var11; var19 < 0; ++var19) {
                            int var20 = var9 + var12 - 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field6691[var10++];
                                var18[var9++] = this.field6691[var10++];
                                var18[var9++] = this.field6691[var10++];
                                var18[var9++] = this.field6691[var10++];
                            }
                            var20 += 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field6691[var10++];
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
                                int var26 = this.field6691[var10++];
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
                                int var32 = this.field6691[var10++];
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
                                int var43 = this.field6691[var10++];
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
                                int var49 = this.field6691[var10++];
                                if (var49 != 0) {
                                    var18[var9++] = var49;
                                } else {
                                    ++var9;
                                }
                                int var50 = this.field6691[var10++];
                                if (var50 != 0) {
                                    var18[var9++] = var50;
                                } else {
                                    ++var9;
                                }
                                int var51 = this.field6691[var10++];
                                if (var51 != 0) {
                                    var18[var9++] = var51;
                                } else {
                                    ++var9;
                                }
                                int var52 = this.field6691[var10++];
                                if (var52 != 0) {
                                    var18[var9++] = var52;
                                } else {
                                    ++var9;
                                }
                            }
                            var47 += 3;
                            while (var9 < var47) {
                                int var48 = this.field6691[var10++];
                                if (var48 != 0) {
                                    var18[var9++] = var48;
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
                                    int var57 = this.field6691[var10++];
                                    if (var57 != 0) {
                                        int var58 = var18[var9];
                                        var18[var9++] = ((var57 & 16711935) * var53 + (var58 & 16711935) * var54 & -16711936) + ((var57 & 65280) * var53 + (var58 & 65280) * var54 & 16711680) >> 8;
                                    } else {
                                        ++var9;
                                    }
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        } else {
                            int var59 = (arg3 & 16711680) >> 16;
                            int var60 = (arg3 & 65280) >> 8;
                            int var61 = arg3 & 255;
                            int var62 = arg3 >>> 24;
                            int var63 = 256 - var62;
                            for (int var64 = -var11; var64 < 0; ++var64) {
                                for (int var65 = -var12; var65 < 0; ++var65) {
                                    int var66 = this.field6691[var10++];
                                    if (var66 != 0) {
                                        if (var62 != 255) {
                                            int var67 = (var66 & 16711680) * var59 & -16777216;
                                            int var68 = (var66 & 65280) * var60 & 16711680;
                                            int var69 = (var66 & 255) * var61 & 65280;
                                            int var70 = (var67 | var68 | var69) >>> 8;
                                            int var71 = var18[var9];
                                            var18[var9++] = ((var70 & 16711935) * var62 + (var71 & 16711935) * var63 & -16711936) + ((var70 & 65280) * var62 + (var71 & 65280) * var63 & 16711680) >> 8;
                                        } else {
                                            int var72 = (var66 & 16711680) * var59 & -16777216;
                                            int var73 = (var66 & 65280) * var60 & 16711680;
                                            int var74 = (var66 & 255) * var61 & 65280;
                                            var18[var9++] = (var72 | var73 | var74) >>> 8;
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
                        int var75 = arg3 >>> 24;
                        int var76 = 256 - var75;
                        for (int var77 = -var11; var77 < 0; ++var77) {
                            for (int var78 = -var12; var78 < 0; ++var78) {
                                int var79 = this.field6691[var10++];
                                int var80 = arg3 + var79;
                                int var81 = (arg3 & 16711935) + (var79 & 16711935);
                                int var82 = (var80 - var81 & 65536) + (var81 & 16777472);
                                int var83 = var80 - var82 | var82 - (var82 >>> 8);
                                if (var79 == 0 && var75 != 255) {
                                    int var85 = var18[var9];
                                    var83 = ((var83 & 16711935) * var75 + (var85 & 16711935) * var76 & -16711936) + ((var83 & 65280) * var75 + (var85 & 65280) * var76 & 16711680) >> 8;
                                }
                                var18[var9++] = var83;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var86 = arg3 >>> 24;
                        int var87 = 256 - var86;
                        int var88 = (arg3 & 16711935) * var87 & -16711936;
                        int var89 = (arg3 & 65280) * var87 & 16711680;
                        int var90 = (var88 | var89) >>> 8;
                        for (int var91 = -var11; var91 < 0; ++var91) {
                            for (int var92 = -var12; var92 < 0; ++var92) {
                                int var93 = this.field6691[var10++];
                                if (var93 != 0) {
                                    int var94 = (var93 & 16711935) * var86 & -16711936;
                                    int var95 = (var93 & 65280) * var86 & 16711680;
                                    var18[var9++] = ((var94 | var95) >>> 8) + var90;
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
                    for (int var96 = -var11; var96 < 0; ++var96) {
                        for (int var97 = -var12; var97 < 0; ++var97) {
                            int var98 = this.field6691[var10++];
                            if (var98 != 0) {
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
                } else if (arg2 == 0) {
                    int var103 = (arg3 & 16711680) >> 16;
                    int var104 = (arg3 & 65280) >> 8;
                    int var105 = arg3 & 255;
                    for (int var106 = -var11; var106 < 0; ++var106) {
                        for (int var107 = -var12; var107 < 0; ++var107) {
                            int var108 = this.field6691[var10++];
                            if (var108 != 0) {
                                int var109 = (var108 & 16711680) * var103 & -16777216;
                                int var110 = (var108 & 65280) * var104 & 16711680;
                                int var111 = (var108 & 255) * var105 & 65280;
                                int var112 = (var109 | var110 | var111) >>> 8;
                                int var113 = var18[var9];
                                int var114 = var112 + var113;
                                int var115 = (var112 & 16711935) + (var113 & 16711935);
                                int var116 = (var114 - var115 & 65536) + (var115 & 16777472);
                                var18[var9++] = var114 - var116 | var116 - (var116 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 == 3) {
                    for (int var117 = -var11; var117 < 0; ++var117) {
                        for (int var118 = -var12; var118 < 0; ++var118) {
                            int var119 = this.field6691[var10++];
                            int var120 = arg3 + var119;
                            int var121 = (arg3 & 16711935) + (var119 & 16711935);
                            int var122 = (var120 - var121 & 65536) + (var121 & 16777472);
                            int var123 = var120 - var122 | var122 - (var122 >>> 8);
                            int var124 = var18[var9];
                            int var125 = var123 + var124;
                            int var126 = (var123 & 16711935) + (var124 & 16711935);
                            int var127 = (var125 - var126 & 65536) + (var126 & 16777472);
                            var18[var9++] = var125 - var127 | var127 - (var127 >>> 8);
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var128 = arg3 >>> 24;
                    int var129 = 256 - var128;
                    int var130 = (arg3 & 16711935) * var129 & -16711936;
                    int var131 = (arg3 & 65280) * var129 & 16711680;
                    int var132 = (var130 | var131) >>> 8;
                    for (int var133 = -var11; var133 < 0; ++var133) {
                        for (int var134 = -var12; var134 < 0; ++var134) {
                            int var135 = this.field6691[var10++];
                            if (var135 != 0) {
                                int var136 = (var135 & 16711935) * var128 & -16711936;
                                int var137 = (var135 & 65280) * var128 & 16711680;
                                int var138 = ((var136 | var137) >>> 8) + var132;
                                int var139 = var18[var9];
                                int var140 = var138 + var139;
                                int var141 = (var138 & 16711935) + (var139 & 16711935);
                                int var142 = (var140 - var141 & 65536) + (var141 & 16777472);
                                var18[var9++] = var140 - var142 | var142 - (var142 >>> 8);
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

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([I[III)V", line = 5284)
    public final void method13(int[] arg0, int[] arg1, int arg2, int arg3) {
        int[] var5 = super.field31.field9629;
        if (class1.field16 == 0) {
            if (class1.field24 == 0) {
                int var6 = class1.field5;
                while (var6 < 0) {
                    int var7 = arg3 + var6;
                    if (var7 >= 0) {
                        if (var7 >= arg0.length) {
                            return;
                        }
                        int var8 = class1.field29;
                        int var9 = class1.field8;
                        int var10 = class1.field27;
                        int var11 = class1.field21;
                        if (var9 >= 0 && var10 >= 0 && var9 - (super.field32 << 12) < 0 && var10 - (super.field10 << 12) < 0) {
                            int var12 = arg0[var7] - arg2;
                            int var13 = -arg1[var7];
                            int var14 = var12 - (var8 - class1.field29);
                            if (var14 > 0) {
                                var8 += var14;
                                var11 += var14;
                                var9 += class1.field16 * var14;
                                var10 += class1.field24 * var14;
                            } else {
                                var13 -= var14;
                            }
                            if (var11 < var13) {
                                var11 = var13;
                            }
                            while (var11 < 0) {
                                int var15 = this.field6691[(var9 >> 12) + (var10 >> 12) * super.field32];
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
                    class1.field29 += class1.field19;
                }
            } else if (class1.field24 < 0) {
                int var16 = class1.field5;
                while (var16 < 0) {
                    int var17 = arg3 + var16;
                    if (var17 >= 0) {
                        if (var17 >= arg0.length) {
                            return;
                        }
                        int var18 = class1.field29;
                        int var19 = class1.field8;
                        int var20 = class1.field28 + class1.field27;
                        int var21 = class1.field21;
                        if (var19 >= 0 && var19 - (super.field32 << 12) < 0) {
                            int var22;
                            if ((var22 = var20 - (super.field10 << 12)) >= 0) {
                                int var23 = (class1.field24 - var22) / class1.field24;
                                var21 += var23;
                                var20 += class1.field24 * var23;
                                var18 += var23;
                            }
                            int var24;
                            if ((var24 = (var20 - class1.field24) / class1.field24) > var21) {
                                var21 = var24;
                            }
                            int var25 = arg0[var17] - arg2;
                            int var26 = -arg1[var17];
                            int var27 = var25 - (var18 - class1.field29);
                            if (var27 > 0) {
                                var18 += var27;
                                var21 += var27;
                                var19 += class1.field16 * var27;
                                var20 += class1.field24 * var27;
                            } else {
                                var26 -= var27;
                            }
                            if (var21 < var26) {
                                var21 = var26;
                            }
                            while (var21 < 0) {
                                int var28 = this.field6691[(var19 >> 12) + (var20 >> 12) * super.field32];
                                if (var28 != 0) {
                                    var5[var18++] = var28;
                                } else {
                                    ++var18;
                                }
                                var20 += class1.field24;
                                ++var21;
                            }
                        }
                    }
                    ++var16;
                    class1.field8 += class1.field12;
                    class1.field29 += class1.field19;
                }
            } else {
                int var29 = class1.field5;
                while (var29 < 0) {
                    int var30 = arg3 + var29;
                    if (var30 >= 0) {
                        if (var30 >= arg0.length) {
                            return;
                        }
                        int var31 = class1.field29;
                        int var32 = class1.field8;
                        int var33 = class1.field28 + class1.field27;
                        int var34 = class1.field21;
                        if (var32 >= 0 && var32 - (super.field32 << 12) < 0) {
                            if (var33 < 0) {
                                int var35 = (class1.field24 - 1 - var33) / class1.field24;
                                var34 += var35;
                                var33 += class1.field24 * var35;
                                var31 += var35;
                            }
                            int var36;
                            if ((var36 = (var33 + 1 - (super.field10 << 12) - class1.field24) / class1.field24) > var34) {
                                var34 = var36;
                            }
                            int var37 = arg0[var30] - arg2;
                            int var38 = -arg1[var30];
                            int var39 = var37 - (var31 - class1.field29);
                            if (var39 > 0) {
                                var31 += var39;
                                var34 += var39;
                                var32 += class1.field16 * var39;
                                var33 += class1.field24 * var39;
                            } else {
                                var38 -= var39;
                            }
                            if (var34 < var38) {
                                var34 = var38;
                            }
                            while (var34 < 0) {
                                int var40 = this.field6691[(var32 >> 12) + (var33 >> 12) * super.field32];
                                if (var40 != 0) {
                                    var5[var31++] = var40;
                                } else {
                                    ++var31;
                                }
                                var33 += class1.field24;
                                ++var34;
                            }
                        }
                    }
                    ++var29;
                    class1.field8 += class1.field12;
                    class1.field29 += class1.field19;
                }
            }
        } else if (class1.field16 < 0) {
            if (class1.field24 == 0) {
                int var41 = class1.field5;
                while (var41 < 0) {
                    int var42 = arg3 + var41;
                    if (var42 >= 0) {
                        if (var42 >= arg0.length) {
                            return;
                        }
                        int var43 = class1.field29;
                        int var44 = class1.field8 + class1.field23;
                        int var45 = class1.field27;
                        int var46 = class1.field21;
                        if (var45 >= 0 && var45 - (super.field10 << 12) < 0) {
                            int var47;
                            if ((var47 = var44 - (super.field32 << 12)) >= 0) {
                                int var48 = (class1.field16 - var47) / class1.field16;
                                var46 += var48;
                                var44 += class1.field16 * var48;
                                var43 += var48;
                            }
                            int var49;
                            if ((var49 = (var44 - class1.field16) / class1.field16) > var46) {
                                var46 = var49;
                            }
                            int var50 = arg0[var42] - arg2;
                            int var51 = -arg1[var42];
                            int var52 = var50 - (var43 - class1.field29);
                            if (var52 > 0) {
                                var43 += var52;
                                var46 += var52;
                                var44 += class1.field16 * var52;
                                var45 += class1.field24 * var52;
                            } else {
                                var51 -= var52;
                            }
                            if (var46 < var51) {
                                var46 = var51;
                            }
                            while (var46 < 0) {
                                int var53 = this.field6691[(var44 >> 12) + (var45 >> 12) * super.field32];
                                if (var53 != 0) {
                                    var5[var43++] = var53;
                                } else {
                                    ++var43;
                                }
                                var44 += class1.field16;
                                ++var46;
                            }
                        }
                    }
                    ++var41;
                    class1.field27 += class1.field4;
                    class1.field29 += class1.field19;
                }
            } else if (class1.field24 < 0) {
                int var54 = class1.field5;
                while (var54 < 0) {
                    int var55 = arg3 + var54;
                    if (var55 >= 0) {
                        if (var55 >= arg0.length) {
                            return;
                        }
                        int var56 = class1.field29;
                        int var57 = class1.field8 + class1.field23;
                        int var58 = class1.field28 + class1.field27;
                        int var59 = class1.field21;
                        int var60;
                        if ((var60 = var57 - (super.field32 << 12)) >= 0) {
                            int var61 = (class1.field16 - var60) / class1.field16;
                            var59 += var61;
                            var57 += class1.field16 * var61;
                            var58 += class1.field24 * var61;
                            var56 += var61;
                        }
                        int var62;
                        if ((var62 = (var57 - class1.field16) / class1.field16) > var59) {
                            var59 = var62;
                        }
                        int var63;
                        if ((var63 = var58 - (super.field10 << 12)) >= 0) {
                            int var64 = (class1.field24 - var63) / class1.field24;
                            var59 += var64;
                            var57 += class1.field16 * var64;
                            var58 += class1.field24 * var64;
                            var56 += var64;
                        }
                        int var65;
                        if ((var65 = (var58 - class1.field24) / class1.field24) > var59) {
                            var59 = var65;
                        }
                        int var66 = arg0[var55] - arg2;
                        int var67 = -arg1[var55];
                        int var68 = var66 - (var56 - class1.field29);
                        if (var68 > 0) {
                            var56 += var68;
                            var59 += var68;
                            var57 += class1.field16 * var68;
                            var58 += class1.field24 * var68;
                        } else {
                            var67 -= var68;
                        }
                        if (var59 < var67) {
                            var59 = var67;
                        }
                        while (var59 < 0) {
                            int var69 = this.field6691[(var57 >> 12) + (var58 >> 12) * super.field32];
                            if (var69 != 0) {
                                var5[var56++] = var69;
                            } else {
                                ++var56;
                            }
                            var57 += class1.field16;
                            var58 += class1.field24;
                            ++var59;
                        }
                    }
                    ++var54;
                    class1.field8 += class1.field12;
                    class1.field27 += class1.field4;
                    class1.field29 += class1.field19;
                }
            } else {
                int var70 = class1.field5;
                while (var70 < 0) {
                    int var71 = arg3 + var70;
                    if (var71 >= 0) {
                        if (var71 >= arg0.length) {
                            return;
                        }
                        int var72 = class1.field29;
                        int var73 = class1.field8 + class1.field23;
                        int var74 = class1.field28 + class1.field27;
                        int var75 = class1.field21;
                        int var76;
                        if ((var76 = var73 - (super.field32 << 12)) >= 0) {
                            int var77 = (class1.field16 - var76) / class1.field16;
                            var75 += var77;
                            var73 += class1.field16 * var77;
                            var74 += class1.field24 * var77;
                            var72 += var77;
                        }
                        int var78;
                        if ((var78 = (var73 - class1.field16) / class1.field16) > var75) {
                            var75 = var78;
                        }
                        if (var74 < 0) {
                            int var79 = (class1.field24 - 1 - var74) / class1.field24;
                            var75 += var79;
                            var73 += class1.field16 * var79;
                            var74 += class1.field24 * var79;
                            var72 += var79;
                        }
                        int var80;
                        if ((var80 = (var74 + 1 - (super.field10 << 12) - class1.field24) / class1.field24) > var75) {
                            var75 = var80;
                        }
                        int var81 = arg0[var71] - arg2;
                        int var82 = -arg1[var71];
                        int var83 = var81 - (var72 - class1.field29);
                        if (var83 > 0) {
                            var72 += var83;
                            var75 += var83;
                            var73 += class1.field16 * var83;
                            var74 += class1.field24 * var83;
                        } else {
                            var82 -= var83;
                        }
                        if (var75 < var82) {
                            var75 = var82;
                        }
                        while (var75 < 0) {
                            int var84 = this.field6691[(var73 >> 12) + (var74 >> 12) * super.field32];
                            if (var84 != 0) {
                                var5[var72++] = var84;
                            } else {
                                ++var72;
                            }
                            var73 += class1.field16;
                            var74 += class1.field24;
                            ++var75;
                        }
                    }
                    ++var70;
                    class1.field8 += class1.field12;
                    class1.field27 += class1.field4;
                    class1.field29 += class1.field19;
                }
            }
        } else if (class1.field24 == 0) {
            int var85 = class1.field5;
            while (var85 < 0) {
                int var86 = arg3 + var85;
                if (var86 >= 0) {
                    if (var86 >= arg0.length) {
                        return;
                    }
                    int var87 = class1.field29;
                    int var88 = class1.field8 + class1.field23;
                    int var89 = class1.field27;
                    int var90 = class1.field21;
                    if (var89 >= 0 && var89 - (super.field10 << 12) < 0) {
                        if (var88 < 0) {
                            int var91 = (class1.field16 - 1 - var88) / class1.field16;
                            var90 += var91;
                            var88 += class1.field16 * var91;
                            var87 += var91;
                        }
                        int var92;
                        if ((var92 = (var88 + 1 - (super.field32 << 12) - class1.field16) / class1.field16) > var90) {
                            var90 = var92;
                        }
                        int var93 = arg0[var86] - arg2;
                        int var94 = -arg1[var86];
                        int var95 = var93 - (var87 - class1.field29);
                        if (var95 > 0) {
                            var87 += var95;
                            var90 += var95;
                            var88 += class1.field16 * var95;
                            var89 += class1.field24 * var95;
                        } else {
                            var94 -= var95;
                        }
                        if (var90 < var94) {
                            var90 = var94;
                        }
                        while (var90 < 0) {
                            int var96 = this.field6691[(var88 >> 12) + (var89 >> 12) * super.field32];
                            if (var96 != 0) {
                                var5[var87++] = var96;
                            } else {
                                ++var87;
                            }
                            var88 += class1.field16;
                            ++var90;
                        }
                    }
                }
                ++var85;
                class1.field8 += class1.field12;
                class1.field27 += class1.field4;
                class1.field29 += class1.field19;
            }
        } else if (class1.field24 < 0) {
            int var97 = class1.field5;
            while (var97 < 0) {
                int var98 = arg3 + var97;
                if (var98 >= 0) {
                    if (var98 >= arg0.length) {
                        return;
                    }
                    int var99 = class1.field29;
                    int var100 = class1.field8 + class1.field23;
                    int var101 = class1.field28 + class1.field27;
                    int var102 = class1.field21;
                    if (var100 < 0) {
                        int var103 = (class1.field16 - 1 - var100) / class1.field16;
                        var102 += var103;
                        var100 += class1.field16 * var103;
                        var101 += class1.field24 * var103;
                        var99 += var103;
                    }
                    int var104;
                    if ((var104 = (var100 + 1 - (super.field32 << 12) - class1.field16) / class1.field16) > var102) {
                        var102 = var104;
                    }
                    int var105;
                    if ((var105 = var101 - (super.field10 << 12)) >= 0) {
                        int var106 = (class1.field24 - var105) / class1.field24;
                        var102 += var106;
                        var100 += class1.field16 * var106;
                        var101 += class1.field24 * var106;
                        var99 += var106;
                    }
                    int var107;
                    if ((var107 = (var101 - class1.field24) / class1.field24) > var102) {
                        var102 = var107;
                    }
                    int var108 = arg0[var98] - arg2;
                    int var109 = -arg1[var98];
                    int var110 = var108 - (var99 - class1.field29);
                    if (var110 > 0) {
                        var99 += var110;
                        var102 += var110;
                        var100 += class1.field16 * var110;
                        var101 += class1.field24 * var110;
                    } else {
                        var109 -= var110;
                    }
                    if (var102 < var109) {
                        var102 = var109;
                    }
                    while (var102 < 0) {
                        int var111 = this.field6691[(var100 >> 12) + (var101 >> 12) * super.field32];
                        if (var111 != 0) {
                            var5[var99++] = var111;
                        } else {
                            ++var99;
                        }
                        var100 += class1.field16;
                        var101 += class1.field24;
                        ++var102;
                    }
                }
                ++var97;
                class1.field8 += class1.field12;
                class1.field27 += class1.field4;
                class1.field29 += class1.field19;
            }
        } else {
            int var112 = class1.field5;
            while (var112 < 0) {
                int var113 = arg3 + var112;
                if (var113 >= 0) {
                    if (var113 >= arg0.length) {
                        return;
                    }
                    int var114 = class1.field29;
                    int var115 = class1.field8 + class1.field23;
                    int var116 = class1.field28 + class1.field27;
                    int var117 = class1.field21;
                    if (var115 < 0) {
                        int var118 = (class1.field16 - 1 - var115) / class1.field16;
                        var117 += var118;
                        var115 += class1.field16 * var118;
                        var116 += class1.field24 * var118;
                        var114 += var118;
                    }
                    int var119;
                    if ((var119 = (var115 + 1 - (super.field32 << 12) - class1.field16) / class1.field16) > var117) {
                        var117 = var119;
                    }
                    if (var116 < 0) {
                        int var120 = (class1.field24 - 1 - var116) / class1.field24;
                        var117 += var120;
                        var115 += class1.field16 * var120;
                        var116 += class1.field24 * var120;
                        var114 += var120;
                    }
                    int var121;
                    if ((var121 = (var116 + 1 - (super.field10 << 12) - class1.field24) / class1.field24) > var117) {
                        var117 = var121;
                    }
                    int var122 = arg0[var113] - arg2;
                    int var123 = -arg1[var113];
                    int var124 = var122 - (var114 - class1.field29);
                    if (var124 > 0) {
                        var114 += var124;
                        var117 += var124;
                        var115 += class1.field16 * var124;
                        var116 += class1.field24 * var124;
                    } else {
                        var123 -= var124;
                    }
                    if (var117 < var123) {
                        var117 = var123;
                    }
                    while (var117 < 0) {
                        int var125 = this.field6691[(var115 >> 12) + (var116 >> 12) * super.field32];
                        if (var125 != 0) {
                            var5[var114++] = var125;
                        } else {
                            ++var114;
                        }
                        var115 += class1.field16;
                        var116 += class1.field24;
                        ++var117;
                    }
                }
                ++var112;
                class1.field8 += class1.field12;
                class1.field27 += class1.field4;
                class1.field29 += class1.field19;
            }
        }
    }
}
