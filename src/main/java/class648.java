import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class648 extends class41 {

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    private int field9169;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "Llo;")
    private static class751 field9168;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "()V", line = 3)
    public static void method3676() {
        field9168 = null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()I", line = 8)
    public final int method366() {
        return field9168.method1566(this.field9169, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V", line = 11)
    public final void method364() {
        field9168.method1565(this.field9169, 78);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 14)
    public final void method372(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field9168.method1561(this.field9169, -22684, arg0);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()V", line = 20)
    public final void method370() {
        field9168.method1564(this.field9169, super.field609);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 23)
    public final void method367(Component arg0) throws Exception {
        field9168.method1563((byte) 81, arg0, class215.field3077, class390.field5446);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lvk;I)V", line = 25)
    public class648(class367 arg0, int arg1) {
        field9168 = (class751) arg0.method2276((byte) 124);
        this.field9169 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "()V", line = 30)
    public final void method380() {
        field9168.method1562(true, this.field9169);
    }
}
