import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class524 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Lau;")
    private class692 field7443 = new class692(64);

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "Lau;")
    private class692 field7448 = new class692(100);

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lmv;")
    private class295 field7442;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "Lvg;")
    public static class622 field7447 = new class622(101, 8);

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "Liba;")
    public static class211 field7449 = new class211(37, 11);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)Lofa;")
    public final class128 method2967(int arg0, int arg1) {
        field7444++;
        class692 var3 = this.field7448;
        class128 var4;
        synchronized (this.field7448) {
            var4 = (class128) this.field7448.method3901((long) arg1, arg0 ^ 0x36);
            if (var4 == null) {
                var4 = new class128(arg1);
                this.field7448.method3894(var4, (byte) 60, (long) arg1);
            }
            if (!var4.method917(0)) {
                return null;
            }
        }
        return arg0 == -1 ? var4 : null;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V")
    public final void method2968(int arg0, int arg1) {
        field7445++;
        class692 var3 = this.field7443;
        synchronized (this.field7443) {
            this.field7443.method3900(arg1, 0);
        }
        class692 var4 = this.field7448;
        synchronized (this.field7448) {
            this.field7448.method3900(arg1, 0);
            if (arg0 != 100) {
                field7447 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
    public static final void method2969(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class355.method2197(var3.field669);
        class355.method2197(var3.field675);
        if (var3.field669 != null) {
            var3.field669 = null;
        }
        if (var3.field675 != null) {
            var3.field675 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
    public static void method2970(boolean arg0) {
        field7449 = null;
        if (arg0) {
            method2970(false);
        }
        field7447 = null;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(II)Lhq;")
    public final class47 method2971(int arg0, int arg1) {
        field7446++;
        class692 var3 = this.field7443;
        class47 var4;
        synchronized (this.field7443) {
            var4 = (class47) this.field7443.method3901((long) arg1, -69);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 > -21) {
            this.method2971(-95, 115);
        }
        class295 var5 = this.field7442;
        byte[] var6;
        synchronized (this.field7442) {
            var6 = this.field7442.method1844(class502.method2863(false, arg1), 31330, class50.method299(127, arg1));
        }
        class47 var7 = new class47();
        var7.field752 = arg1;
        var7.field741 = this;
        if (var6 != null) {
            var7.method281((byte) 71, new class540(var6));
        }
        var7.method280((byte) 1);
        class692 var8 = this.field7443;
        synchronized (this.field7443) {
            this.field7443.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public final void method2972(int arg0) {
        class692 var2 = this.field7443;
        synchronized (this.field7443) {
            this.field7443.method3891(arg0 + 13736);
        }
        field7441++;
        class692 var3 = this.field7448;
        synchronized (this.field7448) {
            this.field7448.method3891(13747);
        }
        if (arg0 != 11) {
            method2969(-125, 5, -22);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public final void method2973(int arg0) {
        class692 var2 = this.field7443;
        synchronized (this.field7443) {
            this.field7443.method3890(arg0);
        }
        field7440++;
        class692 var3 = this.field7448;
        synchronized (this.field7448) {
            this.field7448.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lsea;ILmv;Lmv;Lmv;)V")
    public class524(class373 arg0, int arg1, class295 arg2, class295 arg3, class295 arg4) {
        this.field7442 = arg2;
        if (this.field7442 != null) {
            int var6 = this.field7442.method1816(49) - 1;
            this.field7442.method1845(var6, true);
        }
        class92.method509(15743, 2, arg4, arg3);
    }
}
