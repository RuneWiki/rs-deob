import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class47 extends class36 {

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "Lhb;")
    private static class155 field735;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "()V", line = 3)
    public final void method247() {
        field735.method1107(this.field736, -8508);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 7)
    public final void method239(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field735.method1106(arg0, this.field736, 27280);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()V", line = 13)
    public final void method241() {
        field735.method1105(50, this.field736);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 16)
    public final void method249(Component arg0) throws Exception {
        field735.method1110(class202.field3240, class112.field1656, arg0, -112);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()I", line = 20)
    public final int method237() {
        return field735.method1108(this.field736, 7696);
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "()V", line = 23)
    public static void method340() {
        field735 = null;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lag;I)V", line = 25)
    public class47(class211 arg0, int arg1) {
        field735 = arg0.method1490(-2298);
        this.field736 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()V", line = 30)
    public final void method245() {
        field735.method1109(this.field736, this.field547);
    }
}
