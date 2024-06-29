import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public abstract class class358 {

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "[[S")
    public static short[][] field5298 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static void method2284(int arg0) {
        field5298 = null;
        int var1 = 93 % ((arg0 - 60) / 34);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLlk;)Llk;")
    public abstract class317 method266(byte arg0, class317 arg1);
}
