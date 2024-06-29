import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class285 extends class35 {

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[B")
    public byte[] field4512;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "Z")
    public boolean field4514;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leg;)Lah;")
    public final class285 method1914(class232 arg0) {
        this.field4512 = arg0.method1554(this.field4512, (byte) -122);
        this.field4510 = arg0.method1557((byte) -111, this.field4510);
        if (this.field4513 == this.field4511) {
            this.field4511 = this.field4513 = arg0.method1553(this.field4511, (byte) -92);
        } else {
            this.field4511 = arg0.method1553(this.field4511, (byte) -108);
            this.field4513 = arg0.method1553(this.field4513, (byte) -124);
            if (this.field4513 == this.field4511) {
                this.field4511--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I[BII)V")
    public class285(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4510 = arg0;
        this.field4512 = arg1;
        this.field4511 = arg2;
        this.field4513 = arg3;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I[BIIZ)V")
    public class285(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4510 = arg0;
        this.field4512 = arg1;
        this.field4511 = arg2;
        this.field4513 = arg3;
        this.field4514 = arg4;
    }
}
