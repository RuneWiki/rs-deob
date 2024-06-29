import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class197 implements Runnable {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lvn;")
    private class169 field2677 = new class169();

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field2678 = new Thread(this);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2676 = -9017772;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILqs;)V")
    private final void method1261(int arg0, class359 arg1) {
        class169 var3 = this.field2677;
        synchronized (this.field2677) {
            this.field2677.method1125(-1, arg1);
            this.field2677.notify();
        }
        field2680++;
        if (arg0 != 3) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method1262(int arg0) {
        field2684++;
        if (this.field2678 == null) {
            return;
        }
        this.method1261(3, new class359());
        try {
            this.field2678.join();
        } catch (InterruptedException var3) {
        }
        this.field2678 = null;
        int var2 = -51 % ((-arg0 - 66) / 53);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lki;I)V")
    public static final void method1263(class422 arg0, int arg1) {
        if (arg1 == -24310) {
            class278.field3915 = arg0;
            field2679++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLjava/lang/String;)Lce;")
    public final class168 method1264(byte arg0, String arg1) {
        field2681++;
        if (this.field2678 == null) {
            throw new IllegalStateException("");
        }
        if (arg0 >= -91) {
            field2682 = -111;
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("");
        }
        class168 var3 = new class168(arg1);
        this.method1261(3, var3);
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class197() {
        this.field2678.setDaemon(true);
        this.field2678.start();
    }

    @OriginalMember(owner = "client!rb", name = "run", descriptor = "()V")
    public final void run() {
        field2683++;
        while (true) {
            class169 var1 = this.field2677;
            class168 var3;
            synchronized (this.field2677) {
                class359 var2;
                for (var2 = this.field2677.method1112(-1); var2 == null; var2 = this.field2677.method1112(-1)) {
                    try {
                        this.field2677.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class168)) {
                    return;
                }
                var3 = (class168) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2352).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2351 = var5;
        }
    }
}
