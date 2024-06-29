import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class476 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lui;")
    public static class451 field6654;

    static {
        new class332("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new class332("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 9)
    public static void method2769(byte arg0) {
        if (arg0 == 32) {
            field6654 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZJ)V", line = 19)
    public static final void method2770(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field6655++;
        if (arg0) {
            field6654 = null;
        }
    }
}
