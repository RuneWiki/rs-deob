import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class125 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    private static int field1890;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    private static int field1894;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lhk;")
    public static class42 field1892;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[Lhk;")
    public static class42[] field1891;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[[Ljl;")
    public static class116[][] field1893;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lhk;Lhk;IIIZ)V", line = 5)
    private static final void method923(class42 arg0, class42 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field5047 || arg3 + 16 >= arg1.field5049) {
            return;
        }
        int var6 = arg1.field5047 * arg3 + arg2;
        int var7 = arg1.field5047 - 16;
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
            method933(arg1.field603, arg0.field603, var8, var6, var7, var9, var10);
        } else {
            method926(arg1.field603, arg0.field603, var8, var6, var7, var9, var10);
        }
        method934(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V", line = 52)
    public static void method924() {
        field1892 = null;
        field1891 = null;
        field1893 = (class116[][]) null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([B[BIIIIII)V", line = 58)
    private static final void method925(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([B[BIIIII)V", line = 95)
    private static final void method926(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lhk;Lhk;II)Z", line = 122)
    private static final boolean method927(class42 arg0, class42 arg1, int arg2, int arg3) {
        int var4 = arg0.field5044 + arg2;
        int var5 = arg0.field5045 + arg3;
        int var6 = arg1.field5047 * var5 + var4;
        int var7 = arg0.field5049;
        int var8 = arg0.field5047;
        int var9 = arg1.field5047 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field5047 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field5049) {
            int var11 = var5 + var7 + 1 - arg1.field5049;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field5047) {
            int var13 = var4 + var8 + 1 - arg1.field5047;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field5047 + var9;
            return method930(arg1.field603, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII[[Z[[I)V", line = 183)
    public static final void method928(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class73.field1051;
        class73.method519(1);
        class73.method548(1);
        class73.method552();
        class73.method544(false);
        class241.method1672(0, -123, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field1894; var7++) {
            label52: for (int var8 = 0; var8 < field1890; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class116 var11 = field1893[var7][var8];
                                if (var11.field1825) {
                                    var11.method891(field1892, var7, var8);
                                    var11.field1825 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method889();
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
        class73.method550();
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()V", line = 253)
    public static final void method929() {
        field1892 = null;
        field1891 = null;
        field1893 = (class116[][]) null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIIIII)Z", line = 259)
    private static final boolean method930(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lhk;III)Z", line = 298)
    public static final boolean method931(class42 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class179.field2850 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class179.field2846 * arg2 >> 8) >> 3;
            return method927(arg0, field1892, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V", line = 309)
    public static final void method932(int arg0, int arg1) {
        field1894 = arg0 + 7 >> 3;
        field1890 = arg1 + 7 >> 3;
        field1892 = new class42(field1894 * 128 + 2, field1890 * 128 + 2, 0);
        field1893 = new class116[field1894][field1890];
        for (int var2 = 0; var2 < field1894; var2++) {
            for (int var3 = 0; var3 < field1890; var3++) {
                field1893[var2][var3] = new class116();
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "([B[BIIIII)V", line = 334)
    private static final void method933(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V", line = 361)
    private static final void method934(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class116[] var9 = field1893[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field1825 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Lhk;Lhk;II)V", line = 388)
    private static final void method935(class42 arg0, class42 arg1, int arg2, int arg3) {
        int var4 = arg0.field5044 + arg2;
        int var5 = arg0.field5045 + arg3;
        int var6 = arg1.field5047 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field5049;
        int var9 = arg0.field5047;
        int var10 = arg1.field5047 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field5047 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field5049) {
            int var13 = var5 + var8 + 1 - arg1.field5049;
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
        if (var4 + var9 >= arg1.field5047) {
            int var15 = var4 + var9 + 1 - arg1.field5047;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method925(arg1.field603, arg0.field603, var7, var6, var9, var8, var10, var11);
            method934(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "([B[BIIIIII)V", line = 448)
    private static final void method936(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Lhk;III)V", line = 483)
    public static final void method937(class42 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class179.field2850 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class179.field2846 * arg2 >> 8) >> 3;
            method935(arg0, field1892, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(Lhk;III)V", line = 493)
    public static final void method938(class42 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class179.field2850 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class179.field2846 * arg2 >> 8) >> 3;
            method940(arg0, field1892, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZZIIIIII)V", line = 504)
    public static final void method939(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class179.field2850 * var11 >> 8) >> 3;
        int var14 = var12 - (class179.field2846 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method940(field1891[1], field1892, var13 + 1, var14 + 1);
        } else {
            method923(field1891[arg0], field1892, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(Lhk;Lhk;II)V", line = 534)
    private static final void method940(class42 arg0, class42 arg1, int arg2, int arg3) {
        int var4 = arg0.field5044 + arg2;
        int var5 = arg0.field5045 + arg3;
        int var6 = arg1.field5047 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field5049;
        int var9 = arg0.field5047;
        int var10 = arg1.field5047 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field5047 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field5049) {
            int var13 = var5 + var8 + 1 - arg1.field5049;
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
        if (var4 + var9 >= arg1.field5047) {
            int var15 = var4 + var9 + 1 - arg1.field5047;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method936(arg1.field603, arg0.field603, var7, var6, var9, var8, var10, var11);
            method934(var4, var5, var9, var8);
        }
    }
}
