import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "i", descriptor = "Z")
    private static boolean field612 = true;

    @OriginalMember(owner = "gb", name = "k", descriptor = "I")
    private static int field614 = 436;

    @OriginalMember(owner = "gb", name = "j", descriptor = "I")
    private static int field613;

    @OriginalMember(owner = "gb", name = "m", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "gb", name = "l", descriptor = "[I")
    public static int[] field615;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II[II)V")
    public static void method151(int arg0, int arg1, int[] arg2, int arg3) {
        field615 = arg2;
        field616 = arg0;
        if (arg3 != 9) {
            field614 = 478;
        }
        field617 = arg1;
        method153(5, arg1, arg0, 0, 0);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Z)V")
    public static void method152(boolean arg0) {
        field620 = 0;
        field618 = 0;
        field621 = field616;
        if (arg0) {
            field619 = field617;
            field622 = field621 - 1;
            field623 = field621 / 2;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg2 > field616) {
            arg2 = field616;
        }
        if (arg1 > field617) {
            arg1 = field617;
        }
        field620 = arg3;
        field618 = arg4;
        field621 = arg2;
        field619 = arg1;
        field622 = field621 - 1;
        field623 = field621 / 2;
        if (arg0 >= 5 && arg0 <= 5) {
            field624 = field619 / 2;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)V")
    public static void method154(int arg0) {
        int var1 = field617 * field616;
        if (arg0 >= 8 && arg0 <= 8) {
            for (int var2 = 0; var2 < var1; var2++) {
                field615[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            return;
        }
        if (arg4 < field620) {
            arg0 -= field620 - arg4;
            arg4 = field620;
        }
        if (arg2 < field618) {
            arg1 -= field618 - arg2;
            arg2 = field618;
        }
        if (arg0 + arg4 > field621) {
            arg0 = field621 - arg4;
        }
        if (arg1 + arg2 > field619) {
            arg1 = field619 - arg2;
        }
        int var7 = 256 - arg6;
        int var8 = (arg3 >> 16 & 0xFF) * arg6;
        int var9 = (arg3 >> 8 & 0xFF) * arg6;
        int var10 = (arg3 & 0xFF) * arg6;
        int var11 = field616 - arg0;
        int var12 = field616 * arg2 + arg4;
        for (int var13 = 0; var13 < arg1; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = (field615[var12] >> 16 & 0xFF) * var7;
                int var16 = (field615[var12] >> 8 & 0xFF) * var7;
                int var17 = (field615[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field615[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg3 < field620) {
            arg2 -= field620 - arg3;
            arg3 = field620;
        }
        if (arg5 < field618) {
            arg0 -= field618 - arg5;
            arg5 = field618;
        }
        if (arg2 + arg3 > field621) {
            arg2 = field621 - arg3;
        }
        if (arg0 + arg5 > field619) {
            arg0 = field619 - arg5;
        }
        int var7 = field616 - arg2;
        int var8 = field616 * arg5 + arg3;
        for (int var9 = -arg0; var9 < 0; var9++) {
            for (int var10 = -arg2; var10 < 0; var10++) {
                field615[var8++] = arg1;
            }
            var8 += var7;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method159(arg0, arg1, arg3, (byte) 125, arg4);
        if (arg5 > 0) {
            method159(arg0, arg1, arg3, (byte) 125, arg2 + arg4 - 1);
            method161(arg1, arg2, arg3, 384, arg4);
            method161(arg1, arg2, arg0 + arg3 - 1, 384, arg4);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IZIIIII)V")
    public static void method158(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method160(arg0, arg2, arg6, arg3, field613, arg4);
        method160(arg0, arg2 + arg5 - 1, arg6, arg3, field613, arg4);
        if (arg5 >= 3) {
            method162(arg3, arg5 - 2, arg2 + 1, true, arg4, arg6);
            method162(arg0 + arg3 - 1, arg5 - 2, arg2 + 1, true, arg4, arg6);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIBI)V")
    public static void method159(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg4 < field618 || arg4 >= field619) {
            return;
        }
        if (arg2 < field620) {
            arg0 -= field620 - arg2;
            arg2 = field620;
        }
        if (arg0 + arg2 > field621) {
            arg0 = field621 - arg2;
        }
        int var5 = field616 * arg4 + arg2;
        if (arg3 == 125) {
            for (int var6 = 0; var6 < arg0; var6++) {
                field615[var5 + var6] = arg1;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "c", descriptor = "(IIIIII)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field618 || arg1 >= field619) {
            return;
        }
        if (arg3 < field620) {
            arg0 -= field620 - arg3;
            arg3 = field620;
        }
        if (arg0 + arg3 > field621) {
            arg0 = field621 - arg3;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        int var10 = field616 * arg1 + arg3;
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field615[var10] >> 16 & 0xFF) * var6;
            int var13 = (field615[var10] >> 8 & 0xFF) * var6;
            int var14 = (field615[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field615[var10++] = var15;
        }
        if (arg4 < 0 || arg4 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field620 || arg2 >= field621) {
            return;
        }
        if (arg4 < field618) {
            arg1 -= field618 - arg4;
            arg4 = field618;
        }
        if (arg1 + arg4 > field619) {
            arg1 = field619 - arg4;
        }
        int var5 = field616 * arg4 + arg2;
        int var6 = 23 / arg3;
        for (int var7 = 0; var7 < arg1; var7++) {
            field615[field616 * var7 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIZII)V")
    public static void method162(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 < field620 || arg0 >= field621) {
            return;
        }
        if (arg2 < field618) {
            arg1 -= field618 - arg2;
            arg2 = field618;
        }
        if (arg1 + arg2 > field619) {
            arg1 = field619 - arg2;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        if (!arg3) {
            return;
        }
        int var10 = field616 * arg2 + arg0;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field615[var10] >> 16 & 0xFF) * var6;
            int var13 = (field615[var10] >> 8 & 0xFF) * var6;
            int var14 = (field615[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field615[var10] = var15;
            var10 += field616;
        }
    }
}
