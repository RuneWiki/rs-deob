import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class80 {

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
    public class80() {
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lcq;)V")
    public class80(class80 arg0) {
        this.field1006 = arg0.field1006;
        this.field1004 = arg0.field1004;
        this.field1005 = arg0.field1005;
    }
}
