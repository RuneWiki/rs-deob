import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class667 extends class65 {

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
    private int field9281;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "Lg;")
    private static class157 field9282;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
    public final void method496(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field9282.method596(arg0, false, this.field9281);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "()V")
    public final void method503() {
        field9282.method599(this.field9281, super.field712);
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "()V")
    public final void method508() {
        field9282.method597(111, this.field9281);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "()I")
    public final int method504() {
        return field9282.method598((byte) 125, this.field9281);
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "()V")
    public final void method505() {
        field9282.method601(this.field9281, (byte) -123);
    }

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "()V")
    public static void method3761() {
        field9282 = null;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lfl;I)V")
    public class667(class739 arg0, int arg1) {
        field9282 = (class157) arg0.method4135(false);
        this.field9281 = arg1;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method499(Component arg0) throws Exception {
        field9282.method600(class460.field6375, 103, arg0, class478.field6609);
    }
}
