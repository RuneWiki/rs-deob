import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class155 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2241 = 0;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field2246 = 0;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2248 = 0;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    public static int[] field2242;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[I")
    public static int[] field2243;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "[I")
    public static int[] field2245;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2240 || arg1 >= field2241) {
            return;
        }
        if (arg0 < field2248) {
            arg2 -= field2248 - arg0;
            arg0 = field2248;
        }
        if (arg0 + arg2 > field2246) {
            arg2 = field2246 - arg0;
        }
        int var4 = field2244 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2242[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIII)V")
    public static final void method1015(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2248 || arg0 >= field2246) {
            return;
        }
        if (arg1 < field2240) {
            arg2 -= field2240 - arg1;
            arg1 = field2240;
        }
        if (arg1 + arg2 > field2241) {
            arg2 = field2241 - arg1;
        }
        int var4 = field2244 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field2242[var4] = arg3;
            var5++;
            var4 += field2244;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V")
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1029(arg0, arg1, arg2, arg3);
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
        if (var9 < field2240) {
            var9 = field2240;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field2241) {
            var10 = field2241;
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
            if (var30 < field2248) {
                var30 = field2248;
            }
            int var31 = arg0 + var13;
            if (var31 > field2246) {
                var31 = field2246;
            }
            int var32 = field2244 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field2242[var32] >> 16 & 0xFF) * var5;
                int var35 = (field2242[var32] >> 8 & 0xFF) * var5;
                int var36 = (field2242[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field2242[var32++] = var37;
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
            if (var22 < field2248) {
                var22 = field2248;
            }
            int var23 = arg0 + var17;
            if (var23 > field2246 - 1) {
                var23 = field2246 - 1;
            }
            int var24 = field2244 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field2242[var24] >> 16 & 0xFF) * var5;
                int var27 = (field2242[var24] >> 8 & 0xFF) * var5;
                int var28 = (field2242[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field2242[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([I)V")
    public static final void method1017(int[] arg0) {
        arg0[0] = field2248;
        arg0[1] = field2240;
        arg0[2] = field2246;
        arg0[3] = field2241;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIIII)V")
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2248) {
            arg2 -= field2248 - arg0;
            arg0 = field2248;
        }
        if (arg1 < field2240) {
            arg3 -= field2240 - arg1;
            arg1 = field2240;
        }
        if (arg0 + arg2 > field2246) {
            arg2 = field2246 - arg0;
        }
        if (arg1 + arg3 > field2241) {
            arg3 = field2241 - arg1;
        }
        int var5 = field2244 - arg2;
        int var6 = field2244 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2242[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(IIII)V")
    public static final void method1019(int arg0, int arg1, int arg2, int arg3) {
        if (field2248 < arg0) {
            field2248 = arg0;
        }
        if (field2240 < arg1) {
            field2240 = arg1;
        }
        if (field2246 > arg2) {
            field2246 = arg2;
        }
        if (field2241 > arg3) {
            field2241 = arg3;
        }
        method1021();
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(IIIII)V")
    public static final void method1020(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1014(arg0, arg1, arg2, arg4);
        method1014(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1015(arg0, arg1, arg3, arg4);
        method1015(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
    public static final void method1021() {
        field2245 = null;
        field2243 = null;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(IIII)V")
    public static final void method1022(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2244) {
            arg2 = field2244;
        }
        if (arg3 > field2247) {
            arg3 = field2247;
        }
        field2248 = arg0;
        field2240 = arg1;
        field2246 = arg2;
        field2241 = arg3;
        method1021();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V")
    public static final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class297.method1977();
        int var18 = arg1 - class297.method1993();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class297.method1983(var19, var20, var21);
        class297.method1978(var23, var24, var25, var19, var20, var21, arg4);
        class297.method1983(var19, var21, var22);
        class297.method1978(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()V")
    public static final void method1024() {
        int var0 = 0;
        int var1 = field2247 * field2244 - 7;
        while (var0 < var1) {
            field2242[var0++] = 0;
            field2242[var0++] = 0;
            field2242[var0++] = 0;
            field2242[var0++] = 0;
            field2242[var0++] = 0;
            field2242[var0++] = 0;
            field2242[var0++] = 0;
            field2242[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2242[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([III)V")
    public static final void method1025(int[] arg0, int arg1, int arg2) {
        field2242 = arg0;
        field2244 = arg1;
        field2247 = arg2;
        method1022(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III[I[I)V")
    public static final void method1026(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2244 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2242[var7++] = arg2;
            }
            var5 += field2244;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
    public static void method1027() {
        field2242 = null;
        field2245 = null;
        field2243 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    private static final void method1028(int arg0, int arg1, int arg2) {
        if (arg0 >= field2248 && arg1 >= field2240 && arg0 < field2246 && arg1 < field2241) {
            field2242[field2244 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(IIII)V")
    private static final void method1029(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1028(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field2240) {
            var4 = field2240;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field2241) {
            var5 = field2241;
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
            if (var21 < field2248) {
                var21 = field2248;
            }
            int var22 = arg0 + var8;
            if (var22 > field2246) {
                var22 = field2246;
            }
            int var23 = field2244 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field2242[var23++] = arg3;
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
            if (var17 < field2248) {
                var17 = field2248;
            }
            int var18 = arg0 + var12;
            if (var18 > field2246 - 1) {
                var18 = field2246 - 1;
            }
            int var19 = field2244 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field2242[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIIIII)V")
    public static final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2248) {
            arg2 -= field2248 - arg0;
            arg0 = field2248;
        }
        if (arg1 < field2240) {
            arg3 -= field2240 - arg1;
            arg1 = field2240;
        }
        if (arg0 + arg2 > field2246) {
            arg2 = field2246 - arg0;
        }
        if (arg1 + arg3 > field2241) {
            arg3 = field2241 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2244 - arg2;
        int var9 = field2244 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2242[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2242[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(IIIII)V")
    private static final void method1031(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2248 || arg0 >= field2246) {
            return;
        }
        if (arg1 < field2240) {
            arg2 -= field2240 - arg1;
            arg1 = field2240;
        }
        if (arg1 + arg2 > field2241) {
            arg2 = field2241 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2244 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2242[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2242[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2242[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2242[var9] = var14;
            var9 += field2244;
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(IIIII)V")
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1014(arg0, arg1, var5 + 1, arg4);
            } else {
                method1014(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2248) {
                    var8 += (field2248 - arg0) * var10;
                    arg0 = field2248;
                }
                if (var11 >= field2246) {
                    var11 = field2246 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2240 && var12 < field2241) {
                        field2242[field2244 * var12 + arg0] = arg4;
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
                if (arg1 < field2240) {
                    var14 += (field2240 - arg1) * var16;
                    arg1 = field2240;
                }
                if (var17 >= field2241) {
                    var17 = field2241 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2248 && var18 < field2246) {
                        field2242[field2244 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1015(arg0, arg1, var6 + 1, arg4);
        } else {
            method1015(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(IIIII)V")
    private static final void method1033(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2240 || arg1 >= field2241) {
            return;
        }
        if (arg0 < field2248) {
            arg2 -= field2248 - arg0;
            arg0 = field2248;
        }
        if (arg0 + arg2 > field2246) {
            arg2 = field2246 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2244 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2242[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2242[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2242[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2242[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()V")
    public static final void method1034() {
        field2248 = 0;
        field2240 = 0;
        field2246 = field2244;
        field2241 = field2247;
        method1021();
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "([I)V")
    public static final void method1035(int[] arg0) {
        field2248 = arg0[0];
        field2240 = arg0[1];
        field2246 = arg0[2];
        field2241 = arg0[3];
        method1021();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([I[I)V")
    public static final void method1036(int[] arg0, int[] arg1) {
        if (field2241 - field2240 != arg0.length || field2241 - field2240 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field2245 = arg0;
        field2243 = arg1;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(IIIIII)V")
    public static final void method1037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1033(arg0, arg1, arg2, arg4, arg5);
        method1033(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1031(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1031(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }
}
