import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class540 {

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field7554 = 0;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "[[S")
    public static short[][] field7560 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "F")
    public static float field7555;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Lac;")
    public static class284 field7557;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "Lnu;")
    public class326 field7552;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Lkr;")
    public static class329 field7558;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I")
    public static final int method2999(int arg0, int arg1) {
        field7556++;
        if (arg1 != 255) {
            field7554 = 74;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method3000(byte arg0) {
        field7557 = null;
        field7558 = null;
        if (arg0 >= 37) {
            field7560 = null;
        }
    }
}
