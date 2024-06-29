import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class275 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 5)
    public class275() {
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbm;)V", line = 7)
    public class275(class275 arg0) {
        this.field4048 = arg0.field4048;
        this.field4050 = arg0.field4050;
        this.field4049 = arg0.field4049;
    }
}
