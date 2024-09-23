import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "x", name = "e", descriptor = "Lx;")
    public DoublyLinkable field399;

    @OriginalMember(owner = "x", name = "f", descriptor = "Lx;")
    public DoublyLinkable field400;

    @OriginalMember(owner = "x", name = "g", descriptor = "Z")
    public static boolean field401;

    @OriginalMember(owner = "x", name = "b", descriptor = "()V")
    public void method121() {
        if (this.field400 != null) {
            this.field400.field399 = this.field399;
            this.field399.field400 = this.field400;
            this.field399 = null;
            this.field400 = null;
        }
    }
}
