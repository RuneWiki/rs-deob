import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class195 {

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "Lde;")
    private class534 field2663 = new class534(64);

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Lde;")
    private class534 field2673 = new class534(100);

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lnd;")
    private class547 field2666;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "J")
    public static long field2667 = 0L;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "Lhg;")
    public static class693 field2672 = new class693(32, 3);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "[I")
    public static int[] field2670;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "[Ls;")
    public static class282[] field2669;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public final void method1295(byte arg0) {
        int var2 = 46 / ((arg0 + 84) / 40);
        field2662++;
        class534 var3 = this.field2663;
        synchronized (this.field2663) {
            this.field2663.method3065(true);
        }
        class534 var4 = this.field2673;
        synchronized (this.field2673) {
            this.field2673.method3065(true);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)V")
    public final void method1296(int arg0, byte arg1) {
        class534 var3 = this.field2663;
        synchronized (this.field2663) {
            this.field2663.method3070(arg0, 124);
        }
        if (arg1 < 61) {
            field2669 = null;
        }
        field2661++;
        class534 var4 = this.field2673;
        synchronized (this.field2673) {
            this.field2673.method3070(arg0, 120);
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)V")
    public static void method1297(byte arg0) {
        field2669 = null;
        field2670 = null;
        field2672 = null;
        int var1 = 17 % ((arg0 + 25) / 50);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)Lic;")
    public final class701 method1298(int arg0, int arg1) {
        field2668++;
        class534 var3 = this.field2673;
        synchronized (this.field2673) {
            int var4 = 110 % ((36 - arg1) / 36);
            class701 var5 = (class701) this.field2673.method3079((long) arg0, 0);
            if (var5 == null) {
                var5 = new class701(arg0);
                this.field2673.method3077((byte) -92, (long) arg0, var5);
            }
            return var5.method3944(-20687) ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)Lmk;")
    public final class56 method1299(byte arg0, int arg1) {
        field2671++;
        class534 var3 = this.field2663;
        class56 var4;
        synchronized (this.field2663) {
            var4 = (class56) this.field2663.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field2666;
        byte[] var6;
        synchronized (this.field2666) {
            var6 = this.field2666.method3153(class357.method2073(71, arg1), 0, class717.method4012((byte) -104, arg1));
        }
        class56 var7 = new class56();
        var7.field779 = this;
        var7.field789 = arg1;
        if (var6 != null) {
            var7.method417((byte) 69, new class461(var6));
        }
        if (arg0 > -73) {
            field2672 = null;
        }
        var7.method410(-100);
        class534 var8 = this.field2663;
        synchronized (this.field2663) {
            this.field2663.method3077((byte) -104, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public final void method1300(int arg0) {
        field2664++;
        class534 var2 = this.field2663;
        synchronized (this.field2663) {
            if (arg0 != 3211) {
                this.method1299((byte) -128, -16);
            }
            this.field2663.method3064(false);
        }
        class534 var3 = this.field2673;
        synchronized (this.field2673) {
            this.field2673.method3064(false);
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lal;ILnd;Lnd;Lnd;)V")
    public class195(class102 arg0, int arg1, class547 arg2, class547 arg3, class547 arg4) {
        this.field2666 = arg2;
        if (this.field2666 != null) {
            int var6 = this.field2666.method3155((byte) -113) - 1;
            this.field2666.method3178((byte) 61, var6);
        }
        class144.method1037(2, arg3, arg4, 17598);
    }
}
