import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class343 extends class210 {

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "[B")
    public byte[] field5386;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public int field5389;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "Z")
    public boolean field5390;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lbf;)Luq;")
    public final class343 method2200(class504 arg0) {
        this.field5386 = arg0.method3012(this.field5386, (byte) 94);
        this.field5388 = arg0.method3013(this.field5388, 93);
        if (this.field5389 == this.field5387) {
            this.field5387 = this.field5389 = arg0.method3014(this.field5387, 31384);
        } else {
            this.field5387 = arg0.method3014(this.field5387, 31384);
            this.field5389 = arg0.method3014(this.field5389, 31384);
            if (this.field5389 == this.field5387) {
                this.field5387--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(I[BII)V")
    public class343(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5388 = arg0;
        this.field5386 = arg1;
        this.field5387 = arg2;
        this.field5389 = arg3;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(I[BIIZ)V")
    public class343(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5388 = arg0;
        this.field5386 = arg1;
        this.field5387 = arg2;
        this.field5389 = arg3;
        this.field5390 = arg4;
    }
}
