import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class137 {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Lhi;")
    public static class45 field2073;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Z")
    public boolean field2066;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[[B")
    public static byte[][] field2065;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)V")
    public static final void method976(int arg0, byte arg1) {
        field2071++;
        if (arg1 >= -22) {
            field2067 = -109;
        }
        if (class523.method3109((byte) -65, arg0)) {
            class27.method184(class505.field7387[arg0], -1, 104);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        field2065 = null;
        if (arg0 == -1) {
            field2073 = null;
        }
    }

    static {
        new class157("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field2073 = new class45(78, 7);
    }
}
