import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class6 extends class121 implements class391 {

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "()I", line = 3)
    public final int method49() {
        return super.method49();
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V", line = 6)
    public final void method50(int arg0, int arg1, int arg2) {
        this.field1614.field2253.glDrawElements(arg0, arg2, this.field88, (long) (this.field87 * arg1));
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[BI)V", line = 9)
    public final void method51(int arg0, byte[] arg1, int arg2) {
        this.method820(arg1, arg2);
        this.field88 = arg0;
        this.field87 = this.field1614.method1173(this.field88);
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "()V", line = 14)
    public final void method52() {
        this.field1614.method1163(this);
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lks;I[BIZ)V", line = 18)
    public class6(class173 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field88 = arg1;
        this.field87 = this.field1614.method1173(this.field88);
    }
}
