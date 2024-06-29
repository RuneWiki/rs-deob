import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class300 extends class366 {

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "[B")
    public byte[] field3913;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Z")
    public boolean field3910;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lbj;)Lti;")
    public final class300 method1836(class440 arg0) {
        this.field3913 = arg0.method2560(this.field3913, true);
        this.field3911 = arg0.method2558(this.field3911, 7033);
        if (this.field3912 == this.field3909) {
            this.field3912 = this.field3909 = arg0.method2557(this.field3912, -7);
        } else {
            this.field3912 = arg0.method2557(this.field3912, -7);
            this.field3909 = arg0.method2557(this.field3909, -7);
            if (this.field3912 == this.field3909) {
                this.field3912--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BII)V")
    public class300(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3911 = arg0;
        this.field3913 = arg1;
        this.field3912 = arg2;
        this.field3909 = arg3;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BIIZ)V")
    public class300(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3911 = arg0;
        this.field3913 = arg1;
        this.field3912 = arg2;
        this.field3909 = arg3;
        this.field3910 = arg4;
    }
}
