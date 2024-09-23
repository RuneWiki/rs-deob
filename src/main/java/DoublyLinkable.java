import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "w", name = "f", descriptor = "I")
    private int field394 = -20292;

    @OriginalMember(owner = "w", name = "g", descriptor = "Lw;")
    public DoublyLinkable field395;

    @OriginalMember(owner = "w", name = "h", descriptor = "Lw;")
    public DoublyLinkable field396;

    @OriginalMember(owner = "w", name = "i", descriptor = "Z")
    public static boolean field397;

    @OriginalMember(owner = "w", name = "b", descriptor = "()V")
    public void method107() {
        if (this.field396 != null) {
            this.field396.field395 = this.field395;
            this.field395.field396 = this.field396;
            this.field395 = null;
            this.field396 = null;
        }
    }
}
