import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class611 extends class219 {

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "[B")
    private byte[] field8796;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "[I")
    private int[] field8797;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([I[III)V", line = 4)
    public final void method908(int[] arg0, int[] arg1, int arg2, int arg3) {
        int[] var5 = super.field3424.field240;
        if (class219.field3419 == 0) {
            if (class219.field3415 == 0) {
                int var6 = class219.field3411;
                while (var6 < 0) {
                    int var7 = arg3 + var6;
                    if (var7 >= 0) {
                        if (var7 >= arg0.length) {
                            return;
                        }
                        int var8 = class219.field3409;
                        int var9 = class219.field3416;
                        int var10 = class219.field3420;
                        int var11 = class219.field3423;
                        if (var9 >= 0 && var10 >= 0 && var9 - (super.field3410 << 12) < 0 && var10 - (super.field3429 << 12) < 0) {
                            int var12 = arg0[var7] - arg2;
                            int var13 = -arg1[var7];
                            int var14 = var12 - (var8 - class219.field3409);
                            if (var14 > 0) {
                                var8 += var14;
                                var11 += var14;
                                var9 += class219.field3419 * var14;
                                var10 += class219.field3415 * var14;
                            } else {
                                var13 -= var14;
                            }
                            if (var11 < var13) {
                                var11 = var13;
                            }
                            while (var11 < 0) {
                                byte var15 = this.field8796[(var9 >> 12) + (var10 >> 12) * super.field3410];
                                if (var15 != 0) {
                                    var5[var8++] = this.field8797[var15 & 255];
                                } else {
                                    ++var8;
                                }
                                ++var11;
                            }
                        }
                    }
                    ++var6;
                    class219.field3409 += class219.field3414;
                }
            } else if (class219.field3415 < 0) {
                int var16 = class219.field3411;
                while (var16 < 0) {
                    int var17 = arg3 + var16;
                    if (var17 >= 0) {
                        if (var17 >= arg0.length) {
                            return;
                        }
                        int var18 = class219.field3409;
                        int var19 = class219.field3416;
                        int var20 = class219.field3430 + class219.field3420;
                        int var21 = class219.field3423;
                        if (var19 >= 0 && var19 - (super.field3410 << 12) < 0) {
                            int var22;
                            if ((var22 = var20 - (super.field3429 << 12)) >= 0) {
                                int var23 = (class219.field3415 - var22) / class219.field3415;
                                var21 += var23;
                                var20 += class219.field3415 * var23;
                                var18 += var23;
                            }
                            int var24;
                            if ((var24 = (var20 - class219.field3415) / class219.field3415) > var21) {
                                var21 = var24;
                            }
                            int var25 = arg0[var17] - arg2;
                            int var26 = -arg1[var17];
                            int var27 = var25 - (var18 - class219.field3409);
                            if (var27 > 0) {
                                var18 += var27;
                                var21 += var27;
                                var19 += class219.field3419 * var27;
                                var20 += class219.field3415 * var27;
                            } else {
                                var26 -= var27;
                            }
                            if (var21 < var26) {
                                var21 = var26;
                            }
                            while (var21 < 0) {
                                byte var28 = this.field8796[(var19 >> 12) + (var20 >> 12) * super.field3410];
                                if (var28 != 0) {
                                    var5[var18++] = this.field8797[var28 & 255];
                                } else {
                                    ++var18;
                                }
                                var20 += class219.field3415;
                                ++var21;
                            }
                        }
                    }
                    ++var16;
                    class219.field3416 += class219.field3428;
                    class219.field3409 += class219.field3414;
                }
            } else {
                int var29 = class219.field3411;
                while (var29 < 0) {
                    int var30 = arg3 + var29;
                    if (var30 >= 0) {
                        if (var30 >= arg0.length) {
                            return;
                        }
                        int var31 = class219.field3409;
                        int var32 = class219.field3416;
                        int var33 = class219.field3430 + class219.field3420;
                        int var34 = class219.field3423;
                        if (var32 >= 0 && var32 - (super.field3410 << 12) < 0) {
                            if (var33 < 0) {
                                int var35 = (class219.field3415 - 1 - var33) / class219.field3415;
                                var34 += var35;
                                var33 += class219.field3415 * var35;
                                var31 += var35;
                            }
                            int var36;
                            if ((var36 = (var33 + 1 - (super.field3429 << 12) - class219.field3415) / class219.field3415) > var34) {
                                var34 = var36;
                            }
                            int var37 = arg0[var30] - arg2;
                            int var38 = -arg1[var30];
                            int var39 = var37 - (var31 - class219.field3409);
                            if (var39 > 0) {
                                var31 += var39;
                                var34 += var39;
                                var32 += class219.field3419 * var39;
                                var33 += class219.field3415 * var39;
                            } else {
                                var38 -= var39;
                            }
                            if (var34 < var38) {
                                var34 = var38;
                            }
                            while (var34 < 0) {
                                byte var40 = this.field8796[(var32 >> 12) + (var33 >> 12) * super.field3410];
                                if (var40 != 0) {
                                    var5[var31++] = this.field8797[var40 & 255];
                                } else {
                                    ++var31;
                                }
                                var33 += class219.field3415;
                                ++var34;
                            }
                        }
                    }
                    ++var29;
                    class219.field3416 += class219.field3428;
                    class219.field3409 += class219.field3414;
                }
            }
        } else if (class219.field3419 < 0) {
            if (class219.field3415 == 0) {
                int var41 = class219.field3411;
                while (var41 < 0) {
                    int var42 = arg3 + var41;
                    if (var42 >= 0) {
                        if (var42 >= arg0.length) {
                            return;
                        }
                        int var43 = class219.field3409;
                        int var44 = class219.field3425 + class219.field3416;
                        int var45 = class219.field3420;
                        int var46 = class219.field3423;
                        if (var45 >= 0 && var45 - (super.field3429 << 12) < 0) {
                            int var47;
                            if ((var47 = var44 - (super.field3410 << 12)) >= 0) {
                                int var48 = (class219.field3419 - var47) / class219.field3419;
                                var46 += var48;
                                var44 += class219.field3419 * var48;
                                var43 += var48;
                            }
                            int var49;
                            if ((var49 = (var44 - class219.field3419) / class219.field3419) > var46) {
                                var46 = var49;
                            }
                            int var50 = arg0[var42] - arg2;
                            int var51 = -arg1[var42];
                            int var52 = var50 - (var43 - class219.field3409);
                            if (var52 > 0) {
                                var43 += var52;
                                var46 += var52;
                                var44 += class219.field3419 * var52;
                                var45 += class219.field3415 * var52;
                            } else {
                                var51 -= var52;
                            }
                            if (var46 < var51) {
                                var46 = var51;
                            }
                            while (var46 < 0) {
                                byte var53 = this.field8796[(var44 >> 12) + (var45 >> 12) * super.field3410];
                                if (var53 != 0) {
                                    var5[var43++] = this.field8797[var53 & 255];
                                } else {
                                    ++var43;
                                }
                                var44 += class219.field3419;
                                ++var46;
                            }
                        }
                    }
                    ++var41;
                    class219.field3420 += class219.field3435;
                    class219.field3409 += class219.field3414;
                }
            } else if (class219.field3415 < 0) {
                int var54 = class219.field3411;
                while (var54 < 0) {
                    int var55 = arg3 + var54;
                    if (var55 >= 0) {
                        if (var55 >= arg0.length) {
                            return;
                        }
                        int var56 = class219.field3409;
                        int var57 = class219.field3425 + class219.field3416;
                        int var58 = class219.field3430 + class219.field3420;
                        int var59 = class219.field3423;
                        int var60;
                        if ((var60 = var57 - (super.field3410 << 12)) >= 0) {
                            int var61 = (class219.field3419 - var60) / class219.field3419;
                            var59 += var61;
                            var57 += class219.field3419 * var61;
                            var58 += class219.field3415 * var61;
                            var56 += var61;
                        }
                        int var62;
                        if ((var62 = (var57 - class219.field3419) / class219.field3419) > var59) {
                            var59 = var62;
                        }
                        int var63;
                        if ((var63 = var58 - (super.field3429 << 12)) >= 0) {
                            int var64 = (class219.field3415 - var63) / class219.field3415;
                            var59 += var64;
                            var57 += class219.field3419 * var64;
                            var58 += class219.field3415 * var64;
                            var56 += var64;
                        }
                        int var65;
                        if ((var65 = (var58 - class219.field3415) / class219.field3415) > var59) {
                            var59 = var65;
                        }
                        int var66 = arg0[var55] - arg2;
                        int var67 = -arg1[var55];
                        int var68 = var66 - (var56 - class219.field3409);
                        if (var68 > 0) {
                            var56 += var68;
                            var59 += var68;
                            var57 += class219.field3419 * var68;
                            var58 += class219.field3415 * var68;
                        } else {
                            var67 -= var68;
                        }
                        if (var59 < var67) {
                            var59 = var67;
                        }
                        while (var59 < 0) {
                            byte var69 = this.field8796[(var57 >> 12) + (var58 >> 12) * super.field3410];
                            if (var69 != 0) {
                                var5[var56++] = this.field8797[var69 & 255];
                            } else {
                                ++var56;
                            }
                            var57 += class219.field3419;
                            var58 += class219.field3415;
                            ++var59;
                        }
                    }
                    ++var54;
                    class219.field3416 += class219.field3428;
                    class219.field3420 += class219.field3435;
                    class219.field3409 += class219.field3414;
                }
            } else {
                int var70 = class219.field3411;
                while (var70 < 0) {
                    int var71 = arg3 + var70;
                    if (var71 >= 0) {
                        if (var71 >= arg0.length) {
                            return;
                        }
                        int var72 = class219.field3409;
                        int var73 = class219.field3425 + class219.field3416;
                        int var74 = class219.field3430 + class219.field3420;
                        int var75 = class219.field3423;
                        int var76;
                        if ((var76 = var73 - (super.field3410 << 12)) >= 0) {
                            int var77 = (class219.field3419 - var76) / class219.field3419;
                            var75 += var77;
                            var73 += class219.field3419 * var77;
                            var74 += class219.field3415 * var77;
                            var72 += var77;
                        }
                        int var78;
                        if ((var78 = (var73 - class219.field3419) / class219.field3419) > var75) {
                            var75 = var78;
                        }
                        if (var74 < 0) {
                            int var79 = (class219.field3415 - 1 - var74) / class219.field3415;
                            var75 += var79;
                            var73 += class219.field3419 * var79;
                            var74 += class219.field3415 * var79;
                            var72 += var79;
                        }
                        int var80;
                        if ((var80 = (var74 + 1 - (super.field3429 << 12) - class219.field3415) / class219.field3415) > var75) {
                            var75 = var80;
                        }
                        int var81 = arg0[var71] - arg2;
                        int var82 = -arg1[var71];
                        int var83 = var81 - (var72 - class219.field3409);
                        if (var83 > 0) {
                            var72 += var83;
                            var75 += var83;
                            var73 += class219.field3419 * var83;
                            var74 += class219.field3415 * var83;
                        } else {
                            var82 -= var83;
                        }
                        if (var75 < var82) {
                            var75 = var82;
                        }
                        while (var75 < 0) {
                            byte var84 = this.field8796[(var73 >> 12) + (var74 >> 12) * super.field3410];
                            if (var84 != 0) {
                                var5[var72++] = this.field8797[var84 & 255];
                            } else {
                                ++var72;
                            }
                            var73 += class219.field3419;
                            var74 += class219.field3415;
                            ++var75;
                        }
                    }
                    ++var70;
                    class219.field3416 += class219.field3428;
                    class219.field3420 += class219.field3435;
                    class219.field3409 += class219.field3414;
                }
            }
        } else if (class219.field3415 == 0) {
            int var85 = class219.field3411;
            while (var85 < 0) {
                int var86 = arg3 + var85;
                if (var86 >= 0) {
                    if (var86 >= arg0.length) {
                        return;
                    }
                    int var87 = class219.field3409;
                    int var88 = class219.field3425 + class219.field3416;
                    int var89 = class219.field3420;
                    int var90 = class219.field3423;
                    if (var89 >= 0 && var89 - (super.field3429 << 12) < 0) {
                        if (var88 < 0) {
                            int var91 = (class219.field3419 - 1 - var88) / class219.field3419;
                            var90 += var91;
                            var88 += class219.field3419 * var91;
                            var87 += var91;
                        }
                        int var92;
                        if ((var92 = (var88 + 1 - (super.field3410 << 12) - class219.field3419) / class219.field3419) > var90) {
                            var90 = var92;
                        }
                        int var93 = arg0[var86] - arg2;
                        int var94 = -arg1[var86];
                        int var95 = var93 - (var87 - class219.field3409);
                        if (var95 > 0) {
                            var87 += var95;
                            var90 += var95;
                            var88 += class219.field3419 * var95;
                            var89 += class219.field3415 * var95;
                        } else {
                            var94 -= var95;
                        }
                        if (var90 < var94) {
                            var90 = var94;
                        }
                        while (var90 < 0) {
                            byte var96 = this.field8796[(var88 >> 12) + (var89 >> 12) * super.field3410];
                            if (var96 != 0) {
                                var5[var87++] = this.field8797[var96 & 255];
                            } else {
                                ++var87;
                            }
                            var88 += class219.field3419;
                            ++var90;
                        }
                    }
                }
                ++var85;
                class219.field3416 += class219.field3428;
                class219.field3420 += class219.field3435;
                class219.field3409 += class219.field3414;
            }
        } else if (class219.field3415 < 0) {
            int var97 = class219.field3411;
            while (var97 < 0) {
                int var98 = arg3 + var97;
                if (var98 >= 0) {
                    if (var98 >= arg0.length) {
                        return;
                    }
                    int var99 = class219.field3409;
                    int var100 = class219.field3425 + class219.field3416;
                    int var101 = class219.field3430 + class219.field3420;
                    int var102 = class219.field3423;
                    if (var100 < 0) {
                        int var103 = (class219.field3419 - 1 - var100) / class219.field3419;
                        var102 += var103;
                        var100 += class219.field3419 * var103;
                        var101 += class219.field3415 * var103;
                        var99 += var103;
                    }
                    int var104;
                    if ((var104 = (var100 + 1 - (super.field3410 << 12) - class219.field3419) / class219.field3419) > var102) {
                        var102 = var104;
                    }
                    int var105;
                    if ((var105 = var101 - (super.field3429 << 12)) >= 0) {
                        int var106 = (class219.field3415 - var105) / class219.field3415;
                        var102 += var106;
                        var100 += class219.field3419 * var106;
                        var101 += class219.field3415 * var106;
                        var99 += var106;
                    }
                    int var107;
                    if ((var107 = (var101 - class219.field3415) / class219.field3415) > var102) {
                        var102 = var107;
                    }
                    int var108 = arg0[var98] - arg2;
                    int var109 = -arg1[var98];
                    int var110 = var108 - (var99 - class219.field3409);
                    if (var110 > 0) {
                        var99 += var110;
                        var102 += var110;
                        var100 += class219.field3419 * var110;
                        var101 += class219.field3415 * var110;
                    } else {
                        var109 -= var110;
                    }
                    if (var102 < var109) {
                        var102 = var109;
                    }
                    while (var102 < 0) {
                        byte var111 = this.field8796[(var100 >> 12) + (var101 >> 12) * super.field3410];
                        if (var111 != 0) {
                            var5[var99++] = this.field8797[var111 & 255];
                        } else {
                            ++var99;
                        }
                        var100 += class219.field3419;
                        var101 += class219.field3415;
                        ++var102;
                    }
                }
                ++var97;
                class219.field3416 += class219.field3428;
                class219.field3420 += class219.field3435;
                class219.field3409 += class219.field3414;
            }
        } else {
            int var112 = class219.field3411;
            while (var112 < 0) {
                int var113 = arg3 + var112;
                if (var113 >= 0) {
                    if (var113 >= arg0.length) {
                        return;
                    }
                    int var114 = class219.field3409;
                    int var115 = class219.field3425 + class219.field3416;
                    int var116 = class219.field3430 + class219.field3420;
                    int var117 = class219.field3423;
                    if (var115 < 0) {
                        int var118 = (class219.field3419 - 1 - var115) / class219.field3419;
                        var117 += var118;
                        var115 += class219.field3419 * var118;
                        var116 += class219.field3415 * var118;
                        var114 += var118;
                    }
                    int var119;
                    if ((var119 = (var115 + 1 - (super.field3410 << 12) - class219.field3419) / class219.field3419) > var117) {
                        var117 = var119;
                    }
                    if (var116 < 0) {
                        int var120 = (class219.field3415 - 1 - var116) / class219.field3415;
                        var117 += var120;
                        var115 += class219.field3419 * var120;
                        var116 += class219.field3415 * var120;
                        var114 += var120;
                    }
                    int var121;
                    if ((var121 = (var116 + 1 - (super.field3429 << 12) - class219.field3415) / class219.field3415) > var117) {
                        var117 = var121;
                    }
                    int var122 = arg0[var113] - arg2;
                    int var123 = -arg1[var113];
                    int var124 = var122 - (var114 - class219.field3409);
                    if (var124 > 0) {
                        var114 += var124;
                        var117 += var124;
                        var115 += class219.field3419 * var124;
                        var116 += class219.field3415 * var124;
                    } else {
                        var123 -= var124;
                    }
                    if (var117 < var123) {
                        var117 = var123;
                    }
                    while (var117 < 0) {
                        byte var125 = this.field8796[(var115 >> 12) + (var116 >> 12) * super.field3410];
                        if (var125 != 0) {
                            var5[var114++] = this.field8797[var125 & 255];
                        } else {
                            ++var114;
                        }
                        var115 += class219.field3419;
                        var116 += class219.field3415;
                        ++var117;
                    }
                }
                ++var112;
                class219.field3416 += class219.field3428;
                class219.field3420 += class219.field3435;
                class219.field3409 += class219.field3414;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIIIIIII)V", line = 750)
    public final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 > 0 && arg4 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = super.field3437 + super.field3410 + super.field3421;
            int var13 = super.field3431 + super.field3429 + super.field3440;
            int var14 = (var12 << 16) / arg3;
            int var15 = (var13 << 16) / arg4;
            if (super.field3437 > 0) {
                int var16 = ((super.field3437 << 16) + var14 - 1) / var14;
                arg0 += var16;
                var10 += var14 * var16 - (super.field3437 << 16);
            }
            if (super.field3431 > 0) {
                int var17 = ((super.field3431 << 16) + var15 - 1) / var15;
                arg1 += var17;
                var11 += var15 * var17 - (super.field3431 << 16);
            }
            if (super.field3410 < var12) {
                arg3 = ((super.field3410 << 16) - var10 + var14 - 1) / var14;
            }
            if (super.field3429 < var13) {
                arg4 = ((super.field3429 << 16) - var11 + var15 - 1) / var15;
            }
            int var18 = super.field3424.field267 * arg1 + arg0;
            int var19 = super.field3424.field267 - arg3;
            if (arg1 + arg4 > super.field3424.field230) {
                arg4 -= arg1 + arg4 - super.field3424.field230;
            }
            if (arg1 < super.field3424.field257) {
                int var20 = super.field3424.field257 - arg1;
                arg4 -= var20;
                var18 += super.field3424.field267 * var20;
                var11 += var15 * var20;
            }
            if (arg0 + arg3 > super.field3424.field263) {
                int var21 = arg0 + arg3 - super.field3424.field263;
                arg3 -= var21;
                var19 += var21;
            }
            if (arg0 < super.field3424.field234) {
                int var22 = super.field3424.field234 - arg0;
                arg3 -= var22;
                var18 += var22;
                var10 += var14 * var22;
                var19 += var22;
            }
            float[] var23 = super.field3424.field260;
            int[] var24 = super.field3424.field240;
            if (arg7 == 0) {
                if (arg5 == 1) {
                    int var25 = var10;
                    for (int var26 = -arg4; var26 < 0; ++var26) {
                        int var27 = (var11 >> 16) * super.field3410;
                        for (int var28 = -arg3; var28 < 0; ++var28) {
                            if ((float) arg2 < var23[var18]) {
                                var24[var18] = this.field8797[this.field8796[(var10 >> 16) + var27] & 255];
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
                        int var34 = (var11 >> 16) * super.field3410;
                        for (int var35 = -arg3; var35 < 0; ++var35) {
                            if ((float) arg2 < var23[var18]) {
                                int var36 = this.field8797[this.field8796[(var10 >> 16) + var34] & 255];
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
                        int var42 = (var11 >> 16) * super.field3410;
                        for (int var43 = -arg3; var43 < 0; ++var43) {
                            if ((float) arg2 < var23[var18]) {
                                byte var44 = this.field8796[(var10 >> 16) + var42];
                                int var45 = var44 > 0 ? this.field8797[var44] : 0;
                                int var46 = arg6 + var45;
                                int var47 = (arg6 & 16711935) + (var45 & 16711935);
                                int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                                var24[var18] = var46 - var48 | var48 - (var48 >>> 8);
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
                    int var49 = arg6 >>> 24;
                    int var50 = 256 - var49;
                    int var51 = (arg6 & 16711935) * var50 & -16711936;
                    int var52 = (arg6 & 65280) * var50 & 16711680;
                    int var53 = (var51 | var52) >>> 8;
                    int var54 = var10;
                    for (int var55 = -arg4; var55 < 0; ++var55) {
                        int var56 = (var11 >> 16) * super.field3410;
                        for (int var57 = -arg3; var57 < 0; ++var57) {
                            if ((float) arg2 < var23[var18]) {
                                int var58 = this.field8797[this.field8796[(var10 >> 16) + var56] & 255];
                                int var59 = (var58 & 16711935) * var49 & -16711936;
                                int var60 = (var58 & 65280) * var49 & 16711680;
                                var24[var18] = ((var59 | var60) >>> 8) + var53;
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var54;
                        var18 += var19;
                    }
                }
            } else if (arg7 == 1) {
                if (arg5 == 1) {
                    int var61 = var10;
                    for (int var62 = -arg4; var62 < 0; ++var62) {
                        int var63 = (var11 >> 16) * super.field3410;
                        for (int var64 = -arg3; var64 < 0; ++var64) {
                            if ((float) arg2 < var23[var18]) {
                                byte var65 = this.field8796[(var10 >> 16) + var63];
                                if (var65 != 0) {
                                    var24[var18] = this.field8797[var65 & 255];
                                    var23[var18] = (float) arg2;
                                }
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var61;
                        var18 += var19;
                    }
                } else if (arg5 == 0) {
                    int var66 = var10;
                    if ((arg6 & 16777215) == 16777215) {
                        int var67 = arg6 >>> 24;
                        int var68 = 256 - var67;
                        for (int var69 = -arg4; var69 < 0; ++var69) {
                            int var70 = (var11 >> 16) * super.field3410;
                            for (int var71 = -arg3; var71 < 0; ++var71) {
                                if ((float) arg2 < var23[var18]) {
                                    byte var72 = this.field8796[(var10 >> 16) + var70];
                                    if (var72 != 0) {
                                        int var73 = this.field8797[var72 & 255];
                                        int var74 = var24[var18];
                                        var24[var18] = ((var73 & 16711935) * var67 + (var74 & 16711935) * var68 & -16711936) + ((var73 & 65280) * var67 + (var74 & 65280) * var68 & 16711680) >> 8;
                                        var23[var18] = (float) arg2;
                                    }
                                }
                                var10 += var14;
                                ++var18;
                            }
                            var11 += var15;
                            var10 = var66;
                            var18 += var19;
                        }
                    } else {
                        int var75 = (arg6 & 16711680) >> 16;
                        int var76 = (arg6 & 65280) >> 8;
                        int var77 = arg6 & 255;
                        int var78 = arg6 >>> 24;
                        int var79 = 256 - var78;
                        for (int var80 = -arg4; var80 < 0; ++var80) {
                            int var81 = (var11 >> 16) * super.field3410;
                            for (int var82 = -arg3; var82 < 0; ++var82) {
                                if ((float) arg2 < var23[var18]) {
                                    byte var83 = this.field8796[(var10 >> 16) + var81];
                                    if (var83 != 0) {
                                        int var84 = this.field8797[var83 & 255];
                                        if (var78 != 255) {
                                            int var85 = (var84 & 16711680) * var75 & -16777216;
                                            int var86 = (var84 & 65280) * var76 & 16711680;
                                            int var87 = (var84 & 255) * var77 & 65280;
                                            int var88 = (var85 | var86 | var87) >>> 8;
                                            int var89 = var24[var18];
                                            var24[var18] = ((var88 & 16711935) * var78 + (var89 & 16711935) * var79 & -16711936) + ((var88 & 65280) * var78 + (var89 & 65280) * var79 & 16711680) >> 8;
                                            var23[var18] = (float) arg2;
                                        } else {
                                            int var90 = (var84 & 16711680) * var75 & -16777216;
                                            int var91 = (var84 & 65280) * var76 & 16711680;
                                            int var92 = (var84 & 255) * var77 & 65280;
                                            var24[var18] = (var90 | var91 | var92) >>> 8;
                                            var23[var18] = (float) arg2;
                                        }
                                    }
                                }
                                var10 += var14;
                                ++var18;
                            }
                            var11 += var15;
                            var10 = var66;
                            var18 += var19;
                        }
                    }
                } else if (arg5 == 3) {
                    int var93 = var10;
                    int var94 = arg6 >>> 24;
                    int var95 = 256 - var94;
                    for (int var96 = -arg4; var96 < 0; ++var96) {
                        int var97 = (var11 >> 16) * super.field3410;
                        for (int var98 = -arg3; var98 < 0; ++var98) {
                            if ((float) arg2 < var23[var18]) {
                                byte var99 = this.field8796[(var10 >> 16) + var97];
                                int var100 = var99 > 0 ? this.field8797[var99] : 0;
                                int var101 = arg6 + var100;
                                int var102 = (arg6 & 16711935) + (var100 & 16711935);
                                int var103 = (var101 - var102 & 65536) + (var102 & 16777472);
                                int var104 = var101 - var103 | var103 - (var103 >>> 8);
                                if (var100 == 0 && var94 != 255) {
                                    int var106 = var24[var18];
                                    var104 = ((var104 & 16711935) * var94 + (var106 & 16711935) * var95 & -16711936) + ((var104 & 65280) * var94 + (var106 & 65280) * var95 & 16711680) >> 8;
                                }
                                var24[var18] = var104;
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var93;
                        var18 += var19;
                    }
                } else if (arg5 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var107 = arg6 >>> 24;
                    int var108 = 256 - var107;
                    int var109 = (arg6 & 16711935) * var108 & -16711936;
                    int var110 = (arg6 & 65280) * var108 & 16711680;
                    int var111 = (var109 | var110) >>> 8;
                    int var112 = var10;
                    for (int var113 = -arg4; var113 < 0; ++var113) {
                        int var114 = (var11 >> 16) * super.field3410;
                        for (int var115 = -arg3; var115 < 0; ++var115) {
                            if ((float) arg2 < var23[var18]) {
                                byte var116 = this.field8796[(var10 >> 16) + var114];
                                if (var116 != 0) {
                                    int var117 = this.field8797[var116 & 255];
                                    int var118 = (var117 & 16711935) * var107 & -16711936;
                                    int var119 = (var117 & 65280) * var107 & 16711680;
                                    var24[var18] = ((var118 | var119) >>> 8) + var111;
                                    var23[var18] = (float) arg2;
                                }
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var112;
                        var18 += var19;
                    }
                }
            } else if (arg7 != 2) {
                throw new IllegalArgumentException();
            } else if (arg5 == 1) {
                int var120 = var10;
                for (int var121 = -arg4; var121 < 0; ++var121) {
                    int var122 = (var11 >> 16) * super.field3410;
                    for (int var123 = -arg3; var123 < 0; ++var123) {
                        if ((float) arg2 < var23[var18]) {
                            byte var124 = this.field8796[(var10 >> 16) + var122];
                            if (var124 != 0) {
                                int var125 = this.field8797[var124 & 255];
                                int var126 = var24[var18];
                                int var127 = var125 + var126;
                                int var128 = (var125 & 16711935) + (var126 & 16711935);
                                int var129 = (var127 - var128 & 65536) + (var128 & 16777472);
                                var24[var18] = var127 - var129 | var129 - (var129 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var120;
                    var18 += var19;
                }
            } else if (arg5 == 0) {
                int var130 = var10;
                int var131 = (arg6 & 16711680) >> 16;
                int var132 = (arg6 & 65280) >> 8;
                int var133 = arg6 & 255;
                for (int var134 = -arg4; var134 < 0; ++var134) {
                    int var135 = (var11 >> 16) * super.field3410;
                    for (int var136 = -arg3; var136 < 0; ++var136) {
                        if ((float) arg2 < var23[var18]) {
                            byte var137 = this.field8796[(var10 >> 16) + var135];
                            if (var137 != 0) {
                                int var138 = this.field8797[var137 & 255];
                                int var139 = (var138 & 16711680) * var131 & -16777216;
                                int var140 = (var138 & 65280) * var132 & 16711680;
                                int var141 = (var138 & 255) * var133 & 65280;
                                int var142 = (var139 | var140 | var141) >>> 8;
                                int var143 = var24[var18];
                                int var144 = var142 + var143;
                                int var145 = (var142 & 16711935) + (var143 & 16711935);
                                int var146 = (var144 - var145 & 65536) + (var145 & 16777472);
                                var24[var18] = var144 - var146 | var146 - (var146 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var130;
                    var18 += var19;
                }
            } else if (arg5 == 3) {
                int var147 = var10;
                for (int var148 = -arg4; var148 < 0; ++var148) {
                    int var149 = (var11 >> 16) * super.field3410;
                    for (int var150 = -arg3; var150 < 0; ++var150) {
                        if ((float) arg2 < var23[var18]) {
                            byte var151 = this.field8796[(var10 >> 16) + var149];
                            int var152 = var151 > 0 ? this.field8797[var151] : 0;
                            int var153 = arg6 + var152;
                            int var154 = (arg6 & 16711935) + (var152 & 16711935);
                            int var155 = (var153 - var154 & 65536) + (var154 & 16777472);
                            int var156 = var153 - var155 | var155 - (var155 >>> 8);
                            int var157 = var24[var18];
                            int var158 = var156 + var157;
                            int var159 = (var156 & 16711935) + (var157 & 16711935);
                            int var160 = (var158 - var159 & 65536) + (var159 & 16777472);
                            var24[var18] = var158 - var160 | var160 - (var160 >>> 8);
                            var23[var18] = (float) arg2;
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var147;
                    var18 += var19;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var161 = arg6 >>> 24;
                int var162 = 256 - var161;
                int var163 = (arg6 & 16711935) * var162 & -16711936;
                int var164 = (arg6 & 65280) * var162 & 16711680;
                int var165 = (var163 | var164) >>> 8;
                int var166 = var10;
                for (int var167 = -arg4; var167 < 0; ++var167) {
                    int var168 = (var11 >> 16) * super.field3410;
                    for (int var169 = -arg3; var169 < 0; ++var169) {
                        if ((float) arg2 < var23[var18]) {
                            byte var170 = this.field8796[(var10 >> 16) + var168];
                            if (var170 != 0) {
                                int var171 = this.field8797[var170 & 255];
                                int var172 = (var171 & 16711935) * var161 & -16711936;
                                int var173 = (var171 & 65280) * var161 & 16711680;
                                int var174 = ((var172 | var173) >>> 8) + var165;
                                int var175 = var24[var18];
                                int var176 = var174 + var175;
                                int var177 = (var174 & 16711935) + (var175 & 16711935);
                                int var178 = (var176 - var177 & 65536) + (var177 & 16777472);
                                var24[var18] = var176 - var178 | var178 - (var178 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var166;
                    var18 += var19;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V", line = 1548)
    public final void method910(int arg0, int arg1) {
        int[] var3 = super.field3424.field240;
        if (class219.field3419 == 0) {
            if (class219.field3415 == 0) {
                int var4 = class219.field3411;
                while (var4 < 0) {
                    int var5 = class219.field3409;
                    int var6 = class219.field3416;
                    int var7 = class219.field3420;
                    int var8 = class219.field3423;
                    if (var6 >= 0 && var7 >= 0 && var6 - (super.field3410 << 12) < 0 && var7 - (super.field3429 << 12) < 0) {
                        while (var8 < 0) {
                            int var9 = (var6 >> 12) + (var7 >> 12) * super.field3410;
                            int var10 = var5++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var10] = this.field8797[this.field8796[var9] & 255];
                                } else if (arg0 == 0) {
                                    int var14 = this.field8797[this.field8796[var9] & 255];
                                    int var15 = (var14 & 16711680) * class219.field3408 & -16777216;
                                    int var16 = (var14 & 65280) * class219.field3439 & 16711680;
                                    int var17 = (var14 & 255) * class219.field3412 & 65280;
                                    var3[var10] = (var15 | var16 | var17) >>> 8;
                                } else if (arg0 == 3) {
                                    int var18 = this.field8797[this.field8796[var9] & 255];
                                    int var19 = class219.field3434;
                                    int var20 = var18 + var19;
                                    int var21 = (var18 & 16711935) + (var19 & 16711935);
                                    int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                                    var3[var10] = var20 - var22 | var22 - (var22 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var23 = this.field8797[this.field8796[var9] & 255];
                                    int var24 = (var23 & 16711935) * class219.field3422 & -16711936;
                                    int var25 = (var23 & 65280) * class219.field3422 & 16711680;
                                    var3[var10] = ((var24 | var25) >>> 8) + class219.field3413;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var26 = this.field8796[var9];
                                    if (var26 != 0) {
                                        var3[var10] = this.field8797[var26 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var27 = this.field8796[var9];
                                    if (var27 != 0) {
                                        int var28 = this.field8797[var27 & 255];
                                        if ((class219.field3434 & 16777215) == 16777215) {
                                            int var29 = class219.field3434 >>> 24;
                                            int var30 = 256 - var29;
                                            int var31 = var3[var10];
                                            var3[var10] = ((var28 & 16711935) * var29 + (var31 & 16711935) * var30 & -16711936) + ((var28 & 65280) * var29 + (var31 & 65280) * var30 & 16711680) >> 8;
                                        } else if (class219.field3422 != 255) {
                                            int var32 = (var28 & 16711680) * class219.field3408 & -16777216;
                                            int var33 = (var28 & 65280) * class219.field3439 & 16711680;
                                            int var34 = (var28 & 255) * class219.field3412 & 65280;
                                            int var35 = (var32 | var33 | var34) >>> 8;
                                            int var36 = var3[var10];
                                            var3[var10] = ((var35 & 16711935) * class219.field3422 + (var36 & 16711935) * class219.field3417 & -16711936) + ((var35 & 65280) * class219.field3422 + (var36 & 65280) * class219.field3417 & 16711680) >> 8;
                                        } else {
                                            int var37 = (var28 & 16711680) * class219.field3408 & -16777216;
                                            int var38 = (var28 & 65280) * class219.field3439 & 16711680;
                                            int var39 = (var28 & 255) * class219.field3412 & 65280;
                                            var3[var10] = (var37 | var38 | var39) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var40 = this.field8796[var9];
                                    int var41 = var40 > 0 ? this.field8797[var40] : 0;
                                    int var42 = class219.field3434;
                                    int var43 = var41 + var42;
                                    int var44 = (var41 & 16711935) + (var42 & 16711935);
                                    int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                                    int var46 = var43 - var45 | var45 - (var45 >>> 8);
                                    if (var41 == 0 && class219.field3422 != 255) {
                                        int var48 = var3[var10];
                                        var46 = ((var46 & 16711935) * class219.field3422 + (var48 & 16711935) * class219.field3417 & -16711936) + ((var46 & 65280) * class219.field3422 + (var48 & 65280) * class219.field3417 & 16711680) >> 8;
                                    }
                                    var3[var10] = var46;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var49 = this.field8796[var9];
                                    if (var49 != 0) {
                                        int var50 = this.field8797[var49 & 255];
                                        int var51 = (var50 & 16711935) * class219.field3422 & -16711936;
                                        int var52 = (var50 & 65280) * class219.field3422 & 16711680;
                                        var3[var10++] = ((var51 | var52) >>> 8) + class219.field3413;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var53 = this.field8796[var9];
                                    if (var53 != 0) {
                                        int var54 = this.field8797[var53 & 255];
                                        int var55 = var3[var10];
                                        int var56 = var54 + var55;
                                        int var57 = (var54 & 16711935) + (var55 & 16711935);
                                        int var58 = (var56 - var57 & 65536) + (var57 & 16777472);
                                        var3[var10] = var56 - var58 | var58 - (var58 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var59 = this.field8796[var9];
                                    if (var59 != 0) {
                                        int var60 = this.field8797[var59 & 255];
                                        int var61 = (var60 & 16711680) * class219.field3408 & -16777216;
                                        int var62 = (var60 & 65280) * class219.field3439 & 16711680;
                                        int var63 = (var60 & 255) * class219.field3412 & 65280;
                                        int var64 = (var61 | var62 | var63) >>> 8;
                                        int var65 = var3[var10];
                                        int var66 = var64 + var65;
                                        int var67 = (var64 & 16711935) + (var65 & 16711935);
                                        int var68 = (var66 - var67 & 65536) + (var67 & 16777472);
                                        var3[var10] = var66 - var68 | var68 - (var68 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var69 = this.field8796[var9];
                                    int var70 = var69 > 0 ? this.field8797[var69] : 0;
                                    int var71 = class219.field3434;
                                    int var72 = var70 + var71;
                                    int var73 = (var70 & 16711935) + (var71 & 16711935);
                                    int var74 = (var72 - var73 & 65536) + (var73 & 16777472);
                                    int var75 = var72 - var74 | var74 - (var74 >>> 8);
                                    if (var70 == 0 && class219.field3422 != 255) {
                                        int var77 = var3[var10];
                                        var75 = ((var75 & 16711935) * class219.field3422 + (var77 & 16711935) * class219.field3417 & -16711936) + ((var75 & 65280) * class219.field3422 + (var77 & 65280) * class219.field3417 & 16711680) >> 8;
                                    }
                                    var3[var10] = var75;
                                } else if (arg0 == 2) {
                                    byte var78 = this.field8796[var9];
                                    if (var78 != 0) {
                                        int var79 = this.field8797[var78 & 255];
                                        int var80 = (var79 & 16711935) * class219.field3422 & -16711936;
                                        int var81 = (var79 & 65280) * class219.field3422 & 16711680;
                                        int var82 = ((var80 | var81) >>> 8) + class219.field3413;
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
                    class219.field3409 += class219.field3414;
                }
            } else if (class219.field3415 < 0) {
                int var87 = class219.field3411;
                while (var87 < 0) {
                    int var88 = class219.field3409;
                    int var89 = class219.field3416;
                    int var90 = class219.field3430 + class219.field3420;
                    int var91 = class219.field3423;
                    if (var89 >= 0 && var89 - (super.field3410 << 12) < 0) {
                        int var92;
                        if ((var92 = var90 - (super.field3429 << 12)) >= 0) {
                            int var93 = (class219.field3415 - var92) / class219.field3415;
                            var91 += var93;
                            var90 += class219.field3415 * var93;
                            var88 += var93;
                        }
                        int var94;
                        if ((var94 = (var90 - class219.field3415) / class219.field3415) > var91) {
                            var91 = var94;
                        }
                        while (var91 < 0) {
                            int var95 = (var89 >> 12) + (var90 >> 12) * super.field3410;
                            int var96 = var88++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var96] = this.field8797[this.field8796[var95] & 255];
                                } else if (arg0 == 0) {
                                    int var100 = this.field8797[this.field8796[var95] & 255];
                                    int var101 = (var100 & 16711680) * class219.field3408 & -16777216;
                                    int var102 = (var100 & 65280) * class219.field3439 & 16711680;
                                    int var103 = (var100 & 255) * class219.field3412 & 65280;
                                    var3[var96] = (var101 | var102 | var103) >>> 8;
                                } else if (arg0 == 3) {
                                    int var104 = this.field8797[this.field8796[var95] & 255];
                                    int var105 = class219.field3434;
                                    int var106 = var104 + var105;
                                    int var107 = (var104 & 16711935) + (var105 & 16711935);
                                    int var108 = (var106 - var107 & 65536) + (var107 & 16777472);
                                    var3[var96] = var106 - var108 | var108 - (var108 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var109 = this.field8797[this.field8796[var95] & 255];
                                    int var110 = (var109 & 16711935) * class219.field3422 & -16711936;
                                    int var111 = (var109 & 65280) * class219.field3422 & 16711680;
                                    var3[var96] = ((var110 | var111) >>> 8) + class219.field3413;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var112 = this.field8796[var95];
                                    if (var112 != 0) {
                                        var3[var96] = this.field8797[var112 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var113 = this.field8796[var95];
                                    if (var113 != 0) {
                                        int var114 = this.field8797[var113 & 255];
                                        if ((class219.field3434 & 16777215) == 16777215) {
                                            int var115 = class219.field3434 >>> 24;
                                            int var116 = 256 - var115;
                                            int var117 = var3[var96];
                                            var3[var96] = ((var114 & 16711935) * var115 + (var117 & 16711935) * var116 & -16711936) + ((var114 & 65280) * var115 + (var117 & 65280) * var116 & 16711680) >> 8;
                                        } else if (class219.field3422 != 255) {
                                            int var118 = (var114 & 16711680) * class219.field3408 & -16777216;
                                            int var119 = (var114 & 65280) * class219.field3439 & 16711680;
                                            int var120 = (var114 & 255) * class219.field3412 & 65280;
                                            int var121 = (var118 | var119 | var120) >>> 8;
                                            int var122 = var3[var96];
                                            var3[var96] = ((var121 & 16711935) * class219.field3422 + (var122 & 16711935) * class219.field3417 & -16711936) + ((var121 & 65280) * class219.field3422 + (var122 & 65280) * class219.field3417 & 16711680) >> 8;
                                        } else {
                                            int var123 = (var114 & 16711680) * class219.field3408 & -16777216;
                                            int var124 = (var114 & 65280) * class219.field3439 & 16711680;
                                            int var125 = (var114 & 255) * class219.field3412 & 65280;
                                            var3[var96] = (var123 | var124 | var125) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var126 = this.field8796[var95];
                                    int var127 = var126 > 0 ? this.field8797[var126] : 0;
                                    int var128 = class219.field3434;
                                    int var129 = var127 + var128;
                                    int var130 = (var127 & 16711935) + (var128 & 16711935);
                                    int var131 = (var129 - var130 & 65536) + (var130 & 16777472);
                                    int var132 = var129 - var131 | var131 - (var131 >>> 8);
                                    if (var127 == 0 && class219.field3422 != 255) {
                                        int var134 = var3[var96];
                                        var132 = ((var132 & 16711935) * class219.field3422 + (var134 & 16711935) * class219.field3417 & -16711936) + ((var132 & 65280) * class219.field3422 + (var134 & 65280) * class219.field3417 & 16711680) >> 8;
                                    }
                                    var3[var96] = var132;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var135 = this.field8796[var95];
                                    if (var135 != 0) {
                                        int var136 = this.field8797[var135 & 255];
                                        int var137 = (var136 & 16711935) * class219.field3422 & -16711936;
                                        int var138 = (var136 & 65280) * class219.field3422 & 16711680;
                                        var3[var96++] = ((var137 | var138) >>> 8) + class219.field3413;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var139 = this.field8796[var95];
                                    if (var139 != 0) {
                                        int var140 = this.field8797[var139 & 255];
                                        int var141 = var3[var96];
                                        int var142 = var140 + var141;
                                        int var143 = (var140 & 16711935) + (var141 & 16711935);
                                        int var144 = (var142 - var143 & 65536) + (var143 & 16777472);
                                        var3[var96] = var142 - var144 | var144 - (var144 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var145 = this.field8796[var95];
                                    if (var145 != 0) {
                                        int var146 = this.field8797[var145 & 255];
                                        int var147 = (var146 & 16711680) * class219.field3408 & -16777216;
                                        int var148 = (var146 & 65280) * class219.field3439 & 16711680;
                                        int var149 = (var146 & 255) * class219.field3412 & 65280;
                                        int var150 = (var147 | var148 | var149) >>> 8;
                                        int var151 = var3[var96];
                                        int var152 = var150 + var151;
                                        int var153 = (var150 & 16711935) + (var151 & 16711935);
                                        int var154 = (var152 - var153 & 65536) + (var153 & 16777472);
                                        var3[var96] = var152 - var154 | var154 - (var154 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var155 = this.field8796[var95];
                                    int var156 = var155 > 0 ? this.field8797[var155] : 0;
                                    int var157 = class219.field3434;
                                    int var158 = var156 + var157;
                                    int var159 = (var156 & 16711935) + (var157 & 16711935);
                                    int var160 = (var158 - var159 & 65536) + (var159 & 16777472);
                                    int var161 = var158 - var160 | var160 - (var160 >>> 8);
                                    if (var156 == 0 && class219.field3422 != 255) {
                                        int var163 = var3[var96];
                                        var161 = ((var161 & 16711935) * class219.field3422 + (var163 & 16711935) * class219.field3417 & -16711936) + ((var161 & 65280) * class219.field3422 + (var163 & 65280) * class219.field3417 & 16711680) >> 8;
                                    }
                                    var3[var96] = var161;
                                } else if (arg0 == 2) {
                                    byte var164 = this.field8796[var95];
                                    if (var164 != 0) {
                                        int var165 = this.field8797[var164 & 255];
                                        int var166 = (var165 & 16711935) * class219.field3422 & -16711936;
                                        int var167 = (var165 & 65280) * class219.field3422 & 16711680;
                                        int var168 = ((var166 | var167) >>> 8) + class219.field3413;
                                        int var169 = var3[var96];
                                        int var170 = var168 + var169;
                                        int var171 = (var168 & 16711935) + (var169 & 16711935);
                                        int var172 = (var170 - var171 & 65536) + (var171 & 16777472);
                                        var3[var96] = var170 - var172 | var172 - (var172 >>> 8);
                                    }
                                }
                            }
                            var90 += class219.field3415;
                            ++var91;
                        }
                    }
                    ++var87;
                    class219.field3416 += class219.field3428;
                    class219.field3409 += class219.field3414;
                }
            } else {
                int var173 = class219.field3411;
                while (var173 < 0) {
                    int var174 = class219.field3409;
                    int var175 = class219.field3416;
                    int var176 = class219.field3430 + class219.field3420;
                    int var177 = class219.field3423;
                    if (var175 >= 0 && var175 - (super.field3410 << 12) < 0) {
                        if (var176 < 0) {
                            int var178 = (class219.field3415 - 1 - var176) / class219.field3415;
                            var177 += var178;
                            var176 += class219.field3415 * var178;
                            var174 += var178;
                        }
                        int var179;
                        if ((var179 = (var176 + 1 - (super.field3429 << 12) - class219.field3415) / class219.field3415) > var177) {
                            var177 = var179;
                        }
                        while (var177 < 0) {
                            int var180 = (var175 >> 12) + (var176 >> 12) * super.field3410;
                            int var181 = var174++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var181] = this.field8797[this.field8796[var180] & 255];
                                } else if (arg0 == 0) {
                                    int var185 = this.field8797[this.field8796[var180] & 255];
                                    int var186 = (var185 & 16711680) * class219.field3408 & -16777216;
                                    int var187 = (var185 & 65280) * class219.field3439 & 16711680;
                                    int var188 = (var185 & 255) * class219.field3412 & 65280;
                                    var3[var181] = (var186 | var187 | var188) >>> 8;
                                } else if (arg0 == 3) {
                                    int var189 = this.field8797[this.field8796[var180] & 255];
                                    int var190 = class219.field3434;
                                    int var191 = var189 + var190;
                                    int var192 = (var189 & 16711935) + (var190 & 16711935);
                                    int var193 = (var191 - var192 & 65536) + (var192 & 16777472);
                                    var3[var181] = var191 - var193 | var193 - (var193 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var194 = this.field8797[this.field8796[var180] & 255];
                                    int var195 = (var194 & 16711935) * class219.field3422 & -16711936;
                                    int var196 = (var194 & 65280) * class219.field3422 & 16711680;
                                    var3[var181] = ((var195 | var196) >>> 8) + class219.field3413;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var197 = this.field8796[var180];
                                    if (var197 != 0) {
                                        var3[var181] = this.field8797[var197 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var198 = this.field8796[var180];
                                    if (var198 != 0) {
                                        int var199 = this.field8797[var198 & 255];
                                        if ((class219.field3434 & 16777215) == 16777215) {
                                            int var200 = class219.field3434 >>> 24;
                                            int var201 = 256 - var200;
                                            int var202 = var3[var181];
                                            var3[var181] = ((var199 & 16711935) * var200 + (var202 & 16711935) * var201 & -16711936) + ((var199 & 65280) * var200 + (var202 & 65280) * var201 & 16711680) >> 8;
                                        } else if (class219.field3422 != 255) {
                                            int var203 = (var199 & 16711680) * class219.field3408 & -16777216;
                                            int var204 = (var199 & 65280) * class219.field3439 & 16711680;
                                            int var205 = (var199 & 255) * class219.field3412 & 65280;
                                            int var206 = (var203 | var204 | var205) >>> 8;
                                            int var207 = var3[var181];
                                            var3[var181] = ((var206 & 16711935) * class219.field3422 + (var207 & 16711935) * class219.field3417 & -16711936) + ((var206 & 65280) * class219.field3422 + (var207 & 65280) * class219.field3417 & 16711680) >> 8;
                                        } else {
                                            int var208 = (var199 & 16711680) * class219.field3408 & -16777216;
                                            int var209 = (var199 & 65280) * class219.field3439 & 16711680;
                                            int var210 = (var199 & 255) * class219.field3412 & 65280;
                                            var3[var181] = (var208 | var209 | var210) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var211 = this.field8796[var180];
                                    int var212 = var211 > 0 ? this.field8797[var211] : 0;
                                    int var213 = class219.field3434;
                                    int var214 = var212 + var213;
                                    int var215 = (var212 & 16711935) + (var213 & 16711935);
                                    int var216 = (var214 - var215 & 65536) + (var215 & 16777472);
                                    int var217 = var214 - var216 | var216 - (var216 >>> 8);
                                    if (var212 == 0 && class219.field3422 != 255) {
                                        int var219 = var3[var181];
                                        var217 = ((var217 & 16711935) * class219.field3422 + (var219 & 16711935) * class219.field3417 & -16711936) + ((var217 & 65280) * class219.field3422 + (var219 & 65280) * class219.field3417 & 16711680) >> 8;
                                    }
                                    var3[var181] = var217;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var220 = this.field8796[var180];
                                    if (var220 != 0) {
                                        int var221 = this.field8797[var220 & 255];
                                        int var222 = (var221 & 16711935) * class219.field3422 & -16711936;
                                        int var223 = (var221 & 65280) * class219.field3422 & 16711680;
                                        var3[var181++] = ((var222 | var223) >>> 8) + class219.field3413;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var224 = this.field8796[var180];
                                    if (var224 != 0) {
                                        int var225 = this.field8797[var224 & 255];
                                        int var226 = var3[var181];
                                        int var227 = var225 + var226;
                                        int var228 = (var225 & 16711935) + (var226 & 16711935);
                                        int var229 = (var227 - var228 & 65536) + (var228 & 16777472);
                                        var3[var181] = var227 - var229 | var229 - (var229 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var230 = this.field8796[var180];
                                    if (var230 != 0) {
                                        int var231 = this.field8797[var230 & 255];
                                        int var232 = (var231 & 16711680) * class219.field3408 & -16777216;
                                        int var233 = (var231 & 65280) * class219.field3439 & 16711680;
                                        int var234 = (var231 & 255) * class219.field3412 & 65280;
                                        int var235 = (var232 | var233 | var234) >>> 8;
                                        int var236 = var3[var181];
                                        int var237 = var235 + var236;
                                        int var238 = (var235 & 16711935) + (var236 & 16711935);
                                        int var239 = (var237 - var238 & 65536) + (var238 & 16777472);
                                        var3[var181] = var237 - var239 | var239 - (var239 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var240 = this.field8796[var180];
                                    int var241 = var240 > 0 ? this.field8797[var240] : 0;
                                    int var242 = class219.field3434;
                                    int var243 = var241 + var242;
                                    int var244 = (var241 & 16711935) + (var242 & 16711935);
                                    int var245 = (var243 - var244 & 65536) + (var244 & 16777472);
                                    int var246 = var243 - var245 | var245 - (var245 >>> 8);
                                    if (var241 == 0 && class219.field3422 != 255) {
                                        int var248 = var3[var181];
                                        var246 = ((var246 & 16711935) * class219.field3422 + (var248 & 16711935) * class219.field3417 & -16711936) + ((var246 & 65280) * class219.field3422 + (var248 & 65280) * class219.field3417 & 16711680) >> 8;
                                    }
                                    var3[var181] = var246;
                                } else if (arg0 == 2) {
                                    byte var249 = this.field8796[var180];
                                    if (var249 != 0) {
                                        int var250 = this.field8797[var249 & 255];
                                        int var251 = (var250 & 16711935) * class219.field3422 & -16711936;
                                        int var252 = (var250 & 65280) * class219.field3422 & 16711680;
                                        int var253 = ((var251 | var252) >>> 8) + class219.field3413;
                                        int var254 = var3[var181];
                                        int var255 = var253 + var254;
                                        int var256 = (var253 & 16711935) + (var254 & 16711935);
                                        int var257 = (var255 - var256 & 65536) + (var256 & 16777472);
                                        var3[var181] = var255 - var257 | var257 - (var257 >>> 8);
                                    }
                                }
                            }
                            var176 += class219.field3415;
                            ++var177;
                        }
                    }
                    ++var173;
                    class219.field3416 += class219.field3428;
                    class219.field3409 += class219.field3414;
                }
            }
        } else if (class219.field3419 < 0) {
            if (class219.field3415 == 0) {
                int var258 = class219.field3411;
                while (var258 < 0) {
                    int var259 = class219.field3409;
                    int var260 = class219.field3425 + class219.field3416;
                    int var261 = class219.field3420;
                    int var262 = class219.field3423;
                    if (var261 >= 0 && var261 - (super.field3429 << 12) < 0) {
                        int var263;
                        if ((var263 = var260 - (super.field3410 << 12)) >= 0) {
                            int var264 = (class219.field3419 - var263) / class219.field3419;
                            var262 += var264;
                            var260 += class219.field3419 * var264;
                            var259 += var264;
                        }
                        int var265;
                        if ((var265 = (var260 - class219.field3419) / class219.field3419) > var262) {
                            var262 = var265;
                        }
                        while (var262 < 0) {
                            int var266 = (var260 >> 12) + (var261 >> 12) * super.field3410;
                            int var267 = var259++;
                            if (arg1 == 0) {
                                if (arg0 == 1) {
                                    var3[var267] = this.field8797[this.field8796[var266] & 255];
                                } else if (arg0 == 0) {
                                    int var271 = this.field8797[this.field8796[var266] & 255];
                                    int var272 = (var271 & 16711680) * class219.field3408 & -16777216;
                                    int var273 = (var271 & 65280) * class219.field3439 & 16711680;
                                    int var274 = (var271 & 255) * class219.field3412 & 65280;
                                    var3[var267] = (var272 | var273 | var274) >>> 8;
                                } else if (arg0 == 3) {
                                    int var275 = this.field8797[this.field8796[var266] & 255];
                                    int var276 = class219.field3434;
                                    int var277 = var275 + var276;
                                    int var278 = (var275 & 16711935) + (var276 & 16711935);
                                    int var279 = (var277 - var278 & 65536) + (var278 & 16777472);
                                    var3[var267] = var277 - var279 | var279 - (var279 >>> 8);
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    int var280 = this.field8797[this.field8796[var266] & 255];
                                    int var281 = (var280 & 16711935) * class219.field3422 & -16711936;
                                    int var282 = (var280 & 65280) * class219.field3422 & 16711680;
                                    var3[var267] = ((var281 | var282) >>> 8) + class219.field3413;
                                }
                            } else if (arg1 == 1) {
                                if (arg0 == 1) {
                                    byte var283 = this.field8796[var266];
                                    if (var283 != 0) {
                                        var3[var267] = this.field8797[var283 & 255];
                                    }
                                } else if (arg0 == 0) {
                                    byte var284 = this.field8796[var266];
                                    if (var284 != 0) {
                                        int var285 = this.field8797[var284 & 255];
                                        if ((class219.field3434 & 16777215) == 16777215) {
                                            int var286 = class219.field3434 >>> 24;
                                            int var287 = 256 - var286;
                                            int var288 = var3[var267];
                                            var3[var267] = ((var285 & 16711935) * var286 + (var288 & 16711935) * var287 & -16711936) + ((var285 & 65280) * var286 + (var288 & 65280) * var287 & 16711680) >> 8;
                                        } else if (class219.field3422 != 255) {
                                            int var289 = (var285 & 16711680) * class219.field3408 & -16777216;
                                            int var290 = (var285 & 65280) * class219.field3439 & 16711680;
                                            int var291 = (var285 & 255) * class219.field3412 & 65280;
                                            int var292 = (var289 | var290 | var291) >>> 8;
                                            int var293 = var3[var267];
                                            var3[var267] = ((var292 & 16711935) * class219.field3422 + (var293 & 16711935) * class219.field3417 & -16711936) + ((var292 & 65280) * class219.field3422 + (var293 & 65280) * class219.field3417 & 16711680) >> 8;
                                        } else {
                                            int var294 = (var285 & 16711680) * class219.field3408 & -16777216;
                                            int var295 = (var285 & 65280) * class219.field3439 & 16711680;
                                            int var296 = (var285 & 255) * class219.field3412 & 65280;
                                            var3[var267] = (var294 | var295 | var296) >>> 8;
                                        }
                                    }
                                } else if (arg0 == 3) {
                                    byte var297 = this.field8796[var266];
                                    int var298 = var297 > 0 ? this.field8797[var297] : 0;
                                    int var299 = class219.field3434;
                                    int var300 = var298 + var299;
                                    int var301 = (var298 & 16711935) + (var299 & 16711935);
                                    int var302 = (var300 - var301 & 65536) + (var301 & 16777472);
                                    int var303 = var300 - var302 | var302 - (var302 >>> 8);
                                    if (var298 == 0 && class219.field3422 != 255) {
                                        int var305 = var3[var267];
                                        var303 = ((var303 & 16711935) * class219.field3422 + (var305 & 16711935) * class219.field3417 & -16711936) + ((var303 & 65280) * class219.field3422 + (var305 & 65280) * class219.field3417 & 16711680) >> 8;
                                    }
                                    var3[var267] = var303;
                                } else {
                                    if (arg0 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    byte var306 = this.field8796[var266];
                                    if (var306 != 0) {
                                        int var307 = this.field8797[var306 & 255];
                                        int var308 = (var307 & 16711935) * class219.field3422 & -16711936;
                                        int var309 = (var307 & 65280) * class219.field3422 & 16711680;
                                        var3[var267++] = ((var308 | var309) >>> 8) + class219.field3413;
                                    }
                                }
                            } else {
                                if (arg1 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                if (arg0 == 1) {
                                    byte var310 = this.field8796[var266];
                                    if (var310 != 0) {
                                        int var311 = this.field8797[var310 & 255];
                                        int var312 = var3[var267];
                                        int var313 = var311 + var312;
                                        int var314 = (var311 & 16711935) + (var312 & 16711935);
                                        int var315 = (var313 - var314 & 65536) + (var314 & 16777472);
                                        var3[var267] = var313 - var315 | var315 - (var315 >>> 8);
                                    }
                                } else if (arg0 == 0) {
                                    byte var316 = this.field8796[var266];
                                    if (var316 != 0) {
                                        int var317 = this.field8797[var316 & 255];
                                        int var318 = (var317 & 16711680) * class219.field3408 & -16777216;
                                        int var319 = (var317 & 65280) * class219.field3439 & 16711680;
                                        int var320 = (var317 & 255) * class219.field3412 & 65280;
                                        int var321 = (var318 | var319 | var320) >>> 8;
                                        int var322 = var3[var267];
                                        int var323 = var321 + var322;
                                        int var324 = (var321 & 16711935) + (var322 & 16711935);
                                        int var325 = (var323 - var324 & 65536) + (var324 & 16777472);
                                        var3[var267] = var323 - var325 | var325 - (var325 >>> 8);
                                    }
                                } else if (arg0 == 3) {
                                    byte var326 = this.field8796[var266];
                                    int var327 = var326 > 0 ? this.field8797[var326] : 0;
                                    int var328 = class219.field3434;
                                    int var329 = var327 + var328;
                                    int var330 = (var327 & 16711935) + (var328 & 16711935);
                                    int var331 = (var329 - var330 & 65536) + (var330 & 16777472);
                                    int var332 = var329 - var331 | var331 - (var331 >>> 8);
                                    if (var327 == 0 && class219.field3422 != 255) {
                                        int var334 = var3[var267];
                                        var332 = ((var332 & 16711935) * class219.field3422 + (var334 & 16711935) * class219.field3417 & -16711936) + ((var332 & 65280) * class219.field3422 + (var334 & 65280) * class219.field3417 & 16711680) >> 8;
                                    }
                                    var3[var267] = var332;
                                } else if (arg0 == 2) {
                                    byte var335 = this.field8796[var266];
                                    if (var335 != 0) {
                                        int var336 = this.field8797[var335 & 255];
                                        int var337 = (var336 & 16711935) * class219.field3422 & -16711936;
                                        int var338 = (var336 & 65280) * class219.field3422 & 16711680;
                                        int var339 = ((var337 | var338) >>> 8) + class219.field3413;
                                        int var340 = var3[var267];
                                        int var341 = var339 + var340;
                                        int var342 = (var339 & 16711935) + (var340 & 16711935);
                                        int var343 = (var341 - var342 & 65536) + (var342 & 16777472);
                                        var3[var267] = var341 - var343 | var343 - (var343 >>> 8);
                                    }
                                }
                            }
                            var260 += class219.field3419;
                            ++var262;
                        }
                    }
                    ++var258;
                    class219.field3420 += class219.field3435;
                    class219.field3409 += class219.field3414;
                }
            } else if (class219.field3415 < 0) {
                int var344 = class219.field3411;
                while (var344 < 0) {
                    int var345 = class219.field3409;
                    int var346 = class219.field3425 + class219.field3416;
                    int var347 = class219.field3430 + class219.field3420;
                    int var348 = class219.field3423;
                    int var349;
                    if ((var349 = var346 - (super.field3410 << 12)) >= 0) {
                        int var350 = (class219.field3419 - var349) / class219.field3419;
                        var348 += var350;
                        var346 += class219.field3419 * var350;
                        var347 += class219.field3415 * var350;
                        var345 += var350;
                    }
                    int var351;
                    if ((var351 = (var346 - class219.field3419) / class219.field3419) > var348) {
                        var348 = var351;
                    }
                    int var352;
                    if ((var352 = var347 - (super.field3429 << 12)) >= 0) {
                        int var353 = (class219.field3415 - var352) / class219.field3415;
                        var348 += var353;
                        var346 += class219.field3419 * var353;
                        var347 += class219.field3415 * var353;
                        var345 += var353;
                    }
                    int var354;
                    if ((var354 = (var347 - class219.field3415) / class219.field3415) > var348) {
                        var348 = var354;
                    }
                    while (var348 < 0) {
                        int var355 = (var346 >> 12) + (var347 >> 12) * super.field3410;
                        int var356 = var345++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var356] = this.field8797[this.field8796[var355] & 255];
                            } else if (arg0 == 0) {
                                int var360 = this.field8797[this.field8796[var355] & 255];
                                int var361 = (var360 & 16711680) * class219.field3408 & -16777216;
                                int var362 = (var360 & 65280) * class219.field3439 & 16711680;
                                int var363 = (var360 & 255) * class219.field3412 & 65280;
                                var3[var356] = (var361 | var362 | var363) >>> 8;
                            } else if (arg0 == 3) {
                                int var364 = this.field8797[this.field8796[var355] & 255];
                                int var365 = class219.field3434;
                                int var366 = var364 + var365;
                                int var367 = (var364 & 16711935) + (var365 & 16711935);
                                int var368 = (var366 - var367 & 65536) + (var367 & 16777472);
                                var3[var356] = var366 - var368 | var368 - (var368 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var369 = this.field8797[this.field8796[var355] & 255];
                                int var370 = (var369 & 16711935) * class219.field3422 & -16711936;
                                int var371 = (var369 & 65280) * class219.field3422 & 16711680;
                                var3[var356] = ((var370 | var371) >>> 8) + class219.field3413;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var372 = this.field8796[var355];
                                if (var372 != 0) {
                                    var3[var356] = this.field8797[var372 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var373 = this.field8796[var355];
                                if (var373 != 0) {
                                    int var374 = this.field8797[var373 & 255];
                                    if ((class219.field3434 & 16777215) == 16777215) {
                                        int var375 = class219.field3434 >>> 24;
                                        int var376 = 256 - var375;
                                        int var377 = var3[var356];
                                        var3[var356] = ((var374 & 16711935) * var375 + (var377 & 16711935) * var376 & -16711936) + ((var374 & 65280) * var375 + (var377 & 65280) * var376 & 16711680) >> 8;
                                    } else if (class219.field3422 != 255) {
                                        int var378 = (var374 & 16711680) * class219.field3408 & -16777216;
                                        int var379 = (var374 & 65280) * class219.field3439 & 16711680;
                                        int var380 = (var374 & 255) * class219.field3412 & 65280;
                                        int var381 = (var378 | var379 | var380) >>> 8;
                                        int var382 = var3[var356];
                                        var3[var356] = ((var381 & 16711935) * class219.field3422 + (var382 & 16711935) * class219.field3417 & -16711936) + ((var381 & 65280) * class219.field3422 + (var382 & 65280) * class219.field3417 & 16711680) >> 8;
                                    } else {
                                        int var383 = (var374 & 16711680) * class219.field3408 & -16777216;
                                        int var384 = (var374 & 65280) * class219.field3439 & 16711680;
                                        int var385 = (var374 & 255) * class219.field3412 & 65280;
                                        var3[var356] = (var383 | var384 | var385) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var386 = this.field8796[var355];
                                int var387 = var386 > 0 ? this.field8797[var386] : 0;
                                int var388 = class219.field3434;
                                int var389 = var387 + var388;
                                int var390 = (var387 & 16711935) + (var388 & 16711935);
                                int var391 = (var389 - var390 & 65536) + (var390 & 16777472);
                                int var392 = var389 - var391 | var391 - (var391 >>> 8);
                                if (var387 == 0 && class219.field3422 != 255) {
                                    int var394 = var3[var356];
                                    var392 = ((var392 & 16711935) * class219.field3422 + (var394 & 16711935) * class219.field3417 & -16711936) + ((var392 & 65280) * class219.field3422 + (var394 & 65280) * class219.field3417 & 16711680) >> 8;
                                }
                                var3[var356] = var392;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var395 = this.field8796[var355];
                                if (var395 != 0) {
                                    int var396 = this.field8797[var395 & 255];
                                    int var397 = (var396 & 16711935) * class219.field3422 & -16711936;
                                    int var398 = (var396 & 65280) * class219.field3422 & 16711680;
                                    var3[var356++] = ((var397 | var398) >>> 8) + class219.field3413;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var399 = this.field8796[var355];
                                if (var399 != 0) {
                                    int var400 = this.field8797[var399 & 255];
                                    int var401 = var3[var356];
                                    int var402 = var400 + var401;
                                    int var403 = (var400 & 16711935) + (var401 & 16711935);
                                    int var404 = (var402 - var403 & 65536) + (var403 & 16777472);
                                    var3[var356] = var402 - var404 | var404 - (var404 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var405 = this.field8796[var355];
                                if (var405 != 0) {
                                    int var406 = this.field8797[var405 & 255];
                                    int var407 = (var406 & 16711680) * class219.field3408 & -16777216;
                                    int var408 = (var406 & 65280) * class219.field3439 & 16711680;
                                    int var409 = (var406 & 255) * class219.field3412 & 65280;
                                    int var410 = (var407 | var408 | var409) >>> 8;
                                    int var411 = var3[var356];
                                    int var412 = var410 + var411;
                                    int var413 = (var410 & 16711935) + (var411 & 16711935);
                                    int var414 = (var412 - var413 & 65536) + (var413 & 16777472);
                                    var3[var356] = var412 - var414 | var414 - (var414 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var415 = this.field8796[var355];
                                int var416 = var415 > 0 ? this.field8797[var415] : 0;
                                int var417 = class219.field3434;
                                int var418 = var416 + var417;
                                int var419 = (var416 & 16711935) + (var417 & 16711935);
                                int var420 = (var418 - var419 & 65536) + (var419 & 16777472);
                                int var421 = var418 - var420 | var420 - (var420 >>> 8);
                                if (var416 == 0 && class219.field3422 != 255) {
                                    int var423 = var3[var356];
                                    var421 = ((var421 & 16711935) * class219.field3422 + (var423 & 16711935) * class219.field3417 & -16711936) + ((var421 & 65280) * class219.field3422 + (var423 & 65280) * class219.field3417 & 16711680) >> 8;
                                }
                                var3[var356] = var421;
                            } else if (arg0 == 2) {
                                byte var424 = this.field8796[var355];
                                if (var424 != 0) {
                                    int var425 = this.field8797[var424 & 255];
                                    int var426 = (var425 & 16711935) * class219.field3422 & -16711936;
                                    int var427 = (var425 & 65280) * class219.field3422 & 16711680;
                                    int var428 = ((var426 | var427) >>> 8) + class219.field3413;
                                    int var429 = var3[var356];
                                    int var430 = var428 + var429;
                                    int var431 = (var428 & 16711935) + (var429 & 16711935);
                                    int var432 = (var430 - var431 & 65536) + (var431 & 16777472);
                                    var3[var356] = var430 - var432 | var432 - (var432 >>> 8);
                                }
                            }
                        }
                        var346 += class219.field3419;
                        var347 += class219.field3415;
                        ++var348;
                    }
                    ++var344;
                    class219.field3416 += class219.field3428;
                    class219.field3420 += class219.field3435;
                    class219.field3409 += class219.field3414;
                }
            } else {
                int var433 = class219.field3411;
                while (var433 < 0) {
                    int var434 = class219.field3409;
                    int var435 = class219.field3425 + class219.field3416;
                    int var436 = class219.field3430 + class219.field3420;
                    int var437 = class219.field3423;
                    int var438;
                    if ((var438 = var435 - (super.field3410 << 12)) >= 0) {
                        int var439 = (class219.field3419 - var438) / class219.field3419;
                        var437 += var439;
                        var435 += class219.field3419 * var439;
                        var436 += class219.field3415 * var439;
                        var434 += var439;
                    }
                    int var440;
                    if ((var440 = (var435 - class219.field3419) / class219.field3419) > var437) {
                        var437 = var440;
                    }
                    if (var436 < 0) {
                        int var441 = (class219.field3415 - 1 - var436) / class219.field3415;
                        var437 += var441;
                        var435 += class219.field3419 * var441;
                        var436 += class219.field3415 * var441;
                        var434 += var441;
                    }
                    int var442;
                    if ((var442 = (var436 + 1 - (super.field3429 << 12) - class219.field3415) / class219.field3415) > var437) {
                        var437 = var442;
                    }
                    while (var437 < 0) {
                        int var443 = (var435 >> 12) + (var436 >> 12) * super.field3410;
                        int var444 = var434++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var444] = this.field8797[this.field8796[var443] & 255];
                            } else if (arg0 == 0) {
                                int var448 = this.field8797[this.field8796[var443] & 255];
                                int var449 = (var448 & 16711680) * class219.field3408 & -16777216;
                                int var450 = (var448 & 65280) * class219.field3439 & 16711680;
                                int var451 = (var448 & 255) * class219.field3412 & 65280;
                                var3[var444] = (var449 | var450 | var451) >>> 8;
                            } else if (arg0 == 3) {
                                int var452 = this.field8797[this.field8796[var443] & 255];
                                int var453 = class219.field3434;
                                int var454 = var452 + var453;
                                int var455 = (var452 & 16711935) + (var453 & 16711935);
                                int var456 = (var454 - var455 & 65536) + (var455 & 16777472);
                                var3[var444] = var454 - var456 | var456 - (var456 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var457 = this.field8797[this.field8796[var443] & 255];
                                int var458 = (var457 & 16711935) * class219.field3422 & -16711936;
                                int var459 = (var457 & 65280) * class219.field3422 & 16711680;
                                var3[var444] = ((var458 | var459) >>> 8) + class219.field3413;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var460 = this.field8796[var443];
                                if (var460 != 0) {
                                    var3[var444] = this.field8797[var460 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var461 = this.field8796[var443];
                                if (var461 != 0) {
                                    int var462 = this.field8797[var461 & 255];
                                    if ((class219.field3434 & 16777215) == 16777215) {
                                        int var463 = class219.field3434 >>> 24;
                                        int var464 = 256 - var463;
                                        int var465 = var3[var444];
                                        var3[var444] = ((var462 & 16711935) * var463 + (var465 & 16711935) * var464 & -16711936) + ((var462 & 65280) * var463 + (var465 & 65280) * var464 & 16711680) >> 8;
                                    } else if (class219.field3422 != 255) {
                                        int var466 = (var462 & 16711680) * class219.field3408 & -16777216;
                                        int var467 = (var462 & 65280) * class219.field3439 & 16711680;
                                        int var468 = (var462 & 255) * class219.field3412 & 65280;
                                        int var469 = (var466 | var467 | var468) >>> 8;
                                        int var470 = var3[var444];
                                        var3[var444] = ((var469 & 16711935) * class219.field3422 + (var470 & 16711935) * class219.field3417 & -16711936) + ((var469 & 65280) * class219.field3422 + (var470 & 65280) * class219.field3417 & 16711680) >> 8;
                                    } else {
                                        int var471 = (var462 & 16711680) * class219.field3408 & -16777216;
                                        int var472 = (var462 & 65280) * class219.field3439 & 16711680;
                                        int var473 = (var462 & 255) * class219.field3412 & 65280;
                                        var3[var444] = (var471 | var472 | var473) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var474 = this.field8796[var443];
                                int var475 = var474 > 0 ? this.field8797[var474] : 0;
                                int var476 = class219.field3434;
                                int var477 = var475 + var476;
                                int var478 = (var475 & 16711935) + (var476 & 16711935);
                                int var479 = (var477 - var478 & 65536) + (var478 & 16777472);
                                int var480 = var477 - var479 | var479 - (var479 >>> 8);
                                if (var475 == 0 && class219.field3422 != 255) {
                                    int var482 = var3[var444];
                                    var480 = ((var480 & 16711935) * class219.field3422 + (var482 & 16711935) * class219.field3417 & -16711936) + ((var480 & 65280) * class219.field3422 + (var482 & 65280) * class219.field3417 & 16711680) >> 8;
                                }
                                var3[var444] = var480;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var483 = this.field8796[var443];
                                if (var483 != 0) {
                                    int var484 = this.field8797[var483 & 255];
                                    int var485 = (var484 & 16711935) * class219.field3422 & -16711936;
                                    int var486 = (var484 & 65280) * class219.field3422 & 16711680;
                                    var3[var444++] = ((var485 | var486) >>> 8) + class219.field3413;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var487 = this.field8796[var443];
                                if (var487 != 0) {
                                    int var488 = this.field8797[var487 & 255];
                                    int var489 = var3[var444];
                                    int var490 = var488 + var489;
                                    int var491 = (var488 & 16711935) + (var489 & 16711935);
                                    int var492 = (var490 - var491 & 65536) + (var491 & 16777472);
                                    var3[var444] = var490 - var492 | var492 - (var492 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var493 = this.field8796[var443];
                                if (var493 != 0) {
                                    int var494 = this.field8797[var493 & 255];
                                    int var495 = (var494 & 16711680) * class219.field3408 & -16777216;
                                    int var496 = (var494 & 65280) * class219.field3439 & 16711680;
                                    int var497 = (var494 & 255) * class219.field3412 & 65280;
                                    int var498 = (var495 | var496 | var497) >>> 8;
                                    int var499 = var3[var444];
                                    int var500 = var498 + var499;
                                    int var501 = (var498 & 16711935) + (var499 & 16711935);
                                    int var502 = (var500 - var501 & 65536) + (var501 & 16777472);
                                    var3[var444] = var500 - var502 | var502 - (var502 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var503 = this.field8796[var443];
                                int var504 = var503 > 0 ? this.field8797[var503] : 0;
                                int var505 = class219.field3434;
                                int var506 = var504 + var505;
                                int var507 = (var504 & 16711935) + (var505 & 16711935);
                                int var508 = (var506 - var507 & 65536) + (var507 & 16777472);
                                int var509 = var506 - var508 | var508 - (var508 >>> 8);
                                if (var504 == 0 && class219.field3422 != 255) {
                                    int var511 = var3[var444];
                                    var509 = ((var509 & 16711935) * class219.field3422 + (var511 & 16711935) * class219.field3417 & -16711936) + ((var509 & 65280) * class219.field3422 + (var511 & 65280) * class219.field3417 & 16711680) >> 8;
                                }
                                var3[var444] = var509;
                            } else if (arg0 == 2) {
                                byte var512 = this.field8796[var443];
                                if (var512 != 0) {
                                    int var513 = this.field8797[var512 & 255];
                                    int var514 = (var513 & 16711935) * class219.field3422 & -16711936;
                                    int var515 = (var513 & 65280) * class219.field3422 & 16711680;
                                    int var516 = ((var514 | var515) >>> 8) + class219.field3413;
                                    int var517 = var3[var444];
                                    int var518 = var516 + var517;
                                    int var519 = (var516 & 16711935) + (var517 & 16711935);
                                    int var520 = (var518 - var519 & 65536) + (var519 & 16777472);
                                    var3[var444] = var518 - var520 | var520 - (var520 >>> 8);
                                }
                            }
                        }
                        var435 += class219.field3419;
                        var436 += class219.field3415;
                        ++var437;
                    }
                    ++var433;
                    class219.field3416 += class219.field3428;
                    class219.field3420 += class219.field3435;
                    class219.field3409 += class219.field3414;
                }
            }
        } else if (class219.field3415 == 0) {
            int var521 = class219.field3411;
            while (var521 < 0) {
                int var522 = class219.field3409;
                int var523 = class219.field3425 + class219.field3416;
                int var524 = class219.field3420;
                int var525 = class219.field3423;
                if (var524 >= 0 && var524 - (super.field3429 << 12) < 0) {
                    if (var523 < 0) {
                        int var526 = (class219.field3419 - 1 - var523) / class219.field3419;
                        var525 += var526;
                        var523 += class219.field3419 * var526;
                        var522 += var526;
                    }
                    int var527;
                    if ((var527 = (var523 + 1 - (super.field3410 << 12) - class219.field3419) / class219.field3419) > var525) {
                        var525 = var527;
                    }
                    while (var525 < 0) {
                        int var528 = (var523 >> 12) + (var524 >> 12) * super.field3410;
                        int var529 = var522++;
                        if (arg1 == 0) {
                            if (arg0 == 1) {
                                var3[var529] = this.field8797[this.field8796[var528] & 255];
                            } else if (arg0 == 0) {
                                int var533 = this.field8797[this.field8796[var528] & 255];
                                int var534 = (var533 & 16711680) * class219.field3408 & -16777216;
                                int var535 = (var533 & 65280) * class219.field3439 & 16711680;
                                int var536 = (var533 & 255) * class219.field3412 & 65280;
                                var3[var529] = (var534 | var535 | var536) >>> 8;
                            } else if (arg0 == 3) {
                                int var537 = this.field8797[this.field8796[var528] & 255];
                                int var538 = class219.field3434;
                                int var539 = var537 + var538;
                                int var540 = (var537 & 16711935) + (var538 & 16711935);
                                int var541 = (var539 - var540 & 65536) + (var540 & 16777472);
                                var3[var529] = var539 - var541 | var541 - (var541 >>> 8);
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                int var542 = this.field8797[this.field8796[var528] & 255];
                                int var543 = (var542 & 16711935) * class219.field3422 & -16711936;
                                int var544 = (var542 & 65280) * class219.field3422 & 16711680;
                                var3[var529] = ((var543 | var544) >>> 8) + class219.field3413;
                            }
                        } else if (arg1 == 1) {
                            if (arg0 == 1) {
                                byte var545 = this.field8796[var528];
                                if (var545 != 0) {
                                    var3[var529] = this.field8797[var545 & 255];
                                }
                            } else if (arg0 == 0) {
                                byte var546 = this.field8796[var528];
                                if (var546 != 0) {
                                    int var547 = this.field8797[var546 & 255];
                                    if ((class219.field3434 & 16777215) == 16777215) {
                                        int var548 = class219.field3434 >>> 24;
                                        int var549 = 256 - var548;
                                        int var550 = var3[var529];
                                        var3[var529] = ((var547 & 16711935) * var548 + (var550 & 16711935) * var549 & -16711936) + ((var547 & 65280) * var548 + (var550 & 65280) * var549 & 16711680) >> 8;
                                    } else if (class219.field3422 != 255) {
                                        int var551 = (var547 & 16711680) * class219.field3408 & -16777216;
                                        int var552 = (var547 & 65280) * class219.field3439 & 16711680;
                                        int var553 = (var547 & 255) * class219.field3412 & 65280;
                                        int var554 = (var551 | var552 | var553) >>> 8;
                                        int var555 = var3[var529];
                                        var3[var529] = ((var554 & 16711935) * class219.field3422 + (var555 & 16711935) * class219.field3417 & -16711936) + ((var554 & 65280) * class219.field3422 + (var555 & 65280) * class219.field3417 & 16711680) >> 8;
                                    } else {
                                        int var556 = (var547 & 16711680) * class219.field3408 & -16777216;
                                        int var557 = (var547 & 65280) * class219.field3439 & 16711680;
                                        int var558 = (var547 & 255) * class219.field3412 & 65280;
                                        var3[var529] = (var556 | var557 | var558) >>> 8;
                                    }
                                }
                            } else if (arg0 == 3) {
                                byte var559 = this.field8796[var528];
                                int var560 = var559 > 0 ? this.field8797[var559] : 0;
                                int var561 = class219.field3434;
                                int var562 = var560 + var561;
                                int var563 = (var560 & 16711935) + (var561 & 16711935);
                                int var564 = (var562 - var563 & 65536) + (var563 & 16777472);
                                int var565 = var562 - var564 | var564 - (var564 >>> 8);
                                if (var560 == 0 && class219.field3422 != 255) {
                                    int var567 = var3[var529];
                                    var565 = ((var565 & 16711935) * class219.field3422 + (var567 & 16711935) * class219.field3417 & -16711936) + ((var565 & 65280) * class219.field3422 + (var567 & 65280) * class219.field3417 & 16711680) >> 8;
                                }
                                var3[var529] = var565;
                            } else {
                                if (arg0 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                byte var568 = this.field8796[var528];
                                if (var568 != 0) {
                                    int var569 = this.field8797[var568 & 255];
                                    int var570 = (var569 & 16711935) * class219.field3422 & -16711936;
                                    int var571 = (var569 & 65280) * class219.field3422 & 16711680;
                                    var3[var529++] = ((var570 | var571) >>> 8) + class219.field3413;
                                }
                            }
                        } else {
                            if (arg1 != 2) {
                                throw new IllegalArgumentException();
                            }
                            if (arg0 == 1) {
                                byte var572 = this.field8796[var528];
                                if (var572 != 0) {
                                    int var573 = this.field8797[var572 & 255];
                                    int var574 = var3[var529];
                                    int var575 = var573 + var574;
                                    int var576 = (var573 & 16711935) + (var574 & 16711935);
                                    int var577 = (var575 - var576 & 65536) + (var576 & 16777472);
                                    var3[var529] = var575 - var577 | var577 - (var577 >>> 8);
                                }
                            } else if (arg0 == 0) {
                                byte var578 = this.field8796[var528];
                                if (var578 != 0) {
                                    int var579 = this.field8797[var578 & 255];
                                    int var580 = (var579 & 16711680) * class219.field3408 & -16777216;
                                    int var581 = (var579 & 65280) * class219.field3439 & 16711680;
                                    int var582 = (var579 & 255) * class219.field3412 & 65280;
                                    int var583 = (var580 | var581 | var582) >>> 8;
                                    int var584 = var3[var529];
                                    int var585 = var583 + var584;
                                    int var586 = (var583 & 16711935) + (var584 & 16711935);
                                    int var587 = (var585 - var586 & 65536) + (var586 & 16777472);
                                    var3[var529] = var585 - var587 | var587 - (var587 >>> 8);
                                }
                            } else if (arg0 == 3) {
                                byte var588 = this.field8796[var528];
                                int var589 = var588 > 0 ? this.field8797[var588] : 0;
                                int var590 = class219.field3434;
                                int var591 = var589 + var590;
                                int var592 = (var589 & 16711935) + (var590 & 16711935);
                                int var593 = (var591 - var592 & 65536) + (var592 & 16777472);
                                int var594 = var591 - var593 | var593 - (var593 >>> 8);
                                if (var589 == 0 && class219.field3422 != 255) {
                                    int var596 = var3[var529];
                                    var594 = ((var594 & 16711935) * class219.field3422 + (var596 & 16711935) * class219.field3417 & -16711936) + ((var594 & 65280) * class219.field3422 + (var596 & 65280) * class219.field3417 & 16711680) >> 8;
                                }
                                var3[var529] = var594;
                            } else if (arg0 == 2) {
                                byte var597 = this.field8796[var528];
                                if (var597 != 0) {
                                    int var598 = this.field8797[var597 & 255];
                                    int var599 = (var598 & 16711935) * class219.field3422 & -16711936;
                                    int var600 = (var598 & 65280) * class219.field3422 & 16711680;
                                    int var601 = ((var599 | var600) >>> 8) + class219.field3413;
                                    int var602 = var3[var529];
                                    int var603 = var601 + var602;
                                    int var604 = (var601 & 16711935) + (var602 & 16711935);
                                    int var605 = (var603 - var604 & 65536) + (var604 & 16777472);
                                    var3[var529] = var603 - var605 | var605 - (var605 >>> 8);
                                }
                            }
                        }
                        var523 += class219.field3419;
                        ++var525;
                    }
                }
                ++var521;
                class219.field3416 += class219.field3428;
                class219.field3420 += class219.field3435;
                class219.field3409 += class219.field3414;
            }
        } else if (class219.field3415 < 0) {
            for (int var606 = class219.field3411; var606 < 0; ++var606) {
                int var607 = class219.field3409;
                int var608 = class219.field3425 + class219.field3416;
                int var609 = class219.field3430 + class219.field3420;
                int var610 = class219.field3423;
                if (var608 < 0) {
                    int var611 = (class219.field3419 - 1 - var608) / class219.field3419;
                    var610 += var611;
                    var608 += class219.field3419 * var611;
                    var609 += class219.field3415 * var611;
                    var607 += var611;
                }
                int var612;
                if ((var612 = (var608 + 1 - (super.field3410 << 12) - class219.field3419) / class219.field3419) > var610) {
                    var610 = var612;
                }
                int var613;
                if ((var613 = var609 - (super.field3429 << 12)) >= 0) {
                    int var614 = (class219.field3415 - var613) / class219.field3415;
                    var610 += var614;
                    var608 += class219.field3419 * var614;
                    var609 += class219.field3415 * var614;
                    var607 += var614;
                }
                int var615;
                if ((var615 = (var609 - class219.field3415) / class219.field3415) > var610) {
                    var610 = var615;
                }
                while (var610 < 0) {
                    int var616 = (var608 >> 12) + (var609 >> 12) * super.field3410;
                    int var617 = var607++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var617] = this.field8797[this.field8796[var616] & 255];
                        } else if (arg0 == 0) {
                            int var621 = this.field8797[this.field8796[var616] & 255];
                            int var622 = (var621 & 16711680) * class219.field3408 & -16777216;
                            int var623 = (var621 & 65280) * class219.field3439 & 16711680;
                            int var624 = (var621 & 255) * class219.field3412 & 65280;
                            var3[var617] = (var622 | var623 | var624) >>> 8;
                        } else if (arg0 == 3) {
                            int var625 = this.field8797[this.field8796[var616] & 255];
                            int var626 = class219.field3434;
                            int var627 = var625 + var626;
                            int var628 = (var625 & 16711935) + (var626 & 16711935);
                            int var629 = (var627 - var628 & 65536) + (var628 & 16777472);
                            var3[var617] = var627 - var629 | var629 - (var629 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var630 = this.field8797[this.field8796[var616] & 255];
                            int var631 = (var630 & 16711935) * class219.field3422 & -16711936;
                            int var632 = (var630 & 65280) * class219.field3422 & 16711680;
                            var3[var617] = ((var631 | var632) >>> 8) + class219.field3413;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            byte var633 = this.field8796[var616];
                            if (var633 != 0) {
                                var3[var617] = this.field8797[var633 & 255];
                            }
                        } else if (arg0 == 0) {
                            byte var634 = this.field8796[var616];
                            if (var634 != 0) {
                                int var635 = this.field8797[var634 & 255];
                                if ((class219.field3434 & 16777215) == 16777215) {
                                    int var636 = class219.field3434 >>> 24;
                                    int var637 = 256 - var636;
                                    int var638 = var3[var617];
                                    var3[var617] = ((var635 & 16711935) * var636 + (var638 & 16711935) * var637 & -16711936) + ((var635 & 65280) * var636 + (var638 & 65280) * var637 & 16711680) >> 8;
                                } else if (class219.field3422 != 255) {
                                    int var639 = (var635 & 16711680) * class219.field3408 & -16777216;
                                    int var640 = (var635 & 65280) * class219.field3439 & 16711680;
                                    int var641 = (var635 & 255) * class219.field3412 & 65280;
                                    int var642 = (var639 | var640 | var641) >>> 8;
                                    int var643 = var3[var617];
                                    var3[var617] = ((var642 & 16711935) * class219.field3422 + (var643 & 16711935) * class219.field3417 & -16711936) + ((var642 & 65280) * class219.field3422 + (var643 & 65280) * class219.field3417 & 16711680) >> 8;
                                } else {
                                    int var644 = (var635 & 16711680) * class219.field3408 & -16777216;
                                    int var645 = (var635 & 65280) * class219.field3439 & 16711680;
                                    int var646 = (var635 & 255) * class219.field3412 & 65280;
                                    var3[var617] = (var644 | var645 | var646) >>> 8;
                                }
                            }
                        } else if (arg0 == 3) {
                            byte var647 = this.field8796[var616];
                            int var648 = var647 > 0 ? this.field8797[var647] : 0;
                            int var649 = class219.field3434;
                            int var650 = var648 + var649;
                            int var651 = (var648 & 16711935) + (var649 & 16711935);
                            int var652 = (var650 - var651 & 65536) + (var651 & 16777472);
                            int var653 = var650 - var652 | var652 - (var652 >>> 8);
                            if (var648 == 0 && class219.field3422 != 255) {
                                int var655 = var3[var617];
                                var653 = ((var653 & 16711935) * class219.field3422 + (var655 & 16711935) * class219.field3417 & -16711936) + ((var653 & 65280) * class219.field3422 + (var655 & 65280) * class219.field3417 & 16711680) >> 8;
                            }
                            var3[var617] = var653;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            byte var656 = this.field8796[var616];
                            if (var656 != 0) {
                                int var657 = this.field8797[var656 & 255];
                                int var658 = (var657 & 16711935) * class219.field3422 & -16711936;
                                int var659 = (var657 & 65280) * class219.field3422 & 16711680;
                                var3[var617++] = ((var658 | var659) >>> 8) + class219.field3413;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            byte var660 = this.field8796[var616];
                            if (var660 != 0) {
                                int var661 = this.field8797[var660 & 255];
                                int var662 = var3[var617];
                                int var663 = var661 + var662;
                                int var664 = (var661 & 16711935) + (var662 & 16711935);
                                int var665 = (var663 - var664 & 65536) + (var664 & 16777472);
                                var3[var617] = var663 - var665 | var665 - (var665 >>> 8);
                            }
                        } else if (arg0 == 0) {
                            byte var666 = this.field8796[var616];
                            if (var666 != 0) {
                                int var667 = this.field8797[var666 & 255];
                                int var668 = (var667 & 16711680) * class219.field3408 & -16777216;
                                int var669 = (var667 & 65280) * class219.field3439 & 16711680;
                                int var670 = (var667 & 255) * class219.field3412 & 65280;
                                int var671 = (var668 | var669 | var670) >>> 8;
                                int var672 = var3[var617];
                                int var673 = var671 + var672;
                                int var674 = (var671 & 16711935) + (var672 & 16711935);
                                int var675 = (var673 - var674 & 65536) + (var674 & 16777472);
                                var3[var617] = var673 - var675 | var675 - (var675 >>> 8);
                            }
                        } else if (arg0 == 3) {
                            byte var676 = this.field8796[var616];
                            int var677 = var676 > 0 ? this.field8797[var676] : 0;
                            int var678 = class219.field3434;
                            int var679 = var677 + var678;
                            int var680 = (var677 & 16711935) + (var678 & 16711935);
                            int var681 = (var679 - var680 & 65536) + (var680 & 16777472);
                            int var682 = var679 - var681 | var681 - (var681 >>> 8);
                            if (var677 == 0 && class219.field3422 != 255) {
                                int var684 = var3[var617];
                                var682 = ((var682 & 16711935) * class219.field3422 + (var684 & 16711935) * class219.field3417 & -16711936) + ((var682 & 65280) * class219.field3422 + (var684 & 65280) * class219.field3417 & 16711680) >> 8;
                            }
                            var3[var617] = var682;
                        } else if (arg0 == 2) {
                            byte var685 = this.field8796[var616];
                            if (var685 != 0) {
                                int var686 = this.field8797[var685 & 255];
                                int var687 = (var686 & 16711935) * class219.field3422 & -16711936;
                                int var688 = (var686 & 65280) * class219.field3422 & 16711680;
                                int var689 = ((var687 | var688) >>> 8) + class219.field3413;
                                int var690 = var3[var617];
                                int var691 = var689 + var690;
                                int var692 = (var689 & 16711935) + (var690 & 16711935);
                                int var693 = (var691 - var692 & 65536) + (var692 & 16777472);
                                var3[var617] = var691 - var693 | var693 - (var693 >>> 8);
                            }
                        }
                    }
                    var608 += class219.field3419;
                    var609 += class219.field3415;
                    ++var610;
                }
                class219.field3416 += class219.field3428;
                class219.field3420 += class219.field3435;
                class219.field3409 += class219.field3414;
            }
        } else {
            for (int var694 = class219.field3411; var694 < 0; ++var694) {
                int var695 = class219.field3409;
                int var696 = class219.field3425 + class219.field3416;
                int var697 = class219.field3430 + class219.field3420;
                int var698 = class219.field3423;
                if (var696 < 0) {
                    int var699 = (class219.field3419 - 1 - var696) / class219.field3419;
                    var698 += var699;
                    var696 += class219.field3419 * var699;
                    var697 += class219.field3415 * var699;
                    var695 += var699;
                }
                int var700;
                if ((var700 = (var696 + 1 - (super.field3410 << 12) - class219.field3419) / class219.field3419) > var698) {
                    var698 = var700;
                }
                if (var697 < 0) {
                    int var701 = (class219.field3415 - 1 - var697) / class219.field3415;
                    var698 += var701;
                    var696 += class219.field3419 * var701;
                    var697 += class219.field3415 * var701;
                    var695 += var701;
                }
                int var702;
                if ((var702 = (var697 + 1 - (super.field3429 << 12) - class219.field3415) / class219.field3415) > var698) {
                    var698 = var702;
                }
                while (var698 < 0) {
                    int var703 = (var696 >> 12) + (var697 >> 12) * super.field3410;
                    int var704 = var695++;
                    if (arg1 == 0) {
                        if (arg0 == 1) {
                            var3[var704] = this.field8797[this.field8796[var703] & 255];
                        } else if (arg0 == 0) {
                            int var708 = this.field8797[this.field8796[var703] & 255];
                            int var709 = (var708 & 16711680) * class219.field3408 & -16777216;
                            int var710 = (var708 & 65280) * class219.field3439 & 16711680;
                            int var711 = (var708 & 255) * class219.field3412 & 65280;
                            var3[var704] = (var709 | var710 | var711) >>> 8;
                        } else if (arg0 == 3) {
                            int var712 = this.field8797[this.field8796[var703] & 255];
                            int var713 = class219.field3434;
                            int var714 = var712 + var713;
                            int var715 = (var712 & 16711935) + (var713 & 16711935);
                            int var716 = (var714 - var715 & 65536) + (var715 & 16777472);
                            var3[var704] = var714 - var716 | var716 - (var716 >>> 8);
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int var717 = this.field8797[this.field8796[var703] & 255];
                            int var718 = (var717 & 16711935) * class219.field3422 & -16711936;
                            int var719 = (var717 & 65280) * class219.field3422 & 16711680;
                            var3[var704] = ((var718 | var719) >>> 8) + class219.field3413;
                        }
                    } else if (arg1 == 1) {
                        if (arg0 == 1) {
                            byte var720 = this.field8796[var703];
                            if (var720 != 0) {
                                var3[var704] = this.field8797[var720 & 255];
                            }
                        } else if (arg0 == 0) {
                            byte var721 = this.field8796[var703];
                            if (var721 != 0) {
                                int var722 = this.field8797[var721 & 255];
                                if ((class219.field3434 & 16777215) == 16777215) {
                                    int var723 = class219.field3434 >>> 24;
                                    int var724 = 256 - var723;
                                    int var725 = var3[var704];
                                    var3[var704] = ((var722 & 16711935) * var723 + (var725 & 16711935) * var724 & -16711936) + ((var722 & 65280) * var723 + (var725 & 65280) * var724 & 16711680) >> 8;
                                } else if (class219.field3422 != 255) {
                                    int var726 = (var722 & 16711680) * class219.field3408 & -16777216;
                                    int var727 = (var722 & 65280) * class219.field3439 & 16711680;
                                    int var728 = (var722 & 255) * class219.field3412 & 65280;
                                    int var729 = (var726 | var727 | var728) >>> 8;
                                    int var730 = var3[var704];
                                    var3[var704] = ((var729 & 16711935) * class219.field3422 + (var730 & 16711935) * class219.field3417 & -16711936) + ((var729 & 65280) * class219.field3422 + (var730 & 65280) * class219.field3417 & 16711680) >> 8;
                                } else {
                                    int var731 = (var722 & 16711680) * class219.field3408 & -16777216;
                                    int var732 = (var722 & 65280) * class219.field3439 & 16711680;
                                    int var733 = (var722 & 255) * class219.field3412 & 65280;
                                    var3[var704] = (var731 | var732 | var733) >>> 8;
                                }
                            }
                        } else if (arg0 == 3) {
                            byte var734 = this.field8796[var703];
                            int var735 = var734 > 0 ? this.field8797[var734] : 0;
                            int var736 = class219.field3434;
                            int var737 = var735 + var736;
                            int var738 = (var735 & 16711935) + (var736 & 16711935);
                            int var739 = (var737 - var738 & 65536) + (var738 & 16777472);
                            int var740 = var737 - var739 | var739 - (var739 >>> 8);
                            if (var735 == 0 && class219.field3422 != 255) {
                                int var742 = var3[var704];
                                var740 = ((var740 & 16711935) * class219.field3422 + (var742 & 16711935) * class219.field3417 & -16711936) + ((var740 & 65280) * class219.field3422 + (var742 & 65280) * class219.field3417 & 16711680) >> 8;
                            }
                            var3[var704] = var740;
                        } else {
                            if (arg0 != 2) {
                                throw new IllegalArgumentException();
                            }
                            byte var743 = this.field8796[var703];
                            if (var743 != 0) {
                                int var744 = this.field8797[var743 & 255];
                                int var745 = (var744 & 16711935) * class219.field3422 & -16711936;
                                int var746 = (var744 & 65280) * class219.field3422 & 16711680;
                                var3[var704++] = ((var745 | var746) >>> 8) + class219.field3413;
                            }
                        }
                    } else {
                        if (arg1 != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (arg0 == 1) {
                            byte var747 = this.field8796[var703];
                            if (var747 != 0) {
                                int var748 = this.field8797[var747 & 255];
                                int var749 = var3[var704];
                                int var750 = var748 + var749;
                                int var751 = (var748 & 16711935) + (var749 & 16711935);
                                int var752 = (var750 - var751 & 65536) + (var751 & 16777472);
                                var3[var704] = var750 - var752 | var752 - (var752 >>> 8);
                            }
                        } else if (arg0 == 0) {
                            byte var753 = this.field8796[var703];
                            if (var753 != 0) {
                                int var754 = this.field8797[var753 & 255];
                                int var755 = (var754 & 16711680) * class219.field3408 & -16777216;
                                int var756 = (var754 & 65280) * class219.field3439 & 16711680;
                                int var757 = (var754 & 255) * class219.field3412 & 65280;
                                int var758 = (var755 | var756 | var757) >>> 8;
                                int var759 = var3[var704];
                                int var760 = var758 + var759;
                                int var761 = (var758 & 16711935) + (var759 & 16711935);
                                int var762 = (var760 - var761 & 65536) + (var761 & 16777472);
                                var3[var704] = var760 - var762 | var762 - (var762 >>> 8);
                            }
                        } else if (arg0 == 3) {
                            byte var763 = this.field8796[var703];
                            int var764 = var763 > 0 ? this.field8797[var763] : 0;
                            int var765 = class219.field3434;
                            int var766 = var764 + var765;
                            int var767 = (var764 & 16711935) + (var765 & 16711935);
                            int var768 = (var766 - var767 & 65536) + (var767 & 16777472);
                            int var769 = var766 - var768 | var768 - (var768 >>> 8);
                            if (var764 == 0 && class219.field3422 != 255) {
                                int var771 = var3[var704];
                                var769 = ((var769 & 16711935) * class219.field3422 + (var771 & 16711935) * class219.field3417 & -16711936) + ((var769 & 65280) * class219.field3422 + (var771 & 65280) * class219.field3417 & 16711680) >> 8;
                            }
                            var3[var704] = var769;
                        } else if (arg0 == 2) {
                            byte var772 = this.field8796[var703];
                            if (var772 != 0) {
                                int var773 = this.field8797[var772 & 255];
                                int var774 = (var773 & 16711935) * class219.field3422 & -16711936;
                                int var775 = (var773 & 65280) * class219.field3422 & 16711680;
                                int var776 = ((var774 | var775) >>> 8) + class219.field3413;
                                int var777 = var3[var704];
                                int var778 = var776 + var777;
                                int var779 = (var776 & 16711935) + (var777 & 16711935);
                                int var780 = (var778 - var779 & 65536) + (var779 & 16777472);
                                var3[var704] = var778 - var780 | var780 - (var780 >>> 8);
                            }
                        }
                    }
                    var696 += class219.field3419;
                    var697 += class219.field3415;
                    ++var698;
                }
                class219.field3416 += class219.field3428;
                class219.field3420 += class219.field3435;
                class219.field3409 += class219.field3414;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIII)V", line = 4611)
    public final void method909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 > 0 && arg4 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = super.field3437 + super.field3410 + super.field3421;
            int var13 = super.field3431 + super.field3429 + super.field3440;
            int var14 = (var12 << 16) / arg3;
            int var15 = (var13 << 16) / arg4;
            if (super.field3437 > 0) {
                int var16 = ((super.field3437 << 16) + var14 - 1) / var14;
                arg0 += var16;
                var10 += var14 * var16 - (super.field3437 << 16);
            }
            if (super.field3431 > 0) {
                int var17 = ((super.field3431 << 16) + var15 - 1) / var15;
                arg1 += var17;
                var11 += var15 * var17 - (super.field3431 << 16);
            }
            if (super.field3410 < var12) {
                arg3 = ((super.field3410 << 16) - var10 + var14 - 1) / var14;
            }
            if (super.field3429 < var13) {
                arg4 = ((super.field3429 << 16) - var11 + var15 - 1) / var15;
            }
            int var18 = super.field3424.field267 * arg1 + arg0;
            int var19 = super.field3424.field267 - arg3;
            if (arg1 + arg4 > super.field3424.field230) {
                arg4 -= arg1 + arg4 - super.field3424.field230;
            }
            if (arg1 < super.field3424.field257) {
                int var20 = super.field3424.field257 - arg1;
                arg4 -= var20;
                var18 += super.field3424.field267 * var20;
                var11 += var15 * var20;
            }
            if (arg0 + arg3 > super.field3424.field263) {
                int var21 = arg0 + arg3 - super.field3424.field263;
                arg3 -= var21;
                var19 += var21;
            }
            if (arg0 < super.field3424.field234) {
                int var22 = super.field3424.field234 - arg0;
                arg3 -= var22;
                var18 += var22;
                var10 += var14 * var22;
                var19 += var22;
            }
            float[] var23 = super.field3424.field260;
            int[] var24 = super.field3424.field240;
            if (arg7 == 0) {
                if (arg5 == 1) {
                    int var25 = var10;
                    for (int var26 = -arg4; var26 < 0; ++var26) {
                        int var27 = (var11 >> 16) * super.field3410;
                        for (int var28 = -arg3; var28 < 0; ++var28) {
                            if ((float) arg2 < var23[var18]) {
                                var24[var18] = this.field8797[this.field8796[(var10 >> 16) + var27] & 255];
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
                        int var34 = (var11 >> 16) * super.field3410;
                        for (int var35 = -arg3; var35 < 0; ++var35) {
                            if ((float) arg2 < var23[var18]) {
                                int var36 = this.field8797[this.field8796[(var10 >> 16) + var34] & 255];
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
                        int var42 = (var11 >> 16) * super.field3410;
                        for (int var43 = -arg3; var43 < 0; ++var43) {
                            if ((float) arg2 < var23[var18]) {
                                byte var44 = this.field8796[(var10 >> 16) + var42];
                                int var45 = var44 > 0 ? this.field8797[var44] : 0;
                                int var46 = arg6 + var45;
                                int var47 = (arg6 & 16711935) + (var45 & 16711935);
                                int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                                var24[var18] = var46 - var48 | var48 - (var48 >>> 8);
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
                    int var49 = arg6 >>> 24;
                    int var50 = 256 - var49;
                    int var51 = (arg6 & 16711935) * var50 & -16711936;
                    int var52 = (arg6 & 65280) * var50 & 16711680;
                    int var53 = (var51 | var52) >>> 8;
                    int var54 = var10;
                    for (int var55 = -arg4; var55 < 0; ++var55) {
                        int var56 = (var11 >> 16) * super.field3410;
                        for (int var57 = -arg3; var57 < 0; ++var57) {
                            if ((float) arg2 < var23[var18]) {
                                int var58 = this.field8797[this.field8796[(var10 >> 16) + var56] & 255];
                                int var59 = (var58 & 16711935) * var49 & -16711936;
                                int var60 = (var58 & 65280) * var49 & 16711680;
                                var24[var18] = ((var59 | var60) >>> 8) + var53;
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var54;
                        var18 += var19;
                    }
                }
            } else if (arg7 == 1) {
                if (arg5 == 1) {
                    int var61 = var10;
                    for (int var62 = -arg4; var62 < 0; ++var62) {
                        int var63 = (var11 >> 16) * super.field3410;
                        for (int var64 = -arg3; var64 < 0; ++var64) {
                            if ((float) arg2 < var23[var18]) {
                                byte var65 = this.field8796[(var10 >> 16) + var63];
                                if (var65 != 0) {
                                    var24[var18] = this.field8797[var65 & 255];
                                    var23[var18] = (float) arg2;
                                }
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var61;
                        var18 += var19;
                    }
                } else if (arg5 == 0) {
                    int var66 = var10;
                    if ((arg6 & 16777215) == 16777215) {
                        int var67 = arg6 >>> 24;
                        int var68 = 256 - var67;
                        for (int var69 = -arg4; var69 < 0; ++var69) {
                            int var70 = (var11 >> 16) * super.field3410;
                            for (int var71 = -arg3; var71 < 0; ++var71) {
                                if ((float) arg2 < var23[var18]) {
                                    byte var72 = this.field8796[(var10 >> 16) + var70];
                                    if (var72 != 0) {
                                        int var73 = this.field8797[var72 & 255];
                                        int var74 = var24[var18];
                                        var24[var18] = ((var73 & 16711935) * var67 + (var74 & 16711935) * var68 & -16711936) + ((var73 & 65280) * var67 + (var74 & 65280) * var68 & 16711680) >> 8;
                                        var23[var18] = (float) arg2;
                                    }
                                }
                                var10 += var14;
                                ++var18;
                            }
                            var11 += var15;
                            var10 = var66;
                            var18 += var19;
                        }
                    } else {
                        int var75 = (arg6 & 16711680) >> 16;
                        int var76 = (arg6 & 65280) >> 8;
                        int var77 = arg6 & 255;
                        int var78 = arg6 >>> 24;
                        int var79 = 256 - var78;
                        for (int var80 = -arg4; var80 < 0; ++var80) {
                            int var81 = (var11 >> 16) * super.field3410;
                            for (int var82 = -arg3; var82 < 0; ++var82) {
                                if ((float) arg2 < var23[var18]) {
                                    byte var83 = this.field8796[(var10 >> 16) + var81];
                                    if (var83 != 0) {
                                        int var84 = this.field8797[var83 & 255];
                                        if (var78 != 255) {
                                            int var85 = (var84 & 16711680) * var75 & -16777216;
                                            int var86 = (var84 & 65280) * var76 & 16711680;
                                            int var87 = (var84 & 255) * var77 & 65280;
                                            int var88 = (var85 | var86 | var87) >>> 8;
                                            int var89 = var24[var18];
                                            var24[var18] = ((var88 & 16711935) * var78 + (var89 & 16711935) * var79 & -16711936) + ((var88 & 65280) * var78 + (var89 & 65280) * var79 & 16711680) >> 8;
                                            var23[var18] = (float) arg2;
                                        } else {
                                            int var90 = (var84 & 16711680) * var75 & -16777216;
                                            int var91 = (var84 & 65280) * var76 & 16711680;
                                            int var92 = (var84 & 255) * var77 & 65280;
                                            var24[var18] = (var90 | var91 | var92) >>> 8;
                                            var23[var18] = (float) arg2;
                                        }
                                    }
                                }
                                var10 += var14;
                                ++var18;
                            }
                            var11 += var15;
                            var10 = var66;
                            var18 += var19;
                        }
                    }
                } else if (arg5 == 3) {
                    int var93 = var10;
                    int var94 = arg6 >>> 24;
                    int var95 = 256 - var94;
                    for (int var96 = -arg4; var96 < 0; ++var96) {
                        int var97 = (var11 >> 16) * super.field3410;
                        for (int var98 = -arg3; var98 < 0; ++var98) {
                            if ((float) arg2 < var23[var18]) {
                                byte var99 = this.field8796[(var10 >> 16) + var97];
                                int var100 = var99 > 0 ? this.field8797[var99] : 0;
                                int var101 = arg6 + var100;
                                int var102 = (arg6 & 16711935) + (var100 & 16711935);
                                int var103 = (var101 - var102 & 65536) + (var102 & 16777472);
                                int var104 = var101 - var103 | var103 - (var103 >>> 8);
                                if (var100 == 0 && var94 != 255) {
                                    int var106 = var24[var18];
                                    var104 = ((var104 & 16711935) * var94 + (var106 & 16711935) * var95 & -16711936) + ((var104 & 65280) * var94 + (var106 & 65280) * var95 & 16711680) >> 8;
                                }
                                var24[var18] = var104;
                                var23[var18] = (float) arg2;
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var93;
                        var18 += var19;
                    }
                } else if (arg5 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var107 = arg6 >>> 24;
                    int var108 = 256 - var107;
                    int var109 = (arg6 & 16711935) * var108 & -16711936;
                    int var110 = (arg6 & 65280) * var108 & 16711680;
                    int var111 = (var109 | var110) >>> 8;
                    int var112 = var10;
                    for (int var113 = -arg4; var113 < 0; ++var113) {
                        int var114 = (var11 >> 16) * super.field3410;
                        for (int var115 = -arg3; var115 < 0; ++var115) {
                            if ((float) arg2 < var23[var18]) {
                                byte var116 = this.field8796[(var10 >> 16) + var114];
                                if (var116 != 0) {
                                    int var117 = this.field8797[var116 & 255];
                                    int var118 = (var117 & 16711935) * var107 & -16711936;
                                    int var119 = (var117 & 65280) * var107 & 16711680;
                                    var24[var18] = ((var118 | var119) >>> 8) + var111;
                                    var23[var18] = (float) arg2;
                                }
                            }
                            var10 += var14;
                            ++var18;
                        }
                        var11 += var15;
                        var10 = var112;
                        var18 += var19;
                    }
                }
            } else if (arg7 != 2) {
                throw new IllegalArgumentException();
            } else if (arg5 == 1) {
                int var120 = var10;
                for (int var121 = -arg4; var121 < 0; ++var121) {
                    int var122 = (var11 >> 16) * super.field3410;
                    for (int var123 = -arg3; var123 < 0; ++var123) {
                        if ((float) arg2 < var23[var18]) {
                            byte var124 = this.field8796[(var10 >> 16) + var122];
                            if (var124 != 0) {
                                int var125 = this.field8797[var124 & 255];
                                int var126 = var24[var18];
                                int var127 = var125 + var126;
                                int var128 = (var125 & 16711935) + (var126 & 16711935);
                                int var129 = (var127 - var128 & 65536) + (var128 & 16777472);
                                var24[var18] = var127 - var129 | var129 - (var129 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var120;
                    var18 += var19;
                }
            } else if (arg5 == 0) {
                int var130 = var10;
                int var131 = (arg6 & 16711680) >> 16;
                int var132 = (arg6 & 65280) >> 8;
                int var133 = arg6 & 255;
                for (int var134 = -arg4; var134 < 0; ++var134) {
                    int var135 = (var11 >> 16) * super.field3410;
                    for (int var136 = -arg3; var136 < 0; ++var136) {
                        if ((float) arg2 < var23[var18]) {
                            byte var137 = this.field8796[(var10 >> 16) + var135];
                            if (var137 != 0) {
                                int var138 = this.field8797[var137 & 255];
                                int var139 = (var138 & 16711680) * var131 & -16777216;
                                int var140 = (var138 & 65280) * var132 & 16711680;
                                int var141 = (var138 & 255) * var133 & 65280;
                                int var142 = (var139 | var140 | var141) >>> 8;
                                int var143 = var24[var18];
                                int var144 = var142 + var143;
                                int var145 = (var142 & 16711935) + (var143 & 16711935);
                                int var146 = (var144 - var145 & 65536) + (var145 & 16777472);
                                var24[var18] = var144 - var146 | var146 - (var146 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var130;
                    var18 += var19;
                }
            } else if (arg5 == 3) {
                int var147 = var10;
                for (int var148 = -arg4; var148 < 0; ++var148) {
                    int var149 = (var11 >> 16) * super.field3410;
                    for (int var150 = -arg3; var150 < 0; ++var150) {
                        if ((float) arg2 < var23[var18]) {
                            byte var151 = this.field8796[(var10 >> 16) + var149];
                            int var152 = var151 > 0 ? this.field8797[var151] : 0;
                            int var153 = arg6 + var152;
                            int var154 = (arg6 & 16711935) + (var152 & 16711935);
                            int var155 = (var153 - var154 & 65536) + (var154 & 16777472);
                            int var156 = var153 - var155 | var155 - (var155 >>> 8);
                            int var157 = var24[var18];
                            int var158 = var156 + var157;
                            int var159 = (var156 & 16711935) + (var157 & 16711935);
                            int var160 = (var158 - var159 & 65536) + (var159 & 16777472);
                            var24[var18] = var158 - var160 | var160 - (var160 >>> 8);
                            var23[var18] = (float) arg2;
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var147;
                    var18 += var19;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                int var161 = arg6 >>> 24;
                int var162 = 256 - var161;
                int var163 = (arg6 & 16711935) * var162 & -16711936;
                int var164 = (arg6 & 65280) * var162 & 16711680;
                int var165 = (var163 | var164) >>> 8;
                int var166 = var10;
                for (int var167 = -arg4; var167 < 0; ++var167) {
                    int var168 = (var11 >> 16) * super.field3410;
                    for (int var169 = -arg3; var169 < 0; ++var169) {
                        if ((float) arg2 < var23[var18]) {
                            byte var170 = this.field8796[(var10 >> 16) + var168];
                            if (var170 != 0) {
                                int var171 = this.field8797[var170 & 255];
                                int var172 = (var171 & 16711935) * var161 & -16711936;
                                int var173 = (var171 & 65280) * var161 & 16711680;
                                int var174 = ((var172 | var173) >>> 8) + var165;
                                int var175 = var24[var18];
                                int var176 = var174 + var175;
                                int var177 = (var174 & 16711935) + (var175 & 16711935);
                                int var178 = (var176 - var177 & 65536) + (var177 & 16777472);
                                var24[var18] = var176 - var178 | var178 - (var178 >>> 8);
                                var23[var18] = (float) arg2;
                            }
                        }
                        var10 += var14;
                        ++var18;
                    }
                    var11 += var15;
                    var10 = var166;
                    var18 += var19;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V", line = 5409)
    public final void method14(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIII)V", line = 5412)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (super.field3424.method173()) {
            throw new IllegalStateException();
        } else if (arg2 > 0 && arg3 > 0) {
            int var9 = 0;
            int var10 = 0;
            int var11 = super.field3424.field267;
            int var12 = super.field3437 + super.field3410 + super.field3421;
            int var13 = super.field3431 + super.field3429 + super.field3440;
            int var14 = (var12 << 16) / arg2;
            int var15 = (var13 << 16) / arg3;
            if (super.field3437 > 0) {
                int var16 = ((super.field3437 << 16) + var14 - 1) / var14;
                arg0 += var16;
                var9 += var14 * var16 - (super.field3437 << 16);
            }
            if (super.field3431 > 0) {
                int var17 = ((super.field3431 << 16) + var15 - 1) / var15;
                arg1 += var17;
                var10 += var15 * var17 - (super.field3431 << 16);
            }
            if (super.field3410 < var12) {
                arg2 = ((super.field3410 << 16) - var9 + var14 - 1) / var14;
            }
            if (super.field3429 < var13) {
                arg3 = ((super.field3429 << 16) - var10 + var15 - 1) / var15;
            }
            int var18 = arg1 * var11 + arg0;
            int var19 = var11 - arg2;
            if (arg1 + arg3 > super.field3424.field230) {
                arg3 -= arg1 + arg3 - super.field3424.field230;
            }
            if (arg1 < super.field3424.field257) {
                int var20 = super.field3424.field257 - arg1;
                arg3 -= var20;
                var18 += var11 * var20;
                var10 += var15 * var20;
            }
            if (arg0 + arg2 > super.field3424.field263) {
                int var21 = arg0 + arg2 - super.field3424.field263;
                arg2 -= var21;
                var19 += var21;
            }
            if (arg0 < super.field3424.field234) {
                int var22 = super.field3424.field234 - arg0;
                arg2 -= var22;
                var18 += var22;
                var9 += var14 * var22;
                var19 += var22;
            }
            int[] var23 = super.field3424.field240;
            if (arg6 == 0) {
                if (arg4 == 1) {
                    int var24 = var9;
                    for (int var25 = -arg3; var25 < 0; ++var25) {
                        int var26 = (var10 >> 16) * super.field3410;
                        for (int var27 = -arg2; var27 < 0; ++var27) {
                            var23[var18++] = this.field8797[this.field8796[(var9 >> 16) + var26] & 255];
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
                        int var33 = (var10 >> 16) * super.field3410;
                        for (int var34 = -arg2; var34 < 0; ++var34) {
                            int var35 = this.field8797[this.field8796[(var9 >> 16) + var33] & 255];
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
                        int var41 = (var10 >> 16) * super.field3410;
                        for (int var42 = -arg2; var42 < 0; ++var42) {
                            byte var43 = this.field8796[(var9 >> 16) + var41];
                            int var44 = var43 > 0 ? this.field8797[var43] : 0;
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
                        int var55 = (var10 >> 16) * super.field3410;
                        for (int var56 = -arg2; var56 < 0; ++var56) {
                            int var57 = this.field8797[this.field8796[(var9 >> 16) + var55] & 255];
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
                        int var62 = (var10 >> 16) * super.field3410;
                        for (int var63 = -arg2; var63 < 0; ++var63) {
                            byte var64 = this.field8796[(var9 >> 16) + var62];
                            if (var64 != 0) {
                                var23[var18++] = this.field8797[var64 & 255];
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
                            int var69 = (var10 >> 16) * super.field3410;
                            for (int var70 = -arg2; var70 < 0; ++var70) {
                                byte var71 = this.field8796[(var9 >> 16) + var69];
                                if (var71 != 0) {
                                    int var72 = this.field8797[var71 & 255];
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
                            int var80 = (var10 >> 16) * super.field3410;
                            for (int var81 = -arg2; var81 < 0; ++var81) {
                                byte var82 = this.field8796[(var9 >> 16) + var80];
                                if (var82 != 0) {
                                    int var83 = this.field8797[var82 & 255];
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
                        int var96 = (var10 >> 16) * super.field3410;
                        for (int var97 = -arg2; var97 < 0; ++var97) {
                            byte var98 = this.field8796[(var9 >> 16) + var96];
                            int var99 = var98 > 0 ? this.field8797[var98] : 0;
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
                        int var113 = (var10 >> 16) * super.field3410;
                        for (int var114 = -arg2; var114 < 0; ++var114) {
                            byte var115 = this.field8796[(var9 >> 16) + var113];
                            if (var115 != 0) {
                                int var116 = this.field8797[var115 & 255];
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
                    int var121 = (var10 >> 16) * super.field3410;
                    for (int var122 = -arg2; var122 < 0; ++var122) {
                        byte var123 = this.field8796[(var9 >> 16) + var121];
                        if (var123 != 0) {
                            int var124 = this.field8797[var123 & 255];
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
                    int var134 = (var10 >> 16) * super.field3410;
                    for (int var135 = -arg2; var135 < 0; ++var135) {
                        byte var136 = this.field8796[(var9 >> 16) + var134];
                        if (var136 != 0) {
                            int var137 = this.field8797[var136 & 255];
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
                    int var148 = (var10 >> 16) * super.field3410;
                    for (int var149 = -arg2; var149 < 0; ++var149) {
                        byte var150 = this.field8796[(var9 >> 16) + var148];
                        int var151 = var150 > 0 ? this.field8797[var150] : 0;
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
                    int var167 = (var10 >> 16) * super.field3410;
                    for (int var168 = -arg2; var168 < 0; ++var168) {
                        byte var169 = this.field8796[(var9 >> 16) + var167];
                        if (var169 != 0) {
                            int var170 = this.field8797[var169 & 255];
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

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII)V", line = 6147)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lfba;[B[III)V", line = 6150)
    public class611(class24 arg0, byte[] arg1, int[] arg2, int arg3, int arg4) {
        super(arg0, arg3, arg4);
        this.field8796 = arg1;
        this.field8797 = arg2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILaa;II)V", line = 6155)
    public final void method9(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        if (super.field3424.method173()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field3437 + arg0;
            int var7 = super.field3431 + arg1;
            int var8 = 0;
            int var9 = super.field3424.field267;
            int var10 = super.field3410;
            int var11 = super.field3429;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var7 * var9 + var6;
            if (var7 < super.field3424.field257) {
                int var15 = super.field3424.field257 - var7;
                var11 -= var15;
                var7 = super.field3424.field257;
                var8 += var10 * var15;
                var14 += var9 * var15;
            }
            if (var7 + var11 > super.field3424.field230) {
                var11 -= var7 + var11 - super.field3424.field230;
            }
            if (var6 < super.field3424.field234) {
                int var16 = super.field3424.field234 - var6;
                var10 -= var16;
                var6 = super.field3424.field234;
                var8 += var16;
                var14 += var16;
                var13 += var16;
                var12 += var16;
            }
            if (var6 + var10 > super.field3424.field263) {
                int var17 = var6 + var10 - super.field3424.field263;
                var10 -= var17;
                var13 += var17;
                var12 += var17;
            }
            if (var10 > 0 && var11 > 0) {
                class566 var18 = (class566) arg2;
                int[] var19 = var18.field8234;
                int[] var20 = var18.field8231;
                int[] var21 = super.field3424.field240;
                int var22 = var7;
                if (arg4 > var7) {
                    var22 = arg4;
                    var14 += (arg4 - var7) * var9;
                    var8 += (arg4 - var7) * super.field3410;
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
                        byte var32 = this.field8796[var8++];
                        if (var32 != 0) {
                            var21[var14++] = this.field8797[var32 & 255];
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

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V", line = 6300)
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (super.field3424.method173()) {
            throw new IllegalStateException();
        } else {
            int var6 = super.field3424.field267;
            int var7 = super.field3437 + arg0;
            int var8 = super.field3431 + arg1;
            int var9 = var6 * var8 + var7;
            int var10 = 0;
            int var11 = super.field3429;
            int var12 = super.field3410;
            int var13 = var6 - var12;
            int var14 = 0;
            if (var8 < super.field3424.field257) {
                int var15 = super.field3424.field257 - var8;
                var11 -= var15;
                var8 = super.field3424.field257;
                var10 += var12 * var15;
                var9 += var6 * var15;
            }
            if (var8 + var11 > super.field3424.field230) {
                var11 -= var8 + var11 - super.field3424.field230;
            }
            if (var7 < super.field3424.field234) {
                int var16 = super.field3424.field234 - var7;
                var12 -= var16;
                var7 = super.field3424.field234;
                var10 += var16;
                var9 += var16;
                var14 += var16;
                var13 += var16;
            }
            if (var7 + var12 > super.field3424.field263) {
                int var17 = var7 + var12 - super.field3424.field263;
                var12 -= var17;
                var14 += var17;
                var13 += var17;
            }
            if (var12 > 0 && var11 > 0) {
                int[] var18 = super.field3424.field240;
                if (arg4 == 0) {
                    if (arg2 == 1) {
                        for (int var19 = -var11; var19 < 0; ++var19) {
                            int var20 = var9 + var12 - 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field8797[this.field8796[var10++] & 255];
                                var18[var9++] = this.field8797[this.field8796[var10++] & 255];
                                var18[var9++] = this.field8797[this.field8796[var10++] & 255];
                                var18[var9++] = this.field8797[this.field8796[var10++] & 255];
                            }
                            var20 += 3;
                            while (var9 < var20) {
                                var18[var9++] = this.field8797[this.field8796[var10++] & 255];
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
                                int var26 = this.field8797[this.field8796[var10++] & 255];
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
                                int var32 = this.field8797[this.field8796[var10++] & 255];
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
                                int var43 = this.field8797[this.field8796[var10++] & 255];
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
                                byte var48 = this.field8796[var10++];
                                if (var48 != 0) {
                                    int var49 = this.field8797[var48 & 255] | -16777216;
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
                                    byte var57 = this.field8796[var10++];
                                    if (var57 != 0) {
                                        int var58 = this.field8797[var57 & 255];
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
                                    byte var67 = this.field8796[var10++];
                                    if (var67 != 0) {
                                        int var68 = this.field8797[var67 & 255];
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
                                byte var81 = this.field8796[var10++];
                                int var82 = var81 > 0 ? this.field8797[var81] : 0;
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
                                byte var96 = this.field8796[var10++];
                                if (var96 != 0) {
                                    int var97 = this.field8797[var96 & 255];
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
                            byte var102 = this.field8796[var10++];
                            if (var102 != 0) {
                                int var103 = this.field8797[var102 & 255];
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
                            byte var113 = this.field8796[var10++];
                            if (var113 != 0) {
                                int var114 = this.field8797[var113 & 255];
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
                            byte var125 = this.field8796[var10++];
                            int var126 = var125 > 0 ? this.field8797[var125] : 0;
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
                            byte var142 = this.field8796[var10++];
                            if (var142 != 0) {
                                int var143 = this.field8797[var142 & 255];
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
}
