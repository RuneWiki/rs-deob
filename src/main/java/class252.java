import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class252 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Lcq;")
    public static class72 field3297 = new class72("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Lcq;")
    public static class72 field3299 = new class72("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[I")
    public static int[] field3302 = new int[13];

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field3306 = -1;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3305 = "";

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Z")
    public static boolean field3304 = false;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Luc;")
    public static class176 field3301;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Z")
    public static boolean field3298;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Z")
    public static boolean field3303;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 45)
    public static void method1626(byte arg0) {
        field3299 = null;
        field3305 = null;
        field3301 = null;
        field3302 = null;
        field3297 = null;
        if (arg0 < 34) {
            field3303 = true;
        }
    }
}
