import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class66 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    private static int field1104;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    private static int field1106;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lie;")
    public static class2 field1107;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[Lie;")
    public static class2[] field1105;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[[Lb;")
    public static class135[][] field1108;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lie;III)V", line = 4)
    public static final void method475(class2 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class235.field3961 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class235.field3966 * arg2 >> 8) >> 3;
            method485(arg0, field1107, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZZIIIIII)V", line = 14)
    public static final void method476(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class235.field3961 * var11 >> 8) >> 3;
        int var14 = var12 - (class235.field3966 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method485(field1105[1], field1107, var13 + 1, var14 + 1);
        } else {
            method486(field1105[arg0], field1107, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lie;Lie;II)V", line = 42)
    private static final void method477(class2 arg0, class2 arg1, int arg2, int arg3) {
        int var4 = arg0.field368 + arg2;
        int var5 = arg0.field363 + arg3;
        int var6 = arg1.field376 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field375;
        int var9 = arg0.field376;
        int var10 = arg1.field376 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field376 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field375) {
            int var13 = var5 + var8 + 1 - arg1.field375;
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
        if (var4 + var9 >= arg1.field376) {
            int var15 = var4 + var9 + 1 - arg1.field376;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method481(arg1.field14, arg0.field14, var7, var6, var9, var8, var10, var11);
            method487(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII[[Z[[I)V", line = 102)
    public static final void method478(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class56.field848;
        class56.method381(1);
        class56.method351(1);
        class56.method382();
        class56.method384(false);
        class51.method325(0, 0, 26604);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field1104; var7++) {
            label52: for (int var8 = 0; var8 < field1106; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class135 var11 = field1108[var7][var8];
                                if (var11.field2353) {
                                    var11.method984(field1107, var7, var8);
                                    var11.field2353 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method985();
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
        class56.method368();
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Lie;III)Z", line = 172)
    public static final boolean method479(class2 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class235.field3961 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class235.field3966 * arg2 >> 8) >> 3;
            return method489(arg0, field1107, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([B[BIIIIII)V", line = 183)
    private static final void method480(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "([B[BIIIIII)V", line = 219)
    private static final void method481(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([B[BIIIII)V", line = 257)
    private static final void method482(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V", line = 283)
    public static final void method483(int arg0, int arg1) {
        field1104 = arg0 + 7 >> 3;
        field1106 = arg1 + 7 >> 3;
        field1107 = new class2(field1104 * 128 + 2, field1106 * 128 + 2, 0);
        field1108 = new class135[field1104][field1106];
        for (int var2 = 0; var2 < field1104; var2++) {
            for (int var3 = 0; var3 < field1106; var3++) {
                field1108[var2][var3] = new class135();
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V", line = 306)
    public static void method484() {
        field1107 = null;
        field1105 = null;
        field1108 = (class135[][]) null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Lie;Lie;II)V", line = 314)
    private static final void method485(class2 arg0, class2 arg1, int arg2, int arg3) {
        int var4 = arg0.field368 + arg2;
        int var5 = arg0.field363 + arg3;
        int var6 = arg1.field376 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field375;
        int var9 = arg0.field376;
        int var10 = arg1.field376 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field376 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field375) {
            int var13 = var5 + var8 + 1 - arg1.field375;
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
        if (var4 + var9 >= arg1.field376) {
            int var15 = var4 + var9 + 1 - arg1.field376;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method480(arg1.field14, arg0.field14, var7, var6, var9, var8, var10, var11);
            method487(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lie;Lie;IIIZ)V", line = 373)
    private static final void method486(class2 arg0, class2 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field376 || arg3 + 16 >= arg1.field375) {
            return;
        }
        int var6 = arg1.field376 * arg3 + arg2;
        int var7 = arg1.field376 - 16;
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
            method482(arg1.field14, arg0.field14, var8, var6, var7, var9, var10);
        } else {
            method490(arg1.field14, arg0.field14, var8, var6, var7, var9, var10);
        }
        method487(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V", line = 423)
    private static final void method487(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field1108[var8][var9].field2353 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()V", line = 449)
    public static final void method488() {
        field1107 = null;
        field1105 = null;
        field1108 = (class135[][]) null;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(Lie;Lie;II)Z", line = 454)
    private static final boolean method489(class2 arg0, class2 arg1, int arg2, int arg3) {
        int var4 = arg0.field368 + arg2;
        int var5 = arg0.field363 + arg3;
        int var6 = arg1.field376 * var5 + var4;
        int var7 = arg0.field375;
        int var8 = arg0.field376;
        int var9 = arg1.field376 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field376 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field375) {
            int var11 = var5 + var7 + 1 - arg1.field375;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field376) {
            int var13 = var4 + var8 + 1 - arg1.field376;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field376 + var9;
            method487(var4, var5, var8, var7);
            return method492(arg1.field14, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "([B[BIIIII)V", line = 517)
    private static final void method490(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(Lie;III)V", line = 544)
    public static final void method491(class2 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class235.field3961 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class235.field3966 * arg2 >> 8) >> 3;
            method477(arg0, field1107, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([BIIIII)Z", line = 555)
    private static final boolean method492(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
}
