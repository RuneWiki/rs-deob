import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class24 {

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    private static int field347;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    private static int field349;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lwi;")
    public static class234 field346;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[Lwi;")
    public static class234[] field345;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "[[Lbl;")
    public static class182[][] field348;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lwi;Lwi;II)V", line = 5)
    private static final void method135(class234 arg0, class234 arg1, int arg2, int arg3) {
        int var4 = arg0.field3708 + arg2;
        int var5 = arg0.field3711 + arg3;
        int var6 = arg1.field3715 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3716;
        int var9 = arg0.field3715;
        int var10 = arg1.field3715 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3715 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3716) {
            int var13 = var5 + var8 + 1 - arg1.field3716;
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
        if (var4 + var9 >= arg1.field3715) {
            int var15 = var4 + var9 + 1 - arg1.field3715;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method138(arg1.field3528, arg0.field3528, var7, var6, var9, var8, var10, var11);
            method152(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[[Z[[I)V", line = 66)
    public static final void method136(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class141.field2025;
        class141.method986(1);
        class141.method1013(1);
        class141.method987();
        class141.method1021(false);
        class2.method9(0, 10691, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field347; var7++) {
            label52: for (int var8 = 0; var8 < field349; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class182 var11 = field348[var7][var8];
                                if (var11.field2625) {
                                    var11.method1263(field346, var7, var8);
                                    var11.field2625 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1262();
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
        class141.method983();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Lwi;Lwi;II)V", line = 136)
    private static final void method137(class234 arg0, class234 arg1, int arg2, int arg3) {
        int var4 = arg0.field3708 + arg2;
        int var5 = arg0.field3711 + arg3;
        int var6 = arg1.field3715 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3716;
        int var9 = arg0.field3715;
        int var10 = arg1.field3715 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3715 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3716) {
            int var13 = var5 + var8 + 1 - arg1.field3716;
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
        if (var4 + var9 >= arg1.field3715) {
            int var15 = var4 + var9 + 1 - arg1.field3715;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method141(arg1.field3528, arg0.field3528, var7, var6, var9, var8, var10, var11);
            method152(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([B[BIIIIII)V", line = 196)
    private static final void method138(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([B[BIIIII)V", line = 233)
    private static final void method139(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V", line = 259)
    public static void method140() {
        field346 = null;
        field345 = null;
        field348 = (class182[][]) null;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "([B[BIIIIII)V", line = 265)
    private static final void method141(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([BIIIII)Z", line = 301)
    private static final boolean method142(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()V", line = 343)
    public static final void method143() {
        field346 = null;
        field345 = null;
        field348 = (class182[][]) null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lwi;III)V", line = 348)
    public static final void method144(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class222.field3329 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class222.field3336 * arg2 >> 8) >> 3;
            method135(arg0, field346, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Lwi;III)Z", line = 358)
    public static final boolean method145(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class222.field3329 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class222.field3336 * arg2 >> 8) >> 3;
            return method151(arg0, field346, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Lwi;III)V", line = 368)
    public static final void method146(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class222.field3329 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class222.field3336 * arg2 >> 8) >> 3;
            method137(arg0, field346, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIZZIIIIII)V", line = 379)
    public static final void method147(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class222.field3329 * var11 >> 8) >> 3;
        int var14 = var12 - (class222.field3336 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method137(field345[1], field346, var13 + 1, var14 + 1);
        } else {
            method150(field345[arg0], field346, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 407)
    public static final void method148(int arg0, int arg1) {
        field347 = arg0 + 7 >> 3;
        field349 = arg1 + 7 >> 3;
        field346 = new class234(field347 * 128 + 2, field349 * 128 + 2, 0);
        field348 = new class182[field347][field349];
        for (int var2 = 0; var2 < field347; var2++) {
            for (int var3 = 0; var3 < field349; var3++) {
                field348[var2][var3] = new class182();
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "([B[BIIIII)V", line = 432)
    private static final void method149(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lwi;Lwi;IIIZ)V", line = 459)
    private static final void method150(class234 arg0, class234 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3715 || arg3 + 16 >= arg1.field3716) {
            return;
        }
        int var6 = arg1.field3715 * arg3 + arg2;
        int var7 = arg1.field3715 - 16;
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
            method149(arg1.field3528, arg0.field3528, var8, var6, var7, var9, var10);
        } else {
            method139(arg1.field3528, arg0.field3528, var8, var6, var7, var9, var10);
        }
        method152(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Lwi;Lwi;II)Z", line = 506)
    private static final boolean method151(class234 arg0, class234 arg1, int arg2, int arg3) {
        int var4 = arg0.field3708 + arg2;
        int var5 = arg0.field3711 + arg3;
        int var6 = arg1.field3715 * var5 + var4;
        int var7 = arg0.field3716;
        int var8 = arg0.field3715;
        int var9 = arg1.field3715 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3715 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3716) {
            int var11 = var5 + var7 + 1 - arg1.field3716;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3715) {
            int var13 = var4 + var8 + 1 - arg1.field3715;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3715 + var9;
            return method142(arg1.field3528, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V", line = 567)
    private static final void method152(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class182[] var9 = field348[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field2625 = true;
            }
        }
    }
}
