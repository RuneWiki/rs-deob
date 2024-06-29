import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class244 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3881 = 0;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3883 = "scroll:";

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lmf;")
    public static class53 field3884;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
    public static int[] field3885;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 17)
    public static void method1730(boolean arg0) {
        field3884 = null;
        field3883 = null;
        if (arg0) {
            field3885 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1731(int arg0) {
        field3882++;
        class84 var1 = class289.field4555;
        synchronized (class289.field4555) {
            class99.field1518 = class30.field423;
            class42.field586++;
            if (class151.field2317 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class333.field5177[var2] = false;
                }
                class151.field2317 = class142.field2119;
            } else {
                while (class151.field2317 != class142.field2119) {
                    int var3 = class256.field4064[class142.field2119];
                    class142.field2119 = class142.field2119 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class333.field5177[var3] = true;
                    } else {
                        class333.field5177[~var3] = false;
                    }
                }
            }
            if (arg0 >= 49) {
                class30.field423 = class119.field1832;
            }
        }
    }
}
