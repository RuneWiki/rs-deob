import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class130 extends class376 {

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field1926 = 0;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "J")
    public long field1928;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)J", line = 6)
    public final long method950(boolean arg0) {
        field1932++;
        if (!arg0) {
            this.field1925 = -53;
        }
        return this.field1928;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V", line = 25)
    public static final void method951(int arg0) {
        field1927++;
        class320.field4934 = class267.method1665(8, 2048, 0.4F, 8, true, arg0 - 148, arg0, 4);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)I", line = 34)
    public final int method952(int arg0) {
        if (arg0 != 25407) {
            field1926 = 77;
        }
        field1931++;
        return this.field1925;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V", line = 45)
    public static final void method953(byte arg0) {
        field1924++;
        class174.field2549 = new class310[class433.field6407.method535((byte) 117)][];
        class376.field5673 = new class310[class433.field6407.method535((byte) 117)][];
        class36.field502 = new boolean[class433.field6407.method535((byte) 117)];
        if (arg0 != 34) {
            field1926 = -117;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)I", line = 59)
    public final int method954(int arg0) {
        field1923++;
        if (arg0 != 3) {
            this.field1925 = -47;
        }
        return this.field1933;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)I", line = 70)
    public final int method955(byte arg0) {
        field1929++;
        if (arg0 > -96) {
            this.field1930 = -23;
        }
        return this.field1930;
    }
}
