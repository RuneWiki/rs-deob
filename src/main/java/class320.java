import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class320 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field5525 = 0;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field5526 = 0;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field5530 = 0;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field5527 = 0;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "[I")
    public static int[] field5523;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[I")
    public static int[] field5524;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "[I")
    public static int[] field5531;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)V", line = 3)
    private static final void method2198(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method2218(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field5530) {
            var4 = field5530;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field5526) {
            var5 = field5526;
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
            if (var12 < field5527) {
                var12 = field5527;
            }
            int var13 = arg0 + var8;
            if (var13 > field5525) {
                var13 = field5525;
            }
            int var14 = field5528 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field5531[var14++] = arg3;
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
            if (var21 < field5527) {
                var21 = field5527;
            }
            int var22 = arg0 + var16;
            if (var22 > field5525 - 1) {
                var22 = field5525 - 1;
            }
            int var23 = field5528 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field5531[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIII)V", line = 108)
    public static final void method2199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field5527) {
            arg2 -= field5527 - arg0;
            arg0 = field5527;
        }
        if (arg1 < field5530) {
            arg3 -= field5530 - arg1;
            arg1 = field5530;
        }
        if (arg0 + arg2 > field5525) {
            arg2 = field5525 - arg0;
        }
        if (arg1 + arg3 > field5526) {
            arg3 = field5526 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field5528 - arg2;
        int var9 = field5528 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field5531[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field5531[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 156)
    public static final void method2200() {
        field5523 = null;
        field5524 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([I[I)V", line = 160)
    public static final void method2201(int[] arg0, int[] arg1) {
        if (field5526 - field5530 != arg0.length || field5526 - field5530 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field5523 = arg0;
        field5524 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V", line = 179)
    public static final void method2202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method2198(arg0, arg1, arg2, arg3);
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
        if (var9 < field5530) {
            var9 = field5530;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field5526) {
            var10 = field5526;
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
            if (var17 < field5527) {
                var17 = field5527;
            }
            int var18 = arg0 + var13;
            if (var18 > field5525) {
                var18 = field5525;
            }
            int var19 = field5528 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field5531[var19] >> 16 & 0xFF) * var5;
                int var22 = (field5531[var19] >> 8 & 0xFF) * var5;
                int var23 = (field5531[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field5531[var19++] = var24;
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
            if (var30 < field5527) {
                var30 = field5527;
            }
            int var31 = arg0 + var25;
            if (var31 > field5525 - 1) {
                var31 = field5525 - 1;
            }
            int var32 = field5528 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field5531[var32] >> 16 & 0xFF) * var5;
                int var35 = (field5531[var32] >> 8 & 0xFF) * var5;
                int var36 = (field5531[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field5531[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([I)V", line = 313)
    public static final void method2203(int[] arg0) {
        field5527 = arg0[0];
        field5530 = arg0[1];
        field5525 = arg0[2];
        field5526 = arg0[3];
        method2200();
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "([I)V", line = 322)
    public static final void method2204(int[] arg0) {
        arg0[0] = field5527;
        arg0[1] = field5530;
        arg0[2] = field5525;
        arg0[3] = field5526;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IIIIII)V", line = 334)
    public static final void method2205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method2212(arg0, arg1, arg2, arg4, arg5);
        method2212(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method2213(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method2213(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IIII)V", line = 345)
    public static final void method2206(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field5530 || arg1 >= field5526) {
            return;
        }
        if (arg0 < field5527) {
            arg2 -= field5527 - arg0;
            arg0 = field5527;
        }
        if (arg0 + arg2 > field5525) {
            arg2 = field5525 - arg0;
        }
        int var4 = field5528 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field5531[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IIIII)V", line = 368)
    public static final void method2207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method2206(arg0, arg1, arg2, arg4);
        method2206(arg0, arg1 + arg3 - 1, arg2, arg4);
        method2211(arg0, arg1, arg3, arg4);
        method2211(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()V", line = 378)
    public static final void method2208() {
        field5527 = 0;
        field5530 = 0;
        field5525 = field5528;
        field5526 = field5529;
        method2200();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[I[I)V", line = 395)
    public static final void method2209(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field5528 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field5531[var7++] = arg2;
            }
            var5 += field5528;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(IIIII)V", line = 416)
    public static final void method2210(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method2206(arg0, arg1, var5 + 1, arg4);
            } else {
                method2206(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field5527) {
                    var8 += (field5527 - arg0) * var10;
                    arg0 = field5527;
                }
                if (var11 >= field5525) {
                    var11 = field5525 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field5530 && var12 < field5526) {
                        field5531[field5528 * var12 + arg0] = arg4;
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
                if (arg1 < field5530) {
                    var14 += (field5530 - arg1) * var16;
                    arg1 = field5530;
                }
                if (var17 >= field5526) {
                    var17 = field5526 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field5527 && var18 < field5525) {
                        field5531[field5528 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method2211(arg0, arg1, var6 + 1, arg4);
        } else {
            method2211(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(IIII)V", line = 509)
    public static final void method2211(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field5527 || arg0 >= field5525) {
            return;
        }
        if (arg1 < field5530) {
            arg2 -= field5530 - arg1;
            arg1 = field5530;
        }
        if (arg1 + arg2 > field5526) {
            arg2 = field5526 - arg1;
        }
        int var4 = field5528 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field5531[field5528 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(IIIII)V", line = 533)
    private static final void method2212(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field5530 || arg1 >= field5526) {
            return;
        }
        if (arg0 < field5527) {
            arg2 -= field5527 - arg0;
            arg0 = field5527;
        }
        if (arg0 + arg2 > field5525) {
            arg2 = field5525 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field5528 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field5531[var9] >> 16 & 0xFF) * var5;
            int var12 = (field5531[var9] >> 8 & 0xFF) * var5;
            int var13 = (field5531[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field5531[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(IIIII)V", line = 576)
    private static final void method2213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5527 || arg0 >= field5525) {
            return;
        }
        if (arg1 < field5530) {
            arg2 -= field5530 - arg1;
            arg1 = field5530;
        }
        if (arg1 + arg2 > field5526) {
            arg2 = field5526 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field5528 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field5531[var9] >> 16 & 0xFF) * var5;
            int var12 = (field5531[var9] >> 8 & 0xFF) * var5;
            int var13 = (field5531[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field5531[var9] = var14;
            var9 += field5528;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()V", line = 620)
    public static final void method2214() {
        int var0 = 0;
        int var1 = field5529 * field5528 - 7;
        while (var0 < var1) {
            field5531[var0++] = 0;
            field5531[var0++] = 0;
            field5531[var0++] = 0;
            field5531[var0++] = 0;
            field5531[var0++] = 0;
            field5531[var0++] = 0;
            field5531[var0++] = 0;
            field5531[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field5531[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "()V", line = 642)
    public static void method2215() {
        field5531 = null;
        field5523 = null;
        field5524 = null;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(IIII)V", line = 647)
    public static final void method2216(int arg0, int arg1, int arg2, int arg3) {
        if (field5527 < arg0) {
            field5527 = arg0;
        }
        if (field5530 < arg1) {
            field5530 = arg1;
        }
        if (field5525 > arg2) {
            field5525 = arg2;
        }
        if (field5526 > arg3) {
            field5526 = arg3;
        }
        method2200();
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(IIIII)V", line = 663)
    public static final void method2217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5527) {
            arg2 -= field5527 - arg0;
            arg0 = field5527;
        }
        if (arg1 < field5530) {
            arg3 -= field5530 - arg1;
            arg1 = field5530;
        }
        if (arg0 + arg2 > field5525) {
            arg2 = field5525 - arg0;
        }
        if (arg1 + arg3 > field5526) {
            arg3 = field5526 - arg1;
        }
        int var5 = field5528 - arg2;
        int var6 = field5528 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field5531[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V", line = 714)
    private static final void method2218(int arg0, int arg1, int arg2) {
        if (arg0 >= field5527 && arg1 >= field5530 && arg0 < field5525 && arg1 < field5526) {
            field5531[field5528 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(IIIIII)V", line = 729)
    public static final void method2219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class102.method697();
        int var18 = arg1 - class102.method690();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class102.method702(var19, var20, var21);
        class102.method703(var23, var24, var25, var19, var20, var21, arg4);
        class102.method702(var19, var21, var22);
        class102.method703(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(IIII)V", line = 785)
    public static final void method2220(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field5528) {
            arg2 = field5528;
        }
        if (arg3 > field5529) {
            arg3 = field5529;
        }
        field5527 = arg0;
        field5530 = arg1;
        field5525 = arg2;
        field5526 = arg3;
        method2200();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([III)V", line = 806)
    public static final void method2221(int[] arg0, int arg1, int arg2) {
        field5531 = arg0;
        field5528 = arg1;
        field5529 = arg2;
        method2220(0, 0, arg1, arg2);
    }
}
