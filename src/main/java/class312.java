import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class312 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    private static int field5274;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    private static int field5278;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lvd;")
    public static class127 field5276;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[Lvd;")
    public static class127[] field5277;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[[Lvj;")
    public static class100[][] field5275;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2115(int arg0, int arg1) {
        field5274 = arg0 + 7 >> 3;
        field5278 = arg1 + 7 >> 3;
        field5276 = new class127(field5274 * 128 + 2, field5278 * 128 + 2, 0);
        field5275 = new class100[field5274][field5278];
        for (int var2 = 0; var2 < field5274; var2++) {
            for (int var3 = 0; var3 < field5278; var3++) {
                field5275[var2][var3] = new class100();
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([B[BIIIII)V", line = 31)
    private static final void method2116(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BIIIII)Z", line = 60)
    private static final boolean method2117(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII[[Z[[I)V", line = 100)
    public static final void method2118(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class247.field4253;
        class247.method1701(1);
        class247.method1687(1);
        class247.method1710();
        class247.method1706(false);
        class217.method1498((byte) -29, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field5274; var7++) {
            label52: for (int var8 = 0; var8 < field5278; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class100 var11 = field5275[var7][var8];
                                if (var11.field1729) {
                                    var11.method624(field5276, var7, var8);
                                    var11.field1729 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method626();
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
        class247.method1715();
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lvd;Lvd;II)V", line = 170)
    private static final void method2119(class127 arg0, class127 arg1, int arg2, int arg3) {
        int var4 = arg0.field2626 + arg2;
        int var5 = arg0.field2615 + arg3;
        int var6 = arg1.field2625 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2610;
        int var9 = arg0.field2625;
        int var10 = arg1.field2625 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2625 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2610) {
            int var13 = var5 + var8 + 1 - arg1.field2610;
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
        if (var4 + var9 >= arg1.field2625) {
            int var15 = var4 + var9 + 1 - arg1.field2625;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method2124(arg1.field2163, arg0.field2163, var7, var6, var9, var8, var10, var11);
            method2131(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Lvd;Lvd;II)Z", line = 229)
    private static final boolean method2120(class127 arg0, class127 arg1, int arg2, int arg3) {
        int var4 = arg0.field2626 + arg2;
        int var5 = arg0.field2615 + arg3;
        int var6 = arg1.field2625 * var5 + var4;
        int var7 = arg0.field2610;
        int var8 = arg0.field2625;
        int var9 = arg1.field2625 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field2625 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field2610) {
            int var11 = var5 + var7 + 1 - arg1.field2610;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field2625) {
            int var13 = var4 + var8 + 1 - arg1.field2625;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field2625 + var9;
            method2131(var4, var5, var8, var7);
            return method2117(arg1.field2163, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([B[BIIIIII)V", line = 292)
    private static final void method2121(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(Lvd;Lvd;II)V", line = 327)
    private static final void method2122(class127 arg0, class127 arg1, int arg2, int arg3) {
        int var4 = arg0.field2626 + arg2;
        int var5 = arg0.field2615 + arg3;
        int var6 = arg1.field2625 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2610;
        int var9 = arg0.field2625;
        int var10 = arg1.field2625 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2625 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2610) {
            int var13 = var5 + var8 + 1 - arg1.field2610;
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
        if (var4 + var9 >= arg1.field2625) {
            int var15 = var4 + var9 + 1 - arg1.field2625;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method2121(arg1.field2163, arg0.field2163, var7, var6, var9, var8, var10, var11);
            method2131(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 386)
    public static final void method2123() {
        field5276 = null;
        field5277 = null;
        field5275 = (class100[][]) null;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "([B[BIIIIII)V", line = 392)
    private static final void method2124(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lvd;III)V", line = 428)
    public static final void method2125(class127 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class119.field2007 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class119.field2006 * arg2 >> 8) >> 3;
            method2122(arg0, field5276, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lvd;Lvd;IIIZ)V", line = 438)
    private static final void method2126(class127 arg0, class127 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field2625 || arg3 + 16 >= arg1.field2610) {
            return;
        }
        int var6 = arg1.field2625 * arg3 + arg2;
        int var7 = arg1.field2625 - 16;
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
            method2116(arg1.field2163, arg0.field2163, var8, var6, var7, var9, var10);
        } else {
            method2129(arg1.field2163, arg0.field2163, var8, var6, var7, var9, var10);
        }
        method2131(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Lvd;III)Z", line = 485)
    public static final boolean method2127(class127 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class119.field2007 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class119.field2006 * arg2 >> 8) >> 3;
            return method2120(arg0, field5276, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(Lvd;III)V", line = 495)
    public static final void method2128(class127 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class119.field2007 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class119.field2006 * arg2 >> 8) >> 3;
            method2119(arg0, field5276, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "([B[BIIIII)V", line = 507)
    private static final void method2129(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()V", line = 533)
    public static void method2130() {
        field5276 = null;
        field5277 = null;
        field5275 = (class100[][]) null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V", line = 539)
    private static final void method2131(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field5275[var8][var9].field1729 = true;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZZIIIIII)V", line = 565)
    public static final void method2132(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class119.field2007 * var11 >> 8) >> 3;
        int var14 = var12 - (class119.field2006 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method2122(field5277[1], field5276, var13 + 1, var14 + 1);
        } else {
            method2126(field5277[arg0], field5276, var13 + 1, var14 + 1, arg1, arg2);
        }
    }
}
