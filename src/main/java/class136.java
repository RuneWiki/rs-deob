import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class136 extends class378 implements class19 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    private int field1884;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final void method140(int arg0, int arg1, int arg2) {
        this.field5497.field3634.glDrawElements(arg0, arg2, this.field1885, this.field5496.position(this.field1884 * arg1));
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
    public final int method139() {
        return 0;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lnf;I[BI)V")
    public class136(class256 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1885 = arg1;
        this.field1884 = this.field5497.method1658(this.field1885);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BI)V")
    public final void method141(int arg0, byte[] arg1, int arg2) {
        this.method2449(arg1, arg2);
        this.field1885 = arg0;
        this.field1884 = this.field5497.method1658(this.field1885);
    }
}
