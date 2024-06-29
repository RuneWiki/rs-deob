import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class329 extends class14 {

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    private int field5282;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lrd;")
    private static class193 field5283;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "()V", line = 3)
    public static void method2347() {
        field5283 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()I", line = 6)
    public final int method139() {
        return field5283.method1335(this.field5282, (byte) 84);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 9)
    public final void method138(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field5283.method1338(-32519, arg0, this.field5282);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 15)
    public final void method144(Component arg0) throws Exception {
        field5283.method1340(arg0, class277.field4510, class194.field3261, true);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()V", line = 18)
    public final void method147() {
        field5283.method1339(this.field5282, 17265);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()V", line = 21)
    public final void method143() {
        field5283.method1337(this.field5282, (byte) -119);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()V", line = 24)
    public final void method149() {
        field5283.method1336(this.field5282, this.field413);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lla;I)V", line = 27)
    public class329(class157 arg0, int arg1) {
        field5283 = arg0.method1109(28458);
        this.field5282 = arg1;
    }
}
