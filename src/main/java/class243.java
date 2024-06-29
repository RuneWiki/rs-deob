import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class243 implements Runnable {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Ljia;")
    private class645 field3468 = new class645();

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field3470 = new Thread(this);

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3467 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Ljia;")
    public static class645 field3469 = new class645();

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lwk;Z)V")
    private final void method1623(class154 arg0, boolean arg1) {
        field3465++;
        class645 var3 = this.field3468;
        synchronized (this.field3468) {
            this.field3468.method3594((byte) -98, arg0);
            if (arg1) {
                this.field3468.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1624(int arg0) {
        field3469 = null;
        if (arg0 != 3) {
            field3467 = 46;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;B)Lwu;")
    public final class394 method1625(String arg0, byte arg1) {
        field3466++;
        if (this.field3470 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 > -42) {
                field3467 = -91;
            }
            class394 var3 = new class394(arg0);
            this.method1623(var3, true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public final void method1626(int arg0) {
        field3471++;
        if (this.field3470 == null) {
            return;
        }
        this.method1623(new class154(), true);
        try {
            this.field3470.join();
        } catch (InterruptedException var2) {
        }
        this.field3470 = null;
        if (arg0 != 3808) {
            this.field3468 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "run", descriptor = "()V")
    public final void run() {
        field3464++;
        while (true) {
            class645 var1 = this.field3468;
            class394 var3;
            synchronized (this.field3468) {
                class154 var2;
                for (var2 = this.field3468.method3584(23287); var2 == null; var2 = this.field3468.method3584(23287)) {
                    try {
                        this.field3468.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class394)) {
                    return;
                }
                var3 = (class394) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5443).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5444 = var5;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class243() {
        this.field3470.setDaemon(true);
        this.field3470.start();
    }
}
