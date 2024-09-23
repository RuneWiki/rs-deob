import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field752 = true;

    @OriginalMember(owner = "pb", name = "b", descriptor = "I")
    private int field753 = -22129;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    public DoublyLinkable field754 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lw;")
    private DoublyLinkable field755;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList(boolean arg0) {
        this.field754.field389 = this.field754;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field754.field390 = this.field754;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method253(DoublyLinkable arg0) {
        if (arg0.field390 != null) {
            arg0.method107();
        }
        arg0.field390 = this.field754.field390;
        arg0.field389 = this.field754;
        arg0.field390.field389 = arg0;
        arg0.field389.field390 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method254() {
        DoublyLinkable var1 = this.field754.field389;
        if (this.field754 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method255() {
        DoublyLinkable var1 = this.field754.field389;
        if (this.field754 == var1) {
            this.field755 = null;
            return null;
        } else {
            this.field755 = var1.field389;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lw;")
    public DoublyLinkable method256(int arg0) {
        if (arg0 != 0) {
            this.field753 = 491;
        }
        DoublyLinkable var2 = this.field755;
        if (this.field754 == var2) {
            this.field755 = null;
            return null;
        } else {
            this.field755 = var2.field389;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method257() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field754.field389; var2 != this.field754; var2 = var2.field389) {
            var1++;
        }
        return var1;
    }
}
