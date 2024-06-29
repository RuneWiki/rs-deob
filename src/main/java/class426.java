import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class426 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lse;")
    private class282 field6208;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    private int field6209;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 6)
    public final void method2670(int arg0) {
        this.field6208.field4140.glNewList(this.field6209 + arg0, 4864);
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lse;I)V", line = 8)
    public class426(class282 arg0, int arg1) {
        this.field6208 = arg0;
        this.field6209 = this.field6208.field4140.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "()V", line = 17)
    public final void method2671() {
        this.field6208.field4140.glEndList();
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(C)V", line = 20)
    public final void method2672(char arg0) {
        this.field6208.field4140.glCallList(this.field6209 + arg0);
    }
}
