import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class142 extends class110 {

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public static int field3420 = 0;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field3424 = 0;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "[I")
    public static int[] field3426;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
    private static final void method1150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3421 || arg0 >= field3423) {
            return;
        }
        if (arg1 < field3424) {
            arg2 -= field3424 - arg1;
            arg1 = field3424;
        }
        if (arg1 + arg2 > field3420) {
            arg2 = field3420 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3422 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3426[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3426[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3426[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3426[var9] = var14;
            var9 += field3422;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIII)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3421) {
            arg2 -= field3421 - arg0;
            arg0 = field3421;
        }
        if (arg1 < field3424) {
            arg3 -= field3424 - arg1;
            arg1 = field3424;
        }
        if (arg0 + arg2 > field3423) {
            arg2 = field3423 - arg0;
        }
        if (arg1 + arg3 > field3420) {
            arg3 = field3420 - arg1;
        }
        int var5 = field3422 - arg2;
        int var6 = field3422 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3426[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([III)V")
    public static final void method1152(int[] arg0, int arg1, int arg2) {
        field3426 = arg0;
        field3422 = arg1;
        field3425 = arg2;
        method1162(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public static final void method1153(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3421 || arg0 >= field3423) {
            return;
        }
        if (arg1 < field3424) {
            arg2 -= field3424 - arg1;
            arg1 = field3424;
        }
        if (arg1 + arg2 > field3420) {
            arg2 = field3420 - arg1;
        }
        int var4 = field3422 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3426[field3422 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([I)V")
    public static final void method1154(int[] arg0) {
        arg0[0] = field3421;
        arg0[1] = field3424;
        arg0[2] = field3423;
        arg0[3] = field3420;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
    public static final void method1155() {
        field3421 = 0;
        field3424 = 0;
        field3423 = field3422;
        field3420 = field3425;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
    public static void method1156() {
        field3426 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
    public static final void method1157(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3424 || arg1 >= field3420) {
            return;
        }
        if (arg0 < field3421) {
            arg2 -= field3421 - arg0;
            arg0 = field3421;
        }
        if (arg0 + arg2 > field3423) {
            arg2 = field3423 - arg0;
        }
        int var4 = field3422 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3426[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
    public static final void method1158() {
        int var0 = 0;
        int var1 = field3425 * field3422 - 7;
        while (var0 < var1) {
            field3426[var0++] = 0;
            field3426[var0++] = 0;
            field3426[var0++] = 0;
            field3426[var0++] = 0;
            field3426[var0++] = 0;
            field3426[var0++] = 0;
            field3426[var0++] = 0;
            field3426[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3426[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIII)V")
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1157(arg0, arg1, var5 + 1, arg4);
            } else {
                method1157(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3421) {
                    var8 += (field3421 - arg0) * var10;
                    arg0 = field3421;
                }
                if (var11 >= field3423) {
                    var11 = field3423 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3424 && var12 < field3420) {
                        field3426[field3422 * var12 + arg0] = arg4;
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
                if (arg1 < field3424) {
                    var14 += (field3424 - arg1) * var16;
                    arg1 = field3424;
                }
                if (var17 >= field3420) {
                    var17 = field3420 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3421 && var18 < field3423) {
                        field3426[field3422 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1153(arg0, arg1, var6 + 1, arg4);
        } else {
            method1153(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIII)V")
    public static final void method1160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1157(arg0, arg1, arg2, arg4);
        method1157(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1153(arg0, arg1, arg3, arg4);
        method1153(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(IIIII)V")
    private static final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3424 || arg1 >= field3420) {
            return;
        }
        if (arg0 < field3421) {
            arg2 -= field3421 - arg0;
            arg0 = field3421;
        }
        if (arg0 + arg2 > field3423) {
            arg2 = field3423 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3422 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3426[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3426[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3426[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3426[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(IIII)V")
    public static final void method1162(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3422) {
            arg2 = field3422;
        }
        if (arg3 > field3425) {
            arg3 = field3425;
        }
        field3421 = arg0;
        field3424 = arg1;
        field3423 = arg2;
        field3420 = arg3;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "([I)V")
    public static final void method1163(int[] arg0) {
        field3421 = arg0[0];
        field3424 = arg0[1];
        field3423 = arg0[2];
        field3420 = arg0[3];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
    public static final void method1164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3421) {
            arg2 -= field3421 - arg0;
            arg0 = field3421;
        }
        if (arg1 < field3424) {
            arg3 -= field3424 - arg1;
            arg1 = field3424;
        }
        if (arg0 + arg2 > field3423) {
            arg2 = field3423 - arg0;
        }
        if (arg1 + arg3 > field3420) {
            arg3 = field3420 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field3422 - arg2;
        int var11 = field3422 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field3426[var11] >> 16 & 0xFF) * var6;
                int var15 = (field3426[var11] >> 8 & 0xFF) * var6;
                int var16 = (field3426[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field3426[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V")
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1161(arg0, arg1, arg2, arg4, arg5);
        method1161(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1150(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1150(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }
}
