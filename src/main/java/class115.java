import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class115 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Lao;")
    private class157 field1411;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(C)V")
    public final void method714(char arg0) {
        this.field1411.field1927.glCallList(this.field1412 + arg0);
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lao;I)V")
    public class115(class157 arg0, int arg1) {
        this.field1411 = arg0;
        this.field1412 = this.field1411.field1927.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
    public final void method715() {
        this.field1411.field1927.glEndList();
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public final void method716(int arg0) {
        this.field1411.field1927.glNewList(this.field1412 + arg0, 4864);
    }
}
