import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class205 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lhd;")
    private class17 field2878;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    private int field2879;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
    public final void method1425() {
        this.field2878.field198.glEndList();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public final void method1426(int arg0) {
        this.field2878.field198.glNewList(this.field2879 + arg0, 4864);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(C)V")
    public final void method1427(char arg0) {
        this.field2878.field198.glCallList(this.field2879 + arg0);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lhd;I)V")
    public class205(class17 arg0, int arg1) {
        this.field2878 = arg0;
        this.field2879 = this.field2878.field198.glGenLists(arg1);
    }
}
