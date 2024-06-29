import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 extends class132 {

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    private int field3495;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Lbc;")
    private static class11 field3494;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
    public static void method1164() {
        field3494 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
    public final void method402() {
        field3494.method89(this.field3495, super.field2895);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()I")
    public final int method398() {
        return field3494.method88(true, this.field3495);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method399(Component arg0) throws Exception {
        field3494.method86(false, class41.field765, arg0, class84.field1873);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
    public final void method397() {
        field3494.method87((byte) 119, this.field3495);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public final void method401(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3494.method85(this.field3495, -26376, arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
    public final void method400() {
        field3494.method84(this.field3495, true);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lq;I)V")
    public class153(class111 arg0, int arg1) {
        field3494 = arg0.method878(-126);
        this.field3495 = arg1;
    }
}
