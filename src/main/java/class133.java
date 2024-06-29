import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class133 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2446 = 0;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2450 = 0;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
    public static int[] field2444;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
    public static int[] field2445;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
    public static int[] field2447;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIII)V")
    public static final void method858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method864(arg0, arg1, arg2, arg4, arg5);
        method864(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method860(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method860(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([I[I)V")
    public static final void method859(int[] arg0, int[] arg1) {
        if (field2443 - field2450 != arg0.length || field2443 - field2450 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field2447 = arg0;
        field2444 = arg1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
    private static final void method860(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2448 || arg0 >= field2446) {
            return;
        }
        if (arg1 < field2450) {
            arg2 -= field2450 - arg1;
            arg1 = field2450;
        }
        if (arg1 + arg2 > field2443) {
            arg2 = field2443 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2442 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2445[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2445[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2445[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2445[var9] = var14;
            var9 += field2442;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)V")
    private static final void method861(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method867(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field2450) {
            var4 = field2450;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field2443) {
            var5 = field2443;
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
            if (var21 < field2448) {
                var21 = field2448;
            }
            int var22 = arg0 + var8;
            if (var22 > field2446) {
                var22 = field2446;
            }
            int var23 = field2442 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field2445[var23++] = arg3;
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
            if (var17 < field2448) {
                var17 = field2448;
            }
            int var18 = arg0 + var12;
            if (var18 > field2446 - 1) {
                var18 = field2446 - 1;
            }
            int var19 = field2442 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field2445[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIIII)V")
    public static final void method862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method871(arg0, arg1, var5 + 1, arg4);
            } else {
                method871(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2448) {
                    var8 += (field2448 - arg0) * var10;
                    arg0 = field2448;
                }
                if (var11 >= field2446) {
                    var11 = field2446 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2450 && var12 < field2443) {
                        field2445[field2442 * var12 + arg0] = arg4;
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
                if (arg1 < field2450) {
                    var14 += (field2450 - arg1) * var16;
                    arg1 = field2450;
                }
                if (var17 >= field2443) {
                    var17 = field2443 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2448 && var18 < field2446) {
                        field2445[field2442 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method872(arg0, arg1, var6 + 1, arg4);
        } else {
            method872(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([I)V")
    public static final void method863(int[] arg0) {
        field2448 = arg0[0];
        field2450 = arg0[1];
        field2446 = arg0[2];
        field2443 = arg0[3];
        method875();
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(IIIII)V")
    private static final void method864(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2450 || arg1 >= field2443) {
            return;
        }
        if (arg0 < field2448) {
            arg2 -= field2448 - arg0;
            arg0 = field2448;
        }
        if (arg0 + arg2 > field2446) {
            arg2 = field2446 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2442 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2445[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2445[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2445[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2445[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(IIIII)V")
    public static final void method865(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2448) {
            arg2 -= field2448 - arg0;
            arg0 = field2448;
        }
        if (arg1 < field2450) {
            arg3 -= field2450 - arg1;
            arg1 = field2450;
        }
        if (arg0 + arg2 > field2446) {
            arg2 = field2446 - arg0;
        }
        if (arg1 + arg3 > field2443) {
            arg3 = field2443 - arg1;
        }
        int var5 = field2442 - arg2;
        int var6 = field2442 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2445[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(IIIII)V")
    public static final void method866(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method861(arg0, arg1, arg2, arg3);
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
        if (var9 < field2450) {
            var9 = field2450;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field2443) {
            var10 = field2443;
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
            if (var30 < field2448) {
                var30 = field2448;
            }
            int var31 = arg0 + var13;
            if (var31 > field2446) {
                var31 = field2446;
            }
            int var32 = field2442 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field2445[var32] >> 16 & 0xFF) * var5;
                int var35 = (field2445[var32] >> 8 & 0xFF) * var5;
                int var36 = (field2445[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field2445[var32++] = var37;
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
            if (var22 < field2448) {
                var22 = field2448;
            }
            int var23 = arg0 + var17;
            if (var23 > field2446 - 1) {
                var23 = field2446 - 1;
            }
            int var24 = field2442 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field2445[var24] >> 16 & 0xFF) * var5;
                int var27 = (field2445[var24] >> 8 & 0xFF) * var5;
                int var28 = (field2445[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field2445[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    private static final void method867(int arg0, int arg1, int arg2) {
        if (arg0 >= field2448 && arg1 >= field2450 && arg0 < field2446 && arg1 < field2443) {
            field2445[field2442 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
    public static final void method868() {
        int var0 = 0;
        int var1 = field2449 * field2442 - 7;
        while (var0 < var1) {
            field2445[var0++] = 0;
            field2445[var0++] = 0;
            field2445[var0++] = 0;
            field2445[var0++] = 0;
            field2445[var0++] = 0;
            field2445[var0++] = 0;
            field2445[var0++] = 0;
            field2445[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2445[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "([I)V")
    public static final void method869(int[] arg0) {
        arg0[0] = field2448;
        arg0[1] = field2450;
        arg0[2] = field2446;
        arg0[3] = field2443;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIII)V")
    public static final void method870(int arg0, int arg1, int arg2, int arg3) {
        if (field2448 < arg0) {
            field2448 = arg0;
        }
        if (field2450 < arg1) {
            field2450 = arg1;
        }
        if (field2446 > arg2) {
            field2446 = arg2;
        }
        if (field2443 > arg3) {
            field2443 = arg3;
        }
        method875();
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(IIII)V")
    public static final void method871(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2450 || arg1 >= field2443) {
            return;
        }
        if (arg0 < field2448) {
            arg2 -= field2448 - arg0;
            arg0 = field2448;
        }
        if (arg0 + arg2 > field2446) {
            arg2 = field2446 - arg0;
        }
        int var4 = field2442 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2445[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(IIII)V")
    public static final void method872(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2448 || arg0 >= field2446) {
            return;
        }
        if (arg1 < field2450) {
            arg2 -= field2450 - arg1;
            arg1 = field2450;
        }
        if (arg1 + arg2 > field2443) {
            arg2 = field2443 - arg1;
        }
        int var4 = field2442 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2445[field2442 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()V")
    public static final void method873() {
        field2448 = 0;
        field2450 = 0;
        field2446 = field2442;
        field2443 = field2449;
        method875();
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIIIII)V")
    public static final void method874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2448) {
            arg2 -= field2448 - arg0;
            arg0 = field2448;
        }
        if (arg1 < field2450) {
            arg3 -= field2450 - arg1;
            arg1 = field2450;
        }
        if (arg0 + arg2 > field2446) {
            arg2 = field2446 - arg0;
        }
        if (arg1 + arg3 > field2443) {
            arg3 = field2443 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2442 - arg2;
        int var9 = field2442 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2445[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2445[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()V")
    public static final void method875() {
        field2447 = null;
        field2444 = null;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(IIIII)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method871(arg0, arg1, arg2, arg4);
        method871(arg0, arg1 + arg3 - 1, arg2, arg4);
        method872(arg0, arg1, arg3, arg4);
        method872(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(IIIIII)V")
    public static final void method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class270.method1842();
        int var18 = arg1 - class270.method1828();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class270.method1839(var19, var20, var21);
        class270.method1841(var23, var24, var25, var19, var20, var21, arg4);
        class270.method1839(var19, var21, var22);
        class270.method1841(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([III)V")
    public static final void method878(int[] arg0, int arg1, int arg2) {
        field2445 = arg0;
        field2442 = arg1;
        field2449 = arg2;
        method881(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[I[I)V")
    public static final void method879(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2442 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2445[var7++] = arg2;
            }
            var5 += field2442;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()V")
    public static void method880() {
        field2445 = null;
        field2447 = null;
        field2444 = null;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(IIII)V")
    public static final void method881(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2442) {
            arg2 = field2442;
        }
        if (arg3 > field2449) {
            arg3 = field2449;
        }
        field2448 = arg0;
        field2450 = arg1;
        field2446 = arg2;
        field2443 = arg3;
        method875();
    }
}
