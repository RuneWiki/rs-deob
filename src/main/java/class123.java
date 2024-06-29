import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 extends class37 {

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[B")
    public byte[] field2696;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Z")
    public boolean field2699;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpb;)Lre;")
    public final class123 method939(class106 arg0) {
        this.field2696 = arg0.method762((byte) -122, this.field2696);
        this.field2698 = arg0.method758(this.field2698, true);
        if (this.field2700 == this.field2697) {
            this.field2700 = this.field2697 = arg0.method759(this.field2700, 6);
        } else {
            this.field2700 = arg0.method759(this.field2700, 6);
            this.field2697 = arg0.method759(this.field2697, 6);
            if (this.field2700 == this.field2697) {
                this.field2700--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I[BII)V")
    public class123(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2698 = arg0;
        this.field2696 = arg1;
        this.field2700 = arg2;
        this.field2697 = arg3;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I[BIIZ)V")
    public class123(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2698 = arg0;
        this.field2696 = arg1;
        this.field2700 = arg2;
        this.field2697 = arg3;
        this.field2699 = arg4;
    }
}
