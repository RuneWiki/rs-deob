import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class717 implements Runnable {

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "Lmr;")
    private class611 field10120 = new class611();

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field10115 = new Thread(this);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "[I")
    public static int[] field10114 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "[I")
    public static int[] field10119 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field10118 = 0;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public static int field10121;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "Lla;")
    public static class423 field10116;

    @OriginalMember(owner = "client!bda", name = "run", descriptor = "()V")
    public final void run() {
        field10122++;
        while (true) {
            class611 var1 = this.field10120;
            class666 var3;
            synchronized (this.field10120) {
                class430 var2;
                for (var2 = this.field10120.method3563(0); var2 == null; var2 = this.field10120.method3563(0)) {
                    try {
                        this.field10120.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class666)) {
                    return;
                }
                var3 = (class666) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field9519).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field9520 = var5;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
    public static void method4028(byte arg0) {
        field10114 = null;
        field10119 = null;
        if (arg0 == -123) {
            field10116 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public final void method4029(int arg0) {
        field10123++;
        if (arg0 != 1000) {
            this.method4031(-16, null);
        }
        if (this.field10115 == null) {
            return;
        }
        this.method4031(128, new class430());
        try {
            this.field10115.join();
        } catch (InterruptedException var2) {
        }
        this.field10115 = null;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLjava/lang/String;)Lov;")
    public final class666 method4030(byte arg0, String arg1) {
        field10117++;
        if (this.field10115 == null) {
            throw new IllegalStateException("");
        } else if (arg0 != -112) {
            return null;
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class666 var3 = new class666(arg1);
            this.method4031(128, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
    public class717() {
        this.field10115.setDaemon(true);
        this.field10115.start();
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILqm;)V")
    private final void method4031(int arg0, class430 arg1) {
        field10121++;
        class611 var3 = this.field10120;
        synchronized (this.field10120) {
            this.field10120.method3559(arg1, (byte) 12);
            this.field10120.notify();
        }
        if (arg0 != 128) {
            method4028((byte) -113);
        }
    }
}
