import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "w", name = "f", descriptor = "Lw;")
    public DoublyLinkable field386;

    @OriginalMember(owner = "w", name = "g", descriptor = "Lw;")
    public DoublyLinkable field387;

    @OriginalMember(owner = "w", name = "h", descriptor = "Z")
    public static boolean field388;

    @OriginalMember(owner = "w", name = "b", descriptor = "()V")
    public void method107() {
        if (this.field387 != null) {
            this.field387.field386 = this.field386;
            this.field386.field387 = this.field387;
            this.field386 = null;
            this.field387 = null;
        }
    }
}
