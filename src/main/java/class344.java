import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class344 extends class177 {

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    private int field5346;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Lpg;")
    private static class103 field5345;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public final void method1055(Component arg0) throws Exception {
        field5345.method700(class282.field4337, arg0, class162.field2508, (byte) 4);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 6)
    public static void method2393() {
        field5345 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 9)
    public final void method1051() {
        field5345.method698(this.field5346, 89);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()I", line = 12)
    public final int method1050() {
        return field5345.method701(-16894, this.field5346);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 15)
    public final void method1054(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field5345.method702(arg0, this.field5346, false);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 21)
    public final void method1053() {
        field5345.method697(this.field5346, this.field2707);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 25)
    public final void method1052() {
        field5345.method699((byte) -52, this.field5346);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lwe;I)V", line = 28)
    public class344(class224 arg0, int arg1) {
        field5345 = arg0.method1510(1);
        this.field5346 = arg1;
    }
}
