import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "fb", name = "h", descriptor = "I")
    private static int field519 = -222;

    @OriginalMember(owner = "fb", name = "i", descriptor = "I")
    private static int field520 = 553;

    @OriginalMember(owner = "fb", name = "j", descriptor = "Z")
    private static boolean field521 = true;

    @OriginalMember(owner = "fb", name = "l", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "fb", name = "m", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "fb", name = "u", descriptor = "Z")
    public static boolean field532;

    @OriginalMember(owner = "fb", name = "k", descriptor = "[I")
    public static int[] field522;

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I[III)V")
    public static void method141(int arg0, int[] arg1, int arg2, int arg3) {
        while (arg3 >= 0) {
        }
        field522 = arg1;
        field523 = arg0;
        field524 = arg2;
        method143(arg2, arg0, 0, 0, 17913);
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        field527 = 0;
        if (arg0 >= 0) {
            field521 = true;
        }
        field525 = 0;
        field528 = field523;
        field526 = field524;
        field529 = field528 - 1;
        field530 = field528 / 2;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIII)V")
    public static void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg1 > field523) {
            arg1 = field523;
        }
        if (arg0 > field524) {
            arg0 = field524;
        }
        field527 = arg3;
        field525 = arg2;
        field528 = arg1;
        field526 = arg0;
        field529 = field528 - 1;
        if (arg4 != 17913) {
            field520 = 337;
        }
        field530 = field528 / 2;
        field531 = field526 / 2;
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(I)V")
    public static void method144(int arg0) {
        int var1 = field524 * field523;
        if (arg0 == 2) {
            for (int var2 = 0; var2 < var1; var2++) {
                field522[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIII)V")
    public static void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field527) {
            arg4 -= field527 - arg5;
            arg5 = field527;
        }
        if (arg3 < field525) {
            arg2 -= field525 - arg3;
            arg3 = field525;
        }
        if (arg4 + arg5 > field528) {
            arg4 = field528 - arg5;
        }
        if (arg2 + arg3 > field526) {
            arg2 = field526 - arg3;
        }
        int var6 = field523 - arg4;
        int var7 = field523 * arg3 + arg5;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field522[var7++] = arg0;
            }
            var7 += var6;
        }
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(IIIIII)V")
    public static void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method147(arg3, false, arg5, arg1, arg0);
        method147(arg3, false, arg5, arg1 + arg4 - 1, arg0);
        method148(31405, arg0, arg1, arg5, arg4);
        method148(31405, arg0, arg1, arg3 + arg5 - 1, arg4);
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IZIII)V")
    public static void method147(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg3 < field525 || arg3 >= field526) {
            return;
        }
        if (arg2 < field527) {
            arg0 -= field527 - arg2;
            arg2 = field527;
        }
        if (arg0 + arg2 > field528) {
            arg0 = field528 - arg2;
        }
        int var5 = field523 * arg3 + arg2;
        if (arg1) {
            field520 = 195;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            field522[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(IIIII)V")
    public static void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 31405 || (arg3 < field527 || arg3 >= field528)) {
            return;
        }
        if (arg2 < field525) {
            arg4 -= field525 - arg2;
            arg2 = field525;
        }
        if (arg2 + arg4 > field526) {
            arg4 = field526 - arg2;
        }
        int var5 = field523 * arg2 + arg3;
        for (int var6 = 0; var6 < arg4; var6++) {
            field522[field523 * var6 + var5] = arg1;
        }
    }
}
