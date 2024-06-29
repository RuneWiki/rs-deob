import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class74 extends class48 {

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[[B")
    private byte[][] field1060 = new byte[256][];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([I[BIIIIIIII)V", line = 3)
    private static final void method608(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([I[BIIIIIII)V", line = 35)
    private static final void method609(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 92)
    public class74(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1060 = arg5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIZ)V", line = 97)
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = class168.field2527 * arg2 + arg1;
        int var9 = class168.field2527 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class168.field2530) {
            int var12 = class168.field2530 - arg2;
            arg4 -= var12;
            arg2 = class168.field2530;
            var11 += arg3 * var12;
            var8 += class168.field2527 * var12;
        }
        if (arg2 + arg4 > class168.field2526) {
            arg4 -= arg2 + arg4 - class168.field2526;
        }
        if (arg1 < class168.field2528) {
            int var13 = class168.field2528 - arg1;
            arg3 -= var13;
            arg1 = class168.field2528;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class168.field2522) {
            int var14 = arg1 + arg3 - class168.field2522;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 <= 0 || arg4 <= 0) {
            return;
        }
        if (class168.field2523 == null) {
            method609(class168.field2525, this.field1060[arg0], arg5, var11, var8, arg3, arg4, var9, var10);
        } else {
            method610(class168.field2525, this.field1060[arg0], arg1, arg2, arg3, arg4, arg5, var11, var8, var9, var10, class168.field2523, class168.field2529);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIZ)V", line = 149)
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var9 = class168.field2527 * arg2 + arg1;
        int var10 = class168.field2527 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < class168.field2530) {
            int var13 = class168.field2530 - arg2;
            arg4 -= var13;
            arg2 = class168.field2530;
            var12 += arg3 * var13;
            var9 += class168.field2527 * var13;
        }
        if (arg2 + arg4 > class168.field2526) {
            arg4 -= arg2 + arg4 - class168.field2526;
        }
        if (arg1 < class168.field2528) {
            int var14 = class168.field2528 - arg1;
            arg3 -= var14;
            arg1 = class168.field2528;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg3 > class168.field2522) {
            int var15 = arg1 + arg3 - class168.field2522;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg4 > 0) {
            method608(class168.field2525, this.field1060[arg0], arg5, var12, var9, arg3, arg4, var10, var11, arg6);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([I[BIIIIIIIII[I[I)V", line = 199)
    private static final void method610(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11, int[] arg12) {
        int var13 = arg2 - class168.field2528;
        int var14 = arg3 - class168.field2530;
        for (int var15 = var14; var15 < arg5 + var14; var15++) {
            int var16 = arg11[var15];
            int var17 = arg12[var15];
            int var18 = arg4;
            if (var13 > var16) {
                int var19 = var13 - var16;
                if (var19 >= var17) {
                    arg7 += arg4 + arg10;
                    arg8 += arg4 + arg9;
                    continue;
                }
                var17 -= var19;
            } else {
                int var20 = var16 - var13;
                if (var20 >= arg4) {
                    arg7 += arg4 + arg10;
                    arg8 += arg4 + arg9;
                    continue;
                }
                arg7 += var20;
                var18 = arg4 - var20;
                arg8 += var20;
            }
            int var21 = 0;
            if (var18 < var17) {
                var17 = var18;
            } else {
                var21 = var18 - var17;
            }
            for (int var22 = -var17; var22 < 0; var22++) {
                if (arg1[arg7++] == 0) {
                    arg8++;
                } else {
                    class168.field2525[arg8++] = arg6;
                }
            }
            arg7 += arg10 + var21;
            arg8 += arg9 + var21;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V", line = 269)
    public class74(byte[] arg0) {
        super(arg0);
    }
}
