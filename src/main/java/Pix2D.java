import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "i", descriptor = "Z")
    private static boolean field609 = true;

    @OriginalMember(owner = "gb", name = "j", descriptor = "B")
    private static byte field610 = 2;

    @OriginalMember(owner = "gb", name = "k", descriptor = "I")
    private static int field611 = 658;

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private static int field612 = 7;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "gb", name = "w", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "gb", name = "x", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Z")
    private static boolean field613;

    @OriginalMember(owner = "gb", name = "n", descriptor = "[I")
    public static int[] field614;

    @OriginalMember(owner = "gb", name = "a", descriptor = "([IIII)V")
    public static void method151(int[] arg0, int arg1, int arg2, int arg3) {
        field614 = arg0;
        field615 = arg2;
        field616 = arg1;
        if (arg3 < 0) {
            method153(0, 0, arg2, 0, arg1);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)V")
    public static void method152(int arg0) {
        field619 = 0;
        field617 = 0;
        if (arg0 != -29844) {
            field613 = !field613;
        }
        field620 = field615;
        field618 = field616;
        field621 = field620 - 1;
        field622 = field620 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg2 > field615) {
            arg2 = field615;
        }
        if (arg4 > field616) {
            arg4 = field616;
        }
        field619 = arg1;
        field617 = arg3;
        if (arg0 != 0) {
            field609 = !field609;
        }
        field620 = arg2;
        field618 = arg4;
        field621 = field620 - 1;
        field622 = field620 / 2;
        field623 = field618 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Z)V")
    public static void method154(boolean arg0) {
        if (arg0) {
            int var1 = field616 * field615;
            for (int var2 = 0; var2 < var1; var2++) {
                field614[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIBII)V")
    public static void method155(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg3 < field619) {
            arg0 -= field619 - arg3;
            arg3 = field619;
        }
        if (arg5 < field617) {
            arg6 -= field617 - arg5;
            arg5 = field617;
        }
        if (arg0 + arg3 > field620) {
            arg0 = field620 - arg3;
        }
        if (arg5 + arg6 > field618) {
            arg6 = field618 - arg5;
        }
        int var7 = 256 - arg2;
        int var8 = (arg1 >> 16 & 0xFF) * arg2;
        int var9 = (arg1 >> 8 & 0xFF) * arg2;
        int var10 = (arg1 & 0xFF) * arg2;
        if (arg4 != 42) {
            return;
        }
        int var11 = field615 - arg0;
        int var12 = field615 * arg5 + arg3;
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = (field614[var12] >> 16 & 0xFF) * var7;
                int var16 = (field614[var12] >> 8 & 0xFF) * var7;
                int var17 = (field614[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field614[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field619) {
            arg1 -= field619 - arg5;
            arg5 = field619;
        }
        if (arg3 < field617) {
            arg4 -= field617 - arg3;
            arg3 = field617;
        }
        if (arg1 + arg5 > field620) {
            arg1 = field620 - arg5;
        }
        if (arg3 + arg4 > field618) {
            arg4 = field618 - arg3;
        }
        int var6 = field615 - arg1;
        int var7 = field615 * arg3 + arg5;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field614[var7++] = arg0;
            }
            var7 += var6;
        }
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method159(3, arg3, arg5, arg4, arg0);
        method159(3, arg3, arg5, arg2 + arg4 - 1, arg0);
        method161(arg2, arg4, field610, arg3, arg5);
        if (arg1 == -17527) {
            method161(arg2, arg4, field610, arg0 + arg3 - 1, arg5);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method160(arg5, arg0, arg6, arg4, false, arg1);
        if (arg2 < 1 || arg2 > 1) {
            return;
        }
        method160(arg3 + arg5 - 1, arg0, arg6, arg4, false, arg1);
        if (arg3 >= 3) {
            method162(arg0, arg4, arg1, arg5 + 1, -770, arg3 - 2);
            method162(arg0, arg4, arg1 + arg6 - 1, arg5 + 1, -770, arg3 - 2);
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 3) {
            field612 = 126;
        }
        if (arg3 < field617 || arg3 >= field618) {
            return;
        }
        if (arg1 < field619) {
            arg4 -= field619 - arg1;
            arg1 = field619;
        }
        if (arg1 + arg4 > field620) {
            arg4 = field620 - arg1;
        }
        int var5 = field615 * arg3 + arg1;
        for (int var6 = 0; var6 < arg4; var6++) {
            field614[var5 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIZI)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 < field617 || arg0 >= field618) {
            return;
        }
        if (arg5 < field619) {
            arg2 -= field619 - arg5;
            arg5 = field619;
        }
        if (arg2 + arg5 > field620) {
            arg2 = field620 - arg5;
        }
        int var6 = 256 - arg1;
        if (arg4) {
            return;
        }
        int var7 = (arg3 >> 16 & 0xFF) * arg1;
        int var8 = (arg3 >> 8 & 0xFF) * arg1;
        int var9 = (arg3 & 0xFF) * arg1;
        int var10 = field615 * arg0 + arg5;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field614[var10] >> 16 & 0xFF) * var6;
            int var13 = (field614[var10] >> 8 & 0xFF) * var6;
            int var14 = (field614[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field614[var10++] = var15;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIBII)V")
    public static void method161(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 2 || (arg3 < field619 || arg3 >= field620)) {
            return;
        }
        if (arg1 < field617) {
            arg0 -= field617 - arg1;
            arg1 = field617;
        }
        if (arg0 + arg1 > field618) {
            arg0 = field618 - arg1;
        }
        int var5 = field615 * arg1 + arg3;
        for (int var6 = 0; var6 < arg0; var6++) {
            field614[field615 * var6 + var5] = arg4;
        }
    }

    @OriginalMember(owner = "gb", name = "c", descriptor = "(IIIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field619 || arg2 >= field620) {
            return;
        }
        if (arg3 < field617) {
            arg5 -= field617 - arg3;
            arg3 = field617;
        }
        if (arg3 + arg5 > field618) {
            arg5 = field618 - arg3;
        }
        int var6 = 256 - arg0;
        int var7 = (arg1 >> 16 & 0xFF) * arg0;
        int var8 = (arg1 >> 8 & 0xFF) * arg0;
        int var9 = (arg1 & 0xFF) * arg0;
        if (arg4 >= 0) {
            return;
        }
        int var10 = field615 * arg3 + arg2;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field614[var10] >> 16 & 0xFF) * var6;
            int var13 = (field614[var10] >> 8 & 0xFF) * var6;
            int var14 = (field614[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field614[var10] = var15;
            var10 += field615;
        }
    }
}
