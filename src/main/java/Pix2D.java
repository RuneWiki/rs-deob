import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "hb", name = "h", descriptor = "I")
    private static int field603 = 8;

    @OriginalMember(owner = "hb", name = "i", descriptor = "I")
    private static int field604 = -15373;

    @OriginalMember(owner = "hb", name = "j", descriptor = "I")
    private static int field605 = 705;

    @OriginalMember(owner = "hb", name = "l", descriptor = "Z")
    private static boolean field607 = true;

    @OriginalMember(owner = "hb", name = "k", descriptor = "B")
    private static byte field606;

    @OriginalMember(owner = "hb", name = "n", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "hb", name = "o", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "hb", name = "p", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "hb", name = "q", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "hb", name = "r", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "hb", name = "s", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "hb", name = "t", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "hb", name = "u", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "hb", name = "v", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "hb", name = "w", descriptor = "Z")
    public static boolean field618;

    @OriginalMember(owner = "hb", name = "m", descriptor = "[I")
    public static int[] field608;

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IBI[I)V")
    public static void method161(int arg0, byte arg1, int arg2, int[] arg3) {
        field608 = arg3;
        if (arg1 != 102) {
            field607 = !field607;
        }
        field609 = arg2;
        field610 = arg0;
        method163(false, 0, 0, arg0, arg2);
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I)V")
    public static void method162(int arg0) {
        field613 = 0;
        field611 = 0;
        field614 = field609;
        field612 = field610;
        field615 = field614 - 1;
        int var1 = 31 / arg0;
        field616 = field614 / 2;
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(ZIIII)V")
    public static void method163(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 > field609) {
            arg4 = field609;
        }
        if (arg3 > field610) {
            arg3 = field610;
        }
        field613 = arg1;
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field611 = arg2;
        field614 = arg4;
        field612 = arg3;
        field615 = field614 - 1;
        field616 = field614 / 2;
        field617 = field612 / 2;
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(I)V")
    public static void method164(int arg0) {
        int var1 = field610 * field609;
        if (arg0 < 0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field608[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIBI)V")
    public static void method165(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 5) {
            field605 = 78;
        }
        if (arg0 < field613) {
            arg1 -= field613 - arg0;
            arg0 = field613;
        }
        if (arg5 < field611) {
            arg3 -= field611 - arg5;
            arg5 = field611;
        }
        if (arg0 + arg1 > field614) {
            arg1 = field614 - arg0;
        }
        if (arg3 + arg5 > field612) {
            arg3 = field612 - arg5;
        }
        int var6 = field609 - arg1;
        int var7 = field609 * arg5 + arg0;
        for (int var8 = -arg3; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field608[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIB)V")
    public static void method166(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        method167(arg2, (byte) 9, arg4, arg3, arg0);
        method167(arg2, (byte) 9, arg4, arg3, arg0 + arg1 - 1);
        method168(arg0, arg4, arg2, arg1, true);
        if (field606 == arg5) {
            boolean var6 = false;
            method168(arg0, arg4, arg2 + arg3 - 1, arg1, true);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IBIII)V")
    public static void method167(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field611 || arg4 >= field612) {
            return;
        }
        if (arg0 < field613) {
            arg3 -= field613 - arg0;
            arg0 = field613;
        }
        if (arg0 + arg3 > field614) {
            arg3 = field614 - arg0;
        }
        int var5 = field609 * arg4 + arg0;
        if (arg1 != 9) {
            field603 = -337;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            field608[var5 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIZ)V")
    public static void method168(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field604 = 296;
        }
        if (arg2 < field613 || arg2 >= field614) {
            return;
        }
        if (arg0 < field611) {
            arg3 -= field611 - arg0;
            arg0 = field611;
        }
        if (arg0 + arg3 > field612) {
            arg3 = field612 - arg0;
        }
        int var5 = field609 * arg0 + arg2;
        for (int var6 = 0; var6 < arg3; var6++) {
            field608[field609 * var6 + var5] = arg1;
        }
    }
}
