import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class240 extends class253 implements class295 {

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    private int field3983;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
    public final void method1695(int arg0, int arg1, int arg2) {
        this.field4117.field1156.glDrawElements(arg0, arg2, this.field3983, (long) (this.field3984 * arg1));
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lsq;I[BIZ)V")
    public class240(class96 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3983 = arg1;
        this.field3984 = this.field4117.method649(this.field3983);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "()I")
    public final int method85() {
        return super.method85();
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BI)V")
    public final void method1696(int arg0, byte[] arg1, int arg2) {
        this.method1754(arg1, arg2);
        this.field3983 = arg0;
        this.field3984 = this.field4117.method649(this.field3983);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "()V")
    public final void method1224() {
        this.field4117.method638(this);
    }
}
