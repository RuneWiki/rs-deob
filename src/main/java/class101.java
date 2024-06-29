import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class101 {

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Lge;")
    private class104 field1568;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
    public final void method834() {
        this.field1568.field1604.glEndList();
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public final void method835(int arg0) {
        this.field1568.field1604.glNewList(this.field1567 + arg0, 4864);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(C)V")
    public final void method836(char arg0) {
        this.field1568.field1604.glCallList(this.field1567 + arg0);
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lge;I)V")
    public class101(class104 arg0, int arg1) {
        this.field1568 = arg0;
        this.field1567 = this.field1568.field1604.glGenLists(arg1);
    }
}
