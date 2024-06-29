import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class437 extends class193 implements class292 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    private int field6237;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    private int field6238;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public final void method1979(int arg0, int arg1, int arg2) {
        this.field2789.field1918.glDrawElements(arg0, arg2, this.field6237, this.field2788.position(this.field6238 * arg1));
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[BI)V")
    public final void method1980(int arg0, byte[] arg1, int arg2) {
        this.method1386(arg1, arg2);
        this.field6237 = arg0;
        this.field6238 = this.field2789.method1015(this.field6237);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()I")
    public final int method34() {
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lig;I[BI)V")
    public class437(class132 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6237 = arg1;
        this.field6238 = this.field2789.method1015(this.field6237);
    }
}
