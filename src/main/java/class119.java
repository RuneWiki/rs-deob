import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mg")
public class class119 extends class9 {

    @OriginalMember(owner = "mg", name = "N", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "mg", name = "D", descriptor = "Lfg;")
    private static class58 field2336;

    @OriginalMember(owner = "mg", name = "d", descriptor = "()V")
    public final void method53() {
        field2336.method382(-24494, this.field2337);
    }

    @OriginalMember(owner = "mg", name = "e", descriptor = "()V")
    public static void method864() {
        field2336 = null;
    }

    @OriginalMember(owner = "mg", name = "a", descriptor = "()I")
    public final int method41() {
        return field2336.method386(this.field2337, 23);
    }

    @OriginalMember(owner = "mg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method54(Component arg0) throws Exception {
        field2336.method383(arg0, class169.field3133, 122, class23.field519);
    }

    @OriginalMember(owner = "mg", name = "<init>", descriptor = "(Lke;I)V")
    public class119(class99 arg0, int arg1) {
        field2336 = arg0.method695(105);
        this.field2337 = arg1;
    }

    @OriginalMember(owner = "mg", name = "c", descriptor = "()V")
    public final void method51() {
        field2336.method385(this.field2337, super.field136);
    }

    @OriginalMember(owner = "mg", name = "b", descriptor = "()V")
    public final void method46() {
        field2336.method381(this.field2337, (byte) -84);
    }

    @OriginalMember(owner = "mg", name = "b", descriptor = "(I)V")
    public final void method42(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2336.method384(-23762, this.field2337, arg0);
        }
    }
}
