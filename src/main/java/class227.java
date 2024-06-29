import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class227 extends class257 {

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "[B")
    public byte[] field3818;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Z")
    public boolean field3822;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(La;)Ltd;", line = 4)
    public final class227 method1664(class259 arg0) {
        this.field3818 = arg0.method1848(13, this.field3818);
        this.field3819 = arg0.method1846((byte) 66, this.field3819);
        if (this.field3821 == this.field3820) {
            this.field3821 = this.field3820 = arg0.method1847(6, this.field3821);
        } else {
            this.field3821 = arg0.method1847(6, this.field3821);
            this.field3820 = arg0.method1847(6, this.field3820);
            if (this.field3821 == this.field3820) {
                this.field3821--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class227(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3819 = arg0;
        this.field3818 = arg1;
        this.field3821 = arg2;
        this.field3820 = arg3;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class227(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3819 = arg0;
        this.field3818 = arg1;
        this.field3821 = arg2;
        this.field3820 = arg3;
        this.field3822 = arg4;
    }
}
