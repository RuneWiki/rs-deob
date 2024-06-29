import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class241 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    private static int field3821;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    private static int field3822;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Lrg;")
    public static class326 field3823;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[Lrg;")
    public static class326[] field3820;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[[Lbe;")
    public static class254[][] field3819;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lrg;III)V", line = 4)
    public static final void method1724(class326 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class87.field1207 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class87.field1205 * arg2 >> 8) >> 3;
            method1728(arg0, field3823, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZZIIIIII)V", line = 15)
    public static final void method1725(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class87.field1207 * var11 >> 8) >> 3;
        int var14 = var12 - (class87.field1205 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1728(field3820[1], field3823, var13 + 1, var14 + 1);
        } else {
            method1726(field3820[arg0], field3823, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lrg;Lrg;IIIZ)V", line = 48)
    private static final void method1726(class326 arg0, class326 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field4163 || arg3 + 16 >= arg1.field4155) {
            return;
        }
        int var6 = arg1.field4163 * arg3 + arg2;
        int var7 = arg1.field4163 - 16;
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
            method1729(arg1.field5044, arg0.field5044, var8, var6, var7, var9, var10);
        } else {
            method1736(arg1.field5044, arg0.field5044, var8, var6, var7, var9, var10);
        }
        method1733(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lrg;Lrg;II)V", line = 95)
    private static final void method1727(class326 arg0, class326 arg1, int arg2, int arg3) {
        int var4 = arg0.field4161 + arg2;
        int var5 = arg0.field4157 + arg3;
        int var6 = arg1.field4163 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4155;
        int var9 = arg0.field4163;
        int var10 = arg1.field4163 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4163 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4155) {
            int var13 = var5 + var8 + 1 - arg1.field4155;
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
        if (var4 + var9 >= arg1.field4163) {
            int var15 = var4 + var9 + 1 - arg1.field4163;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1739(arg1.field5044, arg0.field5044, var7, var6, var9, var8, var10, var11);
            method1733(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lrg;Lrg;II)V", line = 154)
    private static final void method1728(class326 arg0, class326 arg1, int arg2, int arg3) {
        int var4 = arg0.field4161 + arg2;
        int var5 = arg0.field4157 + arg3;
        int var6 = arg1.field4163 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4155;
        int var9 = arg0.field4163;
        int var10 = arg1.field4163 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4163 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4155) {
            int var13 = var5 + var8 + 1 - arg1.field4155;
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
        if (var4 + var9 >= arg1.field4163) {
            int var15 = var4 + var9 + 1 - arg1.field4163;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1730(arg1.field5044, arg0.field5044, var7, var6, var9, var8, var10, var11);
            method1733(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([B[BIIIII)V", line = 215)
    private static final void method1729(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([B[BIIIIII)V", line = 242)
    private static final void method1730(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([BIIIII)Z", line = 278)
    private static final boolean method1731(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lrg;III)Z", line = 317)
    public static final boolean method1732(class326 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class87.field1207 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class87.field1205 * arg2 >> 8) >> 3;
            return method1738(arg0, field3823, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)V", line = 328)
    private static final void method1733(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class254[] var9 = field3819[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field4047 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(Lrg;III)V", line = 355)
    public static final void method1734(class326 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class87.field1207 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class87.field1205 * arg2 >> 8) >> 3;
            method1727(arg0, field3823, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V", line = 365)
    public static void method1735() {
        field3823 = null;
        field3820 = null;
        field3819 = (class254[][]) null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([B[BIIIII)V", line = 372)
    private static final void method1736(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()V", line = 398)
    public static final void method1737() {
        field3823 = null;
        field3820 = null;
        field3819 = (class254[][]) null;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(Lrg;Lrg;II)Z", line = 403)
    private static final boolean method1738(class326 arg0, class326 arg1, int arg2, int arg3) {
        int var4 = arg0.field4161 + arg2;
        int var5 = arg0.field4157 + arg3;
        int var6 = arg1.field4163 * var5 + var4;
        int var7 = arg0.field4155;
        int var8 = arg0.field4163;
        int var9 = arg1.field4163 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field4163 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field4155) {
            int var11 = var5 + var7 + 1 - arg1.field4155;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field4163) {
            int var13 = var4 + var8 + 1 - arg1.field4163;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field4163 + var9;
            return method1731(arg1.field5044, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([B[BIIIIII)V", line = 464)
    private static final void method1739(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V", line = 499)
    public static final void method1740(int arg0, int arg1) {
        field3822 = arg0 + 7 >> 3;
        field3821 = arg1 + 7 >> 3;
        field3823 = new class326(field3822 * 128 + 2, field3821 * 128 + 2, 0);
        field3819 = new class254[field3822][field3821];
        for (int var2 = 0; var2 < field3822; var2++) {
            for (int var3 = 0; var3 < field3821; var3++) {
                field3819[var2][var3] = new class254();
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII[[Z[[I)V", line = 523)
    public static final void method1741(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class232.field3716;
        class232.method1677(1);
        class232.method1664(1);
        class232.method1654();
        class232.method1660(false);
        class179.method1343(0, 0, -3);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field3822; var7++) {
            label52: for (int var8 = 0; var8 < field3821; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class254 var11 = field3819[var7][var8];
                                if (var11.field4047) {
                                    var11.method1826(field3823, var7, var8);
                                    var11.field4047 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1824();
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
        class232.method1648();
    }
}
