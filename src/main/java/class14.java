import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class14 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    private static int field220;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    private static int field223;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lta;")
    public static class217 field224;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "[Lta;")
    public static class217[] field221;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[[Lsh;")
    public static class314[][] field222;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lta;Lta;II)V", line = 4)
    private static final void method133(class217 arg0, class217 arg1, int arg2, int arg3) {
        int var4 = arg0.field4051 + arg2;
        int var5 = arg0.field4052 + arg3;
        int var6 = arg1.field4054 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4048;
        int var9 = arg0.field4054;
        int var10 = arg1.field4054 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4054 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4048) {
            int var13 = var5 + var8 + 1 - arg1.field4048;
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
        if (var4 + var9 >= arg1.field4054) {
            int var15 = var4 + var9 + 1 - arg1.field4054;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method135(arg1.field3623, arg0.field3623, var7, var6, var9, var8, var10, var11);
            method148(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lta;Lta;II)V", line = 63)
    private static final void method134(class217 arg0, class217 arg1, int arg2, int arg3) {
        int var4 = arg0.field4051 + arg2;
        int var5 = arg0.field4052 + arg3;
        int var6 = arg1.field4054 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4048;
        int var9 = arg0.field4054;
        int var10 = arg1.field4054 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4054 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4048) {
            int var13 = var5 + var8 + 1 - arg1.field4048;
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
        if (var4 + var9 >= arg1.field4054) {
            int var15 = var4 + var9 + 1 - arg1.field4054;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method149(arg1.field3623, arg0.field3623, var7, var6, var9, var8, var10, var11);
            method148(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([B[BIIIIII)V", line = 123)
    private static final void method135(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lta;III)V", line = 159)
    public static final void method136(class217 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class9.field114 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class9.field126 * arg2 >> 8) >> 3;
            method133(arg0, field224, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lta;Lta;IIIZ)V", line = 169)
    private static final void method137(class217 arg0, class217 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field4054 || arg3 + 16 >= arg1.field4048) {
            return;
        }
        int var6 = arg1.field4054 * arg3 + arg2;
        int var7 = arg1.field4054 - 16;
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
            method146(arg1.field3623, arg0.field3623, var8, var6, var7, var9, var10);
        } else {
            method150(arg1.field3623, arg0.field3623, var8, var6, var7, var9, var10);
        }
        method148(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V", line = 216)
    public static void method138() {
        field224 = null;
        field221 = null;
        field222 = (class314[][]) null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZZIIIIII)V", line = 221)
    public static final void method139(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class9.field114 * var11 >> 8) >> 3;
        int var14 = var12 - (class9.field126 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method133(field221[1], field224, var13 + 1, var14 + 1);
        } else {
            method137(field221[arg0], field224, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()V", line = 250)
    public static final void method140() {
        field224 = null;
        field221 = null;
        field222 = (class314[][]) null;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(Lta;Lta;II)Z", line = 255)
    private static final boolean method141(class217 arg0, class217 arg1, int arg2, int arg3) {
        int var4 = arg0.field4051 + arg2;
        int var5 = arg0.field4052 + arg3;
        int var6 = arg1.field4054 * var5 + var4;
        int var7 = arg0.field4048;
        int var8 = arg0.field4054;
        int var9 = arg1.field4054 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field4054 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field4048) {
            int var11 = var5 + var7 + 1 - arg1.field4048;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field4054) {
            int var13 = var4 + var8 + 1 - arg1.field4054;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field4054 + var9;
            return method147(arg1.field3623, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lta;III)Z", line = 315)
    public static final boolean method142(class217 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class9.field114 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class9.field126 * arg2 >> 8) >> 3;
            return method141(arg0, field224, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 325)
    public static final void method143(int arg0, int arg1) {
        field223 = arg0 + 7 >> 3;
        field220 = arg1 + 7 >> 3;
        field224 = new class217(field223 * 128 + 2, field220 * 128 + 2, 0);
        field222 = new class314[field223][field220];
        for (int var2 = 0; var2 < field223; var2++) {
            for (int var3 = 0; var3 < field220; var3++) {
                field222[var2][var3] = new class314();
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(Lta;III)V", line = 348)
    public static final void method144(class217 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class9.field114 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class9.field126 * arg2 >> 8) >> 3;
            method134(arg0, field224, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII[[Z[[I)V", line = 362)
    public static final void method145(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class43.field651;
        class43.method368(1);
        class43.method349(1);
        class43.method371();
        class43.method352(false);
        class83.method749(0, 0, 96);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field223; var7++) {
            label52: for (int var8 = 0; var8 < field220; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class314 var11 = field222[var7][var8];
                                if (var11.field4978) {
                                    var11.method2163(field224, var7, var8);
                                    var11.field4978 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method2166();
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
        class43.method362();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([B[BIIIII)V", line = 434)
    private static final void method146(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([BIIIII)Z", line = 461)
    private static final boolean method147(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V", line = 501)
    private static final void method148(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class314[] var9 = field222[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field4978 = true;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "([B[BIIIIII)V", line = 528)
    private static final void method149(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!se", name = "b", descriptor = "([B[BIIIII)V", line = 566)
    private static final void method150(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
}
