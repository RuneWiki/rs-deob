import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class111 extends class44 {

    @OriginalMember(owner = "client!sc", name = "tb", descriptor = "I")
    public static int field2751 = 0;

    @OriginalMember(owner = "client!sc", name = "yb", descriptor = "I")
    public static int field2756 = 0;

    @OriginalMember(owner = "client!sc", name = "xb", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!sc", name = "wb", descriptor = "I")
    public static int field2754 = 0;

    @OriginalMember(owner = "client!sc", name = "ub", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!sc", name = "vb", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!sc", name = "sb", descriptor = "[I")
    public static int[] field2750;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method918(arg0, arg1, arg2, arg4, arg5);
        method918(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method920(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method920(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIII)V", line = 16)
    public static final void method915(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2752) {
            arg2 = field2752;
        }
        if (arg3 > field2753) {
            arg3 = field2753;
        }
        field2755 = arg0;
        field2751 = arg1;
        field2756 = arg2;
        field2754 = arg3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V", line = 34)
    public static final void method916(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2755) {
            arg2 -= field2755 - arg0;
            arg0 = field2755;
        }
        if (arg1 < field2751) {
            arg3 -= field2751 - arg1;
            arg1 = field2751;
        }
        if (arg0 + arg2 > field2756) {
            arg2 = field2756 - arg0;
        }
        if (arg1 + arg3 > field2754) {
            arg3 = field2754 - arg1;
        }
        int var5 = field2752 - arg2;
        int var6 = field2752 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2750[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I)V", line = 79)
    public static final void method917(int[] arg0) {
        field2755 = arg0[0];
        field2751 = arg0[1];
        field2756 = arg0[2];
        field2754 = arg0[3];
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIII)V", line = 86)
    private static final void method918(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2751 || arg1 >= field2754) {
            return;
        }
        if (arg0 < field2755) {
            arg2 -= field2755 - arg0;
            arg0 = field2755;
        }
        if (arg0 + arg2 > field2756) {
            arg2 = field2756 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2752 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2750[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2750[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2750[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2750[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(IIII)V", line = 127)
    public static final void method919(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2751 || arg1 >= field2754) {
            return;
        }
        if (arg0 < field2755) {
            arg2 -= field2755 - arg0;
            arg0 = field2755;
        }
        if (arg0 + arg2 > field2756) {
            arg2 = field2756 - arg0;
        }
        int var4 = field2752 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2750[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(IIIII)V", line = 150)
    private static final void method920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2755 || arg0 >= field2756) {
            return;
        }
        if (arg1 < field2751) {
            arg2 -= field2751 - arg1;
            arg1 = field2751;
        }
        if (arg1 + arg2 > field2754) {
            arg2 = field2754 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2752 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2750[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2750[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2750[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2750[var9] = var14;
            var9 += field2752;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "([I)V", line = 192)
    public static final void method921(int[] arg0) {
        arg0[0] = field2755;
        arg0[1] = field2751;
        arg0[2] = field2756;
        arg0[3] = field2754;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V", line = 199)
    public static final void method922() {
        field2755 = 0;
        field2751 = 0;
        field2756 = field2752;
        field2754 = field2753;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V", line = 213)
    public static final void method923() {
        int var0 = 0;
        int var1 = field2753 * field2752 - 7;
        while (var0 < var1) {
            field2750[var0++] = 0;
            field2750[var0++] = 0;
            field2750[var0++] = 0;
            field2750[var0++] = 0;
            field2750[var0++] = 0;
            field2750[var0++] = 0;
            field2750[var0++] = 0;
            field2750[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2750[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIIII)V", line = 235)
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2755) {
            arg2 -= field2755 - arg0;
            arg0 = field2755;
        }
        if (arg1 < field2751) {
            arg3 -= field2751 - arg1;
            arg1 = field2751;
        }
        if (arg0 + arg2 > field2756) {
            arg2 = field2756 - arg0;
        }
        if (arg1 + arg3 > field2754) {
            arg3 = field2754 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field2752 - arg2;
        int var11 = field2752 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field2750[var11] >> 16 & 0xFF) * var6;
                int var15 = (field2750[var11] >> 8 & 0xFF) * var6;
                int var16 = (field2750[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field2750[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(IIIII)V", line = 293)
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method919(arg0, arg1, arg2, arg4);
        method919(arg0, arg1 + arg3 - 1, arg2, arg4);
        method928(arg0, arg1, arg3, arg4);
        method928(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(IIIII)V", line = 299)
    public static final void method926(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method919(arg0, arg1, var5 + 1, arg4);
            } else {
                method919(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2755) {
                    var8 += (field2755 - arg0) * var10;
                    arg0 = field2755;
                }
                if (var11 >= field2756) {
                    var11 = field2756 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2751 && var12 < field2754) {
                        field2750[field2752 * var12 + arg0] = arg4;
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
                if (arg1 < field2751) {
                    var14 += (field2751 - arg1) * var16;
                    arg1 = field2751;
                }
                if (var17 >= field2754) {
                    var17 = field2754 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2755 && var18 < field2756) {
                        field2750[field2752 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method928(arg0, arg1, var6 + 1, arg4);
        } else {
            method928(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()V", line = 390)
    public static void method927() {
        field2750 = null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(IIII)V", line = 394)
    public static final void method928(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2755 || arg0 >= field2756) {
            return;
        }
        if (arg1 < field2751) {
            arg2 -= field2751 - arg1;
            arg1 = field2751;
        }
        if (arg1 + arg2 > field2754) {
            arg2 = field2754 - arg1;
        }
        int var4 = field2752 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2750[field2752 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([III)V", line = 420)
    public static final void method929(int[] arg0, int arg1, int arg2) {
        field2750 = arg0;
        field2752 = arg1;
        field2753 = arg2;
        method915(0, 0, arg1, arg2);
    }
}
