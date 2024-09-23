import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field744 = 195;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Lw;")
    public DoublyLinkable field745 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    private DoublyLinkable field746;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field745.field387 = this.field745;
        this.field745.field388 = this.field745;
        if (arg0 != 9) {
            this.field744 = 185;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method251(DoublyLinkable arg0) {
        if (arg0.field388 != null) {
            arg0.method107();
        }
        arg0.field388 = this.field745.field388;
        arg0.field387 = this.field745;
        arg0.field388.field387 = arg0;
        arg0.field387.field388 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method252() {
        DoublyLinkable var1 = this.field745.field387;
        if (this.field745 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method253() {
        DoublyLinkable var1 = this.field745.field387;
        if (this.field745 == var1) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var1.field387;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lw;")
    public DoublyLinkable method254(boolean arg0) {
        DoublyLinkable var2 = this.field746;
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field745 == var2) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var2.field387;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method255() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field745.field387; var2 != this.field745; var2 = var2.field387) {
            var1++;
        }
        return var1;
    }
}
