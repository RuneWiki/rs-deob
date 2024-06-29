import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class182 extends class127 {

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "[B")
    public byte[] field2973;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Z")
    public boolean field2974;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lpf;)Lqd;", line = 4)
    public final class182 method1292(class303 arg0) {
        this.field2973 = arg0.method2045(this.field2973, (byte) 74);
        this.field2970 = arg0.method2044(this.field2970, 153068674);
        if (this.field2972 == this.field2971) {
            this.field2972 = this.field2971 = arg0.method2042(this.field2972, (byte) -66);
        } else {
            this.field2972 = arg0.method2042(this.field2972, (byte) -66);
            this.field2971 = arg0.method2042(this.field2971, (byte) -66);
            if (this.field2972 == this.field2971) {
                this.field2972--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class182(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2970 = arg0;
        this.field2973 = arg1;
        this.field2972 = arg2;
        this.field2971 = arg3;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class182(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2970 = arg0;
        this.field2973 = arg1;
        this.field2972 = arg2;
        this.field2971 = arg3;
        this.field2974 = arg4;
    }
}
