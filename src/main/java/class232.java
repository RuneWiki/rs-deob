import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class232 extends class290 {

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[B")
    public byte[] field3980;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "[I")
    private int[] field3979;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V", line = 4)
    public final void method1569() {
        byte[] var1 = new byte[this.field5015 * this.field5009];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5015; var3++) {
            for (int var4 = this.field5009 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3980[this.field5015 * var4 + var3];
            }
        }
        this.field3980 = var1;
        int var5 = this.field5014;
        this.field5014 = this.field5026;
        this.field5026 = this.field5008 - this.field5009 - var5;
        int var6 = this.field5009;
        this.field5009 = this.field5015;
        this.field5015 = var6;
        int var7 = this.field5008;
        this.field5008 = this.field5018;
        this.field5018 = var7;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()Lel;", line = 39)
    public final class232 method1570() {
        class232 var1 = new class232(this.field5015, this.field5009, this.field3979.length);
        var1.field5018 = this.field5018;
        var1.field5008 = this.field5008;
        var1.field5026 = this.field5026;
        var1.field5014 = this.field5014;
        int var2 = this.field3980.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field3980[var3] = this.field3980[var3];
        }
        var1.field3979 = this.field3979;
        return var1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V", line = 58)
    public final void method12(int arg0, int arg1) {
        int var3 = this.field5026 + arg0;
        int var4 = this.field5014 + arg1;
        int var5 = class178.field3140 * var4 + var3;
        int var6 = 0;
        int var7 = this.field5009;
        int var8 = this.field5015;
        int var9 = class178.field3140 - var8;
        int var10 = 0;
        if (var4 < class178.field3142) {
            int var11 = class178.field3142 - var4;
            var7 -= var11;
            var4 = class178.field3142;
            var6 += var8 * var11;
            var5 += class178.field3140 * var11;
        }
        if (var4 + var7 > class178.field3143) {
            var7 -= var4 + var7 - class178.field3143;
        }
        if (var3 < class178.field3141) {
            int var12 = class178.field3141 - var3;
            var8 -= var12;
            var3 = class178.field3141;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class178.field3147) {
            int var13 = var3 + var8 - class178.field3147;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1572(class178.field3146, this.field3980, this.field3979, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)V", line = 115)
    public final void method1571(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field5015;
        int var6 = this.field5009;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field5018;
        int var10 = this.field5008;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field5026 > 0) {
            int var13 = ((this.field5026 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field5026 << 16);
        }
        if (this.field5014 > 0) {
            int var14 = ((this.field5014 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field5014 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class178.field3140 * arg1 + arg0;
        int var16 = class178.field3140 - arg2;
        if (arg1 + arg3 > class178.field3143) {
            arg3 -= arg1 + arg3 - class178.field3143;
        }
        if (arg1 < class178.field3142) {
            int var17 = class178.field3142 - arg1;
            arg3 -= var17;
            var15 += class178.field3140 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class178.field3147) {
            int var18 = arg0 + arg2 - class178.field3147;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class178.field3141) {
            int var19 = class178.field3141 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1573(class178.field3146, this.field3980, this.field3979, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 190)
    private static final void method1572(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 256)
    private static final void method1573(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()V", line = 296)
    public final void method1574() {
        int var1 = 0;
        int var2 = this.field3980.length - 7;
        while (var1 < var2) {
            this.field3980[var1++] = 0;
            this.field3980[var1++] = 0;
            this.field3980[var1++] = 0;
            this.field3980[var1++] = 0;
            this.field3980[var1++] = 0;
            this.field3980[var1++] = 0;
            this.field3980[var1++] = 0;
            this.field3980[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field3980[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()V", line = 319)
    public final void method1575() {
        if (this.field5018 == this.field5015 && this.field5009 == this.field5008) {
            return;
        }
        byte[] var1 = new byte[this.field5018 * this.field5008];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5009; var3++) {
            for (int var4 = 0; var4 < this.field5015; var4++) {
                var1[(this.field5014 + var3) * this.field5018 + this.field5026 + var4] = this.field3980[var2++];
            }
        }
        this.field3980 = var1;
        this.field5015 = this.field5018;
        this.field5009 = this.field5008;
        this.field5026 = 0;
        this.field5014 = 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 353)
    public final void method15(int arg0, int arg1, int arg2) {
        int var4 = this.field5026 + arg0;
        int var5 = this.field5014 + arg1;
        int var6 = class178.field3140 * var5 + var4;
        int var7 = 0;
        int var8 = this.field5009;
        int var9 = this.field5015;
        int var10 = class178.field3140 - var9;
        int var11 = 0;
        if (var5 < class178.field3142) {
            int var12 = class178.field3142 - var5;
            var8 -= var12;
            var5 = class178.field3142;
            var7 += var9 * var12;
            var6 += class178.field3140 * var12;
        }
        if (var5 + var8 > class178.field3143) {
            var8 -= var5 + var8 - class178.field3143;
        }
        if (var4 < class178.field3141) {
            int var13 = class178.field3141 - var4;
            var9 -= var13;
            var4 = class178.field3141;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class178.field3147) {
            int var14 = var4 + var9 - class178.field3147;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1576(class178.field3146, this.field3980, this.field3979, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 408)
    private static final void method1576(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 446)
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field5018 = arg0;
        this.field5008 = arg1;
        this.field5026 = arg2;
        this.field5014 = arg3;
        this.field5015 = arg4;
        this.field5009 = arg5;
        this.field3980 = arg6;
        this.field3979 = arg7;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V", line = 461)
    public final void method1577(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3979.length; var4++) {
            int var5 = this.field3979[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3979[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3979[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3979[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(III)V", line = 500)
    public class232(int arg0, int arg1, int arg2) {
        this.field5018 = this.field5015 = arg0;
        this.field5008 = this.field5009 = arg1;
        this.field5026 = this.field5014 = 0;
        this.field3980 = new byte[arg0 * arg1];
        this.field3979 = new int[arg2];
    }
}
