import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 extends class61 implements class337 {

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "()V", line = 3)
    public final void method124() {
        this.field813.method2016(this);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()I", line = 8)
    public final int method125() {
        return super.method125();
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lbf;I[BIZ)V", line = 11)
    public class20(class344 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field271 = arg1;
        this.field270 = this.field813.method2008(this.field271);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V", line = 16)
    public final void method126(int arg0, int arg1, int arg2) {
        this.field813.field4604.glDrawElements(arg0, arg2, this.field271, (long) (this.field270 * arg1));
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I[BI)V", line = 19)
    public final void method127(int arg0, byte[] arg1, int arg2) {
        this.method424(arg1, arg2);
        this.field271 = arg0;
        this.field270 = this.field813.method2008(this.field271);
    }
}
