import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class461 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lfu;")
    private class42 field6524;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    private int field6523;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final void method2760(int arg0) {
        this.field6524.field557.glNewList(this.field6523 + arg0, 4864);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(C)V")
    public final void method2761(char arg0) {
        this.field6524.field557.glCallList(this.field6523 + arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    public final void method2762() {
        this.field6524.field557.glEndList();
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lfu;I)V")
    public class461(class42 arg0, int arg1) {
        this.field6524 = arg0;
        this.field6523 = this.field6524.field557.glGenLists(arg1);
    }
}
