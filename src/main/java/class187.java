import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class187 implements Runnable {

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "Lor;")
    private class594 field3120 = new class594();

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field3123 = new Thread(this);

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field3121 = -1;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "Lhga;")
    public static class158 field3124 = new class158(104, -1);

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lu;B)V")
    private final void method1505(class66 arg0, byte arg1) {
        field3127++;
        class594 var3 = this.field3120;
        synchronized (this.field3120) {
            this.field3120.method3463((byte) -87, arg0);
            this.field3120.notify();
            if (arg1 > -95) {
                this.method1507((byte) -2, null);
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field3124 = null;
        int var1 = -54 % ((arg0 + 40) / 59);
    }

    @OriginalMember(owner = "client!tw", name = "run", descriptor = "()V")
    public final void run() {
        field3128++;
        while (true) {
            class594 var1 = this.field3120;
            class567 var3;
            synchronized (this.field3120) {
                class66 var2;
                for (var2 = this.field3120.method3471(0); var2 == null; var2 = this.field3120.method3471(0)) {
                    try {
                        this.field3120.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class567)) {
                    return;
                }
                var3 = (class567) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field8135).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field8137 = var5;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLjava/lang/String;)Lji;")
    public final class567 method1507(byte arg0, String arg1) {
        field3122++;
        if (this.field3123 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            int var3 = 88 / ((arg0 + 83) / 42);
            class567 var4 = new class567(arg1);
            this.method1505(var4, (byte) -114);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V")
    public class187() {
        this.field3123.setDaemon(true);
        this.field3123.start();
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)I")
    public static final int method1508(boolean arg0) {
        field3126++;
        class49 var1 = class567.field8140;
        synchronized (class567.field8140) {
            if (!arg0) {
                field3121 = -29;
            }
            return class567.field8140.method568((byte) 95);
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
    public final void method1509(int arg0) {
        field3125++;
        if (this.field3123 == null) {
            return;
        }
        this.method1505(new class66(), (byte) -125);
        int var2 = -108 % ((arg0 - 72) / 43);
        try {
            this.field3123.join();
        } catch (InterruptedException var3) {
        }
        this.field3123 = null;
    }
}
