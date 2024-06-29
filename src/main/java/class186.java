import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class186 extends class212 {

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "[B")
    public byte[] field3139;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[I")
    private int[] field3138;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V", line = 4)
    public final void method1276() {
        int var1 = 0;
        int var2 = this.field3139.length - 7;
        while (var1 < var2) {
            this.field3139[var1++] = 0;
            this.field3139[var1++] = 0;
            this.field3139[var1++] = 0;
            this.field3139[var1++] = 0;
            this.field3139[var1++] = 0;
            this.field3139[var1++] = 0;
            this.field3139[var1++] = 0;
            this.field3139[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field3139[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V", line = 34)
    public final void method1277(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3138.length; var4++) {
            int var5 = this.field3138[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3138[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3138[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3138[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()V", line = 73)
    public final void method1278() {
        if (this.field3715 == this.field3711 && this.field3721 == this.field3718) {
            return;
        }
        byte[] var1 = new byte[this.field3721 * this.field3715];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3718; var3++) {
            for (int var4 = 0; var4 < this.field3711; var4++) {
                var1[(this.field3709 + var3) * this.field3715 + this.field3720 + var4] = this.field3139[var2++];
            }
        }
        this.field3139 = var1;
        this.field3711 = this.field3715;
        this.field3718 = this.field3721;
        this.field3720 = 0;
        this.field3709 = 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)V", line = 105)
    public final void method1279(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field3711;
        int var6 = this.field3718;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3715;
        int var10 = this.field3721;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3720 > 0) {
            int var13 = ((this.field3720 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3720 << 16);
        }
        if (this.field3709 > 0) {
            int var14 = ((this.field3709 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3709 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class320.field5528 * arg1 + arg0;
        int var16 = class320.field5528 - arg2;
        if (arg1 + arg3 > class320.field5526) {
            arg3 -= arg1 + arg3 - class320.field5526;
        }
        if (arg1 < class320.field5530) {
            int var17 = class320.field5530 - arg1;
            arg3 -= var17;
            var15 += class320.field5528 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class320.field5525) {
            int var18 = arg0 + arg2 - class320.field5525;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class320.field5527) {
            int var19 = class320.field5527 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1286(class320.field5531, this.field3139, this.field3138, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()V", line = 180)
    public final void method1280() {
        byte[] var1 = new byte[this.field3718 * this.field3711];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3711; var3++) {
            for (int var4 = this.field3718 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3139[this.field3711 * var4 + var3];
            }
        }
        this.field3139 = var1;
        int var5 = this.field3709;
        this.field3709 = this.field3720;
        this.field3720 = this.field3721 - this.field3718 - var5;
        int var6 = this.field3718;
        this.field3718 = this.field3711;
        this.field3711 = var6;
        int var7 = this.field3721;
        this.field3721 = this.field3715;
        this.field3715 = var7;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()Lti;", line = 213)
    public final class186 method1281() {
        class186 var1 = new class186(this.field3711, this.field3718, this.field3138.length);
        var1.field3715 = this.field3715;
        var1.field3721 = this.field3721;
        var1.field3720 = this.field3720;
        var1.field3709 = this.field3709;
        int var2 = this.field3139.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field3139[var3] = this.field3139[var3];
        }
        var1.field3138 = this.field3138;
        return var1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 237)
    private static final void method1282(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V", line = 299)
    public final void method1283(int arg0, int arg1, int arg2) {
        int var4 = this.field3720 + arg0;
        int var5 = this.field3709 + arg1;
        int var6 = class320.field5528 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3718;
        int var9 = this.field3711;
        int var10 = class320.field5528 - var9;
        int var11 = 0;
        if (var5 < class320.field5530) {
            int var12 = class320.field5530 - var5;
            var8 -= var12;
            var5 = class320.field5530;
            var7 += var9 * var12;
            var6 += class320.field5528 * var12;
        }
        if (var5 + var8 > class320.field5526) {
            var8 -= var5 + var8 - class320.field5526;
        }
        if (var4 < class320.field5527) {
            int var13 = class320.field5527 - var4;
            var9 -= var13;
            var4 = class320.field5527;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class320.field5525) {
            int var14 = var4 + var9 - class320.field5525;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1285(class320.field5531, this.field3139, this.field3138, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V", line = 354)
    public final void method1284(int arg0, int arg1) {
        int var3 = this.field3720 + arg0;
        int var4 = this.field3709 + arg1;
        int var5 = class320.field5528 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3718;
        int var8 = this.field3711;
        int var9 = class320.field5528 - var8;
        int var10 = 0;
        if (var4 < class320.field5530) {
            int var11 = class320.field5530 - var4;
            var7 -= var11;
            var4 = class320.field5530;
            var6 += var8 * var11;
            var5 += class320.field5528 * var11;
        }
        if (var4 + var7 > class320.field5526) {
            var7 -= var4 + var7 - class320.field5526;
        }
        if (var3 < class320.field5527) {
            int var12 = class320.field5527 - var3;
            var8 -= var12;
            var3 = class320.field5527;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class320.field5525) {
            int var13 = var3 + var8 - class320.field5525;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1282(class320.field5531, this.field3139, this.field3138, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 414)
    private static final void method1285(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 451)
    private static final void method1286(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 484)
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3715 = arg0;
        this.field3721 = arg1;
        this.field3720 = arg2;
        this.field3709 = arg3;
        this.field3711 = arg4;
        this.field3718 = arg5;
        this.field3139 = arg6;
        this.field3138 = arg7;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(III)V", line = 497)
    public class186(int arg0, int arg1, int arg2) {
        this.field3715 = this.field3711 = arg0;
        this.field3721 = this.field3718 = arg1;
        this.field3720 = this.field3709 = 0;
        this.field3139 = new byte[arg0 * arg1];
        this.field3138 = new int[arg2];
    }
}
