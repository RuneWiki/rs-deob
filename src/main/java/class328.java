import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class328 extends class152 {

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "[B")
    public byte[] field4922;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public int field4924;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Z")
    public boolean field4921;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqq;)Luk;")
    public final class328 method2015(class459 arg0) {
        this.field4922 = arg0.method2715(-21384, this.field4922);
        this.field4923 = arg0.method2713(this.field4923, 62);
        if (this.field4925 == this.field4924) {
            this.field4925 = this.field4924 = arg0.method2714((byte) 42, this.field4925);
        } else {
            this.field4925 = arg0.method2714((byte) 109, this.field4925);
            this.field4924 = arg0.method2714((byte) 62, this.field4924);
            if (this.field4925 == this.field4924) {
                this.field4925--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I[BII)V")
    public class328(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4923 = arg0;
        this.field4922 = arg1;
        this.field4925 = arg2;
        this.field4924 = arg3;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I[BIIZ)V")
    public class328(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4923 = arg0;
        this.field4922 = arg1;
        this.field4925 = arg2;
        this.field4924 = arg3;
        this.field4921 = arg4;
    }
}
