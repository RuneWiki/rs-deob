import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class281 extends class253 {

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    private int field5060;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "Luk;")
    private static class98 field5061;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method705(Component arg0) throws Exception {
        field5061.method717((byte) -107, arg0, class204.field3687, class140.field2443);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method701(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5061.method713(arg0, this.field5060, -10907);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()I")
    public final int method704() {
        return field5061.method712(this.field5060, 113);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Llh;I)V")
    public class281(class286 arg0, int arg1) {
        field5061 = arg0.method1952(-7407);
        this.field5060 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
    public final void method703() {
        field5061.method715(this.field5060, (byte) -97);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()V")
    public final void method706() {
        field5061.method716(this.field5060, -28786);
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "()V")
    public static void method1932() {
        field5061 = null;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()V")
    public final void method702() {
        field5061.method714(this.field5060, super.field4571);
    }
}
