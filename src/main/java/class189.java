import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class189 extends class276 {

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "[[B")
    private byte[][] field3239 = new byte[256][];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([I[BIIIIIIIII[I[I)V", line = 4)
    private static final void method1410(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11, int[] arg12) {
        int var13 = arg2 - class316.field5332;
        int var14 = arg3 - class316.field5330;
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
                    class316.field5328[arg8++] = arg6;
                }
            }
            arg7 += arg10 + var21;
            arg8 += arg9 + var21;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIZ)V", line = 75)
    public final void method1411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = class316.field5331 * arg2 + arg1;
        int var9 = class316.field5331 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class316.field5330) {
            int var12 = class316.field5330 - arg2;
            arg4 -= var12;
            arg2 = class316.field5330;
            var11 += arg3 * var12;
            var8 += class316.field5331 * var12;
        }
        if (arg2 + arg4 > class316.field5334) {
            arg4 -= arg2 + arg4 - class316.field5334;
        }
        if (arg1 < class316.field5332) {
            int var13 = class316.field5332 - arg1;
            arg3 -= var13;
            arg1 = class316.field5332;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class316.field5333) {
            int var14 = arg1 + arg3 - class316.field5333;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 <= 0 || arg4 <= 0) {
            return;
        }
        if (class316.field5326 == null) {
            method1413(class316.field5328, this.field3239[arg0], arg5, var11, var8, arg3, arg4, var9, var10);
        } else {
            method1410(class316.field5328, this.field3239[arg0], arg1, arg2, arg3, arg4, arg5, var11, var8, var9, var10, class316.field5326, class316.field5327);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIZ)V", line = 127)
    public final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var9 = class316.field5331 * arg2 + arg1;
        int var10 = class316.field5331 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < class316.field5330) {
            int var13 = class316.field5330 - arg2;
            arg4 -= var13;
            arg2 = class316.field5330;
            var12 += arg3 * var13;
            var9 += class316.field5331 * var13;
        }
        if (arg2 + arg4 > class316.field5334) {
            arg4 -= arg2 + arg4 - class316.field5334;
        }
        if (arg1 < class316.field5332) {
            int var14 = class316.field5332 - arg1;
            arg3 -= var14;
            arg1 = class316.field5332;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg3 > class316.field5333) {
            int var15 = arg1 + arg3 - class316.field5333;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1414(class316.field5328, this.field3239[arg0], arg5, var12, var9, arg3, arg4, var10, var11, arg6);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([I[BIIIIIII)V", line = 175)
    private static final void method1413(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 232)
    public class189(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3239 = arg5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([I[BIIIIIIII)V", line = 237)
    private static final void method1414(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B)V", line = 270)
    public class189(byte[] arg0) {
        super(arg0);
    }
}
