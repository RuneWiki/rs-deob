import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class219 extends class614 {

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!sba", name = "u", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "J")
    public long field2947;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)I", line = 8)
    public final int method1424(int arg0) {
        return arg0 <= 8 ? -103 : this.field2949;
    }

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "(B)I", line = 19)
    public final int method1425(byte arg0) {
        int var2 = -91 % ((arg0 - 66) / 58);
        return this.field2946;
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)I", line = 27)
    public final int method1426(int arg0) {
        if (arg0 != 1600925004) {
            this.method1426(27);
        }
        return this.field2950;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)J", line = 38)
    public final long method1427(int arg0) {
        if (arg0 != 32) {
            this.method1427(16);
        }
        return this.field2947;
    }

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)I", line = 48)
    public final int method1428(int arg0) {
        if (arg0 != 1212) {
            this.field2950 = -128;
        }
        return this.field2948;
    }
}
