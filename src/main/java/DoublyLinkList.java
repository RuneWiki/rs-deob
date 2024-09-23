import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "b", descriptor = "Z")
    private boolean field747 = false;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    public DoublyLinkable field748 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lw;")
    private DoublyLinkable field749;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field748.field394 = this.field748;
        if (arg0 != -5693) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field748.field395 = this.field748;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method253(DoublyLinkable arg0) {
        if (arg0.field395 != null) {
            arg0.method107();
        }
        arg0.field395 = this.field748.field395;
        arg0.field394 = this.field748;
        arg0.field395.field394 = arg0;
        arg0.field394.field395 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method254() {
        DoublyLinkable var1 = this.field748.field394;
        if (this.field748 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method255() {
        DoublyLinkable var1 = this.field748.field394;
        if (this.field748 == var1) {
            this.field749 = null;
            return null;
        } else {
            this.field749 = var1.field394;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lw;")
    public DoublyLinkable method256(boolean arg0) {
        if (!arg0) {
            this.field746 = 351;
        }
        DoublyLinkable var2 = this.field749;
        if (this.field748 == var2) {
            this.field749 = null;
            return null;
        } else {
            this.field749 = var2.field394;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method257() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field748.field394; var2 != this.field748; var2 = var2.field394) {
            var1++;
        }
        return var1;
    }
}
