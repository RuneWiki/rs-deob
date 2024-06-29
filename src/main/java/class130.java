import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class31 {

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "[I")
    public static int[] field2959;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
    public static final void method1015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2960) {
            arg2 -= field2960 - arg0;
            arg0 = field2960;
        }
        if (arg1 < field2962) {
            arg3 -= field2962 - arg1;
            arg1 = field2962;
        }
        if (arg0 + arg2 > field2963) {
            arg2 = field2963 - arg0;
        }
        if (arg1 + arg3 > field2961) {
            arg3 = field2961 - arg1;
        }
        int var5 = field2958 - arg2;
        int var6 = field2958 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2959[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
    public static final void method1016() {
        field2960 = 0;
        field2962 = 0;
        field2963 = field2958;
        field2961 = field2957;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V")
    public static final void method1017(int[] arg0) {
        arg0[0] = field2960;
        arg0[1] = field2962;
        arg0[2] = field2963;
        arg0[3] = field2961;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIII)V")
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1025(arg0, arg1, var5 + 1, arg4);
            } else {
                method1025(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2960) {
                    var8 += (field2960 - arg0) * var10;
                    arg0 = field2960;
                }
                if (var11 >= field2963) {
                    var11 = field2963 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2962 && var12 < field2961) {
                        field2959[field2958 * var12 + arg0] = arg4;
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
                if (arg1 < field2962) {
                    var14 += (field2962 - arg1) * var16;
                    arg1 = field2962;
                }
                if (var17 >= field2961) {
                    var17 = field2961 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2960 && var18 < field2963) {
                        field2959[field2958 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1022(arg0, arg1, var6 + 1, arg4);
        } else {
            method1022(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(IIIII)V")
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1025(arg0, arg1, arg2, arg4);
        method1025(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1022(arg0, arg1, arg3, arg4);
        method1022(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(IIIII)V")
    private static final void method1020(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2960 || arg0 >= field2963) {
            return;
        }
        if (arg1 < field2962) {
            arg2 -= field2962 - arg1;
            arg1 = field2962;
        }
        if (arg1 + arg2 > field2961) {
            arg2 = field2961 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2958 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2959[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2959[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2959[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2959[var9] = var14;
            var9 += field2958;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
    public static final void method1021(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2958) {
            arg2 = field2958;
        }
        if (arg3 > field2957) {
            arg3 = field2957;
        }
        field2960 = arg0;
        field2962 = arg1;
        field2963 = arg2;
        field2961 = arg3;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIII)V")
    public static final void method1022(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2960 || arg0 >= field2963) {
            return;
        }
        if (arg1 < field2962) {
            arg2 -= field2962 - arg1;
            arg1 = field2962;
        }
        if (arg1 + arg2 > field2961) {
            arg2 = field2961 - arg1;
        }
        int var4 = field2958 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2959[field2958 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()V")
    public static void method1023() {
        field2959 = null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "([I)V")
    public static final void method1024(int[] arg0) {
        field2960 = arg0[0];
        field2962 = arg0[1];
        field2963 = arg0[2];
        field2961 = arg0[3];
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(IIII)V")
    public static final void method1025(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2962 || arg1 >= field2961) {
            return;
        }
        if (arg0 < field2960) {
            arg2 -= field2960 - arg0;
            arg0 = field2960;
        }
        if (arg0 + arg2 > field2963) {
            arg2 = field2963 - arg0;
        }
        int var4 = field2958 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2959[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(IIIII)V")
    private static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2962 || arg1 >= field2961) {
            return;
        }
        if (arg0 < field2960) {
            arg2 -= field2960 - arg0;
            arg0 = field2960;
        }
        if (arg0 + arg2 > field2963) {
            arg2 = field2963 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2958 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2959[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2959[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2959[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2959[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
    public static final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2960) {
            arg2 -= field2960 - arg0;
            arg0 = field2960;
        }
        if (arg1 < field2962) {
            arg3 -= field2962 - arg1;
            arg1 = field2962;
        }
        if (arg0 + arg2 > field2963) {
            arg2 = field2963 - arg0;
        }
        if (arg1 + arg3 > field2961) {
            arg3 = field2961 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2958 - arg2;
        int var9 = field2958 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2959[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2959[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III[I[I)V")
    public static final void method1028(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2958 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2959[var7++] = arg2;
            }
            var5 += field2958;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()V")
    public static final void method1029() {
        int var0 = 0;
        int var1 = field2958 * field2957 - 7;
        while (var0 < var1) {
            field2959[var0++] = 0;
            field2959[var0++] = 0;
            field2959[var0++] = 0;
            field2959[var0++] = 0;
            field2959[var0++] = 0;
            field2959[var0++] = 0;
            field2959[var0++] = 0;
            field2959[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2959[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(IIII)V")
    public static final void method1030(int arg0, int arg1, int arg2, int arg3) {
        if (field2960 < arg0) {
            field2960 = arg0;
        }
        if (field2962 < arg1) {
            field2962 = arg1;
        }
        if (field2963 > arg2) {
            field2963 = arg2;
        }
        if (field2961 > arg3) {
            field2961 = arg3;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIIII)V")
    public static final void method1031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1026(arg0, arg1, arg2, arg4, arg5);
        method1026(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1020(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1020(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
    public static final void method1032(int[] arg0, int arg1, int arg2) {
        field2959 = arg0;
        field2958 = arg1;
        field2957 = arg2;
        method1021(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(IIIIII)V")
    public static final void method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2960) {
            arg2 -= field2960 - arg0;
            arg0 = field2960;
        }
        if (arg1 < field2962) {
            var6 += (field2962 - arg1) * var7;
            arg3 -= field2962 - arg1;
            arg1 = field2962;
        }
        if (arg0 + arg2 > field2963) {
            arg2 = field2963 - arg0;
        }
        if (arg1 + arg3 > field2961) {
            arg3 = field2961 - arg1;
        }
        int var8 = field2958 - arg2;
        int var9 = field2958 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field2959[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }
}
