import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class184 extends class273 {

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "[I")
    public int[] field3196;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V", line = 14)
    public final void method1312(int arg0) {
        if (this.field4600 == this.field4595 && this.field4601 == this.field4597) {
            return;
        }
        int var2 = arg0;
        if (arg0 > this.field4593) {
            var2 = this.field4593;
        }
        int var3 = arg0;
        if (this.field4593 + arg0 + this.field4595 > this.field4600) {
            var3 = this.field4600 - this.field4593 - this.field4595;
        }
        int var4 = arg0;
        if (arg0 > this.field4590) {
            var4 = this.field4590;
        }
        int var5 = arg0;
        if (this.field4590 + arg0 + this.field4601 > this.field4597) {
            var5 = this.field4597 - this.field4590 - this.field4601;
        }
        int var6 = this.field4595 + var2 + var3;
        int var7 = this.field4601 + var4 + var5;
        int[] var8 = new int[var6 * var7];
        for (int var9 = 0; var9 < this.field4601; var9++) {
            for (int var10 = 0; var10 < this.field4595; var10++) {
                var8[(var4 + var9) * var6 + var2 + var10] = this.field3196[this.field4595 * var9 + var10];
            }
        }
        this.field3196 = var8;
        this.field4595 = var6;
        this.field4601 = var7;
        this.field4593 -= var2;
        this.field4590 -= var4;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(II)V", line = 68)
    public void method1313(int arg0, int arg1) {
        int var3 = this.field4600 + arg0 - this.field4595 - this.field4593;
        int var4 = this.field4590 + arg1;
        int var5 = class276.field4619 * var4 + var3;
        int var6 = this.field4595 - 1;
        int var7 = this.field4601;
        int var8 = this.field4595;
        int var9 = class276.field4619 - var8;
        int var10 = var8 + var8;
        if (var4 < class276.field4627) {
            int var11 = class276.field4627 - var4;
            var7 -= var11;
            var4 = class276.field4627;
            var6 += var8 * var11;
            var5 += class276.field4619 * var11;
        }
        if (var4 + var7 > class276.field4621) {
            var7 -= var4 + var7 - class276.field4621;
        }
        if (var3 < class276.field4625) {
            int var12 = class276.field4625 - var3;
            var8 -= var12;
            var3 = class276.field4625;
            var6 -= var12;
            var5 += var12;
            var10 -= var12;
            var9 += var12;
        }
        if (var3 + var8 > class276.field4622) {
            int var13 = var3 + var8 - class276.field4622;
            var8 -= var13;
            var10 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1330(class276.field4626, this.field3196, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V", line = 123)
    public final void method1314() {
        class276.method1864(this.field3196, this.field4595, this.field4601);
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V", line = 133)
    public final void method1315(int arg0) {
        int[] var2 = new int[this.field4601 * this.field4595];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4601; var4++) {
            for (int var5 = 0; var5 < this.field4595; var5++) {
                int var6 = this.field3196[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.field3196[var3 - 1] != 0) {
                        var6 = arg0;
                    } else if (var4 > 0 && this.field3196[var3 - this.field4595] != 0) {
                        var6 = arg0;
                    } else if (var5 < this.field4595 - 1 && this.field3196[var3 + 1] != 0) {
                        var6 = arg0;
                    } else if (var4 < this.field4601 - 1 && this.field3196[this.field4595 + var3] != 0) {
                        var6 = arg0;
                    }
                }
                var2[var3++] = var6;
            }
        }
        this.field3196 = var2;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIIII)V", line = 180)
    public void method1316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field4595;
        int var7 = this.field4601;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4600;
        int var11 = this.field4597;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4593 > 0) {
            int var14 = ((this.field4593 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4593 << 16);
        }
        if (this.field4590 > 0) {
            int var15 = ((this.field4590 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4590 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        int var16 = class276.field4619 * arg1 + arg0;
        int var17 = class276.field4619 - arg2;
        if (arg1 + arg3 > class276.field4621) {
            arg3 -= arg1 + arg3 - class276.field4621;
        }
        if (arg1 < class276.field4627) {
            int var18 = class276.field4627 - arg1;
            arg3 -= var18;
            var16 += class276.field4619 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class276.field4622) {
            int var19 = arg0 + arg2 - class276.field4622;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class276.field4625) {
            int var20 = class276.field4625 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method1329(class276.field4626, this.field3196, 0, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()[I", line = 265)
    public final int[] method1317() {
        int[] var1 = new int[this.field4600 * this.field4597];
        for (int var2 = 0; var2 < this.field4601; var2++) {
            int var3 = this.field4595 * var2;
            int var4 = (this.field4590 + var2) * this.field4600 + this.field4593;
            for (int var5 = 0; var5 < this.field4595; var5++) {
                int var6 = this.field3196[var3++];
                var1[var4++] = var6 == 0 ? 0 : var6 | 0xFF000000;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V", line = 295)
    public void method1318(int arg0, int arg1, int arg2) {
        int var4 = this.field4593 + arg0;
        int var5 = this.field4590 + arg1;
        int var6 = class276.field4619 * var5 + var4;
        int var7 = 0;
        int var8 = this.field4601;
        int var9 = this.field4595;
        int var10 = class276.field4619 - var9;
        int var11 = 0;
        if (var5 < class276.field4627) {
            int var12 = class276.field4627 - var5;
            var8 -= var12;
            var5 = class276.field4627;
            var7 += var9 * var12;
            var6 += class276.field4619 * var12;
        }
        if (var5 + var8 > class276.field4621) {
            var8 -= var5 + var8 - class276.field4621;
        }
        if (var4 < class276.field4625) {
            int var13 = class276.field4625 - var4;
            var9 -= var13;
            var4 = class276.field4625;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class276.field4622) {
            int var14 = var4 + var9 - class276.field4622;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1324(class276.field4626, this.field3196, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([I[IIIIIIIIIII)V", line = 350)
    private static final void method1319(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; var13++) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; var15++) {
                int var16 = arg1[(arg3 >> 16) + var14];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = var16;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([I[IIIIIIII)V", line = 383)
    private static final void method1320(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var13;
                }
                int var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var14;
                }
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V", line = 444)
    public void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 0) {
            return;
        }
        int var7 = arg0 - (this.field4593 << 4);
        int var8 = arg1 - (this.field4590 << 4);
        double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
        int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
        int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
        int var13 = -var7 * var12 + -var8 * var11;
        int var14 = -(-var7) * var11 + -var8 * var12;
        int var15 = ((this.field4595 << 4) - var7) * var12 + -var8 * var11;
        int var16 = -((this.field4595 << 4) - var7) * var11 + -var8 * var12;
        int var17 = ((this.field4601 << 4) - var8) * var11 + -var7 * var12;
        int var18 = ((this.field4601 << 4) - var8) * var12 + -(-var7) * var11;
        int var19 = ((this.field4601 << 4) - var8) * var11 + ((this.field4595 << 4) - var7) * var12;
        int var20 = ((this.field4601 << 4) - var8) * var12 + -((this.field4595 << 4) - var7) * var11;
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
        if (var33 < class276.field4625) {
            var33 = class276.field4625;
        }
        if (var34 > class276.field4622) {
            var34 = class276.field4622;
        }
        if (var35 < class276.field4627) {
            var35 = class276.field4627;
        }
        if (var36 > class276.field4621) {
            var36 = class276.field4621;
        }
        int var37 = var33 - var34;
        if (var37 >= 0) {
            return;
        }
        int var38 = var35 - var36;
        if (var38 >= 0) {
            return;
        }
        int var39 = class276.field4619 * var35 + var33;
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
                    if (var46 >= 0 && var47 >= 0 && var46 - (this.field4595 << 12) < 0 && var47 - (this.field4601 << 12) < 0) {
                        while (var52 < 0) {
                            int var53 = this.field3196[(var50 >> 12) + (var51 >> 12) * this.field4595];
                            if (var53 == 0) {
                                var49++;
                            } else {
                                class276.field4626[var49++] = var53;
                            }
                            var52++;
                        }
                    }
                    var48++;
                    var39 += class276.field4619;
                }
            } else if (var42 < 0) {
                int var54 = var38;
                while (var54 < 0) {
                    int var55 = var39;
                    int var56 = var46;
                    int var57 = (var42 * var44 >> 4) + var47;
                    int var58 = var37;
                    if (var46 >= 0 && var46 - (this.field4595 << 12) < 0) {
                        int var59;
                        if ((var59 = var57 - (this.field4601 << 12)) >= 0) {
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
                            int var62 = this.field3196[(var56 >> 12) + (var57 >> 12) * this.field4595];
                            if (var62 == 0) {
                                var55++;
                            } else {
                                class276.field4626[var55++] = var62;
                            }
                            var57 += var42;
                            var58++;
                        }
                    }
                    var54++;
                    var46 -= var42;
                    var39 += class276.field4619;
                }
            } else {
                int var63 = var38;
                while (var63 < 0) {
                    int var64 = var39;
                    int var65 = var46;
                    int var66 = (var42 * var44 >> 4) + var47;
                    int var67 = var37;
                    if (var46 >= 0 && var46 - (this.field4595 << 12) < 0) {
                        if (var66 < 0) {
                            int var68 = (var42 - var66 - 1) / var42;
                            var67 = var37 + var68;
                            var66 += var42 * var68;
                            var64 = var39 + var68;
                        }
                        int var69;
                        if ((var69 = (var66 + 1 - (this.field4601 << 12) - var42) / var42) > var67) {
                            var67 = var69;
                        }
                        while (var67 < 0) {
                            int var70 = this.field3196[(var65 >> 12) + (var66 >> 12) * this.field4595];
                            if (var70 == 0) {
                                var64++;
                            } else {
                                class276.field4626[var64++] = var70;
                            }
                            var66 += var42;
                            var67++;
                        }
                    }
                    var63++;
                    var46 -= var42;
                    var39 += class276.field4619;
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
                    if (var47 >= 0 && var47 - (this.field4601 << 12) < 0) {
                        int var76;
                        if ((var76 = var73 - (this.field4595 << 12)) >= 0) {
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
                            int var79 = this.field3196[(var73 >> 12) + (var74 >> 12) * this.field4595];
                            if (var79 == 0) {
                                var72++;
                            } else {
                                class276.field4626[var72++] = var79;
                            }
                            var73 += var43;
                            var75++;
                        }
                    }
                    var71++;
                    var47 += var43;
                    var39 += class276.field4619;
                }
            } else if (var42 < 0) {
                int var80 = var38;
                while (var80 < 0) {
                    int var81 = var39;
                    int var82 = (var43 * var44 >> 4) + var46;
                    int var83 = (var42 * var44 >> 4) + var47;
                    int var84 = var37;
                    int var85;
                    if ((var85 = var82 - (this.field4595 << 12)) >= 0) {
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
                    if ((var88 = var83 - (this.field4601 << 12)) >= 0) {
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
                        int var91 = this.field3196[(var82 >> 12) + (var83 >> 12) * this.field4595];
                        if (var91 == 0) {
                            var81++;
                        } else {
                            class276.field4626[var81++] = var91;
                        }
                        var82 += var43;
                        var83 += var42;
                        var84++;
                    }
                    var80++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += class276.field4619;
                }
            } else {
                int var92 = var38;
                while (var92 < 0) {
                    int var93 = var39;
                    int var94 = (var43 * var44 >> 4) + var46;
                    int var95 = (var42 * var44 >> 4) + var47;
                    int var96 = var37;
                    int var97;
                    if ((var97 = var94 - (this.field4595 << 12)) >= 0) {
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
                        int var100 = (var42 - var95 - 1) / var42;
                        var96 += var100;
                        var94 += var43 * var100;
                        var95 += var42 * var100;
                        var93 += var100;
                    }
                    int var101;
                    if ((var101 = (var95 + 1 - (this.field4601 << 12) - var42) / var42) > var96) {
                        var96 = var101;
                    }
                    while (var96 < 0) {
                        int var102 = this.field3196[(var94 >> 12) + (var95 >> 12) * this.field4595];
                        if (var102 == 0) {
                            var93++;
                        } else {
                            class276.field4626[var93++] = var102;
                        }
                        var94 += var43;
                        var95 += var42;
                        var96++;
                    }
                    var92++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += class276.field4619;
                }
            }
        } else if (var42 == 0) {
            int var103 = var38;
            while (var103 < 0) {
                int var104 = var39;
                int var105 = (var43 * var44 >> 4) + var46;
                int var106 = var47;
                int var107 = var37;
                if (var47 >= 0 && var47 - (this.field4601 << 12) < 0) {
                    if (var105 < 0) {
                        int var108 = (var43 - var105 - 1) / var43;
                        var107 = var37 + var108;
                        var105 += var43 * var108;
                        var104 = var39 + var108;
                    }
                    int var109;
                    if ((var109 = (var105 + 1 - (this.field4595 << 12) - var43) / var43) > var107) {
                        var107 = var109;
                    }
                    while (var107 < 0) {
                        int var110 = this.field3196[(var105 >> 12) + (var106 >> 12) * this.field4595];
                        if (var110 == 0) {
                            var104++;
                        } else {
                            class276.field4626[var104++] = var110;
                        }
                        var105 += var43;
                        var107++;
                    }
                }
                var103++;
                var47 += var43;
                var39 += class276.field4619;
            }
        } else if (var42 < 0) {
            int var111 = var38;
            while (var111 < 0) {
                int var112 = var39;
                int var113 = (var43 * var44 >> 4) + var46;
                int var114 = (var42 * var44 >> 4) + var47;
                int var115 = var37;
                if (var113 < 0) {
                    int var116 = (var43 - var113 - 1) / var43;
                    var115 = var37 + var116;
                    var113 += var43 * var116;
                    var114 += var42 * var116;
                    var112 = var39 + var116;
                }
                int var117;
                if ((var117 = (var113 + 1 - (this.field4595 << 12) - var43) / var43) > var115) {
                    var115 = var117;
                }
                int var118;
                if ((var118 = var114 - (this.field4601 << 12)) >= 0) {
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
                    int var121 = this.field3196[(var113 >> 12) + (var114 >> 12) * this.field4595];
                    if (var121 == 0) {
                        var112++;
                    } else {
                        class276.field4626[var112++] = var121;
                    }
                    var113 += var43;
                    var114 += var42;
                    var115++;
                }
                var111++;
                var46 -= var42;
                var47 += var43;
                var39 += class276.field4619;
            }
        } else {
            int var122 = var38;
            while (var122 < 0) {
                int var123 = var39;
                int var124 = (var43 * var44 >> 4) + var46;
                int var125 = (var42 * var44 >> 4) + var47;
                int var126 = var37;
                if (var124 < 0) {
                    int var127 = (var43 - var124 - 1) / var43;
                    var126 = var37 + var127;
                    var124 += var43 * var127;
                    var125 += var42 * var127;
                    var123 = var39 + var127;
                }
                int var128;
                if ((var128 = (var124 + 1 - (this.field4595 << 12) - var43) / var43) > var126) {
                    var126 = var128;
                }
                if (var125 < 0) {
                    int var129 = (var42 - var125 - 1) / var42;
                    var126 += var129;
                    var124 += var43 * var129;
                    var125 += var42 * var129;
                    var123 += var129;
                }
                int var130;
                if ((var130 = (var125 + 1 - (this.field4601 << 12) - var42) / var42) > var126) {
                    var126 = var130;
                }
                while (var126 < 0) {
                    int var131 = this.field3196[(var124 >> 12) + (var125 >> 12) * this.field4595];
                    if (var131 == 0) {
                        var123++;
                    } else {
                        class276.field4626[var123++] = var131;
                    }
                    var124 += var43;
                    var125 += var42;
                    var126++;
                }
                var122++;
                var46 -= var42;
                var47 += var43;
                var39 += class276.field4619;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V", line = 1071)
    public final void method1322(int arg0) {
        for (int var2 = this.field4601 - 1; var2 > 0; var2--) {
            int var3 = this.field4595 * var2;
            for (int var4 = this.field4595 - 1; var4 > 0; var4--) {
                if (this.field3196[var3 + var4] == 0 && this.field3196[var3 + var4 - this.field4595 - 1] != 0) {
                    this.field3196[var3 + var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([I[IIIIIII)V", line = 1095)
    private static final void method1323(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; var8++) {
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

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([I[IIIIIIIII)V", line = 1127)
    private static final void method1324(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = ((var13 & 0xFF00FF) * arg9 + (var14 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 + (var14 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V", line = 1161)
    public final void method1325(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3196.length; var4++) {
            int var5 = this.field3196[var4];
            if (var5 != 0) {
                int var6 = var5 >> 16 & 0xFF;
                int var7 = arg0 + var6;
                if (var7 < 1) {
                    var7 = 1;
                } else if (var7 > 255) {
                    var7 = 255;
                }
                int var8 = var5 >> 8 & 0xFF;
                int var9 = arg1 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var5 & 0xFF;
                int var11 = arg2 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                this.field3196[var4] = (var7 << 16) + (var9 << 8) + var11;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIII[I[I)V", line = 1210)
    public void method1326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class276.field4619 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; var25++) {
                    class276.field4626[var22++] = this.field3196[(var23 >> 16) + (var24 >> 16) * this.field4595];
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class276.field4619;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()V", line = 1259)
    public final void method1327() {
        int[] var1 = new int[this.field4601 * this.field4595];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4601; var3++) {
            for (int var4 = this.field4595 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3196[this.field4595 * var3 + var4];
            }
        }
        this.field3196 = var1;
        this.field4593 = this.field4600 - this.field4595 - this.field4593;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIDI)V", line = 1296)
    public void method1328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
        try {
            int var10 = -arg2 / 2;
            int var11 = -arg3 / 2;
            int var12 = (int) (Math.sin(arg6) * 65536.0D);
            int var13 = (int) (Math.cos(arg6) * 65536.0D);
            int var14 = arg7 * var12 >> 8;
            int var15 = arg7 * var13 >> 8;
            int var16 = (arg4 << 16) + var10 * var15 + var11 * var14;
            int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
            int var18 = class276.field4619 * arg1 + arg0;
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = var18;
                int var21 = var16;
                int var22 = var17;
                for (int var23 = -arg2; var23 < 0; var23++) {
                    int var24 = this.field3196[(var21 >> 16) + (var22 >> 16) * this.field4595];
                    if (var24 == 0) {
                        var20++;
                    } else {
                        class276.field4626[var20++] = var24;
                    }
                    var21 += var15;
                    var22 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += class276.field4619;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([I[IIIIIIIIIIII)V", line = 1348)
    private static final void method1329(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = 256 - arg12;
        int var14 = arg3;
        for (int var15 = -arg8; var15 < 0; var15++) {
            int var16 = (arg4 >> 16) * arg11;
            for (int var17 = -arg7; var17 < 0; var17++) {
                int var18 = arg1[(arg3 >> 16) + var16];
                if (var18 == 0) {
                    arg5++;
                } else {
                    int var19 = arg0[arg5];
                    arg0[arg5++] = ((var18 & 0xFF00FF) * arg12 + (var19 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var18 & 0xFF00) * arg12 + (var19 & 0xFF00) * var13 & 0xFF0000) >> 8;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var14;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "([I[IIIIIIII)V", line = 1389)
    private static final void method1330(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                int var13 = arg1[arg3--];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var13;
                }
                int var14 = arg1[arg3--];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var14;
                }
                int var15 = arg1[arg3--];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
                int var16 = arg1[arg3--];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                int var18 = arg1[arg3--];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIII[I)V", line = 1448)
    public class184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4600 = arg0;
        this.field4597 = arg1;
        this.field4593 = arg2;
        this.field4590 = arg3;
        this.field4595 = arg4;
        this.field4601 = arg5;
        this.field3196 = arg6;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V", line = 1458)
    public class184(int arg0, int arg1) {
        this.field3196 = new int[arg0 * arg1];
        this.field4595 = this.field4600 = arg0;
        this.field4601 = this.field4597 = arg1;
        this.field4593 = this.field4590 = 0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V", line = 1467)
    public void method1331(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var5 = this.field4595;
        int var6 = this.field4601;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4600;
        int var10 = this.field4597;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4593 > 0) {
            int var13 = ((this.field4593 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4593 << 16);
        }
        if (this.field4590 > 0) {
            int var14 = ((this.field4590 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4590 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class276.field4619 * arg1 + arg0;
        int var16 = class276.field4619 - arg2;
        if (arg1 + arg3 > class276.field4621) {
            arg3 -= arg1 + arg3 - class276.field4621;
        }
        if (arg1 < class276.field4627) {
            int var17 = class276.field4627 - arg1;
            arg3 -= var17;
            var15 += class276.field4619 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class276.field4622) {
            int var18 = arg0 + arg2 - class276.field4622;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class276.field4625) {
            int var19 = class276.field4625 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1319(class276.field4626, this.field3196, 0, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(II)V", line = 1545)
    public void method1332(int arg0, int arg1) {
        int var3 = this.field4593 + arg0;
        int var4 = this.field4590 + arg1;
        int var5 = class276.field4619 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4601;
        int var8 = this.field4595;
        int var9 = class276.field4619 - var8;
        int var10 = 0;
        if (var4 < class276.field4627) {
            int var11 = class276.field4627 - var4;
            var7 -= var11;
            var4 = class276.field4627;
            var6 += var8 * var11;
            var5 += class276.field4619 * var11;
        }
        if (var4 + var7 > class276.field4621) {
            var7 -= var4 + var7 - class276.field4621;
        }
        if (var3 < class276.field4625) {
            int var12 = class276.field4625 - var3;
            var8 -= var12;
            var3 = class276.field4625;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class276.field4622) {
            int var13 = var3 + var8 - class276.field4622;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1323(class276.field4626, this.field3196, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)V", line = 1602)
    public void method1333(int arg0, int arg1) {
        int var3 = this.field4593 + arg0;
        int var4 = this.field4590 + arg1;
        int var5 = class276.field4619 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4601;
        int var8 = this.field4595;
        int var9 = class276.field4619 - var8;
        int var10 = 0;
        if (var4 < class276.field4627) {
            int var11 = class276.field4627 - var4;
            var7 -= var11;
            var4 = class276.field4627;
            var6 += var8 * var11;
            var5 += class276.field4619 * var11;
        }
        if (var4 + var7 > class276.field4621) {
            var7 -= var4 + var7 - class276.field4621;
        }
        if (var3 < class276.field4625) {
            int var12 = class276.field4625 - var3;
            var8 -= var12;
            var3 = class276.field4625;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class276.field4622) {
            int var13 = var3 + var8 - class276.field4622;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1320(class276.field4626, this.field3196, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIIIIIII[I[I)V", line = 1659)
    public void method1334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class276.field4619 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; var25++) {
                    int var26 = this.field3196[(var23 >> 16) + (var24 >> 16) * this.field4595];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class276.field4626[var22++] = var26;
                    }
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class276.field4619;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[I[I)V", line = 1712)
    public final void method1335(int arg0, int arg1, int[] arg2, int[] arg3) {
        if (class276.field4621 - class276.field4627 != arg2.length) {
            throw new IllegalStateException();
        }
        int var5 = this.field4593 + arg0;
        int var6 = this.field4590 + arg1;
        int var7 = 0;
        int var8 = this.field4601;
        int var9 = this.field4595;
        int var10 = class276.field4619 - var9;
        int var11 = 0;
        int var12 = class276.field4619 * var6 + var5;
        if (var6 < class276.field4627) {
            int var13 = class276.field4627 - var6;
            var8 -= var13;
            var6 = class276.field4627;
            var7 += var9 * var13;
            var12 += class276.field4619 * var13;
        }
        if (var6 + var8 > class276.field4621) {
            var8 -= var6 + var8 - class276.field4621;
        }
        if (var5 < class276.field4625) {
            int var14 = class276.field4625 - var5;
            var9 -= var14;
            var5 = class276.field4625;
            var7 += var14;
            var12 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (var5 + var9 > class276.field4622) {
            int var15 = var5 + var9 - class276.field4622;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        int var16 = var5 - class276.field4625;
        int var17 = var6 - class276.field4627;
        for (int var18 = var17; var18 < var8 + var17; var18++) {
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
            for (int var25 = -var20; var25 < 0; var25++) {
                int var26 = this.field3196[var7++];
                if (var26 == 0) {
                    var12++;
                } else {
                    class276.field4626[var12++] = var26;
                }
            }
            var7 += var11 + var24;
            var12 += var10 + var24;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()V", line = 1840)
    public final void method1336() {
        int[] var1 = new int[this.field4601 * this.field4595];
        int var2 = 0;
        for (int var3 = this.field4601 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field4595; var4++) {
                var1[var2++] = this.field3196[this.field4595 * var3 + var4];
            }
        }
        this.field3196 = var1;
        this.field4590 = this.field4597 - this.field4601 - this.field4590;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "()V", line = 1862)
    public final void method1337() {
        if (this.field4600 == this.field4595 && this.field4601 == this.field4597) {
            return;
        }
        int[] var1 = new int[this.field4600 * this.field4597];
        for (int var2 = 0; var2 < this.field4601; var2++) {
            for (int var3 = 0; var3 < this.field4595; var3++) {
                var1[(this.field4590 + var2) * this.field4600 + this.field4593 + var3] = this.field3196[this.field4595 * var2 + var3];
            }
        }
        this.field3196 = var1;
        this.field4595 = this.field4600;
        this.field4601 = this.field4597;
        this.field4593 = 0;
        this.field4590 = 0;
    }
}
