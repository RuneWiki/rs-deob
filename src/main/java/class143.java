import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class143 extends class460 {

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!wea", name = "r", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!wea", name = "u", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "J")
    public long field1612;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)I")
    public final int method784(byte arg0) {
        if (arg0 != 10) {
            this.field1614 = 47;
        }
        return this.field1613;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I")
    public final int method785(int arg0) {
        if (arg0 != -6) {
            this.field1613 = 37;
        }
        return this.field1611;
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)I")
    public final int method786(int arg0) {
        return arg0 == 22461 ? this.field1614 : 117;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)I")
    public final int method787(int arg0) {
        if (arg0 != 4733) {
            this.field1610 = -86;
        }
        return this.field1610;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)J")
    public final long method788(boolean arg0) {
        if (arg0) {
            this.field1610 = -29;
        }
        return this.field1612;
    }
}
