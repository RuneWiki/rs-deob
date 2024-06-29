import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 implements Runnable {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Lpk;")
    private class133 field364 = new class133();

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field367 = new Thread(this);

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "[I")
    public static int[] field372 = new int[1000];

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "[J")
    public static long[] field370;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "[Ll;")
    public static class16[] field374;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public final void method257(int arg0) {
        field366++;
        if (this.field367 == null) {
            return;
        }
        this.method259(arg0 + 22509, new class223());
        try {
            this.field367.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 != -21509) {
            this.method257(24);
        }
        this.field367 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILsl;)V")
    public static final void method258(int arg0, class318 arg1) {
        field368++;
        if (arg0 > -48) {
            method258(-14, null);
        }
        class472.field6970.method942(arg1.method1982(2), 13127);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILvu;)V")
    private final void method259(int arg0, class223 arg1) {
        field369++;
        if (arg0 != 1000) {
            return;
        }
        class133 var3 = this.field364;
        synchronized (this.field364) {
            this.field364.method1015(false, arg1);
            this.field364.notify();
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
    public static final void method260(int arg0, int arg1) {
        class156 var2 = class158.field2240;
        synchronized (class158.field2240) {
            class158.field2240.method1116(arg1, -50);
        }
        if (arg0 <= 11) {
            field372 = null;
        }
        field365++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;)Lva;")
    public final class342 method261(int arg0, String arg1) {
        field373++;
        if (this.field367 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class342 var3 = new class342(arg1);
            if (arg0 <= 64) {
                field372 = null;
            }
            this.method259(1000, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method262(byte arg0) {
        if (arg0 > 82) {
            field372 = null;
            field370 = null;
            field374 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "run", descriptor = "()V")
    public final void run() {
        field371++;
        while (true) {
            class133 var1 = this.field364;
            class342 var3;
            synchronized (this.field364) {
                class223 var2;
                for (var2 = this.field364.method1014(4095); var2 == null; var2 = this.field364.method1014(4095)) {
                    try {
                        this.field364.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class342)) {
                    return;
                }
                var3 = (class342) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4734).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4733 = var5;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
    public class32() {
        this.field367.setDaemon(true);
        this.field367.start();
    }
}
