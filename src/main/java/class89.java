import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class89 extends class259 {

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "[B")
    public byte[] field1573;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Z")
    public boolean field1576;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lbj;)Lfc;")
    public final class89 method659(class80 arg0) {
        this.field1573 = arg0.method602((byte) 105, this.field1573);
        this.field1574 = arg0.method601(this.field1574, (byte) 126);
        if (this.field1577 == this.field1575) {
            this.field1577 = this.field1575 = arg0.method595((byte) -28, this.field1577);
        } else {
            this.field1577 = arg0.method595((byte) -28, this.field1577);
            this.field1575 = arg0.method595((byte) -28, this.field1575);
            if (this.field1577 == this.field1575) {
                this.field1577--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BII)V")
    public class89(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1574 = arg0;
        this.field1573 = arg1;
        this.field1577 = arg2;
        this.field1575 = arg3;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I[BIIZ)V")
    public class89(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1574 = arg0;
        this.field1573 = arg1;
        this.field1577 = arg2;
        this.field1575 = arg3;
        this.field1576 = arg4;
    }
}
