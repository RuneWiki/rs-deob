import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class5 extends class241 {

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    private int field52;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "Ldg;")
    private static class210 field53;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public final void method18(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field53.method1361(arg0, false, this.field52);
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()V")
    public final void method19() {
        field53.method1359(this.field52, 92);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
    public final void method20() {
        field53.method1362(this.field52, super.field4206);
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "()V")
    public static void method21() {
        field53 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()I")
    public final int method22() {
        return field53.method1360((byte) 94, this.field52);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lik;I)V")
    public class5(class117 arg0, int arg1) {
        field53 = arg0.method779(0);
        this.field52 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method23(Component arg0) throws Exception {
        field53.method1363(class200.field3446, class162.field2909, arg0, (byte) -23);
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()V")
    public final void method24() {
        field53.method1364((byte) -117, this.field52);
    }
}
