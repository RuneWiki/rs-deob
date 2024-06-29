import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class35 extends class289 {

    @OriginalMember(owner = "client!be", name = "H", descriptor = "[I")
    public int[] field533;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([I[III)V", line = 5)
    public final void method270(int[] arg0, int[] arg1, int arg2, int arg3) {
        int[] var5 = super.field4105.field5986;
        if (class289.field4084 == 0) {
            if (class289.field4095 == 0) {
                int var6 = class289.field4082;
                while (var6 < 0) {
                    int var7 = arg3 + var6;
                    if (var7 >= 0) {
                        if (var7 >= arg0.length) {
                            return;
                        }
                        int var8 = class289.field4077;
                        int var9 = class289.field4088;
                        int var10 = class289.field4104;
                        int var11 = class289.field4080;
                        if (var9 >= 0 && var10 >= 0 && var9 - (super.field4090 << 12) < 0 && var10 - (super.field4083 << 12) < 0) {
                            int var12 = arg0[var7] - arg2;
                            int var13 = -arg1[var7];
                            int var14 = var12 - (var8 - class289.field4077);
                            if (var14 > 0) {
                                var8 += var14;
                                var11 += var14;
                                var9 += class289.field4084 * var14;
                                var10 += class289.field4095 * var14;
                            } else {
                                var13 -= var14;
                            }
                            if (var11 < var13) {
                                var11 = var13;
                            }
                            while (var11 < 0) {
                                int var15 = this.field533[(var9 >> 12) + (var10 >> 12) * super.field4090];
                                int var16 = var15 >>> 24;
                                int var17 = 256 - var16;
                                int var18 = var5[var8];
                                var5[var8++] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                ++var11;
                            }
                        }
                    }
                    ++var6;
                    class289.field4077 += class289.field4101;
                }
            } else if (class289.field4095 < 0) {
                int var19 = class289.field4082;
                while (var19 < 0) {
                    int var20 = arg3 + var19;
                    if (var20 >= 0) {
                        if (var20 >= arg0.length) {
                            return;
                        }
                        int var21 = class289.field4077;
                        int var22 = class289.field4088;
                        int var23 = class289.field4104 + class289.field4078;
                        int var24 = class289.field4080;
                        if (var22 >= 0 && var22 - (super.field4090 << 12) < 0) {
                            int var25;
                            if ((var25 = var23 - (super.field4083 << 12)) >= 0) {
                                int var26 = (class289.field4095 - var25) / class289.field4095;
                                var24 += var26;
                                var23 += class289.field4095 * var26;
                                var21 += var26;
                            }
                            int var27;
                            if ((var27 = (var23 - class289.field4095) / class289.field4095) > var24) {
                                var24 = var27;
                            }
                            int var28 = arg0[var20] - arg2;
                            int var29 = -arg1[var20];
                            int var30 = var28 - (var21 - class289.field4077);
                            if (var30 > 0) {
                                var21 += var30;
                                var24 += var30;
                                var22 += class289.field4084 * var30;
                                var23 += class289.field4095 * var30;
                            } else {
                                var29 -= var30;
                            }
                            if (var24 < var29) {
                                var24 = var29;
                            }
                            while (var24 < 0) {
                                int var31 = this.field533[(var22 >> 12) + (var23 >> 12) * super.field4090];
                                int var32 = var31 >>> 24;
                                int var33 = 256 - var32;
                                int var34 = var5[var21];
                                var5[var21++] = ((var31 & 16711935) * var32 + (var34 & 16711935) * var33 & -16711936) + ((var31 & 65280) * var32 + (var34 & 65280) * var33 & 16711680) >> 8;
                                var23 += class289.field4095;
                                ++var24;
                            }
                        }
                    }
                    ++var19;
                    class289.field4088 += class289.field4106;
                    class289.field4077 += class289.field4101;
                }
            } else {
                int var35 = class289.field4082;
                while (var35 < 0) {
                    int var36 = arg3 + var35;
                    if (var36 >= 0) {
                        if (var36 >= arg0.length) {
                            return;
                        }
                        int var37 = class289.field4077;
                        int var38 = class289.field4088;
                        int var39 = class289.field4104 + class289.field4078;
                        int var40 = class289.field4080;
                        if (var38 >= 0 && var38 - (super.field4090 << 12) < 0) {
                            if (var39 < 0) {
                                int var41 = (class289.field4095 - 1 - var39) / class289.field4095;
                                var40 += var41;
                                var39 += class289.field4095 * var41;
                                var37 += var41;
                            }
                            int var42;
                            if ((var42 = (var39 + 1 - (super.field4083 << 12) - class289.field4095) / class289.field4095) > var40) {
                                var40 = var42;
                            }
                            int var43 = arg0[var36] - arg2;
                            int var44 = -arg1[var36];
                            int var45 = var43 - (var37 - class289.field4077);
                            if (var45 > 0) {
                                var37 += var45;
                                var40 += var45;
                                var38 += class289.field4084 * var45;
                                var39 += class289.field4095 * var45;
                            } else {
                                var44 -= var45;
                            }
                            if (var40 < var44) {
                                var40 = var44;
                            }
                            while (var40 < 0) {
                                int var46 = this.field533[(var38 >> 12) + (var39 >> 12) * super.field4090];
                                int var47 = var46 >>> 24;
                                int var48 = 256 - var47;
                                int var49 = var5[var37];
                                var5[var37++] = ((var46 & 16711935) * var47 + (var49 & 16711935) * var48 & -16711936) + ((var46 & 65280) * var47 + (var49 & 65280) * var48 & 16711680) >> 8;
                                var39 += class289.field4095;
                                ++var40;
                            }
                        }
                    }
                    ++var35;
                    class289.field4088 += class289.field4106;
                    class289.field4077 += class289.field4101;
                }
            }
        } else if (class289.field4084 < 0) {
            if (class289.field4095 == 0) {
                int var50 = class289.field4082;
                while (var50 < 0) {
                    int var51 = arg3 + var50;
                    if (var51 >= 0) {
                        if (var51 >= arg0.length) {
                            return;
                        }
                        int var52 = class289.field4077;
                        int var53 = class289.field4088 + class289.field4081;
                        int var54 = class289.field4104;
                        int var55 = class289.field4080;
                        if (var54 >= 0 && var54 - (super.field4083 << 12) < 0) {
                            int var56;
                            if ((var56 = var53 - (super.field4090 << 12)) >= 0) {
                                int var57 = (class289.field4084 - var56) / class289.field4084;
                                var55 += var57;
                                var53 += class289.field4084 * var57;
                                var52 += var57;
                            }
                            int var58;
                            if ((var58 = (var53 - class289.field4084) / class289.field4084) > var55) {
                                var55 = var58;
                            }
                            int var59 = arg0[var51] - arg2;
                            int var60 = -arg1[var51];
                            int var61 = var59 - (var52 - class289.field4077);
                            if (var61 > 0) {
                                var52 += var61;
                                var55 += var61;
                                var53 += class289.field4084 * var61;
                                var54 += class289.field4095 * var61;
                            } else {
                                var60 -= var61;
                            }
                            if (var55 < var60) {
                                var55 = var60;
                            }
                            while (var55 < 0) {
                                int var62 = this.field533[(var53 >> 12) + (var54 >> 12) * super.field4090];
                                int var63 = var62 >>> 24;
                                int var64 = 256 - var63;
                                int var65 = var5[var52];
                                var5[var52++] = ((var62 & 16711935) * var63 + (var65 & 16711935) * var64 & -16711936) + ((var62 & 65280) * var63 + (var65 & 65280) * var64 & 16711680) >> 8;
                                var53 += class289.field4084;
                                ++var55;
                            }
                        }
                    }
                    ++var50;
                    class289.field4104 += class289.field4096;
                    class289.field4077 += class289.field4101;
                }
            } else if (class289.field4095 < 0) {
                int var66 = class289.field4082;
                while (var66 < 0) {
                    int var67 = arg3 + var66;
                    if (var67 >= 0) {
                        if (var67 >= arg0.length) {
                            return;
                        }
                        int var68 = class289.field4077;
                        int var69 = class289.field4088 + class289.field4081;
                        int var70 = class289.field4104 + class289.field4078;
                        int var71 = class289.field4080;
                        int var72;
                        if ((var72 = var69 - (super.field4090 << 12)) >= 0) {
                            int var73 = (class289.field4084 - var72) / class289.field4084;
                            var71 += var73;
                            var69 += class289.field4084 * var73;
                            var70 += class289.field4095 * var73;
                            var68 += var73;
                        }
                        int var74;
                        if ((var74 = (var69 - class289.field4084) / class289.field4084) > var71) {
                            var71 = var74;
                        }
                        int var75;
                        if ((var75 = var70 - (super.field4083 << 12)) >= 0) {
                            int var76 = (class289.field4095 - var75) / class289.field4095;
                            var71 += var76;
                            var69 += class289.field4084 * var76;
                            var70 += class289.field4095 * var76;
                            var68 += var76;
                        }
                        int var77;
                        if ((var77 = (var70 - class289.field4095) / class289.field4095) > var71) {
                            var71 = var77;
                        }
                        int var78 = arg0[var67] - arg2;
                        int var79 = -arg1[var67];
                        int var80 = var78 - (var68 - class289.field4077);
                        if (var80 > 0) {
                            var68 += var80;
                            var71 += var80;
                            var69 += class289.field4084 * var80;
                            var70 += class289.field4095 * var80;
                        } else {
                            var79 -= var80;
                        }
                        if (var71 < var79) {
                            var71 = var79;
                        }
                        while (var71 < 0) {
                            int var81 = this.field533[(var69 >> 12) + (var70 >> 12) * super.field4090];
                            int var82 = var81 >>> 24;
                            int var83 = 256 - var82;
                            int var84 = var5[var68];
                            var5[var68++] = ((var81 & 16711935) * var82 + (var84 & 16711935) * var83 & -16711936) + ((var81 & 65280) * var82 + (var84 & 65280) * var83 & 16711680) >> 8;
                            var69 += class289.field4084;
                            var70 += class289.field4095;
                            ++var71;
                        }
                    }
                    ++var66;
                    class289.field4088 += class289.field4106;
                    class289.field4104 += class289.field4096;
                    class289.field4077 += class289.field4101;
                }
            } else {
                int var85 = class289.field4082;
                while (var85 < 0) {
                    int var86 = arg3 + var85;
                    if (var86 >= 0) {
                        if (var86 >= arg0.length) {
                            return;
                        }
                        int var87 = class289.field4077;
                        int var88 = class289.field4088 + class289.field4081;
                        int var89 = class289.field4104 + class289.field4078;
                        int var90 = class289.field4080;
                        int var91;
                        if ((var91 = var88 - (super.field4090 << 12)) >= 0) {
                            int var92 = (class289.field4084 - var91) / class289.field4084;
                            var90 += var92;
                            var88 += class289.field4084 * var92;
                            var89 += class289.field4095 * var92;
                            var87 += var92;
                        }
                        int var93;
                        if ((var93 = (var88 - class289.field4084) / class289.field4084) > var90) {
                            var90 = var93;
                        }
                        if (var89 < 0) {
                            int var94 = (class289.field4095 - 1 - var89) / class289.field4095;
                            var90 += var94;
                            var88 += class289.field4084 * var94;
                            var89 += class289.field4095 * var94;
                            var87 += var94;
                        }
                        int var95;
                        if ((var95 = (var89 + 1 - (super.field4083 << 12) - class289.field4095) / class289.field4095) > var90) {
                            var90 = var95;
                        }
                        int var96 = arg0[var86] - arg2;
                        int var97 = -arg1[var86];
                        int var98 = var96 - (var87 - class289.field4077);
                        if (var98 > 0) {
                            var87 += var98;
                            var90 += var98;
                            var88 += class289.field4084 * var98;
                            var89 += class289.field4095 * var98;
                        } else {
                            var97 -= var98;
                        }
                        if (var90 < var97) {
                            var90 = var97;
                        }
                        while (var90 < 0) {
                            int var99 = this.field533[(var88 >> 12) + (var89 >> 12) * super.field4090];
                            int var100 = var99 >>> 24;
                            int var101 = 256 - var100;
                            int var102 = var5[var87];
                            var5[var87++] = ((var99 & 16711935) * var100 + (var102 & 16711935) * var101 & -16711936) + ((var99 & 65280) * var100 + (var102 & 65280) * var101 & 16711680) >> 8;
                            var88 += class289.field4084;
                            var89 += class289.field4095;
                            ++var90;
                        }
                    }
                    ++var85;
                    class289.field4088 += class289.field4106;
                    class289.field4104 += class289.field4096;
                    class289.field4077 += class289.field4101;
                }
            }
        } else if (class289.field4095 == 0) {
            int var103 = class289.field4082;
            while (var103 < 0) {
                int var104 = arg3 + var103;
                if (var104 >= 0) {
                    if (var104 >= arg0.length) {
                        return;
                    }
                    int var105 = class289.field4077;
                    int var106 = class289.field4088 + class289.field4081;
                    int var107 = class289.field4104;
                    int var108 = class289.field4080;
                    if (var107 >= 0 && var107 - (super.field4083 << 12) < 0) {
                        if (var106 < 0) {
                            int var109 = (class289.field4084 - 1 - var106) / class289.field4084;
                            var108 += var109;
                            var106 += class289.field4084 * var109;
                            var105 += var109;
                        }
                        int var110;
                        if ((var110 = (var106 + 1 - (super.field4090 << 12) - class289.field4084) / class289.field4084) > var108) {
                            var108 = var110;
                        }
                        int var111 = arg0[var104] - arg2;
                        int var112 = -arg1[var104];
                        int var113 = var111 - (var105 - class289.field4077);
                        if (var113 > 0) {
                            var105 += var113;
                            var108 += var113;
                            var106 += class289.field4084 * var113;
                            var107 += class289.field4095 * var113;
                        } else {
                            var112 -= var113;
                        }
                        if (var108 < var112) {
                            var108 = var112;
                        }
                        while (var108 < 0) {
                            int var114 = this.field533[(var106 >> 12) + (var107 >> 12) * super.field4090];
                            int var115 = var114 >>> 24;
                            int var116 = 256 - var115;
                            int var117 = var5[var105];
                            var5[var105++] = ((var114 & 16711935) * var115 + (var117 & 16711935) * var116 & -16711936) + ((var114 & 65280) * var115 + (var117 & 65280) * var116 & 16711680) >> 8;
                            var106 += class289.field4084;
                            ++var108;
                        }
                    }
                }
                ++var103;
                class289.field4088 += class289.field4106;
                class289.field4104 += class289.field4096;
                class289.field4077 += class289.field4101;
            }
        } else if (class289.field4095 < 0) {
            int var118 = class289.field4082;
            while (var118 < 0) {
                int var119 = arg3 + var118;
                if (var119 >= 0) {
                    if (var119 >= arg0.length) {
                        return;
                    }
                    int var120 = class289.field4077;
                    int var121 = class289.field4088 + class289.field4081;
                    int var122 = class289.field4104 + class289.field4078;
                    int var123 = class289.field4080;
                    if (var121 < 0) {
                        int var124 = (class289.field4084 - 1 - var121) / class289.field4084;
                        var123 += var124;
                        var121 += class289.field4084 * var124;
                        var122 += class289.field4095 * var124;
                        var120 += var124;
                    }
                    int var125;
                    if ((var125 = (var121 + 1 - (super.field4090 << 12) - class289.field4084) / class289.field4084) > var123) {
                        var123 = var125;
                    }
                    int var126;
                    if ((var126 = var122 - (super.field4083 << 12)) >= 0) {
                        int var127 = (class289.field4095 - var126) / class289.field4095;
                        var123 += var127;
                        var121 += class289.field4084 * var127;
                        var122 += class289.field4095 * var127;
                        var120 += var127;
                    }
                    int var128;
                    if ((var128 = (var122 - class289.field4095) / class289.field4095) > var123) {
                        var123 = var128;
                    }
                    int var129 = arg0[var119] - arg2;
                    int var130 = -arg1[var119];
                    int var131 = var129 - (var120 - class289.field4077);
                    if (var131 > 0) {
                        var120 += var131;
                        var123 += var131;
                        var121 += class289.field4084 * var131;
                        var122 += class289.field4095 * var131;
                    } else {
                        var130 -= var131;
                    }
                    if (var123 < var130) {
                        var123 = var130;
                    }
                    while (var123 < 0) {
                        int var132 = this.field533[(var121 >> 12) + (var122 >> 12) * super.field4090];
                        int var133 = var132 >>> 24;
                        int var134 = 256 - var133;
                        int var135 = var5[var120];
                        var5[var120++] = ((var132 & 16711935) * var133 + (var135 & 16711935) * var134 & -16711936) + ((var132 & 65280) * var133 + (var135 & 65280) * var134 & 16711680) >> 8;
                        var121 += class289.field4084;
                        var122 += class289.field4095;
                        ++var123;
                    }
                }
                ++var118;
                class289.field4088 += class289.field4106;
                class289.field4104 += class289.field4096;
                class289.field4077 += class289.field4101;
            }
        } else {
            int var136 = class289.field4082;
            while (var136 < 0) {
                int var137 = arg3 + var136;
                if (var137 >= 0) {
                    if (var137 >= arg0.length) {
                        return;
                    }
                    int var138 = class289.field4077;
                    int var139 = class289.field4088 + class289.field4081;
                    int var140 = class289.field4104 + class289.field4078;
                    int var141 = class289.field4080;
                    if (var139 < 0) {
                        int var142 = (class289.field4084 - 1 - var139) / class289.field4084;
                        var141 += var142;
                        var139 += class289.field4084 * var142;
                        var140 += class289.field4095 * var142;
                        var138 += var142;
                    }
                    int var143;
                    if ((var143 = (var139 + 1 - (super.field4090 << 12) - class289.field4084) / class289.field4084) > var141) {
                        var141 = var143;
                    }
                    if (var140 < 0) {
                        int var144 = (class289.field4095 - 1 - var140) / class289.field4095;
                        var141 += var144;
                        var139 += class289.field4084 * var144;
                        var140 += class289.field4095 * var144;
                        var138 += var144;
                    }
                    int var145;
                    if ((var145 = (var140 + 1 - (super.field4083 << 12) - class289.field4095) / class289.field4095) > var141) {
                        var141 = var145;
                    }
                    int var146 = arg0[var137] - arg2;
                    int var147 = -arg1[var137];
                    int var148 = var146 - (var138 - class289.field4077);
                    if (var148 > 0) {
                        var138 += var148;
                        var141 += var148;
                        var139 += class289.field4084 * var148;
                        var140 += class289.field4095 * var148;
                    } else {
                        var147 -= var148;
                    }
                    if (var141 < var147) {
                        var141 = var147;
                    }
                    while (var141 < 0) {
                        int var149 = this.field533[(var139 >> 12) + (var140 >> 12) * super.field4090];
                        int var150 = var149 >>> 24;
                        int var151 = 256 - var150;
                        int var152 = var5[var138];
                        var5[var138++] = ((var149 & 16711935) * var150 + (var152 & 16711935) * var151 & -16711936) + ((var149 & 65280) * var150 + (var152 & 65280) * var151 & 16711680) >> 8;
                        var139 += class289.field4084;
                        var140 += class289.field4095;
                        ++var141;
                    }
                }
                ++var136;
                class289.field4088 += class289.field4106;
                class289.field4104 += class289.field4096;
                class289.field4077 += class289.field4101;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lqe;[IIIII)V", line = 767)
    public class35(class437 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg4, arg5);
        this.field533 = new int[arg4 * arg5];
        int var7 = arg3 - super.field4090;
        int var8 = 0;
        for (int var9 = 0; var9 < arg5; ++var9) {
            for (int var10 = 0; var10 < arg4; ++var10) {
                this.field533[var8++] = arg1[arg2++];
            }
            arg2 += var7;
        }
    }

    @OriginalMember(owner = "client!be", name = "I", descriptor = "(IIIII)V", line = 792)
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (super.field4105.method2482()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field4105.field5995;
            int var7 = super.field4099 + arg0;
            int var8 = super.field4087 + arg1;
            int var9 = var6 * var8 + var7;
            int var10 = 0;
            int var11 = super.field4083;
            int var12 = super.field4090;
            int var13 = var6 - var12;
            int var14 = 0;
            if (var8 < super.field4105.field5985) {
                int var15 = super.field4105.field5985 - var8;
                var11 -= var15;
                var8 = super.field4105.field5985;
                var10 += var12 * var15;
                var9 += var6 * var15;
            }
            if (var8 + var11 > super.field4105.field6001) {
                var11 -= var8 + var11 - super.field4105.field6001;
            }
            if (var7 < super.field4105.field5999) {
                int var16 = super.field4105.field5999 - var7;
                var12 -= var16;
                var7 = super.field4105.field5999;
                var10 += var16;
                var9 += var16;
                var14 += var16;
                var13 += var16;
            }
            if (var7 + var12 > super.field4105.field6014) {
                int var17 = var7 + var12 - super.field4105.field6014;
                var12 -= var17;
                var14 += var17;
                var13 += var17;
            }
            if (var12 > 0 && var11 > 0) {
                int[] var18 = super.field4105.field5986;
                if (arg4 == 0) {
                    if (arg2 == 1) {
                        for (int var19 = -var11; var19 < 0; ++var19) {
                            int var20 = var9 + var12 - 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field533[var10++];
                                var18[var9++] = this.field533[var10++];
                                var18[var9++] = this.field533[var10++];
                                var18[var9++] = this.field533[var10++];
                            }
                            var20 += 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field533[var10++];
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
                                int var26 = this.field533[var10++];
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
                                int var32 = this.field533[var10++];
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
                                int var43 = this.field533[var10++];
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
                                int var48 = this.field533[var10++];
                                int var49 = var48 >>> 24;
                                int var50 = 256 - var49;
                                int var51 = var18[var9];
                                var18[var9++] = (((var48 & 16711935) * var49 + (var51 & 16711935) * var50 & -16711936) >> 8) + (((var48 & -16711936) >>> 8) * var49 + ((var51 & -16711936) >>> 8) * var50 & -16711936);
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 == 0) {
                        if ((arg3 & 16777215) == 16777215) {
                            for (int var52 = -var11; var52 < 0; ++var52) {
                                for (int var53 = -var12; var53 < 0; ++var53) {
                                    int var54 = this.field533[var10++];
                                    int var55 = (arg3 >>> 24) * (var54 >>> 24) >> 8;
                                    int var56 = 256 - var55;
                                    int var57 = var18[var9];
                                    var18[var9++] = ((var54 & 16711935) * var55 + (var57 & 16711935) * var56 & -16711936) + ((var54 & 65280) * var55 + (var57 & 65280) * var56 & 16711680) >> 8;
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        } else {
                            int var58 = (arg3 & 16711680) >> 16;
                            int var59 = (arg3 & 65280) >> 8;
                            int var60 = arg3 & 255;
                            for (int var61 = -var11; var61 < 0; ++var61) {
                                for (int var62 = -var12; var62 < 0; ++var62) {
                                    int var63 = this.field533[var10++];
                                    int var64 = (arg3 >>> 24) * (var63 >>> 24) >> 8;
                                    int var65 = 256 - var64;
                                    if (var64 != 255) {
                                        int var66 = (var63 & 16711680) * var58 & -16777216;
                                        int var67 = (var63 & 65280) * var59 & 16711680;
                                        int var68 = (var63 & 255) * var60 & 65280;
                                        int var69 = (var66 | var67 | var68) >>> 8;
                                        int var70 = var18[var9];
                                        var18[var9++] = ((var69 & 16711935) * var64 + (var70 & 16711935) * var65 & -16711936) + ((var69 & 65280) * var64 + (var70 & 65280) * var65 & 16711680) >> 8;
                                    } else {
                                        int var71 = (var63 & 16711680) * var58 & -16777216;
                                        int var72 = (var63 & 65280) * var59 & 16711680;
                                        int var73 = (var63 & 255) * var60 & 65280;
                                        var18[var9++] = (var71 | var72 | var73) >>> 8;
                                    }
                                }
                                var9 += var13;
                                var10 += var14;
                            }
                        }
                    } else if (arg2 == 3) {
                        for (int var74 = -var11; var74 < 0; ++var74) {
                            for (int var75 = -var12; var75 < 0; ++var75) {
                                int var76 = this.field533[var10++];
                                int var77 = arg3 + var76;
                                int var78 = (arg3 & 16711935) + (var76 & 16711935);
                                int var79 = (var77 - var78 & 65536) + (var78 & 16777472);
                                int var80 = var77 - var79 | var79 - (var79 >>> 8);
                                int var81 = (arg3 >>> 24) * (var80 >>> 24) >> 8;
                                int var82 = 256 - var81;
                                if (var81 != 255) {
                                    int var84 = var18[var9];
                                    var80 = ((var80 & 16711935) * var81 + (var84 & 16711935) * var82 & -16711936) + ((var80 & 65280) * var81 + (var84 & 65280) * var82 & 16711680) >> 8;
                                }
                                var18[var9++] = var80;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    } else if (arg2 != 2) {
                        throw new IllegalArgumentException();
                    } else {
                        int var85 = arg3 >>> 24;
                        int var86 = 256 - var85;
                        int var87 = (arg3 & 16711935) * var86 & -16711936;
                        int var88 = (arg3 & 65280) * var86 & 16711680;
                        int var89 = (var87 | var88) >>> 8;
                        for (int var90 = -var11; var90 < 0; ++var90) {
                            for (int var91 = -var12; var91 < 0; ++var91) {
                                int var92 = this.field533[var10++];
                                int var93 = var92 >>> 24;
                                int var94 = 256 - var93;
                                int var95 = (var92 & 16711935) * var85 & -16711936;
                                int var96 = (var92 & 65280) * var85 & 16711680;
                                int var97 = ((var95 | var96) >>> 8) + var89;
                                int var98 = var18[var9];
                                var18[var9++] = ((var97 & 16711935) * var93 + (var98 & 16711935) * var94 & -16711936) + ((var97 & 65280) * var93 + (var98 & 65280) * var94 & 16711680) >> 8;
                            }
                            var9 += var13;
                            var10 += var14;
                        }
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else if (arg2 == 1) {
                    for (int var99 = -var11; var99 < 0; ++var99) {
                        for (int var100 = -var12; var100 < 0; ++var100) {
                            int var101 = this.field533[var10++];
                            if (var101 != 0) {
                                int var102 = var18[var9];
                                int var103 = var101 + var102;
                                int var104 = (var101 & 16711935) + (var102 & 16711935);
                                int var105 = (var103 - var104 & 65536) + (var104 & 16777472);
                                var18[var9++] = var103 - var105 | var105 - (var105 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 == 0) {
                    int var106 = (arg3 & 16711680) >> 16;
                    int var107 = (arg3 & 65280) >> 8;
                    int var108 = arg3 & 255;
                    for (int var109 = -var11; var109 < 0; ++var109) {
                        for (int var110 = -var12; var110 < 0; ++var110) {
                            int var111 = this.field533[var10++];
                            if (var111 != 0) {
                                int var112 = (var111 & 16711680) * var106 & -16777216;
                                int var113 = (var111 & 65280) * var107 & 16711680;
                                int var114 = (var111 & 255) * var108 & 65280;
                                int var115 = (var112 | var113 | var114) >>> 8;
                                int var116 = var18[var9];
                                int var117 = var115 + var116;
                                int var118 = (var115 & 16711935) + (var116 & 16711935);
                                int var119 = (var117 - var118 & 65536) + (var118 & 16777472);
                                var18[var9++] = var117 - var119 | var119 - (var119 >>> 8);
                            } else {
                                ++var9;
                            }
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 == 3) {
                    for (int var120 = -var11; var120 < 0; ++var120) {
                        for (int var121 = -var12; var121 < 0; ++var121) {
                            int var122 = this.field533[var10++];
                            int var123 = arg3 + var122;
                            int var124 = (arg3 & 16711935) + (var122 & 16711935);
                            int var125 = (var123 - var124 & 65536) + (var124 & 16777472);
                            int var126 = var123 - var125 | var125 - (var125 >>> 8);
                            int var127 = var18[var9];
                            int var128 = var126 + var127;
                            int var129 = (var126 & 16711935) + (var127 & 16711935);
                            int var130 = (var128 - var129 & 65536) + (var129 & 16777472);
                            var18[var9++] = var128 - var130 | var130 - (var130 >>> 8);
                        }
                        var9 += var13;
                        var10 += var14;
                    }
                } else if (arg2 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var131 = arg3 >>> 24;
                    int var132 = 256 - var131;
                    int var133 = (arg3 & 16711935) * var132 & -16711936;
                    int var134 = (arg3 & 65280) * var132 & 16711680;
                    int var135 = (var133 | var134) >>> 8;
                    for (int var136 = -var11; var136 < 0; ++var136) {
                        for (int var137 = -var12; var137 < 0; ++var137) {
                            int var138 = this.field533[var10++];
                            if (var138 != 0) {
                                int var139 = (var138 & 16711935) * var131 & -16711936;
                                int var140 = (var138 & 65280) * var131 & 16711680;
                                int var141 = ((var139 | var140) >>> 8) + var135;
                                int var142 = var18[var9];
                                int var143 = var141 + var142;
                                int var144 = (var141 & 16711935) + (var142 & 16711935);
                                int var145 = (var143 - var144 & 65536) + (var144 & 16777472);
                                var18[var9++] = var143 - var145 | var145 - (var145 >>> 8);
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

    @OriginalMember(owner = "client!be", name = "t", descriptor = "(III)V", line = 1409)
    public final void method272(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int[] var4 = super.field4105.field5986;
            for (int var5 = 0; var5 < super.field4083; ++var5) {
                int var6 = super.field4090 * var5;
                int var7 = (arg1 + var5) * super.field4105.field5995 + arg0;
                for (int var8 = 0; var8 < super.field4090; ++var8) {
                    this.field533[var6 + var8] = this.field533[var6 + var8] & 16777215 | var4[var7 + var8] << 8 & -16777216;
                }
            }
        } else if (arg2 == 1) {
            int[] var9 = super.field4105.field5986;
            for (int var10 = 0; var10 < super.field4083; ++var10) {
                int var11 = super.field4090 * var10;
                int var12 = (arg1 + var10) * super.field4105.field5995 + arg0;
                for (int var13 = 0; var13 < super.field4090; ++var13) {
                    this.field533[var11 + var13] = this.field533[var11 + var13] & 16777215 | var9[var12 + var13] << 16 & -16777216;
                }
            }
        } else if (arg2 == 2) {
            int[] var14 = super.field4105.field5986;
            for (int var15 = 0; var15 < super.field4083; ++var15) {
                int var16 = super.field4090 * var15;
                int var17 = (arg1 + var15) * super.field4105.field5995 + arg0;
                for (int var18 = 0; var18 < super.field4090; ++var18) {
                    this.field533[var16 + var18] = this.field533[var16 + var18] & 16777215 | var14[var17 + var18] << 24 & -16777216;
                }
            }
        } else {
            if (arg2 == 3) {
                int[] var19 = super.field4105.field5986;
                for (int var20 = 0; var20 < super.field4083; ++var20) {
                    int var21 = super.field4090 * var20;
                    int var22 = (arg1 + var20) * super.field4105.field5995 + arg0;
                    for (int var23 = 0; var23 < super.field4090; ++var23) {
                        this.field533[var21 + var23] = this.field533[var21 + var23] & 16777215 | (var19[var22 + var23] != 0 ? -16777216 : 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lqe;II)V", line = 1522)
    public class35(class437 arg0, int arg1, int arg2) {
        super(arg0, arg1, arg2);
        this.field533 = new int[arg1 * arg2];
    }

    @OriginalMember(owner = "client!be", name = "GA", descriptor = "(IIIIII)V", line = 1527)
    public final void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int[] var7 = super.field4105.field5986;
        for (int var8 = 0; var8 < arg3; ++var8) {
            int var9 = (arg1 + var8) * arg2 + arg0;
            int var10 = (arg5 + var8) * arg2 + arg4;
            for (int var11 = 0; var11 < arg2; ++var11) {
                this.field533[var9 + var11] = var7[var10 + var11] & 16777215;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "KA", descriptor = "(IIIIIII)V", line = 1551)
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (super.field4105.method2482()) {
            throw new IllegalStateException();
        } else if (arg2 > 0 && arg3 > 0) {
            int var8 = 0;
            int var9 = 0;
            int var10 = super.field4105.field5995;
            int var11 = super.field4099 + super.field4090 + super.field4091;
            int var12 = super.field4087 + super.field4083 + super.field4102;
            int var13 = (var11 << 16) / arg2;
            int var14 = (var12 << 16) / arg3;
            if (super.field4099 > 0) {
                int var15 = ((super.field4099 << 16) + var13 - 1) / var13;
                arg0 += var15;
                var8 += var13 * var15 - (super.field4099 << 16);
            }
            if (super.field4087 > 0) {
                int var16 = ((super.field4087 << 16) + var14 - 1) / var14;
                arg1 += var16;
                var9 += var14 * var16 - (super.field4087 << 16);
            }
            if (super.field4090 < var11) {
                arg2 = ((super.field4090 << 16) - var8 + var13 - 1) / var13;
            }
            if (super.field4083 < var12) {
                arg3 = ((super.field4083 << 16) - var9 + var14 - 1) / var14;
            }
            int var17 = arg1 * var10 + arg0;
            int var18 = var10 - arg2;
            if (arg1 + arg3 > super.field4105.field6001) {
                arg3 -= arg1 + arg3 - super.field4105.field6001;
            }
            if (arg1 < super.field4105.field5985) {
                int var19 = super.field4105.field5985 - arg1;
                arg3 -= var19;
                var17 += var10 * var19;
                var9 += var14 * var19;
            }
            if (arg0 + arg2 > super.field4105.field6014) {
                int var20 = arg0 + arg2 - super.field4105.field6014;
                arg2 -= var20;
                var18 += var20;
            }
            if (arg0 < super.field4105.field5999) {
                int var21 = super.field4105.field5999 - arg0;
                arg2 -= var21;
                var17 += var21;
                var8 += var13 * var21;
                var18 += var21;
            }
            int[] var22 = super.field4105.field5986;
            if (arg6 == 0) {
                if (arg4 == 1) {
                    int var23 = var8;
                    for (int var24 = -arg3; var24 < 0; ++var24) {
                        int var25 = (var9 >> 16) * super.field4090;
                        for (int var26 = -arg2; var26 < 0; ++var26) {
                            var22[var17++] = this.field533[(var8 >> 16) + var25];
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
                        int var32 = (var9 >> 16) * super.field4090;
                        for (int var33 = -arg2; var33 < 0; ++var33) {
                            int var34 = this.field533[(var8 >> 16) + var32];
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
                        int var40 = (var9 >> 16) * super.field4090;
                        for (int var41 = -arg2; var41 < 0; ++var41) {
                            int var42 = this.field533[(var8 >> 16) + var40];
                            int var43 = arg5 + var42;
                            int var44 = (arg5 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            var22[var17++] = var43 - var45 | var45 - (var45 >>> 8);
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var38;
                        var17 += var18;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var46 = arg5 >>> 24;
                    int var47 = 256 - var46;
                    int var48 = (arg5 & 16711935) * var47 & -16711936;
                    int var49 = (arg5 & 65280) * var47 & 16711680;
                    int var50 = (var48 | var49) >>> 8;
                    int var51 = var8;
                    for (int var52 = -arg3; var52 < 0; ++var52) {
                        int var53 = (var9 >> 16) * super.field4090;
                        for (int var54 = -arg2; var54 < 0; ++var54) {
                            int var55 = this.field533[(var8 >> 16) + var53];
                            int var56 = (var55 & 16711935) * var46 & -16711936;
                            int var57 = (var55 & 65280) * var46 & 16711680;
                            var22[var17++] = ((var56 | var57) >>> 8) + var50;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var51;
                        var17 += var18;
                    }
                }
            } else if (arg6 == 1) {
                if (arg4 == 1) {
                    int var58 = var8;
                    for (int var59 = -arg3; var59 < 0; ++var59) {
                        int var60 = (var9 >> 16) * super.field4090;
                        for (int var61 = -arg2; var61 < 0; ++var61) {
                            int var62 = this.field533[(var8 >> 16) + var60];
                            int var63 = var62 >>> 24;
                            int var64 = 256 - var63;
                            int var65 = var22[var17];
                            var22[var17++] = (((var62 & 16711935) * var63 + (var65 & 16711935) * var64 & -16711936) >> 8) + (((var62 & -16711936) >>> 8) * var63 + ((var65 & -16711936) >>> 8) * var64 & -16711936);
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var58;
                        var17 += var18;
                    }
                } else if (arg4 == 0) {
                    int var66 = var8;
                    if ((arg5 & 16777215) == 16777215) {
                        for (int var67 = -arg3; var67 < 0; ++var67) {
                            int var68 = (var9 >> 16) * super.field4090;
                            for (int var69 = -arg2; var69 < 0; ++var69) {
                                int var70 = this.field533[(var8 >> 16) + var68];
                                int var71 = (arg5 >>> 24) * (var70 >>> 24) >> 8;
                                int var72 = 256 - var71;
                                int var73 = var22[var17];
                                var22[var17++] = ((var70 & 16711935) * var71 + (var73 & 16711935) * var72 & -16711936) + ((var70 & 65280) * var71 + (var73 & 65280) * var72 & 16711680) >> 8;
                                var8 += var13;
                            }
                            var9 += var14;
                            var8 = var66;
                            var17 += var18;
                        }
                    } else {
                        int var74 = (arg5 & 16711680) >> 16;
                        int var75 = (arg5 & 65280) >> 8;
                        int var76 = arg5 & 255;
                        for (int var77 = -arg3; var77 < 0; ++var77) {
                            int var78 = (var9 >> 16) * super.field4090;
                            for (int var79 = -arg2; var79 < 0; ++var79) {
                                int var80 = this.field533[(var8 >> 16) + var78];
                                int var81 = (arg5 >>> 24) * (var80 >>> 24) >> 8;
                                int var82 = 256 - var81;
                                if (var81 != 255) {
                                    int var83 = (var80 & 16711680) * var74 & -16777216;
                                    int var84 = (var80 & 65280) * var75 & 16711680;
                                    int var85 = (var80 & 255) * var76 & 65280;
                                    int var86 = (var83 | var84 | var85) >>> 8;
                                    int var87 = var22[var17];
                                    var22[var17++] = ((var86 & 16711935) * var81 + (var87 & 16711935) * var82 & -16711936) + ((var86 & 65280) * var81 + (var87 & 65280) * var82 & 16711680) >> 8;
                                } else {
                                    int var88 = (var80 & 16711680) * var74 & -16777216;
                                    int var89 = (var80 & 65280) * var75 & 16711680;
                                    int var90 = (var80 & 255) * var76 & 65280;
                                    var22[var17++] = (var88 | var89 | var90) >>> 8;
                                }
                                var8 += var13;
                            }
                            var9 += var14;
                            var8 = var66;
                            var17 += var18;
                        }
                    }
                } else if (arg4 == 3) {
                    int var91 = var8;
                    for (int var92 = -arg3; var92 < 0; ++var92) {
                        int var93 = (var9 >> 16) * super.field4090;
                        for (int var94 = -arg2; var94 < 0; ++var94) {
                            int var95 = this.field533[(var8 >> 16) + var93];
                            int var96 = arg5 + var95;
                            int var97 = (arg5 & 16711935) + (var95 & 16711935);
                            int var98 = (var96 - var97 & 65536) + (var97 & 16777472);
                            int var99 = var96 - var98 | var98 - (var98 >>> 8);
                            int var100 = (arg5 >>> 24) * (var99 >>> 24) >> 8;
                            int var101 = 256 - var100;
                            if (var100 != 255) {
                                int var103 = var22[var17];
                                var99 = ((var99 & 16711935) * var100 + (var103 & 16711935) * var101 & -16711936) + ((var99 & 65280) * var100 + (var103 & 65280) * var101 & 16711680) >> 8;
                            }
                            var22[var17++] = var99;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var91;
                        var17 += var18;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var104 = arg5 >>> 24;
                    int var105 = 256 - var104;
                    int var106 = (arg5 & 16711935) * var105 & -16711936;
                    int var107 = (arg5 & 65280) * var105 & 16711680;
                    int var108 = (var106 | var107) >>> 8;
                    int var109 = var8;
                    for (int var110 = -arg3; var110 < 0; ++var110) {
                        int var111 = (var9 >> 16) * super.field4090;
                        for (int var112 = -arg2; var112 < 0; ++var112) {
                            int var113 = this.field533[(var8 >> 16) + var111];
                            int var114 = var113 >>> 24;
                            int var115 = 256 - var114;
                            int var116 = (var113 & 16711935) * var104 & -16711936;
                            int var117 = (var113 & 65280) * var104 & 16711680;
                            int var118 = ((var116 | var117) >>> 8) + var108;
                            int var119 = var22[var17];
                            var22[var17++] = ((var118 & 16711935) * var114 + (var119 & 16711935) * var115 & -16711936) + ((var118 & 65280) * var114 + (var119 & 65280) * var115 & 16711680) >> 8;
                            var8 += var13;
                        }
                        var9 += var14;
                        var8 = var109;
                        var17 += var18;
                    }
                }
            } else if (arg6 != 2) {
                throw new IllegalArgumentException();
            } else if (arg4 == 1) {
                int var120 = var8;
                for (int var121 = -arg3; var121 < 0; ++var121) {
                    int var122 = (var9 >> 16) * super.field4090;
                    for (int var123 = -arg2; var123 < 0; ++var123) {
                        int var124 = this.field533[(var8 >> 16) + var122];
                        if (var124 != 0) {
                            int var125 = var22[var17];
                            int var126 = var124 + var125;
                            int var127 = (var124 & 16711935) + (var125 & 16711935);
                            int var128 = (var126 - var127 & 65536) + (var127 & 16777472);
                            var22[var17++] = var126 - var128 | var128 - (var128 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var120;
                    var17 += var18;
                }
            } else if (arg4 == 0) {
                int var129 = var8;
                int var130 = (arg5 & 16711680) >> 16;
                int var131 = (arg5 & 65280) >> 8;
                int var132 = arg5 & 255;
                for (int var133 = -arg3; var133 < 0; ++var133) {
                    int var134 = (var9 >> 16) * super.field4090;
                    for (int var135 = -arg2; var135 < 0; ++var135) {
                        int var136 = this.field533[(var8 >> 16) + var134];
                        if (var136 != 0) {
                            int var137 = (var136 & 16711680) * var130 & -16777216;
                            int var138 = (var136 & 65280) * var131 & 16711680;
                            int var139 = (var136 & 255) * var132 & 65280;
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
                    var8 = var129;
                    var17 += var18;
                }
            } else if (arg4 == 3) {
                int var145 = var8;
                for (int var146 = -arg3; var146 < 0; ++var146) {
                    int var147 = (var9 >> 16) * super.field4090;
                    for (int var148 = -arg2; var148 < 0; ++var148) {
                        int var149 = this.field533[(var8 >> 16) + var147];
                        int var150 = arg5 + var149;
                        int var151 = (arg5 & 16711935) + (var149 & 16711935);
                        int var152 = (var150 - var151 & 65536) + (var151 & 16777472);
                        int var153 = var150 - var152 | var152 - (var152 >>> 8);
                        int var154 = var22[var17];
                        int var155 = var153 + var154;
                        int var156 = (var153 & 16711935) + (var154 & 16711935);
                        int var157 = (var155 - var156 & 65536) + (var156 & 16777472);
                        var22[var17++] = var155 - var157 | var157 - (var157 >>> 8);
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var145;
                    var17 += var18;
                }
            } else if (arg4 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var158 = arg5 >>> 24;
                int var159 = 256 - var158;
                int var160 = (arg5 & 16711935) * var159 & -16711936;
                int var161 = (arg5 & 65280) * var159 & 16711680;
                int var162 = (var160 | var161) >>> 8;
                int var163 = var8;
                for (int var164 = -arg3; var164 < 0; ++var164) {
                    int var165 = (var9 >> 16) * super.field4090;
                    for (int var166 = -arg2; var166 < 0; ++var166) {
                        int var167 = this.field533[(var8 >> 16) + var165];
                        if (var167 != 0) {
                            int var168 = (var167 & 16711935) * var158 & -16711936;
                            int var169 = (var167 & 65280) * var158 & 16711680;
                            int var170 = ((var168 | var169) >>> 8) + var162;
                            int var171 = var22[var17];
                            int var172 = var170 + var171;
                            int var173 = (var170 & 16711935) + (var171 & 16711935);
                            int var174 = (var172 - var173 & 65536) + (var173 & 16777472);
                            var22[var17++] = var172 - var174 | var174 - (var174 >>> 8);
                        } else {
                            ++var17;
                        }
                        var8 += var13;
                    }
                    var9 += var14;
                    var8 = var163;
                    var17 += var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V", line = 2258)
    public final void method275(int arg0, int arg1) {
        int[] var3 = super.field4105.field5986;
        if (class289.field4084 == 0) {
            if (class289.field4095 == 0) {
                int var4 = class289.field4082;
                while (var4 < 0) {
                    int var5 = class289.field4077;
                    int var6 = class289.field4088;
                    int var7 = class289.field4104;
                    int var8 = class289.field4080;
                    if (var6 >= 0 && var7 >= 0 && var6 - (super.field4090 << 12) < 0 && var7 - (super.field4083 << 12) < 0) {
                        while (var8 < 0) {
                            int var9 = (var6 >> 12) + (var7 >> 12) * super.field4090;
                            int var10 = var5++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var10] = this.field533[var9];
                                } else if (arg0 == 0) {
                                    int var14 = this.field533[var9++];
                                    int var15 = (var14 & 16711680) * class289.field4085 & -16777216;
                                    int var16 = (var14 & 65280) * class289.field4079 & 16711680;
                                    int var17 = (var14 & 255) * class289.field4086 & 65280;
                                    var3[var10] = (var15 | var16 | var17) >>> 8;
                                } else if (arg0 == 3) {
                                    int var18 = this.field533[var9++];
                                    int var19 = class289.field4107;
                                    int var20 = var18 + var19;
                                    int var21 = (var18 & 16711935) + (var19 & 16711935);
                                    int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                                    var3[var10] = var20 - var22 | var22 - (var22 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var23 = this.field533[var9];
                                    int var24 = (var23 & 16711935) * class289.field4097 & -16711936;
                                    int var25 = (var23 & 65280) * class289.field4097 & 16711680;
                                    var3[var10] = ((var24 | var25) >>> 8) + class289.field4089;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    int var26 = this.field533[var9];
                                    int var27 = var26 >>> 24;
                                    int var28 = 256 - var27;
                                    int var29 = var3[var10];
                                    var3[var10] = ((var26 & 16711935) * var27 + (var29 & 16711935) * var28 & -16711936) + ((var26 & 65280) * var27 + (var29 & 65280) * var28 & 16711680) >> 8;
                                } else if (arg0 == 0) {
                                    int var30 = this.field533[var9];
                                    int var31 = (var30 >>> 24) * class289.field4097 >> 8;
                                    int var32 = 256 - var31;
                                    if ((class289.field4107 & 16777215) == 16777215) {
                                        int var33 = var3[var10];
                                        var3[var10] = ((var30 & 16711935) * var31 + (var33 & 16711935) * var32 & -16711936) + ((var30 & 65280) * var31 + (var33 & 65280) * var32 & 16711680) >> 8;
                                    } else if (var31 != 255) {
                                        int var34 = (var30 & 16711680) * class289.field4085 & -16777216;
                                        int var35 = (var30 & 65280) * class289.field4079 & 16711680;
                                        int var36 = (var30 & 255) * class289.field4086 & 65280;
                                        int var37 = (var34 | var35 | var36) >>> 8;
                                        int var38 = var3[var10];
                                        var3[var10] = ((var37 & 16711935) * var31 + (var38 & 16711935) * var32 & -16711936) + ((var37 & 65280) * var31 + (var38 & 65280) * var32 & 16711680) >> 8;
                                    } else {
                                        int var39 = (var30 & 16711680) * class289.field4085 & -16777216;
                                        int var40 = (var30 & 65280) * class289.field4079 & 16711680;
                                        int var41 = (var30 & 255) * class289.field4086 & 65280;
                                        var3[var10] = (var39 | var40 | var41) >>> 8;
                                    }
                                } else if (arg0 == 3) {
                                    int var42 = this.field533[var9];
                                    int var43 = class289.field4107;
                                    int var44 = var42 + var43;
                                    int var45 = (var42 & 16711935) + (var43 & 16711935);
                                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                                    int var47 = var44 - var46 | var46 - (var46 >>> 8);
                                    int var48 = (var42 >>> 24) * class289.field4097 >> 8;
                                    int var49 = 256 - var48;
                                    if (var48 != 255) {
                                        int var51 = var3[var10];
                                        var47 = ((var47 & 16711935) * var48 + (var51 & 16711935) * var49 & -16711936) + ((var47 & 65280) * var48 + (var51 & 65280) * var49 & 16711680) >> 8;
                                    }
                                    var3[var10] = var47;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var52 = this.field533[var9];
                                    int var53 = var52 >>> 24;
                                    int var54 = 256 - var53;
                                    int var55 = (var52 & 16711935) * class289.field4097 & -16711936;
                                    int var56 = (var52 & 65280) * class289.field4097 & 16711680;
                                    int var57 = ((var55 | var56) >>> 8) + class289.field4089;
                                    int var58 = var3[var10];
                                    var3[var10] = ((var57 & 16711935) * var53 + (var58 & 16711935) * var54 & -16711936) + ((var57 & 65280) * var53 + (var58 & 65280) * var54 & 16711680) >> 8;
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    int var59 = this.field533[var9];
                                    int var60 = var3[var10];
                                    int var61 = var59 + var60;
                                    int var62 = (var59 & 16711935) + (var60 & 16711935);
                                    int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                                    var3[var10] = var61 - var63 | var63 - (var63 >>> 8);
                                } else if (arg0 == 0) {
                                    int var64 = this.field533[var9];
                                    int var65 = (var64 & 16711680) * class289.field4085 & -16777216;
                                    int var66 = (var64 & 65280) * class289.field4079 & 16711680;
                                    int var67 = (var64 & 255) * class289.field4086 & 65280;
                                    int var68 = (var65 | var66 | var67) >>> 8;
                                    int var69 = var3[var10];
                                    int var70 = var68 + var69;
                                    int var71 = (var68 & 16711935) + (var69 & 16711935);
                                    int var72 = (var70 - var71 & 65536) + (var71 & 16777472);
                                    var3[var10] = var70 - var72 | var72 - (var72 >>> 8);
                                } else if (arg0 == 3) {
                                    int var73 = this.field533[var9];
                                    int var74 = class289.field4107;
                                    int var75 = var73 + var74;
                                    int var76 = (var73 & 16711935) + (var74 & 16711935);
                                    int var77 = (var75 - var76 & 65536) + (var76 & 16777472);
                                    int var78 = var75 - var77 | var77 - (var77 >>> 8);
                                    int var79 = var3[var10];
                                    int var80 = var78 + var79;
                                    int var81 = (var78 & 16711935) + (var79 & 16711935);
                                    int var82 = (var80 - var81 & 65536) + (var81 & 16777472);
                                    var3[var10] = var80 - var82 | var82 - (var82 >>> 8);
                                } else if (arg0 == 2) {
                                    int var83 = this.field533[var9];
                                    int var84 = (var83 & 16711935) * class289.field4097 & -16711936;
                                    int var85 = (var83 & 65280) * class289.field4097 & 16711680;
                                    int var86 = ((var84 | var85) >>> 8) + class289.field4089;
                                    int var87 = var3[var10];
                                    int var88 = var86 + var87;
                                    int var89 = (var86 & 16711935) + (var87 & 16711935);
                                    int var90 = (var88 - var89 & 65536) + (var89 & 16777472);
                                    var3[var10] = var88 - var90 | var90 - (var90 >>> 8);
                                }
                            }
                            ++var8;
                        }
                    }
                    ++var4;
                    class289.field4077 += class289.field4101;
                }
            } else if (class289.field4095 < 0) {
                int var91 = class289.field4082;
                while (var91 < 0) {
                    int var92 = class289.field4077;
                    int var93 = class289.field4088;
                    int var94 = class289.field4104 + class289.field4078;
                    int var95 = class289.field4080;
                    if (var93 >= 0 && var93 - (super.field4090 << 12) < 0) {
                        int var96;
                        if ((var96 = var94 - (super.field4083 << 12)) >= 0) {
                            int var97 = (class289.field4095 - var96) / class289.field4095;
                            var95 += var97;
                            var94 += class289.field4095 * var97;
                            var92 += var97;
                        }
                        int var98;
                        if ((var98 = (var94 - class289.field4095) / class289.field4095) > var95) {
                            var95 = var98;
                        }
                        while (var95 < 0) {
                            int var99 = (var93 >> 12) + (var94 >> 12) * super.field4090;
                            int var100 = var92++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var100] = this.field533[var99];
                                } else if (arg0 == 0) {
                                    int var104 = this.field533[var99++];
                                    int var105 = (var104 & 16711680) * class289.field4085 & -16777216;
                                    int var106 = (var104 & 65280) * class289.field4079 & 16711680;
                                    int var107 = (var104 & 255) * class289.field4086 & 65280;
                                    var3[var100] = (var105 | var106 | var107) >>> 8;
                                } else if (arg0 == 3) {
                                    int var108 = this.field533[var99++];
                                    int var109 = class289.field4107;
                                    int var110 = var108 + var109;
                                    int var111 = (var108 & 16711935) + (var109 & 16711935);
                                    int var112 = (var110 - var111 & 65536) + (var111 & 16777472);
                                    var3[var100] = var110 - var112 | var112 - (var112 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var113 = this.field533[var99];
                                    int var114 = (var113 & 16711935) * class289.field4097 & -16711936;
                                    int var115 = (var113 & 65280) * class289.field4097 & 16711680;
                                    var3[var100] = ((var114 | var115) >>> 8) + class289.field4089;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    int var116 = this.field533[var99];
                                    int var117 = var116 >>> 24;
                                    int var118 = 256 - var117;
                                    int var119 = var3[var100];
                                    var3[var100] = ((var116 & 16711935) * var117 + (var119 & 16711935) * var118 & -16711936) + ((var116 & 65280) * var117 + (var119 & 65280) * var118 & 16711680) >> 8;
                                } else if (arg0 == 0) {
                                    int var120 = this.field533[var99];
                                    int var121 = (var120 >>> 24) * class289.field4097 >> 8;
                                    int var122 = 256 - var121;
                                    if ((class289.field4107 & 16777215) == 16777215) {
                                        int var123 = var3[var100];
                                        var3[var100] = ((var120 & 16711935) * var121 + (var123 & 16711935) * var122 & -16711936) + ((var120 & 65280) * var121 + (var123 & 65280) * var122 & 16711680) >> 8;
                                    } else if (var121 != 255) {
                                        int var124 = (var120 & 16711680) * class289.field4085 & -16777216;
                                        int var125 = (var120 & 65280) * class289.field4079 & 16711680;
                                        int var126 = (var120 & 255) * class289.field4086 & 65280;
                                        int var127 = (var124 | var125 | var126) >>> 8;
                                        int var128 = var3[var100];
                                        var3[var100] = ((var127 & 16711935) * var121 + (var128 & 16711935) * var122 & -16711936) + ((var127 & 65280) * var121 + (var128 & 65280) * var122 & 16711680) >> 8;
                                    } else {
                                        int var129 = (var120 & 16711680) * class289.field4085 & -16777216;
                                        int var130 = (var120 & 65280) * class289.field4079 & 16711680;
                                        int var131 = (var120 & 255) * class289.field4086 & 65280;
                                        var3[var100] = (var129 | var130 | var131) >>> 8;
                                    }
                                } else if (arg0 == 3) {
                                    int var132 = this.field533[var99];
                                    int var133 = class289.field4107;
                                    int var134 = var132 + var133;
                                    int var135 = (var132 & 16711935) + (var133 & 16711935);
                                    int var136 = (var134 - var135 & 65536) + (var135 & 16777472);
                                    int var137 = var134 - var136 | var136 - (var136 >>> 8);
                                    int var138 = (var132 >>> 24) * class289.field4097 >> 8;
                                    int var139 = 256 - var138;
                                    if (var138 != 255) {
                                        int var141 = var3[var100];
                                        var137 = ((var137 & 16711935) * var138 + (var141 & 16711935) * var139 & -16711936) + ((var137 & 65280) * var138 + (var141 & 65280) * var139 & 16711680) >> 8;
                                    }
                                    var3[var100] = var137;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var142 = this.field533[var99];
                                    int var143 = var142 >>> 24;
                                    int var144 = 256 - var143;
                                    int var145 = (var142 & 16711935) * class289.field4097 & -16711936;
                                    int var146 = (var142 & 65280) * class289.field4097 & 16711680;
                                    int var147 = ((var145 | var146) >>> 8) + class289.field4089;
                                    int var148 = var3[var100];
                                    var3[var100] = ((var147 & 16711935) * var143 + (var148 & 16711935) * var144 & -16711936) + ((var147 & 65280) * var143 + (var148 & 65280) * var144 & 16711680) >> 8;
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    int var149 = this.field533[var99];
                                    int var150 = var3[var100];
                                    int var151 = var149 + var150;
                                    int var152 = (var149 & 16711935) + (var150 & 16711935);
                                    int var153 = (var151 - var152 & 65536) + (var152 & 16777472);
                                    var3[var100] = var151 - var153 | var153 - (var153 >>> 8);
                                } else if (arg0 == 0) {
                                    int var154 = this.field533[var99];
                                    int var155 = (var154 & 16711680) * class289.field4085 & -16777216;
                                    int var156 = (var154 & 65280) * class289.field4079 & 16711680;
                                    int var157 = (var154 & 255) * class289.field4086 & 65280;
                                    int var158 = (var155 | var156 | var157) >>> 8;
                                    int var159 = var3[var100];
                                    int var160 = var158 + var159;
                                    int var161 = (var158 & 16711935) + (var159 & 16711935);
                                    int var162 = (var160 - var161 & 65536) + (var161 & 16777472);
                                    var3[var100] = var160 - var162 | var162 - (var162 >>> 8);
                                } else if (arg0 == 3) {
                                    int var163 = this.field533[var99];
                                    int var164 = class289.field4107;
                                    int var165 = var163 + var164;
                                    int var166 = (var163 & 16711935) + (var164 & 16711935);
                                    int var167 = (var165 - var166 & 65536) + (var166 & 16777472);
                                    int var168 = var165 - var167 | var167 - (var167 >>> 8);
                                    int var169 = var3[var100];
                                    int var170 = var168 + var169;
                                    int var171 = (var168 & 16711935) + (var169 & 16711935);
                                    int var172 = (var170 - var171 & 65536) + (var171 & 16777472);
                                    var3[var100] = var170 - var172 | var172 - (var172 >>> 8);
                                } else if (arg0 == 2) {
                                    int var173 = this.field533[var99];
                                    int var174 = (var173 & 16711935) * class289.field4097 & -16711936;
                                    int var175 = (var173 & 65280) * class289.field4097 & 16711680;
                                    int var176 = ((var174 | var175) >>> 8) + class289.field4089;
                                    int var177 = var3[var100];
                                    int var178 = var176 + var177;
                                    int var179 = (var176 & 16711935) + (var177 & 16711935);
                                    int var180 = (var178 - var179 & 65536) + (var179 & 16777472);
                                    var3[var100] = var178 - var180 | var180 - (var180 >>> 8);
                                }
                            }
                            var94 += class289.field4095;
                            ++var95;
                        }
                    }
                    ++var91;
                    class289.field4088 += class289.field4106;
                    class289.field4077 += class289.field4101;
                }
            } else {
                int var181 = class289.field4082;
                while (var181 < 0) {
                    int var182 = class289.field4077;
                    int var183 = class289.field4088;
                    int var184 = class289.field4104 + class289.field4078;
                    int var185 = class289.field4080;
                    if (var183 >= 0 && var183 - (super.field4090 << 12) < 0) {
                        if (var184 < 0) {
                            int var186 = (class289.field4095 - 1 - var184) / class289.field4095;
                            var185 += var186;
                            var184 += class289.field4095 * var186;
                            var182 += var186;
                        }
                        int var187;
                        if ((var187 = (var184 + 1 - (super.field4083 << 12) - class289.field4095) / class289.field4095) > var185) {
                            var185 = var187;
                        }
                        while (var185 < 0) {
                            int var188 = (var183 >> 12) + (var184 >> 12) * super.field4090;
                            int var189 = var182++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var189] = this.field533[var188];
                                } else if (arg0 == 0) {
                                    int var193 = this.field533[var188++];
                                    int var194 = (var193 & 16711680) * class289.field4085 & -16777216;
                                    int var195 = (var193 & 65280) * class289.field4079 & 16711680;
                                    int var196 = (var193 & 255) * class289.field4086 & 65280;
                                    var3[var189] = (var194 | var195 | var196) >>> 8;
                                } else if (arg0 == 3) {
                                    int var197 = this.field533[var188++];
                                    int var198 = class289.field4107;
                                    int var199 = var197 + var198;
                                    int var200 = (var197 & 16711935) + (var198 & 16711935);
                                    int var201 = (var199 - var200 & 65536) + (var200 & 16777472);
                                    var3[var189] = var199 - var201 | var201 - (var201 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var202 = this.field533[var188];
                                    int var203 = (var202 & 16711935) * class289.field4097 & -16711936;
                                    int var204 = (var202 & 65280) * class289.field4097 & 16711680;
                                    var3[var189] = ((var203 | var204) >>> 8) + class289.field4089;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    int var205 = this.field533[var188];
                                    int var206 = var205 >>> 24;
                                    int var207 = 256 - var206;
                                    int var208 = var3[var189];
                                    var3[var189] = ((var205 & 16711935) * var206 + (var208 & 16711935) * var207 & -16711936) + ((var205 & 65280) * var206 + (var208 & 65280) * var207 & 16711680) >> 8;
                                } else if (arg0 == 0) {
                                    int var209 = this.field533[var188];
                                    int var210 = (var209 >>> 24) * class289.field4097 >> 8;
                                    int var211 = 256 - var210;
                                    if ((class289.field4107 & 16777215) == 16777215) {
                                        int var212 = var3[var189];
                                        var3[var189] = ((var209 & 16711935) * var210 + (var212 & 16711935) * var211 & -16711936) + ((var209 & 65280) * var210 + (var212 & 65280) * var211 & 16711680) >> 8;
                                    } else if (var210 != 255) {
                                        int var213 = (var209 & 16711680) * class289.field4085 & -16777216;
                                        int var214 = (var209 & 65280) * class289.field4079 & 16711680;
                                        int var215 = (var209 & 255) * class289.field4086 & 65280;
                                        int var216 = (var213 | var214 | var215) >>> 8;
                                        int var217 = var3[var189];
                                        var3[var189] = ((var216 & 16711935) * var210 + (var217 & 16711935) * var211 & -16711936) + ((var216 & 65280) * var210 + (var217 & 65280) * var211 & 16711680) >> 8;
                                    } else {
                                        int var218 = (var209 & 16711680) * class289.field4085 & -16777216;
                                        int var219 = (var209 & 65280) * class289.field4079 & 16711680;
                                        int var220 = (var209 & 255) * class289.field4086 & 65280;
                                        var3[var189] = (var218 | var219 | var220) >>> 8;
                                    }
                                } else if (arg0 == 3) {
                                    int var221 = this.field533[var188];
                                    int var222 = class289.field4107;
                                    int var223 = var221 + var222;
                                    int var224 = (var221 & 16711935) + (var222 & 16711935);
                                    int var225 = (var223 - var224 & 65536) + (var224 & 16777472);
                                    int var226 = var223 - var225 | var225 - (var225 >>> 8);
                                    int var227 = (var221 >>> 24) * class289.field4097 >> 8;
                                    int var228 = 256 - var227;
                                    if (var227 != 255) {
                                        int var230 = var3[var189];
                                        var226 = ((var226 & 16711935) * var227 + (var230 & 16711935) * var228 & -16711936) + ((var226 & 65280) * var227 + (var230 & 65280) * var228 & 16711680) >> 8;
                                    }
                                    var3[var189] = var226;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var231 = this.field533[var188];
                                    int var232 = var231 >>> 24;
                                    int var233 = 256 - var232;
                                    int var234 = (var231 & 16711935) * class289.field4097 & -16711936;
                                    int var235 = (var231 & 65280) * class289.field4097 & 16711680;
                                    int var236 = ((var234 | var235) >>> 8) + class289.field4089;
                                    int var237 = var3[var189];
                                    var3[var189] = ((var236 & 16711935) * var232 + (var237 & 16711935) * var233 & -16711936) + ((var236 & 65280) * var232 + (var237 & 65280) * var233 & 16711680) >> 8;
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    int var238 = this.field533[var188];
                                    int var239 = var3[var189];
                                    int var240 = var238 + var239;
                                    int var241 = (var238 & 16711935) + (var239 & 16711935);
                                    int var242 = (var240 - var241 & 65536) + (var241 & 16777472);
                                    var3[var189] = var240 - var242 | var242 - (var242 >>> 8);
                                } else if (arg0 == 0) {
                                    int var243 = this.field533[var188];
                                    int var244 = (var243 & 16711680) * class289.field4085 & -16777216;
                                    int var245 = (var243 & 65280) * class289.field4079 & 16711680;
                                    int var246 = (var243 & 255) * class289.field4086 & 65280;
                                    int var247 = (var244 | var245 | var246) >>> 8;
                                    int var248 = var3[var189];
                                    int var249 = var247 + var248;
                                    int var250 = (var247 & 16711935) + (var248 & 16711935);
                                    int var251 = (var249 - var250 & 65536) + (var250 & 16777472);
                                    var3[var189] = var249 - var251 | var251 - (var251 >>> 8);
                                } else if (arg0 == 3) {
                                    int var252 = this.field533[var188];
                                    int var253 = class289.field4107;
                                    int var254 = var252 + var253;
                                    int var255 = (var252 & 16711935) + (var253 & 16711935);
                                    int var256 = (var254 - var255 & 65536) + (var255 & 16777472);
                                    int var257 = var254 - var256 | var256 - (var256 >>> 8);
                                    int var258 = var3[var189];
                                    int var259 = var257 + var258;
                                    int var260 = (var257 & 16711935) + (var258 & 16711935);
                                    int var261 = (var259 - var260 & 65536) + (var260 & 16777472);
                                    var3[var189] = var259 - var261 | var261 - (var261 >>> 8);
                                } else if (arg0 == 2) {
                                    int var262 = this.field533[var188];
                                    int var263 = (var262 & 16711935) * class289.field4097 & -16711936;
                                    int var264 = (var262 & 65280) * class289.field4097 & 16711680;
                                    int var265 = ((var263 | var264) >>> 8) + class289.field4089;
                                    int var266 = var3[var189];
                                    int var267 = var265 + var266;
                                    int var268 = (var265 & 16711935) + (var266 & 16711935);
                                    int var269 = (var267 - var268 & 65536) + (var268 & 16777472);
                                    var3[var189] = var267 - var269 | var269 - (var269 >>> 8);
                                }
                            }
                            var184 += class289.field4095;
                            ++var185;
                        }
                    }
                    ++var181;
                    class289.field4088 += class289.field4106;
                    class289.field4077 += class289.field4101;
                }
            }
        } else if (class289.field4084 < 0) {
            if (class289.field4095 == 0) {
                int var270 = class289.field4082;
                while (var270 < 0) {
                    int var271 = class289.field4077;
                    int var272 = class289.field4088 + class289.field4081;
                    int var273 = class289.field4104;
                    int var274 = class289.field4080;
                    if (var273 >= 0 && var273 - (super.field4083 << 12) < 0) {
                        int var275;
                        if ((var275 = var272 - (super.field4090 << 12)) >= 0) {
                            int var276 = (class289.field4084 - var275) / class289.field4084;
                            var274 += var276;
                            var272 += class289.field4084 * var276;
                            var271 += var276;
                        }
                        int var277;
                        if ((var277 = (var272 - class289.field4084) / class289.field4084) > var274) {
                            var274 = var277;
                        }
                        while (var274 < 0) {
                            int var278 = (var272 >> 12) + (var273 >> 12) * super.field4090;
                            int var279 = var271++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var279] = this.field533[var278];
                                } else if (arg0 == 0) {
                                    int var283 = this.field533[var278++];
                                    int var284 = (var283 & 16711680) * class289.field4085 & -16777216;
                                    int var285 = (var283 & 65280) * class289.field4079 & 16711680;
                                    int var286 = (var283 & 255) * class289.field4086 & 65280;
                                    var3[var279] = (var284 | var285 | var286) >>> 8;
                                } else if (arg0 == 3) {
                                    int var287 = this.field533[var278++];
                                    int var288 = class289.field4107;
                                    int var289 = var287 + var288;
                                    int var290 = (var287 & 16711935) + (var288 & 16711935);
                                    int var291 = (var289 - var290 & 65536) + (var290 & 16777472);
                                    var3[var279] = var289 - var291 | var291 - (var291 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var292 = this.field533[var278];
                                    int var293 = (var292 & 16711935) * class289.field4097 & -16711936;
                                    int var294 = (var292 & 65280) * class289.field4097 & 16711680;
                                    var3[var279] = ((var293 | var294) >>> 8) + class289.field4089;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    int var295 = this.field533[var278];
                                    int var296 = var295 >>> 24;
                                    int var297 = 256 - var296;
                                    int var298 = var3[var279];
                                    var3[var279] = ((var295 & 16711935) * var296 + (var298 & 16711935) * var297 & -16711936) + ((var295 & 65280) * var296 + (var298 & 65280) * var297 & 16711680) >> 8;
                                } else if (arg0 == 0) {
                                    int var299 = this.field533[var278];
                                    int var300 = (var299 >>> 24) * class289.field4097 >> 8;
                                    int var301 = 256 - var300;
                                    if ((class289.field4107 & 16777215) == 16777215) {
                                        int var302 = var3[var279];
                                        var3[var279] = ((var299 & 16711935) * var300 + (var302 & 16711935) * var301 & -16711936) + ((var299 & 65280) * var300 + (var302 & 65280) * var301 & 16711680) >> 8;
                                    } else if (var300 != 255) {
                                        int var303 = (var299 & 16711680) * class289.field4085 & -16777216;
                                        int var304 = (var299 & 65280) * class289.field4079 & 16711680;
                                        int var305 = (var299 & 255) * class289.field4086 & 65280;
                                        int var306 = (var303 | var304 | var305) >>> 8;
                                        int var307 = var3[var279];
                                        var3[var279] = ((var306 & 16711935) * var300 + (var307 & 16711935) * var301 & -16711936) + ((var306 & 65280) * var300 + (var307 & 65280) * var301 & 16711680) >> 8;
                                    } else {
                                        int var308 = (var299 & 16711680) * class289.field4085 & -16777216;
                                        int var309 = (var299 & 65280) * class289.field4079 & 16711680;
                                        int var310 = (var299 & 255) * class289.field4086 & 65280;
                                        var3[var279] = (var308 | var309 | var310) >>> 8;
                                    }
                                } else if (arg0 == 3) {
                                    int var311 = this.field533[var278];
                                    int var312 = class289.field4107;
                                    int var313 = var311 + var312;
                                    int var314 = (var311 & 16711935) + (var312 & 16711935);
                                    int var315 = (var313 - var314 & 65536) + (var314 & 16777472);
                                    int var316 = var313 - var315 | var315 - (var315 >>> 8);
                                    int var317 = (var311 >>> 24) * class289.field4097 >> 8;
                                    int var318 = 256 - var317;
                                    if (var317 != 255) {
                                        int var320 = var3[var279];
                                        var316 = ((var316 & 16711935) * var317 + (var320 & 16711935) * var318 & -16711936) + ((var316 & 65280) * var317 + (var320 & 65280) * var318 & 16711680) >> 8;
                                    }
                                    var3[var279] = var316;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var321 = this.field533[var278];
                                    int var322 = var321 >>> 24;
                                    int var323 = 256 - var322;
                                    int var324 = (var321 & 16711935) * class289.field4097 & -16711936;
                                    int var325 = (var321 & 65280) * class289.field4097 & 16711680;
                                    int var326 = ((var324 | var325) >>> 8) + class289.field4089;
                                    int var327 = var3[var279];
                                    var3[var279] = ((var326 & 16711935) * var322 + (var327 & 16711935) * var323 & -16711936) + ((var326 & 65280) * var322 + (var327 & 65280) * var323 & 16711680) >> 8;
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    int var328 = this.field533[var278];
                                    int var329 = var3[var279];
                                    int var330 = var328 + var329;
                                    int var331 = (var328 & 16711935) + (var329 & 16711935);
                                    int var332 = (var330 - var331 & 65536) + (var331 & 16777472);
                                    var3[var279] = var330 - var332 | var332 - (var332 >>> 8);
                                } else if (arg0 == 0) {
                                    int var333 = this.field533[var278];
                                    int var334 = (var333 & 16711680) * class289.field4085 & -16777216;
                                    int var335 = (var333 & 65280) * class289.field4079 & 16711680;
                                    int var336 = (var333 & 255) * class289.field4086 & 65280;
                                    int var337 = (var334 | var335 | var336) >>> 8;
                                    int var338 = var3[var279];
                                    int var339 = var337 + var338;
                                    int var340 = (var337 & 16711935) + (var338 & 16711935);
                                    int var341 = (var339 - var340 & 65536) + (var340 & 16777472);
                                    var3[var279] = var339 - var341 | var341 - (var341 >>> 8);
                                } else if (arg0 == 3) {
                                    int var342 = this.field533[var278];
                                    int var343 = class289.field4107;
                                    int var344 = var342 + var343;
                                    int var345 = (var342 & 16711935) + (var343 & 16711935);
                                    int var346 = (var344 - var345 & 65536) + (var345 & 16777472);
                                    int var347 = var344 - var346 | var346 - (var346 >>> 8);
                                    int var348 = var3[var279];
                                    int var349 = var347 + var348;
                                    int var350 = (var347 & 16711935) + (var348 & 16711935);
                                    int var351 = (var349 - var350 & 65536) + (var350 & 16777472);
                                    var3[var279] = var349 - var351 | var351 - (var351 >>> 8);
                                } else if (arg0 == 2) {
                                    int var352 = this.field533[var278];
                                    int var353 = (var352 & 16711935) * class289.field4097 & -16711936;
                                    int var354 = (var352 & 65280) * class289.field4097 & 16711680;
                                    int var355 = ((var353 | var354) >>> 8) + class289.field4089;
                                    int var356 = var3[var279];
                                    int var357 = var355 + var356;
                                    int var358 = (var355 & 16711935) + (var356 & 16711935);
                                    int var359 = (var357 - var358 & 65536) + (var358 & 16777472);
                                    var3[var279] = var357 - var359 | var359 - (var359 >>> 8);
                                }
                            }
                            var272 += class289.field4084;
                            ++var274;
                        }
                    }
                    ++var270;
                    class289.field4104 += class289.field4096;
                    class289.field4077 += class289.field4101;
                }
            } else if (class289.field4095 < 0) {
                int var360 = class289.field4082;
                while (var360 < 0) {
                    int var361 = class289.field4077;
                    int var362 = class289.field4088 + class289.field4081;
                    int var363 = class289.field4104 + class289.field4078;
                    int var364 = class289.field4080;
                    int var365;
                    if ((var365 = var362 - (super.field4090 << 12)) >= 0) {
                        int var366 = (class289.field4084 - var365) / class289.field4084;
                        var364 += var366;
                        var362 += class289.field4084 * var366;
                        var363 += class289.field4095 * var366;
                        var361 += var366;
                    }
                    int var367;
                    if ((var367 = (var362 - class289.field4084) / class289.field4084) > var364) {
                        var364 = var367;
                    }
                    int var368;
                    if ((var368 = var363 - (super.field4083 << 12)) >= 0) {
                        int var369 = (class289.field4095 - var368) / class289.field4095;
                        var364 += var369;
                        var362 += class289.field4084 * var369;
                        var363 += class289.field4095 * var369;
                        var361 += var369;
                    }
                    int var370;
                    if ((var370 = (var363 - class289.field4095) / class289.field4095) > var364) {
                        var364 = var370;
                    }
                    while (var364 < 0) {
                        int var371 = (var362 >> 12) + (var363 >> 12) * super.field4090;
                        int var372 = var361++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var372] = this.field533[var371];
                            } else if (arg0 == 0) {
                                int var376 = this.field533[var371++];
                                int var377 = (var376 & 16711680) * class289.field4085 & -16777216;
                                int var378 = (var376 & 65280) * class289.field4079 & 16711680;
                                int var379 = (var376 & 255) * class289.field4086 & 65280;
                                var3[var372] = (var377 | var378 | var379) >>> 8;
                            } else if (arg0 == 3) {
                                int var380 = this.field533[var371++];
                                int var381 = class289.field4107;
                                int var382 = var380 + var381;
                                int var383 = (var380 & 16711935) + (var381 & 16711935);
                                int var384 = (var382 - var383 & 65536) + (var383 & 16777472);
                                var3[var372] = var382 - var384 | var384 - (var384 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var385 = this.field533[var371];
                                int var386 = (var385 & 16711935) * class289.field4097 & -16711936;
                                int var387 = (var385 & 65280) * class289.field4097 & 16711680;
                                var3[var372] = ((var386 | var387) >>> 8) + class289.field4089;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                int var388 = this.field533[var371];
                                int var389 = var388 >>> 24;
                                int var390 = 256 - var389;
                                int var391 = var3[var372];
                                var3[var372] = ((var388 & 16711935) * var389 + (var391 & 16711935) * var390 & -16711936) + ((var388 & 65280) * var389 + (var391 & 65280) * var390 & 16711680) >> 8;
                            } else if (arg0 == 0) {
                                int var392 = this.field533[var371];
                                int var393 = (var392 >>> 24) * class289.field4097 >> 8;
                                int var394 = 256 - var393;
                                if ((class289.field4107 & 16777215) == 16777215) {
                                    int var395 = var3[var372];
                                    var3[var372] = ((var392 & 16711935) * var393 + (var395 & 16711935) * var394 & -16711936) + ((var392 & 65280) * var393 + (var395 & 65280) * var394 & 16711680) >> 8;
                                } else if (var393 != 255) {
                                    int var396 = (var392 & 16711680) * class289.field4085 & -16777216;
                                    int var397 = (var392 & 65280) * class289.field4079 & 16711680;
                                    int var398 = (var392 & 255) * class289.field4086 & 65280;
                                    int var399 = (var396 | var397 | var398) >>> 8;
                                    int var400 = var3[var372];
                                    var3[var372] = ((var399 & 16711935) * var393 + (var400 & 16711935) * var394 & -16711936) + ((var399 & 65280) * var393 + (var400 & 65280) * var394 & 16711680) >> 8;
                                } else {
                                    int var401 = (var392 & 16711680) * class289.field4085 & -16777216;
                                    int var402 = (var392 & 65280) * class289.field4079 & 16711680;
                                    int var403 = (var392 & 255) * class289.field4086 & 65280;
                                    var3[var372] = (var401 | var402 | var403) >>> 8;
                                }
                            } else if (arg0 == 3) {
                                int var404 = this.field533[var371];
                                int var405 = class289.field4107;
                                int var406 = var404 + var405;
                                int var407 = (var404 & 16711935) + (var405 & 16711935);
                                int var408 = (var406 - var407 & 65536) + (var407 & 16777472);
                                int var409 = var406 - var408 | var408 - (var408 >>> 8);
                                int var410 = (var404 >>> 24) * class289.field4097 >> 8;
                                int var411 = 256 - var410;
                                if (var410 != 255) {
                                    int var413 = var3[var372];
                                    var409 = ((var409 & 16711935) * var410 + (var413 & 16711935) * var411 & -16711936) + ((var409 & 65280) * var410 + (var413 & 65280) * var411 & 16711680) >> 8;
                                }
                                var3[var372] = var409;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var414 = this.field533[var371];
                                int var415 = var414 >>> 24;
                                int var416 = 256 - var415;
                                int var417 = (var414 & 16711935) * class289.field4097 & -16711936;
                                int var418 = (var414 & 65280) * class289.field4097 & 16711680;
                                int var419 = ((var417 | var418) >>> 8) + class289.field4089;
                                int var420 = var3[var372];
                                var3[var372] = ((var419 & 16711935) * var415 + (var420 & 16711935) * var416 & -16711936) + ((var419 & 65280) * var415 + (var420 & 65280) * var416 & 16711680) >> 8;
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                int var421 = this.field533[var371];
                                int var422 = var3[var372];
                                int var423 = var421 + var422;
                                int var424 = (var421 & 16711935) + (var422 & 16711935);
                                int var425 = (var423 - var424 & 65536) + (var424 & 16777472);
                                var3[var372] = var423 - var425 | var425 - (var425 >>> 8);
                            } else if (arg0 == 0) {
                                int var426 = this.field533[var371];
                                int var427 = (var426 & 16711680) * class289.field4085 & -16777216;
                                int var428 = (var426 & 65280) * class289.field4079 & 16711680;
                                int var429 = (var426 & 255) * class289.field4086 & 65280;
                                int var430 = (var427 | var428 | var429) >>> 8;
                                int var431 = var3[var372];
                                int var432 = var430 + var431;
                                int var433 = (var430 & 16711935) + (var431 & 16711935);
                                int var434 = (var432 - var433 & 65536) + (var433 & 16777472);
                                var3[var372] = var432 - var434 | var434 - (var434 >>> 8);
                            } else if (arg0 == 3) {
                                int var435 = this.field533[var371];
                                int var436 = class289.field4107;
                                int var437 = var435 + var436;
                                int var438 = (var435 & 16711935) + (var436 & 16711935);
                                int var439 = (var437 - var438 & 65536) + (var438 & 16777472);
                                int var440 = var437 - var439 | var439 - (var439 >>> 8);
                                int var441 = var3[var372];
                                int var442 = var440 + var441;
                                int var443 = (var440 & 16711935) + (var441 & 16711935);
                                int var444 = (var442 - var443 & 65536) + (var443 & 16777472);
                                var3[var372] = var442 - var444 | var444 - (var444 >>> 8);
                            } else if (arg0 == 2) {
                                int var445 = this.field533[var371];
                                int var446 = (var445 & 16711935) * class289.field4097 & -16711936;
                                int var447 = (var445 & 65280) * class289.field4097 & 16711680;
                                int var448 = ((var446 | var447) >>> 8) + class289.field4089;
                                int var449 = var3[var372];
                                int var450 = var448 + var449;
                                int var451 = (var448 & 16711935) + (var449 & 16711935);
                                int var452 = (var450 - var451 & 65536) + (var451 & 16777472);
                                var3[var372] = var450 - var452 | var452 - (var452 >>> 8);
                            }
                        }
                        var362 += class289.field4084;
                        var363 += class289.field4095;
                        ++var364;
                    }
                    ++var360;
                    class289.field4088 += class289.field4106;
                    class289.field4104 += class289.field4096;
                    class289.field4077 += class289.field4101;
                }
            } else {
                int var453 = class289.field4082;
                while (var453 < 0) {
                    int var454 = class289.field4077;
                    int var455 = class289.field4088 + class289.field4081;
                    int var456 = class289.field4104 + class289.field4078;
                    int var457 = class289.field4080;
                    int var458;
                    if ((var458 = var455 - (super.field4090 << 12)) >= 0) {
                        int var459 = (class289.field4084 - var458) / class289.field4084;
                        var457 += var459;
                        var455 += class289.field4084 * var459;
                        var456 += class289.field4095 * var459;
                        var454 += var459;
                    }
                    int var460;
                    if ((var460 = (var455 - class289.field4084) / class289.field4084) > var457) {
                        var457 = var460;
                    }
                    if (var456 < 0) {
                        int var461 = (class289.field4095 - 1 - var456) / class289.field4095;
                        var457 += var461;
                        var455 += class289.field4084 * var461;
                        var456 += class289.field4095 * var461;
                        var454 += var461;
                    }
                    int var462;
                    if ((var462 = (var456 + 1 - (super.field4083 << 12) - class289.field4095) / class289.field4095) > var457) {
                        var457 = var462;
                    }
                    while (var457 < 0) {
                        int var463 = (var455 >> 12) + (var456 >> 12) * super.field4090;
                        int var464 = var454++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var464] = this.field533[var463];
                            } else if (arg0 == 0) {
                                int var468 = this.field533[var463++];
                                int var469 = (var468 & 16711680) * class289.field4085 & -16777216;
                                int var470 = (var468 & 65280) * class289.field4079 & 16711680;
                                int var471 = (var468 & 255) * class289.field4086 & 65280;
                                var3[var464] = (var469 | var470 | var471) >>> 8;
                            } else if (arg0 == 3) {
                                int var472 = this.field533[var463++];
                                int var473 = class289.field4107;
                                int var474 = var472 + var473;
                                int var475 = (var472 & 16711935) + (var473 & 16711935);
                                int var476 = (var474 - var475 & 65536) + (var475 & 16777472);
                                var3[var464] = var474 - var476 | var476 - (var476 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var477 = this.field533[var463];
                                int var478 = (var477 & 16711935) * class289.field4097 & -16711936;
                                int var479 = (var477 & 65280) * class289.field4097 & 16711680;
                                var3[var464] = ((var478 | var479) >>> 8) + class289.field4089;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                int var480 = this.field533[var463];
                                int var481 = var480 >>> 24;
                                int var482 = 256 - var481;
                                int var483 = var3[var464];
                                var3[var464] = ((var480 & 16711935) * var481 + (var483 & 16711935) * var482 & -16711936) + ((var480 & 65280) * var481 + (var483 & 65280) * var482 & 16711680) >> 8;
                            } else if (arg0 == 0) {
                                int var484 = this.field533[var463];
                                int var485 = (var484 >>> 24) * class289.field4097 >> 8;
                                int var486 = 256 - var485;
                                if ((class289.field4107 & 16777215) == 16777215) {
                                    int var487 = var3[var464];
                                    var3[var464] = ((var484 & 16711935) * var485 + (var487 & 16711935) * var486 & -16711936) + ((var484 & 65280) * var485 + (var487 & 65280) * var486 & 16711680) >> 8;
                                } else if (var485 != 255) {
                                    int var488 = (var484 & 16711680) * class289.field4085 & -16777216;
                                    int var489 = (var484 & 65280) * class289.field4079 & 16711680;
                                    int var490 = (var484 & 255) * class289.field4086 & 65280;
                                    int var491 = (var488 | var489 | var490) >>> 8;
                                    int var492 = var3[var464];
                                    var3[var464] = ((var491 & 16711935) * var485 + (var492 & 16711935) * var486 & -16711936) + ((var491 & 65280) * var485 + (var492 & 65280) * var486 & 16711680) >> 8;
                                } else {
                                    int var493 = (var484 & 16711680) * class289.field4085 & -16777216;
                                    int var494 = (var484 & 65280) * class289.field4079 & 16711680;
                                    int var495 = (var484 & 255) * class289.field4086 & 65280;
                                    var3[var464] = (var493 | var494 | var495) >>> 8;
                                }
                            } else if (arg0 == 3) {
                                int var496 = this.field533[var463];
                                int var497 = class289.field4107;
                                int var498 = var496 + var497;
                                int var499 = (var496 & 16711935) + (var497 & 16711935);
                                int var500 = (var498 - var499 & 65536) + (var499 & 16777472);
                                int var501 = var498 - var500 | var500 - (var500 >>> 8);
                                int var502 = (var496 >>> 24) * class289.field4097 >> 8;
                                int var503 = 256 - var502;
                                if (var502 != 255) {
                                    int var505 = var3[var464];
                                    var501 = ((var501 & 16711935) * var502 + (var505 & 16711935) * var503 & -16711936) + ((var501 & 65280) * var502 + (var505 & 65280) * var503 & 16711680) >> 8;
                                }
                                var3[var464] = var501;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var506 = this.field533[var463];
                                int var507 = var506 >>> 24;
                                int var508 = 256 - var507;
                                int var509 = (var506 & 16711935) * class289.field4097 & -16711936;
                                int var510 = (var506 & 65280) * class289.field4097 & 16711680;
                                int var511 = ((var509 | var510) >>> 8) + class289.field4089;
                                int var512 = var3[var464];
                                var3[var464] = ((var511 & 16711935) * var507 + (var512 & 16711935) * var508 & -16711936) + ((var511 & 65280) * var507 + (var512 & 65280) * var508 & 16711680) >> 8;
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                int var513 = this.field533[var463];
                                int var514 = var3[var464];
                                int var515 = var513 + var514;
                                int var516 = (var513 & 16711935) + (var514 & 16711935);
                                int var517 = (var515 - var516 & 65536) + (var516 & 16777472);
                                var3[var464] = var515 - var517 | var517 - (var517 >>> 8);
                            } else if (arg0 == 0) {
                                int var518 = this.field533[var463];
                                int var519 = (var518 & 16711680) * class289.field4085 & -16777216;
                                int var520 = (var518 & 65280) * class289.field4079 & 16711680;
                                int var521 = (var518 & 255) * class289.field4086 & 65280;
                                int var522 = (var519 | var520 | var521) >>> 8;
                                int var523 = var3[var464];
                                int var524 = var522 + var523;
                                int var525 = (var522 & 16711935) + (var523 & 16711935);
                                int var526 = (var524 - var525 & 65536) + (var525 & 16777472);
                                var3[var464] = var524 - var526 | var526 - (var526 >>> 8);
                            } else if (arg0 == 3) {
                                int var527 = this.field533[var463];
                                int var528 = class289.field4107;
                                int var529 = var527 + var528;
                                int var530 = (var527 & 16711935) + (var528 & 16711935);
                                int var531 = (var529 - var530 & 65536) + (var530 & 16777472);
                                int var532 = var529 - var531 | var531 - (var531 >>> 8);
                                int var533 = var3[var464];
                                int var534 = var532 + var533;
                                int var535 = (var532 & 16711935) + (var533 & 16711935);
                                int var536 = (var534 - var535 & 65536) + (var535 & 16777472);
                                var3[var464] = var534 - var536 | var536 - (var536 >>> 8);
                            } else if (arg0 == 2) {
                                int var537 = this.field533[var463];
                                int var538 = (var537 & 16711935) * class289.field4097 & -16711936;
                                int var539 = (var537 & 65280) * class289.field4097 & 16711680;
                                int var540 = ((var538 | var539) >>> 8) + class289.field4089;
                                int var541 = var3[var464];
                                int var542 = var540 + var541;
                                int var543 = (var540 & 16711935) + (var541 & 16711935);
                                int var544 = (var542 - var543 & 65536) + (var543 & 16777472);
                                var3[var464] = var542 - var544 | var544 - (var544 >>> 8);
                            }
                        }
                        var455 += class289.field4084;
                        var456 += class289.field4095;
                        ++var457;
                    }
                    ++var453;
                    class289.field4088 += class289.field4106;
                    class289.field4104 += class289.field4096;
                    class289.field4077 += class289.field4101;
                }
            }
        } else if (class289.field4095 == 0) {
            int var545 = class289.field4082;
            while (var545 < 0) {
                int var546 = class289.field4077;
                int var547 = class289.field4088 + class289.field4081;
                int var548 = class289.field4104;
                int var549 = class289.field4080;
                if (var548 >= 0 && var548 - (super.field4083 << 12) < 0) {
                    if (var547 < 0) {
                        int var550 = (class289.field4084 - 1 - var547) / class289.field4084;
                        var549 += var550;
                        var547 += class289.field4084 * var550;
                        var546 += var550;
                    }
                    int var551;
                    if ((var551 = (var547 + 1 - (super.field4090 << 12) - class289.field4084) / class289.field4084) > var549) {
                        var549 = var551;
                    }
                    while (var549 < 0) {
                        int var552 = (var547 >> 12) + (var548 >> 12) * super.field4090;
                        int var553 = var546++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var553] = this.field533[var552];
                            } else if (arg0 == 0) {
                                int var557 = this.field533[var552++];
                                int var558 = (var557 & 16711680) * class289.field4085 & -16777216;
                                int var559 = (var557 & 65280) * class289.field4079 & 16711680;
                                int var560 = (var557 & 255) * class289.field4086 & 65280;
                                var3[var553] = (var558 | var559 | var560) >>> 8;
                            } else if (arg0 == 3) {
                                int var561 = this.field533[var552++];
                                int var562 = class289.field4107;
                                int var563 = var561 + var562;
                                int var564 = (var561 & 16711935) + (var562 & 16711935);
                                int var565 = (var563 - var564 & 65536) + (var564 & 16777472);
                                var3[var553] = var563 - var565 | var565 - (var565 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var566 = this.field533[var552];
                                int var567 = (var566 & 16711935) * class289.field4097 & -16711936;
                                int var568 = (var566 & 65280) * class289.field4097 & 16711680;
                                var3[var553] = ((var567 | var568) >>> 8) + class289.field4089;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                int var569 = this.field533[var552];
                                int var570 = var569 >>> 24;
                                int var571 = 256 - var570;
                                int var572 = var3[var553];
                                var3[var553] = ((var569 & 16711935) * var570 + (var572 & 16711935) * var571 & -16711936) + ((var569 & 65280) * var570 + (var572 & 65280) * var571 & 16711680) >> 8;
                            } else if (arg0 == 0) {
                                int var573 = this.field533[var552];
                                int var574 = (var573 >>> 24) * class289.field4097 >> 8;
                                int var575 = 256 - var574;
                                if ((class289.field4107 & 16777215) == 16777215) {
                                    int var576 = var3[var553];
                                    var3[var553] = ((var573 & 16711935) * var574 + (var576 & 16711935) * var575 & -16711936) + ((var573 & 65280) * var574 + (var576 & 65280) * var575 & 16711680) >> 8;
                                } else if (var574 != 255) {
                                    int var577 = (var573 & 16711680) * class289.field4085 & -16777216;
                                    int var578 = (var573 & 65280) * class289.field4079 & 16711680;
                                    int var579 = (var573 & 255) * class289.field4086 & 65280;
                                    int var580 = (var577 | var578 | var579) >>> 8;
                                    int var581 = var3[var553];
                                    var3[var553] = ((var580 & 16711935) * var574 + (var581 & 16711935) * var575 & -16711936) + ((var580 & 65280) * var574 + (var581 & 65280) * var575 & 16711680) >> 8;
                                } else {
                                    int var582 = (var573 & 16711680) * class289.field4085 & -16777216;
                                    int var583 = (var573 & 65280) * class289.field4079 & 16711680;
                                    int var584 = (var573 & 255) * class289.field4086 & 65280;
                                    var3[var553] = (var582 | var583 | var584) >>> 8;
                                }
                            } else if (arg0 == 3) {
                                int var585 = this.field533[var552];
                                int var586 = class289.field4107;
                                int var587 = var585 + var586;
                                int var588 = (var585 & 16711935) + (var586 & 16711935);
                                int var589 = (var587 - var588 & 65536) + (var588 & 16777472);
                                int var590 = var587 - var589 | var589 - (var589 >>> 8);
                                int var591 = (var585 >>> 24) * class289.field4097 >> 8;
                                int var592 = 256 - var591;
                                if (var591 != 255) {
                                    int var594 = var3[var553];
                                    var590 = ((var590 & 16711935) * var591 + (var594 & 16711935) * var592 & -16711936) + ((var590 & 65280) * var591 + (var594 & 65280) * var592 & 16711680) >> 8;
                                }
                                var3[var553] = var590;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var595 = this.field533[var552];
                                int var596 = var595 >>> 24;
                                int var597 = 256 - var596;
                                int var598 = (var595 & 16711935) * class289.field4097 & -16711936;
                                int var599 = (var595 & 65280) * class289.field4097 & 16711680;
                                int var600 = ((var598 | var599) >>> 8) + class289.field4089;
                                int var601 = var3[var553];
                                var3[var553] = ((var600 & 16711935) * var596 + (var601 & 16711935) * var597 & -16711936) + ((var600 & 65280) * var596 + (var601 & 65280) * var597 & 16711680) >> 8;
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                int var602 = this.field533[var552];
                                int var603 = var3[var553];
                                int var604 = var602 + var603;
                                int var605 = (var602 & 16711935) + (var603 & 16711935);
                                int var606 = (var604 - var605 & 65536) + (var605 & 16777472);
                                var3[var553] = var604 - var606 | var606 - (var606 >>> 8);
                            } else if (arg0 == 0) {
                                int var607 = this.field533[var552];
                                int var608 = (var607 & 16711680) * class289.field4085 & -16777216;
                                int var609 = (var607 & 65280) * class289.field4079 & 16711680;
                                int var610 = (var607 & 255) * class289.field4086 & 65280;
                                int var611 = (var608 | var609 | var610) >>> 8;
                                int var612 = var3[var553];
                                int var613 = var611 + var612;
                                int var614 = (var611 & 16711935) + (var612 & 16711935);
                                int var615 = (var613 - var614 & 65536) + (var614 & 16777472);
                                var3[var553] = var613 - var615 | var615 - (var615 >>> 8);
                            } else if (arg0 == 3) {
                                int var616 = this.field533[var552];
                                int var617 = class289.field4107;
                                int var618 = var616 + var617;
                                int var619 = (var616 & 16711935) + (var617 & 16711935);
                                int var620 = (var618 - var619 & 65536) + (var619 & 16777472);
                                int var621 = var618 - var620 | var620 - (var620 >>> 8);
                                int var622 = var3[var553];
                                int var623 = var621 + var622;
                                int var624 = (var621 & 16711935) + (var622 & 16711935);
                                int var625 = (var623 - var624 & 65536) + (var624 & 16777472);
                                var3[var553] = var623 - var625 | var625 - (var625 >>> 8);
                            } else if (arg0 == 2) {
                                int var626 = this.field533[var552];
                                int var627 = (var626 & 16711935) * class289.field4097 & -16711936;
                                int var628 = (var626 & 65280) * class289.field4097 & 16711680;
                                int var629 = ((var627 | var628) >>> 8) + class289.field4089;
                                int var630 = var3[var553];
                                int var631 = var629 + var630;
                                int var632 = (var629 & 16711935) + (var630 & 16711935);
                                int var633 = (var631 - var632 & 65536) + (var632 & 16777472);
                                var3[var553] = var631 - var633 | var633 - (var633 >>> 8);
                            }
                        }
                        var547 += class289.field4084;
                        ++var549;
                    }
                }
                ++var545;
                class289.field4088 += class289.field4106;
                class289.field4104 += class289.field4096;
                class289.field4077 += class289.field4101;
            }
        } else if (class289.field4095 < 0) {
            for (int var634 = class289.field4082; var634 < 0; ++var634) {
                int var635 = class289.field4077;
                int var636 = class289.field4088 + class289.field4081;
                int var637 = class289.field4104 + class289.field4078;
                int var638 = class289.field4080;
                if (var636 < 0) {
                    int var639 = (class289.field4084 - 1 - var636) / class289.field4084;
                    var638 += var639;
                    var636 += class289.field4084 * var639;
                    var637 += class289.field4095 * var639;
                    var635 += var639;
                }
                int var640;
                if ((var640 = (var636 + 1 - (super.field4090 << 12) - class289.field4084) / class289.field4084) > var638) {
                    var638 = var640;
                }
                int var641;
                if ((var641 = var637 - (super.field4083 << 12)) >= 0) {
                    int var642 = (class289.field4095 - var641) / class289.field4095;
                    var638 += var642;
                    var636 += class289.field4084 * var642;
                    var637 += class289.field4095 * var642;
                    var635 += var642;
                }
                int var643;
                if ((var643 = (var637 - class289.field4095) / class289.field4095) > var638) {
                    var638 = var643;
                }
                while (var638 < 0) {
                    int var644 = (var636 >> 12) + (var637 >> 12) * super.field4090;
                    int var645 = var635++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var645] = this.field533[var644];
                        } else if (arg0 == 0) {
                            int var649 = this.field533[var644++];
                            int var650 = (var649 & 16711680) * class289.field4085 & -16777216;
                            int var651 = (var649 & 65280) * class289.field4079 & 16711680;
                            int var652 = (var649 & 255) * class289.field4086 & 65280;
                            var3[var645] = (var650 | var651 | var652) >>> 8;
                        } else if (arg0 == 3) {
                            int var653 = this.field533[var644++];
                            int var654 = class289.field4107;
                            int var655 = var653 + var654;
                            int var656 = (var653 & 16711935) + (var654 & 16711935);
                            int var657 = (var655 - var656 & 65536) + (var656 & 16777472);
                            var3[var645] = var655 - var657 | var657 - (var657 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var658 = this.field533[var644];
                            int var659 = (var658 & 16711935) * class289.field4097 & -16711936;
                            int var660 = (var658 & 65280) * class289.field4097 & 16711680;
                            var3[var645] = ((var659 | var660) >>> 8) + class289.field4089;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            int var661 = this.field533[var644];
                            int var662 = var661 >>> 24;
                            int var663 = 256 - var662;
                            int var664 = var3[var645];
                            var3[var645] = ((var661 & 16711935) * var662 + (var664 & 16711935) * var663 & -16711936) + ((var661 & 65280) * var662 + (var664 & 65280) * var663 & 16711680) >> 8;
                        } else if (arg0 == 0) {
                            int var665 = this.field533[var644];
                            int var666 = (var665 >>> 24) * class289.field4097 >> 8;
                            int var667 = 256 - var666;
                            if ((class289.field4107 & 16777215) == 16777215) {
                                int var668 = var3[var645];
                                var3[var645] = ((var665 & 16711935) * var666 + (var668 & 16711935) * var667 & -16711936) + ((var665 & 65280) * var666 + (var668 & 65280) * var667 & 16711680) >> 8;
                            } else if (var666 != 255) {
                                int var669 = (var665 & 16711680) * class289.field4085 & -16777216;
                                int var670 = (var665 & 65280) * class289.field4079 & 16711680;
                                int var671 = (var665 & 255) * class289.field4086 & 65280;
                                int var672 = (var669 | var670 | var671) >>> 8;
                                int var673 = var3[var645];
                                var3[var645] = ((var672 & 16711935) * var666 + (var673 & 16711935) * var667 & -16711936) + ((var672 & 65280) * var666 + (var673 & 65280) * var667 & 16711680) >> 8;
                            } else {
                                int var674 = (var665 & 16711680) * class289.field4085 & -16777216;
                                int var675 = (var665 & 65280) * class289.field4079 & 16711680;
                                int var676 = (var665 & 255) * class289.field4086 & 65280;
                                var3[var645] = (var674 | var675 | var676) >>> 8;
                            }
                        } else if (arg0 == 3) {
                            int var677 = this.field533[var644];
                            int var678 = class289.field4107;
                            int var679 = var677 + var678;
                            int var680 = (var677 & 16711935) + (var678 & 16711935);
                            int var681 = (var679 - var680 & 65536) + (var680 & 16777472);
                            int var682 = var679 - var681 | var681 - (var681 >>> 8);
                            int var683 = (var677 >>> 24) * class289.field4097 >> 8;
                            int var684 = 256 - var683;
                            if (var683 != 255) {
                                int var686 = var3[var645];
                                var682 = ((var682 & 16711935) * var683 + (var686 & 16711935) * var684 & -16711936) + ((var682 & 65280) * var683 + (var686 & 65280) * var684 & 16711680) >> 8;
                            }
                            var3[var645] = var682;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var687 = this.field533[var644];
                            int var688 = var687 >>> 24;
                            int var689 = 256 - var688;
                            int var690 = (var687 & 16711935) * class289.field4097 & -16711936;
                            int var691 = (var687 & 65280) * class289.field4097 & 16711680;
                            int var692 = ((var690 | var691) >>> 8) + class289.field4089;
                            int var693 = var3[var645];
                            var3[var645] = ((var692 & 16711935) * var688 + (var693 & 16711935) * var689 & -16711936) + ((var692 & 65280) * var688 + (var693 & 65280) * var689 & 16711680) >> 8;
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            int var694 = this.field533[var644];
                            int var695 = var3[var645];
                            int var696 = var694 + var695;
                            int var697 = (var694 & 16711935) + (var695 & 16711935);
                            int var698 = (var696 - var697 & 65536) + (var697 & 16777472);
                            var3[var645] = var696 - var698 | var698 - (var698 >>> 8);
                        } else if (arg0 == 0) {
                            int var699 = this.field533[var644];
                            int var700 = (var699 & 16711680) * class289.field4085 & -16777216;
                            int var701 = (var699 & 65280) * class289.field4079 & 16711680;
                            int var702 = (var699 & 255) * class289.field4086 & 65280;
                            int var703 = (var700 | var701 | var702) >>> 8;
                            int var704 = var3[var645];
                            int var705 = var703 + var704;
                            int var706 = (var703 & 16711935) + (var704 & 16711935);
                            int var707 = (var705 - var706 & 65536) + (var706 & 16777472);
                            var3[var645] = var705 - var707 | var707 - (var707 >>> 8);
                        } else if (arg0 == 3) {
                            int var708 = this.field533[var644];
                            int var709 = class289.field4107;
                            int var710 = var708 + var709;
                            int var711 = (var708 & 16711935) + (var709 & 16711935);
                            int var712 = (var710 - var711 & 65536) + (var711 & 16777472);
                            int var713 = var710 - var712 | var712 - (var712 >>> 8);
                            int var714 = var3[var645];
                            int var715 = var713 + var714;
                            int var716 = (var713 & 16711935) + (var714 & 16711935);
                            int var717 = (var715 - var716 & 65536) + (var716 & 16777472);
                            var3[var645] = var715 - var717 | var717 - (var717 >>> 8);
                        } else if (arg0 == 2) {
                            int var718 = this.field533[var644];
                            int var719 = (var718 & 16711935) * class289.field4097 & -16711936;
                            int var720 = (var718 & 65280) * class289.field4097 & 16711680;
                            int var721 = ((var719 | var720) >>> 8) + class289.field4089;
                            int var722 = var3[var645];
                            int var723 = var721 + var722;
                            int var724 = (var721 & 16711935) + (var722 & 16711935);
                            int var725 = (var723 - var724 & 65536) + (var724 & 16777472);
                            var3[var645] = var723 - var725 | var725 - (var725 >>> 8);
                        }
                    }
                    var636 += class289.field4084;
                    var637 += class289.field4095;
                    ++var638;
                }
                class289.field4088 += class289.field4106;
                class289.field4104 += class289.field4096;
                class289.field4077 += class289.field4101;
            }
        } else {
            for (int var726 = class289.field4082; var726 < 0; ++var726) {
                int var727 = class289.field4077;
                int var728 = class289.field4088 + class289.field4081;
                int var729 = class289.field4104 + class289.field4078;
                int var730 = class289.field4080;
                if (var728 < 0) {
                    int var731 = (class289.field4084 - 1 - var728) / class289.field4084;
                    var730 += var731;
                    var728 += class289.field4084 * var731;
                    var729 += class289.field4095 * var731;
                    var727 += var731;
                }
                int var732;
                if ((var732 = (var728 + 1 - (super.field4090 << 12) - class289.field4084) / class289.field4084) > var730) {
                    var730 = var732;
                }
                if (var729 < 0) {
                    int var733 = (class289.field4095 - 1 - var729) / class289.field4095;
                    var730 += var733;
                    var728 += class289.field4084 * var733;
                    var729 += class289.field4095 * var733;
                    var727 += var733;
                }
                int var734;
                if ((var734 = (var729 + 1 - (super.field4083 << 12) - class289.field4095) / class289.field4095) > var730) {
                    var730 = var734;
                }
                while (var730 < 0) {
                    int var735 = (var728 >> 12) + (var729 >> 12) * super.field4090;
                    int var736 = var727++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var736] = this.field533[var735];
                        } else if (arg0 == 0) {
                            int var740 = this.field533[var735++];
                            int var741 = (var740 & 16711680) * class289.field4085 & -16777216;
                            int var742 = (var740 & 65280) * class289.field4079 & 16711680;
                            int var743 = (var740 & 255) * class289.field4086 & 65280;
                            var3[var736] = (var741 | var742 | var743) >>> 8;
                        } else if (arg0 == 3) {
                            int var744 = this.field533[var735++];
                            int var745 = class289.field4107;
                            int var746 = var744 + var745;
                            int var747 = (var744 & 16711935) + (var745 & 16711935);
                            int var748 = (var746 - var747 & 65536) + (var747 & 16777472);
                            var3[var736] = var746 - var748 | var748 - (var748 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var749 = this.field533[var735];
                            int var750 = (var749 & 16711935) * class289.field4097 & -16711936;
                            int var751 = (var749 & 65280) * class289.field4097 & 16711680;
                            var3[var736] = ((var750 | var751) >>> 8) + class289.field4089;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            int var752 = this.field533[var735];
                            int var753 = var752 >>> 24;
                            int var754 = 256 - var753;
                            int var755 = var3[var736];
                            var3[var736] = ((var752 & 16711935) * var753 + (var755 & 16711935) * var754 & -16711936) + ((var752 & 65280) * var753 + (var755 & 65280) * var754 & 16711680) >> 8;
                        } else if (arg0 == 0) {
                            int var756 = this.field533[var735];
                            int var757 = (var756 >>> 24) * class289.field4097 >> 8;
                            int var758 = 256 - var757;
                            if ((class289.field4107 & 16777215) == 16777215) {
                                int var759 = var3[var736];
                                var3[var736] = ((var756 & 16711935) * var757 + (var759 & 16711935) * var758 & -16711936) + ((var756 & 65280) * var757 + (var759 & 65280) * var758 & 16711680) >> 8;
                            } else if (var757 != 255) {
                                int var760 = (var756 & 16711680) * class289.field4085 & -16777216;
                                int var761 = (var756 & 65280) * class289.field4079 & 16711680;
                                int var762 = (var756 & 255) * class289.field4086 & 65280;
                                int var763 = (var760 | var761 | var762) >>> 8;
                                int var764 = var3[var736];
                                var3[var736] = ((var763 & 16711935) * var757 + (var764 & 16711935) * var758 & -16711936) + ((var763 & 65280) * var757 + (var764 & 65280) * var758 & 16711680) >> 8;
                            } else {
                                int var765 = (var756 & 16711680) * class289.field4085 & -16777216;
                                int var766 = (var756 & 65280) * class289.field4079 & 16711680;
                                int var767 = (var756 & 255) * class289.field4086 & 65280;
                                var3[var736] = (var765 | var766 | var767) >>> 8;
                            }
                        } else if (arg0 == 3) {
                            int var768 = this.field533[var735];
                            int var769 = class289.field4107;
                            int var770 = var768 + var769;
                            int var771 = (var768 & 16711935) + (var769 & 16711935);
                            int var772 = (var770 - var771 & 65536) + (var771 & 16777472);
                            int var773 = var770 - var772 | var772 - (var772 >>> 8);
                            int var774 = (var768 >>> 24) * class289.field4097 >> 8;
                            int var775 = 256 - var774;
                            if (var774 != 255) {
                                int var777 = var3[var736];
                                var773 = ((var773 & 16711935) * var774 + (var777 & 16711935) * var775 & -16711936) + ((var773 & 65280) * var774 + (var777 & 65280) * var775 & 16711680) >> 8;
                            }
                            var3[var736] = var773;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var778 = this.field533[var735];
                            int var779 = var778 >>> 24;
                            int var780 = 256 - var779;
                            int var781 = (var778 & 16711935) * class289.field4097 & -16711936;
                            int var782 = (var778 & 65280) * class289.field4097 & 16711680;
                            int var783 = ((var781 | var782) >>> 8) + class289.field4089;
                            int var784 = var3[var736];
                            var3[var736] = ((var783 & 16711935) * var779 + (var784 & 16711935) * var780 & -16711936) + ((var783 & 65280) * var779 + (var784 & 65280) * var780 & 16711680) >> 8;
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            int var785 = this.field533[var735];
                            int var786 = var3[var736];
                            int var787 = var785 + var786;
                            int var788 = (var785 & 16711935) + (var786 & 16711935);
                            int var789 = (var787 - var788 & 65536) + (var788 & 16777472);
                            var3[var736] = var787 - var789 | var789 - (var789 >>> 8);
                        } else if (arg0 == 0) {
                            int var790 = this.field533[var735];
                            int var791 = (var790 & 16711680) * class289.field4085 & -16777216;
                            int var792 = (var790 & 65280) * class289.field4079 & 16711680;
                            int var793 = (var790 & 255) * class289.field4086 & 65280;
                            int var794 = (var791 | var792 | var793) >>> 8;
                            int var795 = var3[var736];
                            int var796 = var794 + var795;
                            int var797 = (var794 & 16711935) + (var795 & 16711935);
                            int var798 = (var796 - var797 & 65536) + (var797 & 16777472);
                            var3[var736] = var796 - var798 | var798 - (var798 >>> 8);
                        } else if (arg0 == 3) {
                            int var799 = this.field533[var735];
                            int var800 = class289.field4107;
                            int var801 = var799 + var800;
                            int var802 = (var799 & 16711935) + (var800 & 16711935);
                            int var803 = (var801 - var802 & 65536) + (var802 & 16777472);
                            int var804 = var801 - var803 | var803 - (var803 >>> 8);
                            int var805 = var3[var736];
                            int var806 = var804 + var805;
                            int var807 = (var804 & 16711935) + (var805 & 16711935);
                            int var808 = (var806 - var807 & 65536) + (var807 & 16777472);
                            var3[var736] = var806 - var808 | var808 - (var808 >>> 8);
                        } else if (arg0 == 2) {
                            int var809 = this.field533[var735];
                            int var810 = (var809 & 16711935) * class289.field4097 & -16711936;
                            int var811 = (var809 & 65280) * class289.field4097 & 16711680;
                            int var812 = ((var810 | var811) >>> 8) + class289.field4089;
                            int var813 = var3[var736];
                            int var814 = var812 + var813;
                            int var815 = (var812 & 16711935) + (var813 & 16711935);
                            int var816 = (var814 - var815 & 65536) + (var815 & 16777472);
                            var3[var736] = var814 - var816 | var816 - (var816 >>> 8);
                        }
                    }
                    var728 += class289.field4084;
                    var729 += class289.field4095;
                    ++var730;
                }
                class289.field4088 += class289.field4106;
                class289.field4104 += class289.field4096;
                class289.field4077 += class289.field4101;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lqe;[III)V", line = 5124)
    public class35(class437 arg0, int[] arg1, int arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field533 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILfa;II)V", line = 5128)
    public final void method276(int arg0, int arg1, class217 arg2, int arg3, int arg4) {
        if (super.field4105.method2482()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field4099 + arg0;
            int var7 = super.field4087 + arg1;
            int var8 = 0;
            int var9 = super.field4105.field5995;
            int var10 = super.field4090;
            int var11 = super.field4083;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var7 * var9 + var6;
            if (var7 < super.field4105.field5985) {
                int var15 = super.field4105.field5985 - var7;
                var11 -= var15;
                var7 = super.field4105.field5985;
                var8 += var10 * var15;
                var14 += var9 * var15;
            }
            if (var7 + var11 > super.field4105.field6001) {
                var11 -= var7 + var11 - super.field4105.field6001;
            }
            if (var6 < super.field4105.field5999) {
                int var16 = super.field4105.field5999 - var6;
                var10 -= var16;
                var6 = super.field4105.field5999;
                var8 += var16;
                var14 += var16;
                var13 += var16;
                var12 += var16;
            }
            if (var6 + var10 > super.field4105.field6014) {
                int var17 = var6 + var10 - super.field4105.field6014;
                var10 -= var17;
                var13 += var17;
                var12 += var17;
            }
            if (var10 > 0 && var11 > 0) {
                class106 var18 = (class106) arg2;
                int[] var19 = var18.field1575;
                int[] var20 = var18.field1574;
                int[] var21 = super.field4105.field5986;
                int var22 = var7;
                if (arg4 > var7) {
                    var22 = arg4;
                    var14 += (arg4 - var7) * var9;
                    var8 += (arg4 - var7) * super.field4090;
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
                        int var32 = this.field533[var8++];
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
