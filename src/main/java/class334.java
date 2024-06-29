import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class334 {

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "Lhj;")
    private class338 field4518;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    private int field4517;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 4)
    public final void method2073(int arg0) {
        this.field4518.field4607.glNewList(this.field4517 + arg0, 4864);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 9)
    public final void method2074() {
        this.field4518.field4607.glEndList();
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lhj;I)V", line = 11)
    public class334(class338 arg0, int arg1) {
        this.field4518 = arg0;
        this.field4517 = this.field4518.field4607.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(C)V", line = 21)
    public final void method2075(char arg0) {
        this.field4518.field4607.glCallList(this.field4517 + arg0);
    }
}
