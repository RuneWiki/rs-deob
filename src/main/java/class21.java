import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!qia", name = "m", descriptor = "Lkba;")
    private class108 field153 = new class108();

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field145 = new Thread(this);

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "Ljava/lang/String;")
    public static String field148 = null;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "S")
    public static short field141 = 256;

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "[S")
    public static short[] field147 = new short[256];

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "Lsba;")
    public static class218 field151 = null;

    @OriginalMember(owner = "client!qia", name = "n", descriptor = "[I")
    public static int[] field154 = new int[14];

    @OriginalMember(owner = "client!qia", name = "p", descriptor = "I")
    public static int field156 = 0;

    @OriginalMember(owner = "client!qia", name = "o", descriptor = "Lwaa;")
    public static class703 field155 = new class703(0, -1);

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!qia", name = "l", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "Lha;")
    public static class60 field142;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILgda;)V")
    private final void method80(int arg0, class55 arg1) {
        field152++;
        class108 var3 = this.field153;
        synchronized (this.field153) {
            this.field153.method725(arg1, arg0 - 20911);
            this.field153.notify();
        }
        if (arg0 != 0) {
            method83(-48);
        }
    }

    @OriginalMember(owner = "client!qia", name = "run", descriptor = "()V")
    public final void run() {
        field150++;
        while (true) {
            class108 var1 = this.field153;
            class372 var3;
            synchronized (this.field153) {
                class55 var2;
                for (var2 = this.field153.method727(6494); var2 == null; var2 = this.field153.method727(6494)) {
                    try {
                        this.field153.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class372)) {
                    return;
                }
                var3 = (class372) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5193).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5191 = var5;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILjava/lang/String;)Lbfa;")
    public final class372 method81(int arg0, String arg1) {
        field149++;
        if (arg0 <= 43) {
            return null;
        } else if (this.field145 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class372 var3 = new class372(arg1);
            this.method80(0, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)Z")
    public static final boolean method82(int arg0, int arg1) {
        field146++;
        int var2 = -80 / ((arg0 + 67) / 47);
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
    public static void method83(int arg0) {
        field151 = null;
        field154 = null;
        field155 = null;
        field148 = null;
        field142 = null;
        int var1 = -16 % ((arg0 + 4) / 60);
        field147 = null;
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V")
    public class21() {
        this.field145.setDaemon(true);
        this.field145.start();
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
    public final void method84(byte arg0) {
        field144++;
        if (this.field145 == null) {
            return;
        }
        this.method80(0, new class55());
        if (arg0 != -103) {
            return;
        }
        try {
            this.field145.join();
        } catch (InterruptedException var2) {
        }
        this.field145 = null;
    }
}
