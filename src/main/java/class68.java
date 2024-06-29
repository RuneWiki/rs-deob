import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class68 {

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "Lqp;")
    public static class466 field926 = new class466("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "Lem;")
    public static class150 field931;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "[I")
    public static int[] field930;

    static {
        new class466("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V", line = 11)
    public static void method576(boolean arg0) {
        field926 = null;
        field930 = null;
        if (!arg0) {
            method576(true);
        }
        field931 = null;
    }
}
