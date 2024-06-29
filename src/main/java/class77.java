import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 extends class47 {

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Lc;")
    private static class13 field1644;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "()I", line = 3)
    public final int method372() {
        return field1644.method112((byte) 105);
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "()V", line = 6)
    public static void method573() {
        field1644 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 9)
    public final void method369(int arg0) throws Exception {
        field1644.method116((byte) 53, arg0);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()V", line = 12)
    public final void method371() {
        field1644.method115(102);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lbb;Ljava/awt/Component;)V", line = 15)
    public class77(class9 arg0, Component arg1) throws Exception {
        super(22050);
        field1644 = arg0.method74((byte) -31);
        field1644.method114(arg1, -17852);
        this.method408(arg0, 16384);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V", line = 21)
    public final void method370() {
        field1644.method113(class47.field996);
    }
}
