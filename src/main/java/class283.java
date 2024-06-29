import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class283 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3716 = new String[200];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3714 = 0;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lcea;")
    public static class180 field3715 = new class180("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
    public static final int method1600(int arg0) {
        if (arg0 == 2) {
            field3717++;
            return 2;
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Z")
    public static final boolean method1601(int arg0, int arg1) {
        field3718++;
        if (arg0 == 200) {
            return arg1 == 3 || arg1 == 4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method1602(int arg0) {
        int var1 = 109 / ((30 - arg0) / 59);
        field3716 = null;
        field3715 = null;
    }
}
