import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class403 extends class293 {

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
    public static boolean field5650 = false;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
    public static int[] field5656 = new int[4096];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[[S")
    public static short[][] field5653 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    public static int[] field5651;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
    public static int[] field5654;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ltj;Ltj;Z)V", line = 7)
    public static final void method2520(class108 arg0, class108 arg1, boolean arg2) {
        if (!arg2) {
            field5655++;
            class140.field2139 = arg0;
            class58.field781 = arg1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V", line = 24)
    public static final void method2521(int arg0, int arg1, int arg2) {
        field5652++;
        class276 var3 = class264.method1816((byte) -96, arg1, 13);
        var3.method1876((byte) -126);
        int var4 = 83 % ((25 - arg0) / 46);
        var3.field3986 = arg2;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 45)
    public static void method2522(int arg0) {
        if (arg0 != -21175) {
            method2520((class108) null, (class108) null, false);
        }
        field5654 = null;
        field5653 = null;
        field5656 = null;
        field5651 = null;
    }
}
