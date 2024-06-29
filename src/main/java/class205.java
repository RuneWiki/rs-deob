import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class205 extends class313 {

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    private int field3034;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "Lgga;")
    private static class292 field3035;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()I")
    public final int method1391() {
        return field3035.method658((byte) 122, this.field3034);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public final void method1392(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3035.method660(arg0, -26857, this.field3034);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public final void method1393() {
        field3035.method659(30546, this.field3034);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lge;I)V")
    public class205(class711 arg0, int arg1) {
        field3035 = (class292) arg0.method4050(16879);
        this.field3034 = arg1;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
    public final void method1394() {
        field3035.method662(this.field3034, (byte) -118);
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
    public final void method1395() {
        field3035.method657(this.field3034, super.field4432);
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "()V")
    public static void method1396() {
        field3035 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1397(Component arg0) throws Exception {
        field3035.method661(class266.field3798, (byte) -126, arg0, client.field4279);
    }
}
