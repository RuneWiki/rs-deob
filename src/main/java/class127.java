import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class127 {

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    private static int field2119;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    private static int field2120;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Lkk;")
    public static class77 field2117;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "[Lkk;")
    public static class77[] field2118;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "[[Llb;")
    public static class69[][] field2116;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lkk;Lkk;II)Z", line = 5)
    private static final boolean method1094(class77 arg0, class77 arg1, int arg2, int arg3) {
        int var4 = arg0.field3831 + arg2;
        int var5 = arg0.field3828 + arg3;
        int var6 = arg1.field3827 * var5 + var4;
        int var7 = arg0.field3826;
        int var8 = arg0.field3827;
        int var9 = arg1.field3827 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3827 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3826) {
            int var11 = var5 + var7 + 1 - arg1.field3826;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3827) {
            int var13 = var4 + var8 + 1 - arg1.field3827;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3827 + var9;
            return method1100(arg1.field1124, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([B[BIIIIII)V", line = 66)
    private static final void method1095(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Lkk;Lkk;II)V", line = 102)
    private static final void method1096(class77 arg0, class77 arg1, int arg2, int arg3) {
        int var4 = arg0.field3831 + arg2;
        int var5 = arg0.field3828 + arg3;
        int var6 = arg1.field3827 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3826;
        int var9 = arg0.field3827;
        int var10 = arg1.field3827 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3827 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3826) {
            int var13 = var5 + var8 + 1 - arg1.field3826;
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
        if (var4 + var9 >= arg1.field3827) {
            int var15 = var4 + var9 + 1 - arg1.field3827;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1106(arg1.field1124, arg0.field1124, var7, var6, var9, var8, var10, var11);
            method1109(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)V", line = 163)
    public static final void method1097(int arg0, int arg1) {
        field2120 = arg0 + 7 >> 3;
        field2119 = arg1 + 7 >> 3;
        field2117 = new class77(field2120 * 128 + 2, field2119 * 128 + 2, 0);
        field2116 = new class69[field2120][field2119];
        for (int var2 = 0; var2 < field2120; var2++) {
            for (int var3 = 0; var3 < field2119; var3++) {
                field2116[var2][var3] = new class69();
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lkk;Lkk;IIIZ)V", line = 187)
    private static final void method1098(class77 arg0, class77 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3827 || arg3 + 16 >= arg1.field3826) {
            return;
        }
        int var6 = arg1.field3827 * arg3 + arg2;
        int var7 = arg1.field3827 - 16;
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
            method1103(arg1.field1124, arg0.field1124, var8, var6, var7, var9, var10);
        } else {
            method1105(arg1.field1124, arg0.field1124, var8, var6, var7, var9, var10);
        }
        method1109(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZZIIIIII)V", line = 234)
    public static final void method1099(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class103.field1539 * var11 >> 8) >> 3;
        int var14 = var12 - (class103.field1546 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1096(field2118[1], field2117, var13 + 1, var14 + 1);
        } else {
            method1098(field2118[arg0], field2117, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([BIIIII)Z", line = 263)
    private static final boolean method1100(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lkk;III)V", line = 302)
    public static final void method1101(class77 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class103.field1539 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class103.field1546 * arg2 >> 8) >> 3;
            method1111(arg0, field2117, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Lkk;III)V", line = 312)
    public static final void method1102(class77 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class103.field1539 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class103.field1546 * arg2 >> 8) >> 3;
            method1096(arg0, field2117, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([B[BIIIII)V", line = 324)
    private static final void method1103(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIII[[Z[[I)V", line = 351)
    public static final void method1104(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class240.field3771;
        class240.method1814(1);
        class240.method1806(1);
        class240.method1805();
        class240.method1801(false);
        class211.method1562(0, 0, -128);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2120; var7++) {
            label52: for (int var8 = 0; var8 < field2119; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class69 var11 = field2116[var7][var8];
                                if (var11.field1059) {
                                    var11.method667(field2117, var7, var8);
                                    var11.field1059 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method669();
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
        class240.method1812();
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "([B[BIIIII)V", line = 423)
    private static final void method1105(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!no", name = "b", descriptor = "([B[BIIIIII)V", line = 451)
    private static final void method1106(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(Lkk;III)Z", line = 486)
    public static final boolean method1107(class77 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class103.field1539 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class103.field1546 * arg2 >> 8) >> 3;
            return method1094(arg0, field2117, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()V", line = 496)
    public static void method1108() {
        field2117 = null;
        field2118 = null;
        field2116 = (class69[][]) null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIII)V", line = 502)
    private static final void method1109(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class69[] var9 = field2116[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field1059 = true;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "()V", line = 528)
    public static final void method1110() {
        field2117 = null;
        field2118 = null;
        field2116 = (class69[][]) null;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(Lkk;Lkk;II)V", line = 534)
    private static final void method1111(class77 arg0, class77 arg1, int arg2, int arg3) {
        int var4 = arg0.field3831 + arg2;
        int var5 = arg0.field3828 + arg3;
        int var6 = arg1.field3827 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3826;
        int var9 = arg0.field3827;
        int var10 = arg1.field3827 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3827 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3826) {
            int var13 = var5 + var8 + 1 - arg1.field3826;
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
        if (var4 + var9 >= arg1.field3827) {
            int var15 = var4 + var9 + 1 - arg1.field3827;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1095(arg1.field1124, arg0.field1124, var7, var6, var9, var8, var10, var11);
            method1109(var4, var5, var9, var8);
        }
    }
}
