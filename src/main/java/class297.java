import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class297 extends class201 {

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "Lik;")
    private static class286 field4670;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "()V", line = 3)
    public final void method1401() {
        field4670.method2060(this.field4671, this.field3048);
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "()I", line = 7)
    public final int method1410() {
        return field4670.method2057(this.field4671, 20014);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "()V", line = 11)
    public final void method1398() {
        field4670.method2059(-9306, this.field4671);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 14)
    public final void method1400(Component arg0) throws Exception {
        field4670.method2058(arg0, class349.field5573, -62, class361.field5710);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lrj;I)V", line = 16)
    public class297(class22 arg0, int arg1) {
        field4670 = arg0.method173(0);
        this.field4671 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V", line = 21)
    public final void method1411(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field4670.method2062(arg0, this.field4671, -108);
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "()V", line = 27)
    public final void method1408() {
        field4670.method2061((byte) -69, this.field4671);
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "()V", line = 30)
    public static void method2105() {
        field4670 = null;
    }
}
