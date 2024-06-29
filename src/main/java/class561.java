import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class561 extends class108 {

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "J")
    public long field7830;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lld;")
    public class561 field7831;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lld;")
    public class561 field7834;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public final void method3149(int arg0) {
        field7832++;
        if (this.field7834 == null) {
            return;
        }
        this.field7834.field7831 = this.field7831;
        this.field7831.field7834 = this.field7834;
        if (arg0 != -18724) {
            this.field7830 = 86L;
        }
        this.field7831 = null;
        this.field7834 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)Z")
    public final boolean method3150(boolean arg0) {
        if (arg0) {
            this.field7834 = null;
        }
        field7833++;
        return this.field7834 != null;
    }
}
