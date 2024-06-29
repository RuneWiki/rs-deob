import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class686 {

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public int field9643 = 0;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public int field9646 = 0;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "Lmga;")
    private class666 field9641 = new class666(64);

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "Lrj;")
    private class557 field9648 = null;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "Lbi;")
    private class449 field9642;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "Lbi;")
    private class449 field9647;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Llj;J[II)Ljava/lang/String;")
    public final String method3815(class570 arg0, long arg1, int[] arg2, int arg3) {
        if (arg3 != -7940) {
            return null;
        }
        field9640++;
        if (this.field9648 != null) {
            String var6 = this.field9648.method1095(arg2, arg3 + 27046, arg1, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZ)Ltfa;")
    public final class31 method3816(int arg0, boolean arg1) {
        field9645++;
        if (!arg1) {
            this.method3816(-11, true);
        }
        class31 var3 = (class31) this.field9641.method3750((long) arg0, !arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field9647.method2537(!arg1, 1, arg0 & 0x7FFF);
        } else {
            var4 = this.field9642.method2537(false, 1, arg0);
        }
        class31 var5 = new class31();
        var5.field491 = this;
        if (var4 != null) {
            var5.method252(new class335(var4), -1);
        }
        if (arg0 >= 32768) {
            var5.method260(126);
        }
        this.field9641.method3745(1, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(ILbi;Lbi;Lrj;)V")
    public class686(int arg0, class449 arg1, class449 arg2, class557 arg3) {
        this.field9642 = arg1;
        this.field9648 = arg3;
        this.field9647 = arg2;
        if (this.field9642 != null) {
            this.field9646 = this.field9642.method2527(0, 1);
        }
        if (this.field9647 != null) {
            this.field9643 = this.field9647.method2527(0, 1);
        }
    }
}
