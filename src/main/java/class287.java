import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class287 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    private static int field4834;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    private static int field4835;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lpm;")
    public static class99 field4836;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "[Lpm;")
    public static class99[] field4837;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[[Lma;")
    public static class226[][] field4838;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII[[Z[[I)V", line = 5)
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class117.field2143;
        class117.method961(1);
        class117.method935(1);
        class117.method959();
        class117.method962(false);
        class116.method913(true, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field4834; var7++) {
            label52: for (int var8 = 0; var8 < field4835; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class226 var11 = field4838[var7][var8];
                                if (var11.field3780) {
                                    var11.method1628(field4836, var7, var8);
                                    var11.field3780 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1629();
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
        class117.method966();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZZIIIIII)V", line = 75)
    public static final void method1979(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class108.field1949 * var11 >> 8) >> 3;
        int var14 = var12 - (class108.field1948 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1987(field4837[1], field4836, var13 + 1, var14 + 1);
        } else {
            method1990(field4837[arg0], field4836, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BIIIII)Z", line = 104)
    private static final boolean method1980(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lpm;Lpm;II)Z", line = 143)
    private static final boolean method1981(class99 arg0, class99 arg1, int arg2, int arg3) {
        int var4 = arg0.field545 + arg2;
        int var5 = arg0.field543 + arg3;
        int var6 = arg1.field556 * var5 + var4;
        int var7 = arg0.field557;
        int var8 = arg0.field556;
        int var9 = arg1.field556 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field556 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field557) {
            int var11 = var5 + var7 + 1 - arg1.field557;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field556) {
            int var13 = var4 + var8 + 1 - arg1.field556;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field556 + var9;
            method1989(var4, var5, var8, var7);
            return method1980(arg1.field1789, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([B[BIIIII)V", line = 206)
    private static final void method1982(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V", line = 232)
    public static final void method1983() {
        field4836 = null;
        field4837 = null;
        field4838 = (class226[][]) null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lpm;Lpm;II)V", line = 237)
    private static final void method1984(class99 arg0, class99 arg1, int arg2, int arg3) {
        int var4 = arg0.field545 + arg2;
        int var5 = arg0.field543 + arg3;
        int var6 = arg1.field556 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field557;
        int var9 = arg0.field556;
        int var10 = arg1.field556 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field556 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field557) {
            int var13 = var5 + var8 + 1 - arg1.field557;
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
        if (var4 + var9 >= arg1.field556) {
            int var15 = var4 + var9 + 1 - arg1.field556;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1985(arg1.field1789, arg0.field1789, var7, var6, var9, var8, var10, var11);
            method1989(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([B[BIIIIII)V", line = 298)
    private static final void method1985(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "([B[BIIIIII)V", line = 335)
    private static final void method1986(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Lpm;Lpm;II)V", line = 370)
    private static final void method1987(class99 arg0, class99 arg1, int arg2, int arg3) {
        int var4 = arg0.field545 + arg2;
        int var5 = arg0.field543 + arg3;
        int var6 = arg1.field556 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field557;
        int var9 = arg0.field556;
        int var10 = arg1.field556 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field556 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field557) {
            int var13 = var5 + var8 + 1 - arg1.field557;
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
        if (var4 + var9 >= arg1.field556) {
            int var15 = var4 + var9 + 1 - arg1.field556;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1986(arg1.field1789, arg0.field1789, var7, var6, var9, var8, var10, var11);
            method1989(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lpm;III)V", line = 432)
    public static final void method1988(class99 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class108.field1949 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class108.field1948 * arg2 >> 8) >> 3;
            method1984(arg0, field4836, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V", line = 443)
    private static final void method1989(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field4838[var8][var9].field3780 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lpm;Lpm;IIIZ)V", line = 471)
    private static final void method1990(class99 arg0, class99 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field556 || arg3 + 16 >= arg1.field557) {
            return;
        }
        int var6 = arg1.field556 * arg3 + arg2;
        int var7 = arg1.field556 - 16;
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
            method1993(arg1.field1789, arg0.field1789, var8, var6, var7, var9, var10);
        } else {
            method1982(arg1.field1789, arg0.field1789, var8, var6, var7, var9, var10);
        }
        method1989(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lpm;III)Z", line = 518)
    public static final boolean method1991(class99 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class108.field1949 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class108.field1948 * arg2 >> 8) >> 3;
            return method1981(arg0, field4836, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 528)
    public static final void method1992(int arg0, int arg1) {
        field4834 = arg0 + 7 >> 3;
        field4835 = arg1 + 7 >> 3;
        field4836 = new class99(field4834 * 128 + 2, field4835 * 128 + 2, 0);
        field4838 = new class226[field4834][field4835];
        for (int var2 = 0; var2 < field4834; var2++) {
            for (int var3 = 0; var3 < field4835; var3++) {
                field4838[var2][var3] = new class226();
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "([B[BIIIII)V", line = 553)
    private static final void method1993(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V", line = 579)
    public static void method1994() {
        field4836 = null;
        field4837 = null;
        field4838 = (class226[][]) null;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Lpm;III)V", line = 584)
    public static final void method1995(class99 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class108.field1949 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class108.field1948 * arg2 >> 8) >> 3;
            method1987(arg0, field4836, var4 + 1, var5 + 1);
        }
    }
}
