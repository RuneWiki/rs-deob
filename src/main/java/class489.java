import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class489 extends class136 implements class455 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    private int field6925;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    private int field6926;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BI)V")
    public final void method748(int arg0, byte[] arg1, int arg2) {
        this.method644(arg1, arg2);
        this.field6925 = arg0;
        this.field6926 = this.field1638.method1457(this.field6925);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "()I")
    public final int method747() {
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lic;I[BI)V")
    public class489(class246 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6925 = arg1;
        this.field6926 = this.field1638.method1457(this.field6925);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public final void method749(int arg0, int arg1, int arg2) {
        this.field1638.field3342.glDrawElements(arg0, arg2, this.field6925, this.field1639.position(this.field6926 * arg1));
    }
}
