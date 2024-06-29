import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class295 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    private static int field4712;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    private static int field4715;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lwk;")
    public static class186 field4716;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[Lwk;")
    public static class186[] field4714;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[[Lhf;")
    public static class215[][] field4713;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII[[Z[[I)V", line = 5)
    public static final void method2071(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class162.field2654;
        class162.method1206(1);
        class162.method1211(1);
        class162.method1214();
        class162.method1205(false);
        class102.method830(0, 14804, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field4715; var7++) {
            label52: for (int var8 = 0; var8 < field4712; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class215 var11 = field4713[var7][var8];
                                if (var11.field3349) {
                                    var11.method1561(field4716, var7, var8);
                                    var11.field3349 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1558();
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
        class162.method1199();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 76)
    public static final void method2072(int arg0, int arg1) {
        field4715 = arg0 + 7 >> 3;
        field4712 = arg1 + 7 >> 3;
        field4716 = new class186(field4715 * 128 + 2, field4712 * 128 + 2, 0);
        field4713 = new class215[field4715][field4712];
        for (int var2 = 0; var2 < field4715; var2++) {
            for (int var3 = 0; var3 < field4712; var3++) {
                field4713[var2][var3] = new class215();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lwk;Lwk;II)V", line = 99)
    private static final void method2073(class186 arg0, class186 arg1, int arg2, int arg3) {
        int var4 = arg0.field3063 + arg2;
        int var5 = arg0.field3067 + arg3;
        int var6 = arg1.field3065 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3064;
        int var9 = arg0.field3065;
        int var10 = arg1.field3065 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3065 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3064) {
            int var13 = var5 + var8 + 1 - arg1.field3064;
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
        if (var4 + var9 >= arg1.field3065) {
            int var15 = var4 + var9 + 1 - arg1.field3065;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method2080(arg1.field2939, arg0.field2939, var7, var6, var9, var8, var10, var11);
            method2076(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([B[BIIIIII)V", line = 159)
    private static final void method2074(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lwk;III)V", line = 194)
    public static final void method2075(class186 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class261.field3881 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class261.field3882 * arg2 >> 8) >> 3;
            method2073(arg0, field4716, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V", line = 205)
    private static final void method2076(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class215[] var9 = field4713[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field3349 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BIIIII)Z", line = 232)
    private static final boolean method2077(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZZIIIIII)V", line = 272)
    public static final void method2078(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class261.field3881 * var11 >> 8) >> 3;
        int var14 = var12 - (class261.field3882 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method2081(field4714[1], field4716, var13 + 1, var14 + 1);
        } else {
            method2088(field4714[arg0], field4716, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 300)
    public static void method2079() {
        field4716 = null;
        field4714 = null;
        field4713 = (class215[][]) null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "([B[BIIIIII)V", line = 306)
    private static final void method2080(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lwk;Lwk;II)V", line = 342)
    private static final void method2081(class186 arg0, class186 arg1, int arg2, int arg3) {
        int var4 = arg0.field3063 + arg2;
        int var5 = arg0.field3067 + arg3;
        int var6 = arg1.field3065 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3064;
        int var9 = arg0.field3065;
        int var10 = arg1.field3065 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3065 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3064) {
            int var13 = var5 + var8 + 1 - arg1.field3064;
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
        if (var4 + var9 >= arg1.field3065) {
            int var15 = var4 + var9 + 1 - arg1.field3065;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method2074(arg1.field2939, arg0.field2939, var7, var6, var9, var8, var10, var11);
            method2076(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lwk;III)Z", line = 401)
    public static final boolean method2082(class186 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class261.field3881 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class261.field3882 * arg2 >> 8) >> 3;
            return method2084(arg0, field4716, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V", line = 411)
    public static final void method2083() {
        field4716 = null;
        field4714 = null;
        field4713 = (class215[][]) null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Lwk;Lwk;II)Z", line = 416)
    private static final boolean method2084(class186 arg0, class186 arg1, int arg2, int arg3) {
        int var4 = arg0.field3063 + arg2;
        int var5 = arg0.field3067 + arg3;
        int var6 = arg1.field3065 * var5 + var4;
        int var7 = arg0.field3064;
        int var8 = arg0.field3065;
        int var9 = arg1.field3065 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3065 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3064) {
            int var11 = var5 + var7 + 1 - arg1.field3064;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3065) {
            int var13 = var4 + var8 + 1 - arg1.field3065;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3065 + var9;
            return method2077(arg1.field2939, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([B[BIIIII)V", line = 478)
    private static final void method2085(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Lwk;III)V", line = 504)
    public static final void method2086(class186 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class261.field3881 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class261.field3882 * arg2 >> 8) >> 3;
            method2081(arg0, field4716, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "([B[BIIIII)V", line = 517)
    private static final void method2087(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lwk;Lwk;IIIZ)V", line = 546)
    private static final void method2088(class186 arg0, class186 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3065 || arg3 + 16 >= arg1.field3064) {
            return;
        }
        int var6 = arg1.field3065 * arg3 + arg2;
        int var7 = arg1.field3065 - 16;
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
            method2085(arg1.field2939, arg0.field2939, var8, var6, var7, var9, var10);
        } else {
            method2087(arg1.field2939, arg0.field2939, var8, var6, var7, var9, var10);
        }
        method2076(arg2, arg3, 16, 16);
    }
}
