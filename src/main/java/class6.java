import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class6 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    private static int field77;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    private static int field81;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lin;")
    public static class168 field78;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lin;")
    public static class168[] field80;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[[Lqi;")
    public static class302[][] field79;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lin;III)Z", line = 4)
    public static final boolean method37(class168 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class250.field3945 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class250.field3955 * arg2 >> 8) >> 3;
            return method46(arg0, field78, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V", line = 14)
    public static final void method38() {
        field78 = null;
        field80 = null;
        field79 = (class302[][]) null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V", line = 19)
    public static void method39() {
        field78 = null;
        field80 = null;
        field79 = (class302[][]) null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZZIIIIII)V", line = 24)
    public static final void method40(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class250.field3945 * var11 >> 8) >> 3;
        int var14 = var12 - (class250.field3955 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method49(field80[1], field78, var13 + 1, var14 + 1);
        } else {
            method54(field80[arg0], field78, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lin;III)V", line = 54)
    public static final void method41(class168 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class250.field3945 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class250.field3955 * arg2 >> 8) >> 3;
            method49(arg0, field78, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V", line = 66)
    public static final void method42(int arg0, int arg1) {
        field81 = arg0 + 7 >> 3;
        field77 = arg1 + 7 >> 3;
        field78 = new class168(field81 * 128 + 2, field77 * 128 + 2, 0);
        field79 = new class302[field81][field77];
        for (int var2 = 0; var2 < field81; var2++) {
            for (int var3 = 0; var3 < field77; var3++) {
                field79[var2][var3] = new class302();
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([B[BIIIII)V", line = 91)
    private static final void method43(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)V", line = 118)
    private static final void method44(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class302[] var9 = field79[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field4711 = true;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "([B[BIIIII)V", line = 146)
    private static final void method45(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lin;Lin;II)Z", line = 173)
    private static final boolean method46(class168 arg0, class168 arg1, int arg2, int arg3) {
        int var4 = arg0.field3981 + arg2;
        int var5 = arg0.field3973 + arg3;
        int var6 = arg1.field3972 * var5 + var4;
        int var7 = arg0.field3980;
        int var8 = arg0.field3972;
        int var9 = arg1.field3972 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3972 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3980) {
            int var11 = var5 + var7 + 1 - arg1.field3980;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3972) {
            int var13 = var4 + var8 + 1 - arg1.field3972;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3972 + var9;
            return method47(arg1.field2555, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIIIII)Z", line = 234)
    private static final boolean method47(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([B[BIIIIII)V", line = 274)
    private static final void method48(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lin;Lin;II)V", line = 309)
    private static final void method49(class168 arg0, class168 arg1, int arg2, int arg3) {
        int var4 = arg0.field3981 + arg2;
        int var5 = arg0.field3973 + arg3;
        int var6 = arg1.field3972 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3980;
        int var9 = arg0.field3972;
        int var10 = arg1.field3972 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3972 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3980) {
            int var13 = var5 + var8 + 1 - arg1.field3980;
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
        if (var4 + var9 >= arg1.field3972) {
            int var15 = var4 + var9 + 1 - arg1.field3972;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method48(arg1.field2555, arg0.field2555, var7, var6, var9, var8, var10, var11);
            method44(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII[[Z[[I)V", line = 369)
    public static final void method50(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class94.field1473;
        class94.method677(1);
        class94.method675(1);
        class94.method695();
        class94.method668(false);
        class37.method313(0, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field81; var7++) {
            label52: for (int var8 = 0; var8 < field77; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class302 var11 = field79[var7][var8];
                                if (var11.field4711) {
                                    var11.method2057(field78, var7, var8);
                                    var11.field4711 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method2058();
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
        class94.method692();
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "([B[BIIIIII)V", line = 441)
    private static final void method51(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(Lin;Lin;II)V", line = 476)
    private static final void method52(class168 arg0, class168 arg1, int arg2, int arg3) {
        int var4 = arg0.field3981 + arg2;
        int var5 = arg0.field3973 + arg3;
        int var6 = arg1.field3972 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3980;
        int var9 = arg0.field3972;
        int var10 = arg1.field3972 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3972 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3980) {
            int var13 = var5 + var8 + 1 - arg1.field3980;
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
        if (var4 + var9 >= arg1.field3972) {
            int var15 = var4 + var9 + 1 - arg1.field3972;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method51(arg1.field2555, arg0.field2555, var7, var6, var9, var8, var10, var11);
            method44(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(Lin;III)V", line = 535)
    public static final void method53(class168 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class250.field3945 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class250.field3955 * arg2 >> 8) >> 3;
            method52(arg0, field78, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lin;Lin;IIIZ)V", line = 545)
    private static final void method54(class168 arg0, class168 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3972 || arg3 + 16 >= arg1.field3980) {
            return;
        }
        int var6 = arg1.field3972 * arg3 + arg2;
        int var7 = arg1.field3972 - 16;
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
            method43(arg1.field2555, arg0.field2555, var8, var6, var7, var9, var10);
        } else {
            method45(arg1.field2555, arg0.field2555, var8, var6, var7, var9, var10);
        }
        method44(arg2, arg3, 16, 16);
    }
}
