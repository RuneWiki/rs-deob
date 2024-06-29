import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class95 extends class507 {

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Lfr;")
    public class284 field1145;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Z")
    public static boolean field1137 = false;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "[B")
    public static byte[] field1143 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1147;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "Z")
    public static boolean field1148;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Lo;")
    public static class24 field1144;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Lfo;")
    public static class361 field1136;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "Z")
    public static boolean field1150;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "[[[Lno;")
    public static class498[][][] field1140;

    static {
        new class305("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field1147 = null;
        field1146 = 0;
        field1148 = false;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 7)
    public static final void method529(int arg0) {
        int var1 = 92 % ((37 - arg0) / 48);
        field1138++;
        for (class263 var2 = (class263) class366.field4995.method970(12); var2 != null; var2 = (class263) class366.field4995.method976((byte) -117)) {
            if (var2.field3523 == -1) {
                var2.field3521 = 0;
                if (var2.field3534 >= 0 && var2.field3527 >= 0 && class308.field4128 > var2.field3534 && class426.field6200 > var2.field3527) {
                    class113.method687(var2, (byte) 111);
                }
            } else {
                var2.method2674(true);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 34)
    public static final void method530(byte arg0) {
        class483.field7125 = false;
        if (arg0 != 8) {
            field1144 = null;
        }
        field1139++;
        class317.method1889(class155.field2026, (byte) 121, class425.field6180, class366.field4993, class451.field6723);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Canvas;Ll;BI)Lza;", line = 54)
    public static final class287 method533(Canvas arg0, class16 arg1, byte arg2, int arg3) {
        if (arg2 < 74) {
            method533(null, null, (byte) 11, 125);
        }
        field1142++;
        return new class208(arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I", line = 69)
    public static int method534(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lfr;I)V", line = 81)
    public class95(class284 arg0, int arg1) {
        this.field1145 = arg0;
        this.field1141 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(B)V", line = 99)
    public static void method535(byte arg0) {
        field1143 = null;
        if (arg0 == 0) {
            field1136 = null;
            field1147 = null;
            field1140 = null;
            field1144 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method531(byte arg0);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)Z")
    public abstract boolean method532(int arg0);
}
