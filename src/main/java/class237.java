import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class237 implements Runnable {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lau;")
    private class692 field3497 = new class692();

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field3498 = new Thread(this);

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Z")
    public static boolean field3503 = false;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[I")
    public static int[] field3505 = new int[50];

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Lfi;")
    public static class238 field3504;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ltv;I)V")
    private final void method1546(class435 arg0, int arg1) {
        field3502++;
        class692 var3 = this.field3497;
        synchronized (this.field3497) {
            this.field3497.method3904(arg0, 0);
            if (arg1 == 50) {
                this.field3497.notify();
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class237() {
        this.field3498.setDaemon(true);
        this.field3498.start();
    }

    @OriginalMember(owner = "client!jj", name = "run", descriptor = "()V")
    public final void run() {
        field3499++;
        while (true) {
            class692 var1 = this.field3497;
            class99 var3;
            synchronized (this.field3497) {
                class435 var2;
                for (var2 = this.field3497.method3906(0); var2 == null; var2 = this.field3497.method3906(0)) {
                    try {
                        this.field3497.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class99)) {
                    return;
                }
                var3 = (class99) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1471).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1478 = var5;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method1547(byte arg0) {
        if (arg0 != 105) {
            method1547((byte) -85);
        }
        field3504 = null;
        field3505 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;I)Lso;")
    public final class99 method1548(String arg0, int arg1) {
        field3501++;
        if (this.field3498 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class99 var3 = new class99(arg0);
            if (arg1 != 0) {
                field3505 = null;
            }
            this.method1546(var3, 50);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method1549(int arg0) {
        field3500++;
        if (this.field3498 == null) {
            return;
        }
        this.method1546(new class435(), 50);
        try {
            this.field3498.join();
            if (arg0 != -24283) {
                field3504 = null;
            }
        } catch (InterruptedException var2) {
        }
        this.field3498 = null;
    }
}
