import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 extends class26 {

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[B")
    public byte[] field14;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "[I")
    private int[] field15;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 4)
    public final void method7() {
        if (this.field376 == this.field360 && this.field375 == this.field367) {
            return;
        }
        byte[] var1 = new byte[this.field367 * this.field360];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field375; var3++) {
            for (int var4 = 0; var4 < this.field376; var4++) {
                var1[(this.field363 + var3) * this.field360 + this.field368 + var4] = this.field14[var2++];
            }
        }
        this.field14 = var1;
        this.field376 = this.field360;
        this.field375 = this.field367;
        this.field368 = 0;
        this.field363 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 36)
    private static final void method8(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V", line = 98)
    public final void method9(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field15.length; var4++) {
            int var5 = this.field15[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field15[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field15[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field15[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V", line = 147)
    public final void method10(int arg0, int arg1) {
        int var3 = this.field368 + arg0;
        int var4 = this.field363 + arg1;
        int var5 = class276.field4619 * var4 + var3;
        int var6 = 0;
        int var7 = this.field375;
        int var8 = this.field376;
        int var9 = class276.field4619 - var8;
        int var10 = 0;
        if (var4 < class276.field4627) {
            int var11 = class276.field4627 - var4;
            var7 -= var11;
            var4 = class276.field4627;
            var6 += var8 * var11;
            var5 += class276.field4619 * var11;
        }
        if (var4 + var7 > class276.field4621) {
            var7 -= var4 + var7 - class276.field4621;
        }
        if (var3 < class276.field4625) {
            int var12 = class276.field4625 - var3;
            var8 -= var12;
            var3 = class276.field4625;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class276.field4622) {
            int var13 = var3 + var8 - class276.field4622;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method8(class276.field4626, this.field14, this.field15, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V", line = 210)
    public final void method11(int arg0, int arg1, int arg2) {
        int var4 = this.field368 + arg0;
        int var5 = this.field363 + arg1;
        int var6 = class276.field4619 * var5 + var4;
        int var7 = 0;
        int var8 = this.field375;
        int var9 = this.field376;
        int var10 = class276.field4619 - var9;
        int var11 = 0;
        if (var5 < class276.field4627) {
            int var12 = class276.field4627 - var5;
            var8 -= var12;
            var5 = class276.field4627;
            var7 += var9 * var12;
            var6 += class276.field4619 * var12;
        }
        if (var5 + var8 > class276.field4621) {
            var8 -= var5 + var8 - class276.field4621;
        }
        if (var4 < class276.field4625) {
            int var13 = class276.field4625 - var4;
            var9 -= var13;
            var4 = class276.field4625;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class276.field4622) {
            int var14 = var4 + var9 - class276.field4622;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method16(class276.field4626, this.field14, this.field15, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V", line = 265)
    public final void method12(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field376;
        int var6 = this.field375;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field360;
        int var10 = this.field367;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field368 > 0) {
            int var13 = ((this.field368 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field368 << 16);
        }
        if (this.field363 > 0) {
            int var14 = ((this.field363 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field363 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class276.field4619 * arg1 + arg0;
        int var16 = class276.field4619 - arg2;
        if (arg1 + arg3 > class276.field4621) {
            arg3 -= arg1 + arg3 - class276.field4621;
        }
        if (arg1 < class276.field4627) {
            int var17 = class276.field4627 - arg1;
            arg3 -= var17;
            var15 += class276.field4619 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class276.field4622) {
            int var18 = arg0 + arg2 - class276.field4622;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class276.field4625) {
            int var19 = class276.field4625 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method15(class276.field4626, this.field14, this.field15, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()V", line = 343)
    public final void method13() {
        int var1 = 0;
        int var2 = this.field14.length - 7;
        while (var1 < var2) {
            this.field14[var1++] = 0;
            this.field14[var1++] = 0;
            this.field14[var1++] = 0;
            this.field14[var1++] = 0;
            this.field14[var1++] = 0;
            this.field14[var1++] = 0;
            this.field14[var1++] = 0;
            this.field14[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field14[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()V", line = 366)
    public final void method14() {
        byte[] var1 = new byte[this.field376 * this.field375];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field376; var3++) {
            for (int var4 = this.field375 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field14[this.field376 * var4 + var3];
            }
        }
        this.field14 = var1;
        int var5 = this.field363;
        this.field363 = this.field368;
        this.field368 = this.field367 - this.field375 - var5;
        int var6 = this.field375;
        this.field375 = this.field376;
        this.field376 = var6;
        int var7 = this.field367;
        this.field367 = this.field360;
        this.field360 = var7;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 399)
    private static final void method15(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 434)
    private static final void method16(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 470)
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field360 = arg0;
        this.field367 = arg1;
        this.field368 = arg2;
        this.field363 = arg3;
        this.field376 = arg4;
        this.field375 = arg5;
        this.field14 = arg6;
        this.field15 = arg7;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()Lie;", line = 482)
    public final class2 method17() {
        class2 var1 = new class2(this.field376, this.field375, this.field15.length);
        var1.field360 = this.field360;
        var1.field367 = this.field367;
        var1.field368 = this.field368;
        var1.field363 = this.field363;
        int var2 = this.field14.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field14[var3] = this.field14[var3];
        }
        var1.field15 = this.field15;
        return var1;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(III)V", line = 499)
    public class2(int arg0, int arg1, int arg2) {
        this.field360 = this.field376 = arg0;
        this.field367 = this.field375 = arg1;
        this.field368 = this.field363 = 0;
        this.field14 = new byte[arg0 * arg1];
        this.field15 = new int[arg2];
    }
}
