import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class DoublyLinkList {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    private int field667 = 679;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "B")
    private byte field668 = 2;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
    private boolean field669 = true;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Ldb;")
    private DoublyLinkable field670 = new DoublyLinkable();

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field670.field438 = this.field670;
        if (arg0 < 5 || arg0 > 5) {
            this.field667 = -426;
        }
        this.field670.field439 = this.field670;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ldb;)V")
    public void method240(DoublyLinkable arg0) {
        if (arg0.field439 != null) {
            arg0.method120();
        }
        arg0.field439 = this.field670.field439;
        arg0.field438 = this.field670;
        arg0.field439.field438 = arg0;
        arg0.field438.field439 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()Ldb;")
    public DoublyLinkable method241() {
        DoublyLinkable var1 = this.field670.field438;
        if (this.field670 == var1) {
            return null;
        } else {
            var1.method120();
            return var1;
        }
    }
}
