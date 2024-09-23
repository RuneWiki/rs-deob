import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "cb", name = "g", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "cb", name = "e", descriptor = "Lcb;")
    public DoublyLinkable field415;

    @OriginalMember(owner = "cb", name = "f", descriptor = "Lcb;")
    public DoublyLinkable field416;

    @OriginalMember(owner = "cb", name = "b", descriptor = "()V")
    public void method102() {
        if (this.field416 != null) {
            this.field416.field415 = this.field415;
            this.field415.field416 = this.field416;
            this.field415 = null;
            this.field416 = null;
        }
    }
}
