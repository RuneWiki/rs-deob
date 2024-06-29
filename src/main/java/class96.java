import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class96 extends class65 {

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "Ld;")
    private static class22 field2454;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 3)
    public final void method483() {
        field2454.method161(class65.field1599);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I", line = 6)
    public final int method488() {
        return field2454.method160((byte) 125);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lbd;Ljava/awt/Component;)V", line = 9)
    public class96(class11 arg0, Component arg1) throws Exception {
        super(22050);
        field2454 = arg0.method63(true);
        field2454.method159(arg1, (byte) 105);
        this.method492(arg0, 16384);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V", line = 16)
    public final void method493() {
        field2454.method162(-106);
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()V", line = 19)
    public static void method733() {
        field2454 = null;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 22)
    public final void method485(int arg0) throws Exception {
        field2454.method163(true, arg0);
    }
}
