import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class149 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    private static int field2399;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    private static int field2401;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lfo;")
    public static class239 field2398;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[Lfo;")
    public static class239[] field2402;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[[Ldf;")
    public static class184[][] field2400;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lfo;III)V", line = 5)
    public static final void method1059(class239 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class234.field3718 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class234.field3725 * arg2 >> 8) >> 3;
            method1069(arg0, field2398, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([B[BIIIII)V", line = 18)
    private static final void method1060(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Lfo;III)V", line = 46)
    public static final void method1061(class239 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class234.field3718 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class234.field3725 * arg2 >> 8) >> 3;
            method1068(arg0, field2398, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 56)
    public static void method1062() {
        field2398 = null;
        field2402 = null;
        field2400 = (class184[][]) null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 61)
    public static final void method1063() {
        field2398 = null;
        field2402 = null;
        field2400 = (class184[][]) null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([B[BIIIIII)V", line = 67)
    private static final void method1064(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lfo;Lfo;IIIZ)V", line = 102)
    private static final void method1065(class239 arg0, class239 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field2915 || arg3 + 16 >= arg1.field2913) {
            return;
        }
        int var6 = arg1.field2915 * arg3 + arg2;
        int var7 = arg1.field2915 - 16;
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
            method1060(arg1.field3776, arg0.field3776, var8, var6, var7, var9, var10);
        } else {
            method1076(arg1.field3776, arg0.field3776, var8, var6, var7, var9, var10);
        }
        method1067(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BIIIII)Z", line = 150)
    private static final boolean method1066(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V", line = 191)
    private static final void method1067(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class184[] var9 = field2400[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field2859 = true;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lfo;Lfo;II)V", line = 217)
    private static final void method1068(class239 arg0, class239 arg1, int arg2, int arg3) {
        int var4 = arg0.field2907 + arg2;
        int var5 = arg0.field2916 + arg3;
        int var6 = arg1.field2915 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2913;
        int var9 = arg0.field2915;
        int var10 = arg1.field2915 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2915 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2913) {
            int var13 = var5 + var8 + 1 - arg1.field2913;
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
        if (var4 + var9 >= arg1.field2915) {
            int var15 = var4 + var9 + 1 - arg1.field2915;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1064(arg1.field3776, arg0.field3776, var7, var6, var9, var8, var10, var11);
            method1067(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Lfo;Lfo;II)V", line = 276)
    private static final void method1069(class239 arg0, class239 arg1, int arg2, int arg3) {
        int var4 = arg0.field2907 + arg2;
        int var5 = arg0.field2916 + arg3;
        int var6 = arg1.field2915 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2913;
        int var9 = arg0.field2915;
        int var10 = arg1.field2915 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2915 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2913) {
            int var13 = var5 + var8 + 1 - arg1.field2913;
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
        if (var4 + var9 >= arg1.field2915) {
            int var15 = var4 + var9 + 1 - arg1.field2915;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1074(arg1.field3776, arg0.field3776, var7, var6, var9, var8, var10, var11);
            method1067(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V", line = 335)
    public static final void method1070(int arg0, int arg1) {
        field2399 = arg0 + 7 >> 3;
        field2401 = arg1 + 7 >> 3;
        field2398 = new class239(field2399 * 128 + 2, field2401 * 128 + 2, 0);
        field2400 = new class184[field2399][field2401];
        for (int var2 = 0; var2 < field2399; var2++) {
            for (int var3 = 0; var3 < field2401; var3++) {
                field2400[var2][var3] = new class184();
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Lfo;III)Z", line = 358)
    public static final boolean method1071(class239 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class234.field3718 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class234.field3725 * arg2 >> 8) >> 3;
            return method1075(arg0, field2398, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII[[Z[[I)V", line = 369)
    public static final void method1072(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class245.field3884;
        class245.method1721(1);
        class245.method1709(1);
        class245.method1710();
        class245.method1740(false);
        class7.method53(0, 0, true);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2399; var7++) {
            label52: for (int var8 = 0; var8 < field2401; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class184 var11 = field2400[var7][var8];
                                if (var11.field2859) {
                                    var11.method1276(field2398, var7, var8);
                                    var11.field2859 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1274();
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
        class245.method1723();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZZIIIIII)V", line = 439)
    public static final void method1073(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class234.field3718 * var11 >> 8) >> 3;
        int var14 = var12 - (class234.field3725 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1068(field2402[1], field2398, var13 + 1, var14 + 1);
        } else {
            method1065(field2402[arg0], field2398, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([B[BIIIIII)V", line = 469)
    private static final void method1074(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Lfo;Lfo;II)Z", line = 504)
    private static final boolean method1075(class239 arg0, class239 arg1, int arg2, int arg3) {
        int var4 = arg0.field2907 + arg2;
        int var5 = arg0.field2916 + arg3;
        int var6 = arg1.field2915 * var5 + var4;
        int var7 = arg0.field2913;
        int var8 = arg0.field2915;
        int var9 = arg1.field2915 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field2915 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field2913) {
            int var11 = var5 + var7 + 1 - arg1.field2913;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field2915) {
            int var13 = var4 + var8 + 1 - arg1.field2915;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field2915 + var9;
            return method1066(arg1.field3776, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([B[BIIIII)V", line = 566)
    private static final void method1076(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
