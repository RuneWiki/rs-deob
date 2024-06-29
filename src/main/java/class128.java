import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class128 extends class504 {

    @OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!oda", name = "v", descriptor = "J")
    public long field1924;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "(I)I", line = 5)
    public final int method1035(int arg0) {
        int var2 = 76 / ((-arg0 - 50) / 36);
        return this.field1922;
    }

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "(I)I", line = 14)
    public final int method1036(int arg0) {
        if (arg0 != 5) {
            this.field1921 = -51;
        }
        return this.field1923;
    }

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "(I)I", line = 24)
    public final int method1037(int arg0) {
        if (arg0 != -5) {
            this.method1035(-10);
        }
        return this.field1921;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)I", line = 35)
    public final int method1038(int arg0) {
        if (arg0 != 8) {
            this.field1924 = 125L;
        }
        return this.field1920;
    }

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "(I)J", line = 45)
    public final long method1039(int arg0) {
        if (arg0 != -4) {
            this.method1035(32);
        }
        return this.field1924;
    }
}
