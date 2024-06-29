import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class168 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    private static int field2733;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    private static int field2734;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lfd;")
    public static class61 field2735;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[Lfd;")
    public static class61[] field2736;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[[Lil;")
    public static class28[][] field2732;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII[[Z[[I)V", line = 5)
    public static final void method1198(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class154.field2479;
        class154.method1115(1);
        class154.method1128(1);
        class154.method1107();
        class154.method1113(false);
        class135.method1024(0, 78, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2734; var7++) {
            label52: for (int var8 = 0; var8 < field2733; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class28 var11 = field2732[var7][var8];
                                if (var11.field357) {
                                    var11.method171(field2735, var7, var8);
                                    var11.field357 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method170();
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
        class154.method1122();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V", line = 75)
    public static final void method1199(int arg0, int arg1) {
        field2734 = arg0 + 7 >> 3;
        field2733 = arg1 + 7 >> 3;
        field2735 = new class61(field2734 * 128 + 2, field2733 * 128 + 2, 0);
        field2732 = new class28[field2734][field2733];
        for (int var2 = 0; var2 < field2734; var2++) {
            for (int var3 = 0; var3 < field2733; var3++) {
                field2732[var2][var3] = new class28();
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([B[BIIIII)V", line = 100)
    private static final void method1200(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V", line = 129)
    private static final void method1201(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field2732[var8][var9].field357 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lfd;III)V", line = 155)
    public static final void method1202(class61 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class179.field2861 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class179.field2853 * arg2 >> 8) >> 3;
            method1203(arg0, field2735, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lfd;Lfd;II)V", line = 165)
    private static final void method1203(class61 arg0, class61 arg1, int arg2, int arg3) {
        int var4 = arg0.field270 + arg2;
        int var5 = arg0.field265 + arg3;
        int var6 = arg1.field276 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field261;
        int var9 = arg0.field276;
        int var10 = arg1.field276 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field276 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field261) {
            int var13 = var5 + var8 + 1 - arg1.field261;
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
        if (var4 + var9 >= arg1.field276) {
            int var15 = var4 + var9 + 1 - arg1.field276;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1214(arg1.field880, arg0.field880, var7, var6, var9, var8, var10, var11);
            method1201(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lfd;III)V", line = 225)
    public static final void method1204(class61 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class179.field2861 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class179.field2853 * arg2 >> 8) >> 3;
            method1208(arg0, field2735, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Lfd;III)Z", line = 235)
    public static final boolean method1205(class61 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class179.field2861 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class179.field2853 * arg2 >> 8) >> 3;
            return method1212(arg0, field2735, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZZIIIIII)V", line = 246)
    public static final void method1206(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class179.field2861 * var11 >> 8) >> 3;
        int var14 = var12 - (class179.field2853 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1203(field2736[1], field2735, var13 + 1, var14 + 1);
        } else {
            method1207(field2736[arg0], field2735, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lfd;Lfd;IIIZ)V", line = 274)
    private static final void method1207(class61 arg0, class61 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field276 || arg3 + 16 >= arg1.field261) {
            return;
        }
        int var6 = arg1.field276 * arg3 + arg2;
        int var7 = arg1.field276 - 16;
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
            method1200(arg1.field880, arg0.field880, var8, var6, var7, var9, var10);
        } else {
            method1211(arg1.field880, arg0.field880, var8, var6, var7, var9, var10);
        }
        method1201(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lfd;Lfd;II)V", line = 321)
    private static final void method1208(class61 arg0, class61 arg1, int arg2, int arg3) {
        int var4 = arg0.field270 + arg2;
        int var5 = arg0.field265 + arg3;
        int var6 = arg1.field276 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field261;
        int var9 = arg0.field276;
        int var10 = arg1.field276 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field276 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field261) {
            int var13 = var5 + var8 + 1 - arg1.field261;
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
        if (var4 + var9 >= arg1.field276) {
            int var15 = var4 + var9 + 1 - arg1.field276;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1209(arg1.field880, arg0.field880, var7, var6, var9, var8, var10, var11);
            method1201(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([B[BIIIIII)V", line = 382)
    private static final void method1209(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V", line = 417)
    public static void method1210() {
        field2735 = null;
        field2736 = null;
        field2732 = (class28[][]) null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([B[BIIIII)V", line = 424)
    private static final void method1211(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Lfd;Lfd;II)Z", line = 450)
    private static final boolean method1212(class61 arg0, class61 arg1, int arg2, int arg3) {
        int var4 = arg0.field270 + arg2;
        int var5 = arg0.field265 + arg3;
        int var6 = arg1.field276 * var5 + var4;
        int var7 = arg0.field261;
        int var8 = arg0.field276;
        int var9 = arg1.field276 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field276 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field261) {
            int var11 = var5 + var7 + 1 - arg1.field261;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field276) {
            int var13 = var4 + var8 + 1 - arg1.field276;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field276 + var9;
            method1201(var4, var5, var8, var7);
            return method1213(arg1.field880, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIIIII)Z", line = 514)
    private static final boolean method1213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([B[BIIIIII)V", line = 554)
    private static final void method1214(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
}
