import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class435 extends class648 {

    @OriginalMember(owner = "client!sfa", name = "K", descriptor = "I")
    private int field6011;

    @OriginalMember(owner = "client!sfa", name = "J", descriptor = "Lth;")
    private static class678 field6010;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 4)
    public final void method469(Component arg0) throws Exception {
        field6010.method2593(-1, class129.field1643, arg0, class519.field7166);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V", line = 7)
    public final void method470() {
        field6010.method2592(0, this.field6011);
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "()V", line = 10)
    public static void method2498() {
        field6010 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V", line = 13)
    public final void method465(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6010.method2591(17181, this.field6011, arg0);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "()I", line = 19)
    public final int method468() {
        return field6010.method2589(this.field6011, (byte) -26);
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "()V", line = 22)
    public final void method467() {
        field6010.method2590(this.field6011, super.field9158);
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lcr;I)V", line = 25)
    public class435(class112 arg0, int arg1) {
        field6010 = (class678) arg0.method628(-19177);
        this.field6011 = arg1;
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "()V", line = 30)
    public final void method466() {
        field6010.method2588(0, this.field6011);
    }
}
