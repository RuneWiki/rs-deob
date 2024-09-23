import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field667 = 679;

    @OriginalMember(owner = "pb", name = "b", descriptor = "B")
    private byte field668 = 2;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Z")
    private boolean field669 = true;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Ldb;")
    private DoublyLinkable field670 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field670.next2 = this.field670;
        if (arg0 < 5 || arg0 > 5) {
            this.field667 = -426;
        }
        this.field670.prev2 = this.field670;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Ldb;)V")
    public void method240(DoublyLinkable arg0) {
        if (arg0.prev2 != null) {
            arg0.unlink2();
        }
        arg0.prev2 = this.field670.prev2;
        arg0.next2 = this.field670;
        arg0.prev2.next2 = arg0;
        arg0.next2.prev2 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Ldb;")
    public DoublyLinkable method241() {
        DoublyLinkable var1 = this.field670.next2;
        if (this.field670 == var1) {
            return null;
        } else {
            var1.unlink2();
            return var1;
        }
    }
}
