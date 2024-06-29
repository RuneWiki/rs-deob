import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class23 extends class22 {

    @OriginalMember(owner = "mapview!la", name = "s", descriptor = "I")
    public static int field273 = 0;

    @OriginalMember(owner = "mapview!la", name = "r", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "mapview!la", name = "t", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "mapview!la", name = "u", descriptor = "I")
    public static int field275 = 0;

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "mapview!la", name = "q", descriptor = "I")
    private static int field271;

    @OriginalMember(owner = "mapview!la", name = "p", descriptor = "[I")
    public static int[] field270;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field274) {
            var9 = field274;
        }
        int var10 = arg1 + arg2;
        if (var10 >= field273) {
            var10 = field273 - 1;
        }
        for (int var11 = var9; var11 <= var10; var11++) {
            int var12 = var11 - arg1;
            int var13 = (int) Math.sqrt((double) (arg2 * arg2 - var12 * var12));
            int var14 = arg0 - var13;
            if (var14 < field272) {
                var14 = field272;
            }
            int var15 = arg0 + var13;
            if (var15 > field275 - 1) {
                var15 = field275 - 1;
            }
            int var16 = field269 * var11 + var14;
            for (int var17 = var14; var17 <= var15; var17++) {
                int var18 = (field270[var16] >> 16 & 0xFF) * var5;
                int var19 = (field270[var16] >> 8 & 0xFF) * var5;
                int var20 = (field270[var16] & 0xFF) * var5;
                int var21 = (var8 + var20 >> 8) + (var6 + var18 >> 8 << 16) + (var7 + var19 >> 8 << 8);
                field270[var16++] = var21;
            }
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([III)V", line = 65)
    public static final void method114(int[] arg0, int arg1, int arg2) {
        field270 = arg0;
        field269 = arg1;
        field271 = arg2;
        method121(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "()V", line = 71)
    public static void method115() {
        field270 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "()V", line = 79)
    public static final void method116() {
        int var0 = 0;
        int var1 = field271 * field269 - 7;
        while (var0 < var1) {
            field270[var0++] = 0;
            field270[var0++] = 0;
            field270[var0++] = 0;
            field270[var0++] = 0;
            field270[var0++] = 0;
            field270[var0++] = 0;
            field270[var0++] = 0;
            field270[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field270[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IIIIII)V", line = 112)
    public static final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field272) {
            arg2 -= field272 - arg0;
            arg0 = field272;
        }
        if (arg1 < field274) {
            arg3 -= field274 - arg1;
            arg1 = field274;
        }
        if (arg0 + arg2 > field275) {
            arg2 = field275 - arg0;
        }
        if (arg1 + arg3 > field273) {
            arg3 = field273 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field269 - arg2;
        int var11 = field269 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field270[var11] >> 16 & 0xFF) * var6;
                int var15 = (field270[var11] >> 8 & 0xFF) * var6;
                int var16 = (field270[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field270[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IIII)V", line = 173)
    public static final void method118(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field272 || arg0 >= field275) {
            return;
        }
        if (arg1 < field274) {
            arg2 -= field274 - arg1;
            arg1 = field274;
        }
        if (arg1 + arg2 > field273) {
            arg2 = field273 - arg1;
        }
        int var4 = field269 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field270[field269 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(IIIII)V", line = 198)
    public static final void method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field272) {
            arg2 -= field272 - arg0;
            arg0 = field272;
        }
        if (arg1 < field274) {
            arg3 -= field274 - arg1;
            arg1 = field274;
        }
        if (arg0 + arg2 > field275) {
            arg2 = field275 - arg0;
        }
        if (arg1 + arg3 > field273) {
            arg3 = field273 - arg1;
        }
        int var5 = field269 - arg2;
        int var6 = field269 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field270[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(IIII)V", line = 245)
    public static final void method120(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field274 || arg1 >= field273) {
            return;
        }
        if (arg0 < field272) {
            arg2 -= field272 - arg0;
            arg0 = field272;
        }
        if (arg0 + arg2 > field275) {
            arg2 = field275 - arg0;
        }
        int var4 = field269 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field270[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(IIII)V", line = 269)
    private static final void method121(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field269) {
            arg2 = field269;
        }
        if (arg3 > field271) {
            arg3 = field271;
        }
        field272 = arg0;
        field274 = arg1;
        field275 = arg2;
        field273 = arg3;
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(IIIII)V", line = 295)
    public static final void method122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method120(arg0, arg1, arg2, arg4);
        method120(arg0, arg1 + arg3 - 1, arg2, arg4);
        method118(arg0, arg1, arg3, arg4);
        method118(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
}
