import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field742 = 8841;

    @OriginalMember(owner = "pb", name = "b", descriptor = "I")
    private int field743 = 8;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    public DoublyLinkable field744 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lw;")
    private DoublyLinkable field745;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        this.field744.field387 = this.field744;
        this.field744.field388 = this.field744;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method249(DoublyLinkable arg0) {
        if (arg0.field388 != null) {
            arg0.method107();
        }
        arg0.field388 = this.field744.field388;
        arg0.field387 = this.field744;
        arg0.field388.field387 = arg0;
        arg0.field387.field388 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method250() {
        DoublyLinkable var1 = this.field744.field387;
        if (this.field744 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method251() {
        DoublyLinkable var1 = this.field744.field387;
        if (this.field744 == var1) {
            this.field745 = null;
            return null;
        } else {
            this.field745 = var1.field387;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lw;")
    public DoublyLinkable method252(boolean arg0) {
        DoublyLinkable var2 = this.field745;
        if (this.field744 == var2) {
            this.field745 = null;
            return null;
        }
        this.field745 = var2.field387;
        if (arg0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method253() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field744.field387; var2 != this.field744; var2 = var2.field387) {
            var1++;
        }
        return var1;
    }
}
