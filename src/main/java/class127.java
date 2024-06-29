import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class127 extends class152 {

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "[B")
    public byte[] field2163;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "[I")
    private int[] field2164;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 3)
    public final void method448(int arg0, int arg1) {
        int var3 = this.field2626 + arg0;
        int var4 = this.field2615 + arg1;
        int var5 = class213.field3772 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2610;
        int var8 = this.field2625;
        int var9 = class213.field3772 - var8;
        int var10 = 0;
        if (var4 < class213.field3768) {
            int var11 = class213.field3768 - var4;
            var7 -= var11;
            var4 = class213.field3768;
            var6 += var8 * var11;
            var5 += class213.field3772 * var11;
        }
        if (var4 + var7 > class213.field3774) {
            var7 -= var4 + var7 - class213.field3774;
        }
        if (var3 < class213.field3767) {
            int var12 = class213.field3767 - var3;
            var8 -= var12;
            var3 = class213.field3767;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class213.field3770) {
            int var13 = var3 + var8 - class213.field3770;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method811(class213.field3769, this.field2163, this.field2164, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()Lvd;", line = 62)
    public final class127 method807() {
        class127 var1 = new class127(this.field2625, this.field2610, this.field2164.length);
        var1.field2619 = this.field2619;
        var1.field2611 = this.field2611;
        var1.field2626 = this.field2626;
        var1.field2615 = this.field2615;
        int var2 = this.field2163.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2163[var3] = this.field2163[var3];
        }
        var1.field2164 = this.field2164;
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V", line = 80)
    public final void method808() {
        if (this.field2625 == this.field2619 && this.field2611 == this.field2610) {
            return;
        }
        byte[] var1 = new byte[this.field2619 * this.field2611];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2610; var3++) {
            for (int var4 = 0; var4 < this.field2625; var4++) {
                var1[(this.field2615 + var3) * this.field2619 + this.field2626 + var4] = this.field2163[var2++];
            }
        }
        this.field2163 = var1;
        this.field2625 = this.field2619;
        this.field2610 = this.field2611;
        this.field2626 = 0;
        this.field2615 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)V", line = 119)
    public final void method809(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field2625;
        int var6 = this.field2610;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2619;
        int var10 = this.field2611;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2626 > 0) {
            int var13 = ((this.field2626 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2626 << 16);
        }
        if (this.field2615 > 0) {
            int var14 = ((this.field2615 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2615 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class213.field3772 * arg1 + arg0;
        int var16 = class213.field3772 - arg2;
        if (arg1 + arg3 > class213.field3774) {
            arg3 -= arg1 + arg3 - class213.field3774;
        }
        if (arg1 < class213.field3768) {
            int var17 = class213.field3768 - arg1;
            arg3 -= var17;
            var15 += class213.field3772 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class213.field3770) {
            int var18 = arg0 + arg2 - class213.field3770;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class213.field3767) {
            int var19 = class213.field3767 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method810(class213.field3769, this.field2163, this.field2164, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 196)
    private static final void method810(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 229)
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2619 = arg0;
        this.field2611 = arg1;
        this.field2626 = arg2;
        this.field2615 = arg3;
        this.field2625 = arg4;
        this.field2610 = arg5;
        this.field2163 = arg6;
        this.field2164 = arg7;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 248)
    private static final void method811(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V", line = 309)
    public final void method812() {
        int var1 = 0;
        int var2 = this.field2163.length - 7;
        while (var1 < var2) {
            this.field2163[var1++] = 0;
            this.field2163[var1++] = 0;
            this.field2163[var1++] = 0;
            this.field2163[var1++] = 0;
            this.field2163[var1++] = 0;
            this.field2163[var1++] = 0;
            this.field2163[var1++] = 0;
            this.field2163[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field2163[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V", line = 333)
    public final void method813(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2164.length; var4++) {
            int var5 = this.field2164[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2164[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2164[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2164[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 374)
    private static final void method814(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V", line = 411)
    public final void method815() {
        byte[] var1 = new byte[this.field2625 * this.field2610];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2625; var3++) {
            for (int var4 = this.field2610 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2163[this.field2625 * var4 + var3];
            }
        }
        this.field2163 = var1;
        int var5 = this.field2615;
        this.field2615 = this.field2626;
        this.field2626 = this.field2611 - this.field2610 - var5;
        int var6 = this.field2610;
        this.field2610 = this.field2625;
        this.field2625 = var6;
        int var7 = this.field2611;
        this.field2611 = this.field2619;
        this.field2619 = var7;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(III)V", line = 442)
    public class127(int arg0, int arg1, int arg2) {
        this.field2619 = this.field2625 = arg0;
        this.field2611 = this.field2610 = arg1;
        this.field2626 = this.field2615 = 0;
        this.field2163 = new byte[arg0 * arg1];
        this.field2164 = new int[arg2];
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V", line = 451)
    public final void method450(int arg0, int arg1, int arg2) {
        int var4 = this.field2626 + arg0;
        int var5 = this.field2615 + arg1;
        int var6 = class213.field3772 * var5 + var4;
        int var7 = 0;
        int var8 = this.field2610;
        int var9 = this.field2625;
        int var10 = class213.field3772 - var9;
        int var11 = 0;
        if (var5 < class213.field3768) {
            int var12 = class213.field3768 - var5;
            var8 -= var12;
            var5 = class213.field3768;
            var7 += var9 * var12;
            var6 += class213.field3772 * var12;
        }
        if (var5 + var8 > class213.field3774) {
            var8 -= var5 + var8 - class213.field3774;
        }
        if (var4 < class213.field3767) {
            int var13 = class213.field3767 - var4;
            var9 -= var13;
            var4 = class213.field3767;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class213.field3770) {
            int var14 = var4 + var9 - class213.field3770;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method814(class213.field3769, this.field2163, this.field2164, var7, var6, var9, var8, var10, var11, arg2);
        }
    }
}
