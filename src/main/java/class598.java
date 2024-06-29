import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class598 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public int field8638;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field8640;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public int field8639;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class598() {
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lic;)V")
    public class598(class598 arg0) {
        this.field8638 = arg0.field8638;
        this.field8640 = arg0.field8640;
        this.field8639 = arg0.field8639;
    }
}
