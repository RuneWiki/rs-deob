import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class466 {

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[B")
    public static byte[] field6859 = new byte[520];

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[I")
    public static int[] field6860 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lrg;")
    public static class406 field6855 = null;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lcm;")
    public static class382 field6858 = new class382(16);

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Lns;")
    public static class55 field6863 = new class55(10, -1);

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lpf;")
    public static class425 field6864 = new class425(30, 3);

    @OriginalMember(owner = "client!am", name = "m", descriptor = "[[S")
    public static short[][] field6865 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public int field6856;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Lbs;")
    public class141 field6862;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Lam;")
    public class466 field6853;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Lbf;")
    public static final class161 method2870(byte arg0, int arg1) {
        field6854++;
        class161 var2 = (class161) class306.field4627.method1491((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class409.field6101.method823(35, -20334, arg1);
        class161 var4 = new class161();
        if (arg0 != 70) {
            return null;
        }
        if (var3 != null) {
            var4.method976(new class385(var3), (byte) 66);
        }
        var4.method975((byte) -122);
        class306.field4627.method1488(128, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public final void method2871(int arg0) {
        field6861++;
        if (class312.field4706 >= 500) {
            return;
        }
        this.field6856 = 0;
        this.field6853 = class408.field6076;
        if (arg0 == -30533) {
            this.field6862 = null;
            class312.field4706++;
            class408.field6076 = this;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public static void method2872(int arg0) {
        field6863 = null;
        field6859 = null;
        if (arg0 != -1) {
            return;
        }
        field6855 = null;
        field6864 = null;
        field6865 = null;
        field6858 = null;
        field6860 = null;
    }
}
