import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "x", name = "f", descriptor = "Lx;")
    public DoublyLinkable field396;

    @OriginalMember(owner = "x", name = "g", descriptor = "Lx;")
    public DoublyLinkable field397;

    @OriginalMember(owner = "x", name = "h", descriptor = "Z")
    public static boolean field398;

    @OriginalMember(owner = "x", name = "b", descriptor = "()V")
    public void method120() {
        if (this.field397 != null) {
            this.field397.field396 = this.field396;
            this.field396.field397 = this.field397;
            this.field396 = null;
            this.field397 = null;
        }
    }
}
