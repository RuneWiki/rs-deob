import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class194 extends class202 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "[B")
    public byte[] field3547;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Z")
    public boolean field3548;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lsi;)Lcl;")
    public final class194 method1388(class198 arg0) {
        this.field3547 = arg0.method1421((byte) -33, this.field3547);
        this.field3545 = arg0.method1424(14, this.field3545);
        if (this.field3546 == this.field3544) {
            this.field3546 = this.field3544 = arg0.method1420(this.field3546, -15);
        } else {
            this.field3546 = arg0.method1420(this.field3546, -15);
            this.field3544 = arg0.method1420(this.field3544, -15);
            if (this.field3546 == this.field3544) {
                this.field3546--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I[BII)V")
    public class194(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3545 = arg0;
        this.field3547 = arg1;
        this.field3546 = arg2;
        this.field3544 = arg3;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I[BIIZ)V")
    public class194(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3545 = arg0;
        this.field3547 = arg1;
        this.field3546 = arg2;
        this.field3544 = arg3;
        this.field3548 = arg4;
    }
}
