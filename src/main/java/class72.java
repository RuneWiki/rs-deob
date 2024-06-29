import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class72 extends class189 {

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[B")
    public byte[] field997;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[I")
    private int[] field998;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
    public final void method446() {
        if (super.field2611 != super.field2604 || super.field2609 != super.field2607) {
            byte[] var1 = new byte[super.field2607 * super.field2604];
            int var2 = 0;
            for (int var3 = 0; var3 < super.field2609; ++var3) {
                for (int var4 = 0; var4 < super.field2611; ++var4) {
                    var1[(super.field2612 + var3) * super.field2604 + super.field2610 + var4] = this.field997[var2++];
                }
            }
            this.field997 = var1;
            super.field2611 = super.field2604;
            super.field2609 = super.field2607;
            super.field2610 = 0;
            super.field2612 = 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
    public final void method447(int arg0, int arg1, int arg2) {
        int var4 = super.field2610 + arg0;
        int var5 = super.field2612 + arg1;
        int var6 = class64.field879 * var5 + var4;
        int var7 = 0;
        int var8 = super.field2609;
        int var9 = super.field2611;
        int var10 = class64.field879 - var9;
        int var11 = 0;
        if (var5 < class64.field876) {
            int var12 = class64.field876 - var5;
            var8 -= var12;
            var5 = class64.field876;
            var7 += var9 * var12;
            var6 += class64.field879 * var12;
        }
        if (var5 + var8 > class64.field878) {
            var8 -= var5 + var8 - class64.field878;
        }
        if (var4 < class64.field877) {
            int var13 = class64.field877 - var4;
            var9 -= var13;
            var4 = class64.field877;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class64.field873) {
            int var14 = var4 + var9 - class64.field873;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method455(class64.field881, this.field997, this.field998, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()V")
    public final void method448() {
        byte[] var1 = new byte[super.field2611 * super.field2609];
        int var2 = 0;
        for (int var3 = 0; var3 < super.field2611; ++var3) {
            for (int var7 = super.field2609 - 1; var7 >= 0; --var7) {
                var1[var2++] = this.field997[super.field2611 * var7 + var3];
            }
        }
        this.field997 = var1;
        int var4 = super.field2612;
        super.field2612 = super.field2610;
        super.field2610 = super.field2607 - super.field2609 - var4;
        int var5 = super.field2609;
        super.field2609 = super.field2611;
        super.field2611 = var5;
        int var6 = super.field2607;
        super.field2607 = super.field2604;
        super.field2604 = var6;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
    public final void method449(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field998.length; ++var4) {
            int var5 = this.field998[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field998[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field998[var4] & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field998[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method450(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
    public final void method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = super.field2611;
        int var7 = super.field2609;
        int var8 = 0;
        int var9 = 0;
        int var10 = super.field2604;
        int var11 = super.field2607;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (super.field2610 > 0) {
            int var14 = ((super.field2610 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (super.field2610 << 16);
        }
        if (super.field2612 > 0) {
            int var15 = ((super.field2612 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (super.field2612 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = class64.field879 * arg1 + arg0;
        int var17 = class64.field879 - arg2;
        if (arg1 + arg3 > class64.field878) {
            arg3 -= arg1 + arg3 - class64.field878;
        }
        if (arg1 < class64.field876) {
            int var18 = class64.field876 - arg1;
            arg3 -= var18;
            var16 += class64.field879 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class64.field873) {
            int var19 = arg0 + arg2 - class64.field873;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class64.field877) {
            int var20 = class64.field877 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method453(class64.field881, this.field997, this.field998, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    public final void method452(int arg0, int arg1) {
        int var3 = super.field2610 + arg0;
        int var4 = super.field2612 + arg1;
        int var5 = class64.field879 * var4 + var3;
        int var6 = 0;
        int var7 = super.field2609;
        int var8 = super.field2611;
        int var9 = class64.field879 - var8;
        int var10 = 0;
        if (var4 < class64.field876) {
            int var11 = class64.field876 - var4;
            var7 -= var11;
            var4 = class64.field876;
            var6 += var8 * var11;
            var5 += class64.field879 * var11;
        }
        if (var4 + var7 > class64.field878) {
            var7 -= var4 + var7 - class64.field878;
        }
        if (var3 < class64.field877) {
            int var12 = class64.field877 - var3;
            var8 -= var12;
            var3 = class64.field877;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class64.field873) {
            int var13 = var3 + var8 - class64.field873;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method450(class64.field881, this.field997, this.field998, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([I[B[IIIIIIIIIII)V")
    private static final void method453(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
    public final void method454(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field2611;
        int var6 = super.field2609;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field2604;
        int var10 = super.field2607;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field2610 > 0) {
            int var13 = ((super.field2610 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field2610 << 16);
        }
        if (super.field2612 > 0) {
            int var14 = ((super.field2612 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field2612 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class64.field879 * arg1 + arg0;
        int var16 = class64.field879 - arg2;
        if (arg1 + arg3 > class64.field878) {
            arg3 -= arg1 + arg3 - class64.field878;
        }
        if (arg1 < class64.field876) {
            int var17 = class64.field876 - arg1;
            arg3 -= var17;
            var15 += class64.field879 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class64.field873) {
            int var18 = arg0 + arg2 - class64.field873;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class64.field877) {
            int var19 = class64.field877 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method456(class64.field881, this.field997, this.field998, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method455(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method456(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIIII[B[I)V")
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field2604 = arg0;
        super.field2607 = arg1;
        super.field2610 = arg2;
        super.field2612 = arg3;
        super.field2611 = arg4;
        super.field2609 = arg5;
        this.field997 = arg6;
        this.field998 = arg7;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()V")
    public final void method457() {
        byte[] var1 = new byte[super.field2611 * super.field2609];
        int var2 = 0;
        for (int var3 = super.field2609 - 1; var3 >= 0; --var3) {
            for (int var4 = 0; var4 < super.field2611; ++var4) {
                var1[var2++] = this.field997[super.field2611 * var3 + var4];
            }
        }
        this.field997 = var1;
        super.field2612 = super.field2607 - super.field2609 - super.field2612;
    }
}
