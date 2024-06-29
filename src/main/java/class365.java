import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class365 {

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Ltl;")
    private class400 field5523 = new class400(64);

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Ltl;")
    public class400 field5531 = new class400(64);

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Lui;")
    private class451 field5526;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Lui;")
    public class451 field5525;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "Lsh;")
    public static class472 field5518 = new class472(82, 6);

    @OriginalMember(owner = "client!po", name = "h", descriptor = "[Lal;")
    public static class208[] field5522 = new class208[8];

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field5524 = -1;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "Z")
    public static boolean field5528 = false;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Ldp;")
    public static class319 field5519;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "Led;")
    public static class84 field5529;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)V")
    public static final void method2238(int arg0, byte arg1, int arg2) {
        class303.field4512 = arg2 - class189.field2902;
        field5530++;
        if (arg1 == -89) {
            class294.field4429 = arg0 - class189.field2912;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public final void method2239(boolean arg0) {
        field5516++;
        class400 var2 = this.field5523;
        synchronized (this.field5523) {
            this.field5523.method2401((byte) -49);
        }
        class400 var3 = this.field5531;
        synchronized (this.field5531) {
            this.field5531.method2401((byte) -111);
            if (!arg0) {
                this.method2244(26, -16, -112);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public final void method2240(int arg0) {
        field5515++;
        class400 var2 = this.field5523;
        synchronized (this.field5523) {
            this.field5523.method2388(126);
        }
        class400 var3 = this.field5531;
        synchronized (this.field5531) {
            if (arg0 != -347) {
                this.method2243((byte) -82, 67);
            }
            this.field5531.method2388(31);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public static void method2241(int arg0) {
        field5529 = null;
        field5522 = null;
        field5519 = null;
        if (arg0 != -7483) {
            field5522 = null;
        }
        field5518 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
    public final void method2242(int arg0, int arg1) {
        field5520++;
        class400 var3 = this.field5523;
        synchronized (this.field5523) {
            this.field5523.method2389(false, arg1);
        }
        class400 var4 = this.field5531;
        synchronized (this.field5531) {
            this.field5531.method2389(false, arg1);
        }
        if (arg0 <= 56) {
            field5524 = -86;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Ls;")
    public final class150 method2243(byte arg0, int arg1) {
        field5527++;
        class400 var3 = this.field5523;
        class150 var4;
        synchronized (this.field5523) {
            var4 = (class150) this.field5523.method2393(-127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5526.method2691(arg1, 34, 0);
        class150 var6 = new class150();
        if (arg0 < 101) {
            field5518 = null;
        }
        var6.field2105 = this;
        if (var5 != null) {
            var6.method1016(new class446(var5), (byte) -116);
        }
        class400 var7 = this.field5523;
        synchronized (this.field5523) {
            this.field5523.method2395(0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public final void method2244(int arg0, int arg1, int arg2) {
        field5521++;
        this.field5523 = new class400(arg0);
        if (arg2 != 64) {
            this.method2242(-49, 77);
        }
        this.field5531 = new class400(arg1);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lgp;ILui;Lui;)V")
    public class365(class430 arg0, int arg1, class451 arg2, class451 arg3) {
        this.field5526 = arg2;
        this.field5525 = arg3;
        this.field5526.method2662(34, (byte) -7);
    }
}
