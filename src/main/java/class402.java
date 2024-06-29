import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class402 extends class73 implements class196 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    private int field5683;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    private int field5684;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method433() {
        this.field900.method1953(this);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BI)V")
    public final void method930(int arg0, byte[] arg1, int arg2) {
        this.method435(arg1, arg2);
        this.field5683 = arg0;
        this.field5684 = this.field900.method1999(this.field5683);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
    public final void method929(int arg0, int arg1, int arg2) {
        this.field900.field4445.glDrawElements(arg0, arg2, this.field5683, (long) (this.field5684 * arg1));
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lmi;I[BIZ)V")
    public class402(class315 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5683 = arg1;
        this.field5684 = this.field900.method1999(this.field5683);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()I")
    public final int method434() {
        return super.method434();
    }
}
