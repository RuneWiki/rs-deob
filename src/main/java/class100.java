import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class100 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    private static int field1565;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    private static int field1569;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lgk;")
    public static class265 field1566;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[Lgk;")
    public static class265[] field1568;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[[Laa;")
    public static class42[][] field1567;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([B[BIIIIII)V", line = 5)
    private static final void method746(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lgk;Lgk;II)V", line = 40)
    private static final void method747(class265 arg0, class265 arg1, int arg2, int arg3) {
        int var4 = arg0.field3142 + arg2;
        int var5 = arg0.field3146 + arg3;
        int var6 = arg1.field3139 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3135;
        int var9 = arg0.field3139;
        int var10 = arg1.field3139 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3139 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3135) {
            int var13 = var5 + var8 + 1 - arg1.field3135;
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
        if (var4 + var9 >= arg1.field3139) {
            int var15 = var4 + var9 + 1 - arg1.field3139;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method754(arg1.field4472, arg0.field4472, var7, var6, var9, var8, var10, var11);
            method748(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)V", line = 100)
    private static final void method748(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field1567[var8][var9].field518 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Lgk;Lgk;II)Z", line = 126)
    private static final boolean method749(class265 arg0, class265 arg1, int arg2, int arg3) {
        int var4 = arg0.field3142 + arg2;
        int var5 = arg0.field3146 + arg3;
        int var6 = arg1.field3139 * var5 + var4;
        int var7 = arg0.field3135;
        int var8 = arg0.field3139;
        int var9 = arg1.field3139 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3139 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3135) {
            int var11 = var5 + var7 + 1 - arg1.field3135;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3139) {
            int var13 = var4 + var8 + 1 - arg1.field3139;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3139 + var9;
            method748(var4, var5, var8, var7);
            return method760(arg1.field4472, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V", line = 187)
    public static void method750() {
        field1566 = null;
        field1568 = null;
        field1567 = (class42[][]) null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([B[BIIIII)V", line = 194)
    private static final void method751(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZZIIIIII)V", line = 220)
    public static final void method752(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class34.field391 * var11 >> 8) >> 3;
        int var14 = var12 - (class34.field394 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method758(field1568[1], field1566, var13 + 1, var14 + 1);
        } else {
            method756(field1568[arg0], field1566, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V", line = 248)
    public static final void method753(int arg0, int arg1) {
        field1565 = arg0 + 7 >> 3;
        field1569 = arg1 + 7 >> 3;
        field1566 = new class265(field1565 * 128 + 2, field1569 * 128 + 2, 0);
        field1567 = new class42[field1565][field1569];
        for (int var2 = 0; var2 < field1565; var2++) {
            for (int var3 = 0; var3 < field1569; var3++) {
                field1567[var2][var3] = new class42();
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "([B[BIIIIII)V", line = 274)
    private static final void method754(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII[[Z[[I)V", line = 310)
    public static final void method755(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class90.field1390;
        class90.method609(1);
        class90.method615(1);
        class90.method632();
        class90.method624(false);
        class284.method1960(0, 0, 15);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field1565; var7++) {
            label52: for (int var8 = 0; var8 < field1569; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class42 var11 = field1567[var7][var8];
                                if (var11.field518) {
                                    var11.method233(field1566, var7, var8);
                                    var11.field518 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method230();
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
        class90.method637();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lgk;Lgk;IIIZ)V", line = 380)
    private static final void method756(class265 arg0, class265 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3139 || arg3 + 16 >= arg1.field3135) {
            return;
        }
        int var6 = arg1.field3139 * arg3 + arg2;
        int var7 = arg1.field3139 - 16;
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
            method751(arg1.field4472, arg0.field4472, var8, var6, var7, var9, var10);
        } else {
            method759(arg1.field4472, arg0.field4472, var8, var6, var7, var9, var10);
        }
        method748(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lgk;III)V", line = 430)
    public static final void method757(class265 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class34.field391 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class34.field394 * arg2 >> 8) >> 3;
            method758(arg0, field1566, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Lgk;Lgk;II)V", line = 441)
    private static final void method758(class265 arg0, class265 arg1, int arg2, int arg3) {
        int var4 = arg0.field3142 + arg2;
        int var5 = arg0.field3146 + arg3;
        int var6 = arg1.field3139 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3135;
        int var9 = arg0.field3139;
        int var10 = arg1.field3139 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3139 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3135) {
            int var13 = var5 + var8 + 1 - arg1.field3135;
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
        if (var4 + var9 >= arg1.field3139) {
            int var15 = var4 + var9 + 1 - arg1.field3139;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method746(arg1.field4472, arg0.field4472, var7, var6, var9, var8, var10, var11);
            method748(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "([B[BIIIII)V", line = 502)
    private static final void method759(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BIIIII)Z", line = 529)
    private static final boolean method760(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Lgk;III)V", line = 568)
    public static final void method761(class265 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class34.field391 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class34.field394 * arg2 >> 8) >> 3;
            method747(arg0, field1566, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Lgk;III)Z", line = 579)
    public static final boolean method762(class265 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class34.field391 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class34.field394 * arg2 >> 8) >> 3;
            return method749(arg0, field1566, var4 + 1, var5 + 1);
        }
    }
}
