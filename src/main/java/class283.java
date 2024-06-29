import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class283 extends class16 implements class84 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V", line = 3)
    public final void method463(int arg0, int arg1, int arg2) {
        this.field193.field1927.glDrawElements(arg0, arg2, this.field3990, this.field192.position(this.field3991 * arg1));
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lao;I[BI)V", line = 6)
    public class283(class157 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3990 = arg1;
        this.field3991 = this.field193.method953(this.field3990);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()I", line = 11)
    public final int method461() {
        return 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BI)V", line = 15)
    public final void method462(int arg0, byte[] arg1, int arg2) {
        this.method109(arg1, arg2);
        this.field3990 = arg0;
        this.field3991 = this.field193.method953(this.field3990);
    }
}
