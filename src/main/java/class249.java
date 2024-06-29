import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class249 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    private static int field4056;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    private static int field4058;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Llb;")
    public static class341 field4059;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[Llb;")
    public static class341[] field4057;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "[[Leo;")
    public static class328[][] field4060;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Llb;Llb;II)V", line = 5)
    private static final void method1912(class341 arg0, class341 arg1, int arg2, int arg3) {
        int var4 = arg0.field4645 + arg2;
        int var5 = arg0.field4650 + arg3;
        int var6 = arg1.field4652 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4649;
        int var9 = arg0.field4652;
        int var10 = arg1.field4652 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4652 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4649) {
            int var13 = var5 + var8 + 1 - arg1.field4649;
            var8 -= var13;
        }
        if (var4 <= 0) {
            int var14 = 1 - var4;
            var9 -= var14;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
            var4 = 1;
        }
        if (var4 + var9 >= arg1.field4652) {
            int var15 = var4 + var9 + 1 - arg1.field4652;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1928(arg1.field5444, arg0.field5444, var7, var6, var9, var8, var10, var11);
            method1926(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Llb;III)Z", line = 64)
    public static final boolean method1913(class341 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class167.field2663 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class167.field2658 * arg2 >> 8) >> 3;
            return method1914(arg0, field4059, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Llb;Llb;II)Z", line = 74)
    private static final boolean method1914(class341 arg0, class341 arg1, int arg2, int arg3) {
        int var4 = arg0.field4645 + arg2;
        int var5 = arg0.field4650 + arg3;
        int var6 = arg1.field4652 * var5 + var4;
        int var7 = arg0.field4649;
        int var8 = arg0.field4652;
        int var9 = arg1.field4652 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field4652 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field4649) {
            int var11 = var5 + var7 + 1 - arg1.field4649;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field4652) {
            int var13 = var4 + var8 + 1 - arg1.field4652;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field4652 + var9;
            return method1925(arg1.field5444, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Llb;III)V", line = 135)
    public static final void method1915(class341 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class167.field2663 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class167.field2658 * arg2 >> 8) >> 3;
            method1923(arg0, field4059, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([B[BIIIII)V", line = 147)
    private static final void method1916(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (int var7 = -16; var7 < 0; var7++) {
            for (int var8 = -4; var8 < 0; var8++) {
                int var10001 = arg3++;
                arg0[var10001] += arg1[arg2];
                int var9 = arg2 + arg5;
                int var12 = arg3++;
                arg0[var12] += arg1[var9];
                int var10 = arg5 + var9;
                int var13 = arg3++;
                arg0[var13] += arg1[var10];
                int var11 = arg5 + var10;
                int var14 = arg3++;
                arg0[var14] += arg1[var11];
                arg2 = arg5 + var11;
            }
            arg3 += arg4;
            arg2 += arg6;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "()V", line = 173)
    public static final void method1917() {
        field4059 = null;
        field4057 = null;
        field4060 = (class328[][]) null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([B[BIIIIII)V", line = 179)
    private static final void method1918(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -(arg4 >> 2);
        int var9 = -(arg4 & 0x3);
        for (int var10 = -arg5; var10 < 0; var10++) {
            int var10001;
            for (int var11 = var8; var11 < 0; var11++) {
                var10001 = arg3++;
                arg0[var10001] -= arg1[arg2++];
                int var13 = arg3++;
                arg0[var13] -= arg1[arg2++];
                int var14 = arg3++;
                arg0[var14] -= arg1[arg2++];
                int var15 = arg3++;
                arg0[var15] -= arg1[arg2++];
            }
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] -= arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZZIIIIII)V", line = 214)
    public static final void method1919(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class167.field2663 * var11 >> 8) >> 3;
        int var14 = var12 - (class167.field2658 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1912(field4057[1], field4059, var13 + 1, var14 + 1);
        } else {
            method1921(field4057[arg0], field4059, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "()V", line = 242)
    public static void method1920() {
        field4059 = null;
        field4057 = null;
        field4060 = (class328[][]) null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Llb;Llb;IIIZ)V", line = 247)
    private static final void method1921(class341 arg0, class341 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field4652 || arg3 + 16 >= arg1.field4649) {
            return;
        }
        int var6 = arg1.field4652 * arg3 + arg2;
        int var7 = arg1.field4652 - 16;
        short var8;
        byte var9;
        int var10;
        if (arg4 == 0) {
            var8 = 240;
            var9 = 1;
            var10 = -var9 * 16 - 16;
        } else if (arg4 == 1) {
            var8 = 255;
            var9 = -16;
            var10 = -var9 * 16 - 1;
        } else if (arg4 == 2) {
            var8 = 15;
            var9 = -1;
            var10 = -var9 * 16 + 16;
        } else {
            var8 = 0;
            var9 = 16;
            var10 = -var9 * 16 + 1;
        }
        if (arg5) {
            method1922(arg1.field5444, arg0.field5444, var8, var6, var7, var9, var10);
        } else {
            method1916(arg1.field5444, arg0.field5444, var8, var6, var7, var9, var10);
        }
        method1926(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "([B[BIIIII)V", line = 296)
    private static final void method1922(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (int var7 = -16; var7 < 0; var7++) {
            for (int var8 = -4; var8 < 0; var8++) {
                int var10001 = arg3++;
                arg0[var10001] = (byte) (arg0[var10001] + (1 - arg1[arg2]));
                int var9 = arg2 + arg5;
                int var12 = arg3++;
                arg0[var12] = (byte) (arg0[var12] + (1 - arg1[var9]));
                int var10 = arg5 + var9;
                int var13 = arg3++;
                arg0[var13] = (byte) (arg0[var13] + (1 - arg1[var10]));
                int var11 = arg5 + var10;
                int var14 = arg3++;
                arg0[var14] = (byte) (arg0[var14] + (1 - arg1[var11]));
                arg2 = arg5 + var11;
            }
            arg3 += arg4;
            arg2 += arg6;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(Llb;Llb;II)V", line = 322)
    private static final void method1923(class341 arg0, class341 arg1, int arg2, int arg3) {
        int var4 = arg0.field4645 + arg2;
        int var5 = arg0.field4650 + arg3;
        int var6 = arg1.field4652 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4649;
        int var9 = arg0.field4652;
        int var10 = arg1.field4652 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4652 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4649) {
            int var13 = var5 + var8 + 1 - arg1.field4649;
            var8 -= var13;
        }
        if (var4 <= 0) {
            int var14 = 1 - var4;
            var9 -= var14;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
            var4 = 1;
        }
        if (var4 + var9 >= arg1.field4652) {
            int var15 = var4 + var9 + 1 - arg1.field4652;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1918(arg1.field5444, arg0.field5444, var7, var6, var9, var8, var10, var11);
            method1926(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII[[Z[[I)V", line = 383)
    public static final void method1924(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class42.field627;
        class42.method275(1);
        class42.method277(1);
        class42.method299();
        class42.method283(false);
        class310.method2203(0, 0, 19);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field4058; var7++) {
            label52: for (int var8 = 0; var8 < field4056; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class328 var11 = field4060[var7][var8];
                                if (var11.field5215) {
                                    var11.method2314(field4059, var7, var8);
                                    var11.field5215 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method2312();
                                var6.glPopMatrix();
                                continue label52;
                            }
                        }
                    }
                }
            }
        }
        var6.glEnableClientState(32886);
        var6.glDepthMask(true);
        class42.method287();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([BIIIII)Z", line = 456)
    private static final boolean method1925(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 % arg5;
        int var7;
        if (var6 == 0) {
            var7 = 0;
        } else {
            var7 = arg5 - var6;
        }
        int var8 = -((arg3 + arg5 - 1) / arg5);
        int var9 = -((arg2 + arg5 - 1) / arg5);
        for (int var10 = var8; var10 < 0; var10++) {
            for (int var11 = var9; var11 < 0; var11++) {
                if (arg0[arg1] == 0) {
                    return true;
                }
                arg1 += arg5;
            }
            int var12 = arg1 - var7;
            if (arg0[var12 - 1] == 0) {
                return true;
            }
            arg1 = arg4 + var12;
        }
        return false;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V", line = 496)
    private static final void method1926(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class328[] var9 = field4060[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field5215 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(Llb;III)V", line = 522)
    public static final void method1927(class341 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class167.field2663 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class167.field2658 * arg2 >> 8) >> 3;
            method1912(arg0, field4059, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "([B[BIIIIII)V", line = 533)
    private static final void method1928(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -(arg4 >> 2);
        int var9 = -(arg4 & 0x3);
        for (int var10 = -arg5; var10 < 0; var10++) {
            int var10001;
            for (int var11 = var8; var11 < 0; var11++) {
                var10001 = arg3++;
                arg0[var10001] += arg1[arg2++];
                int var13 = arg3++;
                arg0[var13] += arg1[arg2++];
                int var14 = arg3++;
                arg0[var14] += arg1[arg2++];
                int var15 = arg3++;
                arg0[var15] += arg1[arg2++];
            }
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] += arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V", line = 570)
    public static final void method1929(int arg0, int arg1) {
        field4058 = arg0 + 7 >> 3;
        field4056 = arg1 + 7 >> 3;
        field4059 = new class341(field4058 * 128 + 2, field4056 * 128 + 2, 0);
        field4060 = new class328[field4058][field4056];
        for (int var2 = 0; var2 < field4058; var2++) {
            for (int var3 = 0; var3 < field4056; var3++) {
                field4060[var2][var3] = new class328();
            }
        }
    }
}
