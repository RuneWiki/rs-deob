import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class443 extends class306 implements class377 {

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    private int field6223;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    private int field6224;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "()V")
    public final void method574() {
        this.field4157.method2178(this);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "()I")
    public final int method578() {
        return super.method578();
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I[BI)V")
    public final void method1531(int arg0, byte[] arg1, int arg2) {
        this.method1847(arg1, arg2);
        this.field6223 = arg0;
        this.field6224 = this.field4157.method2190(this.field6223);
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lmm;I[BIZ)V")
    public class443(class357 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6223 = arg1;
        this.field6224 = this.field4157.method2190(this.field6223);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V")
    public final void method1532(int arg0, int arg1, int arg2) {
        this.field4157.field4794.glDrawElements(arg0, arg2, this.field6223, (long) (this.field6224 * arg1));
    }
}
