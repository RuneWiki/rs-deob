import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class259 extends class120 {

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "[B")
    public byte[] field3850;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Z")
    public boolean field3849;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Leg;)Lik;", line = 6)
    public final class259 method1798(class302 arg0) {
        this.field3850 = arg0.method2112(-6443, this.field3850);
        this.field3848 = arg0.method2116(this.field3848, (byte) -103);
        if (this.field3851 == this.field3847) {
            this.field3847 = this.field3851 = arg0.method2110(this.field3847, (byte) 116);
        } else {
            this.field3847 = arg0.method2110(this.field3847, (byte) 116);
            this.field3851 = arg0.method2110(this.field3851, (byte) 116);
            if (this.field3851 == this.field3847) {
                this.field3847--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class259(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3848 = arg0;
        this.field3850 = arg1;
        this.field3847 = arg2;
        this.field3851 = arg3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class259(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3848 = arg0;
        this.field3850 = arg1;
        this.field3847 = arg2;
        this.field3851 = arg3;
        this.field3849 = arg4;
    }
}
