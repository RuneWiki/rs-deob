import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class223 extends class449 {

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Lcf;")
    public class92 field3219 = new class92();

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Lrc;")
    public static class108 field3221;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "[C")
    public static char[] field3224;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "[C")
    public static char[] field3223;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "B")
    public static byte field3225;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field3220;

    static {
        new class151("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field3222 = 2;
        field3221 = new class108(21, 3);
        field3224 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        field3223 = new char[] { '[', ']', '#' };
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZII)I", line = 6)
    public static final int method1527(int arg0, boolean arg1, int arg2, int arg3) {
        field3218++;
        class48 var4 = class317.method2019((byte) -109, arg3, arg1);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= arg2 && arg0 < var4.field723.length) {
            return var4.field723[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V", line = 43)
    public static void method1528(int arg0) {
        field3223 = null;
        field3221 = null;
        if (arg0 <= -100) {
            field3224 = null;
        }
    }
}
