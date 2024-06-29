import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class168 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field2451 = 0;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[[S")
    public static short[][] field2454 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method1165(byte arg0) {
        if (arg0 != -74) {
            field2453 = 11;
        }
        field2454 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method1166(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 <= 105) {
            method1165((byte) -95);
        }
        field2449++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class68.field1289) {
            try {
                class641 var3 = (class641) Class.forName("nw").getDeclaredConstructor().newInstance();
                var3.method1950(arg2, 79);
                return var3;
            } catch (Throwable var4) {
                class68.field1289 = true;
            }
        }
        return arg1 ? class645.method3717((byte) 122, arg2) : arg2;
    }
}
