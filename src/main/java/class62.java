import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class62 extends class230 implements class163 {

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    private int field722;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    private int field723;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "()I")
    public final int method380() {
        return super.method380();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
    public final void method381(int arg0, int arg1, int arg2) {
        this.field3122.field4752.glDrawElements(arg0, arg2, this.field722, (long) (this.field723 * arg1));
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BI)V")
    public final void method382(int arg0, byte[] arg1, int arg2) {
        this.method1473(arg1, arg2);
        this.field722 = arg0;
        this.field723 = this.field3122.method2128(this.field722);
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "()V")
    public final void method383() {
        this.field3122.method2120(this);
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lpo;I[BIZ)V")
    public class62(class332 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field722 = arg1;
        this.field723 = this.field3122.method2128(this.field722);
    }
}
