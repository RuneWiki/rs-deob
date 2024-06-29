import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class134 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    private static int field1986;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    private static int field1988;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lla;")
    public static class178 field1989;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "[Lla;")
    public static class178[] field1985;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[[Lmh;")
    public static class254[][] field1987;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([B[BIIIIII)V", line = 5)
    private static final void method866(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BIIIII)Z", line = 41)
    private static final boolean method867(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 80)
    public static final void method868(int arg0, int arg1) {
        field1988 = arg0 + 7 >> 3;
        field1986 = arg1 + 7 >> 3;
        field1989 = new class178(field1988 * 128 + 2, field1986 * 128 + 2, 0);
        field1987 = new class254[field1988][field1986];
        for (int var2 = 0; var2 < field1988; var2++) {
            for (int var3 = 0; var3 < field1986; var3++) {
                field1987[var2][var3] = new class254();
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lla;III)Z", line = 105)
    public static final boolean method869(class178 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class293.field4944 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class293.field4952 * arg2 >> 8) >> 3;
            return method879(arg0, field1989, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lla;Lla;II)V", line = 118)
    private static final void method870(class178 arg0, class178 arg1, int arg2, int arg3) {
        int var4 = arg0.field1170 + arg2;
        int var5 = arg0.field1165 + arg3;
        int var6 = arg1.field1163 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1172;
        int var9 = arg0.field1163;
        int var10 = arg1.field1163 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1163 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1172) {
            int var13 = var5 + var8 + 1 - arg1.field1172;
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
        if (var4 + var9 >= arg1.field1163) {
            int var15 = var4 + var9 + 1 - arg1.field1163;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method882(arg1.field2704, arg0.field2704, var7, var6, var9, var8, var10, var11);
            method872(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V", line = 177)
    public static void method871() {
        field1989 = null;
        field1985 = null;
        field1987 = (class254[][]) null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V", line = 183)
    private static final void method872(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field1987[var8][var9].field4347 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lla;Lla;IIIZ)V", line = 209)
    private static final void method873(class178 arg0, class178 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field1163 || arg3 + 16 >= arg1.field1172) {
            return;
        }
        int var6 = arg1.field1163 * arg3 + arg2;
        int var7 = arg1.field1163 - 16;
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
            method874(arg1.field2704, arg0.field2704, var8, var6, var7, var9, var10);
        } else {
            method875(arg1.field2704, arg0.field2704, var8, var6, var7, var9, var10);
        }
        method872(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([B[BIIIII)V", line = 258)
    private static final void method874(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "([B[BIIIII)V", line = 286)
    private static final void method875(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lla;Lla;II)V", line = 312)
    private static final void method876(class178 arg0, class178 arg1, int arg2, int arg3) {
        int var4 = arg0.field1170 + arg2;
        int var5 = arg0.field1165 + arg3;
        int var6 = arg1.field1163 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1172;
        int var9 = arg0.field1163;
        int var10 = arg1.field1163 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1163 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1172) {
            int var13 = var5 + var8 + 1 - arg1.field1172;
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
        if (var4 + var9 >= arg1.field1163) {
            int var15 = var4 + var9 + 1 - arg1.field1163;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method866(arg1.field2704, arg0.field2704, var7, var6, var9, var8, var10, var11);
            method872(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lla;III)V", line = 371)
    public static final void method877(class178 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class293.field4944 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class293.field4952 * arg2 >> 8) >> 3;
            method876(arg0, field1989, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZZIIIIII)V", line = 381)
    public static final void method878(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class293.field4944 * var11 >> 8) >> 3;
        int var14 = var12 - (class293.field4952 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method876(field1985[1], field1989, var13 + 1, var14 + 1);
        } else {
            method873(field1985[arg0], field1989, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(Lla;Lla;II)Z", line = 409)
    private static final boolean method879(class178 arg0, class178 arg1, int arg2, int arg3) {
        int var4 = arg0.field1170 + arg2;
        int var5 = arg0.field1165 + arg3;
        int var6 = arg1.field1163 * var5 + var4;
        int var7 = arg0.field1172;
        int var8 = arg0.field1163;
        int var9 = arg1.field1163 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field1163 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field1172) {
            int var11 = var5 + var7 + 1 - arg1.field1172;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field1163) {
            int var13 = var4 + var8 + 1 - arg1.field1163;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field1163 + var9;
            method872(var4, var5, var8, var7);
            return method867(arg1.field2704, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII[[Z[[I)V", line = 471)
    public static final void method880(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class45.field688;
        class45.method330(1);
        class45.method305(1);
        class45.method326();
        class45.method314(false);
        class264.method1814(0, 0, (byte) 53);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field1988; var7++) {
            label52: for (int var8 = 0; var8 < field1986; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class254 var11 = field1987[var7][var8];
                                if (var11.field4347) {
                                    var11.method1780(field1989, var7, var8);
                                    var11.field4347 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1779();
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
        class45.method306();
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(Lla;III)V", line = 542)
    public static final void method881(class178 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class293.field4944 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class293.field4952 * arg2 >> 8) >> 3;
            method870(arg0, field1989, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "([B[BIIIIII)V", line = 553)
    private static final void method882(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
}
