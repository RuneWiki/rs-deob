import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class433 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lic;")
    private class246 field6259;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    private int field6260;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(C)V")
    public final void method2588(char arg0) {
        this.field6259.field3342.glCallList(this.field6260 + arg0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public final void method2589(int arg0) {
        this.field6259.field3342.glNewList(this.field6260 + arg0, 4864);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
    public final void method2590() {
        this.field6259.field3342.glEndList();
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lic;I)V")
    public class433(class246 arg0, int arg1) {
        this.field6259 = arg0;
        this.field6260 = this.field6259.field3342.glGenLists(arg1);
    }
}
