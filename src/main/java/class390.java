import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class390 extends class353 implements class84 {

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    private int field5505;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    private int field5506;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "()V", line = 3)
    public final void method1548() {
        this.field4981.method977(this);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lao;I[BIZ)V", line = 7)
    public class390(class157 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5505 = arg1;
        this.field5506 = this.field4981.method953(this.field5505);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()I", line = 12)
    public final int method461() {
        return super.method461();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V", line = 16)
    public final void method463(int arg0, int arg1, int arg2) {
        this.field4981.field1927.glDrawElements(arg0, arg2, this.field5505, (long) (this.field5506 * arg1));
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BI)V", line = 19)
    public final void method462(int arg0, byte[] arg1, int arg2) {
        this.method2249(arg1, arg2);
        this.field5505 = arg0;
        this.field5506 = this.field4981.method953(this.field5505);
    }
}
