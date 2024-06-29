import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class391 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lqi;")
    private class458 field5515;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    private int field5516;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method2338(int arg0) {
        this.field5515.field6330.glNewList(this.field5516 + arg0, 4864);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(C)V")
    public final void method2339(char arg0) {
        this.field5515.field6330.glCallList(this.field5516 + arg0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public final void method2340() {
        this.field5515.field6330.glEndList();
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lqi;I)V")
    public class391(class458 arg0, int arg1) {
        this.field5515 = arg0;
        this.field5516 = this.field5515.field6330.glGenLists(arg1);
    }
}
