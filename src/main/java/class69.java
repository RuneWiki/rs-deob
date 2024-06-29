import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class69 extends class27 {

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "Lsk;")
    private static class248 field861;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public final void method2(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field861.method1718(this.field862, -43, arg0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "()V")
    public static void method389() {
        field861 = null;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "()V")
    public final void method4() {
        field861.method1720(30756, this.field862);
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "()I")
    public final int method1() {
        return field861.method1717(this.field862, true);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
    public final void method6() {
        field861.method1722(this.field862, 11804);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method5(Component arg0) throws Exception {
        field861.method1721(arg0, class226.field3636, class280.field4448, false);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()V")
    public final void method3() {
        field861.method1719(this.field862, super.field362);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lcg;I)V")
    public class69(class48 arg0, int arg1) {
        field861 = arg0.method278((byte) -128);
        this.field862 = arg1;
    }
}
