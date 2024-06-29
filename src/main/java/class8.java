import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 implements Runnable {

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Loe;")
    private class183 field85 = new class183();

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field79 = new Thread(this);

    @OriginalMember(owner = "client!to", name = "a", descriptor = "[Lul;")
    public static class530[] field77 = new class530[8];

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;)Lsk;", line = 4)
    public final class575 method46(int arg0, String arg1) {
        field81++;
        if (this.field79 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class575 var3 = new class575(arg1);
            this.method48((byte) -18, var3);
            return arg0 > -20 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!to", name = "run", descriptor = "()V", line = 27)
    public final void run() {
        field82++;
        while (true) {
            class183 var1 = this.field85;
            class575 var3;
            synchronized (this.field85) {
                class513 var2;
                for (var2 = this.field85.method1137(-1); var2 == null; var2 = this.field85.method1137(-1)) {
                    try {
                        this.field85.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class575)) {
                    return;
                }
                var3 = (class575) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field8419).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field8416 = var5;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)Z", line = 65)
    public static final boolean method47(int arg0, int arg1) {
        field83++;
        if (arg1 != -497) {
            method49((byte) -73);
        }
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLii;)V", line = 76)
    private final void method48(byte arg0, class513 arg1) {
        field80++;
        class183 var3 = this.field85;
        synchronized (this.field85) {
            this.field85.method1129(arg1, 262144);
            this.field85.notify();
        }
        if (arg0 != -18) {
            this.field85 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 91)
    public static void method49(byte arg0) {
        field77 = null;
        if (arg0 != 61) {
            field77 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 101)
    public final void method50(int arg0) {
        field78++;
        if (this.field79 == null) {
            return;
        }
        this.method48((byte) -18, new class513());
        if (arg0 != -5) {
            this.run();
        }
        try {
            this.field79.join();
        } catch (InterruptedException var2) {
        }
        this.field79 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z", line = 124)
    public static final boolean method51(int arg0, int arg1, int arg2) {
        if (arg0 != -5200) {
            field77 = null;
        }
        field84++;
        return class561.method3276(arg2, arg1, arg0 + 5280) || class108.method790((byte) -13, arg2, arg1);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V", line = 143)
    public class8() {
        this.field79.setDaemon(true);
        this.field79.start();
    }
}
