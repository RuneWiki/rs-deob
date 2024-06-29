import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class342 implements Runnable {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Ldc;")
    private class302 field5057 = new class302();

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field5061 = new Thread(this);

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field5060 = 0;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lvg;")
    public static class622 field5063 = new class622(77, 19);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ljw;")
    public static class426 field5059;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lrw;")
    public static class483 field5068;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;Z)Lcc;")
    public final class165 method2118(String arg0, boolean arg1) {
        field5062++;
        if (this.field5061 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class165 var3 = new class165(arg0);
            if (!arg1) {
                this.method2122(46);
            }
            this.method2120((byte) -46, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Lqd;")
    public static final class512 method2119(int arg0, byte arg1) {
        field5066++;
        class512 var2 = (class512) class564.field8239.method3901((long) arg0, -126);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class119.field1776.method1844(0, 31330, arg0);
        class512 var4 = new class512();
        if (var3 != null) {
            var4.method2899(arg0, 109, new class540(var3));
        }
        class564.field8239.method3894(var4, (byte) 60, (long) arg0);
        int var5 = 28 % ((arg1 + 83) / 33);
        return var4;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLdu;)V")
    private final void method2120(byte arg0, class381 arg1) {
        field5065++;
        class302 var3 = this.field5057;
        synchronized (this.field5057) {
            if (arg0 == -46) {
                this.field5057.method1909(arg1, (byte) -81);
                this.field5057.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method2121(int arg0) {
        field5068 = null;
        field5059 = null;
        field5063 = null;
        if (arg0 != 3) {
            method2119(25, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method2122(int arg0) {
        int var2 = 43 % ((arg0 - 40) / 62);
        field5064++;
        if (this.field5061 == null) {
            return;
        }
        this.method2120((byte) -46, new class381());
        try {
            this.field5061.join();
        } catch (InterruptedException var3) {
        }
        this.field5061 = null;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class342() {
        this.field5061.setDaemon(true);
        this.field5061.start();
    }

    @OriginalMember(owner = "client!lh", name = "run", descriptor = "()V")
    public final void run() {
        field5058++;
        while (true) {
            class302 var1 = this.field5057;
            class165 var3;
            synchronized (this.field5057) {
                class381 var2;
                for (var2 = this.field5057.method1902(98); var2 == null; var2 = this.field5057.method1902(108)) {
                    try {
                        this.field5057.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class165)) {
                    return;
                }
                var3 = (class165) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2319).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2321 = var5;
        }
    }
}
