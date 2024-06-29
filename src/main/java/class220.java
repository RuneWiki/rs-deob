import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class220 extends class41 {

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "[B")
    public byte[] field3788;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Z")
    public boolean field3789;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lti;)Lkh;")
    public final class220 method1452(class92 arg0) {
        this.field3788 = arg0.method614(this.field3788, 107);
        this.field3790 = arg0.method613(124, this.field3790);
        if (this.field3791 == this.field3787) {
            this.field3791 = this.field3787 = arg0.method608((byte) -47, this.field3791);
        } else {
            this.field3791 = arg0.method608((byte) -47, this.field3791);
            this.field3787 = arg0.method608((byte) -47, this.field3787);
            if (this.field3791 == this.field3787) {
                this.field3791--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I[BII)V")
    public class220(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3790 = arg0;
        this.field3788 = arg1;
        this.field3791 = arg2;
        this.field3787 = arg3;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I[BIIZ)V")
    public class220(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3790 = arg0;
        this.field3788 = arg1;
        this.field3791 = arg2;
        this.field3787 = arg3;
        this.field3789 = arg4;
    }
}
