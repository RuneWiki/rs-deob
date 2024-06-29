import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class630 extends class313 {

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public int field9081;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[B")
    public byte[] field9079;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field9078;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field9080;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Z")
    public boolean field9082;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lit;)Lee;")
    public final class630 method3603(class600 arg0) {
        this.field9079 = arg0.method3428((byte) -126, this.field9079);
        this.field9081 = arg0.method3429(this.field9081, true);
        if (this.field9080 == this.field9078) {
            this.field9078 = this.field9080 = arg0.method3427(this.field9078, 6);
        } else {
            this.field9078 = arg0.method3427(this.field9078, 6);
            this.field9080 = arg0.method3427(this.field9080, 6);
            if (this.field9080 == this.field9078) {
                this.field9078--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I[BII)V")
    public class630(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field9081 = arg0;
        this.field9079 = arg1;
        this.field9078 = arg2;
        this.field9080 = arg3;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I[BIIZ)V")
    public class630(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field9081 = arg0;
        this.field9079 = arg1;
        this.field9078 = arg2;
        this.field9080 = arg3;
        this.field9082 = arg4;
    }
}
