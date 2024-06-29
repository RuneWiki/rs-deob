import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class128 extends class441 {

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "J")
    public long field2326;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)J")
    public final long method1090(int arg0) {
        if (arg0 != 3) {
            this.method1093(13);
        }
        return this.field2326;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)I")
    public final int method1091(byte arg0) {
        return arg0 < 9 ? 88 : this.field2329;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
    public final int method1092(int arg0) {
        return arg0 >= -125 ? 97 : this.field2328;
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)I")
    public final int method1093(int arg0) {
        if (arg0 != 5) {
            this.field2327 = -103;
        }
        return this.field2330;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I")
    public final int method1094(boolean arg0) {
        return arg0 ? this.field2327 : -117;
    }
}
