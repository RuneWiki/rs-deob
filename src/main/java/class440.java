import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class440 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public int field6037;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public int field6040;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public int field6038;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public int field6039;

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 6)
    public class440() {
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Loo;)V", line = 8)
    public class440(class440 arg0) {
        this.field6037 = arg0.field6037;
        this.field6040 = arg0.field6040;
        this.field6038 = arg0.field6038;
        this.field6039 = arg0.field6039;
    }
}
