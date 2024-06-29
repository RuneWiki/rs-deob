import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class503 implements Runnable {

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Lifa;")
    private class450 field7112 = new class450();

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field7116 = new Thread(this);

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Ljava/util/Random;")
    public static Random field7114 = new Random();

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lbt;")
    public static class48 field7120;

    @OriginalMember(owner = "client!ap", name = "run", descriptor = "()V", line = 6)
    public final void run() {
        field7119++;
        while (true) {
            class450 var1 = this.field7112;
            class247 var3;
            synchronized (this.field7112) {
                class379 var2;
                for (var2 = this.field7112.method2730(-31260); var2 == null; var2 = this.field7112.method2730(-31260)) {
                    try {
                        this.field7112.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class247)) {
                    return;
                }
                var3 = (class247) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2913).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2914 = var5;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILoq;)V", line = 44)
    private final void method3016(int arg0, class379 arg1) {
        class450 var3 = this.field7112;
        synchronized (this.field7112) {
            this.field7112.method2732(arg1, 21939);
            this.field7112.notify();
            if (arg0 != 1000) {
                this.field7112 = null;
            }
        }
        field7118++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 58)
    public static final void method3017(int arg0) {
        field7117++;
        if (arg0 >= -89) {
            field7114 = null;
        }
        for (class318 var1 = (class318) class444.field5950.method2119(-71); var1 != null; var1 = (class318) class444.field5950.method2111((byte) 95)) {
            class652.method3684(true, var1.field3915);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V", line = 78)
    public final void method3018(int arg0) {
        field7113++;
        if (this.field7116 == null) {
            return;
        }
        this.method3016(arg0 + 1000, new class379());
        if (arg0 != 0) {
            this.method3018(37);
        }
        try {
            this.field7116.join();
        } catch (InterruptedException var2) {
        }
        this.field7116 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I)Ldia;", line = 99)
    public final class247 method3019(String arg0, int arg1) {
        field7115++;
        if (this.field7116 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 != 16383) {
                field7120 = null;
            }
            class247 var3 = new class247(arg0);
            this.method3016(arg1 - 15383, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V", line = 120)
    public static void method3020(int arg0) {
        if (arg0 <= -80) {
            field7114 = null;
            field7120 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([[F[[SI)[[S", line = 132)
    public static final short[][] method3021(float[][] arg0, short[][] arg1, int arg2) {
        if (arg2 != 16383) {
            return null;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            for (int var4 = 0; var4 < arg1[var3].length; var4++) {
                arg1[var3][var4] = (short) ((int) (arg0[var3][var4] * 16383.0F));
            }
        }
        field7111++;
        return arg1;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V", line = 171)
    public class503() {
        this.field7116.setDaemon(true);
        this.field7116.start();
    }
}
