import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class124 extends class68 {

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "J")
    public long field1727;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I", line = 5)
    public final int method541(int arg0) {
        if (arg0 != 30818) {
            this.field1729 = 85;
        }
        return this.field1728;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)J", line = 16)
    public final long method537(byte arg0) {
        int var2 = 55 / ((arg0 - 41) / 50);
        return this.field1727;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I", line = 24)
    public final int method532(byte arg0) {
        if (arg0 != 108) {
            this.field1729 = -53;
        }
        return this.field1731;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I", line = 35)
    public final int method536(boolean arg0) {
        return arg0 ? 116 : this.field1729;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)I", line = 45)
    public final int method539(boolean arg0) {
        if (!arg0) {
            this.field1731 = -110;
        }
        return this.field1730;
    }
}
