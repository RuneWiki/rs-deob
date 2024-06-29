import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class509 {

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public int field7751;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public int field7752;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public int field7750;

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
    public class509() {
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Llo;)V")
    public class509(class509 arg0) {
        this.field7751 = arg0.field7751;
        this.field7752 = arg0.field7752;
        this.field7750 = arg0.field7750;
    }
}
