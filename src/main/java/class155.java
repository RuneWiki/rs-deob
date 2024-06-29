import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class155 extends class163 implements class455 {

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    private int field1861;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    private int field1860;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()I", line = 4)
    public final int method747() {
        return super.method747();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[BI)V", line = 7)
    public final void method748(int arg0, byte[] arg1, int arg2) {
        this.method796(arg1, arg2);
        this.field1861 = arg0;
        this.field1860 = this.field1962.method1457(this.field1861);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V", line = 13)
    public final void method749(int arg0, int arg1, int arg2) {
        this.field1962.field3342.glDrawElements(arg0, arg2, this.field1861, (long) (this.field1860 * arg1));
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lic;I[BIZ)V", line = 16)
    public class155(class246 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field1861 = arg1;
        this.field1860 = this.field1962.method1457(this.field1861);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()V", line = 21)
    public final void method750() {
        this.field1962.method1358(this);
    }
}
