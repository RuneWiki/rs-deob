import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class Draw2D extends DoublyLinkable {

    @OriginalMember(owner = "mapview!f", name = "h", descriptor = "I")
    public static int field48 = 0;

    @OriginalMember(owner = "mapview!f", name = "i", descriptor = "I")
    public static int field49 = 0;

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "I")
    public static int field50 = 0;

    @OriginalMember(owner = "mapview!f", name = "k", descriptor = "I")
    public static int field51 = 0;

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "mapview!f", name = "g", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "mapview!f", name = "l", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "mapview!f", name = "m", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "mapview!f", name = "n", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "Z")
    public static boolean field55;

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "[I")
    public static int[] field45;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IIII)V")
    public static void method24(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field48 || arg1 >= field49) {
            return;
        }
        if (arg0 < field50) {
            arg2 -= field50 - arg0;
            arg0 = field50;
        }
        if (arg0 + arg2 > field51) {
            arg2 = field51 - arg0;
        }
        int var4 = field46 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field45[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(IIII)V")
    public static void method25(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field50 || arg0 >= field51) {
            return;
        }
        if (arg1 < field48) {
            arg2 -= field48 - arg1;
            arg1 = field48;
        }
        if (arg1 + arg2 > field49) {
            arg2 = field49 - arg1;
        }
        int var4 = field46 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field45[field46 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(IIII)V")
    public static void method26(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field46) {
            arg2 = field46;
        }
        if (arg3 > field47) {
            arg3 = field47;
        }
        field50 = arg0;
        field48 = arg1;
        field51 = arg2;
        field49 = arg3;
        field52 = field51 - 1;
        field53 = field51 / 2;
        field54 = field49 / 2;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IIIIII)V")
    public static void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field50) {
            arg2 -= field50 - arg0;
            arg0 = field50;
        }
        if (arg1 < field48) {
            arg3 -= field48 - arg1;
            arg1 = field48;
        }
        if (arg0 + arg2 > field51) {
            arg2 = field51 - arg0;
        }
        if (arg1 + arg3 > field49) {
            arg3 = field49 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field46 - arg2;
        int var11 = field46 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field45[var11] >> 16 & 0xFF) * var6;
                int var15 = (field45[var11] >> 8 & 0xFF) * var6;
                int var16 = (field45[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field45[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IIIII)V")
    public static void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method24(arg0, arg1, arg2, arg4);
        method24(arg0, arg1 + arg3 - 1, arg2, arg4);
        method25(arg0, arg1, arg3, arg4);
        method25(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([III)V")
    public static void method29(int[] arg0, int arg1, int arg2) {
        field45 = arg0;
        field46 = arg1;
        field47 = arg2;
        method26(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(IIIII)V")
    public static void method30(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field50) {
            arg2 -= field50 - arg0;
            arg0 = field50;
        }
        if (arg1 < field48) {
            arg3 -= field48 - arg1;
            arg1 = field48;
        }
        if (arg0 + arg2 > field51) {
            arg2 = field51 - arg0;
        }
        if (arg1 + arg3 > field49) {
            arg3 = field49 - arg1;
        }
        int var5 = field46 - arg2;
        boolean var6 = true;
        int var7 = field46 * arg1 + arg0;
        for (int var8 = -arg3; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field45[var7++] = arg4;
            }
            var7 += var5;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "()V")
    public static void method31() {
        int var0 = field47 * field46;
        for (int var1 = 0; var1 < var0; var1++) {
            field45[var1] = 0;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(IIIII)V")
    public static void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1 + arg2;
        if (var10 >= field47) {
            var10 = field47 - 1;
        }
        for (int var11 = var9; var11 <= var10; var11++) {
            int var12 = var11 - arg1;
            int var13 = (int) Math.sqrt((double) (arg2 * arg2 - var12 * var12));
            int var14 = arg0 - var13;
            if (var14 < 0) {
                var14 = 0;
            }
            int var15 = arg0 + var13;
            if (var15 >= field46) {
                var15 = field46 - 1;
            }
            int var16 = field46 * var11 + var14;
            for (int var17 = var14; var17 <= var15; var17++) {
                int var18 = (field45[var16] >> 16 & 0xFF) * var5;
                int var19 = (field45[var16] >> 8 & 0xFF) * var5;
                int var20 = (field45[var16] & 0xFF) * var5;
                int var21 = (var8 + var20 >> 8) + (var6 + var18 >> 8 << 16) + (var7 + var19 >> 8 << 8);
                field45[var16++] = var21;
            }
        }
    }
}
