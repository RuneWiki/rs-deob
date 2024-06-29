import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class116 extends class23 {

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "[B")
    public byte[] field2602;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "Z")
    public boolean field2606;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lcf;)Lr;")
    public final class116 method929(class21 arg0) {
        this.field2602 = arg0.method192(this.field2602, (byte) -82);
        this.field2603 = arg0.method197(false, this.field2603);
        if (this.field2605 == this.field2604) {
            this.field2604 = this.field2605 = arg0.method200(this.field2604, 1);
        } else {
            this.field2604 = arg0.method200(this.field2604, 1);
            this.field2605 = arg0.method200(this.field2605, 1);
            if (this.field2605 == this.field2604) {
                this.field2604--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I[BII)V")
    public class116(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2603 = arg0;
        this.field2602 = arg1;
        this.field2604 = arg2;
        this.field2605 = arg3;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I[BIIZ)V")
    public class116(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2603 = arg0;
        this.field2602 = arg1;
        this.field2604 = arg2;
        this.field2605 = arg3;
        this.field2606 = arg4;
    }
}
