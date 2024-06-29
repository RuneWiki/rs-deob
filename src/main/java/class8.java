import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 extends class25 {

    @OriginalMember(owner = "mapview!da", name = "s", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "mapview!da", name = "t", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "mapview!da", name = "u", descriptor = "I")
    public static int field69 = 0;

    @OriginalMember(owner = "mapview!da", name = "x", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "mapview!da", name = "r", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "mapview!da", name = "v", descriptor = "I")
    private static int field70;

    @OriginalMember(owner = "mapview!da", name = "w", descriptor = "[I")
    public static int[] field71;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method41(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field72) {
            var9 = field72;
        }
        int var10 = arg1 + arg2;
        if (var10 >= field67) {
            var10 = field67 - 1;
        }
        for (int var11 = var9; var11 <= var10; var11++) {
            int var12 = var11 - arg1;
            int var13 = (int) Math.sqrt((double) (arg2 * arg2 - var12 * var12));
            int var14 = arg0 - var13;
            if (var14 < field69) {
                var14 = field69;
            }
            int var15 = arg0 + var13;
            if (var15 > field68 - 1) {
                var15 = field68 - 1;
            }
            int var16 = field66 * var11 + var14;
            for (int var17 = var14; var17 <= var15; var17++) {
                int var18 = (field71[var16] >> 16 & 0xFF) * var5;
                int var19 = (field71[var16] >> 8 & 0xFF) * var5;
                int var20 = (field71[var16] & 0xFF) * var5;
                int var21 = (var8 + var20 >> 8) + (var6 + var18 >> 8 << 16) + (var7 + var19 >> 8 << 8);
                field71[var16++] = var21;
            }
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIII)V", line = 76)
    public static final void method42(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field69 || arg0 >= field68) {
            return;
        }
        if (arg1 < field72) {
            arg2 -= field72 - arg1;
            arg1 = field72;
        }
        if (arg1 + arg2 > field67) {
            arg2 = field67 - arg1;
        }
        int var4 = field66 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field71[field66 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(IIII)V", line = 100)
    public static final void method43(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field72 || arg1 >= field67) {
            return;
        }
        if (arg0 < field69) {
            arg2 -= field69 - arg0;
            arg0 = field69;
        }
        if (arg0 + arg2 > field68) {
            arg2 = field68 - arg0;
        }
        int var4 = field66 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field71[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIIIII)V", line = 131)
    public static final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field69) {
            arg2 -= field69 - arg0;
            arg0 = field69;
        }
        if (arg1 < field72) {
            arg3 -= field72 - arg1;
            arg1 = field72;
        }
        if (arg0 + arg2 > field68) {
            arg2 = field68 - arg0;
        }
        if (arg1 + arg3 > field67) {
            arg3 = field67 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field66 - arg2;
        int var11 = field66 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field71[var11] >> 16 & 0xFF) * var6;
                int var15 = (field71[var11] >> 8 & 0xFF) * var6;
                int var16 = (field71[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field71[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "()V", line = 189)
    public static void method45() {
        field71 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "([III)V", line = 196)
    public static final void method46(int[] arg0, int arg1, int arg2) {
        field71 = arg0;
        field66 = arg1;
        field70 = arg2;
        method50(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(IIIII)V", line = 209)
    public static final void method47(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field69) {
            arg2 -= field69 - arg0;
            arg0 = field69;
        }
        if (arg1 < field72) {
            arg3 -= field72 - arg1;
            arg1 = field72;
        }
        if (arg0 + arg2 > field68) {
            arg2 = field68 - arg0;
        }
        if (arg1 + arg3 > field67) {
            arg3 = field67 - arg1;
        }
        int var5 = field66 - arg2;
        int var6 = field66 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field71[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "(IIIII)V", line = 252)
    public static final void method48(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method43(arg0, arg1, arg2, arg4);
        method43(arg0, arg1 + arg3 - 1, arg2, arg4);
        method42(arg0, arg1, arg3, arg4);
        method42(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "()V", line = 259)
    public static final void method49() {
        int var0 = 0;
        int var1 = field70 * field66 - 7;
        while (var0 < var1) {
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field71[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "(IIII)V", line = 281)
    private static final void method50(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field66) {
            arg2 = field66;
        }
        if (arg3 > field70) {
            arg3 = field70;
        }
        field69 = arg0;
        field72 = arg1;
        field68 = arg2;
        field67 = arg3;
    }
}
