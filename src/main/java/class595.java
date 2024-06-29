import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class595 implements Runnable {

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "Lpf;")
    private class30 field8501 = new class30();

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "Z")
    private boolean field8510 = false;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public int field8511 = 0;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field8506;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "[Lsk;")
    public static class495[] field8504 = new class495[14];

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Lin;")
    public static class380 field8499 = new class380(102, 4);

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "Ljava/lang/Object;")
    public static volatile Object field8509 = null;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "Lrl;")
    public static class713 field8512 = new class713();

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public final void method3473(int arg0) {
        field8500++;
        this.field8510 = true;
        class30 var2 = this.field8501;
        synchronized (this.field8501) {
            if (arg0 != -15090) {
                return;
            }
            this.field8501.notifyAll();
        }
        try {
            this.field8506.join();
        } catch (InterruptedException var5) {
        }
        this.field8506 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IILce;)Lnq;")
    public final class177 method3474(int arg0, int arg1, class590 arg2) {
        int var4 = -78 / ((arg1 + 46) / 51);
        field8502++;
        class177 var5 = new class177();
        var5.field10170 = false;
        var5.field2658 = arg2;
        var5.field6209 = arg0;
        var5.field2656 = 3;
        this.method3478(var5, 10);
        return var5;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLce;[BI)Lnq;")
    public final class177 method3475(byte arg0, class590 arg1, byte[] arg2, int arg3) {
        field8503++;
        class177 var5 = new class177();
        var5.field2661 = arg2;
        var5.field2656 = 2;
        var5.field6209 = arg3;
        var5.field2658 = arg1;
        var5.field10170 = false;
        this.method3478(var5, 10);
        int var6 = -62 % ((1 - arg0) / 33);
        return var5;
    }

    @OriginalMember(owner = "client!cda", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field8510) {
            class30 var1 = this.field8501;
            class177 var2;
            synchronized (this.field8501) {
                var2 = (class177) this.field8501.method247(-32331);
                if (var2 == null) {
                    try {
                        this.field8501.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field8511--;
            }
            try {
                if (var2.field2656 == 2) {
                    var2.field2658.method3460((byte) -128, var2.field2661, (int) var2.field6209, var2.field2661.length);
                } else if (var2.field2656 == 3) {
                    var2.field2661 = var2.field2658.method3458(14894, (int) var2.field6209);
                }
            } catch (Exception var6) {
                class349.method2122(var6, null, 1);
            }
            var2.field10169 = false;
        }
        field8507++;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
    public static void method3476(int arg0) {
        field8504 = null;
        field8512 = null;
        field8499 = null;
        if (arg0 != 0) {
            field8509 = null;
        }
        field8509 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lce;BI)Lnq;")
    public final class177 method3477(class590 arg0, byte arg1, int arg2) {
        if (arg1 > -31) {
            this.run();
        }
        field8508++;
        class177 var4 = new class177();
        var4.field2656 = 1;
        class30 var5 = this.field8501;
        synchronized (this.field8501) {
            class177 var6 = (class177) this.field8501.method249(18371);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field6209 && var6.field2658 == arg0 && var6.field2656 == 2) {
                    var4.field10169 = false;
                    var4.field2661 = var6.field2661;
                    return var4;
                }
                var6 = (class177) this.field8501.method254((byte) -64);
            }
        }
        var4.field2661 = arg0.method3458(14894, arg2);
        var4.field10169 = false;
        var4.field10170 = true;
        return var4;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lnq;I)V")
    private final void method3478(class177 arg0, int arg1) {
        class30 var3 = this.field8501;
        synchronized (this.field8501) {
            this.field8501.method248((byte) 92, arg0);
            this.field8511++;
            this.field8501.notifyAll();
            if (arg1 != 10) {
                this.field8511 = -62;
            }
        }
        field8505++;
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lcea;)V")
    public class595(class111 arg0) {
        class746 var2 = arg0.method918(-6, 5, this);
        while (var2.field10365 == 0) {
            class579.method3405(10L, 10);
        }
        if (var2.field10365 == 2) {
            throw new RuntimeException();
        }
        this.field8506 = (Thread) var2.field10371;
    }
}
