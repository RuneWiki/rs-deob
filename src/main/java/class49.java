import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class49 extends class284 {

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "[I")
    public int[] field598;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method262(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method151(arg0, arg1);
            return;
        }
        int var5 = this.field4807 + arg0;
        int var6 = this.field4805 + arg1;
        int var7 = class277.field4652 * var6 + var5;
        int var8 = 0;
        int var9 = this.field4808;
        int var10 = this.field4801;
        int var11 = class277.field4652 - var10;
        int var12 = 0;
        if (var6 < class277.field4655) {
            int var13 = class277.field4655 - var6;
            var9 -= var13;
            var6 = class277.field4655;
            var8 += var10 * var13;
            var7 += class277.field4652 * var13;
        }
        if (var6 + var9 > class277.field4651) {
            var9 -= var6 + var9 - class277.field4651;
        }
        if (var5 < class277.field4649) {
            int var14 = class277.field4649 - var5;
            var10 -= var14;
            var5 = class277.field4649;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class277.field4650) {
            int var15 = var5 + var10 - class277.field4650;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            method275(class277.field4657, this.field598, 0, var8, var7, var10, var9, var11, var12, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I[IIIIIIIIIII)V", line = 64)
    private static final void method263(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V", line = 105)
    public void method152(int arg0, int arg1) {
        int var3 = this.field4807 + arg0;
        int var4 = this.field4805 + arg1;
        int var5 = class277.field4652 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4808;
        int var8 = this.field4801;
        int var9 = class277.field4652 - var8;
        int var10 = 0;
        if (var4 < class277.field4655) {
            int var11 = class277.field4655 - var4;
            var7 -= var11;
            var4 = class277.field4655;
            var6 += var8 * var11;
            var5 += class277.field4652 * var11;
        }
        if (var4 + var7 > class277.field4651) {
            var7 -= var4 + var7 - class277.field4651;
        }
        if (var3 < class277.field4649) {
            int var12 = class277.field4649 - var3;
            var8 -= var12;
            var3 = class277.field4649;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class277.field4650) {
            int var13 = var3 + var8 - class277.field4650;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method269(class277.field4657, this.field598, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 159)
    public void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field4801;
        int var7 = this.field4808;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4817;
        int var11 = this.field4804;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4807 > 0) {
            int var14 = ((this.field4807 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4807 << 16);
        }
        if (this.field4805 > 0) {
            int var15 = ((this.field4805 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4805 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        int var16 = class277.field4652 * arg1 + arg0;
        int var17 = class277.field4652 - arg2;
        if (arg1 + arg3 > class277.field4651) {
            arg3 -= arg1 + arg3 - class277.field4651;
        }
        if (arg1 < class277.field4655) {
            int var18 = class277.field4655 - arg1;
            arg3 -= var18;
            var16 += class277.field4652 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class277.field4650) {
            int var19 = arg0 + arg2 - class277.field4650;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class277.field4649) {
            int var20 = class277.field4649 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method278(class277.field4657, this.field598, 0, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIII)V", line = 237)
    public final void method265(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var5 = this.field4801;
        int var6 = this.field4808;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4817;
        int var10 = this.field4804;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4807 > 0) {
            int var13 = ((this.field4807 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4807 << 16);
        }
        if (this.field4805 > 0) {
            int var14 = ((this.field4805 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4805 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class277.field4652 * arg1 + arg0;
        int var16 = class277.field4652 - arg2;
        if (arg1 + arg3 > class277.field4651) {
            arg3 -= arg1 + arg3 - class277.field4651;
        }
        if (arg1 < class277.field4655) {
            int var17 = class277.field4655 - arg1;
            arg3 -= var17;
            var15 += class277.field4652 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class277.field4650) {
            int var18 = arg0 + arg2 - class277.field4650;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class277.field4649) {
            int var19 = class277.field4649 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method263(class277.field4657, this.field598, 0, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I[IIIIIIII)V", line = 316)
    private static final void method266(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 382)
    public final void method267(int arg0) {
        for (int var2 = this.field4808 - 1; var2 > 0; var2--) {
            int var3 = this.field4801 * var2;
            for (int var4 = this.field4801 - 1; var4 > 0; var4--) {
                if (this.field598[var3 + var4] == 0 && this.field598[var3 + var4 - this.field4801 - 1] != 0) {
                    this.field598[var3 + var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)V", line = 409)
    public void method268(int arg0, int arg1, int arg2) {
        int var4 = this.field4807 + arg0;
        int var5 = this.field4805 + arg1;
        int var6 = class277.field4652 * var5 + var4;
        int var7 = 0;
        int var8 = this.field4808;
        int var9 = this.field4801;
        int var10 = class277.field4652 - var9;
        int var11 = 0;
        if (var5 < class277.field4655) {
            int var12 = class277.field4655 - var5;
            var8 -= var12;
            var5 = class277.field4655;
            var7 += var9 * var12;
            var6 += class277.field4652 * var12;
        }
        if (var5 + var8 > class277.field4651) {
            var8 -= var5 + var8 - class277.field4651;
        }
        if (var4 < class277.field4649) {
            int var13 = class277.field4649 - var4;
            var9 -= var13;
            var4 = class277.field4649;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class277.field4650) {
            int var14 = var4 + var9 - class277.field4650;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method270(class277.field4657, this.field598, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I[IIIIIII)V", line = 465)
    private static final void method269(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I[IIIIIIIII)V", line = 492)
    private static final void method270(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(III)V", line = 526)
    public final void method271(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field598.length; var4++) {
            int var5 = this.field598[var4];
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
                this.field598[var4] = (var7 << 16) + (var9 << 8) + var11;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V", line = 576)
    public void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 0) {
            return;
        }
        int var7 = arg0 - (this.field4807 << 4);
        int var8 = arg1 - (this.field4805 << 4);
        double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
        int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
        int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
        int var13 = -var7 * var12 + -var8 * var11;
        int var14 = -(-var7) * var11 + -var8 * var12;
        int var15 = ((this.field4801 << 4) - var7) * var12 + -var8 * var11;
        int var16 = -((this.field4801 << 4) - var7) * var11 + -var8 * var12;
        int var17 = ((this.field4808 << 4) - var8) * var11 + -var7 * var12;
        int var18 = ((this.field4808 << 4) - var8) * var12 + -(-var7) * var11;
        int var19 = ((this.field4808 << 4) - var8) * var11 + ((this.field4801 << 4) - var7) * var12;
        int var20 = ((this.field4808 << 4) - var8) * var12 + -((this.field4801 << 4) - var7) * var11;
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
        if (var33 < class277.field4649) {
            var33 = class277.field4649;
        }
        if (var34 > class277.field4650) {
            var34 = class277.field4650;
        }
        if (var35 < class277.field4655) {
            var35 = class277.field4655;
        }
        if (var36 > class277.field4651) {
            var36 = class277.field4651;
        }
        int var37 = var33 - var34;
        if (var37 >= 0) {
            return;
        }
        int var38 = var35 - var36;
        if (var38 >= 0) {
            return;
        }
        int var39 = class277.field4652 * var35 + var33;
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
                    if (var46 >= 0 && var47 >= 0 && var46 - (this.field4801 << 12) < 0 && var47 - (this.field4808 << 12) < 0) {
                        while (var52 < 0) {
                            int var53 = this.field598[(var50 >> 12) + (var51 >> 12) * this.field4801];
                            if (var53 == 0) {
                                var49++;
                            } else {
                                class277.field4657[var49++] = var53;
                            }
                            var52++;
                        }
                    }
                    var48++;
                    var39 += class277.field4652;
                }
            } else if (var42 < 0) {
                int var54 = var38;
                while (var54 < 0) {
                    int var55 = var39;
                    int var56 = var46;
                    int var57 = (var42 * var44 >> 4) + var47;
                    int var58 = var37;
                    if (var46 >= 0 && var46 - (this.field4801 << 12) < 0) {
                        int var59;
                        if ((var59 = var57 - (this.field4808 << 12)) >= 0) {
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
                            int var62 = this.field598[(var56 >> 12) + (var57 >> 12) * this.field4801];
                            if (var62 == 0) {
                                var55++;
                            } else {
                                class277.field4657[var55++] = var62;
                            }
                            var57 += var42;
                            var58++;
                        }
                    }
                    var54++;
                    var46 -= var42;
                    var39 += class277.field4652;
                }
            } else {
                int var63 = var38;
                while (var63 < 0) {
                    int var64 = var39;
                    int var65 = var46;
                    int var66 = (var42 * var44 >> 4) + var47;
                    int var67 = var37;
                    if (var46 >= 0 && var46 - (this.field4801 << 12) < 0) {
                        if (var66 < 0) {
                            int var68 = (var42 - var66 - 1) / var42;
                            var67 = var37 + var68;
                            var66 += var42 * var68;
                            var64 = var39 + var68;
                        }
                        int var69;
                        if ((var69 = (var66 + 1 - (this.field4808 << 12) - var42) / var42) > var67) {
                            var67 = var69;
                        }
                        while (var67 < 0) {
                            int var70 = this.field598[(var65 >> 12) + (var66 >> 12) * this.field4801];
                            if (var70 == 0) {
                                var64++;
                            } else {
                                class277.field4657[var64++] = var70;
                            }
                            var66 += var42;
                            var67++;
                        }
                    }
                    var63++;
                    var46 -= var42;
                    var39 += class277.field4652;
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
                    if (var47 >= 0 && var47 - (this.field4808 << 12) < 0) {
                        int var76;
                        if ((var76 = var73 - (this.field4801 << 12)) >= 0) {
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
                            int var79 = this.field598[(var73 >> 12) + (var74 >> 12) * this.field4801];
                            if (var79 == 0) {
                                var72++;
                            } else {
                                class277.field4657[var72++] = var79;
                            }
                            var73 += var43;
                            var75++;
                        }
                    }
                    var71++;
                    var47 += var43;
                    var39 += class277.field4652;
                }
            } else if (var42 < 0) {
                int var80 = var38;
                while (var80 < 0) {
                    int var81 = var39;
                    int var82 = (var43 * var44 >> 4) + var46;
                    int var83 = (var42 * var44 >> 4) + var47;
                    int var84 = var37;
                    int var85;
                    if ((var85 = var82 - (this.field4801 << 12)) >= 0) {
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
                    if ((var88 = var83 - (this.field4808 << 12)) >= 0) {
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
                        int var91 = this.field598[(var82 >> 12) + (var83 >> 12) * this.field4801];
                        if (var91 == 0) {
                            var81++;
                        } else {
                            class277.field4657[var81++] = var91;
                        }
                        var82 += var43;
                        var83 += var42;
                        var84++;
                    }
                    var80++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += class277.field4652;
                }
            } else {
                int var92 = var38;
                while (var92 < 0) {
                    int var93 = var39;
                    int var94 = (var43 * var44 >> 4) + var46;
                    int var95 = (var42 * var44 >> 4) + var47;
                    int var96 = var37;
                    int var97;
                    if ((var97 = var94 - (this.field4801 << 12)) >= 0) {
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
                    if ((var101 = (var95 + 1 - (this.field4808 << 12) - var42) / var42) > var96) {
                        var96 = var101;
                    }
                    while (var96 < 0) {
                        int var102 = this.field598[(var94 >> 12) + (var95 >> 12) * this.field4801];
                        if (var102 == 0) {
                            var93++;
                        } else {
                            class277.field4657[var93++] = var102;
                        }
                        var94 += var43;
                        var95 += var42;
                        var96++;
                    }
                    var92++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += class277.field4652;
                }
            }
        } else if (var42 == 0) {
            int var103 = var38;
            while (var103 < 0) {
                int var104 = var39;
                int var105 = (var43 * var44 >> 4) + var46;
                int var106 = var47;
                int var107 = var37;
                if (var47 >= 0 && var47 - (this.field4808 << 12) < 0) {
                    if (var105 < 0) {
                        int var108 = (var43 - var105 - 1) / var43;
                        var107 = var37 + var108;
                        var105 += var43 * var108;
                        var104 = var39 + var108;
                    }
                    int var109;
                    if ((var109 = (var105 + 1 - (this.field4801 << 12) - var43) / var43) > var107) {
                        var107 = var109;
                    }
                    while (var107 < 0) {
                        int var110 = this.field598[(var105 >> 12) + (var106 >> 12) * this.field4801];
                        if (var110 == 0) {
                            var104++;
                        } else {
                            class277.field4657[var104++] = var110;
                        }
                        var105 += var43;
                        var107++;
                    }
                }
                var103++;
                var47 += var43;
                var39 += class277.field4652;
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
                if ((var117 = (var113 + 1 - (this.field4801 << 12) - var43) / var43) > var115) {
                    var115 = var117;
                }
                int var118;
                if ((var118 = var114 - (this.field4808 << 12)) >= 0) {
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
                    int var121 = this.field598[(var113 >> 12) + (var114 >> 12) * this.field4801];
                    if (var121 == 0) {
                        var112++;
                    } else {
                        class277.field4657[var112++] = var121;
                    }
                    var113 += var43;
                    var114 += var42;
                    var115++;
                }
                var111++;
                var46 -= var42;
                var47 += var43;
                var39 += class277.field4652;
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
                if ((var128 = (var124 + 1 - (this.field4801 << 12) - var43) / var43) > var126) {
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
                if ((var130 = (var125 + 1 - (this.field4808 << 12) - var42) / var42) > var126) {
                    var126 = var130;
                }
                while (var126 < 0) {
                    int var131 = this.field598[(var124 >> 12) + (var125 >> 12) * this.field4801];
                    if (var131 == 0) {
                        var123++;
                    } else {
                        class277.field4657[var123++] = var131;
                    }
                    var124 += var43;
                    var125 += var42;
                    var126++;
                }
                var122++;
                var46 -= var42;
                var47 += var43;
                var39 += class277.field4652;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIII[I)V", line = 1205)
    public class49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4817 = arg0;
        this.field4804 = arg1;
        this.field4807 = arg2;
        this.field4805 = arg3;
        this.field4801 = arg4;
        this.field4808 = arg5;
        this.field598 = arg6;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V", line = 1216)
    public final void method273() {
        int[] var1 = new int[this.field4808 * this.field4801];
        int var2 = 0;
        for (int var3 = this.field4808 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field4801; var4++) {
                var1[var2++] = this.field598[this.field4801 * var3 + var4];
            }
        }
        this.field598 = var1;
        this.field4805 = this.field4804 - this.field4808 - this.field4805;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V", line = 1240)
    public final void method274() {
        if (this.field4817 == this.field4801 && this.field4808 == this.field4804) {
            return;
        }
        int[] var1 = new int[this.field4817 * this.field4804];
        for (int var2 = 0; var2 < this.field4808; var2++) {
            for (int var3 = 0; var3 < this.field4801; var3++) {
                var1[(this.field4805 + var2) * this.field4817 + this.field4807 + var3] = this.field598[this.field4801 * var2 + var3];
            }
        }
        this.field598 = var1;
        this.field4801 = this.field4817;
        this.field4808 = this.field4804;
        this.field4807 = 0;
        this.field4805 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I[IIIIIIIIII)V", line = 1273)
    private static final void method275(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = 256 - arg9;
        int var12 = (arg10 & 0xFF00FF) * var11 & 0xFF00FF00;
        int var13 = (arg10 & 0xFF00) * var11 & 0xFF0000;
        int var14 = (var12 | var13) >>> 8;
        for (int var15 = -arg6; var15 < 0; var15++) {
            for (int var16 = -arg5; var16 < 0; var16++) {
                int var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    int var18 = (var17 & 0xFF00FF) * arg9 & 0xFF00FF00;
                    int var19 = (var17 & 0xFF00) * arg9 & 0xFF0000;
                    arg0[arg4++] = ((var18 | var19) >>> 8) + var14;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V", line = 1311)
    public final void method276() {
        class277.method1914(this.field598, this.field4801, this.field4808);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V", line = 1316)
    public void method151(int arg0, int arg1) {
        int var3 = this.field4807 + arg0;
        int var4 = this.field4805 + arg1;
        int var5 = class277.field4652 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4808;
        int var8 = this.field4801;
        int var9 = class277.field4652 - var8;
        int var10 = 0;
        if (var4 < class277.field4655) {
            int var11 = class277.field4655 - var4;
            var7 -= var11;
            var4 = class277.field4655;
            var6 += var8 * var11;
            var5 += class277.field4652 * var11;
        }
        if (var4 + var7 > class277.field4651) {
            var7 -= var4 + var7 - class277.field4651;
        }
        if (var3 < class277.field4649) {
            int var12 = class277.field4649 - var3;
            var8 -= var12;
            var3 = class277.field4649;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class277.field4650) {
            int var13 = var3 + var8 - class277.field4650;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method266(class277.field4657, this.field598, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V", line = 1372)
    public final void method277() {
        int[] var1 = new int[this.field4808 * this.field4801];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4808; var3++) {
            for (int var4 = this.field4801 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field598[this.field4801 * var3 + var4];
            }
        }
        this.field598 = var1;
        this.field4807 = this.field4817 - this.field4801 - this.field4807;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I[IIIIIIIIIIII)V", line = 1399)
    private static final void method278(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V", line = 1445)
    public final void method279(int arg0) {
        if (this.field4817 == this.field4801 && this.field4808 == this.field4804) {
            return;
        }
        int var2 = arg0;
        if (arg0 > this.field4807) {
            var2 = this.field4807;
        }
        int var3 = arg0;
        if (this.field4807 + arg0 + this.field4801 > this.field4817) {
            var3 = this.field4817 - this.field4807 - this.field4801;
        }
        int var4 = arg0;
        if (arg0 > this.field4805) {
            var4 = this.field4805;
        }
        int var5 = arg0;
        if (this.field4805 + arg0 + this.field4808 > this.field4804) {
            var5 = this.field4804 - this.field4805 - this.field4808;
        }
        int var6 = this.field4801 + var2 + var3;
        int var7 = this.field4808 + var4 + var5;
        int[] var8 = new int[var6 * var7];
        for (int var9 = 0; var9 < this.field4808; var9++) {
            for (int var10 = 0; var10 < this.field4801; var10++) {
                var8[(var4 + var9) * var6 + var2 + var10] = this.field598[this.field4801 * var9 + var10];
            }
        }
        this.field598 = var8;
        this.field4801 = var6;
        this.field4808 = var7;
        this.field4807 -= var2;
        this.field4805 -= var4;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(II)V", line = 1501)
    public class49(int arg0, int arg1) {
        this.field598 = new int[arg0 * arg1];
        this.field4801 = this.field4817 = arg0;
        this.field4808 = this.field4804 = arg1;
        this.field4807 = this.field4805 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V", line = 1516)
    public final void method280(int arg0) {
        int[] var2 = new int[this.field4808 * this.field4801];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4808; var4++) {
            for (int var5 = 0; var5 < this.field4801; var5++) {
                int var6 = this.field598[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.field598[var3 - 1] != 0) {
                        var6 = arg0;
                    } else if (var4 > 0 && this.field598[var3 - this.field4801] != 0) {
                        var6 = arg0;
                    } else if (var5 < this.field4801 - 1 && this.field598[var3 + 1] != 0) {
                        var6 = arg0;
                    } else if (var4 < this.field4808 - 1 && this.field598[this.field4801 + var3] != 0) {
                        var6 = arg0;
                    }
                }
                var2[var3++] = var6;
            }
        }
        this.field598 = var2;
    }
}
