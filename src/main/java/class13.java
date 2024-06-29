import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class13 extends class205 {

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "[B")
    public byte[] field242;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Z")
    public boolean field243;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljf;)Lbb;")
    public final class13 method78(class87 arg0) {
        this.field242 = arg0.method694(this.field242, (byte) -68);
        this.field241 = arg0.method692(-104, this.field241);
        if (this.field244 == this.field240) {
            this.field244 = this.field240 = arg0.method691((byte) -21, this.field244);
        } else {
            this.field244 = arg0.method691((byte) -21, this.field244);
            this.field240 = arg0.method691((byte) -21, this.field240);
            if (this.field244 == this.field240) {
                this.field244--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I[BII)V")
    public class13(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field241 = arg0;
        this.field242 = arg1;
        this.field244 = arg2;
        this.field240 = arg3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I[BIIZ)V")
    public class13(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field241 = arg0;
        this.field242 = arg1;
        this.field244 = arg2;
        this.field240 = arg3;
        this.field243 = arg4;
    }
}
