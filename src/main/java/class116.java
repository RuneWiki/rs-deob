import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class116 extends class125 {

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "[B")
    public byte[] field1721;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Z")
    public boolean field1720;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lkj;)Lml;")
    public final class116 method801(class154 arg0) {
        this.field1721 = arg0.method1040(this.field1721, (byte) -104);
        this.field1722 = arg0.method1041(-12966, this.field1722);
        if (this.field1724 == this.field1723) {
            this.field1723 = this.field1724 = arg0.method1043(this.field1723, 6);
        } else {
            this.field1723 = arg0.method1043(this.field1723, 6);
            this.field1724 = arg0.method1043(this.field1724, 6);
            if (this.field1724 == this.field1723) {
                this.field1723--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I[BII)V")
    public class116(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1722 = arg0;
        this.field1721 = arg1;
        this.field1723 = arg2;
        this.field1724 = arg3;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I[BIIZ)V")
    public class116(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1722 = arg0;
        this.field1721 = arg1;
        this.field1723 = arg2;
        this.field1724 = arg3;
        this.field1720 = arg4;
    }
}
