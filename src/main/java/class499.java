import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class499 extends class7 {

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[B")
    public byte[] field7062;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public int field7061;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public int field7063;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Z")
    public boolean field7065;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lcb;)Lcj;", line = 7)
    public final class499 method2896(class367 arg0) {
        this.field7062 = arg0.method2165(this.field7062, -128);
        this.field7064 = arg0.method2167(-128, this.field7064);
        if (this.field7063 == this.field7061) {
            this.field7061 = this.field7063 = arg0.method2164(this.field7061, -22069);
        } else {
            this.field7061 = arg0.method2164(this.field7061, -22069);
            this.field7063 = arg0.method2164(this.field7063, -22069);
            if (this.field7063 == this.field7061) {
                this.field7061--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class499(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field7064 = arg0;
        this.field7062 = arg1;
        this.field7061 = arg2;
        this.field7063 = arg3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class499(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field7064 = arg0;
        this.field7062 = arg1;
        this.field7061 = arg2;
        this.field7063 = arg3;
        this.field7065 = arg4;
    }
}
