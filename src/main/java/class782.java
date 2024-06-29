import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class782 {

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "Loo;")
    private class652 field10742 = new class652(64);

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "Lwia;")
    private class791 field10743;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "Lwia;")
    private class791 field10741;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public static int field10744;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)Luj;")
    public final class403 method4292(boolean arg0, int arg1) {
        field10744++;
        class403 var3 = (class403) this.field10742.method3742((byte) 67, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        if (!arg0) {
            this.field10743 = null;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field10741.method4339(arg1 & 0x7FFF, 0, 0);
        } else {
            var4 = this.field10743.method4339(arg1, 0, 0);
        }
        class403 var5 = new class403();
        if (var4 != null) {
            var5.method2481((byte) -95, new class494(var4));
        }
        if (arg1 >= 32768) {
            var5.method2476(32768);
        }
        this.field10742.method3739((long) arg1, (byte) 65, var5);
        return var5;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(ILwia;Lwia;)V")
    public class782(int arg0, class791 arg1, class791 arg2) {
        this.field10743 = arg1;
        this.field10741 = arg2;
        if (this.field10743 != null) {
            this.field10743.method4353(0, true);
        }
        if (this.field10741 != null) {
            this.field10741.method4353(0, true);
        }
    }
}
