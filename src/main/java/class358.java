import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class358 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    private static int field5674;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    private static int field5676;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lfe;")
    public static class270 field5677;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[Lfe;")
    public static class270[] field5673;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[[Lek;")
    public static class206[][] field5675;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lfe;Lfe;II)V", line = 4)
    private static final void method2460(class270 arg0, class270 arg1, int arg2, int arg3) {
        int var4 = arg0.field2362 + arg2;
        int var5 = arg0.field2365 + arg3;
        int var6 = arg1.field2366 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2361;
        int var9 = arg0.field2366;
        int var10 = arg1.field2366 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2366 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2361) {
            int var13 = var5 + var8 + 1 - arg1.field2361;
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
        if (var4 + var9 >= arg1.field2366) {
            int var15 = var4 + var9 + 1 - arg1.field2366;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method2462(arg1.field4255, arg0.field4255, var7, var6, var9, var8, var10, var11);
            method2464(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([B[BIIIIII)V", line = 64)
    private static final void method2461(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!km", name = "b", descriptor = "([B[BIIIIII)V", line = 100)
    private static final void method2462(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lfe;III)V", line = 135)
    public static final void method2463(class270 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class26.field305 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class26.field301 * arg2 >> 8) >> 3;
            method2460(arg0, field5677, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V", line = 146)
    private static final void method2464(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class206[] var9 = field5675[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field3122 = true;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Lfe;III)V", line = 172)
    public static final void method2465(class270 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class26.field305 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class26.field301 * arg2 >> 8) >> 3;
            method2470(arg0, field5677, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([B[BIIIII)V", line = 184)
    private static final void method2466(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BIIIII)Z", line = 211)
    private static final boolean method2467(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 250)
    public static void method2468() {
        field5677 = null;
        field5673 = null;
        field5675 = (class206[][]) null;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(Lfe;III)Z", line = 255)
    public static final boolean method2469(class270 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class26.field305 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class26.field301 * arg2 >> 8) >> 3;
            return method2473(arg0, field5677, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Lfe;Lfe;II)V", line = 265)
    private static final void method2470(class270 arg0, class270 arg1, int arg2, int arg3) {
        int var4 = arg0.field2362 + arg2;
        int var5 = arg0.field2365 + arg3;
        int var6 = arg1.field2366 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2361;
        int var9 = arg0.field2366;
        int var10 = arg1.field2366 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2366 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2361) {
            int var13 = var5 + var8 + 1 - arg1.field2361;
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
        if (var4 + var9 >= arg1.field2366) {
            int var15 = var4 + var9 + 1 - arg1.field2366;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method2461(arg1.field4255, arg0.field4255, var7, var6, var9, var8, var10, var11);
            method2464(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZZIIIIII)V", line = 324)
    public static final void method2471(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class26.field305 * var11 >> 8) >> 3;
        int var14 = var12 - (class26.field301 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method2470(field5673[1], field5677, var13 + 1, var14 + 1);
        } else {
            method2472(field5673[arg0], field5677, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lfe;Lfe;IIIZ)V", line = 354)
    private static final void method2472(class270 arg0, class270 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field2366 || arg3 + 16 >= arg1.field2361) {
            return;
        }
        int var6 = arg1.field2366 * arg3 + arg2;
        int var7 = arg1.field2366 - 16;
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
            method2474(arg1.field4255, arg0.field4255, var8, var6, var7, var9, var10);
        } else {
            method2466(arg1.field4255, arg0.field4255, var8, var6, var7, var9, var10);
        }
        method2464(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(Lfe;Lfe;II)Z", line = 401)
    private static final boolean method2473(class270 arg0, class270 arg1, int arg2, int arg3) {
        int var4 = arg0.field2362 + arg2;
        int var5 = arg0.field2365 + arg3;
        int var6 = arg1.field2366 * var5 + var4;
        int var7 = arg0.field2361;
        int var8 = arg0.field2366;
        int var9 = arg1.field2366 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field2366 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field2361) {
            int var11 = var5 + var7 + 1 - arg1.field2361;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field2366) {
            int var13 = var4 + var8 + 1 - arg1.field2366;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field2366 + var9;
            return method2467(arg1.field4255, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "([B[BIIIII)V", line = 467)
    private static final void method2474(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII[[Z[[I)V", line = 494)
    public static final void method2475(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class272.field4310;
        class272.method1961(1);
        class272.method1947(1);
        class272.method1926();
        class272.method1941(false);
        class11.method69(-105, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field5674; var7++) {
            label52: for (int var8 = 0; var8 < field5676; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class206 var11 = field5675[var7][var8];
                                if (var11.field3122) {
                                    var11.method1443(field5677, var7, var8);
                                    var11.field3122 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1441();
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
        class272.method1938();
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V", line = 564)
    public static final void method2476(int arg0, int arg1) {
        field5674 = arg0 + 7 >> 3;
        field5676 = arg1 + 7 >> 3;
        field5677 = new class270(field5674 * 128 + 2, field5676 * 128 + 2, 0);
        field5675 = new class206[field5674][field5676];
        for (int var2 = 0; var2 < field5674; var2++) {
            for (int var3 = 0; var3 < field5676; var3++) {
                field5675[var2][var3] = new class206();
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()V", line = 588)
    public static final void method2477() {
        field5677 = null;
        field5673 = null;
        field5675 = (class206[][]) null;
    }
}
