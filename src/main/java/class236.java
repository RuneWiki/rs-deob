import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class236 implements Runnable {

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Lkr;")
    private class486 field3549 = new class486();

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field3547 = new Thread(this);

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field3552 = 0;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Lwf;")
    public static class79 field3551 = new class79(52, 12);

    @OriginalMember(owner = "client!es", name = "j", descriptor = "[I")
    public static int[] field3555 = new int[32];

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lah;I)V")
    private final void method1503(class238 arg0, int arg1) {
        class486 var3 = this.field3549;
        synchronized (this.field3549) {
            this.field3549.method2845(arg0, (byte) 37);
            this.field3549.notify();
        }
        field3554++;
        if (arg1 < 64) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public final void method1504(boolean arg0) {
        field3546++;
        if (arg0) {
            field3551 = null;
        }
        if (this.field3547 == null) {
            return;
        }
        this.method1503(new class238(), 65);
        try {
            this.field3547.join();
        } catch (InterruptedException var2) {
        }
        this.field3547 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BLjava/lang/String;)Lbg;")
    public final class298 method1505(byte arg0, String arg1) {
        int var3 = 4 / ((-arg0 - 58) / 54);
        field3550++;
        if (this.field3547 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class298 var4 = new class298(arg1);
            this.method1503(var4, 98);
            return var4;
        }
    }

    @OriginalMember(owner = "client!es", name = "run", descriptor = "()V")
    public final void run() {
        field3553++;
        while (true) {
            class486 var1 = this.field3549;
            class298 var3;
            synchronized (this.field3549) {
                class238 var2;
                for (var2 = this.field3549.method2839(-31216); var2 == null; var2 = this.field3549.method2839(-31216)) {
                    try {
                        this.field3549.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class298)) {
                    return;
                }
                var3 = (class298) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4284).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4286 = var5;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
    public static void method1506(boolean arg0) {
        field3555 = null;
        field3551 = null;
        if (!arg0) {
            field3551 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
    public class236() {
        this.field3547.setDaemon(true);
        this.field3547.start();
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3555[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
