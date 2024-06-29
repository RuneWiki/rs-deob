import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class38 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field431 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field434 = 0;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
    public static int[] field429;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "[I")
    public static int[] field430;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    public static int[] field432;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V", line = 3)
    private static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field427 || arg1 >= field428) {
            return;
        }
        if (arg0 < field434) {
            arg2 -= field434 - arg0;
            arg0 = field434;
        }
        if (arg0 + arg2 > field431) {
            arg2 = field431 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field433 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field429[var9] >> 16 & 0xFF) * var5;
            int var12 = (field429[var9] >> 8 & 0xFF) * var5;
            int var13 = (field429[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field429[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III[I[I)V", line = 47)
    public static final void method212(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field433 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field429[var7++] = arg2;
            }
            var5 += field433;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V", line = 71)
    public static final void method213(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field427 || arg1 >= field428) {
            return;
        }
        if (arg0 < field434) {
            arg2 -= field434 - arg0;
            arg0 = field434;
        }
        if (arg0 + arg2 > field431) {
            arg2 = field431 - arg0;
        }
        int var4 = field433 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field429[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)V", line = 94)
    public static final void method214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method211(arg0, arg1, arg2, arg4, arg5);
        method211(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method221(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method221(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IIIIII)V", line = 106)
    public static final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class184.method1292();
        int var18 = arg1 - class184.method1278();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class184.method1291(var19, var20, var21);
        class184.method1283(var23, var24, var25, var19, var20, var21, arg4);
        class184.method1291(var19, var21, var22);
        class184.method1283(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IIIII)V", line = 162)
    public static final void method216(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method213(arg0, arg1, arg2, arg4);
        method213(arg0, arg1 + arg3 - 1, arg2, arg4);
        method223(arg0, arg1, arg3, arg4);
        method223(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IIII)V", line = 168)
    public static final void method217(int arg0, int arg1, int arg2, int arg3) {
        if (field434 < arg0) {
            field434 = arg0;
        }
        if (field427 < arg1) {
            field427 = arg1;
        }
        if (field431 > arg2) {
            field431 = arg2;
        }
        if (field428 > arg3) {
            field428 = arg3;
        }
        method225();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([I)V", line = 183)
    public static final void method218(int[] arg0) {
        arg0[0] = field434;
        arg0[1] = field427;
        arg0[2] = field431;
        arg0[3] = field428;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(IIIII)V", line = 189)
    public static final void method219(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method233(arg0, arg1, arg2, arg3);
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
        if (var9 < field427) {
            var9 = field427;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field428) {
            var10 = field428;
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
            if (var17 < field434) {
                var17 = field434;
            }
            int var18 = arg0 + var13;
            if (var18 > field431) {
                var18 = field431;
            }
            int var19 = field433 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field429[var19] >> 16 & 0xFF) * var5;
                int var22 = (field429[var19] >> 8 & 0xFF) * var5;
                int var23 = (field429[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field429[var19++] = var24;
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
            if (var30 < field434) {
                var30 = field434;
            }
            int var31 = arg0 + var25;
            if (var31 > field431 - 1) {
                var31 = field431 - 1;
            }
            int var32 = field433 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field429[var32] >> 16 & 0xFF) * var5;
                int var35 = (field429[var32] >> 8 & 0xFF) * var5;
                int var36 = (field429[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field429[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(IIII)V", line = 322)
    public static final void method220(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field433) {
            arg2 = field433;
        }
        if (arg3 > field435) {
            arg3 = field435;
        }
        field434 = arg0;
        field427 = arg1;
        field431 = arg2;
        field428 = arg3;
        method225();
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(IIIII)V", line = 343)
    private static final void method221(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field434 || arg0 >= field431) {
            return;
        }
        if (arg1 < field427) {
            arg2 -= field427 - arg1;
            arg1 = field427;
        }
        if (arg1 + arg2 > field428) {
            arg2 = field428 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field433 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field429[var9] >> 16 & 0xFF) * var5;
            int var12 = (field429[var9] >> 8 & 0xFF) * var5;
            int var13 = (field429[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field429[var9] = var14;
            var9 += field433;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V", line = 387)
    public static final void method222() {
        field434 = 0;
        field427 = 0;
        field431 = field433;
        field428 = field435;
        method225();
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(IIII)V", line = 402)
    public static final void method223(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field434 || arg0 >= field431) {
            return;
        }
        if (arg1 < field427) {
            arg2 -= field427 - arg1;
            arg1 = field427;
        }
        if (arg1 + arg2 > field428) {
            arg2 = field428 - arg1;
        }
        int var4 = field433 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field429[var4] = arg3;
            var5++;
            var4 += field433;
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(IIIII)V", line = 425)
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field434) {
            arg2 -= field434 - arg0;
            arg0 = field434;
        }
        if (arg1 < field427) {
            arg3 -= field427 - arg1;
            arg1 = field427;
        }
        if (arg0 + arg2 > field431) {
            arg2 = field431 - arg0;
        }
        if (arg1 + arg3 > field428) {
            arg3 = field428 - arg1;
        }
        int var5 = field433 - arg2;
        int var6 = field433 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field429[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "()V", line = 468)
    public static final void method225() {
        field430 = null;
        field432 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V", line = 472)
    private static final void method226(int arg0, int arg1, int arg2) {
        if (arg0 >= field434 && arg1 >= field427 && arg0 < field431 && arg1 < field428) {
            field429[field433 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([I[I)V", line = 479)
    public static final void method227(int[] arg0, int[] arg1) {
        if (field428 - field427 != arg0.length || field428 - field427 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field430 = arg0;
        field432 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([III)V", line = 492)
    public static final void method228(int[] arg0, int arg1, int arg2) {
        field429 = arg0;
        field433 = arg1;
        field435 = arg2;
        method220(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(IIIII)V", line = 504)
    public static final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method213(arg0, arg1, var5 + 1, arg4);
            } else {
                method213(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field434) {
                    var8 += (field434 - arg0) * var10;
                    arg0 = field434;
                }
                if (var11 >= field431) {
                    var11 = field431 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field427 && var12 < field428) {
                        field429[field433 * var12 + arg0] = arg4;
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
                if (arg1 < field427) {
                    var14 += (field427 - arg1) * var16;
                    arg1 = field427;
                }
                if (var17 >= field428) {
                    var17 = field428 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field434 && var18 < field431) {
                        field429[field433 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method223(arg0, arg1, var6 + 1, arg4);
        } else {
            method223(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "([I)V", line = 595)
    public static final void method230(int[] arg0) {
        field434 = arg0[0];
        field427 = arg0[1];
        field431 = arg0[2];
        field428 = arg0[3];
        method225();
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(IIIIII)V", line = 602)
    public static final void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field434) {
            arg2 -= field434 - arg0;
            arg0 = field434;
        }
        if (arg1 < field427) {
            arg3 -= field427 - arg1;
            arg1 = field427;
        }
        if (arg0 + arg2 > field431) {
            arg2 = field431 - arg0;
        }
        if (arg1 + arg3 > field428) {
            arg3 = field428 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field433 - arg2;
        int var9 = field433 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field429[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field429[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "()V", line = 651)
    public static final void method232() {
        int var0 = 0;
        int var1 = field435 * field433 - 7;
        while (var0 < var1) {
            field429[var0++] = 0;
            field429[var0++] = 0;
            field429[var0++] = 0;
            field429[var0++] = 0;
            field429[var0++] = 0;
            field429[var0++] = 0;
            field429[var0++] = 0;
            field429[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field429[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(IIII)V", line = 673)
    private static final void method233(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method226(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field427) {
            var4 = field427;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field428) {
            var5 = field428;
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
            if (var12 < field434) {
                var12 = field434;
            }
            int var13 = arg0 + var8;
            if (var13 > field431) {
                var13 = field431;
            }
            int var14 = field433 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field429[var14++] = arg3;
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
            if (var21 < field434) {
                var21 = field434;
            }
            int var22 = arg0 + var16;
            if (var22 > field431 - 1) {
                var22 = field431 - 1;
            }
            int var23 = field433 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field429[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "()V", line = 785)
    public static void method234() {
        field429 = null;
        field430 = null;
        field432 = null;
    }
}
