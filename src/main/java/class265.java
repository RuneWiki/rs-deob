import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class265 extends class193 {

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "[B")
    public byte[] field4472;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "[I")
    private int[] field4473;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V", line = 10)
    public final void method1839(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field3139;
        int var6 = this.field3135;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3134;
        int var10 = this.field3141;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3142 > 0) {
            int var13 = ((this.field3142 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3142 << 16);
        }
        if (this.field3146 > 0) {
            int var14 = ((this.field3146 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3146 << 16);
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
        method1841(class277.field4657, this.field4472, this.field4473, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)V", line = 92)
    public final void method1840(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4473.length; var4++) {
            int var5 = this.field4473[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field4473[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field4473[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field4473[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V", line = 131)
    public final void method1363(int arg0, int arg1) {
        int var3 = this.field3142 + arg0;
        int var4 = this.field3146 + arg1;
        int var5 = class277.field4652 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3135;
        int var8 = this.field3139;
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
            method1844(class277.field4657, this.field4472, this.field4473, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 186)
    private static final void method1841(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V", line = 224)
    public final void method1842() {
        if (this.field3139 == this.field3134 && this.field3141 == this.field3135) {
            return;
        }
        byte[] var1 = new byte[this.field3141 * this.field3134];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3135; var3++) {
            for (int var4 = 0; var4 < this.field3139; var4++) {
                var1[(this.field3146 + var3) * this.field3134 + this.field3142 + var4] = this.field4472[var2++];
            }
        }
        this.field4472 = var1;
        this.field3139 = this.field3134;
        this.field3135 = this.field3141;
        this.field3142 = 0;
        this.field3146 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "()V", line = 257)
    public final void method1843() {
        int var1 = 0;
        int var2 = this.field4472.length - 7;
        while (var1 < var2) {
            this.field4472[var1++] = 0;
            this.field4472[var1++] = 0;
            this.field4472[var1++] = 0;
            this.field4472[var1++] = 0;
            this.field4472[var1++] = 0;
            this.field4472[var1++] = 0;
            this.field4472[var1++] = 0;
            this.field4472[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field4472[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 282)
    private static final void method1844(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "()V", line = 343)
    public final void method1845() {
        byte[] var1 = new byte[this.field3139 * this.field3135];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3139; var3++) {
            for (int var4 = this.field3135 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field4472[this.field3139 * var4 + var3];
            }
        }
        this.field4472 = var1;
        int var5 = this.field3146;
        this.field3146 = this.field3142;
        this.field3142 = this.field3141 - this.field3135 - var5;
        int var6 = this.field3135;
        this.field3135 = this.field3139;
        this.field3139 = var6;
        int var7 = this.field3141;
        this.field3141 = this.field3134;
        this.field3134 = var7;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "()Lgk;", line = 380)
    public final class265 method1846() {
        class265 var1 = new class265(this.field3139, this.field3135, this.field4473.length);
        var1.field3134 = this.field3134;
        var1.field3141 = this.field3141;
        var1.field3142 = this.field3142;
        var1.field3146 = this.field3146;
        int var2 = this.field4472.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field4472[var3] = this.field4472[var3];
        }
        var1.field4473 = this.field4473;
        return var1;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 400)
    private static final void method1847(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V", line = 433)
    public final void method1364(int arg0, int arg1, int arg2) {
        int var4 = this.field3142 + arg0;
        int var5 = this.field3146 + arg1;
        int var6 = class277.field4652 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3135;
        int var9 = this.field3139;
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
            method1847(class277.field4657, this.field4472, this.field4473, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 488)
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3134 = arg0;
        this.field3141 = arg1;
        this.field3142 = arg2;
        this.field3146 = arg3;
        this.field3139 = arg4;
        this.field3135 = arg5;
        this.field4472 = arg6;
        this.field4473 = arg7;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V", line = 498)
    public class265(int arg0, int arg1, int arg2) {
        this.field3134 = this.field3139 = arg0;
        this.field3141 = this.field3135 = arg1;
        this.field3142 = this.field3146 = 0;
        this.field4472 = new byte[arg0 * arg1];
        this.field4473 = new int[arg2];
    }
}
