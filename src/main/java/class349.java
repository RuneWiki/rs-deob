import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class349 extends class314 {

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!gha", name = "r", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!gha", name = "s", descriptor = "J")
    public long field4636;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z)J")
    public final long method1878(boolean arg0) {
        return arg0 ? this.field4636 : 71L;
    }

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "(I)I")
    public final int method1880(int arg0) {
        if (arg0 != -5) {
            this.field4632 = -40;
        }
        return this.field4634;
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)I")
    public final int method1879(int arg0) {
        int var2 = 64 % ((arg0 - 72) / 49);
        return this.field4635;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)I")
    public final int method1875(int arg0) {
        return arg0 <= 34 ? 1 : this.field4633;
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)I")
    public final int method1876(int arg0) {
        return arg0 == 2 ? this.field4632 : 57;
    }
}
