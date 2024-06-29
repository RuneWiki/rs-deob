import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class156 {

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public int field2771 = -1;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field2768 = 0;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field2776 = 0;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2762 = "Loaded wordpack";

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public int field2766;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lnn;")
    public static class45 field2773;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 6)
    public static void method1245(byte arg0) {
        if (arg0 < 120) {
            method1246(116, 74, -8, 18L);
        }
        field2773 = null;
        field2762 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIJ)Z", line = 20)
    public static final boolean method1246(int arg0, int arg1, int arg2, long arg3) {
        class257 var5 = class279.field4430[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4146 != null && var5.field4146.field4732 == arg3) {
            return true;
        } else if (var5.field4152 != null && var5.field4152.field701 == arg3) {
            return true;
        } else if (var5.field4140 != null && var5.field4140.field5260 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4150; var6++) {
                if (var5.field4147[var6].field3936 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
