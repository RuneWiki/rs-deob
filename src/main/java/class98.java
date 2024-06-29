import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class98 extends class53 {

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "[B")
    public byte[] field1446;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "Z")
    public boolean field1447;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Led;)Ltf;")
    public final class98 method730(class228 arg0) {
        this.field1446 = arg0.method1559(115, this.field1446);
        this.field1448 = arg0.method1557(-125, this.field1448);
        if (this.field1450 == this.field1449) {
            this.field1450 = this.field1449 = arg0.method1558(this.field1450, (byte) -67);
        } else {
            this.field1450 = arg0.method1558(this.field1450, (byte) -122);
            this.field1449 = arg0.method1558(this.field1449, (byte) -71);
            if (this.field1450 == this.field1449) {
                this.field1450--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I[BII)V")
    public class98(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1448 = arg0;
        this.field1446 = arg1;
        this.field1450 = arg2;
        this.field1449 = arg3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class98(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1448 = arg0;
        this.field1446 = arg1;
        this.field1450 = arg2;
        this.field1449 = arg3;
        this.field1447 = arg4;
    }
}
