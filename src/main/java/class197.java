import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class197 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Lsq;")
    private class96 field3187;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    private int field3186;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(C)V", line = 5)
    public final void method1380(char arg0) {
        this.field3187.field1156.glCallList(this.field3186 + arg0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 9)
    public final void method1381() {
        this.field3187.field1156.glEndList();
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 13)
    public final void method1382(int arg0) {
        this.field3187.field1156.glNewList(this.field3186 + arg0, 4864);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lsq;I)V", line = 15)
    public class197(class96 arg0, int arg1) {
        this.field3187 = arg0;
        this.field3186 = this.field3187.field1156.glGenLists(arg1);
    }
}
