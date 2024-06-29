import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class222 {

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3037 = 0;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3040 = "Loading wordpack - ";

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Ltq;")
    public static class375 field3038;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIII)V")
    public static final void method1445(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = 31 % ((arg0 + 56) / 53);
        if (arg3 == 1011) {
            class387.method2474(10, arg2, arg1);
        } else if (arg3 == 1010) {
            class387.method2474(11, arg2, arg1);
        } else if (arg3 == 1008) {
            class387.method2474(12, arg2, arg1);
        } else if (arg3 == 1003) {
            class387.method2474(13, arg2, arg1);
        } else if (arg3 == 1006) {
            class387.method2474(14, arg2, arg1);
        }
        field3036++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public static void method1446(byte arg0) {
        if (arg0 > -44) {
            field3040 = null;
        }
        field3038 = null;
        field3040 = null;
    }
}
