import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 extends class51 {

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "Lma;")
    private static class81 field375;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "()V")
    public static void method148() {
        field375 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lha;)V")
    public class16(class50 arg0) {
        field375 = arg0.method363(110);
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
    public final void method149() {
        field375.method599(class51.field1132);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public final void method150(int arg0) throws Exception {
        field375.method597(arg0, 122);
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
    public final void method151() {
        field375.method598(-8680);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
    public final void method152(Component arg0, int arg1, boolean arg2) throws Exception {
        field375.method595((byte) 14, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
    public final int method153() {
        return field375.method596(122);
    }
}
