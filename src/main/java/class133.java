import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class133 {

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V", line = 5)
    public class133() {
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lsu;)V", line = 7)
    public class133(class133 arg0) {
        this.field2103 = arg0.field2103;
        this.field2102 = arg0.field2102;
        this.field2101 = arg0.field2101;
    }
}
