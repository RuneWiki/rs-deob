import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class9 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    private static int field112;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    private static int field114;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lvi;")
    public static class129 field110;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[Lvi;")
    public static class129[] field111;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[[Ld;")
    public static class40[][] field113;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BIIIII)Z", line = 5)
    private static final boolean method46(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 45)
    public static final void method47(int arg0, int arg1) {
        field112 = arg0 + 7 >> 3;
        field114 = arg1 + 7 >> 3;
        field110 = new class129(field112 * 128 + 2, field114 * 128 + 2, 0);
        field113 = new class40[field112][field114];
        for (int var2 = 0; var2 < field112; var2++) {
            for (int var3 = 0; var3 < field114; var3++) {
                field113[var2][var3] = new class40();
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lvi;Lvi;II)Z", line = 68)
    private static final boolean method48(class129 arg0, class129 arg1, int arg2, int arg3) {
        int var4 = arg0.field1952 + arg2;
        int var5 = arg0.field1953 + arg3;
        int var6 = arg1.field1950 * var5 + var4;
        int var7 = arg0.field1948;
        int var8 = arg0.field1950;
        int var9 = arg1.field1950 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field1950 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field1948) {
            int var11 = var5 + var7 + 1 - arg1.field1948;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field1950) {
            int var13 = var4 + var8 + 1 - arg1.field1950;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field1950 + var9;
            method51(var4, var5, var8, var7);
            return method46(arg1.field2281, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V", line = 129)
    public static void method49() {
        field110 = null;
        field111 = null;
        field113 = (class40[][]) null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B[BIIIII)V", line = 136)
    private static final void method50(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V", line = 164)
    private static final void method51(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field113[var8][var9].field566 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lvi;Lvi;II)V", line = 192)
    private static final void method52(class129 arg0, class129 arg1, int arg2, int arg3) {
        int var4 = arg0.field1952 + arg2;
        int var5 = arg0.field1953 + arg3;
        int var6 = arg1.field1950 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1948;
        int var9 = arg0.field1950;
        int var10 = arg1.field1950 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1950 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1948) {
            int var13 = var5 + var8 + 1 - arg1.field1948;
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
        if (var4 + var9 >= arg1.field1950) {
            int var15 = var4 + var9 + 1 - arg1.field1950;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method54(arg1.field2281, arg0.field2281, var7, var6, var9, var8, var10, var11);
            method51(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZZIIIIII)V", line = 251)
    public static final void method53(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class304.field5180 * var11 >> 8) >> 3;
        int var14 = var12 - (class304.field5184 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method52(field111[1], field110, var13 + 1, var14 + 1);
        } else {
            method56(field111[arg0], field110, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B[BIIIIII)V", line = 280)
    private static final void method54(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Lvi;Lvi;II)V", line = 316)
    private static final void method55(class129 arg0, class129 arg1, int arg2, int arg3) {
        int var4 = arg0.field1952 + arg2;
        int var5 = arg0.field1953 + arg3;
        int var6 = arg1.field1950 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field1948;
        int var9 = arg0.field1950;
        int var10 = arg1.field1950 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field1950 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field1948) {
            int var13 = var5 + var8 + 1 - arg1.field1948;
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
        if (var4 + var9 >= arg1.field1950) {
            int var15 = var4 + var9 + 1 - arg1.field1950;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method58(arg1.field2281, arg0.field2281, var7, var6, var9, var8, var10, var11);
            method51(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lvi;Lvi;IIIZ)V", line = 376)
    private static final void method56(class129 arg0, class129 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field1950 || arg3 + 16 >= arg1.field1948) {
            return;
        }
        int var6 = arg1.field1950 * arg3 + arg2;
        int var7 = arg1.field1950 - 16;
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
            method61(arg1.field2281, arg0.field2281, var8, var6, var7, var9, var10);
        } else {
            method50(arg1.field2281, arg0.field2281, var8, var6, var7, var9, var10);
        }
        method51(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lvi;III)Z", line = 423)
    public static final boolean method57(class129 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class304.field5180 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class304.field5184 * arg2 >> 8) >> 3;
            return method48(arg0, field110, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([B[BIIIIII)V", line = 434)
    private static final void method58(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII[[Z[[I)V", line = 470)
    public static final void method59(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class257.field4409;
        class257.method1758(1);
        class257.method1750(1);
        class257.method1743();
        class257.method1763(false);
        class107.method795(0, 58, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field112; var7++) {
            label52: for (int var8 = 0; var8 < field114; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class40 var11 = field113[var7][var8];
                                if (var11.field566) {
                                    var11.method312(field110, var7, var8);
                                    var11.field566 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method309();
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
        class257.method1734();
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lvi;III)V", line = 541)
    public static final void method60(class129 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class304.field5180 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class304.field5184 * arg2 >> 8) >> 3;
            method52(arg0, field110, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([B[BIIIII)V", line = 553)
    private static final void method61(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V", line = 579)
    public static final void method62() {
        field110 = null;
        field111 = null;
        field113 = (class40[][]) null;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Lvi;III)V", line = 584)
    public static final void method63(class129 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class304.field5180 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class304.field5184 * arg2 >> 8) >> 3;
            method55(arg0, field110, var4 + 1, var5 + 1);
        }
    }
}
