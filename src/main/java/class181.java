import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class181 implements Runnable {

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "Lsu;")
    private class192 field2678 = new class192();

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field2670 = new Thread(this);

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Luc;")
    public static class27 field2669 = new class27(78, 7);

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "Luc;")
    public static class27 field2677 = new class27(79, 8);

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "Z")
    public static boolean field2679 = false;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "Lxa;")
    public static class461 field2675;

    @OriginalMember(owner = "client!wfa", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field2672++;
        while (true) {
            class192 var1 = this.field2678;
            class356 var3;
            synchronized (this.field2678) {
                class539 var2;
                for (var2 = this.field2678.method1272(0); var2 == null; var2 = this.field2678.method1272(0)) {
                    try {
                        this.field2678.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class356)) {
                    return;
                }
                var3 = (class356) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5097).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5096 = var5;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V", line = 44)
    public static void method1221(byte arg0) {
        if (arg0 == -39) {
            field2669 = null;
            field2675 = null;
            field2677 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)Z", line = 57)
    public static final boolean method1222(boolean arg0, int arg1) {
        field2673++;
        if (arg0) {
            method1222(false, 97);
        }
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 69)
    public final void method1223(int arg0) {
        field2671++;
        if (this.field2670 == null) {
            return;
        }
        this.method1225(true, new class539());
        try {
            if (arg0 != 3) {
                this.method1225(true, null);
            }
            this.field2670.join();
        } catch (InterruptedException var2) {
        }
        this.field2670 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)I", line = 91)
    public static final int method1224(int arg0) {
        if (arg0 > -82) {
            method1222(true, 46);
        }
        field2668++;
        return 19;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZLia;)V", line = 110)
    private final void method1225(boolean arg0, class539 arg1) {
        field2674++;
        class192 var3 = this.field2678;
        synchronized (this.field2678) {
            if (arg0) {
                this.field2678.method1273(arg1, (byte) 122);
                this.field2678.notify();
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;B)Lfu;", line = 124)
    public final class356 method1226(String arg0, byte arg1) {
        field2676++;
        if (this.field2670 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            int var3 = -8 / ((-arg1 - 30) / 44);
            class356 var4 = new class356(arg0);
            this.method1225(true, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V", line = 154)
    public class181() {
        this.field2670.setDaemon(true);
        this.field2670.start();
    }
}
