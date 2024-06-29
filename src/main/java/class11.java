import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class11 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    private static int field111;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    private static int field113;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lbd;")
    public static class20 field112;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[Lbd;")
    public static class20[] field109;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[[Ldj;")
    public static class182[][] field110;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B[BIIIIII)V", line = 5)
    private static final void method68(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B[BIIIII)V", line = 43)
    private static final void method69(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lbd;Lbd;II)Z", line = 69)
    private static final boolean method70(class20 arg0, class20 arg1, int arg2, int arg3) {
        int var4 = arg0.field1168 + arg2;
        int var5 = arg0.field1165 + arg3;
        int var6 = arg1.field1166 * var5 + var4;
        int var7 = arg0.field1170;
        int var8 = arg0.field1166;
        int var9 = arg1.field1166 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field1166 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field1170) {
            int var11 = var5 + var7 + 1 - arg1.field1170;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field1166) {
            int var13 = var4 + var8 + 1 - arg1.field1166;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field1166 + var9;
            return method77(arg1.field268, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII[[Z[[I)V", line = 130)
    public static final void method71(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class333.field5160;
        class333.method2306(1);
        class333.method2285(1);
        class333.method2300();
        class333.method2308(false);
        class174.method1179(0, 0, (byte) 72);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field111; var7++) {
            label52: for (int var8 = 0; var8 < field113; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class182 var11 = field110[var7][var8];
                                if (var11.field2785) {
                                    var11.method1258(field112, var7, var8);
                                    var11.field2785 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1256();
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
        class333.method2309();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 200)
    public static final void method72(int arg0, int arg1) {
        field111 = arg0 + 7 >> 3;
        field113 = arg1 + 7 >> 3;
        field112 = new class20(field111 * 128 + 2, field113 * 128 + 2, 0);
        field110 = new class182[field111][field113];
        for (int var2 = 0; var2 < field111; var2++) {
            for (int var3 = 0; var3 < field113; var3++) {
                field110[var2][var3] = new class182();
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZZIIIIII)V", line = 224)
    public static final void method73(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class326.field5073 * var11 >> 8) >> 3;
        int var14 = var12 - (class326.field5066 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method74(field109[1], field112, var13 + 1, var14 + 1);
        } else {
            method82(field109[arg0], field112, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lbd;Lbd;II)V", line = 252)
    private static final void method74(class20 arg0, class20 arg1, int arg2, int arg3) {
        int var4 = arg0.field1168 + arg2;
        int var5 = arg0.field1165 + arg3;
        int var6 = arg1.field1166 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1170;
        int var9 = arg0.field1166;
        int var10 = arg1.field1166 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1166 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1170) {
            int var13 = var5 + var8 + 1 - arg1.field1170;
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
        if (var4 + var9 >= arg1.field1166) {
            int var15 = var4 + var9 + 1 - arg1.field1166;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method68(arg1.field268, arg0.field268, var7, var6, var9, var8, var10, var11);
            method79(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B[BIIIII)V", line = 313)
    private static final void method75(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lbd;III)Z", line = 339)
    public static final boolean method76(class20 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class326.field5073 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class326.field5066 * arg2 >> 8) >> 3;
            return method70(arg0, field112, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BIIIII)Z", line = 350)
    private static final boolean method77(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B[BIIIIII)V", line = 390)
    private static final void method78(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V", line = 428)
    private static final void method79(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class182[] var9 = field110[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field2785 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lbd;Lbd;II)V", line = 454)
    private static final void method80(class20 arg0, class20 arg1, int arg2, int arg3) {
        int var4 = arg0.field1168 + arg2;
        int var5 = arg0.field1165 + arg3;
        int var6 = arg1.field1166 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1170;
        int var9 = arg0.field1166;
        int var10 = arg1.field1166 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1166 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1170) {
            int var13 = var5 + var8 + 1 - arg1.field1170;
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
        if (var4 + var9 >= arg1.field1166) {
            int var15 = var4 + var9 + 1 - arg1.field1166;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method78(arg1.field268, arg0.field268, var7, var6, var9, var8, var10, var11);
            method79(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V", line = 513)
    public static final void method81() {
        field112 = null;
        field109 = null;
        field110 = (class182[][]) null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lbd;Lbd;IIIZ)V", line = 520)
    private static final void method82(class20 arg0, class20 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field1166 || arg3 + 16 >= arg1.field1170) {
            return;
        }
        int var6 = arg1.field1166 * arg3 + arg2;
        int var7 = arg1.field1166 - 16;
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
            method75(arg1.field268, arg0.field268, var8, var6, var7, var9, var10);
        } else {
            method69(arg1.field268, arg0.field268, var8, var6, var7, var9, var10);
        }
        method79(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lbd;III)V", line = 568)
    public static final void method83(class20 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class326.field5073 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class326.field5066 * arg2 >> 8) >> 3;
            method80(arg0, field112, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lbd;III)V", line = 578)
    public static final void method84(class20 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class326.field5073 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class326.field5066 * arg2 >> 8) >> 3;
            method74(arg0, field112, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()V", line = 588)
    public static void method85() {
        field112 = null;
        field109 = null;
        field110 = (class182[][]) null;
    }
}
