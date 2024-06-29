import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class198 extends class140 {

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    private int field2681;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Lfc;")
    private static class156 field2682;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method740(Component arg0) throws Exception {
        field2682.method911((byte) 95, class165.field2290, arg0, class267.field3526);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()V")
    public static void method1136() {
        field2682 = null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
    public final void method738() {
        field2682.method914(this.field2681, (byte) -96);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lml;I)V")
    public class198(class241 arg0, int arg1) {
        field2682 = arg0.method1346(16);
        this.field2681 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
    public final void method742() {
        field2682.method912(this.field2681, super.field2017);
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public final void method739(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2682.method910(this.field2681, (byte) 126, arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
    public final int method741() {
        return field2682.method913(22297, this.field2681);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
    public final void method743() {
        field2682.method915(this.field2681, -10584);
    }
}
