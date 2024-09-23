import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "w", name = "f", descriptor = "I")
    private int field386 = 896;

    @OriginalMember(owner = "w", name = "g", descriptor = "Lw;")
    public DoublyLinkable field387;

    @OriginalMember(owner = "w", name = "h", descriptor = "Lw;")
    public DoublyLinkable field388;

    @OriginalMember(owner = "w", name = "i", descriptor = "Z")
    public static boolean field389;

    @OriginalMember(owner = "w", name = "b", descriptor = "()V")
    public void method107() {
        if (this.field388 != null) {
            this.field388.field387 = this.field387;
            this.field387.field388 = this.field388;
            this.field387 = null;
            this.field388 = null;
        }
    }
}
