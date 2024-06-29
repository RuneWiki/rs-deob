import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class378 extends class635 {

    @OriginalMember(owner = "client!mga", name = "I", descriptor = "I")
    private int field5301;

    @OriginalMember(owner = "client!mga", name = "H", descriptor = "Liba;")
    private static class238 field5300;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "()V", line = 3)
    public final void method2277() {
        field5300.method1272(this.field5301, super.field8966);
    }

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "()V", line = 6)
    public static void method2278() {
        field5300 = null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "()V", line = 9)
    public final void method2279() {
        field5300.method1274(-90, this.field5301);
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "()V", line = 12)
    public final void method2280() {
        field5300.method1276(this.field5301, 16766);
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "()I", line = 16)
    public final int method2281() {
        return field5300.method1273(this.field5301, (byte) 88);
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V", line = 20)
    public final void method2282(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5300.method1271(arg0, -93, this.field5301);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 26)
    public final void method2283(Component arg0) throws Exception {
        field5300.method1275(class702.field9843, arg0, class209.field3076, (byte) -128);
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lcea;I)V", line = 28)
    public class378(class111 arg0, int arg1) {
        field5300 = (class238) arg0.method913(-93);
        this.field5301 = arg1;
    }
}
