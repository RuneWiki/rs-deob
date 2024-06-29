import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class135 extends class430 {

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "J")
    public long field2037;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
    public final int method991(int arg0) {
        if (arg0 != 7) {
            this.field2037 = 23L;
        }
        return this.field2036;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(B)I")
    public final int method992(byte arg0) {
        int var2 = 36 / ((-arg0 - 24) / 56);
        return this.field2039;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
    public final int method993(int arg0) {
        if (arg0 != -1) {
            this.field2039 = -13;
        }
        return this.field2040;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)I")
    public final int method994(byte arg0) {
        if (arg0 != -75) {
            this.field2038 = -95;
        }
        return this.field2038;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)J")
    public final long method995(int arg0) {
        if (arg0 != 5) {
            this.field2040 = 29;
        }
        return this.field2037;
    }
}
