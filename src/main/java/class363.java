import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class363 {

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public int field5236;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public int field5238;

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
    public class363() {
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lrr;)V")
    public class363(class363 arg0) {
        this.field5236 = arg0.field5236;
        this.field5237 = arg0.field5237;
        this.field5238 = arg0.field5238;
    }
}
