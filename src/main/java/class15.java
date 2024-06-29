import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class15 {

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field197 = -1;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "[I")
    public static int[] field196 = new int[16];

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Lgo;")
    public static class310 field198 = null;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Ldp;")
    public static class347 field195 = new class347("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "J")
    public static long field199;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
    public static boolean field200;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public static void method191(byte arg0) {
        field198 = null;
        field195 = null;
        if (arg0 == -7) {
            field196 = null;
        }
    }

    static {
        new class347("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field199 = -1L;
        field200 = false;
        field201 = 0;
    }
}
