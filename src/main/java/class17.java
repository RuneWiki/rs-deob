import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class17 {

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field280 = 0;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lwt;")
    public class17 field281;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "Lmv;")
    public class522 field279;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Ltf;")
    public static class533 field275;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Ljava/lang/String;")
    public static String field278;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)I", line = 10)
    public static final int method197(int arg0, int arg1, int arg2) {
        if (arg1 > -67) {
            field278 = null;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field274++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 32)
    public final void method198(int arg0) {
        field276++;
        if (class346.field5334 >= 500 || arg0 > -69) {
            return;
        }
        this.field281 = class320.field4935;
        this.field279 = null;
        this.field277 = 0;
        class320.field4935 = this;
        class346.field5334++;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V", line = 56)
    public static void method199(int arg0) {
        field278 = null;
        field275 = null;
        if (arg0 != -784) {
            field278 = null;
        }
    }
}
