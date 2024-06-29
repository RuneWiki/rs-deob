import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class194 extends class163 implements class259 {

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public final void method977(int arg0, int arg1, int arg2) {
        this.field2460.field1604.glDrawElements(arg0, arg2, this.field2856, (long) (this.field2857 * arg1));
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lge;I[BIZ)V")
    public class194(class104 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2856 = arg1;
        this.field2857 = this.field2460.method886(this.field2856);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BI)V")
    public final void method979(int arg0, byte[] arg1, int arg2) {
        this.method1268(arg1, arg2);
        this.field2856 = arg0;
        this.field2857 = this.field2460.method886(this.field2856);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
    public final void method1267() {
        this.field2460.method873(this);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
    public final int method978() {
        return super.method978();
    }
}
