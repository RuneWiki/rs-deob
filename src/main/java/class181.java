import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class181 extends class225 {

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    private int field2903;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "Lm;")
    private static class242 field2904;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()V", line = 3)
    public final void method936() {
        field2904.method1599(this.field2903, this.field3540);
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()V", line = 7)
    public final void method931() {
        field2904.method1600(this.field2903, -124);
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()V", line = 10)
    public static void method1140() {
        field2904 = null;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()I", line = 14)
    public final int method934() {
        return field2904.method1604(this.field2903, (byte) 110);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 17)
    public final void method933(Component arg0) throws Exception {
        field2904.method1601(class119.field2071, arg0, class303.field4596, false);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()V", line = 20)
    public final void method935() {
        field2904.method1603(this.field2903, -18601);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lte;I)V", line = 22)
    public class181(class124 arg0, int arg1) {
        field2904 = arg0.method816(9);
        this.field2903 = arg1;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 27)
    public final void method932(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2904.method1602(-30058, arg0, this.field2903);
    }
}
