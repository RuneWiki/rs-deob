import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class192 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lhb;")
    public static class250 field2488 = new class250(35, 4);

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Loi;")
    public static class169 field2490 = new class169("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lsu;")
    public static class111 field2493 = new class111(0);

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lpi;")
    public static class340 field2494 = new class340(62, 2);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "J")
    public static long field2491;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lvm;")
    public static class314 field2495;

    static {
        new class169("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 5)
    public static void method1248(int arg0) {
        field2488 = null;
        field2494 = null;
        field2493 = null;
        int var1 = 68 % ((arg0 + 57) / 45);
        field2495 = null;
        field2490 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIII)V", line = 25)
    public static final void method1249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 <= 94) {
            field2495 = null;
        }
        field2489++;
        if (arg6 < 1 || arg2 < 1 || (class200.field2594 - 2) < arg6 || class118.field1647 - 2 < arg2) {
            return;
        }
        int var9 = arg0;
        if (arg0 < 3 && class402.method2389((byte) 34, arg2, arg6)) {
            var9 = arg0 + 1;
        }
        if (!class421.field5647.method648(-52, class520.field7690) && !class303.method1818(arg2, class473.field6914, -19236, arg6, var9)) {
            return;
        }
        if (class470.field6877 == null) {
            return;
        }
        class204.field2671.method2220(class512.field7538, arg3, arg6, arg2, arg0, class171.field2215[arg0], -2);
        if (arg4 < 0) {
            return;
        }
        boolean var10 = class421.field5647.field7694;
        class421.field5647.field7694 = true;
        class204.field2671.method2217(arg0, var9, arg7, arg4, class512.field7538, arg2, arg1, arg8, class171.field2215[arg0], (byte) 11, arg6);
        class421.field5647.field7694 = var10;
        return;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIII)V", line = 69)
    public static final void method1250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class504 var7 = new class504();
        var7.field7420 = arg1 >> class169.field2206;
        var7.field7410 = arg2 >> class169.field2206;
        var7.field7419 = arg3 >> class169.field2206;
        var7.field7403 = arg4 >> class169.field2206;
        var7.field7407 = arg0;
        var7.field7416 = arg1;
        var7.field7405 = arg2;
        var7.field7413 = arg3;
        var7.field7421 = arg4;
        var7.field7418 = arg5;
        var7.field7404 = arg6;
        class301.field3904[class292.field3750++] = var7;
    }
}
