import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 extends class67 {

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "[B")
    public byte[] field699;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Z")
    public boolean field695;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ltd;)Le;")
    public final class29 method224(class128 arg0) {
        this.field699 = arg0.method1044((byte) 4, this.field699);
        this.field698 = arg0.method1046((byte) 21, this.field698);
        if (this.field697 == this.field696) {
            this.field696 = this.field697 = arg0.method1047(this.field696, false);
        } else {
            this.field696 = arg0.method1047(this.field696, false);
            this.field697 = arg0.method1047(this.field697, false);
            if (this.field697 == this.field696) {
                this.field696--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I[BII)V")
    public class29(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field698 = arg0;
        this.field699 = arg1;
        this.field696 = arg2;
        this.field697 = arg3;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I[BIIZ)V")
    public class29(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field698 = arg0;
        this.field699 = arg1;
        this.field696 = arg2;
        this.field697 = arg3;
        this.field695 = arg4;
    }
}
