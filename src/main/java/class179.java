import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class179 {

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Lss;")
    public static class213 field2614 = new class213(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Lqu;")
    public static class219 field2617 = new class219(44, 2);

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZII)V")
    public static final void method1137(boolean arg0, int arg1, int arg2) {
        field2618++;
        class456 var3 = class233.method1654(arg1, 14, 40);
        var3.method2858(10250);
        if (arg0) {
            method1139(-71);
        }
        var3.field7042 = arg2;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIII)V")
    public static final void method1138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 50) {
            if (class141.field1911.field6109 != 0 && arg2 != 0 && class486.field7371 < 50 && arg3 != -1) {
                class357.field5540[class486.field7371++] = new class17((byte) 2, arg3, arg2, arg0, arg1, 0);
            }
            field2616++;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static void method1139(int arg0) {
        field2617 = null;
        field2614 = null;
        if (arg0 <= 36) {
            method1140(28, true);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
    public static final void method1140(int arg0, boolean arg1) {
        if (!arg1) {
            field2614 = null;
        }
        field2615++;
        class456 var2 = class233.method1654(arg0, 4, -9);
        var2.method2862(0);
    }

    static {
        new class213(null, "geschickt werden.", null, null);
        new class213("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field2619 = 2;
    }
}
