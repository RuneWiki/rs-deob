import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class356 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public int field4738;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 6)
    public class356() {
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lrb;)V", line = 8)
    public class356(class356 arg0) {
        this.field4739 = arg0.field4739;
        this.field4738 = arg0.field4738;
        this.field4737 = arg0.field4737;
        this.field4740 = arg0.field4740;
    }
}
