import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class130 extends class99 {

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field3238 = 0;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "I")
    public static int field3240 = 0;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "[I")
    public static int[] field3242;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method1019(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3239) {
            arg2 = field3239;
        }
        if (arg3 > field3237) {
            arg3 = field3237;
        }
        field3238 = arg0;
        field3241 = arg1;
        field3240 = arg2;
        field3243 = arg3;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)V", line = 23)
    public static final void method1020(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3241 || arg1 >= field3243) {
            return;
        }
        if (arg0 < field3238) {
            arg2 -= field3238 - arg0;
            arg0 = field3238;
        }
        if (arg0 + arg2 > field3240) {
            arg2 = field3240 - arg0;
        }
        int var4 = field3239 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3242[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V", line = 48)
    public static final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3238) {
            arg2 -= field3238 - arg0;
            arg0 = field3238;
        }
        if (arg1 < field3241) {
            arg3 -= field3241 - arg1;
            arg1 = field3241;
        }
        if (arg0 + arg2 > field3240) {
            arg2 = field3240 - arg0;
        }
        if (arg1 + arg3 > field3243) {
            arg3 = field3243 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field3239 - arg2;
        int var11 = field3239 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field3242[var11] >> 16 & 0xFF) * var6;
                int var15 = (field3242[var11] >> 8 & 0xFF) * var6;
                int var16 = (field3242[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field3242[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V", line = 108)
    private static final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3238 || arg0 >= field3240) {
            return;
        }
        if (arg1 < field3241) {
            arg2 -= field3241 - arg1;
            arg1 = field3241;
        }
        if (arg1 + arg2 > field3243) {
            arg2 = field3243 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3239 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3242[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3242[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3242[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3242[var9] = var14;
            var9 += field3239;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([I)V", line = 151)
    public static final void method1023(int[] arg0) {
        arg0[0] = field3238;
        arg0[1] = field3241;
        arg0[2] = field3240;
        arg0[3] = field3243;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)V", line = 158)
    private static final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3241 || arg1 >= field3243) {
            return;
        }
        if (arg0 < field3238) {
            arg2 -= field3238 - arg0;
            arg0 = field3238;
        }
        if (arg0 + arg2 > field3240) {
            arg2 = field3240 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3239 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3242[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3242[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3242[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3242[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIIII)V", line = 202)
    public static final void method1025(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1020(arg0, arg1, var5 + 1, arg4);
            } else {
                method1020(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3238) {
                    var8 += (field3238 - arg0) * var10;
                    arg0 = field3238;
                }
                if (var11 >= field3240) {
                    var11 = field3240 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3241 && var12 < field3243) {
                        field3242[field3239 * var12 + arg0] = arg4;
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
                if (arg1 < field3241) {
                    var14 += (field3241 - arg1) * var16;
                    arg1 = field3241;
                }
                if (var17 >= field3243) {
                    var17 = field3243 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3238 && var18 < field3240) {
                        field3242[field3239 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1033(arg0, arg1, var6 + 1, arg4);
        } else {
            method1033(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 298)
    public static void method1026() {
        field3242 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIIII)V", line = 303)
    public static final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1024(arg0, arg1, arg2, arg4, arg5);
        method1024(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1022(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1022(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(IIIII)V", line = 316)
    public static final void method1028(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3238) {
            arg2 -= field3238 - arg0;
            arg0 = field3238;
        }
        if (arg1 < field3241) {
            arg3 -= field3241 - arg1;
            arg1 = field3241;
        }
        if (arg0 + arg2 > field3240) {
            arg2 = field3240 - arg0;
        }
        if (arg1 + arg3 > field3243) {
            arg3 = field3243 - arg1;
        }
        int var5 = field3239 - arg2;
        int var6 = field3239 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3242[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "([I)V", line = 359)
    public static final void method1029(int[] arg0) {
        field3238 = arg0[0];
        field3241 = arg0[1];
        field3240 = arg0[2];
        field3243 = arg0[3];
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V", line = 369)
    public static final void method1030() {
        field3238 = 0;
        field3241 = 0;
        field3240 = field3239;
        field3243 = field3237;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V", line = 377)
    public static final void method1031() {
        int var0 = 0;
        int var1 = field3239 * field3237 - 7;
        while (var0 < var1) {
            field3242[var0++] = 0;
            field3242[var0++] = 0;
            field3242[var0++] = 0;
            field3242[var0++] = 0;
            field3242[var0++] = 0;
            field3242[var0++] = 0;
            field3242[var0++] = 0;
            field3242[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3242[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(IIIII)V", line = 403)
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1020(arg0, arg1, arg2, arg4);
        method1020(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1033(arg0, arg1, arg3, arg4);
        method1033(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIII)V", line = 409)
    public static final void method1033(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3238 || arg0 >= field3240) {
            return;
        }
        if (arg1 < field3241) {
            arg2 -= field3241 - arg1;
            arg1 = field3241;
        }
        if (arg1 + arg2 > field3243) {
            arg2 = field3243 - arg1;
        }
        int var4 = field3239 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3242[field3239 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([III)V", line = 432)
    public static final void method1034(int[] arg0, int arg1, int arg2) {
        field3242 = arg0;
        field3239 = arg1;
        field3237 = arg2;
        method1019(0, 0, arg1, arg2);
    }
}
