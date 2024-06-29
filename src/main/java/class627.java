import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class627 {

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Z")
    public static boolean field8743 = false;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field8745 = 0;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "J")
    public long field8746;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lns;")
    public class627 field8742;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Lns;")
    public class627 field8744;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field8740;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z", line = 7)
    public final boolean method3425(int arg0) {
        field8741++;
        if (this.field8742 == null) {
            return false;
        } else if (arg0 == -16972) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V", line = 23)
    public final void method3426(byte arg0) {
        field8738++;
        if (this.field8742 == null) {
            return;
        }
        if (arg0 >= -8) {
            field8740 = null;
        }
        this.field8742.field8744 = this.field8744;
        this.field8744.field8742 = this.field8742;
        this.field8744 = null;
        this.field8742 = null;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)V", line = 41)
    public static void method3427(byte arg0) {
        if (arg0 < 126) {
            method3427((byte) 87);
        }
        field8740 = null;
    }
}
