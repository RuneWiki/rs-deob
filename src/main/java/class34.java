import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class34 extends class362 {

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "Lrb;")
    private static class265 field430;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "()V", line = 3)
    public static void method274() {
        field430 = null;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V", line = 6)
    public final void method275(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field430.method1741(this.field431, 14408, arg0);
        }
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "()V", line = 13)
    public final void method276() {
        field430.method1739(92, this.field431);
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "()I", line = 16)
    public final int method277() {
        return field430.method1738(-20572, this.field431);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 20)
    public final void method278(Component arg0) throws Exception {
        field430.method1736(class436.field6165, arg0, true, class144.field2047);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lng;I)V", line = 22)
    public class34(class153 arg0, int arg1) {
        field430 = arg0.method1043(0);
        this.field431 = arg1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "()V", line = 27)
    public final void method279() {
        field430.method1737(this.field431, super.field5483);
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "()V", line = 30)
    public final void method280() {
        field430.method1740((byte) -126, this.field431);
    }
}
