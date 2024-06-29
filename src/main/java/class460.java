import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class460 extends class660 {

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
    public static int field6459 = 0;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)Lgfa;")
    public static final class696 method2716(int arg0, int arg1) {
        field6460++;
        class696[] var2 = class368.method2126((byte) 104);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field9863 == arg0) {
                return var2[var3];
            }
        }
        if (arg1 <= 113) {
            field6459 = 69;
        }
        return null;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lr;B)V")
    public static final void method2717(class165 arg0, byte arg1) {
        field6458++;
        int var2 = -104 / ((64 - arg1) / 57);
        for (class684 var3 = (class684) class24.field580.method2070((byte) 105); var3 != null; var3 = (class684) class24.field580.method2068(-2001)) {
            if (var3.field9778) {
                var3.method3872(arg0);
            }
        }
    }
}
