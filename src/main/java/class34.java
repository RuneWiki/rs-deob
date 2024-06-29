import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 {

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "()V")
    public class34() {
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lbja;)V")
    public class34(class34 arg0) {
        this.field404 = arg0.field404;
        this.field403 = arg0.field403;
        this.field402 = arg0.field402;
    }
}
