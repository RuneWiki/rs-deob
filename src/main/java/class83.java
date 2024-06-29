import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class83 extends class36 {

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[B")
    public byte[] field1521;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
    public boolean field1518;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I[BII)V")
    public class83(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1519 = arg0;
        this.field1521 = arg1;
        this.field1517 = arg2;
        this.field1520 = arg3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lfa;)Ljb;")
    public final class83 method499(class48 arg0) {
        this.field1521 = arg0.method303((byte) -106, this.field1521);
        this.field1519 = arg0.method305(this.field1519, 100);
        if (this.field1520 == this.field1517) {
            this.field1517 = this.field1520 = arg0.method304(this.field1517, true);
        } else {
            this.field1517 = arg0.method304(this.field1517, true);
            this.field1520 = arg0.method304(this.field1520, true);
            if (this.field1520 == this.field1517) {
                this.field1517--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I[BIIZ)V")
    public class83(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1519 = arg0;
        this.field1521 = arg1;
        this.field1517 = arg2;
        this.field1520 = arg3;
        this.field1518 = arg4;
    }
}
