import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class151 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    private static int field2131;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    private static int field2134;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lfe;")
    public static class153 field2132;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lfe;")
    public static class153[] field2130;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[[Lkc;")
    public static class2[][] field2133;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1155(int arg0, int arg1) {
        field2131 = arg0 + 7 >> 3;
        field2134 = arg1 + 7 >> 3;
        field2132 = new class153(field2131 * 128 + 2, field2134 * 128 + 2, 0);
        field2133 = new class2[field2131][field2134];
        for (int var2 = 0; var2 < field2131; var2++) {
            for (int var3 = 0; var3 < field2134; var3++) {
                field2133[var2][var3] = new class2();
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([B[BIIIII)V", line = 29)
    private static final void method1156(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZZIIIIII)V", line = 56)
    public static final void method1157(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class41.field518 * var11 >> 8) >> 3;
        int var14 = var12 - (class41.field511 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1169(field2130[1], field2132, var13 + 1, var14 + 1);
        } else {
            method1166(field2130[arg0], field2132, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([B[BIIIIII)V", line = 85)
    private static final void method1158(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "([B[BIIIIII)V", line = 121)
    private static final void method1159(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lfe;III)V", line = 156)
    public static final void method1160(class153 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class41.field518 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class41.field511 * arg2 >> 8) >> 3;
            method1168(arg0, field2132, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V", line = 167)
    public static final void method1161() {
        field2132 = null;
        field2130 = null;
        field2133 = (class2[][]) null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lfe;III)V", line = 172)
    public static final void method1162(class153 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class41.field518 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class41.field511 * arg2 >> 8) >> 3;
            method1169(arg0, field2132, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V", line = 182)
    public static void method1163() {
        field2132 = null;
        field2130 = null;
        field2133 = (class2[][]) null;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(Lfe;III)Z", line = 187)
    public static final boolean method1164(class153 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class41.field518 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class41.field511 * arg2 >> 8) >> 3;
            return method1167(arg0, field2132, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII[[Z[[I)V", line = 200)
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class47.field592;
        class47.method354(1);
        class47.method364(1);
        class47.method352();
        class47.method367(false);
        class255.method1781(0, 0, -54);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2131; var7++) {
            label52: for (int var8 = 0; var8 < field2134; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class2 var11 = field2133[var7][var8];
                                if (var11.field12) {
                                    var11.method5(field2132, var7, var8);
                                    var11.field12 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method6();
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
        class47.method375();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lfe;Lfe;IIIZ)V", line = 271)
    private static final void method1166(class153 arg0, class153 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field2024 || arg3 + 16 >= arg1.field2029) {
            return;
        }
        int var6 = arg1.field2024 * arg3 + arg2;
        int var7 = arg1.field2024 - 16;
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
            method1156(arg1.field2140, arg0.field2140, var8, var6, var7, var9, var10);
        } else {
            method1172(arg1.field2140, arg0.field2140, var8, var6, var7, var9, var10);
        }
        method1170(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lfe;Lfe;II)Z", line = 318)
    private static final boolean method1167(class153 arg0, class153 arg1, int arg2, int arg3) {
        int var4 = arg0.field2018 + arg2;
        int var5 = arg0.field2019 + arg3;
        int var6 = arg1.field2024 * var5 + var4;
        int var7 = arg0.field2029;
        int var8 = arg0.field2024;
        int var9 = arg1.field2024 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field2024 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field2029) {
            int var11 = var5 + var7 + 1 - arg1.field2029;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field2024) {
            int var13 = var4 + var8 + 1 - arg1.field2024;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field2024 + var9;
            return method1171(arg1.field2140, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lfe;Lfe;II)V", line = 378)
    private static final void method1168(class153 arg0, class153 arg1, int arg2, int arg3) {
        int var4 = arg0.field2018 + arg2;
        int var5 = arg0.field2019 + arg3;
        int var6 = arg1.field2024 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2029;
        int var9 = arg0.field2024;
        int var10 = arg1.field2024 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2024 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2029) {
            int var13 = var5 + var8 + 1 - arg1.field2029;
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
        if (var4 + var9 >= arg1.field2024) {
            int var15 = var4 + var9 + 1 - arg1.field2024;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1159(arg1.field2140, arg0.field2140, var7, var6, var9, var8, var10, var11);
            method1170(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(Lfe;Lfe;II)V", line = 437)
    private static final void method1169(class153 arg0, class153 arg1, int arg2, int arg3) {
        int var4 = arg0.field2018 + arg2;
        int var5 = arg0.field2019 + arg3;
        int var6 = arg1.field2024 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2029;
        int var9 = arg0.field2024;
        int var10 = arg1.field2024 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2024 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2029) {
            int var13 = var5 + var8 + 1 - arg1.field2029;
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
        if (var4 + var9 >= arg1.field2024) {
            int var15 = var4 + var9 + 1 - arg1.field2024;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1158(arg1.field2140, arg0.field2140, var7, var6, var9, var8, var10, var11);
            method1170(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V", line = 497)
    private static final void method1170(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class2[] var9 = field2133[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field12 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([BIIIII)Z", line = 524)
    private static final boolean method1171(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "([B[BIIIII)V", line = 567)
    private static final void method1172(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
}
