import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class419 extends class216 {

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    private int field6199;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "La;")
    private static class366 field6200;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()V", line = 4)
    public final void method1456() {
        field6200.method2351(this.field6199, 81);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lap;I)V", line = 6)
    public class419(class279 arg0, int arg1) {
        field6200 = arg0.method1881(true);
        this.field6199 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 11)
    public final void method1459(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6200.method2352(14395, this.field6199, arg0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()V", line = 17)
    public final void method1455() {
        field6200.method2350(this.field6199, super.field3519);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()V", line = 21)
    public final void method1458() {
        field6200.method2353(this.field6199, -63);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()I", line = 24)
    public final int method1457() {
        return field6200.method2354((byte) -52, this.field6199);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 27)
    public final void method1454(Component arg0) throws Exception {
        field6200.method2349(class413.field6106, class29.field339, (byte) 125, arg0);
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "()V", line = 30)
    public static void method2614() {
        field6200 = null;
    }
}
