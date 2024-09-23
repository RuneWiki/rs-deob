import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "fb", name = "j", descriptor = "Z")
    private static boolean field532 = true;

    @OriginalMember(owner = "fb", name = "h", descriptor = "I")
    private static int field530;

    @OriginalMember(owner = "fb", name = "i", descriptor = "I")
    private static int field531;

    @OriginalMember(owner = "fb", name = "l", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "fb", name = "m", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "fb", name = "k", descriptor = "[I")
    public static int[] field533;

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I[III)V")
    public static void method146(int arg0, int[] arg1, int arg2, int arg3) {
        field533 = arg1;
        field534 = arg0;
        while (arg2 >= 0) {
            field530 = -151;
        }
        field535 = arg3;
        method148(arg3, 0, arg0, 789, 0);
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)V")
    public static void method147(int arg0) {
        field538 = 0;
        field536 = 0;
        field539 = field534;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field537 = field535;
        field540 = field539 - 1;
        field541 = field539 / 2;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIII)V")
    public static void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field534) {
            arg2 = field534;
        }
        if (arg0 > field535) {
            arg0 = field535;
        }
        field538 = arg4;
        field536 = arg1;
        field539 = arg2;
        field537 = arg0;
        field540 = field539 - 1;
        field541 = field539 / 2;
        if (arg3 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field542 = field537 / 2;
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(I)V")
    public static void method149(int arg0) {
        int var1 = 87 / arg0;
        int var2 = field535 * field534;
        for (int var3 = 0; var3 < var2; var3++) {
            field533[var3] = 0;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIBII)V")
    public static void method150(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 93) {
            field530 = 289;
        }
        if (arg1 < field538) {
            arg4 -= field538 - arg1;
            arg1 = field538;
        }
        if (arg0 < field536) {
            arg5 -= field536 - arg0;
            arg0 = field536;
        }
        if (arg1 + arg4 > field539) {
            arg4 = field539 - arg1;
        }
        if (arg0 + arg5 > field537) {
            arg5 = field537 - arg0;
        }
        int var6 = field534 - arg4;
        int var7 = field534 * arg0 + arg1;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field533[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIII)V")
    public static void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= 3 && arg0 <= 3) {
            method152(arg2, 0, arg4, arg5, arg1);
            method152(arg2, 0, arg3 + arg4 - 1, arg5, arg1);
            method153(arg2, field531, arg4, arg3, arg1);
            method153(arg2, field531, arg4, arg3, arg1 + arg5 - 1);
        }
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(IIIII)V")
    public static void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field536 || arg2 >= field537) {
            return;
        }
        if (arg4 < field538) {
            arg3 -= field538 - arg4;
            arg4 = field538;
        }
        if (arg3 + arg4 > field539) {
            arg3 = field539 - arg4;
        }
        int var5 = field534 * arg2 + arg4;
        if (arg1 == 0) {
            for (int var6 = 0; var6 < arg3; var6++) {
                field533[var5 + var6] = arg0;
            }
        }
    }

    @OriginalMember(owner = "fb", name = "c", descriptor = "(IIIII)V")
    public static void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field538 || arg4 >= field539) {
            return;
        }
        if (arg2 < field536) {
            arg3 -= field536 - arg2;
            arg2 = field536;
        }
        if (arg2 + arg3 > field537) {
            arg3 = field537 - arg2;
        }
        int var5 = field534 * arg2 + arg4;
        if (arg1 != 0) {
            field531 = 71;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            field533[field534 * var6 + var5] = arg0;
        }
    }
}
