import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class159 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field3013 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3010 = 0;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3016 = 0;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[I")
    public static int[] field3011;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[I")
    public static int[] field3012;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "[I")
    public static int[] field3015;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public static final void method1126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1146(arg0, arg1, arg2, arg4);
        method1146(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1128(arg0, arg1, arg3, arg4);
        method1128(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public static final void method1127(int arg0, int arg1, int arg2, int arg3) {
        if (field3008 < arg0) {
            field3008 = arg0;
        }
        if (field3013 < arg1) {
            field3013 = arg1;
        }
        if (field3010 > arg2) {
            field3010 = arg2;
        }
        if (field3016 > arg3) {
            field3016 = arg3;
        }
        method1140();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIII)V")
    public static final void method1128(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3008 || arg0 >= field3010) {
            return;
        }
        if (arg1 < field3013) {
            arg2 -= field3013 - arg1;
            arg1 = field3013;
        }
        if (arg1 + arg2 > field3016) {
            arg2 = field3016 - arg1;
        }
        int var4 = field3009 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3015[field3009 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[I[I)V")
    public static final void method1129(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3009 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3015[var7++] = arg2;
            }
            var5 += field3009;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIII)V")
    public static final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3008) {
            arg2 -= field3008 - arg0;
            arg0 = field3008;
        }
        if (arg1 < field3013) {
            arg3 -= field3013 - arg1;
            arg1 = field3013;
        }
        if (arg0 + arg2 > field3010) {
            arg2 = field3010 - arg0;
        }
        if (arg1 + arg3 > field3016) {
            arg3 = field3016 - arg1;
        }
        int var5 = field3009 - arg2;
        int var6 = field3009 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3015[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V")
    public static final void method1131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class167.method1189();
        int var18 = arg1 - class167.method1192();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class167.method1193(var19, var20, var21);
        class167.method1200(var23, var24, var25, var19, var20, var21, arg4);
        class167.method1193(var19, var21, var22);
        class167.method1200(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(IIIII)V")
    private static final void method1132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3013 || arg1 >= field3016) {
            return;
        }
        if (arg0 < field3008) {
            arg2 -= field3008 - arg0;
            arg0 = field3008;
        }
        if (arg0 + arg2 > field3010) {
            arg2 = field3010 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3009 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3015[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3015[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3015[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3015[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIIII)V")
    public static final void method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1132(arg0, arg1, arg2, arg4, arg5);
        method1132(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1138(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1138(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(IIIII)V")
    public static final void method1134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1146(arg0, arg1, var5 + 1, arg4);
            } else {
                method1146(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3008) {
                    var8 += (field3008 - arg0) * var10;
                    arg0 = field3008;
                }
                if (var11 >= field3010) {
                    var11 = field3010 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3013 && var12 < field3016) {
                        field3015[field3009 * var12 + arg0] = arg4;
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
                if (arg1 < field3013) {
                    var14 += (field3013 - arg1) * var16;
                    arg1 = field3013;
                }
                if (var17 >= field3016) {
                    var17 = field3016 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3008 && var18 < field3010) {
                        field3015[field3009 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1128(arg0, arg1, var6 + 1, arg4);
        } else {
            method1128(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I)V")
    public static final void method1135(int[] arg0) {
        field3008 = arg0[0];
        field3013 = arg0[1];
        field3010 = arg0[2];
        field3016 = arg0[3];
        method1140();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    private static final void method1136(int arg0, int arg1, int arg2) {
        if (arg0 >= field3008 && arg1 >= field3013 && arg0 < field3010 && arg1 < field3016) {
            field3015[field3009 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(IIIII)V")
    public static final void method1137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1143(arg0, arg1, arg2, arg3);
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
        if (var9 < field3013) {
            var9 = field3013;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3016) {
            var10 = field3016;
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
            if (var30 < field3008) {
                var30 = field3008;
            }
            int var31 = arg0 + var13;
            if (var31 > field3010) {
                var31 = field3010;
            }
            int var32 = field3009 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field3015[var32] >> 16 & 0xFF) * var5;
                int var35 = (field3015[var32] >> 8 & 0xFF) * var5;
                int var36 = (field3015[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field3015[var32++] = var37;
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
            if (var22 < field3008) {
                var22 = field3008;
            }
            int var23 = arg0 + var17;
            if (var23 > field3010 - 1) {
                var23 = field3010 - 1;
            }
            int var24 = field3009 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field3015[var24] >> 16 & 0xFF) * var5;
                int var27 = (field3015[var24] >> 8 & 0xFF) * var5;
                int var28 = (field3015[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field3015[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(IIIII)V")
    private static final void method1138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3008 || arg0 >= field3010) {
            return;
        }
        if (arg1 < field3013) {
            arg2 -= field3013 - arg1;
            arg1 = field3013;
        }
        if (arg1 + arg2 > field3016) {
            arg2 = field3016 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3009 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3015[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3015[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3015[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3015[var9] = var14;
            var9 += field3009;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[I)V")
    public static final void method1139(int[] arg0, int[] arg1) {
        if (field3016 - field3013 != arg0.length || field3016 - field3013 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field3012 = arg0;
        field3011 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public static final void method1140() {
        field3012 = null;
        field3011 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public static final void method1141() {
        field3008 = 0;
        field3013 = 0;
        field3010 = field3009;
        field3016 = field3014;
        method1140();
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public static void method1142() {
        field3015 = null;
        field3012 = null;
        field3011 = null;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(IIII)V")
    private static final void method1143(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1136(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3013) {
            var4 = field3013;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3016) {
            var5 = field3016;
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
            if (var21 < field3008) {
                var21 = field3008;
            }
            int var22 = arg0 + var8;
            if (var22 > field3010) {
                var22 = field3010;
            }
            int var23 = field3009 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field3015[var23++] = arg3;
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
            if (var17 < field3008) {
                var17 = field3008;
            }
            int var18 = arg0 + var12;
            if (var18 > field3010 - 1) {
                var18 = field3010 - 1;
            }
            int var19 = field3009 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field3015[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public static final void method1144() {
        int var0 = 0;
        int var1 = field3014 * field3009 - 7;
        while (var0 < var1) {
            field3015[var0++] = 0;
            field3015[var0++] = 0;
            field3015[var0++] = 0;
            field3015[var0++] = 0;
            field3015[var0++] = 0;
            field3015[var0++] = 0;
            field3015[var0++] = 0;
            field3015[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3015[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(IIIIII)V")
    public static final void method1145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3008) {
            arg2 -= field3008 - arg0;
            arg0 = field3008;
        }
        if (arg1 < field3013) {
            arg3 -= field3013 - arg1;
            arg1 = field3013;
        }
        if (arg0 + arg2 > field3010) {
            arg2 = field3010 - arg0;
        }
        if (arg1 + arg3 > field3016) {
            arg3 = field3016 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3009 - arg2;
        int var9 = field3009 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3015[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3015[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(IIII)V")
    public static final void method1146(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3013 || arg1 >= field3016) {
            return;
        }
        if (arg0 < field3008) {
            arg2 -= field3008 - arg0;
            arg0 = field3008;
        }
        if (arg0 + arg2 > field3010) {
            arg2 = field3010 - arg0;
        }
        int var4 = field3009 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3015[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([III)V")
    public static final void method1147(int[] arg0, int arg1, int arg2) {
        field3015 = arg0;
        field3009 = arg1;
        field3014 = arg2;
        method1148(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(IIII)V")
    public static final void method1148(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3009) {
            arg2 = field3009;
        }
        if (arg3 > field3014) {
            arg3 = field3014;
        }
        field3008 = arg0;
        field3013 = arg1;
        field3010 = arg2;
        field3016 = arg3;
        method1140();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([I)V")
    public static final void method1149(int[] arg0) {
        arg0[0] = field3008;
        arg0[1] = field3013;
        arg0[2] = field3010;
        arg0[3] = field3016;
    }
}
