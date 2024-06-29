import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class180 implements Runnable {

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Lada;")
    private class164 field2774 = new class164();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field2771 = new Thread(this);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "S")
    public static short field2772 = 256;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public final void method1274(int arg0) {
        field2777++;
        if (this.field2771 == null) {
            return;
        }
        this.method1275(new class184(), (byte) 127);
        try {
            this.field2771.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 == -1) {
            this.field2771 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lefa;B)V")
    private final void method1275(class184 arg0, byte arg1) {
        class164 var3 = this.field2774;
        synchronized (this.field2774) {
            this.field2774.method1203(arg0, (byte) 89);
            this.field2774.notify();
        }
        if (arg1 < 115) {
            this.method1274(114);
        }
        field2776++;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/lang/String;I)Lfga;")
    public final class257 method1276(String arg0, int arg1) {
        field2778++;
        if (this.field2771 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class257 var3 = new class257(arg0);
            this.method1275(var3, (byte) 116);
            return arg1 == 256 ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLcs;)Ljava/lang/String;")
    public static final String method1277(byte arg0, class342 arg1) {
        if (arg0 != -85) {
            field2772 = 96;
        }
        field2775++;
        if (arg1.field4964 == null || arg1.field4964.length() == 0) {
            return arg1.field4969 == null || arg1.field4969.length() <= 0 ? arg1.field4966 : arg1.field4966 + class430.field6402.method2679(class650.field9160, 79) + arg1.field4969;
        } else if (arg1.field4969 == null || arg1.field4969.length() <= 0) {
            return arg1.field4966 + class430.field6402.method2679(class650.field9160, arg0 ^ 0xFFFFFFF4) + arg1.field4964;
        } else {
            return arg1.field4966 + class430.field6402.method2679(class650.field9160, arg0 ^ 0x1D) + arg1.field4969 + class430.field6402.method2679(class650.field9160, 80) + arg1.field4964;
        }
    }

    @OriginalMember(owner = "client!wp", name = "run", descriptor = "()V")
    public final void run() {
        field2773++;
        while (true) {
            class164 var1 = this.field2774;
            class257 var3;
            synchronized (this.field2774) {
                class184 var2;
                for (var2 = this.field2774.method1198((byte) 43); var2 == null; var2 = this.field2774.method1198((byte) 93)) {
                    try {
                        this.field2774.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class257)) {
                    return;
                }
                var3 = (class257) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3687).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3689 = var5;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
    public class180() {
        this.field2771.setDaemon(true);
        this.field2771.start();
    }
}
