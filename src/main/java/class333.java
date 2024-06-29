import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class333 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 5)
    public class333() {
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lke;)V", line = 7)
    public class333(class333 arg0) {
        this.field4521 = arg0.field4521;
        this.field4522 = arg0.field4522;
        this.field4520 = arg0.field4520;
    }
}
