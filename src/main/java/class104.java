import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 extends class50 {

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "[B")
    public byte[] field2519;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Z")
    public boolean field2517;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lmb;)Lp;")
    public final class104 method816(class85 arg0) {
        this.field2519 = arg0.method699((byte) 118, this.field2519);
        this.field2518 = arg0.method701(this.field2518, 5641);
        if (this.field2520 == this.field2516) {
            this.field2516 = this.field2520 = arg0.method702(this.field2516, -49);
        } else {
            this.field2516 = arg0.method702(this.field2516, 52);
            this.field2520 = arg0.method702(this.field2520, 22);
            if (this.field2520 == this.field2516) {
                this.field2516--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I[BII)V")
    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2518 = arg0;
        this.field2519 = arg1;
        this.field2516 = arg2;
        this.field2520 = arg3;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I[BIIZ)V")
    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2518 = arg0;
        this.field2519 = arg1;
        this.field2516 = arg2;
        this.field2520 = arg3;
        this.field2517 = arg4;
    }
}
