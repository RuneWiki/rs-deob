import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class261 extends class394 implements class391 {

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    private int field3860;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "()I", line = 4)
    public final int method49() {
        return 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[BI)V", line = 7)
    public final void method51(int arg0, byte[] arg1, int arg2) {
        this.method2472(arg1, arg2);
        this.field3860 = arg0;
        this.field3861 = this.field5733.method1173(this.field3860);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)V", line = 13)
    public final void method50(int arg0, int arg1, int arg2) {
        this.field5733.field2253.glDrawElements(arg0, arg2, this.field3860, this.field5732.position(this.field3861 * arg1));
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lks;I[BI)V", line = 17)
    public class261(class173 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3860 = arg1;
        this.field3861 = this.field5733.method1173(this.field3860);
    }
}
