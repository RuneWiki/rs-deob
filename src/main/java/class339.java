import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class339 extends class64 {

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    private int field5253;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "Lhd;")
    private static class162 field5252;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 3)
    public final void method528(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field5252.method1155(this.field5253, 15783, arg0);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V", line = 9)
    public final void method526() {
        field5252.method1156(this.field5253, this.field931);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()I", line = 12)
    public final int method532() {
        return field5252.method1154(this.field5253, (byte) 82);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V", line = 15)
    public final void method524() {
        field5252.method1158(this.field5253, 30850);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()V", line = 18)
    public final void method529() {
        field5252.method1157(18062, this.field5253);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 21)
    public final void method520(Component arg0) throws Exception {
        field5252.method1153(class193.field2808, -19827, class56.field812, arg0);
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "()V", line = 25)
    public static void method2379() {
        field5252 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lnf;I)V", line = 28)
    public class339(class61 arg0, int arg1) {
        field5252 = arg0.method489(0);
        this.field5253 = arg1;
    }
}
