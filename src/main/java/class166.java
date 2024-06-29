import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class166 implements Runnable {

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "Luh;")
    private class168 field2598 = new class168();

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field2599 = new Thread(this);

    @OriginalMember(owner = "client!pha", name = "h", descriptor = "I")
    public static int field2604 = 0;

    @OriginalMember(owner = "client!pha", name = "i", descriptor = "I")
    public static int field2605 = class149.method1172(1600, 124);

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!pha", name = "f", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!pha", name = "g", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!pha", name = "j", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!pha", name = "e", descriptor = "[Lhi;")
    public static class207[] field2601;

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "[Lmi;")
    public static class496[] field2600;

    @OriginalMember(owner = "client!pha", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        field2603++;
        while (true) {
            class168 var1 = this.field2598;
            class655 var3;
            synchronized (this.field2598) {
                class362 var2;
                for (var2 = this.field2598.method1271(8); var2 == null; var2 = this.field2598.method1271(8)) {
                    try {
                        this.field2598.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class655)) {
                    return;
                }
                var3 = (class655) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field8994).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field8993 = var5;
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(B)V", line = 47)
    public static void method1248(byte arg0) {
        if (arg0 < -127) {
            field2600 = null;
            field2601 = null;
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lr;III[Z)V", line = 58)
    public static final void method1249(class184 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class683.field9250 == class344.field4822) {
            return;
        }
        int var5 = class465.field6517[arg1].method1853(arg2, arg3, (byte) -93);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class281 var7 = class465.field6517[var6];
                if (var7 != null) {
                    var7.method1149(arg0, arg2, var5 - var7.method1853(arg2, arg3, (byte) -103), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V", line = 87)
    public class166() {
        this.field2599.setDaemon(true);
        this.field2599.start();
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILjava/lang/String;)Lmj;", line = 99)
    public final class655 method1250(int arg0, String arg1) {
        field2606++;
        if (this.field2599 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg0 != -5255) {
                this.field2598 = null;
            }
            class655 var3 = new class655(arg1);
            this.method1252(1000, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(B)V", line = 129)
    public final void method1251(byte arg0) {
        field2597++;
        if (this.field2599 == null) {
            return;
        }
        this.method1252(1000, new class362());
        try {
            this.field2599.join();
        } catch (InterruptedException var2) {
        }
        this.field2599 = null;
        if (arg0 != 16) {
            field2604 = 87;
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILeh;)V", line = 149)
    private final void method1252(int arg0, class362 arg1) {
        if (arg0 != 1000) {
            this.method1251((byte) 95);
        }
        class168 var3 = this.field2598;
        synchronized (this.field2598) {
            this.field2598.method1273(arg1, -20180);
            this.field2598.notify();
        }
        field2602++;
    }
}
