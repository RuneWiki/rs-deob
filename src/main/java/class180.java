import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class180 extends class280 {

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    private int field2586;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "Lcd;")
    private static class197 field2585;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
    public final void method1141() {
        field2585.method1230(true, this.field2586);
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "()V")
    public static void method1142() {
        field2585 = null;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()V")
    public final void method1143() {
        field2585.method1229(this.field2586, (byte) -109);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()V")
    public final void method1144() {
        field2585.method1231(this.field2586, super.field3981);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public final void method1145(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2585.method1228(this.field2586, arg0, -28440);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
    public final int method1146() {
        return field2585.method1227(this.field2586, (byte) 107);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1147(Component arg0) throws Exception {
        field2585.method1232(class281.field4017, arg0, -123, class266.field3763);
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lqn;I)V")
    public class180(class44 arg0, int arg1) {
        field2585 = arg0.method336(-91);
        this.field2586 = arg1;
    }
}
