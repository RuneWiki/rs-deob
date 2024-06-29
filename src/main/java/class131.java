import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class131 extends class267 {

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    private int field2042;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "Lfj;")
    private static class240 field2043;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "()V", line = 3)
    public static void method996() {
        field2043 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 6)
    public final void method126(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2043.method1666(arg0, this.field2042, -117);
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()V", line = 12)
    public final void method130() {
        field2043.method1662(this.field2042, this.field3996);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()V", line = 15)
    public final void method131() {
        field2043.method1663(-123, this.field2042);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 18)
    public final void method127(Component arg0) throws Exception {
        field2043.method1664(class41.field607, arg0, class196.field3112, -25528);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 23)
    public final void method129() {
        field2043.method1667(this.field2042, 23697);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lna;I)V", line = 25)
    public class131(class26 arg0, int arg1) {
        field2043 = arg0.method169((byte) 80);
        this.field2042 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()I", line = 30)
    public final int method128() {
        return field2043.method1665(121, this.field2042);
    }
}
