import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class457 implements Runnable {

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "Lcba;")
    private class513 field6509 = new class513();

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public int field6515 = 0;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "Z")
    private boolean field6518 = false;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field6517;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "Lqfa;")
    public static class85 field6508 = new class85(112, 10);

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field6511 = 1;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "[I")
    public static int[] field6507;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
    public static final boolean method2742(int arg0, int arg1, int arg2) {
        if (arg1 >= -109) {
            field6511 = -52;
        }
        field6514++;
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILfj;I)Lnn;")
    public final class384 method2743(int arg0, class610 arg1, int arg2) {
        field6506++;
        class384 var4 = new class384();
        var4.field5648 = 1;
        class513 var5 = this.field6509;
        synchronized (this.field6509) {
            class384 var6 = (class384) this.field6509.method3024(5572);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field9628 && var6.field5645 == arg1 && var6.field5648 == 2) {
                    var4.field5646 = var6.field5646;
                    var4.field9179 = false;
                    return var4;
                }
                var6 = (class384) this.field6509.method3026(0);
            }
        }
        if (arg2 <= 97) {
            this.method2745(-25, -13, null, null);
        }
        var4.field5646 = arg1.method3503(arg0, -302126520);
        var4.field9180 = true;
        var4.field9179 = false;
        return var4;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lnn;Z)V")
    private final void method2744(class384 arg0, boolean arg1) {
        class513 var3 = this.field6509;
        synchronized (this.field6509) {
            this.field6509.method3023((byte) 49, arg0);
            this.field6515++;
            if (!arg1) {
                return;
            }
            this.field6509.notifyAll();
        }
        field6516++;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[BLfj;)Lnn;")
    public final class384 method2745(int arg0, int arg1, byte[] arg2, class610 arg3) {
        if (arg1 != 27022) {
            this.field6518 = true;
        }
        field6505++;
        class384 var5 = new class384();
        var5.field5648 = 2;
        var5.field5646 = arg2;
        var5.field5645 = arg3;
        var5.field9628 = arg0;
        var5.field9180 = false;
        this.method2744(var5, true);
        return var5;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
    public static void method2746(byte arg0) {
        if (arg0 == 92) {
            field6508 = null;
            field6507 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public final void method2747(int arg0) {
        field6513++;
        this.field6518 = true;
        class513 var2 = this.field6509;
        synchronized (this.field6509) {
            this.field6509.notifyAll();
        }
        try {
            this.field6517.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 2) {
            field6508 = null;
        }
        this.field6517 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILfj;)Lnn;")
    public final class384 method2748(int arg0, int arg1, class610 arg2) {
        field6510++;
        class384 var4 = new class384();
        var4.field5648 = 3;
        var4.field5645 = arg2;
        int var5 = -97 % ((arg1 + 28) / 49);
        var4.field9180 = false;
        var4.field9628 = arg0;
        this.method2744(var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!hca", name = "run", descriptor = "()V")
    public final void run() {
        field6504++;
        while (!this.field6518) {
            class513 var1 = this.field6509;
            class384 var2;
            synchronized (this.field6509) {
                var2 = (class384) this.field6509.method3027(0);
                if (var2 == null) {
                    try {
                        this.field6509.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6515--;
            }
            try {
                if (var2.field5648 == 2) {
                    var2.field5645.method3505(var2.field5646, var2.field5646.length, -79, (int) var2.field9628);
                } else if (var2.field5648 == 3) {
                    var2.field5646 = var2.field5645.method3503((int) var2.field9628, -302126520);
                }
            } catch (Exception var6) {
                class374.method2357(null, 125, var6);
            }
            var2.field9179 = false;
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Ln;)V")
    public class457(class17 arg0) {
        class456 var2 = arg0.method400(5, this, false);
        while (var2.field6502 == 0) {
            class185.method1354(10L, 10);
        }
        if (var2.field6502 == 2) {
            throw new RuntimeException();
        }
        this.field6517 = (Thread) var2.field6499;
    }
}
