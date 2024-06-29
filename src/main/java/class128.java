import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class128 extends class68 {

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "[B")
    public byte[] field2260;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "Z")
    public boolean field2261;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lpd;)Lgj;")
    public final class128 method917(class149 arg0) {
        this.field2260 = arg0.method1060(this.field2260, 1);
        this.field2263 = arg0.method1058((byte) -118, this.field2263);
        if (this.field2262 == this.field2259) {
            this.field2262 = this.field2259 = arg0.method1059(false, this.field2262);
        } else {
            this.field2262 = arg0.method1059(false, this.field2262);
            this.field2259 = arg0.method1059(false, this.field2259);
            if (this.field2262 == this.field2259) {
                this.field2262--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(I[BII)V")
    public class128(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2263 = arg0;
        this.field2260 = arg1;
        this.field2262 = arg2;
        this.field2259 = arg3;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(I[BIIZ)V")
    public class128(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2263 = arg0;
        this.field2260 = arg1;
        this.field2262 = arg2;
        this.field2259 = arg3;
        this.field2261 = arg4;
    }
}
