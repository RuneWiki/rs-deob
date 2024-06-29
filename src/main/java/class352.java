import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class352 extends class46 {

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[B")
    public byte[] field5088;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field5087;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Z")
    public boolean field5086;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lcl;)Lnd;")
    public final class352 method2199(class160 arg0) {
        this.field5088 = arg0.method997((byte) -114, this.field5088);
        this.field5085 = arg0.method993((byte) 87, this.field5085);
        if (this.field5089 == this.field5087) {
            this.field5089 = this.field5087 = arg0.method998(this.field5089, -1025);
        } else {
            this.field5089 = arg0.method998(this.field5089, -1025);
            this.field5087 = arg0.method998(this.field5087, -1025);
            if (this.field5089 == this.field5087) {
                this.field5089--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I[BII)V")
    public class352(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5085 = arg0;
        this.field5088 = arg1;
        this.field5089 = arg2;
        this.field5087 = arg3;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I[BIIZ)V")
    public class352(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5085 = arg0;
        this.field5088 = arg1;
        this.field5089 = arg2;
        this.field5087 = arg3;
        this.field5086 = arg4;
    }
}
