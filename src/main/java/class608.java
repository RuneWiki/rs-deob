import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class608 extends class588 {

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Ldv;")
    public class608 field8739;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "Ldv;")
    public class608 field8742;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method3482(int arg0) {
        field8740++;
        if (this.field8739 == null) {
            return;
        }
        this.field8739.field8742 = this.field8742;
        if (arg0 == 7744) {
            this.field8742.field8739 = this.field8739;
            this.field8742 = null;
            this.field8739 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZI)V")
    public static final void method3483(boolean arg0, int arg1) {
        if (!arg0) {
            method3483(true, 63);
        }
        field8741++;
        class260.field3208 = arg1;
        class318.field4398.method315(1);
    }
}
