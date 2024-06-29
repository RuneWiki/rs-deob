import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class355 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lmm;")
    private class357 field4771;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    private int field4770;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public final void method2130(int arg0) {
        this.field4771.field4794.glNewList(this.field4770 + arg0, 4864);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
    public final void method2131() {
        this.field4771.field4794.glEndList();
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lmm;I)V")
    public class355(class357 arg0, int arg1) {
        this.field4771 = arg0;
        this.field4770 = this.field4771.field4794.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(C)V")
    public final void method2132(char arg0) {
        this.field4771.field4794.glCallList(this.field4770 + arg0);
    }
}
