import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class158 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    private static int field2588;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    private static int field2589;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Llj;")
    public static class5 field2591;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "[Llj;")
    public static class5[] field2587;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[[Lsj;")
    public static class168[][] field2590;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Llj;III)V", line = 5)
    public static final void method1119(class5 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class141.field2351 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class141.field2353 * arg2 >> 8) >> 3;
            method1123(arg0, field2591, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Llj;III)V", line = 16)
    public static final void method1120(class5 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class141.field2351 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class141.field2353 * arg2 >> 8) >> 3;
            method1124(arg0, field2591, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Llj;Llj;IIIZ)V", line = 26)
    private static final void method1121(class5 arg0, class5 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3162 || arg3 + 16 >= arg1.field3157) {
            return;
        }
        int var6 = arg1.field3162 * arg3 + arg2;
        int var7 = arg1.field3162 - 16;
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
            method1122(arg1.field59, arg0.field59, var8, var6, var7, var9, var10);
        } else {
            method1135(arg1.field59, arg0.field59, var8, var6, var7, var9, var10);
        }
        method1133(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([B[BIIIII)V", line = 76)
    private static final void method1122(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Llj;Llj;II)V", line = 103)
    private static final void method1123(class5 arg0, class5 arg1, int arg2, int arg3) {
        int var4 = arg0.field3165 + arg2;
        int var5 = arg0.field3171 + arg3;
        int var6 = arg1.field3162 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3157;
        int var9 = arg0.field3162;
        int var10 = arg1.field3162 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3162 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3157) {
            int var13 = var5 + var8 + 1 - arg1.field3157;
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
        if (var4 + var9 >= arg1.field3162) {
            int var15 = var4 + var9 + 1 - arg1.field3162;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1125(arg1.field59, arg0.field59, var7, var6, var9, var8, var10, var11);
            method1133(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Llj;Llj;II)V", line = 162)
    private static final void method1124(class5 arg0, class5 arg1, int arg2, int arg3) {
        int var4 = arg0.field3165 + arg2;
        int var5 = arg0.field3171 + arg3;
        int var6 = arg1.field3162 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3157;
        int var9 = arg0.field3162;
        int var10 = arg1.field3162 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3162 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3157) {
            int var13 = var5 + var8 + 1 - arg1.field3157;
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
        if (var4 + var9 >= arg1.field3162) {
            int var15 = var4 + var9 + 1 - arg1.field3162;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1128(arg1.field59, arg0.field59, var7, var6, var9, var8, var10, var11);
            method1133(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([B[BIIIIII)V", line = 222)
    private static final void method1125(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(Llj;III)Z", line = 257)
    public static final boolean method1126(class5 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class141.field2351 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class141.field2353 * arg2 >> 8) >> 3;
            return method1130(arg0, field2591, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V", line = 267)
    public static void method1127() {
        field2591 = null;
        field2587 = null;
        field2590 = (class168[][]) null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "([B[BIIIIII)V", line = 273)
    private static final void method1128(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII[[Z[[I)V", line = 309)
    public static final void method1129(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class55.field812;
        class55.method386(1);
        class55.method405(1);
        class55.method414();
        class55.method399(false);
        class131.method963(-12390, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2589; var7++) {
            label52: for (int var8 = 0; var8 < field2588; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class168 var11 = field2590[var7][var8];
                                if (var11.field2714) {
                                    var11.method1186(field2591, var7, var8);
                                    var11.field2714 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1188();
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
        class55.method418();
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(Llj;Llj;II)Z", line = 379)
    private static final boolean method1130(class5 arg0, class5 arg1, int arg2, int arg3) {
        int var4 = arg0.field3165 + arg2;
        int var5 = arg0.field3171 + arg3;
        int var6 = arg1.field3162 * var5 + var4;
        int var7 = arg0.field3157;
        int var8 = arg0.field3162;
        int var9 = arg1.field3162 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3162 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3157) {
            int var11 = var5 + var7 + 1 - arg1.field3157;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3162) {
            int var13 = var4 + var8 + 1 - arg1.field3162;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3162 + var9;
            method1133(var4, var5, var8, var7);
            return method1132(arg1.field59, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZZIIIIII)V", line = 440)
    public static final void method1131(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class141.field2351 * var11 >> 8) >> 3;
        int var14 = var12 - (class141.field2353 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1123(field2587[1], field2591, var13 + 1, var14 + 1);
        } else {
            method1121(field2587[arg0], field2591, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([BIIIII)Z", line = 469)
    private static final boolean method1132(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)V", line = 511)
    private static final void method1133(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field2590[var8][var9].field2714 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V", line = 538)
    public static final void method1134(int arg0, int arg1) {
        field2589 = arg0 + 7 >> 3;
        field2588 = arg1 + 7 >> 3;
        field2591 = new class5(field2589 * 128 + 2, field2588 * 128 + 2, 0);
        field2590 = new class168[field2589][field2588];
        for (int var2 = 0; var2 < field2589; var2++) {
            for (int var3 = 0; var3 < field2588; var3++) {
                field2590[var2][var3] = new class168();
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "([B[BIIIII)V", line = 563)
    private static final void method1135(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()V", line = 589)
    public static final void method1136() {
        field2591 = null;
        field2587 = null;
        field2590 = (class168[][]) null;
    }
}
