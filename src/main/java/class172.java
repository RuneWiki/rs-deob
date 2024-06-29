import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class172 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    private static int field2722;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    private static int field2723;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lve;")
    public static class33 field2724;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[Lve;")
    public static class33[] field2720;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[[Lkd;")
    public static class137[][] field2721;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V", line = 4)
    public static void method1085() {
        field2724 = null;
        field2720 = null;
        field2721 = (class137[][]) null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lve;Lve;II)V", line = 11)
    private static final void method1086(class33 arg0, class33 arg1, int arg2, int arg3) {
        int var4 = arg0.field1232 + arg2;
        int var5 = arg0.field1242 + arg3;
        int var6 = arg1.field1243 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1241;
        int var9 = arg0.field1243;
        int var10 = arg1.field1243 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1243 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1241) {
            int var13 = var5 + var8 + 1 - arg1.field1241;
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
        if (var4 + var9 >= arg1.field1243) {
            int var15 = var4 + var9 + 1 - arg1.field1243;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1095(arg1.field474, arg0.field474, var7, var6, var9, var8, var10, var11);
            method1096(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([B[BIIIII)V", line = 72)
    private static final void method1087(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lve;III)Z", line = 98)
    public static final boolean method1088(class33 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class178.field2844 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class178.field2839 * arg2 >> 8) >> 3;
            return method1100(arg0, field2724, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lve;Lve;II)V", line = 108)
    private static final void method1089(class33 arg0, class33 arg1, int arg2, int arg3) {
        int var4 = arg0.field1232 + arg2;
        int var5 = arg0.field1242 + arg3;
        int var6 = arg1.field1243 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1241;
        int var9 = arg0.field1243;
        int var10 = arg1.field1243 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1243 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1241) {
            int var13 = var5 + var8 + 1 - arg1.field1241;
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
        if (var4 + var9 >= arg1.field1243) {
            int var15 = var4 + var9 + 1 - arg1.field1243;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1094(arg1.field474, arg0.field474, var7, var6, var9, var8, var10, var11);
            method1096(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZZIIIIII)V", line = 169)
    public static final void method1090(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class178.field2844 * var11 >> 8) >> 3;
        int var14 = var12 - (class178.field2839 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1089(field2720[1], field2724, var13 + 1, var14 + 1);
        } else {
            method1099(field2720[arg0], field2724, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lve;III)V", line = 197)
    public static final void method1091(class33 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class178.field2844 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class178.field2839 * arg2 >> 8) >> 3;
            method1086(arg0, field2724, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Lve;III)V", line = 207)
    public static final void method1092(class33 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class178.field2844 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class178.field2839 * arg2 >> 8) >> 3;
            method1089(arg0, field2724, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V", line = 217)
    public static final void method1093(int arg0, int arg1) {
        field2723 = arg0 + 7 >> 3;
        field2722 = arg1 + 7 >> 3;
        field2724 = new class33(field2723 * 128 + 2, field2722 * 128 + 2, 0);
        field2721 = new class137[field2723][field2722];
        for (int var2 = 0; var2 < field2723; var2++) {
            for (int var3 = 0; var3 < field2722; var3++) {
                field2721[var2][var3] = new class137();
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([B[BIIIIII)V", line = 242)
    private static final void method1094(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "([B[BIIIIII)V", line = 278)
    private static final void method1095(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V", line = 314)
    private static final void method1096(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field2721[var8][var9].field2205 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII[[Z[[I)V", line = 341)
    public static final void method1097(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class264.field4313;
        class264.method1719(1);
        class264.method1720(1);
        class264.method1706();
        class264.method1710(false);
        class103.method677(0, 30359, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2723; var7++) {
            label52: for (int var8 = 0; var8 < field2722; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class137 var11 = field2721[var7][var8];
                                if (var11.field2205) {
                                    var11.method908(field2724, var7, var8);
                                    var11.field2205 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method907();
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
        class264.method1736();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BIIIII)Z", line = 413)
    private static final boolean method1098(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lve;Lve;IIIZ)V", line = 452)
    private static final void method1099(class33 arg0, class33 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field1243 || arg3 + 16 >= arg1.field1241) {
            return;
        }
        int var6 = arg1.field1243 * arg3 + arg2;
        int var7 = arg1.field1243 - 16;
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
            method1101(arg1.field474, arg0.field474, var8, var6, var7, var9, var10);
        } else {
            method1087(arg1.field474, arg0.field474, var8, var6, var7, var9, var10);
        }
        method1096(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Lve;Lve;II)Z", line = 500)
    private static final boolean method1100(class33 arg0, class33 arg1, int arg2, int arg3) {
        int var4 = arg0.field1232 + arg2;
        int var5 = arg0.field1242 + arg3;
        int var6 = arg1.field1243 * var5 + var4;
        int var7 = arg0.field1241;
        int var8 = arg0.field1243;
        int var9 = arg1.field1243 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field1243 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field1241) {
            int var11 = var5 + var7 + 1 - arg1.field1241;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field1243) {
            int var13 = var4 + var8 + 1 - arg1.field1243;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field1243 + var9;
            method1096(var4, var5, var8, var7);
            return method1098(arg1.field474, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "([B[BIIIII)V", line = 563)
    private static final void method1101(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
}
