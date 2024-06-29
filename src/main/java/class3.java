import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 6)
    public class3() {
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lel;)V", line = 8)
    public class3(class3 arg0) {
        this.field21 = arg0.field21;
        this.field20 = arg0.field20;
        this.field18 = arg0.field18;
        this.field19 = arg0.field19;
    }
}
