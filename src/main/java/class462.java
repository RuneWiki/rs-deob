import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class462 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lch;")
    public static class151 field6526 = new class151("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[I")
    public static int[] field6527;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    public static int[] field6528;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lrc;")
    public static class108 field6530;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field6532;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lrc;")
    public static class108 field6531;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method2763(int arg0) {
        field6530 = null;
        field6528 = null;
        if (arg0 == 22970) {
            field6527 = null;
            field6531 = null;
            field6526 = null;
            field6532 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
    public static final int method2764(int arg0, int arg1) {
        field6525++;
        int var2 = -78 % ((arg1 - 27) / 53);
        return arg0 & 0xFF;
    }

    static {
        new class151("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field6527 = new int[32];
        field6528 = new int[4096];
        for (int var0 = 0; var0 < 4096; var0++) {
            field6528[var0] = class153.method1090(false, var0);
        }
        field6529 = 0;
        field6530 = new class108(67, 0);
        field6532 = new String[] { "en", "de", "fr", "pt", "nl" };
        field6531 = new class108(14, 3);
    }
}
