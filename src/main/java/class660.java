import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public abstract class class660 extends class60 {

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "[I")
    public static int[] field9256;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)V")
    public static void method3664(byte arg0) {
        field9256 = null;
        if (arg0 != -126) {
            method3665(-60);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)Lica;")
    public abstract class219 method3175(int arg0);

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
    public static final void method3665(int arg0) {
        if (arg0 != -1) {
            field9256 = null;
        }
        if (class247.field3061 == 1 || class247.field3061 == 3 || class247.field3061 != class145.field1602 && (class247.field3061 == 0 || class145.field1602 == 0)) {
            class651.field9144 = 0;
            class53.field533 = 0;
            class274.field3433.method3667(5488);
        }
        field9257++;
        class145.field1602 = class247.field3061;
    }
}
