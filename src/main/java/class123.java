import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class123 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    private static int field2159;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    private static int field2162;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lel;")
    public static class232 field2161;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[Lel;")
    public static class232[] field2160;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[[Lwk;")
    public static class55[][] field2158;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 5)
    public static void method833() {
        field2161 = null;
        field2160 = null;
        field2158 = (class55[][]) null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([B[BIIIII)V", line = 13)
    private static final void method834(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([BIIIII)Z", line = 40)
    private static final boolean method835(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([B[BIIIIII)V", line = 80)
    private static final void method836(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII[[Z[[I)V", line = 116)
    public static final void method837(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class253.field4319;
        class253.method1704(1);
        class253.method1731(1);
        class253.method1737();
        class253.method1703(false);
        class277.method1910(0, 0, -19856);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2162; var7++) {
            label52: for (int var8 = 0; var8 < field2159; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class55 var11 = field2158[var7][var8];
                                if (var11.field1011) {
                                    var11.method438(field2161, var7, var8);
                                    var11.field1011 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method439();
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
        class253.method1721();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lel;Lel;II)Z", line = 187)
    private static final boolean method838(class232 arg0, class232 arg1, int arg2, int arg3) {
        int var4 = arg0.field5026 + arg2;
        int var5 = arg0.field5014 + arg3;
        int var6 = arg1.field5015 * var5 + var4;
        int var7 = arg0.field5009;
        int var8 = arg0.field5015;
        int var9 = arg1.field5015 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field5015 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field5009) {
            int var11 = var5 + var7 + 1 - arg1.field5009;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field5015) {
            int var13 = var4 + var8 + 1 - arg1.field5015;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field5015 + var9;
            method839(var4, var5, var8, var7);
            return method835(arg1.field3980, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V", line = 251)
    private static final void method839(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field2158[var8][var9].field1011 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZZIIIIII)V", line = 278)
    public static final void method840(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class169.field3003 * var11 >> 8) >> 3;
        int var14 = var12 - (class169.field3001 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method846(field2160[1], field2161, var13 + 1, var14 + 1);
        } else {
            method843(field2160[arg0], field2161, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lel;III)V", line = 306)
    public static final void method841(class232 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class169.field3003 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class169.field3001 * arg2 >> 8) >> 3;
            method846(arg0, field2161, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V", line = 316)
    public static final void method842(int arg0, int arg1) {
        field2162 = arg0 + 7 >> 3;
        field2159 = arg1 + 7 >> 3;
        field2161 = new class232(field2162 * 128 + 2, field2159 * 128 + 2, 0);
        field2158 = new class55[field2162][field2159];
        for (int var2 = 0; var2 < field2162; var2++) {
            for (int var3 = 0; var3 < field2159; var3++) {
                field2158[var2][var3] = new class55();
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lel;Lel;IIIZ)V", line = 339)
    private static final void method843(class232 arg0, class232 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field5015 || arg3 + 16 >= arg1.field5009) {
            return;
        }
        int var6 = arg1.field5015 * arg3 + arg2;
        int var7 = arg1.field5015 - 16;
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
            method834(arg1.field3980, arg0.field3980, var8, var6, var7, var9, var10);
        } else {
            method844(arg1.field3980, arg0.field3980, var8, var6, var7, var9, var10);
        }
        method839(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "([B[BIIIII)V", line = 389)
    private static final void method844(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "([B[BIIIIII)V", line = 416)
    private static final void method845(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lel;Lel;II)V", line = 451)
    private static final void method846(class232 arg0, class232 arg1, int arg2, int arg3) {
        int var4 = arg0.field5026 + arg2;
        int var5 = arg0.field5014 + arg3;
        int var6 = arg1.field5015 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field5009;
        int var9 = arg0.field5015;
        int var10 = arg1.field5015 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field5015 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field5009) {
            int var13 = var5 + var8 + 1 - arg1.field5009;
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
        if (var4 + var9 >= arg1.field5015) {
            int var15 = var4 + var9 + 1 - arg1.field5015;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method836(arg1.field3980, arg0.field3980, var7, var6, var9, var8, var10, var11);
            method839(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lel;III)V", line = 510)
    public static final void method847(class232 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class169.field3003 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class169.field3001 * arg2 >> 8) >> 3;
            method848(arg0, field2161, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Lel;Lel;II)V", line = 520)
    private static final void method848(class232 arg0, class232 arg1, int arg2, int arg3) {
        int var4 = arg0.field5026 + arg2;
        int var5 = arg0.field5014 + arg3;
        int var6 = arg1.field5015 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field5009;
        int var9 = arg0.field5015;
        int var10 = arg1.field5015 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field5015 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field5009) {
            int var13 = var5 + var8 + 1 - arg1.field5009;
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
        if (var4 + var9 >= arg1.field5015) {
            int var15 = var4 + var9 + 1 - arg1.field5015;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method845(arg1.field3980, arg0.field3980, var7, var6, var9, var8, var10, var11);
            method839(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V", line = 579)
    public static final void method849() {
        field2161 = null;
        field2160 = null;
        field2158 = (class55[][]) null;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Lel;III)Z", line = 584)
    public static final boolean method850(class232 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class169.field3003 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class169.field3001 * arg2 >> 8) >> 3;
            return method838(arg0, field2161, var4 + 1, var5 + 1);
        }
    }
}
