import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class221 extends class537 {

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "Llt;")
    private static class703 field3403;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I", line = 3)
    public final int method118() {
        return field3403.method4154(this.field3404, 1);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 6)
    public final void method122(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3403.method4156(7916, this.field3404, arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()V", line = 13)
    public final void method121() {
        field3403.method4157(this.field3404, 12699);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()V", line = 16)
    public final void method120() {
        field3403.method4158(this.field3404, super.field7861);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 20)
    public final void method119(Component arg0) throws Exception {
        field3403.method4155(-124, class598.field8803, class247.field3844, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lmca;I)V", line = 22)
    public class221(class33 arg0, int arg1) {
        field3403 = (class703) arg0.method215(-97);
        this.field3404 = arg1;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()V", line = 27)
    public final void method123() {
        field3403.method4153(-103, this.field3404);
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()V", line = 30)
    public static void method1924() {
        field3403 = null;
    }
}
