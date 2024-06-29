import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class310 {

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    private int field4397;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "Lwk;")
    public static class155 field4399;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "Lrc;")
    public static class108 field4400;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field4401;

    static {
        new class151("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field4399 = new class155(8);
        field4400 = new class108(101, 12);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Lml;", line = 12)
    public static final class21 method1978(int arg0) {
        field4393++;
        if (arg0 != -3) {
            method1979((byte) 69, -68);
        }
        return class361.field4975.length > class227.field3275 ? class361.field4975[class227.field3275++] : null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 30)
    public static final String method1979(byte arg0, int arg1) {
        field4396++;
        String var2 = Integer.toString(arg1);
        if (arg0 != 108) {
            field4401 = -74;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class477.field6784.method1078(class66.field967, 100) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class365.field5018.method1078(class66.field967, arg0 - 8) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(II)V", line = 61)
    public class310(int arg0, int arg1) {
        this.field4397 = arg0;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)I", line = 71)
    public static final int method1980(int arg0, int arg1, int arg2) {
        field4394++;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != 29297) {
            method1978(-16);
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 98)
    public static void method1981(byte arg0) {
        field4400 = null;
        field4399 = null;
        if (arg0 >= -79) {
            method1981((byte) 40);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)I", line = 109)
    public final int method1982(byte arg0) {
        field4392++;
        if (arg0 != 26) {
            field4399 = null;
        }
        return this.field4397;
    }

    @OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;", line = 120)
    public final String toString() {
        field4395++;
        throw new IllegalStateException();
    }
}
