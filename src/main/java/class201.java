import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class201 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field3107 = -50;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "[S")
    public static short[] field3110;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Lpn;")
    public static class49 field3111;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "Lgf;")
    public static class402 field3108;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public static void method1417(byte arg0) {
        int var1 = 78 / ((arg0 - 66) / 36);
        field3111 = null;
        field3108 = null;
        field3110 = null;
    }

    static {
        new class179("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field3109 = 1400;
        field3110 = new short[] { 6798, 8741, 25238, 4626, 4550 };
        field3111 = new class49(10, 7);
        new class179("Player ", "Spieler ", "Joueur ", "Jogador ");
    }
}
