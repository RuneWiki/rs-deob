import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class449 extends class234 {

    @OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
    private int field6497;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "Lro;")
    private static class250 field6496;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()V", line = 3)
    public final void method1554() {
        field6496.method1627(127, this.field6497);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "()V", line = 8)
    public final void method1555() {
        field6496.method1629(this.field6497, super.field3231);
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V", line = 11)
    public final void method1567(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6496.method1624(arg0, 15465, this.field6497);
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "()I", line = 17)
    public final int method1557() {
        return field6496.method1628((byte) 78, this.field6497);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 20)
    public final void method1566(Component arg0) throws Exception {
        field6496.method1625(class373.field5246, -22091, arg0, class413.field5774);
    }

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "()V", line = 23)
    public static void method2796() {
        field6496 = null;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lbd;I)V", line = 25)
    public class449(class304 arg0, int arg1) {
        field6496 = arg0.method1957(true);
        this.field6497 = arg1;
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "()V", line = 30)
    public final void method1564() {
        field6496.method1626(this.field6497, (byte) -106);
    }
}
