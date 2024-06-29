import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class5 extends class189 {

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[B")
    public byte[] field59;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V", line = 6)
    public final void method33() {
        byte[] var1 = new byte[this.field3162 * this.field3157];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3162; var3++) {
            for (int var4 = this.field3157 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field59[this.field3162 * var4 + var3];
            }
        }
        this.field59 = var1;
        int var5 = this.field3171;
        this.field3171 = this.field3165;
        this.field3165 = this.field3168 - this.field3157 - var5;
        int var6 = this.field3157;
        this.field3157 = this.field3162;
        this.field3162 = var6;
        int var7 = this.field3168;
        this.field3168 = this.field3173;
        this.field3173 = var7;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 40)
    private static final void method34(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; var13++) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; var15++) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 75)
    private static final void method35(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg2[var13 & 0xFF];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()V", line = 109)
    public final void method36() {
        int var1 = 0;
        int var2 = this.field59.length - 7;
        while (var1 < var2) {
            this.field59[var1++] = 0;
            this.field59[var1++] = 0;
            this.field59[var1++] = 0;
            this.field59[var1++] = 0;
            this.field59[var1++] = 0;
            this.field59[var1++] = 0;
            this.field59[var1++] = 0;
            this.field59[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field59[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()Llj;", line = 133)
    public final class5 method37() {
        class5 var1 = new class5(this.field3162, this.field3157, this.field58.length);
        var1.field3173 = this.field3173;
        var1.field3168 = this.field3168;
        var1.field3165 = this.field3165;
        var1.field3171 = this.field3171;
        int var2 = this.field59.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field59[var3] = this.field59[var3];
        }
        var1.field58 = this.field58;
        return var1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V", line = 151)
    public final void method38(int arg0, int arg1) {
        int var3 = this.field3165 + arg0;
        int var4 = this.field3171 + arg1;
        int var5 = class272.field4704 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3157;
        int var8 = this.field3162;
        int var9 = class272.field4704 - var8;
        int var10 = 0;
        if (var4 < class272.field4705) {
            int var11 = class272.field4705 - var4;
            var7 -= var11;
            var4 = class272.field4705;
            var6 += var8 * var11;
            var5 += class272.field4704 * var11;
        }
        if (var4 + var7 > class272.field4708) {
            var7 -= var4 + var7 - class272.field4708;
        }
        if (var3 < class272.field4702) {
            int var12 = class272.field4702 - var3;
            var8 -= var12;
            var3 = class272.field4702;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class272.field4703) {
            int var13 = var3 + var8 - class272.field4703;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method41(class272.field4709, this.field59, this.field58, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V", line = 205)
    public final void method39(int arg0, int arg1, int arg2) {
        int var4 = this.field3165 + arg0;
        int var5 = this.field3171 + arg1;
        int var6 = class272.field4704 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3157;
        int var9 = this.field3162;
        int var10 = class272.field4704 - var9;
        int var11 = 0;
        if (var5 < class272.field4705) {
            int var12 = class272.field4705 - var5;
            var8 -= var12;
            var5 = class272.field4705;
            var7 += var9 * var12;
            var6 += class272.field4704 * var12;
        }
        if (var5 + var8 > class272.field4708) {
            var8 -= var5 + var8 - class272.field4708;
        }
        if (var4 < class272.field4702) {
            int var13 = class272.field4702 - var4;
            var9 -= var13;
            var4 = class272.field4702;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class272.field4703) {
            int var14 = var4 + var9 - class272.field4703;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method35(class272.field4709, this.field59, this.field58, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()V", line = 263)
    public final void method40() {
        if (this.field3173 == this.field3162 && this.field3168 == this.field3157) {
            return;
        }
        byte[] var1 = new byte[this.field3173 * this.field3168];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3157; var3++) {
            for (int var4 = 0; var4 < this.field3162; var4++) {
                var1[(this.field3171 + var3) * this.field3173 + this.field3165 + var4] = this.field59[var2++];
            }
        }
        this.field59 = var1;
        this.field3162 = this.field3173;
        this.field3157 = this.field3168;
        this.field3165 = 0;
        this.field3171 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 297)
    public class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3173 = arg0;
        this.field3168 = arg1;
        this.field3165 = arg2;
        this.field3171 = arg3;
        this.field3162 = arg4;
        this.field3157 = arg5;
        this.field59 = arg6;
        this.field58 = arg7;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 313)
    private static final void method41(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg4++];
                if (var14 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg4++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var17 & 0xFF];
                }
            }
            for (int var18 = var11; var18 < 0; var18++) {
                byte var19 = arg1[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var19 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V", line = 380)
    public final void method42(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field3162;
        int var6 = this.field3157;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3173;
        int var10 = this.field3168;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3165 > 0) {
            int var13 = ((this.field3165 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3165 << 16);
        }
        if (this.field3171 > 0) {
            int var14 = ((this.field3171 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3171 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class272.field4704 * arg1 + arg0;
        int var16 = class272.field4704 - arg2;
        if (arg1 + arg3 > class272.field4708) {
            arg3 -= arg1 + arg3 - class272.field4708;
        }
        if (arg1 < class272.field4705) {
            int var17 = class272.field4705 - arg1;
            arg3 -= var17;
            var15 += class272.field4704 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class272.field4703) {
            int var18 = arg0 + arg2 - class272.field4703;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class272.field4702) {
            int var19 = class272.field4702 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method34(class272.field4709, this.field59, this.field58, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)V", line = 456)
    public final void method43(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field58.length; var4++) {
            int var5 = this.field58[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field58[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field58[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field58[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(III)V", line = 496)
    public class5(int arg0, int arg1, int arg2) {
        this.field3173 = this.field3162 = arg0;
        this.field3168 = this.field3157 = arg1;
        this.field3165 = this.field3171 = 0;
        this.field59 = new byte[arg0 * arg1];
        this.field58 = new int[arg2];
    }
}
