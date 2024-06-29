import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class Draw2D extends class31 {

    @OriginalMember(owner = "mapview!n", name = "w", descriptor = "I")
    public static int field309 = 0;

    @OriginalMember(owner = "mapview!n", name = "u", descriptor = "I")
    public static int field307 = 0;

    @OriginalMember(owner = "mapview!n", name = "v", descriptor = "I")
    public static int field308 = 0;

    @OriginalMember(owner = "mapview!n", name = "z", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "mapview!n", name = "x", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "mapview!n", name = "y", descriptor = "I")
    private static int field311;

    @OriginalMember(owner = "mapview!n", name = "t", descriptor = "[I")
    public static int[] field306;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method164(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field312 || arg1 >= field307) {
            return;
        }
        if (arg0 < field308) {
            arg2 -= field308 - arg0;
            arg0 = field308;
        }
        if (arg0 + arg2 > field309) {
            arg2 = field309 - arg0;
        }
        int var4 = field310 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field306[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(IIII)V", line = 31)
    private static final void method165(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field310) {
            arg2 = field310;
        }
        if (arg3 > field311) {
            arg3 = field311;
        }
        field308 = arg0;
        field312 = arg1;
        field309 = arg2;
        field307 = arg3;
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(IIII)V", line = 53)
    public static final void method166(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field308 || arg0 >= field309) {
            return;
        }
        if (arg1 < field312) {
            arg2 -= field312 - arg1;
            arg1 = field312;
        }
        if (arg1 + arg2 > field307) {
            arg2 = field307 - arg1;
        }
        int var4 = field310 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field306[field310 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIII)V", line = 81)
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field308) {
            arg2 -= field308 - arg0;
            arg0 = field308;
        }
        if (arg1 < field312) {
            arg3 -= field312 - arg1;
            arg1 = field312;
        }
        if (arg0 + arg2 > field309) {
            arg2 = field309 - arg0;
        }
        if (arg1 + arg3 > field307) {
            arg3 = field307 - arg1;
        }
        int var5 = field310 - arg2;
        int var6 = field310 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field306[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(IIIII)V", line = 124)
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field312) {
            var9 = field312;
        }
        int var10 = arg1 + arg2;
        if (var10 >= field307) {
            var10 = field307 - 1;
        }
        for (int var11 = var9; var11 <= var10; var11++) {
            int var12 = var11 - arg1;
            int var13 = (int) Math.sqrt((double) (arg2 * arg2 - var12 * var12));
            int var14 = arg0 - var13;
            if (var14 < field308) {
                var14 = field308;
            }
            int var15 = arg0 + var13;
            if (var15 > field309 - 1) {
                var15 = field309 - 1;
            }
            int var16 = field310 * var11 + var14;
            for (int var17 = var14; var17 <= var15; var17++) {
                int var18 = (field306[var16] >> 16 & 0xFF) * var5;
                int var19 = (field306[var16] >> 8 & 0xFF) * var5;
                int var20 = (field306[var16] & 0xFF) * var5;
                int var21 = (var8 + var20 >> 8) + (var6 + var18 >> 8 << 16) + (var7 + var19 >> 8 << 8);
                field306[var16++] = var21;
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "()V", line = 185)
    public static void method169() {
        field306 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIIII)V", line = 190)
    public static final void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field308) {
            arg2 -= field308 - arg0;
            arg0 = field308;
        }
        if (arg1 < field312) {
            arg3 -= field312 - arg1;
            arg1 = field312;
        }
        if (arg0 + arg2 > field309) {
            arg2 = field309 - arg0;
        }
        if (arg1 + arg3 > field307) {
            arg3 = field307 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field310 - arg2;
        int var11 = field310 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field306[var11] >> 16 & 0xFF) * var6;
                int var15 = (field306[var11] >> 8 & 0xFF) * var6;
                int var16 = (field306[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field306[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "()V", line = 267)
    public static final void method171() {
        int var0 = 0;
        int var1 = field311 * field310 - 7;
        while (var0 < var1) {
            field306[var0++] = 0;
            field306[var0++] = 0;
            field306[var0++] = 0;
            field306[var0++] = 0;
            field306[var0++] = 0;
            field306[var0++] = 0;
            field306[var0++] = 0;
            field306[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field306[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(IIIII)V", line = 288)
    public static final void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method164(arg0, arg1, arg2, arg4);
        method164(arg0, arg1 + arg3 - 1, arg2, arg4);
        method166(arg0, arg1, arg3, arg4);
        method166(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([III)V", line = 303)
    public static final void method173(int[] arg0, int arg1, int arg2) {
        field306 = arg0;
        field310 = arg1;
        field311 = arg2;
        method165(0, 0, arg1, arg2);
    }
}
