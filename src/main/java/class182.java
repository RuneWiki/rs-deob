import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class182 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Ltb;")
    private class227 field2494;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    private int field2495;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
    public final void method1191() {
        this.field2494.field3184.glEndList();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method1192(int arg0) {
        this.field2494.field3184.glNewList(this.field2495 + arg0, 4864);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(C)V")
    public final void method1193(char arg0) {
        this.field2494.field3184.glCallList(this.field2495 + arg0);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ltb;I)V")
    public class182(class227 arg0, int arg1) {
        this.field2494 = arg0;
        this.field2495 = this.field2494.field3184.glGenLists(arg1);
    }
}
