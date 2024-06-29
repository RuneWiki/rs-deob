import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class99 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 5)
    public class99() {
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lqm;)V", line = 7)
    public class99(class99 arg0) {
        this.field1545 = arg0.field1545;
        this.field1544 = arg0.field1544;
        this.field1543 = arg0.field1543;
    }
}
