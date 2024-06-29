import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lic;")
    public static class59 field2711 = class59.method433(0, "<img=0>");

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lic;")
    private static class59 field2709 = class59.method433(0, "Create a free account");

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[I")
    public static int[] field2714 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lic;")
    public static class59 field2715 = class59.method433(0, "blinken2:");

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lic;")
    public static class59 field2712 = field2709;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    public static int[] field2716;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Lwf;IZ)V")
    public static final void method924(class159[] arg0, int arg1, boolean arg2) {
        field2710++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class159 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3612 == 0) {
                    if (var4.field3598 != null) {
                        method924(var4.field3598, arg1, true);
                    }
                    class41 var5 = (class41) class33.field889.method35((long) var4.field3573, 105);
                    if (var5 != null) {
                        class24.method152(-121, var5.field1044, arg1);
                    }
                }
                if (arg1 == 0 && var4.field3649 != null) {
                    class139 var6 = new class139();
                    var6.field3096 = var4.field3649;
                    var6.field3104 = var4;
                    class125.method948(var6, -30164);
                }
                if (arg1 == 1 && var4.field3576 != null) {
                    if (var4.field3567 >= 0) {
                        class159 var7 = class134.method1032(var4.field3573, 499749840);
                        if (var7 == null || var7.field3598 == null || var4.field3567 >= var7.field3598.length || var7.field3598[var4.field3567] != var4) {
                            continue;
                        }
                    }
                    class139 var8 = new class139();
                    var8.field3096 = var4.field3576;
                    var8.field3104 = var4;
                    class125.method948(var8, -30164);
                }
            }
        }
        if (!arg2) {
            field2715 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method925(int arg0) {
        field2714 = null;
        field2716 = null;
        field2712 = null;
        if (arg0 <= 73) {
            field2714 = null;
        }
        field2715 = null;
        field2711 = null;
        field2709 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lic;Ldd;BLic;Ldd;)Lub;")
    public static final class141 method926(class59 arg0, class26 arg1, byte arg2, class59 arg3, class26 arg4) {
        field2717++;
        int var5 = arg4.method201(arg3, -1);
        int var6 = arg4.method196(6, var5, arg0);
        int var7 = -49 / ((arg2 - 21) / 32);
        return client.method136(var6, var5, arg1, arg4, false);
    }
}
