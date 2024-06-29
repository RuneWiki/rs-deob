import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class155 {

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "Lr;")
    private static class118 field1410;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()I")
    public final int method274() {
        return field1410.method930(true, this.field1411);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public final void method273() {
        field1410.method926(this.field1411, 21635);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ldd;I)V")
    public class57(class26 arg0, int arg1) {
        field1410 = arg0.method197(127);
        this.field1411 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public final void method272(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1410.method929(this.field1411, (byte) -12, arg0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
    public static void method405() {
        field1410 = null;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()V")
    public final void method275() {
        field1410.method931(this.field1411, (byte) 1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method276(Component arg0) throws Exception {
        field1410.method928(class144.field3258, class14.field318, -87, arg0);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
    public final void method271() {
        field1410.method927(this.field1411, super.field3514);
    }
}
