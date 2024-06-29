import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class37 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "B")
    private byte field600;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[I")
    public static int[] field601 = new int[25];

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "[I")
    public static int[] field616 = new int[128];

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field602 = 0;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lna;")
    public static class26 field604 = class69.method505("settings", (byte) -127);

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Lve;")
    public static class266 field610;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lbe;")
    public static class297 field608;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 19)
    public static void method308(int arg0) {
        field604 = null;
        field601 = null;
        field616 = null;
        field610 = null;
        field608 = null;
        if (arg0 != 25) {
            field610 = (class266) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 41)
    public static final void method309(byte arg0) {
        field611++;
        if (arg0 >= 4) {
            class165.field2559.method1986((byte) -119);
            class80.field1252.method1986((byte) -103);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)I", line = 60)
    public final int method310(boolean arg0) {
        if (arg0) {
            field614 = -21;
        }
        field603++;
        return this.field600 & 0x7;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I", line = 87)
    public final int method311(byte arg0) {
        field613++;
        int var2 = -74 % ((arg0 - 73) / 35);
        return (this.field600 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 108)
    public class37() {
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lwa;)V", line = 114)
    public class37(class82 arg0) {
        this.field600 = arg0.method599(false);
        this.field612 = arg0.method576(1);
        this.field618 = arg0.method587(-502942936);
        this.field606 = arg0.method587(-502942936);
        this.field605 = arg0.method587(-502942936);
        this.field609 = arg0.method587(-502942936);
    }
}
