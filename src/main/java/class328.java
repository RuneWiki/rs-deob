import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class328 extends class292 {

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    private int field4085;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Lua;")
    private static class622 field4086;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()I", line = 3)
    public final int method1754() {
        return field4086.method2349((byte) -59, this.field4085);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 6)
    public final void method1759(Component arg0) throws Exception {
        field4086.method2346((byte) -77, class278.field3535, arg0, class487.field6095);
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()V", line = 9)
    public final void method1766() {
        field4086.method2348(this.field4085, super.field3701);
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "()V", line = 12)
    public static void method1883() {
        field4086 = null;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 15)
    public final void method1763(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4086.method2345(this.field4085, arg0, 65535);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V", line = 22)
    public final void method1762() {
        field4086.method2350(31736, this.field4085);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V", line = 26)
    public final void method1751() {
        field4086.method2347(-3, this.field4085);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lqj;I)V", line = 28)
    public class328(class476 arg0, int arg1) {
        field4086 = (class622) arg0.method2597(29898);
        this.field4085 = arg1;
    }
}
