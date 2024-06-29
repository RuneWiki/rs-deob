import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class43 extends class340 implements class138 {

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()V", line = 3)
    public final void method389() {
        this.field4655.method1534(this);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[BI)V", line = 7)
    public final void method390(int arg0, byte[] arg1, int arg2) {
        this.method2164(arg1, arg2);
        this.field619 = arg0;
        this.field620 = this.field4655.method1532(this.field619);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V", line = 12)
    public final void method391(int arg0, int arg1, int arg2) {
        this.field4655.field3184.glDrawElements(arg0, arg2, this.field619, (long) (this.field620 * arg1));
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ltb;I[BIZ)V", line = 15)
    public class43(class227 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field619 = arg1;
        this.field620 = this.field4655.method1532(this.field619);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I", line = 20)
    public final int method392() {
        return super.method392();
    }
}
