import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class266 extends class12 {

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "[I")
    public int[] field4745;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V")
    public final void method1826() {
        int[] var1 = new int[super.field184 * super.field183];
        int var2 = 0;
        for (int var3 = 0; var3 < super.field183; ++var3) {
            for (int var4 = super.field184 - 1; var4 >= 0; --var4) {
                var1[var2++] = this.field4745[super.field184 * var3 + var4];
            }
        }
        this.field4745 = var1;
        super.field191 = super.field182 - super.field184 - super.field191;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public void method52(int arg0, int arg1, int arg2) {
        int var4 = super.field191 + arg0;
        int var5 = super.field189 + arg1;
        int var6 = class179.field3066 * var5 + var4;
        int var7 = 0;
        int var8 = super.field183;
        int var9 = super.field184;
        int var10 = class179.field3066 - var9;
        int var11 = 0;
        if (var5 < class179.field3071) {
            int var12 = class179.field3071 - var5;
            var8 -= var12;
            var5 = class179.field3071;
            var7 += var9 * var12;
            var6 += class179.field3066 * var12;
        }
        if (var5 + var8 > class179.field3070) {
            var8 -= var5 + var8 - class179.field3070;
        }
        if (var4 < class179.field3072) {
            int var13 = class179.field3072 - var4;
            var9 -= var13;
            var4 = class179.field3072;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class179.field3067) {
            int var14 = var4 + var9 - class179.field3067;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1833(class179.field3068, this.field4745, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 0 && arg3 > 0) {
            int var5 = super.field184;
            int var6 = super.field183;
            int var7 = 0;
            int var8 = 0;
            int var9 = super.field182;
            int var10 = super.field185;
            int var11 = (var9 << 16) / arg2;
            int var12 = (var10 << 16) / arg3;
            if (super.field191 > 0) {
                int var13 = ((super.field191 << 16) + var11 - 1) / var11;
                arg0 += var13;
                var7 += var11 * var13 - (super.field191 << 16);
            }
            if (super.field189 > 0) {
                int var14 = ((super.field189 << 16) + var12 - 1) / var12;
                arg1 += var14;
                var8 += var12 * var14 - (super.field189 << 16);
            }
            if (var5 < var9) {
                arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
            }
            if (var6 < var10) {
                arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            int var15 = class179.field3066 * arg1 + arg0;
            int var16 = class179.field3066 - arg2;
            if (arg1 + arg3 > class179.field3070) {
                arg3 -= arg1 + arg3 - class179.field3070;
            }
            if (arg1 < class179.field3071) {
                int var17 = class179.field3071 - arg1;
                arg3 -= var17;
                var15 += class179.field3066 * var17;
                var8 += var12 * var17;
            }
            if (arg0 + arg2 > class179.field3067) {
                int var18 = arg0 + arg2 - class179.field3067;
                arg2 -= var18;
                var16 += var18;
            }
            if (arg0 < class179.field3072) {
                int var19 = class179.field3072 - arg0;
                arg2 -= var19;
                var15 += var19;
                var7 += var11 * var19;
                var16 += var19;
            }
            method1834(class179.field3068, this.field4745, 0, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[I[I)V")
    public final void method1827(int arg0, int arg1, int[] arg2, int[] arg3) {
        if (class179.field3070 - class179.field3071 != arg2.length) {
            throw new IllegalStateException();
        } else {
            int var5 = super.field191 + arg0;
            int var6 = super.field189 + arg1;
            int var7 = 0;
            int var8 = super.field183;
            int var9 = super.field184;
            int var10 = class179.field3066 - var9;
            int var11 = 0;
            int var12 = class179.field3066 * var6 + var5;
            if (var6 < class179.field3071) {
                int var13 = class179.field3071 - var6;
                var8 -= var13;
                var6 = class179.field3071;
                var7 += var9 * var13;
                var12 += class179.field3066 * var13;
            }
            if (var6 + var8 > class179.field3070) {
                var8 -= var6 + var8 - class179.field3070;
            }
            if (var5 < class179.field3072) {
                int var14 = class179.field3072 - var5;
                var9 -= var14;
                var5 = class179.field3072;
                var7 += var14;
                var12 += var14;
                var11 += var14;
                var10 += var14;
            }
            if (var5 + var9 > class179.field3067) {
                int var15 = var5 + var9 - class179.field3067;
                var9 -= var15;
                var11 += var15;
                var10 += var15;
            }
            if (var9 > 0 && var8 > 0) {
                int var16 = var5 - class179.field3072;
                int var17 = var6 - class179.field3071;
                for (int var18 = var17; var18 < var8 + var17; ++var18) {
                    int var19 = arg2[var18];
                    int var20 = arg3[var18];
                    int var21 = var9;
                    if (var16 > var19) {
                        int var22 = var16 - var19;
                        if (var22 >= var20) {
                            var7 += var9 + var11;
                            var12 += var9 + var10;
                            continue;
                        }
                        var20 -= var22;
                    } else {
                        int var23 = var19 - var16;
                        if (var23 >= var9) {
                            var7 += var9 + var11;
                            var12 += var9 + var10;
                            continue;
                        }
                        var7 += var23;
                        var21 = var9 - var23;
                        var12 += var23;
                    }
                    int var24 = 0;
                    if (var21 < var20) {
                        var20 = var21;
                    } else {
                        var24 = var21 - var20;
                    }
                    for (int var25 = -var20; var25 < 0; ++var25) {
                        int var26 = this.field4745[var7++];
                        if (var26 != 0) {
                            class179.field3068[var12++] = var26;
                        } else {
                            ++var12;
                        }
                    }
                    var7 += var11 + var24;
                    var12 += var10 + var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIII[I[I)V")
    public void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class179.field3066 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; ++var20) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; ++var25) {
                    class179.field3068[var22++] = this.field4745[(var23 >> 16) + (var24 >> 16) * super.field184];
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class179.field3066;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[IIIIIII)V")
    private static final void method1828(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; ++var8) {
            int var9 = arg3 + arg4 - 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            var9 += 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
    public final void method1829() {
        if (super.field184 != super.field182 || super.field185 != super.field183) {
            int[] var1 = new int[super.field185 * super.field182];
            for (int var2 = 0; var2 < super.field183; ++var2) {
                for (int var3 = 0; var3 < super.field184; ++var3) {
                    var1[(super.field189 + var2) * super.field182 + super.field191 + var3] = this.field4745[super.field184 * var2 + var3];
                }
            }
            this.field4745 = var1;
            super.field184 = super.field182;
            super.field183 = super.field185;
            super.field191 = 0;
            super.field189 = 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
    public void method57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            int var7 = arg0 - (super.field191 << 4);
            int var8 = arg1 - (super.field189 << 4);
            double var9 = (double) (arg4 & 65535) * 9.587379924285257E-5D;
            int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
            int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
            int var13 = -var7 * var12 + -var8 * var11;
            int var14 = -var8 * var12 + var7 * var11;
            int var15 = ((super.field184 << 4) - var7) * var12 + -var8 * var11;
            int var16 = -((super.field184 << 4) - var7) * var11 + -var8 * var12;
            int var17 = ((super.field183 << 4) - var8) * var11 + -var7 * var12;
            int var18 = ((super.field183 << 4) - var8) * var12 + var7 * var11;
            int var19 = ((super.field184 << 4) - var7) * var12 + ((super.field183 << 4) - var8) * var11;
            int var20 = ((super.field183 << 4) - var8) * var12 + -((super.field184 << 4) - var7) * var11;
            int var21;
            int var22;
            if (var13 < var15) {
                var21 = var13;
                var22 = var15;
            } else {
                var21 = var15;
                var22 = var13;
            }
            if (var17 < var21) {
                var21 = var17;
            }
            if (var19 < var21) {
                var21 = var19;
            }
            if (var17 > var22) {
                var22 = var17;
            }
            if (var19 > var22) {
                var22 = var19;
            }
            int var23;
            int var24;
            if (var14 < var16) {
                var23 = var14;
                var24 = var16;
            } else {
                var23 = var16;
                var24 = var14;
            }
            if (var18 < var23) {
                var23 = var18;
            }
            if (var20 < var23) {
                var23 = var20;
            }
            if (var18 > var24) {
                var24 = var18;
            }
            if (var20 > var24) {
                var24 = var20;
            }
            int var25 = var21 >> 12;
            int var26 = var22 + 4095 >> 12;
            int var27 = var23 >> 12;
            int var28 = var24 + 4095 >> 12;
            int var29 = arg2 + var25;
            int var30 = arg2 + var26;
            int var31 = arg3 + var27;
            int var32 = arg3 + var28;
            int var33 = var29 >> 4;
            int var34 = var30 + 15 >> 4;
            int var35 = var31 >> 4;
            int var36 = var32 + 15 >> 4;
            if (var33 < class179.field3072) {
                var33 = class179.field3072;
            }
            if (var34 > class179.field3067) {
                var34 = class179.field3067;
            }
            if (var35 < class179.field3071) {
                var35 = class179.field3071;
            }
            if (var36 > class179.field3070) {
                var36 = class179.field3070;
            }
            int var37 = var33 - var34;
            if (var37 < 0) {
                int var38 = var35 - var36;
                if (var38 < 0) {
                    int var39 = class179.field3066 * var35 + var33;
                    double var40 = 1.6777216E7D / (double) arg5;
                    int var42 = (int) Math.floor(Math.sin(var9) * var40 + 0.5D);
                    int var43 = (int) Math.floor(Math.cos(var9) * var40 + 0.5D);
                    int var44 = (var33 << 4) + 8 - arg2;
                    int var45 = (var35 << 4) + 8 - arg3;
                    int var46 = (var7 << 8) - (var42 * var45 >> 4);
                    int var47 = (var8 << 8) + (var43 * var45 >> 4);
                    if (var43 == 0) {
                        if (var42 == 0) {
                            int var48 = var38;
                            while (var48 < 0) {
                                int var49 = var39;
                                int var50 = var46;
                                int var51 = var47;
                                int var52 = var37;
                                if (var46 >= 0 && var47 >= 0 && var46 - (super.field184 << 12) < 0 && var47 - (super.field183 << 12) < 0) {
                                    while (var52 < 0) {
                                        int var53 = this.field4745[(var50 >> 12) + (var51 >> 12) * super.field184];
                                        if (var53 != 0) {
                                            class179.field3068[var49++] = var53;
                                        } else {
                                            ++var49;
                                        }
                                        ++var52;
                                    }
                                }
                                ++var48;
                                var39 += class179.field3066;
                            }
                        } else if (var42 < 0) {
                            int var54 = var38;
                            while (var54 < 0) {
                                int var55 = var39;
                                int var56 = var46;
                                int var57 = (var42 * var44 >> 4) + var47;
                                int var58 = var37;
                                if (var46 >= 0 && var46 - (super.field184 << 12) < 0) {
                                    int var59;
                                    if ((var59 = var57 - (super.field183 << 12)) >= 0) {
                                        int var60 = (var42 - var59) / var42;
                                        var58 = var37 + var60;
                                        var57 += var42 * var60;
                                        var55 = var39 + var60;
                                    }
                                    int var61;
                                    if ((var61 = (var57 - var42) / var42) > var58) {
                                        var58 = var61;
                                    }
                                    while (var58 < 0) {
                                        int var62 = this.field4745[(var56 >> 12) + (var57 >> 12) * super.field184];
                                        if (var62 != 0) {
                                            class179.field3068[var55++] = var62;
                                        } else {
                                            ++var55;
                                        }
                                        var57 += var42;
                                        ++var58;
                                    }
                                }
                                ++var54;
                                var46 -= var42;
                                var39 += class179.field3066;
                            }
                        } else {
                            int var63 = var38;
                            while (var63 < 0) {
                                int var64 = var39;
                                int var65 = var46;
                                int var66 = (var42 * var44 >> 4) + var47;
                                int var67 = var37;
                                if (var46 >= 0 && var46 - (super.field184 << 12) < 0) {
                                    if (var66 < 0) {
                                        int var68 = (var42 - 1 - var66) / var42;
                                        var67 = var37 + var68;
                                        var66 += var42 * var68;
                                        var64 = var39 + var68;
                                    }
                                    int var69;
                                    if ((var69 = (var66 + 1 - (super.field183 << 12) - var42) / var42) > var67) {
                                        var67 = var69;
                                    }
                                    while (var67 < 0) {
                                        int var70 = this.field4745[(var65 >> 12) + (var66 >> 12) * super.field184];
                                        if (var70 != 0) {
                                            class179.field3068[var64++] = var70;
                                        } else {
                                            ++var64;
                                        }
                                        var66 += var42;
                                        ++var67;
                                    }
                                }
                                ++var63;
                                var46 -= var42;
                                var39 += class179.field3066;
                            }
                        }
                    } else if (var43 < 0) {
                        if (var42 == 0) {
                            int var71 = var38;
                            while (var71 < 0) {
                                int var72 = var39;
                                int var73 = (var43 * var44 >> 4) + var46;
                                int var74 = var47;
                                int var75 = var37;
                                if (var47 >= 0 && var47 - (super.field183 << 12) < 0) {
                                    int var76;
                                    if ((var76 = var73 - (super.field184 << 12)) >= 0) {
                                        int var77 = (var43 - var76) / var43;
                                        var75 = var37 + var77;
                                        var73 += var43 * var77;
                                        var72 = var39 + var77;
                                    }
                                    int var78;
                                    if ((var78 = (var73 - var43) / var43) > var75) {
                                        var75 = var78;
                                    }
                                    while (var75 < 0) {
                                        int var79 = this.field4745[(var73 >> 12) + (var74 >> 12) * super.field184];
                                        if (var79 != 0) {
                                            class179.field3068[var72++] = var79;
                                        } else {
                                            ++var72;
                                        }
                                        var73 += var43;
                                        ++var75;
                                    }
                                }
                                ++var71;
                                var47 += var43;
                                var39 += class179.field3066;
                            }
                        } else if (var42 < 0) {
                            int var80 = var38;
                            while (var80 < 0) {
                                int var81 = var39;
                                int var82 = (var43 * var44 >> 4) + var46;
                                int var83 = (var42 * var44 >> 4) + var47;
                                int var84 = var37;
                                int var85;
                                if ((var85 = var82 - (super.field184 << 12)) >= 0) {
                                    int var86 = (var43 - var85) / var43;
                                    var84 = var37 + var86;
                                    var82 += var43 * var86;
                                    var83 += var42 * var86;
                                    var81 = var39 + var86;
                                }
                                int var87;
                                if ((var87 = (var82 - var43) / var43) > var84) {
                                    var84 = var87;
                                }
                                int var88;
                                if ((var88 = var83 - (super.field183 << 12)) >= 0) {
                                    int var89 = (var42 - var88) / var42;
                                    var84 += var89;
                                    var82 += var43 * var89;
                                    var83 += var42 * var89;
                                    var81 += var89;
                                }
                                int var90;
                                if ((var90 = (var83 - var42) / var42) > var84) {
                                    var84 = var90;
                                }
                                while (var84 < 0) {
                                    int var91 = this.field4745[(var82 >> 12) + (var83 >> 12) * super.field184];
                                    if (var91 != 0) {
                                        class179.field3068[var81++] = var91;
                                    } else {
                                        ++var81;
                                    }
                                    var82 += var43;
                                    var83 += var42;
                                    ++var84;
                                }
                                ++var80;
                                var46 -= var42;
                                var47 += var43;
                                var39 += class179.field3066;
                            }
                        } else {
                            int var92 = var38;
                            while (var92 < 0) {
                                int var93 = var39;
                                int var94 = (var43 * var44 >> 4) + var46;
                                int var95 = (var42 * var44 >> 4) + var47;
                                int var96 = var37;
                                int var97;
                                if ((var97 = var94 - (super.field184 << 12)) >= 0) {
                                    int var98 = (var43 - var97) / var43;
                                    var96 = var37 + var98;
                                    var94 += var43 * var98;
                                    var95 += var42 * var98;
                                    var93 = var39 + var98;
                                }
                                int var99;
                                if ((var99 = (var94 - var43) / var43) > var96) {
                                    var96 = var99;
                                }
                                if (var95 < 0) {
                                    int var100 = (var42 - 1 - var95) / var42;
                                    var96 += var100;
                                    var94 += var43 * var100;
                                    var95 += var42 * var100;
                                    var93 += var100;
                                }
                                int var101;
                                if ((var101 = (var95 + 1 - (super.field183 << 12) - var42) / var42) > var96) {
                                    var96 = var101;
                                }
                                while (var96 < 0) {
                                    int var102 = this.field4745[(var94 >> 12) + (var95 >> 12) * super.field184];
                                    if (var102 != 0) {
                                        class179.field3068[var93++] = var102;
                                    } else {
                                        ++var93;
                                    }
                                    var94 += var43;
                                    var95 += var42;
                                    ++var96;
                                }
                                ++var92;
                                var46 -= var42;
                                var47 += var43;
                                var39 += class179.field3066;
                            }
                        }
                    } else if (var42 == 0) {
                        int var103 = var38;
                        while (var103 < 0) {
                            int var104 = var39;
                            int var105 = (var43 * var44 >> 4) + var46;
                            int var106 = var47;
                            int var107 = var37;
                            if (var47 >= 0 && var47 - (super.field183 << 12) < 0) {
                                if (var105 < 0) {
                                    int var108 = (var43 - 1 - var105) / var43;
                                    var107 = var37 + var108;
                                    var105 += var43 * var108;
                                    var104 = var39 + var108;
                                }
                                int var109;
                                if ((var109 = (var105 + 1 - (super.field184 << 12) - var43) / var43) > var107) {
                                    var107 = var109;
                                }
                                while (var107 < 0) {
                                    int var110 = this.field4745[(var105 >> 12) + (var106 >> 12) * super.field184];
                                    if (var110 != 0) {
                                        class179.field3068[var104++] = var110;
                                    } else {
                                        ++var104;
                                    }
                                    var105 += var43;
                                    ++var107;
                                }
                            }
                            ++var103;
                            var47 += var43;
                            var39 += class179.field3066;
                        }
                    } else if (var42 < 0) {
                        int var111 = var38;
                        while (var111 < 0) {
                            int var112 = var39;
                            int var113 = (var43 * var44 >> 4) + var46;
                            int var114 = (var42 * var44 >> 4) + var47;
                            int var115 = var37;
                            if (var113 < 0) {
                                int var116 = (var43 - 1 - var113) / var43;
                                var115 = var37 + var116;
                                var113 += var43 * var116;
                                var114 += var42 * var116;
                                var112 = var39 + var116;
                            }
                            int var117;
                            if ((var117 = (var113 + 1 - (super.field184 << 12) - var43) / var43) > var115) {
                                var115 = var117;
                            }
                            int var118;
                            if ((var118 = var114 - (super.field183 << 12)) >= 0) {
                                int var119 = (var42 - var118) / var42;
                                var115 += var119;
                                var113 += var43 * var119;
                                var114 += var42 * var119;
                                var112 += var119;
                            }
                            int var120;
                            if ((var120 = (var114 - var42) / var42) > var115) {
                                var115 = var120;
                            }
                            while (var115 < 0) {
                                int var121 = this.field4745[(var113 >> 12) + (var114 >> 12) * super.field184];
                                if (var121 != 0) {
                                    class179.field3068[var112++] = var121;
                                } else {
                                    ++var112;
                                }
                                var113 += var43;
                                var114 += var42;
                                ++var115;
                            }
                            ++var111;
                            var46 -= var42;
                            var47 += var43;
                            var39 += class179.field3066;
                        }
                    } else {
                        int var122 = var38;
                        while (var122 < 0) {
                            int var123 = var39;
                            int var124 = (var43 * var44 >> 4) + var46;
                            int var125 = (var42 * var44 >> 4) + var47;
                            int var126 = var37;
                            if (var124 < 0) {
                                int var127 = (var43 - 1 - var124) / var43;
                                var126 = var37 + var127;
                                var124 += var43 * var127;
                                var125 += var42 * var127;
                                var123 = var39 + var127;
                            }
                            int var128;
                            if ((var128 = (var124 + 1 - (super.field184 << 12) - var43) / var43) > var126) {
                                var126 = var128;
                            }
                            if (var125 < 0) {
                                int var129 = (var42 - 1 - var125) / var42;
                                var126 += var129;
                                var124 += var43 * var129;
                                var125 += var42 * var129;
                                var123 += var129;
                            }
                            int var130;
                            if ((var130 = (var125 + 1 - (super.field183 << 12) - var42) / var42) > var126) {
                                var126 = var130;
                            }
                            while (var126 < 0) {
                                int var131 = this.field4745[(var124 >> 12) + (var125 >> 12) * super.field184];
                                if (var131 != 0) {
                                    class179.field3068[var123++] = var131;
                                } else {
                                    ++var123;
                                }
                                var124 += var43;
                                var125 += var42;
                                ++var126;
                            }
                            ++var122;
                            var46 -= var42;
                            var47 += var43;
                            var39 += class179.field3066;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method56(arg0, arg1);
        } else {
            int var5 = super.field191 + arg0;
            int var6 = super.field189 + arg1;
            int var7 = class179.field3066 * var6 + var5;
            int var8 = 0;
            int var9 = super.field183;
            int var10 = super.field184;
            int var11 = class179.field3066 - var10;
            int var12 = 0;
            if (var6 < class179.field3071) {
                int var13 = class179.field3071 - var6;
                var9 -= var13;
                var6 = class179.field3071;
                var8 += var10 * var13;
                var7 += class179.field3066 * var13;
            }
            if (var6 + var9 > class179.field3070) {
                var9 -= var6 + var9 - class179.field3070;
            }
            if (var5 < class179.field3072) {
                int var14 = class179.field3072 - var5;
                var10 -= var14;
                var5 = class179.field3072;
                var8 += var14;
                var7 += var14;
                var12 += var14;
                var11 += var14;
            }
            if (var5 + var10 > class179.field3067) {
                int var15 = var5 + var10 - class179.field3067;
                var10 -= var15;
                var12 += var15;
                var11 += var15;
            }
            if (var10 > 0 && var9 > 0) {
                method1832(class179.field3068, this.field4745, 0, var8, var7, var10, var9, var11, var12, arg2, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
    public void method51(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > 0 && arg3 > 0) {
            int var6 = super.field184;
            int var7 = super.field183;
            int var8 = 0;
            int var9 = 0;
            int var10 = super.field182;
            int var11 = super.field185;
            int var12 = (var10 << 16) / arg2;
            int var13 = (var11 << 16) / arg3;
            if (super.field191 > 0) {
                int var14 = ((super.field191 << 16) + var12 - 1) / var12;
                arg0 += var14;
                var8 += var12 * var14 - (super.field191 << 16);
            }
            if (super.field189 > 0) {
                int var15 = ((super.field189 << 16) + var13 - 1) / var13;
                arg1 += var15;
                var9 += var13 * var15 - (super.field189 << 16);
            }
            if (var6 < var10) {
                arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            if (var7 < var11) {
                arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }
            int var16 = class179.field3066 * arg1 + arg0;
            int var17 = class179.field3066 - arg2;
            if (arg1 + arg3 > class179.field3070) {
                arg3 -= arg1 + arg3 - class179.field3070;
            }
            if (arg1 < class179.field3071) {
                int var18 = class179.field3071 - arg1;
                arg3 -= var18;
                var16 += class179.field3066 * var18;
                var9 += var13 * var18;
            }
            if (arg0 + arg2 > class179.field3067) {
                int var19 = arg0 + arg2 - class179.field3067;
                arg2 -= var19;
                var17 += var19;
            }
            if (arg0 < class179.field3072) {
                int var20 = class179.field3072 - arg0;
                arg2 -= var20;
                var16 += var20;
                var8 += var12 * var20;
                var17 += var20;
            }
            method1831(class179.field3068, this.field4745, 0, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()V")
    public final void method1830() {
        int[] var1 = new int[super.field184 * super.field183];
        int var2 = 0;
        for (int var3 = super.field183 - 1; var3 >= 0; --var3) {
            for (int var4 = 0; var4 < super.field184; ++var4) {
                var1[var2++] = this.field4745[super.field184 * var3 + var4];
            }
        }
        this.field4745 = var1;
        super.field189 = super.field185 - super.field183 - super.field189;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIIIIII[I[I)V")
    public void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class179.field3066 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; ++var20) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; ++var25) {
                    int var26 = this.field4745[(var23 >> 16) + (var24 >> 16) * super.field184];
                    if (var26 != 0) {
                        class179.field3068[var22++] = var26;
                    } else {
                        ++var22;
                    }
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class179.field3066;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[IIIIIIIIIIII)V")
    private static final void method1831(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = 256 - arg12;
        int var14 = arg3;
        for (int var15 = -arg8; var15 < 0; ++var15) {
            int var16 = (arg4 >> 16) * arg11;
            for (int var17 = -arg7; var17 < 0; ++var17) {
                int var18 = arg1[(arg3 >> 16) + var16];
                if (var18 != 0) {
                    int var19 = arg0[arg5];
                    arg0[arg5++] = ((var18 & 16711935) * arg12 + (var19 & 16711935) * var13 & -16711936) + ((var18 & 65280) * arg12 + (var19 & 65280) * var13 & 16711680) >> 8;
                } else {
                    ++arg5;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var14;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIII[I)V")
    public class266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        super.field182 = arg0;
        super.field185 = arg1;
        super.field191 = arg2;
        super.field189 = arg3;
        super.field184 = arg4;
        super.field183 = arg5;
        this.field4745 = arg6;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIDI)V")
    public void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
        try {
            int var10 = -arg2 / 2;
            int var11 = -arg3 / 2;
            int var12 = (int) (Math.sin(arg6) * 65536.0D);
            int var13 = (int) (Math.cos(arg6) * 65536.0D);
            int var14 = arg7 * var12 >> 8;
            int var15 = arg7 * var13 >> 8;
            int var16 = (arg4 << 16) + var10 * var15 + var11 * var14;
            int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
            int var18 = class179.field3066 * arg1 + arg0;
            for (int var19 = 0; var19 < arg3; ++var19) {
                int var20 = var18;
                int var21 = var16;
                int var22 = var17;
                for (int var23 = -arg2; var23 < 0; ++var23) {
                    int var24 = this.field4745[(var21 >> 16) + (var22 >> 16) * super.field184];
                    if (var24 != 0) {
                        class179.field3068[var20++] = var24;
                    } else {
                        ++var20;
                    }
                    var21 += var15;
                    var22 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += class179.field3066;
            }
        } catch (Exception var25) {
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[IIIIIIIIII)V")
    private static final void method1832(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = 256 - arg9;
        int var12 = (arg10 & 16711935) * var11 & -16711936;
        int var13 = (arg10 & 65280) * var11 & 16711680;
        int var14 = (var12 | var13) >>> 8;
        for (int var15 = -arg6; var15 < 0; ++var15) {
            for (int var16 = -arg5; var16 < 0; ++var16) {
                int var17 = arg1[arg3++];
                if (var17 != 0) {
                    int var18 = (var17 & 16711935) * arg9 & -16711936;
                    int var19 = (var17 & 65280) * arg9 & 16711680;
                    arg0[arg4++] = ((var18 | var19) >>> 8) + var14;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[IIIIIIIII)V")
    private static final void method1833(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; ++var11) {
            for (int var12 = -arg5; var12 < 0; ++var12) {
                int var13 = arg1[arg3++];
                if (var13 != 0) {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = ((var13 & 16711935) * arg9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * arg9 + (var14 & 65280) * var10 & 16711680) >> 8;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[IIIIIIIIIII)V")
    private static final void method1834(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; ++var13) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; ++var15) {
                int var16 = arg1[(arg3 >> 16) + var14];
                if (var16 != 0) {
                    arg0[arg5++] = var16;
                } else {
                    ++arg5;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
    public final void method1835(int arg0) {
        int[] var2 = new int[super.field184 * super.field183];
        int var3 = 0;
        for (int var4 = 0; var4 < super.field183; ++var4) {
            for (int var5 = 0; var5 < super.field184; ++var5) {
                int var6 = this.field4745[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.field4745[var3 - 1] != 0) {
                        var6 = arg0;
                    } else if (var4 > 0 && this.field4745[var3 - super.field184] != 0) {
                        var6 = arg0;
                    } else if (var5 < super.field184 - 1 && this.field4745[var3 + 1] != 0) {
                        var6 = arg0;
                    } else if (var4 < super.field183 - 1 && this.field4745[super.field184 + var3] != 0) {
                        var6 = arg0;
                    }
                }
                var2[var3++] = var6;
            }
        }
        this.field4745 = var2;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "()V")
    public final void method1836() {
        class179.method1227(this.field4745, super.field184, super.field183);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public void method50(int arg0, int arg1) {
        int var3 = super.field191 + arg0;
        int var4 = super.field189 + arg1;
        int var5 = class179.field3066 * var4 + var3;
        int var6 = 0;
        int var7 = super.field183;
        int var8 = super.field184;
        int var9 = class179.field3066 - var8;
        int var10 = 0;
        if (var4 < class179.field3071) {
            int var11 = class179.field3071 - var4;
            var7 -= var11;
            var4 = class179.field3071;
            var6 += var8 * var11;
            var5 += class179.field3066 * var11;
        }
        if (var4 + var7 > class179.field3070) {
            var7 -= var4 + var7 - class179.field3070;
        }
        if (var3 < class179.field3072) {
            int var12 = class179.field3072 - var3;
            var8 -= var12;
            var3 = class179.field3072;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class179.field3067) {
            int var13 = var3 + var8 - class179.field3067;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1828(class179.field3068, this.field4745, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
    public void method56(int arg0, int arg1) {
        int var3 = super.field191 + arg0;
        int var4 = super.field189 + arg1;
        int var5 = class179.field3066 * var4 + var3;
        int var6 = 0;
        int var7 = super.field183;
        int var8 = super.field184;
        int var9 = class179.field3066 - var8;
        int var10 = 0;
        if (var4 < class179.field3071) {
            int var11 = class179.field3071 - var4;
            var7 -= var11;
            var4 = class179.field3071;
            var6 += var8 * var11;
            var5 += class179.field3066 * var11;
        }
        if (var4 + var7 > class179.field3070) {
            var7 -= var4 + var7 - class179.field3070;
        }
        if (var3 < class179.field3072) {
            int var12 = class179.field3072 - var3;
            var8 -= var12;
            var3 = class179.field3072;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class179.field3067) {
            int var13 = var3 + var8 - class179.field3067;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1838(class179.field3068, this.field4745, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(II)V")
    public class266(int arg0, int arg1) {
        this.field4745 = new int[arg0 * arg1];
        super.field184 = super.field182 = arg0;
        super.field183 = super.field185 = arg1;
        super.field191 = super.field189 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V")
    public final void method1837(int arg0) {
        for (int var2 = super.field183 - 1; var2 > 0; --var2) {
            int var3 = super.field184 * var2;
            for (int var4 = super.field184 - 1; var4 > 0; --var4) {
                if (this.field4745[var3 + var4] == 0 && this.field4745[var3 + var4 - 1 - super.field184] != 0) {
                    this.field4745[var3 + var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[IIIIIIII)V")
    private static final void method1838(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 3);
        for (int var11 = -arg6; var11 < 0; ++var11) {
            for (int var12 = var9; var12 < 0; ++var12) {
                int var15 = arg1[arg3++];
                if (var15 != 0) {
                    arg0[arg4++] = var15;
                } else {
                    ++arg4;
                }
                int var16 = arg1[arg3++];
                if (var16 != 0) {
                    arg0[arg4++] = var16;
                } else {
                    ++arg4;
                }
                int var17 = arg1[arg3++];
                if (var17 != 0) {
                    arg0[arg4++] = var17;
                } else {
                    ++arg4;
                }
                int var18 = arg1[arg3++];
                if (var18 != 0) {
                    arg0[arg4++] = var18;
                } else {
                    ++arg4;
                }
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                int var14 = arg1[arg3++];
                if (var14 != 0) {
                    arg0[arg4++] = var14;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)V")
    public final void method1839(int arg0) {
        if (super.field184 != super.field182 || super.field185 != super.field183) {
            int var2 = arg0;
            if (arg0 > super.field191) {
                var2 = super.field191;
            }
            int var3 = arg0;
            if (super.field191 + arg0 + super.field184 > super.field182) {
                var3 = super.field182 - super.field191 - super.field184;
            }
            int var4 = arg0;
            if (arg0 > super.field189) {
                var4 = super.field189;
            }
            int var5 = arg0;
            if (super.field189 + arg0 + super.field183 > super.field185) {
                var5 = super.field185 - super.field189 - super.field183;
            }
            int var6 = super.field184 + var2 + var3;
            int var7 = super.field183 + var4 + var5;
            int[] var8 = new int[var6 * var7];
            for (int var9 = 0; var9 < super.field183; ++var9) {
                for (int var10 = 0; var10 < super.field184; ++var10) {
                    var8[(var4 + var9) * var6 + var2 + var10] = this.field4745[super.field184 * var9 + var10];
                }
            }
            this.field4745 = var8;
            super.field184 = var6;
            super.field183 = var7;
            super.field191 -= var2;
            super.field189 -= var4;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public final void method1840(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4745.length; ++var4) {
            int var5 = this.field4745[var4];
            if (var5 != 0) {
                int var6 = var5 >> 16 & 255;
                int var7 = arg0 + var6;
                if (var7 < 1) {
                    var7 = 1;
                } else if (var7 > 255) {
                    var7 = 255;
                }
                int var8 = var5 >> 8 & 255;
                int var9 = arg1 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var5 & 255;
                int var11 = arg2 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                this.field4745[var4] = (var7 << 16) + (var9 << 8) + var11;
            }
        }
    }
}
