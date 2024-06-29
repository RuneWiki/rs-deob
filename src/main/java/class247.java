import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class247 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    private static int field3712;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    private static int field3715;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lom;")
    public static class70 field3714;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[Lom;")
    public static class70[] field3713;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[[Lkf;")
    public static class223[][] field3711;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 5)
    private static final void method1704(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field3711[var8][var9].field3488 = true;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V", line = 33)
    public static void method1705() {
        field3714 = null;
        field3713 = null;
        field3711 = (class223[][]) null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BIIIII)Z", line = 39)
    private static final boolean method1706(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([B[BIIIIII)V", line = 81)
    private static final void method1707(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lom;Lom;IIIZ)V", line = 116)
    private static final void method1708(class70 arg0, class70 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field4579 || arg3 + 16 >= arg1.field4595) {
            return;
        }
        int var6 = arg1.field4579 * arg3 + arg2;
        int var7 = arg1.field4579 - 16;
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
            method1714(arg1.field1021, arg0.field1021, var8, var6, var7, var9, var10);
        } else {
            method1715(arg1.field1021, arg0.field1021, var8, var6, var7, var9, var10);
        }
        method1704(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII[[Z[[I)V", line = 164)
    public static final void method1709(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class36.field518;
        class36.method313(1);
        class36.method314(1);
        class36.method320();
        class36.method337(false);
        class309.method2143(0, -109, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field3715; var7++) {
            label52: for (int var8 = 0; var8 < field3712; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class223 var11 = field3711[var7][var8];
                                if (var11.field3488) {
                                    var11.method1593(field3714, var7, var8);
                                    var11.field3488 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1594();
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
        class36.method311();
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([B[BIIIIII)V", line = 235)
    private static final void method1710(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lom;Lom;II)V", line = 270)
    private static final void method1711(class70 arg0, class70 arg1, int arg2, int arg3) {
        int var4 = arg0.field4589 + arg2;
        int var5 = arg0.field4583 + arg3;
        int var6 = arg1.field4579 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4595;
        int var9 = arg0.field4579;
        int var10 = arg1.field4579 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4579 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4595) {
            int var13 = var5 + var8 + 1 - arg1.field4595;
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
        if (var4 + var9 >= arg1.field4579) {
            int var15 = var4 + var9 + 1 - arg1.field4579;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1707(arg1.field1021, arg0.field1021, var7, var6, var9, var8, var10, var11);
            method1704(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lom;III)V", line = 329)
    public static final void method1712(class70 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class264.field3946 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class264.field3945 * arg2 >> 8) >> 3;
            method1717(arg0, field3714, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 339)
    public static final void method1713(int arg0, int arg1) {
        field3715 = arg0 + 7 >> 3;
        field3712 = arg1 + 7 >> 3;
        field3714 = new class70(field3715 * 128 + 2, field3712 * 128 + 2, 0);
        field3711 = new class223[field3715][field3712];
        for (int var2 = 0; var2 < field3715; var2++) {
            for (int var3 = 0; var3 < field3712; var3++) {
                field3711[var2][var3] = new class223();
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([B[BIIIII)V", line = 364)
    private static final void method1714(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([B[BIIIII)V", line = 392)
    private static final void method1715(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZZIIIIII)V", line = 418)
    public static final void method1716(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class264.field3946 * var11 >> 8) >> 3;
        int var14 = var12 - (class264.field3945 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1717(field3713[1], field3714, var13 + 1, var14 + 1);
        } else {
            method1708(field3713[arg0], field3714, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lom;Lom;II)V", line = 447)
    private static final void method1717(class70 arg0, class70 arg1, int arg2, int arg3) {
        int var4 = arg0.field4589 + arg2;
        int var5 = arg0.field4583 + arg3;
        int var6 = arg1.field4579 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4595;
        int var9 = arg0.field4579;
        int var10 = arg1.field4579 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4579 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4595) {
            int var13 = var5 + var8 + 1 - arg1.field4595;
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
        if (var4 + var9 >= arg1.field4579) {
            int var15 = var4 + var9 + 1 - arg1.field4579;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1710(arg1.field1021, arg0.field1021, var7, var6, var9, var8, var10, var11);
            method1704(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Lom;Lom;II)Z", line = 506)
    private static final boolean method1718(class70 arg0, class70 arg1, int arg2, int arg3) {
        int var4 = arg0.field4589 + arg2;
        int var5 = arg0.field4583 + arg3;
        int var6 = arg1.field4579 * var5 + var4;
        int var7 = arg0.field4595;
        int var8 = arg0.field4579;
        int var9 = arg1.field4579 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field4579 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field4595) {
            int var11 = var5 + var7 + 1 - arg1.field4595;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field4579) {
            int var13 = var4 + var8 + 1 - arg1.field4579;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field4579 + var9;
            method1704(var4, var5, var8, var7);
            return method1706(arg1.field1021, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lom;III)V", line = 568)
    public static final void method1719(class70 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class264.field3946 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class264.field3945 * arg2 >> 8) >> 3;
            method1711(arg0, field3714, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Lom;III)Z", line = 579)
    public static final boolean method1720(class70 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class264.field3946 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class264.field3945 * arg2 >> 8) >> 3;
            return method1718(arg0, field3714, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V", line = 589)
    public static final void method1721() {
        field3714 = null;
        field3713 = null;
        field3711 = (class223[][]) null;
    }
}
