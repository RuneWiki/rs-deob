import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class354 extends class312 {

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Lne;")
    public static class139 field5244 = new class139("WTRC", 1);

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "Lhv;")
    public static class150 field5247 = new class150();

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "Lpu;")
    public static class179 field5248;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "Lsr;")
    public class354 field5238;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "Lsr;")
    public class354 field5241;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "[Z")
    public static boolean[] field5239;

    static {
        new class179("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field5248 = new class179("Attack", "Angreifen", "Attaquer", "Atacar");
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 3)
    public static void method2257(int arg0) {
        field5239 = null;
        field5244 = null;
        field5248 = null;
        field5247 = null;
        if (arg0 > -50) {
            method2259((byte) 113, null);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZILjava/lang/String;)Z", line = 16)
    public static final boolean method2258(int arg0, boolean arg1, int arg2, String arg3) {
        field5245++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        if (arg2 != 55) {
            field5248 = null;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLue;)Ljava/lang/String;", line = 91)
    public static final String method2259(byte arg0, class376 arg1) {
        field5242++;
        if (arg0 > -110) {
            return null;
        } else if (arg1.field5543 == null || arg1.field5543.length() <= 0) {
            return arg1.field5540;
        } else {
            return arg1.field5540 + class235.field3541.method1265(class345.field5141, -59) + arg1.field5543;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V", line = 113)
    public final void method2260(int arg0) {
        field5240++;
        if (this.field5241 == null) {
            return;
        }
        this.field5241.field5238 = this.field5238;
        this.field5238.field5241 = this.field5241;
        this.field5238 = null;
        if (arg0 != 0) {
            field5244 = null;
        }
        this.field5241 = null;
    }
}
