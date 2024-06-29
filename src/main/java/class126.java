import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class126 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lcba;")
    public static class471 field2046;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method876(int arg0) {
        if (arg0 != 7) {
            field2046 = null;
        }
        field2046 = null;
    }

    static {
        new class104("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field2046 = new class471(7, -1);
    }
}
