import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class74 extends class284 {

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[B")
    public byte[] field1042;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "[I")
    private int[] field1043;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method480(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; ++var13) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; ++var15) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 != 0) {
                    arg0[arg5++] = arg2[var16 & 255];
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

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
    public final void method481(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field4566;
        int var6 = super.field4557;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field4559;
        int var10 = super.field4551;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field4565 > 0) {
            int var13 = ((super.field4565 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field4565 << 16);
        }
        if (super.field4564 > 0) {
            int var14 = ((super.field4564 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field4564 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class266.field4275 * arg1 + arg0;
        int var16 = class266.field4275 - arg2;
        if (arg1 + arg3 > class266.field4280) {
            arg3 -= arg1 + arg3 - class266.field4280;
        }
        if (arg1 < class266.field4281) {
            int var17 = class266.field4281 - arg1;
            arg3 -= var17;
            var15 += class266.field4275 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class266.field4278) {
            int var18 = arg0 + arg2 - class266.field4278;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class266.field4279) {
            int var19 = class266.field4279 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method480(class266.field4282, this.field1042, this.field1043, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method482(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 3);
        for (int var12 = -arg7; var12 < 0; ++var12) {
            for (int var13 = var10; var13 < 0; ++var13) {
                byte var16 = arg1[arg4++];
                if (var16 != 0) {
                    arg0[arg5++] = arg2[var16 & 255];
                } else {
                    ++arg5;
                }
                byte var17 = arg1[arg4++];
                if (var17 != 0) {
                    arg0[arg5++] = arg2[var17 & 255];
                } else {
                    ++arg5;
                }
                byte var18 = arg1[arg4++];
                if (var18 != 0) {
                    arg0[arg5++] = arg2[var18 & 255];
                } else {
                    ++arg5;
                }
                byte var19 = arg1[arg4++];
                if (var19 != 0) {
                    arg0[arg5++] = arg2[var19 & 255];
                } else {
                    ++arg5;
                }
            }
            for (int var14 = var11; var14 < 0; ++var14) {
                byte var15 = arg1[arg4++];
                if (var15 != 0) {
                    arg0[arg5++] = arg2[var15 & 255];
                } else {
                    ++arg5;
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V")
    public final void method483() {
        byte[] var1 = new byte[super.field4566 * super.field4557];
        int var2 = 0;
        for (int var3 = 0; var3 < super.field4566; ++var3) {
            for (int var7 = super.field4557 - 1; var7 >= 0; --var7) {
                var1[var2++] = this.field1042[super.field4566 * var7 + var3];
            }
        }
        this.field1042 = var1;
        int var4 = super.field4564;
        super.field4564 = super.field4565;
        super.field4565 = super.field4551 - super.field4557 - var4;
        int var5 = super.field4557;
        super.field4557 = super.field4566;
        super.field4566 = var5;
        int var6 = super.field4551;
        super.field4551 = super.field4559;
        super.field4559 = var6;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I[B[IIIIIIIIIII)V")
    private static final void method484(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3;
        int var14 = arg12 >> 16 & 255;
        int var15 = arg12 >> 8 & 255;
        int var16 = arg12 & 255;
        for (int var17 = -arg8; var17 < 0; ++var17) {
            int var18 = (arg4 >> 16) * arg11;
            for (int var19 = -arg7; var19 < 0; ++var19) {
                byte var20 = arg1[(arg3 >> 16) + var18];
                if (var20 != 0) {
                    int var21 = arg2[var20 & 255];
                    int var22 = var21 >> 16 & 255;
                    int var23 = var21 >> 8 & 255;
                    int var24 = var21 & 255;
                    arg0[arg5++] = (var16 * var24 >> 8) + (var14 * var22 >> 8 << 16) + (var15 * var23 >> 8 << 8);
                } else {
                    ++arg5;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
    public final void method485() {
        byte[] var1 = new byte[super.field4566 * super.field4557];
        int var2 = 0;
        for (int var3 = super.field4557 - 1; var3 >= 0; --var3) {
            for (int var4 = 0; var4 < super.field4566; ++var4) {
                var1[var2++] = this.field1042[super.field4566 * var3 + var4];
            }
        }
        this.field1042 = var1;
        super.field4564 = super.field4551 - super.field4557 - super.field4564;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(III)V")
    public final void method486(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1043.length; ++var4) {
            int var5 = this.field1043[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1043[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1043[var4] & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1043[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public final void method487(int arg0, int arg1) {
        int var3 = super.field4565 + arg0;
        int var4 = super.field4564 + arg1;
        int var5 = class266.field4275 * var4 + var3;
        int var6 = 0;
        int var7 = super.field4557;
        int var8 = super.field4566;
        int var9 = class266.field4275 - var8;
        int var10 = 0;
        if (var4 < class266.field4281) {
            int var11 = class266.field4281 - var4;
            var7 -= var11;
            var4 = class266.field4281;
            var6 += var8 * var11;
            var5 += class266.field4275 * var11;
        }
        if (var4 + var7 > class266.field4280) {
            var7 -= var4 + var7 - class266.field4280;
        }
        if (var3 < class266.field4279) {
            int var12 = class266.field4279 - var3;
            var8 -= var12;
            var3 = class266.field4279;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class266.field4278) {
            int var13 = var3 + var8 - class266.field4278;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method482(class266.field4282, this.field1042, this.field1043, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIII[B[I)V")
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field4559 = arg0;
        super.field4551 = arg1;
        super.field4565 = arg2;
        super.field4564 = arg3;
        super.field4566 = arg4;
        super.field4557 = arg5;
        this.field1042 = arg6;
        this.field1043 = arg7;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = super.field4566;
        int var7 = super.field4557;
        int var8 = 0;
        int var9 = 0;
        int var10 = super.field4559;
        int var11 = super.field4551;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (super.field4565 > 0) {
            int var14 = ((super.field4565 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (super.field4565 << 16);
        }
        if (super.field4564 > 0) {
            int var15 = ((super.field4564 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (super.field4564 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = class266.field4275 * arg1 + arg0;
        int var17 = class266.field4275 - arg2;
        if (arg1 + arg3 > class266.field4280) {
            arg3 -= arg1 + arg3 - class266.field4280;
        }
        if (arg1 < class266.field4281) {
            int var18 = class266.field4281 - arg1;
            arg3 -= var18;
            var16 += class266.field4275 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class266.field4278) {
            int var19 = arg0 + arg2 - class266.field4278;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class266.field4279) {
            int var20 = class266.field4279 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method484(class266.field4282, this.field1042, this.field1043, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public final void method489(int arg0, int arg1, int arg2) {
        int var4 = super.field4565 + arg0;
        int var5 = super.field4564 + arg1;
        int var6 = class266.field4275 * var5 + var4;
        int var7 = 0;
        int var8 = super.field4557;
        int var9 = super.field4566;
        int var10 = class266.field4275 - var9;
        int var11 = 0;
        if (var5 < class266.field4281) {
            int var12 = class266.field4281 - var5;
            var8 -= var12;
            var5 = class266.field4281;
            var7 += var9 * var12;
            var6 += class266.field4275 * var12;
        }
        if (var5 + var8 > class266.field4280) {
            var8 -= var5 + var8 - class266.field4280;
        }
        if (var4 < class266.field4279) {
            int var13 = class266.field4279 - var4;
            var9 -= var13;
            var4 = class266.field4279;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class266.field4278) {
            int var14 = var4 + var9 - class266.field4278;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method492(class266.field4282, this.field1042, this.field1043, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[I[I)V")
    public final void method490(int arg0, int arg1, int[] arg2, int[] arg3) {
        if (class266.field4280 - class266.field4281 != arg2.length) {
            throw new IllegalStateException();
        } else {
            int var5 = super.field4565 + arg0;
            int var6 = super.field4564 + arg1;
            int var7 = 0;
            int var8 = super.field4557;
            int var9 = super.field4566;
            int var10 = class266.field4275 - var9;
            int var11 = 0;
            int var12 = class266.field4275 * var6 + var5;
            if (var6 < class266.field4281) {
                int var13 = class266.field4281 - var6;
                var8 -= var13;
                var6 = class266.field4281;
                var7 += var9 * var13;
                var12 += class266.field4275 * var13;
            }
            if (var6 + var8 > class266.field4280) {
                var8 -= var6 + var8 - class266.field4280;
            }
            if (var5 < class266.field4279) {
                int var14 = class266.field4279 - var5;
                var9 -= var14;
                var5 = class266.field4279;
                var7 += var14;
                var12 += var14;
                var11 += var14;
                var10 += var14;
            }
            if (var5 + var9 > class266.field4278) {
                int var15 = var5 + var9 - class266.field4278;
                var9 -= var15;
                var11 += var15;
                var10 += var15;
            }
            if (var9 > 0 && var8 > 0) {
                int var16 = var5 - class266.field4279;
                int var17 = var6 - class266.field4281;
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
                        int var26 = this.field1043[this.field1042[var7++]];
                        if (var26 != 0) {
                            class266.field4282[var12++] = var26;
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

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()V")
    public final void method491() {
        if (super.field4566 != super.field4559 || super.field4557 != super.field4551) {
            byte[] var1 = new byte[super.field4559 * super.field4551];
            int var2 = 0;
            for (int var3 = 0; var3 < super.field4557; ++var3) {
                for (int var4 = 0; var4 < super.field4566; ++var4) {
                    var1[(super.field4564 + var3) * super.field4559 + super.field4565 + var4] = this.field1042[var2++];
                }
            }
            this.field1042 = var1;
            super.field4566 = super.field4559;
            super.field4557 = super.field4551;
            super.field4565 = 0;
            super.field4564 = 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method492(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; ++var11) {
            for (int var12 = -arg5; var12 < 0; ++var12) {
                byte var13 = arg1[arg3++];
                if (var13 != 0) {
                    int var14 = arg2[var13 & 255];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 16711935) * arg9 + (var15 & 16711935) * var10 & -16711936) + ((var14 & 65280) * arg9 + (var15 & 65280) * var10 & 16711680) >> 8;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            int var7 = arg0 - (super.field4565 << 4);
            int var8 = arg1 - (super.field4564 << 4);
            double var9 = (double) (arg4 & 65535) * 9.587379924285257E-5D;
            int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
            int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
            int var13 = -var7 * var12 + -var8 * var11;
            int var14 = -var8 * var12 + var7 * var11;
            int var15 = ((super.field4566 << 4) - var7) * var12 + -var8 * var11;
            int var16 = -((super.field4566 << 4) - var7) * var11 + -var8 * var12;
            int var17 = ((super.field4557 << 4) - var8) * var11 + -var7 * var12;
            int var18 = ((super.field4557 << 4) - var8) * var12 + var7 * var11;
            int var19 = ((super.field4566 << 4) - var7) * var12 + ((super.field4557 << 4) - var8) * var11;
            int var20 = ((super.field4557 << 4) - var8) * var12 + -((super.field4566 << 4) - var7) * var11;
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
            if (var33 < class266.field4279) {
                var33 = class266.field4279;
            }
            if (var34 > class266.field4278) {
                var34 = class266.field4278;
            }
            if (var35 < class266.field4281) {
                var35 = class266.field4281;
            }
            if (var36 > class266.field4280) {
                var36 = class266.field4280;
            }
            int var37 = var33 - var34;
            if (var37 < 0) {
                int var38 = var35 - var36;
                if (var38 < 0) {
                    int var39 = class266.field4275 * var35 + var33;
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
                                if (var46 >= 0 && var47 >= 0 && var46 - (super.field4566 << 12) < 0 && var47 - (super.field4557 << 12) < 0) {
                                    while (var52 < 0) {
                                        int var53 = this.field1043[this.field1042[(var50 >> 12) + (var51 >> 12) * super.field4566]];
                                        if (var53 != 0) {
                                            class266.field4282[var49++] = var53;
                                        } else {
                                            ++var49;
                                        }
                                        ++var52;
                                    }
                                }
                                ++var48;
                                var39 += class266.field4275;
                            }
                        } else if (var42 < 0) {
                            int var54 = var38;
                            while (var54 < 0) {
                                int var55 = var39;
                                int var56 = var46;
                                int var57 = (var42 * var44 >> 4) + var47;
                                int var58 = var37;
                                if (var46 >= 0 && var46 - (super.field4566 << 12) < 0) {
                                    int var59;
                                    if ((var59 = var57 - (super.field4557 << 12)) >= 0) {
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
                                        int var62 = this.field1043[this.field1042[(var56 >> 12) + (var57 >> 12) * super.field4566]];
                                        if (var62 != 0) {
                                            class266.field4282[var55++] = var62;
                                        } else {
                                            ++var55;
                                        }
                                        var57 += var42;
                                        ++var58;
                                    }
                                }
                                ++var54;
                                var46 -= var42;
                                var39 += class266.field4275;
                            }
                        } else {
                            int var63 = var38;
                            while (var63 < 0) {
                                int var64 = var39;
                                int var65 = var46;
                                int var66 = (var42 * var44 >> 4) + var47;
                                int var67 = var37;
                                if (var46 >= 0 && var46 - (super.field4566 << 12) < 0) {
                                    if (var66 < 0) {
                                        int var68 = (var42 - 1 - var66) / var42;
                                        var67 = var37 + var68;
                                        var66 += var42 * var68;
                                        var64 = var39 + var68;
                                    }
                                    int var69;
                                    if ((var69 = (var66 + 1 - (super.field4557 << 12) - var42) / var42) > var67) {
                                        var67 = var69;
                                    }
                                    while (var67 < 0) {
                                        int var70 = this.field1043[this.field1042[(var65 >> 12) + (var66 >> 12) * super.field4566]];
                                        if (var70 != 0) {
                                            class266.field4282[var64++] = var70;
                                        } else {
                                            ++var64;
                                        }
                                        var66 += var42;
                                        ++var67;
                                    }
                                }
                                ++var63;
                                var46 -= var42;
                                var39 += class266.field4275;
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
                                if (var47 >= 0 && var47 - (super.field4557 << 12) < 0) {
                                    int var76;
                                    if ((var76 = var73 - (super.field4566 << 12)) >= 0) {
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
                                        int var79 = this.field1043[this.field1042[(var73 >> 12) + (var74 >> 12) * super.field4566]];
                                        if (var79 != 0) {
                                            class266.field4282[var72++] = var79;
                                        } else {
                                            ++var72;
                                        }
                                        var73 += var43;
                                        ++var75;
                                    }
                                }
                                ++var71;
                                var47 += var43;
                                var39 += class266.field4275;
                            }
                        } else if (var42 < 0) {
                            int var80 = var38;
                            while (var80 < 0) {
                                int var81 = var39;
                                int var82 = (var43 * var44 >> 4) + var46;
                                int var83 = (var42 * var44 >> 4) + var47;
                                int var84 = var37;
                                int var85;
                                if ((var85 = var82 - (super.field4566 << 12)) >= 0) {
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
                                if ((var88 = var83 - (super.field4557 << 12)) >= 0) {
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
                                    int var91 = this.field1043[this.field1042[(var82 >> 12) + (var83 >> 12) * super.field4566]];
                                    if (var91 != 0) {
                                        class266.field4282[var81++] = var91;
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
                                var39 += class266.field4275;
                            }
                        } else {
                            int var92 = var38;
                            while (var92 < 0) {
                                int var93 = var39;
                                int var94 = (var43 * var44 >> 4) + var46;
                                int var95 = (var42 * var44 >> 4) + var47;
                                int var96 = var37;
                                int var97;
                                if ((var97 = var94 - (super.field4566 << 12)) >= 0) {
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
                                if ((var101 = (var95 + 1 - (super.field4557 << 12) - var42) / var42) > var96) {
                                    var96 = var101;
                                }
                                while (var96 < 0) {
                                    int var102 = this.field1043[this.field1042[(var94 >> 12) + (var95 >> 12) * super.field4566]];
                                    if (var102 != 0) {
                                        class266.field4282[var93++] = var102;
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
                                var39 += class266.field4275;
                            }
                        }
                    } else if (var42 == 0) {
                        int var103 = var38;
                        while (var103 < 0) {
                            int var104 = var39;
                            int var105 = (var43 * var44 >> 4) + var46;
                            int var106 = var47;
                            int var107 = var37;
                            if (var47 >= 0 && var47 - (super.field4557 << 12) < 0) {
                                if (var105 < 0) {
                                    int var108 = (var43 - 1 - var105) / var43;
                                    var107 = var37 + var108;
                                    var105 += var43 * var108;
                                    var104 = var39 + var108;
                                }
                                int var109;
                                if ((var109 = (var105 + 1 - (super.field4566 << 12) - var43) / var43) > var107) {
                                    var107 = var109;
                                }
                                while (var107 < 0) {
                                    int var110 = this.field1043[this.field1042[(var105 >> 12) + (var106 >> 12) * super.field4566]];
                                    if (var110 != 0) {
                                        class266.field4282[var104++] = var110;
                                    } else {
                                        ++var104;
                                    }
                                    var105 += var43;
                                    ++var107;
                                }
                            }
                            ++var103;
                            var47 += var43;
                            var39 += class266.field4275;
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
                            if ((var117 = (var113 + 1 - (super.field4566 << 12) - var43) / var43) > var115) {
                                var115 = var117;
                            }
                            int var118;
                            if ((var118 = var114 - (super.field4557 << 12)) >= 0) {
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
                                int var121 = this.field1043[this.field1042[(var113 >> 12) + (var114 >> 12) * super.field4566]];
                                if (var121 != 0) {
                                    class266.field4282[var112++] = var121;
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
                            var39 += class266.field4275;
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
                            if ((var128 = (var124 + 1 - (super.field4566 << 12) - var43) / var43) > var126) {
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
                            if ((var130 = (var125 + 1 - (super.field4557 << 12) - var42) / var42) > var126) {
                                var126 = var130;
                            }
                            while (var126 < 0) {
                                int var131 = this.field1043[this.field1042[(var124 >> 12) + (var125 >> 12) * super.field4566]];
                                if (var131 != 0) {
                                    class266.field4282[var123++] = var131;
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
                            var39 += class266.field4275;
                        }
                    }
                }
            }
        }
    }
}
