import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class155 extends class95 implements class19 {

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()I")
    public final int method49() {
        return 0;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lh;I[BI)V")
    public class155(class327 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1798 = arg1;
        this.field1797 = this.field1114.method2093(this.field1798);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BI)V")
    public final void method116(int arg0, byte[] arg1, int arg2) {
        this.method593(arg1, arg2);
        this.field1798 = arg0;
        this.field1797 = this.field1114.method2093(this.field1798);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method117(int arg0, int arg1, int arg2) {
        this.field1114.field4363.glDrawElements(arg0, arg2, this.field1798, this.field1115.position(this.field1797 * arg1));
    }
}
