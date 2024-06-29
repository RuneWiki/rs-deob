import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class312 extends class252 {

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    private int field4845;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "Lbo;")
    private static class269 field4844;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "()V", line = 3)
    public static void method2214() {
        field4844 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 6)
    public final void method116(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field4844.method1973(this.field4845, (byte) -120, arg0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method119(Component arg0) throws Exception {
        field4844.method1976(arg0, class61.field946, 108, class294.field4571);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()V", line = 16)
    public final void method118() {
        field4844.method1972(7295, this.field4845);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()I", line = 19)
    public final int method117() {
        return field4844.method1975(87, this.field4845);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V", line = 23)
    public final void method114() {
        field4844.method1974(false, this.field4845);
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()V", line = 26)
    public final void method115() {
        field4844.method1977(this.field4845, this.field3871);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lua;I)V", line = 28)
    public class312(class323 arg0, int arg1) {
        field4844 = arg0.method2277(15);
        this.field4845 = arg1;
    }
}
