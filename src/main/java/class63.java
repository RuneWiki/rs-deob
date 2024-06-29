import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class63 {

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "Z")
    public boolean field693;

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "I")
    public static int field686 = 13156520;

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "Lsba;")
    public static class218 field690 = null;

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "Ltea;")
    public class241 field685;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "Ltea;")
    public class241 field689;

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "Z")
    public boolean field692;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Z)V", line = 4)
    public final void method485(boolean arg0) {
        field688++;
        if (this.field685 != null) {
            this.field685.method176(!arg0);
        }
        if (!arg0) {
            method488((byte) 27);
        }
        this.field692 = false;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)Z", line = 26)
    public final boolean method486(int arg0) {
        if (arg0 != 13156520) {
            field690 = null;
        }
        field691++;
        return this.field692 && !this.field693;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V", line = 38)
    public static void method487(byte arg0) {
        if (arg0 > 11) {
            field690 = null;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(B)I", line = 50)
    public static final int method488(byte arg0) {
        field687++;
        if (arg0 != 42) {
            method487((byte) -66);
        }
        return class392.field5553 == 1 ? class435.field6103 : 0;
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Z)V", line = 69)
    public class63(boolean arg0) {
        this.field693 = arg0;
    }
}
