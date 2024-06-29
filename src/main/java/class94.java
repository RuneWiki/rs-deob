import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class94 extends class167 {

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "Lrj;")
    private static class25 field1365;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method600(Component arg0) throws Exception {
        field1365.method222(class245.field3463, -15517, class55.field899, arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
    public final void method599() {
        field1365.method220(this.field1364, super.field2476);
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()V")
    public final void method601() {
        field1365.method223(24068, this.field1364);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
    public final void method603() {
        field1365.method221(1871, this.field1364);
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "()V")
    public static void method617() {
        field1365 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Ldq;I)V")
    public class94(class14 arg0, int arg1) {
        field1365 = arg0.method135((byte) 27);
        this.field1364 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()I")
    public final int method602() {
        return field1365.method225(false, this.field1364);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public final void method598(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1365.method224(this.field1364, arg0, false);
        }
    }
}
