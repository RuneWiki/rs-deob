import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class128 {

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lqk;")
    public static class207 field2227 = class24.method212(255, "Hidden)2use");

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lqk;")
    public static class207 field2228 = class24.method212(255, "blanc:");

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[I")
    public static int[] field2229 = new int[100];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
    public static int[] field2222 = new int[14];

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[[S")
    public static short[][] field2238 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lqk;")
    public static class207 field2230 = class24.method212(255, "mapflag");

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Lqk;")
    private static class207 field2236 = class24.method212(255, "skill: ");

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Lqk;")
    public static class207 field2232 = field2236;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[Lqk;")
    public static class207[] field2225;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V")
    public static final void method898(int arg0, byte arg1) {
        class232.field4264.method1383(-8052, arg0);
        if (arg1 != -16) {
            method900(-54, (class207) null);
        }
        field2237++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method899(int arg0) {
        int var1 = 42 % ((-arg0 - 20) / 63);
        class14.field215++;
        field2231++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILqk;)Lqk;")
    public static final class207 method900(int arg0, class207 arg1) {
        if (arg0 == -14010) {
            int var2 = class86.method635(arg1, -21298);
            field2239++;
            return var2 == -1 ? class26.field536 : class57.field1052.field3312[var2].method1447((byte) 107, class280.field4930, class208.field3694);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class128() {
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lqi;)V")
    public class128(class128 arg0) {
        this.field2224 = arg0.field2224;
        this.field2233 = arg0.field2233;
        this.field2235 = arg0.field2235;
        this.field2226 = arg0.field2226;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static void method901(int arg0) {
        field2229 = null;
        field2232 = null;
        field2230 = null;
        if (arg0 != 4758) {
            return;
        }
        field2236 = null;
        field2225 = null;
        field2228 = null;
        field2222 = null;
        field2238 = null;
        field2227 = null;
    }
}
