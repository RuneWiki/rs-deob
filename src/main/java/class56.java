import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class56 extends class225 {

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Lsi;")
    private static class300 field770;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "()V", line = 3)
    public final void method362() {
        field770.method2033(this.field771, this.field3771);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 6)
    public final void method363(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field770.method2034(arg0, this.field771, (byte) -58);
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "()V", line = 12)
    public static void method364() {
        field770 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 16)
    public final void method365(Component arg0) throws Exception {
        field770.method2032(class205.field3493, true, arg0, class141.field2355);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()I", line = 19)
    public final int method366() {
        return field770.method2036(this.field771, false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 22)
    public final void method367() {
        field770.method2031(this.field771, 124);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 25)
    public final void method368() {
        field770.method2035(28991, this.field771);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lui;I)V", line = 28)
    public class56(class251 arg0, int arg1) {
        field770 = arg0.method1699(16);
        this.field771 = arg1;
    }
}
