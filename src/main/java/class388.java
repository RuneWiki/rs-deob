import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class388 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lbf;")
    private class344 field5363;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    private int field5362;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(C)V")
    public final void method2381(char arg0) {
        this.field5363.field4604.glCallList(this.field5362 + arg0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
    public final void method2382() {
        this.field5363.field4604.glEndList();
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lbf;I)V")
    public class388(class344 arg0, int arg1) {
        this.field5363 = arg0;
        this.field5362 = this.field5363.field4604.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public final void method2383(int arg0) {
        this.field5363.field4604.glNewList(this.field5362 + arg0, 4864);
    }
}
