import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class502 {

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Lqb;")
    public class151 field7340 = new class151();

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Z")
    public boolean field7341 = false;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "[I")
    public static int[] field7344 = new int[8];

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Lbu;")
    public static class17 field7343 = new class17();

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "Los;")
    public static class309 field7347 = new class309("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "[I")
    public static int[] field7348;

    static {
        new class309("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 5)
    public static final void method3022(byte arg0) {
        class418.field6296.method1796(-122);
        field7338++;
        class335.field5062.field4399 = 0;
        class363.field5302 = null;
        class215.field3401 = null;
        class255.field3906 = 0;
        class219.field3446.field4399 = 0;
        class483.field7115 = 0;
        class523.field7592 = null;
        class398.field6039 = null;
        class43.field593 = 0;
        int var1 = 0;
        if (arg0 != -2) {
            field7347 = null;
        }
        while (var1 < 100) {
            class163.field2618[var1] = null;
            var1++;
        }
        class438.field6511 = 0;
        class384.field5610 = null;
        class199.field3234 = 0;
        class513.field7453 = 0;
        class332.field5047 = 0;
        class110.field2021 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII)V", line = 38)
    public static final void method3023(int arg0, int arg1, int arg2, int arg3) {
        field7339++;
        int var4 = class496.field7292 + arg2;
        int var5 = class212.field3378 + arg1;
        if (class518.field7511 == null || arg2 < 0 || arg1 < 0 || arg2 >= class339.field5099 || arg1 >= class484.field7129) {
            return;
        }
        long var6 = (long) (var4 | arg0 << 28 | var5 << 14);
        class354 var8 = (class354) class169.field2757.method1622(var6, 58);
        if (var8 == null) {
            class61.method545(arg0, arg2, arg1);
            return;
        }
        class506 var9 = (class506) var8.field5220.method1892(89);
        if (var9 == null) {
            class61.method545(arg0, arg2, arg1);
            return;
        }
        class514 var10 = (class514) class61.method545(arg0, arg2, arg1);
        if (arg3 != -29969) {
            field7348 = null;
        }
        if (var10 == null) {
            var10 = new class514();
        } else {
            var10.field7460 = var10.field7463 = -1;
        }
        var10.field7462 = var9.field7376;
        var10.field7457 = var9.field7375;
        label51: while (true) {
            class506 var11 = (class506) var8.field5220.method1893((byte) -2);
            if (var11 == null) {
                break;
            }
            if (var10.field7462 != var11.field7376) {
                var10.field7464 = var11.field7375;
                var10.field7460 = var11.field7376;
                while (true) {
                    class506 var12 = (class506) var8.field5220.method1893((byte) -2);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field7462 != var12.field7376 && var10.field7460 != var12.field7376) {
                        var10.field7459 = var12.field7375;
                        var10.field7463 = var12.field7376;
                    }
                }
            }
        }
        int var13 = class483.method2899(arg0, (arg2 << 7) + 64, (arg1 << 7) - -64, false);
        class387.method2374(arg0, arg2, arg1, var13, var10);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V", line = 123)
    public static void method3024(boolean arg0) {
        field7348 = null;
        if (!arg0) {
            field7344 = null;
            field7347 = null;
            field7343 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 141)
    public static final String method3025(int arg0, String arg1) {
        field7346++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class57.method513(arg0 - 83, arg1.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class57.method513(-96, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        if (arg0 != -13) {
            return null;
        }
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class292.method1899(arg0 ^ 0xFFFFFFF3, var7)) {
                char var8 = class70.method605(var7, (byte) 54);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
