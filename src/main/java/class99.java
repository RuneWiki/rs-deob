import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class99 extends class34 {

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "[B")
    public byte[] field1789;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "[I")
    private int[] field1788;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method788(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field556;
        int var6 = this.field557;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field547;
        int var10 = this.field549;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field545 > 0) {
            int var13 = ((this.field545 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field545 << 16);
        }
        if (this.field543 > 0) {
            int var14 = ((this.field543 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field543 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class316.field5331 * arg1 + arg0;
        int var16 = class316.field5331 - arg2;
        if (arg1 + arg3 > class316.field5334) {
            arg3 -= arg1 + arg3 - class316.field5334;
        }
        if (arg1 < class316.field5330) {
            int var17 = class316.field5330 - arg1;
            arg3 -= var17;
            var15 += class316.field5331 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class316.field5333) {
            int var18 = arg0 + arg2 - class316.field5333;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class316.field5332) {
            int var19 = class316.field5332 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method795(class316.field5328, this.field1789, this.field1788, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V", line = 78)
    public final void method789() {
        if (this.field556 == this.field547 && this.field557 == this.field549) {
            return;
        }
        byte[] var1 = new byte[this.field549 * this.field547];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field557; var3++) {
            for (int var4 = 0; var4 < this.field556; var4++) {
                var1[(this.field543 + var3) * this.field547 + this.field545 + var4] = this.field1789[var2++];
            }
        }
        this.field1789 = var1;
        this.field556 = this.field547;
        this.field557 = this.field549;
        this.field545 = 0;
        this.field543 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V", line = 109)
    public final void method266(int arg0, int arg1) {
        int var3 = this.field545 + arg0;
        int var4 = this.field543 + arg1;
        int var5 = class316.field5331 * var4 + var3;
        int var6 = 0;
        int var7 = this.field557;
        int var8 = this.field556;
        int var9 = class316.field5331 - var8;
        int var10 = 0;
        if (var4 < class316.field5330) {
            int var11 = class316.field5330 - var4;
            var7 -= var11;
            var4 = class316.field5330;
            var6 += var8 * var11;
            var5 += class316.field5331 * var11;
        }
        if (var4 + var7 > class316.field5334) {
            var7 -= var4 + var7 - class316.field5334;
        }
        if (var3 < class316.field5332) {
            int var12 = class316.field5332 - var3;
            var8 -= var12;
            var3 = class316.field5332;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class316.field5333) {
            int var13 = var3 + var8 - class316.field5333;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method790(class316.field5328, this.field1789, this.field1788, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V", line = 170)
    public final void method272(int arg0, int arg1, int arg2) {
        int var4 = this.field545 + arg0;
        int var5 = this.field543 + arg1;
        int var6 = class316.field5331 * var5 + var4;
        int var7 = 0;
        int var8 = this.field557;
        int var9 = this.field556;
        int var10 = class316.field5331 - var9;
        int var11 = 0;
        if (var5 < class316.field5330) {
            int var12 = class316.field5330 - var5;
            var8 -= var12;
            var5 = class316.field5330;
            var7 += var9 * var12;
            var6 += class316.field5331 * var12;
        }
        if (var5 + var8 > class316.field5334) {
            var8 -= var5 + var8 - class316.field5334;
        }
        if (var4 < class316.field5332) {
            int var13 = class316.field5332 - var4;
            var9 -= var13;
            var4 = class316.field5332;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class316.field5333) {
            int var14 = var4 + var9 - class316.field5333;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method791(class316.field5328, this.field1789, this.field1788, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 227)
    private static final void method790(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 292)
    private static final void method791(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()V", line = 331)
    public final void method792() {
        byte[] var1 = new byte[this.field557 * this.field556];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field556; var3++) {
            for (int var4 = this.field557 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1789[this.field556 * var4 + var3];
            }
        }
        this.field1789 = var1;
        int var5 = this.field543;
        this.field543 = this.field545;
        this.field545 = this.field549 - this.field557 - var5;
        int var6 = this.field557;
        this.field557 = this.field556;
        this.field556 = var6;
        int var7 = this.field549;
        this.field549 = this.field547;
        this.field547 = var7;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()Lpm;", line = 366)
    public final class99 method793() {
        class99 var1 = new class99(this.field556, this.field557, this.field1788.length);
        var1.field547 = this.field547;
        var1.field549 = this.field549;
        var1.field545 = this.field545;
        var1.field543 = this.field543;
        int var2 = this.field1789.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field1789[var3] = this.field1789[var3];
        }
        var1.field1788 = this.field1788;
        return var1;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V", line = 386)
    public final void method794(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1788.length; var4++) {
            int var5 = this.field1788[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1788[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1788[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1788[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 433)
    private static final void method795(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "()V", line = 466)
    public final void method796() {
        int var1 = 0;
        int var2 = this.field1789.length - 7;
        while (var1 < var2) {
            this.field1789[var1++] = 0;
            this.field1789[var1++] = 0;
            this.field1789[var1++] = 0;
            this.field1789[var1++] = 0;
            this.field1789[var1++] = 0;
            this.field1789[var1++] = 0;
            this.field1789[var1++] = 0;
            this.field1789[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field1789[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 487)
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field547 = arg0;
        this.field549 = arg1;
        this.field545 = arg2;
        this.field543 = arg3;
        this.field556 = arg4;
        this.field557 = arg5;
        this.field1789 = arg6;
        this.field1788 = arg7;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(III)V", line = 498)
    public class99(int arg0, int arg1, int arg2) {
        this.field547 = this.field556 = arg0;
        this.field549 = this.field557 = arg1;
        this.field545 = this.field543 = 0;
        this.field1789 = new byte[arg0 * arg1];
        this.field1788 = new int[arg2];
    }
}
