import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class548 extends class130 {

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public int field7872;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "[B")
    public byte[] field7873;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public int field7875;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public int field7871;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "Z")
    public boolean field7874;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lgfa;)Lcba;")
    public final class548 method3221(class748 arg0) {
        this.field7873 = arg0.method4156(this.field7873, true);
        this.field7872 = arg0.method4159(this.field7872, (byte) -117);
        if (this.field7875 == this.field7871) {
            this.field7875 = this.field7871 = arg0.method4158(true, this.field7875);
        } else {
            this.field7875 = arg0.method4158(true, this.field7875);
            this.field7871 = arg0.method4158(true, this.field7871);
            if (this.field7875 == this.field7871) {
                this.field7875--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(I[BII)V")
    public class548(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field7872 = arg0;
        this.field7873 = arg1;
        this.field7875 = arg2;
        this.field7871 = arg3;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(I[BIIZ)V")
    public class548(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field7872 = arg0;
        this.field7873 = arg1;
        this.field7875 = arg2;
        this.field7871 = arg3;
        this.field7874 = arg4;
    }
}
