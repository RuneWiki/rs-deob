import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class97 extends class19 {

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public int field1860 = 0;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Z")
    public static boolean field1858 = false;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "Z")
    public static boolean field1863 = false;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "[[S")
    public static short[][] field1861 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "[I")
    public static int[] field1857 = new int[200];

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "(I)V")
    public static void method733(int arg0) {
        field1857 = null;
        field1861 = null;
        if (arg0 < 95) {
            field1857 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)V")
    public static final void method734(int arg0, byte arg1) {
        int var2 = -113 % ((69 - arg1) / 56);
        field1862++;
        class134 var3 = (class134) class79.field1606.method224(-1, (long) arg0);
        if (var3 != null) {
            var3.method915(0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLff;)V")
    public final void method735(boolean arg0, class53 arg1) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method400(255);
            if (var3 == 0) {
                field1865++;
                return;
            }
            this.method737(10153, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIBI)V")
    public static final void method736(boolean arg0, int arg1, byte arg2, int arg3) {
        field1864++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg2 == 99) {
            class108.field2107 = arg1;
            class161.field3075 = arg3;
            class139.field2713 = arg0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILff;I)V")
    private final void method737(int arg0, class53 arg1, int arg2) {
        if (arg0 == 10153) {
            if (arg2 == 5) {
                this.field1860 = arg1.method405(2);
            }
            field1859++;
        }
    }
}
