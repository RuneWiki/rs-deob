import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class108 extends class97 {

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field2708 = 0;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field2707 = 0;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field2710 = 0;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "[I")
    public static int[] field2711;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V", line = 6)
    public static final void method882() {
        field2708 = 0;
        field2707 = 0;
        field2710 = field2709;
        field2705 = field2706;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIII)V", line = 20)
    public static final void method883(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method888(arg0, arg1, arg2, arg4, arg5);
        method888(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method894(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method894(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V", line = 31)
    public static final void method884(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method892(arg0, arg1, arg2, arg4);
        method892(arg0, arg1 + arg3 - 1, arg2, arg4);
        method891(arg0, arg1, arg3, arg4);
        method891(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()V", line = 40)
    public static final void method885() {
        int var0 = 0;
        int var1 = field2709 * field2706 - 7;
        while (var0 < var1) {
            field2711[var0++] = 0;
            field2711[var0++] = 0;
            field2711[var0++] = 0;
            field2711[var0++] = 0;
            field2711[var0++] = 0;
            field2711[var0++] = 0;
            field2711[var0++] = 0;
            field2711[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2711[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIII)V", line = 70)
    public static final void method886(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2708) {
            arg2 -= field2708 - arg0;
            arg0 = field2708;
        }
        if (arg1 < field2707) {
            arg3 -= field2707 - arg1;
            arg1 = field2707;
        }
        if (arg0 + arg2 > field2710) {
            arg2 = field2710 - arg0;
        }
        if (arg1 + arg3 > field2705) {
            arg3 = field2705 - arg1;
        }
        int var5 = field2709 - arg2;
        int var6 = field2709 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2711[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V", line = 120)
    public static final void method887(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2709) {
            arg2 = field2709;
        }
        if (arg3 > field2706) {
            arg3 = field2706;
        }
        field2708 = arg0;
        field2707 = arg1;
        field2710 = arg2;
        field2705 = arg3;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(IIIII)V", line = 138)
    private static final void method888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2707 || arg1 >= field2705) {
            return;
        }
        if (arg0 < field2708) {
            arg2 -= field2708 - arg0;
            arg0 = field2708;
        }
        if (arg0 + arg2 > field2710) {
            arg2 = field2710 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2709 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2711[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2711[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2711[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2711[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([III)V", line = 179)
    public static final void method889(int[] arg0, int arg1, int arg2) {
        field2711 = arg0;
        field2709 = arg1;
        field2706 = arg2;
        method887(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()V", line = 185)
    public static void method890() {
        field2711 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIII)V", line = 188)
    public static final void method891(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2708 || arg0 >= field2710) {
            return;
        }
        if (arg1 < field2707) {
            arg2 -= field2707 - arg1;
            arg1 = field2707;
        }
        if (arg1 + arg2 > field2705) {
            arg2 = field2705 - arg1;
        }
        int var4 = field2709 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2711[field2709 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(IIII)V", line = 212)
    public static final void method892(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2707 || arg1 >= field2705) {
            return;
        }
        if (arg0 < field2708) {
            arg2 -= field2708 - arg0;
            arg0 = field2708;
        }
        if (arg0 + arg2 > field2710) {
            arg2 = field2710 - arg0;
        }
        int var4 = field2709 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2711[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIIII)V", line = 238)
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2708) {
            arg2 -= field2708 - arg0;
            arg0 = field2708;
        }
        if (arg1 < field2707) {
            arg3 -= field2707 - arg1;
            arg1 = field2707;
        }
        if (arg0 + arg2 > field2710) {
            arg2 = field2710 - arg0;
        }
        if (arg1 + arg3 > field2705) {
            arg3 = field2705 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field2709 - arg2;
        int var11 = field2709 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field2711[var11] >> 16 & 0xFF) * var6;
                int var15 = (field2711[var11] >> 8 & 0xFF) * var6;
                int var16 = (field2711[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field2711[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(IIIII)V", line = 296)
    private static final void method894(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2708 || arg0 >= field2710) {
            return;
        }
        if (arg1 < field2707) {
            arg2 -= field2707 - arg1;
            arg1 = field2707;
        }
        if (arg1 + arg2 > field2705) {
            arg2 = field2705 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2709 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2711[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2711[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2711[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2711[var9] = var14;
            var9 += field2709;
        }
    }
}
