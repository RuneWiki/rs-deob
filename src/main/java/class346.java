import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class346 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "J")
    public long field4752;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lte;")
    private class527 field4753;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field4755;

    static {
        new class572("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2107(byte arg0) {
        class117 var1 = class348.field4770;
        synchronized (class348.field4770) {
            if (arg0 != 106) {
                method2107((byte) -45);
            }
            class348.field4770.method837(126);
        }
        field4755++;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lte;JI)V", line = 19)
    public class346(class527 arg0, long arg1, int arg2) {
        this.field4752 = arg1;
        this.field4753 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        this.field4753.method3167(-60, this.field4752);
        field4751++;
        super.finalize();
    }
}
