import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class342 {

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Z")
    public static boolean field4718 = false;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field4721 = -1;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lvg;")
    public static class431 field4719;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "[[B")
    public static byte[][] field4720;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method2134(byte arg0) {
        if (arg0 != -27) {
            method2134((byte) 102);
        }
        field4719 = null;
        field4720 = null;
    }

    static {
        new class151("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field4722 = -1;
    }
}
