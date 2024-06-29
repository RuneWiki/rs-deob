import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class428 extends class270 {

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
    private int field6292;

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "Ltd;")
    private static class301 field6293;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 3)
    public final void method579(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6293.method1815(arg0, this.field6292, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "()I", line = 9)
    public final int method582() {
        return field6293.method1810((byte) -117, this.field6292);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "()V", line = 12)
    public final void method580() {
        field6293.method1812(this.field6292, super.field4078);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 15)
    public final void method581(Component arg0) throws Exception {
        field6293.method1813(class236.field3576, 1362, arg0, class170.field2646);
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "()V", line = 18)
    public static void method2522() {
        field6293 = null;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "()V", line = 22)
    public final void method583() {
        field6293.method1811(this.field6292, (byte) -80);
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "()V", line = 26)
    public final void method578() {
        field6293.method1814(this.field6292, -120);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lhf;I)V", line = 28)
    public class428(class260 arg0, int arg1) {
        field6293 = arg0.method1557(93);
        this.field6292 = arg1;
    }
}
