import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class219 extends class53 {

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public int field4059;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "[B")
    public byte[] field4056;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "[I")
    public int[] field4055;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
    public final void method1389(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4055.length; var4++) {
            int var5 = this.field4055[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field4055[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field4055[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field4055[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V")
    public final void method1390() {
        if (this.field4059 == this.field4057 && this.field4061 == this.field4060) {
            return;
        }
        byte[] var1 = new byte[this.field4060 * this.field4059];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4061; var3++) {
            for (int var4 = 0; var4 < this.field4057; var4++) {
                var1[(this.field4054 + var3) * this.field4059 + this.field4058 + var4] = this.field4056[var2++];
            }
        }
        this.field4056 = var1;
        this.field4057 = this.field4059;
        this.field4061 = this.field4060;
        this.field4058 = 0;
        this.field4054 = 0;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(IIII)V")
    public final void method1391(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field4057;
        int var6 = this.field4061;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4059;
        int var10 = this.field4060;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4058 > 0) {
            int var13 = ((this.field4058 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4058 << 16);
        }
        if (this.field4054 > 0) {
            int var14 = ((this.field4054 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4054 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class53.field1010 * arg1 + arg0;
        int var16 = class53.field1010 - arg2;
        if (arg1 + arg3 > class53.field1011) {
            arg3 -= arg1 + arg3 - class53.field1011;
        }
        if (arg1 < class53.field1008) {
            int var17 = class53.field1008 - arg1;
            arg3 -= var17;
            var15 += class53.field1010 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class53.field1012) {
            int var18 = arg0 + arg2 - class53.field1012;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class53.field1013) {
            int var19 = class53.field1013 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1395(class53.field1007, this.field4056, this.field4055, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1392(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method1393(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
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
                byte var18 = arg1[arg4++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg1[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var19 & 0xFF];
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                byte var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var15 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
    public final void method1394(int arg0, int arg1) {
        int var3 = this.field4058 + arg0;
        int var4 = this.field4054 + arg1;
        int var5 = class53.field1010 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4061;
        int var8 = this.field4057;
        int var9 = class53.field1010 - var8;
        int var10 = 0;
        if (var4 < class53.field1008) {
            int var11 = class53.field1008 - var4;
            var7 -= var11;
            var4 = class53.field1008;
            var6 += var8 * var11;
            var5 += class53.field1010 * var11;
        }
        if (var4 + var7 > class53.field1011) {
            var7 -= var4 + var7 - class53.field1011;
        }
        if (var3 < class53.field1013) {
            int var12 = class53.field1013 - var3;
            var8 -= var12;
            var3 = class53.field1013;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class53.field1012) {
            int var13 = var3 + var8 - class53.field1012;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1393(class53.field1007, this.field4056, this.field4055, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private static final void method1395(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V")
    public final void method1396(int arg0, int arg1, int arg2) {
        int var4 = this.field4058 + arg0;
        int var5 = this.field4054 + arg1;
        int var6 = class53.field1010 * var5 + var4;
        int var7 = 0;
        int var8 = this.field4061;
        int var9 = this.field4057;
        int var10 = class53.field1010 - var9;
        int var11 = 0;
        if (var5 < class53.field1008) {
            int var12 = class53.field1008 - var5;
            var8 -= var12;
            var5 = class53.field1008;
            var7 += var9 * var12;
            var6 += class53.field1010 * var12;
        }
        if (var5 + var8 > class53.field1011) {
            var8 -= var5 + var8 - class53.field1011;
        }
        if (var4 < class53.field1013) {
            int var13 = class53.field1013 - var4;
            var9 -= var13;
            var4 = class53.field1013;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1012) {
            int var14 = var4 + var9 - class53.field1012;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1392(class53.field1007, this.field4056, this.field4055, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    protected class219() {
    }
}
