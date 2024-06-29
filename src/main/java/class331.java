import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class331 {

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public int field4825;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public int field4822;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V", line = 6)
    public class331() {
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lcq;)V", line = 8)
    public class331(class331 arg0) {
        this.field4825 = arg0.field4825;
        this.field4823 = arg0.field4823;
        this.field4822 = arg0.field4822;
        this.field4824 = arg0.field4824;
    }
}
