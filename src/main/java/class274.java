import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class274 extends class159 implements class295 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    private int field4392;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
    public final void method1695(int arg0, int arg1, int arg2) {
        this.field2525.field1156.glDrawElements(arg0, arg2, this.field4392, this.field2526.position(this.field4391 * arg1));
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "()I")
    public final int method85() {
        return 0;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lsq;I[BI)V")
    public class274(class96 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4392 = arg1;
        this.field4391 = this.field2525.method649(this.field4392);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I[BI)V")
    public final void method1696(int arg0, byte[] arg1, int arg2) {
        this.method1114(arg1, arg2);
        this.field4392 = arg0;
        this.field4391 = this.field2525.method649(this.field4392);
    }
}
