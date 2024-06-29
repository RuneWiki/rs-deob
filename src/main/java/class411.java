import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class411 implements Runnable {

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Lgba;")
    private class358 field5639 = new class358();

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public int field5653 = 0;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "Z")
    private boolean field5654 = false;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field5652;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field5646 = 0;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field5649 = 0;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "Lim;")
    public static class353 field5650 = new class353(29, 6);

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "Lim;")
    public static class353 field5655 = new class353(89, 10);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
    public static final byte[] method2450(Object arg0, int arg1, int arg2, int arg3) {
        field5643++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class58.method311(arg3, arg1, var4, 0);
        } else if (arg0 instanceof class18) {
            class18 var5 = (class18) arg0;
            return var5.method87(-7056, arg1, arg3);
        } else if (arg2 == 3) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILkm;)Lwq;")
    public final class349 method2451(int arg0, int arg1, class120 arg2) {
        field5651++;
        class349 var4 = new class349();
        if (arg0 != -5926) {
            this.method2451(94, 53, null);
        }
        var4.field4806 = 3;
        var4.field4805 = arg2;
        var4.field2728 = false;
        var4.field7830 = arg1;
        this.method2454(var4, arg0 + 6051);
        return var4;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILkm;[B)Lwq;")
    public final class349 method2452(int arg0, int arg1, class120 arg2, byte[] arg3) {
        field5645++;
        class349 var5 = new class349();
        var5.field4805 = arg2;
        var5.field4807 = arg3;
        var5.field7830 = arg1;
        var5.field4806 = 2;
        var5.field2728 = false;
        if (arg0 != -21126) {
            this.field5652 = null;
        }
        this.method2454(var5, arg0 ^ 0xFFFFAD65);
        return var5;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IBLkm;)Lwq;")
    public final class349 method2453(int arg0, byte arg1, class120 arg2) {
        field5638++;
        class349 var4 = new class349();
        var4.field4806 = 1;
        class358 var5 = this.field5639;
        synchronized (this.field5639) {
            class349 var6 = (class349) this.field5639.method2222((byte) -95);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field7830 && var6.field4805 == arg2 && var6.field4806 == 2) {
                    var4.field4807 = var6.field4807;
                    var4.field2732 = false;
                    return var4;
                }
                var6 = (class349) this.field5639.method2225(123);
            }
        }
        var4.field4807 = arg2.method660(-42, arg0);
        var4.field2728 = true;
        var4.field2732 = false;
        int var8 = 0 % ((64 - arg1) / 51);
        return var4;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lwq;I)V")
    private final void method2454(class349 arg0, int arg1) {
        field5641++;
        if (arg1 <= 14) {
            this.field5639 = null;
        }
        class358 var3 = this.field5639;
        synchronized (this.field5639) {
            this.field5639.method2228((byte) 115, arg0);
            this.field5653++;
            this.field5639.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
    public final void method2455(boolean arg0) {
        this.field5654 = arg0;
        field5647++;
        class358 var2 = this.field5639;
        synchronized (this.field5639) {
            this.field5639.notifyAll();
        }
        try {
            this.field5652.join();
        } catch (InterruptedException var3) {
        }
        this.field5652 = null;
    }

    @OriginalMember(owner = "client!bw", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field5654) {
            class358 var1 = this.field5639;
            class349 var2;
            synchronized (this.field5639) {
                var2 = (class349) this.field5639.method2226(0);
                if (var2 == null) {
                    try {
                        this.field5639.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field5653--;
            }
            try {
                if (var2.field4806 == 2) {
                    var2.field4805.method658(22996, var2.field4807, (int) var2.field7830, var2.field4807.length);
                } else if (var2.field4806 == 3) {
                    var2.field4807 = var2.field4805.method660(-58, (int) var2.field7830);
                }
            } catch (Exception var7) {
                class447.method2602(var7, 127, null);
            }
            var2.field2732 = false;
        }
        field5648++;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljq;B)V")
    public static final void method2456(class447 arg0, byte arg1) {
        field5642++;
        int var2 = 30 / ((-arg1 - 56) / 52);
        class447 var3 = class356.method2218(arg0, (byte) 85);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class502.field6955;
            var5 = class604.field8711;
        } else {
            var4 = var3.field6330;
            var5 = var3.field6218;
        }
        class124.method670(-20823, false, arg0, var5, var4);
        class428.method2506(var5, (byte) 93, arg0, var4);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2457(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field5649 = -92;
        }
        field5640++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static void method2458(int arg0) {
        if (arg0 == 16137) {
            field5655 = null;
            field5650 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lgaa;)V")
    public class411(class279 arg0) {
        class441 var2 = arg0.method1730(5, 2, this);
        while (var2.field6001 == 0) {
            class353.method2204(10L, 7806);
        }
        if (var2.field6001 == 2) {
            throw new RuntimeException();
        }
        this.field5652 = (Thread) var2.field6000;
    }
}
