import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class42 {

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V", line = 6)
    public class42() {
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lmaa;)V", line = 8)
    public class42(class42 arg0) {
        this.field523 = arg0.field523;
        this.field524 = arg0.field524;
        this.field521 = arg0.field521;
        this.field522 = arg0.field522;
    }
}
