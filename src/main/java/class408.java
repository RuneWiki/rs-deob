import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class408 implements Runnable {

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Ltg;")
    private class605 field6037 = new class605();

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field6040 = new Thread(this);

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[[S")
    private static short[][] field6043 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[[S")
    private static short[][] field6039 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[[S")
    private static short[][] field6044 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "[[[S")
    public static short[][][] field6042 = new short[][][] { field6044, field6043, field6039 };

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!kg", name = "run", descriptor = "()V", line = 6)
    public final void run() {
        field6038++;
        while (true) {
            class605 var1 = this.field6037;
            class366 var3;
            synchronized (this.field6037) {
                class65 var2;
                for (var2 = this.field6037.method3466(0); var2 == null; var2 = this.field6037.method3466(0)) {
                    try {
                        this.field6037.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class366)) {
                    return;
                }
                var3 = (class366) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5582).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5583 = var5;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILds;)V", line = 45)
    private final void method2521(int arg0, class65 arg1) {
        field6041++;
        class605 var3 = this.field6037;
        synchronized (this.field6037) {
            if (arg0 < 83) {
                this.method2522(null, (byte) 64);
            }
            this.field6037.method3472(114, arg1);
            this.field6037.notify();
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 135)
    public class408() {
        this.field6040.setDaemon(true);
        this.field6040.start();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;B)Led;", line = 72)
    public final class366 method2522(String arg0, byte arg1) {
        field6035++;
        if (this.field6040 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 != 57) {
                field6039 = null;
            }
            class366 var3 = new class366(arg0);
            this.method2521(89, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 103)
    public static void method2523(byte arg0) {
        field6039 = null;
        field6044 = null;
        field6042 = null;
        int var1 = 13 / ((arg0 + 41) / 52);
        field6043 = null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V", line = 117)
    public final void method2524(byte arg0) {
        field6045++;
        if (this.field6040 == null) {
            return;
        }
        this.method2521(107, new class65());
        try {
            if (arg0 < 84) {
                field6044 = null;
            }
            this.field6040.join();
        } catch (InterruptedException var2) {
        }
        this.field6040 = null;
    }
}
