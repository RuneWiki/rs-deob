import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class35 {

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
    public class35() {
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lrq;)V")
    public class35(class35 arg0) {
        this.field429 = arg0.field429;
        this.field430 = arg0.field430;
        this.field428 = arg0.field428;
    }
}
