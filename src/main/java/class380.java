import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class380 extends class52 implements class323 {

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    private int field5555;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    private int field5554;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()I")
    public final int method282() {
        return 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[BI)V")
    public final void method2126(int arg0, byte[] arg1, int arg2) {
        this.method382(arg1, arg2);
        this.field5555 = arg0;
        this.field5554 = this.field813.method1936(this.field5555);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
    public final void method2125(int arg0, int arg1, int arg2) {
        this.field813.field4140.glDrawElements(arg0, arg2, this.field5555, this.field812.position(this.field5554 * arg1));
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lse;I[BI)V")
    public class380(class282 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5555 = arg1;
        this.field5554 = this.field813.method1936(this.field5555);
    }
}
