import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class287 extends class260 {

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    private int field4297;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "Lin;")
    private static class168 field4298;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "()I")
    public final int method1638() {
        return field4298.method1166(this.field4297, -13412);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
    public final void method1632() {
        field4298.method1170(this.field4297, super.field3877);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "()V")
    public final void method1633() {
        field4298.method1168(this.field4297, -117);
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "()V")
    public final void method1640() {
        field4298.method1169(this.field4297, 73);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1639(Component arg0) throws Exception {
        field4298.method1167(arg0, class208.field3009, (byte) -128, class116.field1749);
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "()V")
    public static void method1776() {
        field4298 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lec;I)V")
    public class287(class109 arg0, int arg1) {
        field4298 = arg0.method839((byte) 88);
        this.field4297 = arg1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public final void method1626(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4298.method1171((byte) -30, arg0, this.field4297);
        }
    }
}
