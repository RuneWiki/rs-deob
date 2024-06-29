import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class70 extends class292 {

    @OriginalMember(owner = "client!om", name = "t", descriptor = "[B")
    public byte[] field1021;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "[I")
    private int[] field1020;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V", line = 3)
    public final void method581() {
        if (this.field4582 == this.field4579 && this.field4595 == this.field4578) {
            return;
        }
        byte[] var1 = new byte[this.field4582 * this.field4578];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4595; var3++) {
            for (int var4 = 0; var4 < this.field4579; var4++) {
                var1[(this.field4583 + var3) * this.field4582 + this.field4589 + var4] = this.field1021[var2++];
            }
        }
        this.field1021 = var1;
        this.field4579 = this.field4582;
        this.field4595 = this.field4578;
        this.field4589 = 0;
        this.field4583 = 0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V", line = 34)
    public final void method582(int arg0, int arg1, int arg2) {
        int var4 = this.field4589 + arg0;
        int var5 = this.field4583 + arg1;
        int var6 = class168.field2527 * var5 + var4;
        int var7 = 0;
        int var8 = this.field4595;
        int var9 = this.field4579;
        int var10 = class168.field2527 - var9;
        int var11 = 0;
        if (var5 < class168.field2530) {
            int var12 = class168.field2530 - var5;
            var8 -= var12;
            var5 = class168.field2530;
            var7 += var9 * var12;
            var6 += class168.field2527 * var12;
        }
        if (var5 + var8 > class168.field2526) {
            var8 -= var5 + var8 - class168.field2526;
        }
        if (var4 < class168.field2528) {
            int var13 = class168.field2528 - var4;
            var9 -= var13;
            var4 = class168.field2528;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class168.field2522) {
            int var14 = var4 + var9 - class168.field2522;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method588(class168.field2525, this.field1021, this.field1020, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 89)
    private static final void method583(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()V", line = 125)
    public final void method584() {
        int var1 = 0;
        int var2 = this.field1021.length - 7;
        while (var1 < var2) {
            this.field1021[var1++] = 0;
            this.field1021[var1++] = 0;
            this.field1021[var1++] = 0;
            this.field1021[var1++] = 0;
            this.field1021[var1++] = 0;
            this.field1021[var1++] = 0;
            this.field1021[var1++] = 0;
            this.field1021[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field1021[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(IIIII)V", line = 150)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field4579;
        int var7 = this.field4595;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4582;
        int var11 = this.field4578;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4589 > 0) {
            int var14 = ((this.field4589 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4589 << 16);
        }
        if (this.field4583 > 0) {
            int var15 = ((this.field4583 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4583 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        int var16 = class168.field2527 * arg1 + arg0;
        int var17 = class168.field2527 - arg2;
        if (arg1 + arg3 > class168.field2526) {
            arg3 -= arg1 + arg3 - class168.field2526;
        }
        if (arg1 < class168.field2530) {
            int var18 = class168.field2530 - arg1;
            arg3 -= var18;
            var16 += class168.field2527 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class168.field2522) {
            int var19 = arg0 + arg2 - class168.field2522;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class168.field2528) {
            int var20 = class168.field2528 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method590(class168.field2525, this.field1021, this.field1020, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "()V", line = 233)
    public final void method586() {
        byte[] var1 = new byte[this.field4595 * this.field4579];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4579; var3++) {
            for (int var4 = this.field4595 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1021[this.field4579 * var4 + var3];
            }
        }
        this.field1021 = var1;
        int var5 = this.field4583;
        this.field4583 = this.field4589;
        this.field4589 = this.field4578 - this.field4595 - var5;
        int var6 = this.field4595;
        this.field4595 = this.field4579;
        this.field4579 = var6;
        int var7 = this.field4578;
        this.field4578 = this.field4582;
        this.field4582 = var7;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 268)
    private static final void method587(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!om", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 334)
    private static final void method588(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V", line = 367)
    public final void method589(int arg0, int arg1) {
        int var3 = this.field4589 + arg0;
        int var4 = this.field4583 + arg1;
        int var5 = class168.field2527 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4595;
        int var8 = this.field4579;
        int var9 = class168.field2527 - var8;
        int var10 = 0;
        if (var4 < class168.field2530) {
            int var11 = class168.field2530 - var4;
            var7 -= var11;
            var4 = class168.field2530;
            var6 += var8 * var11;
            var5 += class168.field2527 * var11;
        }
        if (var4 + var7 > class168.field2526) {
            var7 -= var4 + var7 - class168.field2526;
        }
        if (var3 < class168.field2528) {
            int var12 = class168.field2528 - var3;
            var8 -= var12;
            var3 = class168.field2528;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class168.field2522) {
            int var13 = var3 + var8 - class168.field2522;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method587(class168.field2525, this.field1021, this.field1020, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([I[B[IIIIIIIIIII)V", line = 424)
    private static final void method590(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V", line = 474)
    public final void method591(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1020.length; var4++) {
            int var5 = this.field1020[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1020[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1020[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1020[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 515)
    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4582 = arg0;
        this.field4578 = arg1;
        this.field4589 = arg2;
        this.field4583 = arg3;
        this.field4579 = arg4;
        this.field4595 = arg5;
        this.field1021 = arg6;
        this.field1020 = arg7;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V", line = 527)
    public final void method592(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field4579;
        int var6 = this.field4595;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4582;
        int var10 = this.field4578;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4589 > 0) {
            int var13 = ((this.field4589 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4589 << 16);
        }
        if (this.field4583 > 0) {
            int var14 = ((this.field4583 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4583 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class168.field2527 * arg1 + arg0;
        int var16 = class168.field2527 - arg2;
        if (arg1 + arg3 > class168.field2526) {
            arg3 -= arg1 + arg3 - class168.field2526;
        }
        if (arg1 < class168.field2530) {
            int var17 = class168.field2530 - arg1;
            arg3 -= var17;
            var15 += class168.field2527 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class168.field2522) {
            int var18 = arg0 + arg2 - class168.field2522;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class168.field2528) {
            int var19 = class168.field2528 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method583(class168.field2525, this.field1021, this.field1020, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(III)V", line = 602)
    public class70(int arg0, int arg1, int arg2) {
        this.field4582 = this.field4579 = arg0;
        this.field4578 = this.field4595 = arg1;
        this.field4589 = this.field4583 = 0;
        this.field1021 = new byte[arg0 * arg1];
        this.field1020 = new int[arg2];
    }
}
