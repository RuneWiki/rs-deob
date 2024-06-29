import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class251 extends class151 implements class112 {

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    private int field3466;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    private int field3465;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I[BI)V", line = 3)
    public final void method743(int arg0, byte[] arg1, int arg2) {
        this.method1027(arg1, arg2);
        this.field3466 = arg0;
        this.field3465 = this.field2150.method2130(this.field3466);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()I", line = 9)
    public final int method641() {
        return 0;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lhj;I[BI)V", line = 13)
    public class251(class338 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3466 = arg1;
        this.field3465 = this.field2150.method2130(this.field3466);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V", line = 19)
    public final void method744(int arg0, int arg1, int arg2) {
        this.field2150.field4607.glDrawElements(arg0, arg2, this.field3466, this.field2151.position(this.field3465 * arg1));
    }
}
