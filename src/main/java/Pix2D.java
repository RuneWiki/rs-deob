import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "fb", name = "i", descriptor = "Z")
    private static boolean field536 = true;

    @OriginalMember(owner = "fb", name = "j", descriptor = "I")
    private static int field537 = 742;

    @OriginalMember(owner = "fb", name = "k", descriptor = "I")
    private static int field538 = 5;

    @OriginalMember(owner = "fb", name = "m", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "fb", name = "v", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "fb", name = "l", descriptor = "[I")
    public static int[] field539;

    @OriginalMember(owner = "fb", name = "a", descriptor = "([IIIB)V")
    public static void method145(int[] arg0, int arg1, int arg2, byte arg3) {
        field539 = arg0;
        field540 = arg1;
        field541 = arg2;
        if (arg3 == 6) {
            boolean var4 = false;
            method147(0, 0, arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(B)V")
    public static void method146(byte arg0) {
        field544 = 0;
        field542 = 0;
        field545 = field540;
        if (arg0 == 0) {
            field543 = field541;
            field546 = field545 - 1;
            field547 = field545 / 2;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIII)V")
    public static void method147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field538 = 342;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field540) {
            arg2 = field540;
        }
        if (arg3 > field541) {
            arg3 = field541;
        }
        field544 = arg0;
        field542 = arg1;
        field545 = arg2;
        field543 = arg3;
        field546 = field545 - 1;
        field547 = field545 / 2;
        field548 = field543 / 2;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(Z)V")
    public static void method148(boolean arg0) {
        int var1 = field541 * field540;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field539[var3] = 0;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIII)V")
    public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 5 || arg3 > 5) {
            return;
        }
        if (arg0 < field544) {
            arg1 -= field544 - arg0;
            arg0 = field544;
        }
        if (arg4 < field542) {
            arg5 -= field542 - arg4;
            arg4 = field542;
        }
        if (arg0 + arg1 > field545) {
            arg1 = field545 - arg0;
        }
        if (arg4 + arg5 > field543) {
            arg5 = field543 - arg4;
        }
        int var6 = field540 - arg1;
        int var7 = field540 * arg4 + arg0;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field539[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IIIIZI)V")
    public static void method150(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            field536 = !field536;
        }
        method151(arg0, arg3, field537, arg2, arg1);
        method151(arg0, arg3 + arg5 - 1, field537, arg2, arg1);
        method152(-458, arg1, arg3, arg5, arg2);
        method152(-458, arg1, arg3, arg5, arg0 + arg2 - 1);
    }

    @OriginalMember(owner = "fb", name = "b", descriptor = "(IIIII)V")
    public static void method151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0) {
            field536 = !field536;
        }
        if (arg1 < field542 || arg1 >= field543) {
            return;
        }
        if (arg3 < field544) {
            arg0 -= field544 - arg3;
            arg3 = field544;
        }
        if (arg0 + arg3 > field545) {
            arg0 = field545 - arg3;
        }
        int var5 = field540 * arg1 + arg3;
        for (int var6 = 0; var6 < arg0; var6++) {
            field539[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "fb", name = "c", descriptor = "(IIIII)V")
    public static void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= 0) {
            field536 = !field536;
        }
        if (arg4 < field544 || arg4 >= field545) {
            return;
        }
        if (arg2 < field542) {
            arg3 -= field542 - arg2;
            arg2 = field542;
        }
        if (arg2 + arg3 > field543) {
            arg3 = field543 - arg2;
        }
        int var5 = field540 * arg2 + arg4;
        for (int var6 = 0; var6 < arg3; var6++) {
            field539[field540 * var6 + var5] = arg1;
        }
    }
}
