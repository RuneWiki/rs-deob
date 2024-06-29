import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class261 extends class349 implements class366 {

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    private int field3514;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    private int field3513;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V", line = 4)
    public final void method352(int arg0, int arg1, int arg2) {
        this.field4727.field198.glDrawElements(arg0, arg2, this.field3514, (long) (this.field3513 * arg1));
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "()V", line = 8)
    public final void method825() {
        this.field4727.method205(this);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()I", line = 11)
    public final int method353() {
        return super.method353();
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[BI)V", line = 14)
    public final void method351(int arg0, byte[] arg1, int arg2) {
        this.method2203(arg1, arg2);
        this.field3514 = arg0;
        this.field3513 = this.field4727.method261(this.field3514);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lhd;I[BIZ)V", line = 19)
    public class261(class17 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3514 = arg1;
        this.field3513 = this.field4727.method261(this.field3514);
    }
}
