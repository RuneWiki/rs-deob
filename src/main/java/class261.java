import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class261 extends class223 {

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "[B")
    public byte[] field4523;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Z")
    public boolean field4519;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lch;)Loh;")
    public final class261 method1735(class148 arg0) {
        this.field4523 = arg0.method997(-114, this.field4523);
        this.field4522 = arg0.method1001(false, this.field4522);
        if (this.field4521 == this.field4520) {
            this.field4521 = this.field4520 = arg0.method998(true, this.field4521);
        } else {
            this.field4521 = arg0.method998(true, this.field4521);
            this.field4520 = arg0.method998(true, this.field4520);
            if (this.field4521 == this.field4520) {
                this.field4521--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I[BII)V")
    public class261(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4522 = arg0;
        this.field4523 = arg1;
        this.field4521 = arg2;
        this.field4520 = arg3;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I[BIIZ)V")
    public class261(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4522 = arg0;
        this.field4523 = arg1;
        this.field4521 = arg2;
        this.field4520 = arg3;
        this.field4519 = arg4;
    }
}
