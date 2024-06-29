import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class297 extends class324 {

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Ljava/lang/String;")
    public String field4398;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field4396 = 0;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Z")
    public static boolean field4400 = false;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lkca;")
    public static class73 field4397 = new class73(5, 4);

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[B")
    public static byte[] field4401 = new byte[2048];

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Los;")
    public static class379 field4402;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[[Lqf;")
    public static class593[][] field4403;

    static {
        new class474("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field4402 = new class379();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 6)
    public static void method1987(int arg0) {
        field4403 = null;
        if (arg0 == 540800) {
            field4402 = null;
            field4401 = null;
            field4397 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 21)
    public static final String method1988(String arg0, byte arg1) {
        if (arg1 > -127) {
            method1989(37, (byte) -23, 15);
        }
        field4395++;
        String var2 = class111.method684(0, class573.method3335(arg0, 512));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 41)
    public class297() {
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 43)
    public class297(String arg0, int arg1) {
        this.field4398 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)Z", line = 56)
    public static final boolean method1989(int arg0, byte arg1, int arg2) {
        field4399++;
        int var3 = 31 % ((-arg1 - 19) / 48);
        return (arg2 & 0x84080) != 0;
    }
}
