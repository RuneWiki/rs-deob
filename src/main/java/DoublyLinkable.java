import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "w", name = "e", descriptor = "Z")
    private boolean field384 = true;

    @OriginalMember(owner = "w", name = "f", descriptor = "Lw;")
    public DoublyLinkable field385;

    @OriginalMember(owner = "w", name = "g", descriptor = "Lw;")
    public DoublyLinkable field386;

    @OriginalMember(owner = "w", name = "h", descriptor = "Z")
    public static boolean field387;

    @OriginalMember(owner = "w", name = "b", descriptor = "()V")
    public void method107() {
        if (this.field386 != null) {
            this.field386.field385 = this.field385;
            this.field385.field386 = this.field386;
            this.field385 = null;
            this.field386 = null;
        }
    }
}
