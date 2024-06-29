import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class219 extends class134 {

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "Lgg;")
    private static class187 field3951;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "()V")
    public static void method1557() {
        field3951 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()I")
    public final int method203() {
        return field3951.method1361(85, this.field3952);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method202(Component arg0) throws Exception {
        field3951.method1363(class133.field2473, 85, arg0, class256.field4597);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lsd;I)V")
    public class219(class42 arg0, int arg1) {
        field3951 = arg0.method229((byte) 60);
        this.field3952 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
    public final void method205() {
        field3951.method1365(true, this.field3952);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public final void method200(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3951.method1362(this.field3952, (byte) -126, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()V")
    public final void method201() {
        field3951.method1364((byte) 116, this.field3952);
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()V")
    public final void method204() {
        field3951.method1360(this.field3952, super.field2505);
    }
}
