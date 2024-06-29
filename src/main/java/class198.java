import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class198 extends class439 {

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
    private int field2817;

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "Lhp;")
    private static class215 field2816;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V")
    public final void method461(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2816.method1334((byte) -82, this.field2817, arg0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "()I")
    public final int method463() {
        return field2816.method1330(this.field2817, 104);
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "()V")
    public final void method460() {
        field2816.method1332(this.field2817, true);
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "()V")
    public static void method1240() {
        field2816 = null;
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "()V")
    public final void method465() {
        field2816.method1331(8770, this.field2817);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method464(Component arg0) throws Exception {
        field2816.method1333(arg0, class295.field4060, class188.field2724, 13300);
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Ldr;I)V")
    public class198(class504 arg0, int arg1) {
        field2816 = arg0.method2965((byte) 43);
        this.field2817 = arg1;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "()V")
    public final void method462() {
        field2816.method1329(this.field2817, super.field6486);
    }
}
