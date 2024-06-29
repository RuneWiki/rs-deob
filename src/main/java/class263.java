import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class263 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private static int field4175;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    private static int field4177;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lka;")
    public static class279 field4174;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[Lka;")
    public static class279[] field4176;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[[Lbg;")
    public static class172[][] field4173;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIIII)Z", line = 5)
    private static final boolean method1851(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lka;III)V", line = 45)
    public static final void method1852(class279 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class58.field826 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class58.field834 * arg2 >> 8) >> 3;
            method1862(arg0, field4174, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lka;III)Z", line = 57)
    public static final boolean method1853(class279 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class58.field826 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class58.field834 * arg2 >> 8) >> 3;
            return method1864(arg0, field4174, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 67)
    public static void method1854() {
        field4174 = null;
        field4176 = null;
        field4173 = (class172[][]) null;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Lka;III)V", line = 73)
    public static final void method1855(class279 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class58.field826 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class58.field834 * arg2 >> 8) >> 3;
            method1866(arg0, field4174, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B[BIIIII)V", line = 85)
    private static final void method1856(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 111)
    private static final void method1857(class279 arg0, class279 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field5306 || arg3 + 16 >= arg1.field5300) {
            return;
        }
        int var6 = arg1.field5306 * arg3 + arg2;
        int var7 = arg1.field5306 - 16;
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
            method1856(arg1.field4561, arg0.field4561, var8, var6, var7, var9, var10);
        } else {
            method1858(arg1.field4561, arg0.field4561, var8, var6, var7, var9, var10);
        }
        method1861(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([B[BIIIII)V", line = 161)
    private static final void method1858(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B[BIIIIII)V", line = 188)
    private static final void method1859(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([B[BIIIIII)V", line = 224)
    private static final void method1860(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V", line = 260)
    private static final void method1861(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field4173[var8][var9].field2806 = true;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lka;Lka;II)V", line = 286)
    private static final void method1862(class279 arg0, class279 arg1, int arg2, int arg3) {
        int var4 = arg0.field5304 + arg2;
        int var5 = arg0.field5290 + arg3;
        int var6 = arg1.field5306 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field5300;
        int var9 = arg0.field5306;
        int var10 = arg1.field5306 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field5306 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field5300) {
            int var13 = var5 + var8 + 1 - arg1.field5300;
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
        if (var4 + var9 >= arg1.field5306) {
            int var15 = var4 + var9 + 1 - arg1.field5306;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1860(arg1.field4561, arg0.field4561, var7, var6, var9, var8, var10, var11);
            method1861(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZZIIIIII)V", line = 346)
    public static final void method1863(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class58.field826 * var11 >> 8) >> 3;
        int var14 = var12 - (class58.field834 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1862(field4176[1], field4174, var13 + 1, var14 + 1);
        } else {
            method1857(field4176[arg0], field4174, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lka;Lka;II)Z", line = 374)
    private static final boolean method1864(class279 arg0, class279 arg1, int arg2, int arg3) {
        int var4 = arg0.field5304 + arg2;
        int var5 = arg0.field5290 + arg3;
        int var6 = arg1.field5306 * var5 + var4;
        int var7 = arg0.field5300;
        int var8 = arg0.field5306;
        int var9 = arg1.field5306 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field5306 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field5300) {
            int var11 = var5 + var7 + 1 - arg1.field5300;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field5306) {
            int var13 = var4 + var8 + 1 - arg1.field5306;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field5306 + var9;
            method1861(var4, var5, var8, var7);
            return method1851(arg1.field4561, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 435)
    public static final void method1865(int arg0, int arg1) {
        field4177 = arg0 + 7 >> 3;
        field4175 = arg1 + 7 >> 3;
        field4174 = new class279(field4177 * 128 + 2, field4175 * 128 + 2, 0);
        field4173 = new class172[field4177][field4175];
        for (int var2 = 0; var2 < field4177; var2++) {
            for (int var3 = 0; var3 < field4175; var3++) {
                field4173[var2][var3] = new class172();
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Lka;Lka;II)V", line = 458)
    private static final void method1866(class279 arg0, class279 arg1, int arg2, int arg3) {
        int var4 = arg0.field5304 + arg2;
        int var5 = arg0.field5290 + arg3;
        int var6 = arg1.field5306 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field5300;
        int var9 = arg0.field5306;
        int var10 = arg1.field5306 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field5306 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field5300) {
            int var13 = var5 + var8 + 1 - arg1.field5300;
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
        if (var4 + var9 >= arg1.field5306) {
            int var15 = var4 + var9 + 1 - arg1.field5306;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1859(arg1.field4561, arg0.field4561, var7, var6, var9, var8, var10, var11);
            method1861(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII[[Z[[I)V", line = 519)
    public static final void method1867(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class166.field2648;
        class166.method1160(1);
        class166.method1177(1);
        class166.method1173();
        class166.method1190(false);
        class274.method1934(0, 0, (byte) -9);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field4177; var7++) {
            label52: for (int var8 = 0; var8 < field4175; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class172 var11 = field4173[var7][var8];
                                if (var11.field2806) {
                                    var11.method1237(field4174, var7, var8);
                                    var11.field2806 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1236();
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
        class166.method1195();
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V", line = 589)
    public static final void method1868() {
        field4174 = null;
        field4176 = null;
        field4173 = (class172[][]) null;
    }
}
