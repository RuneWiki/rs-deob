import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class408 implements Runnable {

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "Ltm;")
    private class412 field5904 = new class412();

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field5900 = new Thread(this);

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Ljw;")
    public static class581 field5901 = new class581(30, -1);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLdba;)V", line = 7)
    private final void method2528(boolean arg0, class101 arg1) {
        if (!arg0) {
            method2532(84, 98, true, -89, -117, -44, false);
        }
        field5898++;
        class412 var3 = this.field5904;
        synchronized (this.field5904) {
            this.field5904.method2545(-128, arg1);
            this.field5904.notify();
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 23)
    public static void method2529(int arg0) {
        if (arg0 >= 73) {
            field5901 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;Z)Lgb;", line = 33)
    public final class227 method2530(String arg0, boolean arg1) {
        field5899++;
        if (this.field5900 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class227 var3 = new class227(arg0);
            this.method2528(arg1, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 51)
    public final void method2531(int arg0) {
        field5903++;
        if (this.field5900 == null) {
            return;
        }
        this.method2528(true, new class101());
        try {
            this.field5900.join();
        } catch (InterruptedException var3) {
        }
        this.field5900 = null;
        int var2 = -91 / ((arg0 - 65) / 59);
    }

    @OriginalMember(owner = "client!bp", name = "run", descriptor = "()V", line = 73)
    public final void run() {
        field5897++;
        while (true) {
            class412 var1 = this.field5904;
            class227 var3;
            synchronized (this.field5904) {
                class101 var2;
                for (var2 = this.field5904.method2543(-15114); var2 == null; var2 = this.field5904.method2543(-15114)) {
                    try {
                        this.field5904.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class227)) {
                    return;
                }
                var3 = (class227) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3105).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3102 = var5;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIZIIIZ)V", line = 115)
    public static final void method2532(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5902++;
        if (arg3 > arg0) {
            int var7 = (arg0 + arg3) / 2;
            int var8 = arg0;
            class513 var9 = class791.field10877[var7];
            class791.field10877[var7] = class791.field10877[arg3];
            class791.field10877[arg3] = var9;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if (class402.method2506(arg2, var9, arg6, arg4, class791.field10877[var10], arg1, 6906) <= 0) {
                    class513 var11 = class791.field10877[var10];
                    class791.field10877[var10] = class791.field10877[var8];
                    class791.field10877[var8++] = var11;
                }
            }
            class791.field10877[arg3] = class791.field10877[var8];
            class791.field10877[var8] = var9;
            method2532(arg0, arg1, arg2, var8 - 1, arg4, -18, arg6);
            method2532(var8 + 1, arg1, arg2, arg3, arg4, -35, arg6);
        }
        int var12 = -104 % ((arg5 + 76) / 34);
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V", line = 159)
    public class408() {
        this.field5900.setDaemon(true);
        this.field5900.start();
    }
}
