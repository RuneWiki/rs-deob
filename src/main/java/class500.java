import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class500 extends class7 {

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
    public int field7011;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public int field7012;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public int field7013;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public int field7015;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "J")
    public long field7014;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)I", line = 5)
    public final int method25(int arg0) {
        if (arg0 != 26999) {
            this.method27(true);
        }
        return this.field7011;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)I", line = 17)
    public final int method26(boolean arg0) {
        if (!arg0) {
            this.field7011 = 125;
        }
        return this.field7013;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(Z)I", line = 27)
    public final int method27(boolean arg0) {
        if (arg0) {
            this.field7015 = -61;
        }
        return this.field7012;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I", line = 38)
    public final int method23(int arg0) {
        if (arg0 != -31225) {
            this.field7013 = -122;
        }
        return this.field7015;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)J", line = 48)
    public final long method24(int arg0) {
        if (arg0 != -6) {
            this.method26(false);
        }
        return this.field7014;
    }
}
