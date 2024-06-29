import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class319 extends class371 implements class337 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    private int field4201;

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lbf;I[BI)V", line = 3)
    public class319(class344 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4200 = arg1;
        this.field4201 = this.field5069.method2008(this.field4200);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 10)
    public final void method126(int arg0, int arg1, int arg2) {
        this.field5069.field4604.glDrawElements(arg0, arg2, this.field4200, this.field5070.position(this.field4201 * arg1));
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()I", line = 13)
    public final int method125() {
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[BI)V", line = 16)
    public final void method127(int arg0, byte[] arg1, int arg2) {
        this.method2285(arg1, arg2);
        this.field4200 = arg0;
        this.field4201 = this.field5069.method2008(this.field4200);
    }
}
