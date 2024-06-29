import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class411 extends class618 {

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field5452 = 0;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "Lne;")
    public static class166 field5453;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "Lica;")
    public class411 field5451;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "Lica;")
    public class411 field5454;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public final void method2384(int arg0) {
        field5455++;
        if (this.field5454 == null) {
            return;
        }
        this.field5454.field5451 = this.field5451;
        if (arg0 == 0) {
            this.field5451.field5454 = this.field5454;
            this.field5451 = null;
            this.field5454 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)V")
    public static void method2385(boolean arg0) {
        field5453 = null;
        if (arg0) {
            method2385(true);
        }
    }
}
