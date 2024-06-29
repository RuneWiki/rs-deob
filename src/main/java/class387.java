import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class387 {

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "Lsba;")
    public static class387 field5666 = new class387();

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "Lsba;")
    public static class387 field5668 = new class387();

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Lsba;")
    public static class387 field5669 = new class387();

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "Lsba;")
    public static class387 field5671 = new class387();

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "Lqj;")
    public static class511 field5672 = new class511(13, 8);

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "Lau;")
    public static class692 field5673 = new class692();

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "Lop;")
    public static class524 field5675;

    @OriginalMember(owner = "client!sba", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field5670++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V", line = 12)
    public static void method2367(int arg0) {
        field5668 = null;
        field5673 = null;
        field5675 = null;
        field5671 = null;
        int var1 = -114 % ((-arg0 - 84) / 41);
        field5666 = null;
        field5672 = null;
        field5669 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V", line = 31)
    public static final void method2368(byte arg0) {
        field5667++;
        if (class515.field7636 == 3) {
            class595.method3408((byte) 69, 4);
        } else if (class515.field7636 == 7) {
            class595.method3408((byte) 109, 8);
        } else if (class515.field7636 == 10) {
            class595.method3408((byte) 107, 11);
        }
        if (arg0 < 28) {
            field5674 = -101;
        }
    }
}
