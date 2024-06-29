import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class147 extends class384 implements class196 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    private int field2169;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    private int field2170;

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lmi;I[BI)V")
    public class147(class315 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2169 = arg1;
        this.field2170 = this.field5466.method1999(this.field2169);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public final void method929(int arg0, int arg1, int arg2) {
        this.field5466.field4445.glDrawElements(arg0, arg2, this.field2169, this.field5465.position(this.field2170 * arg1));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[BI)V")
    public final void method930(int arg0, byte[] arg1, int arg2) {
        this.method2315(arg1, arg2);
        this.field2169 = arg0;
        this.field2170 = this.field5466.method1999(this.field2169);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
    public final int method434() {
        return 0;
    }
}
