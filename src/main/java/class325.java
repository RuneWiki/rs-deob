import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class325 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lpo;")
    private class332 field4578;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(C)V", line = 3)
    public final void method2003(char arg0) {
        this.field4578.field4752.glCallList(this.field4577 + arg0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V", line = 10)
    public final void method2004() {
        this.field4578.field4752.glEndList();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 13)
    public final void method2005(int arg0) {
        this.field4578.field4752.glNewList(this.field4577 + arg0, 4864);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lpo;I)V", line = 15)
    public class325(class332 arg0, int arg1) {
        this.field4578 = arg0;
        this.field4577 = this.field4578.field4752.glGenLists(arg1);
    }
}
