import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "db", name = "h", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "db", name = "f", descriptor = "Ldb;")
    public DoublyLinkable field439;

    @OriginalMember(owner = "db", name = "g", descriptor = "Ldb;")
    public DoublyLinkable field440;

    @OriginalMember(owner = "db", name = "b", descriptor = "()V")
    public void method118() {
        if (this.field440 != null) {
            this.field440.field439 = this.field439;
            this.field439.field440 = this.field440;
            this.field439 = null;
            this.field440 = null;
        }
    }
}
