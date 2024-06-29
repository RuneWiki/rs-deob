import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class223 extends class86 implements class313 {

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    private int field2980;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    private int field2979;

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lql;I[BIZ)V")
    public class223(class346 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2980 = arg1;
        this.field2979 = this.field959.method2089(this.field2980);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I[BI)V")
    public final void method791(int arg0, byte[] arg1, int arg2) {
        this.method470(arg1, arg2);
        this.field2980 = arg0;
        this.field2979 = this.field959.method2089(this.field2980);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
    public final void method790(int arg0, int arg1, int arg2) {
        this.field959.field4697.glDrawElements(arg0, arg2, this.field2980, (long) (this.field2979 * arg1));
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "()V")
    public final void method469() {
        this.field959.method2055(this);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()I")
    public final int method225() {
        return super.method225();
    }
}
