import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class34 extends class184 {

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Lve;")
    private static class194 field689;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
    public final int method227() {
        return field689.method1281(-70, this.field690);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lma;I)V")
    public class34(class109 arg0, int arg1) {
        field689 = arg0.method675(44);
        this.field690 = arg1;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
    public final void method228() {
        field689.method1279(-24411, this.field690);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method229(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field689.method1282(arg0, this.field690, -2615);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
    public final void method230() {
        field689.method1283(-31455, this.field690);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method231(Component arg0) throws Exception {
        field689.method1284(class70.field1313, arg0, (byte) 111, class51.field931);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
    public static void method232() {
        field689 = null;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()V")
    public final void method233() {
        field689.method1280(this.field690, super.field3585);
    }
}
