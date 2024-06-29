import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class189 extends class192 {

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "[B")
    public byte[] field2825;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "Z")
    public boolean field2827;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lod;)Lbq;")
    public final class189 method1324(class348 arg0) {
        this.field2825 = arg0.method2213((byte) -57, this.field2825);
        this.field2828 = arg0.method2209(-23, this.field2828);
        if (this.field2826 == this.field2824) {
            this.field2826 = this.field2824 = arg0.method2212(this.field2826, (byte) -124);
        } else {
            this.field2826 = arg0.method2212(this.field2826, (byte) 48);
            this.field2824 = arg0.method2212(this.field2824, (byte) -123);
            if (this.field2826 == this.field2824) {
                this.field2826--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I[BII)V")
    public class189(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2828 = arg0;
        this.field2825 = arg1;
        this.field2826 = arg2;
        this.field2824 = arg3;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I[BIIZ)V")
    public class189(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2828 = arg0;
        this.field2825 = arg1;
        this.field2826 = arg2;
        this.field2824 = arg3;
        this.field2827 = arg4;
    }
}
