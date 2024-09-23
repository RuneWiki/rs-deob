import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field744 = true;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Lw;")
    public DoublyLinkable field745 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    private DoublyLinkable field746;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(B)V")
    public DoublyLinkList(byte arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        this.field745.field389 = this.field745;
        this.field745.field390 = this.field745;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method248(DoublyLinkable arg0) {
        if (arg0.field390 != null) {
            arg0.method107();
        }
        arg0.field390 = this.field745.field390;
        arg0.field389 = this.field745;
        arg0.field390.field389 = arg0;
        arg0.field389.field390 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method249() {
        DoublyLinkable var1 = this.field745.field389;
        if (this.field745 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method250() {
        DoublyLinkable var1 = this.field745.field389;
        if (this.field745 == var1) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var1.field389;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lw;")
    public DoublyLinkable method251(byte arg0) {
        DoublyLinkable var2 = this.field746;
        if (this.field745 == var2) {
            this.field746 = null;
            return null;
        }
        this.field746 = var2.field389;
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            this.field744 = !this.field744;
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method252() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field745.field389; var2 != this.field745; var2 = var2.field389) {
            var1++;
        }
        return var1;
    }
}
