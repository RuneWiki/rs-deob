import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class205 extends class130 {

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public volatile int field3153 = -1;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Ljava/lang/String;")
    public volatile String field3156;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "[Ldk;")
    public static class424[] field3154 = new class424[0];

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Lka;")
    public static class477 field3155 = new class477();

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Lpr;")
    public static class243 field3157;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Li;III[Z)Z")
    public static final boolean method1434(class200 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class407.field6024 != class288.field4475) {
            int var6 = class274.field4306[arg1].method68(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class11 var8 = class274.field4306[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method68(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method66(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method61(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lsg;I)V")
    public static final void method1435(class327 arg0, int arg1) {
        arg0.field4951 = null;
        int var2 = 51 / ((arg1 - 49) / 47);
        field3152++;
        if (class188.field2883 < 20) {
            class351.field5229.method1082(arg0, -44);
            class188.field2883++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class205(String arg0) {
        this.field3156 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method1436(int arg0) {
        if (arg0 == 0) {
            field3154 = null;
            field3155 = null;
        }
    }

    static {
        new class179("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field3157 = null;
    }
}
