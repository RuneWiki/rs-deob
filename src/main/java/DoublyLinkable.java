import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DPPNUUMQ")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "client!DPPNUUMQ", name = "g", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!DPPNUUMQ", name = "e", descriptor = "LDPPNUUMQ;")
    public DoublyLinkable field633;

    @OriginalMember(owner = "client!DPPNUUMQ", name = "f", descriptor = "LDPPNUUMQ;")
    public DoublyLinkable field634;

    @OriginalMember(owner = "client!DPPNUUMQ", name = "b", descriptor = "()V")
    public void method185() {
        if (this.field634 != null) {
            this.field634.field633 = this.field633;
            this.field633.field634 = this.field634;
            this.field633 = null;
            this.field634 = null;
        }
    }
}
