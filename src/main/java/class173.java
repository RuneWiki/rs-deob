import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class173 extends class46 {

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "[B")
    public byte[] field2451;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Z")
    public boolean field2452;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lwd;)Lqm;")
    public final class173 method1098(class161 arg0) {
        this.field2451 = arg0.method998(this.field2451, (byte) -116);
        this.field2454 = arg0.method1000(this.field2454, -11694);
        if (this.field2455 == this.field2453) {
            this.field2453 = this.field2455 = arg0.method1001(this.field2453, (byte) -93);
        } else {
            this.field2453 = arg0.method1001(this.field2453, (byte) -34);
            this.field2455 = arg0.method1001(this.field2455, (byte) -128);
            if (this.field2455 == this.field2453) {
                this.field2453--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(I[BII)V")
    public class173(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2454 = arg0;
        this.field2451 = arg1;
        this.field2453 = arg2;
        this.field2455 = arg3;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(I[BIIZ)V")
    public class173(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2454 = arg0;
        this.field2451 = arg1;
        this.field2453 = arg2;
        this.field2455 = arg3;
        this.field2452 = arg4;
    }
}
