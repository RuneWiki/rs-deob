import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class72 extends class68 {

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[I")
    public static int[] field1641 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Z")
    public static boolean field1639 = false;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "Lae;")
    public static class6 field1648 = class64.method474(119, "Mitteilung");

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lae;")
    private static class6 field1645 = class64.method474(115, "Connecting to friendserver");

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field1643 = 0;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Lae;")
    public static class6 field1647 = field1645;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field1649 = -1;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Lae;")
    private static class6 field1651 = class64.method474(119, " is already on your ignore list");

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "Lae;")
    public static class6 field1642 = field1651;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Lld;")
    public class72 field1650;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "Lld;")
    public class72 field1652;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "[I")
    public static int[] field1653;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 10)
    public final void method572(int arg0) {
        field1640++;
        if (this.field1650 == null) {
            return;
        }
        this.field1650.field1652 = this.field1652;
        this.field1652.field1650 = this.field1650;
        if (arg0 == 16777215) {
            this.field1650 = null;
            this.field1652 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V", line = 58)
    public static void method573(int arg0) {
        field1653 = null;
        field1647 = null;
        if (arg0 != 0) {
            method573(42);
        }
        field1645 = null;
        field1642 = null;
        field1651 = null;
        field1648 = null;
        field1641 = null;
    }
}
