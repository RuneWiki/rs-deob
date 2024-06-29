import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class273 extends class5 {

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "[B")
    public byte[] field4696;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "[I")
    private int[] field4697;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V", line = 3)
    public final void method28(int arg0, int arg1) {
        int var3 = this.field69 + arg0;
        int var4 = this.field68 + arg1;
        int var5 = class175.field2890 * var4 + var3;
        int var6 = 0;
        int var7 = this.field74;
        int var8 = this.field70;
        int var9 = class175.field2890 - var8;
        int var10 = 0;
        if (var4 < class175.field2893) {
            int var11 = class175.field2893 - var4;
            var7 -= var11;
            var4 = class175.field2893;
            var6 += var8 * var11;
            var5 += class175.field2890 * var11;
        }
        if (var4 + var7 > class175.field2896) {
            var7 -= var4 + var7 - class175.field2896;
        }
        if (var3 < class175.field2888) {
            int var12 = class175.field2888 - var3;
            var8 -= var12;
            var3 = class175.field2888;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class175.field2894) {
            int var13 = var3 + var8 - class175.field2894;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1907(class175.field2891, this.field4696, this.field4697, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 64)
    private static final void method1907(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V", line = 125)
    public final void method31(int arg0, int arg1, int arg2) {
        int var4 = this.field69 + arg0;
        int var5 = this.field68 + arg1;
        int var6 = class175.field2890 * var5 + var4;
        int var7 = 0;
        int var8 = this.field74;
        int var9 = this.field70;
        int var10 = class175.field2890 - var9;
        int var11 = 0;
        if (var5 < class175.field2893) {
            int var12 = class175.field2893 - var5;
            var8 -= var12;
            var5 = class175.field2893;
            var7 += var9 * var12;
            var6 += class175.field2890 * var12;
        }
        if (var5 + var8 > class175.field2896) {
            var8 -= var5 + var8 - class175.field2896;
        }
        if (var4 < class175.field2888) {
            int var13 = class175.field2888 - var4;
            var9 -= var13;
            var4 = class175.field2888;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class175.field2894) {
            int var14 = var4 + var9 - class175.field2894;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1908(class175.field2891, this.field4696, this.field4697, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 180)
    private static final void method1908(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V", line = 218)
    public final void method1909() {
        int var1 = 0;
        int var2 = this.field4696.length - 7;
        while (var1 < var2) {
            this.field4696[var1++] = 0;
            this.field4696[var1++] = 0;
            this.field4696[var1++] = 0;
            this.field4696[var1++] = 0;
            this.field4696[var1++] = 0;
            this.field4696[var1++] = 0;
            this.field4696[var1++] = 0;
            this.field4696[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field4696[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()V", line = 250)
    public final void method1910() {
        byte[] var1 = new byte[this.field74 * this.field70];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field70; var3++) {
            for (int var4 = this.field74 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field4696[this.field70 * var4 + var3];
            }
        }
        this.field4696 = var1;
        int var5 = this.field68;
        this.field68 = this.field69;
        this.field69 = this.field73 - this.field74 - var5;
        int var6 = this.field74;
        this.field74 = this.field70;
        this.field70 = var6;
        int var7 = this.field73;
        this.field73 = this.field75;
        this.field75 = var7;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)V", line = 288)
    public final void method1911(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4697.length; var4++) {
            int var5 = this.field4697[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field4697[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field4697[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field4697[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 328)
    private static final void method1912(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V", line = 361)
    public final void method1913(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field70;
        int var6 = this.field74;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field75;
        int var10 = this.field73;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field69 > 0) {
            int var13 = ((this.field69 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field69 << 16);
        }
        if (this.field68 > 0) {
            int var14 = ((this.field68 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field68 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class175.field2890 * arg1 + arg0;
        int var16 = class175.field2890 - arg2;
        if (arg1 + arg3 > class175.field2896) {
            arg3 -= arg1 + arg3 - class175.field2896;
        }
        if (arg1 < class175.field2893) {
            int var17 = class175.field2893 - arg1;
            arg3 -= var17;
            var15 += class175.field2890 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class175.field2894) {
            int var18 = arg0 + arg2 - class175.field2894;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class175.field2888) {
            int var19 = class175.field2888 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1912(class175.field2891, this.field4696, this.field4697, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 434)
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field75 = arg0;
        this.field73 = arg1;
        this.field69 = arg2;
        this.field68 = arg3;
        this.field70 = arg4;
        this.field74 = arg5;
        this.field4696 = arg6;
        this.field4697 = arg7;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()Ldm;", line = 446)
    public final class273 method1914() {
        class273 var1 = new class273(this.field70, this.field74, this.field4697.length);
        var1.field75 = this.field75;
        var1.field73 = this.field73;
        var1.field69 = this.field69;
        var1.field68 = this.field68;
        int var2 = this.field4696.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field4696[var3] = this.field4696[var3];
        }
        var1.field4697 = this.field4697;
        return var1;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "()V", line = 466)
    public final void method1915() {
        if (this.field75 == this.field70 && this.field74 == this.field73) {
            return;
        }
        byte[] var1 = new byte[this.field75 * this.field73];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field74; var3++) {
            for (int var4 = 0; var4 < this.field70; var4++) {
                var1[(this.field68 + var3) * this.field75 + this.field69 + var4] = this.field4696[var2++];
            }
        }
        this.field4696 = var1;
        this.field70 = this.field75;
        this.field74 = this.field73;
        this.field69 = 0;
        this.field68 = 0;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(III)V", line = 498)
    public class273(int arg0, int arg1, int arg2) {
        this.field75 = this.field70 = arg0;
        this.field73 = this.field74 = arg1;
        this.field69 = this.field68 = 0;
        this.field4696 = new byte[arg0 * arg1];
        this.field4697 = new int[arg2];
    }
}
