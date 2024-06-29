import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class103 extends class238 {

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "[B")
    public byte[] field1698;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "Z")
    public boolean field1700;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Llg;)Ltf;")
    public final class103 method647(class149 arg0) {
        this.field1698 = arg0.method1012(this.field1698, -5141);
        this.field1701 = arg0.method1018(2, this.field1701);
        if (this.field1702 == this.field1699) {
            this.field1699 = this.field1702 = arg0.method1016(this.field1699, 0);
        } else {
            this.field1699 = arg0.method1016(this.field1699, 0);
            this.field1702 = arg0.method1016(this.field1702, 0);
            if (this.field1702 == this.field1699) {
                this.field1699--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I[BII)V")
    public class103(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1701 = arg0;
        this.field1698 = arg1;
        this.field1699 = arg2;
        this.field1702 = arg3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class103(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1701 = arg0;
        this.field1698 = arg1;
        this.field1699 = arg2;
        this.field1702 = arg3;
        this.field1700 = arg4;
    }
}
