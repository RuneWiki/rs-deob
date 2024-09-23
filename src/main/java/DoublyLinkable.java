import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "x", name = "g", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "x", name = "e", descriptor = "Lx;")
    public DoublyLinkable field393;

    @OriginalMember(owner = "x", name = "f", descriptor = "Lx;")
    public DoublyLinkable field394;

    @OriginalMember(owner = "x", name = "b", descriptor = "()V")
    public void method119() {
        if (this.field394 != null) {
            this.field394.field393 = this.field393;
            this.field393.field394 = this.field394;
            this.field393 = null;
            this.field394 = null;
        }
    }
}
