import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class439 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public int field6264;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public int field6265;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public int field6263;

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class439() {
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lnm;)V")
    public class439(class439 arg0) {
        this.field6264 = arg0.field6264;
        this.field6265 = arg0.field6265;
        this.field6263 = arg0.field6263;
    }
}
