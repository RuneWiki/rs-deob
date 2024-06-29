import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class156 extends class53 {

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field2634 = 0;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "[I")
    public static int[] field2637 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field2646 = 0;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "Lbm;")
    public class156 field2641;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "Lbm;")
    public class156 field2645;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "Lek;")
    public static class206 field2642;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "Lbn;")
    public static class75 field2639;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBIII)V", line = 10)
    public static final void method1104(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg3 - arg0 >= class190.field3224 && (arg0 + arg3) <= class289.field4704 && class87.field1520 <= arg4 - arg0 && class177.field2930 >= (arg0 + arg4)) {
            class298.method2133(arg0, arg4, arg2, (byte) -126, arg3);
        } else {
            class34.method248(arg3, arg2, 107, arg4, arg0);
        }
        field2643++;
        if (arg1 < 34) {
            method1108(39, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 35)
    public final void method1105(int arg0) {
        field2638++;
        if (this.field2645 == null) {
            return;
        }
        this.field2645.field2641 = this.field2641;
        this.field2641.field2645 = this.field2645;
        this.field2641 = null;
        this.field2645 = null;
        if (arg0 <= 117) {
            method1104(78, (byte) -81, 35, -89, -12);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(CB)C", line = 56)
    public static final char method1106(char arg0, byte arg1) {
        field2644++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else {
            if (arg1 != 39) {
                method1107(115);
            }
            return Character.toTitleCase(arg0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 72)
    public static void method1107(int arg0) {
        field2642 = null;
        field2637 = null;
        field2639 = null;
        if (arg0 != 2) {
            method1107(8);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)I", line = 84)
    public static final int method1108(int arg0, byte arg1) {
        if (arg1 < 60) {
            return 57;
        } else {
            field2636++;
            return arg0 >>> 8;
        }
    }
}
