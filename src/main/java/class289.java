import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class289 extends class68 implements class217 {

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    private int field4185;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    private int field4186;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BI)V", line = 3)
    public final void method1354(int arg0, byte[] arg1, int arg2) {
        this.method438(arg1, arg2);
        this.field4185 = arg0;
        this.field4186 = this.field948.method2124(this.field4185);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V", line = 8)
    public final void method1355(int arg0, int arg1, int arg2) {
        this.field948.field4741.glDrawElements(arg0, arg2, this.field4185, (long) (this.field4186 * arg1));
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "()I", line = 11)
    public final int method90() {
        return super.method90();
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "()V", line = 15)
    public final void method437() {
        this.field948.method2096(this);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lih;I[BIZ)V", line = 19)
    public class289(class330 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4185 = arg1;
        this.field4186 = this.field948.method2124(this.field4185);
    }
}
