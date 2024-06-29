import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class124 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Lh;")
    private class327 field1394;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "()V")
    public final void method807() {
        this.field1394.field4363.glEndList();
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public final void method808(int arg0) {
        this.field1394.field4363.glNewList(this.field1393 + arg0, 4864);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lh;I)V")
    public class124(class327 arg0, int arg1) {
        this.field1394 = arg0;
        this.field1393 = this.field1394.field4363.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(C)V")
    public final void method809(char arg0) {
        this.field1394.field4363.glCallList(this.field1393 + arg0);
    }
}
