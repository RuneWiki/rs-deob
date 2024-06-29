import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class267 {

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Ljp;")
    private class236 field3524 = new class236(64);

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "Ljp;")
    private class236 field3529 = new class236(100);

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "Lpc;")
    private class473 field3520;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lcu;")
    public static class145 field3516 = new class145(75, -1);

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field3528 = 0;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Lnt;")
    public static class147 field3522;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "Lwt;")
    public static class202 field3526;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method1600(int arg0) {
        field3526 = null;
        field3516 = null;
        if (arg0 != -4589) {
            method1602(-49, 73, -88);
        }
        field3522 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)Ldc;")
    public final class5 method1601(int arg0, byte arg1) {
        if (arg1 >= -112) {
            field3528 = 79;
        }
        field3519++;
        class236 var3 = this.field3524;
        class5 var4;
        synchronized (this.field3524) {
            var4 = (class5) this.field3524.method1456((long) arg0, 119);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3520.method2708(class148.method1022(arg0, -1981755129), class63.method435(127, arg0), (byte) 54);
        class5 var6 = new class5();
        var6.field139 = arg0;
        var6.field138 = this;
        if (var5 != null) {
            var6.method28(126, new class379(var5));
        }
        var6.method27(-1);
        class236 var7 = this.field3524;
        synchronized (this.field3524) {
            this.field3524.method1462(var6, (long) arg0, -53);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)Z")
    public static final boolean method1602(int arg0, int arg1, int arg2) {
        field3515++;
        if (arg0 != 14029) {
            method1603(11, -4, 38);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)Z")
    public static final boolean method1603(int arg0, int arg1, int arg2) {
        if (arg2 != -5213) {
            field3526 = null;
        }
        field3518++;
        return class5.method29(-119, arg1, arg0) | (arg1 & 0x70000) != 0 || class494.method2841(arg1, arg0, (byte) -125);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
    public final void method1604(int arg0, int arg1) {
        field3514++;
        class236 var3 = this.field3524;
        synchronized (this.field3524) {
            this.field3524.method1461(arg1 - 5, arg0);
        }
        class236 var4 = this.field3529;
        synchronized (this.field3529) {
            this.field3529.method1461(-5, arg0);
            if (arg1 != 0) {
                method1603(117, 17, 46);
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
    public final void method1605(boolean arg0) {
        if (arg0) {
            field3516 = null;
        }
        field3517++;
        class236 var2 = this.field3524;
        synchronized (this.field3524) {
            this.field3524.method1458((byte) -61);
        }
        class236 var3 = this.field3529;
        synchronized (this.field3529) {
            this.field3529.method1458((byte) 94);
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)Ldr;")
    public final class504 method1606(int arg0, int arg1) {
        field3521++;
        class236 var3 = this.field3529;
        class504 var4;
        synchronized (this.field3529) {
            var4 = (class504) this.field3529.method1456((long) arg0, 112);
            int var5 = 55 / ((8 - arg1) / 45);
            if (var4 == null) {
                var4 = new class504(arg0);
                this.field3529.method1462(var4, (long) arg0, -119);
            }
        }
        synchronized (var4) {
            return var4.method2875(110) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(II)Lfr;")
    public static final class282 method1607(int arg0, int arg1) {
        field3527++;
        class282[] var2 = class71.method468(-60);
        int var3 = 62 / ((arg0 - 56) / 52);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class282 var5 = var2[var4];
            if (var5.field3703 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public final void method1608(int arg0) {
        field3523++;
        class236 var2 = this.field3524;
        synchronized (this.field3524) {
            this.field3524.method1459(19088);
            if (arg0 != 0) {
                method1607(19, -20);
            }
        }
        class236 var3 = this.field3529;
        synchronized (this.field3529) {
            this.field3529.method1459(19088);
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lrb;ILpc;Lpc;Lpc;)V")
    public class267(class234 arg0, int arg1, class473 arg2, class473 arg3, class473 arg4) {
        this.field3520 = arg2;
        if (this.field3520 != null) {
            int var6 = this.field3520.method2724(0) - 1;
            this.field3520.method2710(var6, (byte) -101);
        }
        class354.method2069(arg4, arg3, true);
    }
}
