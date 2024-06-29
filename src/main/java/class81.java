import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class81 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V", line = 5)
    public class81() {
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lgv;)V", line = 7)
    public class81(class81 arg0) {
        this.field1023 = arg0.field1023;
        this.field1024 = arg0.field1024;
        this.field1022 = arg0.field1022;
    }
}
