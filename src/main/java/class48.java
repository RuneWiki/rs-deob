import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 extends class79 {

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Lld;")
    private static class70 field1043;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 3)
    public final void method44(int arg0) throws Exception {
        field1043.method596(-3104, arg0);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lfb;Ljava/awt/Component;)V", line = 6)
    public class48(class33 arg0, Component arg1) throws Exception {
        super(22050);
        field1043 = arg0.method311(124);
        field1043.method600(arg1, (byte) -112);
        this.method682(arg0, 16384);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 13)
    public final void method46() {
        field1043.method598((byte) -77);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()I", line = 16)
    public final int method45() {
        return field1043.method599(-12);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 19)
    public static void method392() {
        field1043 = null;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 22)
    public final void method47() {
        field1043.method597(class79.field1774);
    }
}
