import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class759 {

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public int field10519;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public int field10518;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "I")
    public int field10517;

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "()V", line = 5)
    public class759() {
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lsha;)V", line = 7)
    public class759(class759 arg0) {
        this.field10519 = arg0.field10519;
        this.field10518 = arg0.field10518;
        this.field10517 = arg0.field10517;
    }
}
