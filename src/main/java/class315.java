import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class315 extends class28 {

    @OriginalMember(owner = "client!an", name = "o", descriptor = "[B")
    public byte[] field5355;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "[I")
    private int[] field5354;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(III)V", line = 6)
    public final void method2199(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5354.length; var4++) {
            int var5 = this.field5354[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field5354[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field5354[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field5354[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 55)
    private static final void method2200(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V", line = 90)
    public final void method2201() {
        byte[] var1 = new byte[this.field485 * this.field480];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field480; var3++) {
            for (int var4 = this.field485 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field5355[this.field480 * var4 + var3];
            }
        }
        this.field5355 = var1;
        int var5 = this.field490;
        this.field490 = this.field486;
        this.field486 = this.field488 - this.field485 - var5;
        int var6 = this.field485;
        this.field485 = this.field480;
        this.field480 = var6;
        int var7 = this.field488;
        this.field488 = this.field482;
        this.field482 = var7;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "()Lan;", line = 126)
    public final class315 method2202() {
        class315 var1 = new class315(this.field480, this.field485, this.field5354.length);
        var1.field482 = this.field482;
        var1.field488 = this.field488;
        var1.field486 = this.field486;
        var1.field490 = this.field490;
        int var2 = this.field5355.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field5355[var3] = this.field5355[var3];
        }
        var1.field5354 = this.field5354;
        return var1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)V", line = 150)
    public final void method2203(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field480;
        int var6 = this.field485;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field482;
        int var10 = this.field488;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field486 > 0) {
            int var13 = ((this.field486 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field486 << 16);
        }
        if (this.field490 > 0) {
            int var14 = ((this.field490 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field490 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class181.field3034 * arg1 + arg0;
        int var16 = class181.field3034 - arg2;
        if (arg1 + arg3 > class181.field3041) {
            arg3 -= arg1 + arg3 - class181.field3041;
        }
        if (arg1 < class181.field3036) {
            int var17 = class181.field3036 - arg1;
            arg3 -= var17;
            var15 += class181.field3034 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class181.field3033) {
            int var18 = arg0 + arg2 - class181.field3033;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class181.field3038) {
            int var19 = class181.field3038 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method2205(class181.field3040, this.field5355, this.field5354, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "()V", line = 227)
    public final void method2204() {
        int var1 = 0;
        int var2 = this.field5355.length - 7;
        while (var1 < var2) {
            this.field5355[var1++] = 0;
            this.field5355[var1++] = 0;
            this.field5355[var1++] = 0;
            this.field5355[var1++] = 0;
            this.field5355[var1++] = 0;
            this.field5355[var1++] = 0;
            this.field5355[var1++] = 0;
            this.field5355[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field5355[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 251)
    private static final void method2205(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!an", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 285)
    private static final void method2206(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!an", name = "d", descriptor = "()V", line = 345)
    public final void method2207() {
        if (this.field482 == this.field480 && this.field488 == this.field485) {
            return;
        }
        byte[] var1 = new byte[this.field488 * this.field482];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field485; var3++) {
            for (int var4 = 0; var4 < this.field480; var4++) {
                var1[(this.field490 + var3) * this.field482 + this.field486 + var4] = this.field5355[var2++];
            }
        }
        this.field5355 = var1;
        this.field480 = this.field482;
        this.field485 = this.field488;
        this.field486 = 0;
        this.field490 = 0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V", line = 378)
    public final void method180(int arg0, int arg1) {
        int var3 = this.field486 + arg0;
        int var4 = this.field490 + arg1;
        int var5 = class181.field3034 * var4 + var3;
        int var6 = 0;
        int var7 = this.field485;
        int var8 = this.field480;
        int var9 = class181.field3034 - var8;
        int var10 = 0;
        if (var4 < class181.field3036) {
            int var11 = class181.field3036 - var4;
            var7 -= var11;
            var4 = class181.field3036;
            var6 += var8 * var11;
            var5 += class181.field3034 * var11;
        }
        if (var4 + var7 > class181.field3041) {
            var7 -= var4 + var7 - class181.field3041;
        }
        if (var3 < class181.field3038) {
            int var12 = class181.field3038 - var3;
            var8 -= var12;
            var3 = class181.field3038;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class181.field3033) {
            int var13 = var3 + var8 - class181.field3033;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method2206(class181.field3040, this.field5355, this.field5354, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 433)
    public class315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field482 = arg0;
        this.field488 = arg1;
        this.field486 = arg2;
        this.field490 = arg3;
        this.field480 = arg4;
        this.field485 = arg5;
        this.field5355 = arg6;
        this.field5354 = arg7;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V", line = 444)
    public final void method179(int arg0, int arg1, int arg2) {
        int var4 = this.field486 + arg0;
        int var5 = this.field490 + arg1;
        int var6 = class181.field3034 * var5 + var4;
        int var7 = 0;
        int var8 = this.field485;
        int var9 = this.field480;
        int var10 = class181.field3034 - var9;
        int var11 = 0;
        if (var5 < class181.field3036) {
            int var12 = class181.field3036 - var5;
            var8 -= var12;
            var5 = class181.field3036;
            var7 += var9 * var12;
            var6 += class181.field3034 * var12;
        }
        if (var5 + var8 > class181.field3041) {
            var8 -= var5 + var8 - class181.field3041;
        }
        if (var4 < class181.field3038) {
            int var13 = class181.field3038 - var4;
            var9 -= var13;
            var4 = class181.field3038;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class181.field3033) {
            int var14 = var4 + var9 - class181.field3033;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method2200(class181.field3040, this.field5355, this.field5354, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(III)V", line = 499)
    public class315(int arg0, int arg1, int arg2) {
        this.field482 = this.field480 = arg0;
        this.field488 = this.field485 = arg1;
        this.field486 = this.field490 = 0;
        this.field5355 = new byte[arg0 * arg1];
        this.field5354 = new int[arg2];
    }
}
