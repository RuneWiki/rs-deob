import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class140 {

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "Llo;")
    public static class306 field2327 = new class306("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2328 = new String[100];

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2329 = -1;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field2330 = -1;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1042(int arg0, int arg1, int arg2) {
        if (arg1 == 34) {
            field2326++;
            return (arg0 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 14)
    public static void method1043(int arg0) {
        field2328 = null;
        field2327 = null;
        if (arg0 != -1) {
            field2328 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V", line = 32)
    public static final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class29.field460 && arg3 <= class472.field6996) {
            int var5 = class52.method367(arg0, class235.field4076, (byte) 111, class182.field2877);
            int var6 = class52.method367(arg1, class235.field4076, (byte) -82, class182.field2877);
            class107.method778(arg3, var5, var6, arg2, (byte) 107);
        }
        field2324++;
        if (arg4 != -5267) {
            method1043(95);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 53)
    public static final void method1045(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field2325++;
        for (class283 var1 = (class283) class240.field4130.method2538(-3); var1 != null; var1 = (class283) class240.field4130.method2535((byte) -127)) {
            if (var1.field4629 > 0) {
                var1.field4629--;
            }
            if (var1.field4629 != 0) {
                if (var1.field4630 > 0) {
                    var1.field4630--;
                }
                if (var1.field4630 == 0 && var1.field4621 >= 1 && var1.field4628 >= 1 && class217.field3775 - 2 >= var1.field4621 && (class277.field4548 - 2) >= var1.field4628 && (var1.field4618 < 0 || class534.method3169(var1.field4625, (byte) 69, var1.field4618))) {
                    class197.method1303(var1.field4626, var1.field4621, var1.field4628, false, var1.field4618, var1.field4623, -1, var1.field4625, var1.field4627);
                    var1.field4630 = -1;
                    if (var1.field4618 == var1.field4617 && var1.field4617 == -1) {
                        var1.method1821((byte) -112);
                    } else if (var1.field4618 == var1.field4617 && var1.field4626 == var1.field4622 && var1.field4631 == var1.field4625) {
                        var1.method1821((byte) 38);
                    }
                }
            } else if (var1.field4617 < 0 || class534.method3169(var1.field4631, (byte) -92, var1.field4617)) {
                class197.method1303(var1.field4622, var1.field4621, var1.field4628, false, var1.field4617, var1.field4623, -1, var1.field4631, var1.field4627);
                var1.method1821((byte) 117);
            }
        }
    }
}
