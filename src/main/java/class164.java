import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class164 extends class199 {

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    private int field2930;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "Lkd;")
    private static class76 field2931;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()I", line = 3)
    public final int method1132() {
        return field2931.method501((byte) 95, this.field2930);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V", line = 7)
    public final void method1133() {
        field2931.method498((byte) -124, this.field2930);
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()V", line = 10)
    public final void method1134() {
        field2931.method502(this.field2930, this.field3592);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lla;I)V", line = 12)
    public class164(class139 arg0, int arg1) {
        field2931 = arg0.method965(false);
        this.field2930 = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 17)
    public final void method1135(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2931.method499(arg0, this.field2930, (byte) -8);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 23)
    public final void method1136() {
        field2931.method500((byte) -2, this.field2930);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "()V", line = 26)
    public static void method1137() {
        field2931 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public final void method1138(Component arg0) throws Exception {
        field2931.method497(class210.field3755, class10.field126, arg0, (byte) -89);
    }
}
