import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class413 extends class120 {

    @OriginalMember(owner = "client!am", name = "s", descriptor = "S")
    public static short field5815;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Lwf;")
    public static class79 field5817;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lgu;")
    public static class377 field5808;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Lam;")
    public class413 field5807;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Lam;")
    public class413 field5812;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "Z")
    public static boolean field5818;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "[[[B")
    public static byte[][][] field5813;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public static void method2437(int arg0) {
        field5813 = null;
        field5808 = null;
        field5817 = null;
        if (arg0 != 32248) {
            field5811 = 56;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    public final void method2438(byte arg0) {
        field5810++;
        if (arg0 == 30 && this.field5812 != null) {
            this.field5812.field5807 = this.field5807;
            this.field5807.field5812 = this.field5812;
            this.field5807 = null;
            this.field5812 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)I")
    public static final int method2439(int arg0, byte arg1) {
        field5809++;
        int var2 = -10 / ((-arg1 - 35) / 37);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2440(int arg0, int arg1, byte arg2) {
        field5814++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class453 var3 = class156.field2325.method808(arg1, 0);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (arg2 <= 79) {
            method2440(-17, -36, (byte) 54);
        }
        return var3.method2656(arg0, 98);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public static final void method2441(int arg0) {
        if (arg0 != 4) {
            field5808 = null;
        }
        field5816++;
        if (class314.field4438.method1174((byte) 86, class437.field6083) || class42.field619 == class29.field394) {
            class487.method2853(-122, class141.field1878);
            if (class29.field394 != class166.field2440) {
                class251.method1569(true);
            }
        } else {
            class483.method2824(class310.field4388, false, (byte) -14, class242.field3622, false);
        }
    }

    static {
        new class326("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field5815 = 1;
        new class326("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field5817 = new class79(79, 4);
    }
}
