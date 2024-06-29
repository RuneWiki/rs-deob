import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class44 implements Runnable {

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lgk;")
    private class616 field435 = new class616();

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field426 = new Thread(this);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "J")
    public static long field425 = 20000000L;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field433 = 500;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "F")
    public static float field436;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field428;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLjava/lang/String;)Lol;")
    public final class272 method224(boolean arg0, String arg1) {
        if (arg0) {
            return null;
        }
        field437++;
        if (this.field426 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class272 var3 = new class272(arg1);
            this.method228(var3, (byte) -39);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    public static final void method225(int arg0, int arg1) {
        field434++;
        class553.field7892 = arg0;
        int var2 = -14 / ((24 - arg1) / 43);
        class19 var3 = class256.field3203;
        synchronized (class256.field3203) {
            class256.field3203.method88(125);
        }
        class19 var4 = class139.field1538;
        synchronized (class139.field1538) {
            class139.field1538.method88(107);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method226(int arg0) {
        field429++;
        int var2 = 1 / ((22 - arg0) / 44);
        if (this.field426 == null) {
            return;
        }
        this.method228(new class333(), (byte) -39);
        try {
            this.field426.join();
        } catch (InterruptedException var3) {
        }
        this.field426 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method227(byte arg0) {
        field428 = null;
        int var1 = -82 / ((12 - arg0) / 41);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lgga;B)V")
    private final void method228(class333 arg0, byte arg1) {
        field430++;
        class616 var3 = this.field435;
        synchronized (this.field435) {
            if (arg1 != -39) {
                method225(-4, 66);
            }
            this.field435.method3425(arg0, false);
            this.field435.notify();
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class44() {
        this.field426.setDaemon(true);
        this.field426.start();
    }

    @OriginalMember(owner = "client!rh", name = "run", descriptor = "()V")
    public final void run() {
        field427++;
        while (true) {
            class616 var1 = this.field435;
            class272 var3;
            synchronized (this.field435) {
                class333 var2;
                for (var2 = this.field435.method3440((byte) -77); var2 == null; var2 = this.field435.method3440((byte) 113)) {
                    try {
                        this.field435.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class272)) {
                    return;
                }
                var3 = (class272) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3385).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3380 = var5;
        }
    }
}
