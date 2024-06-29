import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class34 extends class10 {

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[B")
    public byte[] field553;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
    private int[] field552;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method208(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()V")
    public final void method209() {
        if (super.field206 != super.field200 || super.field202 != super.field199) {
            byte[] var1 = new byte[super.field206 * super.field199];
            int var2 = 0;
            for (int var3 = 0; var3 < super.field202; ++var3) {
                for (int var4 = 0; var4 < super.field200; ++var4) {
                    var1[(super.field196 + var3) * super.field206 + super.field201 + var4] = this.field553[var2++];
                }
            }
            this.field553 = var1;
            super.field200 = super.field206;
            super.field202 = super.field199;
            super.field201 = 0;
            super.field196 = 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
    public final void method96(int arg0, int arg1) {
        int var3 = super.field201 + arg0;
        int var4 = super.field196 + arg1;
        int var5 = class159.field3009 * var4 + var3;
        int var6 = 0;
        int var7 = super.field202;
        int var8 = super.field200;
        int var9 = class159.field3009 - var8;
        int var10 = 0;
        if (var4 < class159.field3013) {
            int var11 = class159.field3013 - var4;
            var7 -= var11;
            var4 = class159.field3013;
            var6 += var8 * var11;
            var5 += class159.field3009 * var11;
        }
        if (var4 + var7 > class159.field3016) {
            var7 -= var4 + var7 - class159.field3016;
        }
        if (var3 < class159.field3008) {
            int var12 = class159.field3008 - var3;
            var8 -= var12;
            var3 = class159.field3008;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class159.field3010) {
            int var13 = var3 + var8 - class159.field3010;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method208(class159.field3015, this.field553, this.field552, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method210(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field200;
        int var6 = super.field202;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field206;
        int var10 = super.field199;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field201 > 0) {
            int var13 = ((super.field201 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field201 << 16);
        }
        if (super.field196 > 0) {
            int var14 = ((super.field196 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field196 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class159.field3009 * arg1 + arg0;
        int var16 = class159.field3009 - arg2;
        if (arg1 + arg3 > class159.field3016) {
            arg3 -= arg1 + arg3 - class159.field3016;
        }
        if (arg1 < class159.field3013) {
            int var17 = class159.field3013 - arg1;
            arg3 -= var17;
            var15 += class159.field3009 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class159.field3010) {
            int var18 = arg0 + arg2 - class159.field3010;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class159.field3008) {
            int var19 = class159.field3008 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method214(class159.field3015, this.field553, this.field552, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
    public final void method97(int arg0, int arg1, int arg2) {
        int var4 = super.field201 + arg0;
        int var5 = super.field196 + arg1;
        int var6 = class159.field3009 * var5 + var4;
        int var7 = 0;
        int var8 = super.field202;
        int var9 = super.field200;
        int var10 = class159.field3009 - var9;
        int var11 = 0;
        if (var5 < class159.field3013) {
            int var12 = class159.field3013 - var5;
            var8 -= var12;
            var5 = class159.field3013;
            var7 += var9 * var12;
            var6 += class159.field3009 * var12;
        }
        if (var5 + var8 > class159.field3016) {
            var8 -= var5 + var8 - class159.field3016;
        }
        if (var4 < class159.field3008) {
            int var13 = class159.field3008 - var4;
            var9 -= var13;
            var4 = class159.field3008;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class159.field3010) {
            int var14 = var4 + var9 - class159.field3010;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method210(class159.field3015, this.field553, this.field552, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)V")
    public final void method212(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field552.length; ++var4) {
            int var5 = this.field552[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field552[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field552[var4] & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field552[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()Lcg;")
    public final class34 method213() {
        class34 var1 = new class34(super.field200, super.field202, this.field552.length);
        var1.field206 = super.field206;
        var1.field199 = super.field199;
        var1.field201 = super.field201;
        var1.field196 = super.field196;
        int var2 = this.field553.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            var1.field553[var3] = this.field553[var3];
        }
        var1.field552 = this.field552;
        return var1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method214(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
    public final void method215() {
        byte[] var1 = new byte[super.field202 * super.field200];
        int var2 = 0;
        for (int var3 = 0; var3 < super.field200; ++var3) {
            for (int var7 = super.field202 - 1; var7 >= 0; --var7) {
                var1[var2++] = this.field553[super.field200 * var7 + var3];
            }
        }
        this.field553 = var1;
        int var4 = super.field196;
        super.field196 = super.field201;
        super.field201 = super.field199 - super.field202 - var4;
        int var5 = super.field202;
        super.field202 = super.field200;
        super.field200 = var5;
        int var6 = super.field199;
        super.field199 = super.field206;
        super.field206 = var6;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIIIII[B[I)V")
    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field206 = arg0;
        super.field199 = arg1;
        super.field201 = arg2;
        super.field196 = arg3;
        super.field200 = arg4;
        super.field202 = arg5;
        this.field553 = arg6;
        this.field552 = arg7;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V")
    private class34(int arg0, int arg1, int arg2) {
        super.field206 = super.field200 = arg0;
        super.field199 = super.field202 = arg1;
        super.field201 = super.field196 = 0;
        this.field553 = new byte[arg0 * arg1];
        this.field552 = new int[arg2];
    }
}
