import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class761 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public int field10492;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field10493;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field10491;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field10490;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 6)
    public class761() {
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lcc;)V", line = 8)
    public class761(class761 arg0) {
        this.field10492 = arg0.field10492;
        this.field10493 = arg0.field10493;
        this.field10491 = arg0.field10491;
        this.field10490 = arg0.field10490;
    }
}
