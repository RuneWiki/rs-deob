import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class788 implements Runnable {

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lfca;")
    private class661 field10794 = new class661();

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field10797 = new Thread(this);

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field10791 = 1;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "J")
    public static long field10789 = 0L;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10787;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field10790;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field10792;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field10793;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field10795;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field10796;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lwm;")
    public static class30 field10798;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[[[I")
    public static int[][][] field10788;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lmc;I)Lei;")
    public static final class194 method4312(class234 arg0, int arg1) {
        field10795++;
        int var2 = arg0.method1497((byte) 111);
        if (arg1 != 10) {
            method4317(50, 51, true, 63L, (byte) 85);
        }
        return new class194(var2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method4313(int arg0) {
        field10793++;
        if (this.field10797 == null) {
            return;
        }
        if (arg0 != 10) {
            this.method4315(57, null);
        }
        this.method4314(new class337(), false);
        try {
            this.field10797.join();
        } catch (InterruptedException var2) {
        }
        this.field10797 = null;
    }

    @OriginalMember(owner = "client!nh", name = "run", descriptor = "()V")
    public final void run() {
        field10787++;
        while (true) {
            class661 var1 = this.field10794;
            class204 var3;
            synchronized (this.field10794) {
                class337 var2;
                for (var2 = this.field10794.method3599(-48); var2 == null; var2 = this.field10794.method3599(-100)) {
                    try {
                        this.field10794.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class204)) {
                    return;
                }
                var3 = (class204) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2823).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2820 = var5;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lko;Z)V")
    private final void method4314(class337 arg0, boolean arg1) {
        class661 var3 = this.field10794;
        synchronized (this.field10794) {
            this.field10794.method3593(arg0, 15);
            if (arg1) {
                return;
            }
            this.field10794.notify();
        }
        field10792++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)Lie;")
    public final class204 method4315(int arg0, String arg1) {
        field10790++;
        if (this.field10797 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class204 var3 = new class204(arg1);
            if (arg0 != -3) {
                this.field10797 = null;
            }
            this.method4314(var3, false);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method4316(boolean arg0) {
        if (!arg0) {
            method4312(null, -3);
        }
        field10788 = null;
        field10798 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZJB)Ljava/lang/String;")
    public static final String method4317(int arg0, int arg1, boolean arg2, long arg3, byte arg4) {
        field10796++;
        char var6 = ',';
        char var7 = '.';
        if (arg1 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg3 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        if (arg4 != 75) {
            method4312(null, 43);
        }
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class788() {
        this.field10797.setDaemon(true);
        this.field10797.start();
    }
}
