import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class146 extends class82 implements class313 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    private int field1875;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()I", line = 3)
    public final int method225() {
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lql;I[BI)V", line = 7)
    public class146(class346 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1874 = arg1;
        this.field1875 = this.field905.method2089(this.field1874);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 12)
    public final void method790(int arg0, int arg1, int arg2) {
        this.field905.field4697.glDrawElements(arg0, arg2, this.field1874, this.field906.position(this.field1875 * arg1));
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BI)V", line = 16)
    public final void method791(int arg0, byte[] arg1, int arg2) {
        this.method448(arg1, arg2);
        this.field1874 = arg0;
        this.field1875 = this.field905.method2089(this.field1874);
    }
}
