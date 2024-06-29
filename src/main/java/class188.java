import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class188 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3434 = 0;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3435 = 0;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
    public static int[] field3431;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[I")
    public static int[] field3437;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[I")
    public static int[] field3439;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
    public static final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1364(arg0, arg1, var5 + 1, arg4);
            } else {
                method1364(arg0 + var5, arg1, 1 - var5, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field3438) {
                    var8 += (field3438 - arg0) * var10;
                    arg0 = field3438;
                }
                if (var11 >= field3434) {
                    var11 = field3434 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3432 && var12 < field3435) {
                        field3437[field3436 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field3432) {
                    var14 += (field3432 - arg1) * var16;
                    arg1 = field3432;
                }
                if (var17 >= field3435) {
                    var17 = field3435 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3438 && var18 < field3434) {
                        field3437[field3436 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1367(arg0, arg1, var6 + 1, arg4);
        } else {
            method1367(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIII)V")
    private static final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3432 || arg1 >= field3435) {
            return;
        }
        if (arg0 < field3438) {
            arg2 -= field3438 - arg0;
            arg0 = field3438;
        }
        if (arg0 + arg2 > field3434) {
            arg2 = field3434 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3436 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3437[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3437[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3437[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3437[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1349(arg0, arg1, arg2, arg4, arg5);
        method1349(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1370(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1370(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
    public static final void method1351() {
        field3431 = null;
        field3439 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([I)V")
    public static final void method1352(int[] arg0) {
        arg0[0] = field3438;
        arg0[1] = field3432;
        arg0[2] = field3434;
        arg0[3] = field3435;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()V")
    public static final void method1353() {
        int var0 = 0;
        int var1 = field3436 * field3433 - 7;
        while (var0 < var1) {
            field3437[var0++] = 0;
            field3437[var0++] = 0;
            field3437[var0++] = 0;
            field3437[var0++] = 0;
            field3437[var0++] = 0;
            field3437[var0++] = 0;
            field3437[var0++] = 0;
            field3437[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3437[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(IIIII)V")
    public static final void method1354(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1364(arg0, arg1, arg2, arg4);
        method1364(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1367(arg0, arg1, arg3, arg4);
        method1367(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)V")
    public static final void method1355(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3436) {
            arg2 = field3436;
        }
        if (arg3 > field3433) {
            arg3 = field3433;
        }
        field3438 = arg0;
        field3432 = arg1;
        field3434 = arg2;
        field3435 = arg3;
        method1351();
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "([I)V")
    public static final void method1356(int[] arg0) {
        field3438 = arg0[0];
        field3432 = arg0[1];
        field3434 = arg0[2];
        field3435 = arg0[3];
        method1351();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([I[I)V")
    public static final void method1357(int[] arg0, int[] arg1) {
        if (field3435 - field3432 != arg0.length || field3435 - field3432 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field3431 = arg0;
        field3439 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(IIIII)V")
    public static final void method1358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1371(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field3432) {
            var9 = field3432;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3435) {
            var10 = field3435;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var30 = arg0 + 1 - var13;
            if (var30 < field3438) {
                var30 = field3438;
            }
            int var31 = arg0 + var13;
            if (var31 > field3434) {
                var31 = field3434;
            }
            int var32 = field3436 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field3437[var32] >> 16 & 0xFF) * var5;
                int var35 = (field3437[var32] >> 8 & 0xFF) * var5;
                int var36 = (field3437[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field3437[var32++] = var37;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var17 = arg2;
        int var18 = -var14;
        int var19 = var18 * var18 + var12;
        int var20 = var19 - arg2;
        int var21 = var19 - var18;
        while (var11 < var10) {
            while (var21 > var12 && var20 > var12) {
                var21 -= var17-- + var17;
                var20 -= var17 + var17;
            }
            int var22 = arg0 - var17;
            if (var22 < field3438) {
                var22 = field3438;
            }
            int var23 = arg0 + var17;
            if (var23 > field3434 - 1) {
                var23 = field3434 - 1;
            }
            int var24 = field3436 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field3437[var24] >> 16 & 0xFF) * var5;
                int var27 = (field3437[var24] >> 8 & 0xFF) * var5;
                int var28 = (field3437[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field3437[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIIII)V")
    public static final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3438) {
            arg2 -= field3438 - arg0;
            arg0 = field3438;
        }
        if (arg1 < field3432) {
            arg3 -= field3432 - arg1;
            arg1 = field3432;
        }
        if (arg0 + arg2 > field3434) {
            arg2 = field3434 - arg0;
        }
        if (arg1 + arg3 > field3435) {
            arg3 = field3435 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3436 - arg2;
        int var9 = field3436 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3437[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3437[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    private static final void method1360(int arg0, int arg1, int arg2) {
        if (arg0 >= field3438 && arg1 >= field3432 && arg0 < field3434 && arg1 < field3435) {
            field3437[field3436 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(IIIII)V")
    public static final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3438) {
            arg2 -= field3438 - arg0;
            arg0 = field3438;
        }
        if (arg1 < field3432) {
            arg3 -= field3432 - arg1;
            arg1 = field3432;
        }
        if (arg0 + arg2 > field3434) {
            arg2 = field3434 - arg0;
        }
        if (arg1 + arg3 > field3435) {
            arg3 = field3435 - arg1;
        }
        int var5 = field3436 - arg2;
        int var6 = field3436 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3437[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III[I[I)V")
    public static final void method1362(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3436 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3437[var7++] = arg2;
            }
            var5 += field3436;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()V")
    public static final void method1363() {
        field3438 = 0;
        field3432 = 0;
        field3434 = field3436;
        field3435 = field3433;
        method1351();
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIII)V")
    public static final void method1364(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3432 || arg1 >= field3435) {
            return;
        }
        if (arg0 < field3438) {
            arg2 -= field3438 - arg0;
            arg0 = field3438;
        }
        if (arg0 + arg2 > field3434) {
            arg2 = field3434 - arg0;
        }
        int var4 = field3436 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3437[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "()V")
    public static void method1365() {
        field3437 = null;
        field3431 = null;
        field3439 = null;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(IIIIII)V")
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class213.method1530();
        int var18 = arg1 - class213.method1524();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class213.method1533(var19, var20, var21);
        class213.method1522(var23, var24, var25, var19, var20, var21, arg4);
        class213.method1533(var19, var21, var22);
        class213.method1522(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(IIII)V")
    public static final void method1367(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3438 || arg0 >= field3434) {
            return;
        }
        if (arg1 < field3432) {
            arg2 -= field3432 - arg1;
            arg1 = field3432;
        }
        if (arg1 + arg2 > field3435) {
            arg2 = field3435 - arg1;
        }
        int var4 = field3436 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3437[field3436 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([III)V")
    public static final void method1368(int[] arg0, int arg1, int arg2) {
        field3437 = arg0;
        field3436 = arg1;
        field3433 = arg2;
        method1355(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(IIII)V")
    public static final void method1369(int arg0, int arg1, int arg2, int arg3) {
        if (field3438 < arg0) {
            field3438 = arg0;
        }
        if (field3432 < arg1) {
            field3432 = arg1;
        }
        if (field3434 > arg2) {
            field3434 = arg2;
        }
        if (field3435 > arg3) {
            field3435 = arg3;
        }
        method1351();
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(IIIII)V")
    private static final void method1370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3438 || arg0 >= field3434) {
            return;
        }
        if (arg1 < field3432) {
            arg2 -= field3432 - arg1;
            arg1 = field3432;
        }
        if (arg1 + arg2 > field3435) {
            arg2 = field3435 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3436 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3437[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3437[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3437[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3437[var9] = var14;
            var9 += field3436;
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(IIII)V")
    private static final void method1371(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1360(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3432) {
            var4 = field3432;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3435) {
            var5 = field3435;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var21 = arg0 + 1 - var8;
            if (var21 < field3438) {
                var21 = field3438;
            }
            int var22 = arg0 + var8;
            if (var22 > field3434) {
                var22 = field3434;
            }
            int var23 = field3436 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field3437[var23++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var12 = arg2;
        int var13 = var6 - arg1;
        int var14 = var13 * var13 + var7;
        int var15 = var14 - arg2;
        int var16 = var14 - var13;
        while (var6 < var5) {
            while (var16 > var7 && var15 > var7) {
                var16 -= var12-- + var12;
                var15 -= var12 + var12;
            }
            int var17 = arg0 - var12;
            if (var17 < field3438) {
                var17 = field3438;
            }
            int var18 = arg0 + var12;
            if (var18 > field3434 - 1) {
                var18 = field3434 - 1;
            }
            int var19 = field3436 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field3437[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }
}
