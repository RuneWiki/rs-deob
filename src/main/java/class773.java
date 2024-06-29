import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class773 implements Runnable {

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "Low;")
    private class665 field10648 = new class665();

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field10649 = new Thread(this);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "[I")
    public static int[] field10642 = null;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field10646 = 0;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field10643;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field10644;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field10645;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field10647;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 5)
    public final void method4262(int arg0) {
        if (arg0 != 1000) {
            return;
        }
        field10644++;
        if (this.field10649 == null) {
            return;
        }
        this.method4265(18013, new class766());
        try {
            this.field10649.join();
        } catch (InterruptedException var2) {
        }
        this.field10649 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;I)Leaa;", line = 25)
    public final class395 method4263(String arg0, int arg1) {
        field10645++;
        if (arg1 != 1) {
            return null;
        } else if (this.field10649 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class395 var3 = new class395(arg0);
            this.method4265(arg1 + 18012, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V", line = 52)
    public static void method4264(boolean arg0) {
        field10642 = null;
        if (!arg0) {
            field10642 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "run", descriptor = "()V", line = 66)
    public final void run() {
        field10643++;
        while (true) {
            class665 var1 = this.field10648;
            class395 var3;
            synchronized (this.field10648) {
                class766 var2;
                for (var2 = this.field10648.method3726(12691); var2 == null; var2 = this.field10648.method3726(12691)) {
                    try {
                        this.field10648.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class395)) {
                    return;
                }
                var3 = (class395) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5467).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5466 = var5;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILit;)V", line = 109)
    private final void method4265(int arg0, class766 arg1) {
        field10647++;
        class665 var3 = this.field10648;
        synchronized (this.field10648) {
            this.field10648.method3728((byte) 114, arg1);
            if (arg0 != 18013) {
                this.run();
            }
            this.field10648.notify();
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V", line = 125)
    public class773() {
        this.field10649.setDaemon(true);
        this.field10649.start();
    }
}
