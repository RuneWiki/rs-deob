import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class248 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lpn;")
    public static class72 field3489 = new class72(36, 7);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Loe;")
    public class248 field3490;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lmt;")
    public class83 field3487;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method1508(byte arg0) {
        field3489 = null;
        int var1 = -28 % ((76 - arg0) / 48);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILmi;)V")
    public static final void method1509(int arg0, class443 arg1) {
        class398.field5667[arg0] = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public final void method1510(byte arg0) {
        field3486++;
        if (arg0 <= 19) {
            field3489 = null;
        }
        if (class159.field1898 >= 500) {
            return;
        }
        this.field3490 = class145.field1745;
        this.field3487 = null;
        this.field3488 = 0;
        class159.field1898++;
        class145.field1745 = this;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)I")
    public static final int method1511(int arg0, byte arg1) {
        field3491++;
        if (arg1 <= 125) {
            field3489 = null;
        }
        return arg0 >>> 7;
    }
}
