import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class117 extends class54 {

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "[I")
    public int[] field2095 = new int[1];

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "[I")
    public int[] field2104 = new int[] { -1 };

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "[Lih;")
    public static class94[] field2093 = new class94[100];

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Ldc;")
    public static class37 field2094 = class185.method1233((byte) 86, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Ldc;")
    public static class37 field2098 = class185.method1233((byte) 86, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "[I")
    public static int[] field2099 = new int[50];

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Ldc;")
    public static class37 field2102 = class185.method1233((byte) 86, "<col=ff7000>");

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Ldc;")
    private static class37 field2101 = class185.method1233((byte) 86, "Members only world");

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field2103 = 0;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Ldc;")
    public static class37 field2096 = field2101;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Ldj;")
    public static class44 field2097;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lih;")
    public static final class94 method813(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field290; var4++) {
            class94 var5 = var3.field289[var4];
            if ((var5.field1641 >> 29 & 0x3L) == 2L && var5.field1639 == arg1 && var5.field1645 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static void method814(boolean arg0) {
        field2101 = null;
        field2099 = null;
        field2098 = null;
        field2093 = null;
        if (!arg0) {
            field2102 = null;
            field2094 = null;
            field2097 = null;
            field2096 = null;
        }
    }
}
