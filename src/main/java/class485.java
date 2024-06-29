import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class485 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field7028 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lqt;")
    public static class459 field7029 = new class459(35, 15);

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field7031 = 0;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
    public static int[] field7032;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lbd;")
    public static class44 field7033;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    public static int[] field7034;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lmj;")
    public static class473 field7027;

    static {
        new class44("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field7032 = new int[2];
        field7033 = new class44("cyan:", "blaugrün:", "cyan:", "cyan:");
        field7034 = new int[25];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 5)
    public static void method2859(byte arg0) {
        field7032 = null;
        field7029 = null;
        if (arg0 != 108) {
            field7028 = 65;
        }
        field7027 = null;
        field7033 = null;
        field7034 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI)V", line = 19)
    public static final void method2860(int arg0, byte arg1, int arg2) {
        field7030++;
        if (arg1 != -83) {
            method2859((byte) 119);
        }
        class275 var3 = class213.method1433((byte) 79, 7, arg2);
        var3.method1778(0);
        var3.field4113 = arg0;
    }
}
