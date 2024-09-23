import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "db", name = "g", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "db", name = "e", descriptor = "Ldb;")
    public DoublyLinkable field430;

    @OriginalMember(owner = "db", name = "f", descriptor = "Ldb;")
    public DoublyLinkable field431;

    @OriginalMember(owner = "db", name = "b", descriptor = "()V")
    public void method116() {
        if (this.field431 != null) {
            this.field431.field430 = this.field430;
            this.field430.field431 = this.field431;
            this.field430 = null;
            this.field431 = null;
        }
    }
}
