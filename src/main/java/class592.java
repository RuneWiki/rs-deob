import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class592 implements Runnable {

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lbj;")
    private class430 field8243 = new class430();

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Z")
    private boolean field8246 = false;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field8248 = 0;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field8247;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field8242 = 100;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lqf;")
    public static class751 field8244 = new class751(0, 0);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLwea;)Lve;", line = 6)
    public final class622 method3282(int arg0, byte arg1, class98 arg2) {
        field8239++;
        class622 var4 = new class622();
        var4.field8693 = arg2;
        var4.field8694 = 3;
        var4.field8700 = arg0;
        var4.field7750 = false;
        if (arg1 >= -32) {
            this.method3289(false);
        }
        this.method3284((byte) 117, var4);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method3283(boolean arg0) {
        class478.method2796();
        field8245++;
        if (!arg0) {
            method3285(false);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLve;)V", line = 35)
    private final void method3284(byte arg0, class622 arg1) {
        class430 var3 = this.field8243;
        synchronized (this.field8243) {
            this.field8243.method2564(arg1, (byte) -123);
            this.field8248++;
            this.field8243.notifyAll();
        }
        field8241++;
        int var4 = -76 / ((arg0 - 31) / 51);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V", line = 49)
    public static void method3285(boolean arg0) {
        field8244 = null;
        if (!arg0) {
            method3287(true, 104, 18, 54);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BBLwea;)Lve;", line = 60)
    public final class622 method3286(int arg0, byte[] arg1, byte arg2, class98 arg3) {
        field8236++;
        class622 var5 = new class622();
        var5.field7750 = false;
        var5.field8697 = arg1;
        var5.field8694 = 2;
        if (arg2 == 40) {
            var5.field8693 = arg3;
            var5.field8700 = arg0;
            this.method3284((byte) -22, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIII)I", line = 81)
    public static final int method3287(boolean arg0, int arg1, int arg2, int arg3) {
        field8237++;
        if (class517.field7282 == null) {
            return 0;
        }
        if (arg0) {
            method3285(false);
        }
        int var4 = arg3 >> 9;
        int var5 = arg1 >> 9;
        if (var4 < 0 || var5 < 0 || (class613.field8591 - 1) < var4 || class1.field3 - 1 < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class215.field2728[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class517.field7282[var6].method2382((byte) 19, arg1, arg3);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IBLwea;)Lve;", line = 110)
    public final class622 method3288(int arg0, byte arg1, class98 arg2) {
        field8240++;
        class622 var4 = new class622();
        var4.field8694 = 1;
        class430 var5 = this.field8243;
        synchronized (this.field8243) {
            class622 var6 = (class622) this.field8243.method2565((byte) -71);
            while (true) {
                if (var6 == null) {
                    if (arg1 != 9) {
                        this.method3284((byte) 15, null);
                    }
                    break;
                }
                if ((long) arg0 == var6.field8700 && var6.field8693 == arg2 && var6.field8694 == 2) {
                    var4.field8697 = var6.field8697;
                    var4.field7751 = false;
                    return var4;
                }
                var6 = (class622) this.field8243.method2568(-31355);
            }
        }
        var4.field8697 = arg2.method660(arg1 ^ 0x78, arg0);
        var4.field7750 = true;
        var4.field7751 = false;
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lnga;)V", line = 224)
    public class592(class256 arg0) {
        class435 var2 = arg0.method1555(5, true, this);
        while (var2.field6124 == 0) {
            class517.method2965(10L, -91);
        }
        if (var2.field6124 == 2) {
            throw new RuntimeException();
        }
        this.field8247 = (Thread) var2.field6123;
    }

    @OriginalMember(owner = "client!he", name = "run", descriptor = "()V", line = 153)
    public final void run() {
        while (!this.field8246) {
            class430 var1 = this.field8243;
            class622 var2;
            synchronized (this.field8243) {
                var2 = (class622) this.field8243.method2566(0);
                if (var2 == null) {
                    try {
                        this.field8243.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field8248--;
            }
            try {
                if (var2.field8694 == 2) {
                    var2.field8693.method658(var2.field8697, var2.field8697.length, (int) var2.field8700, -123);
                } else if (var2.field8694 == 3) {
                    var2.field8697 = var2.field8693.method660(114, (int) var2.field8700);
                }
            } catch (Exception var6) {
                class486.method2844((byte) -1, null, var6);
            }
            var2.field7751 = false;
        }
        field8249++;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)V", line = 197)
    public final void method3289(boolean arg0) {
        field8238++;
        this.field8246 = arg0;
        class430 var2 = this.field8243;
        synchronized (this.field8243) {
            this.field8243.notifyAll();
        }
        try {
            this.field8247.join();
        } catch (InterruptedException var3) {
        }
        this.field8247 = null;
    }
}
