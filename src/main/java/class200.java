import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class200 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 5)
    public class200() {
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lnc;)V", line = 7)
    public class200(class200 arg0) {
        this.field2603 = arg0.field2603;
        this.field2604 = arg0.field2604;
        this.field2605 = arg0.field2605;
    }
}
