import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class319 extends class280 {

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "[B")
    public byte[] field4575;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public int field4576;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public int field4573;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "Z")
    public boolean field4572;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ltm;)Lnq;", line = 3)
    public final class319 method1989(class264 arg0) {
        this.field4575 = arg0.method1754(-31851, this.field4575);
        this.field4574 = arg0.method1755(this.field4574, 127);
        if (this.field4576 == this.field4573) {
            this.field4576 = this.field4573 = arg0.method1753(this.field4576, (byte) 100);
        } else {
            this.field4576 = arg0.method1753(this.field4576, (byte) 62);
            this.field4573 = arg0.method1753(this.field4573, (byte) 68);
            if (this.field4576 == this.field4573) {
                this.field4576--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class319(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4574 = arg0;
        this.field4575 = arg1;
        this.field4576 = arg2;
        this.field4573 = arg3;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class319(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4574 = arg0;
        this.field4575 = arg1;
        this.field4576 = arg2;
        this.field4573 = arg3;
        this.field4572 = arg4;
    }
}
