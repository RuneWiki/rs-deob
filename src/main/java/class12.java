import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 implements Runnable {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lwba;")
    private class46 field110 = new class46();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field107 = new Thread(this);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILpca;)V", line = 6)
    private final void method62(int arg0, class665 arg1) {
        class46 var3 = this.field110;
        synchronized (this.field110) {
            this.field110.method474(arg1, 6);
            this.field110.notify();
        }
        field108++;
        if (arg0 != 1000) {
            this.field107 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 21)
    public final void method63(int arg0) {
        field109++;
        if (arg0 != -9277 || this.field107 == null) {
            return;
        }
        this.method62(arg0 + 10277, new class665());
        try {
            this.field107.join();
        } catch (InterruptedException var2) {
        }
        this.field107 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjava/lang/String;)Lml;", line = 41)
    public final class352 method64(boolean arg0, String arg1) {
        field113++;
        if (this.field107 == null) {
            throw new IllegalStateException("");
        }
        if (!arg0) {
            this.method63(-50);
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("");
        }
        class352 var3 = new class352(arg1);
        this.method62(1000, var3);
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILlv;)V", line = 63)
    public static final void method65(int arg0, class408 arg1) {
        if (arg0 > -80) {
            method66((byte) -63, null, 74, 61, 112, 122, 110);
        }
        arg1.field5959 = null;
        field111++;
        if (class550.field7761 < 20) {
            class521.field7339.method2413(arg1, (byte) 100);
            class550.field7761++;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 125)
    public class12() {
        this.field107.setDaemon(true);
        this.field107.start();
    }

    @OriginalMember(owner = "client!ma", name = "run", descriptor = "()V", line = 86)
    public final void run() {
        field114++;
        while (true) {
            class46 var1 = this.field110;
            class352 var3;
            synchronized (this.field110) {
                class665 var2;
                for (var2 = this.field110.method483((byte) -112); var2 == null; var2 = this.field110.method483((byte) -127)) {
                    try {
                        this.field110.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class352)) {
                    return;
                }
                var3 = (class352) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5076).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5075 = var5;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[BIIIII)Z", line = 137)
    public static final boolean method66(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field112++;
        int var7 = arg6 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg2 + arg4 - 1) / arg2);
        if (arg0 != -1) {
            method65(36, null);
        }
        int var10 = -((arg2 + arg6 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg3] == 0) {
                    return true;
                }
                arg3 += arg2;
            }
            int var13 = arg3 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg5 + var13;
        }
        return false;
    }
}
