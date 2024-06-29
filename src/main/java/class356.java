import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class356 {

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public int field5429;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public int field5431;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class356() {
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ldn;)V")
    public class356(class356 arg0) {
        this.field5429 = arg0.field5429;
        this.field5431 = arg0.field5431;
        this.field5430 = arg0.field5430;
        this.field5428 = arg0.field5428;
    }
}
