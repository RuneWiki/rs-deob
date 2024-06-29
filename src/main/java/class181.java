import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class181 {

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "[I")
    public static int[] field2777 = new int[128];

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field2773 = -1;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field2781 = 2;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "[[S")
    public static short[][] field2783 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field2778 = -1;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 10)
    public static void method1254(byte arg0) {
        field2777 = null;
        if (arg0 == 35) {
            field2783 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1255(int arg0) {
        class34.field438.method1298((byte) 110);
        field2776++;
        if (arg0 != -1506) {
            field2773 = -93;
        }
    }
}
