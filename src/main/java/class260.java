import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class260 extends class28 {

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "[B")
    public byte[] field3956;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "Z")
    public boolean field3958;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Laj;)Ljk;")
    public final class260 method1745(class48 arg0) {
        this.field3956 = arg0.method322((byte) 106, this.field3956);
        this.field3954 = arg0.method325(true, this.field3954);
        if (this.field3957 == this.field3955) {
            this.field3955 = this.field3957 = arg0.method318(this.field3955, (byte) -111);
        } else {
            this.field3955 = arg0.method318(this.field3955, (byte) -107);
            this.field3957 = arg0.method318(this.field3957, (byte) -122);
            if (this.field3957 == this.field3955) {
                this.field3955--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I[BII)V")
    public class260(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3954 = arg0;
        this.field3956 = arg1;
        this.field3955 = arg2;
        this.field3957 = arg3;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I[BIIZ)V")
    public class260(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3954 = arg0;
        this.field3956 = arg1;
        this.field3955 = arg2;
        this.field3957 = arg3;
        this.field3958 = arg4;
    }
}
