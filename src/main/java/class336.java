import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class336 extends class151 {

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    private int field5432;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "Lfl;")
    private static class354 field5431;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()V", line = 3)
    public final void method710() {
        field5431.method2470(15106, this.field5432);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 7)
    public final void method705(Component arg0) throws Exception {
        field5431.method2469(arg0, false, class322.field5294, class228.field3587);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "()I", line = 10)
    public final int method706() {
        return field5431.method2471(this.field5432, (byte) 29);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "()V", line = 13)
    public final void method708() {
        field5431.method2472(this.field5432, 64);
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V", line = 16)
    public final void method709(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field5431.method2474((byte) 1, arg0, this.field5432);
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "()V", line = 22)
    public final void method707() {
        field5431.method2473(this.field5432, this.field2438);
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "()V", line = 25)
    public static void method2383() {
        field5431 = null;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Luo;I)V", line = 28)
    public class336(class274 arg0, int arg1) {
        field5431 = arg0.method1953((byte) 89);
        this.field5432 = arg1;
    }
}
