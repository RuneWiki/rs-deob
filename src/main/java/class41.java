import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class41 {

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lpja;")
    private class43 field667 = new class43(128);

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lgj;")
    private class662 field663;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Z")
    public static boolean field664 = false;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V", line = 10)
    public final void method246(boolean arg0, int arg1) {
        class43 var3 = this.field667;
        synchronized (this.field667) {
            if (!arg0) {
                field665 = -78;
            }
            this.field667.method265(arg1, -28);
        }
        field666++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 24)
    public final void method247(byte arg0) {
        field660++;
        class43 var2 = this.field667;
        synchronized (this.field667) {
            this.field667.method273(-49);
        }
        if (arg0 > -25) {
            this.method249(64, -18);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 38)
    public final void method248(byte arg0) {
        field661++;
        class43 var2 = this.field667;
        synchronized (this.field667) {
            this.field667.method272(20);
            if (arg0 > -28) {
                this.field663 = null;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lfea;", line = 51)
    public final class153 method249(int arg0, int arg1) {
        if (arg0 < 11) {
            field665 = -117;
        }
        field662++;
        class43 var3 = this.field667;
        class153 var4;
        synchronized (this.field667) {
            var4 = (class153) this.field667.method266((byte) -104, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field663;
        byte[] var6;
        synchronized (this.field663) {
            var6 = this.field663.method3732(arg1, 8906, 1);
        }
        class153 var7 = new class153();
        if (var6 != null) {
            var7.method1199(new class93(var6), -117);
        }
        class43 var8 = this.field667;
        synchronized (this.field667) {
            this.field667.method270(var7, (long) arg1, -126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lim;ILgj;)V", line = 94)
    public class41(class598 arg0, int arg1, class662 arg2) {
        this.field663 = arg2;
        this.field663.method3730((byte) -92, 1);
    }
}
