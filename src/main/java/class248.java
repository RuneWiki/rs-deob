import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class248 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    private static int field4290;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    private static int field4294;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lti;")
    public static class186 field4292;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[Lti;")
    public static class186[] field4291;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[[Lkj;")
    public static class246[][] field4293;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lti;Lti;IIIZ)V", line = 4)
    private static final void method1775(class186 arg0, class186 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3711 || arg3 + 16 >= arg1.field3718) {
            return;
        }
        int var6 = arg1.field3711 * arg3 + arg2;
        int var7 = arg1.field3711 - 16;
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
            method1778(arg1.field3139, arg0.field3139, var8, var6, var7, var9, var10);
        } else {
            method1790(arg1.field3139, arg0.field3139, var8, var6, var7, var9, var10);
        }
        method1783(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lti;Lti;II)Z", line = 51)
    private static final boolean method1776(class186 arg0, class186 arg1, int arg2, int arg3) {
        int var4 = arg0.field3720 + arg2;
        int var5 = arg0.field3709 + arg3;
        int var6 = arg1.field3711 * var5 + var4;
        int var7 = arg0.field3718;
        int var8 = arg0.field3711;
        int var9 = arg1.field3711 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3711 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3718) {
            int var11 = var5 + var7 + 1 - arg1.field3718;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3711) {
            int var13 = var4 + var8 + 1 - arg1.field3711;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3711 + var9;
            method1783(var4, var5, var8, var7);
            return method1788(arg1.field3139, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V", line = 114)
    public static final void method1777() {
        field4292 = null;
        field4291 = null;
        field4293 = (class246[][]) null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([B[BIIIII)V", line = 121)
    private static final void method1778(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([B[BIIIIII)V", line = 148)
    private static final void method1779(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()V", line = 183)
    public static void method1780() {
        field4292 = null;
        field4291 = null;
        field4293 = (class246[][]) null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "([B[BIIIIII)V", line = 189)
    private static final void method1781(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lti;III)Z", line = 224)
    public static final boolean method1782(class186 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class85.field1525 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class85.field1532 * arg2 >> 8) >> 3;
            return method1776(arg0, field4292, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V", line = 235)
    private static final void method1783(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field4293[var8][var9].field4262 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lti;III)V", line = 261)
    public static final void method1784(class186 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class85.field1525 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class85.field1532 * arg2 >> 8) >> 3;
            method1792(arg0, field4292, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Lti;III)V", line = 273)
    public static final void method1785(class186 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class85.field1525 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class85.field1532 * arg2 >> 8) >> 3;
            method1786(arg0, field4292, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lti;Lti;II)V", line = 283)
    private static final void method1786(class186 arg0, class186 arg1, int arg2, int arg3) {
        int var4 = arg0.field3720 + arg2;
        int var5 = arg0.field3709 + arg3;
        int var6 = arg1.field3711 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3718;
        int var9 = arg0.field3711;
        int var10 = arg1.field3711 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3711 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3718) {
            int var13 = var5 + var8 + 1 - arg1.field3718;
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
        if (var4 + var9 >= arg1.field3711) {
            int var15 = var4 + var9 + 1 - arg1.field3711;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1779(arg1.field3139, arg0.field3139, var7, var6, var9, var8, var10, var11);
            method1783(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII[[Z[[I)V", line = 343)
    public static final void method1787(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class147.field2479;
        class147.method1012(1);
        class147.method991(1);
        class147.method1000();
        class147.method997(false);
        class171.method1211(0, 0, false);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field4290; var7++) {
            label52: for (int var8 = 0; var8 < field4294; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class246 var11 = field4293[var7][var8];
                                if (var11.field4262) {
                                    var11.method1762(field4292, var7, var8);
                                    var11.field4262 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1760();
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
        class147.method1019();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([BIIIII)Z", line = 414)
    private static final boolean method1788(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZZIIIIII)V", line = 453)
    public static final void method1789(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class85.field1525 * var11 >> 8) >> 3;
        int var14 = var12 - (class85.field1532 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1792(field4291[1], field4292, var13 + 1, var14 + 1);
        } else {
            method1775(field4291[arg0], field4292, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "([B[BIIIII)V", line = 483)
    private static final void method1790(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 511)
    public static final void method1791(int arg0, int arg1) {
        field4290 = arg0 + 7 >> 3;
        field4294 = arg1 + 7 >> 3;
        field4292 = new class186(field4290 * 128 + 2, field4294 * 128 + 2, 0);
        field4293 = new class246[field4290][field4294];
        for (int var2 = 0; var2 < field4290; var2++) {
            for (int var3 = 0; var3 < field4294; var3++) {
                field4293[var2][var3] = new class246();
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Lti;Lti;II)V", line = 535)
    private static final void method1792(class186 arg0, class186 arg1, int arg2, int arg3) {
        int var4 = arg0.field3720 + arg2;
        int var5 = arg0.field3709 + arg3;
        int var6 = arg1.field3711 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3718;
        int var9 = arg0.field3711;
        int var10 = arg1.field3711 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3711 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3718) {
            int var13 = var5 + var8 + 1 - arg1.field3718;
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
        if (var4 + var9 >= arg1.field3711) {
            int var15 = var4 + var9 + 1 - arg1.field3711;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1781(arg1.field3139, arg0.field3139, var7, var6, var9, var8, var10, var11);
            method1783(var4, var5, var9, var8);
        }
    }
}
