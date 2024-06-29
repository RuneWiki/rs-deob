import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class148 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lse;")
    public class167 field2090 = new class167();

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Z")
    public boolean field2093 = false;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Ljm;")
    public static class485 field2092 = new class485(77, 6);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lvh;")
    public static class240 field2095;

    static {
        new class83("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        new class83("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 4)
    public static void method947(byte arg0) {
        field2095 = null;
        field2092 = null;
        int var1 = -93 / ((arg0 - 64) / 40);
    }
}
