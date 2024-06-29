import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class480 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field6805;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field6807;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field6806;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class480() {
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lcb;)V")
    public class480(class480 arg0) {
        this.field6805 = arg0.field6805;
        this.field6807 = arg0.field6807;
        this.field6806 = arg0.field6806;
    }
}
