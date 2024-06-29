import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class182 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Liv;")
    public static class64 field2731 = new class64(61, 6);

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2732 = -1;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lpi;")
    public static class342 field2733 = new class342("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lpi;")
    public static class342 field2734 = new class342("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIZI)V")
    public static final void method1280(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2730++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class9.method50(class315.field4754, arg0 + arg1, class156.field2455, arg3);
        int var10 = class9.method50(class315.field4754, arg1 - arg0, class156.field2455, arg3);
        class179.method1269(class21.field430[arg4], arg2, var10, var9, 26985);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class70.field1213 && var11 <= class389.field5859) {
                    int var13 = class9.method50(class315.field4754, arg1 + var5, class156.field2455, true);
                    int var14 = class9.method50(class315.field4754, arg1 - var5, class156.field2455, true);
                    if (var12 <= class389.field5859) {
                        class179.method1269(class21.field430[var12], arg2, var14, var13, 26985);
                    }
                    if (var11 >= class70.field1213) {
                        class179.method1269(class21.field430[var11], arg2, var14, var13, 26985);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class70.field1213 <= var16 && var15 <= class389.field5859) {
                int var17 = class9.method50(class315.field4754, arg1 + var6, class156.field2455, true);
                int var18 = class9.method50(class315.field4754, arg1 - var6, class156.field2455, true);
                if (class389.field5859 >= var16) {
                    class179.method1269(class21.field430[var16], arg2, var18, var17, 26985);
                }
                if (var15 >= class70.field1213) {
                    class179.method1269(class21.field430[var15], arg2, var18, var17, 26985);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field2731 = null;
        field2733 = null;
        if (arg0 != 61) {
            field2732 = 51;
        }
        field2734 = null;
    }
}
