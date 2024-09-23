import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "w", name = "e", descriptor = "I")
    private int field393 = 888;

    @OriginalMember(owner = "w", name = "f", descriptor = "Lw;")
    public DoublyLinkable field394;

    @OriginalMember(owner = "w", name = "g", descriptor = "Lw;")
    public DoublyLinkable field395;

    @OriginalMember(owner = "w", name = "h", descriptor = "Z")
    public static boolean field396;

    @OriginalMember(owner = "w", name = "b", descriptor = "()V")
    public void method107() {
        if (this.field395 != null) {
            this.field395.field394 = this.field394;
            this.field394.field395 = this.field395;
            this.field394 = null;
            this.field395 = null;
        }
    }
}
