import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends class316 {

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lqp;")
    public static class466 field196 = new class466("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Lqp;")
    public static class466 field198 = new class466(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field200 = 0;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method62(int arg0) {
        if (arg0 == -27252) {
            field196 = null;
            field198 = null;
        }
    }

    static {
        new class466("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
