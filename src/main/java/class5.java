import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class5 extends class4 {

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "I")
    public static int field40 = 0;

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "mapview!e", name = "k", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "mapview!e", name = "l", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "mapview!e", name = "m", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "mapview!e", name = "n", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "mapview!e", name = "o", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "[I")
    public static int[] field37;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIII)V")
    public static void method13(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field40 || arg1 >= field41) {
            return;
        }
        if (arg0 < field42) {
            arg2 -= field42 - arg0;
            arg0 = field42;
        }
        if (arg0 + arg2 > field43) {
            arg2 = field43 - arg0;
        }
        int var4 = field38 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field37[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(IIII)V")
    public static void method14(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field42 || arg0 >= field43) {
            return;
        }
        if (arg1 < field40) {
            arg2 -= field40 - arg1;
            arg1 = field40;
        }
        if (arg1 + arg2 > field41) {
            arg2 = field41 - arg1;
        }
        int var4 = field38 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field37[field38 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "(IIII)V")
    public static void method15(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field38) {
            arg2 = field38;
        }
        if (arg3 > field39) {
            arg3 = field39;
        }
        field42 = arg0;
        field40 = arg1;
        field43 = arg2;
        field41 = arg3;
        field44 = field43 - 1;
        field45 = field43 / 2;
        field46 = field41 / 2;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIIIII)V")
    public static void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field42) {
            arg2 -= field42 - arg0;
            arg0 = field42;
        }
        if (arg1 < field40) {
            arg3 -= field40 - arg1;
            arg1 = field40;
        }
        if (arg0 + arg2 > field43) {
            arg2 = field43 - arg0;
        }
        if (arg1 + arg3 > field41) {
            arg3 = field41 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field38 - arg2;
        int var11 = field38 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field37[var11] >> 16 & 0xFF) * var6;
                int var15 = (field37[var11] >> 8 & 0xFF) * var6;
                int var16 = (field37[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field37[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIIII)V")
    public static void method17(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method13(arg0, arg1, arg2, arg4);
        method13(arg0, arg1 + arg3 - 1, arg2, arg4);
        method14(arg0, arg1, arg3, arg4);
        method14(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([III)V")
    public static void method18(int[] arg0, int arg1, int arg2) {
        field37 = arg0;
        field38 = arg1;
        field39 = arg2;
        method15(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(IIIII)V")
    public static void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field42) {
            arg2 -= field42 - arg0;
            arg0 = field42;
        }
        if (arg1 < field40) {
            arg3 -= field40 - arg1;
            arg1 = field40;
        }
        if (arg0 + arg2 > field43) {
            arg2 = field43 - arg0;
        }
        if (arg1 + arg3 > field41) {
            arg3 = field41 - arg1;
        }
        int var5 = field38 - arg2;
        boolean var6 = true;
        int var7 = field38 * arg1 + arg0;
        for (int var8 = -arg3; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field37[var7++] = arg4;
            }
            var7 += var5;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "()V")
    public static void method20() {
        int var0 = field39 * field38;
        for (int var1 = 0; var1 < var0; var1++) {
            field37[var1] = 0;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "(IIIII)V")
    public static void method21(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1 + arg2;
        if (var10 >= field39) {
            var10 = field39 - 1;
        }
        for (int var11 = var9; var11 <= var10; var11++) {
            int var12 = var11 - arg1;
            int var13 = (int) Math.sqrt((double) (arg2 * arg2 - var12 * var12));
            int var14 = arg0 - var13;
            if (var14 < 0) {
                var14 = 0;
            }
            int var15 = arg0 + var13;
            if (var15 >= field38) {
                var15 = field38 - 1;
            }
            int var16 = field38 * var11 + var14;
            for (int var17 = var14; var17 <= var15; var17++) {
                int var18 = (field37[var16] >> 16 & 0xFF) * var5;
                int var19 = (field37[var16] >> 8 & 0xFF) * var5;
                int var20 = (field37[var16] & 0xFF) * var5;
                int var21 = (var8 + var20 >> 8) + (var6 + var18 >> 8 << 16) + (var7 + var19 >> 8 << 8);
                field37[var16++] = var21;
            }
        }
    }
}
