import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class216 {

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field3485 = 0;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field3483 = 0;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field3486 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    public static int[] field3480;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
    public static int[] field3481;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "[I")
    public static int[] field3484;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method1571(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3482) {
            arg2 = field3482;
        }
        if (arg3 > field3487) {
            arg3 = field3487;
        }
        field3483 = arg0;
        field3485 = arg1;
        field3486 = arg2;
        field3479 = arg3;
        method1593();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([III)V", line = 24)
    public static final void method1572(int[] arg0, int arg1, int arg2) {
        field3480 = arg0;
        field3482 = arg1;
        field3487 = arg2;
        method1571(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3483) {
            arg2 -= field3483 - arg0;
            arg0 = field3483;
        }
        if (arg1 < field3485) {
            arg3 -= field3485 - arg1;
            arg1 = field3485;
        }
        if (arg0 + arg2 > field3486) {
            arg2 = field3486 - arg0;
        }
        if (arg1 + arg3 > field3479) {
            arg3 = field3479 - arg1;
        }
        int var5 = field3482 - arg2;
        int var6 = field3482 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3480[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([I)V", line = 76)
    public static final void method1574(int[] arg0) {
        arg0[0] = field3483;
        arg0[1] = field3485;
        arg0[2] = field3486;
        arg0[3] = field3479;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)V", line = 82)
    private static final void method1575(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1580(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3485) {
            var4 = field3485;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3479) {
            var5 = field3479;
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
            int var12 = arg0 + 1 - var8;
            if (var12 < field3483) {
                var12 = field3483;
            }
            int var13 = arg0 + var8;
            if (var13 > field3486) {
                var13 = field3486;
            }
            int var14 = field3482 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field3480[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field3483) {
                var21 = field3483;
            }
            int var22 = arg0 + var16;
            if (var22 > field3486 - 1) {
                var22 = field3486 - 1;
            }
            int var23 = field3482 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field3480[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIIII)V", line = 188)
    public static final void method1576(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1575(arg0, arg1, arg2, arg3);
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
        if (var9 < field3485) {
            var9 = field3485;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3479) {
            var10 = field3479;
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
            int var17 = arg0 + 1 - var13;
            if (var17 < field3483) {
                var17 = field3483;
            }
            int var18 = arg0 + var13;
            if (var18 > field3486) {
                var18 = field3486;
            }
            int var19 = field3482 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field3480[var19] >> 16 & 0xFF) * var5;
                int var22 = (field3480[var19] >> 8 & 0xFF) * var5;
                int var23 = (field3480[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field3480[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field3483) {
                var30 = field3483;
            }
            int var31 = arg0 + var25;
            if (var31 > field3486 - 1) {
                var31 = field3486 - 1;
            }
            int var32 = field3482 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field3480[var32] >> 16 & 0xFF) * var5;
                int var35 = (field3480[var32] >> 8 & 0xFF) * var5;
                int var36 = (field3480[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field3480[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IIII)V", line = 323)
    public static final void method1577(int arg0, int arg1, int arg2, int arg3) {
        if (field3483 < arg0) {
            field3483 = arg0;
        }
        if (field3485 < arg1) {
            field3485 = arg1;
        }
        if (field3486 > arg2) {
            field3486 = arg2;
        }
        if (field3479 > arg3) {
            field3479 = arg3;
        }
        method1593();
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IIIII)V", line = 343)
    public static final void method1578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1587(arg0, arg1, var5 + 1, arg4);
            } else {
                method1587(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3483) {
                    var8 += (field3483 - arg0) * var10;
                    arg0 = field3483;
                }
                if (var11 >= field3486) {
                    var11 = field3486 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3485 && var12 < field3479) {
                        field3480[field3482 * var12 + arg0] = arg4;
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
                if (arg1 < field3485) {
                    var14 += (field3485 - arg1) * var16;
                    arg1 = field3485;
                }
                if (var17 >= field3479) {
                    var17 = field3479 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3483 && var18 < field3486) {
                        field3480[field3482 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1589(arg0, arg1, var6 + 1, arg4);
        } else {
            method1589(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IIIII)V", line = 434)
    public static final void method1579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1587(arg0, arg1, arg2, arg4);
        method1587(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1589(arg0, arg1, arg3, arg4);
        method1589(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V", line = 440)
    private static final void method1580(int arg0, int arg1, int arg2) {
        if (arg0 >= field3483 && arg1 >= field3485 && arg0 < field3486 && arg1 < field3479) {
            field3480[field3482 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[I[I)V", line = 449)
    public static final void method1581(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3482 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3480[var7++] = arg2;
            }
            var5 += field3482;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V", line = 471)
    public static void method1582() {
        field3480 = null;
        field3484 = null;
        field3481 = null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()V", line = 479)
    public static final void method1583() {
        int var0 = 0;
        int var1 = field3487 * field3482 - 7;
        while (var0 < var1) {
            field3480[var0++] = 0;
            field3480[var0++] = 0;
            field3480[var0++] = 0;
            field3480[var0++] = 0;
            field3480[var0++] = 0;
            field3480[var0++] = 0;
            field3480[var0++] = 0;
            field3480[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3480[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)V", line = 501)
    public static final void method1584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3483) {
            arg2 -= field3483 - arg0;
            arg0 = field3483;
        }
        if (arg1 < field3485) {
            arg3 -= field3485 - arg1;
            arg1 = field3485;
        }
        if (arg0 + arg2 > field3486) {
            arg2 = field3486 - arg0;
        }
        if (arg1 + arg3 > field3479) {
            arg3 = field3479 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3482 - arg2;
        int var9 = field3482 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3480[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3480[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(IIIII)V", line = 552)
    private static final void method1585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3485 || arg1 >= field3479) {
            return;
        }
        if (arg0 < field3483) {
            arg2 -= field3483 - arg0;
            arg0 = field3483;
        }
        if (arg0 + arg2 > field3486) {
            arg2 = field3486 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3482 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3480[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3480[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3480[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3480[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "([I)V", line = 594)
    public static final void method1586(int[] arg0) {
        field3483 = arg0[0];
        field3485 = arg0[1];
        field3486 = arg0[2];
        field3479 = arg0[3];
        method1593();
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IIII)V", line = 604)
    public static final void method1587(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3485 || arg1 >= field3479) {
            return;
        }
        if (arg0 < field3483) {
            arg2 -= field3483 - arg0;
            arg0 = field3483;
        }
        if (arg0 + arg2 > field3486) {
            arg2 = field3486 - arg0;
        }
        int var4 = field3482 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3480[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(IIIII)V", line = 627)
    private static final void method1588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3483 || arg0 >= field3486) {
            return;
        }
        if (arg1 < field3485) {
            arg2 -= field3485 - arg1;
            arg1 = field3485;
        }
        if (arg1 + arg2 > field3479) {
            arg2 = field3479 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3482 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3480[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3480[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3480[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3480[var9] = var14;
            var9 += field3482;
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(IIII)V", line = 672)
    public static final void method1589(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3483 || arg0 >= field3486) {
            return;
        }
        if (arg1 < field3485) {
            arg2 -= field3485 - arg1;
            arg1 = field3485;
        }
        if (arg1 + arg2 > field3479) {
            arg2 = field3479 - arg1;
        }
        int var4 = field3482 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field3480[var4] = arg3;
            var5++;
            var4 += field3482;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()V", line = 695)
    public static final void method1590() {
        field3483 = 0;
        field3485 = 0;
        field3486 = field3482;
        field3479 = field3487;
        method1593();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([I[I)V", line = 718)
    public static final void method1591(int[] arg0, int[] arg1) {
        if (field3479 - field3485 != arg0.length || field3479 - field3485 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field3484 = arg0;
        field3481 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIIIII)V", line = 729)
    public static final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1585(arg0, arg1, arg2, arg4, arg5);
        method1585(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1588(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1588(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()V", line = 742)
    public static final void method1593() {
        field3484 = null;
        field3481 = null;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IIIIII)V", line = 751)
    public static final void method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class25.method169();
        int var18 = arg1 - class25.method177();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class25.method158(var19, var20, var21);
        class25.method172(var23, var24, var25, var19, var20, var21, arg4);
        class25.method158(var19, var21, var22);
        class25.method172(var23, var25, var26, var19, var21, var22, arg4);
    }
}
