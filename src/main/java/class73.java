import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class73 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Lcg;")
    private class393 field964;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public final void method482(int arg0) {
        this.field964.field5783.glNewList(this.field965 + arg0, 4864);
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lcg;I)V")
    public class73(class393 arg0, int arg1) {
        this.field964 = arg0;
        this.field965 = this.field964.field5783.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(C)V")
    public final void method483(char arg0) {
        this.field964.field5783.glCallList(this.field965 + arg0);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "()V")
    public final void method484() {
        this.field964.field5783.glEndList();
    }
}
