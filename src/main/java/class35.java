import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class35 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private static int field556;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    private static int field557;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ldm;")
    public static class273 field560;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[Ldm;")
    public static class273[] field559;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[[Lcb;")
    public static class270[][] field558;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V", line = 5)
    private static final void method194(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field558[var8][var9].field4639 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V", line = 31)
    public static final void method195() {
        field560 = null;
        field559 = null;
        field558 = (class270[][]) null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([B[BIIIII)V", line = 38)
    private static final void method196(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ldm;III)V", line = 65)
    public static final void method197(class273 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class272.field4684 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class272.field4694 * arg2 >> 8) >> 3;
            method206(arg0, field560, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([B[BIIIIII)V", line = 76)
    private static final void method198(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V", line = 111)
    public static void method199() {
        field560 = null;
        field559 = null;
        field558 = (class270[][]) null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII[[Z[[I)V", line = 117)
    public static final void method200(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class281.field4839;
        class281.method1964(1);
        class281.method1983(1);
        class281.method1960();
        class281.method1986(false);
        class256.method1795(0, 0, -536);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field557; var7++) {
            label52: for (int var8 = 0; var8 < field556; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class270 var11 = field558[var7][var8];
                                if (var11.field4639) {
                                    var11.method1878(field560, var7, var8);
                                    var11.field4639 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1876();
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
        class281.method1966();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZZIIIIII)V", line = 187)
    public static final void method201(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class272.field4684 * var11 >> 8) >> 3;
        int var14 = var12 - (class272.field4694 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method208(field559[1], field560, var13 + 1, var14 + 1);
        } else {
            method211(field559[arg0], field560, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ldm;Ldm;II)Z", line = 218)
    private static final boolean method202(class273 arg0, class273 arg1, int arg2, int arg3) {
        int var4 = arg0.field69 + arg2;
        int var5 = arg0.field68 + arg3;
        int var6 = arg1.field70 * var5 + var4;
        int var7 = arg0.field74;
        int var8 = arg0.field70;
        int var9 = arg1.field70 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field70 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field74) {
            int var11 = var5 + var7 + 1 - arg1.field74;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field70) {
            int var13 = var4 + var8 + 1 - arg1.field70;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field70 + var9;
            method194(var4, var5, var8, var7);
            return method205(arg1.field4696, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Ldm;III)Z", line = 279)
    public static final boolean method203(class273 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class272.field4684 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class272.field4694 * arg2 >> 8) >> 3;
            return method202(arg0, field560, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "([B[BIIIII)V", line = 291)
    private static final void method204(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIIIII)Z", line = 318)
    private static final boolean method205(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Ldm;Ldm;II)V", line = 357)
    private static final void method206(class273 arg0, class273 arg1, int arg2, int arg3) {
        int var4 = arg0.field69 + arg2;
        int var5 = arg0.field68 + arg3;
        int var6 = arg1.field70 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field74;
        int var9 = arg0.field70;
        int var10 = arg1.field70 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field70 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field74) {
            int var13 = var5 + var8 + 1 - arg1.field74;
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
        if (var4 + var9 >= arg1.field70) {
            int var15 = var4 + var9 + 1 - arg1.field70;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method198(arg1.field4696, arg0.field4696, var7, var6, var9, var8, var10, var11);
            method194(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "([B[BIIIIII)V", line = 420)
    private static final void method207(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Ldm;Ldm;II)V", line = 455)
    private static final void method208(class273 arg0, class273 arg1, int arg2, int arg3) {
        int var4 = arg0.field69 + arg2;
        int var5 = arg0.field68 + arg3;
        int var6 = arg1.field70 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field74;
        int var9 = arg0.field70;
        int var10 = arg1.field70 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field70 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field74) {
            int var13 = var5 + var8 + 1 - arg1.field74;
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
        if (var4 + var9 >= arg1.field70) {
            int var15 = var4 + var9 + 1 - arg1.field70;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method207(arg1.field4696, arg0.field4696, var7, var6, var9, var8, var10, var11);
            method194(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 514)
    public static final void method209(int arg0, int arg1) {
        field557 = arg0 + 7 >> 3;
        field556 = arg1 + 7 >> 3;
        field560 = new class273(field557 * 128 + 2, field556 * 128 + 2, 0);
        field558 = new class270[field557][field556];
        for (int var2 = 0; var2 < field557; var2++) {
            for (int var3 = 0; var3 < field556; var3++) {
                field558[var2][var3] = new class270();
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Ldm;III)V", line = 537)
    public static final void method210(class273 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class272.field4684 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class272.field4694 * arg2 >> 8) >> 3;
            method208(arg0, field560, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ldm;Ldm;IIIZ)V", line = 547)
    private static final void method211(class273 arg0, class273 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field70 || arg3 + 16 >= arg1.field74) {
            return;
        }
        int var6 = arg1.field70 * arg3 + arg2;
        int var7 = arg1.field70 - 16;
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
            method204(arg1.field4696, arg0.field4696, var8, var6, var7, var9, var10);
        } else {
            method196(arg1.field4696, arg0.field4696, var8, var6, var7, var9, var10);
        }
        method194(arg2, arg3, 16, 16);
    }
}
