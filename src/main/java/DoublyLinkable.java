import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!x")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "client!x", name = "e", descriptor = "I")
    private int field417 = 2;

    @OriginalMember(owner = "client!x", name = "f", descriptor = "Lx;")
    public DoublyLinkable field418;

    @OriginalMember(owner = "client!x", name = "g", descriptor = "Lx;")
    public DoublyLinkable field419;

    @OriginalMember(owner = "client!x", name = "h", descriptor = "Z")
    public static boolean field420;

    @OriginalMember(owner = "client!x", name = "b", descriptor = "()V")
    public void method121() {
        if (this.field419 != null) {
            this.field419.field418 = this.field418;
            this.field418.field419 = this.field419;
            this.field418 = null;
            this.field419 = null;
        }
    }
}
