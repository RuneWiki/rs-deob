import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class164 implements Runnable {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Llq;")
    private class5 field2280 = new class5();

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Z")
    private boolean field2289 = false;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field2287 = 0;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field2288;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field2281 = new Random();

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lhj;")
    public static class172 field2290 = new class172();

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2293 = -1;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "[I")
    public static int[] field2294 = new int[14];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Liq;")
    public static class134 field2291;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILuj;I)Lu;")
    public final class303 method985(int arg0, class415 arg1, int arg2) {
        field2285++;
        class303 var4 = new class303();
        var4.field4575 = arg0;
        var4.field5144 = false;
        var4.field4584 = arg1;
        var4.field6254 = (long) arg2;
        this.method988(22049, var4);
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILuj;)Lu;")
    public final class303 method986(int arg0, int arg1, class415 arg2) {
        field2279++;
        class303 var4 = new class303();
        var4.field4575 = 1;
        class5 var5 = this.field2280;
        synchronized (this.field2280) {
            if (arg1 != 3) {
                field2281 = null;
            }
            class303 var6 = (class303) this.field2280.method42(true);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field6254 && var6.field4584 == arg2 && var6.field4575 == 2) {
                    var4.field5140 = false;
                    var4.field4574 = var6.field4574;
                    return var4;
                }
                var6 = (class303) this.field2280.method43(9);
            }
        }
        var4.field4574 = arg2.method2592(arg0, 121);
        var4.field5140 = false;
        var4.field5144 = true;
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method987(int arg0) {
        field2294 = null;
        field2281 = null;
        field2291 = null;
        if (arg0 != -1) {
            field2281 = null;
        }
        field2290 = null;
    }

    @OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2289) {
            class5 var1 = this.field2280;
            class303 var2;
            synchronized (this.field2280) {
                var2 = (class303) this.field2280.method47(17795);
                if (var2 == null) {
                    try {
                        this.field2280.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2287--;
            }
            try {
                if (var2.field4575 == 2) {
                    var2.field4584.method2593((int) var2.field6254, var2.field4574, var2.field4574.length, -38);
                } else if (var2.field4575 == 3) {
                    var2.field4574 = var2.field4584.method2592((int) var2.field6254, 127);
                }
            } catch (Exception var7) {
                class288.method1783((String) null, var7, 120);
            }
            var2.field5140 = false;
        }
        field2284++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILu;)V")
    private final void method988(int arg0, class303 arg1) {
        field2282++;
        class5 var3 = this.field2280;
        synchronized (this.field2280) {
            this.field2280.method40(arg1, 17478);
            this.field2287++;
            this.field2280.notifyAll();
        }
        if (arg0 != 22049) {
            this.field2289 = false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Luj;[BII)Lu;")
    public final class303 method989(class415 arg0, byte[] arg1, int arg2, int arg3) {
        field2283++;
        class303 var5 = new class303();
        var5.field5144 = false;
        var5.field4575 = 2;
        var5.field4584 = arg0;
        var5.field6254 = (long) arg2;
        var5.field4574 = arg1;
        this.method988(22049, var5);
        return arg3 == -19015 ? var5 : null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public final void method990(int arg0) {
        this.field2289 = true;
        field2286++;
        class5 var2 = this.field2280;
        synchronized (this.field2280) {
            if (arg0 != -1) {
                return;
            }
            this.field2280.notifyAll();
        }
        try {
            this.field2288.join();
        } catch (InterruptedException var5) {
        }
        this.field2288 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lsc;)V")
    public class164(class239 arg0) {
        class211 var2 = arg0.method1438(false, 5, this);
        while (var2.field3172 == 0) {
            class109.method674((byte) 99, 10L);
        }
        if (var2.field3172 == 2) {
            throw new RuntimeException();
        }
        this.field2288 = (Thread) var2.field3175;
    }
}
