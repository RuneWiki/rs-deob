import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class195 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lih;")
    private class330 field2799;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    private int field2798;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method1223(int arg0) {
        this.field2799.field4741.glNewList(this.field2798 + arg0, 4864);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
    public final void method1224() {
        this.field2799.field4741.glEndList();
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lih;I)V")
    public class195(class330 arg0, int arg1) {
        this.field2799 = arg0;
        this.field2798 = this.field2799.field4741.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(C)V")
    public final void method1225(char arg0) {
        this.field2799.field4741.glCallList(this.field2798 + arg0);
    }
}
