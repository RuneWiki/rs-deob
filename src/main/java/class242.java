import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class242 {

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public int field3847 = 1;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "C")
    public char field3844;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Ljq;")
    public static class357 field3846;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Z")
    public static boolean field3845;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static void method1658(int arg0) {
        field3846 = null;
        if (arg0 != 0) {
            method1658(-100);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lhp;II)V")
    private final void method1659(class217 arg0, int arg1, int arg2) {
        field3842++;
        if (arg2 == 1) {
            this.field3844 = class467.method2818(arg0.method1565(true), (byte) -67);
        } else if (arg2 == 2) {
            this.field3847 = 0;
        }
        if (arg1 != 4436) {
            field3848 = -105;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZLhp;)V")
    public final void method1660(boolean arg0, class217 arg1) {
        field3843++;
        while (true) {
            int var3 = arg1.method1515((byte) 127);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method1660(true, null);
                    return;
                }
            }
            this.method1659(arg1, 4436, var3);
        }
    }

    static {
        new class234("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field3848 = 0;
    }
}
