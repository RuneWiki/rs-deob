import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "fb", name = "h", descriptor = "I")
    private static int field529 = -280;

    @OriginalMember(owner = "fb", name = "j", descriptor = "I")
    private static int field531 = 824;

    @OriginalMember(owner = "fb", name = "k", descriptor = "Z")
    private static boolean field532 = true;

    @OriginalMember(owner = "fb", name = "l", descriptor = "I")
    private static int field533 = -373;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "fb", name = "v", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "fb", name = "w", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "fb", name = "i", descriptor = "Z")
    private static boolean field530;

    @OriginalMember(owner = "fb", name = "m", descriptor = "[I")
    public static int[] field534;

    @OriginalMember(owner = "fb", name = "a", descriptor = "(BI[II)V")
    public static void method145(byte arg0, int arg1, int[] arg2, int arg3) {
        field534 = arg2;
        field535 = arg3;
        if (arg0 == 2) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field536 = arg1;
        method147(arg1, field529, 0, 0, arg3);
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)V")
    public static void method146(int arg0) {
        field539 = 0;
        field537 = 0;
        field540 = field535;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field538 = field536;
        field541 = field540 - 1;
        field542 = field540 / 2;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIII)V")
    public static void method147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg4 > field535) {
            arg4 = field535;
        }
        if (arg0 > field536) {
            arg0 = field536;
        }
        field539 = arg2;
        if (arg1 >= 0) {
            field533 = -181;
        }
        field537 = arg3;
        field540 = arg4;
        field538 = arg0;
        field541 = field540 - 1;
        field542 = field540 / 2;
        field543 = field538 / 2;
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(I)V")
    public static void method148(int arg0) {
        if (arg0 == 14799) {
            int var1 = field536 * field535;
            for (int var2 = 0; var2 < var1; var2++) {
                field534[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIII)V")
    public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= 0) {
            return;
        }
        if (arg2 < field539) {
            arg4 -= field539 - arg2;
            arg2 = field539;
        }
        if (arg3 < field537) {
            arg5 -= field537 - arg3;
            arg3 = field537;
        }
        if (arg2 + arg4 > field540) {
            arg4 = field540 - arg2;
        }
        if (arg3 + arg5 > field538) {
            arg5 = field538 - arg3;
        }
        int var6 = field535 - arg4;
        int var7 = field535 * arg3 + arg2;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field534[var7++] = arg0;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IZIIII)V")
    public static void method150(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        method151(arg0, arg3, arg2, arg5, true);
        method151(arg0, arg3 + arg4 - 1, arg2, arg5, true);
        method152(arg3, 537, arg0, arg4, arg2);
        if (arg1) {
            field530 = !field530;
        }
        method152(arg3, 537, arg0, arg4, arg2 + arg5 - 1);
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIZ)V")
    public static void method151(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field533 = -432;
        }
        if (arg1 < field537 || arg1 >= field538) {
            return;
        }
        if (arg2 < field539) {
            arg3 -= field539 - arg2;
            arg2 = field539;
        }
        if (arg2 + arg3 > field540) {
            arg3 = field540 - arg2;
        }
        int var5 = field535 * arg1 + arg2;
        for (int var6 = 0; var6 < arg3; var6++) {
            field534[var5 + var6] = arg0;
        }
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(IIIII)V")
    public static void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field539 || arg4 >= field540) {
            return;
        }
        if (arg0 < field537) {
            arg3 -= field537 - arg0;
            arg0 = field537;
        }
        if (arg0 + arg3 > field538) {
            arg3 = field538 - arg0;
        }
        int var5 = field535 * arg0 + arg4;
        if (arg1 <= 0) {
            field530 = !field530;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            field534[field535 * var6 + var5] = arg2;
        }
    }
}
