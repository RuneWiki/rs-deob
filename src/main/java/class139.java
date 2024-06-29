import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class139 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    private static int field2432;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    private static int field2434;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lrm;")
    public static class248 field2433;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[Lrm;")
    public static class248[] field2435;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[[Ldf;")
    public static class166[][] field2431;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lrm;III)V", line = 4)
    public static final void method963(class248 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class276.field4752 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class276.field4751 * arg2 >> 8) >> 3;
            method971(arg0, field2433, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([B[BIIIII)V", line = 16)
    private static final void method964(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lrm;Lrm;II)V", line = 43)
    private static final void method965(class248 arg0, class248 arg1, int arg2, int arg3) {
        int var4 = arg0.field2301 + arg2;
        int var5 = arg0.field2295 + arg3;
        int var6 = arg1.field2294 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2299;
        int var9 = arg0.field2294;
        int var10 = arg1.field2294 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2294 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2299) {
            int var13 = var5 + var8 + 1 - arg1.field2299;
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
        if (var4 + var9 >= arg1.field2294) {
            int var15 = var4 + var9 + 1 - arg1.field2294;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method968(arg1.field4376, arg0.field4376, var7, var6, var9, var8, var10, var11);
            method967(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZZIIIIII)V", line = 102)
    public static final void method966(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class276.field4752 * var11 >> 8) >> 3;
        int var14 = var12 - (class276.field4751 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method971(field2435[1], field2433, var13 + 1, var14 + 1);
        } else {
            method975(field2435[arg0], field2433, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V", line = 131)
    private static final void method967(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field2431[var8][var9].field2854 = true;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([B[BIIIIII)V", line = 162)
    private static final void method968(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!la", name = "b", descriptor = "([B[BIIIIII)V", line = 198)
    private static final void method969(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Lrm;III)Z", line = 234)
    public static final boolean method970(class248 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class276.field4752 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class276.field4751 * arg2 >> 8) >> 3;
            return method978(arg0, field2433, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Lrm;Lrm;II)V", line = 244)
    private static final void method971(class248 arg0, class248 arg1, int arg2, int arg3) {
        int var4 = arg0.field2301 + arg2;
        int var5 = arg0.field2295 + arg3;
        int var6 = arg1.field2294 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2299;
        int var9 = arg0.field2294;
        int var10 = arg1.field2294 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2294 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2299) {
            int var13 = var5 + var8 + 1 - arg1.field2299;
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
        if (var4 + var9 >= arg1.field2294) {
            int var15 = var4 + var9 + 1 - arg1.field2294;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method969(arg1.field4376, arg0.field4376, var7, var6, var9, var8, var10, var11);
            method967(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V", line = 303)
    public static final void method972(int arg0, int arg1) {
        field2432 = arg0 + 7 >> 3;
        field2434 = arg1 + 7 >> 3;
        field2433 = new class248(field2432 * 128 + 2, field2434 * 128 + 2, 0);
        field2431 = new class166[field2432][field2434];
        for (int var2 = 0; var2 < field2432; var2++) {
            for (int var3 = 0; var3 < field2434; var3++) {
                field2431[var2][var3] = new class166();
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(Lrm;III)V", line = 326)
    public static final void method973(class248 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class276.field4752 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class276.field4751 * arg2 >> 8) >> 3;
            method965(arg0, field2433, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([BIIIII)Z", line = 338)
    private static final boolean method974(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lrm;Lrm;IIIZ)V", line = 377)
    private static final void method975(class248 arg0, class248 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field2294 || arg3 + 16 >= arg1.field2299) {
            return;
        }
        int var6 = arg1.field2294 * arg3 + arg2;
        int var7 = arg1.field2294 - 16;
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
            method976(arg1.field4376, arg0.field4376, var8, var6, var7, var9, var10);
        } else {
            method964(arg1.field4376, arg0.field4376, var8, var6, var7, var9, var10);
        }
        method967(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "([B[BIIIII)V", line = 426)
    private static final void method976(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V", line = 452)
    public static void method977() {
        field2433 = null;
        field2435 = null;
        field2431 = (class166[][]) null;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(Lrm;Lrm;II)Z", line = 457)
    private static final boolean method978(class248 arg0, class248 arg1, int arg2, int arg3) {
        int var4 = arg0.field2301 + arg2;
        int var5 = arg0.field2295 + arg3;
        int var6 = arg1.field2294 * var5 + var4;
        int var7 = arg0.field2299;
        int var8 = arg0.field2294;
        int var9 = arg1.field2294 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field2294 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field2299) {
            int var11 = var5 + var7 + 1 - arg1.field2299;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field2294) {
            int var13 = var4 + var8 + 1 - arg1.field2294;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field2294 + var9;
            method967(var4, var5, var8, var7);
            return method974(arg1.field4376, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()V", line = 518)
    public static final void method979() {
        field2433 = null;
        field2435 = null;
        field2431 = (class166[][]) null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[[Z[[I)V", line = 524)
    public static final void method980(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class108.field1899;
        class108.method766(1);
        class108.method765(1);
        class108.method764();
        class108.method771(false);
        class257.method1832((byte) 91, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2432; var7++) {
            label52: for (int var8 = 0; var8 < field2434; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class166 var11 = field2431[var7][var8];
                                if (var11.field2854) {
                                    var11.method1138(field2433, var7, var8);
                                    var11.field2854 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1137();
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
        class108.method762();
    }
}
