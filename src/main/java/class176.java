import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class176 extends class175 {

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "[B")
    public byte[] field3012;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "[I")
    private int[] field3013;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()Lnm;", line = 4)
    public final class176 method1228() {
        class176 var1 = new class176(this.field3008, this.field3011, this.field3013.length);
        var1.field3001 = this.field3001;
        var1.field3003 = this.field3003;
        var1.field3009 = this.field3009;
        var1.field3007 = this.field3007;
        int var2 = this.field3012.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field3012[var3] = this.field3012[var3];
        }
        var1.field3013 = this.field3013;
        return var1;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()V", line = 28)
    public final void method1229() {
        int var1 = 0;
        int var2 = this.field3012.length - 7;
        while (var1 < var2) {
            this.field3012[var1++] = 0;
            this.field3012[var1++] = 0;
            this.field3012[var1++] = 0;
            this.field3012[var1++] = 0;
            this.field3012[var1++] = 0;
            this.field3012[var1++] = 0;
            this.field3012[var1++] = 0;
            this.field3012[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field3012[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V", line = 52)
    public final void method281(int arg0, int arg1, int arg2) {
        int var4 = this.field3009 + arg0;
        int var5 = this.field3007 + arg1;
        int var6 = class210.field3537 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3011;
        int var9 = this.field3008;
        int var10 = class210.field3537 - var9;
        int var11 = 0;
        if (var5 < class210.field3530) {
            int var12 = class210.field3530 - var5;
            var8 -= var12;
            var5 = class210.field3530;
            var7 += var9 * var12;
            var6 += class210.field3537 * var12;
        }
        if (var5 + var8 > class210.field3534) {
            var8 -= var5 + var8 - class210.field3534;
        }
        if (var4 < class210.field3531) {
            int var13 = class210.field3531 - var4;
            var9 -= var13;
            var4 = class210.field3531;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class210.field3532) {
            int var14 = var4 + var9 - class210.field3532;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1235(class210.field3529, this.field3012, this.field3013, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 107)
    public final void method279(int arg0, int arg1) {
        int var3 = this.field3009 + arg0;
        int var4 = this.field3007 + arg1;
        int var5 = class210.field3537 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3011;
        int var8 = this.field3008;
        int var9 = class210.field3537 - var8;
        int var10 = 0;
        if (var4 < class210.field3530) {
            int var11 = class210.field3530 - var4;
            var7 -= var11;
            var4 = class210.field3530;
            var6 += var8 * var11;
            var5 += class210.field3537 * var11;
        }
        if (var4 + var7 > class210.field3534) {
            var7 -= var4 + var7 - class210.field3534;
        }
        if (var3 < class210.field3531) {
            int var12 = class210.field3531 - var3;
            var8 -= var12;
            var3 = class210.field3531;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class210.field3532) {
            int var13 = var3 + var8 - class210.field3532;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1232(class210.field3529, this.field3012, this.field3013, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "()V", line = 163)
    public final void method1230() {
        byte[] var1 = new byte[this.field3011 * this.field3008];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3008; var3++) {
            for (int var4 = this.field3011 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3012[this.field3008 * var4 + var3];
            }
        }
        this.field3012 = var1;
        int var5 = this.field3007;
        this.field3007 = this.field3009;
        this.field3009 = this.field3003 - this.field3011 - var5;
        int var6 = this.field3011;
        this.field3011 = this.field3008;
        this.field3008 = var6;
        int var7 = this.field3003;
        this.field3003 = this.field3001;
        this.field3001 = var7;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 196)
    private static final void method1231(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 236)
    private static final void method1232(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()V", line = 299)
    public final void method1233() {
        if (this.field3008 == this.field3001 && this.field3011 == this.field3003) {
            return;
        }
        byte[] var1 = new byte[this.field3003 * this.field3001];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3011; var3++) {
            for (int var4 = 0; var4 < this.field3008; var4++) {
                var1[(this.field3007 + var3) * this.field3001 + this.field3009 + var4] = this.field3012[var2++];
            }
        }
        this.field3012 = var1;
        this.field3008 = this.field3001;
        this.field3011 = this.field3003;
        this.field3009 = 0;
        this.field3007 = 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)V", line = 332)
    public final void method1234(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field3008;
        int var6 = this.field3011;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3001;
        int var10 = this.field3003;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3009 > 0) {
            int var13 = ((this.field3009 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3009 << 16);
        }
        if (this.field3007 > 0) {
            int var14 = ((this.field3007 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3007 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class210.field3537 * arg1 + arg0;
        int var16 = class210.field3537 - arg2;
        if (arg1 + arg3 > class210.field3534) {
            arg3 -= arg1 + arg3 - class210.field3534;
        }
        if (arg1 < class210.field3530) {
            int var17 = class210.field3530 - arg1;
            arg3 -= var17;
            var15 += class210.field3537 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class210.field3532) {
            int var18 = arg0 + arg2 - class210.field3532;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class210.field3531) {
            int var19 = class210.field3531 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1231(class210.field3529, this.field3012, this.field3013, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 410)
    private static final void method1235(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 443)
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3001 = arg0;
        this.field3003 = arg1;
        this.field3009 = arg2;
        this.field3007 = arg3;
        this.field3008 = arg4;
        this.field3011 = arg5;
        this.field3012 = arg6;
        this.field3013 = arg7;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V", line = 457)
    public final void method1236(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3013.length; var4++) {
            int var5 = this.field3013[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3013[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3013[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3013[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(III)V", line = 498)
    public class176(int arg0, int arg1, int arg2) {
        this.field3001 = this.field3008 = arg0;
        this.field3003 = this.field3011 = arg1;
        this.field3009 = this.field3007 = 0;
        this.field3012 = new byte[arg0 * arg1];
        this.field3013 = new int[arg2];
    }
}
