import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class412 extends class37 implements class323 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field5978;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    private int field5977;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()I")
    public final int method282() {
        return super.method282();
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lse;I[BIZ)V")
    public class412(class282 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5978 = arg1;
        this.field5977 = this.field560.method1936(this.field5978);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BI)V")
    public final void method2126(int arg0, byte[] arg1, int arg2) {
        this.method284(arg1, arg2);
        this.field5978 = arg0;
        this.field5977 = this.field560.method1936(this.field5978);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
    public final void method2125(int arg0, int arg1, int arg2) {
        this.field560.field4140.glDrawElements(arg0, arg2, this.field5978, (long) (this.field5977 * arg1));
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
    public final void method283() {
        this.field560.method1880(this);
    }
}
