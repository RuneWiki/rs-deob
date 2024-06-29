import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class140 implements Runnable {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lvr;")
    private class306 field2026 = new class306();

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field2029 = new Thread(this);

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Lud;")
    public static class63 field2031 = new class63("LIVE", 0);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Lnp;")
    public static class115 field2033;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Lns;")
    public static class438 field2034;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lvg;I)V")
    private final void method931(class467 arg0, int arg1) {
        if (arg1 > -2) {
            method936(-10);
        }
        class306 var3 = this.field2026;
        synchronized (this.field2026) {
            this.field2026.method1958(arg0, 0);
            this.field2026.notify();
        }
        field2030++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;I)Lcb;")
    public final class117 method932(String arg0, int arg1) {
        field2028++;
        if (this.field2029 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class117 var3 = new class117(arg0);
            if (arg1 != 0) {
                this.method931(null, 7);
            }
            this.method931(var3, -94);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljb;B)V")
    public static final void method933(class499 arg0, byte arg1) {
        field2027++;
        int var2 = -97 / ((arg1 + 56) / 53);
        class499 var3 = class270.method1724(arg0, 325644272);
        int var4;
        int var5;
        if (var3 == null) {
            var5 = class486.field7136;
            var4 = class7.field112;
        } else {
            var4 = var3.field7348;
            var5 = var3.field7386;
        }
        class457.method2752(var5, var4, false, arg0, 31166);
        class399.method2455(arg0, true, var4, var5);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public final void method934(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field2025++;
        if (this.field2029 == null) {
            return;
        }
        this.method931(new class467(), arg0 ^ 0xFFFFFFF9);
        try {
            this.field2029.join();
        } catch (InterruptedException var2) {
        }
        this.field2029 = null;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static final void method935(int arg0) {
        class380[] var1 = class349.field5436;
        synchronized (class349.field5436) {
            int var2 = 0;
            while (true) {
                if (var2 >= class349.field5436.length) {
                    break;
                }
                class349.field5436[var2] = new class380();
                class190.field2659[var2] = 0;
                var2++;
            }
        }
        field2032++;
        if (arg0 <= 108) {
            field2031 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
    public class140() {
        this.field2029.setDaemon(true);
        this.field2029.start();
    }

    @OriginalMember(owner = "client!vn", name = "run", descriptor = "()V")
    public final void run() {
        field2035++;
        while (true) {
            class306 var1 = this.field2026;
            class117 var3;
            synchronized (this.field2026) {
                class467 var2;
                for (var2 = this.field2026.method1962(0); var2 == null; var2 = this.field2026.method1962(0)) {
                    try {
                        this.field2026.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class117)) {
                    return;
                }
                var3 = (class117) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1645).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1648 = var5;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
    public static void method936(int arg0) {
        field2031 = null;
        field2033 = null;
        if (arg0 > -62) {
            method935(86);
        }
        field2034 = null;
    }
}
