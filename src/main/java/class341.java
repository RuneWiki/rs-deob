import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class341 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lnf;")
    private class256 field4909;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    private int field4908;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    public final void method2223() {
        this.field4909.field3634.glEndList();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method2224(int arg0) {
        this.field4909.field3634.glNewList(this.field4908 + arg0, 4864);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(C)V")
    public final void method2225(char arg0) {
        this.field4909.field3634.glCallList(this.field4908 + arg0);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lnf;I)V")
    public class341(class256 arg0, int arg1) {
        this.field4909 = arg0;
        this.field4908 = this.field4909.field3634.glGenLists(arg1);
    }
}
