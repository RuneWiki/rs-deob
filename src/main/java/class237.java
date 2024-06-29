import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class237 extends class199 implements class104 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    private int field3546;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public final void method654(int arg0, int arg1, int arg2) {
        this.field3009.field5783.glDrawElements(arg0, arg2, this.field3546, this.field3008.position(this.field3545 * arg1));
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[BI)V")
    public final void method655(int arg0, byte[] arg1, int arg2) {
        this.method1194(arg1, arg2);
        this.field3546 = arg0;
        this.field3545 = this.field3009.method2485(this.field3546);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
    public final int method586() {
        return 0;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lcg;I[BI)V")
    public class237(class393 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3546 = arg1;
        this.field3545 = this.field3009.method2485(this.field3546);
    }
}
