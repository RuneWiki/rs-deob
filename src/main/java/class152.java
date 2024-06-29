import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class152 extends class118 {

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field3755 = 0;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field3756 = 0;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field3757 = 0;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field3753 = 0;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "[I")
    public static int[] field3754;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3755) {
            arg2 -= field3755 - arg0;
            arg0 = field3755;
        }
        if (arg1 < field3753) {
            var6 += (field3753 - arg1) * var7;
            arg3 -= field3753 - arg1;
            arg1 = field3753;
        }
        if (arg0 + arg2 > field3757) {
            arg2 = field3757 - arg0;
        }
        if (arg1 + arg3 > field3756) {
            arg3 = field3756 - arg1;
        }
        int var8 = field3752 - arg2;
        int var9 = field3752 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field3754[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([III)V", line = 57)
    public static final void method1206(int[] arg0, int arg1, int arg2) {
        field3754 = arg0;
        field3752 = arg1;
        field3758 = arg2;
        method1216(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([I)V", line = 70)
    public static final void method1207(int[] arg0) {
        arg0[0] = field3755;
        arg0[1] = field3753;
        arg0[2] = field3757;
        arg0[3] = field3756;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V", line = 78)
    private static final void method1208(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3755 || arg0 >= field3757) {
            return;
        }
        if (arg1 < field3753) {
            arg2 -= field3753 - arg1;
            arg1 = field3753;
        }
        if (arg1 + arg2 > field3756) {
            arg2 = field3756 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3752 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3754[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3754[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3754[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3754[var9] = var14;
            var9 += field3752;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIII)V", line = 120)
    public static final void method1209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3755) {
            arg2 -= field3755 - arg0;
            arg0 = field3755;
        }
        if (arg1 < field3753) {
            arg3 -= field3753 - arg1;
            arg1 = field3753;
        }
        if (arg0 + arg2 > field3757) {
            arg2 = field3757 - arg0;
        }
        if (arg1 + arg3 > field3756) {
            arg3 = field3756 - arg1;
        }
        int var5 = field3752 - arg2;
        int var6 = field3752 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3754[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([I)V", line = 170)
    public static final void method1210(int[] arg0) {
        field3755 = arg0[0];
        field3753 = arg0[1];
        field3757 = arg0[2];
        field3756 = arg0[3];
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 181)
    public static void method1211() {
        field3754 = null;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(IIIII)V", line = 184)
    public static final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1218(arg0, arg1, arg2, arg4);
        method1218(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1221(arg0, arg1, arg3, arg4);
        method1221(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(IIIII)V", line = 191)
    private static final void method1213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3753 || arg1 >= field3756) {
            return;
        }
        if (arg0 < field3755) {
            arg2 -= field3755 - arg0;
            arg0 = field3755;
        }
        if (arg0 + arg2 > field3757) {
            arg2 = field3757 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3752 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3754[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3754[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3754[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3754[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(IIIII)V", line = 237)
    public static final void method1214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1218(arg0, arg1, var5 + 1, arg4);
            } else {
                method1218(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3755) {
                    var8 += (field3755 - arg0) * var10;
                    arg0 = field3755;
                }
                if (var11 >= field3757) {
                    var11 = field3757 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3753 && var12 < field3756) {
                        field3754[field3752 * var12 + arg0] = arg4;
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
                if (arg1 < field3753) {
                    var14 += (field3753 - arg1) * var16;
                    arg1 = field3753;
                }
                if (var17 >= field3756) {
                    var17 = field3756 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3755 && var18 < field3757) {
                        field3754[field3752 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1221(arg0, arg1, var6 + 1, arg4);
        } else {
            method1221(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIII)V", line = 332)
    public static final void method1215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1213(arg0, arg1, arg2, arg4, arg5);
        method1213(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1208(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1208(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V", line = 342)
    public static final void method1216(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3752) {
            arg2 = field3752;
        }
        if (arg3 > field3758) {
            arg3 = field3758;
        }
        field3755 = arg0;
        field3753 = arg1;
        field3757 = arg2;
        field3756 = arg3;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()V", line = 363)
    public static final void method1217() {
        int var0 = 0;
        int var1 = field3758 * field3752 - 7;
        while (var0 < var1) {
            field3754[var0++] = 0;
            field3754[var0++] = 0;
            field3754[var0++] = 0;
            field3754[var0++] = 0;
            field3754[var0++] = 0;
            field3754[var0++] = 0;
            field3754[var0++] = 0;
            field3754[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3754[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIII)V", line = 385)
    public static final void method1218(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3753 || arg1 >= field3756) {
            return;
        }
        if (arg0 < field3755) {
            arg2 -= field3755 - arg0;
            arg0 = field3755;
        }
        if (arg0 + arg2 > field3757) {
            arg2 = field3757 - arg0;
        }
        int var4 = field3752 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3754[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(IIIIII)V", line = 409)
    public static final void method1219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3755) {
            arg2 -= field3755 - arg0;
            arg0 = field3755;
        }
        if (arg1 < field3753) {
            arg3 -= field3753 - arg1;
            arg1 = field3753;
        }
        if (arg0 + arg2 > field3757) {
            arg2 = field3757 - arg0;
        }
        if (arg1 + arg3 > field3756) {
            arg3 = field3756 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3752 - arg2;
        int var9 = field3752 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3754[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3754[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()V", line = 458)
    public static final void method1220() {
        field3755 = 0;
        field3753 = 0;
        field3757 = field3752;
        field3756 = field3758;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(IIII)V", line = 464)
    public static final void method1221(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3755 || arg0 >= field3757) {
            return;
        }
        if (arg1 < field3753) {
            arg2 -= field3753 - arg1;
            arg1 = field3753;
        }
        if (arg1 + arg2 > field3756) {
            arg2 = field3756 - arg1;
        }
        int var4 = field3752 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3754[field3752 * var5 + var4] = arg3;
        }
    }
}
