import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class206 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
    public static int[] field2882 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public static final void method1270(int arg0, int arg1, int arg2) {
        field2884++;
        if (class323.field4400 == class11.field173) {
            if (class506.method3020(0, 0, -2096, false, -2, 1, arg1, 1, arg0)) {
                return;
            }
            class506.method3020(0, 0, -2096, false, -3, 1, arg1, 1, arg0);
        } else if (class506.method3020(0, 0, -2096, false, -3, 1, arg1, 1, arg0)) {
            return;
        } else {
            class506.method3020(0, 0, -2096, false, -2, 1, arg1, 1, arg0);
        }
        if (arg2 >= -113) {
            method1274(null, true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1271(int arg0, Component arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method1272(byte arg0) {
        field2882 = null;
        if (arg0 < 96) {
            field2881 = -125;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1273(Component arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsi;Z)Lkc;")
    public static final class87 method1274(class391 arg0, boolean arg1) {
        if (arg1) {
            method1272((byte) -8);
        }
        field2883++;
        return new class87(arg0.method2311((byte) -73), arg0.method2311((byte) -5), arg0.method2311((byte) 125), arg0.method2311((byte) -23), arg0.method2338(!arg1), arg0.method2348(-2));
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
    public abstract int method1275(int arg0);
}
