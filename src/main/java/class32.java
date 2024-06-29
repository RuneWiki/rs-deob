import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class32 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    private static int field440;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private static int field441;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lag;")
    public static class123 field442;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lag;")
    public static class123[] field443;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[[Loc;")
    public static class153[][] field444;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V", line = 5)
    private static final void method202(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class153[] var9 = field444[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field2341 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIIIII)Z", line = 32)
    private static final boolean method203(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([B[BIIIIII)V", line = 72)
    private static final void method204(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lag;III)V", line = 107)
    public static final void method205(class123 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class109.field1630 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class109.field1633 * arg2 >> 8) >> 3;
            method206(arg0, field442, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lag;Lag;II)V", line = 117)
    private static final void method206(class123 arg0, class123 arg1, int arg2, int arg3) {
        int var4 = arg0.field4034 + arg2;
        int var5 = arg0.field4031 + arg3;
        int var6 = arg1.field4037 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4039;
        int var9 = arg0.field4037;
        int var10 = arg1.field4037 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4037 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4039) {
            int var13 = var5 + var8 + 1 - arg1.field4039;
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
        if (var4 + var9 >= arg1.field4037) {
            int var15 = var4 + var9 + 1 - arg1.field4037;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method204(arg1.field1853, arg0.field1853, var7, var6, var9, var8, var10, var11);
            method202(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lag;III)V", line = 177)
    public static final void method207(class123 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class109.field1630 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class109.field1633 * arg2 >> 8) >> 3;
            method214(arg0, field442, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "([B[BIIIIII)V", line = 188)
    private static final void method208(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V", line = 225)
    public static void method209() {
        field442 = null;
        field443 = null;
        field444 = (class153[][]) null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Lag;III)Z", line = 231)
    public static final boolean method210(class123 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class109.field1630 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class109.field1633 * arg2 >> 8) >> 3;
            return method213(arg0, field442, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V", line = 241)
    public static final void method211(int arg0, int arg1) {
        field440 = arg0 + 7 >> 3;
        field441 = arg1 + 7 >> 3;
        field442 = new class123(field440 * 128 + 2, field441 * 128 + 2, 0);
        field444 = new class153[field440][field441];
        for (int var2 = 0; var2 < field440; var2++) {
            for (int var3 = 0; var3 < field441; var3++) {
                field444[var2][var3] = new class153();
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V", line = 266)
    public static final void method212() {
        field442 = null;
        field443 = null;
        field444 = (class153[][]) null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lag;Lag;II)Z", line = 271)
    private static final boolean method213(class123 arg0, class123 arg1, int arg2, int arg3) {
        int var4 = arg0.field4034 + arg2;
        int var5 = arg0.field4031 + arg3;
        int var6 = arg1.field4037 * var5 + var4;
        int var7 = arg0.field4039;
        int var8 = arg0.field4037;
        int var9 = arg1.field4037 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field4037 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field4039) {
            int var11 = var5 + var7 + 1 - arg1.field4039;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field4037) {
            int var13 = var4 + var8 + 1 - arg1.field4037;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field4037 + var9;
            return method203(arg1.field1853, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Lag;Lag;II)V", line = 331)
    private static final void method214(class123 arg0, class123 arg1, int arg2, int arg3) {
        int var4 = arg0.field4034 + arg2;
        int var5 = arg0.field4031 + arg3;
        int var6 = arg1.field4037 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4039;
        int var9 = arg0.field4037;
        int var10 = arg1.field4037 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4037 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4039) {
            int var13 = var5 + var8 + 1 - arg1.field4039;
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
        if (var4 + var9 >= arg1.field4037) {
            int var15 = var4 + var9 + 1 - arg1.field4037;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method208(arg1.field1853, arg0.field1853, var7, var6, var9, var8, var10, var11);
            method202(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([B[BIIIII)V", line = 392)
    private static final void method215(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lag;Lag;IIIZ)V", line = 418)
    private static final void method216(class123 arg0, class123 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field4037 || arg3 + 16 >= arg1.field4039) {
            return;
        }
        int var6 = arg1.field4037 * arg3 + arg2;
        int var7 = arg1.field4037 - 16;
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
            method219(arg1.field1853, arg0.field1853, var8, var6, var7, var9, var10);
        } else {
            method215(arg1.field1853, arg0.field1853, var8, var6, var7, var9, var10);
        }
        method202(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII[[Z[[I)V", line = 466)
    public static final void method217(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class186.field2990;
        class186.method1281(1);
        class186.method1299(1);
        class186.method1287();
        class186.method1316(false);
        class188.method1328(0, 0, (byte) 121);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field440; var7++) {
            label52: for (int var8 = 0; var8 < field441; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class153 var11 = field444[var7][var8];
                                if (var11.field2341) {
                                    var11.method1065(field442, var7, var8);
                                    var11.field2341 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1067();
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
        class186.method1298();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZZIIIIII)V", line = 537)
    public static final void method218(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class109.field1630 * var11 >> 8) >> 3;
        int var14 = var12 - (class109.field1633 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method206(field443[1], field442, var13 + 1, var14 + 1);
        } else {
            method216(field443[arg0], field442, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "([B[BIIIII)V", line = 567)
    private static final void method219(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
}
