import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class211 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3636 = 0;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3637 = 0;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3641 = 0;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3642 = 0;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[I")
    public static int[] field3634;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "[I")
    public static int[] field3638;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[I")
    public static int[] field3640;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 6)
    public static final void method1392() {
        int var0 = 0;
        int var1 = field3639 * field3635 - 7;
        while (var0 < var1) {
            field3640[var0++] = 0;
            field3640[var0++] = 0;
            field3640[var0++] = 0;
            field3640[var0++] = 0;
            field3640[var0++] = 0;
            field3640[var0++] = 0;
            field3640[var0++] = 0;
            field3640[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3640[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method1393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1410(arg0, arg1, var5 + 1, arg4);
            } else {
                method1410(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3636) {
                    var8 += (field3636 - arg0) * var10;
                    arg0 = field3636;
                }
                if (var11 >= field3641) {
                    var11 = field3641 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3637 && var12 < field3642) {
                        field3640[field3635 * var12 + arg0] = arg4;
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
                if (arg1 < field3637) {
                    var14 += (field3637 - arg1) * var16;
                    arg1 = field3637;
                }
                if (var17 >= field3642) {
                    var17 = field3642 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3636 && var18 < field3641) {
                        field3640[field3635 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1399(arg0, arg1, var6 + 1, arg4);
        } else {
            method1399(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)V", line = 124)
    public static final void method1394(int arg0, int arg1, int arg2, int arg3) {
        if (field3636 < arg0) {
            field3636 = arg0;
        }
        if (field3637 < arg1) {
            field3637 = arg1;
        }
        if (field3641 > arg2) {
            field3641 = arg2;
        }
        if (field3642 > arg3) {
            field3642 = arg3;
        }
        method1401();
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIIII)V", line = 140)
    private static final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3637 || arg1 >= field3642) {
            return;
        }
        if (arg0 < field3636) {
            arg2 -= field3636 - arg0;
            arg0 = field3636;
        }
        if (arg0 + arg2 > field3641) {
            arg2 = field3641 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3635 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3640[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3640[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3640[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3640[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I)V", line = 184)
    public static final void method1396(int[] arg0) {
        arg0[0] = field3636;
        arg0[1] = field3637;
        arg0[2] = field3641;
        arg0[3] = field3642;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(IIIII)V", line = 190)
    private static final void method1397(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3636 || arg0 >= field3641) {
            return;
        }
        if (arg1 < field3637) {
            arg2 -= field3637 - arg1;
            arg1 = field3637;
        }
        if (arg1 + arg2 > field3642) {
            arg2 = field3642 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3635 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3640[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3640[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3640[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3640[var9] = var14;
            var9 += field3635;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(IIIII)V", line = 234)
    public static final void method1398(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3636) {
            arg2 -= field3636 - arg0;
            arg0 = field3636;
        }
        if (arg1 < field3637) {
            arg3 -= field3637 - arg1;
            arg1 = field3637;
        }
        if (arg0 + arg2 > field3641) {
            arg2 = field3641 - arg0;
        }
        if (arg1 + arg3 > field3642) {
            arg3 = field3642 - arg1;
        }
        int var5 = field3635 - arg2;
        int var6 = field3635 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3640[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIII)V", line = 280)
    public static final void method1399(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3636 || arg0 >= field3641) {
            return;
        }
        if (arg1 < field3637) {
            arg2 -= field3637 - arg1;
            arg1 = field3637;
        }
        if (arg1 + arg2 > field3642) {
            arg2 = field3642 - arg1;
        }
        int var4 = field3635 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3640[field3635 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V", line = 303)
    public static final void method1400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1395(arg0, arg1, arg2, arg4, arg5);
        method1395(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1397(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1397(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()V", line = 315)
    public static final void method1401() {
        field3634 = null;
        field3638 = null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIIIII)V", line = 326)
    public static final void method1402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class266.method1873();
        int var18 = arg1 - class266.method1864();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class266.method1865(var19, var20, var21);
        class266.method1880(var23, var24, var25, var19, var20, var21, arg4);
        class266.method1865(var19, var21, var22);
        class266.method1880(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[I)V", line = 382)
    public static final void method1403(int[] arg0, int[] arg1) {
        if (field3642 - field3637 != arg0.length || field3642 - field3637 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field3634 = arg0;
        field3638 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(IIIII)V", line = 393)
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1410(arg0, arg1, arg2, arg4);
        method1410(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1399(arg0, arg1, arg3, arg4);
        method1399(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(IIIII)V", line = 404)
    public static final void method1405(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1411(arg0, arg1, arg2, arg3);
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
        if (var9 < field3637) {
            var9 = field3637;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3642) {
            var10 = field3642;
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
            if (var17 < field3636) {
                var17 = field3636;
            }
            int var18 = arg0 + var13;
            if (var18 > field3641) {
                var18 = field3641;
            }
            int var19 = field3635 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field3640[var19] >> 16 & 0xFF) * var5;
                int var22 = (field3640[var19] >> 8 & 0xFF) * var5;
                int var23 = (field3640[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field3640[var19++] = var24;
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
            if (var30 < field3636) {
                var30 = field3636;
            }
            int var31 = arg0 + var25;
            if (var31 > field3641 - 1) {
                var31 = field3641 - 1;
            }
            int var32 = field3635 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field3640[var32] >> 16 & 0xFF) * var5;
                int var35 = (field3640[var32] >> 8 & 0xFF) * var5;
                int var36 = (field3640[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field3640[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(IIIIII)V", line = 538)
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3636) {
            arg2 -= field3636 - arg0;
            arg0 = field3636;
        }
        if (arg1 < field3637) {
            arg3 -= field3637 - arg1;
            arg1 = field3637;
        }
        if (arg0 + arg2 > field3641) {
            arg2 = field3641 - arg0;
        }
        if (arg1 + arg3 > field3642) {
            arg3 = field3642 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3635 - arg2;
        int var9 = field3635 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3640[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3640[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V", line = 591)
    private static final void method1407(int arg0, int arg1, int arg2) {
        if (arg0 >= field3636 && arg1 >= field3637 && arg0 < field3641 && arg1 < field3642) {
            field3640[field3635 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()V", line = 598)
    public static void method1408() {
        field3640 = null;
        field3634 = null;
        field3638 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[I[I)V", line = 608)
    public static final void method1409(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3635 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3640[var7++] = arg2;
            }
            var5 += field3635;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(IIII)V", line = 627)
    public static final void method1410(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3637 || arg1 >= field3642) {
            return;
        }
        if (arg0 < field3636) {
            arg2 -= field3636 - arg0;
            arg0 = field3636;
        }
        if (arg0 + arg2 > field3641) {
            arg2 = field3641 - arg0;
        }
        int var4 = field3635 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3640[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(IIII)V", line = 650)
    private static final void method1411(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1407(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3637) {
            var4 = field3637;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3642) {
            var5 = field3642;
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
            if (var12 < field3636) {
                var12 = field3636;
            }
            int var13 = arg0 + var8;
            if (var13 > field3641) {
                var13 = field3641;
            }
            int var14 = field3635 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field3640[var14++] = arg3;
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
            if (var21 < field3636) {
                var21 = field3636;
            }
            int var22 = arg0 + var16;
            if (var22 > field3641 - 1) {
                var22 = field3641 - 1;
            }
            int var23 = field3635 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field3640[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([I)V", line = 757)
    public static final void method1412(int[] arg0) {
        field3636 = arg0[0];
        field3637 = arg0[1];
        field3641 = arg0[2];
        field3642 = arg0[3];
        method1401();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([III)V", line = 769)
    public static final void method1413(int[] arg0, int arg1, int arg2) {
        field3640 = arg0;
        field3635 = arg1;
        field3639 = arg2;
        method1414(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(IIII)V", line = 776)
    public static final void method1414(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3635) {
            arg2 = field3635;
        }
        if (arg3 > field3639) {
            arg3 = field3639;
        }
        field3636 = arg0;
        field3637 = arg1;
        field3641 = arg2;
        field3642 = arg3;
        method1401();
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "()V", line = 795)
    public static final void method1415() {
        field3636 = 0;
        field3637 = 0;
        field3641 = field3635;
        field3642 = field3639;
        method1401();
    }
}
