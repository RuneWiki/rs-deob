import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "B")
    private byte field655 = 4;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Ldb;")
    private DoublyLinkable field656 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList(boolean arg0) {
        this.field656.field437 = this.field656;
        this.field656.field438 = this.field656;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Ldb;)V")
    public void method233(DoublyLinkable arg0) {
        if (arg0.field438 != null) {
            arg0.method119();
        }
        arg0.field438 = this.field656.field438;
        arg0.field437 = this.field656;
        arg0.field438.field437 = arg0;
        arg0.field437.field438 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Ldb;")
    public DoublyLinkable method234() {
        DoublyLinkable var1 = this.field656.field437;
        if (this.field656 == var1) {
            return null;
        } else {
            var1.method119();
            return var1;
        }
    }
}
