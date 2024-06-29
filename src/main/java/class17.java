import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class17 extends class19 {

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field283 = 0;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field285 = 0;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "[I")
    public static int[] field284;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([III)V")
    public static final void method89(int[] arg0, int arg1, int arg2) {
        field284 = arg0;
        field282 = arg1;
        field280 = arg2;
        method90(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field282) {
            arg2 = field282;
        }
        if (arg3 > field280) {
            arg3 = field280;
        }
        field283 = arg0;
        field285 = arg1;
        field279 = arg2;
        field281 = arg3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public static final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field283) {
            arg2 -= field283 - arg0;
            arg0 = field283;
        }
        if (arg1 < field285) {
            arg3 -= field285 - arg1;
            arg1 = field285;
        }
        if (arg0 + arg2 > field279) {
            arg2 = field279 - arg0;
        }
        if (arg1 + arg3 > field281) {
            arg3 = field281 - arg1;
        }
        int var5 = field282 - arg2;
        int var6 = field282 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field284[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIII)V")
    public static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method106(arg0, arg1, var5 + 1, arg4);
            } else {
                method106(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field283) {
                    var8 += (field283 - arg0) * var10;
                    arg0 = field283;
                }
                if (var11 >= field279) {
                    var11 = field279 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field285 && var12 < field281) {
                        field284[field282 * var12 + arg0] = arg4;
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
                if (arg1 < field285) {
                    var14 += (field285 - arg1) * var16;
                    arg1 = field285;
                }
                if (var17 >= field281) {
                    var17 = field281 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field283 && var18 < field279) {
                        field284[field282 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method107(arg0, arg1, var6 + 1, arg4);
        } else {
            method107(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([I)V")
    public static final void method93(int[] arg0) {
        field283 = arg0[0];
        field285 = arg0[1];
        field279 = arg0[2];
        field281 = arg0[3];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V")
    public static final void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method104(arg0, arg1, arg2, arg4, arg5);
        method104(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method98(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method98(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)V")
    public static final void method95(int arg0, int arg1, int arg2, int arg3) {
        if (field283 < arg0) {
            field283 = arg0;
        }
        if (field285 < arg1) {
            field285 = arg1;
        }
        if (field279 > arg2) {
            field279 = arg2;
        }
        if (field281 > arg3) {
            field281 = arg3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIII)V")
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field283) {
            arg2 -= field283 - arg0;
            arg0 = field283;
        }
        if (arg1 < field285) {
            arg3 -= field285 - arg1;
            arg1 = field285;
        }
        if (arg0 + arg2 > field279) {
            arg2 = field279 - arg0;
        }
        if (arg1 + arg3 > field281) {
            arg3 = field281 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field282 - arg2;
        int var9 = field282 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field284[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field284[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(IIIII)V")
    public static final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method106(arg0, arg1, arg2, arg4);
        method106(arg0, arg1 + arg3 - 1, arg2, arg4);
        method107(arg0, arg1, arg3, arg4);
        method107(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIII)V")
    private static final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field283 || arg0 >= field279) {
            return;
        }
        if (arg1 < field285) {
            arg2 -= field285 - arg1;
            arg1 = field285;
        }
        if (arg1 + arg2 > field281) {
            arg2 = field281 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field282 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field284[var9] >> 16 & 0xFF) * var5;
            int var12 = (field284[var9] >> 8 & 0xFF) * var5;
            int var13 = (field284[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field284[var9] = var14;
            var9 += field282;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
    public static final void method99() {
        int var0 = 0;
        int var1 = field282 * field280 - 7;
        while (var0 < var1) {
            field284[var0++] = 0;
            field284[var0++] = 0;
            field284[var0++] = 0;
            field284[var0++] = 0;
            field284[var0++] = 0;
            field284[var0++] = 0;
            field284[var0++] = 0;
            field284[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field284[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[I[I)V")
    public static final void method100(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field282 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field284[var7++] = arg2;
            }
            var5 += field282;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()V")
    public static final void method101() {
        field283 = 0;
        field285 = 0;
        field279 = field282;
        field281 = field280;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()V")
    public static void method102() {
        field284 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([I)V")
    public static final void method103(int[] arg0) {
        arg0[0] = field283;
        arg0[1] = field285;
        arg0[2] = field279;
        arg0[3] = field281;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(IIIII)V")
    private static final void method104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field285 || arg1 >= field281) {
            return;
        }
        if (arg0 < field283) {
            arg2 -= field283 - arg0;
            arg0 = field283;
        }
        if (arg0 + arg2 > field279) {
            arg2 = field279 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field282 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field284[var9] >> 16 & 0xFF) * var5;
            int var12 = (field284[var9] >> 8 & 0xFF) * var5;
            int var13 = (field284[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field284[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(IIIIII)V")
    public static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field283) {
            arg2 -= field283 - arg0;
            arg0 = field283;
        }
        if (arg1 < field285) {
            var6 += (field285 - arg1) * var7;
            arg3 -= field285 - arg1;
            arg1 = field285;
        }
        if (arg0 + arg2 > field279) {
            arg2 = field279 - arg0;
        }
        if (arg1 + arg3 > field281) {
            arg3 = field281 - arg1;
        }
        int var8 = field282 - arg2;
        int var9 = field282 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field284[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(IIII)V")
    public static final void method106(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field285 || arg1 >= field281) {
            return;
        }
        if (arg0 < field283) {
            arg2 -= field283 - arg0;
            arg0 = field283;
        }
        if (arg0 + arg2 > field279) {
            arg2 = field279 - arg0;
        }
        int var4 = field282 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field284[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIII)V")
    public static final void method107(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field283 || arg0 >= field279) {
            return;
        }
        if (arg1 < field285) {
            arg2 -= field285 - arg1;
            arg1 = field285;
        }
        if (arg1 + arg2 > field281) {
            arg2 = field281 - arg1;
        }
        int var4 = field282 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field284[field282 * var5 + var4] = arg3;
        }
    }
}
