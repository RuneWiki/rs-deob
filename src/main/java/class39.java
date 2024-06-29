import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class39 implements Runnable {

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "Lbv;")
    private class568 field586 = new class568();

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field587 = new Thread(this);

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "Lvt;")
    public static class344 field588 = new class344("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "F")
    public static float field593;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "Ldd;")
    public static class166 field585;

    @OriginalMember(owner = "client!aea", name = "run", descriptor = "()V")
    public final void run() {
        field584++;
        while (true) {
            class568 var1 = this.field586;
            class312 var3;
            synchronized (this.field586) {
                class108 var2;
                for (var2 = this.field586.method3184(-5295); var2 == null; var2 = this.field586.method3184(-5295)) {
                    try {
                        this.field586.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class312)) {
                    return;
                }
                var3 = (class312) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3987).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3991 = var5;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/lang/String;I)Ltt;")
    public final class312 method227(String arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        }
        field591++;
        if (this.field587 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class312 var3 = new class312(arg0);
            this.method229(25741, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
    public static void method228(int arg0) {
        field588 = null;
        field585 = null;
        if (arg0 != -3528) {
            field585 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILum;)V")
    private final void method229(int arg0, class108 arg1) {
        field590++;
        class568 var3 = this.field586;
        synchronized (this.field586) {
            this.field586.method3181(arg1, true);
            this.field586.notify();
        }
        if (arg0 != 25741) {
            this.method230(-120);
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
    public class39() {
        this.field587.setDaemon(true);
        this.field587.start();
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
    public final void method230(int arg0) {
        field589++;
        if (arg0 != 1000) {
            this.field586 = null;
        }
        if (this.field587 == null) {
            return;
        }
        this.method229(arg0 ^ 0x6765, new class108());
        try {
            this.field587.join();
        } catch (InterruptedException var2) {
        }
        this.field587 = null;
    }
}
