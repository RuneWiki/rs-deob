import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class727 extends class793 {

    @OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
    private int field10655;

    @OriginalMember(owner = "client!sfa", name = "O", descriptor = "Las;")
    private static class160 field10654;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method3318(Component arg0) throws Exception {
        field10654.method1512(class210.field3321, arg0, class426.field6729, (byte) -67);
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "()V")
    public final void method3319() {
        field10654.method1509(this.field10655, super.field11574);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V")
    public final void method3316() {
        field10654.method1511(this.field10655, (byte) 97);
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "()V")
    public final void method3315() {
        field10654.method1508(this.field10655, (byte) 125);
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "()I")
    public final int method3320() {
        return field10654.method1507(this.field10655, 65535);
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
    public final void method3317(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field10654.method1510(0, this.field10655, arg0);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "()V")
    public static void method5278() {
        field10654 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Ltga;I)V")
    public class727(class61 arg0, int arg1) {
        field10654 = (class160) arg0.method630(8429);
        this.field10655 = arg1;
    }
}
