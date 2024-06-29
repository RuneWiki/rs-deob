import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class600 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lvh;")
    private class328 field8328 = new class328(64);

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lpj;")
    private class132 field8335;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lpj;")
    public class132 field8332;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Lefa;", line = 9)
    public final class167 method3324(byte arg0, int arg1) {
        field8333++;
        class328 var3 = this.field8328;
        class167 var4;
        synchronized (this.field8328) {
            var4 = (class167) this.field8328.method1986((byte) -87, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field8335;
        byte[] var6;
        synchronized (this.field8335) {
            var6 = this.field8335.method940(3, arg1, 0);
        }
        class167 var7 = new class167();
        var7.field2525 = this;
        if (var6 != null) {
            var7.method1148(-107, new class96(var6));
        }
        class328 var8 = this.field8328;
        synchronized (this.field8328) {
            if (arg0 >= -43) {
                return null;
            } else {
                this.field8328.method1985(var7, (long) arg1, (byte) -102);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([[IZ)V", line = 41)
    public static final void method3325(int[][] arg0, boolean arg1) {
        field8334++;
        class476.field6655 = arg0;
        if (!arg1) {
            method3325(null, true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 53)
    public final void method3326(byte arg0) {
        class328 var2 = this.field8328;
        synchronized (this.field8328) {
            this.field8328.method1987(-31085);
        }
        if (arg0 < -48) {
            field8331++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 68)
    public final void method3327(byte arg0) {
        field8329++;
        class328 var2 = this.field8328;
        synchronized (this.field8328) {
            if (arg0 < 87) {
                this.field8328 = null;
            }
            this.field8328.method1997(1);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)V", line = 83)
    public final void method3328(byte arg0, int arg1) {
        field8330++;
        class328 var3 = this.field8328;
        synchronized (this.field8328) {
            this.field8328.method1989(arg1, (byte) 94);
        }
        int var4 = -76 / ((41 - arg0) / 56);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ldd;ILpj;Lpj;)V", line = 98)
    public class600(class647 arg0, int arg1, class132 arg2, class132 arg3) {
        this.field8335 = arg2;
        this.field8332 = arg3;
        this.field8335.method936(3, -127);
    }
}
