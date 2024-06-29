import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class440 extends class147 {

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[B")
    public byte[] field6301;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field6298 = 1;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[C")
    public static char[] field6297 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lsd;")
    public static class74 field6299 = new class74(38, 8);

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Lec;")
    public static class40 field6302 = new class40("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field6303 = 1405;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Lpn;")
    public static class72 field6304 = new class72(28, 6);

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V")
    public static void method2606(byte arg0) {
        field6304 = null;
        field6299 = null;
        field6302 = null;
        if (arg0 != 5) {
            method2606((byte) -113);
        }
        field6297 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([B)V")
    public class440(byte[] arg0) {
        this.field6301 = arg0;
    }

    static {
        new class40("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
