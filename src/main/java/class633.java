import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class633 {

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Lpca;")
    private class714 field8732 = new class714(64);

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lpca;")
    private class714 field8738 = new class714(100);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lfp;")
    private class323 field8726;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lsaa;")
    public static class326 field8733 = null;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Z")
    public static boolean field8731 = false;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Lqfa;")
    public static class98 field8737 = new class98(72, 17);

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field8741 = 0;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Lbg;")
    public static class464 field8740 = new class464();

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lgca;")
    public static class249 field8729;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[I")
    public static int[] field8739;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Liaa;", line = 8)
    public final class494 method3521(int arg0, int arg1) {
        field8728++;
        class714 var3 = this.field8738;
        synchronized (this.field8738) {
            class494 var4 = (class494) this.field8738.method4022((long) arg1, (byte) -57);
            int var5 = -28 / ((arg0 + 52) / 54);
            if (var4 == null) {
                var4 = new class494(arg1);
                this.field8738.method4018((byte) 124, var4, (long) arg1);
            }
            return var4.method2956(-31394) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V", line = 40)
    public final void method3522(byte arg0, int arg1) {
        int var3 = -6 / ((32 - arg0) / 38);
        field8734++;
        class714 var4 = this.field8732;
        synchronized (this.field8732) {
            this.field8732.method4016(arg1, (byte) -73);
        }
        class714 var5 = this.field8738;
        synchronized (this.field8738) {
            this.field8738.method4016(arg1, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 58)
    public final void method3523(boolean arg0) {
        class714 var2 = this.field8732;
        synchronized (this.field8732) {
            if (!arg0) {
                return;
            }
            this.field8732.method4023((byte) 90);
        }
        field8727++;
        class714 var3 = this.field8738;
        synchronized (this.field8738) {
            this.field8738.method4023((byte) 107);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 76)
    public static void method3524(int arg0) {
        field8733 = null;
        field8729 = null;
        int var1 = 90 / ((-arg0 - 30) / 54);
        field8737 = null;
        field8739 = null;
        field8740 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)Lmga;", line = 90)
    public final class709 method3525(int arg0, byte arg1) {
        field8730++;
        class714 var3 = this.field8732;
        class709 var4;
        synchronized (this.field8732) {
            var4 = (class709) this.field8732.method4022((long) arg0, (byte) -63);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field8726;
        byte[] var6;
        synchronized (this.field8726) {
            var6 = this.field8726.method2100(class263.method1726(arg0, 6), (byte) 112, class346.method2236(26922, arg0));
        }
        class709 var7 = new class709();
        var7.field9837 = this;
        var7.field9842 = arg0;
        if (var6 != null) {
            var7.method3979(24718, new class675(var6));
        }
        var7.method3981(-29274);
        class714 var8 = this.field8732;
        synchronized (this.field8732) {
            int var9 = 107 / ((arg1 - 29) / 57);
            this.field8732.method4018((byte) 125, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lsaa;ILfp;Lfp;Lfp;)V", line = 145)
    public class633(class326 arg0, int arg1, class323 arg2, class323 arg3, class323 arg4) {
        this.field8726 = arg2;
        if (this.field8726 != null) {
            int var6 = this.field8726.method2098((byte) 20) - 1;
            this.field8726.method2084(var6, 0);
        }
        class14.method89(arg3, arg4, (byte) 118, 2);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 128)
    public final void method3526(int arg0) {
        field8736++;
        class714 var2 = this.field8732;
        synchronized (this.field8732) {
            this.field8732.method4024(0);
        }
        int var3 = -55 % ((60 - arg0) / 40);
        class714 var4 = this.field8738;
        synchronized (this.field8738) {
            this.field8738.method4024(0);
        }
    }
}
