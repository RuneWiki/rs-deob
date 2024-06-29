import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class158 extends class156 {

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "[B")
    public byte[] field2603;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[I")
    private int[] field2602;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public final void method1122() {
        byte[] var1 = new byte[super.field2583 * super.field2577];
        int var2 = 0;
        for (int var3 = 0; var3 < super.field2583; ++var3) {
            for (int var7 = super.field2577 - 1; var7 >= 0; --var7) {
                var1[var2++] = this.field2603[super.field2583 * var7 + var3];
            }
        }
        this.field2603 = var1;
        int var4 = super.field2585;
        super.field2585 = super.field2574;
        super.field2574 = super.field2572 - super.field2577 - var4;
        int var5 = super.field2577;
        super.field2577 = super.field2583;
        super.field2583 = var5;
        int var6 = super.field2572;
        super.field2572 = super.field2566;
        super.field2566 = var6;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
    public final void method1123(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2602.length; ++var4) {
            int var5 = this.field2602[var4] >> 16 & 255;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2602[var4] >> 8 & 255;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2602[var4] & 255;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2602[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method1124(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()Ljg;")
    public final class158 method1125() {
        class158 var1 = new class158(super.field2583, super.field2577, this.field2602.length);
        var1.field2566 = super.field2566;
        var1.field2572 = super.field2572;
        var1.field2574 = super.field2574;
        var1.field2585 = super.field2585;
        int var2 = this.field2603.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            var1.field2603[var3] = this.field2603[var3];
        }
        var1.field2602 = this.field2602;
        return var1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1126(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public final void method1110(int arg0, int arg1) {
        int var3 = super.field2574 + arg0;
        int var4 = super.field2585 + arg1;
        int var5 = class59.field960 * var4 + var3;
        int var6 = 0;
        int var7 = super.field2577;
        int var8 = super.field2583;
        int var9 = class59.field960 - var8;
        int var10 = 0;
        if (var4 < class59.field964) {
            int var11 = class59.field964 - var4;
            var7 -= var11;
            var4 = class59.field964;
            var6 += var8 * var11;
            var5 += class59.field960 * var11;
        }
        if (var4 + var7 > class59.field961) {
            var7 -= var4 + var7 - class59.field961;
        }
        if (var3 < class59.field958) {
            int var12 = class59.field958 - var3;
            var8 -= var12;
            var3 = class59.field958;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class59.field956) {
            int var13 = var3 + var8 - class59.field956;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1126(class59.field957, this.field2603, this.field2602, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1127(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
    public final void method1116(int arg0, int arg1, int arg2) {
        int var4 = super.field2574 + arg0;
        int var5 = super.field2585 + arg1;
        int var6 = class59.field960 * var5 + var4;
        int var7 = 0;
        int var8 = super.field2577;
        int var9 = super.field2583;
        int var10 = class59.field960 - var9;
        int var11 = 0;
        if (var5 < class59.field964) {
            int var12 = class59.field964 - var5;
            var8 -= var12;
            var5 = class59.field964;
            var7 += var9 * var12;
            var6 += class59.field960 * var12;
        }
        if (var5 + var8 > class59.field961) {
            var8 -= var5 + var8 - class59.field961;
        }
        if (var4 < class59.field958) {
            int var13 = class59.field958 - var4;
            var9 -= var13;
            var4 = class59.field958;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class59.field956) {
            int var14 = var4 + var9 - class59.field956;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1127(class59.field957, this.field2603, this.field2602, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
    public final void method1128(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field2583;
        int var6 = super.field2577;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field2566;
        int var10 = super.field2572;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field2574 > 0) {
            int var13 = ((super.field2574 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field2574 << 16);
        }
        if (super.field2585 > 0) {
            int var14 = ((super.field2585 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field2585 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class59.field960 * arg1 + arg0;
        int var16 = class59.field960 - arg2;
        if (arg1 + arg3 > class59.field961) {
            arg3 -= arg1 + arg3 - class59.field961;
        }
        if (arg1 < class59.field964) {
            int var17 = class59.field964 - arg1;
            arg3 -= var17;
            var15 += class59.field960 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class59.field956) {
            int var18 = arg0 + arg2 - class59.field956;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class59.field958) {
            int var19 = class59.field958 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1124(class59.field957, this.field2603, this.field2602, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()V")
    public final void method1129() {
        if (super.field2583 != super.field2566 || super.field2577 != super.field2572) {
            byte[] var1 = new byte[super.field2572 * super.field2566];
            int var2 = 0;
            for (int var3 = 0; var3 < super.field2577; ++var3) {
                for (int var4 = 0; var4 < super.field2583; ++var4) {
                    var1[(super.field2585 + var3) * super.field2566 + super.field2574 + var4] = this.field2603[var2++];
                }
            }
            this.field2603 = var1;
            super.field2583 = super.field2566;
            super.field2577 = super.field2572;
            super.field2574 = 0;
            super.field2585 = 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIIII[B[I)V")
    public class158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field2566 = arg0;
        super.field2572 = arg1;
        super.field2574 = arg2;
        super.field2585 = arg3;
        super.field2583 = arg4;
        super.field2577 = arg5;
        this.field2603 = arg6;
        this.field2602 = arg7;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(III)V")
    private class158(int arg0, int arg1, int arg2) {
        super.field2566 = super.field2583 = arg0;
        super.field2572 = super.field2577 = arg1;
        super.field2574 = super.field2585 = 0;
        this.field2603 = new byte[arg0 * arg1];
        this.field2602 = new int[arg2];
    }
}
