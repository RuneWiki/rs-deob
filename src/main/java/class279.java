import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class279 extends class314 {

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "[B")
    public byte[] field4561;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "[I")
    private int[] field4562;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V", line = 4)
    public final void method43(int arg0, int arg1, int arg2) {
        int var4 = this.field5304 + arg0;
        int var5 = this.field5290 + arg1;
        int var6 = class54.field798 * var5 + var4;
        int var7 = 0;
        int var8 = this.field5300;
        int var9 = this.field5306;
        int var10 = class54.field798 - var9;
        int var11 = 0;
        if (var5 < class54.field800) {
            int var12 = class54.field800 - var5;
            var8 -= var12;
            var5 = class54.field800;
            var7 += var9 * var12;
            var6 += class54.field798 * var12;
        }
        if (var5 + var8 > class54.field799) {
            var8 -= var5 + var8 - class54.field799;
        }
        if (var4 < class54.field795) {
            int var13 = class54.field795 - var4;
            var9 -= var13;
            var4 = class54.field795;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class54.field802) {
            int var14 = var4 + var9 - class54.field802;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1973(class54.field801, this.field4561, this.field4562, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)V", line = 60)
    public final void method1968(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4562.length; var4++) {
            int var5 = this.field4562[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field4562[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field4562[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field4562[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 104)
    private static final void method1969(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V", line = 165)
    public final void method1970() {
        int var1 = 0;
        int var2 = this.field4561.length - 7;
        while (var1 < var2) {
            this.field4561[var1++] = 0;
            this.field4561[var1++] = 0;
            this.field4561[var1++] = 0;
            this.field4561[var1++] = 0;
            this.field4561[var1++] = 0;
            this.field4561[var1++] = 0;
            this.field4561[var1++] = 0;
            this.field4561[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field4561[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V", line = 189)
    public final void method1971(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field5306;
        int var6 = this.field5300;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field5292;
        int var10 = this.field5291;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field5304 > 0) {
            int var13 = ((this.field5304 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field5304 << 16);
        }
        if (this.field5290 > 0) {
            int var14 = ((this.field5290 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field5290 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class54.field798 * arg1 + arg0;
        int var16 = class54.field798 - arg2;
        if (arg1 + arg3 > class54.field799) {
            arg3 -= arg1 + arg3 - class54.field799;
        }
        if (arg1 < class54.field800) {
            int var17 = class54.field800 - arg1;
            arg3 -= var17;
            var15 += class54.field798 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class54.field802) {
            int var18 = arg0 + arg2 - class54.field802;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class54.field795) {
            int var19 = class54.field795 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1972(class54.field801, this.field4561, this.field4562, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V", line = 263)
    public final void method44(int arg0, int arg1) {
        int var3 = this.field5304 + arg0;
        int var4 = this.field5290 + arg1;
        int var5 = class54.field798 * var4 + var3;
        int var6 = 0;
        int var7 = this.field5300;
        int var8 = this.field5306;
        int var9 = class54.field798 - var8;
        int var10 = 0;
        if (var4 < class54.field800) {
            int var11 = class54.field800 - var4;
            var7 -= var11;
            var4 = class54.field800;
            var6 += var8 * var11;
            var5 += class54.field798 * var11;
        }
        if (var4 + var7 > class54.field799) {
            var7 -= var4 + var7 - class54.field799;
        }
        if (var3 < class54.field795) {
            int var12 = class54.field795 - var3;
            var8 -= var12;
            var3 = class54.field795;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class54.field802) {
            int var13 = var3 + var8 - class54.field802;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1969(class54.field801, this.field4561, this.field4562, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 319)
    private static final void method1972(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 352)
    private static final void method1973(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V", line = 388)
    public final void method1974() {
        if (this.field5306 == this.field5292 && this.field5300 == this.field5291) {
            return;
        }
        byte[] var1 = new byte[this.field5292 * this.field5291];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5300; var3++) {
            for (int var4 = 0; var4 < this.field5306; var4++) {
                var1[(this.field5290 + var3) * this.field5292 + this.field5304 + var4] = this.field4561[var2++];
            }
        }
        this.field4561 = var1;
        this.field5306 = this.field5292;
        this.field5300 = this.field5291;
        this.field5304 = 0;
        this.field5290 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V", line = 427)
    public final void method1975() {
        byte[] var1 = new byte[this.field5306 * this.field5300];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5306; var3++) {
            for (int var4 = this.field5300 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field4561[this.field5306 * var4 + var3];
            }
        }
        this.field4561 = var1;
        int var5 = this.field5290;
        this.field5290 = this.field5304;
        this.field5304 = this.field5291 - this.field5300 - var5;
        int var6 = this.field5300;
        this.field5300 = this.field5306;
        this.field5306 = var6;
        int var7 = this.field5291;
        this.field5291 = this.field5292;
        this.field5292 = var7;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()Lka;", line = 460)
    public final class279 method1976() {
        class279 var1 = new class279(this.field5306, this.field5300, this.field4562.length);
        var1.field5292 = this.field5292;
        var1.field5291 = this.field5291;
        var1.field5304 = this.field5304;
        var1.field5290 = this.field5290;
        int var2 = this.field4561.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field4561[var3] = this.field4561[var3];
        }
        var1.field4562 = this.field4562;
        return var1;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 478)
    public class279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field5292 = arg0;
        this.field5291 = arg1;
        this.field5304 = arg2;
        this.field5290 = arg3;
        this.field5306 = arg4;
        this.field5300 = arg5;
        this.field4561 = arg6;
        this.field4562 = arg7;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(III)V", line = 490)
    public class279(int arg0, int arg1, int arg2) {
        this.field5292 = this.field5306 = arg0;
        this.field5291 = this.field5300 = arg1;
        this.field5304 = this.field5290 = 0;
        this.field4561 = new byte[arg0 * arg1];
        this.field4562 = new int[arg2];
    }
}
