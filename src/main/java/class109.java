import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class109 extends class213 {

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "[[B")
    private byte[][] field1580 = new byte[256][];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method728(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[BIIIIIIIII[I[I)V")
    private static final void method729(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11, int[] arg12) {
        int var13 = arg2 - class151.field2227;
        int var14 = arg3 - class151.field2230;
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
                    class151.field2226[arg8++] = arg6;
                }
            }
            arg7 += arg10 + var21;
            arg8 += arg9 + var21;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = class151.field2225 * arg2 + arg1;
        int var9 = class151.field2225 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class151.field2230) {
            int var12 = class151.field2230 - arg2;
            arg4 -= var12;
            arg2 = class151.field2230;
            var11 += arg3 * var12;
            var8 += class151.field2225 * var12;
        }
        if (arg2 + arg4 > class151.field2229) {
            arg4 -= arg2 + arg4 - class151.field2229;
        }
        if (arg1 < class151.field2227) {
            int var13 = class151.field2227 - arg1;
            arg3 -= var13;
            arg1 = class151.field2227;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class151.field2228) {
            int var14 = arg1 + arg3 - class151.field2228;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 <= 0 || arg4 <= 0) {
            return;
        }
        if (class151.field2232 == null) {
            method731(class151.field2226, this.field1580[arg0], arg5, var11, var8, arg3, arg4, var9, var10);
        } else {
            method729(class151.field2226, this.field1580[arg0], arg1, arg2, arg3, arg4, arg5, var11, var8, var9, var10, class151.field2232, class151.field2224);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class109(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1580 = arg5;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
    public class109(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method731(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIZ)V")
    public final void method732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var9 = class151.field2225 * arg2 + arg1;
        int var10 = class151.field2225 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < class151.field2230) {
            int var13 = class151.field2230 - arg2;
            arg4 -= var13;
            arg2 = class151.field2230;
            var12 += arg3 * var13;
            var9 += class151.field2225 * var13;
        }
        if (arg2 + arg4 > class151.field2229) {
            arg4 -= arg2 + arg4 - class151.field2229;
        }
        if (arg1 < class151.field2227) {
            int var14 = class151.field2227 - arg1;
            arg3 -= var14;
            arg1 = class151.field2227;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg3 > class151.field2228) {
            int var15 = arg1 + arg3 - class151.field2228;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg4 > 0) {
            method728(class151.field2226, this.field1580[arg0], arg5, var12, var9, arg3, arg4, var10, var11, arg6);
        }
    }
}
