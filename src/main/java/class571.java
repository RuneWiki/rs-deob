import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class571 extends class626 {

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "I")
    public int field8120;

    @OriginalMember(owner = "client!bha", name = "h", descriptor = "I")
    public int field8116;

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "Lrr;")
    public static class361 field8118 = new class361();

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!bha", name = "i", descriptor = "Leq;")
    public static class209 field8117;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
    public static void method3330(byte arg0) {
        field8118 = null;
        field8117 = null;
        if (arg0 < 16) {
            field8118 = null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3331(int arg0, int arg1, boolean arg2) {
        field8121++;
        if (arg2) {
            return true;
        } else {
            return (arg0 & 0xC580) != 0;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLdm;)Ldm;")
    public static final class50 method3332(byte arg0, class50 arg1) {
        if (arg0 != -29) {
            field8118 = null;
        }
        field8119++;
        class50 var2 = client.method1933(arg1);
        if (var2 == null) {
            var2 = arg1.field832;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(II)V")
    public class571(int arg0, int arg1) {
        this.field8120 = arg1;
        this.field8116 = arg0;
    }
}
