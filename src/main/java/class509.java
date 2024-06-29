import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class509 {

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public int field7582;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public int field7581;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public int field7580;

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V", line = 5)
    public class509() {
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lcga;)V", line = 7)
    public class509(class509 arg0) {
        this.field7582 = arg0.field7582;
        this.field7581 = arg0.field7581;
        this.field7580 = arg0.field7580;
    }
}
