import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class32 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    private static int field423;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    private static int field425;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lpj;")
    public static class59 field424;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[Lpj;")
    public static class59[] field426;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[[Lva;")
    public static class208[][] field427;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lpj;Lpj;II)V", line = 4)
    private static final void method218(class59 arg0, class59 arg1, int arg2, int arg3) {
        int var4 = arg0.field2362 + arg2;
        int var5 = arg0.field2354 + arg3;
        int var6 = arg1.field2350 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2358;
        int var9 = arg0.field2350;
        int var10 = arg1.field2350 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2350 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2358) {
            int var13 = var5 + var8 + 1 - arg1.field2358;
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
        if (var4 + var9 >= arg1.field2350) {
            int var15 = var4 + var9 + 1 - arg1.field2350;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method220(arg1.field789, arg0.field789, var7, var6, var9, var8, var10, var11);
            method229(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lpj;III)Z", line = 68)
    public static final boolean method219(class59 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class280.field4250 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class280.field4253 * arg2 >> 8) >> 3;
            return method222(arg0, field424, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([B[BIIIIII)V", line = 79)
    private static final void method220(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII[[Z[[I)V", line = 116)
    public static final void method221(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class117.field1801;
        class117.method809(1);
        class117.method823(1);
        class117.method821();
        class117.method830(false);
        class204.method1397(-108, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field425; var7++) {
            label52: for (int var8 = 0; var8 < field423; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class208 var11 = field427[var7][var8];
                                if (var11.field3150) {
                                    var11.method1427(field424, var7, var8);
                                    var11.field3150 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1428();
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
        class117.method808();
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Lpj;Lpj;II)Z", line = 187)
    private static final boolean method222(class59 arg0, class59 arg1, int arg2, int arg3) {
        int var4 = arg0.field2362 + arg2;
        int var5 = arg0.field2354 + arg3;
        int var6 = arg1.field2350 * var5 + var4;
        int var7 = arg0.field2358;
        int var8 = arg0.field2350;
        int var9 = arg1.field2350 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field2350 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field2358) {
            int var11 = var5 + var7 + 1 - arg1.field2358;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field2350) {
            int var13 = var4 + var8 + 1 - arg1.field2350;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field2350 + var9;
            return method223(arg1.field789, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([BIIIII)Z", line = 248)
    private static final boolean method223(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Lpj;III)V", line = 287)
    public static final void method224(class59 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class280.field4250 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class280.field4253 * arg2 >> 8) >> 3;
            method233(arg0, field424, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([B[BIIIII)V", line = 299)
    private static final void method225(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V", line = 325)
    public static void method226() {
        field424 = null;
        field426 = null;
        field427 = (class208[][]) null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "([B[BIIIII)V", line = 332)
    private static final void method227(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V", line = 358)
    public static final void method228(int arg0, int arg1) {
        field425 = arg0 + 7 >> 3;
        field423 = arg1 + 7 >> 3;
        field424 = new class59(field425 * 128 + 2, field423 * 128 + 2, 0);
        field427 = new class208[field425][field423];
        for (int var2 = 0; var2 < field425; var2++) {
            for (int var3 = 0; var3 < field423; var3++) {
                field427[var2][var3] = new class208();
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V", line = 382)
    private static final void method229(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class208[] var9 = field427[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field3150 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()V", line = 408)
    public static final void method230() {
        field424 = null;
        field426 = null;
        field427 = (class208[][]) null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "([B[BIIIIII)V", line = 414)
    private static final void method231(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZZIIIIII)V", line = 449)
    public static final void method232(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class280.field4250 * var11 >> 8) >> 3;
        int var14 = var12 - (class280.field4253 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method233(field426[1], field424, var13 + 1, var14 + 1);
        } else {
            method235(field426[arg0], field424, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(Lpj;Lpj;II)V", line = 477)
    private static final void method233(class59 arg0, class59 arg1, int arg2, int arg3) {
        int var4 = arg0.field2362 + arg2;
        int var5 = arg0.field2354 + arg3;
        int var6 = arg1.field2350 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2358;
        int var9 = arg0.field2350;
        int var10 = arg1.field2350 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2350 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2358) {
            int var13 = var5 + var8 + 1 - arg1.field2358;
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
        if (var4 + var9 >= arg1.field2350) {
            int var15 = var4 + var9 + 1 - arg1.field2350;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method231(arg1.field789, arg0.field789, var7, var6, var9, var8, var10, var11);
            method229(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(Lpj;III)V", line = 536)
    public static final void method234(class59 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class280.field4250 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class280.field4253 * arg2 >> 8) >> 3;
            method218(arg0, field424, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lpj;Lpj;IIIZ)V", line = 546)
    private static final void method235(class59 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field2350 || arg3 + 16 >= arg1.field2358) {
            return;
        }
        int var6 = arg1.field2350 * arg3 + arg2;
        int var7 = arg1.field2350 - 16;
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
            method227(arg1.field789, arg0.field789, var8, var6, var7, var9, var10);
        } else {
            method225(arg1.field789, arg0.field789, var8, var6, var7, var9, var10);
        }
        method229(arg2, arg3, 16, 16);
    }
}
