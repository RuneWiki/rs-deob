import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class33 extends class389 implements class366 {

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BI)V")
    public final void method351(int arg0, byte[] arg1, int arg2) {
        this.method2402(arg1, arg2);
        this.field529 = arg0;
        this.field530 = this.field5465.method261(this.field529);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
    public final void method352(int arg0, int arg1, int arg2) {
        this.field5465.field198.glDrawElements(arg0, arg2, this.field529, this.field5466.position(this.field530 * arg1));
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lhd;I[BI)V")
    public class33(class17 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field529 = arg1;
        this.field530 = this.field5465.method261(this.field529);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "()I")
    public final int method353() {
        return 0;
    }
}
