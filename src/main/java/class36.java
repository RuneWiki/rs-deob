import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class86 {

    @OriginalMember(owner = "client!f", name = "J", descriptor = "Luc;")
    private static class124 field833;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;IZ)V", line = 3)
    public final void method319(Component arg0, int arg1, boolean arg2) throws Exception {
        field833.method1019(arg2, 27859, arg1, arg0);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Led;)V", line = 5)
    public class36(class31 arg0) {
        field833 = arg0.method278((byte) 32);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()I", line = 9)
    public final int method320() {
        return field833.method1020((byte) -113);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V", line = 12)
    public final void method321() {
        field833.method1016(class86.field2072);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V", line = 15)
    public final void method322(int arg0) throws Exception {
        field833.method1018(-4732, arg0);
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()V", line = 19)
    public final void method323() {
        field833.method1017(11540);
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "()V", line = 22)
    public static void method324() {
        field833 = null;
    }
}
