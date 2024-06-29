import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class107 extends class212 {

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "[B")
    public byte[] field1926;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Z")
    public boolean field1922;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lie;)Lbj;")
    public final class107 method800(class18 arg0) {
        this.field1926 = arg0.method136(this.field1926, -123);
        this.field1924 = arg0.method138(this.field1924, false);
        if (this.field1925 == this.field1923) {
            this.field1923 = this.field1925 = arg0.method135(this.field1923, (byte) -62);
        } else {
            this.field1923 = arg0.method135(this.field1923, (byte) -62);
            this.field1925 = arg0.method135(this.field1925, (byte) -62);
            if (this.field1925 == this.field1923) {
                this.field1923--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I[BII)V")
    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1924 = arg0;
        this.field1926 = arg1;
        this.field1923 = arg2;
        this.field1925 = arg3;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I[BIIZ)V")
    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1924 = arg0;
        this.field1926 = arg1;
        this.field1923 = arg2;
        this.field1925 = arg3;
        this.field1922 = arg4;
    }
}
