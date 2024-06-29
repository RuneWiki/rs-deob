import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class135 extends class207 {

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[B")
    public byte[] field2454;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Z")
    public boolean field2451;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljb;)Lmg;")
    public final class135 method827(class99 arg0) {
        this.field2454 = arg0.method609(this.field2454, (byte) -124);
        this.field2452 = arg0.method613(this.field2452, (byte) 34);
        if (this.field2455 == this.field2453) {
            this.field2453 = this.field2455 = arg0.method608((byte) 11, this.field2453);
        } else {
            this.field2453 = arg0.method608((byte) 11, this.field2453);
            this.field2455 = arg0.method608((byte) 11, this.field2455);
            if (this.field2455 == this.field2453) {
                this.field2453--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I[BII)V")
    public class135(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2452 = arg0;
        this.field2454 = arg1;
        this.field2453 = arg2;
        this.field2455 = arg3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I[BIIZ)V")
    public class135(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2452 = arg0;
        this.field2454 = arg1;
        this.field2453 = arg2;
        this.field2455 = arg3;
        this.field2451 = arg4;
    }
}
