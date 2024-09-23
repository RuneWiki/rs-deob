import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "B")
    private byte field746 = 1;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Lw;")
    public DoublyLinkable field747 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    private DoublyLinkable field748;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList(boolean arg0) {
        this.field747.field389 = this.field747;
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field747.field390 = this.field747;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method253(DoublyLinkable arg0) {
        if (arg0.field390 != null) {
            arg0.method107();
        }
        arg0.field390 = this.field747.field390;
        arg0.field389 = this.field747;
        arg0.field390.field389 = arg0;
        arg0.field389.field390 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method254() {
        DoublyLinkable var1 = this.field747.field389;
        if (this.field747 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method255() {
        DoublyLinkable var1 = this.field747.field389;
        if (this.field747 == var1) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var1.field389;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lw;")
    public DoublyLinkable method256(byte arg0) {
        DoublyLinkable var2 = this.field748;
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        if (this.field747 == var2) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var2.field389;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method257() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field747.field389; var2 != this.field747; var2 = var2.field389) {
            var1++;
        }
        return var1;
    }
}
