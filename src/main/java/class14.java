import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FIMDEAMY")
public class class14 extends class17 {

    @OriginalMember(owner = "client!FIMDEAMY", name = "m", descriptor = "Z")
    private boolean field705 = false;

    @OriginalMember(owner = "client!FIMDEAMY", name = "k", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!FIMDEAMY", name = "l", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!FIMDEAMY", name = "a", descriptor = "(I)LKDWDYCIL;")
    public final class25 method185(int arg0) {
        class67 var2 = class67.method575(this.field704);
        if (arg0 != 9) {
            this.field705 = !this.field705;
        }
        return var2.method572(this.field703);
    }
}
