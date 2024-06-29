import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class225 extends class80 {

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "[B")
    public byte[] field3516;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
    public boolean field3518;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lrj;)Lqj;", line = 7)
    public final class225 method1686(class262 arg0) {
        this.field3516 = arg0.method1927(true, this.field3516);
        this.field3515 = arg0.method1925(110, this.field3515);
        if (this.field3517 == this.field3514) {
            this.field3517 = this.field3514 = arg0.method1926(this.field3517, 24);
        } else {
            this.field3517 = arg0.method1926(this.field3517, 14);
            this.field3514 = arg0.method1926(this.field3514, 19);
            if (this.field3517 == this.field3514) {
                this.field3517--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class225(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3515 = arg0;
        this.field3516 = arg1;
        this.field3517 = arg2;
        this.field3514 = arg3;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class225(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3515 = arg0;
        this.field3516 = arg1;
        this.field3517 = arg2;
        this.field3514 = arg3;
        this.field3518 = arg4;
    }
}
