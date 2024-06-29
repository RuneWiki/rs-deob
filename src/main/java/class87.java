import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class87 extends class27 {

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public int field1948;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[B")
    public byte[] field1947;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Z")
    public boolean field1950;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lh;)Lna;")
    public final class87 method664(class49 arg0) {
        this.field1947 = arg0.method353((byte) 127, this.field1947);
        this.field1948 = arg0.method354(-128, this.field1948);
        if (this.field1949 == this.field1946) {
            this.field1949 = this.field1946 = arg0.method352(0, this.field1949);
        } else {
            this.field1949 = arg0.method352(0, this.field1949);
            this.field1946 = arg0.method352(0, this.field1946);
            if (this.field1949 == this.field1946) {
                this.field1949--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I[BII)V")
    public class87(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1948 = arg0;
        this.field1947 = arg1;
        this.field1949 = arg2;
        this.field1946 = arg3;
    }
}
