import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class173 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lnm;")
    private class254 field2462;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private int field2463;

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lnm;I)V", line = 6)
    public class173(class254 arg0, int arg1) {
        this.field2462 = arg0;
        this.field2463 = this.field2462.field3648.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 15)
    public final void method1191(int arg0) {
        this.field2462.field3648.glNewList(this.field2463 + arg0, 4864);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(C)V", line = 18)
    public final void method1192(char arg0) {
        this.field2462.field3648.glCallList(this.field2463 + arg0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 21)
    public final void method1193() {
        this.field2462.field3648.glEndList();
    }
}
