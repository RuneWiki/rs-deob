import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class516 implements Runnable {

    @OriginalMember(owner = "client!np", name = "i", descriptor = "Lef;")
    private class513 field7453 = new class513();

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field7454;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7462 = new String[] { method3920(method3919("\\5!U?\\m")), method3920(method3919("\\5!db")), method3920(method3919("\\0cK")), method3920(method3919("\\5!cb")), method3920(method3919("Ik!\t7")), method3920(method3919("\\5!\u001b#\\,{\u0019b")), method3920(method3919("\\5!eb")), method3920(method3919("\\5!fb")) };

    @OriginalMember(owner = "client!np", name = "c", descriptor = "Lum;")
    public static class550 field7455 = new class550("", 11);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lel;")
    public static class573 field7458 = new class573(35, -2);

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Lel;")
    public static class573 field7460 = new class573(93, 6);

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "[I")
    public static int[] field7461;

    @OriginalMember(owner = "client!np", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field7457++;
            while (true) {
                class513 var1 = this.field7453;
                class321 var3;
                synchronized (this.field7453) {
                    class206 var2;
                    for (var2 = this.field7453.method3875(-68); var2 == null; var2 = this.field7453.method3875(79)) {
                        try {
                            this.field7453.wait();
                        } catch (InterruptedException var9) {
                        }
                    }
                    if (!(var2 instanceof class321)) {
                        return;
                    }
                    var3 = (class321) var2;
                }
                int var5;
                try {
                    byte[] var4 = InetAddress.getByName(var3.field5066).getAddress();
                    var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
                } catch (Throwable var10) {
                    var5 = 1000;
                }
                var3.field5069 = var5;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field7462[0] + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILme;)V")
    private final void method3915(int arg0, class206 arg1) {
        try {
            class513 var3 = this.field7453;
            synchronized (this.field7453) {
                this.field7453.method3868(-40, arg1);
                this.field7453.notify();
            }
            field7456++;
            if (arg0 != 1000) {
                this.run();
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7462[3] + arg0 + ',' + (arg1 == null ? field7462[2] : field7462[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method3916(int arg0) {
        try {
            field7460 = null;
            field7455 = null;
            field7461 = null;
            if (arg0 != 25511) {
                field7455 = null;
            }
            field7458 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7462[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
    public final void method3917(int arg0) {
        try {
            field7459++;
            if (arg0 != -17063) {
                field7460 = null;
            }
            if (this.field7454 != null) {
                this.method3915(1000, new class206());
                try {
                    this.field7454.join();
                } catch (InterruptedException var3) {
                }
                this.field7454 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7462[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLjava/lang/String;)Lca;")
    public final class321 method3918(boolean arg0, String arg1) {
        try {
            field7452++;
            if (this.field7454 == null) {
                throw new IllegalStateException("");
            }
            if (arg0) {
                this.field7453 = null;
            }
            if (arg1 == null) {
                throw new IllegalArgumentException("");
            }
            class321 var3 = new class321(arg1);
            this.method3915(1000, var3);
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7462[6] + arg0 + ',' + (arg1 == null ? field7462[2] : field7462[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
    public class516() {
        try {
            this.field7454 = new Thread(this);
            this.field7454.setDaemon(true);
            this.field7454.start();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7462[5] + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3919(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!np", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3920(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
