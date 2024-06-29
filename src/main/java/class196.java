import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class196 extends class8 {

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field2593;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "J")
    public long field2597;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
    public final int method51(int arg0) {
        return arg0 == 1 ? this.field2593 : -92;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)J")
    public final long method50(int arg0) {
        if (arg0 <= 99) {
            this.method50(106);
        }
        return this.field2597;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)I")
    public final int method55(byte arg0) {
        return arg0 == 71 ? this.field2596 : -5;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)I")
    public final int method49(byte arg0) {
        if (arg0 != -31) {
            this.field2595 = -49;
        }
        return this.field2595;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)I")
    public final int method57(byte arg0) {
        int var2 = 78 % ((75 - arg0) / 32);
        return this.field2594;
    }
}
