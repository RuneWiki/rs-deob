import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class59 {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lwj;")
    public static class270 field714 = new class270(4, 0);

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[S")
    public static short[] field716 = new short[256];

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Ldi;")
    public static class83 field717;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Z")
    public static boolean field720;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "[I")
    public static int[] field723;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[Lqv;")
    public static class310[] field718;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static void method481(byte arg0) {
        field718 = null;
        int var1 = 15 % ((arg0 - 33) / 61);
        field716 = null;
        field714 = null;
        field723 = null;
        field717 = null;
    }

    static {
        new class466("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field717 = new class83(59, -1);
        field720 = false;
        field719 = 0;
        field723 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };
        field721 = -1;
        field722 = 0;
    }
}
