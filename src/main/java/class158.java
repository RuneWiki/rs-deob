import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class158 extends class145 {

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    private int field2704;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "Ldd;")
    private static class278 field2703;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()V", line = 4)
    public final void method1005() {
        field2703.method1945(this.field2704, this.field2442);
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "()V", line = 7)
    public static void method1074() {
        field2703 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V", line = 10)
    public final void method992() {
        field2703.method1950(false, this.field2704);
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V", line = 13)
    public final void method1008(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2703.method1947(this.field2704, arg0, 24152);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()I", line = 19)
    public final int method993() {
        return field2703.method1948((byte) 89, this.field2704);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lme;I)V", line = 22)
    public class158(class295 arg0, int arg1) {
        field2703 = arg0.method2074(0);
        this.field2704 = arg1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 27)
    public final void method997(Component arg0) throws Exception {
        field2703.method1949(class125.field2227, -81, class83.field1408, arg0);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()V", line = 30)
    public final void method1001() {
        field2703.method1946(-10524, this.field2704);
    }
}
