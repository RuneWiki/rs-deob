import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class453 extends class210 implements class292 {

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    private int field6490;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    private int field6491;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I[BI)V", line = 3)
    public final void method1980(int arg0, byte[] arg1, int arg2) {
        this.method1488(arg1, arg2);
        this.field6490 = arg0;
        this.field6491 = this.field2997.method1015(this.field6490);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 8)
    public final void method1979(int arg0, int arg1, int arg2) {
        this.field2997.field1918.glDrawElements(arg0, arg2, this.field6490, (long) (this.field6491 * arg1));
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "()V", line = 11)
    public final void method1487() {
        this.field2997.method962(this);
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lig;I[BIZ)V", line = 14)
    public class453(class132 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6490 = arg1;
        this.field6491 = this.field2997.method1015(this.field6490);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()I", line = 19)
    public final int method34() {
        return super.method34();
    }
}
