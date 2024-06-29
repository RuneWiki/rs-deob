import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class48 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    private static int field893;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    private static int field894;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lan;")
    public static class315 field895;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[Lan;")
    public static class315[] field892;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[[Lgl;")
    public static class186[][] field891;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[BIIIIII)V", line = 5)
    private static final void method391(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[BIIIII)V", line = 42)
    private static final void method392(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII[[Z[[I)V", line = 69)
    public static final void method393(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class271.field4641;
        class271.method1974(1);
        class271.method1983(1);
        class271.method1953();
        class271.method1989(false);
        class140.method1033(0, 0, -5);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field894; var7++) {
            label52: for (int var8 = 0; var8 < field893; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class186 var11 = field891[var7][var8];
                                if (var11.field3102) {
                                    var11.method1454(field895, var7, var8);
                                    var11.field3102 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1453();
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
        class271.method1981();
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([B[BIIIIII)V", line = 141)
    private static final void method394(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lan;III)V", line = 178)
    public static final void method395(class315 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class231.field3855 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class231.field3860 * arg2 >> 8) >> 3;
            method407(arg0, field895, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V", line = 188)
    public static final void method396() {
        field895 = null;
        field892 = null;
        field891 = (class186[][]) null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lan;Lan;II)Z", line = 195)
    private static final boolean method397(class315 arg0, class315 arg1, int arg2, int arg3) {
        int var4 = arg0.field486 + arg2;
        int var5 = arg0.field490 + arg3;
        int var6 = arg1.field480 * var5 + var4;
        int var7 = arg0.field485;
        int var8 = arg0.field480;
        int var9 = arg1.field480 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field480 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field485) {
            int var11 = var5 + var7 + 1 - arg1.field485;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field480) {
            int var13 = var4 + var8 + 1 - arg1.field480;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field480 + var9;
            method408(var4, var5, var8, var7);
            return method406(arg1.field5355, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lan;Lan;II)V", line = 257)
    private static final void method398(class315 arg0, class315 arg1, int arg2, int arg3) {
        int var4 = arg0.field486 + arg2;
        int var5 = arg0.field490 + arg3;
        int var6 = arg1.field480 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field485;
        int var9 = arg0.field480;
        int var10 = arg1.field480 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field480 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field485) {
            int var13 = var5 + var8 + 1 - arg1.field485;
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
        if (var4 + var9 >= arg1.field480) {
            int var15 = var4 + var9 + 1 - arg1.field480;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method391(arg1.field5355, arg0.field5355, var7, var6, var9, var8, var10, var11);
            method408(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIZZIIIIII)V", line = 316)
    public static final void method399(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class231.field3855 * var11 >> 8) >> 3;
        int var14 = var12 - (class231.field3860 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method398(field892[1], field895, var13 + 1, var14 + 1);
        } else {
            method400(field892[arg0], field895, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lan;Lan;IIIZ)V", line = 344)
    private static final void method400(class315 arg0, class315 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field480 || arg3 + 16 >= arg1.field485) {
            return;
        }
        int var6 = arg1.field480 * arg3 + arg2;
        int var7 = arg1.field480 - 16;
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
            method402(arg1.field5355, arg0.field5355, var8, var6, var7, var9, var10);
        } else {
            method392(arg1.field5355, arg0.field5355, var8, var6, var7, var9, var10);
        }
        method408(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V", line = 391)
    public static final void method401(int arg0, int arg1) {
        field894 = arg0 + 7 >> 3;
        field893 = arg1 + 7 >> 3;
        field895 = new class315(field894 * 128 + 2, field893 * 128 + 2, 0);
        field891 = new class186[field894][field893];
        for (int var2 = 0; var2 < field894; var2++) {
            for (int var3 = 0; var3 < field893; var3++) {
                field891[var2][var3] = new class186();
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([B[BIIIII)V", line = 416)
    private static final void method402(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lan;III)Z", line = 442)
    public static final boolean method403(class315 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class231.field3855 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class231.field3860 * arg2 >> 8) >> 3;
            return method397(arg0, field895, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()V", line = 453)
    public static void method404() {
        field895 = null;
        field892 = null;
        field891 = (class186[][]) null;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Lan;III)V", line = 458)
    public static final void method405(class315 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class231.field3855 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class231.field3860 * arg2 >> 8) >> 3;
            method398(arg0, field895, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BIIIII)Z", line = 469)
    private static final boolean method406(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Lan;Lan;II)V", line = 508)
    private static final void method407(class315 arg0, class315 arg1, int arg2, int arg3) {
        int var4 = arg0.field486 + arg2;
        int var5 = arg0.field490 + arg3;
        int var6 = arg1.field480 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field485;
        int var9 = arg0.field480;
        int var10 = arg1.field480 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field480 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field485) {
            int var13 = var5 + var8 + 1 - arg1.field485;
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
        if (var4 + var9 >= arg1.field480) {
            int var15 = var4 + var9 + 1 - arg1.field480;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method394(arg1.field5355, arg0.field5355, var7, var6, var9, var8, var10, var11);
            method408(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V", line = 568)
    private static final void method408(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field891[var8][var9].field3102 = true;
            }
        }
    }
}
