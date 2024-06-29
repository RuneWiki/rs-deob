import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class95 extends class87 {

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "[B")
    public byte[] field1596;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "[I")
    private int[] field1597;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 14)
    public final void method607() {
        int var1 = 0;
        int var2 = this.field1596.length - 7;
        while (var1 < var2) {
            this.field1596[var1++] = 0;
            this.field1596[var1++] = 0;
            this.field1596[var1++] = 0;
            this.field1596[var1++] = 0;
            this.field1596[var1++] = 0;
            this.field1596[var1++] = 0;
            this.field1596[var1++] = 0;
            this.field1596[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field1596[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 37)
    private static final void method608(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 70)
    private static final void method609(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 130)
    public final void method562(int arg0, int arg1, int arg2) {
        int var4 = this.field1474 + arg0;
        int var5 = this.field1470 + arg1;
        int var6 = class78.field1358 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1465;
        int var9 = this.field1464;
        int var10 = class78.field1358 - var9;
        int var11 = 0;
        if (var5 < class78.field1354) {
            int var12 = class78.field1354 - var5;
            var8 -= var12;
            var5 = class78.field1354;
            var7 += var9 * var12;
            var6 += class78.field1358 * var12;
        }
        if (var5 + var8 > class78.field1352) {
            var8 -= var5 + var8 - class78.field1352;
        }
        if (var4 < class78.field1353) {
            int var13 = class78.field1353 - var4;
            var9 -= var13;
            var4 = class78.field1353;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class78.field1359) {
            int var14 = var4 + var9 - class78.field1359;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method613(class78.field1357, this.field1596, this.field1597, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lqb;", line = 185)
    public final class95 method610() {
        class95 var1 = new class95(this.field1464, this.field1465, this.field1597.length);
        var1.field1468 = this.field1468;
        var1.field1475 = this.field1475;
        var1.field1474 = this.field1474;
        var1.field1470 = this.field1470;
        int var2 = this.field1596.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field1596[var3] = this.field1596[var3];
        }
        var1.field1597 = this.field1597;
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V", line = 205)
    public final void method611(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1464;
        int var6 = this.field1465;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1468;
        int var10 = this.field1475;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1474 > 0) {
            int var13 = ((this.field1474 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1474 << 16);
        }
        if (this.field1470 > 0) {
            int var14 = ((this.field1470 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1470 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class78.field1358 * arg1 + arg0;
        int var16 = class78.field1358 - arg2;
        if (arg1 + arg3 > class78.field1352) {
            arg3 -= arg1 + arg3 - class78.field1352;
        }
        if (arg1 < class78.field1354) {
            int var17 = class78.field1354 - arg1;
            arg3 -= var17;
            var15 += class78.field1358 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class78.field1359) {
            int var18 = arg0 + arg2 - class78.field1359;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class78.field1353) {
            int var19 = class78.field1353 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method608(class78.field1357, this.field1596, this.field1597, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()V", line = 279)
    public final void method612() {
        if (this.field1468 == this.field1464 && this.field1475 == this.field1465) {
            return;
        }
        byte[] var1 = new byte[this.field1475 * this.field1468];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1465; var3++) {
            for (int var4 = 0; var4 < this.field1464; var4++) {
                var1[(this.field1470 + var3) * this.field1468 + this.field1474 + var4] = this.field1596[var2++];
            }
        }
        this.field1596 = var1;
        this.field1464 = this.field1468;
        this.field1465 = this.field1475;
        this.field1474 = 0;
        this.field1470 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 318)
    private static final void method613(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 353)
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1468 = arg0;
        this.field1475 = arg1;
        this.field1474 = arg2;
        this.field1470 = arg3;
        this.field1464 = arg4;
        this.field1465 = arg5;
        this.field1596 = arg6;
        this.field1597 = arg7;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(III)V", line = 365)
    public class95(int arg0, int arg1, int arg2) {
        this.field1468 = this.field1464 = arg0;
        this.field1475 = this.field1465 = arg1;
        this.field1474 = this.field1470 = 0;
        this.field1596 = new byte[arg0 * arg1];
        this.field1597 = new int[arg2];
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()V", line = 375)
    public final void method614() {
        byte[] var1 = new byte[this.field1465 * this.field1464];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1464; var3++) {
            for (int var4 = this.field1465 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1596[this.field1464 * var4 + var3];
            }
        }
        this.field1596 = var1;
        int var5 = this.field1470;
        this.field1470 = this.field1474;
        this.field1474 = this.field1475 - this.field1465 - var5;
        int var6 = this.field1465;
        this.field1465 = this.field1464;
        this.field1464 = var6;
        int var7 = this.field1475;
        this.field1475 = this.field1468;
        this.field1468 = var7;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V", line = 411)
    public final void method615(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1597.length; var4++) {
            int var5 = this.field1597[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1597[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1597[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1597[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 450)
    public final void method560(int arg0, int arg1) {
        int var3 = this.field1474 + arg0;
        int var4 = this.field1470 + arg1;
        int var5 = class78.field1358 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1465;
        int var8 = this.field1464;
        int var9 = class78.field1358 - var8;
        int var10 = 0;
        if (var4 < class78.field1354) {
            int var11 = class78.field1354 - var4;
            var7 -= var11;
            var4 = class78.field1354;
            var6 += var8 * var11;
            var5 += class78.field1358 * var11;
        }
        if (var4 + var7 > class78.field1352) {
            var7 -= var4 + var7 - class78.field1352;
        }
        if (var3 < class78.field1353) {
            int var12 = class78.field1353 - var3;
            var8 -= var12;
            var3 = class78.field1353;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class78.field1359) {
            int var13 = var3 + var8 - class78.field1359;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method609(class78.field1357, this.field1596, this.field1597, 0, var6, var5, var8, var7, var9, var10);
        }
    }
}
