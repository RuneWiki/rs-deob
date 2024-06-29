import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class288 extends class134 {

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4503 = "scroll:";

    @OriginalMember(owner = "client!h", name = "p", descriptor = "[Lkk;")
    public static class248[] field4502 = new class248[8];

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lub;")
    public static class92 field4500;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static void method1924(boolean arg0) {
        field4502 = null;
        field4503 = null;
        if (!arg0) {
            field4500 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Ldf;")
    public static final class56 method1925(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class56 var4 = var3.field364;
            var3.field364 = null;
            return var4;
        }
    }
}
