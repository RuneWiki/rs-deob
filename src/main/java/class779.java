import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class779 {

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lpa;")
    private class387 field10746 = new class387(64);

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Lcb;")
    private class544 field10745;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Lcb;")
    private class544 field10744;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Lke;")
    public static class622 field10742 = new class622(22, 2);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field10741;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field10743;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field10747;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field10748;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method4279(byte arg0) {
        if (arg0 == 114) {
            field10742 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)Llea;")
    public final class636 method4280(int arg0, byte arg1) {
        field10743++;
        class636 var3 = (class636) this.field10746.method2373((long) arg0, 103);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field10744.method3150(arg0, -96, 0);
        } else {
            var4 = this.field10745.method3150(arg0 & 0x7FFF, 114, 0);
        }
        class636 var5 = new class636();
        if (var4 != null) {
            var5.method3623(new class120(var4), 14864);
        }
        if (arg0 >= 32768) {
            var5.method3625(-15704);
        }
        int var6 = 54 % ((27 - arg1) / 34);
        this.field10746.method2362(var5, 0, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILcb;Lcb;)V")
    public class779(int arg0, class544 arg1, class544 arg2) {
        this.field10745 = arg2;
        this.field10744 = arg1;
        if (this.field10744 != null) {
            this.field10744.method3147(0, 37);
        }
        if (this.field10745 != null) {
            this.field10745.method3147(0, -42);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIBI)V")
    public static final void method4281(int arg0, int arg1, byte arg2, int arg3) {
        class617.field8700 = new byte[arg3][arg0][arg1];
        if (arg2 <= 93) {
            field10741 = 81;
        }
        field10747++;
    }
}
