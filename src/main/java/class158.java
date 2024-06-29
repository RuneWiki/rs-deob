import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class158 extends class50 {

    @OriginalMember(owner = "client!g", name = "v", descriptor = "[B")
    public byte[] field2891;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "[I")
    private int[] field2890;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 5)
    private static final void method1239(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V", line = 66)
    public final void method423(int arg0, int arg1) {
        int var3 = this.field1034 + arg0;
        int var4 = this.field1028 + arg1;
        int var5 = class146.field2639 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1027;
        int var8 = this.field1041;
        int var9 = class146.field2639 - var8;
        int var10 = 0;
        if (var4 < class146.field2642) {
            int var11 = class146.field2642 - var4;
            var7 -= var11;
            var4 = class146.field2642;
            var6 += var8 * var11;
            var5 += class146.field2639 * var11;
        }
        if (var4 + var7 > class146.field2636) {
            var7 -= var4 + var7 - class146.field2636;
        }
        if (var3 < class146.field2641) {
            int var12 = class146.field2641 - var3;
            var8 -= var12;
            var3 = class146.field2641;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class146.field2634) {
            int var13 = var3 + var8 - class146.field2634;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1239(class146.field2637, this.field2891, this.field2890, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 123)
    private static final void method1240(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V", line = 156)
    public final void method1241(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field1041;
        int var7 = this.field1027;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1036;
        int var11 = this.field1033;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1034 > 0) {
            int var14 = ((this.field1034 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1034 << 16);
        }
        if (this.field1028 > 0) {
            int var15 = ((this.field1028 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1028 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        int var16 = class146.field2639 * arg1 + arg0;
        int var17 = class146.field2639 - arg2;
        if (arg1 + arg3 > class146.field2636) {
            arg3 -= arg1 + arg3 - class146.field2636;
        }
        if (arg1 < class146.field2642) {
            int var18 = class146.field2642 - arg1;
            arg3 -= var18;
            var16 += class146.field2639 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class146.field2634) {
            int var19 = arg0 + arg2 - class146.field2634;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class146.field2641) {
            int var20 = class146.field2641 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method1244(class146.field2637, this.field2891, this.field2890, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)V", line = 234)
    public final void method1242(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2890.length; var4++) {
            int var5 = this.field2890[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2890[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2890[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2890[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()V", line = 275)
    public final void method1243() {
        byte[] var1 = new byte[this.field1041 * this.field1027];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1041; var3++) {
            for (int var4 = this.field1027 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2891[this.field1041 * var4 + var3];
            }
        }
        this.field2891 = var1;
        int var5 = this.field1028;
        this.field1028 = this.field1034;
        this.field1034 = this.field1033 - this.field1027 - var5;
        int var6 = this.field1027;
        this.field1027 = this.field1041;
        this.field1041 = var6;
        int var7 = this.field1033;
        this.field1033 = this.field1036;
        this.field1036 = var7;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([I[B[IIIIIIIIIII)V", line = 309)
    private static final void method1244(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()V", line = 357)
    public final void method1245() {
        int var1 = 0;
        int var2 = this.field2891.length - 7;
        while (var1 < var2) {
            this.field2891[var1++] = 0;
            this.field2891[var1++] = 0;
            this.field2891[var1++] = 0;
            this.field2891[var1++] = 0;
            this.field2891[var1++] = 0;
            this.field2891[var1++] = 0;
            this.field2891[var1++] = 0;
            this.field2891[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field2891[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "()V", line = 378)
    public final void method1246() {
        if (this.field1041 == this.field1036 && this.field1033 == this.field1027) {
            return;
        }
        byte[] var1 = new byte[this.field1036 * this.field1033];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1027; var3++) {
            for (int var4 = 0; var4 < this.field1041; var4++) {
                var1[(this.field1028 + var3) * this.field1036 + this.field1034 + var4] = this.field2891[var2++];
            }
        }
        this.field2891 = var1;
        this.field1041 = this.field1036;
        this.field1027 = this.field1033;
        this.field1034 = 0;
        this.field1028 = 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)V", line = 419)
    public final void method1247(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1041;
        int var6 = this.field1027;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1036;
        int var10 = this.field1033;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1034 > 0) {
            int var13 = ((this.field1034 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1034 << 16);
        }
        if (this.field1028 > 0) {
            int var14 = ((this.field1028 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1028 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class146.field2639 * arg1 + arg0;
        int var16 = class146.field2639 - arg2;
        if (arg1 + arg3 > class146.field2636) {
            arg3 -= arg1 + arg3 - class146.field2636;
        }
        if (arg1 < class146.field2642) {
            int var17 = class146.field2642 - arg1;
            arg3 -= var17;
            var15 += class146.field2639 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class146.field2634) {
            int var18 = arg0 + arg2 - class146.field2634;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class146.field2641) {
            int var19 = class146.field2641 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1240(class146.field2637, this.field2891, this.field2890, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V", line = 497)
    public final void method425(int arg0, int arg1, int arg2) {
        int var4 = this.field1034 + arg0;
        int var5 = this.field1028 + arg1;
        int var6 = class146.field2639 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1027;
        int var9 = this.field1041;
        int var10 = class146.field2639 - var9;
        int var11 = 0;
        if (var5 < class146.field2642) {
            int var12 = class146.field2642 - var5;
            var8 -= var12;
            var5 = class146.field2642;
            var7 += var9 * var12;
            var6 += class146.field2639 * var12;
        }
        if (var5 + var8 > class146.field2636) {
            var8 -= var5 + var8 - class146.field2636;
        }
        if (var4 < class146.field2641) {
            int var13 = class146.field2641 - var4;
            var9 -= var13;
            var4 = class146.field2641;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class146.field2634) {
            int var14 = var4 + var9 - class146.field2634;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1248(class146.field2637, this.field2891, this.field2890, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 551)
    public class158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1036 = arg0;
        this.field1033 = arg1;
        this.field1034 = arg2;
        this.field1028 = arg3;
        this.field1041 = arg4;
        this.field1027 = arg5;
        this.field2891 = arg6;
        this.field2890 = arg7;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(III)V", line = 563)
    public class158(int arg0, int arg1, int arg2) {
        this.field1036 = this.field1041 = arg0;
        this.field1033 = this.field1027 = arg1;
        this.field1034 = this.field1028 = 0;
        this.field2891 = new byte[arg0 * arg1];
        this.field2890 = new int[arg2];
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 576)
    private static final void method1248(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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
}
