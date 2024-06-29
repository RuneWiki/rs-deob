import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class151 extends class297 implements class19 {

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    private int field1762;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public final void method513() {
        this.field3955.method2099(this);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
    public final void method117(int arg0, int arg1, int arg2) {
        this.field3955.field4363.glDrawElements(arg0, arg2, this.field1761, (long) (this.field1762 * arg1));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BI)V")
    public final void method116(int arg0, byte[] arg1, int arg2) {
        this.method1885(arg1, arg2);
        this.field1761 = arg0;
        this.field1762 = this.field3955.method2093(this.field1761);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lh;I[BIZ)V")
    public class151(class327 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field1761 = arg1;
        this.field1762 = this.field3955.method2093(this.field1761);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()I")
    public final int method49() {
        return super.method49();
    }
}
