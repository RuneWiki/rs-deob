import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class DoublyLinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "B")
    private byte field629 = 69;

    @OriginalMember(owner = "ob", name = "b", descriptor = "I")
    private int field630 = 845;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lcb;")
    public DoublyLinkable field631 = new DoublyLinkable();

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(B)V")
    public DoublyLinkList(byte arg0) {
        this.field631.field415 = this.field631;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        this.field631.field416 = this.field631;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lcb;)V")
    public void method208(DoublyLinkable arg0) {
        if (arg0.field416 != null) {
            arg0.method102();
        }
        arg0.field416 = this.field631.field416;
        arg0.field415 = this.field631;
        arg0.field416.field415 = arg0;
        arg0.field415.field416 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lcb;")
    public DoublyLinkable method209() {
        DoublyLinkable var1 = this.field631.field415;
        if (this.field631 == var1) {
            return null;
        } else {
            var1.method102();
            return var1;
        }
    }
}
