import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class209 extends class24 {

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field3455 = 0;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Lkb;")
    public static class80 field3458 = new class80(16);

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Luf;")
    public static class168 field3460 = class148.method1019(-1720, "<col=00ff80>");

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "J")
    public long field3454;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lq;")
    public class209 field3452;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lq;")
    public class209 field3453;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "[[[B")
    public static byte[][][] field3459;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 7)
    public static void method1463(int arg0) {
        field3460 = null;
        if (arg0 != 16) {
            field3458 = (class80) null;
        }
        field3459 = (byte[][][]) null;
        field3458 = null;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V", line = 24)
    public final void method1464(byte arg0) {
        field3456++;
        if (this.field3452 == null) {
            return;
        }
        if (arg0 != 84) {
            field3455 = -69;
        }
        this.field3452.field3453 = this.field3453;
        this.field3453.field3452 = this.field3452;
        this.field3452 = null;
        this.field3453 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Loe;I)I", line = 66)
    public static final int method1465(class54 arg0, int arg1) {
        field3457++;
        if (arg1 != -11250) {
            method1463(95);
        }
        int var2 = arg0.field697;
        if (arg0.field3045 == arg0.field3002) {
            var2 = arg0.field672;
        } else if (arg0.field3045 == arg0.field3004) {
            var2 = arg0.field681;
        }
        return var2;
    }
}
