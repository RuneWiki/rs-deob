import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class130 {

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2115 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "[Z")
    public static boolean[] field2117 = new boolean[8];

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "Lbv;")
    public static class567 field2118 = new class567("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "Lbv;")
    public static class567 field2119 = new class567("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIII)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3) {
        field2113++;
        class366 var4 = class584.field8319[arg0][arg3];
        if (arg2 == 16761528) {
            class276.method1776(var4 == null ? class32.field438 : var4, (byte) -118, arg1);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lne;Z)I")
    public static final int method1015(class175 arg0, boolean arg1) {
        field2112++;
        if (arg1) {
            method1015(null, false);
        }
        if (class529.field7354 == arg0) {
            return 9216;
        } else if (class491.field6900 == arg0) {
            return 34065;
        } else if (class133.field2150 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
    public static void method1016(int arg0) {
        if (arg0 == 0) {
            field2119 = null;
            field2118 = null;
            field2115 = null;
            field2117 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)V")
    public static final void method1017(int arg0, int arg1) {
        class184 var2 = class277.field4051[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class184 var4 = class277.field4051[var3][arg0][arg1] = class277.field4051[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2656--;
                for (class277 var5 = var4.field2675; var5 != null; var5 = var5.field4045) {
                    class360 var6 = var5.field4044;
                    if (var6.field5117 == arg0 && var6.field5113 == arg1) {
                        var6.field5116--;
                    }
                }
            }
        }
        if (class277.field4051[0][arg0][arg1] == null) {
            class277.field4051[0][arg0][arg1] = new class184(0, arg0, arg1);
            class277.field4051[0][arg0][arg1].field2668 = 1;
        }
        class277.field4051[0][arg0][arg1].field2667 = var2;
        class277.field4051[3][arg0][arg1] = null;
    }
}
