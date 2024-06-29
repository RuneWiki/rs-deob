import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class33 extends class195 {

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "Lck;")
    private static class275 field528;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 4)
    public final void method226(Component arg0) throws Exception {
        field528.method1906(class175.field3109, arg0, class305.field5277, -15867);
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()V", line = 7)
    public final void method227() {
        field528.method1904(this.field527, -28249);
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "()V", line = 11)
    public static void method228() {
        field528 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()I", line = 14)
    public final int method229() {
        return field528.method1905(this.field527, -23978);
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "()V", line = 17)
    public final void method230() {
        field528.method1908(this.field527, this.field3570);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lff;I)V", line = 19)
    public class33(class4 arg0, int arg1) {
        field528 = arg0.method35((byte) 67);
        this.field527 = arg1;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()V", line = 24)
    public final void method231() {
        field528.method1903(this.field527, -6609);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 27)
    public final void method232(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field528.method1907(arg0, (byte) 119, this.field527);
    }
}
