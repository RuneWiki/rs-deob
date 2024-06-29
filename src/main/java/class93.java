import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class93 extends class267 {

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[B")
    public byte[] field1530;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Z")
    public boolean field1534;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhi;)Lcf;")
    public final class93 method699(class220 arg0) {
        this.field1530 = arg0.method1497((byte) -116, this.field1530);
        this.field1532 = arg0.method1500(this.field1532, (byte) 58);
        if (this.field1533 == this.field1531) {
            this.field1533 = this.field1531 = arg0.method1499((byte) -8, this.field1533);
        } else {
            this.field1533 = arg0.method1499((byte) -8, this.field1533);
            this.field1531 = arg0.method1499((byte) -8, this.field1531);
            if (this.field1533 == this.field1531) {
                this.field1533--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I[BII)V")
    public class93(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1532 = arg0;
        this.field1530 = arg1;
        this.field1533 = arg2;
        this.field1531 = arg3;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I[BIIZ)V")
    public class93(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1532 = arg0;
        this.field1530 = arg1;
        this.field1533 = arg2;
        this.field1531 = arg3;
        this.field1534 = arg4;
    }
}
