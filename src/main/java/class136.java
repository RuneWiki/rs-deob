import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class136 implements Runnable {

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lgw;")
    private class118 field2108 = new class118();

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field2106 = new Thread(this);

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lbd;")
    public static class44 field2113 = new class44("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lop;")
    public static class128 field2109;

    @OriginalMember(owner = "client!pk", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field2107++;
        while (true) {
            class118 var1 = this.field2108;
            class423 var3;
            synchronized (this.field2108) {
                class42 var2;
                for (var2 = this.field2108.method862(-83); var2 == null; var2 = this.field2108.method862(-83)) {
                    try {
                        this.field2108.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class423)) {
                    return;
                }
                var3 = (class423) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5986).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5985 = var5;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I)Llk;", line = 44)
    public final class423 method987(String arg0, int arg1) {
        field2104++;
        if (this.field2106 == null) {
            throw new IllegalStateException("");
        } else if (arg1 != 0) {
            return null;
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class423 var3 = new class423(arg0);
            this.method989(var3, (byte) 91);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 68)
    public final void method988(boolean arg0) {
        field2102++;
        if (this.field2106 == null) {
            return;
        }
        this.method989(new class42(), (byte) 105);
        try {
            this.field2106.join();
        } catch (InterruptedException var2) {
        }
        if (!arg0) {
            this.field2106 = null;
        }
        this.field2106 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lha;B)V", line = 89)
    private final void method989(class42 arg0, byte arg1) {
        field2110++;
        if (arg1 <= 72) {
            field2109 = null;
        }
        class118 var3 = this.field2108;
        synchronized (this.field2108) {
            this.field2108.method866((byte) 10, arg0);
            this.field2108.notify();
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 105)
    public static final void method990(int arg0) {
        class430.field6184 = 0;
        field2111++;
        class258.field3829.method861(-1);
        class258.field3829.method866((byte) 10, class29.field397);
        class430.field6184++;
        int var1 = -96 / ((arg0 + 10) / 57);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILeu;)Ljava/lang/String;", line = 118)
    public static final String method991(int arg0, class341 arg1) {
        if (arg0 < 106) {
            return null;
        } else {
            field2112++;
            return arg1.field5038 == null || arg1.field5038.length() <= 0 ? arg1.field5045 : arg1.field5045 + class172.field2559.method426(class503.field7255, 40) + arg1.field5038;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 133)
    public static void method992(int arg0) {
        field2113 = null;
        field2109 = null;
        if (arg0 < 97) {
            method993(-41, (byte) -15);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)I", line = 145)
    public static final int method993(int arg0, byte arg1) {
        field2103++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else if (arg1 > -77) {
            return 28;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 182)
    public class136() {
        this.field2106.setDaemon(true);
        this.field2106.start();
    }
}
