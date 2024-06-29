import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class144 extends class381 implements class159 {

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    private int field2002;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()V")
    public final void method468() {
        this.field5239.method451(this);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
    public final void method1033(int arg0, int arg1, int arg2) {
        this.field5239.field557.glDrawElements(arg0, arg2, this.field2002, (long) (this.field2001 * arg1));
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()I")
    public final int method464() {
        return super.method464();
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[BI)V")
    public final void method1034(int arg0, byte[] arg1, int arg2) {
        this.method2323(arg1, arg2);
        this.field2002 = arg0;
        this.field2001 = this.field5239.method311(this.field2002);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lfu;I[BIZ)V")
    public class144(class42 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2002 = arg1;
        this.field2001 = this.field5239.method311(this.field2002);
    }
}
