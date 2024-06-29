import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class179 extends class267 {

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "[B")
    public byte[] field3203;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "[I")
    private int[] field3204;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
    public final void method1278(int arg0, int arg1) {
        int var3 = super.field4621 + arg0;
        int var4 = super.field4620 + arg1;
        int var5 = class262.field4561 * var4 + var3;
        int var6 = 0;
        int var7 = super.field4622;
        int var8 = super.field4628;
        int var9 = class262.field4561 - var8;
        int var10 = 0;
        if (var4 < class262.field4562) {
            int var11 = class262.field4562 - var4;
            var7 -= var11;
            var4 = class262.field4562;
            var6 += var8 * var11;
            var5 += class262.field4561 * var11;
        }
        if (var4 + var7 > class262.field4565) {
            var7 -= var4 + var7 - class262.field4565;
        }
        if (var3 < class262.field4559) {
            int var12 = class262.field4559 - var3;
            var8 -= var12;
            var3 = class262.field4559;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class262.field4563) {
            int var13 = var3 + var8 - class262.field4563;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1284(class262.field4564, this.field3203, this.field3204, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V")
    public final void method1279(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field4628;
        int var6 = super.field4622;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field4619;
        int var10 = super.field4613;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field4621 > 0) {
            int var13 = ((super.field4621 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field4621 << 16);
        }
        if (super.field4620 > 0) {
            int var14 = ((super.field4620 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field4620 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class262.field4561 * arg1 + arg0;
        int var16 = class262.field4561 - arg2;
        if (arg1 + arg3 > class262.field4565) {
            arg3 -= arg1 + arg3 - class262.field4565;
        }
        if (arg1 < class262.field4562) {
            int var17 = class262.field4562 - arg1;
            arg3 -= var17;
            var15 += class262.field4561 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class262.field4563) {
            int var18 = arg0 + arg2 - class262.field4563;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class262.field4559) {
            int var19 = class262.field4559 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1287(class262.field4564, this.field3203, this.field3204, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V")
    public final void method1280() {
        byte[] var1 = new byte[super.field4628 * super.field4622];
        int var2 = 0;
        for (int var3 = 0; var3 < super.field4628; ++var3) {
            for (int var7 = super.field4622 - 1; var7 >= 0; --var7) {
                var1[var2++] = this.field3203[super.field4628 * var7 + var3];
            }
        }
        this.field3203 = var1;
        int var4 = super.field4620;
        super.field4620 = super.field4621;
        super.field4621 = super.field4613 - super.field4622 - var4;
        int var5 = super.field4622;
        super.field4622 = super.field4628;
        super.field4628 = var5;
        int var6 = super.field4613;
        super.field4613 = super.field4619;
        super.field4619 = var6;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()Lrk;")
    public final class179 method1281() {
        class179 var1 = new class179(super.field4628, super.field4622, this.field3204.length);
        var1.field4619 = super.field4619;
        var1.field4613 = super.field4613;
        var1.field4621 = super.field4621;
        var1.field4620 = super.field4620;
        int var2 = this.field3203.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            var1.field3203[var3] = this.field3203[var3];
        }
        var1.field3204 = this.field3204;
        return var1;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()V")
    public final void method1282() {
        if (super.field4628 != super.field4619 || super.field4622 != super.field4613) {
            byte[] var1 = new byte[super.field4619 * super.field4613];
            int var2 = 0;
            for (int var3 = 0; var3 < super.field4622; ++var3) {
                for (int var4 = 0; var4 < super.field4628; ++var4) {
                    var1[(super.field4620 + var3) * super.field4619 + super.field4621 + var4] = this.field3203[var2++];
                }
            }
            this.field3203 = var1;
            super.field4628 = super.field4619;
            super.field4622 = super.field4613;
            super.field4621 = 0;
            super.field4620 = 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)V")
    public final void method1283(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3204.length; ++var4) {
            int var5 = this.field3204[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3204[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3204[var4] & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3204[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1284(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 3);
        for (int var12 = -arg7; var12 < 0; ++var12) {
            for (int var13 = var10; var13 < 0; ++var13) {
                byte var16 = arg1[arg4++];
                if (var16 != 0) {
                    arg0[arg5++] = arg2[var16 & 255];
                } else {
                    ++arg5;
                }
                byte var17 = arg1[arg4++];
                if (var17 != 0) {
                    arg0[arg5++] = arg2[var17 & 255];
                } else {
                    ++arg5;
                }
                byte var18 = arg1[arg4++];
                if (var18 != 0) {
                    arg0[arg5++] = arg2[var18 & 255];
                } else {
                    ++arg5;
                }
                byte var19 = arg1[arg4++];
                if (var19 != 0) {
                    arg0[arg5++] = arg2[var19 & 255];
                } else {
                    ++arg5;
                }
            }
            for (int var14 = var11; var14 < 0; ++var14) {
                byte var15 = arg1[arg4++];
                if (var15 != 0) {
                    arg0[arg5++] = arg2[var15 & 255];
                } else {
                    ++arg5;
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1285(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; ++var11) {
            for (int var12 = -arg5; var12 < 0; ++var12) {
                byte var13 = arg1[arg3++];
                if (var13 != 0) {
                    int var14 = arg2[var13 & 255];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 16711935) * arg9 + (var15 & 16711935) * var10 & -16711936) + ((var14 & 65280) * arg9 + (var15 & 65280) * var10 & 16711680) >> 8;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public final void method1286(int arg0, int arg1, int arg2) {
        int var4 = super.field4621 + arg0;
        int var5 = super.field4620 + arg1;
        int var6 = class262.field4561 * var5 + var4;
        int var7 = 0;
        int var8 = super.field4622;
        int var9 = super.field4628;
        int var10 = class262.field4561 - var9;
        int var11 = 0;
        if (var5 < class262.field4562) {
            int var12 = class262.field4562 - var5;
            var8 -= var12;
            var5 = class262.field4562;
            var7 += var9 * var12;
            var6 += class262.field4561 * var12;
        }
        if (var5 + var8 > class262.field4565) {
            var8 -= var5 + var8 - class262.field4565;
        }
        if (var4 < class262.field4559) {
            int var13 = class262.field4559 - var4;
            var9 -= var13;
            var4 = class262.field4559;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class262.field4563) {
            int var14 = var4 + var9 - class262.field4563;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1285(class262.field4564, this.field3203, this.field3204, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIII[B[I)V")
    public class179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field4619 = arg0;
        super.field4613 = arg1;
        super.field4621 = arg2;
        super.field4620 = arg3;
        super.field4628 = arg4;
        super.field4622 = arg5;
        this.field3203 = arg6;
        this.field3204 = arg7;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method1287(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; ++var13) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; ++var15) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 != 0) {
                    arg0[arg5++] = arg2[var16 & 255];
                } else {
                    ++arg5;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(III)V")
    private class179(int arg0, int arg1, int arg2) {
        super.field4619 = super.field4628 = arg0;
        super.field4613 = super.field4622 = arg1;
        super.field4621 = super.field4620 = 0;
        this.field3203 = new byte[arg0 * arg1];
        this.field3204 = new int[arg2];
    }
}
