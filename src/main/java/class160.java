import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class160 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private static int field2901;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private static int field2902;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lg;")
    public static class158 field2904;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[Lg;")
    public static class158[] field2905;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[[Lei;")
    public static class193[][] field2903;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([B[BIIIIII)V", line = 5)
    private static final void method1254(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZZIIIIII)V", line = 41)
    public static final void method1255(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class219.field3872 * var11 >> 8) >> 3;
        int var14 = var12 - (class219.field3873 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1271(field2905[1], field2904, var13 + 1, var14 + 1);
        } else {
            method1264(field2905[arg0], field2904, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "([B[BIIIIII)V", line = 70)
    private static final void method1256(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 105)
    public static void method1257() {
        field2904 = null;
        field2905 = null;
        field2903 = (class193[][]) null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lg;Lg;II)V", line = 112)
    private static final void method1258(class158 arg0, class158 arg1, int arg2, int arg3) {
        int var4 = arg0.field1034 + arg2;
        int var5 = arg0.field1028 + arg3;
        int var6 = arg1.field1041 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1027;
        int var9 = arg0.field1041;
        int var10 = arg1.field1041 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1041 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1027) {
            int var13 = var5 + var8 + 1 - arg1.field1027;
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
        if (var4 + var9 >= arg1.field1041) {
            int var15 = var4 + var9 + 1 - arg1.field1041;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1256(arg1.field2891, arg0.field2891, var7, var6, var9, var8, var10, var11);
            method1270(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([B[BIIIII)V", line = 173)
    private static final void method1259(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "([B[BIIIII)V", line = 201)
    private static final void method1260(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lg;Lg;II)Z", line = 227)
    private static final boolean method1261(class158 arg0, class158 arg1, int arg2, int arg3) {
        int var4 = arg0.field1034 + arg2;
        int var5 = arg0.field1028 + arg3;
        int var6 = arg1.field1041 * var5 + var4;
        int var7 = arg0.field1027;
        int var8 = arg0.field1041;
        int var9 = arg1.field1041 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field1041 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field1027) {
            int var11 = var5 + var7 + 1 - arg1.field1027;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field1041) {
            int var13 = var4 + var8 + 1 - arg1.field1041;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field1041 + var9;
            method1270(var4, var5, var8, var7);
            return method1262(arg1.field2891, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BIIIII)Z", line = 291)
    private static final boolean method1262(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lg;III)V", line = 330)
    public static final void method1263(class158 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class219.field3872 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class219.field3873 * arg2 >> 8) >> 3;
            method1271(arg0, field2904, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lg;Lg;IIIZ)V", line = 340)
    private static final void method1264(class158 arg0, class158 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field1041 || arg3 + 16 >= arg1.field1027) {
            return;
        }
        int var6 = arg1.field1041 * arg3 + arg2;
        int var7 = arg1.field1041 - 16;
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
            method1260(arg1.field2891, arg0.field2891, var8, var6, var7, var9, var10);
        } else {
            method1259(arg1.field2891, arg0.field2891, var8, var6, var7, var9, var10);
        }
        method1270(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V", line = 387)
    public static final void method1265() {
        field2904 = null;
        field2905 = null;
        field2903 = (class193[][]) null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V", line = 392)
    public static final void method1266(int arg0, int arg1) {
        field2902 = arg0 + 7 >> 3;
        field2901 = arg1 + 7 >> 3;
        field2904 = new class158(field2902 * 128 + 2, field2901 * 128 + 2, 0);
        field2903 = new class193[field2902][field2901];
        for (int var2 = 0; var2 < field2902; var2++) {
            for (int var3 = 0; var3 < field2901; var3++) {
                field2903[var2][var3] = new class193();
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lg;III)V", line = 416)
    public static final void method1267(class158 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class219.field3872 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class219.field3873 * arg2 >> 8) >> 3;
            method1258(arg0, field2904, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII[[Z[[I)V", line = 427)
    public static final void method1268(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class97.field1801;
        class97.method835(1);
        class97.method811(1);
        class97.method829();
        class97.method818(false);
        class162.method1279(0, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2902; var7++) {
            label52: for (int var8 = 0; var8 < field2901; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class193 var11 = field2903[var7][var8];
                                if (var11.field3477) {
                                    var11.method1454(field2904, var7, var8);
                                    var11.field3477 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1453();
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
        class97.method808();
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(Lg;III)Z", line = 497)
    public static final boolean method1269(class158 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class219.field3872 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class219.field3873 * arg2 >> 8) >> 3;
            return method1261(arg0, field2904, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V", line = 508)
    private static final void method1270(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field2903[var8][var9].field3477 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(Lg;Lg;II)V", line = 535)
    private static final void method1271(class158 arg0, class158 arg1, int arg2, int arg3) {
        int var4 = arg0.field1034 + arg2;
        int var5 = arg0.field1028 + arg3;
        int var6 = arg1.field1041 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1027;
        int var9 = arg0.field1041;
        int var10 = arg1.field1041 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1041 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1027) {
            int var13 = var5 + var8 + 1 - arg1.field1027;
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
        if (var4 + var9 >= arg1.field1041) {
            int var15 = var4 + var9 + 1 - arg1.field1041;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1254(arg1.field2891, arg0.field2891, var7, var6, var9, var8, var10, var11);
            method1270(var4, var5, var9, var8);
        }
    }
}
