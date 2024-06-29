import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class311 extends class221 implements class19 {

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    private int field4566;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    private int field4565;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
    public final int method139() {
        return super.method139();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
    public final void method140(int arg0, int arg1, int arg2) {
        this.field2910.field3634.glDrawElements(arg0, arg2, this.field4566, (long) (this.field4565 * arg1));
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lnf;I[BIZ)V")
    public class311(class256 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4566 = arg1;
        this.field4565 = this.field2910.method1658(this.field4566);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[BI)V")
    public final void method141(int arg0, byte[] arg1, int arg2) {
        this.method1288(arg1, arg2);
        this.field4566 = arg0;
        this.field4565 = this.field2910.method1658(this.field4566);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
    public final void method1289() {
        this.field2910.method1738(this);
    }
}
