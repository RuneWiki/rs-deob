import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class286 extends class429 {

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "[B")
    public byte[] field3842;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "Z")
    public boolean field3840;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ltp;)Lnv;")
    public final class286 method1635(class371 arg0) {
        this.field3842 = arg0.method2149(-128, this.field3842);
        this.field3841 = arg0.method2150(1, this.field3841);
        if (this.field3839 == this.field3838) {
            this.field3839 = this.field3838 = arg0.method2148(this.field3839, -36);
        } else {
            this.field3839 = arg0.method2148(this.field3839, -36);
            this.field3838 = arg0.method2148(this.field3838, -82);
            if (this.field3839 == this.field3838) {
                this.field3839--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(I[BII)V")
    public class286(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3841 = arg0;
        this.field3842 = arg1;
        this.field3839 = arg2;
        this.field3838 = arg3;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(I[BIIZ)V")
    public class286(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3841 = arg0;
        this.field3842 = arg1;
        this.field3839 = arg2;
        this.field3838 = arg3;
        this.field3840 = arg4;
    }
}
