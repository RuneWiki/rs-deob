import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "w", name = "h", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "w", name = "f", descriptor = "Lw;")
    public DoublyLinkable field393;

    @OriginalMember(owner = "w", name = "g", descriptor = "Lw;")
    public DoublyLinkable field394;

    @OriginalMember(owner = "w", name = "b", descriptor = "()V")
    public void method107() {
        if (this.field394 != null) {
            this.field394.field393 = this.field393;
            this.field393.field394 = this.field394;
            this.field393 = null;
            this.field394 = null;
        }
    }
}
