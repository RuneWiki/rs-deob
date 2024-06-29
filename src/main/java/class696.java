import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class696 {

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public int field9838;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lfba;")
    public static class348 field9836 = new class348(30);

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    public static int field9837;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field9834;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public static final void method3917(int arg0) {
        field9835++;
        for (class194 var1 = (class194) class225.field3348.method3025(false); var1 != null; var1 = (class194) class225.field3348.method3026(true)) {
            if (var1.field2845 > 1) {
                var1.field2845 = 0;
                field9836.method2213((byte) -16, ((class304) var1.field2841.field7165.field5596).field4153, var1);
                var1.field2841.method3031(17294);
            }
        }
        class654.field9376 = 0;
        class456.field6499 = 0;
        class303.field4137.method3553(arg0);
        class326.field4420.method4013(-3);
        class225.field3348.method3031(17294);
        class147.field2154 = false;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V")
    public static void method3918(byte arg0) {
        field9834 = null;
        if (arg0 == 4) {
            field9836 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9839++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(II)V")
    public class696(int arg0, int arg1) {
        this.field9838 = arg0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLl;II)V")
    public static final void method3919(byte arg0, class639 arg1, int arg2, int arg3) {
        field9837++;
        int[] var4 = new int[4];
        class85.method685(var4, 0, var4.length, arg3);
        class265.method1748(arg1, arg2, (byte) -46, var4);
        if (arg0 >= -81) {
            field9836 = null;
        }
    }
}
