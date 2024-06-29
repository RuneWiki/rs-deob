import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class198 extends class269 {

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[B")
    public byte[] field3475;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Z")
    public boolean field3472;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lni;)Lbd;", line = 6)
    public final class198 method1328(class55 arg0) {
        this.field3475 = arg0.method428(this.field3475, (byte) 42);
        this.field3474 = arg0.method430(this.field3474, 28971);
        if (this.field3476 == this.field3473) {
            this.field3473 = this.field3476 = arg0.method431(this.field3473, -25846);
        } else {
            this.field3473 = arg0.method431(this.field3473, -25846);
            this.field3476 = arg0.method431(this.field3476, -25846);
            if (this.field3476 == this.field3473) {
                this.field3473--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class198(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3474 = arg0;
        this.field3475 = arg1;
        this.field3473 = arg2;
        this.field3476 = arg3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class198(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3474 = arg0;
        this.field3475 = arg1;
        this.field3473 = arg2;
        this.field3476 = arg3;
        this.field3472 = arg4;
    }
}
