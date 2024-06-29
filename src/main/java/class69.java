import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    private static int field1098;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    private static int field1099;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lnb;")
    public static class315 field1100;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "[Lnb;")
    public static class315[] field1097;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[[Lcf;")
    public static class131[][] field1101;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lnb;III)V", line = 4)
    public static final void method519(class315 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class97.field1614 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class97.field1612 * arg2 >> 8) >> 3;
            method524(arg0, field1100, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V", line = 14)
    public static final void method520(int arg0, int arg1) {
        field1098 = arg0 + 7 >> 3;
        field1099 = arg1 + 7 >> 3;
        field1100 = new class315(field1098 * 128 + 2, field1099 * 128 + 2, 0);
        field1101 = new class131[field1098][field1099];
        for (int var2 = 0; var2 < field1098; var2++) {
            for (int var3 = 0; var3 < field1099; var3++) {
                field1101[var2][var3] = new class131();
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([B[BIIIII)V", line = 39)
    private static final void method521(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lnb;Lnb;II)Z", line = 66)
    private static final boolean method522(class315 arg0, class315 arg1, int arg2, int arg3) {
        int var4 = arg0.field4262 + arg2;
        int var5 = arg0.field4267 + arg3;
        int var6 = arg1.field4264 * var5 + var4;
        int var7 = arg0.field4256;
        int var8 = arg0.field4264;
        int var9 = arg1.field4264 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field4264 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field4256) {
            int var11 = var5 + var7 + 1 - arg1.field4256;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field4264) {
            int var13 = var4 + var8 + 1 - arg1.field4264;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field4264 + var9;
            method525(var4, var5, var8, var7);
            return method526(arg1.field4925, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lnb;III)V", line = 129)
    public static final void method523(class315 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class97.field1614 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class97.field1612 * arg2 >> 8) >> 3;
            method536(arg0, field1100, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lnb;Lnb;II)V", line = 141)
    private static final void method524(class315 arg0, class315 arg1, int arg2, int arg3) {
        int var4 = arg0.field4262 + arg2;
        int var5 = arg0.field4267 + arg3;
        int var6 = arg1.field4264 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4256;
        int var9 = arg0.field4264;
        int var10 = arg1.field4264 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4264 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4256) {
            int var13 = var5 + var8 + 1 - arg1.field4256;
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
        if (var4 + var9 >= arg1.field4264) {
            int var15 = var4 + var9 + 1 - arg1.field4264;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method531(arg1.field4925, arg0.field4925, var7, var6, var9, var8, var10, var11);
            method525(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V", line = 201)
    private static final void method525(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field1101[var8][var9].field2109 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIIIII)Z", line = 229)
    private static final boolean method526(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V", line = 268)
    public static void method527() {
        field1100 = null;
        field1097 = null;
        field1101 = (class131[][]) null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V", line = 273)
    public static final void method528() {
        field1100 = null;
        field1097 = null;
        field1101 = (class131[][]) null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII[[Z[[I)V", line = 279)
    public static final void method529(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class265.field4099;
        class265.method1899(1);
        class265.method1898(1);
        class265.method1910();
        class265.method1892(false);
        class308.method2132(0, (byte) -28, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field1098; var7++) {
            label52: for (int var8 = 0; var8 < field1099; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class131 var11 = field1101[var7][var8];
                                if (var11.field2109) {
                                    var11.method998(field1100, var7, var8);
                                    var11.field2109 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1000();
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
        class265.method1893();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZZIIIIII)V", line = 349)
    public static final void method530(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class97.field1614 * var11 >> 8) >> 3;
        int var14 = var12 - (class97.field1612 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method536(field1097[1], field1100, var13 + 1, var14 + 1);
        } else {
            method534(field1097[arg0], field1100, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([B[BIIIIII)V", line = 378)
    private static final void method531(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lnb;III)Z", line = 413)
    public static final boolean method532(class315 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class97.field1614 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class97.field1612 * arg2 >> 8) >> 3;
            return method522(arg0, field1100, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "([B[BIIIIII)V", line = 424)
    private static final void method533(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lnb;Lnb;IIIZ)V", line = 459)
    private static final void method534(class315 arg0, class315 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field4264 || arg3 + 16 >= arg1.field4256) {
            return;
        }
        int var6 = arg1.field4264 * arg3 + arg2;
        int var7 = arg1.field4264 - 16;
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
            method521(arg1.field4925, arg0.field4925, var8, var6, var7, var9, var10);
        } else {
            method535(arg1.field4925, arg0.field4925, var8, var6, var7, var9, var10);
        }
        method525(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "([B[BIIIII)V", line = 508)
    private static final void method535(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lnb;Lnb;II)V", line = 534)
    private static final void method536(class315 arg0, class315 arg1, int arg2, int arg3) {
        int var4 = arg0.field4262 + arg2;
        int var5 = arg0.field4267 + arg3;
        int var6 = arg1.field4264 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4256;
        int var9 = arg0.field4264;
        int var10 = arg1.field4264 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4264 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4256) {
            int var13 = var5 + var8 + 1 - arg1.field4256;
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
        if (var4 + var9 >= arg1.field4264) {
            int var15 = var4 + var9 + 1 - arg1.field4264;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method533(arg1.field4925, arg0.field4925, var7, var6, var9, var8, var10, var11);
            method525(var4, var5, var9, var8);
        }
    }
}
