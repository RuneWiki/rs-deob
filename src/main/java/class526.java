import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class526 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public int field7642;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public int field7645;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public int field7643;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public int field7644;

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V", line = 6)
    public class526() {
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lwp;)V", line = 8)
    public class526(class526 arg0) {
        this.field7642 = arg0.field7642;
        this.field7645 = arg0.field7645;
        this.field7643 = arg0.field7643;
        this.field7644 = arg0.field7644;
    }
}
