import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field737 = true;

    @OriginalMember(owner = "pb", name = "b", descriptor = "I")
    private int field738 = -328;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    public DoublyLinkable field739 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lw;")
    private DoublyLinkable field740;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field739.field385 = this.field739;
        this.field739.field386 = this.field739;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method248(DoublyLinkable arg0) {
        if (arg0.field386 != null) {
            arg0.method107();
        }
        arg0.field386 = this.field739.field386;
        arg0.field385 = this.field739;
        arg0.field386.field385 = arg0;
        arg0.field385.field386 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method249() {
        DoublyLinkable var1 = this.field739.field385;
        if (this.field739 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method250() {
        DoublyLinkable var1 = this.field739.field385;
        if (this.field739 == var1) {
            this.field740 = null;
            return null;
        } else {
            this.field740 = var1.field385;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lw;")
    public DoublyLinkable method251(int arg0) {
        DoublyLinkable var2 = this.field740;
        if (arg0 != 30869) {
            this.field738 = -3;
        }
        if (this.field739 == var2) {
            this.field740 = null;
            return null;
        } else {
            this.field740 = var2.field385;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method252() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field739.field385; var2 != this.field739; var2 = var2.field385) {
            var1++;
        }
        return var1;
    }
}
