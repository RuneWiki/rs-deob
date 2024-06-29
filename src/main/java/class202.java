import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class202 extends class89 implements class104 {

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    private int field3040;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
    public final void method587() {
        this.field1264.method2441(this);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public final void method654(int arg0, int arg1, int arg2) {
        this.field1264.field5783.glDrawElements(arg0, arg2, this.field3040, (long) (this.field3039 * arg1));
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()I")
    public final int method586() {
        return super.method586();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[BI)V")
    public final void method655(int arg0, byte[] arg1, int arg2) {
        this.method588(arg1, arg2);
        this.field3040 = arg0;
        this.field3039 = this.field1264.method2485(this.field3040);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lcg;I[BIZ)V")
    public class202(class393 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3040 = arg1;
        this.field3039 = this.field1264.method2485(this.field3040);
    }
}
