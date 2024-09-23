import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "fb", name = "h", descriptor = "I")
    private static int field539 = 22869;

    @OriginalMember(owner = "fb", name = "i", descriptor = "I")
    private static int field540 = 770;

    @OriginalMember(owner = "fb", name = "j", descriptor = "I")
    private static int field541 = 9;

    @OriginalMember(owner = "fb", name = "k", descriptor = "B")
    private static byte field542 = 61;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "fb", name = "v", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "fb", name = "w", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "fb", name = "l", descriptor = "Z")
    private static boolean field543;

    @OriginalMember(owner = "fb", name = "m", descriptor = "[I")
    public static int[] field544;

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II[II)V")
    public static void method146(int arg0, int arg1, int[] arg2, int arg3) {
        field544 = arg2;
        field545 = arg3;
        field546 = arg0;
        method148(0, arg3, arg0, 770, 0);
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)V")
    public static void method147(int arg0) {
        field549 = 0;
        field547 = 0;
        field550 = field545;
        field548 = field546;
        field551 = field550 - 1;
        field552 = field550 / 2;
        if (arg0 < 3 || arg0 > 3) {
            field539 = 281;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIII)V")
    public static void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg1 > field545) {
            arg1 = field545;
        }
        if (arg2 > field546) {
            arg2 = field546;
        }
        field549 = arg0;
        field547 = arg4;
        if (arg3 <= 0) {
            field543 = !field543;
        }
        field550 = arg1;
        field548 = arg2;
        field551 = field550 - 1;
        field552 = field550 / 2;
        field553 = field548 / 2;
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(I)V")
    public static void method149(int arg0) {
        int var1 = 91 / arg0;
        int var2 = field546 * field545;
        for (int var3 = 0; var3 < var2; var3++) {
            field544[var3] = 0;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIII)V")
    public static void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 8) {
            field543 = !field543;
        }
        if (arg3 < field549) {
            arg1 -= field549 - arg3;
            arg3 = field549;
        }
        if (arg0 < field547) {
            arg4 -= field547 - arg0;
            arg0 = field547;
        }
        if (arg1 + arg3 > field550) {
            arg1 = field550 - arg3;
        }
        if (arg0 + arg4 > field548) {
            arg4 = field548 - arg0;
        }
        int var6 = field545 - arg1;
        int var7 = field545 * arg0 + arg3;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field544[var7++] = arg5;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IBIIII)V")
    public static void method151(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        method152(arg3, arg5, arg0, arg4, field541);
        if (arg1 != -103) {
            field543 = !field543;
        }
        method152(arg2 + arg3 - 1, arg5, arg0, arg4, field541);
        method153(arg2, arg3, 0, arg4, arg5);
        method153(arg2, arg3, 0, arg0 + arg4 - 1, arg5);
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(IIIII)V")
    public static void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 9 || arg4 > 9) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 < field547 || arg0 >= field548) {
            return;
        }
        if (arg3 < field549) {
            arg2 -= field549 - arg3;
            arg3 = field549;
        }
        if (arg2 + arg3 > field550) {
            arg2 = field550 - arg3;
        }
        int var6 = field545 * arg0 + arg3;
        for (int var7 = 0; var7 < arg2; var7++) {
            field544[var6 + var7] = arg1;
        }
    }

    @OriginalMember(owner = "fb", name = "c", descriptor = "(IIIII)V")
    public static void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < field549 || arg3 >= field550) {
            return;
        }
        if (arg1 < field547) {
            arg0 -= field547 - arg1;
            arg1 = field547;
        }
        if (arg0 + arg1 > field548) {
            arg0 = field548 - arg1;
        }
        int var5 = field545 * arg1 + arg3;
        if (arg2 != 0) {
            field543 = !field543;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            field544[field545 * var6 + var5] = arg4;
        }
    }
}
