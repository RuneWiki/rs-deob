import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class306 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lla;")
    public static class319 field4443 = new class319(46, -1);

    @OriginalMember(owner = "client!io", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4445 = new String[5];

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lta;")
    public static class144 field4441;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "[Lo;")
    public static class23[] field4447;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "[Lhr;")
    public static class370[] field4446;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method1921(int arg0) {
        field4447 = null;
        field4446 = null;
        field4445 = null;
        field4443 = null;
        field4441 = null;
        if (arg0 != 26005) {
            method1922(90);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
    public static final void method1922(int arg0) {
        field4442++;
        if (!class44.field641) {
            return;
        }
        class282 var1 = class178.method1197(class497.field7333, class63.field894, 90);
        if (var1 != null && var1.field3997 != null) {
            class143 var2 = new class143();
            var2.field1912 = var1.field3997;
            var2.field1903 = var1;
            class343.method2227(var2);
        }
        class44.field641 = false;
        class449.field6752 = arg0;
        class361.field5539 = -1;
        if (var1 != null) {
            class206.method1385(arg0 + 3, var1);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1923(int arg0, String arg1) {
        field4444++;
        if (!class44.field641) {
            return;
        }
        boolean var2 = false;
        int var3 = class20.field310;
        int[] var4 = class55.field778;
        if (arg0 != 2092) {
            method1923(-48, null);
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class96 var6 = class241.field3398[var4[var5]];
            if (var6 != null && class56.field800 != var6 && var6.field1393 != null && var6.field1393.equalsIgnoreCase(arg1)) {
                class424.method2582(class150.field1967, -1);
                class70.field974++;
                class538.field7879.method1068(69, class361.field5539);
                class538.field7879.method1097(-3, var4[var5]);
                class538.field7879.method1075(128, 0);
                class538.field7879.method1096((byte) 26, class63.field894);
                class538.field7879.method1068(79, class497.field7333);
                class203.method1373(0, var6.field3915[0], var6.method637((byte) 125), -2, 0, var6.method637((byte) -108), true, var6.field3917[0], (byte) 11);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class62.method444(64, class159.field2051.method2705((byte) 69, class257.field3556) + arg1);
        }
        if (class44.field641) {
            method1922(arg0 - 2093);
        }
    }

    static {
        new class446("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        new class446("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }
}
