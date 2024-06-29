import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class278 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "F")
    public static float field4187 = 0.0F;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4189 = "purple:";

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Ljl;")
    public static class253 field4193 = new class253(16);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method1840(int arg0) {
        field4189 = null;
        if (arg0 == 37) {
            field4193 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static final void method1841(boolean arg0) {
        class203.field3064.method1775(27147);
        class210.field3160.method1775(27147);
        field4191++;
        if (!arg0) {
            method1841(false);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method1842(byte arg0) {
        field4188++;
        int var1 = 0;
        if (arg0 != 23) {
            field4186 = 39;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class81.method533(var1, true, class33.field487, -2873, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
