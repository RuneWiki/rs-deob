import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class605 implements Runnable {

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lce;")
    private class283 field8586 = new class283();

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public int field8591 = 0;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
    private boolean field8588 = false;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field8592;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Lhga;")
    public static class158 field8580 = new class158(98, 7);

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILmu;I)Luu;")
    public final class261 method3517(int arg0, class275 arg1, int arg2) {
        field8585++;
        class261 var4 = new class261();
        var4.field1586 = arg0;
        var4.field4272 = arg1;
        var4.field4269 = 3;
        var4.field648 = false;
        this.method3522(var4, -3);
        return arg2 > -45 ? null : var4;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lmu;IZ)Luu;")
    public final class261 method3518(class275 arg0, int arg1, boolean arg2) {
        field8587++;
        class261 var4 = new class261();
        var4.field4269 = 1;
        class283 var5 = this.field8586;
        synchronized (this.field8586) {
            class261 var6 = (class261) this.field8586.method2008(-3717);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field1586 && var6.field4272 == arg0 && var6.field4269 == 2) {
                    var4.field644 = false;
                    var4.field4271 = var6.field4271;
                    return var4;
                }
                var6 = (class261) this.field8586.method2011(35);
            }
        }
        var4.field4271 = arg0.method1930(6, arg1);
        var4.field648 = arg2;
        var4.field644 = false;
        return var4;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public final void method3519(int arg0) {
        field8589++;
        this.field8588 = true;
        class283 var2 = this.field8586;
        synchronized (this.field8586) {
            this.field8586.notifyAll();
        }
        try {
            int var3 = 49 % ((arg0 - 8) / 56);
            this.field8592.join();
        } catch (InterruptedException var4) {
        }
        this.field8592 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
    public static final int method3520(int arg0, int arg1, int arg2) {
        if (arg0 != -28443) {
            return -84;
        }
        field8581++;
        double var3 = Math.log((double) arg2) / Math.log(2.0D);
        double var5 = Math.log((double) arg1) / Math.log(2.0D);
        double var7 = var5 + Math.random() * (var3 - var5);
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([BIILmu;)Luu;")
    public final class261 method3521(byte[] arg0, int arg1, int arg2, class275 arg3) {
        field8583++;
        class261 var5 = new class261();
        if (arg1 != -31139) {
            this.method3519(118);
        }
        var5.field4269 = 2;
        var5.field4271 = arg0;
        var5.field648 = false;
        var5.field4272 = arg3;
        var5.field1586 = arg2;
        this.method3522(var5, arg1 ^ 0x79A0);
        return var5;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Luu;I)V")
    private final void method3522(class261 arg0, int arg1) {
        field8584++;
        class283 var3 = this.field8586;
        synchronized (this.field8586) {
            this.field8586.method2015(arg0, -63);
            this.field8591++;
            this.field8586.notifyAll();
        }
        if (arg1 != -3) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!rs", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field8588) {
            class283 var1 = this.field8586;
            class261 var2;
            synchronized (this.field8586) {
                var2 = (class261) this.field8586.method2012(false);
                if (var2 == null) {
                    try {
                        this.field8586.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field8591--;
            }
            try {
                if (var2.field4269 == 2) {
                    var2.field4272.method1933(var2.field4271, var2.field4271.length, 100, (int) var2.field1586);
                } else if (var2.field4269 == 3) {
                    var2.field4271 = var2.field4272.method1930(6, (int) var2.field1586);
                }
            } catch (Exception var6) {
                class660.method3790(10216, var6, null);
            }
            var2.field644 = false;
        }
        field8590++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZBI)Lqi;")
    public static final class527 method3523(boolean arg0, byte arg1, int arg2) {
        field8582++;
        long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
        if (arg1 < 118) {
            method3524(-41);
        }
        return (class527) class437.field6663.method1558(var3, (byte) -93);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    public static void method3524(int arg0) {
        if (arg0 != -3) {
            method3524(120);
        }
        field8580 = null;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lk;)V")
    public class605(class525 arg0) {
        class701 var2 = arg0.method3180(this, false, 5);
        while (var2.field9884 == 0) {
            class549.method3313(10L, 124);
        }
        if (var2.field9884 == 2) {
            throw new RuntimeException();
        }
        this.field8592 = (Thread) var2.field9885;
    }
}
