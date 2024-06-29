import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class247 {

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lke;")
    public static class106 field4023 = new class106(64);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "J")
    public long field4018;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lid;")
    public class247 field4013;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lid;")
    public class247 field4017;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method1760(byte arg0) {
        field4023 = null;
        if (arg0 != 23) {
            field4014 = 73;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lfe;B)V")
    public static final void method1761(class231 arg0, byte arg1) {
        if (arg1 >= -79) {
            method1760((byte) 39);
        }
        field4019++;
        if (class175.field2758 == arg0.field3707) {
            class302.field4808[arg0.field3718] = true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Z")
    public final boolean method1762(int arg0) {
        field4016++;
        if (this.field4017 == null) {
            return false;
        } else {
            if (arg0 != -18974) {
                this.method1764(-23);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLfe;)Lfe;")
    public static final class231 method1763(byte arg0, class231 arg1) {
        if (arg0 != 10) {
            field4014 = -103;
        }
        field4022++;
        class231 var2 = client.method1709(arg1);
        if (var2 == null) {
            var2 = arg1.field3652;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method1764(int arg0) {
        if (arg0 != 64) {
            field4014 = -114;
        }
        field4020++;
        if (this.field4017 != null) {
            this.field4017.field4013 = this.field4013;
            this.field4013.field4017 = this.field4017;
            this.field4013 = null;
            this.field4017 = null;
        }
    }
}
