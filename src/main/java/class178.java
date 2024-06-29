import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class178 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    private static int field2585;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    private static int field2586;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Ltb;")
    public static class234 field2584;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[Ltb;")
    public static class234[] field2583;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[[Lvj;")
    public static class114[][] field2582;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([B[BIIIII)V", line = 6)
    private static final void method1218(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ltb;III)V", line = 32)
    public static final void method1219(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class64.field829 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class64.field831 * arg2 >> 8) >> 3;
            method1225(arg0, field2584, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII[[Z[[I)V", line = 45)
    public static final void method1220(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class250.field3818;
        class250.method1797(1);
        class250.method1812(1);
        class250.method1834();
        class250.method1819(false);
        class262.method1886(0, 3, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2585; var7++) {
            label52: for (int var8 = 0; var8 < field2586; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class114 var11 = field2582[var7][var8];
                                if (var11.field1622) {
                                    var11.method779(field2584, var7, var8);
                                    var11.field1622 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method780();
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
        class250.method1800();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ltb;Ltb;IIIZ)V", line = 115)
    private static final void method1221(class234 arg0, class234 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field4743 || arg3 + 16 >= arg1.field4749) {
            return;
        }
        int var6 = arg1.field4743 * arg3 + arg2;
        int var7 = arg1.field4743 - 16;
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
            method1218(arg1.field3410, arg0.field3410, var8, var6, var7, var9, var10);
        } else {
            method1226(arg1.field3410, arg0.field3410, var8, var6, var7, var9, var10);
        }
        method1232(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ltb;Ltb;II)V", line = 162)
    private static final void method1222(class234 arg0, class234 arg1, int arg2, int arg3) {
        int var4 = arg0.field4748 + arg2;
        int var5 = arg0.field4751 + arg3;
        int var6 = arg1.field4743 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4749;
        int var9 = arg0.field4743;
        int var10 = arg1.field4743 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4743 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4749) {
            int var13 = var5 + var8 + 1 - arg1.field4749;
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
        if (var4 + var9 >= arg1.field4743) {
            int var15 = var4 + var9 + 1 - arg1.field4743;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1224(arg1.field3410, arg0.field3410, var7, var6, var9, var8, var10, var11);
            method1232(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 221)
    public static final void method1223() {
        field2584 = null;
        field2583 = null;
        field2582 = (class114[][]) null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([B[BIIIIII)V", line = 228)
    private static final void method1224(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Ltb;Ltb;II)V", line = 263)
    private static final void method1225(class234 arg0, class234 arg1, int arg2, int arg3) {
        int var4 = arg0.field4748 + arg2;
        int var5 = arg0.field4751 + arg3;
        int var6 = arg1.field4743 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field4749;
        int var9 = arg0.field4743;
        int var10 = arg1.field4743 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4743 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field4749) {
            int var13 = var5 + var8 + 1 - arg1.field4749;
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
        if (var4 + var9 >= arg1.field4743) {
            int var15 = var4 + var9 + 1 - arg1.field4743;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1235(arg1.field3410, arg0.field3410, var7, var6, var9, var8, var10, var11);
            method1232(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "([B[BIIIII)V", line = 325)
    private static final void method1226(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 351)
    public static final void method1227(int arg0, int arg1) {
        field2585 = arg0 + 7 >> 3;
        field2586 = arg1 + 7 >> 3;
        field2584 = new class234(field2585 * 128 + 2, field2586 * 128 + 2, 0);
        field2582 = new class114[field2585][field2586];
        for (int var2 = 0; var2 < field2585; var2++) {
            for (int var3 = 0; var3 < field2586; var3++) {
                field2582[var2][var3] = new class114();
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Ltb;III)V", line = 376)
    public static final void method1228(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class64.field829 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class64.field831 * arg2 >> 8) >> 3;
            method1222(arg0, field2584, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()V", line = 386)
    public static void method1229() {
        field2584 = null;
        field2583 = null;
        field2582 = (class114[][]) null;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Ltb;Ltb;II)Z", line = 391)
    private static final boolean method1230(class234 arg0, class234 arg1, int arg2, int arg3) {
        int var4 = arg0.field4748 + arg2;
        int var5 = arg0.field4751 + arg3;
        int var6 = arg1.field4743 * var5 + var4;
        int var7 = arg0.field4749;
        int var8 = arg0.field4743;
        int var9 = arg1.field4743 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field4743 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field4749) {
            int var11 = var5 + var7 + 1 - arg1.field4749;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field4743) {
            int var13 = var4 + var8 + 1 - arg1.field4743;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field4743 + var9;
            return method1231(arg1.field3410, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([BIIIII)Z", line = 452)
    private static final boolean method1231(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)V", line = 492)
    private static final void method1232(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class114[] var9 = field2582[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field1622 = true;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Ltb;III)Z", line = 518)
    public static final boolean method1233(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class64.field829 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class64.field831 * arg2 >> 8) >> 3;
            return method1230(arg0, field2584, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZZIIIIII)V", line = 528)
    public static final void method1234(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class64.field829 * var11 >> 8) >> 3;
        int var14 = var12 - (class64.field831 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1225(field2583[1], field2584, var13 + 1, var14 + 1);
        } else {
            method1221(field2583[arg0], field2584, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "([B[BIIIIII)V", line = 558)
    private static final void method1235(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
}
