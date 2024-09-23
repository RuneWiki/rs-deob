import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field747 = 545;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    public DoublyLinkable field749 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "b", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lw;")
    private DoublyLinkable field750;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(B)V")
    public DoublyLinkList(byte arg0) {
        this.field749.field386 = this.field749;
        this.field749.field387 = this.field749;
        if (arg0 != 5) {
            this.field748 = -68;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method253(DoublyLinkable arg0) {
        if (arg0.field387 != null) {
            arg0.method107();
        }
        arg0.field387 = this.field749.field387;
        arg0.field386 = this.field749;
        arg0.field387.field386 = arg0;
        arg0.field386.field387 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method254() {
        DoublyLinkable var1 = this.field749.field386;
        if (this.field749 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method255() {
        DoublyLinkable var1 = this.field749.field386;
        if (this.field749 == var1) {
            this.field750 = null;
            return null;
        } else {
            this.field750 = var1.field386;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lw;")
    public DoublyLinkable method256(int arg0) {
        DoublyLinkable var2 = this.field750;
        if (arg0 < 8 || arg0 > 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field749 == var2) {
            this.field750 = null;
            return null;
        } else {
            this.field750 = var2.field386;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method257() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field749.field386; var2 != this.field749; var2 = var2.field386) {
            var1++;
        }
        return var1;
    }
}
