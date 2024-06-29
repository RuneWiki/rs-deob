import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class252 extends class160 {

    @OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!mv", name = "L", descriptor = "Lql;")
    private static class514 field3636;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "()V")
    public final void method1148() {
        field3636.method3049(this.field3637, (byte) -108);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1163(Component arg0) throws Exception {
        field3636.method3045(class471.field6941, class275.field3991, arg0, false);
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "()V")
    public final void method1158() {
        field3636.method3048(-26520, this.field3637);
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "()I")
    public final int method1152() {
        return field3636.method3047(this.field3637, (byte) -85);
    }

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "()V")
    public static void method1604() {
        field3636 = null;
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
    public final void method1161(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3636.method3050((byte) -44, arg0, this.field3637);
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lci;I)V")
    public class252(class312 arg0, int arg1) {
        field3636 = arg0.method1960((byte) 43);
        this.field3637 = arg1;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "()V")
    public final void method1151() {
        field3636.method3046(this.field3637, super.field2416);
    }
}
