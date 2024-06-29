import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class253 {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lql;")
    private class346 field3473;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(C)V")
    public final void method1427(char arg0) {
        this.field3473.field4697.glCallList(this.field3472 + arg0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
    public final void method1428() {
        this.field3473.field4697.glEndList();
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lql;I)V")
    public class253(class346 arg0, int arg1) {
        this.field3473 = arg0;
        this.field3472 = this.field3473.field4697.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public final void method1429(int arg0) {
        this.field3473.field4697.glNewList(this.field3472 + arg0, 4864);
    }
}
