import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class117 extends class129 {

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field2830 = 0;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "[I")
    public static int[] field2833;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)V", line = 6)
    public static final void method889(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2830 || arg0 >= field2831) {
            return;
        }
        if (arg1 < field2832) {
            arg2 -= field2832 - arg1;
            arg1 = field2832;
        }
        if (arg1 + arg2 > field2836) {
            arg2 = field2836 - arg1;
        }
        int var4 = field2834 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2833[field2834 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IIII)V", line = 29)
    public static final void method890(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2834) {
            arg2 = field2834;
        }
        if (arg3 > field2835) {
            arg3 = field2835;
        }
        field2830 = arg0;
        field2832 = arg1;
        field2831 = arg2;
        field2836 = arg3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V", line = 50)
    public static final void method891() {
        field2830 = 0;
        field2832 = 0;
        field2831 = field2834;
        field2836 = field2835;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V", line = 62)
    private static final void method892(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2832 || arg1 >= field2836) {
            return;
        }
        if (arg0 < field2830) {
            arg2 -= field2830 - arg0;
            arg0 = field2830;
        }
        if (arg0 + arg2 > field2831) {
            arg2 = field2831 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2834 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2833[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2833[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2833[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2833[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IIIII)V", line = 108)
    private static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2830 || arg0 >= field2831) {
            return;
        }
        if (arg1 < field2832) {
            arg2 -= field2832 - arg1;
            arg1 = field2832;
        }
        if (arg1 + arg2 > field2836) {
            arg2 = field2836 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2834 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2833[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2833[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2833[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2833[var9] = var14;
            var9 += field2834;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(IIIII)V", line = 156)
    public static final void method894(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method901(arg0, arg1, arg2, arg4);
        method901(arg0, arg1 + arg3 - 1, arg2, arg4);
        method889(arg0, arg1, arg3, arg4);
        method889(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(IIIII)V", line = 162)
    public static final void method895(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2830) {
            arg2 -= field2830 - arg0;
            arg0 = field2830;
        }
        if (arg1 < field2832) {
            arg3 -= field2832 - arg1;
            arg1 = field2832;
        }
        if (arg0 + arg2 > field2831) {
            arg2 = field2831 - arg0;
        }
        if (arg1 + arg3 > field2836) {
            arg3 = field2836 - arg1;
        }
        int var5 = field2834 - arg2;
        int var6 = field2834 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2833[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()V", line = 213)
    public static final void method896() {
        int var0 = 0;
        int var1 = field2835 * field2834 - 7;
        while (var0 < var1) {
            field2833[var0++] = 0;
            field2833[var0++] = 0;
            field2833[var0++] = 0;
            field2833[var0++] = 0;
            field2833[var0++] = 0;
            field2833[var0++] = 0;
            field2833[var0++] = 0;
            field2833[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2833[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V", line = 237)
    public static final void method897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2830) {
            arg2 -= field2830 - arg0;
            arg0 = field2830;
        }
        if (arg1 < field2832) {
            arg3 -= field2832 - arg1;
            arg1 = field2832;
        }
        if (arg0 + arg2 > field2831) {
            arg2 = field2831 - arg0;
        }
        if (arg1 + arg3 > field2836) {
            arg3 = field2836 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field2834 - arg2;
        int var11 = field2834 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field2833[var11] >> 16 & 0xFF) * var6;
                int var15 = (field2833[var11] >> 8 & 0xFF) * var6;
                int var16 = (field2833[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field2833[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([III)V", line = 303)
    public static final void method898(int[] arg0, int arg1, int arg2) {
        field2833 = arg0;
        field2834 = arg1;
        field2835 = arg2;
        method890(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()V", line = 309)
    public static void method899() {
        field2833 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IIIIII)V", line = 315)
    public static final void method900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method892(arg0, arg1, arg2, arg4, arg5);
        method892(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method893(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method893(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(IIII)V", line = 325)
    public static final void method901(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2832 || arg1 >= field2836) {
            return;
        }
        if (arg0 < field2830) {
            arg2 -= field2830 - arg0;
            arg0 = field2830;
        }
        if (arg0 + arg2 > field2831) {
            arg2 = field2831 - arg0;
        }
        int var4 = field2834 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2833[var4 + var5] = arg3;
        }
    }
}
