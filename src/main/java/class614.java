import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class614 extends class546 {

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field8574 = 0;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "Llh;")
    public static class487 field8576 = new class487(33, 8);

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "Lem;")
    public static class206 field8577 = new class206(111, 7);

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "Lvv;")
    public class295 field8573;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "[Let;")
    public class551[] field8572;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lr;IBI)Z")
    public final boolean method3434(class166 arg0, int arg1, byte arg2, int arg3) {
        field8575++;
        if (this.field8572 != null) {
            for (int var5 = 0; var5 < this.field8572.length; var5++) {
                if (this.field8572[var5].method3096(arg3, arg1) && this.field8573.method224(arg1, arg2 - 49, arg3, arg0)) {
                    return true;
                }
            }
        }
        if (arg2 != 49) {
            method3435((byte) 57);
        }
        return false;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
    public static void method3435(byte arg0) {
        field8576 = null;
        field8577 = null;
        if (arg0 != 27) {
            method3435((byte) 120);
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(ZI)I")
    public static final int method3436(boolean arg0, int arg1) {
        if (!arg0) {
            field8576 = null;
        }
        field8578++;
        return arg1 & 0xFF;
    }
}
