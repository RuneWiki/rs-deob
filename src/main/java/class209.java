import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class209 extends class91 {

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "[B")
    public byte[] field3741;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public int field3745;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Z")
    public boolean field3742;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lad;)Lti;")
    public final class209 method1358(class5 arg0) {
        this.field3741 = arg0.method35(this.field3741, (byte) 84);
        this.field3743 = arg0.method33(true, this.field3743);
        if (this.field3745 == this.field3744) {
            this.field3745 = this.field3744 = arg0.method30(this.field3745, (byte) 43);
        } else {
            this.field3745 = arg0.method30(this.field3745, (byte) 43);
            this.field3744 = arg0.method30(this.field3744, (byte) 43);
            if (this.field3745 == this.field3744) {
                this.field3745--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BII)V")
    public class209(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3743 = arg0;
        this.field3741 = arg1;
        this.field3745 = arg2;
        this.field3744 = arg3;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BIIZ)V")
    public class209(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3743 = arg0;
        this.field3741 = arg1;
        this.field3745 = arg2;
        this.field3744 = arg3;
        this.field3742 = arg4;
    }
}
