import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "hb", name = "h", descriptor = "I")
    private static int field611 = 3;

    @OriginalMember(owner = "hb", name = "i", descriptor = "I")
    private static int field612 = -797;

    @OriginalMember(owner = "hb", name = "j", descriptor = "B")
    private static byte field613 = 8;

    @OriginalMember(owner = "hb", name = "k", descriptor = "I")
    private static int field614 = 1;

    @OriginalMember(owner = "hb", name = "l", descriptor = "Z")
    private static boolean field615 = true;

    @OriginalMember(owner = "hb", name = "n", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "hb", name = "o", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "hb", name = "p", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "hb", name = "q", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "hb", name = "r", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "hb", name = "s", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "hb", name = "t", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "hb", name = "u", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "hb", name = "v", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "hb", name = "w", descriptor = "Z")
    public static boolean field626;

    @OriginalMember(owner = "hb", name = "m", descriptor = "[I")
    public static int[] field616;

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIII)V")
    public static void method161(int[] arg0, int arg1, int arg2, int arg3) {
        field616 = arg0;
        field617 = arg2;
        field618 = arg1;
        method163(arg1, 0, 0, arg2, 5);
        if (arg3 != 7) {
            field611 = -276;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I)V")
    public static void method162(int arg0) {
        field621 = 0;
        field619 = 0;
        field622 = field617;
        field620 = field618;
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field623 = field622 - 1;
        field624 = field622 / 2;
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIII)V")
    public static void method163(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > field617) {
            arg3 = field617;
        }
        if (arg0 > field618) {
            arg0 = field618;
        }
        field621 = arg2;
        field619 = arg1;
        field622 = arg3;
        field620 = arg0;
        field623 = field622 - 1;
        field624 = field622 / 2;
        field625 = field620 / 2;
        if (arg4 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(I)V")
    public static void method164(int arg0) {
        int var1 = field618 * field617;
        int var2 = 8 / arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            field616[var3] = 0;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII)V")
    public static void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= 0) {
            return;
        }
        if (arg4 < field621) {
            arg3 -= field621 - arg4;
            arg4 = field621;
        }
        if (arg2 < field619) {
            arg0 -= field619 - arg2;
            arg2 = field619;
        }
        if (arg3 + arg4 > field622) {
            arg3 = field622 - arg4;
        }
        if (arg0 + arg2 > field620) {
            arg0 = field620 - arg2;
        }
        int var6 = field617 - arg3;
        int var7 = field617 * arg2 + arg4;
        for (int var8 = -arg0; var8 < 0; var8++) {
            for (int var9 = -arg3; var9 < 0; var9++) {
                field616[var7++] = arg5;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIBIII)V")
    public static void method166(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        method167(arg1, arg0, arg3, field614, arg4);
        method167(arg1, arg0 + arg5 - 1, arg3, field614, arg4);
        method168(arg4, arg0, arg5, 0, arg1);
        if (arg2 != -109) {
            field615 = !field615;
        }
        method168(arg4, arg0, arg5, 0, arg1 + arg3 - 1);
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(IIIII)V")
    public static void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field619 || arg1 >= field620) {
            return;
        }
        if (arg0 < field621) {
            arg2 -= field621 - arg0;
            arg0 = field621;
        }
        if (arg0 + arg2 > field622) {
            arg2 = field622 - arg0;
        }
        int var5 = field617 * arg1 + arg0;
        if (arg3 >= 1 && arg3 <= 1) {
            for (int var6 = 0; var6 < arg2; var6++) {
                field616[var5 + var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "c", descriptor = "(IIIII)V")
    public static void method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field621 || arg4 >= field622) {
            return;
        }
        if (arg1 < field619) {
            arg2 -= field619 - arg1;
            arg1 = field619;
        }
        if (arg1 + arg2 > field620) {
            arg2 = field620 - arg1;
        }
        int var5 = field617 * arg1 + arg4;
        if (arg3 != 0) {
            field611 = 37;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            field616[field617 * var6 + var5] = arg0;
        }
    }
}
