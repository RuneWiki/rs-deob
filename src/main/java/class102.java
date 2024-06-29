import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class102 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    private static int field1478;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    private static int field1479;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Leg;")
    public static class300 field1477;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[Leg;")
    public static class300[] field1476;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[[Lvc;")
    public static class190[][] field1475;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 4)
    public static final void method679() {
        field1477 = null;
        field1476 = null;
        field1475 = (class190[][]) null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Leg;III)V", line = 9)
    public static final void method680(class300 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class14.field192 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class14.field189 * arg2 >> 8) >> 3;
            method691(arg0, field1477, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([B[BIIIII)V", line = 21)
    private static final void method681(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([B[BIIIII)V", line = 49)
    private static final void method682(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V", line = 77)
    private static final void method683(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field1475[var8][var9].field3001 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Leg;III)V", line = 103)
    public static final void method684(class300 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class14.field192 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class14.field189 * arg2 >> 8) >> 3;
            method688(arg0, field1477, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([B[BIIIIII)V", line = 117)
    private static final void method685(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZZIIIIII)V", line = 153)
    public static final void method686(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class14.field192 * var11 >> 8) >> 3;
        int var14 = var12 - (class14.field189 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method688(field1476[1], field1477, var13 + 1, var14 + 1);
        } else {
            method693(field1476[arg0], field1477, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Leg;III)Z", line = 181)
    public static final boolean method687(class300 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class14.field192 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class14.field189 * arg2 >> 8) >> 3;
            return method696(arg0, field1477, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Leg;Leg;II)V", line = 191)
    private static final void method688(class300 arg0, class300 arg1, int arg2, int arg3) {
        int var4 = arg0.field3745 + arg2;
        int var5 = arg0.field3741 + arg3;
        int var6 = arg1.field3746 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3736;
        int var9 = arg0.field3746;
        int var10 = arg1.field3746 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3746 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3736) {
            int var13 = var5 + var8 + 1 - arg1.field3736;
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
        if (var4 + var9 >= arg1.field3746) {
            int var15 = var4 + var9 + 1 - arg1.field3746;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method685(arg1.field5195, arg0.field5195, var7, var6, var9, var8, var10, var11);
            method683(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[[Z[[I)V", line = 251)
    public static final void method689(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class217.field3551;
        class217.method1454(1);
        class217.method1475(1);
        class217.method1458();
        class217.method1469(false);
        class89.method587(0, 0, -55);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field1478; var7++) {
            label52: for (int var8 = 0; var8 < field1479; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class190 var11 = field1475[var7][var8];
                                if (var11.field3001) {
                                    var11.method1259(field1477, var7, var8);
                                    var11.field3001 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1262();
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
        class217.method1483();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([BIIIII)Z", line = 322)
    private static final boolean method690(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Leg;Leg;II)V", line = 361)
    private static final void method691(class300 arg0, class300 arg1, int arg2, int arg3) {
        int var4 = arg0.field3745 + arg2;
        int var5 = arg0.field3741 + arg3;
        int var6 = arg1.field3746 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3736;
        int var9 = arg0.field3746;
        int var10 = arg1.field3746 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3746 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3736) {
            int var13 = var5 + var8 + 1 - arg1.field3736;
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
        if (var4 + var9 >= arg1.field3746) {
            int var15 = var4 + var9 + 1 - arg1.field3746;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method695(arg1.field5195, arg0.field5195, var7, var6, var9, var8, var10, var11);
            method683(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 421)
    public static final void method692(int arg0, int arg1) {
        field1478 = arg0 + 7 >> 3;
        field1479 = arg1 + 7 >> 3;
        field1477 = new class300(field1478 * 128 + 2, field1479 * 128 + 2, 0);
        field1475 = new class190[field1478][field1479];
        for (int var2 = 0; var2 < field1478; var2++) {
            for (int var3 = 0; var3 < field1479; var3++) {
                field1475[var2][var3] = new class190();
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Leg;Leg;IIIZ)V", line = 444)
    private static final void method693(class300 arg0, class300 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3746 || arg3 + 16 >= arg1.field3736) {
            return;
        }
        int var6 = arg1.field3746 * arg3 + arg2;
        int var7 = arg1.field3746 - 16;
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
            method681(arg1.field5195, arg0.field5195, var8, var6, var7, var9, var10);
        } else {
            method682(arg1.field5195, arg0.field5195, var8, var6, var7, var9, var10);
        }
        method683(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V", line = 491)
    public static void method694() {
        field1477 = null;
        field1476 = null;
        field1475 = (class190[][]) null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([B[BIIIIII)V", line = 497)
    private static final void method695(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Leg;Leg;II)Z", line = 533)
    private static final boolean method696(class300 arg0, class300 arg1, int arg2, int arg3) {
        int var4 = arg0.field3745 + arg2;
        int var5 = arg0.field3741 + arg3;
        int var6 = arg1.field3746 * var5 + var4;
        int var7 = arg0.field3736;
        int var8 = arg0.field3746;
        int var9 = arg1.field3746 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3746 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3736) {
            int var11 = var5 + var7 + 1 - arg1.field3736;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3746) {
            int var13 = var4 + var8 + 1 - arg1.field3746;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3746 + var9;
            method683(var4, var5, var8, var7);
            return method690(arg1.field5195, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }
}
