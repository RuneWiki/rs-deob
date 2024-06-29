import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class84 extends class294 {

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "J")
    public long field1009;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)I")
    public final int method450(boolean arg0) {
        if (!arg0) {
            this.field1008 = -101;
        }
        return this.field1008;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)I")
    public final int method451(byte arg0) {
        if (arg0 > -52) {
            this.method451((byte) -93);
        }
        return this.field1012;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)I")
    public final int method452(boolean arg0) {
        if (arg0) {
            this.method452(true);
        }
        return this.field1011;
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)J")
    public final long method453(byte arg0) {
        return arg0 == -61 ? this.field1009 : 114L;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)I")
    public final int method454(int arg0) {
        if (arg0 != -3) {
            this.field1012 = -70;
        }
        return this.field1010;
    }
}
