import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class251 implements Runnable {

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Lar;")
    private class479 field3465 = new class479();

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field3470 = new Thread(this);

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field3469 = 0;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Lwj;")
    public static class270 field3471 = new class270(59, 4);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "Lmg;")
    public static class101 field3473;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
    public final void method1500(int arg0) {
        field3468++;
        if (this.field3470 == null) {
            return;
        }
        this.method1504(new class260(), 2);
        if (arg0 != 15110) {
            field3473 = null;
        }
        try {
            this.field3470.join();
        } catch (InterruptedException var2) {
        }
        this.field3470 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
    public static int method1501(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wu", name = "run", descriptor = "()V")
    public final void run() {
        field3467++;
        while (true) {
            class479 var1 = this.field3465;
            class333 var3;
            synchronized (this.field3465) {
                class260 var2;
                for (var2 = this.field3465.method2816(true); var2 == null; var2 = this.field3465.method2816(true)) {
                    try {
                        this.field3465.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class333)) {
                    return;
                }
                var3 = (class333) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4517).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4516 = var5;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;B)Lqq;")
    public final class333 method1502(String arg0, byte arg1) {
        field3466++;
        if (this.field3470 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class333 var3 = new class333(arg0);
            if (arg1 >= -63) {
                return null;
            } else {
                this.method1504(var3, 2);
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
    public static void method1503(int arg0) {
        field3471 = null;
        field3473 = null;
        if (arg0 != 59) {
            method1503(120);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Luj;I)V")
    private final void method1504(class260 arg0, int arg1) {
        field3464++;
        class479 var3 = this.field3465;
        synchronized (this.field3465) {
            this.field3465.method2809(arg0, arg1);
            this.field3465.notify();
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
    public class251() {
        this.field3470.setDaemon(true);
        this.field3470.start();
    }
}
