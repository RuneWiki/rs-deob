import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field754 = false;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Lw;")
    public DoublyLinkable field755 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    private DoublyLinkable field756;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field755.field395 = this.field755;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field755.field396 = this.field755;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method253(DoublyLinkable arg0) {
        if (arg0.field396 != null) {
            arg0.method107();
        }
        arg0.field396 = this.field755.field396;
        arg0.field395 = this.field755;
        arg0.field396.field395 = arg0;
        arg0.field395.field396 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method254() {
        DoublyLinkable var1 = this.field755.field395;
        if (this.field755 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method255() {
        DoublyLinkable var1 = this.field755.field395;
        if (this.field755 == var1) {
            this.field756 = null;
            return null;
        } else {
            this.field756 = var1.field395;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lw;")
    public DoublyLinkable method256(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        DoublyLinkable var3 = this.field756;
        if (this.field755 == var3) {
            this.field756 = null;
            return null;
        } else {
            this.field756 = var3.field395;
            return var3;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method257() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field755.field395; var2 != this.field755; var2 = var2.field395) {
            var1++;
        }
        return var1;
    }
}
