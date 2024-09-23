import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field650 = true;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Z")
    private boolean field651 = true;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Ldb;")
    public DoublyLinkable field652 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field652.field430 = this.field652;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field652.field431 = this.field652;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Ldb;)V")
    public void method225(DoublyLinkable arg0) {
        if (arg0.field431 != null) {
            arg0.method116();
        }
        arg0.field431 = this.field652.field431;
        arg0.field430 = this.field652;
        arg0.field431.field430 = arg0;
        arg0.field430.field431 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Ldb;")
    public DoublyLinkable method226() {
        DoublyLinkable var1 = this.field652.field430;
        if (this.field652 == var1) {
            return null;
        } else {
            var1.method116();
            return var1;
        }
    }
}
