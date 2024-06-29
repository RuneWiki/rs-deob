import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class418 implements Runnable {

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lmg;")
    private class530 field6057 = new class530();

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field6055 = new Thread(this);

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Lhi;")
    public static class45 field6056 = new class45(34, 7);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lo;")
    public static class359 field6058;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lnh;")
    public static class517 field6059;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Luj;I)V", line = 4)
    private final void method2470(class476 arg0, int arg1) {
        class530 var3 = this.field6057;
        synchronized (this.field6057) {
            this.field6057.method3139(arg1, arg0);
            this.field6057.notify();
        }
        field6052++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 16)
    public final void method2471(byte arg0) {
        if (arg0 < 104) {
            return;
        }
        field6061++;
        if (this.field6055 == null) {
            return;
        }
        this.method2470(new class476(), 0);
        try {
            this.field6055.join();
        } catch (InterruptedException var2) {
        }
        this.field6055 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;Z)Ldp;", line = 40)
    public final class346 method2472(String arg0, boolean arg1) {
        field6060++;
        if (arg1) {
            method2474(69);
        }
        if (this.field6055 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class346 var3 = new class346(arg0);
            this.method2470(var3, 0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 64)
    public static void method2473(int arg0) {
        field6058 = null;
        int var1 = -72 / ((arg0 - 51) / 50);
        field6059 = null;
        field6056 = null;
    }

    @OriginalMember(owner = "client!qj", name = "run", descriptor = "()V", line = 75)
    public final void run() {
        field6054++;
        while (true) {
            class530 var1 = this.field6057;
            class346 var3;
            synchronized (this.field6057) {
                class476 var2;
                for (var2 = this.field6057.method3134((byte) 116); var2 == null; var2 = this.field6057.method3134((byte) 112)) {
                    try {
                        this.field6057.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class346)) {
                    return;
                }
                var3 = (class346) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4979).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4983 = var5;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 132)
    public class418() {
        this.field6055.setDaemon(true);
        this.field6055.start();
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 120)
    public static final void method2474(int arg0) {
        field6053++;
        class232.field3237 = null;
        class250.field3408 = false;
        class157.method1127(arg0 ^ 0x59EBFEC4);
        if (arg0 != 24202) {
            field6058 = null;
        }
    }
}
