import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 extends class124 {

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field3050 = 0;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field3052 = 0;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field3047 = 0;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "[I")
    public static int[] field3051;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3049) {
            arg2 -= field3049 - arg0;
            arg0 = field3049;
        }
        if (arg1 < field3047) {
            arg3 -= field3047 - arg1;
            arg1 = field3047;
        }
        if (arg0 + arg2 > field3050) {
            arg2 = field3050 - arg0;
        }
        if (arg1 + arg3 > field3052) {
            arg3 = field3052 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3046 - arg2;
        int var9 = field3046 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3051[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3051[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([III)V")
    public static final void method1101(int[] arg0, int arg1, int arg2) {
        field3051 = arg0;
        field3046 = arg1;
        field3048 = arg2;
        method1110(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
    public static final void method1102() {
        int var0 = 0;
        int var1 = field3048 * field3046 - 7;
        while (var0 < var1) {
            field3051[var0++] = 0;
            field3051[var0++] = 0;
            field3051[var0++] = 0;
            field3051[var0++] = 0;
            field3051[var0++] = 0;
            field3051[var0++] = 0;
            field3051[var0++] = 0;
            field3051[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3051[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIIIII)V")
    public static final void method1103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3049) {
            arg2 -= field3049 - arg0;
            arg0 = field3049;
        }
        if (arg1 < field3047) {
            var6 += (field3047 - arg1) * var7;
            arg3 -= field3047 - arg1;
            arg1 = field3047;
        }
        if (arg0 + arg2 > field3050) {
            arg2 = field3050 - arg0;
        }
        if (arg1 + arg3 > field3052) {
            arg3 = field3052 - arg1;
        }
        int var8 = field3046 - arg2;
        int var9 = field3046 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field3051[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3047 || arg1 >= field3052) {
            return;
        }
        if (arg0 < field3049) {
            arg2 -= field3049 - arg0;
            arg0 = field3049;
        }
        if (arg0 + arg2 > field3050) {
            arg2 = field3050 - arg0;
        }
        int var4 = field3046 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3051[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
    private static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3049 || arg0 >= field3050) {
            return;
        }
        if (arg1 < field3047) {
            arg2 -= field3047 - arg1;
            arg1 = field3047;
        }
        if (arg1 + arg2 > field3052) {
            arg2 = field3052 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3046 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3051[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3051[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3051[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3051[var9] = var14;
            var9 += field3046;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIII)V")
    public static final void method1106(int arg0, int arg1, int arg2, int arg3) {
        if (field3049 < arg0) {
            field3049 = arg0;
        }
        if (field3047 < arg1) {
            field3047 = arg1;
        }
        if (field3050 > arg2) {
            field3050 = arg2;
        }
        if (field3052 > arg3) {
            field3052 = arg3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
    public static final void method1107() {
        field3049 = 0;
        field3047 = 0;
        field3050 = field3046;
        field3052 = field3048;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(IIIIII)V")
    public static final void method1108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1112(arg0, arg1, arg2, arg4, arg5);
        method1112(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1105(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1105(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIIII)V")
    public static final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1104(arg0, arg1, var5 + 1, arg4);
            } else {
                method1104(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3049) {
                    var8 += (field3049 - arg0) * var10;
                    arg0 = field3049;
                }
                if (var11 >= field3050) {
                    var11 = field3050 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3047 && var12 < field3052) {
                        field3051[field3046 * var12 + arg0] = arg4;
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
                if (arg1 < field3047) {
                    var14 += (field3047 - arg1) * var16;
                    arg1 = field3047;
                }
                if (var17 >= field3052) {
                    var17 = field3052 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3049 && var18 < field3050) {
                        field3051[field3046 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1114(arg0, arg1, var6 + 1, arg4);
        } else {
            method1114(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(IIII)V")
    public static final void method1110(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3046) {
            arg2 = field3046;
        }
        if (arg3 > field3048) {
            arg3 = field3048;
        }
        field3049 = arg0;
        field3047 = arg1;
        field3050 = arg2;
        field3052 = arg3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([I)V")
    public static final void method1111(int[] arg0) {
        arg0[0] = field3049;
        arg0[1] = field3047;
        arg0[2] = field3050;
        arg0[3] = field3052;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(IIIII)V")
    private static final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3047 || arg1 >= field3052) {
            return;
        }
        if (arg0 < field3049) {
            arg2 -= field3049 - arg0;
            arg0 = field3049;
        }
        if (arg0 + arg2 > field3050) {
            arg2 = field3050 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3046 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3051[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3051[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3051[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3051[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "([I)V")
    public static final void method1113(int[] arg0) {
        field3049 = arg0[0];
        field3047 = arg0[1];
        field3050 = arg0[2];
        field3052 = arg0[3];
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(IIII)V")
    public static final void method1114(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3049 || arg0 >= field3050) {
            return;
        }
        if (arg1 < field3047) {
            arg2 -= field3047 - arg1;
            arg1 = field3047;
        }
        if (arg1 + arg2 > field3052) {
            arg2 = field3052 - arg1;
        }
        int var4 = field3046 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3051[field3046 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(IIIII)V")
    public static final void method1115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1104(arg0, arg1, arg2, arg4);
        method1104(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1114(arg0, arg1, arg3, arg4);
        method1114(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III[I[I)V")
    public static final void method1116(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3046 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3051[var7++] = arg2;
            }
            var5 += field3046;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
    public static void method1117() {
        field3051 = null;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(IIIII)V")
    public static final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3049) {
            arg2 -= field3049 - arg0;
            arg0 = field3049;
        }
        if (arg1 < field3047) {
            arg3 -= field3047 - arg1;
            arg1 = field3047;
        }
        if (arg0 + arg2 > field3050) {
            arg2 = field3050 - arg0;
        }
        if (arg1 + arg3 > field3052) {
            arg3 = field3052 - arg1;
        }
        int var5 = field3046 - arg2;
        int var6 = field3046 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3051[var6++] = arg4;
            }
            var6 += var5;
        }
    }
}
