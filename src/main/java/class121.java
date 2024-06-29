import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class121 {

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "[Lls;")
    public class95[] field1662 = new class95[8];

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "[Leq;")
    public class144[] field1665 = new class144[100];

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "[I")
    public int[] field1666 = new int[3];

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "[I")
    public int[] field1670 = new int[100];

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Leh;")
    public static class246 field1663;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "Leh;")
    public static class246 field1667;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1664;

    static {
        new class530("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field1663 = new class246(91, 2);
        field1668 = 0;
        field1667 = new class246(81, -1);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 3)
    public static void method810(int arg0) {
        if (arg0 == -27171) {
            field1663 = null;
            field1667 = null;
        }
    }
}
