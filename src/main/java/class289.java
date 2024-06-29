import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class289 extends class434 implements class407 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    private int field4399;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    private int field4398;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
    public final int method114() {
        return 0;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lnm;I[BI)V")
    public class289(class254 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4399 = arg1;
        this.field4398 = this.field6162.method1642(this.field4399);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final void method1529(int arg0, int arg1, int arg2) {
        this.field6162.field3648.glDrawElements(arg0, arg2, this.field4399, this.field6161.position(this.field4398 * arg1));
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BI)V")
    public final void method1528(int arg0, byte[] arg1, int arg2) {
        this.method2538(arg1, arg2);
        this.field4399 = arg0;
        this.field4398 = this.field6162.method1642(this.field4399);
    }
}
