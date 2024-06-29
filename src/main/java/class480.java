import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class480 extends class324 {

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "Z")
    public boolean field7055 = false;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public int field7060 = -1;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public int field7054;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public int field7056;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public int field7057;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public int field7058;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public int field7059;

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V")
    public class480(int arg0) {
        this.field7060 = arg0;
    }

    static {
        new class474("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}
