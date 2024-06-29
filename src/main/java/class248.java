import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class248 extends class129 {

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "[B")
    public byte[] field4376;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[I")
    private int[] field4377;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 7)
    public final void method541(int arg0, int arg1, int arg2) {
        int var4 = this.field2301 + arg0;
        int var5 = this.field2295 + arg1;
        int var6 = class114.field2055 * var5 + var4;
        int var7 = 0;
        int var8 = this.field2299;
        int var9 = this.field2294;
        int var10 = class114.field2055 - var9;
        int var11 = 0;
        if (var5 < class114.field2049) {
            int var12 = class114.field2049 - var5;
            var8 -= var12;
            var5 = class114.field2049;
            var7 += var9 * var12;
            var6 += class114.field2055 * var12;
        }
        if (var5 + var8 > class114.field2054) {
            var8 -= var5 + var8 - class114.field2054;
        }
        if (var4 < class114.field2051) {
            int var13 = class114.field2051 - var4;
            var9 -= var13;
            var4 = class114.field2051;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class114.field2056) {
            int var14 = var4 + var9 - class114.field2056;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1794(class114.field2050, this.field4376, this.field4377, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "()V", line = 67)
    public final void method1786() {
        if (this.field2298 == this.field2294 && this.field2299 == this.field2297) {
            return;
        }
        byte[] var1 = new byte[this.field2298 * this.field2297];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2299; var3++) {
            for (int var4 = 0; var4 < this.field2294; var4++) {
                var1[(this.field2295 + var3) * this.field2298 + this.field2301 + var4] = this.field4376[var2++];
            }
        }
        this.field4376 = var1;
        this.field2294 = this.field2298;
        this.field2299 = this.field2297;
        this.field2301 = 0;
        this.field2295 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 100)
    private static final void method1787(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V", line = 161)
    public final void method543(int arg0, int arg1) {
        int var3 = this.field2301 + arg0;
        int var4 = this.field2295 + arg1;
        int var5 = class114.field2055 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2299;
        int var8 = this.field2294;
        int var9 = class114.field2055 - var8;
        int var10 = 0;
        if (var4 < class114.field2049) {
            int var11 = class114.field2049 - var4;
            var7 -= var11;
            var4 = class114.field2049;
            var6 += var8 * var11;
            var5 += class114.field2055 * var11;
        }
        if (var4 + var7 > class114.field2054) {
            var7 -= var4 + var7 - class114.field2054;
        }
        if (var3 < class114.field2051) {
            int var12 = class114.field2051 - var3;
            var8 -= var12;
            var3 = class114.field2051;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class114.field2056) {
            int var13 = var3 + var8 - class114.field2056;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1787(class114.field2050, this.field4376, this.field4377, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()Lrm;", line = 221)
    public final class248 method1788() {
        class248 var1 = new class248(this.field2294, this.field2299, this.field4377.length);
        var1.field2298 = this.field2298;
        var1.field2297 = this.field2297;
        var1.field2301 = this.field2301;
        var1.field2295 = this.field2295;
        int var2 = this.field4376.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field4376[var3] = this.field4376[var3];
        }
        var1.field4377 = this.field4377;
        return var1;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V", line = 242)
    public final void method1789(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4377.length; var4++) {
            int var5 = this.field4377[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field4377[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field4377[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field4377[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 288)
    private static final void method1790(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "()V", line = 324)
    public final void method1791() {
        int var1 = 0;
        int var2 = this.field4376.length - 7;
        while (var1 < var2) {
            this.field4376[var1++] = 0;
            this.field4376[var1++] = 0;
            this.field4376[var1++] = 0;
            this.field4376[var1++] = 0;
            this.field4376[var1++] = 0;
            this.field4376[var1++] = 0;
            this.field4376[var1++] = 0;
            this.field4376[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field4376[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "()V", line = 346)
    public final void method1792() {
        byte[] var1 = new byte[this.field2299 * this.field2294];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2294; var3++) {
            for (int var4 = this.field2299 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field4376[this.field2294 * var4 + var3];
            }
        }
        this.field4376 = var1;
        int var5 = this.field2295;
        this.field2295 = this.field2301;
        this.field2301 = this.field2297 - this.field2299 - var5;
        int var6 = this.field2299;
        this.field2299 = this.field2294;
        this.field2294 = var6;
        int var7 = this.field2297;
        this.field2297 = this.field2298;
        this.field2298 = var7;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 376)
    public class248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2298 = arg0;
        this.field2297 = arg1;
        this.field2301 = arg2;
        this.field2295 = arg3;
        this.field2294 = arg4;
        this.field2299 = arg5;
        this.field4376 = arg6;
        this.field4377 = arg7;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(IIII)V", line = 389)
    public final void method1793(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field2294;
        int var6 = this.field2299;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2298;
        int var10 = this.field2297;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2301 > 0) {
            int var13 = ((this.field2301 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2301 << 16);
        }
        if (this.field2295 > 0) {
            int var14 = ((this.field2295 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2295 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class114.field2055 * arg1 + arg0;
        int var16 = class114.field2055 - arg2;
        if (arg1 + arg3 > class114.field2054) {
            arg3 -= arg1 + arg3 - class114.field2054;
        }
        if (arg1 < class114.field2049) {
            int var17 = class114.field2049 - arg1;
            arg3 -= var17;
            var15 += class114.field2055 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class114.field2056) {
            int var18 = arg0 + arg2 - class114.field2056;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class114.field2051) {
            int var19 = class114.field2051 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1790(class114.field2050, this.field4376, this.field4377, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 465)
    private static final void method1794(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(III)V", line = 498)
    public class248(int arg0, int arg1, int arg2) {
        this.field2298 = this.field2294 = arg0;
        this.field2297 = this.field2299 = arg1;
        this.field2301 = this.field2295 = 0;
        this.field4376 = new byte[arg0 * arg1];
        this.field4377 = new int[arg2];
    }
}
