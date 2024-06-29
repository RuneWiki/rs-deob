import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class146 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2634 = 0;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2636 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2641 = 0;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
    public static int[] field2637;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
    public static int[] field2638;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field2640;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1109(arg0, arg1, arg2, arg4, arg5);
        method1109(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1117(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1117(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V", line = 16)
    public static final void method1107(int arg0, int arg1, int arg2, int arg3) {
        if (field2641 < arg0) {
            field2641 = arg0;
        }
        if (field2642 < arg1) {
            field2642 = arg1;
        }
        if (field2634 > arg2) {
            field2634 = arg2;
        }
        if (field2636 > arg3) {
            field2636 = arg3;
        }
        method1108();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 33)
    public static final void method1108() {
        field2640 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V", line = 37)
    private static final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2642 || arg1 >= field2636) {
            return;
        }
        if (arg0 < field2641) {
            arg2 -= field2641 - arg0;
            arg0 = field2641;
        }
        if (arg0 + arg2 > field2634) {
            arg2 = field2634 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2639 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2637[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2637[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2637[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2637[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIII)V", line = 79)
    public static final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2641) {
            arg2 -= field2641 - arg0;
            arg0 = field2641;
        }
        if (arg1 < field2642) {
            arg3 -= field2642 - arg1;
            arg1 = field2642;
        }
        if (arg0 + arg2 > field2634) {
            arg2 = field2634 - arg0;
        }
        if (arg1 + arg3 > field2636) {
            arg3 = field2636 - arg1;
        }
        int var5 = field2639 - arg2;
        int var6 = field2639 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2637[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([I[I)V", line = 122)
    public static final void method1111(int[] arg0, int[] arg1) {
        if (field2636 - field2642 != arg0.length || field2636 - field2642 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field2640 = arg0;
        field2638 = arg1;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(IIIII)V", line = 134)
    public static final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1121(arg0, arg1, var5 + 1, arg4);
            } else {
                method1121(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2641) {
                    var8 += (field2641 - arg0) * var10;
                    arg0 = field2641;
                }
                if (var11 >= field2634) {
                    var11 = field2634 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2642 && var12 < field2636) {
                        field2637[field2639 * var12 + arg0] = arg4;
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
                if (arg1 < field2642) {
                    var14 += (field2642 - arg1) * var16;
                    arg1 = field2642;
                }
                if (var17 >= field2636) {
                    var17 = field2636 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2641 && var18 < field2634) {
                        field2637[field2639 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1115(arg0, arg1, var6 + 1, arg4);
        } else {
            method1115(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIIII)V", line = 229)
    public static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class27.method241();
        int var18 = arg1 - class27.method232();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class27.method253(var19, var20, var21);
        class27.method251(var23, var24, var25, var19, var20, var21, arg4);
        class27.method253(var19, var21, var22);
        class27.method251(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([I)V", line = 286)
    public static final void method1114(int[] arg0) {
        field2641 = arg0[0];
        field2642 = arg0[1];
        field2634 = arg0[2];
        field2636 = arg0[3];
        method1108();
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIII)V", line = 297)
    public static final void method1115(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2641 || arg0 >= field2634) {
            return;
        }
        if (arg1 < field2642) {
            arg2 -= field2642 - arg1;
            arg1 = field2642;
        }
        if (arg1 + arg2 > field2636) {
            arg2 = field2636 - arg1;
        }
        int var4 = field2639 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2637[field2639 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)V", line = 323)
    public static final void method1116(int[] arg0, int arg1, int arg2) {
        field2637 = arg0;
        field2639 = arg1;
        field2635 = arg2;
        method1127(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(IIIII)V", line = 331)
    private static final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2641 || arg0 >= field2634) {
            return;
        }
        if (arg1 < field2642) {
            arg2 -= field2642 - arg1;
            arg1 = field2642;
        }
        if (arg1 + arg2 > field2636) {
            arg2 = field2636 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2639 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2637[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2637[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2637[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2637[var9] = var14;
            var9 += field2639;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V", line = 374)
    public static final void method1118() {
        int var0 = 0;
        int var1 = field2639 * field2635 - 7;
        while (var0 < var1) {
            field2637[var0++] = 0;
            field2637[var0++] = 0;
            field2637[var0++] = 0;
            field2637[var0++] = 0;
            field2637[var0++] = 0;
            field2637[var0++] = 0;
            field2637[var0++] = 0;
            field2637[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2637[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(IIII)V", line = 397)
    private static final void method1119(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1125(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field2642) {
            var4 = field2642;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field2636) {
            var5 = field2636;
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
            if (var12 < field2641) {
                var12 = field2641;
            }
            int var13 = arg0 + var8;
            if (var13 > field2634) {
                var13 = field2634;
            }
            int var14 = field2639 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field2637[var14++] = arg3;
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
            if (var21 < field2641) {
                var21 = field2641;
            }
            int var22 = arg0 + var16;
            if (var22 > field2634 - 1) {
                var22 = field2634 - 1;
            }
            int var23 = field2639 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field2637[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V", line = 504)
    public static void method1120() {
        field2637 = null;
        field2640 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(IIII)V", line = 511)
    public static final void method1121(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2642 || arg1 >= field2636) {
            return;
        }
        if (arg0 < field2641) {
            arg2 -= field2641 - arg0;
            arg0 = field2641;
        }
        if (arg0 + arg2 > field2634) {
            arg2 = field2634 - arg0;
        }
        int var4 = field2639 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2637[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V", line = 535)
    public static final void method1122() {
        field2641 = 0;
        field2642 = 0;
        field2634 = field2639;
        field2636 = field2635;
        method1108();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[I[I)V", line = 543)
    public static final void method1123(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2639 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2637[var7++] = arg2;
            }
            var5 += field2639;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(IIIII)V", line = 567)
    public static final void method1124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1121(arg0, arg1, arg2, arg4);
        method1121(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1115(arg0, arg1, arg3, arg4);
        method1115(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V", line = 573)
    private static final void method1125(int arg0, int arg1, int arg2) {
        if (arg0 >= field2641 && arg1 >= field2642 && arg0 < field2634 && arg1 < field2636) {
            field2637[field2639 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(IIIIII)V", line = 595)
    public static final void method1126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2641) {
            arg2 -= field2641 - arg0;
            arg0 = field2641;
        }
        if (arg1 < field2642) {
            arg3 -= field2642 - arg1;
            arg1 = field2642;
        }
        if (arg0 + arg2 > field2634) {
            arg2 = field2634 - arg0;
        }
        if (arg1 + arg3 > field2636) {
            arg3 = field2636 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2639 - arg2;
        int var9 = field2639 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2637[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2637[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(IIII)V", line = 645)
    public static final void method1127(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2639) {
            arg2 = field2639;
        }
        if (arg3 > field2635) {
            arg3 = field2635;
        }
        field2641 = arg0;
        field2642 = arg1;
        field2634 = arg2;
        field2636 = arg3;
        method1108();
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(IIIII)V", line = 664)
    public static final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1119(arg0, arg1, arg2, arg3);
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
        if (var9 < field2642) {
            var9 = field2642;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field2636) {
            var10 = field2636;
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
            if (var17 < field2641) {
                var17 = field2641;
            }
            int var18 = arg0 + var13;
            if (var18 > field2634) {
                var18 = field2634;
            }
            int var19 = field2639 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field2637[var19] >> 16 & 0xFF) * var5;
                int var22 = (field2637[var19] >> 8 & 0xFF) * var5;
                int var23 = (field2637[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field2637[var19++] = var24;
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
            if (var30 < field2641) {
                var30 = field2641;
            }
            int var31 = arg0 + var25;
            if (var31 > field2634 - 1) {
                var31 = field2634 - 1;
            }
            int var32 = field2639 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field2637[var32] >> 16 & 0xFF) * var5;
                int var35 = (field2637[var32] >> 8 & 0xFF) * var5;
                int var36 = (field2637[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field2637[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "([I)V", line = 803)
    public static final void method1129(int[] arg0) {
        arg0[0] = field2641;
        arg0[1] = field2642;
        arg0[2] = field2634;
        arg0[3] = field2636;
    }
}
