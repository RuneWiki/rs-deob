import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class382 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Los;")
    public static class309 field5584;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "[[I")
    public static int[][] field5590;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Log;")
    public static class462 field5587;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lj;")
    public class382 field5585;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lj;")
    public class382 field5588;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
    public static final boolean method2351(int arg0, int arg1, String arg2, boolean arg3) {
        field5582++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        if (arg1 != -3598) {
            method2351(-93, 17, null, true);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
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
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public final void method2352(byte arg0) {
        field5589++;
        if (this.field5588 == null) {
            return;
        }
        if (arg0 < 100) {
            this.field5585 = null;
        }
        this.field5588.field5585 = this.field5585;
        this.field5585.field5588 = this.field5588;
        this.field5588 = null;
        this.field5585 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static void method2353(boolean arg0) {
        field5584 = null;
        field5587 = null;
        if (arg0) {
            method2351(-73, -95, null, true);
        }
        field5590 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)Lgl;")
    public static final class429 method2354(int arg0) {
        field5583++;
        try {
            if (arg0 != -9074) {
                field5587 = null;
            }
            return (class429) Class.forName("uh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    static {
        new class309("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field5584 = new class309("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
        field5590 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
        field5587 = new class462("LIVE", 0);
    }
}
