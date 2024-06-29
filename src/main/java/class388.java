import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class388 extends class95 implements class112 {

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    private int field5649;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    private int field5648;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "()V", line = 3)
    public final void method642() {
        this.field1411.method2167(this);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lhj;I[BIZ)V", line = 6)
    public class388(class338 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5649 = arg1;
        this.field5648 = this.field1411.method2130(this.field5649);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()I", line = 13)
    public final int method641() {
        return super.method641();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V", line = 16)
    public final void method744(int arg0, int arg1, int arg2) {
        this.field1411.field4607.glDrawElements(arg0, arg2, this.field5649, (long) (this.field5648 * arg1));
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BI)V", line = 19)
    public final void method743(int arg0, byte[] arg1, int arg2) {
        this.method643(arg1, arg2);
        this.field5649 = arg0;
        this.field5648 = this.field1411.method2130(this.field5649);
    }
}
