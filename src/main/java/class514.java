import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class514 extends class373 {

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public int field7232;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[B")
    public byte[] field7229;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field7233;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field7231;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Z")
    public boolean field7230;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lii;)Lke;")
    public final class514 method2975(class474 arg0) {
        this.field7229 = arg0.method2751(-26, this.field7229);
        this.field7232 = arg0.method2755((byte) 100, this.field7232);
        if (this.field7233 == this.field7231) {
            this.field7233 = this.field7231 = arg0.method2753(15408, this.field7233);
        } else {
            this.field7233 = arg0.method2753(15408, this.field7233);
            this.field7231 = arg0.method2753(15408, this.field7231);
            if (this.field7233 == this.field7231) {
                this.field7233--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BII)V")
    public class514(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field7232 = arg0;
        this.field7229 = arg1;
        this.field7233 = arg2;
        this.field7231 = arg3;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BIIZ)V")
    public class514(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field7232 = arg0;
        this.field7229 = arg1;
        this.field7233 = arg2;
        this.field7231 = arg3;
        this.field7230 = arg4;
    }
}
