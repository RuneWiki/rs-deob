import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class399 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Lnn;")
    public static class151 field5959 = new class151("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field5961 = 0;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lkb;")
    public static class124 field5962 = null;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5960;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method2519(int arg0) {
        if (arg0 > 111) {
            field5960 = null;
            field5962 = null;
            field5959 = null;
        }
    }

    static {
        new class151(" days.", " Tage.", " jours.", " dias.");
    }
}
