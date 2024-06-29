import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class31 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lgg;")
    public static class273 field483 = new class273();

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lvt;")
    public static class344 field485 = new class344("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lgaa;")
    public static class279 field488;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field487;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method182(byte arg0) {
        field483 = null;
        field487 = null;
        field485 = null;
        int var1 = -3 % ((arg0 + 63) / 61);
        field488 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class594.field8575 <= (arg5 - arg1) && class355.field4972 >= (arg1 + arg5) && class535.field7467 <= arg3 - arg1 && class113.field1453 >= arg1 + arg3) {
            class500.method2795(arg1, arg3, arg2, arg5, 13371, arg0, arg6);
        } else {
            class228.method1442(-123, arg3, arg0, arg1, arg5, arg6, arg2);
        }
        field484++;
        if (arg4 < 72) {
            field483 = null;
        }
    }
}
