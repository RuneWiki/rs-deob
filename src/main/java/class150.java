import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class150 {

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lqe;")
    public static class179 field2697 = class206.method1380("::noclip", (byte) -128);

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lqe;")
    private static class179 field2696 = class206.method1380("Loading config )2 ", (byte) -128);

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Lqe;")
    public static class179 field2706 = field2696;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Lqe;")
    private static class179 field2707 = class206.method1380("wishes to trade with you)3", (byte) -14);

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "Lqe;")
    public static class179 field2700 = field2707;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "D")
    public static double field2698;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[I")
    public static int[] field2703;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lra;ILqe;)I")
    public static final int method957(class185 arg0, int arg1, class179 arg2) {
        field2699++;
        int var3 = arg0.field3432;
        arg0.method1253(arg2.field3277, false);
        if (arg1 == -22313) {
            arg0.field3432 += class185.field3435.method736(arg2.field3256, arg0.field3432, arg2.field3277, 0, (byte) 116, arg0.field3397);
            return arg0.field3432 - var3;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V")
    public static final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 1) {
            field2701 = -31;
        }
        field2709++;
        if (arg2 == arg4) {
            class93.method608(arg0, arg3, -8755, arg1, arg2);
        } else if (arg1 - arg2 >= class235.field4336 && arg1 + arg2 <= class40.field869 && class168.field3037 <= arg0 - arg4 && arg0 + arg4 <= class70.field1403) {
            class171.method1085(arg4, arg3, arg1, arg2, arg0, -110);
        } else {
            class15.method118(arg2, (byte) 125, arg1, arg0, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method959(int arg0) {
        field2706 = null;
        field2703 = null;
        field2707 = null;
        field2696 = null;
        if (arg0 < -126) {
            field2697 = null;
            field2700 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIIII)V")
    public static final void method960(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class196.field3648[0].method395(arg0, arg4);
        int var6 = (arg5 - 32) * arg5 / arg3;
        class196.field3648[1].method395(arg0, arg5 + arg4 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg1 / (arg3 - arg5);
        class145.method937(arg0, arg4 + 16, 16, arg5 - 32, class55.field1211);
        class145.method937(arg0, arg4 + var7 + 16, 16, var6, class230.field4254);
        class145.method936(arg0, arg4 + var7 + 16, var6, class127.field2321);
        class145.method936(arg0 + 1, arg4 + 16 + var7, var6, class127.field2321);
        class145.method931(arg0, arg4 + var7 + 16, 16, class127.field2321);
        class145.method931(arg0, arg4 + var7 + 17, 16, class127.field2321);
        class145.method936(arg0 + 15, arg4 + 16 + var7, var6, class98.field1837);
        class145.method936(arg0 + 14, arg4 + var7 + 17, var6 - 1, class98.field1837);
        int var8 = 97 / ((-arg2 - 51) / 47);
        class145.method931(arg0, arg4 + var6 + var7 + 15, 16, class98.field1837);
        class145.method931(arg0 + 1, arg4 + 14 + var7 + var6, 15, class98.field1837);
        field2708++;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class150() {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lni;)V")
    public class150(class150 arg0) {
        this.field2702 = arg0.field2702;
        this.field2710 = arg0.field2710;
        this.field2694 = arg0.field2694;
        this.field2704 = arg0.field2704;
    }
}
