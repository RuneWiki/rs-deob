import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class199 {

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "Lau;")
    private class692 field2715 = new class692(64);

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lmv;")
    private class295 field2713;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "Lcq;")
    public static class273 field2710 = new class273(2, 4, 4, 0);

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Lpd;")
    public static class575 field2714;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static void method1296(byte arg0) {
        field2710 = null;
        if (arg0 != -30) {
            field2710 = null;
        }
        field2714 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)Lhk;")
    public final class133 method1297(int arg0, byte arg1) {
        field2711++;
        class692 var3 = this.field2715;
        class133 var5;
        synchronized (this.field2715) {
            int var4 = 102 / ((-arg1 - 7) / 60);
            var5 = (class133) this.field2715.method3901((long) arg0, -66);
        }
        if (var5 != null) {
            return var5;
        }
        class295 var6 = this.field2713;
        byte[] var7;
        synchronized (this.field2713) {
            var7 = this.field2713.method1844(19, 31330, arg0);
        }
        class133 var8 = new class133();
        if (var7 != null) {
            var8.method948(24824, new class540(var7));
        }
        class692 var9 = this.field2715;
        synchronized (this.field2715) {
            this.field2715.method3894(var8, (byte) 60, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lsea;ILmv;)V")
    public class199(class373 arg0, int arg1, class295 arg2) {
        this.field2713 = arg2;
        this.field2712 = this.field2713.method1845(19, true);
    }
}
