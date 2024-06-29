import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class114 extends class249 {

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[B")
    public byte[] field1976;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    private int[] field1977;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 4)
    public final void method586(int arg0, int arg1, int arg2) {
        int var4 = this.field4122 + arg0;
        int var5 = this.field4119 + arg1;
        int var6 = class115.field1986 * var5 + var4;
        int var7 = 0;
        int var8 = this.field4128;
        int var9 = this.field4116;
        int var10 = class115.field1986 - var9;
        int var11 = 0;
        if (var5 < class115.field1982) {
            int var12 = class115.field1982 - var5;
            var8 -= var12;
            var5 = class115.field1982;
            var7 += var9 * var12;
            var6 += class115.field1986 * var12;
        }
        if (var5 + var8 > class115.field1984) {
            var8 -= var5 + var8 - class115.field1984;
        }
        if (var4 < class115.field1980) {
            int var13 = class115.field1980 - var4;
            var9 -= var13;
            var4 = class115.field1980;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class115.field1979) {
            int var14 = var4 + var9 - class115.field1979;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method856(class115.field1978, this.field1976, this.field1977, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V", line = 61)
    public final void method850(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field4116;
        int var6 = this.field4128;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4114;
        int var10 = this.field4124;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4122 > 0) {
            int var13 = ((this.field4122 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4122 << 16);
        }
        if (this.field4119 > 0) {
            int var14 = ((this.field4119 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4119 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class115.field1986 * arg1 + arg0;
        int var16 = class115.field1986 - arg2;
        if (arg1 + arg3 > class115.field1984) {
            arg3 -= arg1 + arg3 - class115.field1984;
        }
        if (arg1 < class115.field1982) {
            int var17 = class115.field1982 - arg1;
            arg3 -= var17;
            var15 += class115.field1986 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class115.field1979) {
            int var18 = arg0 + arg2 - class115.field1979;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class115.field1980) {
            int var19 = class115.field1980 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method855(class115.field1978, this.field1976, this.field1977, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V", line = 137)
    public final void method851() {
        int var1 = 0;
        int var2 = this.field1976.length - 7;
        while (var1 < var2) {
            this.field1976[var1++] = 0;
            this.field1976[var1++] = 0;
            this.field1976[var1++] = 0;
            this.field1976[var1++] = 0;
            this.field1976[var1++] = 0;
            this.field1976[var1++] = 0;
            this.field1976[var1++] = 0;
            this.field1976[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field1976[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Lda;", line = 160)
    public final class114 method852() {
        class114 var1 = new class114(this.field4116, this.field4128, this.field1977.length);
        var1.field4114 = this.field4114;
        var1.field4124 = this.field4124;
        var1.field4122 = this.field4122;
        var1.field4119 = this.field4119;
        int var2 = this.field1976.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field1976[var3] = this.field1976[var3];
        }
        var1.field1977 = this.field1977;
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 183)
    private static final void method853(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V", line = 247)
    public final void method854() {
        if (this.field4116 == this.field4114 && this.field4128 == this.field4124) {
            return;
        }
        byte[] var1 = new byte[this.field4124 * this.field4114];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4128; var3++) {
            for (int var4 = 0; var4 < this.field4116; var4++) {
                var1[(this.field4119 + var3) * this.field4114 + this.field4122 + var4] = this.field1976[var2++];
            }
        }
        this.field1976 = var1;
        this.field4116 = this.field4114;
        this.field4128 = this.field4124;
        this.field4122 = 0;
        this.field4119 = 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 288)
    private static final void method855(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!da", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 326)
    private static final void method856(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V", line = 361)
    public final void method857() {
        byte[] var1 = new byte[this.field4128 * this.field4116];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4116; var3++) {
            for (int var4 = this.field4128 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1976[this.field4116 * var4 + var3];
            }
        }
        this.field1976 = var1;
        int var5 = this.field4119;
        this.field4119 = this.field4122;
        this.field4122 = this.field4124 - this.field4128 - var5;
        int var6 = this.field4128;
        this.field4128 = this.field4116;
        this.field4116 = var6;
        int var7 = this.field4124;
        this.field4124 = this.field4114;
        this.field4114 = var7;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(III)V", line = 394)
    public final void method858(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1977.length; var4++) {
            int var5 = this.field1977[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1977[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1977[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1977[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 433)
    public final void method587(int arg0, int arg1) {
        int var3 = this.field4122 + arg0;
        int var4 = this.field4119 + arg1;
        int var5 = class115.field1986 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4128;
        int var8 = this.field4116;
        int var9 = class115.field1986 - var8;
        int var10 = 0;
        if (var4 < class115.field1982) {
            int var11 = class115.field1982 - var4;
            var7 -= var11;
            var4 = class115.field1982;
            var6 += var8 * var11;
            var5 += class115.field1986 * var11;
        }
        if (var4 + var7 > class115.field1984) {
            var7 -= var4 + var7 - class115.field1984;
        }
        if (var3 < class115.field1980) {
            int var12 = class115.field1980 - var3;
            var8 -= var12;
            var3 = class115.field1980;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class115.field1979) {
            int var13 = var3 + var8 - class115.field1979;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method853(class115.field1978, this.field1976, this.field1977, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 486)
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4114 = arg0;
        this.field4124 = arg1;
        this.field4122 = arg2;
        this.field4119 = arg3;
        this.field4116 = arg4;
        this.field4128 = arg5;
        this.field1976 = arg6;
        this.field1977 = arg7;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(III)V", line = 497)
    public class114(int arg0, int arg1, int arg2) {
        this.field4114 = this.field4116 = arg0;
        this.field4124 = this.field4128 = arg1;
        this.field4122 = this.field4119 = 0;
        this.field1976 = new byte[arg0 * arg1];
        this.field1977 = new int[arg2];
    }
}
