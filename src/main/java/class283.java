import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class283 extends class305 implements class217 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    private int field4142;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lih;I[BI)V")
    public class283(class330 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4142 = arg1;
        this.field4141 = this.field4361.method2124(this.field4142);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
    public final int method90() {
        return 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    public final void method1355(int arg0, int arg1, int arg2) {
        this.field4361.field4741.glDrawElements(arg0, arg2, this.field4142, this.field4362.position(this.field4141 * arg1));
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BI)V")
    public final void method1354(int arg0, byte[] arg1, int arg2) {
        this.method1921(arg1, arg2);
        this.field4142 = arg0;
        this.field4141 = this.field4361.method2124(this.field4142);
    }
}
