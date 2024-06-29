import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class193 extends class55 {

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    private int field3044;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "Lmg;")
    private static class265 field3043;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "()V")
    public static void method1348() {
        field3043 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
    public final void method394() {
        field3043.method1812(this.field3044, -24);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()I")
    public final int method403() {
        return field3043.method1813(false, this.field3044);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "()V")
    public final void method405() {
        field3043.method1814(18245, this.field3044);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lbk;I)V")
    public class193(class20 arg0, int arg1) {
        field3043 = arg0.method147(-127);
        this.field3044 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()V")
    public final void method401() {
        field3043.method1811(this.field3044, super.field766);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method404(Component arg0) throws Exception {
        field3043.method1815(false, arg0, class72.field1013, class290.field4582);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public final void method400(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3043.method1816(this.field3044, -16621, arg0);
        }
    }
}
