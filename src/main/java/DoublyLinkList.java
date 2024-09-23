import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field737 = false;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Z")
    private boolean field738 = true;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    public DoublyLinkable field739 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lw;")
    private DoublyLinkable field740;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field739.field387 = this.field739;
        if (arg0 != -39453) {
            this.field738 = !this.field738;
        }
        this.field739.field388 = this.field739;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method253(DoublyLinkable arg0) {
        if (arg0.field388 != null) {
            arg0.method107();
        }
        arg0.field388 = this.field739.field388;
        arg0.field387 = this.field739;
        arg0.field388.field387 = arg0;
        arg0.field387.field388 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method254() {
        DoublyLinkable var1 = this.field739.field387;
        if (this.field739 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method255() {
        DoublyLinkable var1 = this.field739.field387;
        if (this.field739 == var1) {
            this.field740 = null;
            return null;
        } else {
            this.field740 = var1.field387;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lw;")
    public DoublyLinkable method256(byte arg0) {
        DoublyLinkable var2 = this.field740;
        if (this.field739 == var2) {
            this.field740 = null;
            return null;
        }
        this.field740 = var2.field387;
        if (arg0 != 71) {
            this.field737 = !this.field737;
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method257() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field739.field387; var2 != this.field739; var2 = var2.field387) {
            var1++;
        }
        return var1;
    }
}
