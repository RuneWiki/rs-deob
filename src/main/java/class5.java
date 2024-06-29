import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class65 {

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Lgj;")
    private static class240 field83;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V")
    public final void method18() {
        field83.method1520((byte) 11, this.field84);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()I")
    public final int method19() {
        return field83.method1518(this.field84, (byte) -81);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()V")
    public final void method20() {
        field83.method1521(-26451, this.field84);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method21(Component arg0) throws Exception {
        field83.method1522(class248.field3764, 4610, class275.field4153, arg0);
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "()V")
    public static void method22() {
        field83 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lfg;I)V")
    public class5(class12 arg0, int arg1) {
        field83 = arg0.method57(0);
        this.field84 = arg1;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public final void method23(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field83.method1523(1240, this.field84, arg0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()V")
    public final void method24() {
        field83.method1519(this.field84, super.field1029);
    }
}
