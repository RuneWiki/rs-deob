import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class14 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lvf;")
    public static class265 field421 = class87.method582(-46, ")3)3)3");

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lvf;")
    private static class265 field422 = class87.method582(-46, "yellow:");

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lvf;")
    public static class265 field425 = class87.method582(-46, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lvf;")
    public static class265 field426 = field422;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lvf;")
    public static class265 field428 = class87.method582(-46, "Atteindre");

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Lvf;")
    public static class265 field430 = class87.method582(-46, " ");

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Lvf;")
    public static class265 field431 = field422;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Lfl;")
    public static class192 field427;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "[[[B")
    public static byte[][][] field423;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method104(int arg0) {
        field421 = null;
        field422 = null;
        field427 = null;
        if (arg0 != -2042) {
            field427 = null;
        }
        field423 = null;
        field430 = null;
        field428 = null;
        field426 = null;
        field431 = null;
        field425 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
    public static final void method105(boolean arg0, int arg1) {
        if (arg1 == -1 && !class112.field1964) {
            class97.method649(-4706);
        } else if (arg1 != -1 && (class44.field980 != arg1 || !class76.method536((byte) -42)) && class105.field1868 != 0 && !class112.field1964) {
            class262.method1753(false, 0, class105.field1868, arg1, 2, field427, (byte) -12);
        }
        if (!arg0) {
            field421 = null;
        }
        field424++;
        class44.field980 = arg1;
    }
}
