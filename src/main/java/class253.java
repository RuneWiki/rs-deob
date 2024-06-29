import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class253 extends class178 {

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "[B")
    public byte[] field4232;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Z")
    public boolean field4231;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lah;)Lid;", line = 5)
    public final class253 method1847(class200 arg0) {
        this.field4232 = arg0.method1537(this.field4232, true);
        this.field4230 = arg0.method1535(this.field4230, 31);
        if (this.field4229 == this.field4228) {
            this.field4228 = this.field4229 = arg0.method1538(this.field4228, (byte) 99);
        } else {
            this.field4228 = arg0.method1538(this.field4228, (byte) 99);
            this.field4229 = arg0.method1538(this.field4229, (byte) 99);
            if (this.field4229 == this.field4228) {
                this.field4228--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class253(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4230 = arg0;
        this.field4232 = arg1;
        this.field4228 = arg2;
        this.field4229 = arg3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class253(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4230 = arg0;
        this.field4232 = arg1;
        this.field4228 = arg2;
        this.field4229 = arg3;
        this.field4231 = arg4;
    }
}
