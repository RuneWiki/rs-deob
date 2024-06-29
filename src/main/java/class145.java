import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class145 extends class124 {

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field3549 = 0;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    public static int field3551 = 0;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
    public static int field3553 = 0;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field3550 = 0;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "[I")
    public static int[] field3548;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3550) {
            arg2 -= field3550 - arg0;
            arg0 = field3550;
        }
        if (arg1 < field3553) {
            arg3 -= field3553 - arg1;
            arg1 = field3553;
        }
        if (arg0 + arg2 > field3549) {
            arg2 = field3549 - arg0;
        }
        if (arg1 + arg3 > field3551) {
            arg3 = field3551 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field3552 - arg2;
        int var11 = field3552 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field3548[var11] >> 16 & 0xFF) * var6;
                int var15 = (field3548[var11] >> 8 & 0xFF) * var6;
                int var16 = (field3548[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field3548[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
    public static final void method1157(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3550 || arg0 >= field3549) {
            return;
        }
        if (arg1 < field3553) {
            arg2 -= field3553 - arg1;
            arg1 = field3553;
        }
        if (arg1 + arg2 > field3551) {
            arg2 = field3551 - arg1;
        }
        int var4 = field3552 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3548[field3552 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)V")
    public static final void method1158(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3552) {
            arg2 = field3552;
        }
        if (arg3 > field3547) {
            arg3 = field3547;
        }
        field3550 = arg0;
        field3553 = arg1;
        field3549 = arg2;
        field3551 = arg3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    public static final void method1159() {
        int var0 = 0;
        int var1 = field3552 * field3547 - 7;
        while (var0 < var1) {
            field3548[var0++] = 0;
            field3548[var0++] = 0;
            field3548[var0++] = 0;
            field3548[var0++] = 0;
            field3548[var0++] = 0;
            field3548[var0++] = 0;
            field3548[var0++] = 0;
            field3548[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3548[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([I)V")
    public static final void method1160(int[] arg0) {
        field3550 = arg0[0];
        field3553 = arg0[1];
        field3549 = arg0[2];
        field3551 = arg0[3];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    private static final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3553 || arg1 >= field3551) {
            return;
        }
        if (arg0 < field3550) {
            arg2 -= field3550 - arg0;
            arg0 = field3550;
        }
        if (arg0 + arg2 > field3549) {
            arg2 = field3549 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3552 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3548[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3548[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3548[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3548[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIIII)V")
    public static final void method1162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1161(arg0, arg1, arg2, arg4, arg5);
        method1161(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1169(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1169(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIII)V")
    public static final void method1163(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1164(arg0, arg1, arg2, arg4);
        method1164(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1157(arg0, arg1, arg3, arg4);
        method1157(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(IIII)V")
    public static final void method1164(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3553 || arg1 >= field3551) {
            return;
        }
        if (arg0 < field3550) {
            arg2 -= field3550 - arg0;
            arg0 = field3550;
        }
        if (arg0 + arg2 > field3549) {
            arg2 = field3549 - arg0;
        }
        int var4 = field3552 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3548[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(IIIII)V")
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3550) {
            arg2 -= field3550 - arg0;
            arg0 = field3550;
        }
        if (arg1 < field3553) {
            arg3 -= field3553 - arg1;
            arg1 = field3553;
        }
        if (arg0 + arg2 > field3549) {
            arg2 = field3549 - arg0;
        }
        if (arg1 + arg3 > field3551) {
            arg3 = field3551 - arg1;
        }
        int var5 = field3552 - arg2;
        int var6 = field3552 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3548[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([III)V")
    public static final void method1166(int[] arg0, int arg1, int arg2) {
        field3548 = arg0;
        field3552 = arg1;
        field3547 = arg2;
        method1158(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
    public static final void method1167() {
        field3550 = 0;
        field3553 = 0;
        field3549 = field3552;
        field3551 = field3547;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([I)V")
    public static final void method1168(int[] arg0) {
        arg0[0] = field3550;
        arg0[1] = field3553;
        arg0[2] = field3549;
        arg0[3] = field3551;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(IIIII)V")
    private static final void method1169(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3550 || arg0 >= field3549) {
            return;
        }
        if (arg1 < field3553) {
            arg2 -= field3553 - arg1;
            arg1 = field3553;
        }
        if (arg1 + arg2 > field3551) {
            arg2 = field3551 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3552 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3548[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3548[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3548[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3548[var9] = var14;
            var9 += field3552;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
    public static void method1170() {
        field3548 = null;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(IIIII)V")
    public static final void method1171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1164(arg0, arg1, var5 + 1, arg4);
            } else {
                method1164(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3550) {
                    var8 += (field3550 - arg0) * var10;
                    arg0 = field3550;
                }
                if (var11 >= field3549) {
                    var11 = field3549 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3553 && var12 < field3551) {
                        field3548[field3552 * var12 + arg0] = arg4;
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
                if (arg1 < field3553) {
                    var14 += (field3553 - arg1) * var16;
                    arg1 = field3553;
                }
                if (var17 >= field3551) {
                    var17 = field3551 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3550 && var18 < field3549) {
                        field3548[field3552 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1157(arg0, arg1, var6 + 1, arg4);
        } else {
            method1157(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }
}
