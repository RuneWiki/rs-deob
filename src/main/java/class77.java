import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 extends class86 {

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "Lmd;")
    private static class76 field1891;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "()I", line = 3)
    public final int method475() {
        return field1891.method596((byte) 123);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 6)
    public final void method474(int arg0) throws Exception {
        field1891.method598(arg0, false);
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "()V", line = 9)
    public static void method601() {
        field1891 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V", line = 13)
    public final void method472() {
        field1891.method600(class86.field2054);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()V", line = 16)
    public final void method473() {
        field1891.method599((byte) 105);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lsb;Ljava/awt/Component;)V", line = 19)
    public class77(class110 arg0, Component arg1) throws Exception {
        super(22050);
        field1891 = arg0.method841(1);
        field1891.method597(arg1, (byte) -66);
        this.method646(arg0, 16384);
    }
}
