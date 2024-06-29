import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class378 implements Runnable {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lnv;")
    private class44 field5574 = new class44();

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field5577 = new Thread(this);

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILdd;)V")
    private final void method2405(int arg0, class130 arg1) {
        class44 var3 = this.field5574;
        synchronized (this.field5574) {
            this.field5574.method292((byte) 121, arg1);
            this.field5574.notify();
        }
        field5579++;
        if (arg0 != -18370) {
            this.method2405(-114, null);
        }
    }

    @OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
    public final void run() {
        field5578++;
        while (true) {
            class44 var1 = this.field5574;
            class205 var3;
            synchronized (this.field5574) {
                class130 var2;
                for (var2 = this.field5574.method298(-126); var2 == null; var2 = this.field5574.method298(-59)) {
                    try {
                        this.field5574.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class205)) {
                    return;
                }
                var3 = (class205) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3156).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3153 = var5;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public final void method2406(byte arg0) {
        field5576++;
        if (this.field5577 == null) {
            return;
        }
        this.method2405(-18370, new class130());
        if (arg0 != -29) {
            this.field5577 = null;
        }
        try {
            this.field5577.join();
        } catch (InterruptedException var2) {
        }
        this.field5577 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;I)Ldn;")
    public final class205 method2407(String arg0, int arg1) {
        field5572++;
        if (this.field5577 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class205 var3 = new class205(arg0);
            int var4 = -5 % ((arg1 - 19) / 61);
            this.method2405(-18370, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
    public class378() {
        this.field5577.setDaemon(true);
        this.field5577.start();
    }

    static {
        new class179("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field5573 = 0;
    }
}
