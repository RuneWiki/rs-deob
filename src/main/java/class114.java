import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class114 extends class67 implements class259 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    private int field1826;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    private int field1825;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public final void method977(int arg0, int arg1, int arg2) {
        this.field1118.field1604.glDrawElements(arg0, arg2, this.field1826, this.field1117.position(this.field1825 * arg1));
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
    public final int method978() {
        return 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[BI)V")
    public final void method979(int arg0, byte[] arg1, int arg2) {
        this.method507(arg1, arg2);
        this.field1826 = arg0;
        this.field1825 = this.field1118.method886(this.field1826);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lge;I[BI)V")
    public class114(class104 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1826 = arg1;
        this.field1825 = this.field1118.method886(this.field1826);
    }
}
