import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class651 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9388;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Lea;")
    public static class474 field9390;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Lig;")
    public static class206 field9391;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Lw;")
    public class252 field9386;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Lba;")
    public class327 field9389;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
    public static final void method3717(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9387++;
        for (int var5 = arg0; var5 < class384.field5785; var5++) {
            Rectangle var6 = class288.field3985[var5];
            if ((var6.x + var6.width) > arg3 && (arg2 + arg3) > var6.x && (var6.y + var6.height) > arg1 && arg1 + arg4 > var6.y) {
                class570.field8224[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method3718(int arg0) {
        if (arg0 != 0) {
            field9391 = null;
        }
        field9391 = null;
        field9388 = null;
        field9390 = null;
    }

    static {
        new class474("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field9388 = null;
        field9390 = new class474(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");
        field9391 = new class206(81, 12);
    }
}
