import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class483 {

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Lau;")
    private class692 field6891 = new class692(64);

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "Lmv;")
    private class295 field6892;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "Z")
    public static boolean field6897 = false;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "F")
    public static float field6896;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Lcn;", line = 6)
    public final class554 method2763(int arg0, int arg1) {
        field6893++;
        class692 var3 = this.field6891;
        class554 var4;
        synchronized (this.field6891) {
            var4 = (class554) this.field6891.method3901((long) arg0, -87);
            if (arg1 != -31148) {
                this.method2765(25);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field6892;
        byte[] var6;
        synchronized (this.field6892) {
            var6 = this.field6892.method1844(31, 31330, arg0);
        }
        class554 var7 = new class554();
        if (var6 != null) {
            var7.method3223(new class540(var6), (byte) 30);
        }
        class692 var8 = this.field6891;
        synchronized (this.field6891) {
            this.field6891.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)V", line = 40)
    public final void method2764(int arg0, int arg1) {
        class692 var3 = this.field6891;
        synchronized (this.field6891) {
            this.field6891.method3900(arg1, 0);
            if (arg0 != 31) {
                this.method2765(-64);
            }
        }
        field6898++;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 54)
    public final void method2765(int arg0) {
        if (arg0 != 31) {
            field6897 = false;
        }
        class692 var2 = this.field6891;
        synchronized (this.field6891) {
            this.field6891.method3890(-1);
        }
        field6894++;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V", line = 70)
    public final void method2766(int arg0) {
        if (arg0 != 17696) {
            return;
        }
        field6895++;
        class692 var2 = this.field6891;
        synchronized (this.field6891) {
            this.field6891.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 88)
    public class483(class373 arg0, int arg1, class295 arg2) {
        this.field6892 = arg2;
        this.field6892.method1845(31, true);
    }
}
