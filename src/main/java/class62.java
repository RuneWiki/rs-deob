import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends class123 {

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field1332 = 0;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field1333 = 0;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "[I")
    public static int[] field1331;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public static final void method443(int[] arg0) {
        field1332 = arg0[0];
        field1330 = arg0[1];
        field1333 = arg0[2];
        field1334 = arg0[3];
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
    public static void method444() {
        field1331 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([III)V")
    public static final void method445(int[] arg0, int arg1, int arg2) {
        field1331 = arg0;
        field1335 = arg1;
        field1336 = arg2;
        method455(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    private static final void method446(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1332 || arg0 >= field1333) {
            return;
        }
        if (arg1 < field1330) {
            arg2 -= field1330 - arg1;
            arg1 = field1330;
        }
        if (arg1 + arg2 > field1334) {
            arg2 = field1334 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1335 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1331[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1331[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1331[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1331[var9] = var14;
            var9 += field1335;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIII)V")
    private static final void method447(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1330 || arg1 >= field1334) {
            return;
        }
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg0 + arg2 > field1333) {
            arg2 = field1333 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1335 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1331[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1331[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1331[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1331[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public static final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method447(arg0, arg1, arg2, arg4, arg5);
        method447(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method446(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method446(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([I)V")
    public static final void method449(int[] arg0) {
        arg0[0] = field1332;
        arg0[1] = field1330;
        arg0[2] = field1333;
        arg0[3] = field1334;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(IIIII)V")
    public static final void method450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method453(arg0, arg1, var5 + 1, arg4);
            } else {
                method453(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1332) {
                    var8 += (field1332 - arg0) * var10;
                    arg0 = field1332;
                }
                if (var11 >= field1333) {
                    var11 = field1333 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1330 && var12 < field1334) {
                        field1331[field1335 * var12 + arg0] = arg4;
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
                if (arg1 < field1330) {
                    var14 += (field1330 - arg1) * var16;
                    arg1 = field1330;
                }
                if (var17 >= field1334) {
                    var17 = field1334 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1332 && var18 < field1333) {
                        field1331[field1335 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method452(arg0, arg1, var6 + 1, arg4);
        } else {
            method452(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()V")
    public static final void method451() {
        int var0 = 0;
        int var1 = field1336 * field1335 - 7;
        while (var0 < var1) {
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1331[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public static final void method452(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1332 || arg0 >= field1333) {
            return;
        }
        if (arg1 < field1330) {
            arg2 -= field1330 - arg1;
            arg1 = field1330;
        }
        if (arg1 + arg2 > field1334) {
            arg2 = field1334 - arg1;
        }
        int var4 = field1335 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1331[field1335 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1330 || arg1 >= field1334) {
            return;
        }
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg0 + arg2 > field1333) {
            arg2 = field1333 - arg0;
        }
        int var4 = field1335 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1331[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(IIIII)V")
    public static final void method454(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg1 < field1330) {
            arg3 -= field1330 - arg1;
            arg1 = field1330;
        }
        if (arg0 + arg2 > field1333) {
            arg2 = field1333 - arg0;
        }
        if (arg1 + arg3 > field1334) {
            arg3 = field1334 - arg1;
        }
        int var5 = field1335 - arg2;
        int var6 = field1335 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1331[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(IIII)V")
    public static final void method455(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1335) {
            arg2 = field1335;
        }
        if (arg3 > field1336) {
            arg3 = field1336;
        }
        field1332 = arg0;
        field1330 = arg1;
        field1333 = arg2;
        field1334 = arg3;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIII)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg1 < field1330) {
            arg3 -= field1330 - arg1;
            arg1 = field1330;
        }
        if (arg0 + arg2 > field1333) {
            arg2 = field1333 - arg0;
        }
        if (arg1 + arg3 > field1334) {
            arg3 = field1334 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1335 - arg2;
        int var11 = field1335 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1331[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1331[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1331[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1331[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(IIIII)V")
    public static final void method457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method453(arg0, arg1, arg2, arg4);
        method453(arg0, arg1 + arg3 - 1, arg2, arg4);
        method452(arg0, arg1, arg3, arg4);
        method452(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()V")
    public static final void method458() {
        field1332 = 0;
        field1330 = 0;
        field1333 = field1335;
        field1334 = field1336;
    }
}
