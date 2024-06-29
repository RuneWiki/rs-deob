import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class53 extends class104 {

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "Lck;")
    private static class213 field747;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "()V")
    public static void method411() {
        field747 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public final void method412(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field747.method1430(this.field746, -27840, arg0);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()V")
    public final void method413() {
        field747.method1429(this.field746, -54);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method414(Component arg0) throws Exception {
        field747.method1432(arg0, class278.field4456, 101, class29.field343);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "()V")
    public final void method415() {
        field747.method1431(this.field746, 14309);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lcb;I)V")
    public class53(class255 arg0, int arg1) {
        field747 = arg0.method1676(122);
        this.field746 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()V")
    public final void method416() {
        field747.method1433(this.field746, super.field1731);
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "()I")
    public final int method417() {
        return field747.method1434(18431, this.field746);
    }
}
