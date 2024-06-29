import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class257 extends class59 {

    @OriginalMember(owner = "client!t", name = "o", descriptor = "[B")
    public byte[] field4551;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "[I")
    private int[] field4552;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(III)V", line = 8)
    public final void method1826(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4552.length; var4++) {
            int var5 = this.field4552[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field4552[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field4552[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field4552[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 50)
    private static final void method1827(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 115)
    private static final void method1828(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V", line = 153)
    public final void method1829() {
        int var1 = 0;
        int var2 = this.field4551.length - 7;
        while (var1 < var2) {
            this.field4551[var1++] = 0;
            this.field4551[var1++] = 0;
            this.field4551[var1++] = 0;
            this.field4551[var1++] = 0;
            this.field4551[var1++] = 0;
            this.field4551[var1++] = 0;
            this.field4551[var1++] = 0;
            this.field4551[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field4551[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V", line = 176)
    public final void method1830(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field889;
        int var6 = this.field884;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field888;
        int var10 = this.field886;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field878 > 0) {
            int var13 = ((this.field878 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field878 << 16);
        }
        if (this.field881 > 0) {
            int var14 = ((this.field881 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field881 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class28.field428 * arg1 + arg0;
        int var16 = class28.field428 - arg2;
        if (arg1 + arg3 > class28.field421) {
            arg3 -= arg1 + arg3 - class28.field421;
        }
        if (arg1 < class28.field425) {
            int var17 = class28.field425 - arg1;
            arg3 -= var17;
            var15 += class28.field428 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class28.field423) {
            int var18 = arg0 + arg2 - class28.field423;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class28.field422) {
            int var19 = class28.field422 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1831(class28.field427, this.field4551, this.field4552, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 253)
    private static final void method1831(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Lt;", line = 292)
    public final class257 method1832() {
        class257 var1 = new class257(this.field889, this.field884, this.field4552.length);
        var1.field888 = this.field888;
        var1.field886 = this.field886;
        var1.field878 = this.field878;
        var1.field881 = this.field881;
        int var2 = this.field4551.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field4551[var3] = this.field4551[var3];
        }
        var1.field4552 = this.field4552;
        return var1;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()V", line = 312)
    public final void method1833() {
        if (this.field889 == this.field888 && this.field886 == this.field884) {
            return;
        }
        byte[] var1 = new byte[this.field888 * this.field886];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field884; var3++) {
            for (int var4 = 0; var4 < this.field889; var4++) {
                var1[(this.field881 + var3) * this.field888 + this.field878 + var4] = this.field4551[var2++];
            }
        }
        this.field4551 = var1;
        this.field889 = this.field888;
        this.field884 = this.field886;
        this.field878 = 0;
        this.field881 = 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 346)
    public final void method404(int arg0, int arg1) {
        int var3 = this.field878 + arg0;
        int var4 = this.field881 + arg1;
        int var5 = class28.field428 * var4 + var3;
        int var6 = 0;
        int var7 = this.field884;
        int var8 = this.field889;
        int var9 = class28.field428 - var8;
        int var10 = 0;
        if (var4 < class28.field425) {
            int var11 = class28.field425 - var4;
            var7 -= var11;
            var4 = class28.field425;
            var6 += var8 * var11;
            var5 += class28.field428 * var11;
        }
        if (var4 + var7 > class28.field421) {
            var7 -= var4 + var7 - class28.field421;
        }
        if (var3 < class28.field422) {
            int var12 = class28.field422 - var3;
            var8 -= var12;
            var3 = class28.field422;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class28.field423) {
            int var13 = var3 + var8 - class28.field423;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1827(class28.field427, this.field4551, this.field4552, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V", line = 402)
    public final void method402(int arg0, int arg1, int arg2) {
        int var4 = this.field878 + arg0;
        int var5 = this.field881 + arg1;
        int var6 = class28.field428 * var5 + var4;
        int var7 = 0;
        int var8 = this.field884;
        int var9 = this.field889;
        int var10 = class28.field428 - var9;
        int var11 = 0;
        if (var5 < class28.field425) {
            int var12 = class28.field425 - var5;
            var8 -= var12;
            var5 = class28.field425;
            var7 += var9 * var12;
            var6 += class28.field428 * var12;
        }
        if (var5 + var8 > class28.field421) {
            var8 -= var5 + var8 - class28.field421;
        }
        if (var4 < class28.field422) {
            int var13 = class28.field422 - var4;
            var9 -= var13;
            var4 = class28.field422;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class28.field423) {
            int var14 = var4 + var9 - class28.field423;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1828(class28.field427, this.field4551, this.field4552, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 455)
    public class257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field888 = arg0;
        this.field886 = arg1;
        this.field878 = arg2;
        this.field881 = arg3;
        this.field889 = arg4;
        this.field884 = arg5;
        this.field4551 = arg6;
        this.field4552 = arg7;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()V", line = 468)
    public final void method1834() {
        byte[] var1 = new byte[this.field889 * this.field884];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field889; var3++) {
            for (int var4 = this.field884 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field4551[this.field889 * var4 + var3];
            }
        }
        this.field4551 = var1;
        int var5 = this.field881;
        this.field881 = this.field878;
        this.field878 = this.field886 - this.field884 - var5;
        int var6 = this.field884;
        this.field884 = this.field889;
        this.field889 = var6;
        int var7 = this.field886;
        this.field886 = this.field888;
        this.field888 = var7;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(III)V", line = 498)
    public class257(int arg0, int arg1, int arg2) {
        this.field888 = this.field889 = arg0;
        this.field886 = this.field884 = arg1;
        this.field878 = this.field881 = 0;
        this.field4551 = new byte[arg0 * arg1];
        this.field4552 = new int[arg2];
    }
}
