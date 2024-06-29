import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class441 extends class311 {

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "[B")
    public byte[] field6200;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lhc;")
    public static class368 field6196 = new class368("scroll:", "", "", "");

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Lhc;")
    public static class368 field6199 = new class368("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "Z")
    public static boolean field6201 = true;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/String;IZ)Z")
    public static final boolean method2735(byte arg0, String arg1, int arg2, boolean arg3) {
        field6198++;
        if (arg0 != 100) {
            field6201 = false;
        }
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
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
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method2736(byte arg0) {
        field6199 = null;
        if (arg0 < -14) {
            field6196 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B)V")
    public class441(byte[] arg0) {
        this.field6200 = arg0;
    }
}
