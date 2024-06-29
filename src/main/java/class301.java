import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class301 implements Runnable {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "Lqia;")
    private class547 field3877 = new class547();

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field3884 = new Thread(this);

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "Lmq;")
    public static class78 field3878 = new class78(56, -1);

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "Lus;")
    public static class328 field3886 = new class328(26, 8);

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method1774(boolean arg0, int arg1) {
        field3885++;
        if (arg1 != 8) {
            return;
        }
        for (class389 var2 = (class389) class326.field4157.method3111(89); var2 != null; var2 = (class389) class326.field4157.method3116(arg1 ^ 0xFFFFFFB4)) {
            if (var2.field5419 != null) {
                class668.field9148.method664(var2.field5419);
                var2.field5419 = null;
            }
            if (var2.field5418 != null) {
                class668.field9148.method664(var2.field5418);
                var2.field5418 = null;
            }
            var2.method3426((byte) -117);
        }
        if (!arg0) {
            return;
        }
        for (class389 var3 = (class389) class204.field2596.method3111(arg1 + 90); var3 != null; var3 = (class389) class204.field2596.method3116(-121)) {
            if (var3.field5419 != null) {
                class668.field9148.method664(var3.field5419);
                var3.field5419 = null;
            }
            var3.method3426((byte) -88);
        }
        for (class389 var4 = (class389) class297.field3854.method3245(false); var4 != null; var4 = (class389) class297.field3854.method3252(12938)) {
            if (var4.field5419 != null) {
                class668.field9148.method664(var4.field5419);
                var4.field5419 = null;
            }
            var4.method3426((byte) -38);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;)Lcha;", line = 74)
    public final class174 method1775(int arg0, String arg1) {
        field3883++;
        if (this.field3884 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg0 != 1000) {
                field3878 = null;
            }
            class174 var3 = new class174(arg1);
            this.method1777(var3, 98);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V", line = 96)
    public final void method1776(boolean arg0) {
        field3879++;
        if (this.field3884 == null) {
            return;
        }
        this.method1777(new class627(), 96);
        if (arg0) {
            return;
        }
        try {
            this.field3884.join();
        } catch (InterruptedException var2) {
        }
        this.field3884 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lns;I)V", line = 122)
    private final void method1777(class627 arg0, int arg1) {
        class547 var3 = this.field3877;
        synchronized (this.field3877) {
            this.field3877.method3110(arg0, 1);
            if (arg1 <= 95) {
                field3878 = null;
            }
            this.field3877.notify();
        }
        field3881++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 137)
    public static final void method1778(byte arg0) {
        class347.field4487.method3573((byte) 50);
        field3880++;
        class251.field3182.method636((byte) 123);
        class5.field52.method2488((byte) 30);
        class358.field5112.method882(0);
        class598.field8304.method1447(-115);
        class190.field2488.method3946(-4375);
        class646.field8903.method642((byte) 93);
        class250.field3177.method3617((byte) -128);
        class197.field2537.method2536(-109);
        class348.field4512.method949(7237);
        class190.field2501.method2849(110);
        class70.field946.method1488((byte) -117);
        class37.field551.method2767(-112);
        class223.field2925.method1246(arg0 - 239);
        class188.field2466.method3442((byte) 89);
        class182.field2384.method3001((byte) -123);
        class696.field9859.method1172(true);
        class545.field7652.method430((byte) -96);
        class525.field7423.method204(arg0 ^ 0xFFFFFFC2);
        class580.field8064.method1031(arg0 ^ 0x5CD9);
        class398.field5521.method2716((byte) -15);
        class54.method440(false);
        class450.method2651((byte) -19);
        class107.method730(arg0 ^ 0xFFFFFFEB);
        class65.method493((byte) 120);
        class165.method1027(-13);
        class504.field7104.method781((byte) 47);
        if (arg0 != 115) {
            field3886 = null;
        }
        class645.field8893.method781((byte) 47);
        class229.field2992.method781((byte) 47);
        class576.field8038.method781((byte) 47);
        class445.field6276.method781((byte) 47);
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V", line = 222)
    public class301() {
        this.field3884.setDaemon(true);
        this.field3884.start();
    }

    @OriginalMember(owner = "client!qu", name = "run", descriptor = "()V", line = 184)
    public final void run() {
        field3882++;
        while (true) {
            class547 var1 = this.field3877;
            class174 var3;
            synchronized (this.field3877) {
                class627 var2;
                for (var2 = this.field3877.method3115(1210318848); var2 == null; var2 = this.field3877.method3115(1210318848)) {
                    try {
                        this.field3877.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class174)) {
                    return;
                }
                var3 = (class174) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2271).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2272 = var5;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 236)
    public static void method1779(int arg0) {
        field3878 = null;
        if (arg0 != -22998) {
            method1778((byte) -89);
        }
        field3886 = null;
    }
}
