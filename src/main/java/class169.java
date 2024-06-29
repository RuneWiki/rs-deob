import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class169 extends class106 {

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field3267 = 0;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field3270 = 0;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "[I")
    public static int[] field3268;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
    public static final void method1137(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3267 || arg0 >= field3270) {
            return;
        }
        if (arg1 < field3265) {
            arg2 -= field3265 - arg1;
            arg1 = field3265;
        }
        if (arg1 + arg2 > field3266) {
            arg2 = field3266 - arg1;
        }
        int var4 = field3271 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3268[field3271 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIII)V")
    public static final void method1138(int arg0, int arg1, int arg2, int arg3) {
        if (field3267 < arg0) {
            field3267 = arg0;
        }
        if (field3265 < arg1) {
            field3265 = arg1;
        }
        if (field3270 > arg2) {
            field3270 = arg2;
        }
        if (field3266 > arg3) {
            field3266 = arg3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V")
    private static final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3267 || arg0 >= field3270) {
            return;
        }
        if (arg1 < field3265) {
            arg2 -= field3265 - arg1;
            arg1 = field3265;
        }
        if (arg1 + arg2 > field3266) {
            arg2 = field3266 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3271 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3268[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3268[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3268[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3268[var9] = var14;
            var9 += field3271;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
    public static void method1140() {
        field3268 = null;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(IIII)V")
    public static final void method1141(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3265 || arg1 >= field3266) {
            return;
        }
        if (arg0 < field3267) {
            arg2 -= field3267 - arg0;
            arg0 = field3267;
        }
        if (arg0 + arg2 > field3270) {
            arg2 = field3270 - arg0;
        }
        int var4 = field3271 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3268[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3267) {
            arg2 -= field3267 - arg0;
            arg0 = field3267;
        }
        if (arg1 < field3265) {
            arg3 -= field3265 - arg1;
            arg1 = field3265;
        }
        if (arg0 + arg2 > field3270) {
            arg2 = field3270 - arg0;
        }
        if (arg1 + arg3 > field3266) {
            arg3 = field3266 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3271 - arg2;
        int var9 = field3271 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3268[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3268[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([I)V")
    public static final void method1143(int[] arg0) {
        arg0[0] = field3267;
        arg0[1] = field3265;
        arg0[2] = field3270;
        arg0[3] = field3266;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIIII)V")
    public static final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1141(arg0, arg1, var5 + 1, arg4);
            } else {
                method1141(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3267) {
                    var8 += (field3267 - arg0) * var10;
                    arg0 = field3267;
                }
                if (var11 >= field3270) {
                    var11 = field3270 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3265 && var12 < field3266) {
                        field3268[field3271 * var12 + arg0] = arg4;
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
                if (arg1 < field3265) {
                    var14 += (field3265 - arg1) * var16;
                    arg1 = field3265;
                }
                if (var17 >= field3266) {
                    var17 = field3266 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3267 && var18 < field3270) {
                        field3268[field3271 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1137(arg0, arg1, var6 + 1, arg4);
        } else {
            method1137(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(IIIII)V")
    private static final void method1145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3265 || arg1 >= field3266) {
            return;
        }
        if (arg0 < field3267) {
            arg2 -= field3267 - arg0;
            arg0 = field3267;
        }
        if (arg0 + arg2 > field3270) {
            arg2 = field3270 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3271 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3268[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3268[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3268[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3268[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIIIII)V")
    public static final void method1146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3267) {
            arg2 -= field3267 - arg0;
            arg0 = field3267;
        }
        if (arg1 < field3265) {
            var6 += (field3265 - arg1) * var7;
            arg3 -= field3265 - arg1;
            arg1 = field3265;
        }
        if (arg0 + arg2 > field3270) {
            arg2 = field3270 - arg0;
        }
        if (arg1 + arg3 > field3266) {
            arg3 = field3266 - arg1;
        }
        int var8 = field3271 - arg2;
        int var9 = field3271 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field3268[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(IIII)V")
    public static final void method1147(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3271) {
            arg2 = field3271;
        }
        if (arg3 > field3269) {
            arg3 = field3269;
        }
        field3267 = arg0;
        field3265 = arg1;
        field3270 = arg2;
        field3266 = arg3;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
    public static final void method1148() {
        field3267 = 0;
        field3265 = 0;
        field3270 = field3271;
        field3266 = field3269;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(IIIII)V")
    public static final void method1149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3267) {
            arg2 -= field3267 - arg0;
            arg0 = field3267;
        }
        if (arg1 < field3265) {
            arg3 -= field3265 - arg1;
            arg1 = field3265;
        }
        if (arg0 + arg2 > field3270) {
            arg2 = field3270 - arg0;
        }
        if (arg1 + arg3 > field3266) {
            arg3 = field3266 - arg1;
        }
        int var5 = field3271 - arg2;
        int var6 = field3271 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3268[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()V")
    public static final void method1150() {
        int var0 = 0;
        int var1 = field3271 * field3269 - 7;
        while (var0 < var1) {
            field3268[var0++] = 0;
            field3268[var0++] = 0;
            field3268[var0++] = 0;
            field3268[var0++] = 0;
            field3268[var0++] = 0;
            field3268[var0++] = 0;
            field3268[var0++] = 0;
            field3268[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3268[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(IIIII)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1141(arg0, arg1, arg2, arg4);
        method1141(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1137(arg0, arg1, arg3, arg4);
        method1137(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "([I)V")
    public static final void method1152(int[] arg0) {
        field3267 = arg0[0];
        field3265 = arg0[1];
        field3270 = arg0[2];
        field3266 = arg0[3];
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(IIIIII)V")
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1145(arg0, arg1, arg2, arg4, arg5);
        method1145(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1139(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1139(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([III)V")
    public static final void method1154(int[] arg0, int arg1, int arg2) {
        field3268 = arg0;
        field3271 = arg1;
        field3269 = arg2;
        method1147(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III[I[I)V")
    public static final void method1155(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3271 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3268[var7++] = arg2;
            }
            var5 += field3271;
        }
    }
}
