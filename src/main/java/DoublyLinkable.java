import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "db", name = "g", descriptor = "I")
    public static int _flowObfuscator2;

    @OriginalMember(owner = "db", name = "e", descriptor = "Ldb;")
    public DoublyLinkable next2;

    @OriginalMember(owner = "db", name = "f", descriptor = "Ldb;")
    public DoublyLinkable prev2;

    @OriginalMember(owner = "db", name = "b", descriptor = "()V")
    public void unlink2() {
        if (this.prev2 != null) {
            this.prev2.next2 = this.next2;
            this.next2.prev2 = this.prev2;
            this.next2 = null;
            this.prev2 = null;
        }
    }
}
