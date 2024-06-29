import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class131 extends class16 {

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[B")
    public byte[] field2356;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public int field2357;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "Z")
    public boolean field2355;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lpf;)Lvh;")
    public final class131 method988(class216 arg0) {
        this.field2356 = arg0.method1497((byte) 60, this.field2356);
        this.field2354 = arg0.method1496(0, this.field2354);
        if (this.field2358 == this.field2357) {
            this.field2357 = this.field2358 = arg0.method1499(this.field2357, -65);
        } else {
            this.field2357 = arg0.method1499(this.field2357, -65);
            this.field2358 = arg0.method1499(this.field2358, -65);
            if (this.field2358 == this.field2357) {
                this.field2357--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I[BII)V")
    public class131(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2354 = arg0;
        this.field2356 = arg1;
        this.field2357 = arg2;
        this.field2358 = arg3;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I[BIIZ)V")
    public class131(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2354 = arg0;
        this.field2356 = arg1;
        this.field2357 = arg2;
        this.field2358 = arg3;
        this.field2355 = arg4;
    }
}
