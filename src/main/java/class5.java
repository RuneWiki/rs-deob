import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class5 extends class177 {

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[[S")
    public static short[][] field86 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Z")
    public static boolean field85 = false;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[I")
    public static int[] field89 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)V")
    public static final void method32(boolean arg0, int arg1) {
        if (!arg0) {
            class274 var2 = class166.method1116(2, arg1, true);
            field84++;
            var2.method1840(10000);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method33(int arg0) {
        class158.field2636 = null;
        class125.field2101 = null;
        if (arg0 != 24094) {
            field90 = 48;
        }
        field83++;
        class249.field4476 = null;
        class170.field2848 = null;
        class224.field3852 = null;
        class262.field4617 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Log;")
    public static final class252 method34(int arg0, byte arg1) {
        field87++;
        class252 var2 = (class252) class214.field3688.method344((byte) 14, (long) arg0);
        int var3 = -109 / ((2 - arg1) / 56);
        if (var2 != null) {
            return var2;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = class177.field2959.method666(arg0 & 0x7FFF, 0, (byte) -51);
        } else {
            var4 = class8.field142.method666(arg0, 0, (byte) -51);
        }
        class252 var5 = new class252();
        if (var4 != null) {
            var5.method1730(new class187(var4), (byte) 101);
        }
        if (arg0 >= 32768) {
            var5.method1729(0);
        }
        class214.field3688.method341((byte) 16, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static void method35(boolean arg0) {
        if (arg0) {
            method34(44, (byte) 125);
        }
        field86 = null;
        field89 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public static final void method36(boolean arg0) {
        field88++;
        class160.field2669.method1403(45);
        if (!arg0) {
            method36(true);
        }
    }
}
