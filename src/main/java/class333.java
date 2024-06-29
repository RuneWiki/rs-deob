import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class333 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public int field5024;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field5023;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field5021;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 6)
    public class333() {
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ltb;)V", line = 8)
    public class333(class333 arg0) {
        this.field5024 = arg0.field5024;
        this.field5023 = arg0.field5023;
        this.field5021 = arg0.field5021;
        this.field5022 = arg0.field5022;
    }
}
