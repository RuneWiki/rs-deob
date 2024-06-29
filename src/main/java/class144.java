import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class144 extends class182 {

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "Lfda;")
    private static class340 field2065;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
    public static void method1091() {
        field2065 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
    public final void method245() {
        field2065.method2155(this.field2066, super.field2417);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
    public final int method249() {
        return field2065.method2157(0, this.field2066);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final void method246(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2065.method2154(this.field2066, -3227, arg0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method244(Component arg0) throws Exception {
        field2065.method2158(class386.field5629, 8000, class418.field6010, arg0);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
    public final void method248() {
        field2065.method2156(this.field2066, false);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
    public final void method247() {
        field2065.method2159(this.field2066, 0);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lqn;I)V")
    public class144(class70 arg0, int arg1) {
        field2065 = (class340) arg0.method628(-126);
        this.field2066 = arg1;
    }
}
