import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class178 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Lcea;")
    public static class180 field2152 = new class180(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Lvj;")
    public static class373 field2157 = new class373(96, 2);

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "Lie;")
    public static class6 field2158;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2152 = null;
        field2157 = null;
        if (arg0 == 17372) {
            field2158 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Lmca;")
    public static final class29 method985(int arg0) {
        if (arg0 != 2) {
            method985(52);
        }
        field2151++;
        return class544.field7971.length > class401.field5268 ? class544.field7971[class401.field5268++] : null;
    }

    static {
        new class180("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field2158 = new class6();
    }
}
