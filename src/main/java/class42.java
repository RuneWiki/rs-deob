import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class42 extends class327 {

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[B")
    public byte[] field603;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "[I")
    private int[] field604;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 4)
    private static final void method318(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()V", line = 67)
    public final void method319() {
        byte[] var1 = new byte[this.field5049 * this.field5047];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5047; var3++) {
            for (int var4 = this.field5049 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field603[this.field5047 * var4 + var3];
            }
        }
        this.field603 = var1;
        int var5 = this.field5045;
        this.field5045 = this.field5044;
        this.field5044 = this.field5051 - this.field5049 - var5;
        int var6 = this.field5049;
        this.field5049 = this.field5047;
        this.field5047 = var6;
        int var7 = this.field5051;
        this.field5051 = this.field5052;
        this.field5052 = var7;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()V", line = 109)
    public final void method320() {
        byte[] var1 = new byte[this.field5049 * this.field5047];
        int var2 = 0;
        for (int var3 = this.field5049 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field5047; var4++) {
                var1[var2++] = this.field603[this.field5047 * var3 + var4];
            }
        }
        this.field603 = var1;
        this.field5045 = this.field5051 - this.field5049 - this.field5045;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 132)
    private static final void method321(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V", line = 174)
    public final void method322(int arg0, int arg1) {
        int var3 = this.field5044 + arg0;
        int var4 = this.field5045 + arg1;
        int var5 = class287.field4452 * var4 + var3;
        int var6 = 0;
        int var7 = this.field5049;
        int var8 = this.field5047;
        int var9 = class287.field4452 - var8;
        int var10 = 0;
        if (var4 < class287.field4454) {
            int var11 = class287.field4454 - var4;
            var7 -= var11;
            var4 = class287.field4454;
            var6 += var8 * var11;
            var5 += class287.field4452 * var11;
        }
        if (var4 + var7 > class287.field4456) {
            var7 -= var4 + var7 - class287.field4456;
        }
        if (var3 < class287.field4451) {
            int var12 = class287.field4451 - var3;
            var8 -= var12;
            var3 = class287.field4451;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class287.field4448) {
            int var13 = var3 + var8 - class287.field4448;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method318(class287.field4453, this.field603, this.field604, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)V", line = 231)
    public final void method323(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field604.length; var4++) {
            int var5 = this.field604[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field604[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field604[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field604[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V", line = 270)
    public final void method324(int arg0, int arg1, int arg2) {
        int var4 = this.field5044 + arg0;
        int var5 = this.field5045 + arg1;
        int var6 = class287.field4452 * var5 + var4;
        int var7 = 0;
        int var8 = this.field5049;
        int var9 = this.field5047;
        int var10 = class287.field4452 - var9;
        int var11 = 0;
        if (var5 < class287.field4454) {
            int var12 = class287.field4454 - var5;
            var8 -= var12;
            var5 = class287.field4454;
            var7 += var9 * var12;
            var6 += class287.field4452 * var12;
        }
        if (var5 + var8 > class287.field4456) {
            var8 -= var5 + var8 - class287.field4456;
        }
        if (var4 < class287.field4451) {
            int var13 = class287.field4451 - var4;
            var9 -= var13;
            var4 = class287.field4451;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class287.field4448) {
            int var14 = var4 + var9 - class287.field4448;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method321(class287.field4453, this.field603, this.field604, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([I[B[IIIIIIIIIII)V", line = 326)
    private static final void method325(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3;
        int var14 = arg12 >> 16 & 0xFF;
        int var15 = arg12 >> 8 & 0xFF;
        int var16 = arg12 & 0xFF;
        for (int var17 = -arg8; var17 < 0; var17++) {
            int var18 = (arg4 >> 16) * arg11;
            for (int var19 = -arg7; var19 < 0; var19++) {
                byte var20 = arg1[(arg3 >> 16) + var18];
                if (var20 == 0) {
                    arg5++;
                } else {
                    int var21 = arg2[var20 & 0xFF];
                    int var22 = var21 >> 16 & 0xFF;
                    int var23 = var21 >> 8 & 0xFF;
                    int var24 = var21 & 0xFF;
                    arg0[arg5++] = (var16 * var24 >> 8) + (var14 * var22 >> 8 << 16) + (var15 * var23 >> 8 << 8);
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V", line = 376)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field5047;
        int var7 = this.field5049;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field5052;
        int var11 = this.field5051;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field5044 > 0) {
            int var14 = ((this.field5044 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field5044 << 16);
        }
        if (this.field5045 > 0) {
            int var15 = ((this.field5045 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field5045 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        int var16 = class287.field4452 * arg1 + arg0;
        int var17 = class287.field4452 - arg2;
        if (arg1 + arg3 > class287.field4456) {
            arg3 -= arg1 + arg3 - class287.field4456;
        }
        if (arg1 < class287.field4454) {
            int var18 = class287.field4454 - arg1;
            arg3 -= var18;
            var16 += class287.field4452 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class287.field4448) {
            int var19 = arg0 + arg2 - class287.field4448;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class287.field4451) {
            int var20 = class287.field4451 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method325(class287.field4453, this.field603, this.field604, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()V", line = 451)
    public final void method327() {
        int var1 = 0;
        int var2 = this.field603.length - 7;
        while (var1 < var2) {
            this.field603[var1++] = 0;
            this.field603[var1++] = 0;
            this.field603[var1++] = 0;
            this.field603[var1++] = 0;
            this.field603[var1++] = 0;
            this.field603[var1++] = 0;
            this.field603[var1++] = 0;
            this.field603[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field603[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V", line = 473)
    public final void method328(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field5047;
        int var6 = this.field5049;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field5052;
        int var10 = this.field5051;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field5044 > 0) {
            int var13 = ((this.field5044 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field5044 << 16);
        }
        if (this.field5045 > 0) {
            int var14 = ((this.field5045 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field5045 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class287.field4452 * arg1 + arg0;
        int var16 = class287.field4452 - arg2;
        if (arg1 + arg3 > class287.field4456) {
            arg3 -= arg1 + arg3 - class287.field4456;
        }
        if (arg1 < class287.field4454) {
            int var17 = class287.field4454 - arg1;
            arg3 -= var17;
            var15 += class287.field4452 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class287.field4448) {
            int var18 = arg0 + arg2 - class287.field4448;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class287.field4451) {
            int var19 = class287.field4451 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method330(class287.field4453, this.field603, this.field604, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()V", line = 552)
    public final void method329() {
        if (this.field5052 == this.field5047 && this.field5051 == this.field5049) {
            return;
        }
        byte[] var1 = new byte[this.field5052 * this.field5051];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5049; var3++) {
            for (int var4 = 0; var4 < this.field5047; var4++) {
                var1[(this.field5045 + var3) * this.field5052 + this.field5044 + var4] = this.field603[var2++];
            }
        }
        this.field603 = var1;
        this.field5047 = this.field5052;
        this.field5049 = this.field5051;
        this.field5044 = 0;
        this.field5045 = 0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 584)
    private static final void method330(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 615)
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field5052 = arg0;
        this.field5051 = arg1;
        this.field5044 = arg2;
        this.field5045 = arg3;
        this.field5047 = arg4;
        this.field5049 = arg5;
        this.field603 = arg6;
        this.field604 = arg7;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(III)V", line = 625)
    public class42(int arg0, int arg1, int arg2) {
        this.field5052 = this.field5047 = arg0;
        this.field5051 = this.field5049 = arg1;
        this.field5044 = this.field5045 = 0;
        this.field603 = new byte[arg0 * arg1];
        this.field604 = new int[arg2];
    }
}
