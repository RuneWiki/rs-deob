import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class289 extends class371 {

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    private int field4251 = 4096;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    private int field4256 = 0;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "[[S")
    public static short[][] field4253;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "[I")
    public static int[] field4252;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V")
    public static void method1794(boolean arg0) {
        if (arg0) {
            field4252 = null;
            field4253 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        if (arg0 >= -80) {
            this.field4256 = 116;
        }
        ++field4254;
        int[] var3 = super.field5378.method1451(-115, arg1);
        if (super.field5378.field3254) {
            int[] var4 = this.method2260((byte) -42, arg1, 0);
            for (int var5 = 0; ~class41.field455 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field4256 && ~this.field4251 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field4255;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field4251 = arg2.method2620(58);
            }
        } else {
            this.field4256 = arg2.method2620(93);
        }
        int var5 = -85 / ((-15 - arg1) / 39);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class289() {
        super(1, true);
    }

    static {
        new class487("Ok", "Okay", "OK", "Ok");
        field4253 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }
}
