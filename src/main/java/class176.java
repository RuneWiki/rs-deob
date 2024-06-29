import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class176 implements Runnable {

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "Lgj;")
    private class593 field2703 = new class593();

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field2701 = new Thread(this);

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "[Lck;")
    public static class600[] field2708 = new class600[35];

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field2710 = -1;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLjava/lang/String;)Lql;")
    public final class689 method1184(byte arg0, String arg1) {
        field2707++;
        if (this.field2701 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class689 var3 = new class689(arg1);
            this.method1186((byte) 86, var3);
            if (arg0 < 97) {
                method1185(-23, -39, 108);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vp", name = "run", descriptor = "()V")
    public final void run() {
        field2702++;
        while (true) {
            class593 var1 = this.field2703;
            class689 var3;
            synchronized (this.field2703) {
                class504 var2;
                for (var2 = this.field2703.method3262(-120); var2 == null; var2 = this.field2703.method3262(-120)) {
                    try {
                        this.field2703.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class689)) {
                    return;
                }
                var3 = (class689) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field9704).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field9706 = var5;
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
    public class176() {
        this.field2701.setDaemon(true);
        this.field2701.start();
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)I")
    public static final int method1185(int arg0, int arg1, int arg2) {
        field2704++;
        if (arg2 > -91) {
            return -14;
        } else if (arg1 == 4 || arg1 == 5) {
            return class286.field4033[arg0 & 0x3];
        } else {
            return 256;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLrc;)V")
    private final void method1186(byte arg0, class504 arg1) {
        class593 var3 = this.field2703;
        synchronized (this.field2703) {
            this.field2703.method3265(arg1, (byte) -101);
            this.field2703.notify();
        }
        if (arg0 == 86) {
            field2711++;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public final void method1187(int arg0) {
        field2706++;
        if (this.field2701 == null) {
            return;
        }
        this.method1186((byte) 86, new class504());
        if (arg0 != -1) {
            this.field2703 = null;
        }
        try {
            this.field2701.join();
        } catch (InterruptedException var2) {
        }
        this.field2701 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method1188(byte arg0) {
        if (arg0 >= 11) {
            field2708 = null;
        }
    }
}
