import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class112 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lig;")
    private class132 field1439;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(C)V")
    public final void method677(char arg0) {
        this.field1439.field1918.glCallList(this.field1438 + arg0);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lig;I)V")
    public class112(class132 arg0, int arg1) {
        this.field1439 = arg0;
        this.field1438 = this.field1439.field1918.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public final void method678(int arg0) {
        this.field1439.field1918.glNewList(this.field1438 + arg0, 4864);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
    public final void method679() {
        this.field1439.field1918.glEndList();
    }
}
