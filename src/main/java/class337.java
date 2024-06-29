import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class337 extends class472 {

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Lgu;")
    public class101 field5069;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5070 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "Ljava/awt/Frame;")
    public static Frame field5072;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method2189(int arg0) {
        field5072 = null;
        field5070 = null;
        if (arg0 != 18873) {
            method2189(-69);
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lgu;)V")
    public class337(class101 arg0) {
        this.field5069 = arg0;
    }

    static {
        new class179("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }
}
