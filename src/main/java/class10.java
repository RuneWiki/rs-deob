import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lmi;")
    private class315 field105;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(C)V")
    public final void method37(char arg0) {
        this.field105.field4445.glCallList(this.field104 + arg0);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method38() {
        this.field105.field4445.glEndList();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public final void method39(int arg0) {
        this.field105.field4445.glNewList(this.field104 + arg0, 4864);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lmi;I)V")
    public class10(class315 arg0, int arg1) {
        this.field105 = arg0;
        this.field104 = this.field105.field4445.glGenLists(arg1);
    }
}
