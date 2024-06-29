import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class class314 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Lnd;")
    public static class366 field4741 = new class366(1, 3);

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field4743 = 1;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field4745 = -1;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field4744 = 1405;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "[I")
    public static int[] field4742;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)I")
    public abstract int method1874(byte arg0);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1875(int arg0, Component arg1);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method1876(int arg0) {
        field4741 = null;
        if (arg0 != 23782) {
            method1876(-107);
        }
        field4742 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1877(Component arg0, int arg1);
}
