import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class577 extends class524 {

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    public int field8312;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public int field8313;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public int field8314;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    public int field8315;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "J")
    public long field8311;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I", line = 5)
    public final int method1938(int arg0) {
        return arg0 == -2 ? this.field8315 : -86;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)J", line = 17)
    public final long method1939(byte arg0) {
        if (arg0 != -32) {
            this.method1936(101);
        }
        return this.field8311;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I", line = 27)
    public final int method1936(int arg0) {
        if (arg0 != 11481) {
            this.method1939((byte) 75);
        }
        return this.field8314;
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)I", line = 39)
    public final int method1935(int arg0) {
        if (arg0 >= -103) {
            this.field8311 = -36L;
        }
        return this.field8313;
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)I", line = 51)
    public final int method1933(int arg0) {
        if (arg0 != -30035) {
            this.method1933(-105);
        }
        return this.field8312;
    }
}
