import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class34 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field570 = 0;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field567 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    public static int[] field568;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
    public static int[] field569;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[I")
    public static int[] field571;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()V", line = 3)
    public static final void method273() {
        field568 = null;
        field569 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method280(arg0, arg1, arg2, arg4);
        method280(arg0, arg1 + arg3 - 1, arg2, arg4);
        method281(arg0, arg1, arg3, arg4);
        method281(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V", line = 14)
    public static final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field564) {
            arg2 -= field564 - arg0;
            arg0 = field564;
        }
        if (arg1 < field566) {
            arg3 -= field566 - arg1;
            arg1 = field566;
        }
        if (arg0 + arg2 > field567) {
            arg2 = field567 - arg0;
        }
        if (arg1 + arg3 > field570) {
            arg3 = field570 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field563 - arg2;
        int var9 = field563 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field571[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field571[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V", line = 63)
    private static final void method276(int arg0, int arg1, int arg2) {
        if (arg0 >= field564 && arg1 >= field566 && arg0 < field567 && arg1 < field570) {
            field571[field563 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[I)V", line = 71)
    public static final void method277(int[] arg0, int[] arg1) {
        if (field570 - field566 != arg0.length || field570 - field566 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field568 = arg0;
        field569 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIIII)V", line = 83)
    public static final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method284(arg0, arg1, arg2, arg4, arg5);
        method284(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method290(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method290(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([I)V", line = 93)
    public static final void method279(int[] arg0) {
        field564 = arg0[0];
        field566 = arg0[1];
        field567 = arg0[2];
        field570 = arg0[3];
        method273();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V", line = 100)
    public static final void method280(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field566 || arg1 >= field570) {
            return;
        }
        if (arg0 < field564) {
            arg2 -= field564 - arg0;
            arg0 = field564;
        }
        if (arg0 + arg2 > field567) {
            arg2 = field567 - arg0;
        }
        int var4 = field563 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field571[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIII)V", line = 123)
    public static final void method281(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field564 || arg0 >= field567) {
            return;
        }
        if (arg1 < field566) {
            arg2 -= field566 - arg1;
            arg1 = field566;
        }
        if (arg1 + arg2 > field570) {
            arg2 = field570 - arg1;
        }
        int var4 = field563 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field571[field563 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V", line = 150)
    public static final void method282(int[] arg0, int arg1, int arg2) {
        field571 = arg0;
        field563 = arg1;
        field565 = arg2;
        method287(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()V", line = 157)
    public static final void method283() {
        int var0 = 0;
        int var1 = field565 * field563 - 7;
        while (var0 < var1) {
            field571[var0++] = 0;
            field571[var0++] = 0;
            field571[var0++] = 0;
            field571[var0++] = 0;
            field571[var0++] = 0;
            field571[var0++] = 0;
            field571[var0++] = 0;
            field571[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field571[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIII)V", line = 178)
    private static final void method284(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field566 || arg1 >= field570) {
            return;
        }
        if (arg0 < field564) {
            arg2 -= field564 - arg0;
            arg0 = field564;
        }
        if (arg0 + arg2 > field567) {
            arg2 = field567 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field563 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field571[var9] >> 16 & 0xFF) * var5;
            int var12 = (field571[var9] >> 8 & 0xFF) * var5;
            int var13 = (field571[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field571[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIIIII)V", line = 221)
    public static final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class200.method1343();
        int var18 = arg1 - class200.method1357();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class200.method1352(var19, var20, var21);
        class200.method1348(var23, var24, var25, var19, var20, var21, arg4);
        class200.method1352(var19, var21, var22);
        class200.method1348(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIIII)V", line = 283)
    public static final void method286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field564) {
            arg2 -= field564 - arg0;
            arg0 = field564;
        }
        if (arg1 < field566) {
            arg3 -= field566 - arg1;
            arg1 = field566;
        }
        if (arg0 + arg2 > field567) {
            arg2 = field567 - arg0;
        }
        if (arg1 + arg3 > field570) {
            arg3 = field570 - arg1;
        }
        int var5 = field563 - arg2;
        int var6 = field563 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field571[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIII)V", line = 326)
    public static final void method287(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field563) {
            arg2 = field563;
        }
        if (arg3 > field565) {
            arg3 = field565;
        }
        field564 = arg0;
        field566 = arg1;
        field567 = arg2;
        field570 = arg3;
        method273();
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([I)V", line = 358)
    public static final void method288(int[] arg0) {
        arg0[0] = field564;
        arg0[1] = field566;
        arg0[2] = field567;
        arg0[3] = field570;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(IIII)V", line = 367)
    public static final void method289(int arg0, int arg1, int arg2, int arg3) {
        if (field564 < arg0) {
            field564 = arg0;
        }
        if (field566 < arg1) {
            field566 = arg1;
        }
        if (field567 > arg2) {
            field567 = arg2;
        }
        if (field570 > arg3) {
            field570 = arg3;
        }
        method273();
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(IIIII)V", line = 387)
    private static final void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field564 || arg0 >= field567) {
            return;
        }
        if (arg1 < field566) {
            arg2 -= field566 - arg1;
            arg1 = field566;
        }
        if (arg1 + arg2 > field570) {
            arg2 = field570 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field563 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field571[var9] >> 16 & 0xFF) * var5;
            int var12 = (field571[var9] >> 8 & 0xFF) * var5;
            int var13 = (field571[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field571[var9] = var14;
            var9 += field563;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(IIIII)V", line = 431)
    public static final void method291(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method280(arg0, arg1, var5 + 1, arg4);
            } else {
                method280(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field564) {
                    var8 += (field564 - arg0) * var10;
                    arg0 = field564;
                }
                if (var11 >= field567) {
                    var11 = field567 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field566 && var12 < field570) {
                        field571[field563 * var12 + arg0] = arg4;
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
                if (arg1 < field566) {
                    var14 += (field566 - arg1) * var16;
                    arg1 = field566;
                }
                if (var17 >= field570) {
                    var17 = field570 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field564 && var18 < field567) {
                        field571[field563 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method281(arg0, arg1, var6 + 1, arg4);
        } else {
            method281(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(IIII)V", line = 524)
    private static final void method292(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method276(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field566) {
            var4 = field566;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field570) {
            var5 = field570;
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
            if (var12 < field564) {
                var12 = field564;
            }
            int var13 = arg0 + var8;
            if (var13 > field567) {
                var13 = field567;
            }
            int var14 = field563 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field571[var14++] = arg3;
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
            if (var21 < field564) {
                var21 = field564;
            }
            int var22 = arg0 + var16;
            if (var22 > field567 - 1) {
                var22 = field567 - 1;
            }
            int var23 = field563 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field571[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(IIIII)V", line = 637)
    public static final void method293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method292(arg0, arg1, arg2, arg3);
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
        if (var9 < field566) {
            var9 = field566;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field570) {
            var10 = field570;
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
            if (var17 < field564) {
                var17 = field564;
            }
            int var18 = arg0 + var13;
            if (var18 > field567) {
                var18 = field567;
            }
            int var19 = field563 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field571[var19] >> 16 & 0xFF) * var5;
                int var22 = (field571[var19] >> 8 & 0xFF) * var5;
                int var23 = (field571[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field571[var19++] = var24;
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
            if (var30 < field564) {
                var30 = field564;
            }
            int var31 = arg0 + var25;
            if (var31 > field567 - 1) {
                var31 = field567 - 1;
            }
            int var32 = field563 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field571[var32] >> 16 & 0xFF) * var5;
                int var35 = (field571[var32] >> 8 & 0xFF) * var5;
                int var36 = (field571[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field571[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()V", line = 770)
    public static final void method294() {
        field564 = 0;
        field566 = 0;
        field567 = field563;
        field570 = field565;
        method273();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[I[I)V", line = 783)
    public static final void method295(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field563 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field571[var7++] = arg2;
            }
            var5 += field563;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()V", line = 802)
    public static void method296() {
        field571 = null;
        field568 = null;
        field569 = null;
    }
}
