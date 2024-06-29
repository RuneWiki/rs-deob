import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class10 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field118;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lrb;")
    public static class283 field119;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lhb;")
    public static class251 field116;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ldk;")
    public static class421 field120;

    static {
        new class157("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field118 = new String[100];
        field119 = new class283(17, 3);
    }

    @OriginalMember(owner = "client!de", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field117++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 17)
    public static void method70(int arg0) {
        if (arg0 != 100) {
            method70(-44);
        }
        field116 = null;
        field118 = null;
        field119 = null;
        field120 = null;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIII)V", line = 31)
    public class10(int arg0, int arg1, int arg2, int arg3) {
        this.field115 = arg0;
        this.field113 = arg1;
        this.field112 = arg2;
        this.field114 = arg3;
    }
}
