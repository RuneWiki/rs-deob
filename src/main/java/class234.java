import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class234 extends class438 implements class407 {

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    private int field3420;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    private int field3421;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[BI)V", line = 3)
    public final void method1528(int arg0, byte[] arg1, int arg2) {
        this.method2550(arg1, arg2);
        this.field3420 = arg0;
        this.field3421 = this.field6185.method1642(this.field3420);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()V", line = 8)
    public final void method871() {
        this.field6185.method1655(this);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lnm;I[BIZ)V", line = 12)
    public class234(class254 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3420 = arg1;
        this.field3421 = this.field6185.method1642(this.field3420);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 17)
    public final void method1529(int arg0, int arg1, int arg2) {
        this.field6185.field3648.glDrawElements(arg0, arg2, this.field3420, (long) (this.field3421 * arg1));
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I", line = 20)
    public final int method114() {
        return super.method114();
    }
}
