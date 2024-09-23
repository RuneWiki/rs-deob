import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "x", name = "e", descriptor = "Lx;")
    public DoublyLinkable field405;

    @OriginalMember(owner = "x", name = "f", descriptor = "Lx;")
    public DoublyLinkable field406;

    @OriginalMember(owner = "x", name = "g", descriptor = "Z")
    public static boolean field407;

    @OriginalMember(owner = "x", name = "b", descriptor = "()V")
    public void method120() {
        if (this.field406 != null) {
            this.field406.field405 = this.field405;
            this.field405.field406 = this.field406;
            this.field405 = null;
            this.field406 = null;
        }
    }
}
