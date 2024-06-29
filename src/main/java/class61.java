import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class61 extends class24 {

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "[B")
    public byte[] field880;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "[I")
    private int[] field881;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()Lfd;", line = 8)
    public final class61 method394() {
        class61 var1 = new class61(this.field276, this.field261, this.field881.length);
        var1.field262 = this.field262;
        var1.field259 = this.field259;
        var1.field270 = this.field270;
        var1.field265 = this.field265;
        int var2 = this.field880.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field880[var3] = this.field880[var3];
        }
        var1.field881 = this.field881;
        return var1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()V", line = 28)
    public final void method395() {
        byte[] var1 = new byte[this.field276 * this.field261];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field276; var3++) {
            for (int var4 = this.field261 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field880[this.field276 * var4 + var3];
            }
        }
        this.field880 = var1;
        int var5 = this.field265;
        this.field265 = this.field270;
        this.field270 = this.field259 - this.field261 - var5;
        int var6 = this.field261;
        this.field261 = this.field276;
        this.field276 = var6;
        int var7 = this.field259;
        this.field259 = this.field262;
        this.field262 = var7;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()V", line = 62)
    public final void method396() {
        int var1 = 0;
        int var2 = this.field880.length - 7;
        while (var1 < var2) {
            this.field880[var1++] = 0;
            this.field880[var1++] = 0;
            this.field880[var1++] = 0;
            this.field880[var1++] = 0;
            this.field880[var1++] = 0;
            this.field880[var1++] = 0;
            this.field880[var1++] = 0;
            this.field880[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field880[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V", line = 87)
    public final void method397(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field276;
        int var6 = this.field261;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field262;
        int var10 = this.field259;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field270 > 0) {
            int var13 = ((this.field270 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field270 << 16);
        }
        if (this.field265 > 0) {
            int var14 = ((this.field265 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field265 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class280.field4787 * arg1 + arg0;
        int var16 = class280.field4787 - arg2;
        if (arg1 + arg3 > class280.field4789) {
            arg3 -= arg1 + arg3 - class280.field4789;
        }
        if (arg1 < class280.field4794) {
            int var17 = class280.field4794 - arg1;
            arg3 -= var17;
            var15 += class280.field4787 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class280.field4790) {
            int var18 = arg0 + arg2 - class280.field4790;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class280.field4788) {
            int var19 = class280.field4788 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method399(class280.field4795, this.field880, this.field881, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()V", line = 164)
    public final void method398() {
        if (this.field276 == this.field262 && this.field261 == this.field259) {
            return;
        }
        byte[] var1 = new byte[this.field262 * this.field259];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field261; var3++) {
            for (int var4 = 0; var4 < this.field276; var4++) {
                var1[(this.field265 + var3) * this.field262 + this.field270 + var4] = this.field880[var2++];
            }
        }
        this.field880 = var1;
        this.field276 = this.field262;
        this.field261 = this.field259;
        this.field270 = 0;
        this.field265 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 199)
    private static final void method399(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V", line = 233)
    public final void method400(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field881.length; var4++) {
            int var5 = this.field881[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field881[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field881[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field881[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 281)
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field262 = arg0;
        this.field259 = arg1;
        this.field270 = arg2;
        this.field265 = arg3;
        this.field276 = arg4;
        this.field261 = arg5;
        this.field880 = arg6;
        this.field881 = arg7;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 293)
    private static final void method401(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V", line = 355)
    public final void method126(int arg0, int arg1, int arg2) {
        int var4 = this.field270 + arg0;
        int var5 = this.field265 + arg1;
        int var6 = class280.field4787 * var5 + var4;
        int var7 = 0;
        int var8 = this.field261;
        int var9 = this.field276;
        int var10 = class280.field4787 - var9;
        int var11 = 0;
        if (var5 < class280.field4794) {
            int var12 = class280.field4794 - var5;
            var8 -= var12;
            var5 = class280.field4794;
            var7 += var9 * var12;
            var6 += class280.field4787 * var12;
        }
        if (var5 + var8 > class280.field4789) {
            var8 -= var5 + var8 - class280.field4789;
        }
        if (var4 < class280.field4788) {
            int var13 = class280.field4788 - var4;
            var9 -= var13;
            var4 = class280.field4788;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class280.field4790) {
            int var14 = var4 + var9 - class280.field4790;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method402(class280.field4795, this.field880, this.field881, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 410)
    private static final void method402(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V", line = 445)
    public final void method124(int arg0, int arg1) {
        int var3 = this.field270 + arg0;
        int var4 = this.field265 + arg1;
        int var5 = class280.field4787 * var4 + var3;
        int var6 = 0;
        int var7 = this.field261;
        int var8 = this.field276;
        int var9 = class280.field4787 - var8;
        int var10 = 0;
        if (var4 < class280.field4794) {
            int var11 = class280.field4794 - var4;
            var7 -= var11;
            var4 = class280.field4794;
            var6 += var8 * var11;
            var5 += class280.field4787 * var11;
        }
        if (var4 + var7 > class280.field4789) {
            var7 -= var4 + var7 - class280.field4789;
        }
        if (var3 < class280.field4788) {
            int var12 = class280.field4788 - var3;
            var8 -= var12;
            var3 = class280.field4788;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class280.field4790) {
            int var13 = var3 + var8 - class280.field4790;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method401(class280.field4795, this.field880, this.field881, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(III)V", line = 498)
    public class61(int arg0, int arg1, int arg2) {
        this.field262 = this.field276 = arg0;
        this.field259 = this.field261 = arg1;
        this.field270 = this.field265 = 0;
        this.field880 = new byte[arg0 * arg1];
        this.field881 = new int[arg2];
    }
}
