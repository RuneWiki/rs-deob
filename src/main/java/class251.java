import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class251 extends class173 {

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    private int field4417;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "Lhh;")
    private static class110 field4418;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "()V")
    public final void method941() {
        field4418.method800(this.field4417, (byte) -112);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lsc;I)V")
    public class251(class229 arg0, int arg1) {
        field4418 = arg0.method1569(2);
        this.field4417 = arg1;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public final void method944(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4418.method801(this.field4417, arg0, -94);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
    public final void method942() {
        field4418.method802(this.field4417, (byte) -69);
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "()I")
    public final int method943() {
        return field4418.method797(this.field4417, 87);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "()V")
    public static void method1707() {
        field4418 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
    public final void method945() {
        field4418.method799(this.field4417, super.field2841);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method946(Component arg0) throws Exception {
        field4418.method798(class34.field498, class156.field2568, 23945, arg0);
    }
}
