import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class212 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    private static int field3613;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    private static int field3614;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lqb;")
    public static class95 field3611;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[Lqb;")
    public static class95[] field3610;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[[Lgj;")
    public static class218[][] field3612;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqb;III)V", line = 4)
    public static final void method1390(class95 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class59.field808 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class59.field817 * arg2 >> 8) >> 3;
            method1405(arg0, field3611, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII[[Z[[I)V", line = 17)
    public static final void method1391(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class167.field2806;
        class167.method1047(1);
        class167.method1055(1);
        class167.method1034();
        class167.method1044(false);
        class284.method1954(0, (byte) -75, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field3613; var7++) {
            label52: for (int var8 = 0; var8 < field3614; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class218 var11 = field3612[var7][var8];
                                if (var11.field3693) {
                                    var11.method1435(field3611, var7, var8);
                                    var11.field3693 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1437();
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
        class167.method1043();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)V", line = 88)
    private static final void method1392(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field3612[var8][var9].field3693 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([B[BIIIIII)V", line = 116)
    private static final void method1393(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIIIII)Z", line = 152)
    private static final boolean method1394(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "([B[BIIIIII)V", line = 192)
    private static final void method1395(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 227)
    public static final void method1396(int arg0, int arg1) {
        field3613 = arg0 + 7 >> 3;
        field3614 = arg1 + 7 >> 3;
        field3611 = new class95(field3613 * 128 + 2, field3614 * 128 + 2, 0);
        field3612 = new class218[field3613][field3614];
        for (int var2 = 0; var2 < field3613; var2++) {
            for (int var3 = 0; var3 < field3614; var3++) {
                field3612[var2][var3] = new class218();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lqb;III)Z", line = 250)
    public static final boolean method1397(class95 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class59.field808 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class59.field817 * arg2 >> 8) >> 3;
            return method1404(arg0, field3611, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZZIIIIII)V", line = 260)
    public static final void method1398(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class59.field808 * var11 >> 8) >> 3;
        int var14 = var12 - (class59.field817 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1401(field3610[1], field3611, var13 + 1, var14 + 1);
        } else {
            method1400(field3610[arg0], field3611, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V", line = 288)
    public static void method1399() {
        field3611 = null;
        field3610 = null;
        field3612 = (class218[][]) null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqb;Lqb;IIIZ)V", line = 293)
    private static final void method1400(class95 arg0, class95 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field1464 || arg3 + 16 >= arg1.field1465) {
            return;
        }
        int var6 = arg1.field1464 * arg3 + arg2;
        int var7 = arg1.field1464 - 16;
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
            method1406(arg1.field1596, arg0.field1596, var8, var6, var7, var9, var10);
        } else {
            method1403(arg1.field1596, arg0.field1596, var8, var6, var7, var9, var10);
        }
        method1392(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqb;Lqb;II)V", line = 340)
    private static final void method1401(class95 arg0, class95 arg1, int arg2, int arg3) {
        int var4 = arg0.field1474 + arg2;
        int var5 = arg0.field1470 + arg3;
        int var6 = arg1.field1464 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1465;
        int var9 = arg0.field1464;
        int var10 = arg1.field1464 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1464 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1465) {
            int var13 = var5 + var8 + 1 - arg1.field1465;
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
        if (var4 + var9 >= arg1.field1464) {
            int var15 = var4 + var9 + 1 - arg1.field1464;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1395(arg1.field1596, arg0.field1596, var7, var6, var9, var8, var10, var11);
            method1392(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lqb;III)V", line = 399)
    public static final void method1402(class95 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class59.field808 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class59.field817 * arg2 >> 8) >> 3;
            method1401(arg0, field3611, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([B[BIIIII)V", line = 411)
    private static final void method1403(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lqb;Lqb;II)Z", line = 437)
    private static final boolean method1404(class95 arg0, class95 arg1, int arg2, int arg3) {
        int var4 = arg0.field1474 + arg2;
        int var5 = arg0.field1470 + arg3;
        int var6 = arg1.field1464 * var5 + var4;
        int var7 = arg0.field1465;
        int var8 = arg0.field1464;
        int var9 = arg1.field1464 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field1464 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field1465) {
            int var11 = var5 + var7 + 1 - arg1.field1465;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field1464) {
            int var13 = var4 + var8 + 1 - arg1.field1464;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field1464 + var9;
            method1392(var4, var5, var8, var7);
            return method1394(arg1.field1596, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lqb;Lqb;II)V", line = 501)
    private static final void method1405(class95 arg0, class95 arg1, int arg2, int arg3) {
        int var4 = arg0.field1474 + arg2;
        int var5 = arg0.field1470 + arg3;
        int var6 = arg1.field1464 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1465;
        int var9 = arg0.field1464;
        int var10 = arg1.field1464 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1464 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1465) {
            int var13 = var5 + var8 + 1 - arg1.field1465;
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
        if (var4 + var9 >= arg1.field1464) {
            int var15 = var4 + var9 + 1 - arg1.field1464;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1393(arg1.field1596, arg0.field1596, var7, var6, var9, var8, var10, var11);
            method1392(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "([B[BIIIII)V", line = 562)
    private static final void method1406(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
}
