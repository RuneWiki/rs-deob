import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class3 {

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "Lj;")
    private static class62 field93;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
    public final void method16() {
        field93.method451(-82, this.field94);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method30(Component arg0) throws Exception {
        field93.method455(8054, arg0, class126.field2922, class87.field2075);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lcf;I)V")
    public class4(class21 arg0, int arg1) {
        field93 = arg0.method122(0);
        this.field94 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()V")
    public final void method27() {
        field93.method450(this.field94, super.field63);
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "()V")
    public static void method33() {
        field93 = null;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()V")
    public final void method28() {
        field93.method452(this.field94, -12708);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field93.method453(-13148, this.field94, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
    public final int method24() {
        return field93.method454(this.field94, 5505);
    }
}
