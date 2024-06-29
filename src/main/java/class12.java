import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field128 = 2;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Z")
    public static boolean field129;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "[Lo;")
    public static class24[] field130;

    static {
        new class305("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)[Lsd;", line = 11)
    public static final class63[] method70(byte arg0) {
        if (arg0 < 72) {
            return null;
        } else {
            field126++;
            return new class63[] { class454.field6795, class420.field6096, class453.field6784, class357.field4861, class306.field4080, class35.field356, class319.field4250, class419.field6078, class116.field1519, class440.field6387, class76.field957, class371.field5040, class478.field7075, class174.field2243 };
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V", line = 22)
    public static void method71(byte arg0) {
        field130 = null;
        if (arg0 > -97) {
            field128 = 116;
        }
    }
}
