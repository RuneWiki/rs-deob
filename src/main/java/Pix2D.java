import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "fb", name = "i", descriptor = "I")
    private static int field530 = 575;

    @OriginalMember(owner = "fb", name = "l", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "fb", name = "m", descriptor = "I")
    public static int field534;

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

    @OriginalMember(owner = "fb", name = "j", descriptor = "Z")
    private static boolean field531;

    @OriginalMember(owner = "fb", name = "k", descriptor = "[I")
    public static int[] field532;

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I[IBI)V")
    public static void method145(int arg0, int[] arg1, byte arg2, int arg3) {
        field532 = arg1;
        field533 = arg3;
        field534 = arg0;
        if (arg2 == -67) {
            method147(0, arg3, arg0, true, 0);
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(Z)V")
    public static void method146(boolean arg0) {
        field537 = 0;
        field535 = 0;
        field538 = field533;
        field536 = field534;
        field539 = field538 - 1;
        if (!arg0) {
            field530 = -391;
        }
        field540 = field538 / 2;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIZI)V")
    public static void method147(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 > field533) {
            arg1 = field533;
        }
        if (arg2 > field534) {
            arg2 = field534;
        }
        field537 = arg4;
        field535 = arg0;
        field538 = arg1;
        field536 = arg2;
        field539 = field538 - 1;
        field540 = field538 / 2;
        field541 = field536 / 2;
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(Z)V")
    public static void method148(boolean arg0) {
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        int var2 = field534 * field533;
        for (int var3 = 0; var3 < var2; var3++) {
            field532[var3] = 0;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIBI)V")
    public static void method149(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -37) {
            return;
        }
        if (arg5 < field537) {
            arg0 -= field537 - arg5;
            arg5 = field537;
        }
        if (arg3 < field535) {
            arg1 -= field535 - arg3;
            arg3 = field535;
        }
        if (arg0 + arg5 > field538) {
            arg0 = field538 - arg5;
        }
        if (arg1 + arg3 > field536) {
            arg1 = field536 - arg3;
        }
        int var6 = field533 - arg0;
        int var7 = field533 * arg3 + arg5;
        for (int var8 = -arg1; var8 < 0; var8++) {
            for (int var9 = -arg0; var9 < 0; var9++) {
                field532[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIII)V")
    public static void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method151(1, arg0, arg3, arg5, arg4);
        method151(1, arg0 + arg2 - 1, arg3, arg5, arg4);
        int var6 = 44 / arg1;
        method152(arg2, arg3, arg0, -829, arg5);
        method152(arg2, arg3, arg0, -829, arg4 + arg5 - 1);
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIII)V")
    public static void method151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 1 || arg0 > 1 || (arg1 < field535 || arg1 >= field536)) {
            return;
        }
        if (arg3 < field537) {
            arg4 -= field537 - arg3;
            arg3 = field537;
        }
        if (arg3 + arg4 > field538) {
            arg4 = field538 - arg3;
        }
        int var5 = field533 * arg1 + arg3;
        for (int var6 = 0; var6 < arg4; var6++) {
            field532[var5 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(IIIII)V")
    public static void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field537 || arg4 >= field538) {
            return;
        }
        if (arg2 < field535) {
            arg0 -= field535 - arg2;
            arg2 = field535;
        }
        if (arg0 + arg2 > field536) {
            arg0 = field536 - arg2;
        }
        int var5 = field533 * arg2 + arg4;
        if (arg3 >= 0) {
            field531 = !field531;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            field532[field533 * var6 + var5] = arg1;
        }
    }
}
