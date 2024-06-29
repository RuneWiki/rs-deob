import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class218 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lhg;")
    public static class184 field3499 = class78.method578(7327);

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Ltl;")
    public static class222 field3501 = new class222(50);

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "F")
    public static float field3504 = 0.0F;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Ltl;")
    public static class222 field3503 = new class222(100);

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Lnb;")
    public static class330 field3505 = new class330();

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Z")
    public static boolean field3506 = false;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3507 = 0;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lui;")
    public class280 field3496;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
    public int[] field3494;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([[IIIIII)I", line = 5)
    public static final int method1595(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 122) {
            field3504 = -0.1430829F;
        }
        field3497++;
        int var6 = (128 - arg2) * arg0[arg5][arg1 + 1] + arg0[arg5 + 1][arg1 + 1] * arg2 >> 7;
        int var7 = (128 - arg2) * arg0[arg5][arg1] + (arg0[arg5 + 1][arg1] * arg2) >> 7;
        return (128 - arg4) * var7 + arg4 * var6 >> 7;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIILh;Lh;IIIIJ)V", line = 18)
    public static final void method1596(int arg0, int arg1, int arg2, int arg3, class232 arg4, class232 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class145 var12 = new class145();
        var12.field2175 = arg10;
        var12.field2177 = arg1 * 128 + 64;
        var12.field2167 = arg2 * 128 + 64;
        var12.field2179 = arg3;
        var12.field2174 = arg4;
        var12.field2166 = arg5;
        var12.field2162 = arg6;
        var12.field2173 = arg7;
        var12.field2169 = arg8;
        var12.field2176 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class251.field3996[var13][arg1][arg2] == null) {
                class251.field3996[var13][arg1][arg2] = new class230(var13, arg1, arg2);
            }
        }
        class251.field3996[arg0][arg1][arg2].field3678 = var12;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZZZ)Lkb;", line = 49)
    public static final class39 method1597(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field3500++;
        class176 var5 = null;
        if (arg1 != 26750) {
            method1595((int[][]) ((int[][]) null), -66, -94, 44, -54, -93);
        }
        if (class100.field1527 != null) {
            var5 = new class176(arg0, class100.field1527, class313.field4873[arg0], 1000000);
        }
        class34.field457[arg0] = class12.field142.method790(class152.field2330, -6620, arg0, var5);
        if (arg2) {
            class34.field457[arg0].method1183(0);
        }
        return new class39(class34.field457[arg0], arg3, arg4);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I", line = 69)
    public static final int method1598(int arg0) {
        field3495++;
        if (class155.field2388) {
            return 0;
        } else if (class152.method1062(120)) {
            if (arg0 != 7829) {
                field3507 = -27;
            }
            return class243.field3859 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 109)
    public static void method1599(byte arg0) {
        field3499 = null;
        field3501 = null;
        field3505 = null;
        field3503 = null;
        if (arg0 != -28) {
            method1597(-120, -73, false, false, false);
        }
    }
}
