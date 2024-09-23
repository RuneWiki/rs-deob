import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "fb", name = "i", descriptor = "I")
    private static int field530 = 4;

    @OriginalMember(owner = "fb", name = "j", descriptor = "Z")
    private static boolean field531 = true;

    @OriginalMember(owner = "fb", name = "k", descriptor = "Z")
    private static boolean field532 = true;

    @OriginalMember(owner = "fb", name = "l", descriptor = "I")
    private static int field533;

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

    @OriginalMember(owner = "fb", name = "m", descriptor = "[I")
    public static int[] field534;

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IZI[I)V")
    public static void method144(int arg0, boolean arg1, int arg2, int[] arg3) {
        field534 = arg3;
        field535 = arg0;
        field536 = arg2;
        if (arg1) {
            method146(field531, 0, 0, arg0, arg2);
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(Z)V")
    public static void method145(boolean arg0) {
        field539 = 0;
        field537 = 0;
        if (!arg0) {
            field540 = field535;
            field538 = field536;
            field541 = field540 - 1;
            field542 = field540 / 2;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(ZIIII)V")
    public static void method146(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 > field535) {
            arg3 = field535;
        }
        if (arg4 > field536) {
            arg4 = field536;
        }
        field539 = arg1;
        if (!arg0) {
            return;
        }
        field537 = arg2;
        field540 = arg3;
        field538 = arg4;
        field541 = field540 - 1;
        field542 = field540 / 2;
        field543 = field538 / 2;
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(Z)V")
    public static void method147(boolean arg0) {
        int var1 = field536 * field535;
        if (!arg0) {
            field531 = !field531;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            field534[var2] = 0;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIBII)V")
    public static void method148(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 107) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg2 < field539) {
            arg4 -= field539 - arg2;
            arg2 = field539;
        }
        if (arg1 < field537) {
            arg5 -= field537 - arg1;
            arg1 = field537;
        }
        if (arg2 + arg4 > field540) {
            arg4 = field540 - arg2;
        }
        if (arg1 + arg5 > field538) {
            arg5 = field538 - arg1;
        }
        int var7 = field535 - arg4;
        int var8 = field535 * arg1 + arg2;
        for (int var9 = -arg5; var9 < 0; var9++) {
            for (int var10 = -arg4; var10 < 0; var10++) {
                field534[var8++] = arg0;
            }
            var8 += var7;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIII)V")
    public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method150(arg3, arg2, arg0, 0, arg1);
        method150(arg3, arg2 + arg4 - 1, arg0, 0, arg1);
        method151(arg4, false, arg1, arg2, arg3);
        if (arg5 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method151(arg4, false, arg1, arg2, arg0 + arg3 - 1);
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIII)V")
    public static void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field537 || arg1 >= field538) {
            return;
        }
        if (arg0 < field539) {
            arg2 -= field539 - arg0;
            arg0 = field539;
        }
        if (arg0 + arg2 > field540) {
            arg2 = field540 - arg0;
        }
        int var5 = field535 * arg1 + arg0;
        if (arg3 != 0) {
            field533 = 123;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            field534[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IZIII)V")
    public static void method151(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            field532 = !field532;
        }
        if (arg4 < field539 || arg4 >= field540) {
            return;
        }
        if (arg3 < field537) {
            arg0 -= field537 - arg3;
            arg3 = field537;
        }
        if (arg0 + arg3 > field538) {
            arg0 = field538 - arg3;
        }
        int var5 = field535 * arg3 + arg4;
        for (int var6 = 0; var6 < arg0; var6++) {
            field534[field535 * var6 + var5] = arg2;
        }
    }
}
