import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class244 extends class32 {

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "[B")
    public byte[] field4230;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Z")
    public boolean field4232;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lwk;)Ltd;", line = 4)
    public final class244 method1684(class177 arg0) {
        this.field4230 = arg0.method1255(-127, this.field4230);
        this.field4229 = arg0.method1254((byte) -1, this.field4229);
        if (this.field4233 == this.field4231) {
            this.field4231 = this.field4233 = arg0.method1248((byte) -116, this.field4231);
        } else {
            this.field4231 = arg0.method1248((byte) -116, this.field4231);
            this.field4233 = arg0.method1248((byte) -116, this.field4233);
            if (this.field4233 == this.field4231) {
                this.field4231--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class244(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4229 = arg0;
        this.field4230 = arg1;
        this.field4231 = arg2;
        this.field4233 = arg3;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class244(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4229 = arg0;
        this.field4230 = arg1;
        this.field4231 = arg2;
        this.field4233 = arg3;
        this.field4232 = arg4;
    }
}
