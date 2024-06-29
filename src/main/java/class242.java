import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class242 extends class123 {

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "[B")
    public byte[] field3400;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public int field3403;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
    public boolean field3402;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lnm;)Ljp;", line = 6)
    public final class242 method1588(class335 arg0) {
        this.field3400 = arg0.method2165(-81, this.field3400);
        this.field3401 = arg0.method2163(this.field3401, false);
        if (this.field3403 == this.field3399) {
            this.field3399 = this.field3403 = arg0.method2170(6, this.field3399);
        } else {
            this.field3399 = arg0.method2170(6, this.field3399);
            this.field3403 = arg0.method2170(6, this.field3403);
            if (this.field3403 == this.field3399) {
                this.field3399--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class242(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3401 = arg0;
        this.field3400 = arg1;
        this.field3399 = arg2;
        this.field3403 = arg3;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class242(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3401 = arg0;
        this.field3400 = arg1;
        this.field3399 = arg2;
        this.field3403 = arg3;
        this.field3402 = arg4;
    }
}
