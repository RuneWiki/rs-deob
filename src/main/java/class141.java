import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class141 extends class13 {

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field3238 = 0;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field3240 = 0;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "[I")
    public static int[] field3239;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([III)V")
    public static final void method1054(int[] arg0, int arg1, int arg2) {
        field3239 = arg0;
        field3242 = arg1;
        field3237 = arg2;
        method1068(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
    public static final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3240) {
            arg2 -= field3240 - arg0;
            arg0 = field3240;
        }
        if (arg1 < field3238) {
            arg3 -= field3238 - arg1;
            arg1 = field3238;
        }
        if (arg0 + arg2 > field3243) {
            arg2 = field3243 - arg0;
        }
        if (arg1 + arg3 > field3241) {
            arg3 = field3241 - arg1;
        }
        int var5 = field3242 - arg2;
        int var6 = field3242 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3239[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public static final void method1056() {
        int var0 = 0;
        int var1 = field3242 * field3237 - 7;
        while (var0 < var1) {
            field3239[var0++] = 0;
            field3239[var0++] = 0;
            field3239[var0++] = 0;
            field3239[var0++] = 0;
            field3239[var0++] = 0;
            field3239[var0++] = 0;
            field3239[var0++] = 0;
            field3239[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3239[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIII)V")
    public static final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1065(arg0, arg1, var5 + 1, arg4);
            } else {
                method1065(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3240) {
                    var8 += (field3240 - arg0) * var10;
                    arg0 = field3240;
                }
                if (var11 >= field3243) {
                    var11 = field3243 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3238 && var12 < field3241) {
                        field3239[field3242 * var12 + arg0] = arg4;
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
                if (arg1 < field3238) {
                    var14 += (field3238 - arg1) * var16;
                    arg1 = field3238;
                }
                if (var17 >= field3241) {
                    var17 = field3241 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3240 && var18 < field3243) {
                        field3239[field3242 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1062(arg0, arg1, var6 + 1, arg4);
        } else {
            method1062(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
    public static final void method1058() {
        field3240 = 0;
        field3238 = 0;
        field3243 = field3242;
        field3241 = field3237;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIII)V")
    public static final void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3240) {
            arg2 -= field3240 - arg0;
            arg0 = field3240;
        }
        if (arg1 < field3238) {
            arg3 -= field3238 - arg1;
            arg1 = field3238;
        }
        if (arg0 + arg2 > field3243) {
            arg2 = field3243 - arg0;
        }
        if (arg1 + arg3 > field3241) {
            arg3 = field3241 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3242 - arg2;
        int var9 = field3242 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3239[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3239[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(IIIII)V")
    public static final void method1060(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1065(arg0, arg1, arg2, arg4);
        method1065(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1062(arg0, arg1, arg3, arg4);
        method1062(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIII)V")
    public static final void method1061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3240) {
            arg2 -= field3240 - arg0;
            arg0 = field3240;
        }
        if (arg1 < field3238) {
            var6 += (field3238 - arg1) * var7;
            arg3 -= field3238 - arg1;
            arg1 = field3238;
        }
        if (arg0 + arg2 > field3243) {
            arg2 = field3243 - arg0;
        }
        if (arg1 + arg3 > field3241) {
            arg3 = field3241 - arg1;
        }
        int var8 = field3242 - arg2;
        int var9 = field3242 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field3239[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
    public static final void method1062(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3240 || arg0 >= field3243) {
            return;
        }
        if (arg1 < field3238) {
            arg2 -= field3238 - arg1;
            arg1 = field3238;
        }
        if (arg1 + arg2 > field3241) {
            arg2 = field3241 - arg1;
        }
        int var4 = field3242 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3239[field3242 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([I)V")
    public static final void method1063(int[] arg0) {
        field3240 = arg0[0];
        field3238 = arg0[1];
        field3243 = arg0[2];
        field3241 = arg0[3];
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(IIIII)V")
    private static final void method1064(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3238 || arg1 >= field3241) {
            return;
        }
        if (arg0 < field3240) {
            arg2 -= field3240 - arg0;
            arg0 = field3240;
        }
        if (arg0 + arg2 > field3243) {
            arg2 = field3243 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3242 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3239[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3239[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3239[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3239[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIII)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3238 || arg1 >= field3241) {
            return;
        }
        if (arg0 < field3240) {
            arg2 -= field3240 - arg0;
            arg0 = field3240;
        }
        if (arg0 + arg2 > field3243) {
            arg2 = field3243 - arg0;
        }
        int var4 = field3242 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3239[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
    public static void method1066() {
        field3239 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(IIII)V")
    public static final void method1067(int arg0, int arg1, int arg2, int arg3) {
        if (field3240 < arg0) {
            field3240 = arg0;
        }
        if (field3238 < arg1) {
            field3238 = arg1;
        }
        if (field3243 > arg2) {
            field3243 = arg2;
        }
        if (field3241 > arg3) {
            field3241 = arg3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(IIII)V")
    public static final void method1068(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3242) {
            arg2 = field3242;
        }
        if (arg3 > field3237) {
            arg3 = field3237;
        }
        field3240 = arg0;
        field3238 = arg1;
        field3243 = arg2;
        field3241 = arg3;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(IIIII)V")
    private static final void method1069(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3240 || arg0 >= field3243) {
            return;
        }
        if (arg1 < field3238) {
            arg2 -= field3238 - arg1;
            arg1 = field3238;
        }
        if (arg1 + arg2 > field3241) {
            arg2 = field3241 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3242 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3239[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3239[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3239[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3239[var9] = var14;
            var9 += field3242;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(IIIIII)V")
    public static final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1064(arg0, arg1, arg2, arg4, arg5);
        method1064(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1069(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1069(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[I[I)V")
    public static final void method1071(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3242 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3239[var7++] = arg2;
            }
            var5 += field3242;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "([I)V")
    public static final void method1072(int[] arg0) {
        arg0[0] = field3240;
        arg0[1] = field3238;
        arg0[2] = field3243;
        arg0[3] = field3241;
    }
}
