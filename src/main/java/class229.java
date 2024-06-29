import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class229 extends class117 {

    @OriginalMember(owner = "client!um", name = "F", descriptor = "Lus;")
    public class233 field3237;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "Ltm;")
    public static class112 field3240 = new class112("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!um", name = "J", descriptor = "Lcs;")
    public static class351 field3241 = new class351(28, 7);

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "[I")
    public static int[] field3242;

    static {
        new class112("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V", line = 4)
    public static void method1439(byte arg0) {
        if (arg0 == -81) {
            field3242 = null;
            field3240 = null;
            field3241 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V", line = 16)
    public static final void method1440(String arg0, int arg1, String arg2, int arg3) {
        field3239++;
        class181.field2623 = arg0;
        class383.field5440 = arg2;
        class323.field4438 = arg1;
        if (class383.field5440.equals("") || class181.field2623.equals("")) {
            class353.field4917 = 3;
        } else if (class355.field4955 == -1) {
            class205.field2936 = 0;
            if (arg3 != -211) {
                field3240 = null;
            }
            class353.field4917 = -3;
            class407.field5643 = 0;
            class22.field377 = 1;
            class425 var4 = new class425(128);
            var4.method2470((byte) -74, 10);
            var4.method2481((int) (Math.random() * 9.9999999E7D), true);
            var4.method2471(arg3 + 26716, class54.method421(class383.field5440, -16583));
            var4.method2481((int) (Math.random() * 9.9999999E7D), true);
            var4.method2493((byte) 22, class181.field2623);
            var4.method2481((int) (Math.random() * 9.9999999E7D), true);
            var4.method2496(arg3 + 211, client.field5496, class417.field5742);
            class366.field5214.field5830 = 0;
            class366.field5214.method2470((byte) -74, class430.field5939.field6474);
            class366.field5214.method2470((byte) -74, var4.field5830 + 2);
            class366.field5214.method2462(572, (byte) -123);
            class366.field5214.method2454(false, var4.field5830, var4.field5886, 0);
        } else {
            class115.method730(1);
        }
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Lgu;", line = 64)
    public static final class36 method1441(int arg0) {
        if (arg0 != -30953) {
            field3240 = null;
        }
        field3236++;
        try {
            return (class36) Class.forName("vo").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lus;)V", line = 79)
    public class229(class233 arg0) {
        this.field3237 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(CII)C", line = 88)
    public static final char method1442(char arg0, int arg1, int arg2) {
        field3235++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else if (arg2 == -22000) {
            return arg0;
        } else {
            return (char) 65500;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIB)I", line = 170)
    public static final int method1443(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -68) {
            return -42;
        }
        field3234++;
        if (arg1 >= arg0) {
            return arg2 < arg1 ? arg2 : arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIII)V", line = 181)
    public static final void method1444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3238++;
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class445.field6143 + ((class475.field6694 - class445.field6143) * var8 / 100);
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg4 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (arg2 >= -39) {
            return;
        }
        if (var11 != 0) {
            var14 = class432.field5955[var11] * -var10 >> 15;
            var15 = class432.field5957[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class432.field5955[var12] * var15 >> 15;
            var15 = class432.field5957[var12] * var15 >> 15;
        }
        class200.field2873 = arg5;
        class183.field2665 = arg6 - var14;
        class259.field3618 = 0;
        class160.field2306 = arg4;
        class436.field5982 = arg3 - var13;
        class106.field1525 = arg0 - var15;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V", line = 233)
    public static final void method1445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class132.field1860 != null) {
            class132.field1860[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class269.field3727 != null) {
            class269.field3727[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class226.field3194 != null) {
            class226.field3194[arg0][arg1] = (byte) arg4;
        }
    }
}
