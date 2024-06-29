import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class413 implements Runnable {

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lui;")
    private class193 field5363 = new class193();

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field5368 = new Thread(this);

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field5364 = 0;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Lrg;")
    public static class548 field5365 = new class548(36, 1);

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field5367 = -1;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "F")
    public static float field5366;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILwda;)V")
    private final void method2356(int arg0, class544 arg1) {
        field5359++;
        class193 var3 = this.field5363;
        synchronized (this.field5363) {
            this.field5363.method1040(arg1, -110);
            if (arg0 != 0) {
                this.method2359(-100);
            }
            this.field5363.notify();
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
    public static void method2357(boolean arg0) {
        field5365 = null;
        if (!arg0) {
            method2357(false);
        }
    }

    @OriginalMember(owner = "client!kp", name = "run", descriptor = "()V")
    public final void run() {
        field5362++;
        while (true) {
            class193 var1 = this.field5363;
            class284 var3;
            synchronized (this.field5363) {
                class544 var2;
                for (var2 = this.field5363.method1054((byte) -105); var2 == null; var2 = this.field5363.method1054((byte) -105)) {
                    try {
                        this.field5363.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class284)) {
                    return;
                }
                var3 = (class284) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3719).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3720 = var5;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)Lgd;")
    public final class284 method2358(String arg0, int arg1) {
        field5361++;
        if (this.field5368 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class284 var3 = new class284(arg0);
            if (arg1 == 1) {
                this.method2356(0, var3);
                return var3;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public final void method2359(int arg0) {
        if (arg0 < 12) {
            field5364 = -67;
        }
        field5360++;
        if (this.field5368 == null) {
            return;
        }
        this.method2356(0, new class544());
        try {
            this.field5368.join();
        } catch (InterruptedException var2) {
        }
        this.field5368 = null;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    public class413() {
        this.field5368.setDaemon(true);
        this.field5368.start();
    }
}
