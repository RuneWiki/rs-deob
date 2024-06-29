import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class44 {

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Lkc;")
    public static class157 field632 = new class157("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Lkc;")
    public static class157 field634 = new class157("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "Lhi;")
    public static class45 field636 = new class45(5, 7);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "Lks;")
    public static class23 field635;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "Lkt;")
    public static class61 field638;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "[[I")
    public static int[][] field633;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ldk;III)Lqq;", line = 3)
    public static final class496 method299(class421 arg0, int arg1, int arg2, int arg3) {
        field631++;
        byte[] var4 = arg0.method2512(arg1, (byte) -93, arg3);
        if (var4 == null) {
            return null;
        } else if (arg2 == -6502) {
            return new class496(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 24)
    public static void method300(int arg0) {
        field633 = null;
        field636 = null;
        field635 = null;
        field632 = null;
        if (arg0 < -116) {
            field638 = null;
            field634 = null;
        }
    }
}
