import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class484 extends class42 {

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public int field6737;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public int field6736;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Z")
    public static boolean field6732 = false;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Lcr;")
    public static class403 field6735 = null;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field6733 = 0;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Lff;")
    public static class9 field6738;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field6734;

    static {
        new class304("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field6738 = new class9(103, 6);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 15)
    public static void method2789(byte arg0) {
        field6735 = null;
        int var1 = 52 / ((arg0 + 34) / 46);
        field6738 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(II)V", line = 34)
    public class484(int arg0, int arg1) {
        this.field6737 = arg0;
        this.field6736 = arg1;
    }
}
