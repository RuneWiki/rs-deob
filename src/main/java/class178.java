import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class178 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lfg;")
    public static class83 field2521 = new class83(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lub;")
    public static class18 field2525 = new class18("LIVE", 0);

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Ljm;")
    public static class485 field2526 = new class485(13, -1);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field2527;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[Z")
    public static boolean[] field2528;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZIBLht;[I)Lcq;")
    public static final class325 method1086(int arg0, boolean arg1, int arg2, byte arg3, class410 arg4, int[] arg5) {
        field2522++;
        if (arg3 != -126) {
            return null;
        } else if (!arg4.field5991 && (!class455.method2685(arg2, 20721) || !class455.method2685(arg0, 20721))) {
            return arg4.field5905 ? new class325(arg4, 34037, arg2, arg0, arg1, arg5) : new class325(arg4, arg2, arg0, class420.method2513(arg2, arg3 ^ 0xFFFFFF82), class420.method2513(arg0, 0), arg5);
        } else {
            return new class325(arg4, 3553, arg2, arg0, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1087(int arg0) {
        if (arg0 >= -87) {
            return;
        }
        field2525 = null;
        field2526 = null;
        field2521 = null;
        field2527 = null;
        field2528 = null;
    }

    static {
        new class83("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
