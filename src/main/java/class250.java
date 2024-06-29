import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class250 extends class288 {

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "[B")
    public byte[] field3871;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Z")
    public boolean field3875;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Leb;)Lmm;", line = 7)
    public final class250 method1677(class578 arg0) {
        this.field3871 = arg0.method3285(this.field3871, 100);
        this.field3872 = arg0.method3288(34, this.field3872);
        if (this.field3874 == this.field3873) {
            this.field3873 = this.field3874 = arg0.method3283(this.field3873, 2292);
        } else {
            this.field3873 = arg0.method3283(this.field3873, 2292);
            this.field3874 = arg0.method3283(this.field3874, 2292);
            if (this.field3874 == this.field3873) {
                this.field3873--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class250(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3872 = arg0;
        this.field3871 = arg1;
        this.field3873 = arg2;
        this.field3874 = arg3;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class250(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3872 = arg0;
        this.field3871 = arg1;
        this.field3873 = arg2;
        this.field3874 = arg3;
        this.field3875 = arg4;
    }
}
