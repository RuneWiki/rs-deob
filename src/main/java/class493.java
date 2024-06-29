import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class493 implements Runnable {

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lok;")
    private class266 field6985 = new class266();

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field6984 = new Thread(this);

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field6979 = 0;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "Lbu;")
    public static class21 field6981 = new class21(81, -1);

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/lang/String;I)Lau;", line = 3)
    public final class768 method2931(String arg0, int arg1) {
        int var3 = 115 % ((68 - arg1) / 50);
        field6983++;
        if (this.field6984 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class768 var4 = new class768(arg0);
            this.method2932(44, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "run", descriptor = "()V", line = 24)
    public final void run() {
        field6980++;
        while (true) {
            class266 var1 = this.field6985;
            class768 var3;
            synchronized (this.field6985) {
                class577 var2;
                for (var2 = this.field6985.method1736(0); var2 == null; var2 = this.field6985.method1736(0)) {
                    try {
                        this.field6985.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class768)) {
                    return;
                }
                var3 = (class768) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field10564).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field10565 = var5;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILlq;)V", line = 63)
    private final void method2932(int arg0, class577 arg1) {
        class266 var3 = this.field6985;
        synchronized (this.field6985) {
            this.field6985.method1727(arg1, (byte) 81);
            this.field6985.notify();
            int var4 = -91 % ((-arg0 - 49) / 50);
        }
        field6987++;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I", line = 82)
    public static final int method2933(byte arg0) {
        field6986++;
        if (arg0 >= -33) {
            field6981 = null;
        }
        return class763.field10520 == 1 ? class387.field5362 : 0;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 98)
    public final void method2934(int arg0) {
        field6982++;
        if (this.field6984 == null) {
            return;
        }
        this.method2932(20, new class577());
        if (arg0 != 2004) {
            return;
        }
        try {
            this.field6984.join();
        } catch (InterruptedException var2) {
        }
        this.field6984 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V", line = 121)
    public static void method2935(byte arg0) {
        if (arg0 >= -11) {
            field6979 = 53;
        }
        field6981 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V", line = 137)
    public class493() {
        this.field6984.setDaemon(true);
        this.field6984.start();
    }
}
