import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Llt;")
    public static class475 field283 = new class475("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lbh;")
    public static class28 field284;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -47 / ((77 - arg1) / 49);
        field285++;
        for (class429 var8 = (class429) class504.field7390.method1873((byte) 81); var8 != null; var8 = (class429) class504.field7390.method1880(-61)) {
            if (class317.field4559 >= var8.field6417) {
                var8.method2289((byte) -55);
            } else {
                class12.method78(0, (var8.field6418 << 7) + 64, arg2, (var8.field6415 << 7) + 64, arg5 >> 1, var8.field6414 * 2, var8.field6411, arg3, arg6 >> 1);
                class294.field4202.method2915(var8.field6407 | 0xFF000000, 0, class158.field2321[0] + arg4, class158.field2321[1] + arg0, var8.field6410, true);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method165(byte arg0) {
        field284 = null;
        if (arg0 != 55) {
            method164(-125, 64, -45, -59, 68, -60, 34);
        }
        field283 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIBI)V")
    public static final void method166(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field287++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class42.method249(class494.field7297, arg0 + arg2, (byte) -72, class445.field6629);
        int var10 = class42.method249(class494.field7297, arg2 - arg0, (byte) -72, class445.field6629);
        class415.method2491(var9, var10, class339.field4800[arg1], arg4, -31541);
        int var11 = -41 / ((arg3 + 60) / 62);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var12 = arg1 - var6;
                int var13 = arg1 + var6;
                if (class37.field393 <= var13 && class509.field7436 >= var12) {
                    int var14 = class42.method249(class494.field7297, arg2 + var5, (byte) -72, class445.field6629);
                    int var15 = class42.method249(class494.field7297, arg2 - var5, (byte) -72, class445.field6629);
                    if (class509.field7436 >= var13) {
                        class415.method2491(var14, var15, class339.field4800[var13], arg4, -31541);
                    }
                    if (class37.field393 <= var12) {
                        class415.method2491(var14, var15, class339.field4800[var12], arg4, -31541);
                    }
                }
            }
            var5++;
            int var16 = arg1 - var5;
            int var17 = arg1 + var5;
            if (class37.field393 <= var17 && class509.field7436 >= var16) {
                int var18 = class42.method249(class494.field7297, arg2 + var6, (byte) -72, class445.field6629);
                int var19 = class42.method249(class494.field7297, arg2 - var6, (byte) -72, class445.field6629);
                if (var17 <= class509.field7436) {
                    class415.method2491(var18, var19, class339.field4800[var17], arg4, -31541);
                }
                if (class37.field393 <= var16) {
                    class415.method2491(var18, var19, class339.field4800[var16], arg4, -31541);
                }
            }
        }
    }
}
