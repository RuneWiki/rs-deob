import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class238 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    private static int field4161;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    private static int field4163;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lt;")
    public static class257 field4164;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[Lt;")
    public static class257[] field4160;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[[Lhf;")
    public static class204[][] field4162;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII[[Z[[I)V", line = 5)
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class231.field4052;
        class231.method1589(1);
        class231.method1572(1);
        class231.method1580();
        class231.method1602(false);
        class59.method403(0, (byte) -79, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field4161; var7++) {
            label52: for (int var8 = 0; var8 < field4163; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class204 var11 = field4162[var7][var8];
                                if (var11.field3678) {
                                    var11.method1440(field4164, var7, var8);
                                    var11.field3678 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1438();
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
        class231.method1600();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lt;III)V", line = 77)
    public static final void method1640(class257 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class217.field3860 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class217.field3872 * arg2 >> 8) >> 3;
            method1645(arg0, field4164, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Lt;III)Z", line = 87)
    public static final boolean method1641(class257 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class217.field3860 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class217.field3872 * arg2 >> 8) >> 3;
            return method1654(arg0, field4164, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lt;Lt;IIIZ)V", line = 97)
    private static final void method1642(class257 arg0, class257 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field889 || arg3 + 16 >= arg1.field884) {
            return;
        }
        int var6 = arg1.field889 * arg3 + arg2;
        int var7 = arg1.field889 - 16;
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
            method1649(arg1.field4551, arg0.field4551, var8, var6, var7, var9, var10);
        } else {
            method1646(arg1.field4551, arg0.field4551, var8, var6, var7, var9, var10);
        }
        method1650(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([B[BIIIIII)V", line = 145)
    private static final void method1643(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BIIIII)Z", line = 181)
    private static final boolean method1644(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lt;Lt;II)V", line = 220)
    private static final void method1645(class257 arg0, class257 arg1, int arg2, int arg3) {
        int var4 = arg0.field878 + arg2;
        int var5 = arg0.field881 + arg3;
        int var6 = arg1.field889 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field884;
        int var9 = arg0.field889;
        int var10 = arg1.field889 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field889 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field884) {
            int var13 = var5 + var8 + 1 - arg1.field884;
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
        if (var4 + var9 >= arg1.field889) {
            int var15 = var4 + var9 + 1 - arg1.field889;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1643(arg1.field4551, arg0.field4551, var7, var6, var9, var8, var10, var11);
            method1650(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([B[BIIIII)V", line = 283)
    private static final void method1646(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V", line = 309)
    public static final void method1647(int arg0, int arg1) {
        field4161 = arg0 + 7 >> 3;
        field4163 = arg1 + 7 >> 3;
        field4164 = new class257(field4161 * 128 + 2, field4163 * 128 + 2, 0);
        field4162 = new class204[field4161][field4163];
        for (int var2 = 0; var2 < field4161; var2++) {
            for (int var3 = 0; var3 < field4163; var3++) {
                field4162[var2][var3] = new class204();
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Lt;Lt;II)V", line = 332)
    private static final void method1648(class257 arg0, class257 arg1, int arg2, int arg3) {
        int var4 = arg0.field878 + arg2;
        int var5 = arg0.field881 + arg3;
        int var6 = arg1.field889 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field884;
        int var9 = arg0.field889;
        int var10 = arg1.field889 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field889 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field884) {
            int var13 = var5 + var8 + 1 - arg1.field884;
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
        if (var4 + var9 >= arg1.field889) {
            int var15 = var4 + var9 + 1 - arg1.field889;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1653(arg1.field4551, arg0.field4551, var7, var6, var9, var8, var10, var11);
            method1650(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "([B[BIIIII)V", line = 393)
    private static final void method1649(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V", line = 422)
    private static final void method1650(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field4162[var8][var9].field3678 = true;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(Lt;III)V", line = 448)
    public static final void method1651(class257 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class217.field3860 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class217.field3872 * arg2 >> 8) >> 3;
            method1648(arg0, field4164, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V", line = 459)
    public static final void method1652() {
        field4164 = null;
        field4160 = null;
        field4162 = (class204[][]) null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "([B[BIIIIII)V", line = 465)
    private static final void method1653(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(Lt;Lt;II)Z", line = 500)
    private static final boolean method1654(class257 arg0, class257 arg1, int arg2, int arg3) {
        int var4 = arg0.field878 + arg2;
        int var5 = arg0.field881 + arg3;
        int var6 = arg1.field889 * var5 + var4;
        int var7 = arg0.field884;
        int var8 = arg0.field889;
        int var9 = arg1.field889 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field889 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field884) {
            int var11 = var5 + var7 + 1 - arg1.field884;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field889) {
            int var13 = var4 + var8 + 1 - arg1.field889;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field889 + var9;
            method1650(var4, var5, var8, var7);
            return method1644(arg1.field4551, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V", line = 561)
    public static void method1655() {
        field4164 = null;
        field4160 = null;
        field4162 = (class204[][]) null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZZIIIIII)V", line = 566)
    public static final void method1656(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class217.field3860 * var11 >> 8) >> 3;
        int var14 = var12 - (class217.field3872 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1645(field4160[1], field4164, var13 + 1, var14 + 1);
        } else {
            method1642(field4160[arg0], field4164, var13 + 1, var14 + 1, arg1, arg2);
        }
    }
}
