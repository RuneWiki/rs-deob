import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!x")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "client!x", name = "f", descriptor = "Lx;")
    public DoublyLinkable field401;

    @OriginalMember(owner = "client!x", name = "g", descriptor = "Lx;")
    public DoublyLinkable field402;

    @OriginalMember(owner = "client!x", name = "h", descriptor = "Z")
    public static boolean field403;

    @OriginalMember(owner = "client!x", name = "b", descriptor = "()V")
    public void method121() {
        if (this.field402 != null) {
            this.field402.field401 = this.field401;
            this.field401.field402 = this.field402;
            this.field401 = null;
            this.field402 = null;
        }
    }
}
