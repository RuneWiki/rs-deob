import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class320 extends class194 implements class163 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    private int field4534;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    private int field4533;

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lpo;I[BI)V", line = 3)
    public class320(class332 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4534 = arg1;
        this.field4533 = this.field2643.method2128(this.field4534);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 8)
    public final void method381(int arg0, int arg1, int arg2) {
        this.field2643.field4752.glDrawElements(arg0, arg2, this.field4534, this.field2644.position(this.field4533 * arg1));
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[BI)V", line = 11)
    public final void method382(int arg0, byte[] arg1, int arg2) {
        this.method1237(arg1, arg2);
        this.field4534 = arg0;
        this.field4533 = this.field2643.method2128(this.field4534);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 16)
    public final int method380() {
        return 0;
    }
}
