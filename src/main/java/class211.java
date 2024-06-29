import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class211 {

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
    public class211() {
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lvr;)V")
    public class211(class211 arg0) {
        this.field2904 = arg0.field2904;
        this.field2903 = arg0.field2903;
        this.field2901 = arg0.field2901;
        this.field2902 = arg0.field2902;
    }
}
