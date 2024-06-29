import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class19 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lks;")
    private class173 field298;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public final void method233(int arg0) {
        this.field298.field2253.glNewList(this.field297 + arg0, 4864);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lks;I)V")
    public class19(class173 arg0, int arg1) {
        this.field298 = arg0;
        this.field297 = this.field298.field2253.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
    public final void method234() {
        this.field298.field2253.glEndList();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(C)V")
    public final void method235(char arg0) {
        this.field298.field2253.glCallList(this.field297 + arg0);
    }
}
